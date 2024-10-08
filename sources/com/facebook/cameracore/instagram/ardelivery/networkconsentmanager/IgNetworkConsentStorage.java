package com.facebook.cameracore.instagram.ardelivery.networkconsentmanager;

import X.0KC;
import X.0lm;
import X.0xY;
import X.0xa;
import X.17k;
import X.1Al;
import X.1Am;
import X.1An;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C73428PcS;
import X.C73467Pd9;
import X.DbT;
import X.DbX;
import X.TS7;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.common.util.TriState;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IgNetworkConsentStorage implements 0lm, NetworkConsentStorage {
    public static final int MAX_ENTRIES = 1000;
    public static final String TAG = "IgNetworkConsentStorage";
    public final 0xa mAccessTsPrefs;
    public final 0xa mUserConsentPrefs;

    public void onUserSessionWillEnd(boolean z) {
    }

    public static IgNetworkConsentStorage getInstance(UserSession userSession) {
        return (IgNetworkConsentStorage) userSession.A01(IgNetworkConsentStorage.class, new C73467Pd9(userSession, 0));
    }

    public static /* synthetic */ IgNetworkConsentStorage lambda$getInstance$0(UserSession userSession) {
        return new IgNetworkConsentStorage(userSession);
    }

    private void maybeTrimEntries() {
        Map all = this.mAccessTsPrefs.getAll();
        if (all.size() > 1000) {
            C73428PcS pcS = new C73428PcS((Object) this, 0);
            int size = all.size() - MAX_ENTRIES;
            17k.A0E(AnonymousClass7TF.A1R(size));
            Set<Object> emptySet = Collections.emptySet();
            TS7 ts7 = new TS7(pcS, size, TS7.initialQueueSize(-1, size, emptySet));
            for (Object offer : emptySet) {
                ts7.offer(offer);
            }
            ts7.addAll(all.entrySet());
            Iterator it = ts7.iterator();
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                0xY AR4 = this.mAccessTsPrefs.AR4();
                AR4.ED3(DbT.A13(A1J));
                AR4.apply();
                0xY AR42 = this.mUserConsentPrefs.AR4();
                AR42.ED3(DbT.A13(A1J));
                AR42.apply();
            }
        }
    }

    public void clearAllUserConsent() {
        0xY AR4 = this.mUserConsentPrefs.AR4();
        AR4.AHM();
        AR4.apply();
        0xY AR42 = this.mAccessTsPrefs.AR4();
        AR42.AHM();
        AR42.apply();
    }

    public TriState getUserConsent(String str) {
        if (!this.mUserConsentPrefs.contains(str)) {
            return TriState.UNSET;
        }
        0xY AR4 = this.mAccessTsPrefs.AR4();
        AR4.E5c(str, System.currentTimeMillis());
        AR4.apply();
        return TriState.valueOf(DbT.A1a(this.mUserConsentPrefs, str));
    }

    public IgNetworkConsentStorage(UserSession userSession) {
        1Am A01 = 1Al.A01(userSession);
        this.mUserConsentPrefs = A01.A03(1An.A2G);
        this.mAccessTsPrefs = A01.A03(1An.A2F);
    }

    public void saveUserConsent(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            0KC.A0E(TAG, "saveUserConsent() called with empty cache key!");
            return;
        }
        DbX.A1V(this.mUserConsentPrefs, str, z);
        0xY AR4 = this.mAccessTsPrefs.AR4();
        AR4.E5c(str, System.currentTimeMillis());
        AR4.apply();
        maybeTrimEntries();
    }
}
