package com.github.lany192.generator.builder;

import java.time.LocalDate;
import java.util.Calendar;

public class BirthdayGenerator implements Generator {
    private LocalDate localDate;

    /**
     * 随机出生日期
     */
    private void random() {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, (int) (Math.random() * 60) + 1950);
        birthday.set(Calendar.MONTH, (int) (Math.random() * 12));
        birthday.set(Calendar.DATE, (int) (Math.random() * 31));
        localDate = LocalDate.of(birthday.get(Calendar.YEAR), birthday.get(Calendar.MONTH) + 1, birthday.get(Calendar.DATE));
    }

    public LocalDate getBirthday() {
        if (localDate == null) {
            random();
        }
        return localDate;
    }

    @Override
    public String build() {
        if (localDate == null) {
            random();
        }
        return localDate.toString().replace("-", "");
    }
}
