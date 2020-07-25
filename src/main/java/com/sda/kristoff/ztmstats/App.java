package com.sda.kristoff.ztmstats;

import com.sda.kristoff.ztmstats.inbound.DataProvider;
import com.sda.kristoff.ztmstats.model.ZtmData;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DataProvider dataProvider = new DataProvider();
        ZtmData ztmData = dataProvider.getZtmData();
        System.out.println(ztmData);
    }
}
