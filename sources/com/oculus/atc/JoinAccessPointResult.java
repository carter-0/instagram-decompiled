package com.oculus.atc;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;

public final class JoinAccessPointResult extends R5b implements C13662TeT {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final JoinAccessPointResult DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PORT_NUMBER_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    public C13982TnY addresses_ = R33.A02;
    public int portNumber_;
    public int status_;

    static {
        JoinAccessPointResult joinAccessPointResult = new JoinAccessPointResult();
        DEFAULT_INSTANCE = joinAccessPointResult;
        R5b.A0B(joinAccessPointResult, JoinAccessPointResult.class);
    }
}
