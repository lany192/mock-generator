package com.github.lany192.generator;

import com.github.lany192.generator.entity.User;
import com.github.lany192.generator.utils.JsonUtils;

public class Mock {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int sex = Integer.parseInt(new SexGenerator().build());
            User user = new User();
            user.setUsername(new ChineseNameGenerator(sex == 1).build());
            user.setNickname(new NicknameGenerator().build());
            user.setBirthday(new BirthdayGenerator().getBirthday().toString());
            user.setAvatar(new AvatarGenerator().build());
            user.setIdCard(new IDCardGenerator().build());
            user.setEmail(new EmailGenerator(5, 9).build());
            user.setSex(sex);
            user.setPhone(new PhoneGenerator().build());
            user.setSignature(new SignatureGenerator().build());
            System.out.println("模拟用户:" + JsonUtils.object2json(user));
        }
    }
}
