package com.github.lany192.generator;

import com.github.lany192.generator.builder.*;
import com.github.lany192.generator.entity.MockUser;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Mock {

    public static MockUser createUser() {
        SexGenerator sexGenerator = new SexGenerator();
        BirthdayGenerator birthdayGenerator = new BirthdayGenerator();

        MockUser user = new MockUser();
        user.setUsername(new ChineseNameGenerator(sexGenerator.isBoy()).build());
        user.setNickname(new NicknameGenerator().build());
        user.setBirthday(birthdayGenerator.build());
        user.setAvatar(new AvatarGenerator().build());
        user.setIdCard(new IDCardGenerator(birthdayGenerator.build()).build());
        user.setEmail(new EmailGenerator(5, 9).build());
        user.setSex(sexGenerator.build());
        user.setPhone(new PhoneGenerator().build());
        user.setSignature(new SignatureGenerator().build());
        user.setAddress(new AddressGenerator().build());

        //        try {
//            System.out.println("城市:" + CityHelper.getInstance().getJson());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return user;

    }

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            MockUser user = createUser();
//            System.out.println("模拟用户:" + JsonUtils.object2json(user));
//        }
//
//        for (int i = 0; i < 100; i++) {
//            LocalDateGenerator generator = new LocalDateGenerator(LocalDate.of(2000, 11, 1), LocalDate.of(2022, 1, 31));
//            System.out.println("模拟日期:" + generator.build().toString());
//        }

        for (int i = 0; i < 100; i++) {
            LocalTime start = LocalTime.of(5, 50, 1);
            LocalTime end = LocalTime.of(20, 1, 31);
            LocalTimeGenerator generator = new LocalTimeGenerator(start, end);
            System.out.println("模拟时间:" + generator.build().toString());
        }

        for (int i = 0; i < 100; i++) {
            LocalDateTime start = LocalDateTime.of(2000, 11, 1, 5, 50, 1);
            LocalDateTime end = LocalDateTime.of(2022, 1, 31, 20, 1, 31);
            LocalDateTimeGenerator generator = new LocalDateTimeGenerator(start, end);
            System.out.println("模拟时间:" + generator.build().toString());
        }
    }
}
