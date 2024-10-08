package com.instagram.debug.quickexperiment;

import X.0KC;
import X.0lg;
import X.0qQ;
import X.0tS;
import X.19j;
import X.1AA;
import X.1AU;
import X.AnonymousClass05K;
import X.AnonymousClass7TF;
import X.AnonymousClass9PN;
import X.C51968G9o;
import X.C51974G9v;
import X.C59450Ty;
import X.C69642NpP;
import X.C74478PvY;
import X.C74494Pvo;
import X.DbT;
import X.JTO;
import android.content.Context;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.troubleshooting.BisectHelperHolder;
import com.facebook.mobileconfig.troubleshooting.MobileConfigOverridesWriterHolder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;

public final class MobileConfigBisection {
    public static final String BISECT_DIR = "mobileconfig";
    public static final MobileConfigBisection INSTANCE = new Object();
    public static final String OVERRIDES_FIELD = "overrides";
    public static final String RAW_OVERRIDES_FILE_NAME = "mobileconfig/overrides_raw_response.txt";
    public static final String TAG = "MobileConfigBisection";
    public static C74478PvY bisectHelper;

    public static final void initialize(Context context, String str, 0lg r10, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        Context context2 = context;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
        C51974G9v.A1O(context, str, r10, lightweightQuickPerformanceLogger);
        C69642NpP.A01 = 19j.A00(context2, lightweightQuickPerformanceLogger2, r10, (1AU) null, str, AnonymousClass9PN.A02(0, 9, 61), (String) null, 2, false, false);
        1AU r1 = C69642NpP.A01;
        0qQ.A07(r1);
        INSTANCE.createAndSetBisectHelper(r1, context2);
    }

    public static final boolean startBisect(Context context, String str, 0lg r15, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        Context context2 = context;
        boolean A1U = AnonymousClass7TF.A1U(0, context, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
        AnonymousClass7TF.A1C(r15, 2, lightweightQuickPerformanceLogger2);
        C69642NpP.A01 = 19j.A00(context2, lightweightQuickPerformanceLogger2, r15, (1AU) null, str, AnonymousClass9PN.A02(0, 9, 61), (String) null, 2, false, false);
        1AU r2 = C69642NpP.A01;
        0qQ.A07(r2);
        DbT.A0h().A0D(str);
        C59450Ty r1 = new C59450Ty();
        r1.A00 = 30000;
        r1.A02 = AnonymousClass05K.A0C;
        1AA r0 = r2.A00;
        r0.A0C();
        if (!r0.A0A().updateConfigs(r1)) {
            0KC.A0P(TAG, "Failed to update configs for %s after %dms.", C51968G9o.A1Z(str, r1.A00));
            0tS A00 = 0tS.A00();
            C69642NpP.A01 = null;
            A00.A0D((String) null);
            return false;
        }
        MobileConfigBisection mobileConfigBisection = INSTANCE;
        mobileConfigBisection.createAndSetBisectHelper(r2, context2);
        mobileConfigBisection.onUpdatedConfigs(context2, r2, str);
        return A1U;
    }

    private final void createAndSetBisectHelper(1AU r4, Context context) {
        1AA r2 = r4.A00;
        0qQ.A0C(r2.A0A(), "null cannot be cast to non-null type com.facebook.mobileconfig.MobileConfigManagerHolderImpl");
        BisectHelperHolder newMCBisectHelper = new MobileConfigOverridesWriterHolder((MobileConfigManagerHolderImpl) null).getNewMCBisectHelper(new MobileConfigBisection$createAndSetBisectHelper$bisectDefaultValuesProvider$1(r2));
        bisectHelper = newMCBisectHelper;
        try {
            0qQ.A0A(newMCBisectHelper);
            newMCBisectHelper.setBisectPath(JTO.A0s(context.getFilesDir(), BISECT_DIR).getCanonicalPath());
        } catch (IOException e) {
            0KC.A0H(TAG, "Failed to set bisect path", e);
        }
    }

    public static final C74494Pvo getBisectState() {
        if (!INSTANCE.isInitialized("Failed getBisectState sBisectHelper not initialized.")) {
            return null;
        }
        C74478PvY pvY = bisectHelper;
        0qQ.A0A(pvY);
        return ((BisectHelperHolder) pvY).getCurrentState();
    }

    public static final boolean goBackOneStep() {
        if (INSTANCE.isInitialized("Failed goBackOneStep sBisectHelper not initialized.")) {
            C74478PvY pvY = bisectHelper;
            0qQ.A0A(pvY);
            if (!pvY.goBackOneStep()) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean isInitialized(String str) {
        if (bisectHelper != null) {
            return true;
        }
        0KC.A0D(TAG, str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void onUpdatedConfigs(android.content.Context r6, X.1AU r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r4 = "MobileConfigBisection"
            r0 = 0
            java.util.TreeMap r2 = r7.A02(r0)
            X.0tS r1 = X.0tS.A00()
            r0 = 0
            X.C69642NpP.A01 = r0
            r1.A0D(r0)
            java.io.File r1 = r6.getFilesDir()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0049 }
            java.lang.String r0 = "mobileconfig/overrides_raw_response.txt"
            java.io.File r0 = X.JTO.A0s(r1, r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0049 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x0045, JSONException -> 0x0049 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0049 }
            java.lang.String r2 = X.C70299O1d.A00(r2)     // Catch:{ all -> 0x003e }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "overrides"
            r1.put(r0, r2)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x003e }
            r3.write(r0)     // Catch:{ all -> 0x003e }
            r3.close()     // Catch:{ all -> 0x003e }
            startUsingExistingFile(r8)     // Catch:{ all -> 0x003e }
            r3.close()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0049 }
            return
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0049 }
            throw r0     // Catch:{ IOException -> 0x0045, JSONException -> 0x0049 }
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "Failed to write overrides."
            goto L_0x004c
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "Failed to write json overrides."
        L_0x004c:
            X.0KC.A0H(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.MobileConfigBisection.onUpdatedConfigs(android.content.Context, X.1AU, java.lang.String):void");
    }

    public static final void startUsingExistingFile(String str) {
        if (INSTANCE.isInitialized("Failed startUsingExistingFile sBisectHelper not initialized.")) {
            C74478PvY pvY = bisectHelper;
            0qQ.A0A(pvY);
            pvY.startUsingExistingFile(str);
        }
    }

    public static final boolean stopBisection() {
        if (!INSTANCE.isInitialized("Failed stopBisection sBisectHelper not initialized.")) {
            return false;
        }
        C74478PvY pvY = bisectHelper;
        0qQ.A0A(pvY);
        return pvY.stopBisection();
    }

    public static final boolean userDidNotReproduceBug() {
        if (INSTANCE.isInitialized("Failed userDidNotReproduceBug sBisectHelper not initialized.")) {
            C74478PvY pvY = bisectHelper;
            0qQ.A0A(pvY);
            if (!pvY.userDidNotReproduceBug()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean userDidReproduceBug() {
        if (INSTANCE.isInitialized("Failed userDidReproduceBug sBisectHelper not initialized.")) {
            C74478PvY pvY = bisectHelper;
            0qQ.A0A(pvY);
            if (!pvY.userDidReproduceBug()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
