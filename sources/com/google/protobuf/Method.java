package com.google.protobuf;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;

public final class Method extends R5b implements C13662TeT {
    public static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    public static volatile C74232PrL PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public String name_ = "";
    public C13982TnY options_ = R33.A02;
    public boolean requestStreaming_;
    public String requestTypeUrl_ = "";
    public boolean responseStreaming_;
    public String responseTypeUrl_ = "";
    public int syntax_;

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        R5b.A0B(method, Method.class);
    }
}
