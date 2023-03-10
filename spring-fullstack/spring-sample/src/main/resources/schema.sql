SET MODE ORACLE;

DROP TABLE IF EXISTS T_BOARD;
CREATE TABLE T_BOARD
(
    SEQ NUMBER NOT NULL,
    TTL VARCHAR2(100) NOT NULL,
    CTT VARCHAR2(4000),
    REG_DATE DATE DEFAULT SYSDATE,
    USE_YN VARCHAR2(1) DEFAULT 'Y',
    PWD VARCHAR2(100)
);
ALTER TABLE T_BOARD ADD CONSTRAINT T_BOARD_KEY PRIMARY KEY (SEQ);

DROP TABLE IF EXISTS T_BOARD_TEMP;
CREATE TABLE T_BOARD_TEMP
(
    SEQ NUMBER NOT NULL,
    SESSION_ID VARCHAR2(1000) NOT NULL,
    TTL VARCHAR2(100),
    CTT VARCHAR2(4000),
    REG_DATE DATE DEFAULT SYSDATE,
    TEMP_YN VARCHAR2(1) DEFAULT 'Y'    
);
ALTER TABLE T_BOARD_TEMP ADD CONSTRAINT T_BOARD_TEMP_KEY PRIMARY KEY (SEQ, SESSION_ID);

DROP SEQUENCE IF EXISTS T_BOARD_SEQ;
CREATE SEQUENCE T_BOARD_SEQ MINVALUE 1 MAXVALUE 999999999999 INCREMENT BY 1 START WITH 1;