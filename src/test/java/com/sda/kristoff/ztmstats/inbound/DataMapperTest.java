package com.sda.kristoff.ztmstats.inbound;

import com.sda.kristoff.ztmstats.model.Vehicle;
import com.sda.kristoff.ztmstats.model.ZtmData;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DataMapperTest {

    @Test
    public void shouldMapSuccessfully() throws IOException {
        //given
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("test.json");
        String testJson = new String(resourceAsStream.readAllBytes(), Charset.defaultCharset());
        //when
        ZtmData ztmData = DataMapper.mapJsonToZtmData(testJson);
        List<Vehicle> vehicles = ztmData.getVehicles();
        //then
        assertEquals(7, vehicles.size());
        assertEquals("118", vehicles.get(1).getLine());
    }

}