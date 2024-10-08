package X;

import com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup;

/* renamed from: X.Xq7  reason: case insensitive filesystem */
public final class C21999Xq7 {
    public final S17 A00;
    public final AnonymousClass46C A01;
    public final GeneratedHyperThriftClassLookup A02;

    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r9 != 11) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r9 == 8) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        return java.lang.Integer.valueOf(r7.A01.A09());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        throw new java.lang.Exception(X.002.A02(r1, r9, "Expected ", "; got "));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0185, code lost:
        return r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object A01(X.C21427Xac r8, byte r9) {
        /*
            r7 = this;
            byte r1 = r8.A00
            r2 = 8
            r0 = 11
            r3 = 0
            switch(r1) {
                case 1: goto L_0x014b;
                case 2: goto L_0x0018;
                case 3: goto L_0x0026;
                case 4: goto L_0x0034;
                case 5: goto L_0x000a;
                case 6: goto L_0x0042;
                case 7: goto L_0x000a;
                case 8: goto L_0x0055;
                case 9: goto L_0x000a;
                case 10: goto L_0x0062;
                case 11: goto L_0x0071;
                case 12: goto L_0x007a;
                case 13: goto L_0x0085;
                case 14: goto L_0x00c9;
                case 15: goto L_0x00fe;
                case 16: goto L_0x0050;
                case 17: goto L_0x000a;
                case 18: goto L_0x000a;
                case 19: goto L_0x0133;
                case 20: goto L_0x0142;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.String r2 = "Expected "
            java.lang.String r0 = "; got "
            java.lang.String r1 = X.002.A02(r1, r9, r2, r0)
            X.XSk r0 = new X.XSk
            r0.<init>(r1)
            throw r0
        L_0x0018:
            r0 = 2
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            boolean r0 = r0.A0Z()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0026:
            r0 = 3
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            byte r0 = r0.A06()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L_0x0034:
            r0 = 4
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            double r0 = r0.A07()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x0042:
            r0 = 6
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            short r0 = r0.A0H()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L_0x0050:
            if (r9 == r2) goto L_0x0057
            if (r9 != r0) goto L_0x000a
            goto L_0x0057
        L_0x0055:
            if (r9 != r2) goto L_0x000a
        L_0x0057:
            X.46C r0 = r7.A01
            int r0 = r0.A09()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0062:
            r0 = 10
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            long r0 = r0.A0A()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x0071:
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            java.lang.String r0 = r0.A0G()
            return r0
        L_0x007a:
            r0 = 12
            if (r9 != r0) goto L_0x000a
            java.lang.String r0 = r8.A03
            com.facebook.hyperthrift.HyperThriftBase r0 = A00(r7, r0)
            return r0
        L_0x0085:
            r0 = 13
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            X.Xmy r5 = r0.A0D()
            byte r2 = r5.A00
            if (r2 == 0) goto L_0x00ab
            byte r0 = r5.A01
            if (r0 == 0) goto L_0x00ab
        L_0x0097:
            int r6 = r5.A02
            int r0 = java.lang.Math.max(r3, r6)
            java.util.HashMap r4 = X.C21053XCe.A0h(r0)
            if (r6 >= 0) goto L_0x014d
            java.lang.String r1 = "Peeking into a map not supported, likely because it's sized"
            X.5I8 r0 = new X.5I8
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            byte r1 = r5.A01
            if (r2 != 0) goto L_0x00b7
            X.Xac r0 = r8.A01
            byte r0 = r0.A00
            byte r2 = X.XUw.A00(r0)
        L_0x00b7:
            if (r1 != 0) goto L_0x00c1
            X.Xac r0 = r8.A02
            byte r0 = r0.A00
            byte r1 = X.XUw.A00(r0)
        L_0x00c1:
            int r0 = r5.A02
            X.Xmy r5 = new X.Xmy
            r5.<init>(r2, r1, r0)
            goto L_0x0097
        L_0x00c9:
            r0 = 14
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            X.Xmr r5 = r0.A0E()
            byte r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L_0x00e9
            X.Xac r0 = r8.A01
            if (r0 == 0) goto L_0x00e9
            byte r0 = r0.A00
            byte r1 = X.XUw.A00(r0)
            int r0 = r5.A01
            X.Xmr r5 = new X.Xmr
            r5.<init>(r0, r1)
        L_0x00e9:
            int r2 = r5.A01
            int r0 = java.lang.Math.max(r3, r2)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            if (r2 >= 0) goto L_0x0165
            java.lang.String r1 = "Peeking into a set not supported, likely because it's sized"
            X.5I8 r0 = new X.5I8
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            r0 = 15
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            X.Xmq r5 = r0.A0C()
            byte r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L_0x011e
            X.Xac r0 = r8.A01
            if (r0 == 0) goto L_0x011e
            byte r0 = r0.A00
            byte r1 = X.XUw.A00(r0)
            int r0 = r5.A01
            X.Xmq r5 = new X.Xmq
            r5.<init>(r0, r1)
        L_0x011e:
            int r2 = r5.A01
            int r0 = java.lang.Math.max(r3, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            if (r2 >= 0) goto L_0x0175
            java.lang.String r1 = "Peeking into a list not supported, likely because it's sized"
            X.5I8 r0 = new X.5I8
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 19
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            float r0 = r0.A08()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0142:
            if (r9 != r0) goto L_0x000a
            X.46C r0 = r7.A01
            byte[] r0 = r0.A0a()
            return r0
        L_0x014b:
            r0 = 0
            return r0
        L_0x014d:
            if (r3 >= r6) goto L_0x0185
            byte r1 = r5.A00
            X.Xac r0 = r8.A01
            java.lang.Object r2 = r7.A01(r0, r1)
            byte r1 = r5.A01
            X.Xac r0 = r8.A02
            java.lang.Object r0 = r7.A01(r0, r1)
            r4.put(r2, r0)
            int r3 = r3 + 1
            goto L_0x014d
        L_0x0165:
            if (r3 >= r2) goto L_0x0185
            byte r1 = r5.A00
            X.Xac r0 = r8.A01
            java.lang.Object r0 = r7.A01(r0, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0165
        L_0x0175:
            if (r3 >= r2) goto L_0x0185
            byte r1 = r5.A00
            X.Xac r0 = r8.A01
            java.lang.Object r0 = r7.A01(r0, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0175
        L_0x0185:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21999Xq7.A01(X.Xac, byte):java.lang.Object");
    }

    public C21999Xq7(S17 s17, GeneratedHyperThriftClassLookup generatedHyperThriftClassLookup, AnonymousClass46C r3) {
        this.A02 = generatedHyperThriftClassLookup;
        this.A00 = s17;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.Object, X.Y1O] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r3 = X.AnonymousClass7TF.A0W("structName=", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:?, code lost:
        r5 = (com.facebook.hyperthrift.HyperThriftBase) r0.newInstance();
        r5.A02(r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0a4d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:?, code lost:
        r3 = new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0a9e, code lost:
        if (r3 != 1) goto L_0x0aa3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0aa0, code lost:
        r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x0aa3, code lost:
        X.0fc.A00(4, 1017706147);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0aa9, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.hyperthrift.HyperThriftBase A00(X.C21999Xq7 r13, java.lang.String r14) {
        /*
            r1 = 4
            java.lang.String r3 = "HyperThriftReader.parse"
            X.0eu r0 = com.facebook.systrace.SystraceMessage.A00
            X.0et r3 = com.facebook.systrace.SystraceMessage.A00(r0, r3, r1)
            java.lang.String r0 = "type"
            r3.A00(r14, r0)
            r3.A02()
            X.S17 r0 = r13.A00     // Catch:{ all -> 0x0aaa }
            X.50J r11 = r0.A00(r14)     // Catch:{ all -> 0x0aaa }
            X.XaL[] r10 = r11.A02     // Catch:{ all -> 0x0aaa }
            int r9 = r10.length     // Catch:{ all -> 0x0aaa }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ all -> 0x0aaa }
            X.46C r8 = r13.A01     // Catch:{ all -> 0x0aaa }
            monitor-enter(r11)     // Catch:{ all -> 0x0aaa }
            java.util.Map r0 = r11.A01     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x005e
            if (r9 == 0) goto L_0x0056
            r7 = 0
            r0 = r10[r7]     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0056
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0064 }
            r11.A01 = r0     // Catch:{ all -> 0x0064 }
        L_0x0033:
            if (r7 >= r9) goto L_0x005c
            r3 = r10[r7]     // Catch:{ all -> 0x0064 }
            X.Xac r0 = r3.A00     // Catch:{ all -> 0x0064 }
            byte r0 = r0.A00     // Catch:{ all -> 0x0064 }
            X.XUw.A00(r0)     // Catch:{ all -> 0x0064 }
            java.util.Map r6 = r11.A01     // Catch:{ all -> 0x0064 }
            short r0 = r3.A02     // Catch:{ all -> 0x0064 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0064 }
            X.Y1O r3 = new X.Y1O     // Catch:{ all -> 0x0064 }
            r3.<init>()     // Catch:{ all -> 0x0064 }
            X.Y1R r0 = new X.Y1R     // Catch:{ all -> 0x0064 }
            r0.<init>(r3)     // Catch:{ all -> 0x0064 }
            r6.put(r5, r0)     // Catch:{ all -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0056:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0064 }
            r11.A01 = r0     // Catch:{ all -> 0x0064 }
        L_0x005c:
            java.util.Map r0 = r11.A01     // Catch:{ all -> 0x0064 }
        L_0x005e:
            monitor-exit(r11)     // Catch:{ all -> 0x0aaa }
            r8.A0F(r0)     // Catch:{ all -> 0x0aaa }
            r3 = 0
            goto L_0x0067
        L_0x0064:
            r3 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0aaa }
            goto L_0x007f
        L_0x0067:
            X.46E r0 = r8.A0B()     // Catch:{ all -> 0x0aaa }
            byte r7 = r0.A00     // Catch:{ all -> 0x0aaa }
            if (r7 != 0) goto L_0x0a55
            r8.A0I()     // Catch:{ all -> 0x0aaa }
            int r0 = r14.hashCode()     // Catch:{ all -> 0x0aaa }
            switch(r0) {
                case -2144978020: goto L_0x0a39;
                case -2134810486: goto L_0x0a2e;
                case -2091224310: goto L_0x0a23;
                case -1974398968: goto L_0x0a18;
                case -1968790115: goto L_0x0a0d;
                case -1946698319: goto L_0x0a02;
                case -1920266090: goto L_0x09f7;
                case -1912136605: goto L_0x09ec;
                case -1897628496: goto L_0x09e1;
                case -1872962185: goto L_0x09d2;
                case -1867882858: goto L_0x09c7;
                case -1855423023: goto L_0x09bc;
                case -1843300411: goto L_0x09b0;
                case -1821556539: goto L_0x09a4;
                case -1792067556: goto L_0x0998;
                case -1791912557: goto L_0x098c;
                case -1756396444: goto L_0x0980;
                case -1724469405: goto L_0x0974;
                case -1717622177: goto L_0x0968;
                case -1692966251: goto L_0x095c;
                case -1683929594: goto L_0x0950;
                case -1681909363: goto L_0x0944;
                case -1634899454: goto L_0x0938;
                case -1611386436: goto L_0x092c;
                case -1609010615: goto L_0x0920;
                case -1607010528: goto L_0x0914;
                case -1581500046: goto L_0x0908;
                case -1577552481: goto L_0x08fc;
                case -1538816964: goto L_0x08f0;
                case -1534993017: goto L_0x08e4;
                case -1531610905: goto L_0x08d8;
                case -1524001066: goto L_0x08cc;
                case -1521561413: goto L_0x08c0;
                case -1498059679: goto L_0x08b0;
                case -1428530899: goto L_0x08a4;
                case -1406647216: goto L_0x0898;
                case -1366389535: goto L_0x088c;
                case -1305958943: goto L_0x0880;
                case -1265468718: goto L_0x0874;
                case -1263030051: goto L_0x0868;
                case -1257917778: goto L_0x085c;
                case -1236288295: goto L_0x0850;
                case -1231049353: goto L_0x0844;
                case -1218474690: goto L_0x0838;
                case -1215462697: goto L_0x082c;
                case -1167188427: goto L_0x0820;
                case -1116265597: goto L_0x0814;
                case -1099788676: goto L_0x0808;
                case -1076294736: goto L_0x07f8;
                case -1062027903: goto L_0x07ec;
                case -1052959879: goto L_0x07e0;
                case -1039606064: goto L_0x07d4;
                case -1033159139: goto L_0x07c4;
                case -1015378334: goto L_0x07b8;
                case -993416584: goto L_0x07ac;
                case -979523852: goto L_0x07a0;
                case -954595217: goto L_0x0790;
                case -915697153: goto L_0x0784;
                case -905844485: goto L_0x0778;
                case -867226331: goto L_0x0768;
                case -831646776: goto L_0x075c;
                case -819335020: goto L_0x0750;
                case -818258238: goto L_0x0744;
                case -718295669: goto L_0x0738;
                case -712817305: goto L_0x072c;
                case -686451546: goto L_0x0720;
                case -668690881: goto L_0x0714;
                case -625956607: goto L_0x0708;
                case -621769869: goto L_0x06fc;
                case -612046529: goto L_0x06f0;
                case -607285150: goto L_0x06e4;
                case -582709610: goto L_0x06d8;
                case -579063905: goto L_0x06cc;
                case -558977327: goto L_0x06c0;
                case -527066724: goto L_0x06b4;
                case -500769155: goto L_0x06a8;
                case -494052691: goto L_0x069c;
                case -482640065: goto L_0x0690;
                case -481128023: goto L_0x0684;
                case -480507868: goto L_0x0678;
                case -448877716: goto L_0x066c;
                case -415283386: goto L_0x0660;
                case -405016817: goto L_0x0654;
                case -363867832: goto L_0x0648;
                case -332453770: goto L_0x0638;
                case -297054345: goto L_0x062c;
                case -275057907: goto L_0x0620;
                case -257116781: goto L_0x0614;
                case -165171873: goto L_0x0604;
                case -141391838: goto L_0x05f8;
                case -128550956: goto L_0x05e8;
                case -62532911: goto L_0x05dc;
                case -54061286: goto L_0x05d0;
                case -51620885: goto L_0x05c4;
                case -35599426: goto L_0x05b8;
                case -34236036: goto L_0x05ac;
                case 54447713: goto L_0x05a0;
                case 73684237: goto L_0x0594;
                case 93117300: goto L_0x0588;
                case 97194346: goto L_0x057c;
                case 118587551: goto L_0x0570;
                case 121185188: goto L_0x0564;
                case 138618720: goto L_0x0558;
                case 150146887: goto L_0x054c;
                case 159525742: goto L_0x0540;
                case 198139408: goto L_0x0534;
                case 217436500: goto L_0x0528;
                case 263490274: goto L_0x051c;
                case 281732175: goto L_0x0510;
                case 307096696: goto L_0x0504;
                case 322404007: goto L_0x04f8;
                case 335052622: goto L_0x04ec;
                case 338219453: goto L_0x04e0;
                case 360402364: goto L_0x04d4;
                case 362228131: goto L_0x04c8;
                case 388491386: goto L_0x04bc;
                case 399959604: goto L_0x04ac;
                case 477705215: goto L_0x04a0;
                case 494033896: goto L_0x0494;
                case 512633773: goto L_0x0488;
                case 521947123: goto L_0x047c;
                case 554821297: goto L_0x046c;
                case 576212189: goto L_0x0460;
                case 601116332: goto L_0x0454;
                case 636432856: goto L_0x0448;
                case 666904004: goto L_0x043c;
                case 671367522: goto L_0x0430;
                case 691855169: goto L_0x0424;
                case 694938316: goto L_0x0418;
                case 715965259: goto L_0x040c;
                case 721800908: goto L_0x0400;
                case 728277685: goto L_0x03f4;
                case 735503388: goto L_0x03e8;
                case 740958639: goto L_0x03dc;
                case 757188206: goto L_0x03d0;
                case 783621203: goto L_0x03c4;
                case 790057360: goto L_0x03b8;
                case 820896063: goto L_0x03ac;
                case 824117861: goto L_0x03a0;
                case 841553274: goto L_0x0394;
                case 846468891: goto L_0x0388;
                case 858734078: goto L_0x037c;
                case 859486128: goto L_0x0370;
                case 876381361: goto L_0x0364;
                case 877066469: goto L_0x0358;
                case 893734612: goto L_0x034c;
                case 963273881: goto L_0x0340;
                case 982996856: goto L_0x0334;
                case 1058511611: goto L_0x0328;
                case 1075331383: goto L_0x031c;
                case 1098296145: goto L_0x0310;
                case 1114269586: goto L_0x0304;
                case 1136544003: goto L_0x02f8;
                case 1149025150: goto L_0x02ec;
                case 1199808106: goto L_0x02e0;
                case 1210011429: goto L_0x02d4;
                case 1210742588: goto L_0x02c8;
                case 1229735100: goto L_0x02bc;
                case 1248084943: goto L_0x02b0;
                case 1265593789: goto L_0x02a4;
                case 1281032085: goto L_0x0298;
                case 1301695136: goto L_0x028c;
                case 1346532841: goto L_0x0280;
                case 1393831727: goto L_0x0274;
                case 1402353267: goto L_0x0268;
                case 1419945359: goto L_0x025c;
                case 1438367205: goto L_0x024c;
                case 1457560477: goto L_0x0240;
                case 1468368498: goto L_0x0234;
                case 1469291571: goto L_0x0228;
                case 1538330748: goto L_0x021c;
                case 1543970126: goto L_0x0210;
                case 1560273242: goto L_0x0204;
                case 1579099221: goto L_0x01f8;
                case 1657932968: goto L_0x01ec;
                case 1698830576: goto L_0x01e0;
                case 1700227374: goto L_0x01d4;
                case 1711316788: goto L_0x01c8;
                case 1775215056: goto L_0x01bc;
                case 1816065193: goto L_0x01b0;
                case 1833534117: goto L_0x01a0;
                case 1838285406: goto L_0x0194;
                case 1879848989: goto L_0x0188;
                case 1898384884: goto L_0x017c;
                case 1918365262: goto L_0x0170;
                case 1923509823: goto L_0x0164;
                case 1958491740: goto L_0x0158;
                case 1988607424: goto L_0x014c;
                case 1993232620: goto L_0x0140;
                case 2004303352: goto L_0x0134;
                case 2011128923: goto L_0x0128;
                case 2025003104: goto L_0x011c;
                case 2036525909: goto L_0x0110;
                case 2047203200: goto L_0x0100;
                case 2047854100: goto L_0x00f4;
                case 2056795640: goto L_0x00e8;
                case 2062269606: goto L_0x00d8;
                case 2096880736: goto L_0x00cc;
                case 2097113147: goto L_0x00c0;
                case 2104207192: goto L_0x00b4;
                case 2120648281: goto L_0x00a8;
                case 2127410790: goto L_0x009c;
                case 2132271318: goto L_0x0090;
                case 2138256771: goto L_0x0080;
                default: goto L_0x0079;
            }     // Catch:{ all -> 0x0aaa }
        L_0x0079:
            java.lang.String r0 = "structName="
            java.lang.IllegalArgumentException r3 = X.AnonymousClass7TF.A0W(r0, r14)     // Catch:{ all -> 0x0aaa }
        L_0x007f:
            throw r3     // Catch:{ all -> 0x0aaa }
        L_0x0080:
            r0 = 2842(0xb1a, float:3.982E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.State> r0 = com.facebook.fbwebrtc.multiway.State.class
            goto L_0x0a43
        L_0x0090:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.Media"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.Media> r0 = com.facebook.fbwebrtc.multiway.Media.class
            goto L_0x0a43
        L_0x009c:
            java.lang.String r0 = "com.facebook.logginginfra.falco.CollectionConstraintExpression"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.CollectionConstraintExpression> r0 = com.facebook.logginginfra.falco.CollectionConstraintExpression.class
            goto L_0x0a43
        L_0x00a8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.JoinResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.JoinResponse> r0 = com.facebook.fbwebrtc.multiway.JoinResponse.class
            goto L_0x0a43
        L_0x00b4:
            java.lang.String r0 = "com.facebook.fbwebrtc.StreamInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.StreamInfo> r0 = com.facebook.fbwebrtc.StreamInfo.class
            goto L_0x0a43
        L_0x00c0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.TSocketAddress"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.TSocketAddress> r0 = com.facebook.fbwebrtc.multiway.TSocketAddress.class
            goto L_0x0a43
        L_0x00cc:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SsrcGroup"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SsrcGroup> r0 = com.facebook.fbwebrtc.multiway.SsrcGroup.class
            goto L_0x0a43
        L_0x00d8:
            r0 = 2837(0xb15, float:3.975E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.EndpointSettings> r0 = com.facebook.fbwebrtc.multiway.EndpointSettings.class
            goto L_0x0a43
        L_0x00e8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.NotifyResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.NotifyResponse> r0 = com.facebook.fbwebrtc.multiway.NotifyResponse.class
            goto L_0x0a43
        L_0x00f4:
            java.lang.String r0 = "com.facebook.logginginfra.falco.SetClientDebugConfigDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.SetClientDebugConfigDirective> r0 = com.facebook.logginginfra.falco.SetClientDebugConfigDirective.class
            goto L_0x0a43
        L_0x0100:
            r0 = 2832(0xb10, float:3.968E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientTrackInfo> r0 = com.facebook.fbwebrtc.multiway.ClientTrackInfo.class
            goto L_0x0a43
        L_0x0110:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientMediaUpdateResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientMediaUpdateResponse> r0 = com.facebook.fbwebrtc.multiway.ClientMediaUpdateResponse.class
            goto L_0x0a43
        L_0x011c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SyncAck"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SyncAck> r0 = com.facebook.fbwebrtc.multiway.SyncAck.class
            goto L_0x0a43
        L_0x0128:
            java.lang.String r0 = "com.facebook.logginginfra.falco.MobileClientSource"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.MobileClientSource> r0 = com.facebook.logginginfra.falco.MobileClientSource.class
            goto L_0x0a43
        L_0x0134:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.NotifyRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.NotifyRequest> r0 = com.facebook.fbwebrtc.multiway.NotifyRequest.class
            goto L_0x0a43
        L_0x0140:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ParticipantState"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ParticipantState> r0 = com.facebook.fbwebrtc.multiway.ParticipantState.class
            goto L_0x0a43
        L_0x014c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.GroupOfUsers"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.GroupOfUsers> r0 = com.facebook.fbwebrtc.multiway.GroupOfUsers.class
            goto L_0x0a43
        L_0x0158:
            java.lang.String r0 = "com.facebook.logginginfra.falco.SamplingConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.SamplingConfig> r0 = com.facebook.logginginfra.falco.SamplingConfig.class
            goto L_0x0a43
        L_0x0164:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonFullSampling"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonFullSampling> r0 = com.facebook.logginginfra.falco.PigeonFullSampling.class
            goto L_0x0a43
        L_0x0170:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientEventRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientEventRequest> r0 = com.facebook.fbwebrtc.multiway.ClientEventRequest.class
            goto L_0x0a43
        L_0x017c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SfuAllocation"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SfuAllocation> r0 = com.facebook.fbwebrtc.multiway.SfuAllocation.class
            goto L_0x0a43
        L_0x0188:
            java.lang.String r0 = "com.facebook.fbwebrtc.WebrtcMessageHeader"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.WebrtcMessageHeader> r0 = com.facebook.fbwebrtc.WebrtcMessageHeader.class
            goto L_0x0a43
        L_0x0194:
            java.lang.String r0 = "com.facebook.fbwebrtc.P2PSfuAllocation"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.P2PSfuAllocation> r0 = com.facebook.fbwebrtc.P2PSfuAllocation.class
            goto L_0x0a43
        L_0x01a0:
            r0 = 2836(0xb14, float:3.974E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.E2eeEnforcement> r0 = com.facebook.fbwebrtc.multiway.E2eeEnforcement.class
            goto L_0x0a43
        L_0x01b0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.StateSyncTopicConfigMap"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.StateSyncTopicConfigMap> r0 = com.facebook.fbwebrtc.multiway.StateSyncTopicConfigMap.class
            goto L_0x0a43
        L_0x01bc:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.DataMessageResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DataMessageResponse> r0 = com.facebook.fbwebrtc.multiway.DataMessageResponse.class
            goto L_0x0a43
        L_0x01c8:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.Extmap"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.Extmap> r0 = com.facebook.fbwebrtc.sdp.Extmap.class
            goto L_0x0a43
        L_0x01d4:
            java.lang.String r0 = "com.facebook.logginginfra.falco.CollectionConstraint"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.CollectionConstraint> r0 = com.facebook.logginginfra.falco.CollectionConstraint.class
            goto L_0x0a43
        L_0x01e0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ProxygenAllocation"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ProxygenAllocation> r0 = com.facebook.fbwebrtc.multiway.ProxygenAllocation.class
            goto L_0x0a43
        L_0x01ec:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ConferenceStateResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ConferenceStateResponse> r0 = com.facebook.fbwebrtc.multiway.ConferenceStateResponse.class
            goto L_0x0a43
        L_0x01f8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.TopicConfiguration"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.TopicConfiguration> r0 = com.facebook.fbwebrtc.multiway.TopicConfiguration.class
            goto L_0x0a43
        L_0x0204:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PrivacyContext"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PrivacyContext> r0 = com.facebook.logginginfra.falco.PrivacyContext.class
            goto L_0x0a43
        L_0x0210:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonNestRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonNestRequest> r0 = com.facebook.logginginfra.falco.PigeonNestRequest.class
            goto L_0x0a43
        L_0x021c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ServerMediaUpdate"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ServerMediaUpdate> r0 = com.facebook.fbwebrtc.multiway.ServerMediaUpdate.class
            goto L_0x0a43
        L_0x0228:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SubscriptionOptions"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SubscriptionOptions> r0 = com.facebook.fbwebrtc.multiway.SubscriptionOptions.class
            goto L_0x0a43
        L_0x0234:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonSamplingConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonSamplingConfig> r0 = com.facebook.logginginfra.falco.PigeonSamplingConfig.class
            goto L_0x0a43
        L_0x0240:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RemoveParticipantsRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RemoveParticipantsRequest> r0 = com.facebook.fbwebrtc.multiway.RemoveParticipantsRequest.class
            goto L_0x0a43
        L_0x024c:
            r0 = 2843(0xb1b, float:3.984E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SyncPayload> r0 = com.facebook.fbwebrtc.multiway.SyncPayload.class
            goto L_0x0a43
        L_0x025c:
            java.lang.String r0 = "com.facebook.logginginfra.falco.SetQPLConfigDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.SetQPLConfigDirective> r0 = com.facebook.logginginfra.falco.SetQPLConfigDirective.class
            goto L_0x0a43
        L_0x0268:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ServerMediaUpdateRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ServerMediaUpdateRequest> r0 = com.facebook.fbwebrtc.multiway.ServerMediaUpdateRequest.class
            goto L_0x0a43
        L_0x0274:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RtcMessageBodyVariant"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RtcMessageBodyVariant> r0 = com.facebook.fbwebrtc.multiway.RtcMessageBodyVariant.class
            goto L_0x0a43
        L_0x0280:
            java.lang.String r0 = "com.facebook.fbwebrtc.NackPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.NackPayload> r0 = com.facebook.fbwebrtc.NackPayload.class
            goto L_0x0a43
        L_0x028c:
            java.lang.String r0 = "com.facebook.logginginfra.falco.ForegroundSession"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.ForegroundSession> r0 = com.facebook.logginginfra.falco.ForegroundSession.class
            goto L_0x0a43
        L_0x0298:
            java.lang.String r0 = "com.facebook.fbwebrtc.PrOfferAckPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.PrOfferAckPayload> r0 = com.facebook.fbwebrtc.PrOfferAckPayload.class
            goto L_0x0a43
        L_0x02a4:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SessionDescriptionUpdate"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SessionDescriptionUpdate> r0 = com.facebook.fbwebrtc.multiway.SessionDescriptionUpdate.class
            goto L_0x0a43
        L_0x02b0:
            java.lang.String r0 = "com.facebook.fbwebrtc.AckPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.AckPayload> r0 = com.facebook.fbwebrtc.AckPayload.class
            goto L_0x0a43
        L_0x02bc:
            java.lang.String r0 = "com.facebook.logginginfra.falco.AppScopedIdentity"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.AppScopedIdentity> r0 = com.facebook.logginginfra.falco.AppScopedIdentity.class
            goto L_0x0a43
        L_0x02c8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.DominantSpeakerNotification"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DominantSpeakerNotification> r0 = com.facebook.fbwebrtc.multiway.DominantSpeakerNotification.class
            goto L_0x0a43
        L_0x02d4:
            java.lang.String r0 = "com.facebook.fbwebrtc.WebrtcMessageEndpoint"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.WebrtcMessageEndpoint> r0 = com.facebook.fbwebrtc.WebrtcMessageEndpoint.class
            goto L_0x0a43
        L_0x02e0:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonSamplingType"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonSamplingType> r0 = com.facebook.logginginfra.falco.PigeonSamplingType.class
            goto L_0x0a43
        L_0x02ec:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.QuickExperimentExposureLoggingEvent"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.QuickExperimentExposureLoggingEvent> r0 = com.facebook.fbwebrtc.multiway.QuickExperimentExposureLoggingEvent.class
            goto L_0x0a43
        L_0x02f8:
            java.lang.String r0 = "com.facebook.logginginfra.falco.ScalingFactor"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.ScalingFactor> r0 = com.facebook.logginginfra.falco.ScalingFactor.class
            goto L_0x0a43
        L_0x0304:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.Snapshot"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.Snapshot> r0 = com.facebook.fbwebrtc.multiway.Snapshot.class
            goto L_0x0a43
        L_0x0310:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Identity"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Identity> r0 = com.facebook.logginginfra.falco.Identity.class
            goto L_0x0a43
        L_0x031c:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FacebookIdentity"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FacebookIdentity> r0 = com.facebook.logginginfra.falco.FacebookIdentity.class
            goto L_0x0a43
        L_0x0328:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.AudioDuplicationDebugInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.AudioDuplicationDebugInfo> r0 = com.facebook.fbwebrtc.multiway.AudioDuplicationDebugInfo.class
            goto L_0x0a43
        L_0x0334:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.UpdateResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.UpdateResponse> r0 = com.facebook.fbwebrtc.multiway.UpdateResponse.class
            goto L_0x0a43
        L_0x0340:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.TurnInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.TurnInfo> r0 = com.facebook.fbwebrtc.multiway.TurnInfo.class
            goto L_0x0a43
        L_0x034c:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Response"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Response> r0 = com.facebook.logginginfra.falco.Response.class
            goto L_0x0a43
        L_0x0358:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.E2eeData"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.E2eeData> r0 = com.facebook.fbwebrtc.multiway.E2eeData.class
            goto L_0x0a43
        L_0x0364:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PrincipalSubject"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PrincipalSubject> r0 = com.facebook.logginginfra.falco.PrincipalSubject.class
            goto L_0x0a43
        L_0x0370:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ProductMetadata"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ProductMetadata> r0 = com.facebook.fbwebrtc.multiway.ProductMetadata.class
            goto L_0x0a43
        L_0x037c:
            java.lang.String r0 = "com.facebook.fbwebrtc.WebrtcMessagePayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.WebrtcMessagePayload> r0 = com.facebook.fbwebrtc.WebrtcMessagePayload.class
            goto L_0x0a43
        L_0x0388:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ServerOnlyParticipantState"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ServerOnlyParticipantState> r0 = com.facebook.fbwebrtc.multiway.ServerOnlyParticipantState.class
            goto L_0x0a43
        L_0x0394:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FunnelEventSamplingConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FunnelEventSamplingConfig> r0 = com.facebook.logginginfra.falco.FunnelEventSamplingConfig.class
            goto L_0x0a43
        L_0x03a0:
            java.lang.String r0 = "com.facebook.logginginfra.falco.EncodedData"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.EncodedData> r0 = com.facebook.logginginfra.falco.EncodedData.class
            goto L_0x0a43
        L_0x03ac:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FunnelFullSampling"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FunnelFullSampling> r0 = com.facebook.logginginfra.falco.FunnelFullSampling.class
            goto L_0x0a43
        L_0x03b8:
            java.lang.String r0 = "com.facebook.fbwebrtc.VideoRequestPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.VideoRequestPayload> r0 = com.facebook.fbwebrtc.VideoRequestPayload.class
            goto L_0x0a43
        L_0x03c4:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.CryptoParam"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.CryptoParam> r0 = com.facebook.fbwebrtc.sdp.CryptoParam.class
            goto L_0x0a43
        L_0x03d0:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.IceCandidateSdp"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.IceCandidateSdp> r0 = com.facebook.fbwebrtc.sdp.IceCandidateSdp.class
            goto L_0x0a43
        L_0x03dc:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.MediaDescriptionUpdate"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.MediaDescriptionUpdate> r0 = com.facebook.fbwebrtc.multiway.MediaDescriptionUpdate.class
            goto L_0x0a43
        L_0x03e8:
            java.lang.String r0 = "com.facebook.fbwebrtc.OfferPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.OfferPayload> r0 = com.facebook.fbwebrtc.OfferPayload.class
            goto L_0x0a43
        L_0x03f4:
            java.lang.String r0 = "com.facebook.logginginfra.falco.SamplingRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.SamplingRequest> r0 = com.facebook.logginginfra.falco.SamplingRequest.class
            goto L_0x0a43
        L_0x0400:
            java.lang.String r0 = "com.facebook.logginginfra.falco.GetFalcoSamplingConfigDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.GetFalcoSamplingConfigDirective> r0 = com.facebook.logginginfra.falco.GetFalcoSamplingConfigDirective.class
            goto L_0x0a43
        L_0x040c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ReceiveTrackDebugInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ReceiveTrackDebugInfo> r0 = com.facebook.fbwebrtc.multiway.ReceiveTrackDebugInfo.class
            goto L_0x0a43
        L_0x0418:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.UnsubscribeRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.UnsubscribeRequest> r0 = com.facebook.fbwebrtc.multiway.UnsubscribeRequest.class
            goto L_0x0a43
        L_0x0424:
            java.lang.String r0 = "com.facebook.fbwebrtc.OfferNackPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.OfferNackPayload> r0 = com.facebook.fbwebrtc.OfferNackPayload.class
            goto L_0x0a43
        L_0x0430:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonNestResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonNestResponse> r0 = com.facebook.logginginfra.falco.PigeonNestResponse.class
            goto L_0x0a43
        L_0x043c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ResolutionData"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ResolutionData> r0 = com.facebook.fbwebrtc.multiway.ResolutionData.class
            goto L_0x0a43
        L_0x0448:
            java.lang.String r0 = "com.facebook.logginginfra.falco.SetFalcoSamplingConfigDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.SetFalcoSamplingConfigDirective> r0 = com.facebook.logginginfra.falco.SetFalcoSamplingConfigDirective.class
            goto L_0x0a43
        L_0x0454:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RenderResolutionMessageFromClient"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RenderResolutionMessageFromClient> r0 = com.facebook.fbwebrtc.multiway.RenderResolutionMessageFromClient.class
            goto L_0x0a43
        L_0x0460:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ServerMediaUpdateResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ServerMediaUpdateResponse> r0 = com.facebook.fbwebrtc.multiway.ServerMediaUpdateResponse.class
            goto L_0x0a43
        L_0x046c:
            r0 = 2835(0xb13, float:3.973E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DataMessageBody> r0 = com.facebook.fbwebrtc.multiway.DataMessageBody.class
            goto L_0x0a43
        L_0x047c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.DismissRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DismissRequest> r0 = com.facebook.fbwebrtc.multiway.DismissRequest.class
            goto L_0x0a43
        L_0x0488:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientConditional"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientConditional> r0 = com.facebook.fbwebrtc.multiway.ClientConditional.class
            goto L_0x0a43
        L_0x0494:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RtcSender"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RtcSender> r0 = com.facebook.fbwebrtc.multiway.RtcSender.class
            goto L_0x0a43
        L_0x04a0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.DominantSpeakerInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DominantSpeakerInfo> r0 = com.facebook.fbwebrtc.multiway.DominantSpeakerInfo.class
            goto L_0x0a43
        L_0x04ac:
            r0 = 723(0x2d3, float:1.013E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.HangupRequest> r0 = com.facebook.fbwebrtc.multiway.HangupRequest.class
            goto L_0x0a43
        L_0x04bc:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonEventSamplingConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonEventSamplingConfig> r0 = com.facebook.logginginfra.falco.PigeonEventSamplingConfig.class
            goto L_0x0a43
        L_0x04c8:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Session"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Session> r0 = com.facebook.logginginfra.falco.Session.class
            goto L_0x0a43
        L_0x04d4:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RtcException"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RtcException> r0 = com.facebook.fbwebrtc.multiway.RtcException.class
            goto L_0x0a43
        L_0x04e0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ConnectResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ConnectResponse> r0 = com.facebook.fbwebrtc.multiway.ConnectResponse.class
            goto L_0x0a43
        L_0x04ec:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonNestDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonNestDirective> r0 = com.facebook.logginginfra.falco.PigeonNestDirective.class
            goto L_0x0a43
        L_0x04f8:
            java.lang.String r0 = "com.facebook.logginginfra.falco.EventPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.EventPayload> r0 = com.facebook.logginginfra.falco.EventPayload.class
            goto L_0x0a43
        L_0x0504:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.UpdateRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.UpdateRequest> r0 = com.facebook.fbwebrtc.multiway.UpdateRequest.class
            goto L_0x0a43
        L_0x0510:
            java.lang.String r0 = "com.facebook.fbwebrtc.TrackInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.TrackInfo> r0 = com.facebook.fbwebrtc.TrackInfo.class
            goto L_0x0a43
        L_0x051c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RtcReceiver"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RtcReceiver> r0 = com.facebook.fbwebrtc.multiway.RtcReceiver.class
            goto L_0x0a43
        L_0x0528:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Upload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Upload> r0 = com.facebook.logginginfra.falco.Upload.class
            goto L_0x0a43
        L_0x0534:
            java.lang.String r0 = "com.facebook.fbwebrtc.SdpUpdatePayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.SdpUpdatePayload> r0 = com.facebook.fbwebrtc.SdpUpdatePayload.class
            goto L_0x0a43
        L_0x0540:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Source"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Source> r0 = com.facebook.logginginfra.falco.Source.class
            goto L_0x0a43
        L_0x054c:
            java.lang.String r0 = "com.facebook.logginginfra.falco.WebClientSource"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.WebClientSource> r0 = com.facebook.logginginfra.falco.WebClientSource.class
            goto L_0x0a43
        L_0x0558:
            java.lang.String r0 = "com.facebook.logginginfra.falco.BackendServiceIntegration"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.BackendServiceIntegration> r0 = com.facebook.logginginfra.falco.BackendServiceIntegration.class
            goto L_0x0a43
        L_0x0564:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.UnsubscribeResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.UnsubscribeResponse> r0 = com.facebook.fbwebrtc.multiway.UnsubscribeResponse.class
            goto L_0x0a43
        L_0x0570:
            java.lang.String r0 = "com.facebook.logginginfra.falco.BladeRunnerIntegration"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.BladeRunnerIntegration> r0 = com.facebook.logginginfra.falco.BladeRunnerIntegration.class
            goto L_0x0a43
        L_0x057c:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FunnelSamplingType"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FunnelSamplingType> r0 = com.facebook.logginginfra.falco.FunnelSamplingType.class
            goto L_0x0a43
        L_0x0588:
            java.lang.String r0 = "com.facebook.fbwebrtc.RingPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.RingPayload> r0 = com.facebook.fbwebrtc.RingPayload.class
            goto L_0x0a43
        L_0x0594:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonNestResponseDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonNestResponseDirective> r0 = com.facebook.logginginfra.falco.PigeonNestResponseDirective.class
            goto L_0x0a43
        L_0x05a0:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Integration"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Integration> r0 = com.facebook.logginginfra.falco.Integration.class
            goto L_0x0a43
        L_0x05ac:
            java.lang.String r0 = "com.facebook.fbwebrtc.ClientReportedEventPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.ClientReportedEventPayload> r0 = com.facebook.fbwebrtc.ClientReportedEventPayload.class
            goto L_0x0a43
        L_0x05b8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RtcMultiwayMessage"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RtcMultiwayMessage> r0 = com.facebook.fbwebrtc.multiway.RtcMultiwayMessage.class
            goto L_0x0a43
        L_0x05c4:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.Subscription"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.Subscription> r0 = com.facebook.fbwebrtc.multiway.Subscription.class
            goto L_0x0a43
        L_0x05d0:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Lambda"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Lambda> r0 = com.facebook.logginginfra.falco.Lambda.class
            goto L_0x0a43
        L_0x05dc:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RelayInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RelayInfo> r0 = com.facebook.fbwebrtc.multiway.RelayInfo.class
            goto L_0x0a43
        L_0x05e8:
            r0 = 2841(0xb19, float:3.981E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SessionDescription> r0 = com.facebook.fbwebrtc.multiway.SessionDescription.class
            goto L_0x0a43
        L_0x05f8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SpeakerDetail"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SpeakerDetail> r0 = com.facebook.fbwebrtc.multiway.SpeakerDetail.class
            goto L_0x0a43
        L_0x0604:
            r0 = 2839(0xb17, float:3.978E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RingResponse> r0 = com.facebook.fbwebrtc.multiway.RingResponse.class
            goto L_0x0a43
        L_0x0614:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.DebugInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DebugInfo> r0 = com.facebook.fbwebrtc.multiway.DebugInfo.class
            goto L_0x0a43
        L_0x0620:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.EdgerayInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.EdgerayInfo> r0 = com.facebook.fbwebrtc.multiway.EdgerayInfo.class
            goto L_0x0a43
        L_0x062c:
            java.lang.String r0 = "com.facebook.fbwebrtc.OfferAckPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.OfferAckPayload> r0 = com.facebook.fbwebrtc.OfferAckPayload.class
            goto L_0x0a43
        L_0x0638:
            r0 = 73
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RtcMessageBody> r0 = com.facebook.fbwebrtc.multiway.RtcMessageBody.class
            goto L_0x0a43
        L_0x0648:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ConferenceStateRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ConferenceStateRequest> r0 = com.facebook.fbwebrtc.multiway.ConferenceStateRequest.class
            goto L_0x0a43
        L_0x0654:
            java.lang.String r0 = "com.facebook.logginginfra.falco.BackendServiceSource"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.BackendServiceSource> r0 = com.facebook.logginginfra.falco.BackendServiceSource.class
            goto L_0x0a43
        L_0x0660:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.Sdp"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.Sdp> r0 = com.facebook.fbwebrtc.sdp.Sdp.class
            goto L_0x0a43
        L_0x066c:
            java.lang.String r0 = "com.facebook.fbwebrtc.IceCandidatePayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.IceCandidatePayload> r0 = com.facebook.fbwebrtc.IceCandidatePayload.class
            goto L_0x0a43
        L_0x0678:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SubscriptionRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SubscriptionRequest> r0 = com.facebook.fbwebrtc.multiway.SubscriptionRequest.class
            goto L_0x0a43
        L_0x0684:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.IceCandidateRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.IceCandidateRequest> r0 = com.facebook.fbwebrtc.multiway.IceCandidateRequest.class
            goto L_0x0a43
        L_0x0690:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FetchSamplingConfigDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FetchSamplingConfigDirective> r0 = com.facebook.logginginfra.falco.FetchSamplingConfigDirective.class
            goto L_0x0a43
        L_0x069c:
            java.lang.String r0 = "com.facebook.fbwebrtc.AnswerAckPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.AnswerAckPayload> r0 = com.facebook.fbwebrtc.AnswerAckPayload.class
            goto L_0x0a43
        L_0x06a8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RenderResolutionMessageToClient"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RenderResolutionMessageToClient> r0 = com.facebook.fbwebrtc.multiway.RenderResolutionMessageToClient.class
            goto L_0x0a43
        L_0x06b4:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Request"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Request> r0 = com.facebook.logginginfra.falco.Request.class
            goto L_0x0a43
        L_0x06c0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SubscriptionMessageFromClient"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SubscriptionMessageFromClient> r0 = com.facebook.fbwebrtc.multiway.SubscriptionMessageFromClient.class
            goto L_0x0a43
        L_0x06cc:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.BweDebugInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.BweDebugInfo> r0 = com.facebook.fbwebrtc.multiway.BweDebugInfo.class
            goto L_0x0a43
        L_0x06d8:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.TransferRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.TransferRequest> r0 = com.facebook.fbwebrtc.multiway.TransferRequest.class
            goto L_0x0a43
        L_0x06e4:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientEventResponse"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientEventResponse> r0 = com.facebook.fbwebrtc.multiway.ClientEventResponse.class
            goto L_0x0a43
        L_0x06f0:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PigeonPartialSampling"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PigeonPartialSampling> r0 = com.facebook.logginginfra.falco.PigeonPartialSampling.class
            goto L_0x0a43
        L_0x06fc:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ProxygenCandidate"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ProxygenCandidate> r0 = com.facebook.fbwebrtc.multiway.ProxygenCandidate.class
            goto L_0x0a43
        L_0x0708:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientEvent"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientEvent> r0 = com.facebook.fbwebrtc.multiway.ClientEvent.class
            goto L_0x0a43
        L_0x0714:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FunnelPartialSampling"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FunnelPartialSampling> r0 = com.facebook.logginginfra.falco.FunnelPartialSampling.class
            goto L_0x0a43
        L_0x0720:
            java.lang.String r0 = "com.facebook.fbwebrtc.AnswerPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.AnswerPayload> r0 = com.facebook.fbwebrtc.AnswerPayload.class
            goto L_0x0a43
        L_0x072c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientInfo> r0 = com.facebook.fbwebrtc.multiway.ClientInfo.class
            goto L_0x0a43
        L_0x0738:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientSessionInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientSessionInfo> r0 = com.facebook.fbwebrtc.multiway.ClientSessionInfo.class
            goto L_0x0a43
        L_0x0744:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ReceiverBottleneck"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ReceiverBottleneck> r0 = com.facebook.fbwebrtc.multiway.ReceiverBottleneck.class
            goto L_0x0a43
        L_0x0750:
            java.lang.String r0 = "com.facebook.logginginfra.falco.PartitioningKey"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.PartitioningKey> r0 = com.facebook.logginginfra.falco.PartitioningKey.class
            goto L_0x0a43
        L_0x075c:
            java.lang.String r0 = "com.facebook.fbwebrtc.OkPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.OkPayload> r0 = com.facebook.fbwebrtc.OkPayload.class
            goto L_0x0a43
        L_0x0768:
            r0 = 2833(0xb11, float:3.97E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DataHeader> r0 = com.facebook.fbwebrtc.multiway.DataHeader.class
            goto L_0x0a43
        L_0x0778:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientMediaUpdateRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientMediaUpdateRequest> r0 = com.facebook.fbwebrtc.multiway.ClientMediaUpdateRequest.class
            goto L_0x0a43
        L_0x0784:
            java.lang.String r0 = "com.facebook.fbwebrtc.SwitchToMultiwayPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.SwitchToMultiwayPayload> r0 = com.facebook.fbwebrtc.SwitchToMultiwayPayload.class
            goto L_0x0a43
        L_0x0790:
            r0 = 2834(0xb12, float:3.971E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DataMessage> r0 = com.facebook.fbwebrtc.multiway.DataMessage.class
            goto L_0x0a43
        L_0x07a0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientMediaUpdate"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientMediaUpdate> r0 = com.facebook.fbwebrtc.multiway.ClientMediaUpdate.class
            goto L_0x0a43
        L_0x07ac:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.Bandwidth"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.Bandwidth> r0 = com.facebook.fbwebrtc.sdp.Bandwidth.class
            goto L_0x0a43
        L_0x07b8:
            java.lang.String r0 = "com.facebook.logginginfra.falco.QPLEventConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.QPLEventConfig> r0 = com.facebook.logginginfra.falco.QPLEventConfig.class
            goto L_0x0a43
        L_0x07c4:
            r0 = 2831(0xb0f, float:3.967E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientMediaStatus> r0 = com.facebook.fbwebrtc.multiway.ClientMediaStatus.class
            goto L_0x0a43
        L_0x07d4:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.UserProfile"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.UserProfile> r0 = com.facebook.fbwebrtc.multiway.UserProfile.class
            goto L_0x0a43
        L_0x07e0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.QuickExperimentResult"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.QuickExperimentResult> r0 = com.facebook.fbwebrtc.multiway.QuickExperimentResult.class
            goto L_0x0a43
        L_0x07ec:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SignalingMessageToClient"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SignalingMessageToClient> r0 = com.facebook.fbwebrtc.multiway.SignalingMessageToClient.class
            goto L_0x0a43
        L_0x07f8:
            r0 = 2830(0xb0e, float:3.966E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.GenericDataMessage> r0 = com.facebook.fbwebrtc.GenericDataMessage.class
            goto L_0x0a43
        L_0x0808:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Identifier"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Identifier> r0 = com.facebook.logginginfra.falco.Identifier.class
            goto L_0x0a43
        L_0x0814:
            java.lang.String r0 = "com.facebook.logginginfra.falco.GetQPLConfigDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.GetQPLConfigDirective> r0 = com.facebook.logginginfra.falco.GetQPLConfigDirective.class
            goto L_0x0a43
        L_0x0820:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.SsrcGroup"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.SsrcGroup> r0 = com.facebook.fbwebrtc.sdp.SsrcGroup.class
            goto L_0x0a43
        L_0x082c:
            java.lang.String r0 = "com.facebook.fbwebrtc.HangUpPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.HangUpPayload> r0 = com.facebook.fbwebrtc.HangUpPayload.class
            goto L_0x0a43
        L_0x0838:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ApprovalRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ApprovalRequest> r0 = com.facebook.fbwebrtc.multiway.ApprovalRequest.class
            goto L_0x0a43
        L_0x0844:
            java.lang.String r0 = "com.facebook.logginginfra.falco.ClientDebugConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.ClientDebugConfig> r0 = com.facebook.logginginfra.falco.ClientDebugConfig.class
            goto L_0x0a43
        L_0x0850:
            java.lang.String r0 = "com.facebook.logginginfra.falco.ClientSource"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.ClientSource> r0 = com.facebook.logginginfra.falco.ClientSource.class
            goto L_0x0a43
        L_0x085c:
            java.lang.String r0 = "com.facebook.fbwebrtc.NotifyMediaStatePayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.NotifyMediaStatePayload> r0 = com.facebook.fbwebrtc.NotifyMediaStatePayload.class
            goto L_0x0a43
        L_0x0868:
            java.lang.String r0 = "com.facebook.logginginfra.falco.SamplingChecksum"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.SamplingChecksum> r0 = com.facebook.logginginfra.falco.SamplingChecksum.class
            goto L_0x0a43
        L_0x0874:
            java.lang.String r0 = "com.facebook.logginginfra.falco.QPLCrashResiliency"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.QPLCrashResiliency> r0 = com.facebook.logginginfra.falco.QPLCrashResiliency.class
            goto L_0x0a43
        L_0x0880:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ThreadIdInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ThreadIdInfo> r0 = com.facebook.fbwebrtc.multiway.ThreadIdInfo.class
            goto L_0x0a43
        L_0x088c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.VideoUploadRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.VideoUploadRequest> r0 = com.facebook.fbwebrtc.multiway.VideoUploadRequest.class
            goto L_0x0a43
        L_0x0898:
            java.lang.String r0 = "com.facebook.logginginfra.falco.CollectionConstraintNode"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.CollectionConstraintNode> r0 = com.facebook.logginginfra.falco.CollectionConstraintNode.class
            goto L_0x0a43
        L_0x08a4:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ProxygenAllocationResult"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ProxygenAllocationResult> r0 = com.facebook.fbwebrtc.multiway.ProxygenAllocationResult.class
            goto L_0x0a43
        L_0x08b0:
            r0 = 2840(0xb18, float:3.98E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RtcMessageHeader> r0 = com.facebook.fbwebrtc.multiway.RtcMessageHeader.class
            goto L_0x0a43
        L_0x08c0:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Proxy"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Proxy> r0 = com.facebook.logginginfra.falco.Proxy.class
            goto L_0x0a43
        L_0x08cc:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Checksum"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Checksum> r0 = com.facebook.logginginfra.falco.Checksum.class
            goto L_0x0a43
        L_0x08d8:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Event"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Event> r0 = com.facebook.logginginfra.falco.Event.class
            goto L_0x0a43
        L_0x08e4:
            java.lang.String r0 = "com.facebook.logginginfra.falco.Batch"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.Batch> r0 = com.facebook.logginginfra.falco.Batch.class
            goto L_0x0a43
        L_0x08f0:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.QuickExperiment"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.QuickExperiment> r0 = com.facebook.fbwebrtc.multiway.QuickExperiment.class
            goto L_0x0a43
        L_0x08fc:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.SessionDescription"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.SessionDescription> r0 = com.facebook.fbwebrtc.sdp.SessionDescription.class
            goto L_0x0a43
        L_0x0908:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FunnelSamplingConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FunnelSamplingConfig> r0 = com.facebook.logginginfra.falco.FunnelSamplingConfig.class
            goto L_0x0a43
        L_0x0914:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.DataMessageRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.DataMessageRequest> r0 = com.facebook.fbwebrtc.multiway.DataMessageRequest.class
            goto L_0x0a43
        L_0x0920:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.SsrcObject"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.SsrcObject> r0 = com.facebook.fbwebrtc.sdp.SsrcObject.class
            goto L_0x0a43
        L_0x092c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.AddParticipantsRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.AddParticipantsRequest> r0 = com.facebook.fbwebrtc.multiway.AddParticipantsRequest.class
            goto L_0x0a43
        L_0x0938:
            java.lang.String r0 = "com.facebook.logginginfra.falco.QPLSamplingMethod"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.QPLSamplingMethod> r0 = com.facebook.logginginfra.falco.QPLSamplingMethod.class
            goto L_0x0a43
        L_0x0944:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.LoggingOptions"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.LoggingOptions> r0 = com.facebook.fbwebrtc.multiway.LoggingOptions.class
            goto L_0x0a43
        L_0x0950:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.IceCandidate"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.IceCandidate> r0 = com.facebook.fbwebrtc.multiway.IceCandidate.class
            goto L_0x0a43
        L_0x095c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.QuickExperimentValue"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.QuickExperimentValue> r0 = com.facebook.fbwebrtc.multiway.QuickExperimentValue.class
            goto L_0x0a43
        L_0x0968:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.CodecDescription"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.CodecDescription> r0 = com.facebook.fbwebrtc.sdp.CodecDescription.class
            goto L_0x0a43
        L_0x0974:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.Endpoint"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.Endpoint> r0 = com.facebook.fbwebrtc.multiway.Endpoint.class
            goto L_0x0a43
        L_0x0980:
            java.lang.String r0 = "com.facebook.fbwebrtc.PranswerPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.PranswerPayload> r0 = com.facebook.fbwebrtc.PranswerPayload.class
            goto L_0x0a43
        L_0x098c:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ConnectRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ConnectRequest> r0 = com.facebook.fbwebrtc.multiway.ConnectRequest.class
            goto L_0x0a43
        L_0x0998:
            java.lang.String r0 = "com.facebook.logginginfra.falco.ProcessRequestDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.ProcessRequestDirective> r0 = com.facebook.logginginfra.falco.ProcessRequestDirective.class
            goto L_0x0a43
        L_0x09a4:
            java.lang.String r0 = "com.facebook.logginginfra.falco.FalcoContext"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.FalcoContext> r0 = com.facebook.logginginfra.falco.FalcoContext.class
            goto L_0x0a43
        L_0x09b0:
            java.lang.String r0 = "com.facebook.fbwebrtc.SdpNegotiatePayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.SdpNegotiatePayload> r0 = com.facebook.fbwebrtc.SdpNegotiatePayload.class
            goto L_0x0a43
        L_0x09bc:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.MediaDescription"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.MediaDescription> r0 = com.facebook.fbwebrtc.sdp.MediaDescription.class
            goto L_0x0a43
        L_0x09c7:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.ClientResult"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.ClientResult> r0 = com.facebook.fbwebrtc.multiway.ClientResult.class
            goto L_0x0a43
        L_0x09d2:
            r0 = 2838(0xb16, float:3.977E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0aaa }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.JoinRequest> r0 = com.facebook.fbwebrtc.multiway.JoinRequest.class
            goto L_0x0a43
        L_0x09e1:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.SignalingMessageFromClient"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.SignalingMessageFromClient> r0 = com.facebook.fbwebrtc.multiway.SignalingMessageFromClient.class
            goto L_0x0a43
        L_0x09ec:
            java.lang.String r0 = "com.facebook.logginginfra.falco.QPLSamplingConfig"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.QPLSamplingConfig> r0 = com.facebook.logginginfra.falco.QPLSamplingConfig.class
            goto L_0x0a43
        L_0x09f7:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.NodeIdNotification"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.NodeIdNotification> r0 = com.facebook.fbwebrtc.multiway.NodeIdNotification.class
            goto L_0x0a43
        L_0x0a02:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.RingRequest"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.RingRequest> r0 = com.facebook.fbwebrtc.multiway.RingRequest.class
            goto L_0x0a43
        L_0x0a0d:
            java.lang.String r0 = "com.facebook.fbwebrtc.sdp.RtcpFbVal"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.sdp.RtcpFbVal> r0 = com.facebook.fbwebrtc.sdp.RtcpFbVal.class
            goto L_0x0a43
        L_0x0a18:
            java.lang.String r0 = "com.facebook.logginginfra.falco.GetClientDebugConfigDirective"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.logginginfra.falco.GetClientDebugConfigDirective> r0 = com.facebook.logginginfra.falco.GetClientDebugConfigDirective.class
            goto L_0x0a43
        L_0x0a23:
            java.lang.String r0 = "com.facebook.fbwebrtc.OtherDismissPayload"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.OtherDismissPayload> r0 = com.facebook.fbwebrtc.OtherDismissPayload.class
            goto L_0x0a43
        L_0x0a2e:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.MultipleRelaysAllocationParameters"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.MultipleRelaysAllocationParameters> r0 = com.facebook.fbwebrtc.multiway.MultipleRelaysAllocationParameters.class
            goto L_0x0a43
        L_0x0a39:
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.VideoUploadInfo"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.facebook.fbwebrtc.multiway.VideoUploadInfo> r0 = com.facebook.fbwebrtc.multiway.VideoUploadInfo.class
        L_0x0a43:
            java.lang.Object r5 = r0.newInstance()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0a4d }
            com.facebook.hyperthrift.HyperThriftBase r5 = (com.facebook.hyperthrift.HyperThriftBase) r5     // Catch:{ IllegalAccessException | InstantiationException -> 0x0a4d }
            r5.A02(r14, r4)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0a4d }
            goto L_0x0a9d
        L_0x0a4d:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0aaa }
            r3.<init>(r0)     // Catch:{ all -> 0x0aaa }
            goto L_0x007f
        L_0x0a55:
            short r5 = r0.A03     // Catch:{ all -> 0x0aaa }
            monitor-enter(r11)     // Catch:{ all -> 0x0aaa }
            android.util.SparseIntArray r6 = r11.A00     // Catch:{ all -> 0x0064 }
            if (r6 != 0) goto L_0x0a70
            android.util.SparseIntArray r6 = new android.util.SparseIntArray     // Catch:{ all -> 0x0064 }
            r6.<init>(r9)     // Catch:{ all -> 0x0064 }
            r12 = 0
        L_0x0a62:
            if (r12 >= r9) goto L_0x0a6e
            r0 = r10[r12]     // Catch:{ all -> 0x0064 }
            short r0 = r0.A02     // Catch:{ all -> 0x0064 }
            r6.put(r0, r12)     // Catch:{ all -> 0x0064 }
            int r12 = r12 + 1
            goto L_0x0a62
        L_0x0a6e:
            r11.A00 = r6     // Catch:{ all -> 0x0064 }
        L_0x0a70:
            r0 = -1
            int r6 = r6.get(r5, r0)     // Catch:{ all -> 0x0064 }
            monitor-exit(r11)     // Catch:{ all -> 0x0aaa }
            if (r6 < 0) goto L_0x0a93
            r0 = r10[r6]     // Catch:{ all -> 0x0aaa }
            X.Xac r0 = r0.A00     // Catch:{ XSk -> 0x0a83 }
            java.lang.Object r0 = r13.A01(r0, r7)     // Catch:{ XSk -> 0x0a83 }
            r4[r6] = r0     // Catch:{ XSk -> 0x0a83 }
            goto L_0x0a99
        L_0x0a83:
            r12 = move-exception
            java.lang.Short r0 = java.lang.Short.valueOf(r5)     // Catch:{ all -> 0x0aaa }
            java.lang.Object[] r6 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0aaa }
            java.lang.String r5 = "HyperThriftReader"
            java.lang.String r0 = "Type mismatch on field.id=%d"
            X.0KC.A0M(r5, r0, r12, r6)     // Catch:{ all -> 0x0aaa }
        L_0x0a93:
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.XVV.A00(r8, r7, r0)     // Catch:{ all -> 0x0aaa }
        L_0x0a99:
            int r3 = r3 + 1
            goto L_0x0067
        L_0x0a9d:
            r0 = 1
            if (r3 != r0) goto L_0x0aa3
            r5.A01()     // Catch:{ all -> 0x0aaa }
        L_0x0aa3:
            r0 = 1017706147(0x3ca8f6a3, float:0.020625418)
            X.0fc.A00(r1, r0)
            return r5
        L_0x0aaa:
            r3 = move-exception
            r0 = -967680909(0xffffffffc6525c73, float:-13463.112)
            X.0fc.A00(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21999Xq7.A00(X.Xq7, java.lang.String):com.facebook.hyperthrift.HyperThriftBase");
    }
}
