CREATE TABLE public.logs (
    
    timestmp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    eventType VARCHAR(255),
    logMsg VARCHAR(255)
);
CREATE SEQUENCE hibernate_sequence START 1;