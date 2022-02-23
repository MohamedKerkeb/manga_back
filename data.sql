INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');


insert into avatar(id_avatar,link ) values (1, 'https://robohash.org/totamminimareprehenderit.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (2, 'https://robohash.org/undeenimsint.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (3, 'https://robohash.org/facerenihilrepellat.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (4, 'https://robohash.org/idcumquererum.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (5, 'https://robohash.org/estvelitet.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (6, 'https://robohash.org/illoameteum.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (7, 'https://robohash.org/sedeiusquaerat.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (8, 'https://robohash.org/etexplicaboquisquam.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (9, 'https://robohash.org/quamrepellendusperferendis.png?size=75x75&set=set1');
insert into avatar(id_avatar,link ) values (10, 'https://robohash.org/eaeosquisquam.png?size=75x75&set=set1');

insert into users (id,username, email, password, avatar_id, date_of_birth ) values (1, 'wolfy01','wburns0@vistaprint.com', '9dxK08', 1, '1982/11/13');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (2, 'daron25','dobradain1@usnews.com', 'ytrz5bw', 2, '2015/07/25');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (3, 'kevina35', 'kallnutt2@tinyurl.com', 'wVou2iLP', 3, '2004/04/25');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (4, 'spence15','ssieb3@xrea.com', 'e3CpKoWPnhM', 4, '2000/06/10');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (5, 'emelen78','etowe4@cargocollective.com', 'xWDCEO', 5, '2001/06/27');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (6, 'feder32', 'fgrinval5@cbsnews.com', 'UiY99gpeP', 6, '2019/07/05');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (7, 'mik18', 'mcaret6@sciencedaily.com', 'VqHYvWujmy', 7, '1994/04/10');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (8, 'ricky43', 'rbriand7@msu.edu', 'WwSuTjN9', 8, '2007/06/25');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (9, 'sara12', 'slidstone8@slideshare.net', 'uwBBRT9LK4C', 9, '1995/02/04');
insert into users (id,username, email, password, avatar_id, date_of_birth ) values (10, 'lud79', 'lchucks9@npr.org', '2LPad7BNmD', 10, '1980/10/13');

-- Author --
insert into author(id,first_name, last_name) values (1,'ENDO','Tatsuya');
insert into author(id,first_name, last_name) values (2,'AKUTAMI','Gege');
insert into author(id,first_name, last_name) values (3,'MATSUMOTO','Naoya');
insert into author(id,first_name, last_name) values (4,'CHUCONG','');
insert into author(id,first_name, last_name) values (5,'KÔMOTO','Hajime');
insert into author(id,first_name, last_name) values (6,'ARAKAWA','Hiromu');
--Editor--
insert into editor(id,link, name) values (1,'https://www.kurokawa.fr/', 'Kurokawa');
insert into editor(id,link, name) values (2,'http://www.ki-oon.com/', 'Ki-oon');
insert into editor(id,link, name) values (3,'http://manga.kaze.fr/', 'Kaze Manga');
insert into editor(id,link, name) values (4,'https://www.editions-delcourt.fr/kbooks/liste-kbooks', 'Kbooks');

-- Manga --
insert into manga (manga_id, title, title_original, cover, synopsis, year, author_id, editor_id)
values
    (1,'SPY X FAMILY','SPY X FAMILY','','Twilight, le plus grand espion du monde, doit pour sa nouvelle mission créer une famille de toutes pièces afin de pouvoir s’introduire dans la plus prestigieuse école de l’aristocratie. Totalement dépourvu d’expérience en matière de famille, il va adopter une petite fille en ignorant qu’elle est télépathe, et s’associer à une jeune femme timide sans se douter qu’elle est une redoutable tueuse à gages. Cette famille atypique va devoir composer pour passer inaperçue, tout en découvrant les vraies valeurs d’une famille unie et aimante.','2005', 1, 1);
insert into manga (manga_id,title, title_original, cover, synopsis, year, author_id, editor_id)
values
    (2,'JUJUTSU KAISEN', ' 呪術廻戦', '', 'Chaque année au Japon, on recense plus de 10 000 morts inexpliquées et portés disparus. Dans la majorité des cas, ce sont les sentiments négatifs des êtres humains qui sont en cause. Souffrance, regrets, humiliation : leur accumulation dans un même endroit provoque des malédictions souvent fatales… C’est ce que va découvrir à ses dépens Yuji Itadori, lycéen et membre du club de spiritisme. Il ne croit pas aux fantômes, mais sa force physique hors du commun est un précieux atout pour les missions du groupe… jusqu’à ce que l’une d’elles tourne mal. La relique qu’ils dénichent, le doigt sectionné d’une créature millénaire, attire les monstres ! Le jeune homme n’hésite pas une seconde : il avale la relique pour conjurer le mauvais sort ! Le voilà possédé par Ryomen Sukuna, le célèbre démon à deux visages. Contre toute attente, Yuji réussit à reprendre le contrôle de son corps. C’est du jamais vu ! Malgré tout, il est condamné à mort par l’organisation des exorcistes… Une sentence qui ne pourra être repoussée qu’à une seule condition : trouver et ingérer tous les doigts de Sukuna afin d’éliminer la menace une fois pour toutes. Et pour ça, l’adolescent va devoir s’initier à l’art occulte et mystérieux de l’exorcisme !', '2020',2,2);
insert into manga (manga_id,title, title_original, cover, synopsis, year, author_id, editor_id)
values
    (3,'KAIJU N°8', '怪獣 8 号', '' , 'Les kaiju sont d’effroyables monstres géants qui surgissent de nulle part pour attaquer la population. Au Japon, ces apparitions font désormais partie du quotidien.Enfant, Kafka Hibino rêvait d’intégrer les Forces de Défense pour combattre ces terribles ennemis, mais après de nombreux échecs à l’examen d’entrée, ce trentenaire travaille à nettoyer les rues de leurs encombrants cadavres. Jusqu’au jour où une mystérieuse créature s’introduit dans son organisme et le métamorphose en une entitée surpuissante mi-humaine, mi-kaiju. Son nouveau nom de code : “Kaiju n° 8” !', '2018',3,3);
insert into manga (manga_id,title, title_original, cover, synopsis, year, author_id, editor_id)
values
    (4,'SOLO LEVELING', '나 혼자만 레벨업','', 'D’étranges portails sont apparus aux quatre coins du monde, laissant pénétrer d’abominables monstres. Pour résister à l’envahisseur, l’humanité a constitué une armée de chasseurs intrépides qui passent les portails pour attaquer l’ennemi au cœur de ses donjons. Des combats sans merci s’y déroulent avec, à la clé, de fabuleux trésors. Jinwoo est le plus faible des chasseurs. Alors qu’il participe à un raid, il s’effondre et est laissé pour mort. Mais à son réveil à l’hôpital, il ne se sent plus le même et découvre, grâce à une interface virtuelle, qu’il devient progressivement de plus en plus fort...','2010',4,4);
insert into manga (manga_id,title, title_original, cover, synopsis, year, author_id, editor_id)
values
    (5,'MASHLE', 'マッシュル -MASHLE-','', 'Dans un monde où la magie fait loi, il était une fois Mash Burnedead ! Élevé au fin fond de la forêt, le jeune garçon partage ses journées entre séances de musculation et dégustation de choux à la crème. Mais un jour, un agent de police découvre son secret : il est né sans pouvoirs magiques, ce qui est puni de mort ! Pour survivre, il va devoir postuler à Easton, une prestigieuse académie de magie, et en devenir le meilleur élève... La magie n’a plus qu’à bien se tenir : avec sa musculature affûtée et sa force hors du commun, Mash compte bien pulvériser tous les sorts et briser les codes de cette société !', '2015', 5,3);
insert into manga (manga_id,title, title_original, cover, synopsis, year, author_id, editor_id)
values
    (6,'FULLMETAL ALCHEMIST', '鋼の錬金術師','', 'À Amestris, un immense pays, l armée tient une place très importante puisque son dirigeant, King Bradley, est également le président du pays. Cette armée est soutenue par des alchimistes, les Alchimistes d État dont le plus jeune, Edward Elric, a pour spécialité le métal. On le surnomme le Fullmetal Alchemist.Edward a tout juste 15 ans, et parcourt le pays en compagnie de son frère, Alphonse, à la recherche de la Pierre Philosophale. Il a pour but de rendre son corps à son frère, car Alphonse n est qu une âme rattaché à une armure par un sceau de sang. Étant plus jeunes, ils ont essayé de redonner vie à leur mère grâce à l alchimie, mais la tentative fut un échec cuisant, et Alphonse perdit son corps.Edward garde lui aussi des séquelles de leur tentative, puisqu il a le bras droit et la jambe gauche en métal. Mais la quête des deux frères risque de les mener vers une vérité plus terrible qu ils ne l imaginaient.', '2019',6,1);


-- Tomes Spy X Family --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41wF+q63PrL.jpg',208,1,'2020-09-10',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41TI9+CXNxL.jpg',192,2,'2020-10-12',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41vxyny3e4L.jpg',208,3,'2021-02-11',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41k+IP70OeL.jpg',208,4,'2021-05-12',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51Nc668nxJS.jpg',208,5,'2021-08-19',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41aIbnOR7iS.jpg',208,6,'2021-11-10',1);
-- Tomes Jujutsu Kaisen --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://images-eu.ssl-images-amazon.com/images/I/51DwR0rk9JL.jpg',188,1,'2020-02-06',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51xFI90-WTL.jpg',188,2,'2020-02-06',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51RvknR-WbL.jpg',188,3,'2020-06-04',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/5177+xuA+JL.jpg',188,4,'2020-08-27',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51CzxPqqY6L.jpg',188,5,'2020-10-01',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/61r9HP3wFwL.jpg',188,6,'2020-12-03',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51DfUgZkb8L.jpg',188,7,'2021-02-04',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51DouizLWvL.jpg',188,8,'2021-04-01',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/514Gpdegq+L.jpg',188,9,'2021-06-03',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51x+1riW+IS.jpg',188,10,'2021-08-26',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51eginzFX5L.jpg',188,11,'2021-10-14',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51+rs1Bi+pL.jpg',188,12,'2021-12-02',2);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51iF3HlbiXL.jpg',188,13,'2022-02-03',2);
-- Tomes Kaiju n°8 --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51fhsP0qloL.jpg',192,1,'2021-10-06',3);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51tR629-mqL.jpg',192,2,'2021-12-08',3);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51pxPxOO1BL.jpg',192,3,'2022-02-02',3);
-- Tomes Solo Leveling --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/516Pvp5opAL.jpg',224,1,'2021-04-07',4);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51igunD6VmL.jpg',224,2,'2021-06-09',4);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51bHvy6hxWS.jpg',256,3,'2021-09-08',4);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/512RA-lYLiL.jpg',0,4,'2021-10-10',4);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/31F2l9M6C1L.jpg',256,5,'2022-02-09',4);
-- Tomes Mashle --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51veBYn79CL.jpg',192,1,'2021-04-07',5);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51RZG8KE5FL.jpg',192,2,'2021-04-07',5);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51nR7K3DocL.jpg',192,3,'2021-06-02',5);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51-C9l2yB1L.jpg',192,4,'2021-08-18',5);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/511WrFFlJ+L.jpg',192,5,'2021-10-20',5);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51jDF81GmXL.jpg',192,6,'2021-12-08',5);
--Tomes FullMetal Alchemist --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://images-eu.ssl-images-amazon.com/images/I/51clUnIgP8L.jpg',272,1,'2020-03-12',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://images-eu.ssl-images-amazon.com/images/I/41OOo0332aL.jpg',256,2,'2020-03-12',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/4143DQaEFbL.jpg',256,3,'2020-06-04',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51dC1czayiL.jpg',272,4,'2020-08-20',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/511V3LX7X+L.jpg',224,5,'2020-11-12',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/512pVlnQwpL.jpg',224,6,'2021-03-11',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51GEWtxAGaL.jpg',144,7,'2021-06-10',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51NJJ-AXUuS.jpg',276,8,'2020-09-09',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51LMHqg5awL.jpg',0,9,'2021-12-09',6);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41CydQ8V-iL.jpg',0,10,'2022-03-10',6);


-- Matrice insert Tome
-- insert into tome(cover,number_of_page,number,date_release,manga_id) values ();

/*
insert into user_tome(user_id, tome_id) values(1, 1);
insert into user_tome(user_id, tome_id) values(1, 2);
insert into user_tome(user_id, tome_id) values(1, 3);
insert into user_tome(user_id, tome_id) values(1, 4);
insert into user_tome(user_id, tome_id) values(1, 5);
insert into user_tome(user_id, tome_id) values(1, 6);

insert into user_tome(user_id, tome_id) values(1, 20);
insert into user_tome(user_id, tome_id) values(1, 21);
insert into user_tome(user_id, tome_id) values(1, 22);
insert into user_tome(user_id, tome_id) values(1, 34);
insert into user_tome(user_id, tome_id) values(1, 35);
insert into user_tome(user_id, tome_id) values(1, 36);
insert into user_tome(user_id, tome_id) values(1, 37);
*/


