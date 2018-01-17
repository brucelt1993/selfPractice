package com.bruce.tools;

import java.util.Random;

public class EnumsTools {
    private static Random rand = new Random(47);

    /**
     * 获取随机的枚举类型
     * @param ec
     * @param <T>
     * @return
     */
    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
