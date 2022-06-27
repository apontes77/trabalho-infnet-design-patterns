package com.infnet.designpatterns.criacionais.builder;

import com.infnet.designpatterns.criacionais.builder.enums.CarType;
import com.infnet.designpatterns.criacionais.builder.enums.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
