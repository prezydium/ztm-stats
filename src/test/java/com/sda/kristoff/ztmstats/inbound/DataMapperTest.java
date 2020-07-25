package com.sda.kristoff.ztmstats.inbound;

import com.sda.kristoff.ztmstats.model.Vehicle;
import com.sda.kristoff.ztmstats.model.ZtmData;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DataMapperTest {

    private String testJson = RawDataProviderUtil.TEST_JSON;

    @Test
    public void shouldMapSuccessfully() {

        ZtmData ztmData = DataMapper.mapJsonToZtmData(testJson);
        List<Vehicle> vehicles = ztmData.getVehicles();

        assertEquals(7, vehicles.size());
        assertEquals("118", vehicles.get(1).getLine());
    }


}