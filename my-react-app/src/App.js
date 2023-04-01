import logo from "./logo.svg";
import "./App.css";
import React, { useState, useEffect } from "react";
import { EarthquakeInfo } from "./model/earthquake.js";
import { earthquake } from "./service/eartquakesFetch.js";

let earthquakesCount = 1;

const GetEarthquakes = () => {
  const [earthquakes, setEarthquakes] = useState([]);
  useEffect(() => {
    let interval = setInterval(async () => {
      let tmpEarthquake = await earthquake();
      setEarthquakes(earthquakes => [...earthquakes, new EarthquakeInfo(tmpEarthquake.adancime, tmpEarthquake.anCutremur, tmpEarthquake.lunaCutremur, tmpEarthquake.ziuaCutremur, tmpEarthquake.ora, tmpEarthquake.minut, tmpEarthquake.magnitudine, tmpEarthquake.latitudine, tmpEarthquake.longitudine)])
    }, 10000);
    console.log(earthquakes);
    return () => clearInterval(interval);
  });

  return earthquakes.map((earthquake) => (
    <div
      key={earthquakesCount++}
      style={{
        color: "beige",
        background: "rgb(67, 89, 111)",
        marginTop: 20,
        marginLeft: 50,
        marginRight: 50,
        padding: 20,
      }}
    >
      <section
        style={{
          fontSize: 25,
          color:
            earthquake.magnitude < 3
              ? "rgb(85,208,0)"
              : earthquake.magnitude < 5
                ? "rgb(211,208,0)"
                : earthquake.magnitude < 7
                  ? "rgb(255,99,0)"
                  : "rgb(255,0,0)",
        }}
      >
        Depth: {earthquake.depth} Magnitude: {earthquake.magnitude}
      </section>
      <section>
        Location in Latitude: {earthquake.lat} Longitude: {earthquake.long}
      </section>
      <section>
        Date: {earthquake.day}.{earthquake.month}.{earthquake.year}
      </section>
      <section>
        Time: {earthquake.hour}:{earthquake.minutes}
      </section>
    </div>
  ));
};

export default GetEarthquakes;