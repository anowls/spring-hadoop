package org.anowls.dev.utils;

import java.util.Random;

/**
 * Created by anowls on 2017/7/13.
 */
public class IpGenerator {

    private static Integer range = 255;

    public static String generateIp() {
        Random random = new Random();
        int ip1 = random.nextInt(range) % range;
        int ip2 = random.nextInt(range) % range;
        int ip3 = random.nextInt(range) % range;
        int ip4 = random.nextInt(range) % range;

        return String.format("%d.%d.%d.%d", ip1, ip2, ip3, ip4);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++)
            System.out.println(generateIp());
    }
}
