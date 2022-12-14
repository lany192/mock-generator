package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

public class LocalDateGenerator implements Generator<LocalDate> {
    private final LocalDate start;
    private final LocalDate end;

    public LocalDateGenerator() {
        start = LocalDate.of(2000, 1, 1);
        end = LocalDate.of(2023, 11, 31);
    }

    public LocalDateGenerator(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public LocalDate build() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, RandomUtils.nextInt(start.getYear(), end.getYear()));
        calendar.set(Calendar.MONTH, RandomUtils.nextInt(0, 11));
        calendar.set(Calendar.DATE, RandomUtils.nextInt(1, 31));
        LocalDate result = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (result.isAfter(start) && result.isBefore(end)) {
            return result;
        } else {
            return build();
        }
    }
}
