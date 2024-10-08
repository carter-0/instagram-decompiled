package X;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.5Sr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285785Sr implements Runnable {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ C285785Sr(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02fe, code lost:
        if (r13 == false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0307, code lost:
        if (r13 != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0684, code lost:
        if (((r24 & ((r24 ^ -1) << 6)) & -9187201950435737472L) != 0) goto L_0x0692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        if (r10 == false) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r43 = this;
            r0 = r43
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = r0.A00
            X.01K r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0Y
            java.lang.String r1 = "measureAndLayout"
            r0 = -2054542087(0xffffffff858a2cf9, float:-1.2993978E-35)
            X.0fg.A01(r1, r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.A0R     // Catch:{ all -> 0x0755 }
            r42 = r0
            r34 = 0
            r22 = 1
            r1 = r0
            r0 = r22
            r1.Co0(r0)     // Catch:{ all -> 0x0755 }
            r0 = -890216084(0xffffffffcaf0616c, float:-7876790.0)
            X.0fg.A00(r0)
            r1 = -1231811211(0xffffffffb6940d75, float:-4.4123103E-6)
            java.lang.String r0 = "checkForSemanticsChanges"
            X.0fg.A01(r0, r1)
            java.lang.String r1 = "sendAccessibilitySemanticsStructureChangeEvents"
            r0 = -983242524(0xffffffffc564e8e4, float:-3662.5557)
            X.0fg.A01(r1, r0)     // Catch:{ all -> 0x0750 }
            boolean r0 = r6.A0b()     // Catch:{ all -> 0x0748 }
            if (r0 == 0) goto L_0x0045
            r0 = r42
            X.5SP r0 = r0.A0l     // Catch:{ all -> 0x0748 }
            X.5SX r1 = r0.A00()     // Catch:{ all -> 0x0748 }
            X.5SY r0 = r6.A0B     // Catch:{ all -> 0x0748 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0I(r6, r0, r1)     // Catch:{ all -> 0x0748 }
        L_0x0045:
            r0 = 2028571907(0x78e98d03, float:3.7895788E34)
            X.0fg.A00(r0)     // Catch:{ all -> 0x0750 }
            r1 = -732992044(0xffffffffd44f6dd4, float:-3.56360336E12)
            java.lang.String r0 = "sendSemanticsPropertyChangeEvents"
            X.0fg.A01(r0, r1)     // Catch:{ all -> 0x0750 }
            X.01O r23 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)     // Catch:{ all -> 0x0743 }
            java.util.List r0 = r6.A0U     // Catch:{ all -> 0x0743 }
            r41 = r0
            java.util.ArrayList r24 = new java.util.ArrayList     // Catch:{ all -> 0x0743 }
            r1 = r24
            r1.<init>(r0)     // Catch:{ all -> 0x0743 }
            r41.clear()     // Catch:{ all -> 0x0743 }
            r0 = r23
            int[] r0 = r0.A02     // Catch:{ all -> 0x0743 }
            r25 = r0
            r0 = r23
            long[] r0 = r0.A03     // Catch:{ all -> 0x0743 }
            r26 = r0
            int r0 = r0.length     // Catch:{ all -> 0x0743 }
            int r27 = r0 + -2
            if (r27 < 0) goto L_0x0552
            r8 = 0
        L_0x0077:
            r16 = r26[r8]     // Catch:{ all -> 0x0743 }
            r3 = -1
            long r3 = r3 ^ r16
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r16
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0540
            int r0 = r8 - r27
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r30 = 8
            int r29 = 8 - r0
            r28 = 0
        L_0x0097:
            r1 = r28
            r0 = r29
            if (r1 >= r0) goto L_0x053b
            r0 = 255(0xff, double:1.26E-321)
            long r3 = r16 & r0
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0535
            int r0 = r8 << 3
            int r0 = r0 + r28
            r5 = r25[r0]     // Catch:{ all -> 0x0743 }
            X.0yC r0 = r6.A06     // Catch:{ all -> 0x0743 }
            java.lang.Object r4 = r0.A03(r5)     // Catch:{ all -> 0x0743 }
            X.5SY r4 = (X.AnonymousClass5SY) r4     // Catch:{ all -> 0x0743 }
            if (r4 == 0) goto L_0x0535
            r0 = r23
            java.lang.Object r0 = r0.A03(r5)     // Catch:{ all -> 0x0743 }
            X.5ex r0 = (X.C290215ex) r0     // Catch:{ all -> 0x0743 }
            r3 = 0
            if (r0 == 0) goto L_0x0548
            X.5SX r7 = r0.A01     // Catch:{ all -> 0x0743 }
            X.5SV r2 = r7.A05     // Catch:{ all -> 0x0743 }
            java.util.Iterator r31 = r2.iterator()     // Catch:{ all -> 0x0743 }
            r18 = 0
        L_0x00cc:
            boolean r0 = r31.hasNext()     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0502
            java.lang.Object r11 = r31.next()     // Catch:{ all -> 0x0743 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = r11.getKey()     // Catch:{ all -> 0x0743 }
            X.5Sb r9 = X.AnonymousClass5SZ.A08     // Catch:{ all -> 0x0743 }
            boolean r0 = X.0qQ.A0K(r0, r9)     // Catch:{ all -> 0x0743 }
            if (r0 != 0) goto L_0x00f0
            java.lang.Object r1 = r11.getKey()     // Catch:{ all -> 0x0743 }
            X.5Sb r0 = X.AnonymousClass5SZ.A0W     // Catch:{ all -> 0x0743 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0122
        L_0x00f0:
            int r10 = r24.size()     // Catch:{ all -> 0x0743 }
            r1 = 0
        L_0x00f5:
            if (r1 >= r10) goto L_0x0113
            r0 = r24
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0743 }
            X.9Om r0 = (X.C378099Om) r0     // Catch:{ all -> 0x0743 }
            int r0 = r0.A04     // Catch:{ all -> 0x0743 }
            if (r0 != r5) goto L_0x010e
            r0 = r24
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0743 }
            X.9Om r1 = (X.C378099Om) r1     // Catch:{ all -> 0x0743 }
            if (r1 == 0) goto L_0x0113
            goto L_0x0111
        L_0x010e:
            int r1 = r1 + 1
            goto L_0x00f5
        L_0x0111:
            r10 = 0
            goto L_0x011b
        L_0x0113:
            X.9Om r1 = new X.9Om     // Catch:{ all -> 0x0743 }
            r0 = r41
            r1.<init>(r0, r5)     // Catch:{ all -> 0x0743 }
            r10 = 1
        L_0x011b:
            r0 = r41
            r0.add(r1)     // Catch:{ all -> 0x0743 }
            if (r10 != 0) goto L_0x0139
        L_0x0122:
            java.lang.Object r1 = r11.getValue()     // Catch:{ all -> 0x0743 }
            X.5SV r10 = r4.A01     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = r11.getKey()     // Catch:{ all -> 0x0743 }
            X.5Sb r0 = (X.C285635Sb) r0     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = X.C285765So.A00(r10, r0)     // Catch:{ all -> 0x0743 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0139
            goto L_0x00cc
        L_0x0139:
            java.lang.Object r0 = r11.getKey()     // Catch:{ all -> 0x0743 }
            X.5Sb r1 = X.AnonymousClass5SZ.A0J     // Catch:{ all -> 0x0743 }
            boolean r10 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            if (r10 == 0) goto L_0x0161
            java.lang.Object r9 = r11.getValue()     // Catch:{ all -> 0x0743 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r9, r0)     // Catch:{ all -> 0x0743 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0743 }
            X.5SV r0 = r4.A01     // Catch:{ all -> 0x0743 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x0743 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x00cc
            r0 = r30
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r6, r9, r5, r0)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x0161:
            X.5Sb r1 = X.AnonymousClass5SZ.A0P     // Catch:{ all -> 0x0743 }
            boolean r1 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            if (r1 == 0) goto L_0x016a
            goto L_0x0171
        L_0x016a:
            X.5Sb r1 = X.AnonymousClass5SZ.A0U     // Catch:{ all -> 0x0743 }
            boolean r1 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            goto L_0x0172
        L_0x0171:
            r1 = 1
        L_0x0172:
            r13 = 64
            if (r1 == 0) goto L_0x0190
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0743 }
            r9 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r0, r3, r1, r9)     // Catch:{ all -> 0x0743 }
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r0, r3, r1, r9)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x0190:
            X.5Sb r1 = X.AnonymousClass5SZ.A0L     // Catch:{ all -> 0x0743 }
            boolean r1 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            if (r1 == 0) goto L_0x01b2
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0743 }
            r9 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r0, r3, r1, r9)     // Catch:{ all -> 0x0743 }
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r0, r3, r1, r9)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x01b2:
            X.5Sb r1 = X.AnonymousClass5SZ.A0O     // Catch:{ all -> 0x0743 }
            boolean r12 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            r10 = 4
            if (r12 == 0) goto L_0x0250
            X.5Sb r0 = X.AnonymousClass5SZ.A0M     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = X.C285765So.A00(r2, r0)     // Catch:{ all -> 0x0743 }
            X.5aV r0 = (X.C287625aV) r0     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0236
            int r0 = r0.A00     // Catch:{ all -> 0x0743 }
            if (r0 != r10) goto L_0x0236
            java.lang.Object r1 = X.C285765So.A00(r2, r1)     // Catch:{ all -> 0x0743 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x0743 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0227
            int r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            android.view.accessibility.AccessibilityEvent r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A04(r6, r0, r10)     // Catch:{ all -> 0x0743 }
            X.4cD r10 = r7.A03     // Catch:{ all -> 0x0743 }
            X.5R6 r1 = r7.A04     // Catch:{ all -> 0x0743 }
            X.5SX r11 = new X.5SX     // Catch:{ all -> 0x0743 }
            r0 = r22
            r11.<init>(r10, r1, r2, r0)     // Catch:{ all -> 0x0743 }
            X.5SV r1 = r11.A06()     // Catch:{ all -> 0x0743 }
            X.5Sb r0 = X.AnonymousClass5SZ.A02     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = X.C285765So.A00(r1, r0)     // Catch:{ all -> 0x0743 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0743 }
            java.lang.String r1 = ","
            if (r0 == 0) goto L_0x0211
            java.lang.String r10 = X.C290155eq.A00(r1, r0)     // Catch:{ all -> 0x0743 }
        L_0x01fe:
            X.5SV r11 = r11.A06()     // Catch:{ all -> 0x0743 }
            X.5Sb r0 = X.AnonymousClass5SZ.A0R     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = X.C285765So.A00(r11, r0)     // Catch:{ all -> 0x0743 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0213
            java.lang.String r1 = X.C290155eq.A00(r1, r0)     // Catch:{ all -> 0x0743 }
            goto L_0x0214
        L_0x0211:
            r10 = r3
            goto L_0x01fe
        L_0x0213:
            r1 = r3
        L_0x0214:
            if (r10 == 0) goto L_0x0219
            r9.setContentDescription(r10)     // Catch:{ all -> 0x0743 }
        L_0x0219:
            if (r1 == 0) goto L_0x0222
            java.util.List r0 = r9.getText()     // Catch:{ all -> 0x0743 }
            r0.add(r1)     // Catch:{ all -> 0x0743 }
        L_0x0222:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0D(r9, r6)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x0227:
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0743 }
            r0 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r1, r3, r9, r0)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x0236:
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0743 }
            r9 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r0, r3, r1, r9)     // Catch:{ all -> 0x0743 }
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r0, r3, r1, r9)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x0250:
            X.5Sb r1 = X.AnonymousClass5SZ.A02     // Catch:{ all -> 0x0743 }
            boolean r1 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            if (r1 == 0) goto L_0x0275
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0743 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x0743 }
            r0 = 5
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0743 }
            X.0qQ.A0C(r11, r0)     // Catch:{ all -> 0x0743 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r10, r11, r9, r1)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x0275:
            X.5Sb r1 = X.AnonymousClass5SZ.A04     // Catch:{ all -> 0x0743 }
            boolean r10 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            java.lang.String r13 = ""
            if (r10 == 0) goto L_0x037e
            X.5Sb r9 = X.C290125en.A0O     // Catch:{ all -> 0x0743 }
            java.util.Map r0 = r2.A02     // Catch:{ all -> 0x0743 }
            r33 = r0
            boolean r0 = r0.containsKey(r9)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x036e
            X.5SV r0 = r4.A01     // Catch:{ all -> 0x0743 }
            r32 = r0
            java.lang.Object r12 = X.C285765So.A00(r0, r1)     // Catch:{ all -> 0x0743 }
            X.5Tq r12 = (X.C286025Tq) r12     // Catch:{ all -> 0x0743 }
            if (r12 != 0) goto L_0x0298
            r12 = r13
        L_0x0298:
            java.lang.Object r14 = X.C285765So.A00(r2, r1)     // Catch:{ all -> 0x0743 }
            X.5Tq r14 = (X.C286025Tq) r14     // Catch:{ all -> 0x0743 }
            if (r14 != 0) goto L_0x02a1
            r14 = r13
        L_0x02a1:
            java.lang.CharSequence r21 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r14)     // Catch:{ all -> 0x0743 }
            int r11 = r12.length()     // Catch:{ all -> 0x0743 }
            int r10 = r14.length()     // Catch:{ all -> 0x0743 }
            r20 = r11
            if (r11 <= r10) goto L_0x02b3
            r20 = r10
        L_0x02b3:
            r9 = 0
        L_0x02b4:
            r0 = r20
            if (r9 >= r0) goto L_0x02c5
            char r13 = r12.charAt(r9)     // Catch:{ all -> 0x0743 }
            char r0 = r14.charAt(r9)     // Catch:{ all -> 0x0743 }
            if (r13 != r0) goto L_0x02c5
            int r9 = r9 + 1
            goto L_0x02b4
        L_0x02c5:
            r15 = 0
        L_0x02c6:
            int r0 = r20 - r9
            if (r15 >= r0) goto L_0x02df
            int r0 = r11 + -1
            int r0 = r0 - r15
            char r19 = r12.charAt(r0)     // Catch:{ all -> 0x0743 }
            int r0 = r10 + -1
            int r0 = r0 - r15
            char r13 = r14.charAt(r0)     // Catch:{ all -> 0x0743 }
            r0 = r19
            if (r0 != r13) goto L_0x02df
            int r15 = r15 + 1
            goto L_0x02c6
        L_0x02df:
            int r11 = r11 - r15
            int r11 = r11 - r9
            int r14 = r10 - r15
            int r14 = r14 - r9
            X.5Sb r13 = X.AnonymousClass5SZ.A0K     // Catch:{ all -> 0x0743 }
            r0 = r32
            java.util.Map r15 = r0.A02     // Catch:{ all -> 0x0743 }
            boolean r20 = r15.containsKey(r13)     // Catch:{ all -> 0x0743 }
            r0 = r33
            boolean r13 = r0.containsKey(r13)     // Catch:{ all -> 0x0743 }
            boolean r0 = r15.containsKey(r1)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0300
            if (r20 != 0) goto L_0x0300
            r19 = 1
            if (r13 != 0) goto L_0x0309
        L_0x0300:
            r19 = 0
            if (r0 == 0) goto L_0x0309
            if (r20 == 0) goto L_0x0309
            r15 = 1
            if (r13 == 0) goto L_0x030d
        L_0x0309:
            r15 = 0
            if (r19 != 0) goto L_0x030d
            goto L_0x0322
        L_0x030d:
            int r14 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0743 }
            r9 = r6
            r10 = r21
            r12 = r11
            android.view.accessibility.AccessibilityEvent r13 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A05(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0743 }
            goto L_0x0341
        L_0x0322:
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            r0 = 16
            android.view.accessibility.AccessibilityEvent r13 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A04(r6, r1, r0)     // Catch:{ all -> 0x0743 }
            r13.setFromIndex(r9)     // Catch:{ all -> 0x0743 }
            r13.setRemovedCount(r11)     // Catch:{ all -> 0x0743 }
            r13.setAddedCount(r14)     // Catch:{ all -> 0x0743 }
            r13.setBeforeText(r12)     // Catch:{ all -> 0x0743 }
            java.util.List r1 = r13.getText()     // Catch:{ all -> 0x0743 }
            r0 = r21
            r1.add(r0)     // Catch:{ all -> 0x0743 }
        L_0x0341:
            java.lang.String r0 = "android.widget.EditText"
            r13.setClassName(r0)     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0D(r13, r6)     // Catch:{ all -> 0x0743 }
            if (r19 != 0) goto L_0x034d
            if (r15 == 0) goto L_0x00cc
        L_0x034d:
            X.5Sb r0 = X.AnonymousClass5SZ.A0S     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = r2.A00(r0)     // Catch:{ all -> 0x0743 }
            X.5Tk r0 = (X.C285965Tk) r0     // Catch:{ all -> 0x0743 }
            long r0 = r0.A00     // Catch:{ all -> 0x0743 }
            r9 = 32
            long r9 = r0 >> r9
            int r11 = (int) r9     // Catch:{ all -> 0x0743 }
            r13.setFromIndex(r11)     // Catch:{ all -> 0x0743 }
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r9
            int r9 = (int) r0     // Catch:{ all -> 0x0743 }
            r13.setToIndex(r9)     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0D(r13, r6)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x036e:
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0743 }
            r0 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r1, r3, r9, r0)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x037e:
            X.5Sb r10 = X.AnonymousClass5SZ.A0S     // Catch:{ all -> 0x0743 }
            boolean r12 = X.0qQ.A0K(r0, r10)     // Catch:{ all -> 0x0743 }
            if (r12 == 0) goto L_0x03cf
            java.lang.Object r0 = X.C285765So.A00(r2, r1)     // Catch:{ all -> 0x0743 }
            X.5Tq r0 = (X.C286025Tq) r0     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0393
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0393
            r13 = r0
        L_0x0393:
            java.lang.Object r0 = r2.A00(r10)     // Catch:{ all -> 0x0743 }
            X.5Tk r0 = (X.C285965Tk) r0     // Catch:{ all -> 0x0743 }
            long r0 = r0.A00     // Catch:{ all -> 0x0743 }
            int r40 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            r9 = 32
            long r9 = r0 >> r9
            int r11 = (int) r9     // Catch:{ all -> 0x0743 }
            java.lang.Integer r37 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0743 }
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r9
            int r9 = (int) r0     // Catch:{ all -> 0x0743 }
            java.lang.Integer r38 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0743 }
            int r0 = r13.length()     // Catch:{ all -> 0x0743 }
            java.lang.Integer r39 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0743 }
            java.lang.CharSequence r36 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r13)     // Catch:{ all -> 0x0743 }
            r35 = r6
            android.view.accessibility.AccessibilityEvent r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A05(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0D(r0, r6)     // Catch:{ all -> 0x0743 }
            int r0 = r7.A02     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0G(r6, r0)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x03cf:
            boolean r1 = X.0qQ.A0K(r0, r9)     // Catch:{ all -> 0x0743 }
            if (r1 != 0) goto L_0x04c2
            X.5Sb r1 = X.AnonymousClass5SZ.A0W     // Catch:{ all -> 0x0743 }
            boolean r1 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            if (r1 != 0) goto L_0x04c2
            X.5Sb r1 = X.AnonymousClass5SZ.A06     // Catch:{ all -> 0x0743 }
            boolean r1 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            if (r1 == 0) goto L_0x0416
            java.lang.Object r1 = r11.getValue()     // Catch:{ all -> 0x0743 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0743 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0743 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0405
            int r0 = r7.A02     // Catch:{ all -> 0x0743 }
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r0)     // Catch:{ all -> 0x0743 }
            r0 = r30
            android.view.accessibility.AccessibilityEvent r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A04(r6, r1, r0)     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0D(r0, r6)     // Catch:{ all -> 0x0743 }
        L_0x0405:
            int r0 = r7.A02     // Catch:{ all -> 0x0743 }
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r0)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0743 }
            r0 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r1, r3, r9, r0)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x0416:
            X.5Sb r1 = X.C290125en.A03     // Catch:{ all -> 0x0743 }
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x047b
            java.lang.Object r9 = r2.A00(r1)     // Catch:{ all -> 0x0743 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0743 }
            X.5SV r0 = r4.A01     // Catch:{ all -> 0x0743 }
            java.lang.Object r11 = X.C285765So.A00(r0, r1)     // Catch:{ all -> 0x0743 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0743 }
            if (r11 == 0) goto L_0x046f
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0743 }
            r10.<init>()     // Catch:{ all -> 0x0743 }
            int r12 = r9.size()     // Catch:{ all -> 0x0743 }
            r1 = 0
        L_0x0438:
            if (r1 >= r12) goto L_0x0448
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x0743 }
            X.6Eq r0 = (X.C304646Eq) r0     // Catch:{ all -> 0x0743 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0743 }
            r10.add(r0)     // Catch:{ all -> 0x0743 }
            int r1 = r1 + 1
            goto L_0x0438
        L_0x0448:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0743 }
            r9.<init>()     // Catch:{ all -> 0x0743 }
            int r12 = r11.size()     // Catch:{ all -> 0x0743 }
            r1 = 0
        L_0x0452:
            if (r1 >= r12) goto L_0x0462
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x0743 }
            X.6Eq r0 = (X.C304646Eq) r0     // Catch:{ all -> 0x0743 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0743 }
            r9.add(r0)     // Catch:{ all -> 0x0743 }
            int r1 = r1 + 1
            goto L_0x0452
        L_0x0462:
            boolean r0 = r10.containsAll(r9)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x04be
            boolean r0 = r9.containsAll(r10)     // Catch:{ all -> 0x0743 }
            if (r0 != 0) goto L_0x04ba
            goto L_0x04be
        L_0x046f:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0743 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00cc
            r18 = 1
            goto L_0x00cc
        L_0x047b:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0743 }
            boolean r0 = r0 instanceof X.C290145ep     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x04be
            java.lang.Object r10 = r11.getValue()     // Catch:{ all -> 0x0743 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            X.0qQ.A0C(r10, r0)     // Catch:{ all -> 0x0743 }
            X.5ep r10 = (X.C290145ep) r10     // Catch:{ all -> 0x0743 }
            X.5SV r1 = r4.A01     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = r11.getKey()     // Catch:{ all -> 0x0743 }
            X.5Sb r0 = (X.C285635Sb) r0     // Catch:{ all -> 0x0743 }
            java.lang.Object r9 = X.C285765So.A00(r1, r0)     // Catch:{ all -> 0x0743 }
            if (r10 == r9) goto L_0x04ba
            boolean r0 = r9 instanceof X.C290145ep     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x04be
            java.lang.String r1 = r10.A00     // Catch:{ all -> 0x0743 }
            X.5ep r9 = (X.C290145ep) r9     // Catch:{ all -> 0x0743 }
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x0743 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x04be
            X.0eL r0 = r10.A01     // Catch:{ all -> 0x0743 }
            if (r0 != 0) goto L_0x04b5
            X.0eL r0 = r9.A01     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x04ba
            goto L_0x04be
        L_0x04b5:
            X.0eL r0 = r9.A01     // Catch:{ all -> 0x0743 }
            if (r0 != 0) goto L_0x04ba
            goto L_0x04be
        L_0x04ba:
            r18 = 0
            goto L_0x00cc
        L_0x04be:
            r18 = 1
            goto L_0x00cc
        L_0x04c2:
            X.5R6 r0 = r7.A04     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0F(r0, r6)     // Catch:{ all -> 0x0743 }
            int r10 = r41.size()     // Catch:{ all -> 0x0743 }
            r1 = 0
        L_0x04cc:
            if (r1 >= r10) goto L_0x04cf
            goto L_0x04d1
        L_0x04cf:
            r1 = 0
            goto L_0x04e5
        L_0x04d1:
            r0 = r41
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0743 }
            X.9Om r0 = (X.C378099Om) r0     // Catch:{ all -> 0x0743 }
            int r0 = r0.A04     // Catch:{ all -> 0x0743 }
            if (r0 != r5) goto L_0x04ff
            r0 = r41
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0743 }
            X.9Om r1 = (X.C378099Om) r1     // Catch:{ all -> 0x0743 }
        L_0x04e5:
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = X.C285765So.A00(r2, r9)     // Catch:{ all -> 0x0743 }
            X.6IQ r0 = (X.AnonymousClass6IQ) r0     // Catch:{ all -> 0x0743 }
            r1.A00 = r0     // Catch:{ all -> 0x0743 }
            X.5Sb r0 = X.AnonymousClass5SZ.A0W     // Catch:{ all -> 0x0743 }
            java.lang.Object r0 = X.C285765So.A00(r2, r0)     // Catch:{ all -> 0x0743 }
            X.6IQ r0 = (X.AnonymousClass6IQ) r0     // Catch:{ all -> 0x0743 }
            r1.A01 = r0     // Catch:{ all -> 0x0743 }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0H(r6, r1)     // Catch:{ all -> 0x0743 }
            goto L_0x00cc
        L_0x04ff:
            int r1 = r1 + 1
            goto L_0x04cc
        L_0x0502:
            if (r18 != 0) goto L_0x0528
            X.5SV r0 = r4.A01     // Catch:{ all -> 0x0743 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0743 }
        L_0x050a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0743 }
            if (r0 == 0) goto L_0x0535
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0743 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0743 }
            X.5SV r0 = r7.A06()     // Catch:{ all -> 0x0743 }
            java.lang.Object r1 = r1.getKey()     // Catch:{ all -> 0x0743 }
            X.5Sb r1 = (X.C285635Sb) r1     // Catch:{ all -> 0x0743 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x0743 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0743 }
            if (r0 != 0) goto L_0x050a
        L_0x0528:
            int r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r5)     // Catch:{ all -> 0x0743 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0743 }
            r0 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r6, r1, r3, r2, r0)     // Catch:{ all -> 0x0743 }
        L_0x0535:
            long r16 = r16 >> r30
            int r28 = r28 + 1
            goto L_0x0097
        L_0x053b:
            r1 = r0
            r0 = r30
            if (r1 != r0) goto L_0x0552
        L_0x0540:
            r0 = r27
            if (r8 == r0) goto L_0x0552
            int r8 = r8 + 1
            goto L_0x0077
        L_0x0548:
            java.lang.String r0 = "no value for specified key"
            X.I2E.A02(r0)     // Catch:{ all -> 0x0743 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0743 }
            throw r0     // Catch:{ all -> 0x0743 }
        L_0x0552:
            r0 = -1928965047(0xffffffff8d065449, float:-4.1393393E-31)
            X.0fg.A00(r0)     // Catch:{ all -> 0x0750 }
            r1 = -2142660324(0xffffffff8049991c, float:-6.758917E-39)
            java.lang.String r0 = "updateSemanticsNodesCopyAndPanes"
            X.0fg.A01(r0, r1)     // Catch:{ all -> 0x0750 }
            X.0yB r9 = new X.0yB     // Catch:{ all -> 0x073e }
            r9.<init>()     // Catch:{ all -> 0x073e }
            long[] r0 = X.01o.A00     // Catch:{ all -> 0x073e }
            r12 = 6
            X.C63090yB.A02(r9, r12)     // Catch:{ all -> 0x073e }
            X.0yB r11 = r6.A07     // Catch:{ all -> 0x073e }
            int[] r14 = r11.A02     // Catch:{ all -> 0x073e }
            long[] r13 = r11.A03     // Catch:{ all -> 0x073e }
            int r0 = r13.length     // Catch:{ all -> 0x073e }
            int r8 = r0 + -2
            r22 = 128(0x80, double:6.32E-322)
            r20 = 255(0xff, double:1.26E-321)
            r33 = 7
            r18 = -1
            r31 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = 8
            if (r8 < 0) goto L_0x05f0
            r7 = 0
        L_0x0586:
            r15 = r13[r7]     // Catch:{ all -> 0x073e }
            long r3 = r15 ^ r18
            long r3 = r3 << r33
            long r1 = r15 & r3
            long r1 = r1 & r31
            int r0 = (r1 > r31 ? 1 : (r1 == r31 ? 0 : -1))
            if (r0 == 0) goto L_0x05eb
            int r0 = r7 - r8
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r5 = 8 - r0
            r4 = 0
        L_0x059d:
            if (r4 >= r5) goto L_0x05e9
            long r1 = r15 & r20
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x05e5
            int r0 = r7 << 3
            int r0 = r0 + r4
            r3 = r14[r0]     // Catch:{ all -> 0x073e }
            X.01O r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)     // Catch:{ all -> 0x073e }
            java.lang.Object r0 = r0.A03(r3)     // Catch:{ all -> 0x073e }
            X.5ex r0 = (X.C290215ex) r0     // Catch:{ all -> 0x073e }
            if (r0 == 0) goto L_0x05c4
            X.5SX r0 = r0.A01     // Catch:{ all -> 0x073e }
            X.5SV r0 = r0.A05     // Catch:{ all -> 0x073e }
            X.5Sb r1 = X.AnonymousClass5SZ.A0J     // Catch:{ all -> 0x073e }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x073e }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x073e }
            if (r0 != 0) goto L_0x05e5
        L_0x05c4:
            r9.A06(r3)     // Catch:{ all -> 0x073e }
            r2 = 32
            X.0yC r0 = r6.A06     // Catch:{ all -> 0x073e }
            java.lang.Object r0 = r0.A03(r3)     // Catch:{ all -> 0x073e }
            X.5SY r0 = (X.AnonymousClass5SY) r0     // Catch:{ all -> 0x073e }
            if (r0 == 0) goto L_0x05e3
            X.5SV r1 = r0.A01     // Catch:{ all -> 0x073e }
            if (r1 == 0) goto L_0x05e3
            X.5Sb r0 = X.AnonymousClass5SZ.A0J     // Catch:{ all -> 0x073e }
            java.lang.Object r0 = X.C285765So.A00(r1, r0)     // Catch:{ all -> 0x073e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x073e }
        L_0x05df:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r6, r0, r3, r2)     // Catch:{ all -> 0x073e }
            goto L_0x05e5
        L_0x05e3:
            r0 = 0
            goto L_0x05df
        L_0x05e5:
            long r15 = r15 >> r10
            int r4 = r4 + 1
            goto L_0x059d
        L_0x05e9:
            if (r5 != r10) goto L_0x05f0
        L_0x05eb:
            if (r7 == r8) goto L_0x05f0
            int r7 = r7 + 1
            goto L_0x0586
        L_0x05f0:
            int[] r0 = r9.A02     // Catch:{ all -> 0x073e }
            r30 = r0
            long[] r9 = r9.A03     // Catch:{ all -> 0x073e }
            int r0 = r9.length     // Catch:{ all -> 0x073e }
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x06a0
            r7 = 0
        L_0x05fc:
            r28 = r9[r7]     // Catch:{ all -> 0x073e }
            long r1 = r18 ^ r28
            long r1 = r1 << r33
            long r1 = r1 & r28
            long r1 = r1 & r31
            int r0 = (r1 > r31 ? 1 : (r1 == r31 ? 0 : -1))
            if (r0 == 0) goto L_0x069a
            int r0 = r7 - r8
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r5 = 8 - r0
            r4 = 0
        L_0x0613:
            if (r4 >= r5) goto L_0x0698
            long r1 = r20 & r28
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x0692
            int r0 = r7 << 3
            int r0 = r0 + r4
            r3 = r30[r0]     // Catch:{ all -> 0x073e }
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r3
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r15 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r11.A00     // Catch:{ all -> 0x073e }
            int r26 = r1 >>> 7
            r26 = r26 & r2
            r27 = 0
        L_0x0631:
            long[] r1 = r11.A03     // Catch:{ all -> 0x073e }
            int r13 = r26 >> 3
            r0 = r26 & 7
            int r0 = r0 << 3
            r16 = r1[r13]     // Catch:{ all -> 0x073e }
            long r16 = r16 >>> r0
            int r13 = r13 + 1
            r24 = r1[r13]     // Catch:{ all -> 0x073e }
            int r1 = 64 - r0
            long r24 = r24 << r1
            long r13 = (long) r0     // Catch:{ all -> 0x073e }
            long r0 = -r13
            r13 = 63
            long r0 = r0 >> r13
            long r24 = r24 & r0
            long r24 = r24 | r16
            long r0 = (long) r15     // Catch:{ all -> 0x073e }
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r16
            long r0 = r0 ^ r24
            long r13 = r0 - r16
            long r0 = r0 ^ r18
            long r0 = r0 & r13
            long r0 = r0 & r31
        L_0x065f:
            r16 = 0
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x067b
            int r13 = java.lang.Long.numberOfTrailingZeros(r0)     // Catch:{ all -> 0x073e }
            int r14 = r13 >> 3
            int r14 = r14 + r26
            r14 = r14 & r2
            int[] r13 = r11.A02     // Catch:{ all -> 0x073e }
            r13 = r13[r14]     // Catch:{ all -> 0x073e }
            if (r13 != r3) goto L_0x0675
            goto L_0x068d
        L_0x0675:
            r16 = 1
            long r13 = r0 - r16
            long r0 = r0 & r13
            goto L_0x065f
        L_0x067b:
            long r0 = r24 ^ r18
            long r0 = r0 << r12
            long r24 = r24 & r0
            long r24 = r24 & r31
            int r0 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0692
            int r27 = r27 + 8
            int r26 = r26 + r27
            r26 = r26 & r2
            goto L_0x0631
        L_0x068d:
            if (r14 < 0) goto L_0x0692
            X.C63090yB.A03(r11, r14)     // Catch:{ all -> 0x073e }
        L_0x0692:
            long r28 = r28 >> r10
            int r4 = r4 + 1
            goto L_0x0613
        L_0x0698:
            if (r5 != r10) goto L_0x06a0
        L_0x069a:
            if (r7 == r8) goto L_0x06a0
            int r7 = r7 + 1
            goto L_0x05fc
        L_0x06a0:
            X.0yC r14 = r6.A06     // Catch:{ all -> 0x073e }
            r14.A06()     // Catch:{ all -> 0x073e }
            X.01O r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)     // Catch:{ all -> 0x073e }
            int[] r13 = r0.A02     // Catch:{ all -> 0x073e }
            java.lang.Object[] r12 = r0.A04     // Catch:{ all -> 0x073e }
            long[] r9 = r0.A03     // Catch:{ all -> 0x073e }
            int r0 = r9.length     // Catch:{ all -> 0x073e }
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x071a
            r7 = 0
        L_0x06b5:
            r16 = r9[r7]     // Catch:{ all -> 0x073e }
            long r3 = r16 ^ r18
            long r3 = r3 << r33
            long r3 = r3 & r16
            long r3 = r3 & r31
            int r0 = (r3 > r31 ? 1 : (r3 == r31 ? 0 : -1))
            if (r0 == 0) goto L_0x0715
            int r0 = r7 - r8
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r5 = 8 - r0
            r4 = 0
        L_0x06cc:
            if (r4 >= r5) goto L_0x0713
            long r1 = r16 & r20
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x070e
            int r0 = r7 << 3
            int r0 = r0 + r4
            r3 = r13[r0]     // Catch:{ all -> 0x073e }
            r2 = r12[r0]     // Catch:{ all -> 0x073e }
            X.5ex r2 = (X.C290215ex) r2     // Catch:{ all -> 0x073e }
            X.5SX r0 = r2.A01     // Catch:{ all -> 0x073e }
            X.5SV r0 = r0.A05     // Catch:{ all -> 0x073e }
            X.5Sb r15 = X.AnonymousClass5SZ.A0J     // Catch:{ all -> 0x073e }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x073e }
            boolean r0 = r0.containsKey(r15)     // Catch:{ all -> 0x073e }
            if (r0 == 0) goto L_0x0700
            boolean r0 = r11.A06(r3)     // Catch:{ all -> 0x073e }
            if (r0 == 0) goto L_0x0700
            r1 = 16
            X.5SX r0 = r2.A01     // Catch:{ all -> 0x073e }
            X.5SV r0 = r0.A05     // Catch:{ all -> 0x073e }
            java.lang.Object r0 = r0.A00(r15)     // Catch:{ all -> 0x073e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x073e }
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r6, r0, r3, r1)     // Catch:{ all -> 0x073e }
        L_0x0700:
            X.5SX r2 = r2.A01     // Catch:{ all -> 0x073e }
            X.01O r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)     // Catch:{ all -> 0x073e }
            X.5SY r0 = new X.5SY     // Catch:{ all -> 0x073e }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x073e }
            r14.A08(r3, r0)     // Catch:{ all -> 0x073e }
        L_0x070e:
            long r16 = r16 >> r10
            int r4 = r4 + 1
            goto L_0x06cc
        L_0x0713:
            if (r5 != r10) goto L_0x071a
        L_0x0715:
            if (r7 == r8) goto L_0x071a
            int r7 = r7 + 1
            goto L_0x06b5
        L_0x071a:
            r0 = r42
            X.5SP r0 = r0.A0l     // Catch:{ all -> 0x073e }
            X.5SX r2 = r0.A00()     // Catch:{ all -> 0x073e }
            X.01O r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)     // Catch:{ all -> 0x073e }
            X.5SY r0 = new X.5SY     // Catch:{ all -> 0x073e }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x073e }
            r6.A0B = r0     // Catch:{ all -> 0x073e }
            r0 = 1450548188(0x56759bdc, float:6.751244E13)
            X.0fg.A00(r0)     // Catch:{ all -> 0x0750 }
            r0 = 2070364666(0x7b6741fa, float:1.2007587E36)
            X.0fg.A00(r0)
            r0 = r34
            r6.A0F = r0
            return
        L_0x073e:
            r1 = move-exception
            r0 = -440013516(0xffffffffe5c5ed34, float:-1.1683523E23)
            goto L_0x074c
        L_0x0743:
            r1 = move-exception
            r0 = 29821337(0x1c70999, float:7.3114827E-38)
            goto L_0x074c
        L_0x0748:
            r1 = move-exception
            r0 = 1736274366(0x677d71be, float:1.1968569E24)
        L_0x074c:
            X.0fg.A00(r0)     // Catch:{ all -> 0x0750 }
            throw r1     // Catch:{ all -> 0x0750 }
        L_0x0750:
            r1 = move-exception
            r0 = -1567583565(0xffffffffa29092b3, float:-3.91866E-18)
            goto L_0x0759
        L_0x0755:
            r1 = move-exception
            r0 = -161784664(0xfffffffff65b5ca8, float:-1.1122972E33)
        L_0x0759:
            X.0fg.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285785Sr.run():void");
    }
}
