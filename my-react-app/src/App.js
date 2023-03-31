import logo from "./logo.svg";
import "./App.css";

class EarthquakeInfo {
  constructor(id, adancime, an, luna, zi, ora, minute, magnitudine, lat, long) {
    this.id = id;
    this.depth = adancime;
    this.year = an;
    this.month = luna;
    this.day = zi;
    this.hour = ora;
    this.minutes = minute;
    this.magnitude = magnitudine;
    this.lat = lat;
    this.long = long;
  }
  show() {
    return this;
  }
}

const products = [
  new EarthquakeInfo(1, 2, 3, 4, 5, 6, 3, 2, 9, 11),
  new EarthquakeInfo(2, 3, 4, 5, 6, 7, 8, 6.9, 10, 11),
];
products.push(new EarthquakeInfo(3, 2, 3, 4, 5, 6, 7, 4, 9, 10));

export default function ShoppingList() {
  const listItems = products.map((product) => (
    <div
      key={product.id}
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
            product.magnitude < 3
              ? "rgb(85,208,0)"
              : product.magnitude < 5
              ? "rgb(211,208,0)"
              : product.magnitude < 7
              ? "rgb(255,99,0)"
              : "rgb(255,0,0)",
        }}
      >
        Depth: {product.depth} Magnitude: {product.magnitude}
      </section>
      <section>
        Location in Latitude: {product.lat} Longitude: {product.long}
      </section>
      <section>
        Date: {product.day}.{product.month}.{product.year}
      </section>
      <section>
        Time: {product.hour}:{product.minutes}
      </section>
    </div>
  ));

  return <section>{listItems}</section>;
}
