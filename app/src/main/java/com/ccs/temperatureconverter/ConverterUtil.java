package com.ccs.temperatureconverter;

/**
 * Created by javier1 on 14/2/17.
 */

public class ConverterUtil {
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
