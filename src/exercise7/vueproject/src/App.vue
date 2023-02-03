<template>
  <v-app>
    <v-app-bar class="v-app-bar">Small weather service</v-app-bar>
    <v-main>
      <div>Please submit your location to get a report</div>
      <v-btn @click="getPosition(); location = true">submit location</v-btn>
    </v-main>
  </v-app>
</template>

<script lang="ts">


let location;
let lat: number;
let lon: number;
let temp: string;
let windspeed: string;
let winddirection: string;
export default {
  name: 'App',

  data() {
    return {
      location: false,
      temp: temp,
      windspeed: windspeed,
      winddirection: winddirection,
    }

  },

  methods: {
    getPosition: function () {
      navigator.geolocation.getCurrentPosition(
          position => {
            lat = position.coords.latitude
            lon = position.coords.longitude
            console.log(position.coords.latitude)
            console.log(position.coords.longitude)
            location = true
            this.weatherAPICall()
          }
      )
    },
    weatherAPICall: async function () {
      const url = "https://api.met.no/weatherapi/locationforecast/2.0/complete?lat={lat}&lon={lon}"
          .replace("{lat}", lat.toString())
          .replace("{lon}", lon.toString())
      const response = await fetch(url, {
        method: "Get",
      })
      console.log(url)

      if(!response.ok) {
        console.log("bad url response:")
        throw new Error(`HTTP error! status: ${response.status}`)
      }

      const parsedResponse = await response.json()
      const timeslots = parsedResponse.properties.timeseries
      const currentTime = new Date()
      const dateStringFormatted = currentTime.toTimeString().substring(0, 2) + ":00:00"


      let index = -1;
      timeslots.find((item: { time: string; }, i: number) => {
        if (item.time.includes(dateStringFormatted)) {
          index = i;
          return i;
        }
      })

      const weatherData = timeslots[index].data.instant.details


      console.log("url: " + url)
      console.log(weatherData)

      temp = weatherData.air_temperature
      winddirection = weatherData.wind_from_direction
      windspeed = weatherData.wind_speed

      alert("Temperature: " + temp + "\n" + "Wind direction: " + winddirection + " degrees \n" + "Wind speed: " + windspeed + " m/s")

    }
  }

}
</script>
