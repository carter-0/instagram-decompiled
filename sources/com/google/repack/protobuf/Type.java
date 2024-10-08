package com.google.repack.protobuf;

import X.C13494TbL;
import X.C13663TeU;
import X.C13983TnZ;
import X.R5n;
import X.R5p;
import X.T5R;

public final class Type extends R5n implements C13663TeU {
    public static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static volatile C13494TbL PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    public C13983TnZ fields_;
    public String name_ = "";
    public C13983TnZ oneofs_;
    public C13983TnZ options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        T5R.A03(Type.class, type);
    }

    public Type() {
        R5p r5p = R5p.A02;
        this.fields_ = r5p;
        this.oneofs_ = r5p;
        this.options_ = r5p;
    }
}
