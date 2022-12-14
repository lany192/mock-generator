package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDate;
import java.util.Calendar;

public class LocalDateGenerator implements Generator<LocalDate> {
    private final LocalDate start;
    private final LocalDate end;

    public LocalDateGenerator(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public LocalDate build() {
        int year = RandomUtils.nextInt(start.getYear(), end.getYear());
        int month = RandomUtils.nextInt(1, 12);
        int date = RandomUtils.nextInt(1, 31);

        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, year);
        birthday.set(Calendar.MONTH, month);
        birthday.set(Calendar.DATE, date);
        return LocalDate.of(birthday.get(Calendar.YEAR), birthday.get(Calendar.MONTH) + 1, birthday.get(Calendar.DATE));
    }
}
