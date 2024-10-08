package com.facebook.traffic.nts.providers.reachability;

import X.AnonymousClass7TF;
import X.DbW;
import X.JTR;

public final class ReachabilityProviderConnectionType {
    public static final int Cell = 2;
    public static final ReachabilityProviderConnectionType INSTANCE = new Object();
    public static final int Max = 4;
    public static final int NoConnection = 1;
    public static final int Unknown = 0;
    public static final int Wifi = 3;

    public final String getName(int i) {
        if (i == 0) {
            return "Unknown";
        }
        if (i == 1) {
            return "NoConnection";
        }
        if (i == 2) {
            return "Cell";
        }
        if (i == 3) {
            return "Wifi";
        }
        if (i == 4) {
            return "Max";
        }
        throw DbW.A0a("Invalid value: ", i);
    }

    public final int fromName(String str) {
        switch (JTR.A0F(str)) {
            case 77124:
                if (str.equals("Max")) {
                    return 4;
                }
                break;
            case 2096514:
                if (str.equals("Cell")) {
                    return 2;
                }
                break;
            case 2695989:
                if (str.equals("Wifi")) {
                    return 3;
                }
                break;
            case 803225503:
                if (str.equals("NoConnection")) {
                    return 1;
                }
                break;
            case 1379812394:
                if (str.equals("Unknown")) {
                    return 0;
                }
                break;
        }
        throw AnonymousClass7TF.A0W("Invalid value: ", str);
    }
}
