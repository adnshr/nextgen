DECLARE
   RELATIONSHIPID NUMBER;
BEGIN
  DECLARE CURSOR c_data IS
	  SELECT RELATIONSHIP_ID FROM CATISSUE_TABLE_RELATION WHERE RELATIONSHIP_ID = 137;
BEGIN
	OPEN c_data;
  	FETCH c_data INTO RELATIONSHIPID;
	  	IF c_data%NOTFOUND THEN
	  		UPDATE CATISSUE_TABLE_RELATION SET TABLES_IN_PATH='37:72' WHERE RELATIONSHIP_ID=127;
			UPDATE CATISSUE_TABLE_RELATION SET TABLES_IN_PATH='37' WHERE RELATIONSHIP_ID=121;
			UPDATE CATISSUE_TABLE_RELATION SET TABLES_IN_PATH='37:72:71' WHERE RELATIONSHIP_ID=125;
			UPDATE CATISSUE_RELATED_TABLES_MAP SET SECOND_TABLE_ID=37 WHERE FIRST_TABLE_ID=75 AND SECOND_TABLE_ID=72;
			INSERT INTO CATISSUE_TABLE_RELATION (RELATIONSHIP_ID, PARENT_TABLE_ID, CHILD_TABLE_ID) VALUES (137,35,92);
			UPDATE CATISSUE_TABLE_RELATION SET PARENT_TABLE_ID=75, CHILD_TABLE_ID=37 WHERE RELATIONSHIP_ID=131;
			INSERT INTO CATISSUE_SEARCH_DISPLAY_DATA (RELATIONSHIP_ID, COL_ID, DISPLAY_NAME, DEFAULT_VIEW_ATTRIBUTE, ATTRIBUTE_ORDER) VALUES (131, 72 , 'Distributed Quantity', 0, 10);
			UPDATE CATISSUE_SEARCH_DISPLAY_DATA SET RELATIONSHIP_ID=137 WHERE RELATIONSHIP_ID=131 AND COL_ID=210;
			UPDATE CATISSUE_SEARCH_DISPLAY_DATA SET RELATIONSHIP_ID=137 WHERE RELATIONSHIP_ID=131 AND COL_ID=211;
			INSERT INTO CATISSUE_RELATED_TABLES_MAP VALUES ( 72 , 37 , 'IDENTIFIER','SPECIMEN_ARRAY_ID');
		END IF;
	CLOSE c_data;
	COMMIT;
END;
END;
/