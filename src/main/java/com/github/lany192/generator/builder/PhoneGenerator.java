package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class PhoneGenerator implements Generator<String> {

    @Override
    public String build() {
        //中国移动
        final String[] CHINA_MOBILE = {
                "134", "135", "136", "137", "138", "139", "150", "151", "152", "157", "158", "159",
                "182", "183", "184", "187", "188", "178", "147", "172", "198"
        };
        //中国联通
        final String[] CHINA_UNICOM = {
                "130", "131", "132", "145", "155", "156", "166", "171", "175", "176", "185", "186", "166"
        };
        //中国电信
        final String[] CHINA_TELECOME = {
                "133", "149", "153", "173", "177", "180", "181", "189", "199"
        };

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String mobile01;//手机号前三位
        int temp;
        switch (RandomUtils.nextInt(0, 2)) {
            case 0:
                mobile01 = CHINA_MOBILE[random.nextInt(CHINA_MOBILE.length)];
                break;
            case 1:
                mobile01 = CHINA_UNICOM[random.nextInt(CHINA_UNICOM.length)];
                break;
            case 2:
                mobile01 = CHINA_TELECOME[random.nextInt(CHINA_TELECOME.length)];
                break;
            default:
                mobile01 = "op标志位有误！";
                break;
        }
        if (mobile01.length() > 3) {
            return mobile01;
        }
        sb.append(mobile01);
        //生成手机号后8位
        for (int i = 0; i < 8; i++) {
            temp = random.nextInt(10);
            sb.append(temp);
        }
        return sb.toString();
    }
}
