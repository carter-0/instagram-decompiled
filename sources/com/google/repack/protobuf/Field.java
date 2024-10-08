package com.google.repack.protobuf;

import X.C13494TbL;
import X.C13663TeU;
import X.C13983TnZ;
import X.R5n;
import X.R5p;
import X.T5R;

public final class Field extends R5n implements C13663TeU {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    public static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    public static volatile C13494TbL PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    public int cardinality_;
    public String defaultValue_ = "";
    public String jsonName_ = "";
    public int kind_;
    public String name_ = "";
    public int number_;
    public int oneofIndex_;
    public C13983TnZ options_ = R5p.A02;
    public boolean packed_;
    public String typeUrl_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        T5R.A03(Field.class, field);
    }
}
