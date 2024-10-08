package com.google.protobuf;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;

public final class Api extends R5b implements C13662TeT {
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile C74232PrL PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    public C13982TnY methods_;
    public C13982TnY mixins_;
    public String name_ = "";
    public C13982TnY options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public String version_;

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        R5b.A0B(api, Api.class);
    }

    public Api() {
        R33 r33 = R33.A02;
        this.methods_ = r33;
        this.options_ = r33;
        this.version_ = "";
        this.mixins_ = r33;
    }
}
