-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp),
    ('adriana.dolinska@student.merito.pl',       'Adriana', 'USER',   current_timestamp),
    ('przemyslaw.jaciuk@student.merito.pl',       'Przemysław', 'USER',   current_timestamp),
    ('arkadiusz.gosek@student.merito.pl',       'Arkadiusz', 'USER',   current_timestamp);

insert into game_system (name, publisher, edition, is_active) values
    ('Dungeons & Dragons', 'Wizards of the Coast', '5e', true),
    ('Zew Cthulhu', 'Chaosium', '7th Edition', true),
    ('Warhammer Fantasy Roleplay', 'Cubicle 7', '4th Edition', false);

insert into game_character (name, character_level, status, created_date, max_hit_points, current_hit_points, experience_points, game_system_id, user_account_id) values
    ('A', 21, 'ACTIVE', '2026-10-01', 69, 42, 6500,1,1),
    ('B', 3, 'DRAFT', '2026-10-15', 30, 30, 900,1,2),
    ('C', 7, 'ARCHIVED', '2026-09-10', 60, 0, 85000,2,null);

insert into game_item (item_name, weight, cost, is_magical) values
    ('Miecz', 3.50, 15.00, false),
    ('Mikstura lecznicza', 0.50, 50.00, true),
    ('Plecak', 0.02, 1.00, false);

insert into skill (skill_name, description, is_magical, base_value, game_system_id) values
    ('Miecze jednoręczne', 'Biegłość w walce bronią sieczną', false, 40,1),
    ('Rzucanie czarów', 'Zdolność kanalizowania magii', true, 10,1),
    ('Skradanie się', 'Ciche poruszanie w cieniu', false, 25,2);

insert into character_item (character_id, item_id, quantity, is_equipped) values
    (1, 1, 1, true),
    (1, 2, 3, false),
    (2, 3, 50, true);
-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);
