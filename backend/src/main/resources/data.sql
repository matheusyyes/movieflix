INSERT INTO tb_role(authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role(authority) VALUES ('ROLE_MEMBER');


INSERT INTO tb_user(name, email, password) VALUES ('Bob Green', 'bob@gmail.com', '$2y$12$pZyYNyvCDCjljP4U35Gj6OGL0rUYOo2IEFjMe9EpILRRqDiUZdogO');
INSERT INTO tb_user(name, email, password) VALUES ('Ana Pink', 'ana@gmail.com', '$2y$12$pZyYNyvCDCjljP4U35Gj6OGL0rUYOo2IEFjMe9EpILRRqDiUZdogO');

INSERT INTO tb_user_roles(user_id, roles_id) VALUES (1, 1);
INSERT INTO tb_user_roles(user_id, roles_id) VALUES (2, 2);

INSERT INTO tb_genre(name) VALUES ('Aventura');
INSERT INTO tb_genre(name) VALUES ('Ação');
INSERT INTO tb_genre(name) VALUES ('Terror');

INSERT INTO tb_movie(title, sub_title, ano, img_url, synopsis, genre_id) VALUES ('2012', 'A extinção', 2009, 'https://upload.wikimedia.org/wikipedia/pt/thumb/d/dd/2012_Poster.jpg/250px-2012_Poster.jpg', 'Bilhões de habitantes da Terra não estão cientes de que o planeta tem uma data de expiração. Com os avisos de um cientista norte-americano, os líderes mundiais começam os preparativos secretos para a sobrevivência de alguns membros da sociedade. Quando o cataclisma global finalmente ocorre, o fracassado escritor Jackson Curtis tenta levar sua família para um lugar seguro quando o mundo começa a desmoronar.',2);

INSERT INTO tb_review(text, movie_id, user_id) VALUES ('O filme é muito bom, com efeitos especiais fantasticos para a epoca!!', 1, 2);