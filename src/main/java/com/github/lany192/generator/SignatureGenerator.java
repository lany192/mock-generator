package com.github.lany192.generator;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SignatureGenerator implements Generator{

    @Override
    public String build() {
        String mock1 = "生活的理想，就是为了理想的生活;好好扮演自己的角色，做自己该做的事;懒人图库-网页素材下载站;人生的真理，只是藏在平淡无味之中;想像力比知识更重要;每一种创伤，都是一种成熟;激情是成功的必要前提!!;记住该访住的事，忘掉该忘掉的人;越学习,就越发现自己无知;凡事皆有代价，快乐的代价便是痛苦','工作是一种乐趣','爱情, 原来是含笑饮毒酒','年轻就是无限的可能','追求自我的突破','记住该记住的 忘记该忘记的','只要开始，虽晚不迟！','有些事情本身我们无法控制，只好控制自己。',' 经验是由痛苦中粹取出来的','明天的希望，让我们忘了今天的痛苦','发光并非太阳的专利，你也可以发光','你可以用爱得到全世界，你也可以用恨失去全世界','年轻是我们唯一拥有权利去编织梦想的时光','人的价值，在遭受诱惑的一瞬间被决定','学会偷懒，并懒出境界是提高工作效率最有效的方法！',' 少一点预设的期待，那份对人的关怀会更自在','人只要不失去方向，就不会失去自己";
        List<String> items = Stream.of(mock1.split(";")).collect(Collectors.toList());
        return items.get(new Random().nextInt(items.size() - 1));
    }
}
