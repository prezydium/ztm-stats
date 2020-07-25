package com.sda.kristoff.ztmstats.inbound;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class ZtmRawDataProvider {

    public static String requestCurrentData(String urlAsString) throws IOException {
        URL url = new URL(urlAsString);
        try (InputStream in = url.openStream()) {
            byte[] bytes = in.readAllBytes();
            return new String(bytes, Charset.defaultCharset());
        }
    }
}
