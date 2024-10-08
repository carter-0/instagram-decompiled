package X;

import android.util.Pair;

/* renamed from: X.SRu  reason: case insensitive filesystem */
public abstract class C11399SRu {
    public static final byte[] A00 = "OpusHead".getBytes(AnonymousClass2RN.A05);

    public static Pair A00(C11389SRd sRd, int i, int i2) {
        int i3;
        int i4;
        C11389SRd sRd2 = sRd;
        int i5 = sRd2.A01;
        while (i5 - i < i2) {
            int A06 = Pxf.A06(sRd2, i5);
            RS2.A00(AnonymousClass7TF.A1R(A06), "childAtomSize must be positive");
            if (sRd2.A01() == 1936289382) {
                int i6 = i5 + 8;
                C10720Rwy rwy = null;
                boolean z = false;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A06) {
                    int A062 = Pxf.A06(sRd2, i6);
                    int A01 = sRd2.A01();
                    if (A01 == 1718775137) {
                        num = Integer.valueOf(sRd2.A01());
                    } else if (A01 == 1935894637) {
                        sRd2.A0P(4);
                        str = sRd2.A0I(AnonymousClass2RN.A05, 4);
                    } else if (A01 == 1935894633) {
                        i7 = i6;
                        i8 = A062;
                    }
                    i6 += A062;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    RS2.A00(AnonymousClass7TF.A1V(num), "frma atom is mandatory");
                    RS2.A00(JTQ.A1O(i7, -1), "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        int A063 = Pxf.A06(sRd2, i9);
                        if (sRd2.A01() == 1952804451) {
                            int A012 = (sRd2.A01() >> 24) & 255;
                            sRd2.A0P(1);
                            if (A012 == 0) {
                                sRd2.A0P(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A05 = sRd2.A05();
                                i3 = (A05 & 240) >> 4;
                                i4 = A05 & 15;
                            }
                            boolean A1S = AnonymousClass7TF.A1S(sRd2.A05(), 1);
                            int A052 = sRd2.A05();
                            byte[] bArr2 = new byte[16];
                            sRd2.A0R(bArr2, 0, 16);
                            if (A1S && A052 == 0) {
                                int A053 = sRd2.A05();
                                bArr = new byte[A053];
                                sRd2.A0R(bArr, 0, A053);
                            }
                            rwy = new C10720Rwy(str, bArr2, bArr, A052, i3, i4, A1S);
                            z = true;
                        } else {
                            i9 += A063;
                        }
                    }
                    RS2.A00(z, "tenc atom is mandatory");
                    Pair create = Pair.create(num, rwy);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i5 += A06;
        }
        return null;
    }

    public static SOW A01(String str, int i) {
        SOW sow = new SOW();
        sow.A0T = Integer.toString(i);
        sow.A01(str);
        return sow;
    }

    public static C10649Rvi A02(C11389SRd sRd, int i) {
        String str;
        sRd.A0O(i + 8 + 4);
        sRd.A0P(1);
        do {
        } while ((sRd.A05() & 128) == 128);
        int A07 = Pxf.A07(sRd, 2);
        if ((A07 & 128) != 0) {
            sRd.A0P(2);
        }
        if ((A07 & 64) != 0) {
            sRd.A0P(sRd.A05());
        }
        if ((A07 & 32) != 0) {
            sRd.A0P(2);
        }
        sRd.A0P(1);
        do {
        } while ((sRd.A05() & 128) == 128);
        int A05 = sRd.A05();
        if (A05 == 32) {
            str = "video/mp4v-es";
        } else if (A05 == 33) {
            str = "video/avc";
        } else if (A05 != 35) {
            if (A05 != 64) {
                if (A05 == 163) {
                    str = "video/wvc1";
                } else if (A05 == 177) {
                    str = "video/x-vnd.on2.vp9";
                } else if (A05 == 221) {
                    str = "audio/vorbis";
                } else if (A05 == 165) {
                    str = "audio/ac3";
                } else if (A05 != 166) {
                    switch (A05) {
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                            str = "video/mpeg2";
                            break;
                        case 102:
                        case 103:
                        case 104:
                            break;
                        case 105:
                        case 107:
                            str = "audio/mpeg";
                            break;
                        case 106:
                            str = "video/mpeg";
                            break;
                        case 108:
                            str = "image/jpeg";
                            break;
                        default:
                            switch (A05) {
                                case 169:
                                case 172:
                                    str = "audio/vnd.dts";
                                    break;
                                case C11152SCh.MAX_FACTORIAL:
                                case 171:
                                    str = "audio/vnd.dts.hd";
                                    break;
                                case 173:
                                    str = "audio/opus";
                                    break;
                                case 174:
                                    str = "audio/ac4";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        if ("audio/mpeg".equals(str) || "audio/vnd.dts".equals(str) || "audio/vnd.dts.hd".equals(str)) {
            return new C10649Rvi(str, (byte[]) null, -1, -1);
        }
        sRd.A0P(4);
        long A0C = sRd.A0C();
        long A0C2 = sRd.A0C();
        int A072 = Pxf.A07(sRd, 1);
        int i2 = A072 & 127;
        while ((A072 & 128) == 128) {
            A072 = sRd.A05();
            i2 = (i2 << 7) | (A072 & 127);
        }
        byte[] bArr = new byte[i2];
        sRd.A0R(bArr, 0, i2);
        long j = -1;
        if (A0C2 <= 0) {
            A0C2 = -1;
        }
        if (A0C > 0) {
            j = A0C;
        }
        return new C10649Rvi(str, bArr, A0C2, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: X.Rwy[]} */
    /* JADX WARNING: type inference failed for: r37v1, types: [X.Tgb] */
    /* JADX WARNING: type inference failed for: r0v598, types: [X.SfN] */
    /* JADX WARNING: type inference failed for: r0v599, types: [X.SfM] */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x076a, code lost:
        if (r6 == -1) goto L_0x076c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x080a, code lost:
        if (r3 != 32) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x096b, code lost:
        if (r47 <= 0) goto L_0x096d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0ba3, code lost:
        if (r10 != 1) goto L_0x0b6b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0baa, code lost:
        if (r10 == false) goto L_0x0bac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0d20, code lost:
        if ((r2.A05() & 128) == 0) goto L_0x0d22;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0aaa  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0acf  */
    /* JADX WARNING: Removed duplicated region for block: B:658:0x0e2b  */
    /* JADX WARNING: Removed duplicated region for block: B:750:0x10af  */
    /* JADX WARNING: Removed duplicated region for block: B:752:0x10bc  */
    /* JADX WARNING: Removed duplicated region for block: B:839:0x128d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A03(androidx.media3.common.DrmInitData r78, X.C11237SGx r79, X.QEL r80, X.AnonymousClass2hV r81, long r82, boolean r84, boolean r85) {
        /*
            java.util.ArrayList r26 = X.AnonymousClass7TE.A1C()
            r21 = 0
        L_0x0006:
            r2 = r80
            java.util.List r3 = r2.A01
            int r1 = r3.size()
            r0 = r21
            if (r0 >= r1) goto L_0x1371
            java.lang.Object r25 = r3.get(r0)
            r0 = r25
            X.QEL r0 = (X.QEL) r0
            r25 = r0
            int r1 = r0.A00
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 != r0) goto L_0x0eaa
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            X.QEK r7 = r2.A01(r0)
            r7.getClass()
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r0 = r25
            X.QEL r4 = r0.A00(r1)
            r4.getClass()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.QEK r0 = r4.A01(r0)
            r0.getClass()
            X.SRd r0 = r0.A00
            r5 = 16
            int r1 = X.Pxf.A06(r0, r5)
            r0 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r1 != r0) goto L_0x0def
            r18 = 1
        L_0x0052:
            r24 = 0
            r8 = -1
            r0 = r18
            if (r0 == r8) goto L_0x0e48
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            r0 = r25
            X.QEK r0 = r0.A01(r1)
            r0.getClass()
            X.SRd r2 = r0.A00
            r3 = 8
            int r10 = X.Pxg.A04(r2)
            r33 = 16
            r0 = 16
            if (r10 != 0) goto L_0x0075
            r0 = 8
        L_0x0075:
            r2.A0P(r0)
            int r34 = r2.A01()
            r23 = 4
            r0 = r23
            r2.A0P(r0)
            int r6 = r2.A01
            if (r10 != 0) goto L_0x0088
            r3 = 4
        L_0x0088:
            r19 = 0
            r1 = 0
        L_0x008b:
            byte[] r0 = r2.A02
            int r9 = r6 + r1
            byte r0 = r0[r9]
            if (r0 == r8) goto L_0x0de8
            r6 = 0
        L_0x0094:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0dd4
            r2.A0P(r3)
        L_0x009e:
            r2.A0P(r5)
            int r9 = r2.A01()
            int r8 = r2.A01()
            r3 = r23
            r2.A0P(r3)
            int r6 = r2.A01()
            int r5 = r2.A01()
            r3 = 65536(0x10000, float:9.18355E-41)
            r2 = -65536(0xffffffffffff0000, float:NaN)
            if (r9 != 0) goto L_0x0dc8
            if (r8 != r3) goto L_0x0dbe
            if (r6 != r2) goto L_0x00c4
            if (r5 != 0) goto L_0x00c4
            r19 = 90
        L_0x00c4:
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r82 > r67 ? 1 : (r82 == r67 ? 0 : -1))
            if (r2 == 0) goto L_0x00cf
            r0 = r82
        L_0x00cf:
            X.SRd r2 = r7.A00
            r32 = 8
            int r3 = X.Pxg.A04(r2)
            if (r3 != 0) goto L_0x0db4
            long r6 = r2.A0C()
            long r8 = r2.A0C()
        L_0x00e1:
            long r10 = r2.A0C()
            androidx.media3.container.Mp4TimestampData r5 = new androidx.media3.container.Mp4TimestampData
            r5.<init>(r6, r8, r10)
            long r2 = r5.A02
            r76 = r2
            int r2 = (r0 > r67 ? 1 : (r0 == r67 ? 0 : -1))
            if (r2 == 0) goto L_0x00f8
            r2 = r76
            long r67 = androidx.media3.common.util.Util.A05(r0, r2)
        L_0x00f8:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.QEL r1 = r4.A00(r0)
            r1.getClass()
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.QEL r2 = r1.A00(r0)
            r2.getClass()
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            X.QEK r0 = r4.A01(r0)
            r0.getClass()
            X.SRd r3 = r0.A00
            r1 = 8
            int r6 = X.Pxg.A04(r3)
            r0 = 16
            if (r6 != 0) goto L_0x0124
            r0 = 8
        L_0x0124:
            r3.A0P(r0)
            long r4 = r3.A0C()
            if (r6 != 0) goto L_0x012e
            r1 = 4
        L_0x012e:
            r3.A0P(r1)
            int r3 = r3.A08()
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = ""
            r1.append(r0)
            int r0 = r3 >> 10
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r3 >> 5
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            r0 = r3 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            java.lang.String r1 = X.C51967G9n.A0r(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            android.util.Pair r31 = android.util.Pair.create(r0, r1)
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            X.QEK r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x1360
            X.SRd r2 = r0.A00
            r0 = r31
            java.lang.Object r0 = r0.second
            r28 = r0
            r0 = r28
            java.lang.String r0 = (java.lang.String) r0
            r28 = r0
            r0 = 12
            int r29 = X.Pxf.A06(r2, r0)
            r55 = 0
            r30 = 0
            r0 = r29
            X.Rwy[] r0 = new X.C10720Rwy[r0]
            r22 = r0
            r61 = 0
            r17 = 0
        L_0x018e:
            r1 = r17
            r0 = r29
            if (r1 >= r0) goto L_0x0d64
            int r0 = r2.A01
            r16 = r0
            int r20 = r2.A01()
            boolean r1 = X.AnonymousClass7TF.A1R(r20)
            java.lang.String r27 = "childAtomSize must be positive"
            r0 = r27
            X.RS2.A00(r1, r0)
            int r1 = r2.A01()
            r0 = 1635148593(0x61766331, float:2.840654E20)
            r7 = r78
            if (r1 == r0) goto L_0x087d
            r0 = 1635148595(0x61766333, float:2.8406544E20)
            if (r1 == r0) goto L_0x087d
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r1 == r0) goto L_0x087d
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r1 == r0) goto L_0x087d
            r0 = 1836070006(0x6d703476, float:4.646239E27)
            if (r1 == r0) goto L_0x087d
            r0 = 1752589105(0x68766331, float:4.6541277E24)
            if (r1 == r0) goto L_0x087d
            r0 = 1751479857(0x68657631, float:4.3344087E24)
            if (r1 == r0) goto L_0x087d
            r0 = 1932670515(0x73323633, float:1.4119387E31)
            if (r1 == r0) goto L_0x087d
            r0 = 1211250227(0x48323633, float:182488.8)
            if (r1 == r0) goto L_0x087d
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r1 == r0) goto L_0x087d
            r0 = 1987063865(0x76703039, float:1.2178997E33)
            if (r1 == r0) goto L_0x087d
            r0 = 1635135537(0x61763031, float:2.8383572E20)
            if (r1 == r0) goto L_0x087d
            r0 = 1685479798(0x64766176, float:1.8179687E22)
            if (r1 == r0) goto L_0x087d
            r0 = 1685479729(0x64766131, float:1.817961E22)
            if (r1 == r0) goto L_0x087d
            r0 = 1685481573(0x64766865, float:1.8181686E22)
            if (r1 == r0) goto L_0x087d
            r0 = 1685481521(0x64766831, float:1.8181627E22)
            if (r1 == r0) goto L_0x087d
            r0 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r1 == r0) goto L_0x0334
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r1 == r0) goto L_0x0334
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r1 == r0) goto L_0x0334
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r1 == r0) goto L_0x0334
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r1 == r0) goto L_0x0334
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r1 == r0) goto L_0x0334
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r1 == r0) goto L_0x0334
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r1 == r0) goto L_0x0334
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r1 == r0) goto L_0x0334
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r1 == r0) goto L_0x0334
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r1 == r0) goto L_0x0334
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r1 == r0) goto L_0x0334
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r1 == r0) goto L_0x0334
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r1 == r0) goto L_0x0334
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r1 == r0) goto L_0x0334
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r1 == r0) goto L_0x0334
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r1 == r0) goto L_0x0334
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r1 == r0) goto L_0x0334
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r1 == r0) goto L_0x0334
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r1 == r0) goto L_0x0334
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r1 == r0) goto L_0x0334
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r1 == r0) goto L_0x0334
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r1 == r0) goto L_0x0334
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r1 == r0) goto L_0x0334
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r1 == r0) goto L_0x0334
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r1 == r0) goto L_0x02da
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r1 == r0) goto L_0x02da
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r1 == r0) goto L_0x02da
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r1 == r0) goto L_0x02da
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r1 == r0) goto L_0x02da
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r1 != r0) goto L_0x02bd
            int r0 = r16 + 8
            int r0 = r0 + 8
            r2.A0O(r0)
            r2.A0F()
            java.lang.String r0 = r2.A0F()
            if (r0 == 0) goto L_0x02b2
            r1 = r34
            X.SOW r0 = A01(r0, r1)
            X.SJM r55 = X.Pxe.A0O(r0)
        L_0x02b2:
            int r16 = r16 + r20
            r0 = r16
            r2.A0O(r0)
            int r17 = r17 + 1
            goto L_0x018e
        L_0x02bd:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r1 != r0) goto L_0x02b2
            X.SOW r1 = X.SOW.A00()
            java.lang.String r0 = java.lang.Integer.toString(r34)
            r1.A0T = r0
            r0 = 1092(0x444, float:1.53E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A01(r0)
            X.SJM r55 = X.Pxe.A0O(r1)
            goto L_0x02b2
        L_0x02da:
            int r0 = r16 + 8
            int r0 = r0 + 8
            r2.A0O(r0)
            java.lang.String r6 = "application/ttml+xml"
            r5 = 0
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r1 == r0) goto L_0x0303
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r1 != r0) goto L_0x0316
            int r0 = r20 + -8
            int r5 = r0 + -8
            byte[] r1 = new byte[r5]
            r0 = 0
            r2.A0R(r1, r0, r5)
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of(r1)
            java.lang.String r6 = "application/x-quicktime-tx3g"
        L_0x0303:
            r0 = r34
            X.SOW r1 = A01(r6, r0)
            r0 = r28
            r1.A0V = r0
            r1.A0M = r3
            r1.A0X = r5
            X.SJM r55 = X.Pxe.A0O(r1)
            goto L_0x02b2
        L_0x0316:
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r1 != r0) goto L_0x031e
            java.lang.String r6 = "application/x-mp4-vtt"
            goto L_0x0303
        L_0x031e:
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r1 != r0) goto L_0x0326
            r3 = 0
            goto L_0x0303
        L_0x0326:
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r1 != r0) goto L_0x1345
            r61 = 1
            r0 = 1093(0x445, float:1.532E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            goto L_0x0303
        L_0x0334:
            r13 = r7
            int r0 = r16 + 8
            int r0 = r0 + 8
            r2.A0O(r0)
            r36 = 6
            if (r85 == 0) goto L_0x083f
            int r4 = r2.A08()
            r0 = r36
            r2.A0P(r0)
        L_0x0349:
            r8 = -1
            r37 = 2
            r3 = 1
            if (r4 == 0) goto L_0x080f
            if (r4 == r3) goto L_0x080f
            r0 = r37
            if (r4 != r0) goto L_0x02b2
            r0 = r33
            r2.A0P(r0)
            long r3 = r2.A0B()
            double r3 = java.lang.Double.longBitsToDouble(r3)
            long r3 = java.lang.Math.round(r3)
            int r14 = (int) r3
            int r38 = r2.A07()
            r0 = r23
            r2.A0P(r0)
            int r3 = r2.A07()
            int r5 = r2.A07()
            r0 = r5 & 1
            boolean r4 = X.AnonymousClass7TF.A1P(r0)
            r0 = r5 & 2
            boolean r5 = X.AnonymousClass7TF.A1P(r0)
            r0 = 32
            if (r4 != 0) goto L_0x0809
            r4 = r32
            if (r3 != r4) goto L_0x07e8
            r6 = 3
        L_0x038d:
            r0 = r32
            r2.A0P(r0)
            r39 = 0
        L_0x0394:
            int r5 = r2.A01
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r1 != r0) goto L_0x03b3
            r3 = r16
            r0 = r20
            android.util.Pair r4 = A00(r2, r3, r0)
            if (r4 == 0) goto L_0x03b0
            int r1 = X.Pxf.A05(r4)
            if (r78 != 0) goto L_0x07d0
            r13 = 0
        L_0x03ac:
            java.lang.Object r0 = r4.second
            r22[r17] = r0
        L_0x03b0:
            r2.A0O(r5)
        L_0x03b3:
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            java.lang.String r41 = "audio/mhm1"
            java.lang.String r4 = "audio/raw"
            if (r1 != r0) goto L_0x0706
            java.lang.String r4 = "audio/ac3"
        L_0x03be:
            r7 = 0
            r35 = 0
            r15 = 0
        L_0x03c2:
            int r1 = r5 - r16
            r0 = r20
            if (r1 >= r0) goto L_0x0847
            int r40 = X.Pxf.A06(r2, r5)
            boolean r1 = X.AnonymousClass7TF.A1R(r40)
            r0 = r27
            X.RS2.A00(r1, r0)
            int r1 = r2.A01()
            r0 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r1 != r0) goto L_0x042b
            int r0 = r5 + 8
            r2.A0O(r0)
            r0 = 1
            int r1 = X.Pxf.A07(r2, r0)
            r2.A0P(r0)
            r0 = r41
            boolean r0 = X.2Ob.A00(r4, r0)
            if (r0 == 0) goto L_0x041e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "mhm1.%02X"
            java.lang.String r35 = java.lang.String.format(r0, r1)
        L_0x0403:
            int r1 = r2.A08()
            byte[] r0 = new byte[r1]
            r2.A0R(r0, r3, r1)
            if (r7 != 0) goto L_0x0415
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r0)
        L_0x0412:
            int r5 = r5 + r40
            goto L_0x03c2
        L_0x0415:
            java.lang.Object r1 = r7.get(r3)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r0, r1)
            goto L_0x0412
        L_0x041e:
            r3 = 0
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r1)
            java.lang.String r0 = "mha1.%02X"
            java.lang.String r35 = java.lang.String.format(r0, r1)
            goto L_0x0403
        L_0x042b:
            r0 = 1835557200(0x6d686150, float:4.4948854E27)
            if (r1 != r0) goto L_0x0451
            int r0 = r5 + 8
            r2.A0O(r0)
            int r3 = r2.A05()
            if (r3 <= 0) goto L_0x0412
            byte[] r1 = new byte[r3]
            r0 = 0
            r2.A0R(r1, r0, r3)
            if (r7 != 0) goto L_0x0448
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r1)
            goto L_0x0412
        L_0x0448:
            java.lang.Object r0 = r7.get(r0)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r0, r1)
            goto L_0x0412
        L_0x0451:
            r3 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 == r3) goto L_0x0676
            if (r85 == 0) goto L_0x0483
            r0 = 2002876005(0x77617665, float:4.5729223E33)
            if (r1 != r0) goto L_0x0483
            int r1 = r2.A01
            boolean r8 = X.JTQ.A1P(r1, r5)
            r0 = r24
            X.RS2.A00(r8, r0)
        L_0x0468:
            int r8 = r1 - r5
            r0 = r40
            if (r8 >= r0) goto L_0x0412
            int r9 = X.Pxf.A06(r2, r1)
            boolean r8 = X.AnonymousClass7TF.A1R(r9)
            r0 = r27
            X.RS2.A00(r8, r0)
            int r0 = r2.A01()
            if (r0 == r3) goto L_0x0677
            int r1 = r1 + r9
            goto L_0x0468
        L_0x0483:
            r0 = 1684103987(0x64616333, float:1.6630662E22)
            if (r1 != r0) goto L_0x04ee
            int r0 = r5 + 8
            r2.A0O(r0)
            java.lang.String r0 = java.lang.Integer.toString(r34)
            X.ST7 r1 = new X.ST7
            r1.<init>()
            r1.A0C(r2)
            r3 = r37
            int r8 = r1.A06(r3)
            int[] r3 = X.SD6.A03
            r9 = r3[r8]
            r3 = r32
            r1.A0A(r3)
            int[] r8 = X.SD6.A02
            r3 = 3
            int r3 = r1.A06(r3)
            r8 = r8[r3]
            r3 = 1
            int r3 = r1.A06(r3)
            if (r3 == 0) goto L_0x04ba
            int r8 = r8 + 1
        L_0x04ba:
            r3 = 5
            int r10 = r1.A06(r3)
            int[] r3 = X.SD6.A00
            r3 = r3[r10]
            int r3 = r3 * 1000
            r1.A07()
            int r1 = r1.A05()
            r2.A0O(r1)
            X.SOW r1 = X.SOW.A00()
            r1.A0T = r0
            java.lang.String r0 = "audio/ac3"
            r1.A01(r0)
            r1.A04 = r8
            r1.A0G = r9
            r1.A0O = r13
            r0 = r28
            r1.A0V = r0
            r1.A03 = r3
            r1.A0D = r3
            X.SJM r55 = X.Pxe.A0O(r1)
            goto L_0x0412
        L_0x04ee:
            r0 = 1684366131(0x64656333, float:1.692581E22)
            if (r1 != r0) goto L_0x057f
            int r0 = r5 + 8
            r2.A0O(r0)
            java.lang.String r12 = java.lang.Integer.toString(r34)
            X.ST7 r8 = new X.ST7
            r8.<init>()
            r8.A0C(r2)
            r0 = 13
            int r0 = r8.A06(r0)
            int r11 = r0 * 1000
            r9 = 3
            r8.A0A(r9)
            r0 = r37
            int r1 = r8.A06(r0)
            int[] r0 = X.SD6.A03
            r10 = r0[r1]
            r0 = 10
            r8.A0A(r0)
            int[] r1 = X.SD6.A02
            int r0 = r8.A06(r9)
            r3 = r1[r0]
            r1 = 1
            int r0 = r8.A06(r1)
            if (r0 == 0) goto L_0x0530
            int r3 = r3 + 1
        L_0x0530:
            r0 = r23
            int r0 = X.ST7.A00(r8, r9, r0)
            r8.A0A(r1)
            if (r0 <= 0) goto L_0x0548
            r0 = r36
            int r0 = X.ST7.A00(r8, r0, r1)
            if (r0 == 0) goto L_0x0545
            int r3 = r3 + 2
        L_0x0545:
            r8.A0A(r1)
        L_0x0548:
            int r9 = r8.A04()
            r0 = 7
            if (r9 <= r0) goto L_0x057c
            int r0 = X.ST7.A00(r8, r0, r1)
            if (r0 == 0) goto L_0x057c
            java.lang.String r0 = "audio/eac3-joc"
        L_0x0557:
            r8.A07()
            int r1 = r8.A05()
            r2.A0O(r1)
            X.SOW r1 = X.SOW.A00()
            r1.A0T = r12
            r1.A01(r0)
            r1.A04 = r3
            r1.A0G = r10
            r1.A0O = r13
            r0 = r28
            r1.A0V = r0
            r1.A0D = r11
            X.SJM r55 = X.Pxe.A0O(r1)
            goto L_0x0412
        L_0x057c:
            java.lang.String r0 = "audio/eac3"
            goto L_0x0557
        L_0x057f:
            r0 = 1684103988(0x64616334, float:1.6630663E22)
            if (r1 != r0) goto L_0x05bb
            int r0 = r5 + 8
            r2.A0O(r0)
            java.lang.String r8 = java.lang.Integer.toString(r34)
            r3 = 1
            int r0 = X.Pxf.A07(r2, r3)
            r0 = r0 & 32
            int r1 = r0 >> 5
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r1 != r3) goto L_0x059e
            r0 = 48000(0xbb80, float:6.7262E-41)
        L_0x059e:
            X.SOW r1 = X.SOW.A00()
            r1.A0T = r8
            java.lang.String r3 = "audio/ac4"
            r1.A01(r3)
            r3 = r37
            r1.A04 = r3
            r1.A0G = r0
            r1.A0O = r13
            r0 = r28
            r1.A0V = r0
            X.SJM r55 = X.Pxe.A0O(r1)
            goto L_0x0412
        L_0x05bb:
            r0 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r1 != r0) goto L_0x05c8
            if (r39 <= 0) goto L_0x134a
            r14 = r39
            r38 = 2
            goto L_0x0412
        L_0x05c8:
            r0 = 1684305011(0x64647473, float:1.6856995E22)
            if (r1 == r0) goto L_0x065e
            r0 = 1969517683(0x75647473, float:2.8960097E32)
            if (r1 == r0) goto L_0x065e
            r0 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r1 != r0) goto L_0x05f0
            int r7 = r40 + -8
            byte[] r1 = A00
            int r3 = r1.length
            int r0 = r3 + r7
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r0 = r5 + 8
            r2.A0O(r0)
            r2.A0R(r1, r3, r7)
            java.util.ArrayList r7 = X.RS3.A00(r1)
            goto L_0x0412
        L_0x05f0:
            r0 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r1 != r0) goto L_0x061e
            int r3 = r40 + -12
            int r0 = r3 + 4
            byte[] r1 = new byte[r0]
            r7 = 102(0x66, float:1.43E-43)
            r0 = 0
            r1[r0] = r7
            r7 = 76
            r0 = 1
            r1[r0] = r7
            r0 = 97
            r1[r37] = r0
            r7 = 67
            r0 = 3
            r1[r0] = r7
            int r0 = r5 + 12
            r2.A0O(r0)
            r0 = r23
            r2.A0R(r1, r0, r3)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r1)
            goto L_0x0412
        L_0x061e:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r1 != r0) goto L_0x0412
            int r3 = r40 + -12
            byte[] r1 = new byte[r3]
            int r0 = r5 + 12
            r2.A0O(r0)
            r0 = 0
            r2.A0R(r1, r0, r3)
            X.SRd r3 = new X.SRd
            r3.<init>(r1)
            r0 = 9
            r3.A0O(r0)
            int r7 = r3.A05()
            r0 = 20
            int r0 = X.Pxe.A07(r3, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            int r14 = X.Pxf.A05(r0)
            int r38 = X.Pxf.A04(r0)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r1)
            goto L_0x0412
        L_0x065e:
            r0 = r34
            X.SOW r1 = A01(r4, r0)
            r0 = r38
            r1.A04 = r0
            r1.A0G = r14
            r1.A0O = r13
            r0 = r28
            r1.A0V = r0
            X.SJM r55 = X.Pxe.A0O(r1)
            goto L_0x0412
        L_0x0676:
            r1 = r5
        L_0x0677:
            r0 = -1
            if (r1 == r0) goto L_0x0412
            X.Rvi r15 = A02(r2, r1)
            java.lang.String r4 = r15.A02
            byte[] r3 = r15.A03
            if (r3 == 0) goto L_0x0412
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x06e4
            X.SRd r7 = new X.SRd
            r7.<init>(r3)
            r9 = 1
            r7.A0P(r9)
            r12 = 0
            r1 = 0
        L_0x0697:
            int r0 = r7.A00
            int r8 = r7.A01
            int r0 = r0 - r8
            r11 = 255(0xff, float:3.57E-43)
            if (r0 <= 0) goto L_0x06ae
            byte[] r0 = r7.A02
            byte r0 = r0[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r11) goto L_0x06ae
            int r1 = r1 + 255
            r7.A0P(r9)
            goto L_0x0697
        L_0x06ae:
            int r0 = r7.A05()
            int r1 = r1 + r0
            r0 = 0
        L_0x06b4:
            int r8 = r7.A00
            int r10 = r7.A01
            int r8 = r8 - r10
            if (r8 <= 0) goto L_0x06c9
            byte[] r8 = r7.A02
            byte r8 = r8[r10]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 != r11) goto L_0x06c9
            int r0 = r0 + 255
            r7.A0P(r9)
            goto L_0x06b4
        L_0x06c9:
            int r8 = r7.A05()
            int r0 = r0 + r8
            byte[] r8 = new byte[r1]
            int r7 = r7.A01
            java.lang.System.arraycopy(r3, r7, r8, r12, r1)
            int r7 = r7 + r1
            int r7 = r7 + r0
            int r1 = r3.length
            int r1 = r1 - r7
            byte[] r0 = new byte[r1]
            java.lang.System.arraycopy(r3, r7, r0, r12, r1)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r8, r0)
            goto L_0x0412
        L_0x06e4:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0700
            X.ST7 r1 = new X.ST7
            r1.<init>(r3)
            r0 = 0
            X.RtO r1 = X.SMh.A01(r1, r0)
            int r14 = r1.A01
            int r0 = r1.A00
            r38 = r0
            java.lang.String r0 = r1.A02
            r35 = r0
        L_0x0700:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r3)
            goto L_0x0412
        L_0x0706:
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r1 != r0) goto L_0x070f
            java.lang.String r4 = "audio/eac3"
            goto L_0x03be
        L_0x070f:
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r1 != r0) goto L_0x0718
            java.lang.String r4 = "audio/ac4"
            goto L_0x03be
        L_0x0718:
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r1 != r0) goto L_0x0721
            java.lang.String r4 = "audio/vnd.dts"
            goto L_0x03be
        L_0x0721:
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r1 == r0) goto L_0x07cc
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r1 == r0) goto L_0x07cc
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r1 != r0) goto L_0x0738
            r0 = 1118(0x45e, float:1.567E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x03be
        L_0x0738:
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r1 != r0) goto L_0x0745
            r0 = 1119(0x45f, float:1.568E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x03be
        L_0x0745:
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r1 != r0) goto L_0x074e
            java.lang.String r4 = "audio/3gpp"
            goto L_0x03be
        L_0x074e:
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r1 != r0) goto L_0x0757
            java.lang.String r4 = "audio/amr-wb"
            goto L_0x03be
        L_0x0757:
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r1 == r0) goto L_0x076c
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r1 != r0) goto L_0x0765
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03be
        L_0x0765:
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r1 != r0) goto L_0x076f
            if (r6 != r8) goto L_0x03be
        L_0x076c:
            r6 = 2
            goto L_0x03be
        L_0x076f:
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r1 == r0) goto L_0x07c8
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r1 == r0) goto L_0x07c8
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r1 != r0) goto L_0x0786
            r0 = 2668(0xa6c, float:3.739E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x03be
        L_0x0786:
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r1 != r0) goto L_0x078f
            r4 = r41
            goto L_0x03be
        L_0x078f:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r1 != r0) goto L_0x0798
            java.lang.String r4 = "audio/alac"
            goto L_0x03be
        L_0x0798:
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r1 != r0) goto L_0x07a1
            java.lang.String r4 = "audio/g711-alaw"
            goto L_0x03be
        L_0x07a1:
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r1 != r0) goto L_0x07aa
            java.lang.String r4 = "audio/g711-mlaw"
            goto L_0x03be
        L_0x07aa:
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r1 != r0) goto L_0x07b3
            java.lang.String r4 = "audio/opus"
            goto L_0x03be
        L_0x07b3:
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r1 != r0) goto L_0x07bc
            java.lang.String r4 = "audio/flac"
            goto L_0x03be
        L_0x07bc:
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r1 != r0) goto L_0x07c5
            java.lang.String r4 = "audio/true-hd"
            goto L_0x03be
        L_0x07c5:
            r4 = 0
            goto L_0x03be
        L_0x07c8:
            java.lang.String r4 = "audio/mpeg"
            goto L_0x03be
        L_0x07cc:
            java.lang.String r4 = "audio/vnd.dts.hd"
            goto L_0x03be
        L_0x07d0:
            java.lang.Object r0 = r4.second
            X.Rwy r0 = (X.C10720Rwy) r0
            java.lang.String r3 = r0.A02
            java.lang.String r0 = r7.A02
            boolean r0 = androidx.media3.common.util.Util.A0E(r0, r3)
            if (r0 != 0) goto L_0x03ac
            r0 = 0
            androidx.media3.common.DrmInitData$SchemeData[] r7 = r7.A03
            androidx.media3.common.DrmInitData r13 = new androidx.media3.common.DrmInitData
            r13.<init>(r3, r7, r0)
            goto L_0x03ac
        L_0x07e8:
            r4 = r33
            if (r3 != r4) goto L_0x07f3
            r6 = 2
            if (r5 == 0) goto L_0x038d
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x038d
        L_0x07f3:
            r4 = 24
            if (r3 != r4) goto L_0x07ff
            r6 = 21
            if (r5 == 0) goto L_0x038d
            r6 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x038d
        L_0x07ff:
            if (r3 != r0) goto L_0x080c
            r6 = 22
            if (r5 == 0) goto L_0x038d
            r6 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x038d
        L_0x0809:
            r6 = 4
            if (r3 == r0) goto L_0x038d
        L_0x080c:
            r6 = -1
            goto L_0x038d
        L_0x080f:
            int r38 = r2.A08()
            r0 = r36
            r2.A0P(r0)
            byte[] r5 = r2.A02
            int r0 = r2.A01
            int r10 = r0 + 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r9 = r0 << 8
            int r6 = r10 + 1
            byte r0 = r5[r10]
            r14 = r0 & 255(0xff, float:3.57E-43)
            r14 = r14 | r9
            int r0 = r6 + 2
            r2.A01 = r0
            int r0 = r0 - r23
            int r39 = X.Pxf.A06(r2, r0)
            if (r4 != r3) goto L_0x083c
            r0 = r33
            r2.A0P(r0)
        L_0x083c:
            r6 = -1
            goto L_0x0394
        L_0x083f:
            r0 = r32
            r2.A0P(r0)
            r4 = 0
            goto L_0x0349
        L_0x0847:
            if (r55 != 0) goto L_0x02b2
            if (r4 == 0) goto L_0x02b2
            r0 = r34
            X.SOW r3 = A01(r4, r0)
            r0 = r35
            r3.A0R = r0
            r0 = r38
            r3.A04 = r0
            r3.A0G = r14
            r3.A0C = r6
            r3.A0X = r7
            r3.A0O = r13
            r0 = r28
            r3.A0V = r0
            if (r15 == 0) goto L_0x0877
            long r0 = r15.A00
            int r0 = X.1WJ.A02(r0)
            r3.A03 = r0
            long r0 = r15.A01
            int r0 = X.1WJ.A02(r0)
            r3.A0D = r0
        L_0x0877:
            X.SJM r55 = X.Pxe.A0O(r3)
            goto L_0x02b2
        L_0x087d:
            r35 = r7
            int r0 = r16 + 8
            r43 = 8
            int r0 = r0 + 8
            r2.A0O(r0)
            r0 = r33
            r2.A0P(r0)
            int r52 = r2.A08()
            int r51 = r2.A08()
            r0 = 50
            r2.A0P(r0)
            int r0 = r2.A01
            r54 = r0
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r1 != r0) goto L_0x08be
            r3 = r16
            r0 = r20
            android.util.Pair r5 = A00(r2, r3, r0)
            if (r5 == 0) goto L_0x08b9
            int r1 = X.Pxf.A05(r5)
            if (r78 != 0) goto L_0x0d4a
            r35 = 0
        L_0x08b5:
            java.lang.Object r0 = r5.second
            r22[r17] = r0
        L_0x08b9:
            r0 = r54
            r2.A0O(r0)
        L_0x08be:
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r53 = "video/3gpp"
            if (r1 != r0) goto L_0x0d40
            java.lang.String r7 = "video/mpeg"
        L_0x08c9:
            r37 = 1065353216(0x3f800000, float:1.0)
            r46 = 0
            r45 = 0
            r36 = 0
            r50 = -1
            r44 = -1
            r9 = -1
            r5 = -1
            r3 = -1
            r4 = 0
            r49 = 0
            r48 = 0
            r42 = 8
        L_0x08df:
            int r6 = r54 - r16
            r0 = r20
            if (r6 >= r0) goto L_0x08fa
            r0 = r54
            r2.A0O(r0)
            int r6 = r2.A01
            int r47 = r2.A01()
            if (r47 != 0) goto L_0x096a
            int r8 = r2.A01
            int r8 = r8 - r16
            r0 = r20
            if (r8 != r0) goto L_0x096d
        L_0x08fa:
            if (r7 == 0) goto L_0x02b2
            r0 = r34
            X.SOW r6 = A01(r7, r0)
            r0 = r45
            r6.A0R = r0
            r0 = r52
            r6.A0L = r0
            r0 = r51
            r6.A09 = r0
            r0 = r37
            r6.A01 = r0
            r0 = r19
            r6.A0F = r0
            r0 = r36
            r6.A0Z = r0
            r0 = r50
            r6.A0I = r0
            r0 = r46
            r6.A0X = r0
            r0 = r44
            r6.A0B = r0
            r0 = r35
            r6.A0O = r0
            X.S2u r0 = new X.S2u
            r0.<init>()
            r0.A02 = r9
            r0.A01 = r5
            r0.A03 = r3
            if (r4 == 0) goto L_0x0967
            byte[] r1 = r4.array()
        L_0x093b:
            r0.A05 = r1
            r1 = r43
            r0.A04 = r1
            r1 = r42
            r0.A00 = r1
            X.SRQ r0 = r0.A00()
            r6.A0N = r0
            if (r49 == 0) goto L_0x0961
            r0 = r49
            long r0 = r0.A00
            int r0 = X.1WJ.A02(r0)
            r6.A03 = r0
            r0 = r49
            long r0 = r0.A01
            int r0 = X.1WJ.A02(r0)
            r6.A0D = r0
        L_0x0961:
            X.SJM r55 = X.Pxe.A0O(r6)
            goto L_0x02b2
        L_0x0967:
            r1 = r24
            goto L_0x093b
        L_0x096a:
            r8 = 1
            if (r47 > 0) goto L_0x096e
        L_0x096d:
            r8 = 0
        L_0x096e:
            r0 = r27
            X.RS2.A00(r8, r0)
            int r0 = r2.A01()
            r8 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 != r8) goto L_0x09b9
            boolean r3 = X.DbW.A1a(r7)
            r0 = r24
            X.RS2.A00(r3, r0)
            int r0 = r6 + 8
            r2.A0O(r0)
            X.SFt r6 = X.C11219SFt.A00(r2)
            java.util.List r0 = r6.A0B
            r46 = r0
            int r0 = r6.A08
            r30 = r0
            if (r48 != 0) goto L_0x099c
            float r0 = r6.A00
            r37 = r0
        L_0x099c:
            java.lang.String r0 = r6.A0A
            r45 = r0
            int r0 = r6.A07
            r44 = r0
            int r9 = r6.A04
            int r5 = r6.A03
            int r3 = r6.A05
            int r0 = r6.A02
            r43 = r0
            int r0 = r6.A01
            r42 = r0
            java.lang.String r7 = "video/avc"
        L_0x09b5:
            int r54 = r54 + r47
            goto L_0x08df
        L_0x09b9:
            r8 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r8) goto L_0x09f8
            boolean r3 = X.DbW.A1a(r7)
            r0 = r24
            X.RS2.A00(r3, r0)
            int r0 = r6 + 8
            r2.A0O(r0)
            X.SFm r6 = X.C11212SFm.A00(r2)
            java.util.List r0 = r6.A09
            r46 = r0
            int r0 = r6.A07
            r30 = r0
            if (r48 != 0) goto L_0x09de
            float r0 = r6.A00
            r37 = r0
        L_0x09de:
            int r0 = r6.A06
            r44 = r0
            java.lang.String r0 = r6.A08
            r45 = r0
            int r9 = r6.A04
            int r5 = r6.A03
            int r3 = r6.A05
            int r0 = r6.A02
            r43 = r0
            int r0 = r6.A01
            r42 = r0
            java.lang.String r7 = "video/hevc"
            goto L_0x09b5
        L_0x09f8:
            r8 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r8) goto L_0x0d31
            r8 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 == r8) goto L_0x0d31
            r10 = 1987076931(0x76706343, float:1.21891066E33)
            r8 = 2
            if (r0 != r10) goto L_0x0a46
            boolean r3 = X.DbW.A1a(r7)
            r0 = r24
            X.RS2.A00(r3, r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r1 != r0) goto L_0x0a42
            java.lang.String r7 = "video/x-vnd.on2.vp8"
        L_0x0a19:
            int r0 = r6 + 12
            r2.A0O(r0)
            int r0 = X.Pxf.A07(r2, r8)
            int r43 = r0 >> 4
            r0 = r0 & 1
            boolean r6 = X.AnonymousClass7TF.A1P(r0)
            int r3 = r2.A05()
            int r0 = r2.A05()
            int r9 = X.SRQ.A00(r3)
            r5 = 2
            if (r6 == 0) goto L_0x0a3a
            r5 = 1
        L_0x0a3a:
            int r3 = X.SRQ.A01(r0)
            r42 = r43
            goto L_0x09b5
        L_0x0a42:
            java.lang.String r7 = "video/x-vnd.on2.vp9"
            goto L_0x0a19
        L_0x0a46:
            r10 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r10) goto L_0x0bb4
            int r5 = r47 + -8
            byte[] r3 = new byte[r5]
            r0 = 0
            r2.A0R(r3, r0, r5)
            com.google.common.collect.ImmutableList r46 = com.google.common.collect.ImmutableList.of(r3)
            int r0 = r6 + 8
            r2.A0O(r0)
            r71 = -1
            r72 = -1
            r73 = -1
            r74 = -1
            r75 = -1
            byte[] r0 = r2.A02
            X.ST7 r3 = new X.ST7
            r3.<init>(r0)
            int r0 = r2.A01
            int r0 = r0 * 8
            r3.A09(r0)
            r5 = 1
            r3.A0B(r5)
            r6 = 3
            int r0 = r3.A06(r6)
            r7 = 6
            boolean r10 = X.ST7.A03(r3, r7)
            boolean r9 = r3.A0F()
            r14 = 12
            r7 = 10
            if (r0 != r8) goto L_0x0ba6
            if (r10 == 0) goto L_0x0bac
            r74 = 10
            if (r9 == 0) goto L_0x0a94
            r74 = 12
        L_0x0a94:
            if (r9 == 0) goto L_0x0a98
            r7 = 12
        L_0x0a98:
            r75 = r7
        L_0x0a9a:
            r13 = 13
            r3.A0A(r13)
            r3.A08()
            r0 = r23
            int r0 = r3.A06(r0)
            if (r0 == r5) goto L_0x0acf
            java.lang.String r3 = "Unsupported obu_type: "
            java.lang.String r0 = X.002.A0O(r3, r0)
        L_0x0ab0:
            X.STH.A01(r0)
        L_0x0ab3:
            X.SRQ r0 = new X.SRQ
            r69 = r0
            r70 = r24
            r69.<init>(r70, r71, r72, r73, r74, r75)
            int r3 = r0.A05
            r43 = r3
            int r3 = r0.A01
            r42 = r3
            int r9 = r0.A03
            int r5 = r0.A02
            int r3 = r0.A04
            java.lang.String r7 = "video/av01"
            goto L_0x09b5
        L_0x0acf:
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0ad8
            java.lang.String r0 = "Unsupported obu_extension_flag"
            goto L_0x0ab0
        L_0x0ad8:
            boolean r0 = r3.A0F()
            r3.A08()
            if (r0 == 0) goto L_0x0aee
            r0 = r32
            int r7 = r3.A06(r0)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L_0x0aee
            java.lang.String r0 = "Excessive obu_size"
            goto L_0x0ab0
        L_0x0aee:
            int r10 = r3.A06(r6)
            r3.A08()
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0afe
            java.lang.String r0 = "Unsupported reduced_still_picture_header"
            goto L_0x0ab0
        L_0x0afe:
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0b07
            java.lang.String r0 = "Unsupported timing_info_present_flag"
            goto L_0x0ab0
        L_0x0b07:
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0b10
            java.lang.String r0 = "Unsupported initial_display_delay_present_flag"
            goto L_0x0ab0
        L_0x0b10:
            r9 = 5
            int r12 = r3.A06(r9)
            r15 = 0
            r0 = 0
        L_0x0b17:
            r7 = 7
            if (r0 > r12) goto L_0x0b26
            int r11 = X.ST7.A00(r3, r14, r9)
            if (r11 <= r7) goto L_0x0b23
            r3.A08()
        L_0x0b23:
            int r0 = r0 + 1
            goto L_0x0b17
        L_0x0b26:
            r0 = r23
            int r11 = r3.A06(r0)
            int r9 = r3.A06(r0)
            int r0 = r11 + 1
            r3.A0A(r0)
            int r0 = r9 + 1
            r3.A0A(r0)
            X.ST7.A02(r3, r7)
            boolean r7 = X.ST7.A03(r3, r7)
            if (r7 == 0) goto L_0x0b46
            r3.A0A(r8)
        L_0x0b46:
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x0b52
            int r0 = r3.A06(r5)
            if (r0 <= 0) goto L_0x0b5b
        L_0x0b52:
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x0b5b
            r3.A0A(r5)
        L_0x0b5b:
            if (r7 == 0) goto L_0x0b60
            r3.A0A(r6)
        L_0x0b60:
            boolean r0 = X.ST7.A03(r3, r6)
            if (r10 != r8) goto L_0x0ba3
            if (r0 == 0) goto L_0x0b6b
            r3.A08()
        L_0x0b6b:
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0b72
            r15 = 1
        L_0x0b72:
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0ab3
            r0 = r32
            int r6 = r3.A06(r0)
            int r7 = r3.A06(r0)
            int r0 = r3.A06(r0)
            if (r15 != 0) goto L_0x0b9e
            if (r6 != r5) goto L_0x0b9e
            if (r7 != r13) goto L_0x0b9e
            if (r0 != 0) goto L_0x0b9e
            r0 = 1
        L_0x0b8f:
            int r71 = X.SRQ.A00(r6)
            if (r0 == r5) goto L_0x0b96
            r5 = 2
        L_0x0b96:
            r72 = r5
            int r73 = X.SRQ.A01(r7)
            goto L_0x0ab3
        L_0x0b9e:
            int r0 = r3.A06(r5)
            goto L_0x0b8f
        L_0x0ba3:
            if (r10 == r5) goto L_0x0b72
            goto L_0x0b6b
        L_0x0ba6:
            if (r0 > r8) goto L_0x0a9a
            r74 = 10
            if (r10 != 0) goto L_0x0bae
        L_0x0bac:
            r74 = 8
        L_0x0bae:
            if (r10 != 0) goto L_0x0a98
            r7 = 8
            goto L_0x0a98
        L_0x0bb4:
            r10 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r0 != r10) goto L_0x0bd6
            if (r4 != 0) goto L_0x0bc1
            r0 = 25
            java.nio.ByteBuffer r4 = X.Pxg.A12(r0)
        L_0x0bc1:
            r0 = 21
            r4.position(r0)
            short r0 = r2.A0K()
            r4.putShort(r0)
            short r0 = r2.A0K()
            r4.putShort(r0)
            goto L_0x09b5
        L_0x0bd6:
            r10 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r0 != r10) goto L_0x0c3f
            if (r4 != 0) goto L_0x0be3
            r0 = 25
            java.nio.ByteBuffer r4 = X.Pxg.A12(r0)
        L_0x0be3:
            short r41 = r2.A0K()
            short r40 = r2.A0K()
            short r39 = r2.A0K()
            short r38 = r2.A0K()
            short r8 = r2.A0K()
            short r6 = r2.A0K()
            short r15 = r2.A0K()
            short r14 = r2.A0K()
            long r12 = r2.A0C()
            long r10 = r2.A0C()
            r0 = 1
            r4.position(r0)
            r4.putShort(r8)
            r4.putShort(r6)
            r0 = r41
            r4.putShort(r0)
            r0 = r40
            r4.putShort(r0)
            r0 = r39
            r4.putShort(r0)
            r0 = r38
            r4.putShort(r0)
            r4.putShort(r15)
            r4.putShort(r14)
            r14 = 10000(0x2710, double:4.9407E-320)
            long r12 = r12 / r14
            int r0 = (int) r12
            short r0 = (short) r0
            r4.putShort(r0)
            long r10 = r10 / r14
            int r0 = (int) r10
            short r0 = (short) r0
            r4.putShort(r0)
            goto L_0x09b5
        L_0x0c3f:
            r10 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r10) goto L_0x0c51
            boolean r6 = X.DbW.A1a(r7)
            r0 = r24
            X.RS2.A00(r6, r0)
            r7 = r53
            goto L_0x09b5
        L_0x0c51:
            r10 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r10) goto L_0x0c71
            boolean r7 = X.DbW.A1a(r7)
            r0 = r24
            X.RS2.A00(r7, r0)
            X.Rvi r49 = A02(r2, r6)
            r0 = r49
            java.lang.String r7 = r0.A02
            byte[] r0 = r0.A03
            if (r0 == 0) goto L_0x09b5
            com.google.common.collect.ImmutableList r46 = com.google.common.collect.ImmutableList.of(r0)
            goto L_0x09b5
        L_0x0c71:
            r10 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r10) goto L_0x0c8a
            int r0 = r6 + 8
            int r0 = X.Pxe.A07(r2, r0)
            int r6 = r2.A07()
            float r0 = (float) r0
            r37 = r0
            float r0 = (float) r6
            float r37 = r37 / r0
            r48 = 1
            goto L_0x09b5
        L_0x0c8a:
            r10 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r10) goto L_0x0cb3
            int r8 = r6 + 8
        L_0x0c91:
            int r10 = r8 - r6
            r0 = r47
            if (r10 >= r0) goto L_0x0caf
            int r0 = X.Pxf.A06(r2, r8)
            int r11 = r2.A01()
            r10 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r11 != r10) goto L_0x0cad
            byte[] r6 = r2.A02
            int r0 = r0 + r8
            byte[] r36 = java.util.Arrays.copyOfRange(r6, r8, r0)
            goto L_0x09b5
        L_0x0cad:
            int r8 = r8 + r0
            goto L_0x0c91
        L_0x0caf:
            r36 = 0
            goto L_0x09b5
        L_0x0cb3:
            r6 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r6) goto L_0x0cdf
            int r0 = r2.A05()
            r6 = 3
            r2.A0P(r6)
            if (r0 != 0) goto L_0x09b5
            int r0 = r2.A05()
            if (r0 == 0) goto L_0x0cdb
            r10 = 1
            if (r0 == r10) goto L_0x0cd7
            if (r0 == r8) goto L_0x0cd3
            if (r0 != r6) goto L_0x09b5
            r50 = 3
            goto L_0x09b5
        L_0x0cd3:
            r50 = 2
            goto L_0x09b5
        L_0x0cd7:
            r50 = 1
            goto L_0x09b5
        L_0x0cdb:
            r50 = 0
            goto L_0x09b5
        L_0x0cdf:
            r6 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r0 != r6) goto L_0x09b5
            r0 = -1
            if (r9 != r0) goto L_0x09b5
            if (r3 != r0) goto L_0x09b5
            int r0 = r2.A01()
            r6 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r0 == r6) goto L_0x0d08
            r6 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r0 == r6) goto L_0x0d08
            java.lang.String r6 = "Unsupported color type: "
            java.lang.String r0 = X.C11340SNw.A00(r0)
            java.lang.String r6 = X.002.A0R(r6, r0)
            java.lang.String r0 = "AtomParsers"
            X.STH.A03(r0, r6)
            goto L_0x09b5
        L_0x0d08:
            int r5 = r2.A08()
            int r6 = r2.A08()
            r2.A0P(r8)
            r3 = 19
            r0 = r47
            if (r0 != r3) goto L_0x0d22
            int r0 = r2.A05()
            r0 = r0 & 128(0x80, float:1.794E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0d23
        L_0x0d22:
            r3 = 0
        L_0x0d23:
            int r9 = X.SRQ.A00(r5)
            r5 = 2
            if (r3 == 0) goto L_0x0d2b
            r5 = 1
        L_0x0d2b:
            int r3 = X.SRQ.A01(r6)
            goto L_0x09b5
        L_0x0d31:
            X.SDQ r0 = X.SDQ.A00(r2)
            if (r0 == 0) goto L_0x09b5
            java.lang.String r0 = r0.A00
            r45 = r0
            java.lang.String r7 = "video/dolby-vision"
            goto L_0x09b5
        L_0x0d40:
            r0 = 1211250227(0x48323633, float:182488.8)
            r7 = 0
            if (r1 != r0) goto L_0x08c9
            r7 = r53
            goto L_0x08c9
        L_0x0d4a:
            java.lang.Object r0 = r5.second
            X.Rwy r0 = (X.C10720Rwy) r0
            java.lang.String r4 = r0.A02
            java.lang.String r0 = r7.A02
            boolean r0 = androidx.media3.common.util.Util.A0E(r0, r4)
            if (r0 != 0) goto L_0x08b5
            r3 = 0
            androidx.media3.common.DrmInitData$SchemeData[] r6 = r7.A03
            androidx.media3.common.DrmInitData r35 = new androidx.media3.common.DrmInitData
            r0 = r35
            r0.<init>(r4, r6, r3)
            goto L_0x08b5
        L_0x0d64:
            if (r84 != 0) goto L_0x1340
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r25
            X.QEL r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x1340
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            X.QEK r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x1340
            X.SRd r8 = r0.A00
            int r7 = X.Pxg.A04(r8)
            int r6 = r8.A07()
            long[] r5 = new long[r6]
            long[] r4 = new long[r6]
            r3 = 0
        L_0x0d89:
            if (r3 >= r6) goto L_0x0e1b
            r2 = 1
            if (r7 != r2) goto L_0x0daf
            long r0 = r8.A0D()
        L_0x0d92:
            r5[r3] = r0
            if (r7 != r2) goto L_0x0da9
            long r0 = r8.A0B()
        L_0x0d9a:
            r4[r3] = r0
            short r0 = r8.A0K()
            if (r0 != r2) goto L_0x1359
            r0 = 2
            r8.A0P(r0)
            int r3 = r3 + 1
            goto L_0x0d89
        L_0x0da9:
            int r0 = r8.A01()
            long r0 = (long) r0
            goto L_0x0d9a
        L_0x0daf:
            long r0 = r8.A0C()
            goto L_0x0d92
        L_0x0db4:
            long r6 = r2.A0B()
            long r8 = r2.A0B()
            goto L_0x00e1
        L_0x0dbe:
            if (r8 != r2) goto L_0x00c4
            if (r6 != r3) goto L_0x00c4
            if (r5 != 0) goto L_0x00c4
            r19 = 270(0x10e, float:3.78E-43)
            goto L_0x00c4
        L_0x0dc8:
            if (r9 != r2) goto L_0x00c4
            if (r8 != 0) goto L_0x00c4
            if (r6 != 0) goto L_0x00c4
            if (r5 != r2) goto L_0x00c4
            r19 = 180(0xb4, float:2.52E-43)
            goto L_0x00c4
        L_0x0dd4:
            if (r10 != 0) goto L_0x0de3
            long r10 = r2.A0C()
        L_0x0dda:
            r8 = 0
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x009e
            r0 = r10
            goto L_0x009e
        L_0x0de3:
            long r10 = r2.A0D()
            goto L_0x0dda
        L_0x0de8:
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x008b
            r6 = 1
            goto L_0x0094
        L_0x0def:
            r0 = 1986618469(0x76696465, float:1.1834389E33)
            if (r1 != r0) goto L_0x0df8
            r18 = 2
            goto L_0x0052
        L_0x0df8:
            r0 = 1952807028(0x74657874, float:7.272211E31)
            if (r1 == r0) goto L_0x0e17
            r0 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r1 == r0) goto L_0x0e17
            r0 = 1937072756(0x73756274, float:1.944137E31)
            if (r1 == r0) goto L_0x0e17
            r0 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r1 == r0) goto L_0x0e17
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            r18 = -1
            if (r1 != r0) goto L_0x0052
            r18 = 5
            goto L_0x0052
        L_0x0e17:
            r18 = 3
            goto L_0x0052
        L_0x0e1b:
            android.util.Pair r0 = android.util.Pair.create(r5, r4)
            if (r0 == 0) goto L_0x1340
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
        L_0x0e29:
            if (r55 == 0) goto L_0x0e48
            r2 = r31
            java.lang.Object r2 = r2.first
            long r63 = X.AnonymousClass7TE.A0R(r2)
            X.Ryn r24 = new X.Ryn
            r54 = r24
            r56 = r1
            r57 = r0
            r58 = r22
            r59 = r34
            r60 = r18
            r62 = r30
            r65 = r76
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r65, r67)
        L_0x0e48:
            r1 = r81
            r0 = r24
            java.lang.Object r15 = r1.apply(r0)
            X.Ryn r15 = (X.C10827Ryn) r15
            if (r15 == 0) goto L_0x0eaa
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r0 = r25
            X.QEL r1 = r0.A00(r1)
            r1.getClass()
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.QEL r1 = r1.A00(r0)
            r1.getClass()
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.QEL r1 = r1.A00(r0)
            r1.getClass()
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            X.QEK r3 = r1.A01(r0)
            if (r3 == 0) goto L_0x132e
            X.SJM r2 = r15.A07
            X.SfM r37 = new X.SfM
            r0 = r37
            r0.<init>(r2, r3)
        L_0x0e86:
            int r36 = r37.BpA()
            r10 = 0
            if (r36 != 0) goto L_0x0eae
            long[] r4 = new long[r10]
            int[] r3 = new int[r10]
            long[] r2 = new long[r10]
            int[] r1 = new int[r10]
            r18 = 0
            X.S39 r0 = new X.S39
            r11 = r0
            r12 = r15
            r13 = r3
            r14 = r1
            r15 = r4
            r16 = r2
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
        L_0x0ea5:
            r1 = r26
            r1.add(r0)
        L_0x0eaa:
            int r21 = r21 + 1
            goto L_0x0006
        L_0x0eae:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            X.QEK r0 = r1.A01(r0)
            r11 = 1
            if (r0 != 0) goto L_0x0fcb
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            X.QEK r0 = r1.A01(r0)
            r0.getClass()
            r35 = 1
        L_0x0ec4:
            X.SRd r0 = r0.A00
            r40 = r0
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            X.QEK r0 = r1.A01(r0)
            r0.getClass()
            X.SRd r0 = r0.A00
            r39 = r0
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            X.QEK r0 = r1.A01(r0)
            r0.getClass()
            X.SRd r0 = r0.A00
            r38 = r0
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            X.QEK r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0fc7
            X.SRd r0 = r0.A00
            r34 = r0
        L_0x0ef1:
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            X.QEK r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0fc3
            X.SRd r0 = r0.A00
            r30 = r0
        L_0x0efe:
            r4 = 0
            r23 = 0
            r1 = 12
            r0 = r40
            int r29 = X.Pxe.A07(r0, r1)
            r0 = r39
            int r28 = X.Pxe.A07(r0, r1)
            int r0 = r39.A01()
            r2 = 1
            if (r0 == r11) goto L_0x0f17
            r2 = 0
        L_0x0f17:
            java.lang.String r0 = "first_chunk must be 1"
            X.RS2.A00(r2, r0)
            r6 = -1
            r0 = r38
            int r8 = X.Pxe.A07(r0, r1)
            int r8 = r8 - r11
            int r14 = r38.A07()
            int r18 = r38.A07()
            if (r30 == 0) goto L_0x0fbf
            r0 = r30
            int r27 = X.Pxe.A07(r0, r1)
        L_0x0f34:
            if (r34 == 0) goto L_0x0fbb
            r0 = r34
            int r7 = X.Pxe.A07(r0, r1)
            if (r7 <= 0) goto L_0x0fb8
            int r0 = r34.A07()
            int r24 = r0 + -1
        L_0x0f44:
            int r12 = r37.B6R()
            X.SJM r0 = r15.A07
            r45 = r0
            java.lang.String r1 = r0.A0Y
            if (r12 == r6) goto L_0x100f
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0f68
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0f68
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x100f
        L_0x0f68:
            if (r8 != 0) goto L_0x100f
            if (r27 != 0) goto L_0x100f
            if (r7 != 0) goto L_0x100f
            r0 = r29
            long[] r13 = new long[r0]
            int[] r7 = new int[r0]
        L_0x0f74:
            int r6 = r6 + 1
            r0 = r29
            if (r6 != r0) goto L_0x0f91
            r0 = r18
            long r2 = (long) r0
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r12
            r6 = 0
            r4 = 0
            r1 = 0
        L_0x0f83:
            r0 = r29
            if (r4 >= r0) goto L_0x0fcf
            r0 = r7[r4]
            int r0 = r0 + r8
            int r0 = r0 + -1
            int r0 = r0 / r8
            int r1 = r1 + r0
            int r4 = r4 + 1
            goto L_0x0f83
        L_0x0f91:
            if (r35 == 0) goto L_0x0fb3
            long r2 = r40.A0D()
        L_0x0f97:
            if (r6 != r4) goto L_0x0fac
            int r23 = r39.A07()
            r1 = 4
            r0 = r39
            r0.A0P(r1)
            int r28 = r28 - r11
            if (r28 <= 0) goto L_0x0fb1
            int r4 = r39.A07()
            int r4 = r4 - r11
        L_0x0fac:
            r13[r6] = r2
            r7[r6] = r23
            goto L_0x0f74
        L_0x0fb1:
            r4 = -1
            goto L_0x0fac
        L_0x0fb3:
            long r2 = r40.A0C()
            goto L_0x0f97
        L_0x0fb8:
            r34 = 0
            goto L_0x0fbc
        L_0x0fbb:
            r7 = 0
        L_0x0fbc:
            r24 = -1
            goto L_0x0f44
        L_0x0fbf:
            r27 = 0
            goto L_0x0f34
        L_0x0fc3:
            r30 = 0
            goto L_0x0efe
        L_0x0fc7:
            r34 = 0
            goto L_0x0ef1
        L_0x0fcb:
            r35 = 0
            goto L_0x0ec4
        L_0x0fcf:
            long[] r0 = new long[r1]
            r32 = r0
            int[] r0 = new int[r1]
            r33 = r0
            long[] r9 = new long[r1]
            int[] r0 = new int[r1]
            r31 = r0
            r5 = 0
            r18 = 0
            r25 = 0
        L_0x0fe2:
            r0 = r29
            if (r6 >= r0) goto L_0x114c
            r4 = r7[r6]
            r16 = r13[r6]
        L_0x0fea:
            if (r4 <= 0) goto L_0x100c
            int r14 = java.lang.Math.min(r8, r4)
            r32[r18] = r16
            int r1 = r12 * r14
            r33[r18] = r1
            r0 = r25
            int r25 = java.lang.Math.max(r0, r1)
            long r0 = (long) r5
            long r0 = r0 * r2
            r9[r18] = r0
            r31[r18] = r11
            r0 = r33[r18]
            long r0 = (long) r0
            long r16 = r16 + r0
            int r5 = r5 + r14
            int r4 = r4 - r14
            int r18 = r18 + 1
            goto L_0x0fea
        L_0x100c:
            int r6 = r6 + 1
            goto L_0x0fe2
        L_0x100f:
            r0 = r36
            long[] r0 = new long[r0]
            r32 = r0
            r0 = r36
            int[] r0 = new int[r0]
            r33 = r0
            r0 = r36
            long[] r9 = new long[r0]
            int[] r0 = new int[r0]
            r31 = r0
            r5 = 0
            r25 = 0
            r13 = 0
            r22 = 0
            r12 = 0
            r2 = 0
            r19 = 0
        L_0x102e:
            java.lang.String r16 = "AtomParsers"
            r0 = r36
            if (r5 >= r0) goto L_0x105c
        L_0x1034:
            if (r13 != 0) goto L_0x10ed
            int r6 = r6 + 1
            r0 = r29
            if (r6 != r0) goto L_0x10c7
            java.lang.String r1 = "Unexpected end of chunk data"
            r0 = r16
            X.STH.A03(r0, r1)
            r0 = r32
            long[] r32 = java.util.Arrays.copyOf(r0, r5)
            r0 = r33
            int[] r33 = java.util.Arrays.copyOf(r0, r5)
            long[] r9 = java.util.Arrays.copyOf(r9, r5)
            r0 = r31
            int[] r31 = java.util.Arrays.copyOf(r0, r5)
            r36 = r5
            r13 = 0
        L_0x105c:
            r0 = r22
            long r0 = (long) r0
            long r2 = r2 + r0
            if (r30 == 0) goto L_0x10c5
        L_0x1062:
            if (r27 <= 0) goto L_0x10c5
            int r0 = r30.A07()
            if (r0 == 0) goto L_0x10bf
            r4 = 0
        L_0x106b:
            if (r7 != 0) goto L_0x1077
            if (r14 != 0) goto L_0x1077
            if (r13 != 0) goto L_0x1077
            if (r8 != 0) goto L_0x1077
            if (r12 != 0) goto L_0x1077
            if (r4 != 0) goto L_0x114e
        L_0x1077:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Inconsistent stbl box for track "
            r0.append(r1)
            int r1 = r15.A00
            r0.append(r1)
            java.lang.String r1 = ": remainingSynchronizationSamples "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", remainingSamplesAtTimestampDelta "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", remainingSamplesInChunk "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r0.append(r1)
            r0.append(r12)
            if (r4 != 0) goto L_0x10bc
            java.lang.String r1 = ", ctts invalid"
        L_0x10b1:
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r1, r0)
            r0 = r16
            X.STH.A03(r0, r1)
            goto L_0x114e
        L_0x10bc:
            java.lang.String r1 = ""
            goto L_0x10b1
        L_0x10bf:
            r30.A01()
            int r27 = r27 + -1
            goto L_0x1062
        L_0x10c5:
            r4 = 1
            goto L_0x106b
        L_0x10c7:
            if (r35 == 0) goto L_0x10e8
            long r19 = r40.A0D()
        L_0x10cd:
            if (r6 != r4) goto L_0x10e2
            int r23 = r39.A07()
            r1 = 4
            r0 = r39
            r0.A0P(r1)
            int r28 = r28 - r11
            if (r28 <= 0) goto L_0x10e6
            int r4 = r39.A07()
            int r4 = r4 - r11
        L_0x10e2:
            r13 = r23
            goto L_0x1034
        L_0x10e6:
            r4 = -1
            goto L_0x10e2
        L_0x10e8:
            long r19 = r40.A0C()
            goto L_0x10cd
        L_0x10ed:
            if (r30 == 0) goto L_0x1100
        L_0x10ef:
            if (r12 != 0) goto L_0x10fe
            if (r27 <= 0) goto L_0x10fe
            int r12 = r30.A07()
            int r22 = r30.A01()
            int r27 = r27 + -1
            goto L_0x10ef
        L_0x10fe:
            int r12 = r12 + -1
        L_0x1100:
            r32[r5] = r19
            int r1 = r37.E6b()
            r33[r5] = r1
            r0 = r25
            if (r1 <= r0) goto L_0x110e
            r25 = r1
        L_0x110e:
            r0 = r22
            long r0 = (long) r0
            long r0 = r0 + r2
            r9[r5] = r0
            boolean r0 = X.DbW.A1a(r34)
            r31[r5] = r0
            r0 = r24
            if (r5 != r0) goto L_0x112d
            r31[r5] = r11
            int r7 = r7 + -1
            if (r7 <= 0) goto L_0x112d
            r34.getClass()
            int r24 = r34.A07()
            int r24 = r24 - r11
        L_0x112d:
            r0 = r18
            long r0 = (long) r0
            long r2 = r2 + r0
            int r14 = r14 + -1
            if (r14 != 0) goto L_0x1141
            if (r8 <= 0) goto L_0x1141
            int r14 = r38.A07()
            int r18 = r38.A01()
            int r8 = r8 + -1
        L_0x1141:
            r0 = r33[r5]
            long r0 = (long) r0
            long r19 = r19 + r0
            int r13 = r13 + -1
            int r5 = r5 + 1
            goto L_0x102e
        L_0x114c:
            long r0 = (long) r5
            long r2 = r2 * r0
        L_0x114e:
            long r12 = r15.A06
            long r7 = androidx.media3.common.util.Util.A05(r2, r12)
            long[] r14 = r15.A08
            if (r14 != 0) goto L_0x116c
            androidx.media3.common.util.Util.A0B(r9, r12)
        L_0x115b:
            X.S39 r0 = new X.S39
            r1 = r15
            r2 = r33
            r3 = r31
            r4 = r32
            r5 = r9
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0ea5
        L_0x116c:
            int r0 = r14.length
            r49 = r0
            if (r0 != r11) goto L_0x11f5
            int r0 = r15.A03
            if (r0 != r11) goto L_0x11f5
            int r4 = r9.length
            r0 = 2
            if (r4 < r0) goto L_0x11f5
            long[] r0 = r15.A09
            r0.getClass()
            r43 = r0[r10]
            r37 = r14[r10]
            long r0 = r15.A05
            r18 = r0
            r39 = r12
            r41 = r0
            long r0 = androidx.media3.common.util.Util.A06(r37, r39, r41)
            long r16 = r43 + r0
            int r1 = r4 - r11
            r0 = 4
            int r5 = X.Pxf.A01(r0, r1, r10)
            int r4 = r4 - r0
            int r1 = X.Pxf.A01(r4, r1, r10)
            r6 = r9[r10]
            int r0 = (r6 > r43 ? 1 : (r6 == r43 ? 0 : -1))
            if (r0 > 0) goto L_0x11f5
            r4 = r9[r5]
            int r0 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x11f5
            r4 = r9[r1]
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x11f5
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x11f5
            long r37 = r2 - r16
            long r43 = r43 - r6
            r0 = r45
            int r0 = r0.A0I
            long r4 = (long) r0
            r45 = r4
            r47 = r12
            long r0 = androidx.media3.common.util.Util.A06(r43, r45, r47)
            r39 = r4
            r41 = r12
            long r4 = androidx.media3.common.util.Util.A06(r37, r39, r41)
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x11d5
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x11f5
        L_0x11d5:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x11f5
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x11f5
            int r2 = (int) r0
            r0 = r79
            r0.A00 = r2
            int r1 = (int) r4
            r0.A01 = r1
            androidx.media3.common.util.Util.A0B(r9, r12)
            r2 = r14[r10]
            r0 = r18
            long r7 = androidx.media3.common.util.Util.A05(r2, r0)
            goto L_0x115b
        L_0x11f5:
            r0 = r49
            if (r0 != r11) goto L_0x121f
            r6 = r14[r10]
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x121f
            long[] r0 = r15.A09
            r0.getClass()
            r5 = r0[r10]
            r4 = 0
        L_0x1209:
            int r0 = r9.length
            if (r4 >= r0) goto L_0x1218
            r0 = r9[r4]
            long r0 = r0 - r5
            long r0 = androidx.media3.common.util.Util.A05(r0, r12)
            r9[r4] = r0
            int r4 = r4 + 1
            goto L_0x1209
        L_0x1218:
            long r2 = r2 - r5
            long r7 = androidx.media3.common.util.Util.A05(r2, r12)
            goto L_0x115b
        L_0x121f:
            int r0 = r15.A03
            r43 = r0
            boolean r16 = X.AnonymousClass7TF.A1S(r0, r11)
            r0 = r49
            int[] r10 = new int[r0]
            int[] r0 = new int[r0]
            r30 = r0
            long[] r0 = r15.A09
            r29 = r0
            r29.getClass()
            r3 = 0
            r28 = 0
            r2 = 0
            r6 = 0
        L_0x123b:
            r0 = r49
            if (r3 >= r0) goto L_0x1295
            r0 = r29[r3]
            r7 = -1
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x1290
            r37 = r14[r3]
            long r4 = r15.A05
            r39 = r12
            r41 = r4
            long r7 = androidx.media3.common.util.Util.A06(r37, r39, r41)
            int r4 = androidx.media3.common.util.Util.A02(r9, r0, r11)
            r10[r3] = r4
            long r0 = r0 + r7
            int r5 = java.util.Arrays.binarySearch(r9, r0)
            if (r5 >= 0) goto L_0x127f
            r5 = r5 ^ -1
        L_0x1262:
            r30[r3] = r5
        L_0x1264:
            r1 = r10[r3]
            r0 = r30[r3]
            if (r1 >= r0) goto L_0x1275
            r4 = r31[r1]
            r4 = r4 & 1
            if (r4 != 0) goto L_0x1275
            int r0 = r1 + 1
            r10[r3] = r0
            goto L_0x1264
        L_0x1275:
            int r4 = r0 - r1
            int r2 = r2 + r4
            boolean r1 = X.JTQ.A1O(r6, r1)
            r28 = r28 | r1
            goto L_0x1291
        L_0x127f:
            int r5 = r5 + 1
            int r4 = r9.length
            if (r5 >= r4) goto L_0x128b
            r7 = r9[r5]
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x128b
            goto L_0x127f
        L_0x128b:
            if (r16 == 0) goto L_0x1262
            int r5 = r5 + -1
            goto L_0x1262
        L_0x1290:
            r0 = r6
        L_0x1291:
            int r3 = r3 + 1
            r6 = r0
            goto L_0x123b
        L_0x1295:
            r6 = 0
            r1 = 1
            r0 = r36
            if (r2 != r0) goto L_0x129c
            r1 = 0
        L_0x129c:
            r28 = r28 | r1
            if (r28 == 0) goto L_0x130f
            long[] r0 = new long[r2]
            r35 = r0
            int[] r0 = new int[r2]
            r27 = r0
            r25 = 0
            int[] r0 = new int[r2]
            r34 = r0
        L_0x12ae:
            long[] r0 = new long[r2]
            r24 = r0
            r2 = 0
            r8 = 0
        L_0x12b5:
            r0 = r49
            if (r6 >= r0) goto L_0x1316
            r22 = r29[r6]
            r7 = r10[r6]
            r20 = r30[r6]
            if (r28 == 0) goto L_0x12d8
            int r4 = r20 - r7
            r1 = r32
            r0 = r35
            java.lang.System.arraycopy(r1, r7, r0, r8, r4)
            r1 = r33
            r0 = r27
            java.lang.System.arraycopy(r1, r7, r0, r8, r4)
            r1 = r31
            r0 = r34
            java.lang.System.arraycopy(r1, r7, r0, r8, r4)
        L_0x12d8:
            r0 = r20
            if (r7 >= r0) goto L_0x1309
            long r0 = r15.A05
            long r18 = androidx.media3.common.util.Util.A05(r2, r0)
            r0 = r9[r7]
            long r0 = r0 - r22
            long r4 = androidx.media3.common.util.Util.A05(r0, r12)
            r0 = r43
            if (r0 == r11) goto L_0x12f6
            r16 = 0
            r0 = r16
            long r4 = java.lang.Math.max(r0, r4)
        L_0x12f6:
            long r18 = r18 + r4
            r24[r8] = r18
            if (r28 == 0) goto L_0x1304
            r1 = r27[r8]
            r0 = r25
            if (r1 <= r0) goto L_0x1304
            r25 = r33[r7]
        L_0x1304:
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L_0x12d8
        L_0x1309:
            r0 = r14[r6]
            long r2 = r2 + r0
            int r6 = r6 + 1
            goto L_0x12b5
        L_0x130f:
            r35 = r32
            r27 = r33
            r34 = r31
            goto L_0x12ae
        L_0x1316:
            long r0 = r15.A05
            long r7 = androidx.media3.common.util.Util.A05(r2, r0)
            X.S39 r0 = new X.S39
            r1 = r15
            r2 = r27
            r3 = r34
            r4 = r35
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0ea5
        L_0x132e:
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            X.QEK r2 = r1.A01(r0)
            if (r2 == 0) goto L_0x1369
            X.SfN r37 = new X.SfN
            r0 = r37
            r0.<init>(r2)
            goto L_0x0e86
        L_0x1340:
            r1 = r24
            r0 = r1
            goto L_0x0e29
        L_0x1345:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        L_0x134a:
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0 = r39
            java.lang.String r1 = X.002.A0O(r1, r0)
            r0 = r24
            X.XQX r0 = X.Pxf.A0L(r1, r0)
            throw r0
        L_0x1359:
            java.lang.String r0 = "Unsupported media rate."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x1360:
            java.lang.String r1 = "Malformed sample table (stbl) missing sample description (stsd)"
            r0 = r24
            X.XQX r0 = X.Pxf.A0L(r1, r0)
            throw r0
        L_0x1369:
            java.lang.String r1 = "Track has no sample table size information"
            r0 = 0
            X.XQX r0 = X.Pxf.A0L(r1, r0)
            throw r0
        L_0x1371:
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11399SRu.A03(androidx.media3.common.DrmInitData, X.SGx, X.QEL, X.2hV, long, boolean, boolean):java.util.ArrayList");
    }
}
