package X;

/* renamed from: X.SCn  reason: case insensitive filesystem */
public abstract class C11157SCn {
    public static final SNH A00 = SNH.A00("ty", "nm");
    public static final SNH A01 = SNH.A01("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final SNH A02 = SNH.A00("d", "a");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: X.Sgo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: X.Sgo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: X.Sgo} */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.Sgo] */
    /* JADX WARNING: type inference failed for: r22v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03bf, code lost:
        r2.A0K();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.S56 A00(X.S7N r75, X.C12828T8z r76) {
        /*
            java.lang.Integer r29 = X.AnonymousClass05K.A00
            java.util.ArrayList r28 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r27 = X.AnonymousClass7TE.A1C()
            r2 = r76
            r2.A0J()
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r66 = java.lang.Float.valueOf(r0)
            r11 = 0
            r13 = 0
            r63 = 0
            java.lang.Float r61 = java.lang.Float.valueOf(r63)
            java.lang.String r15 = "UNSET"
            r38 = r29
            r39 = r29
            r37 = r13
            r41 = r13
            r22 = r13
            r12 = r13
            r31 = r13
            r35 = r13
            r36 = r13
            r16 = -1
            r68 = 0
            r20 = 0
            r21 = 0
            r51 = 0
            r45 = 1065353216(0x3f800000, float:1.0)
            r46 = 0
            r23 = 0
            r24 = 0
            r56 = 0
            r14 = 0
            r18 = 0
            r26 = r13
        L_0x0049:
            r25 = 0
        L_0x004b:
            boolean r0 = r2.A0Q()
            r1 = r75
            if (r0 == 0) goto L_0x0462
            X.SNH r0 = A01
            int r0 = r2.A0D(r0)
            r3 = 1
            r7 = 3
            switch(r0) {
                case 0: goto L_0x045c;
                case 1: goto L_0x0453;
                case 2: goto L_0x044d;
                case 3: goto L_0x043b;
                case 4: goto L_0x0432;
                case 5: goto L_0x0423;
                case 6: goto L_0x0414;
                case 7: goto L_0x040a;
                case 8: goto L_0x0404;
                case 9: goto L_0x03c4;
                case 10: goto L_0x02f6;
                case 11: goto L_0x02e1;
                case 12: goto L_0x0231;
                case 13: goto L_0x00ce;
                case 14: goto L_0x00c8;
                case 15: goto L_0x00c3;
                case 16: goto L_0x00b5;
                case 17: goto L_0x00a7;
                case 18: goto L_0x00a2;
                case 19: goto L_0x009d;
                case 20: goto L_0x0098;
                case 21: goto L_0x0093;
                case 22: goto L_0x008e;
                case 23: goto L_0x0085;
                case 24: goto L_0x0065;
                default: goto L_0x005e;
            }
        L_0x005e:
            r2.A0M()
            r2.A0N()
            goto L_0x004b
        L_0x0065:
            int r0 = r2.A0C()
            r4 = 18
            java.lang.Integer[] r3 = X.AnonymousClass05K.A00(r4)
            int r3 = r3.length
            if (r0 < r3) goto L_0x007e
            java.lang.String r3 = "Unsupported Blend Mode: "
            java.lang.String r0 = X.002.A0O(r3, r0)
            r1.A03(r0)
            r39 = r29
            goto L_0x004b
        L_0x007e:
            java.lang.Integer[] r1 = X.AnonymousClass05K.A00(r4)
            r39 = r1[r0]
            goto L_0x004b
        L_0x0085:
            int r0 = r2.A0C()
            r25 = 1
            if (r0 == r3) goto L_0x004b
            goto L_0x0049
        L_0x008e:
            boolean r56 = r2.A0R()
            goto L_0x004b
        L_0x0093:
            java.lang.String r26 = r2.A0G()
            goto L_0x004b
        L_0x0098:
            X.QGY r31 = X.C11390SRe.A01(r1, r2, r11)
            goto L_0x004b
        L_0x009d:
            float r14 = X.Pxh.A02(r2)
            goto L_0x004b
        L_0x00a2:
            float r68 = X.Pxh.A02(r2)
            goto L_0x004b
        L_0x00a7:
            double r3 = r2.A0B()
            float r0 = X.SSo.A00()
            double r0 = (double) r0
            double r3 = r3 * r0
            float r0 = (float) r3
            r24 = r0
            goto L_0x004b
        L_0x00b5:
            double r3 = r2.A0B()
            float r0 = X.SSo.A00()
            double r0 = (double) r0
            double r3 = r3 * r0
            float r0 = (float) r3
            r23 = r0
            goto L_0x004b
        L_0x00c3:
            float r46 = X.Pxh.A02(r2)
            goto L_0x004b
        L_0x00c8:
            float r45 = X.Pxh.A02(r2)
            goto L_0x004b
        L_0x00ce:
            r2.A0I()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
        L_0x00d5:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0220
            r2.A0J()
        L_0x00de:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x021b
            X.SNH r0 = A00
            int r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x00fd
            if (r0 == r3) goto L_0x00f5
            r2.A0M()
            r2.A0N()
            goto L_0x00de
        L_0x00f5:
            java.lang.String r0 = r2.A0G()
            r5.add(r0)
            goto L_0x00de
        L_0x00fd:
            int r0 = r2.A0C()
            r4 = 29
            if (r0 != r4) goto L_0x0163
            X.SNH r0 = X.C10055Rls.A00
            r35 = 0
        L_0x0109:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x00de
            X.SNH r0 = X.C10055Rls.A00
            int r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x011e
            r2.A0M()
            r2.A0N()
            goto L_0x0109
        L_0x011e:
            r2.A0I()
        L_0x0121:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x015f
            r2.A0J()
            r0 = 0
        L_0x012b:
            r6 = 0
        L_0x012c:
            boolean r4 = r2.A0Q()
            if (r4 == 0) goto L_0x0157
            X.SNH r4 = X.C10055Rls.A01
            int r4 = r2.A0D(r4)
            if (r4 == 0) goto L_0x014f
            if (r4 == r3) goto L_0x0143
            r2.A0M()
        L_0x013f:
            r2.A0N()
            goto L_0x012c
        L_0x0143:
            if (r6 == 0) goto L_0x013f
            X.QGY r4 = X.C11390SRe.A01(r1, r2, r3)
            X.RnY r0 = new X.RnY
            r0.<init>(r4)
            goto L_0x012c
        L_0x014f:
            int r4 = r2.A0C()
            r6 = 1
            if (r4 == 0) goto L_0x012c
            goto L_0x012b
        L_0x0157:
            r2.A0L()
            if (r0 == 0) goto L_0x0121
            r35 = r0
            goto L_0x0121
        L_0x015f:
            r2.A0K()
            goto L_0x0109
        L_0x0163:
            r4 = 25
            if (r0 != r4) goto L_0x00de
            X.SNH r0 = X.C10056Rlt.A00
            r70 = 0
            r72 = 0
            r73 = 0
            r71 = 0
            r74 = 0
        L_0x0173:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0204
            X.SNH r0 = X.C10056Rlt.A00
            int r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x0188
            r2.A0M()
            r2.A0N()
            goto L_0x0173
        L_0x0188:
            r2.A0I()
        L_0x018b:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x01ff
            r2.A0J()
            java.lang.String r0 = ""
        L_0x0196:
            boolean r4 = r2.A0Q()
            if (r4 == 0) goto L_0x01fb
            X.SNH r4 = X.C10056Rlt.A01
            int r4 = r2.A0D(r4)
            if (r4 == 0) goto L_0x01f6
            if (r4 == r3) goto L_0x01ad
            r2.A0M()
        L_0x01a9:
            r2.A0N()
            goto L_0x0196
        L_0x01ad:
            int r4 = r0.hashCode()
            switch(r4) {
                case 353103893: goto L_0x01b5;
                case 397447147: goto L_0x01c2;
                case 1041377119: goto L_0x01cf;
                case 1379387491: goto L_0x01dc;
                case 1383710113: goto L_0x01e9;
                default: goto L_0x01b4;
            }
        L_0x01b4:
            goto L_0x01a9
        L_0x01b5:
            java.lang.String r4 = "Distance"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01a9
            X.QGY r73 = X.C11390SRe.A01(r1, r2, r3)
            goto L_0x0196
        L_0x01c2:
            java.lang.String r4 = "Opacity"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01a9
            X.QGY r71 = X.C11390SRe.A01(r1, r2, r11)
            goto L_0x0196
        L_0x01cf:
            java.lang.String r4 = "Direction"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01a9
            X.QGY r72 = X.C11390SRe.A01(r1, r2, r11)
            goto L_0x0196
        L_0x01dc:
            java.lang.String r4 = "Shadow Color"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01a9
            X.QGX r70 = X.C11390SRe.A00(r1, r2)
            goto L_0x0196
        L_0x01e9:
            java.lang.String r4 = "Softness"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01a9
            X.QGY r74 = X.C11390SRe.A01(r1, r2, r3)
            goto L_0x0196
        L_0x01f6:
            java.lang.String r0 = r2.A0G()
            goto L_0x0196
        L_0x01fb:
            r2.A0L()
            goto L_0x018b
        L_0x01ff:
            r2.A0K()
            goto L_0x0173
        L_0x0204:
            if (r70 == 0) goto L_0x0217
            if (r71 == 0) goto L_0x0217
            if (r72 == 0) goto L_0x0217
            if (r73 == 0) goto L_0x0217
            if (r74 == 0) goto L_0x0217
            X.Rx1 r36 = new X.Rx1
            r69 = r36
            r69.<init>(r70, r71, r72, r73, r74)
            goto L_0x00de
        L_0x0217:
            r36 = 0
            goto L_0x00de
        L_0x021b:
            r2.A0L()
            goto L_0x00d5
        L_0x0220:
            r2.A0K()
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r3 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r0.append(r3)
            r0.append(r5)
            goto L_0x03dc
        L_0x0231:
            r2.A0J()
        L_0x0234:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x02dc
            X.SNH r0 = A02
            int r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x02c9
            if (r0 == r3) goto L_0x024b
            r2.A0M()
            r2.A0N()
            goto L_0x0234
        L_0x024b:
            r2.A0I()
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x02ba
            X.SNH r0 = X.C10054Rlr.A00
            r2.A0J()
            r4 = 0
            r12 = r4
        L_0x025b:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x02b0
            X.SNH r0 = X.C10054Rlr.A01
            int r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x0270
            r2.A0M()
            r2.A0N()
            goto L_0x025b
        L_0x0270:
            r2.A0J()
            r5 = 0
            r10 = r4
            r8 = r4
            r9 = r4
        L_0x0277:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x02a7
            X.SNH r0 = X.C10054Rlr.A00
            int r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x02a2
            if (r0 == r3) goto L_0x029d
            r6 = 2
            if (r0 == r6) goto L_0x0298
            if (r0 == r7) goto L_0x0293
            r2.A0M()
            r2.A0N()
            goto L_0x0277
        L_0x0293:
            X.QGY r9 = X.C11390SRe.A01(r1, r2, r3)
            goto L_0x0277
        L_0x0298:
            X.QGY r8 = X.C11390SRe.A01(r1, r2, r3)
            goto L_0x0277
        L_0x029d:
            X.QGX r10 = X.C11390SRe.A00(r1, r2)
            goto L_0x0277
        L_0x02a2:
            X.QGX r5 = X.C11390SRe.A00(r1, r2)
            goto L_0x0277
        L_0x02a7:
            r2.A0L()
            X.Rvp r12 = new X.Rvp
            r12.<init>(r5, r10, r8, r9)
            goto L_0x025b
        L_0x02b0:
            r2.A0L()
            if (r12 != 0) goto L_0x02ba
            X.Rvp r12 = new X.Rvp
            r12.<init>(r4, r4, r4, r4)
        L_0x02ba:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x02c4
            r2.A0N()
            goto L_0x02ba
        L_0x02c4:
            r2.A0K()
            goto L_0x0234
        L_0x02c9:
            float r4 = X.SSo.A00()
            X.ShA r0 = X.C11824ShA.A00
            java.util.ArrayList r4 = X.SL6.A00(r1, r0, r2, r4, r11)
            X.QGe r22 = new X.QGe
            r0 = r22
            r0.<init>(r4)
            goto L_0x0234
        L_0x02dc:
            r2.A0L()
            goto L_0x004b
        L_0x02e1:
            r2.A0I()
        L_0x02e4:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x03bf
            X.Tbo r3 = X.SQK.A01(r1, r2)
            if (r3 == 0) goto L_0x02e4
            r0 = r27
            r0.add(r3)
            goto L_0x02e4
        L_0x02f6:
            r2.A0I()
        L_0x02f9:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x03b6
            r2.A0J()
            r3 = 0
            r5 = r3
            r7 = r3
            r6 = 0
        L_0x0306:
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x03a7
            java.lang.String r0 = r2.A0F()
            int r4 = r0.hashCode()
            switch(r4) {
                case 111: goto L_0x031b;
                case 3588: goto L_0x0329;
                case 104433: goto L_0x0342;
                case 3357091: goto L_0x034f;
                default: goto L_0x0317;
            }
        L_0x0317:
            r2.A0N()
            goto L_0x0306
        L_0x031b:
            java.lang.String r4 = "o"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0317
            X.QGa r7 = X.C11390SRe.A03(r1, r2)
            goto L_0x0306
        L_0x0329:
            java.lang.String r4 = "pt"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0317
            float r4 = X.SSo.A00()
            X.ShB r0 = X.C11825ShB.A00
            java.util.ArrayList r0 = X.SL6.A00(r1, r0, r2, r4, r11)
            X.QGd r5 = new X.QGd
            r5.<init>(r0)
            goto L_0x0306
        L_0x0342:
            java.lang.String r4 = "inv"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0317
            boolean r6 = r2.A0R()
            goto L_0x0306
        L_0x034f:
            java.lang.String r4 = "mode"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0317
            java.lang.String r3 = r2.A0G()
            int r4 = r3.hashCode()
            switch(r4) {
                case 97: goto L_0x0371;
                case 105: goto L_0x037c;
                case 110: goto L_0x038d;
                case 115: goto L_0x039a;
                default: goto L_0x0363;
            }
        L_0x0363:
            java.lang.String r4 = "Unknown mask mode "
            java.lang.String r3 = ". Defaulting to Add."
            java.lang.String r0 = X.002.A0g(r4, r0, r3)
            X.S85.A00(r0)
            r3 = r29
            goto L_0x0306
        L_0x0371:
            java.lang.String r4 = "a"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0363
            r3 = r29
            goto L_0x0306
        L_0x037c:
            java.lang.String r4 = "i"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0363
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r1.A03(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x0306
        L_0x038d:
            java.lang.String r4 = "n"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0363
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x0306
        L_0x039a:
            java.lang.String r4 = "s"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0363
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x0306
        L_0x03a7:
            r2.A0L()
            X.Rvq r4 = new X.Rvq
            r4.<init>(r7, r5, r3, r6)
            r0 = r28
            r0.add(r4)
            goto L_0x02f9
        L_0x03b6:
            int r3 = r28.size()
            int r0 = r1.A04
            int r0 = r0 + r3
            r1.A04 = r0
        L_0x03bf:
            r2.A0K()
            goto L_0x004b
        L_0x03c4:
            int r3 = r2.A0C()
            r4 = 6
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r4)
            int r0 = r0.length
            if (r3 < r0) goto L_0x03e5
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r4 = "Unsupported matte type: "
            r0.append(r4)
            r0.append(r3)
        L_0x03dc:
            java.lang.String r0 = r0.toString()
            r1.A03(r0)
            goto L_0x004b
        L_0x03e5:
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r4)
            r38 = r0[r3]
            int r0 = r38.intValue()
            if (r0 == r7) goto L_0x0401
            r3 = 4
            if (r0 != r3) goto L_0x03f9
            java.lang.String r0 = "Unsupported matte type: Luma Inverted"
        L_0x03f6:
            r1.A03(r0)
        L_0x03f9:
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            goto L_0x004b
        L_0x0401:
            java.lang.String r0 = "Unsupported matte type: Luma"
            goto L_0x03f6
        L_0x0404:
            X.Sh2 r13 = X.SCU.A00(r1, r2)
            goto L_0x004b
        L_0x040a:
            java.lang.String r0 = r2.A0G()
            int r51 = android.graphics.Color.parseColor(r0)
            goto L_0x004b
        L_0x0414:
            int r0 = r2.A0C()
            float r0 = (float) r0
            float r1 = X.SSo.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r21 = r0
            goto L_0x004b
        L_0x0423:
            int r0 = r2.A0C()
            float r0 = (float) r0
            float r1 = X.SSo.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r20 = r0
            goto L_0x004b
        L_0x0432:
            int r0 = r2.A0C()
            long r0 = (long) r0
            r16 = r0
            goto L_0x004b
        L_0x043b:
            int r0 = r2.A0C()
            java.lang.Integer r37 = X.AnonymousClass05K.A0u
            r1 = 6
            if (r0 >= r1) goto L_0x004b
            r1 = 7
            java.lang.Integer[] r1 = X.AnonymousClass05K.A00(r1)
            r37 = r1[r0]
            goto L_0x004b
        L_0x044d:
            java.lang.String r41 = r2.A0G()
            goto L_0x004b
        L_0x0453:
            int r0 = r2.A0C()
            long r0 = (long) r0
            r18 = r0
            goto L_0x004b
        L_0x045c:
            java.lang.String r15 = r2.A0G()
            goto L_0x004b
        L_0x0462:
            r2.A0L()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            int r2 = (r68 > r63 ? 1 : (r68 == r63 ? 0 : -1))
            if (r2 <= 0) goto L_0x0481
            r58 = 0
            java.lang.Float r60 = java.lang.Float.valueOf(r68)
            X.ST4 r2 = new X.ST4
            r57 = r2
            r59 = r1
            r62 = r61
            r57.<init>((android.view.animation.Interpolator) r58, (X.S7N) r59, (java.lang.Float) r60, (java.lang.Object) r61, (java.lang.Object) r62, (float) r63)
            r0.add(r2)
        L_0x0481:
            int r2 = (r14 > r63 ? 1 : (r14 == r63 ? 0 : -1))
            if (r2 > 0) goto L_0x0487
            float r14 = r1.A00
        L_0x0487:
            r63 = 0
            java.lang.Float r65 = java.lang.Float.valueOf(r14)
            X.ST4 r2 = new X.ST4
            r62 = r2
            r64 = r1
            r67 = r66
            r62.<init>((android.view.animation.Interpolator) r63, (X.S7N) r64, (java.lang.Float) r65, (java.lang.Object) r66, (java.lang.Object) r67, (float) r68)
            r0.add(r2)
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            X.ST4 r2 = new X.ST4
            r3 = r63
            r4 = r1
            r6 = r61
            r7 = r6
            r8 = r14
            r2.<init>((android.view.animation.Interpolator) r3, (X.S7N) r4, (java.lang.Float) r5, (java.lang.Object) r6, (java.lang.Object) r7, (float) r8)
            r0.add(r2)
            java.lang.String r2 = ".ai"
            boolean r2 = r15.endsWith(r2)
            if (r2 != 0) goto L_0x04c3
            java.lang.String r3 = "ai"
            r2 = r26
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x04c8
        L_0x04c3:
            java.lang.String r2 = "Convert your Illustrator layers to shape layers."
            r1.A03(r2)
        L_0x04c8:
            if (r25 == 0) goto L_0x04d4
            if (r13 != 0) goto L_0x04d1
            X.Sh2 r13 = new X.Sh2
            r13.<init>()
        L_0x04d1:
            r2 = 1
            r13.A00 = r2
        L_0x04d4:
            X.S56 r29 = new X.S56
            r33 = r12
            r34 = r13
            r40 = r15
            r42 = r27
            r43 = r28
            r44 = r0
            r47 = r23
            r48 = r24
            r49 = r20
            r50 = r21
            r52 = r18
            r54 = r16
            r30 = r1
            r32 = r22
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11157SCn.A00(X.S7N, X.T8z):X.S56");
    }
}
