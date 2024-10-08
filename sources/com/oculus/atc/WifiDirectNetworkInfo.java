package com.oculus.atc;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;

public final class WifiDirectNetworkInfo extends R5b implements C13662TeT {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final int CREDENTIALS_FIELD_NUMBER = 3;
    public static final WifiDirectNetworkInfo DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PORT_NUMBER_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    public C13982TnY addresses_ = R33.A02;
    public Credentials credentials_;
    public int portNumber_;
    public int status_;

    public final class Credentials extends R5b implements C13662TeT {
        public static final Credentials DEFAULT_INSTANCE;
        public static final int NETWORKNAME_FIELD_NUMBER = 1;
        public static volatile C74232PrL PARSER = null;
        public static final int PASSPHRASE_FIELD_NUMBER = 2;
        public String networkName_ = "";
        public String passphrase_ = "";

        static {
            Credentials credentials = new Credentials();
            DEFAULT_INSTANCE = credentials;
            R5b.A0B(credentials, Credentials.class);
        }
    }

    static {
        WifiDirectNetworkInfo wifiDirectNetworkInfo = new WifiDirectNetworkInfo();
        DEFAULT_INSTANCE = wifiDirectNetworkInfo;
        R5b.A0B(wifiDirectNetworkInfo, WifiDirectNetworkInfo.class);
    }
}
