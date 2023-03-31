class EarthquakeInfo {
    constructor(adancime, an, luna, zi, ora, minute, magnitudine, lat, long) {
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

export { EarthquakeInfo }

