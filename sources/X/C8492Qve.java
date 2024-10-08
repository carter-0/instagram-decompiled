package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: X.Qve  reason: case insensitive filesystem */
public abstract class C8492Qve extends ST5 {
    public boolean A00;

    public static void A07(String str, Object obj, int i) {
        String str2 = (String) SDN.A0D.A00;
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, ST5.A09(str, obj, (Object) null, (Object) null));
        }
    }

    public static void A05(C11381SQt sQt) {
        C8481QvT qvT = sQt.A06;
        C11381SQt.A02(qvT);
        C11200SFa.A00();
        C8490Qvc qvc = qvT.A00;
        C11200SFa.A00();
        qvc.A00 = System.currentTimeMillis();
    }

    public static void A06(C8490Qvc qvc) {
        Context context = qvc.A06.A02.A00;
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra("com.google.android.gms.internal.gtm.zzcj", true);
        context.sendOrderedBroadcast(intent, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Qoo, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r10 = r1.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r10 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        X.ST5.A0C(r11, r12, (java.lang.Object) null, "Error parsing bool configuration value", 5);
        r10.A0L(r11, r12, (java.lang.Object) null, "Error parsing bool configuration value", 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00eb, code lost:
        X.ST5.A0C(r11, r12, (java.lang.Object) null, "Error parsing bool configuration value", 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0156, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r8 = r1.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015d, code lost:
        if (r8 != null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015f, code lost:
        A07("Error parsing tracker configuration file", r9, 6);
        r8.A0L(r9, (java.lang.Object) null, (java.lang.Object) null, "Error parsing tracker configuration file", 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0168, code lost:
        A07("Error parsing tracker configuration file", r9, 6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0156 A[ExcHandler: IOException | XmlPullParserException (r9v1 'e' java.lang.Object A[CUSTOM_DECLARE]), PHI: r2 r3 r5 r6 r7 
      PHI: (r2v24 java.lang.String) = (r2v17 java.lang.String), (r2v25 java.lang.String), (r2v25 java.lang.String), (r2v25 java.lang.String), (r2v25 java.lang.String), (r2v25 java.lang.String) binds: [B:13:0x002e, B:23:0x005b, B:63:0x010f, B:70:0x012c, B:45:0x00c2, B:52:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v7 java.lang.String) = (r3v3 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String) binds: [B:13:0x002e, B:23:0x005b, B:63:0x010f, B:70:0x012c, B:45:0x00c2, B:52:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v5 char) = (r5v2 char), (r5v6 char), (r5v6 char), (r5v6 char), (r5v6 char), (r5v6 char) binds: [B:13:0x002e, B:23:0x005b, B:63:0x010f, B:70:0x012c, B:45:0x00c2, B:52:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v4 int) = (r6v1 int), (r6v5 int), (r6v5 int), (r6v5 int), (r6v5 int), (r6v5 int) binds: [B:13:0x002e, B:23:0x005b, B:63:0x010f, B:70:0x012c, B:45:0x00c2, B:52:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String) binds: [B:13:0x002e, B:23:0x005b, B:63:0x010f, B:70:0x012c, B:45:0x00c2, B:52:0x00e0] A[DONT_GENERATE, DONT_INLINE], Splitter:B:13:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I() {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1 instanceof X.C8480QvS
            if (r0 == 0) goto L_0x018f
            r0 = r1
            X.QvS r0 = (X.C8480QvS) r0
            X.SQt r1 = r0.A00
            android.content.Context r2 = r1.A00
            android.content.pm.ApplicationInfo r2 = X.Pxj.A0G(r2)     // Catch:{ NameNotFoundException -> 0x0182 }
            if (r2 == 0) goto L_0x0188
            android.os.Bundle r3 = r2.metaData
            if (r3 == 0) goto L_0x031a
            java.lang.String r2 = "com.google.android.gms.analytics.globalConfigResource"
            int r8 = r3.getInt(r2)
            if (r8 <= 0) goto L_0x031a
            r3 = 0
            r2 = 0
            r7 = 0
            r6 = -1
            r5 = -1
            android.content.Context r4 = r1.A01     // Catch:{ NotFoundException -> 0x016d }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ NotFoundException -> 0x016d }
            android.content.res.XmlResourceParser r4 = r4.getXml(r8)     // Catch:{ NotFoundException -> 0x016d }
            r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            int r9 = r4.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
        L_0x0035:
            r8 = 1
            if (r9 == r8) goto L_0x02bf
            int r9 = r4.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            r8 = 2
            if (r9 != r8) goto L_0x0150
            java.lang.String r9 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r10 = r9.toLowerCase(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = "screenname"
            boolean r8 = r10.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r9 = "name"
            r13 = 0
            if (r8 == 0) goto L_0x0058
            goto L_0x013b
        L_0x0058:
            java.lang.String r8 = "string"
            boolean r8 = r10.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x00a2
            java.lang.String r10 = r4.getAttributeValue(r13, r9)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = r4.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r9 = r8.trim()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 != 0) goto L_0x0150
            if (r9 == 0) goto L_0x0150
            java.lang.String r8 = "ga_appName"
            boolean r8 = r8.equals(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x0080
            r3 = r9
            goto L_0x0150
        L_0x0080:
            java.lang.String r8 = "ga_appVersion"
            boolean r8 = r8.equals(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x008b
            r2 = r9
            goto L_0x0150
        L_0x008b:
            java.lang.String r8 = "ga_logLevel"
            boolean r8 = r8.equals(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x0096
            r7 = r9
            goto L_0x0150
        L_0x0096:
            X.QvX r9 = r1.A0C     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            X.C11381SQt.A02(r9)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = "String xml configuration name not recognized"
            r9.A0G(r8, r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0150
        L_0x00a2:
            java.lang.String r8 = "bool"
            boolean r8 = r10.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x00ef
            java.lang.String r10 = r4.getAttributeValue(r13, r9)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = r4.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r11 = r8.trim()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 != 0) goto L_0x0150
            boolean r8 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 != 0) goto L_0x0150
            boolean r9 = java.lang.Boolean.parseBoolean(r11)     // Catch:{ NumberFormatException -> 0x00dc, IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = "ga_dryRun"
            boolean r8 = r8.equals(r10)     // Catch:{ NumberFormatException -> 0x00dc, IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x00d1
            r5 = r9
            goto L_0x0150
        L_0x00d1:
            X.QvX r9 = r1.A0C     // Catch:{ NumberFormatException -> 0x00dc, IOException | XmlPullParserException -> 0x0156 }
            X.C11381SQt.A02(r9)     // Catch:{ NumberFormatException -> 0x00dc, IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = "Bool xml configuration name not recognized"
            r9.A0G(r8, r10)     // Catch:{ NumberFormatException -> 0x00dc, IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0150
        L_0x00dc:
            r12 = move-exception
            java.lang.String r14 = "Error parsing bool configuration value"
            r15 = 5
            X.QvX r10 = r1.A0C     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r10 == 0) goto L_0x00eb
            X.ST5.A0C(r11, r12, r13, r14, r15)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            r10.A0L(r11, r12, r13, r14, r15)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0150
        L_0x00eb:
            X.ST5.A0C(r11, r12, r13, r14, r15)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0150
        L_0x00ef:
            java.lang.String r8 = "integer"
            boolean r8 = r10.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x0150
            java.lang.String r10 = r4.getAttributeValue(r13, r9)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = r4.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r11 = r8.trim()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 != 0) goto L_0x0150
            boolean r8 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 != 0) goto L_0x0150
            int r9 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0128, IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = "ga_dispatchPeriod"
            boolean r8 = r8.equals(r10)     // Catch:{ NumberFormatException -> 0x0128, IOException | XmlPullParserException -> 0x0156 }
            if (r8 == 0) goto L_0x011d
            r6 = r9
            goto L_0x0150
        L_0x011d:
            X.QvX r9 = r1.A0C     // Catch:{ NumberFormatException -> 0x0128, IOException | XmlPullParserException -> 0x0156 }
            X.C11381SQt.A02(r9)     // Catch:{ NumberFormatException -> 0x0128, IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = "Int xml configuration name not recognized"
            r9.A0G(r8, r10)     // Catch:{ NumberFormatException -> 0x0128, IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0150
        L_0x0128:
            r12 = move-exception
            java.lang.String r14 = "Error parsing int configuration value"
            r15 = 5
            X.QvX r10 = r1.A0C     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r10 == 0) goto L_0x0137
            X.ST5.A0C(r11, r12, r13, r14, r15)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            r10.A0L(r11, r12, r13, r14, r15)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0150
        L_0x0137:
            X.ST5.A0C(r11, r12, r13, r14, r15)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0150
        L_0x013b:
            java.lang.String r10 = r4.getAttributeValue(r13, r9)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r8 = r4.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            java.lang.String r9 = r8.trim()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            if (r8 != 0) goto L_0x0150
            android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
        L_0x0150:
            int r9 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x0156 }
            goto L_0x0035
        L_0x0156:
            r9 = move-exception
            java.lang.String r12 = "Error parsing tracker configuration file"
            r10 = 0
            r13 = 6
            X.QvX r8 = r1.A0C     // Catch:{ NotFoundException -> 0x016d }
            if (r8 == 0) goto L_0x0168
            A07(r12, r9, r13)     // Catch:{ NotFoundException -> 0x016d }
            r11 = r10
            r8.A0L(r9, r10, r11, r12, r13)     // Catch:{ NotFoundException -> 0x016d }
            goto L_0x02bf
        L_0x0168:
            A07(r12, r9, r13)     // Catch:{ NotFoundException -> 0x016d }
            goto L_0x02bf
        L_0x016d:
            r2 = move-exception
            java.lang.String r5 = "inflate() called with unknown resourceId"
            r3 = 0
            r6 = 5
            X.QvX r1 = r1.A0C
            if (r1 == 0) goto L_0x017e
            A07(r5, r2, r6)
            r4 = r3
            r1.A0L(r2, r3, r4, r5, r6)
            return
        L_0x017e:
            A07(r5, r2, r6)
            return
        L_0x0182:
            r2 = move-exception
            java.lang.String r1 = "PackageManager doesn't know about the app package"
            r0.A0G(r1, r2)
        L_0x0188:
            java.lang.String r2 = "Couldn't get ApplicationInfo to load global config"
            r1 = 5
            X.ST5.A0B(r0, r2, r1)
            return
        L_0x018f:
            boolean r0 = r1 instanceof X.C8486QvY
            if (r0 == 0) goto L_0x01a3
            r2 = r1
            X.QvY r2 = (X.C8486QvY) r2
            X.SQt r0 = r2.A00
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "com.google.android.gms.analytics.prefs"
            android.content.SharedPreferences r0 = X.Pxe.A0H(r1, r0)
            r2.A00 = r0
            return
        L_0x01a3:
            boolean r0 = r1 instanceof X.C8489Qvb
            if (r0 == 0) goto L_0x01b2
            r2 = r1
            X.Qvb r2 = (X.C8489Qvb) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "Network initialized. User agent"
            r2.A0E(r0, r1)
            return
        L_0x01b2:
            boolean r0 = r1 instanceof X.C8485QvX
            if (r0 == 0) goto L_0x01c3
            r0 = r1
            X.QvX r0 = (X.C8485QvX) r0
            java.lang.Class<X.QvX> r1 = X.C8485QvX.class
            monitor-enter(r1)
            X.C8485QvX.A00 = r0     // Catch:{ all -> 0x01c0 }
            monitor-exit(r1)     // Catch:{ all -> 0x01c0 }
            return
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c0 }
            throw r0
        L_0x01c3:
            boolean r0 = r1 instanceof X.C8484QvW
            if (r0 == 0) goto L_0x01ff
            r4 = r1
            X.QvW r4 = (X.C8484QvW) r4
            r4.A0K()     // Catch:{ NameNotFoundException -> 0x01fe }
            X.SNL r0 = X.SDN.A0I     // Catch:{ NameNotFoundException -> 0x01fe }
            java.lang.Object r0 = r0.A00     // Catch:{ NameNotFoundException -> 0x01fe }
            long r5 = X.AnonymousClass7TE.A0R(r0)     // Catch:{ NameNotFoundException -> 0x01fe }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fe
            X.SQt r0 = r4.A00     // Catch:{ NameNotFoundException -> 0x01fe }
            android.content.Context r3 = r0.A00     // Catch:{ NameNotFoundException -> 0x01fe }
            android.content.pm.PackageManager r2 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01fe }
            java.lang.String r0 = "com.google.android.gms.analytics.AnalyticsReceiver"
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x01fe }
            r1.<init>(r3, r0)     // Catch:{ NameNotFoundException -> 0x01fe }
            r0 = 0
            android.content.pm.ActivityInfo r0 = r2.getReceiverInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x01fe }
            if (r0 == 0) goto L_0x01fe
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x01fe }
            if (r0 == 0) goto L_0x01fe
            java.lang.String r1 = "Receiver registered for local dispatch."
            r0 = 2
            X.ST5.A0B(r4, r1, r0)     // Catch:{ NameNotFoundException -> 0x01fe }
            r0 = 1
            r4.A01 = r0     // Catch:{ NameNotFoundException -> 0x01fe }
        L_0x01fe:
            return
        L_0x01ff:
            boolean r0 = r1 instanceof X.C8479QvR
            if (r0 != 0) goto L_0x031a
            boolean r0 = r1 instanceof X.C8483QvV
            if (r0 != 0) goto L_0x031a
            boolean r0 = r1 instanceof X.C8490Qvc
            if (r0 == 0) goto L_0x0225
            r2 = r1
            X.Qvc r2 = (X.C8490Qvc) r2
            X.Qvd r0 = r2.A04
            r0.A0I()
            r1 = 1
            r0.A00 = r1
            X.Qvb r0 = r2.A07
            r0.A0I()
            r0.A00 = r1
            X.QvZ r0 = r2.A03
            r0.A0I()
            r0.A00 = r1
            return
        L_0x0225:
            boolean r0 = r1 instanceof X.C8482QvU
            if (r0 == 0) goto L_0x02a7
            r7 = r1
            X.QvU r7 = (X.C8482QvU) r7
            X.SQt r6 = r7.A00
            X.SFa r8 = r6.A03
            X.AnonymousClass3Qk.A02(r8)
            X.Qoo r0 = r8.A05
            if (r0 != 0) goto L_0x0288
            monitor-enter(r8)
            X.Qoo r0 = r8.A05     // Catch:{ all -> 0x0285 }
            if (r0 != 0) goto L_0x0283
            X.Qoo r5 = new X.Qoo     // Catch:{ all -> 0x0285 }
            r5.<init>()     // Catch:{ all -> 0x0285 }
            android.content.Context r1 = r8.A01     // Catch:{ all -> 0x0285 }
            android.content.pm.PackageManager r9 = r1.getPackageManager()     // Catch:{ all -> 0x0285 }
            java.lang.String r2 = r1.getPackageName()     // Catch:{ all -> 0x0285 }
            r5.A02 = r2     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = r9.getInstallerPackageName(r2)     // Catch:{ all -> 0x0285 }
            r5.A03 = r0     // Catch:{ all -> 0x0285 }
            r4 = 0
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0272 }
            r0 = 0
            android.content.pm.PackageInfo r3 = r9.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0272 }
            if (r3 == 0) goto L_0x027d
            android.content.pm.ApplicationInfo r0 = r3.applicationInfo     // Catch:{ NameNotFoundException -> 0x0272 }
            java.lang.CharSequence r1 = r9.getApplicationLabel(r0)     // Catch:{ NameNotFoundException -> 0x0272 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x0272 }
            if (r0 != 0) goto L_0x026f
            java.lang.String r2 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0272 }
        L_0x026f:
            java.lang.String r4 = r3.versionName     // Catch:{ NameNotFoundException -> 0x0272 }
            goto L_0x027d
        L_0x0272:
            java.lang.String r1 = "GAv4"
            java.lang.String r0 = "Error retrieving package info: appName set to "
            java.lang.String r0 = X.Pxh.A0l(r0, r2)     // Catch:{ all -> 0x0285 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0285 }
        L_0x027d:
            r5.A00 = r2     // Catch:{ all -> 0x0285 }
            r5.A01 = r4     // Catch:{ all -> 0x0285 }
            r8.A05 = r5     // Catch:{ all -> 0x0285 }
        L_0x0283:
            monitor-exit(r8)     // Catch:{ all -> 0x0285 }
            goto L_0x0288
        L_0x0285:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0285 }
            throw r0
        L_0x0288:
            X.Qoo r0 = r8.A05
            X.Qoo r2 = r7.A00
            r0.A03(r2)
            X.QvS r1 = r6.A0E
            X.C11381SQt.A02(r1)
            r1.A0J()
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x029d
            r2.A00 = r0
        L_0x029d:
            r1.A0J()
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x031a
            r2.A01 = r0
            return
        L_0x02a7:
            boolean r0 = r1 instanceof X.C8491Qvd
            if (r0 != 0) goto L_0x031a
            boolean r0 = r1 instanceof X.C8487QvZ
            if (r0 != 0) goto L_0x031a
            boolean r0 = r1 instanceof X.C8481QvT
            if (r0 == 0) goto L_0x031a
            r0 = r1
            X.QvT r0 = (X.C8481QvT) r0
            X.Qvc r1 = r0.A00
            r1.A0I()
            r0 = 1
            r1.A00 = r0
            return
        L_0x02bf:
            java.lang.String r4 = "Loading global XML config values"
            r1 = 2
            X.ST5.A0B(r0, r4, r1)
            r8 = 0
            r4 = 1
            if (r3 == 0) goto L_0x02d0
            r0.A01 = r3
            java.lang.String r1 = "XML config - app name"
            r0.A0F(r1, r3)
        L_0x02d0:
            if (r2 == 0) goto L_0x02d9
            r0.A02 = r2
            java.lang.String r1 = "XML config - app version"
            r0.A0F(r1, r2)
        L_0x02d9:
            boolean r1 = X.AnonymousClass7TF.A1V(r7)
            r3 = -1
            if (r1 == 0) goto L_0x02f9
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r7.toLowerCase(r1)
            java.lang.String r1 = "verbose"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x031b
            r1 = 0
        L_0x02f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "XML config - log level"
            r0.A0E(r1, r2)
        L_0x02f9:
            if (r6 < 0) goto L_0x0308
            r0.A00 = r6
            r0.A03 = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "XML config - dispatch period (sec)"
            r0.A0F(r1, r2)
        L_0x0308:
            if (r5 == r3) goto L_0x031a
            if (r5 != r4) goto L_0x030d
            r8 = 1
        L_0x030d:
            r0.A05 = r8
            r0.A04 = r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.String r1 = "XML config - dry run"
            r0.A0F(r1, r2)
        L_0x031a:
            return
        L_0x031b:
            java.lang.String r1 = "info"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0325
            r1 = 1
            goto L_0x02f0
        L_0x0325:
            java.lang.String r1 = "warning"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0330
            r1 = 2
            goto L_0x02f0
        L_0x0330:
            java.lang.String r1 = "error"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02f9
            r1 = 3
            goto L_0x02f0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8492Qve.A0I():void");
    }

    public final void A0J() {
        if (!this.A00) {
            throw AnonymousClass7TE.A0z("Not initialized");
        }
    }
}
