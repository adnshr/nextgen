LOAD DATA INFILE 'H://caTissue//work//workspace//catissuecoreNew/SQL/DBUpgrade/Common/CAModelCSVs/DYEXTN_TEXTFIELD.csv' 
APPEND 
INTO TABLE DYEXTN_TEXTFIELD 
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"'
(IDENTIFIER NULLIF IDENTIFIER='\\N',NO_OF_COLUMNS NULLIF NO_OF_COLUMNS='\\N',IS_PASSWORD NULLIF IS_PASSWORD='\\N',IS_URL NULLIF IS_URL='\\N')