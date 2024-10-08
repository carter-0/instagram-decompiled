package com.oculus.atc;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;
import X.TAP;

public final class JoinWifiDirectGroup extends R5b implements C13662TeT {
    public static final int BANDWIDTH_FIELD_NUMBER = 8;
    public static final int CLIENT_ADDRESSES_FIELD_NUMBER = 4;
    public static final JoinWifiDirectGroup DEFAULT_INSTANCE;
    public static final int FREQUENCY_FIELD_NUMBER = 7;
    public static final int OWNER_ADDRESS_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int PASSPHRASE_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public static final int TIMEOUT_FIELD_NUMBER = 3;
    public static final int UUID_FIELD_NUMBER = 6;
    public int bandwidth_;
    public C13982TnY clientAddresses_ = R33.A02;
    public int frequency_;
    public NetworkAddress ownerAddress_;
    public String passphrase_ = "";
    public String ssid_ = "";
    public int timeout_;
    public TAP uuid_ = TAP.A01;

    static {
        JoinWifiDirectGroup joinWifiDirectGroup = new JoinWifiDirectGroup();
        DEFAULT_INSTANCE = joinWifiDirectGroup;
        R5b.A0B(joinWifiDirectGroup, JoinWifiDirectGroup.class);
    }
}
