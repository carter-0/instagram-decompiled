package com.oculus.atc;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;

public final class SoftApNetworkInfo extends R5b implements C13662TeT {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final int CHANNEL_FIELD_NUMBER = 5;
    public static final int CREDENTIALS_FIELD_NUMBER = 3;
    public static final SoftApNetworkInfo DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PORT_NUMBER_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    public C13982TnY addresses_ = R33.A02;
    public int channel_;
    public SoftApCredentials credentials_;
    public int portNumber_;
    public int status_;

    static {
        SoftApNetworkInfo softApNetworkInfo = new SoftApNetworkInfo();
        DEFAULT_INSTANCE = softApNetworkInfo;
        R5b.A0B(softApNetworkInfo, SoftApNetworkInfo.class);
    }
}
