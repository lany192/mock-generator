package com.github.lany192.generator;

import com.github.lany192.generator.builder.*;
import com.github.lany192.generator.entity.MockUser;
import com.github.lany192.generator.utils.JsonUtils;

import java.time.LocalDate;
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
//            MockUser mockUser = createUser();
//            System.out.println("模拟用户:" + JsonUtils.object2json(mockUser));
//        }

//        for (int i = 0; i < 100; i++) {
//            LocalDate localDate = new LocalDateGenerator(LocalDate.of(2000,1,1),LocalDate.of(2022,12,31)).build();
//            System.out.println("模拟日期:" + localDate.toString());
//        }

        for (int i = 0; i < 100; i++) {
            LocalTime localTime = new LocalTimeGenerator(LocalTime.of(1,1,1),LocalTime.of(23,59,59)).build();
            System.out.println("模拟日期:" + localTime.toString());
        }
    }
}
