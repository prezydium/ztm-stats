package com.sda.kristoff.ztmstats;

import com.sda.kristoff.ztmstats.core.DataStorage;
import com.sda.kristoff.ztmstats.core.UIThread;
import com.sda.kristoff.ztmstats.inbound.QueryThread;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting ZTM-STATS application");
        DataStorage dataStorage = new DataStorage();
        QueryThread queryThread = new QueryThread(dataStorage);
        queryThread.setDaemon(true);
        UIThread uiThread = new UIThread(dataStorage);

        queryThread.start();
        uiThread.start();

    }
}
