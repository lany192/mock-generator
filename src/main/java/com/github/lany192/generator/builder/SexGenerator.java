package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

/**
 * 0表示女，1表示男
 */
public class SexGenerator implements Generator {
    private int sex = -1;

    private void random() {
        sex = RandomUtils.nextInt(0, 2);
    }

    public boolean isBoy() {
        if (sex == -1) {
            random();
        }
        return sex == 1;
    }

    public int getSex() {
        if (sex == -1) {
            random();
        }
        return sex;
    }

    @Override
    public String build() {
        if (sex == -1) {
            random();
        }
        return String.valueOf(sex);
    }
}
