package com.github.lany192.generator;

import com.github.lany192.generator.entity.User;
import com.github.lany192.generator.utils.JsonUtils;

import java.io.IOException;

public class Mock {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            SexGenerator sexGenerator =new SexGenerator();

            User user = new User();
            user.setUsername(new ChineseNameGenerator(sexGenerator.isBoy()).build());
            user.setNickname(new NicknameGenerator().build());
            user.setBirthday(new BirthdayGenerator().getBirthday().toString());
            user.setAvatar(new AvatarGenerator().build());
            user.setIdCard(new IDCardGenerator().build());
            user.setEmail(new EmailGenerator(5, 9).build());
            user.setSex(sexGenerator.getSex());
            user.setPhone(new PhoneGenerator().build());
            user.setSignature(new SignatureGenerator().build());
            System.out.println("模拟用户:" + JsonUtils.object2json(user));
        }
//        try {
//            System.out.println("城市:" + CityHelper.getInstance().getJson());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
