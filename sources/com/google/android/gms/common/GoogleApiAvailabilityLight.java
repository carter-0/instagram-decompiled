package com.google.android.gms.common;

import X.AnonymousClass000;
import X.C241663Qd;
import X.C241673Qe;
import X.Pxd;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.Constants;
import com.google.android.gms.common.util.DeviceProperties;

public class GoogleApiAvailabilityLight {
    public static final GoogleApiAvailabilityLight A00 = new Object();

    public final Intent A04(Context context, String str, int i) {
        if (i == 1 || i == 2) {
            if (context == null || !DeviceProperties.A00(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(12451000);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        C241673Qe A002 = C241663Qd.A00(context);
                        sb.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String obj = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse(AnonymousClass000.A00(694)).buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "com.google.android.gms");
                if (!TextUtils.isEmpty(obj)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", obj);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(Constants.LOAD_RESULT_WITH_VDEX_ODEX);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent(Pxd.A00(31));
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r0.booleanValue() != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(android.content.Context r15, int r16) {
        /*
            r14 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            java.lang.String r2 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r15.getResources()     // Catch:{ all -> 0x000f }
            r0 = 2131956453(0x7f1312e5, float:1.9549462E38)
            r1.getString(r0)     // Catch:{ all -> 0x000f }
            goto L_0x0014
        L_0x000f:
            java.lang.String r0 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r2, r0)
        L_0x0014:
            java.lang.String r0 = r15.getPackageName()
            java.lang.String r6 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0083
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0083
            java.lang.Object r4 = X.C241653Qc.A02
            monitor-enter(r4)
            boolean r0 = X.C241653Qc.A01     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0060
            r0 = 1
            X.C241653Qc.A01 = r0     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = r15.getPackageName()     // Catch:{ all -> 0x0080 }
            X.3Qe r0 = X.C241663Qd.A00(r15)     // Catch:{ all -> 0x0080 }
            r1 = 128(0x80, float:1.794E-43)
            android.content.Context r0 = r0.A00     // Catch:{ NameNotFoundException -> 0x0058 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0058 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x0058 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0058 }
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "com.google.app.id"
            r1.getString(r0)     // Catch:{ NameNotFoundException -> 0x0058 }
            java.lang.String r0 = "com.google.android.gms.version"
            int r0 = r1.getInt(r0)     // Catch:{ NameNotFoundException -> 0x0058 }
            X.C241653Qc.A00 = r0     // Catch:{ NameNotFoundException -> 0x0058 }
            goto L_0x0060
        L_0x0058:
            r3 = move-exception
            java.lang.String r1 = "MetadataValueReader"
            java.lang.String r0 = "This should never happen."
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0080 }
        L_0x0060:
            monitor-exit(r4)     // Catch:{ all -> 0x0080 }
            int r4 = X.C241653Qc.A00
            if (r4 == 0) goto L_0x007a
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r4 == r3) goto L_0x0083
            java.lang.String r2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            java.lang.String r1 = " but found "
            java.lang.String r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            java.lang.String r1 = X.002.A0n(r2, r1, r0, r3, r4)
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r0.<init>(r1)
            throw r0
        L_0x007a:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r0.<init>()
            throw r0
        L_0x0080:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0080 }
            throw r0
        L_0x0083:
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.A00(r15)
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x00b6
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.A02
            if (r0 != 0) goto L_0x00af
            android.content.pm.PackageManager r1 = r15.getPackageManager()
            java.lang.String r0 = "android.hardware.type.iot"
            boolean r0 = r1.hasSystemFeature(r0)
            r3 = 1
            if (r0 != 0) goto L_0x00a9
            android.content.pm.PackageManager r1 = r15.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 != 0) goto L_0x00a9
            r3 = 0
        L_0x00a9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.common.util.DeviceProperties.A02 = r0
        L_0x00af:
            boolean r0 = r0.booleanValue()
            r8 = 1
            if (r0 == 0) goto L_0x00b7
        L_0x00b6:
            r8 = 0
        L_0x00b7:
            r0 = 0
            r12 = r16
            if (r16 < 0) goto L_0x00bd
            r0 = 1
        L_0x00bd:
            X.AnonymousClass3Qk.A07(r0)
            java.lang.String r9 = r15.getPackageName()
            android.content.pm.PackageManager r3 = r15.getPackageManager()
            if (r8 == 0) goto L_0x00d3
            java.lang.String r1 = "com.android.vending"
            r0 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r1 = r3.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0166 }
            goto L_0x00d4
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            r0 = 64
            android.content.pm.PackageInfo r7 = r3.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x0158 }
            X.C241713Ql.A00(r15)
            boolean r0 = X.C241713Ql.A01(r7, r4)
            if (r0 != 0) goto L_0x00f2
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
        L_0x00e9:
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r2, r0)
            goto L_0x0173
        L_0x00f2:
            if (r8 == 0) goto L_0x011b
            X.AnonymousClass3Qk.A02(r1)
            boolean r0 = X.C241713Ql.A01(r1, r4)
            if (r0 != 0) goto L_0x0104
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            goto L_0x00e9
        L_0x0104:
            if (r1 == 0) goto L_0x011b
            android.content.pm.Signature[] r0 = r1.signatures
            r1 = r0[r5]
            android.content.pm.Signature[] r0 = r7.signatures
            r0 = r0[r5]
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x011b
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x00e9
        L_0x011b:
            int r13 = r7.versionCode
            r1 = -1
            if (r13 == r1) goto L_0x0122
            int r1 = r13 / 1000
        L_0x0122:
            r0 = -1
            if (r12 == r0) goto L_0x0127
            int r0 = r12 / 1000
        L_0x0127:
            if (r1 >= r0) goto L_0x0138
            java.lang.String r8 = "Google Play services out of date for "
            java.lang.String r10 = ".  Requires "
            java.lang.String r11 = " but found "
            java.lang.String r0 = X.002.A0y(r8, r9, r10, r11, r12, r13)
            android.util.Log.w(r2, r0)
            r4 = 2
            goto L_0x0175
        L_0x0138:
            android.content.pm.ApplicationInfo r0 = r7.applicationInfo
            if (r0 != 0) goto L_0x0150
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r6, r5)     // Catch:{ NameNotFoundException -> 0x0141 }
            goto L_0x0150
        L_0x0141:
            r3 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.wtf(r2, r0, r3)
            goto L_0x0175
        L_0x0150:
            boolean r0 = r0.enabled
            if (r0 != 0) goto L_0x0156
            r4 = 3
            goto L_0x0175
        L_0x0156:
            r4 = 0
            goto L_0x0175
        L_0x0158:
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r2, r0)
            goto L_0x0175
        L_0x0166:
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r2, r0)
        L_0x0173:
            r4 = 9
        L_0x0175:
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00(r15, r4)
            if (r0 == 0) goto L_0x017d
            r4 = 18
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailabilityLight.A03(android.content.Context, int):int");
    }

    public final int A02(Context context) {
        return A03(context, 12451000);
    }
}
