package com.github.lany192.generator;

import org.apache.commons.lang3.RandomUtils;

public class SexGenerator implements Generator {

    @Override
    public String build() {
        return String.valueOf(RandomUtils.nextInt(0, 3));
    }
}
