CREATE SEQUENCE public.gender_id_seq INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;
CREATE TABLE public.gender
(
    id            BIGINT              NOT NULL DEFAULT nextval('public.gender_id_seq'::regclass),
    description   VARCHAR(128) UNIQUE NOT NULL,
    CONSTRAINT gender_pkey PRIMARY KEY (id)
);

INSERT INTO public.gender (id, description) VALUES (1, 'Ação');
INSERT INTO public.gender (id, description) VALUES (2, 'Comédia');
INSERT INTO public.gender (id, description) VALUES (3, 'Escolar');
INSERT INTO public.gender (id, description) VALUES (4, 'Fantasia');
INSERT INTO public.gender (id, description) VALUES (5, 'Mecha');
INSERT INTO public.gender (id, description) VALUES (6, 'Mistério');
INSERT INTO public.gender (id, description) VALUES (7, 'Policial');
INSERT INTO public.gender (id, description) VALUES (9, 'Slice of Life');
INSERT INTO public.gender (id, description) VALUES (10, 'Terror');
INSERT INTO public.gender (id, description) VALUES (11, 'Ficção Científica');
INSERT INTO public.gender (id, description) VALUES (12, 'Drama');
INSERT INTO public.gender (id, description) VALUES (13, 'Aventura');
INSERT INTO public.gender (id, description) VALUES (14, 'Romance');
INSERT INTO public.gender (id, description) VALUES (15, 'Psicológico');
INSERT INTO public.gender (id, description) VALUES (16, 'Sobrenatural');
INSERT INTO public.gender (id, description) VALUES (17, 'Ecchi');
INSERT INTO public.gender (id, description) VALUES (18, 'Garota Mágica');
INSERT INTO public.gender (id, description) VALUES (19, 'Música');
INSERT INTO public.gender (id, description) VALUES (20, 'Hentai');
INSERT INTO public.gender (id, description) VALUES (21, 'Esporte');
INSERT INTO public.gender (id, description) VALUES (22, 'Samurai');
INSERT INTO public.gender (id, description) VALUES (23, 'Histórico');
INSERT INTO public.gender (id, description) VALUES (24, 'Militar');
INSERT INTO public.gender (id, description) VALUES (25, 'Suspense');
INSERT INTO public.gender (id, description) VALUES (26, 'SCI-FI');
INSERT INTO public.gender (id, description) VALUES (27, 'Harém');
INSERT INTO public.gender (id, description) VALUES (28, 'Video-Game');
INSERT INTO public.gender (id, description) VALUES (30, 'Isekai');
INSERT INTO public.gender (id, description) VALUES (31, 'Tormenta');
INSERT INTO public.gender (id, description) VALUES (33, 'Yuri');
INSERT INTO public.gender (id, description) VALUES (34, 'Boys Love');
INSERT INTO public.gender (id, description) VALUES (35, 'Biografia');