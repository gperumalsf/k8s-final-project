CREATE TABLE public.logs (
    
    timestmp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    eventType VARCHAR(255),
    logMsg VARCHAR(255)
);
