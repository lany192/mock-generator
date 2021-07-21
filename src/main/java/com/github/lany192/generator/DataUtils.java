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
