CREATE SEQUENCE public.publisher_id_seq INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;
CREATE TABLE public.publisher
(
    id     BIGINT              NOT NULL DEFAULT nextval('public.publisher_id_seq'::regclass),
    "name" VARCHAR(128) UNIQUE NOT NULL,
    CONSTRAINT publisher_pkey PRIMARY KEY (id)
);

INSERT INTO public.publisher (id, "name") VALUES (1, 'JBC');
INSERT INTO public.publisher (id, "name") VALUES (2, 'Panini');
INSERT INTO public.publisher (id, "name") VALUES (3, 'New Pop');
INSERT INTO public.publisher (id, "name") VALUES (4, 'Conrad');
INSERT INTO public.publisher (id, "name") VALUES (5, 'Alto Astral');
INSERT INTO public.publisher (id, "name") VALUES (6, 'Europa');
INSERT INTO public.publisher (id, "name") VALUES (7, 'Darkside Books');
INSERT INTO public.publisher (id, "name") VALUES (8, 'Pipoca & Nanquim');
INSERT INTO public.publisher (id, "name") VALUES (9, 'Devir');
INSERT INTO public.publisher (id, "name") VALUES (10, 'L&PM');
INSERT INTO public.publisher (id, "name") VALUES (11, 'Zarabatana Books');
INSERT INTO public.publisher (id, "name") VALUES (12, 'Veneta');
INSERT INTO public.publisher (id, "name") VALUES (13, 'Todavia');
INSERT INTO public.publisher (id, "name") VALUES (14, 'Abril');
INSERT INTO public.publisher (id, "name") VALUES (15, 'Nova Sampa');
INSERT INTO public.publisher (id, "name") VALUES (16, 'Satry');
INSERT INTO public.publisher (id, "name") VALUES (17, 'Online');
INSERT INTO public.publisher (id, "name") VALUES (18, 'Draco');
INSERT INTO public.publisher (id, "name") VALUES (19, 'Mythos');
INSERT INTO public.publisher (id, "name") VALUES (20, 'Jambô');
INSERT INTO public.publisher (id, "name") VALUES (21, 'Globo');
INSERT INTO public.publisher (id, "name") VALUES (22, 'Opera Gráphica');
INSERT INTO public.publisher (id, "name") VALUES (23, 'Agir');
INSERT INTO public.publisher (id, "name") VALUES (24, 'Verus');
INSERT INTO public.publisher (id, "name") VALUES (25, 'Case Editorial');
INSERT INTO public.publisher (id, "name") VALUES (26, 'Vox Editora');
INSERT INTO public.publisher (id, "name") VALUES (27, 'Seguinte');
INSERT INTO public.publisher (id, "name") VALUES (28, 'HQM');
INSERT INTO public.publisher (id, "name") VALUES (29, 'MPEG');
INSERT INTO public.publisher (id, "name") VALUES (30, 'Savana Editora');
INSERT INTO public.publisher (id, "name") VALUES (31, 'Avec');
INSERT INTO public.publisher (id, "name") VALUES (32, 'Mureta Comicz');
INSERT INTO public.publisher (id, "name") VALUES (33, 'Alt');

