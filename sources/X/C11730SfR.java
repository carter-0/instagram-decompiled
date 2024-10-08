package X;

/* renamed from: X.SfR  reason: case insensitive filesystem */
public final class C11730SfR implements C13684Tf1 {
    public final C11389SRd A00 = new C11389SRd();
    public final SSB A01 = new SSB();

    public final /* synthetic */ void reset() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x029b, code lost:
        r5.A04 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x029d, code lost:
        r5.A00 = X.Pxj.A07(r12, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1l(X.C13507TbY r36, X.C11115SAs r37, byte[] r38, int r39, int r40) {
        /*
            r35 = this;
            r20 = r35
            r0 = r20
            X.SRd r3 = r0.A00
            r0 = r39
            int r1 = r40 + r39
            r2 = r38
            r3.A0Q(r2, r1)
            r3.A0O(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            int r5 = r3.A01     // Catch:{ XQX -> 0x04a8 }
            java.nio.charset.Charset r2 = X.AnonymousClass2RN.A05     // Catch:{ XQX -> 0x04a8 }
            java.lang.String r4 = r3.A0H(r2)     // Catch:{ XQX -> 0x04a8 }
            if (r4 == 0) goto L_0x0495
            java.lang.String r0 = "WEBVTT"
            boolean r0 = r4.startsWith(r0)     // Catch:{ XQX -> 0x04a8 }
            if (r0 == 0) goto L_0x0495
        L_0x0028:
            java.lang.String r0 = r3.A0H(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0028
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
        L_0x0036:
            int r5 = r3.A01
            java.lang.String r4 = r3.A0H(r2)
            if (r4 != 0) goto L_0x0341
            r4 = 0
        L_0x003f:
            r3.A0O(r5)
            if (r4 == 0) goto L_0x035f
            r9 = 1
            if (r4 == r9) goto L_0x0336
            r8 = 2
            if (r4 != r8) goto L_0x02fd
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x0358
            r3.A0H(r2)
            r0 = r20
            X.SSB r4 = r0.A01
            java.lang.StringBuilder r10 = r4.A01
            r7 = 0
            r10.setLength(r7)
            int r5 = r3.A01
        L_0x005f:
            java.lang.String r0 = r3.A0H(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005f
            X.SRd r6 = r4.A00
            byte[] r4 = r3.A02
            int r0 = r3.A01
            r6.A0Q(r4, r0)
            r6.A0O(r5)
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
        L_0x0079:
            X.SSB.A02(r6)
            int r4 = X.Pxe.A06(r6)
            r0 = 5
            r12 = 0
            if (r4 < r0) goto L_0x02f6
            java.lang.String r4 = r6.A0I(r2, r0)
            java.lang.String r0 = "::cue"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x02f6
            int r11 = r6.A01
            java.lang.String r4 = X.SSB.A01(r6, r10)
            if (r4 == 0) goto L_0x02f6
            java.lang.String r5 = "{"
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto L_0x02ba
            r6.A0O(r11)
            java.lang.String r12 = ""
        L_0x00a6:
            java.lang.String r0 = X.SSB.A01(r6, r10)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x02f6
            X.RzD r5 = new X.RzD
            r5.<init>()
            java.lang.String r11 = ""
            boolean r0 = r11.equals(r12)
            if (r0 != 0) goto L_0x0110
            r0 = 91
            int r13 = r12.indexOf(r0)
            r14 = -1
            if (r13 == r14) goto L_0x00e0
            java.util.regex.Pattern r4 = X.SSB.A03
            java.lang.String r0 = r12.substring(r13)
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = X.Pxf.A0o(r4, r9)
            r5.A0B = r0
        L_0x00dc:
            java.lang.String r12 = r12.substring(r7, r13)
        L_0x00e0:
            java.lang.String r0 = "\\."
            java.lang.String[] r12 = r12.split(r0, r14)
            r13 = r12[r7]
            r0 = 35
            int r4 = r13.indexOf(r0)
            if (r4 == r14) goto L_0x02b6
            java.lang.String r0 = r13.substring(r7, r4)
            r5.A0A = r0
            java.lang.String r0 = X.Pxe.A0v(r4, r13)
            r5.A09 = r0
        L_0x00fc:
            int r4 = r12.length
            if (r4 <= r9) goto L_0x0110
            r0 = 1
            if (r4 <= r4) goto L_0x0103
            r0 = 0
        L_0x0103:
            X.C11366SPh.A01(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r12, r9, r4)
            java.util.HashSet r0 = X.Pxf.A0s(r0)
            r5.A0C = r0
        L_0x0110:
            r4 = 0
            r17 = 0
        L_0x0113:
            java.lang.String r14 = "}"
            if (r17 != 0) goto L_0x02a9
            int r12 = r6.A01
            java.lang.String r4 = X.SSB.A01(r6, r10)
            if (r4 == 0) goto L_0x02a5
            boolean r0 = r14.equals(r4)
            if (r0 != 0) goto L_0x02a5
            r17 = 0
            r6.A0O(r12)
            X.SSB.A02(r6)
            java.lang.String r12 = X.SSB.A00(r6, r10)
            boolean r0 = r11.equals(r12)
            if (r0 != 0) goto L_0x0113
            java.lang.String r13 = X.SSB.A01(r6, r10)
            java.lang.String r0 = ":"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0113
            X.SSB.A02(r6)
            java.lang.StringBuilder r16 = X.AnonymousClass7TE.A1A()
        L_0x014b:
            int r15 = r6.A01
            java.lang.String r13 = X.SSB.A01(r6, r10)
            if (r13 == 0) goto L_0x0113
            boolean r0 = r14.equals(r13)
            if (r0 != 0) goto L_0x0167
            java.lang.String r0 = ";"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0167
            r0 = r16
            r0.append(r13)
            goto L_0x014b
        L_0x0167:
            r6.A0O(r15)
            java.lang.String r13 = r16.toString()
            if (r13 == 0) goto L_0x0113
            boolean r0 = r11.equals(r13)
            if (r0 != 0) goto L_0x0113
            int r0 = r6.A01
            r16 = r0
            java.lang.String r15 = X.SSB.A01(r6, r10)
            java.lang.String r0 = ";"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0191
            boolean r0 = r14.equals(r15)
            if (r0 == 0) goto L_0x0113
            r0 = r16
            r6.A0O(r0)
        L_0x0191:
            java.lang.String r0 = "color"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01a3
            int r0 = X.C11323SMx.A00(r13, r9)
            r5.A03 = r0
            r5.A0F = r9
            goto L_0x0113
        L_0x01a3:
            java.lang.String r0 = "background-color"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01b5
            int r0 = X.C11323SMx.A00(r13, r9)
            r5.A01 = r0
            r5.A0E = r9
            goto L_0x0113
        L_0x01b5:
            java.lang.String r0 = "ruby-position"
            boolean r0 = r0.equals(r12)
            r14 = 1
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = "over"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01cc
            r5.A06 = r9
            goto L_0x0113
        L_0x01cc:
            java.lang.String r0 = "under"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0113
            r5.A06 = r8
            goto L_0x0113
        L_0x01d9:
            java.lang.String r0 = "text-combine-upright"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = "all"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01f3
            java.lang.String r0 = "digits"
            boolean r0 = r13.startsWith(r0)
            if (r0 != 0) goto L_0x01f3
            r14 = 0
        L_0x01f3:
            r5.A0D = r14
            goto L_0x0113
        L_0x01f7:
            java.lang.String r0 = "text-decoration"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = "underline"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0113
            r5.A07 = r9
            goto L_0x0113
        L_0x020d:
            java.lang.String r0 = "font-family"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x021d
            java.lang.String r0 = X.C256643w7.A00(r13)
            r5.A08 = r0
            goto L_0x0113
        L_0x021d:
            java.lang.String r0 = "font-weight"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0231
            java.lang.String r0 = "bold"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0113
            r5.A02 = r9
            goto L_0x0113
        L_0x0231:
            java.lang.String r0 = "font-style"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = "italic"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0113
            r5.A05 = r9
            goto L_0x0113
        L_0x0245:
            java.lang.String r0 = "font-size"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0113
            java.util.regex.Pattern r12 = X.SSB.A02
            java.lang.String r0 = X.C256643w7.A00(r13)
            java.util.regex.Matcher r12 = r12.matcher(r0)
            boolean r0 = r12.matches()
            if (r0 != 0) goto L_0x026c
            java.lang.String r12 = "Invalid font-size: '"
            java.lang.String r0 = "'."
            java.lang.String r12 = X.002.A0g(r12, r13, r0)
            java.lang.String r0 = "WebvttCssParser"
            X.STH.A03(r0, r12)
            goto L_0x0113
        L_0x026c:
            r14 = 2
            java.lang.String r13 = X.Pxf.A0o(r12, r8)
            int r0 = r13.hashCode()
            switch(r0) {
                case 37: goto L_0x0292;
                case 3240: goto L_0x0289;
                case 3592: goto L_0x027d;
                default: goto L_0x0278;
            }
        L_0x0278:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        L_0x027d:
            java.lang.String r0 = "px"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0278
            r5.A04 = r9
            goto L_0x029d
        L_0x0289:
            java.lang.String r0 = "em"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x029b
            goto L_0x0278
        L_0x0292:
            java.lang.String r0 = "%"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0278
            r14 = 3
        L_0x029b:
            r5.A04 = r14
        L_0x029d:
            float r0 = X.Pxj.A07(r12, r9)
            r5.A00 = r0
            goto L_0x0113
        L_0x02a5:
            r17 = 1
            goto L_0x0113
        L_0x02a9:
            boolean r0 = r14.equals(r4)
            if (r0 == 0) goto L_0x0079
            r0 = r18
            r0.add(r5)
            goto L_0x0079
        L_0x02b6:
            r5.A0A = r13
            goto L_0x00fc
        L_0x02ba:
            java.lang.String r0 = "("
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x02e6
            int r4 = r6.A01
            r13 = r4
            int r12 = r6.A00
            r0 = 0
        L_0x02c8:
            if (r4 >= r12) goto L_0x02db
            if (r0 != 0) goto L_0x02db
            byte[] r0 = r6.A02
            int r11 = r4 + 1
            byte r0 = r0[r4]
            char r4 = (char) r0
            r0 = 41
            boolean r0 = X.AnonymousClass7TF.A1S(r4, r0)
            r4 = r11
            goto L_0x02c8
        L_0x02db:
            int r0 = r4 + -1
            int r0 = r0 - r13
            java.lang.String r0 = r6.A0I(r2, r0)
            java.lang.String r12 = r0.trim()
        L_0x02e6:
            java.lang.String r4 = X.SSB.A01(r6, r10)
            java.lang.String r0 = ")"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x02f6
            if (r12 == 0) goto L_0x02f6
            goto L_0x00a6
        L_0x02f6:
            r0 = r18
            r1.addAll(r0)
            goto L_0x0036
        L_0x02fd:
            java.lang.String r7 = r3.A0H(r2)
            r6 = 0
            if (r7 == 0) goto L_0x0036
            java.util.regex.Pattern r5 = X.C11415SSn.A02
            java.util.regex.Matcher r4 = r5.matcher(r7)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L_0x031d
            X.RtU r4 = X.C11415SSn.A01(r3, r6, r1, r4)
        L_0x0314:
            if (r4 == 0) goto L_0x0036
            r0 = r19
            r0.add(r4)
            goto L_0x0036
        L_0x031d:
            java.lang.String r0 = r3.A0H(r2)
            if (r0 == 0) goto L_0x0036
            java.util.regex.Matcher r4 = r5.matcher(r0)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r7.trim()
            X.RtU r4 = X.C11415SSn.A01(r3, r0, r1, r4)
            goto L_0x0314
        L_0x0336:
            java.lang.String r0 = r3.A0H(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x0336
        L_0x0341:
            java.lang.String r0 = "STYLE"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x034c
            r4 = 2
            goto L_0x003f
        L_0x034c:
            java.lang.String r0 = "NOTE"
            boolean r0 = r4.startsWith(r0)
            r4 = 3
            if (r0 == 0) goto L_0x003f
            r4 = 1
            goto L_0x003f
        L_0x0358:
            java.lang.String r0 = "A style block was found after the first cue."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x035f:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r19)
            java.util.List r10 = java.util.Collections.unmodifiableList(r0)
            int r0 = r19.size()
            int r5 = r0 * 2
            long[] r9 = new long[r5]
            r4 = 0
        L_0x0370:
            int r0 = r19.size()
            if (r4 >= r0) goto L_0x038d
            r0 = r19
            java.lang.Object r3 = r0.get(r4)
            X.RtU r3 = (X.C10515RtU) r3
            int r2 = r4 * 2
            long r0 = r3.A01
            r9[r2] = r0
            int r2 = r2 + 1
            long r0 = r3.A00
            r9[r2] = r0
            int r4 = r4 + 1
            goto L_0x0370
        L_0x038d:
            long[] r8 = java.util.Arrays.copyOf(r9, r5)
            java.util.Arrays.sort(r8)
            int r7 = r8.length
            if (r7 == 0) goto L_0x0494
            r6 = 0
        L_0x0398:
            if (r6 >= r7) goto L_0x0494
            r1 = 1
            boolean r0 = X.Pxf.A1R(r6)
            X.C11366SPh.A01(r0)
            if (r6 < r7) goto L_0x03a5
            r1 = 0
        L_0x03a5:
            X.C11366SPh.A01(r1)
            r31 = r8[r6]
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            r11 = 0
            r2 = 0
        L_0x03b4:
            int r0 = r10.size()
            if (r2 >= r0) goto L_0x03e7
            int r1 = r2 * 2
            r3 = r9[r1]
            int r0 = (r3 > r31 ? 1 : (r3 == r31 ? 0 : -1))
            if (r0 > 0) goto L_0x03de
            int r0 = r1 + 1
            r3 = r9[r0]
            int r0 = (r31 > r3 ? 1 : (r31 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x03de
            java.lang.Object r3 = r10.get(r2)
            X.RtU r3 = (X.C10515RtU) r3
            X.SIh r0 = r3.A02
            float r1 = r0.A01
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x03e1
            r12.add(r3)
        L_0x03de:
            int r2 = r2 + 1
            goto L_0x03b4
        L_0x03e1:
            X.SIh r0 = r3.A02
            r5.add(r0)
            goto L_0x03de
        L_0x03e7:
            r4 = 1
            X.C13113TLw.A00(r4, r12)
        L_0x03eb:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x0449
            java.lang.Object r0 = r12.get(r11)
            X.RtU r0 = (X.C10515RtU) r0
            X.SIh r0 = r0.A02
            java.lang.CharSequence r1 = r0.A0F
            r22 = r1
            android.graphics.Bitmap r1 = r0.A0C
            r20 = r1
            android.text.Layout$Alignment r1 = r0.A0E
            r19 = r1
            android.text.Layout$Alignment r1 = r0.A0D
            r18 = r1
            int r1 = r0.A06
            r17 = r1
            float r1 = r0.A02
            r21 = r1
            int r1 = r0.A08
            r16 = r1
            int r15 = r0.A09
            float r14 = r0.A05
            float r13 = r0.A04
            r24 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r3 = r0.A0A
            float r2 = r0.A03
            int r0 = -1 - r11
            float r1 = (float) r0
            X.SIh r0 = new X.SIh
            r23 = r13
            r25 = r2
            r26 = r4
            r27 = r17
            r28 = r16
            r29 = r15
            r30 = r3
            r15 = r0
            r16 = r20
            r17 = r19
            r19 = r22
            r20 = r1
            r22 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.add(r0)
            int r11 = r11 + 1
            goto L_0x03eb
        L_0x0449:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x048b
            int r0 = r7 + -1
            if (r6 == r0) goto L_0x048f
            int r2 = r6 + 1
            r1 = 1
            boolean r0 = X.Pxf.A1R(r2)
            X.C11366SPh.A01(r0)
            if (r2 < r7) goto L_0x0460
            r1 = 0
        L_0x0460:
            X.C11366SPh.A01(r1)
            r33 = r8[r2]
            r1 = 1
            boolean r0 = X.Pxf.A1R(r6)
            X.C11366SPh.A01(r0)
            if (r6 < r7) goto L_0x0470
            r1 = 0
        L_0x0470:
            X.C11366SPh.A01(r1)
            r0 = r8[r6]
            long r33 = r33 - r0
            r1 = 0
            int r0 = (r33 > r1 ? 1 : (r33 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x048b
            X.RtS r0 = new X.RtS
            r29 = r0
            r30 = r5
            r29.<init>(r30, r31, r33)
            r1 = r36
            r1.accept(r0)
        L_0x048b:
            int r6 = r6 + 1
            goto L_0x0398
        L_0x048f:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        L_0x0494:
            return
        L_0x0495:
            r3.A0O(r5)     // Catch:{ XQX -> 0x04a8 }
            java.lang.String r1 = "Expected WEBVTT. Got "
            java.lang.String r0 = r3.A0H(r2)     // Catch:{ XQX -> 0x04a8 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ XQX -> 0x04a8 }
            r0 = 0
            X.XQX r0 = X.Pxf.A0L(r1, r0)     // Catch:{ XQX -> 0x04a8 }
            throw r0     // Catch:{ XQX -> 0x04a8 }
        L_0x04a8:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11730SfR.E1l(X.TbY, X.SAs, byte[], int, int):void");
    }
}
