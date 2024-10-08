package com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.ig;

import X.002;
import X.0Tu;
import X.0qQ;
import X.1AW;
import X.1W3;
import X.AnonymousClass1UZ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C60960kU;
import android.content.Context;
import com.facebook.messaging.lockbox.LockBoxStorageManager;

public final class IGAdvancedCryptoTransportReinstallDataProviderPluginSessionless extends Sessionless {
    public final String LOCK_BOX_STORAGE_KEY = "rf";
    public final String SHARED_PREFS_FILE = "IG_REINSTALL_DATA_STORE";

    public int IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(String str, String str2) {
        AnonymousClass7TF.A1H(str, str2);
        if (!1AW.A06(0Tu.A05, 18304845672881240L)) {
            return 0;
        }
        String lockBoxGetSecret = LockBoxStorageManager.lockBoxGetSecret(str, this.LOCK_BOX_STORAGE_KEY);
        if (lockBoxGetSecret == null) {
            return 7;
        }
        Context context = C60960kU.A00;
        0qQ.A07(context);
        boolean contains = AnonymousClass1UZ.A00(context).A00(this.SHARED_PREFS_FILE).contains(002.A0R("ig.android.reinstall.flag/", str));
        if (lockBoxGetSecret.equals("t")) {
            if (contains) {
                return 6;
            }
            return 3;
        } else if (lockBoxGetSecret.equals(str2)) {
            if (contains) {
                return 4;
            }
            return 1;
        } else if (contains) {
            return 5;
        } else {
            return 2;
        }
    }

    private final String sharedPrefsKey(String str) {
        return 002.A0R("ig.android.reinstall.flag/", str);
    }

    public boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(String str, String str2) {
        boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
        if (!1AW.A06(0Tu.A05, 18304845672881240L)) {
            return true;
        }
        Context context = C60960kU.A00;
        0qQ.A07(context);
        1W3 AR0 = AnonymousClass1UZ.A00(context).A00(this.SHARED_PREFS_FILE).AR0();
        AR0.A0A(002.A0R("ig.android.reinstall.flag/", str), A1Z);
        AR0.A03();
        if (LockBoxStorageManager.lockBoxSaveSecret(str, this.LOCK_BOX_STORAGE_KEY, str2) != A1Z) {
            return false;
        }
        return true;
    }
}
