package com.facebook.advancedcryptotransport;

import X.1Uk;
import X.1W3;
import X.C300165we;
import android.content.Context;

public class ACTRegistrationDeviceIdProvider {
    public static volatile 1Uk sSharedPrefs;

    public static synchronized void initialize(Context context) {
        synchronized (ACTRegistrationDeviceIdProvider.class) {
            if (sSharedPrefs == null) {
                sSharedPrefs = C300165we.A00(context);
            }
        }
    }

    public static String readRegisteredDeviceId(String str) {
        if (sSharedPrefs == null) {
            return null;
        }
        return sSharedPrefs.getString(str, (String) null);
    }

    public static void removeRegisteredDeviceId(String str) {
        if (sSharedPrefs.contains(str)) {
            1W3 AR0 = sSharedPrefs.AR0();
            AR0.A06(str);
            AR0.A03();
        }
    }

    public static void saveRegisteredDeviceId(String str, String str2) {
        1W3 AR0 = sSharedPrefs.AR0();
        AR0.A09(str, str2);
        AR0.A03();
    }
}
