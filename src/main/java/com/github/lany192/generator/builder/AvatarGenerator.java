package com.github.lany192.generator.builder;

import java.util.Random;

public class AvatarGenerator implements Generator{

    @Override
    public String build() {
        return "https://smallplants.oss-cn-hangzhou.aliyuncs.com/avatar/" + new Random().nextInt(446) + ".jpg";
    }
}
