package org.anowls.dev.utils;

import java.util.UUID;

/**
 * Created by anowls on 2017/7/13.
 */
public class DeviceIdGenerator {

    public static String generateDeviceId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(generateDeviceId());
    }
}
