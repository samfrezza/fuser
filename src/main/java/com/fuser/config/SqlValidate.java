package com.fuser.config;

import com.fuser.ValidateInstruction;

public class SqlValidate extends ValidateInstruction {

    public SqlValidate(){
        super();

        //Allows only the expressions
        validExpression("FUNCTION", "ABS", 1);
        validExpression("FUNCTION", "AVG", 1);
        validExpression("FUNCTION", "CHAR_LENGTH", 1);
        validExpression("FUNCTION", "COUNT", 1);
        validExpression("FUNCTION", "COALESCE");
        validExpression("FUNCTION", "EXISTS", 1);
        validExpression("FUNCTION", "LOWER", 1);
        validExpression("FUNCTION", "LTRIM", 1);
        validExpression("FUNCTION", "MAX", 1);
        validExpression("FUNCTION", "MIN", 1);
        validExpression("FUNCTION", "NULLIF", 2);
        validExpression("FUNCTION-POSITION", "POSITION", 2);
        validExpression("FUNCTION", "REPLACE", 3);
        validExpression("FUNCTION", "ROUND");
        validExpression("FUNCTION", "RTRIM", 1);
        validExpression("FUNCTION", "SUBSTR", 3);
        validExpression("FUNCTION", "SUM", 1);
        validExpression("FUNCTION", "TRIM", 1);
        validExpression("FUNCTION", "UPPER", 1);
        validExpression("FUNCTION", "CAST");
        validExpression("FUNCTION", "VARCHAR", 1);
        validExpression("FUNCTION", "CHAR", 1);
        validExpression("FUNCTION", "DECIMAL", 2);
        validExpression("OFFSET", "");

    }
}
