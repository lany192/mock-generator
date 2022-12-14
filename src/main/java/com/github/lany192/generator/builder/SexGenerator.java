package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

/**
 * 0表示未知，1表示男，2表示女
 */
public class SexGenerator implements Generator<Integer> {
    private int sex;

    public boolean isBoy() {
        return sex == 1;
    }

    @Override
    public Integer build() {
        if (sex == 0) {
            sex = RandomUtils.nextInt(0, 3);
        }
        return sex;
    }
}
