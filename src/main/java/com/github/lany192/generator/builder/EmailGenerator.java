package com.github.lany192.generator.builder;

import org.apache.commons.lang3.RandomUtils;

public class EmailGenerator implements Generator<String> {
    /**
     * 最小长度
     */
    private final int min;
    /**
     * 最大长度
     */
    private final int max;

    public EmailGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String build() {
        final String[] email_suffix = "@gmail.com,@yahoo.com,@msn.com,@hotmail.com,@aol.com,@ask.com,@live.com,@qq.com,@0355.net,@163.com,@163.net,@263.net,@3721.net,@yeah.net,@googlemail.com,@126.com,@sina.com,@sohu.com,@yahoo.com.cn".split(",");
        int length = RandomUtils.nextInt(min, max);
        StringBuilder builder = new StringBuilder();
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            int number = (int) (Math.random() * base.length());
            builder.append(base.charAt(number));
        }
        builder.append(email_suffix[(int) (Math.random() * email_suffix.length)]);
        return builder.toString();
    }
}
