CREATE SEQUENCE public.manga_id_seq INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;
CREATE TABLE public.manga
(
    id     BIGINT              NOT NULL DEFAULT nextval('public.manga_id_seq'::regclass),
    title VARCHAR(256) NOT NULL,
    subtitle VARCHAR(128),
    original_title VARCHAR(128),
    manga_type_enum VARCHAR(64),
    manga_demographic_enum VARCHAR(64),
    manga_nationality_enum VARCHAR(64),
    manga_category_enum VARCHAR(64),
    manga_age_group_enum VARCHAR(64),
    manga_status_enum VARCHAR(64),

    -- Artist.class
    artist_name VARCHAR(128),

    -- Author.class
    author_name VARCHAR(128),

    -- AuditableEntity.class
    is_deleted    BOOLEAN      NOT NULL DEFAULT FALSE,
    created_at    TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    deleted_at    TIMESTAMP,
    audit_user_id BIGINT       NOT NULL,
    cannot_remove BOOLEAN      NOT NULL DEFAULT FALSE,

    CONSTRAINT manga_pkey PRIMARY KEY (id)


);

