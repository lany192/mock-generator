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
        int minute = RandomUtils.nextInt(0, 59);
        int second = RandomUtils.nextInt(0, 59);
        LocalTime result = LocalTime.of(hour, minute, second);
        //如果比start小，重新生成
        if (result.isAfter(start) && result.isBefore(end)) {
            return result;
        } else {
            return build();
        }
    }
}
