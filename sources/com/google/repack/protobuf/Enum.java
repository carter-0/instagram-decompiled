package com.google.repack.protobuf;

import X.C13494TbL;
import X.C13663TeU;
import X.C13983TnZ;
import X.R5n;
import X.R5p;
import X.T5R;

public final class Enum extends R5n implements C13663TeU {
    public static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile C13494TbL PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    public C13983TnZ enumvalue_;
    public String name_ = "";
    public C13983TnZ options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Enum enumR = new Enum();
        DEFAULT_INSTANCE = enumR;
        T5R.A03(Enum.class, enumR);
    }

    public Enum() {
        R5p r5p = R5p.A02;
        this.enumvalue_ = r5p;
        this.options_ = r5p;
    }
}
