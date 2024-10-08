package X;

/* renamed from: X.RgZ  reason: case insensitive filesystem */
public abstract class C9777RgZ {
    /* JADX WARNING: type inference failed for: r0v38, types: [com.facebook.smartcapture.ui.IdCaptureUi, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r11 = X.RE7.A00;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r25, X.AnonymousClass6Tm r26) {
        /*
            r1 = 1
            X.0lg r8 = X.C308206Td.A0B(r25)
            androidx.fragment.app.FragmentActivity r7 = X.C308206Td.A04(r25)
            r5 = 3
            r6 = r26
            java.util.List r4 = r6.A00
            java.lang.String r10 = X.DbU.A0t(r4, r5)
            java.lang.Object r2 = r4.get(r1)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L_0x005e
            long r2 = X.AnonymousClass7TE.A0R(r2)
        L_0x001e:
            java.lang.String r11 = java.lang.String.valueOf(r2)
            com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider r0 = new com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider
            r0.<init>((X.0lg) r8)
            com.facebook.smartcapture.logging.SmartCaptureLogger r24 = r0.get(r7)
            android.os.Parcelable$Creator r0 = com.facebook.smartcapture.logging.CommonLoggingFields.CREATOR
            X.RF2 r8 = X.RF2.LOW_END
            X.0qQ.A0A(r10)
            java.lang.String r9 = "v2_id"
            r23 = 0
            com.facebook.smartcapture.logging.CommonLoggingFields r7 = new com.facebook.smartcapture.logging.CommonLoggingFields
            r12 = r23
            r13 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0 = r24
            r0.setCommonFields(r7)
            X.0lg r9 = X.C308206Td.A0B(r25)
            androidx.fragment.app.FragmentActivity r8 = X.C308206Td.A04(r25)
            java.lang.String r11 = X.DbU.A0t(r4, r5)
            X.Qca r7 = new X.Qca
            r10 = r12
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = "bloks_action_called"
            r0.logEvent(r2)
            r8 = 0
            goto L_0x0061
        L_0x005e:
            r2 = 0
            goto L_0x001e
        L_0x0061:
            java.lang.Object r2 = r4.get(r1)     // Catch:{ all -> 0x01b7 }
            boolean r0 = r2 instanceof java.lang.Number     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x00bb
            long r2 = X.AnonymousClass7TE.A0R(r2)     // Catch:{ all -> 0x01b7 }
        L_0x006d:
            java.lang.Object r0 = r6.A00()     // Catch:{ all -> 0x01b7 }
            X.DbS.A1Y(r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x00b3
            X.RE7 r11 = X.RE7.A00     // Catch:{ all -> 0x01b7 }
        L_0x007a:
            java.lang.String r12 = X.DbU.A0t(r4, r5)     // Catch:{ all -> 0x01b7 }
            r0 = 4
            X.4uI r22 = X.DbW.A0P(r6, r0)     // Catch:{ all -> 0x01b7 }
            r0 = 5
            X.4uI r21 = X.DbV.A0R(r4, r0)     // Catch:{ all -> 0x01b7 }
            r0 = 6
            java.lang.Object r15 = r6.A03(r0)     // Catch:{ all -> 0x01b7 }
            X.4tV r15 = (X.C276544tV) r15     // Catch:{ all -> 0x01b7 }
            X.0qQ.A0A(r15)     // Catch:{ all -> 0x01b7 }
            r0 = 35
            boolean r20 = r15.A0R(r0, r1)     // Catch:{ all -> 0x01b7 }
            boolean r19 = r15.A0T(r8)     // Catch:{ all -> 0x01b7 }
            r0 = 36
            boolean r18 = r15.A0R(r0, r8)     // Catch:{ all -> 0x01b7 }
            r0 = 44
            java.lang.String r17 = r15.A0K(r0)     // Catch:{ all -> 0x01b7 }
            r0 = 45
            boolean r16 = r15.A0R(r0, r8)     // Catch:{ all -> 0x01b7 }
            X.0rm r14 = X.C51965G9l.A11()     // Catch:{ all -> 0x01b7 }
            goto L_0x00be
        L_0x00b3:
            X.RE7 r11 = X.RE7.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00b8 }
            goto L_0x007a
        L_0x00b8:
            X.RE7 r11 = X.RE7.A00     // Catch:{ all -> 0x01b7 }
            goto L_0x007a
        L_0x00bb:
            r2 = 0
            goto L_0x006d
        L_0x00be:
            r6 = 0
        L_0x00bf:
            android.util.SparseArray r4 = r15.A05     // Catch:{ all -> 0x01b7 }
            int r0 = r4.size()     // Catch:{ all -> 0x01b7 }
            if (r6 >= r0) goto L_0x0107
            java.lang.Object r5 = r4.valueAt(r6)     // Catch:{ all -> 0x01b7 }
            if (r5 == 0) goto L_0x0104
            int r4 = r4.keyAt(r6)     // Catch:{ all -> 0x01b7 }
            r0 = 40
            if (r4 != r0) goto L_0x0104
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x01b7 }
            com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory r0 = new com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory     // Catch:{ all -> 0x01b7 }
            r0.<init>(r5)     // Catch:{ all -> 0x01b7 }
            r14.A00 = r0     // Catch:{ all -> 0x01b7 }
        L_0x00de:
            java.lang.Object r4 = r14.A00     // Catch:{ all -> 0x01b7 }
            com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory r4 = (com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory) r4     // Catch:{ all -> 0x01b7 }
            X.0qQ.A0A(r12)     // Catch:{ all -> 0x01b7 }
            X.AnonymousClass7TG.A1Q(r11, r12)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01b7 }
            X.0qQ.A0B(r0, r8)     // Catch:{ all -> 0x01b7 }
            r7.A0D = r0     // Catch:{ all -> 0x01b7 }
            r7.A03 = r11     // Catch:{ all -> 0x01b7 }
            r7.A01 = r2     // Catch:{ all -> 0x01b7 }
            r7.A0E = r12     // Catch:{ all -> 0x01b7 }
            r0 = r19
            r7.A0K = r0     // Catch:{ all -> 0x01b7 }
            r0 = r18
            r7.A0J = r0     // Catch:{ all -> 0x01b7 }
            r0 = r16
            r7.A0I = r0     // Catch:{ all -> 0x01b7 }
            goto L_0x014d
        L_0x0104:
            int r6 = r6 + 1
            goto L_0x00bf
        L_0x0107:
            X.4tk r13 = X.C276674ti.A00()     // Catch:{ all -> 0x01b7 }
            java.lang.ThreadLocal r0 = X.C276684tj.A01     // Catch:{ all -> 0x01b7 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x01b7 }
            X.4tl r10 = (X.C276704tl) r10     // Catch:{ all -> 0x01b7 }
            if (r10 != 0) goto L_0x0117
            X.4tl r10 = X.C276704tl.DEFAULT     // Catch:{ all -> 0x01b7 }
        L_0x0117:
            if (r13 == 0) goto L_0x00de
            X.4tl r0 = X.C276704tl.UNBOUND     // Catch:{ all -> 0x01b7 }
            if (r10 == r0) goto L_0x00de
            X.4ta r0 = r15.A06     // Catch:{ all -> 0x01b7 }
            java.lang.Object r9 = r0.A00()     // Catch:{ all -> 0x01b7 }
            android.util.SparseArray r9 = (android.util.SparseArray) r9     // Catch:{ all -> 0x01b7 }
            r6 = 0
        L_0x0126:
            int r0 = r9.size()     // Catch:{ all -> 0x01b7 }
            if (r6 >= r0) goto L_0x00de
            int r5 = r9.keyAt(r6)     // Catch:{ all -> 0x01b7 }
            X.TPR r0 = new X.TPR     // Catch:{ all -> 0x01b7 }
            r0.<init>(r15, r5)     // Catch:{ all -> 0x01b7 }
            java.lang.Object r4 = X.C276674ti.A01(r10, r13, r0)     // Catch:{ all -> 0x01b7 }
            if (r4 == 0) goto L_0x0140
            r0 = 40
            if (r5 != r0) goto L_0x0140
            goto L_0x0143
        L_0x0140:
            int r6 = r6 + 1
            goto L_0x0126
        L_0x0143:
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x01b7 }
            com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory r0 = new com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory     // Catch:{ all -> 0x01b7 }
            r0.<init>(r4)     // Catch:{ all -> 0x01b7 }
            r14.A00 = r0     // Catch:{ all -> 0x01b7 }
            goto L_0x00de
        L_0x014d:
            if (r4 == 0) goto L_0x0151
            r7.A08 = r4     // Catch:{ all -> 0x01b7 }
        L_0x0151:
            java.lang.String r2 = "XMDS"
            r0 = r17
            boolean r0 = X.0qQ.A0K(r0, r2)     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x016e
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x01b7 }
            X.0qQ.A0B(r0, r8)     // Catch:{ all -> 0x01b7 }
            r7.A0A = r0     // Catch:{ all -> 0x01b7 }
            r0 = 2132017829(0x7f1402a5, float:1.9673947E38)
            r7.A00 = r0     // Catch:{ all -> 0x01b7 }
            com.instagram.wellbeing.idverification.fragment.XMDSIgIdCaptureUi r0 = new com.instagram.wellbeing.idverification.fragment.XMDSIgIdCaptureUi     // Catch:{ all -> 0x01b7 }
            r0.<init>()     // Catch:{ all -> 0x01b7 }
            r7.A09 = r0     // Catch:{ all -> 0x01b7 }
        L_0x016e:
            if (r20 == 0) goto L_0x0174
            r0 = r23
            r7.A05 = r0     // Catch:{ all -> 0x01b7 }
        L_0x0174:
            android.content.Intent r5 = r7.A00()     // Catch:{ all -> 0x01b7 }
            r0 = r25
            X.6Rm r6 = r0.A03     // Catch:{ all -> 0x01b7 }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x01b7 }
            X.SF7 r4 = new X.SF7     // Catch:{ all -> 0x01b7 }
            r2 = r22
            r4.<init>(r6, r0, r2)     // Catch:{ all -> 0x01b7 }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x01b7 }
            X.RuE r3 = new X.RuE     // Catch:{ all -> 0x01b7 }
            r2 = r21
            r3.<init>(r6, r0, r2)     // Catch:{ all -> 0x01b7 }
            X.6Rm r0 = X.C308206Td.A09(r25)     // Catch:{ all -> 0x01b7 }
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A03(r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.IgFragmentActivity"
            X.0qQ.A0C(r2, r0)     // Catch:{ all -> 0x01b7 }
            com.instagram.base.activity.IgFragmentActivity r2 = (com.instagram.base.activity.IgFragmentActivity) r2     // Catch:{ all -> 0x01b7 }
            X.T73 r0 = new X.T73     // Catch:{ all -> 0x01b7 }
            r0.<init>(r1, r3, r4, r2)     // Catch:{ all -> 0x01b7 }
            r2.registerOnActivityResultListener(r0)     // Catch:{ all -> 0x01b7 }
            X.6Rm r0 = X.C308206Td.A09(r25)     // Catch:{ all -> 0x01b7 }
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A03(r0)     // Catch:{ all -> 0x01b7 }
            r0 = 41261(0xa12d, float:5.7819E-41)
            X.0kR.A07(r1, r5, r0)     // Catch:{ all -> 0x01b7 }
            return r23
        L_0x01b7:
            r2 = move-exception
            java.lang.String r1 = "OpenIdCapture call failed"
            r0 = r24
            r0.logError(r1, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9777RgZ.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
