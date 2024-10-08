package com.instagram.nux.deviceverification.impl;

import X.C49670F1c;

public final class VerificationPluginImpl extends C49670F1c {
    /* JADX WARNING: type inference failed for: r3v4, types: [X.63P, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.RQM, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startDeviceValidation(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.1qB r0 = X.AnonymousClass1qB.$redex_init_class
            X.1qC r0 = X.AnonymousClass1qC.$redex_init_class
            java.lang.String r1 = "c30a13e660cb14207917cd82bcef975e"
            com.instagram.strings.StringBridge$NativeStringBridge r0 = X.C10039Rlc.A00
            java.lang.String r7 = r0.nativeGetInstagramString(r1)
            X.0qQ.A07(r7)
            X.Ri7 r4 = new X.Ri7
            r4.<init>()
            long r0 = X.AnonymousClass7TG.A0I()
            if (r11 != 0) goto L_0x0021
            java.lang.String r11 = "unknown"
        L_0x0021:
            java.lang.StringBuilder r3 = X.AnonymousClass7TF.A0n(r11)
            r2 = 124(0x7c, float:1.74E-43)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r3 = X.C51967G9n.A0r(r3, r2)
            r0 = 24
            byte[] r2 = new byte[r0]
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextBytes(r2)
            java.io.ByteArrayOutputStream r1 = X.Pxe.A0b()
            byte[] r0 = X.C66582MXn.A1a(r3)     // Catch:{ IOException -> 0x0057 }
            r1.write(r0)     // Catch:{ IOException -> 0x0057 }
            r1.write(r2)     // Catch:{ IOException -> 0x0057 }
            byte[] r8 = r1.toByteArray()
            if (r8 == 0) goto L_0x0058
            r0 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r8, r0)
            goto L_0x005b
        L_0x0057:
            r8 = 0
        L_0x0058:
            java.lang.String r5 = "unknown"
        L_0x005b:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.A00
            int r1 = X.Pxe.A05(r10, r0)
            if (r1 == 0) goto L_0x0086
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            java.lang.String r1 = com.google.android.gms.common.ConnectionResult.A00(r1)
            X.0qQ.A07(r1)
            X.0qQ.A0A(r5)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "GOOGLE_PLAY_UNAVAILABLE: "
            java.lang.String r2 = X.002.A0R(r0, r1)
            X.1xC r1 = X.1xC.A01
            X.FVs r0 = new X.FVs
            r0.<init>(r2, r3, r5)
            r1.A00(r0)
            return
        L_0x0086:
            java.lang.String r3 = "VERIFICATION_PENDING: request time is "
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "1000"
            java.lang.String r3 = X.002.A0e(r3, r2, r0)
            X.0qQ.A0A(r5)
            X.AnonymousClass7TF.A1H(r3, r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.1xC r1 = X.1xC.A01
            X.FVs r0 = new X.FVs
            r0.<init>(r3, r2, r5)
            r1.A00(r0)
            X.63K r6 = X.C10117Rmt.A00
            X.63O r3 = new X.63O
            r3.<init>()
            r2 = 0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            X.63N r1 = new X.63N
            r1.<init>(r0, r3)
            X.QpK r0 = new X.QpK
            r0.<init>((android.content.Context) r10, (X.AnonymousClass63L) r2, (X.AnonymousClass63K) r6, (X.AnonymousClass63N) r1)
            X.0qQ.A0A(r8)
            X.0qQ.A0A(r7)
            X.63S r0 = r0.A05
            X.Qxa r1 = new X.Qxa
            r1.<init>(r0, r7, r8)
            r0.A06(r1)
            X.QpV r0 = new X.QpV
            r0.<init>()
            X.9GD r3 = X.SMT.A01(r1, r0)
            r0 = 7
            X.PmN r2 = new X.PmN
            r2.<init>(r5, r4, r0)
            r0 = 2
            X.SzH r1 = new X.SzH
            r1.<init>(r0, r2)
            java.util.concurrent.Executor r0 = X.AnonymousClass9GH.A00
            r3.A04(r1, r0)
            X.Sz6 r0 = new X.Sz6
            r0.<init>(r4, r5)
            r3.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.deviceverification.impl.VerificationPluginImpl.startDeviceValidation(android.content.Context, java.lang.String):void");
    }
}
