package com.facebook.traffic.nts.providers.startup;

import X.0qQ;
import X.AnonymousClass7TF;
import X.DbW;

public final class StartupSignalsProviderStartupType {
    public static final int Cold = 0;
    public static final StartupSignalsProviderStartupType INSTANCE = new Object();
    public static final int Warm = 1;

    public final int fromName(String str) {
        0qQ.A0B(str, 0);
        if (str.equals("Cold")) {
            return 0;
        }
        if (str.equals("Warm")) {
            return 1;
        }
        throw AnonymousClass7TF.A0W("Invalid value: ", str);
    }

    public final String getName(int i) {
        if (i == 0) {
            return "Cold";
        }
        if (i == 1) {
            return "Warm";
        }
        throw DbW.A0a("Invalid value: ", i);
    }
}
