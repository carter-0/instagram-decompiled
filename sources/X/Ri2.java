package X;

public abstract class Ri2 {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r7.A01 == null) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r11, X.AnonymousClass0aP r12, java.lang.String r13) {
        /*
            android.content.Context r2 = r11.getApplicationContext()
            java.lang.Class<X.T69> r1 = X.T69.class
            r3 = 1
            X.Pd8 r0 = new X.Pd8
            r0.<init>(r3, r2, r12)
            java.lang.Object r5 = r12.A01(r1, r0)
            X.T69 r5 = (X.T69) r5
            X.0wX r4 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r4)
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x002e
            boolean r0 = X.T69.A02
            if (r0 != 0) goto L_0x002e
            X.0lg r2 = r5.A01
            java.lang.String r1 = "first_open_waiting_for_referrer"
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 0
            X.C9865Rie.A00(r2, r1, r0, r13)
            X.T69.A02 = r3
        L_0x002e:
            boolean r0 = X.T69.A03
            if (r0 != 0) goto L_0x0263
            X.18g r0 = X.C638918c.A01(r4)
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x0058
            X.C638918c.A01(r4)
            X.0eF r0 = X.AnonymousClass0eF.A04
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0263
            X.0xm r0 = X.AnonymousClass0xl.A00(r4)
            X.0xa r2 = r0.A00
            java.lang.String r1 = "preference_referral_logging_attempt_count"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            if (r1 <= 0) goto L_0x0263
            r0 = 3
            if (r1 >= r0) goto L_0x0263
        L_0x0058:
            X.0xm r0 = X.AnonymousClass0xl.A00(r4)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "preference_referral_logging_attempt_count"
            r4 = 0
            X.JTS.A1S(r1, r0, r4)
            android.content.Context r0 = r5.A00     // Catch:{ SecurityException -> 0x0123 }
            if (r0 == 0) goto L_0x011c
            X.SF4 r7 = new X.SF4     // Catch:{ SecurityException -> 0x0123 }
            r7.<init>(r0)     // Catch:{ SecurityException -> 0x0123 }
            X.S2A r6 = new X.S2A     // Catch:{ SecurityException -> 0x0123 }
            r6.<init>(r7, r5, r13)     // Catch:{ SecurityException -> 0x0123 }
            int r8 = r7.A00     // Catch:{ SecurityException -> 0x0123 }
            r9 = 2
            if (r8 != r9) goto L_0x0081
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r0 = r7.A02     // Catch:{ SecurityException -> 0x0123 }
            if (r0 == 0) goto L_0x0081
            android.content.ServiceConnection r1 = r7.A01     // Catch:{ SecurityException -> 0x0123 }
            r0 = 1
            if (r1 != 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            java.lang.String r2 = "InstallReferrerClient"
            if (r0 == 0) goto L_0x008e
            android.util.Log.isLoggable(r2, r9)     // Catch:{ SecurityException -> 0x0123 }
            r6.A00(r4)     // Catch:{ SecurityException -> 0x0123 }
            goto L_0x012b
        L_0x008e:
            r11 = 3
            if (r8 != r3) goto L_0x0095
            java.lang.String r0 = "Client is already in the process of connecting to the service."
            goto L_0x0115
        L_0x0095:
            if (r8 != r11) goto L_0x0098
            goto L_0x0113
        L_0x0098:
            r11 = 2
            android.util.Log.isLoggable(r2, r9)     // Catch:{ SecurityException -> 0x0123 }
            X.SVQ r0 = new X.SVQ     // Catch:{ SecurityException -> 0x0123 }
            r0.<init>(r7, r6)     // Catch:{ SecurityException -> 0x0123 }
            r7.A01 = r0     // Catch:{ SecurityException -> 0x0123 }
            java.lang.String r0 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            android.content.Intent r10 = X.Pxe.A0G(r0)     // Catch:{ SecurityException -> 0x0123 }
            java.lang.String r12 = "com.android.vending"
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            X.C66581MXm.A17(r10, r12, r0)     // Catch:{ SecurityException -> 0x0123 }
            android.content.Context r8 = r7.A03     // Catch:{ SecurityException -> 0x0123 }
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ SecurityException -> 0x0123 }
            java.util.List r1 = r0.queryIntentServices(r10, r4)     // Catch:{ SecurityException -> 0x0123 }
            if (r1 == 0) goto L_0x010d
            boolean r0 = r1.isEmpty()     // Catch:{ SecurityException -> 0x0123 }
            if (r0 != 0) goto L_0x010d
            java.lang.Object r0 = r1.get(r4)     // Catch:{ SecurityException -> 0x0123 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ SecurityException -> 0x0123 }
            android.content.pm.ServiceInfo r1 = r0.serviceInfo     // Catch:{ SecurityException -> 0x0123 }
            if (r1 == 0) goto L_0x010d
            java.lang.String r0 = r1.packageName     // Catch:{ SecurityException -> 0x0123 }
            java.lang.String r1 = r1.name     // Catch:{ SecurityException -> 0x0123 }
            boolean r0 = r12.equals(r0)     // Catch:{ SecurityException -> 0x0123 }
            if (r0 == 0) goto L_0x0105
            if (r1 == 0) goto L_0x0105
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ SecurityException -> 0x0123 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r12, r0)     // Catch:{ NameNotFoundException -> 0x0105 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0105 }
            r0 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r1 < r0) goto L_0x0105
            android.content.Intent r1 = new android.content.Intent     // Catch:{ SecurityException -> 0x0123 }
            r1.<init>(r10)     // Catch:{ SecurityException -> 0x0123 }
            android.content.ServiceConnection r0 = r7.A01     // Catch:{ SecurityException -> 0x0123 }
            boolean r0 = r8.bindService(r1, r0, r3)     // Catch:{ SecurityException -> 0x0123 }
            if (r0 == 0) goto L_0x00fa
            android.util.Log.isLoggable(r2, r9)     // Catch:{ SecurityException -> 0x0123 }
            goto L_0x012b
        L_0x00fa:
            java.lang.String r0 = "Connection to service is blocked."
            X.Pxg.A1O(r2, r0)     // Catch:{ SecurityException -> 0x0123 }
            r7.A00 = r4     // Catch:{ SecurityException -> 0x0123 }
            r6.A00(r3)     // Catch:{ SecurityException -> 0x0123 }
            goto L_0x012b
        L_0x0105:
            java.lang.String r0 = "Play Store missing or incompatible. Version 8.3.73 or later required."
            X.Pxg.A1O(r2, r0)     // Catch:{ SecurityException -> 0x0123 }
            r7.A00 = r4     // Catch:{ SecurityException -> 0x0123 }
            goto L_0x0118
        L_0x010d:
            r7.A00 = r4     // Catch:{ SecurityException -> 0x0123 }
            android.util.Log.isLoggable(r2, r9)     // Catch:{ SecurityException -> 0x0123 }
            goto L_0x0118
        L_0x0113:
            java.lang.String r0 = "Client was already closed and can't be reused. Please create another instance."
        L_0x0115:
            X.Pxg.A1O(r2, r0)     // Catch:{ SecurityException -> 0x0123 }
        L_0x0118:
            r6.A00(r11)     // Catch:{ SecurityException -> 0x0123 }
            goto L_0x012b
        L_0x011c:
            java.lang.String r0 = "Please provide a valid Context."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ SecurityException -> 0x0123 }
            throw r0     // Catch:{ SecurityException -> 0x0123 }
        L_0x0123:
            java.lang.String r2 = "SECURITY_EXCEPTION"
            r1 = 0
            X.0lg r0 = r5.A01
            X.C9865Rie.A00(r0, r1, r2, r13)
        L_0x012b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2324153322379948310(0x20410d2200003116, double:2.543488113488477E-153)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 == 0) goto L_0x0263
            android.content.Context r6 = r5.A00     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            X.SoL r2 = new X.SoL     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r2.<init>(r5, r13)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            java.lang.String r1 = r6.getPackageName()     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            boolean r0 = r1.isEmpty()     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 != 0) goto L_0x01da
            int r0 = r1.hashCode()     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            switch(r0) {
                case -1914449536: goto L_0x015b;
                case -1547699361: goto L_0x016a;
                case -662003450: goto L_0x0179;
                case -122760062: goto L_0x0188;
                case 419128298: goto L_0x0197;
                case 714499313: goto L_0x019a;
                case 908042537: goto L_0x01a8;
                case 908140028: goto L_0x01b6;
                case 2095523191: goto L_0x01c5;
                default: goto L_0x0150;
            }     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
        L_0x0150:
            X.RFF r1 = X.RFF.INTERNAL_UNRECOVERABLE     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            java.lang.String r0 = "packageName isn't supported"
            X.RKj r2 = new X.RKj     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r2.<init>((X.RFF) r1, (java.lang.String) r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
        L_0x015a:
            throw r2     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
        L_0x015b:
            java.lang.String r0 = "com.facebook.mlite"
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            r0 = 2
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x01d3
        L_0x016a:
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            r0 = 7
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x01d3
        L_0x0179:
            java.lang.String r0 = "com.instagram.android"
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            r0 = 4
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x01d3
        L_0x0188:
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            r0 = 6
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x01d3
        L_0x0197:
            java.lang.String r0 = "com.facebook.wakizashi"
            goto L_0x019c
        L_0x019a:
            java.lang.String r0 = "com.facebook.katana"
        L_0x019c:
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r4)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x01d3
        L_0x01a8:
            java.lang.String r0 = "com.facebook.lite"
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r3)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x01d3
        L_0x01b6:
            java.lang.String r0 = "com.facebook.orca"
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            r0 = 3
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x01d3
        L_0x01c5:
            java.lang.String r0 = "com.instagram.lite"
            boolean r0 = r1.equals(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0150
            r0 = 5
            X.QQf r1 = new X.QQf     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
        L_0x01d3:
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 != 0) goto L_0x01e8
            goto L_0x01e6
        L_0x01da:
            X.RFF r1 = X.RFF.INTERNAL_UNRECOVERABLE     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            java.lang.String r0 = "packageName cannot be empty"
            X.RKj r2 = new X.RKj     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r2.<init>((X.RFF) r1, (java.lang.String) r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x015a
        L_0x01e6:
            r4 = 0
            goto L_0x01ed
        L_0x01e8:
            X.1SF r4 = new X.1SF     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r4.<init>(r6, r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
        L_0x01ed:
            X.RxJ r3 = new X.RxJ     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r3.<init>(r6, r1, r2)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            X.S1P r2 = new X.S1P     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r2.<init>(r5, r13)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r4 != 0) goto L_0x01fa
            goto L_0x021f
        L_0x01fa:
            X.1TT r1 = r4.A00()     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            boolean r0 = r1.A06     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 != 0) goto L_0x0205
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x0221
        L_0x0205:
            boolean r0 = r1.A05     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 != 0) goto L_0x0214
            X.1Sx r0 = r1.A00     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 == 0) goto L_0x0211
            boolean r0 = r0.A05     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 != 0) goto L_0x0214
        L_0x0211:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x0221
        L_0x0214:
            r0 = 27
            boolean r0 = r4.A01(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            if (r0 != 0) goto L_0x0225
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            goto L_0x0221
        L_0x021f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
        L_0x0221:
            r2.A00(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            return
        L_0x0225:
            X.S1A r1 = r3.A04     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            X.TFv r0 = new X.TFv     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r0.<init>(r3, r2)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            r1.A00(r0)     // Catch:{ RKj -> 0x0239, Exception -> 0x0230 }
            return
        L_0x0230:
            r0 = move-exception
            X.0lg r4 = r5.A01
            java.lang.String r3 = "InstallReferrerRegistrar_OXYGEN_SDK_UNCATCHED_EXCEPTION"
            java.lang.String r2 = "unexpected exception"
            goto L_0x0241
        L_0x0239:
            r0 = move-exception
            X.0lg r4 = r5.A01
            java.lang.String r3 = "InstallReferrerRegistrar_OXYGEN_SDK_REFERRER_ERROR"
            java.lang.String r2 = "thrown an OxInstallSdkException"
        L_0x0241:
            java.lang.String r1 = " : "
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = ""
        L_0x024b:
            java.lang.String r0 = X.002.A11(r3, r1, r2, r1, r0)
            r3 = 0
            java.lang.String r2 = X.Pxg.A0o(r4)
            X.1Ln r1 = X.Pxh.A0N(r4, r0)
            if (r2 == 0) goto L_0x0260
            java.lang.String r0 = "pigeon_session_id"
            r1.A0R(r0, r2)
        L_0x0260:
            X.Pxh.A1A(r1, r13, r3)
        L_0x0263:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ri2.A00(android.content.Context, X.0aP, java.lang.String):void");
    }
}
