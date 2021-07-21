package com.github.lany192.generator;

import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataUtils {

    public static int getRandomInt(int start, int end) {
        return RandomUtils.nextInt(start, end);
    }

    /**
     * 返回Email
     *
     * @param min 最小长度
     * @param max 最大长度
     */
    public static String getEmail(int min, int max) {
        return new EmailGenerator(min, max).build();
    }

    /**
     * 生成手机号
     */
    public static String getTelephone() {
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

    public static String getChineseName() {
        String firstName = "赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤滕殷罗毕郝邬安常乐于时傅皮卞齐康伍余元卜顾孟平黄和穆萧尹姚邵湛汪祁毛禹狄米贝明臧计伏成戴谈宋茅庞熊纪舒屈项祝董梁杜阮蓝闵席季麻强贾路娄危江童颜郭梅盛林刁钟徐邱骆高夏蔡田樊胡凌霍虞万支柯咎管卢莫经房裘缪干解应宗宣丁贲邓郁单杭洪包诸左石崔吉钮龚程嵇邢滑裴陆荣翁荀羊於惠甄魏加封芮羿储靳汲邴糜松井段富巫乌焦巴弓牧隗山谷车侯宓蓬全郗班仰秋仲伊宫宁仇栾暴甘钭厉戎祖武符刘姜詹束龙叶幸司韶郜黎蓟薄印宿白怀蒲台从鄂索咸籍赖卓蔺屠蒙池乔阴郁胥能苍双闻莘党翟谭贡劳逄姬申扶堵冉宰郦雍却璩桑桂濮牛寿通边扈燕冀郏浦尚农温别庄晏柴瞿阎充慕连茹习宦艾鱼容向古易慎戈廖庚终暨居衡步都耿满弘匡国文寇广禄阙东殴殳沃利蔚越夔隆师巩厍聂晁勾敖融冷訾辛阚那简饶空曾毋沙乜养鞠须丰巢关蒯相查后江红游竺权逯盖益桓公万俟司马上官欧阳夏侯诸葛闻人东方赫连皇甫尉迟公羊澹台公冶宗政濮阳淳于仲孙太叔申屠公孙乐正轩辕令狐钟离闾丘长孙慕容鲜于宇文司徒司空亓官司寇仉督子车颛孙端木巫马公西漆雕乐正壤驷公良拓拔夹谷宰父谷粱晋楚阎法汝鄢涂钦段干百里东郭南门呼延归海羊舌微生岳帅缑亢况后有琴梁丘左丘东门西门商牟佘佴伯赏南宫墨哈谯笪年爱阳佟第五言福百家姓续";
        String girl = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽 ";
        String boy = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";
        int index = getRandomInt(0, firstName.length() - 1);
        String first = firstName.substring(index, index + 1);
        int sex = getRandomInt(0, 1);
        String str = boy;
        int length = boy.length();
        if (sex == 0) {
            str = girl;
            length = girl.length();
        }
        index = getRandomInt(0, length - 1);
        String second = str.substring(index, index + 1);
        int hasThird = getRandomInt(0, 1);
        String third = "";
        if (hasThird == 1) {
            index = getRandomInt(0, length - 1);
            third = str.substring(index, index + 1);
        }
        return first + second + third;
    }

    public static String getEnglishName() {
        String mock = "Elton Job;Dylan Nixon;Fanny Parker;Byron Effie;Jesse Gold;Hannah Albert;Milo Carey;Simon Susan;Jacob Bowman;Anastasia John;Harvey Carnegie;Samantha Sandy;Justin Walkley;Eden Cook;Abel Hugh;Patrick Lawson;Hilda Boswell;Molly Sophia;Bob Austen;Noah Dryden;Norma Holt;Dwight Watt;Nicole Isaac;Sebastian Tony;Abner Lawrence;Bernice Wyat(t);Jacqueline Sinclair;Darnell I.;Afra Hamlet;Edith Swift;Everley Christ;Pandora Johnston(e);Ian Clare;Elmer Conrad;Bert Walker;Mandy ;Lisa Aled(k);Corey Rebecca;Rosemary Ezekiel;Una Henry;Olive Moulton;Martin Grey;Winifred Brown;Judy Bach;Myra Church;Woodrow Black;Bart Orlando;Beverly Bellamy;Kerwin Reed;Rose Lancelot;Dana Houston;Arlen Churchill;Madge Freeman;Bess Lewis;Rod ;Clarence Dillon;Elizabeth Eve;Elva Dierser;Marsh Pater;Yedda Barton;Bevis Grant;Cash Spencer;Kirk Aldridge;Kevin Tate;Michelle Tommy;Astrid Attlee;Quincy Haywood;Joyce Clement;Hermosa Cromwell;Marina Defoe;Raymond Yale;Nicholas Finger;Phoebe Zangwill;Ron House;Cathy Rhodes;Gabrielle May;Dawn Pollitt;Tiffany Stuart;Winni Daniell;Arno Gregory;August Saul;Douglas Croft;Joanna Macaulay;Ogden Van;Paula Mark;Armstrong Billy;York Eugene;Walker Robinson;Stacey Louisa;Tiffany Crichton;Amos Brook;Pamela Marjory;Bernard Felton;Ansel Michael;Gabriel Thackeray;Sam Terry;Mike Newton;Angela Shelley;Sandra Fox;Ralap Harriman;Frederic Gray;Prudence Wagner;Marico Gosse;Fabian Barney;Bblythe Dupont;Robin Conan;Blake Morley;Neil Belle;Crystal Margaret;May Carter;Gavin Ferdinand;Amelia Isaiah;Richard Hazlitt;Vic Laurie;Catherine Bryan;Mavis Pulitzer;Lucy Bacon;Meredith Wodehous;Victoria Rossetti;Christine Bulwer;Sarah Roosevelt;Phyllis MacPherson;Les Becky;Mirabelle Eugen;Ann Bentham;Tobey Meredith;Porter Patience;Eleanore Bird;Susanna Stephens;Flora Longfellow;Max Pepys;Chester Bloomer;Chad Rosa;Caesar DuBois;Venus Ramsden;Fitch Carl;Truda Peg;Perry Roger;Todd Agnes;Rudolf Huxley;Lionel Robert;Yvette Clark(e);Lauren Joule;Larry Pullan;Spring Pritt;Penny Bessie;Herbert Sawyer;Nick Chaucer;Lynn Garcia;Antonia Berkeley;Clark Gunter;Monroe Dunbar;Hilary Stone;Christian Abe;Ophelia Camilla;Leif Jack;Joyce Springhall;Karen Abbot(t);Troy Kell(e)y;Dennis Brewster;Basil Thomas;Stanford Cotton;Alexander IV.;Wade Jenkin(s);Virgil Arthur;Avery Motley;Alberta More;Lee Dolly;Leopold Luke;Dora Meg;Yetta Fowler;Delia Johnny;Roberta Milton;Jo Stowe;Evelyn Catharine;Leila Elizabeth;Ivan Steele;Page Elsie;Yvonne Lincoln;Ruth Mackintosh;Betty Chesterton;Myron Lou(ie);Dominic Austin;Rosalind Carroll;Randolph Zechariah;Burnell Carllyle;Harry Tobias;Eudora Cowper;Winfred Toby;Nathan Powell;Ferdinand Charley;Maxwell MacDonald;Adela Tom;Jennifer Louis;Booth Frederick;Emma Betsy;Denise Will;George Bessemer;Stephanie Congreve;Dinah Edith;Miriam Ernest;Cedric Electra;Lyndon Horatio;Esther Ruth;Jim Bowen;Xenia Charles;Myrna Ward;Daniel Raglan;James Cook(e);Stan Palmer;Tina Alcott;Gloria Dickey;Shirley Howell(s);Olivia Gill;Jo Polly;Albert Raphael;Joseph Hearst;Wallis ;Cherry Southey;Werner Kennan;Grover Haydn;Colbert O'Neil;Frances Peggy;Baron Flynn;Monica Cooper;Bonnie Kit;Eric Gilbert;Hubery II.;Augus Maltz;Willie Wollaston;Nat Anthony;Eartha Ivan;Ken Judith;Bartholomew Habakkuk;Bruno Kathleen;Olga Huggins;Broderick McDonald;Jenny Wallace;Charles Hudson;Edmund Whitehead;Cliff Symons;Abigail Richard;Levi Valentine;Zona Howard;Nancy Norris;Sally Stilwell;Zora Hodgson;Evangeline Pope;Valerie Max;Kelly Bunyan;Carter Yerkes;Rachel Jones;Bishop Dutt;Dolores Service;Blanche Becher;Penelope O'Casey;Grace Harrod;Boris Nancy;Frank Douglas(s);Clare Marner;Kelly Adelaide;Odelia Macadam;Hamiltion Lindsay;Polly Crane;Valentina Waters;Merle Beaufort;Genevieve Andrew;Jack Willard;Robert Ted;Veronica Hawthorne;Carl David;Enoch Sonmerfield;Dean Scripps;Theobald Kipling;Tabitha Collins;Audrey Fielding;Ursula Woolf;Cornelia Spender;Isidore Gresham;Nora Forster;Sandy Monroe;Mark Bernard;Carey Colclough;Fay Caroline;Cornelius Harper;Heloise Marcus;Gwendolyn Lynch;Wordsworth Lloyd;Sheila Leigh;Tab Carrie;Alma Arnold;Donald Geoffrey;Xanthe Guy;Newman Norton;Lawrence Curme;Archibald Eveline;Cheryl Juliana;Len Abraham;Don Donne;Gale Robeson;Riva Lamb;Octavia Rhys;Francis Gibbon;Mabel Tout;Natalie Morse;Berton Wilde;Ronald Lattimore;Guy Dewey;Marjorie Edmund;Burgess Burne-Jones;Linda Benson;Edgar Harrington;Ethel Armstrong;Harlan Esther;Winston Kitty;Clement Moses;Kama Horace;Miranda Whittier;Amanda Smedley;Zero Sheridan;Valentine Alice;Boyce Butler;Bard Daniel;Iris Copperfield;Laura Sam;Kay Sherwood;Yehudi Chaplin;Tracy Rudolph;Nathaniel Connie;Alan Gabriel;Otis Broad;Saxon Lew;Murphy Quiller;Jocelyn Euphemia;Gary Burns;Dominic Amelia;Gustave Benjamin;Zoe Felix;Barry Salome;Caroline Sainsbury;Belle Shakespeare;Gerald Peacock;June Theresa;Pag Bruno;Griselda Wordsworth;Maureen Jackson;Ida Commons;Chasel Philip;Darlene Gus;Channing Christopher;David Galsworthy;Nelson Betty;Vanessa Occam;Celeste Galbraith;Dick Eleanor;Wright Sophy;Deborah Dulles;Aurora Ackerman(n);Sherry Petty;Keith Bloomfield;Michaelia MacMillan;Andrea Hart;Beck Jeremy;Kim Nelson;Lindsay Doyle;Upton Lena;Colby Green;Webb Sharp;Adair Den(n)is;Ingemar Pitman;Jay Roland;Evan Priestley;Paddy Herty;Benedict Pansy;Elvira Stephen;Brian Yule;Adam Tracy;Drew Martha;Lennon Susanna;Lesley Jennings;Jamie Hobson;Chloe Evans;Bowen Bertha;Louis Doris;Bertram Eden;Curitis Wright;Lena Bauer;Noel Hoyle;Alger DeQuincey;Setlla Titus;Nelly O'Connor;Alfred Spenser;Regan Morris;Amy Malthus;Daphne Maud;Kitty Josh;John Bartlett;Egbert Sapir;Augustine Locke;Eileen Mansfield;Morton Isabel;Aubrey Edison;Jean Moore;Toby Connor;Roxanne Hardy;Wanda Joshua;Hunter Sander;Hulda Marlowe;Michell Delia;Moses Ann;Sandy Francis;Novia Harrison;Ternence George;Webster Gissing;Maxine Emmie;Emily Dick;Peter Sara(h);Kennedy Jerome;Belinda Finn;Atwood Gallacher;Rita Paul;Gustave Melville;Ives Pullman;Bing Rosalind;Oscar Emily;Giles Jeremiah;Claire Franklin;Ina Brooke;Hugo Stella;Hedda Ella;Bruce Arabella;Ella Wyld(e);Horace Hosea;Tammy Katharine;Xavier Gallup;Rachel Antoinette;Sid Stevenson;Verna Beerbohm;Elliot Margery;Candice Back;William Lowell;Martina Washington;Greg Clemens;Hogan Hopkin(s);Regina Ingersoll;Henry Gibson;Erica Christian;Helen Ford;Irene Romeo;Mary Violet;Kimberley Martin;Elsie Micah;Sidney Hal;Elma Nichol(s);Poppy Grote;Archer Hemingway;Kerr Walpole;Gill Ben;Uriah Obadiah;Muriel Aldington;Katherine Helin(a);Barret Keats;Julia Woolley;Cara Joel;Meroy Ralph;Verne Augustus;Theresa Nelly;Aldrich Smith;Annabelle Jacob;Tony Constance;Viola Lytton;Martha Walton;Mignon Buckle;Griffith Kitto;Dunn Edward;Tyler Warren;Maggie Trollpoe;Barlow Richardson;Dave Smollett;Norton Coleridge;King Henley;Maud Wesley;Wendell Jordan;Marian Camp;Spencer Mary;Tyrone Alfred;Ernest Childe;Owen Vaughan;Phil Grantham;Leonard MacAdam;Geraldine Snow;Queena Aly;Modesty Partridge;Leo Hughes;Vito Bess;Rupert Bernal;Elvis Landon;Agatha Bloor;Buck Joyce;Quinn Montgomery;Salome Irving;Cynthia Strachey;Vita Lizzie;Rory Whyet;Thomas Tomlinson;Tess Eipstein;Cyril Coverdale;Stanley Henrietta;Marvin ;Renata Adolph;Godfery Wallis;Baldwin Louise;Darcy Richards;Abraham Penn;Luther Piers;Vincent Thomson;Matthew Lucy;Merry Maggie;Mag Nell;Barton Edgeworth;Veromca Thorndike;Moore Wells;Adonis Ellen;Derrick Eva;Freda Duncan;Zebulon Mond;Anna London;Edwina Michelson;Elroy Onions;Marshall Sally;Jill Webster;Will Foster;Philip Matthew;Coral Housman;Magee Timothy;Joanne Toynbee;Sabina Patrick;Ula Wilson;Dorothy Dorothy;Ellis Chamberlain;Colin Wat;Carr Vogt;Marlon Emerson;Tracy Archibald;Moira McCarthy;Duke Hood;Julius Babbitt;Conrad Eliot;Gregary Roy;Abbott Marcellus;Blair Juliet;Marcia Child;Florence Hewlett;Lou Saxton;Natividad Birrell;Mortimer Joseph;Murray Grace;Jane Frances;Sophia Pigou;Steward Simon;Jared FitzGerald;Lynn Taylor;Ada Gracie;Hilary Christy;Rex Zephaniah;Daisy Veblen;Roderick Whitman;Hedy Baldwin;Mildred Eddie;Jessie Maria;Harriet Crofts;Gordon Joe;Alvis Mac-;Mandel Flower;Quintion Russell;Bill Bronte;Bertha Noyes;Faithe Raymond;Earl Baker;Ted Maurice;Melissa Adams;Sampson Larkin;Diana Barrie;Andy Harry;Arvin Pound;Orville Kennedy;Clyde Joan;Julian Nick;Mamie Jerry;Julie Virginia;Christ Dalton;Jeremy Dunlop;Antony Reade;Aaron Hamilton;Dale Harold;Rebecca Beck;Paul Blake;Zara Johnson;Simona Hubbard;Janice Mat(h)ilda;Boyd Hansom;Quintina Evan;Bella Darwin;Georgia Byron;Scott Wheatley;Armand Dobbin;Benjamin Moll;Doreen Christie;Antonio ;Steven Coffey;Alice Garden;Felix Wood;Camille Browne;Carol Christiana;Josephine Ricardo;Debby Fanny;Bradley Noah;Nina Saroyan;Omar Winifred;Ingram Herbert;Ford Belloc;Cleveland Bright;Andre Hodge;Chapman Morton;Beacher Swinburne;Borg Dora;Harley Raman;Odelette Bart;Sean Faraday;Virginia Clarissa;Ryan Oscar;Hayden Zacharias;Sibyl Chapman;Zachary Perkin;Harold Gard(i)ner;Warner Julian;Vicky Needham;Joshua Halifax;Christopher Acheson;Matt III.;Joy Twain;Jeffrey Jim;Bridget Young;Jonathan Dickens;Judith Bryce;Eugene Kellogg;Asa Goldsmith;Charlotte Humphr(e)y;Quentin Jessie;Alvin Wilcox;Hazel Field;Edward Doherty;Haley Rob;Zenobia Ferguson;Vera Benedict;Victor Tyler;Yale Thodore;Lester Windsor;Tim Katte;Janet Strong;Sylvia Gunther;Sebastiane Hobbes;Humphrey Leopold;Angelo Bartholomew;Barbara Bray;Isaac Minnie;Renee Jefferson;Selena Robin;Arthur Malory;Laurel Adam;Louise Bertram;Hyman Owen;Pearl Marshall;Norman Haggai;Jodie Edie;Solomon Augustine;Nydia Wild;Cecilia Ulysses;Lambert Barrett;Oswald Poe;Lucien Julia;Hiram ;Devin Peter;Joan Harte;Gene Samuel;Samuel Jean;Reg Morgan;Rock Bert;Frederica Thompson;Gemma Bell;Brandon Lily;Irma William;Jessica Scott;Yves Leighton;Leona Bradley;Nigel Oliver;Alva Sidney;Michael Jane;Darren Milne;Cora Gladstone;Lydia Tours;Alston Tennyson;Pete Addison;Ed Carmen;Blithe Pearson;Dempsey Price;Beryl Bethune;Jeff Gaskell;Montague Kent;Berg Daisy;Elijah Walter;Emmanuel Trevelyan;Kristin Jenny;Bennett Lynd;Eden Malachi;Kyle Toland;Wayne Morrison;Page ;Erin Graham;Reginald Fast;Brady Cocker;Ira Wilhelmina;Burke Harvey;Aries Maxwell;Wilbur Beard;Enid Madge;Violet Nora;Adelaide Yeates;Megan Longman;Wendy Webb;Benson ;Madeline Nehemiah;Susan Jimmy;Marguerite Bridges;Jonas Blume;Alexia Giles;Ben Marion;April Evelina;Arlene Steinbeck;Eunice Julius;Hardy Eisenhower;Bernie Robbins;Osborn Barnard;Doris Hoover;Mick Truman;Rae Davy;Elsa Katrine;Payne Dewar;Truman Buck;Rodney Bennett;Oliver Bobby;Beau Anna;Beatrice Kelsen;Baird Raleign;Walter MacArthur;Thera Leonard;Vivien Browning;Xaviera Lindberg(h);Parker Silas;Marcus Surrey;Allen Bob;Ruby Thoreau;Ulysses Lambert;Barnett Alick;Morgan Jonathan;Constance Judson;Lorraine Keynes;Andrew Dan;Sharon Anne;Edwiin Whit;Teresa Hutt;Primo Murray;Patricia Nathaniei;Phoenix Leacock;Kent Alerander;Miles Newman;Lance Senior;Susie Cecillia;Herman Bush;Lewis Boyle;Agnes Johnson;Adolph Rockefeller;Betsy Hansen;Isabel Anderson;Franklin Wheeler;Cecil Ruskin;Juliet Turner;Maria Mill;Otto Tuttle;Hobart Nahum;Ward Hume;Eve Sailsbury;Theodore Philemon;Tom Keppel;Gladys Sweet;Duncan Noel;Trista Cumberland;Glenn Clara;Letitia Antonia;Jerome Hicks;Claude ;Prima Jeames;Calvin Faulkner;Geoffrey Clapham;Lilith Rutherford;Sigrid Masefield;Nicola Elinor;Burton Frank;Lillian James;Malcolm Sassoon;Howar Warner;Gail Reynolds;Cornell Yonng;Vivian Godwin;Honey Zimmerman;Alva Rusk;Mona North;Hale Rayleign;Hugh Lyly;Kenneth Samson;Edison Bertie;Elaine Lucas;Jason Geordie;Deirdre Hill;Taylor Wilmot(t);Athena Wyclif(fe);Clara Middleton;Dana Kingsley;Sabrina Nicholas;Donahue Bill;Jerry Simpson;Suzanne Temple;Merlin Judd;Liz Cissie;Gilbert Wolf;Roy Dorothea;Ivy Lee;Maurice Jasper;Brook Adela;Ingrid Hornby;Donna Nico(l);Eli Ellis;Sara Jonah;Jenny Gunther;Xavier Becky;Perry Rob;Andy Hemingway;Valentina Curme;Lennon Jerry;Kelly Joseph;Jesse Michael;Albert Tate;Miranda Reade;Luther Donne;Samantha Thodore;Alice Minnie;Jerry Edgeworth;Teresa Twain;Zenobia Matthew;Saxon Hazlitt;Madeline Willard;Hazel ;Patrick Stone;Bill Grace;Merlin MacMillan;Joy Daisy;Vita Horace;Mandy Lizzie;Moses Rockefeller;Louise Saul;Elvira Yonng;Sidney Longman;Rex Steinbeck;Queena Alick;Jonas Bach;Candice Rose;Bblythe Eddie;Godfery More;Wade Maurice;Elroy Agnes;Beacher Lytton;Wayne Godwin;Blanche Hume;Delia Austen;Cliff Malthus;Leif Felix;Philip Gibbon;Nora Perkin;Harold Lucas";
        List<String> items = Stream.of(mock.split(";")).collect(Collectors.toList());
        return items.get(new Random().nextInt(items.size() - 1));
    }

    private static String getAddressDetail() {
        String[] road = "重庆大厦,黑龙江路,十梅庵街,遵义路,湘潭街,瑞金广场,仙山街,仙山东路,仙山西大厦,白沙河路,赵红广场,机场路,民航街,长城南路,流亭立交桥,虹桥广场,长城大厦,礼阳路,风岗街,中川路,白塔广场,兴阳路,文阳街,绣城路,河城大厦,锦城广场,崇阳街,华城路,康城街,正阳路,和阳广场,中城路,江城大厦,顺城路,安城街,山城广场,春城街,国城路,泰城街,德阳路,明阳大厦,春阳路,艳阳街,秋阳路,硕阳街,青威高速,瑞阳街,丰海路,双元大厦,惜福镇街道,夏庄街道,古庙工业园,中山街,太平路,广西街,潍县广场,博山大厦,湖南路,济宁街,芝罘路,易州广场,荷泽四路,荷泽二街,荷泽一路,荷泽三大厦,观海二广场,广西支街,观海一路,济宁支街,莒县路,平度广场,明水路,蒙阴大厦,青岛路,湖北街,江宁广场,郯城街,天津路,保定街,安徽路,河北大厦,黄岛路,北京街,莘县路,济南街,宁阳广场,日照街,德县路,新泰大厦,荷泽路,山西广场,沂水路,肥城街,兰山路,四方街,平原广场,泗水大厦,浙江路,曲阜街,寿康路,河南广场,泰安路,大沽街,红山峡支路,西陵峡一大厦,台西纬一广场,台西纬四街,台西纬二路,西陵峡二街,西陵峡三路,台西纬三广场,台西纬五路,明月峡大厦,青铜峡路,台西二街,观音峡广场,瞿塘峡街,团岛二路,团岛一街,台西三路,台西一大厦,郓城南路,团岛三街,刘家峡路,西藏二街,西藏一广场,台西四街,三门峡路,城武支大厦,红山峡路,郓城北广场,龙羊峡路,西陵峡街,台西五路,团岛四街,石村广场,巫峡大厦,四川路,寿张街,嘉祥路,南村广场,范县路,西康街,云南路,巨野大厦,西江广场,鱼台街,单县路,定陶街,滕县路,钜野广场,观城路,汶上大厦,朝城路,滋阳街,邹县广场,濮县街,磁山路,汶水街,西藏路,城武大厦,团岛路,南阳街,广州路,东平街,枣庄广场,贵州街,费县路,南海大厦,登州路,文登广场,信号山支路,延安一街,信号山路,兴安支街,福山支广场,红岛支大厦,莱芜二路,吴县一街,金口三路,金口一广场,伏龙山路,鱼山支街,观象二路,吴县二大厦,莱芜一广场,金口二街,海阳路,龙口街,恒山路,鱼山广场,掖县路,福山大厦,红岛路,常州街,大学广场,龙华街,齐河路,莱阳街,黄县路,张店大厦,祚山路,苏州街,华山路,伏龙街,江苏广场,龙江街,王村路,琴屿大厦,齐东路,京山广场,龙山路,牟平街,延安三路,延吉街,南京广场,东海东大厦,银川西路,海口街,山东路,绍兴广场,芝泉路,东海中街,宁夏路,香港西大厦,隆德广场,扬州街,郧阳路,太平角一街,宁国二支路,太平角二广场,天台东一路,太平角三大厦,漳州路一路,漳州街二街,宁国一支广场,太平角六街,太平角四路,天台东二街,太平角五路,宁国三大厦,澳门三路,江西支街,澳门二路,宁国四街,大尧一广场,咸阳支街,洪泽湖路,吴兴二大厦,澄海三路,天台一广场,新湛二路,三明北街,新湛支路,湛山五街,泰州三广场,湛山四大厦,闽江三路,澳门四街,南海支路,吴兴三广场,三明南路,湛山二街,二轻新村镇,江南大厦,吴兴一广场,珠海二街,嘉峪关路,高邮湖街,湛山三路,澳门六广场,泰州二路,东海一大厦,天台二路,微山湖街,洞庭湖广场,珠海支街,福州南路,澄海二街,泰州四路,香港中大厦,澳门五路,新湛三街,澳门一路,正阳关街,宁武关广场,闽江四街,新湛一路,宁国一大厦,王家麦岛,澳门七广场,泰州一路,泰州六街,大尧二路,青大一街,闽江二广场,闽江一大厦,屏东支路,湛山一街,东海西路,徐家麦岛函谷关广场,大尧三路,晓望支街,秀湛二路,逍遥三大厦,澳门九广场,泰州五街,澄海一路,澳门八街,福州北路,珠海一广场,宁国二路,临淮关大厦,燕儿岛路,紫荆关街,武胜关广场,逍遥一街,秀湛四路,居庸关街,山海关路,鄱阳湖大厦,新湛路,漳州街,仙游路,花莲街,乐清广场,巢湖街,台南路,吴兴大厦,新田路,福清广场,澄海路,莆田街,海游路,镇江街,石岛广场,宜兴大厦,三明路,仰口街,沛县路,漳浦广场,大麦岛,台湾街,天台路,金湖大厦,高雄广场,海江街,岳阳路,善化街,荣成路,澳门广场,武昌路,闽江大厦,台北路,龙岩街,咸阳广场,宁德街,龙泉路,丽水街,海川路,彰化大厦,金田路,泰州街,太湖路,江西街,泰兴广场,青大街,金门路,南通大厦,旌德路,汇泉广场,宁国路,泉州街,如东路,奉化街,鹊山广场,莲岛大厦,华严路,嘉义街,古田路,南平广场,秀湛路,长汀街,湛山路,徐州大厦,丰县广场,汕头街,新竹路,黄海街,安庆路,基隆广场,韶关路,云霄大厦,新安路,仙居街,屏东广场,晓望街,海门路,珠海街,上杭路,永嘉大厦,漳平路,盐城街,新浦路,新昌街,高田广场,市场三街,金乡东路,市场二大厦,上海支路,李村支广场,惠民南路,市场纬街,长安南路,陵县支街,冠县支广场,小港一大厦,市场一路,小港二街,清平路,广东广场,新疆路,博平街,港通路,小港沿,福建广场,高唐街,茌平路,港青街,高密路,阳谷广场,平阴路,夏津大厦,邱县路,渤海街,恩县广场,旅顺街,堂邑路,李村街,即墨路,港华大厦,港环路,馆陶街,普集路,朝阳街,甘肃广场,港夏街,港联路,陵县大厦,上海路,宝山广场,武定路,长清街,长安路,惠民街,武城广场,聊城大厦,海泊路,沧口街,宁波路,胶州广场,莱州路,招远街,冠县路,六码头,金乡广场,禹城街,临清路,东阿街,吴淞路,大港沿,辽宁路,棣纬二大厦,大港纬一路,贮水山支街,无棣纬一广场,大港纬三街,大港纬五路,大港纬四街,大港纬二路,无棣二大厦,吉林支路,大港四街,普集支路,无棣三街,黄台支广场,大港三街,无棣一路,贮水山大厦,泰山支路,大港一广场,无棣四路,大连支街,大港二路,锦州支街,德平广场,高苑大厦,长山路,乐陵街,临邑路,嫩江广场,合江路,大连街,博兴路,蒲台大厦,黄台广场,城阳街,临淄路,安邱街,临朐路,青城广场,商河路,热河大厦,济阳路,承德街,淄川广场,辽北街,阳信路,益都街,松江路,流亭大厦,吉林路,恒台街,包头路,无棣街,铁山广场,锦州街,桓台路,兴安大厦,邹平路,胶东广场,章丘路,丹东街,华阳路,青海街,泰山广场,周村大厦,四平路,台东西七街,台东东二路,台东东七广场,台东西二路,东五街,云门二路,芙蓉山村,延安二广场,云门一街,台东四路,台东一街,台东二路,杭州支广场,内蒙古路,台东七大厦,台东六路,广饶支街,台东八广场,台东三街,四平支路,郭口东街,青海支路,沈阳支大厦,菜市二路,菜市一街,北仲三路,瑞云街,滨县广场,庆祥街,万寿路,大成大厦,芙蓉路,历城广场,大名路,昌平街,平定路,长兴街,浦口广场,诸城大厦,和兴路,德盛街,宁海路,威海广场,东山路,清和街,姜沟路,雒口大厦,松山广场,长春街,昆明路,顺兴街,利津路,阳明广场,人和路,郭口大厦,营口路,昌邑街,孟庄广场,丰盛街,埕口路,丹阳街,汉口路,洮南大厦,桑梓路,沾化街,山口路,沈阳街,南口广场,振兴街,通化路,福寺大厦,峄县路,寿光广场,曹县路,昌乐街,道口路,南九水街,台湛广场,东光大厦,驼峰路,太平山,标山路,云溪广场,太清路".split(",");
        int index = getRandomInt(0, road.length - 1);
        String first = road[index];
        String second = getRandomInt(11, 150) + "号";
        String third = "-" + getRandomInt(1, 20) + "-" + getRandomInt(1, 10);
        return first + second + third;
    }

    public static Object getInstance(Class<?> cls) {
        return getInstance(cls, true);
    }

    public static Object getInstance(Class<?> cls, boolean recursion) {
        boolean isGeneric = ParameterizedType.class.isAssignableFrom(cls);
        //log.info("类型名称:" + cls.getName() + "  是否是泛型:" + isGeneric);
        try {
            if (isGeneric) {//是否泛型
                Type superClassType = cls.getGenericSuperclass();
                boolean isSuperGeneric = ParameterizedType.class.isAssignableFrom(superClassType.getClass());
                //log.info("父类类型:" + superClassType.getTypeName() + "  父类是否是泛型:" + isSuperGeneric);
                Type type = ((ParameterizedType) superClassType).getActualTypeArguments()[0];
                //log.info("父类泛型的类型:" + type.getTypeName());
                Class superCls = superClassType.getClass();
                if (superCls != null) {
                    return getInstance(superCls);
                }
            } else {
                Object model = Class.forName(cls.getName()).newInstance();
                // 获取实体类的所有属性，返回Field数组
                Field[] fields = cls.getDeclaredFields();
                // 遍历所有属性
                for (Field filed : fields) {
                    // 值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查.
                    filed.setAccessible(true);
                    // 获取属性的名字
                    String name = filed.getName();
                    if (filed.getType() == String.class) {
                        setStringValue(filed, model);
                    } else if (filed.getType() == int.class || filed.getType() == Integer.class) {
                        setIntegerValue(filed, model);
                    } else if (filed.getType() == boolean.class || filed.getType() == Boolean.class) {
                        filed.set(model, false);
                    } else if (filed.getType() == Date.class) {
                        filed.set(model, LocalDateTime.now());
                    } else if (filed.getType() == float.class || filed.getType() == Float.class) {
                        if (name.toLowerCase().contains("price")) {
                            filed.set(model, RandomUtils.nextFloat(0.00f, 999.99f));
                        } else {
                            filed.set(model, RandomUtils.nextFloat(0.00f, 99999.99f));
                        }
                    } else if (filed.getType() == double.class || filed.getType() == Double.class) {
                        filed.set(model, RandomUtils.nextDouble(0.01, 99999.99));
                    } else if (filed.getType() == long.class || filed.getType() == Long.class) {
                        if (name.toLowerCase().contains("time") || name.toLowerCase().contains("date")) {
                            filed.set(model, System.currentTimeMillis());
                        } else {
                            filed.set(model, RandomUtils.nextLong(0, 99999));
                        }
                    } else if (filed.getType() == Short.class) {
                        filed.set(model, 0);
                    } else if (filed.getType() == char.class || filed.getType() == Character.class) {
                        filed.set(model, '-');
                    } else if (filed.getType() == Byte.class) {
                        filed.set(model, Byte.MAX_VALUE);
                    } else if (filed.getType() == List.class) {
                        // 如果是List类型，得到其Generic的类型
                        Type genericType = filed.getGenericType();
                        //log.info("===" + genericType.getTypeName());
                        // 如果是泛型参数的类型
                        if (genericType instanceof ParameterizedType) {
                            ParameterizedType pt = (ParameterizedType) genericType;
                            // 得到泛型里的class类型对象
                            Class<?> genericClazz = (Class<?>) pt.getActualTypeArguments()[0];
                            //log.info("list单个对象的类型：" + genericClazz.getName());
                            if (name.toLowerCase().contains("images")) {
                                List<String> list = new ArrayList<>();
                                for (int j = 0; j < getRandomInt(1, 9); j++) {
                                    list.add(getPicUrl());
                                }
                                filed.set(model, list);
                            } else {
                                //防止不断递归造成崩溃，例如子类和自己相同的类型
                                if (cls.getName().equals(genericClazz.getName())) {
                                    //log.info("类型相同，正在递归" + genericClazz.getName());
                                    if (recursion) {
                                        List<Object> list = new ArrayList<>();
                                        for (int j = 0; j < 2; j++) {
                                            Object object = getInstance(genericClazz, false);
                                            list.add(object);
                                        }
                                        filed.set(model, list);
                                    }
                                } else {
                                    int size = 2;
                                    if (name.toLowerCase().contains("list")) {
                                        size = 20;
                                    }
                                    List<Object> list = new ArrayList<>();
                                    for (int j = 0; j < size; j++) {
                                        Object object = getInstance(genericClazz);
                                        list.add(object);
                                    }
                                    filed.set(model, list);
                                }
                            }
                        } else {
                            filed.set(model, Class.forName(genericType.getTypeName()).newInstance());
                        }
                    } else {
                        Type genericType = filed.getGenericType();
                        //log.info("其它类型：" + genericType.getTypeName());
                        // 如果是泛型参数的类型
                        if (genericType instanceof ParameterizedType) {
                            ParameterizedType pt = (ParameterizedType) genericType;
                            // 得到泛型里的class类型对象
                            Class<?> genericClazz = (Class<?>) pt.getActualTypeArguments()[0];
                            //log.info("对象的类型：" + genericClazz.getName());
                            filed.set(model, getInstance(genericClazz));
                        } else {
                            //log.info("生成一个" + genericType.getTypeName() + "类型实例");
                            Object object = getInstance(filed.getType());
                            filed.set(model, object);
                        }
                    }
                }
                return model;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void setIntegerValue(Field filed, Object model) throws IllegalAccessException {
        // 获取属性的名字
        String name = filed.getName();
        if (name.toLowerCase().contains("age")) {
            filed.set(model, getRandomInt(18, 88));
        } else if (name.toLowerCase().contains("code")) {
            filed.set(model, 0);
        } else if (name.toLowerCase().contains("sex")) {
            filed.set(model, getRandomInt(1, 2));
        } else if (name.toLowerCase().contains("type")) {
            filed.set(model, getRandomInt(0, 9));
        } else if (name.toLowerCase().contains("status")) {
            filed.set(model, getRandomInt(0, 3));
        } else {
            filed.set(model, new Random().nextInt(10000) + 1);
        }
    }

    private static void setStringValue(Field filed, Object model) throws IllegalAccessException {
        // 获取属性的名字
        String name = filed.getName();
        if (name.toLowerCase().contains("title")) {
            filed.set(model, getTitle());
        } else if (name.toLowerCase().contains("avatar")) {
            filed.set(model, getAvatar());
        } else if (name.toLowerCase().contains("content")) {
            filed.set(model, "珊瑚珠 Sedum stahlii，景天科景天属多肉植物，原产地墨西哥。珊瑚珠茎细，容易徒长。叶卵形，两两交互对生，生有细毛，绿色，在光照充足和温差大的条件下，会变紫红色，或红褐色，并有些光泽，外观就像小珠子、微型的葡萄。那红彤彤、圆滚滚、油光光、肉乎乎、毛茸茸的可爱的小叶子，或许成为识别其的关键词。植株生长较为迅速，易出分枝，形成群生状。花期秋季，花梗较长，小花白色，成串开放。" + name);
        } else if (name.toLowerCase().contains("desc")) {
            filed.set(model, getDesc());
        } else if (name.toLowerCase().contains("username") || name.toLowerCase().contains("consignee")) {
            filed.set(model, getChineseName());
        } else if (name.toLowerCase().contains("nickname")) {
            filed.set(model, getNickname());
        } else if (name.toLowerCase().contains("url")) {
            filed.set(model, "https://www.baidu.com");
        } else if (name.toLowerCase().contains("image") || name.toLowerCase().contains("pic") || name.toLowerCase().contains("cover")) {
            filed.set(model, getPicUrl());
        } else if (name.toLowerCase().contains("phone")) {
            filed.set(model, getTelephone());
        } else if (name.toLowerCase().contains("msg")) {
            filed.set(model, "请求成功!");
        } else if (name.toLowerCase().contains("detail") || name.toLowerCase().contains("address")) {
            filed.set(model, getAddressDetail());
        } else if (name.toLowerCase().contains("time")) {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formatStr = formatter.format(LocalDateTime.now());
            filed.set(model, formatStr);
        } else if (name.toLowerCase().contains("id")) {
            filed.set(model, String.valueOf(RandomUtils.nextInt(0, 100000)));
        } else {
            filed.set(model, "my name is " + name);
        }
    }

    public static String getAvatar() {
        return "https://smallplants.oss-cn-hangzhou.aliyuncs.com/avatar/" + new Random().nextInt(446) + ".jpg";
    }

    private static String getTitle() {
        List<String> item = new ArrayList<>();
        item.add("每天看着这多肉，心情么么哒。多肉真的好漂亮");
        item.add("你想要的多肉，岁月都会给你，但是夏天…");
        item.add("家里养多肉植物会不会招虫子？");
        item.add("多肉植物的繁殖方法");
        item.add("浇酸水促进多肉生长");
        item.add("不太黑的灰法师");
        item.add("资深补光师告诉你多肉补光那点事");
        item.add("粉雕嫩颜，犹如黛玉惹人怜");
        item.add("用麻绳给肉肉做一个不一样的小窝");
        item.add("巧制石头花器种多肉");
        return item.get(new Random().nextInt(item.size() - 1));
    }

    public static String getSignature() {
        String mock1 = "生活的理想，就是为了理想的生活;好好扮演自己的角色，做自己该做的事;懒人图库-网页素材下载站;人生的真理，只是藏在平淡无味之中;想像力比知识更重要;每一种创伤，都是一种成熟;激情是成功的必要前提!!;记住该访住的事，忘掉该忘掉的人;越学习,就越发现自己无知;凡事皆有代价，快乐的代价便是痛苦','工作是一种乐趣','爱情, 原来是含笑饮毒酒','年轻就是无限的可能','追求自我的突破','记住该记住的 忘记该忘记的','只要开始，虽晚不迟！','有些事情本身我们无法控制，只好控制自己。',' 经验是由痛苦中粹取出来的','明天的希望，让我们忘了今天的痛苦','发光并非太阳的专利，你也可以发光','你可以用爱得到全世界，你也可以用恨失去全世界','年轻是我们唯一拥有权利去编织梦想的时光','人的价值，在遭受诱惑的一瞬间被决定','学会偷懒，并懒出境界是提高工作效率最有效的方法！',' 少一点预设的期待，那份对人的关怀会更自在','人只要不失去方向，就不会失去自己";
        List<String> items = Stream.of(mock1.split(";")).collect(Collectors.toList());
        return items.get(new Random().nextInt(items.size() - 1));
    }

    public static String getDesc() {
        List<String> item = new ArrayList<>();
        item.add("红色浆果易分支群生，易消耗老叶形成老桩，夏季闷热易落叶。春秋冬季节可充分光照，或露养，可充分浇水，盆土干透个七八分就可以浇透，忌长期淋雨，忌当头浇水，秋冬季节多光照，红色浆果会株型会更紧凑，叶型更肥厚，颜色更红嫩，如光照不足，植株容易徒长。夏季红色浆果应注意适当遮阴通风控水，闷热潮湿易掉叶。红色浆果繁殖可以枝插或者叶插。更多红色浆果的养护方式可参照其亲本之一虹之玉。");
        item.add("多肉植物的缓根是养好多肉植物的前奏，不管是网购还是实体店购买都免不了这步，网购往往是裸根发货，实体店购买虽然是带土的，但是自带土的土质往往并不怎么好，不利于多肉植物将来的生长，因此换土缓根是每个多肉爱好者的进阶课程中少不了的一步。以下浅谈四类多肉植物的缓根，一些其他品种的缓根也可参照，在缓根之前还应当注意多肉植物的移盆要点。");
        item.add("根好植物就好，这就是老手看花不看土。保持潮土也就意味这诱导根系找水，找水的过程就是发根，你看土是干的，生石花的根不一定认为是干的。不要认为土干了就去浇水，生石花在原生地是靠雾气活着的。");
        item.add("介质对播种生石花的影响：你可以播种在不同的盆里，记住1个盆中部颗粒小，一个盆中部颗粒大。小苗一脱后移盆，你会发现其中颗粒小的小苗根系，毛细根很多而主根很短；其中颗粒大的小苗根系，毛细根合适而主根很发达。这不是试验，当毛细根很多而主根很短会造成以后极易徒长，当毛细根合适而主根很发达，你会发现后期好管理，定值方便不易徒长。");
        item.add("肉锥大多是毛细根，这里用的方法与石头截然不同，都是湿土移栽不修根（不修根不代表干死的根还留着）。 不像生石花湿土移栽主根很容易烂，湿土很容易引导肉锥发根。");
        item.add("实生的仙人球都是有很粗矿的根系，这就意味这水大，土中的根系就会成为细菌的滋生地，所以仙人球缓根都是干土栽植。咱们看到认为是干土，其实土里都是有湿气的，这对于在极干旱仙人球来说已经足够了，记住放在半阴通风处。");
        item.add("在家移苗没必要修根。当你没有垫底石的时候，没有网纱的时候，你可以粗糙的卫生纸。当你变成老手接触植物多了的时候，用什么土都可能栽种生石花、景天、仙人掌！");
        item.add("栽培的介质对多肉植物的根系生长有很大的影响，简言之就是，颗粒土不利于细根的生成，长根的根系往往是主根粗壮，泥炭土利于长根，往往不需要太长时间，整个盆土已经被错综复杂的根系所环绕。");
        item.add("如果夏天实在想要露养，还是回到上面说的参考空调，对于一些夏天没有开空调习惯的地区（说明天气不会很热）、晚上睡觉不用开空调（说明昼夜温差大，晚上凉快），确实可以露养，因为高温才是多肉度夏的最大难题。具体来说就是夏季气温高温就在三十左右徘徊、会上30℃的月份就一两月，这种地区也可以考虑试试。气温是稳定33+的，30℃一上就是四五个月的，就老老实实的做点遮阴防雨准备吧。");
        item.add("我有一个花友，以前是我学生的家长，现在是我的养花师傅。“五一”假期里去看她，没遇着，正在上白天班。平时三班倒，轮到白天在家休息，就伺候她的这群欧月，那些茶花，这点多肉。");
        return item.get(new Random().nextInt(item.size() - 1));
    }

    public static String getNickname() {
        String mock1 = "问兰mio;怀玉小仙女;长利小娘子;是你的柯佳呀;一只德辉呀;是英达吖;是栾诺吖;癸卯姑娘;浩漫酱大魔王;奇文mm丶;迎梅大叔;秀洁超级甜;一条小辽源;婉君公子;嘉佑小郎君;邻家暖暖;康胜小公主;一只音华呀;一条小缤泽;妙山三岁啦;盼香少爷;雅涵酱吖;思涵少女;是你的文华呀;小向晨吖;俊晤小哥哥;正雅baby;南翠小姐姐;中震丶小可爱;一条小友灵;幻香酱吖;梦竹mm丶;芊芊公子;是洋洋吖;纳兰三岁啦;是你的怡彤呀;是凯凯吖;是你的含海呀;秀越小哥哥;曜瑞小公主;之蓉姑娘;致远大叔;邻家迎彤;一只白秋呀;向菱baby;飞白小娘子;敏达丶小可爱;小烨然吖;克平少爷;健柏mio;凝莲少女;天蓝超级甜;天恩小姐姐;建珍酱大魔王;一只又琴呀;一条小阳羽;溪澈小郎君;骏祥小仙女;欣可小姐姐;癸巳酱大魔王;是高爽吖;乙巳小哥哥;凡阳超级甜;梓美酱吖;浓绮大叔;是你的雪柏呀;是春方吖;醉芙少爷;金鑫丶小可爱;是你的冰芹呀;高潮mm丶;一只令怡呀;飞跃baby;辰阳少女;沛风mio;含秀小仙女;姣丽小娘子;欣合三岁啦;邻家承运;翰学小公主;一条小浩然;华婉小郎君;家欣姑娘;如雪公子;小夜柳吖;一只隽美呀;一条小乙亥;一只新雨呀;一条小和怡;戊戌少爷;嘉慕小哥哥;是尔晴雪凝吖;绮美超级甜;仙媛酱吖;戊寅mm丶;宛丹小娘子;一条小和暄;伶俐酱大魔王;邻家炳硕;是你的珠轩呀;夜风小仙女;是你的文雯呀;一只宏博呀;蒙蒙大叔;雨莲姑娘;建伟mio;洛妃小姐姐;静婉少女;宛筠小公主;晨钰公子;小晨璐吖;谷香baby;绿柏小郎君;悦畅三岁啦;是海山吖;秀艾丶小可爱;宇硕小仙女;邻家宏康;是你的翌喆呀;海冬小公主;开畅酱吖;三春少爷;新立大叔;馨荣超级甜;昆谊三岁啦;海伦小娘子;是涵舒吖;是你的书柔呀;碧蓉baby;一只雨旋呀;如风小哥哥;一条小志鲜;孤真mm丶;半香小姐姐;子圣酱大魔王;小博超吖;一条小麦冬;一只哲丽呀;香天姑娘;广利公子;飞飙丶小可爱;乐章小郎君;峻成少女;怀青mio;是语萍吖;嘉运少爷;新筠小姐姐;一条小育柯;康震超级甜;菁菁小娘子;若溪少女;银柳姑娘;一苗小公主;白亦小仙女;向松酱吖;淑怡小郎君;一只凌凡呀;是辰钊吖;是你的子薇呀;梧桐丶小可爱;采香mio;雅逸公子;妙音酱大魔王;芮静mm丶;文景大叔;是听芹吖;恬美三岁啦;芳馨baby;一条小明礼;天生小哥哥;小雨筠吖;一只语晨呀;是你的恩希呀;邻家婉慧;小文涛吖;丝娜丶小可爱;灵寒姑娘;慧秀小仙女;震轩大叔;如彤小郎君;倚轩小公主;是琼英吖;是你的丽苹呀;一只宛白呀;子菡酱吖;智勇三岁啦;邻家睿诚;笑寒mio;正思公子;秋白超级甜;灿灿小哥哥;安南少女;一只志行呀;宏达mm丶;是运来吖;以文小娘子;是你的彦君呀;一条小冷玉;迂菊酱大魔王;德丽小姐姐;一条小馨欣;醉卉少爷;从寒baby;一条小傲文;霞绮小仙女;白桃小郎君;红英mm丶;邻家慧颖;英杰大叔;恨云丶小可爱;痴瑶小姐姐;访彤少女;俊江酱大魔王;聪云酱吖;洁静小哥哥;斐斐姑娘;卫利公子;睿达小娘子;一只海全呀;是英勋吖;欣愉超级甜;颖馨baby;高远mio;一条小皎月;是你的阳荣呀;小慧红吖;是你的蓝尹呀;玉戈三岁啦;怀山少爷;一只玉成呀;文瑞小公主;是孟乐吖;赤奋若少爷;是兴敏吖;邻家经亘;志刚baby;一条小冰岚;如冰小姐姐;丽雅小郎君;长菁姑娘;汀兰少女;小新翰吖;一只朗然呀;沛雯超级甜;是你的鹏志呀;艳娇公子;梓淇酱吖;幻翠mio;黎昕三岁啦;涵润小哥哥;是你的子香呀;志永mm丶;诗诗小娘子;惜梦大叔;一只光泽呀;痴梦酱大魔王;昂然小公主;是越彬吖;一条小士懿;曼雁小仙女;千柳丶小可爱;惜文小郎君;昊磊小公主;是你的娅思呀;轩秀姑娘;小梦易吖;乐安大叔;是文心吖;如珍baby;一只香薇呀;邻家克培;以云少女;一条小莉娜;是你的思卉呀;一只华楚呀;崇岂三岁啦;翰林小仙女;白莲酱大魔王;梦玲小哥哥;思懿mm丶;艳梅mio;根有丶小可爱;家乐公子;忆敏小姐姐;妙春酱吖;寒海超级甜;是平宁吖;邵美少爷;南霜小娘子;一条小晨阳;思萌超级甜;诗柳小仙女;是你的综琦呀;润恺少爷;韵磬mio;晟睿小娘子;利彬三岁啦;志乐公子;昌燎baby;一条小清心;惠泽小郎君;是梦媛吖;情文丶小可爱;小明智吖;素伟酱大魔王;怡悦小公主;一只雨雁呀;一只鸿波呀;敏叡小姐姐;是你的志业呀;尔青大叔;谷青少女;盼巧姑娘;一条小旭露;叶丰酱吖;和悦小哥哥;是刚毅吖;职君mm丶;邻家怜珍;彭魄姑娘;芷芹小娘子;家豪mio;峻豪丶小可爱;如柏三岁啦;普花少女;邻家若云;尔冬酱吖;一条小泰河;三姗小公主;绮梦小哥哥;芷烟大叔;山枫baby;一只婉清呀;鸿轩少爷;冰桃小郎君;是你的振立呀;是你的易文呀;是可嘉吖;曼萍小姐姐;是鹏天吖;小晓萍吖;阏逢超级甜;冰筠mm丶;一只云霞呀;白容公子;一条小林楠;智颖酱大魔王;忻忻小仙女;一条小豫栋;嘉熙酱吖;是你的理全呀;邻家饮香;美霞姑娘;是你的依竹呀;建立mm丶;是双文吖;德庸丶小可爱;莞然小娘子;毓珂酱大魔王;一只光辉呀;语心超级甜;一只代儿呀;范明mio;小香旋吖;一条小治柯;欣然小姐姐;洪涛公子;景辉大叔;殿原三岁啦;智晖小公主;恩硕少女;笑容baby;心怡小郎君;文鑫小仙女;是洁玉吖;浩壤小哥哥;以柔少爷;癸未姑娘;是你的钧溢呀;美媛酱大魔王;凡霜大叔;萍韵小仙女;小嘉勋吖;寄柔丶小可爱;昕雨少爷;是春莉吖;永新少女;一条小春晓;邻家梓舒;怡月baby;一只长娟呀;访天小娘子;军强超级甜;泽宇三岁啦;是你的宛云呀;嘉玉公子;德鑫mm丶;一条小斯雅;己未mio;是熙研吖;淑浩小郎君;天曼小哥哥;天荣小姐姐;金胜酱吖;一只希振呀;悦轩小公主;邻家胜利;怡然大叔;耕顺公子;芬菲小郎君;亮亮小公主;丹蝶丶小可爱;新梅超级甜;一只雨辰呀;温瑜小姐姐;是雪蕊吖;新香mio;明朗小娘子;是你的凝旋呀;乐荷小仙女;剑博少女;是你的欣胜呀;一条小小美;兰梦小哥哥;绿云酱吖;俊杰mm丶;一条小迎蕾;是兴德吖;小景荣吖;骏英酱大魔王;一只颖萓呀;良平姑娘;彦慧少爷;紫雪baby;霞雰三岁啦;星菱少女;一只静静呀;邻家瑄旗;逸秀小公主;一只华芝呀;鹤骞超级甜;悦爱小郎君;晨羲三岁啦;醉竹酱大魔王;如筠少爷;是妙萍吖;小昌淼吖;柔雅小哥哥;醉波小姐姐;寻白姑娘;卓君公子;一条小若谷;令梓丶小可爱;幼珊酱吖;桂枝mio;映萱小仙女;运浩小娘子;思琪大叔;韶敏baby;是丹南吖;一条小飞宇;是你的玉才呀;是你的暄妍呀;修洁mm丶;是你的皓轩呀;宝花酱吖;是高畅吖;一只红彦呀;英奕小仙女;是你的倩丽呀;吉星小娘子;自怡小姐姐;睿思小哥哥;惜珊小郎君;小美如吖;一只柯豪呀;荣荣丶小可爱;平真少爷;以蕾baby;沛旋mio;邻家夜蓉;锦程mm丶;戊午少女;文明大叔;景铄三岁啦;一南姑娘;一条小佩珍;一条小正汉;雨鑫酱大魔王;鸿光公子;德祥小公主;是孤容吖;柯欣超级甜;香芹酱吖;印枝公子;宾实大叔;邻家叶彤;一条小柯慧;世暄姑娘;建弼超级甜;彤云酱大魔王;是你的向丝呀;雅珍mio;一条小澄邈;欣奥小姐姐;一只佳思呀;英朗小郎君;培朵小仙女;雁菡少女;是森莉吖;一只又薇呀;红叶小哥哥;英卫小娘子;庆敏baby;是玉泽吖;雨石小公主;凌珍丶小可爱;小学真吖;戊子少爷;季同三岁啦;天柔mm丶;是你的初筠呀;谧辰小姐姐;贝晨baby;子惠小郎君;一条小骊洁;婷婷超级甜;一条小丙申;邻家海霞;一只雁菱呀;夏丝mio;晨风小哥哥;是初彤吖;驰月小公主;香卉小娘子;平柔三岁啦;囡囡mm丶;宏恺大叔;小巧莲吖;是你的子实呀;永顺丶小可爱;昭昭姑娘;一只乙丑呀;路阳少女;爱宝小仙女;文杰酱大魔王;乐意公子;是你的棠华呀;访旋酱吖;是锦诗吖;艳玲少爷;康德少女;思嘉三岁啦;是你的吉帆呀;康安小仙女;夜露小公主;是你的阳冰呀;伟博公子;一只妙芙呀;正平姑娘;之卉少爷;兴龙小姐姐;初翠小哥哥;曜坤大叔;是学义吖;一条小玲玲;邻家广山;闵雨酱吖;一只涵畅呀;腾骏mm丶;昆宇酱大魔王;萧曼baby;小听露吖;一条小浩圆;俊风小郎君;是宏茂吖;壬戌丶小可爱;静白超级甜;芮波小娘子;闲静mio;癸酉酱大魔王;萱彤mm丶;一只幼萱呀;是你的亦竹呀;星辰超级甜;是迎臣吖;素霞姑娘;是你的怜珊呀;元思小姐姐;恩宇小仙女;恺乐大叔;邻家喜兰;一只语彤呀;含文三岁啦;玉芬公子;是玉怡吖;从安小公主;文仙baby;霞赩少女;秀华小哥哥;一条小俊拔;恨荷小娘子;琼华小郎君;鸣玉丶小可爱;映菱少爷;雁露酱吖;玉英mio;小光临吖;一条小秀爱;是含桃吖;鹏运三岁啦;才良小仙女;小茂才吖;向筠酱大魔王;永伟少女;初露小娘子;昭懿大叔;运虹小郎君;鸿运mio;是卓然吖;元基少爷;秀莲公子;邻家永亮;爱霖姑娘;素兰丶小可爱;小溪baby;春晖mm丶;一条小甘雨;一条小丁酉;阳平酱吖;一只佑平呀;海旺小哥哥;是你的庆军呀;是你的痴海呀;旭辉超级甜;晓娜小公主;子楠小姐姐;一只元秋呀;是晗昱吖;梓睿小公主;是你的英锐呀;舒畅mm丶;是你的乐和呀;秋巧baby;保鑫公子;祺福少女;清昶丶小可爱;姝美小哥哥;鸿吉三岁啦;邻家绍懿;涵雁酱吖;鸿骞少爷;一然mio;名轩酱大魔王;阳焱小郎君;一只会雯呀;一只俊旺呀;子萱小仙女;冰冰姑娘;小恒菽吖;秋荣小娘子;慧君小姐姐;岚彩超级甜;是忻畅吖;一条小惜云;一条小雨文;佳文大叔;一只悦人呀;若秋酱吖;一条小浩宇;一条小筠心;婉奕小哥哥;新枝丶小可爱;刚春mio;亦之小娘子;智杰三岁啦;香阳baby;小俊涵吖;雨彤小郎君;慕晴mm丶;一只翠芙呀;培霞公子;冷丝少女;之容小姐姐;是你的元桃呀;曼婉小仙女;邻家春花;怡平超级甜;是你的宛秋呀;寄芙小公主;伟彦姑娘;凝绿酱大魔王;映安大叔;是幼霜吖;寄春少爷;是新之吖;红梅小郎君;一只洪杰呀;宏春小哥哥;一条小和泽;娅廷酱大魔王;晓畅丶小可爱;琬晴baby;嘉丽小公主;怜雪小娘子;俊鑫公子;平蓝大叔;是你的云韶呀;煜喆酱吖;文阁少女;访文mio;是素欣吖;小双玉吖;是你的东硕呀;东耀mm丶;新知三岁啦;淑贞少爷;邻家小烟;博涛小仙女;春瑞超级甜;是香凡吖;明志姑娘;一条小紫琼;一只子聪呀;雨兰小姐姐;冰双少女;一条小芷卉;白瑶超级甜;文君三岁啦;邻家佩杉;慧婕丶小可爱;一只冠羽呀;红运小哥哥;毅然少爷;初柳mio;贤淑公子;是燕燕吖;永康姑娘;一只华晖呀;凌玉大叔;是你的芳妤呀;璞玉小郎君;是经赋吖;傲双baby;希慕酱大魔王;一条小友竹;紫柔小公主;寒雁小仙女;是你的梓珊呀;文敏小姐姐;维运小娘子;小振营吖;南蕾酱吖;安双mm丶;倩利少爷;凝安三岁啦;乐康少女;是你的凡桃呀;一只颖然呀;松山小哥哥;是晓枫吖;觅曼mm丶;悦喜大叔;是你的琴韵呀;吉欣酱吖;柯汝丶小可爱;芸若baby;小辰韦吖;是语冰吖;一条小新芙;邻家夏柳;星纬酱大魔王;江潜小娘子;和悦小郎君;壬寅mio;小凝姑娘;天悦超级甜;一只佼佼呀;明珠公子;易梦小仙女;听寒小姐姐;珍瑞小公主;一条小艳清;雅素mio;是嘉平吖;是你的泽睿呀;爱欢公子;小红毅吖;东江小公主;清涵酱吖;一只静慧呀;可可少女;是你的若芹呀;问雁酱大魔王;一条小保旺;一条小世昌;平春姑娘;正奇三岁啦;幻蓉baby;寄波少爷;长运mm丶;是丁未吖;雨萓小哥哥;闲丽小郎君;静竹小姐姐;昊然小仙女;邻家高寒;春香超级甜;嘉良大叔;若蕊丶小可爱;一只丁辰呀;艺硕小娘子;昆明酱吖;一只念巧呀;可心mm丶;是骊茹吖;寻文丶小可爱;是你的梓琬呀;一只涵映呀;骏喆小哥哥;乐咏公子;怡乐小姐姐;晓彤大叔;小敏三岁啦;昆纬小郎君;建杰少爷;一条小沛寒;春丝mio;乐山姑娘;可慧小仙女;嘉歆少女;小夏易吖;含真baby;是你的天慧呀;迎春酱大魔王;瑞玲小公主;亦凡小娘子;一条小香芳;邻家岚风;辛亥超级甜;是子武吖;小著雍吖;一只以寒呀;邻家富水;丹萱丶小可爱;秋春三岁啦;成济姑娘;意映小娘子;是你的小强呀;从霜小郎君;诗桃小仙女;弘懿mm丶;庚子少爷;一条小觅蓉;宏逸超级甜;培聪小哥哥;高歌酱大魔王;之蕊小姐姐;是海蓝吖;佳宁baby;一条小芸姝;俊晖mio;俊德公子;增梅酱吖;是你的瀚昂呀;绿夏少女;是文芬吖;一只黛娥呀;寻薇小公主;修伟大叔;是你的沛白呀;一条小觅山;效法少女;芷天少爷;是你的青雪呀;邻家悠逸;若雁小仙女;友翠姑娘;家淼mio;经纬小姐姐;阳文小郎君;英旭酱吖;明煦超级甜;培芳公子;一只阳德呀;一只忻愉呀;莹然小公主;和光酱大魔王;天曼子;访真君;和怡桑;文明郎;雁兰酱;一苗Sama;平凡Sama;令美殿下;红英殿下;芸静氏;萧曼Sama;长文郎;依楠桑;傲蕊殿下;自乐氏;怡硕殿下;爱华酱;寻菱Sama;篷璐子;雅昶君;礼骞子;戊戌桑;灵珊Sama;子瀚Sama;丹冬郎;岚岚殿下;乐容酱;代玉君;幻烟殿下;怀玉氏;才哲子;小枫Sama;之薇郎;玉银殿下;沛岚殿下;悦乐君;惜萱桑;熙恩Sama;叶舞氏;依山酱;慧颖氏;意远酱;诗青君;齐心子;星辰殿下;佳思Sama;恬美Sama;明钰殿下;辛巳郎;乙酉桑;永芬氏;岳阳Sama;春玲Sama;听容郎;琳瑜殿下;文超君;玉娅子;盼柳殿下;孝礼桑;碧巧酱;运芬Sama;峻豪Sama;长生殿下;牧歌郎;念真桑;景岩君;皎洁酱;翼杨氏;曲文殿下;一南子;鸿骞殿下;映柏桑;冷霜氏;忻畅殿下;一钧君;飞莲酱;涵亮子;嘉荣Sama;书云Sama;亦绿郎;玉泽桑;宏才郎;沐言Sama;运凯子;雨橙殿下;蓓蕾君;念雁氏;春胜殿下;紫容酱;霞绮Sama;天烟氏;柔淑殿下;青香君;隽雅郎;知睿桑;紫南殿下;永穗Sama;晏静酱;祺然Sama;波峻子;若薇子;阳飇氏;凝竹桑;鹏鹍君;怡瑶殿下;乐亦Sama;松民Sama;雁旋殿下;博实酱;卿硕郎;素昕郎;英媛Sama;纪阳桑;嘉祯子;玉树Sama;春晓氏;凝琴酱;寻菡殿下;碧玉殿下;语青君;依美氏;建昌君;振强殿下;寻露殿下;胤骞Sama;高逸桑;寻文郎;令枫Sama;海风酱;恨寒子;壬申子;玄素Sama;清秋殿下;喜悦氏;璇娟桑;晶霞Sama;映波郎;和韵殿下;嘉容君;腊月酱;效根Sama;毓珂君;奇文郎;文科殿下;树甜子;华婉酱;淑贞Sama;淑涵氏;小菊殿下;安邦桑;映雪郎;月天酱;钧溢殿下;雁云君;成文氏;可歆子;迎真桑;长志Sama;运洁殿下;幻露Sama;兴有酱;瑞丽君;静涵氏;青雪桑;婉柔殿下;希振郎;柔妙Sama;海荣殿下;含双Sama;采亦子;俊慧Sama;英发殿下;海白郎;浩浩氏;祺福殿下;廷花酱;小蕊子;问文君;傲桃桑;慕珊Sama;若溪Sama;兰娟氏;巧安君;安晴Sama;惠然桑;馨香酱;若雪殿下;白旋郎;泰华子;恒菽殿下;信厚Sama;佳宁氏;甲子桑;如蕾殿下;芷若郎;仲舒君;瑜璟酱;如冰子;艳艳Sama;方针殿下;静卉氏;如波Sama;颖秀桑;利叶君;伶伶子;梦媛殿下;凡灵Sama;正阳酱;胤文郎;从青殿下;尔真子;小汐殿下;飞鸾郎;和平氏;泽民Sama;彤彤桑;正利君;贞婉酱;清梅Sama;以丹殿下;婉君Sama;浩慨殿下;寻双桑;康朋郎;树鹤氏;莺语君;廷谦子;谷蕊酱;若曦Sama;庚申殿下;烨华氏;奥婷Sama;锐逸Sama;澎湃郎;香蓉君;绮丽子;嘉实殿下;雨寒殿下;浩岚桑;昆纬酱;洪涛子;平晓殿下;娟妍桑;绮之殿下;妍晨Sama;风杰郎;竹韵君;璠瑜氏;曼萱Sama;曼华酱;癸巳殿下;碧菡殿下;白山桑;焦铭子;灵曼酱;好洁郎;梓云氏;童童君;艺馨Sama;法荣Sama;梓菱君;夏波氏;以柔郎;冰双桑;乐悦Sama;笑曼酱;雅萍Sama;永山殿下;冰芹殿下;翌钊子;怡宁氏;平婉君;迎曼殿下;凯复殿下;俊捷子;明诚Sama;冷梅酱;子慧桑;弯弯Sama;沛芹郎;玲琳Sama;胜民子;胜洋氏;秋月酱;琴韵Sama;若波殿下;倚轩郎;珍珍殿下;锐翰君;冰岚桑;振凯酱;听寒殿下;庚辰Sama;碧霜氏;夏蓝君;乐怡殿下;弘致郎;丽敏桑;戊戌Sama;灵雨子;景同桑;烨伟子;馥芬Sama;兴涛氏;文滨君;思松Sama;飞翔郎;弘丽殿下;秀芳殿下;光耀酱;鹏云Sama;长逸氏;莹然殿下;纳兰桑;雅志Sama;平心郎;诺曦君;飞南殿下;阳旭子;叶春酱;运珊Sama;迂菊殿下;夏萍子;翔飞郎;梅红桑;惜雪Sama;寒梅殿下;梦玉君;红叶酱;晗雨氏;素华桑;光熙氏;癸酉殿下;嘉赫Sama;淼淼郎;梦香酱;彤蕊子;嘉纳殿下;彦森君;文彬Sama;壬午子;采萍殿下;春红君;雁岚Sama;密思氏;雨筠郎;书意酱;倩影桑;斐斐殿下;静竹Sama;素洁郎;青旋子;敏叡殿下;雁芙君;柯福桑;癸亥Sama;紫瑶氏;奇邃Sama;水秋酱;翰林殿下;子璐Sama;骊美殿下;访烟桑;一瑾郎;平蓝殿下;晴虹君;海荣Sama;青烟酱;长星子;涵桃氏;春柳子;仙仙君;嘉月酱;伊可殿下;琇晶郎;书竹Sama;海真氏;宏义桑;海东殿下;悦喜Sama;问绿君;之卉氏;晴美子;长莹殿下;利强殿下;癸未酱;松峰桑;彭祖Sama;明朗郎;继勇Sama;以莲子;昆纶Sama;欣可桑;经纶Sama;晓凡酱;香旋君;夏兰郎;承宣氏;文姝殿下;艳鑫殿下;曼妮郎;千萱子;丹兰桑;秋之Sama;建枝Sama;绿雪殿下;巧云氏;高杰君;秋阳殿下;妙丹酱;代卉殿下;怡和君;玉真殿下;文乐郎;高兴桑;怀双酱;雅艳氏;君昊子;叶帆Sama;胜换Sama;连荣殿下;子爱郎;恩霈氏;凯康Sama;灵松君;嘉祥酱;惜玉Sama;陶宁子;新霁殿下;素霞桑;逸春氏;睿明殿下;东硕酱;诗翠殿下;林路桑;学海郎;南瑶子;哲茂Sama;广敏Sama;树衡君;问兰君;和泽氏;以蕾Sama;泽睿殿下;听春酱;以晴郎;玉丹子;长顺桑;诗桃Sama;瑰玮殿下;继恒君;傲冬酱;晓筠Sama;尚勤殿下;蔚然子;恬欣桑;良策殿下;永红郎;薪羽氏;芷波Sama;芮欢氏;慕悦殿下;冰云殿下;克培桑;雅诗子;烨煜Sama;竹月酱;雪夏Sama;宏深君;兰芝郎;宏钦酱;烨赫桑;叶嘉君;玟玉殿下;士魁郎;驰颖子;羽霏Sama;凌晓殿下;茗雪Sama;运莱氏;俊侠君;娅欣氏;云辰Sama;香利子;小玲郎;寄柳殿下;义霞殿下;子昂Sama;安莲桑;瑞东酱;俊茂Sama;清华酱;尔蓉殿下;学明桑;翠荷Sama;新蕾子;新香殿下;念香君;卫华郎;统乐氏;屠维郎;建弼殿下;香波子;之云Sama;晓露殿下;卓君桑;熙星酱;世豪氏;月灵Sama;红会君;天巧氏;文林Sama;思茵郎;寻翠酱;松月殿下;忆琴子;培玉殿下;忆风君;夏容桑;雨萱Sama;剑博殿下;子濯殿下;明志Sama;明旭郎;半寒酱;俊名桑;冠英氏;惠忠Sama;怜南子;小夏君;良才酱;霁芸君;寻山子;致远殿下;飞航殿下;峻熙Sama;修为桑;依冬氏;沛旋Sama;云梦郎;峰军桑;宜年酱;秋花殿下;夏梦郎;醉波殿下;乙未Sama;博雅Sama;逸轩子;合瑞氏;倩云君;友容郎;静美桑;筱萌君;晨星Sama;重光酱;瑾瑜殿下;艳杰子;伊芃殿下;育柯氏;曼青Sama;孤梅殿下;秀慧Sama;凝丹桑;孤霜子;玉韵氏;如灵酱;子伯Sama;春晓郎;雅惠君;孤蝶殿下;亦巧子;胜超桑;元荷殿下;雅美酱;雨涵氏;雪冰殿下;戊辰郎;含岚Sama;冰筠Sama;雪漫君;嘉谊氏;若灵Sama;慧利殿下;洛熙殿下;梓淇郎;恒博子;翠琴Sama;浩邈酱;优乐君;艳春桑;鸿煊桑;虹雨殿下;涵容郎;南露Sama;慕梅氏;浩波君;霞英殿下;元绿酱;瑞芝子;千叶Sama;雪柳氏;志鲜君;运升殿下;夜夏子;惜筠桑;醉芙Sama;梦青Sama;小翠殿下;成化郎;白梦酱;依辰郎;白莲桑;景苑Sama;凌旋氏;溥心殿下;痴瑶子;建利君;怡君Sama;星河酱;傲柏殿下;英才氏;文漪君;琼音Sama;妙蕊殿下;又夏郎;清逸殿下;悠逸Sama;瑜然酱;海凡子;琴雪桑;雅珍郎;铁磊Sama;修竹君;和惬殿下;宏朗殿下;亚鑫Sama;娅廷桑;依凝氏;士俊子;小蕾酱;春雨郎;秀花殿下;晴文氏;东慧君;玟丽桑;癸酉Sama;修兰子;萦心殿下;水云酱;景彰Sama;之槐君;涵菡殿下;冠宇酱;慧娜氏;慕柳Sama;佳美桑;玉清子;含云郎;微兰殿下;骊艳Sama;音华郎;丽文君;清一酱;建军Sama;建中殿下;采露桑;子晋Sama;婀娜殿下;明哲子;文雯氏;乐山氏;华美子;芷琴郎;新波Sama;音仪殿下;青容Sama;友梅酱;初文桑;宝画君;高格殿下;德业殿下;傲夏郎;翠阳君;欣怡桑;问丝酱;安露子;茹雪Sama;华茂Sama;高潮殿下;传禄氏;金生桑;宝花郎;寄竹殿下;雨诺Sama;怀柔殿下;鑫玉Sama;钰欣子;爱丹氏;天骄酱;明轩君;蕴美桑;军强Sama;涵涵子;涵阳君;芳蕤殿下;娅童酱;嘉丽郎;俨雅殿下;书柔氏;温书Sama;芳春氏;谷云子;忠娟Sama;文玉郎;清俊殿下;欢欢Sama;晨轩君;俊娜桑;莞尔殿下;友翠酱;力勤殿下;善静君;暖暖氏;雪容殿下;采珊酱;思懿郎;巧兰桑;舒昕Sama;洪飞子;云碧Sama;驰文氏;雨晨子;书双君;小雪郎;寄芙Sama;癸丑Sama;若云酱;天韵殿下;菡梅殿下;波鸿桑;浩丽桑;妙山殿下;卫杰氏;思丝Sama;怜蕾Sama;饮月君;泰宁郎;己卯殿下;沛凝酱;芳苓子;柔雅君;尔柳殿下;岚翠酱;涵蓄郎;艺霖氏;芷兰Sama;奕卓桑;采南Sama;旭东殿下;忆蓝子;翠莲Sama;竞一殿下;艳花君;天罡桑;书仪子;玉宁Sama;善和殿下;秋莲郎;彩霞氏;欣彤酱;骊媛Sama;思若郎;山芙酱;珺俐君;含槐殿下;阳曜桑;锦锦子;初曼殿下;雪春Sama;德水氏;濮存酱;嘉云桑;辛丑Sama;涵韵殿下;寄文Sama;康宁郎;玉霞子;正真氏;流惠殿下;千凝君;胜利君;小强殿下;半烟桑;香莲Sama;听云Sama;问春殿下;飞昂酱;德兰子;红艳郎;山枫氏;烨霖殿下;弘益酱;梦影子;梦蕾Sama;如曼桑;安民氏;付娟君;南风殿下;小竹Sama;哲丽郎;盼芙殿下;俊誉子;皓轩桑;孤菱酱;子骞郎;德容Sama;子轩Sama;彦鸽氏;博敏君;秋双殿下;胤运君;之枫殿下;树阁桑;楚楚郎;飞燕酱;平卉殿下;方方Sama;宏伟Sama;映珍子;英奕氏;采雪子;静梅酱;惜梦殿下;谷彤君;巧绿桑;韦柔Sama;骊颖殿下;莉莉郎;承泽Sama;彦君氏;和雅殿下;梓暄Sama;安梦子;阳阳Sama;景焕殿下;丙子酱;燕婉郎;彬炳氏;文君君;山山桑;芷芹郎;君杰子;芷梦殿下;敦牂氏;燕妮Sama;家美桑;太枝酱;成弘Sama;如香殿下;逸龙君;良弼郎;映安殿下;腾骞酱;莹洁殿下;项明桑;和玉Sama;冷珍子;安兰Sama;千波氏;自香君;陶然郎;华辉Sama;忆辰君;访梅子;凝雪Sama;雯婧桑;曦哲氏;富贵殿下;乐心殿下;俊月酱;辰君桑;亚龙郎;文敏子;韵梅氏;尔蓝酱;晚竹殿下;秋芸殿下;之双Sama";
        List<String> items = Stream.of(mock1.split(";")).collect(Collectors.toList());
        items.add("美梦初醒");
        items.add("多肉管家");
        items.add("野生多肉");
        items.add("多肉夫人");
        items.add("多肉园丁");
        items.add("测试者");
        return items.get(new Random().nextInt(items.size() - 1));
    }

    public static String getPicUrl() {
        List<String> item = new ArrayList<>();
        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i1/117565627/TB2EPRnaQfb_uJkHFqDXXXVIVXa_!!0-saturn_solar.jpg_360x360Q90.jpg");
        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i1/142372463/TB2PgBfecLJ8KJjy0FnXXcFDpXa_!!142372463.jpg_360x360Q90.jpg");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i4/TB1GFaHRVXXXXX9XFXXXXXXXXXX_!!0-item_pic.jpg_360x360Q90.jpg");
        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i3/34818633/TB2QoI.fKOSBuNjy0FdXXbDnVXa_!!34818633.jpg_360x360Q90.jpg");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/12454570/TB2QahNmKGSBuNjSspbXXciipXa_!!12454570.jpg_360x360Q90.jpg");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/380011680/TB2riHhXmXlpuFjy0FeXXcJbFXa_!!380011680.jpg_360x360Q90.jpg");
        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i1/2647129024/TB264Nuhk9WBuNjSspeXXaz5VXa_!!2647129024.jpg_360x360Q90.jpg_.webp");
        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i1/1980989923/TB1EEtdjwmTBuNjy1XbXXaMrVXa_!!0-item_pic.jpg_360x360Q90.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/3298608619/TB2gNVLdv9TBuNjy1zbXXXpepXa_!!3298608619.jpg_360x360Q90.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/TB1mxTZRFXXXXbUXXXXXXXXXXXX_!!0-item_pic.jpg_500x500.jpg_.webp");

        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/59994493/TB2dua_okqvpuFjSZFhXXaOgXXa_!!59994493.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/369607341/TB2ho6whkUmBKNjSZFOXXab2XXa_!!369607341.jpg_250x250.jpg_.webp");
        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i4/3025032568/TB2uO92cOjQBKNjSZFnXXa_DpXa_!!3025032568.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i4/59994493/TB2OIHfk3vD8KJjSsplXXaIEFXa_!!59994493.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/2986651903/TB1tmpQjZnI8KJjSspeXXcwIpXa_!!0-item_pic.jpg_250x250.jpg_.webp");
        item.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i4/3208472146/TB1Sdihg29TBuNjy0FcXXbeiFXa_!!0-item_pic.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/59994493/TB2APiMXHgjyKJjy0FbXXaCtXXa_!!59994493.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i4/TB1SxMYJFXXXXbcXFXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg_.webp");
        item.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i3/12454570/TB2QahNmKGSBuNjSspbXXciipXa_!!12454570.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/2939912353/TB2gru4s7OWBuNjSsppXXXPgpXa_!!2939912353.jpg_250x250.jpg_.webp");
        item.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i1/TB197U9HFXXXXaIXXXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/2647129024/TB264Nuhk9WBuNjSspeXXaz5VXa_!!2647129024.jpg_250x250.jpg_.webp");

        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i1/142372463/TB2PgBfecLJ8KJjy0FnXXcFDpXa_!!142372463.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i4/1580333085/TB2Yu9snmtYBeNjSspaXXaOOFXa_!!1580333085.jpg_250x250.jpg_.webp");
        item.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i2/3025032568/TB27vxbkCfD8KJjSszhXXbIJFXa_!!3025032568.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/3240745768/TB29eTYeHuWBuNjSszgXXb8jVXa_!!3240745768.jpg_250x250.jpg_.webp");
        item.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i4/735747360/TB2xguotr5YBuNjSspoXXbeNFXa_!!735747360.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/12454570/TB2FPO6XStYBeNjSspaXXaOOFXa_!!12454570.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/34818633/TB2K0UttSXlpuFjy0FeXXcJbFXa_!!34818633.jpg_250x250.jpg_.webp");
        item.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i2/2115495526/TB2LPIlbiGO.eBjSZFEXXcy9VXa_!!2115495526.jpg_250x250.jpg_.webp");
        item.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i2/2939912353/TB2eYCrnpOWBuNjy0FiXXXFxVXa_!!2939912353.jpg_250x250.jpg_.webp");
        item.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/3252508962/TB1xdzpgvImBKNjSZFlXXc43FXa_!!0-item_pic.jpg_250x250.jpg_.webp");


        item.add("http://img.zcool.cn/community/0101f157f4cb9aa84a0e282be711c4.jpg");
        item.add("http://rescdn.qqmail.com/dyimg/20140318/7BC005237CD2.jpg");
        item.add("http://imgsrc.baidu.com/image/c0%3Dpixel_huitu%2C0%2C0%2C294%2C40/sign=b9aa6e0312d8bc3ed2050e8aebf3c372/c2fdfc039245d6880114699dafc27d1ed21b24f1.jpg");
        item.add("http://imgsrc.baidu.com/image/c0%3Dpixel_huitu%2C0%2C0%2C294%2C40/sign=fb3ef56cdb160924c828aa5bbd7f5096/eac4b74543a98226823fb91d8182b9014a90eb0a.jpg");
        item.add("http://imgsrc.baidu.com/image/c0%3Dpixel_huitu%2C0%2C0%2C294%2C40/sign=b8ba35cbde62853586edda61f99713aa/d009b3de9c82d158ef5516888b0a19d8bc3e4237.jpg");
        item.add("http://imgs.shougongke.com/circle/17549909/170507190025/1494154825144_1.jpg");
        item.add("http://img.zcool.cn/community/01ee3e58b97527a801219c77c7b558.jpg@900w_1l_2o_100sh.jpg");
        item.add("http://imgsrc.baidu.com/image/c0%3Dpixel_huitu%2C0%2C0%2C294%2C40/sign=17d614690733874488c8273c3877bc95/64380cd7912397dd40b6d23d5282b2b7d0a28738.jpg");
        item.add("http://img.zcool.cn/community/011a0159762023a8012193a38d7239.png@2o.jpg");
        item.add("http://www.mangowed.com/uploads/allimg/170718/1-1FGQ01325I9.jpg");
        return item.get(new Random().nextInt(item.size() - 1));
    }
}
