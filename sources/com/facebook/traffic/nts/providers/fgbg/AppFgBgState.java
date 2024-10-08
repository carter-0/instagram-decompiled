package com.facebook.traffic.nts.providers.fgbg;

import X.AnonymousClass7TF;
import X.DbW;
import X.JTR;

public final class AppFgBgState {
    public static final int Background = 2;
    public static final int Foreground = 1;
    public static final AppFgBgState INSTANCE = new Object();
    public static final int Unknown = 0;

    public final String getName(int i) {
        if (i == 0) {
            return "Unknown";
        }
        if (i == 1) {
            return "Foreground";
        }
        if (i == 2) {
            return "Background";
        }
        throw DbW.A0a("Invalid value: ", i);
    }

    public final int fromName(String str) {
        int A0F = JTR.A0F(str);
        if (A0F != -317045405) {
            if (A0F != 661270862) {
                if (A0F == 1379812394 && str.equals("Unknown")) {
                    return 0;
                }
            } else if (str.equals("Background")) {
                return 2;
            }
        } else if (str.equals("Foreground")) {
            return 1;
        }
        throw AnonymousClass7TF.A0W("Invalid value: ", str);
    }
}
