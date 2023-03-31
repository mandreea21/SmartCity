CREATE TABLE cutremur (
    cutremurid INT NOT NULL AUTO_INCREMENT,
    magnitudine VARCHAR(255) NOT NULL,
    latitudine VARCHAR(255) NOT NULL,
    longitudine VARCHAR(255) NOT NULL,
    adancime INT NOT NULL,
    an_cutremur INT NOT NULL,
    luna_cutremur INT NOT NULL,
    ziua_cutremur INT NOT NULL,
    ora INT NOT NULL,
    minut INT NOT NULL,
    PRIMARY KEY (cutremurid)
);