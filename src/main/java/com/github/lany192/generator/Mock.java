package com.github.lany192.generator;

import com.github.lany192.generator.utils.JsonUtils;
import com.github.lany192.generator.utils.MapBuilder;

public class Mock {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(JsonUtils.object2json(MapBuilder.get()
                    .put("username", "姓名" + i)
                    .put("id_card", new IDCardGenerator().build())
                    .put("email", new EmailGenerator(5, 9).build())
                    .build()));
        }
    }
}
