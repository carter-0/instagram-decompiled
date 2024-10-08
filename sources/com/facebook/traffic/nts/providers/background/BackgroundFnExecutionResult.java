package com.facebook.traffic.nts.providers.background;

import X.AnonymousClass7TF;
import X.DbW;
import X.JTR;

public final class BackgroundFnExecutionResult {
    public static final int Failed = 2;
    public static final BackgroundFnExecutionResult INSTANCE = new Object();
    public static final int NewData = 0;
    public static final int NoData = 1;

    public final String getName(int i) {
        if (i == 0) {
            return "NewData";
        }
        if (i == 1) {
            return "NoData";
        }
        if (i == 2) {
            return "Failed";
        }
        throw DbW.A0a("Invalid value: ", i);
    }

    public final int fromName(String str) {
        int A0F = JTR.A0F(str);
        if (A0F != -1957259989) {
            if (A0F != -785590966) {
                if (A0F == 2096857181 && str.equals("Failed")) {
                    return 2;
                }
            } else if (str.equals("NewData")) {
                return 0;
            }
        } else if (str.equals("NoData")) {
            return 1;
        }
        throw AnonymousClass7TF.A0W("Invalid value: ", str);
    }
}
