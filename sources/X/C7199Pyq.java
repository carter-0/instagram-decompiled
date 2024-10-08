package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Pyq  reason: case insensitive filesystem */
public final class C7199Pyq {
    public static final AtomicInteger A03 = new AtomicInteger((int) SystemClock.elapsedRealtime());
    public Bundle A00;
    public final Context A01;
    public final String A02;

    public static final synchronized Bundle A00(C7199Pyq pyq) {
        Bundle bundle;
        synchronized (pyq) {
            bundle = pyq.A00;
            if (bundle == null) {
                try {
                    ApplicationInfo applicationInfo = pyq.A01.getPackageManager().getApplicationInfo(pyq.A02, 128);
                    if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                        pyq.A00 = bundle;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String valueOf = String.valueOf(e);
                    Log.w("FirebaseMessaging", Pxg.A0s("Couldn't get own application info: ", valueOf, Pxe.A14(Pxf.A09(valueOf) + 35)));
                }
                bundle = Bundle.EMPTY;
            }
        }
        return bundle;
    }

    public C7199Pyq(Context context, String str) {
        this.A01 = context;
        this.A02 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00df A[SYNTHETIC, Splitter:B:35:0x00df] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.os.Bundle r13, X.C7199Pyq r14, java.lang.String r15) {
        /*
            java.lang.String r12 = A02(r13, r15)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r7 = "_loc_key"
            int r8 = r7.length()
            if (r8 == 0) goto L_0x0069
            java.lang.String r0 = r1.concat(r7)
        L_0x001a:
            java.lang.String r2 = A02(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r12 = 0
            if (r0 != 0) goto L_0x0062
            android.content.Context r0 = r14.A01
            android.content.res.Resources r3 = r0.getResources()
            java.lang.String r1 = r14.A02
            java.lang.String r0 = "string"
            int r6 = r3.getIdentifier(r2, r0, r1)
            java.lang.String r5 = " Default value will be used."
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = java.lang.String.valueOf(r15)
            if (r6 != 0) goto L_0x006f
            if (r8 == 0) goto L_0x0063
            java.lang.String r0 = r1.concat(r7)
        L_0x0044:
            r1 = 6
            java.lang.String r2 = r0.substring(r1)
            int r0 = X.Pxf.A09(r2)
            int r0 = r0 + 49
            java.lang.StringBuilder r1 = X.Pxh.A0q(r15, r0)
            r1.append(r2)
            java.lang.String r0 = " resource not found: "
            r1.append(r0)
            java.lang.String r0 = X.Pxg.A0s(r15, r5, r1)
            android.util.Log.w(r4, r0)
        L_0x0062:
            return r12
        L_0x0063:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0044
        L_0x0069:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x001a
        L_0x006f:
            java.lang.String r10 = "_loc_args"
            int r11 = r10.length()
            if (r11 == 0) goto L_0x0086
            java.lang.String r0 = r1.concat(r10)
        L_0x007b:
            java.lang.String r7 = A02(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00d1
            goto L_0x008c
        L_0x0086:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x007b
        L_0x008c:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00a3 }
            r9.<init>(r7)     // Catch:{ JSONException -> 0x00a3 }
            int r8 = r9.length()     // Catch:{ JSONException -> 0x00a3 }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ JSONException -> 0x00a3 }
            r1 = 0
        L_0x0098:
            if (r1 >= r8) goto L_0x00d2
            java.lang.Object r0 = r9.opt(r1)     // Catch:{ JSONException -> 0x00a3 }
            r2[r1] = r0     // Catch:{ JSONException -> 0x00a3 }
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00a3:
            java.lang.String r1 = java.lang.String.valueOf(r15)
            if (r11 == 0) goto L_0x00d9
            java.lang.String r0 = r1.concat(r10)
        L_0x00ad:
            r1 = 6
            java.lang.String r2 = r0.substring(r1)
            int r0 = X.Pxf.A09(r2)
            int r0 = r0 + 41
            java.lang.StringBuilder r1 = X.Pxh.A0q(r7, r0)
            java.lang.String r0 = "Malformed "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "  Default value will be used."
            X.Pxg.A1Q(r0, r4, r1)
        L_0x00d1:
            r2 = r12
        L_0x00d2:
            if (r2 != 0) goto L_0x00df
            java.lang.String r12 = r3.getString(r6)
            return r12
        L_0x00d9:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x00ad
        L_0x00df:
            java.lang.String r12 = r3.getString(r6, r2)     // Catch:{ MissingFormatArgumentException -> 0x00e4 }
            return r12
        L_0x00e4:
            r3 = move-exception
            java.lang.String r2 = java.util.Arrays.toString(r2)
            int r0 = X.Pxf.A09(r15)
            int r0 = r0 + 58
            java.lang.StringBuilder r1 = X.Pxh.A0q(r2, r0)
            java.lang.String r0 = "Missing format argument for "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.lang.String r0 = X.Pxg.A0s(r2, r5, r1)
            android.util.Log.w(r4, r0, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7199Pyq.A01(android.os.Bundle, X.Pyq, java.lang.String):java.lang.String");
    }

    public static String A02(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return bundle.getString(str.replace("gcm.n.", "gcm.notification."));
        }
        return string;
    }

    public static void A03(Intent intent, Bundle bundle) {
        Iterator A0t = Pxf.A0t(bundle);
        while (A0t.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0t);
            if (A18.startsWith("google.c.a.") || A18.equals("from")) {
                intent.putExtra(A18, bundle.getString(A18));
            }
        }
    }
}
