package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
            HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

            //Dummy data
            stubResult.put(0, 25.5);
            stubResult.put(1, 20.2);
            stubResult.put(2, 23.3);
            stubResult.put(3, 21.2);
            stubResult.put(4, 22.3);

            return stubResult;
    }
}
