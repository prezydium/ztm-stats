package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.inbound.DataMapper;
import com.sda.kristoff.ztmstats.model.ZtmData;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class DataStorageTest {


    @Test
    public void shouldUpdateData() throws IOException {
        //given
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("test.json");
        String testJson = new String(resourceAsStream.readAllBytes(), Charset.defaultCharset());
        ZtmData ztmData = DataMapper.mapJsonToZtmData(testJson);
        //when
        DataStorage dataStorage = new DataStorage();
    }

}