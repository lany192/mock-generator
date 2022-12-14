package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

import java.time.LocalTime;

public class LocalTimeGenerator implements Generator<LocalTime> {
    private final LocalTime start;
    private final LocalTime end;

    public LocalTimeGenerator(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public LocalTime build() {
        int hour = RandomUtils.nextInt(start.getHour(), end.getHour());
        int minute = RandomUtils.nextInt(start.getMinute(), end.getMinute());
        int second = RandomUtils.nextInt(start.getSecond(), end.getSecond());
        return LocalTime.of(hour, minute, second);
    }
}
