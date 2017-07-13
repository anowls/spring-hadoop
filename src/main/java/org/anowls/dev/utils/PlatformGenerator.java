package org.anowls.dev.utils;

import java.util.Random;

/**
 * Created by anowls on 2017/7/13.
 */
public class PlatformGenerator {

    public static String[] platforms = new String[]{"google", "tencent", "baidu", "360", "facebook"};

    public static String generatePlatform() {
        Random random = new Random();
        int nextInt = random.nextInt(5);
        return platforms[nextInt];
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++)
            System.out.println(generatePlatform());
    }
}
