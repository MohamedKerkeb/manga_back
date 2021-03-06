
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

insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (1, 'wolfy01' ,'Wolfy', 'Burns', 'wburns0@vistaprint.com', '9dxK08', 1, '1982/11/13');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (2, 'daron25' ,'Daron', 'O''Bradain', 'dobradain1@usnews.com', 'ytrz5bw', 2, '2015/07/25');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (3, 'kevina35' ,'Kevina', 'Allnutt', 'kallnutt2@tinyurl.com', 'wVou2iLP', 3, '2004/04/25');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (4, 'spence15' ,'Spence', 'Sieb', 'ssieb3@xrea.com', 'e3CpKoWPnhM', 4, '2000/06/10');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (5, 'emelen78' ,'Emelen', 'Towe', 'etowe4@cargocollective.com', 'xWDCEO', 5, '2001/06/27');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (6, 'feder32' ,'Federica', 'Grinval', 'fgrinval5@cbsnews.com', 'UiY99gpeP', 6, '2019/07/05');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (7, 'mik18' ,'Mikael', 'Caret', 'mcaret6@sciencedaily.com', 'VqHYvWujmy', 7, '1994/04/10');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (8, 'ricky43' ,'Ricky', 'Briand', 'rbriand7@msu.edu', 'WwSuTjN9', 8, '2007/06/25');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (9, 'sara12' ,'Sarajane', 'Lidstone', 'slidstone8@slideshare.net', 'uwBBRT9LK4C', 9, '1995/02/04');
insert into client (client_id,username, first_name, last_name, email, password, avatar_id, date_of_birth ) values (10 'lud79',, 'Ludvig', 'Chucks', 'lchucks9@npr.org', '2LPad7BNmD', 10, '1980/10/13');

-- Author --
insert into author(first_name, last_name) values ('ENDO','Tatsuya');
insert into author(first_name, last_name) values ('AKUTAMI','Gege');
insert into author(first_name, last_name) values ('MATSUMOTO','Naoya');
insert into author(first_name, last_name) values ('CHUCONG','');
insert into author(first_name, last_name) values ('K??MOTO','Hajime');
insert into author(first_name, last_name) values ('ARAKAWA','Hiromu');
--Editor--
insert into editor(link, name) values ('https://www.kurokawa.fr/', 'Kurokawa');
insert into editor(link, name) values ('http://www.ki-oon.com/', 'Ki-oon');
insert into editor(link, name) values ('http://manga.kaze.fr/', 'Kaze Manga');
insert into editor(link, name) values ('https://www.editions-delcourt.fr/kbooks/liste-kbooks', 'Kbooks');

-- Manga --
insert into manga (title, title_original, cover, synopsis, release_date, author_id, editor_id)
values
    ('SPY X FAMILY','SPY X FAMILY','','Twilight, le plus grand espion du monde, doit pour sa nouvelle mission cr??er une famille de toutes pi??ces afin de pouvoir s???introduire dans la plus prestigieuse ??cole de l???aristocratie. Totalement d??pourvu d???exp??rience en mati??re de famille, il va adopter une petite fille en ignorant qu???elle est t??l??pathe, et s???associer ?? une jeune femme timide sans se douter qu???elle est une redoutable tueuse ?? gages. Cette famille atypique va devoir composer pour passer inaper??ue, tout en d??couvrant les vraies valeurs d???une famille unie et aimante.','2020-09-10', 1, 1);
insert into manga (title, title_original, cover, synopsis, release_date, author_id, editor_id)
values
    ('JUJUTSU KAISEN', ' ????????????', '', 'Chaque ann??e au Japon, on recense plus de 10 000 morts inexpliqu??es et port??s disparus. Dans la majorit?? des cas, ce sont les sentiments n??gatifs des ??tres humains qui sont en cause. Souffrance, regrets, humiliation : leur accumulation dans un m??me endroit provoque des mal??dictions souvent fatales??? C???est ce que va d??couvrir ?? ses d??pens Yuji Itadori, lyc??en et membre du club de spiritisme. Il ne croit pas aux fant??mes, mais sa force physique hors du commun est un pr??cieux atout pour les missions du groupe??? jusqu????? ce que l???une d???elles tourne mal. La relique qu???ils d??nichent, le doigt sectionn?? d???une cr??ature mill??naire, attire les monstres ! Le jeune homme n???h??site pas une seconde : il avale la relique pour conjurer le mauvais sort ! Le voil?? poss??d?? par Ryomen Sukuna, le c??l??bre d??mon ?? deux visages. Contre toute attente, Yuji r??ussit ?? reprendre le contr??le de son corps. C???est du jamais vu ! Malgr?? tout, il est condamn?? ?? mort par l???organisation des exorcistes??? Une sentence qui ne pourra ??tre repouss??e qu????? une seule condition : trouver et ing??rer tous les doigts de Sukuna afin d?????liminer la menace une fois pour toutes. Et pour ??a, l???adolescent va devoir s???initier ?? l???art occulte et myst??rieux de l???exorcisme !', '2020-02-06',2,2);
insert into manga (title, title_original, cover, synopsis, release_date, author_id, editor_id)
values
    ('KAIJU N??8', '?????? 8 ???', '' , 'Les kaiju sont d???effroyables monstres g??ants qui surgissent de nulle part pour attaquer la population. Au Japon, ces apparitions font d??sormais partie du quotidien.Enfant, Kafka Hibino r??vait d???int??grer les Forces de D??fense pour combattre ces terribles ennemis, mais apr??s de nombreux ??checs ?? l???examen d???entr??e, ce trentenaire travaille ?? nettoyer les rues de leurs encombrants cadavres. Jusqu???au jour o?? une myst??rieuse cr??ature s???introduit dans son organisme et le m??tamorphose en une entit??e surpuissante mi-humaine, mi-kaiju. Son nouveau nom de code : ???Kaiju n?? 8??? !', '2020-10-06',3,3);
insert into manga (title, title_original, cover, synopsis, release_date, author_id, editor_id)
values
    ('SOLO LEVELING', '??? ????????? ?????????', 'D?????tranges portails sont apparus aux quatre coins du monde, laissant p??n??trer d???abominables monstres. Pour r??sister ?? l???envahisseur, l???humanit?? a constitu?? une arm??e de chasseurs intr??pides qui passent les portails pour attaquer l???ennemi au c??ur de ses donjons. Des combats sans merci s???y d??roulent avec, ?? la cl??, de fabuleux tr??sors. Jinwoo est le plus faible des chasseurs. Alors qu???il participe ?? un raid, il s???effondre et est laiss?? pour mort. Mais ?? son r??veil ?? l???h??pital, il ne se sent plus le m??me et d??couvre, gr??ce ?? une interface virtuelle, qu???il devient progressivement de plus en plus fort...','2021-04-07',4,4);
insert into manga (title, title_original, cover, synopsis, release_date, author_id, editor_id)
values
    ('MASHLE', '??????????????? -MASHLE-', 'Dans un monde o?? la magie fait loi, il ??tait une fois Mash Burnedead ! ??lev?? au fin fond de la for??t, le jeune gar??on partage ses journ??es entre s??ances de musculation et d??gustation de choux ?? la cr??me. Mais un jour, un agent de police d??couvre son secret : il est n?? sans pouvoirs magiques, ce qui est puni de mort ! Pour survivre, il va devoir postuler ?? Easton, une prestigieuse acad??mie de magie, et en devenir le meilleur ??l??ve... La magie n???a plus qu????? bien se tenir : avec sa musculature aff??t??e et sa force hors du commun, Mash compte bien pulv??riser tous les sorts et briser les codes de cette soci??t?? !', '2021-04-07', 5,3);
insert into manga (title, title_original, cover, synopsis, release_date, author_id, editor_id)
values
    ('FULLMETAL ALCHEMIST', '??????????????????', "?? Amestris, un immense pays, l'arm??e tient une place tr??s importante puisque son dirigeant, King Bradley, est ??galement le pr??sident du pays. Cette arm??e est soutenue par des alchimistes, les Alchimistes d'??tat dont le plus jeune, Edward Elric, a pour sp??cialit?? le m??tal. On le surnomme le Fullmetal Alchemist.Edward a tout juste 15 ans, et parcourt le pays en compagnie de son fr??re, Alphonse, ?? la recherche de la Pierre Philosophale. Il a pour but de rendre son corps ?? son fr??re, car Alphonse n'est qu'une ??me rattach?? ?? une armure par un sceau de sang. ??tant plus jeunes, ils ont essay?? de redonner vie ?? leur m??re gr??ce ?? l'alchimie, mais la tentative fut un ??chec cuisant, et Alphonse perdit son corps.Edward garde lui aussi des s??quelles de leur tentative, puisqu'il a le bras droit et la jambe gauche en m??tal. Mais la qu??te des deux fr??res risque de les mener vers une v??rit?? plus terrible qu'ils ne l'imaginaient.", '2020-03-12',6,1);


-- Tomes Spy X Family --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41wF+q63PrL.jpg',208,1,'2020-09-10',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41TI9+CXNxL.jpg',192,2,'2020-10-12',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41vxyny3e4L.jpg',208,1,'2021-02-11',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41k+IP70OeL.jpg',208,1,'2021-05-12',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51Nc668nxJS.jpg',208,1,'2021-08-19',1);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41aIbnOR7iS.jpg',208,1,'2021-11-10',1);
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
-- Tomes Kaiju n??8 --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51fhsP0qloL.jpg',192,1,'2021-10-06',3);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51tR629-mqL.jpg',192,2,'2021-12-08',3);
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51pxPxOO1BL.jpg',192,3,'2022-02-02',3);
-- Tomes Solo Leveling --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/516Pvp5opAL.jpg',224,1,'2021-04-07');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51igunD6VmL.jpg',224,2,'2021-06-09');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51bHvy6hxWS.jpg',256,3,'2021-09-08');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/512RA-lYLiL.jpg',,4,'2021-10-10');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/31F2l9M6C1L.jpg',256,5,'2022-02-09');
-- Tomes Mashle --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51veBYn79CL.jpg',192,1,'2021-04-07');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51RZG8KE5FL.jpg',192,2,'2021-04-07');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51nR7K3DocL.jpg',192,3,'2021-06-02');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51-C9l2yB1L.jpg',192,4,'2021-08-18');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/511WrFFlJ+L.jpg',192,5,'2021-10-20');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51jDF81GmXL.jpg',192,6,'2021-12-08');
--Tomes FullMetal Alchemist --
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://images-eu.ssl-images-amazon.com/images/I/51clUnIgP8L.jpg',272,1,'2020-03-12');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://images-eu.ssl-images-amazon.com/images/I/41OOo0332aL.jpg',256,2,'2020-03-12');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/4143DQaEFbL.jpg',256,3,'2020-06-04');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51dC1czayiL.jpg',272,4,'2020-08-20');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/511V3LX7X+L.jpg',224,5,'2020-11-12');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/512pVlnQwpL.jpg',224,6,'2021-03-11');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51GEWtxAGaL.jpg',144,7,'2021-06-10');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51NJJ-AXUuS.jpg',276,8,'2020-09-09');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/51LMHqg5awL.jpg',,9,'2021-12-09');
insert into tome(cover,number_of_page,number,date_release,manga_id) values ('https://m.media-amazon.com/images/I/41CydQ8V-iL.jpg',,10,'2022-03-10');


-- Matrice insert Tome
-- insert into tome(cover,number_of_page,number,date_release,manga_id) values ();




