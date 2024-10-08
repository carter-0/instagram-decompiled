package com.google.protobuf;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;

public final class Type extends R5b implements C13662TeT {
    public static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static volatile C74232PrL PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    public C13982TnY fields_;
    public String name_ = "";
    public C13982TnY oneofs_;
    public C13982TnY options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        R5b.A0B(type, Type.class);
    }

    public Type() {
        R33 r33 = R33.A02;
        this.fields_ = r33;
        this.oneofs_ = r33;
        this.options_ = r33;
    }
}
