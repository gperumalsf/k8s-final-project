CREATE TABLE public.Messages (
    id SERIAL,
    timestmp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    userName VARCHAR(255),
    msg VARCHAR(255)
);
CREATE SEQUENCE hibernate_sequence START 1;