package com.google.repack.protobuf;

import X.C13494TbL;
import X.C13663TeU;
import X.R5n;
import X.T5R;

public final class Value extends R5n implements C13663TeU {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static volatile C13494TbL PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    public int kindCase_ = 0;
    public Object kind_;

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        T5R.A03(Value.class, value);
    }
}
