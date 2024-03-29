package com.github.lany192.generator;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataUtils {

    public static int getRandomInt(int start, int end) {
        return RandomUtils.nextInt(start, end);
    }

    public static String getEnglishName() {
        String mock = "Elton Job;Dylan Nixon;Fanny Parker;Byron Effie;Jesse Gold;Hannah Albert;Milo Carey;Simon Susan;Jacob Bowman;Anastasia John;Harvey Carnegie;Samantha Sandy;Justin Walkley;Eden Cook;Abel Hugh;Patrick Lawson;Hilda Boswell;Molly Sophia;Bob Austen;Noah Dryden;Norma Holt;Dwight Watt;Nicole Isaac;Sebastian Tony;Abner Lawrence;Bernice Wyat(t);Jacqueline Sinclair;Darnell I.;Afra Hamlet;Edith Swift;Everley Christ;Pandora Johnston(e);Ian Clare;Elmer Conrad;Bert Walker;Mandy ;Lisa Aled(k);Corey Rebecca;Rosemary Ezekiel;Una Henry;Olive Moulton;Martin Grey;Winifred Brown;Judy Bach;Myra Church;Woodrow Black;Bart Orlando;Beverly Bellamy;Kerwin Reed;Rose Lancelot;Dana Houston;Arlen Churchill;Madge Freeman;Bess Lewis;Rod ;Clarence Dillon;Elizabeth Eve;Elva Dierser;Marsh Pater;Yedda Barton;Bevis Grant;Cash Spencer;Kirk Aldridge;Kevin Tate;Michelle Tommy;Astrid Attlee;Quincy Haywood;Joyce Clement;Hermosa Cromwell;Marina Defoe;Raymond Yale;Nicholas Finger;Phoebe Zangwill;Ron House;Cathy Rhodes;Gabrielle May;Dawn Pollitt;Tiffany Stuart;Winni Daniell;Arno Gregory;August Saul;Douglas Croft;Joanna Macaulay;Ogden Van;Paula Mark;Armstrong Billy;York Eugene;Walker Robinson;Stacey Louisa;Tiffany Crichton;Amos Brook;Pamela Marjory;Bernard Felton;Ansel Michael;Gabriel Thackeray;Sam Terry;Mike Newton;Angela Shelley;Sandra Fox;Ralap Harriman;Frederic Gray;Prudence Wagner;Marico Gosse;Fabian Barney;Bblythe Dupont;Robin Conan;Blake Morley;Neil Belle;Crystal Margaret;May Carter;Gavin Ferdinand;Amelia Isaiah;Richard Hazlitt;Vic Laurie;Catherine Bryan;Mavis Pulitzer;Lucy Bacon;Meredith Wodehous;Victoria Rossetti;Christine Bulwer;Sarah Roosevelt;Phyllis MacPherson;Les Becky;Mirabelle Eugen;Ann Bentham;Tobey Meredith;Porter Patience;Eleanore Bird;Susanna Stephens;Flora Longfellow;Max Pepys;Chester Bloomer;Chad Rosa;Caesar DuBois;Venus Ramsden;Fitch Carl;Truda Peg;Perry Roger;Todd Agnes;Rudolf Huxley;Lionel Robert;Yvette Clark(e);Lauren Joule;Larry Pullan;Spring Pritt;Penny Bessie;Herbert Sawyer;Nick Chaucer;Lynn Garcia;Antonia Berkeley;Clark Gunter;Monroe Dunbar;Hilary Stone;Christian Abe;Ophelia Camilla;Leif Jack;Joyce Springhall;Karen Abbot(t);Troy Kell(e)y;Dennis Brewster;Basil Thomas;Stanford Cotton;Alexander IV.;Wade Jenkin(s);Virgil Arthur;Avery Motley;Alberta More;Lee Dolly;Leopold Luke;Dora Meg;Yetta Fowler;Delia Johnny;Roberta Milton;Jo Stowe;Evelyn Catharine;Leila Elizabeth;Ivan Steele;Page Elsie;Yvonne Lincoln;Ruth Mackintosh;Betty Chesterton;Myron Lou(ie);Dominic Austin;Rosalind Carroll;Randolph Zechariah;Burnell Carllyle;Harry Tobias;Eudora Cowper;Winfred Toby;Nathan Powell;Ferdinand Charley;Maxwell MacDonald;Adela Tom;Jennifer Louis;Booth Frederick;Emma Betsy;Denise Will;George Bessemer;Stephanie Congreve;Dinah Edith;Miriam Ernest;Cedric Electra;Lyndon Horatio;Esther Ruth;Jim Bowen;Xenia Charles;Myrna Ward;Daniel Raglan;James Cook(e);Stan Palmer;Tina Alcott;Gloria Dickey;Shirley Howell(s);Olivia Gill;Jo Polly;Albert Raphael;Joseph Hearst;Wallis ;Cherry Southey;Werner Kennan;Grover Haydn;Colbert O'Neil;Frances Peggy;Baron Flynn;Monica Cooper;Bonnie Kit;Eric Gilbert;Hubery II.;Augus Maltz;Willie Wollaston;Nat Anthony;Eartha Ivan;Ken Judith;Bartholomew Habakkuk;Bruno Kathleen;Olga Huggins;Broderick McDonald;Jenny Wallace;Charles Hudson;Edmund Whitehead;Cliff Symons;Abigail Richard;Levi Valentine;Zona Howard;Nancy Norris;Sally Stilwell;Zora Hodgson;Evangeline Pope;Valerie Max;Kelly Bunyan;Carter Yerkes;Rachel Jones;Bishop Dutt;Dolores Service;Blanche Becher;Penelope O'Casey;Grace Harrod;Boris Nancy;Frank Douglas(s);Clare Marner;Kelly Adelaide;Odelia Macadam;Hamiltion Lindsay;Polly Crane;Valentina Waters;Merle Beaufort;Genevieve Andrew;Jack Willard;Robert Ted;Veronica Hawthorne;Carl David;Enoch Sonmerfield;Dean Scripps;Theobald Kipling;Tabitha Collins;Audrey Fielding;Ursula Woolf;Cornelia Spender;Isidore Gresham;Nora Forster;Sandy Monroe;Mark Bernard;Carey Colclough;Fay Caroline;Cornelius Harper;Heloise Marcus;Gwendolyn Lynch;Wordsworth Lloyd;Sheila Leigh;Tab Carrie;Alma Arnold;Donald Geoffrey;Xanthe Guy;Newman Norton;Lawrence Curme;Archibald Eveline;Cheryl Juliana;Len Abraham;Don Donne;Gale Robeson;Riva Lamb;Octavia Rhys;Francis Gibbon;Mabel Tout;Natalie Morse;Berton Wilde;Ronald Lattimore;Guy Dewey;Marjorie Edmund;Burgess Burne-Jones;Linda Benson;Edgar Harrington;Ethel Armstrong;Harlan Esther;Winston Kitty;Clement Moses;Kama Horace;Miranda Whittier;Amanda Smedley;Zero Sheridan;Valentine Alice;Boyce Butler;Bard Daniel;Iris Copperfield;Laura Sam;Kay Sherwood;Yehudi Chaplin;Tracy Rudolph;Nathaniel Connie;Alan Gabriel;Otis Broad;Saxon Lew;Murphy Quiller;Jocelyn Euphemia;Gary Burns;Dominic Amelia;Gustave Benjamin;Zoe Felix;Barry Salome;Caroline Sainsbury;Belle Shakespeare;Gerald Peacock;June Theresa;Pag Bruno;Griselda Wordsworth;Maureen Jackson;Ida Commons;Chasel Philip;Darlene Gus;Channing Christopher;David Galsworthy;Nelson Betty;Vanessa Occam;Celeste Galbraith;Dick Eleanor;Wright Sophy;Deborah Dulles;Aurora Ackerman(n);Sherry Petty;Keith Bloomfield;Michaelia MacMillan;Andrea Hart;Beck Jeremy;Kim Nelson;Lindsay Doyle;Upton Lena;Colby Green;Webb Sharp;Adair Den(n)is;Ingemar Pitman;Jay Roland;Evan Priestley;Paddy Herty;Benedict Pansy;Elvira Stephen;Brian Yule;Adam Tracy;Drew Martha;Lennon Susanna;Lesley Jennings;Jamie Hobson;Chloe Evans;Bowen Bertha;Louis Doris;Bertram Eden;Curitis Wright;Lena Bauer;Noel Hoyle;Alger DeQuincey;Setlla Titus;Nelly O'Connor;Alfred Spenser;Regan Morris;Amy Malthus;Daphne Maud;Kitty Josh;John Bartlett;Egbert Sapir;Augustine Locke;Eileen Mansfield;Morton Isabel;Aubrey Edison;Jean Moore;Toby Connor;Roxanne Hardy;Wanda Joshua;Hunter Sander;Hulda Marlowe;Michell Delia;Moses Ann;Sandy Francis;Novia Harrison;Ternence George;Webster Gissing;Maxine Emmie;Emily Dick;Peter Sara(h);Kennedy Jerome;Belinda Finn;Atwood Gallacher;Rita Paul;Gustave Melville;Ives Pullman;Bing Rosalind;Oscar Emily;Giles Jeremiah;Claire Franklin;Ina Brooke;Hugo Stella;Hedda Ella;Bruce Arabella;Ella Wyld(e);Horace Hosea;Tammy Katharine;Xavier Gallup;Rachel Antoinette;Sid Stevenson;Verna Beerbohm;Elliot Margery;Candice Back;William Lowell;Martina Washington;Greg Clemens;Hogan Hopkin(s);Regina Ingersoll;Henry Gibson;Erica Christian;Helen Ford;Irene Romeo;Mary Violet;Kimberley Martin;Elsie Micah;Sidney Hal;Elma Nichol(s);Poppy Grote;Archer Hemingway;Kerr Walpole;Gill Ben;Uriah Obadiah;Muriel Aldington;Katherine Helin(a);Barret Keats;Julia Woolley;Cara Joel;Meroy Ralph;Verne Augustus;Theresa Nelly;Aldrich Smith;Annabelle Jacob;Tony Constance;Viola Lytton;Martha Walton;Mignon Buckle;Griffith Kitto;Dunn Edward;Tyler Warren;Maggie Trollpoe;Barlow Richardson;Dave Smollett;Norton Coleridge;King Henley;Maud Wesley;Wendell Jordan;Marian Camp;Spencer Mary;Tyrone Alfred;Ernest Childe;Owen Vaughan;Phil Grantham;Leonard MacAdam;Geraldine Snow;Queena Aly;Modesty Partridge;Leo Hughes;Vito Bess;Rupert Bernal;Elvis Landon;Agatha Bloor;Buck Joyce;Quinn Montgomery;Salome Irving;Cynthia Strachey;Vita Lizzie;Rory Whyet;Thomas Tomlinson;Tess Eipstein;Cyril Coverdale;Stanley Henrietta;Marvin ;Renata Adolph;Godfery Wallis;Baldwin Louise;Darcy Richards;Abraham Penn;Luther Piers;Vincent Thomson;Matthew Lucy;Merry Maggie;Mag Nell;Barton Edgeworth;Veromca Thorndike;Moore Wells;Adonis Ellen;Derrick Eva;Freda Duncan;Zebulon Mond;Anna London;Edwina Michelson;Elroy Onions;Marshall Sally;Jill Webster;Will Foster;Philip Matthew;Coral Housman;Magee Timothy;Joanne Toynbee;Sabina Patrick;Ula Wilson;Dorothy Dorothy;Ellis Chamberlain;Colin Wat;Carr Vogt;Marlon Emerson;Tracy Archibald;Moira McCarthy;Duke Hood;Julius Babbitt;Conrad Eliot;Gregary Roy;Abbott Marcellus;Blair Juliet;Marcia Child;Florence Hewlett;Lou Saxton;Natividad Birrell;Mortimer Joseph;Murray Grace;Jane Frances;Sophia Pigou;Steward Simon;Jared FitzGerald;Lynn Taylor;Ada Gracie;Hilary Christy;Rex Zephaniah;Daisy Veblen;Roderick Whitman;Hedy Baldwin;Mildred Eddie;Jessie Maria;Harriet Crofts;Gordon Joe;Alvis Mac-;Mandel Flower;Quintion Russell;Bill Bronte;Bertha Noyes;Faithe Raymond;Earl Baker;Ted Maurice;Melissa Adams;Sampson Larkin;Diana Barrie;Andy Harry;Arvin Pound;Orville Kennedy;Clyde Joan;Julian Nick;Mamie Jerry;Julie Virginia;Christ Dalton;Jeremy Dunlop;Antony Reade;Aaron Hamilton;Dale Harold;Rebecca Beck;Paul Blake;Zara Johnson;Simona Hubbard;Janice Mat(h)ilda;Boyd Hansom;Quintina Evan;Bella Darwin;Georgia Byron;Scott Wheatley;Armand Dobbin;Benjamin Moll;Doreen Christie;Antonio ;Steven Coffey;Alice Garden;Felix Wood;Camille Browne;Carol Christiana;Josephine Ricardo;Debby Fanny;Bradley Noah;Nina Saroyan;Omar Winifred;Ingram Herbert;Ford Belloc;Cleveland Bright;Andre Hodge;Chapman Morton;Beacher Swinburne;Borg Dora;Harley Raman;Odelette Bart;Sean Faraday;Virginia Clarissa;Ryan Oscar;Hayden Zacharias;Sibyl Chapman;Zachary Perkin;Harold Gard(i)ner;Warner Julian;Vicky Needham;Joshua Halifax;Christopher Acheson;Matt III.;Joy Twain;Jeffrey Jim;Bridget Young;Jonathan Dickens;Judith Bryce;Eugene Kellogg;Asa Goldsmith;Charlotte Humphr(e)y;Quentin Jessie;Alvin Wilcox;Hazel Field;Edward Doherty;Haley Rob;Zenobia Ferguson;Vera Benedict;Victor Tyler;Yale Thodore;Lester Windsor;Tim Katte;Janet Strong;Sylvia Gunther;Sebastiane Hobbes;Humphrey Leopold;Angelo Bartholomew;Barbara Bray;Isaac Minnie;Renee Jefferson;Selena Robin;Arthur Malory;Laurel Adam;Louise Bertram;Hyman Owen;Pearl Marshall;Norman Haggai;Jodie Edie;Solomon Augustine;Nydia Wild;Cecilia Ulysses;Lambert Barrett;Oswald Poe;Lucien Julia;Hiram ;Devin Peter;Joan Harte;Gene Samuel;Samuel Jean;Reg Morgan;Rock Bert;Frederica Thompson;Gemma Bell;Brandon Lily;Irma William;Jessica Scott;Yves Leighton;Leona Bradley;Nigel Oliver;Alva Sidney;Michael Jane;Darren Milne;Cora Gladstone;Lydia Tours;Alston Tennyson;Pete Addison;Ed Carmen;Blithe Pearson;Dempsey Price;Beryl Bethune;Jeff Gaskell;Montague Kent;Berg Daisy;Elijah Walter;Emmanuel Trevelyan;Kristin Jenny;Bennett Lynd;Eden Malachi;Kyle Toland;Wayne Morrison;Page ;Erin Graham;Reginald Fast;Brady Cocker;Ira Wilhelmina;Burke Harvey;Aries Maxwell;Wilbur Beard;Enid Madge;Violet Nora;Adelaide Yeates;Megan Longman;Wendy Webb;Benson ;Madeline Nehemiah;Susan Jimmy;Marguerite Bridges;Jonas Blume;Alexia Giles;Ben Marion;April Evelina;Arlene Steinbeck;Eunice Julius;Hardy Eisenhower;Bernie Robbins;Osborn Barnard;Doris Hoover;Mick Truman;Rae Davy;Elsa Katrine;Payne Dewar;Truman Buck;Rodney Bennett;Oliver Bobby;Beau Anna;Beatrice Kelsen;Baird Raleign;Walter MacArthur;Thera Leonard;Vivien Browning;Xaviera Lindberg(h);Parker Silas;Marcus Surrey;Allen Bob;Ruby Thoreau;Ulysses Lambert;Barnett Alick;Morgan Jonathan;Constance Judson;Lorraine Keynes;Andrew Dan;Sharon Anne;Edwiin Whit;Teresa Hutt;Primo Murray;Patricia Nathaniei;Phoenix Leacock;Kent Alerander;Miles Newman;Lance Senior;Susie Cecillia;Herman Bush;Lewis Boyle;Agnes Johnson;Adolph Rockefeller;Betsy Hansen;Isabel Anderson;Franklin Wheeler;Cecil Ruskin;Juliet Turner;Maria Mill;Otto Tuttle;Hobart Nahum;Ward Hume;Eve Sailsbury;Theodore Philemon;Tom Keppel;Gladys Sweet;Duncan Noel;Trista Cumberland;Glenn Clara;Letitia Antonia;Jerome Hicks;Claude ;Prima Jeames;Calvin Faulkner;Geoffrey Clapham;Lilith Rutherford;Sigrid Masefield;Nicola Elinor;Burton Frank;Lillian James;Malcolm Sassoon;Howar Warner;Gail Reynolds;Cornell Yonng;Vivian Godwin;Honey Zimmerman;Alva Rusk;Mona North;Hale Rayleign;Hugh Lyly;Kenneth Samson;Edison Bertie;Elaine Lucas;Jason Geordie;Deirdre Hill;Taylor Wilmot(t);Athena Wyclif(fe);Clara Middleton;Dana Kingsley;Sabrina Nicholas;Donahue Bill;Jerry Simpson;Suzanne Temple;Merlin Judd;Liz Cissie;Gilbert Wolf;Roy Dorothea;Ivy Lee;Maurice Jasper;Brook Adela;Ingrid Hornby;Donna Nico(l);Eli Ellis;Sara Jonah;Jenny Gunther;Xavier Becky;Perry Rob;Andy Hemingway;Valentina Curme;Lennon Jerry;Kelly Joseph;Jesse Michael;Albert Tate;Miranda Reade;Luther Donne;Samantha Thodore;Alice Minnie;Jerry Edgeworth;Teresa Twain;Zenobia Matthew;Saxon Hazlitt;Madeline Willard;Hazel ;Patrick Stone;Bill Grace;Merlin MacMillan;Joy Daisy;Vita Horace;Mandy Lizzie;Moses Rockefeller;Louise Saul;Elvira Yonng;Sidney Longman;Rex Steinbeck;Queena Alick;Jonas Bach;Candice Rose;Bblythe Eddie;Godfery More;Wade Maurice;Elroy Agnes;Beacher Lytton;Wayne Godwin;Blanche Hume;Delia Austen;Cliff Malthus;Leif Felix;Philip Gibbon;Nora Perkin;Harold Lucas";
        List<String> items = Stream.of(mock.split(";")).collect(Collectors.toList());
        return items.get(new Random().nextInt(items.size() - 1));
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



        item.add("http://i3.sinaimg.cn/gm/j/i/2009-03-04/U1850P115T41D161583F757DT20090304104221.jpg");
        item.add("http://i0.sinaimg.cn/gm/j/i/2009-03-04/U1850P115T41D161582F757DT20090304104214.jpg");
        item.add("http://i3.sinaimg.cn/gm/j/i/2009-03-04/U1850P115T41D161581F757DT20090304104210.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241321263922-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241303431U3-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241500392a8-0-lp.jpg");

        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241342462G0-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241329544146-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924132R22324-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924123F14423-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241410304b5-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241312103A2-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251K20KU2-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/21092412444M915-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241234154535-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/21092413150M515-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924141613N10-0-lp.jpg");


        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241254292S6-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924124431H33-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924124G53315-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/21092414151J457-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/21092413561151U-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/21092414445C919-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924145141M25-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924124H14K8-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241353531B2-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251KS34018-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251P24125L-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251Q45B511-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251P6151419-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251Q41W913-0-lp.jpg");


        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251K60A5I-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/02/2109251K32R933-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241315101648-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/21092414204611F-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924151240DP-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241246451363-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241250011M2-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/210924125T11R5-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241426222531-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/2109241513263511-0-lp.jpg");
        item.add("https://lmg.jj20.com/up/allimg/4k/s/01/21092413325361E-0-lp.jpg");
        return item.get(new Random().nextInt(item.size() - 1));
    }
}
