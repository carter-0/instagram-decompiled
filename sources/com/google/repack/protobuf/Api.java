package com.google.repack.protobuf;

import X.C13494TbL;
import X.C13663TeU;
import X.C13983TnZ;
import X.R5n;
import X.R5p;
import X.T5R;

public final class Api extends R5n implements C13663TeU {
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile C13494TbL PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    public C13983TnZ methods_;
    public C13983TnZ mixins_;
    public String name_ = "";
    public C13983TnZ options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public String version_;

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        T5R.A03(Api.class, api);
    }

    public Api() {
        R5p r5p = R5p.A02;
        this.methods_ = r5p;
        this.options_ = r5p;
        this.version_ = "";
        this.mixins_ = r5p;
    }
}
