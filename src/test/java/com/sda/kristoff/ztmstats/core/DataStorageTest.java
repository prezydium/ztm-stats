package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.inbound.DataMapper;
import com.sda.kristoff.ztmstats.model.ZtmData;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.time.LocalDateTime;

public class DataStorageTest {

    @Test
    public void shouldUpdateData() throws IOException {
        //given
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("test.json");
        String testJson = new String(resourceAsStream.readAllBytes(), Charset.defaultCharset());
        ZtmData ztmData = DataMapper.mapJsonToZtmData(testJson);
        //when
        DataStorage dataStorage = new DataStorage();
        dataStorage.update(ztmData);
        //then
        LocalDateTime expectedDateTime = LocalDateTime.of(2020, 7, 25, 14, 45, 00);
        LocalDateTime actualUpdateTime = dataStorage.getUpdateTime();

        Assert.assertEquals(expectedDateTime, actualUpdateTime);
        Assert.assertEquals(7, dataStorage.getVehicles().size());
    }
}