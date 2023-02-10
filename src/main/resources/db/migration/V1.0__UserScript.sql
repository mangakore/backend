CREATE SEQUENCE security.user_id_seq INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;
CREATE TABLE security.user
(
    id            BIGINT              NOT NULL DEFAULT nextval('security.user_id_seq'::regclass),
    username      VARCHAR(100) UNIQUE NOT NULL,
    email         VARCHAR(100) UNIQUE NOT NULL,
    password      VARCHAR(255)        NOT NULL,
    full_name     VARCHAR(150)        NOT NULL,

    -- AuditableEntity.class
    is_deleted    BOOLEAN             NOT NULL DEFAULT FALSE,
    created_at    TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP,
    deleted_at    TIMESTAMP,
    audit_user_id BIGINT              NOT NULL,
    cannot_remove BOOLEAN             NOT NULL DEFAULT FALSE,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);