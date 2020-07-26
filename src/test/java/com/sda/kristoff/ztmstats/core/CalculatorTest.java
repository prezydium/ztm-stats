package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.model.Vehicle;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private List<Vehicle> testVehicles = List.of(
            new Vehicle("148", 50, -2),
            new Vehicle("148", 45, 10),
            new Vehicle("127", 0, 0),
            new Vehicle("N13", 15, 0),
            new Vehicle("N13", 10, 350)
    );


    @Test
    public void shouldCalculateAvgForAll() {

        Double result = Calculator.avgSpeed(testVehicles);

        System.out.println();

        assertEquals(24.0, result, 0);
    }

}