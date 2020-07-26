package com.sda.kristoff.ztmstats.inbound;

import com.sda.kristoff.ztmstats.model.VehicleDTO;
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
        List<VehicleDTO> vehicleDTOS = ztmData.getVehicleDTOS();
        //then
        assertEquals(7, vehicleDTOS.size());
        assertEquals("118", vehicleDTOS.get(1).getLine());
    }

}