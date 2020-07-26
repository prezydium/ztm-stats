package com.sda.kristoff.ztmstats.inbound;

import com.sda.kristoff.ztmstats.core.DataStorage;
import com.sda.kristoff.ztmstats.model.ZtmData;

import java.time.LocalTime;
import java.util.Optional;

public class QueryThread extends Thread {

    private DataStorage dataStorage;

    public QueryThread(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    @Override
    public synchronized void start() {
        System.out.println(getName() + " has started at " + LocalTime.now());
        super.start();
    }

    @Override
    public void run() {
        while (true) {
            Optional<ZtmData> optionalOfZtmData = DataProvider.getZtmData();
            optionalOfZtmData.ifPresentOrElse(
                    ztmData -> dataStorage.update(ztmData), () -> System.out.println("No Ztm Data retrieved"));
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
