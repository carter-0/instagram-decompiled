package com.google.repack.protobuf;

import X.C13494TbL;
import X.C13663TeU;
import X.C13983TnZ;
import X.R5n;
import X.R5p;
import X.T5R;

public final class Method extends R5n implements C13663TeU {
    public static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    public static volatile C13494TbL PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public String name_ = "";
    public C13983TnZ options_ = R5p.A02;
    public boolean requestStreaming_;
    public String requestTypeUrl_ = "";
    public boolean responseStreaming_;
    public String responseTypeUrl_ = "";
    public int syntax_;

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        T5R.A03(Method.class, method);
    }
}
