package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;

public class LocalDateTimeGenerator implements Generator<LocalDateTime> {
    private final LocalDateTime start;
    private final LocalDateTime end;

    public LocalDateTimeGenerator() {
        this.start = LocalDateTime.of(2000, 1, 1, 1, 1, 1);
        this.end = LocalDateTime.of(2023, 12, 31, 23, 59, 59);
    }

    public LocalDateTimeGenerator(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public LocalDateTime build() {
        int year = RandomUtils.nextInt(start.getYear(), end.getYear());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, RandomUtils.nextInt(1, 12));
        calendar.set(Calendar.DATE, RandomUtils.nextInt(1, 31));
        calendar.set(Calendar.HOUR, RandomUtils.nextInt(0, 23));
        calendar.set(Calendar.MINUTE, RandomUtils.nextInt(0, 59));
        calendar.set(Calendar.SECOND, RandomUtils.nextInt(0, 59));

        LocalDateTime result = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        //如果比start小，重新生成
        if (result.isAfter(start) && result.isBefore(end)) {
            return result;
        } else {
            return build();
        }
    }
}
