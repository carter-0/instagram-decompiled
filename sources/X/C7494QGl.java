package X;

import java.io.EOFException;

/* renamed from: X.QGl  reason: case insensitive filesystem */
public final class C7494QGl extends C12828T8z {
    public static final TAH A06 = TAH.A02("\"\\");
    public static final TAH A07 = TAH.A02("'\\");
    public static final TAH A08 = TAH.A02("{}[]:, \n\t\r\f/\\;#=");
    public static final TAH A09 = TAH.A02("*/");
    public static final TAH A0A = TAH.A02("\n\r");
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final C13198TPe A04;
    public final YCT A05;

    private int A02(boolean z) {
        int i = 0;
        while (true) {
            YCT yct = this.A05;
            int i2 = i + 1;
            if (yct.EHK((long) i2)) {
                C13198TPe tPe = this.A04;
                byte A002 = tPe.A00((long) i);
                if (A002 == 10 || A002 == 32 || A002 == 13 || A002 == 9) {
                    i = i2;
                } else {
                    tPe.Evi((long) (i2 - 1));
                    if (A002 != 47 ? A002 != 35 : !yct.EHK(2)) {
                        return A002;
                    }
                    A0P("Use JsonReader.setLenient(true) to accept malformed JSON");
                    throw AnonymousClass00P.createAndThrow();
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public static String A04(C7494QGl qGl, TAH tah) {
        StringBuilder sb = null;
        while (true) {
            long CMF = qGl.A05.CMF(tah);
            if (CMF != -1) {
                C13198TPe tPe = qGl.A04;
                if (tPe.A00(CMF) == 92) {
                    if (sb == null) {
                        sb = AnonymousClass7TE.A1A();
                    }
                    sb.append(tPe.A07(SCP.A00, CMF));
                    tPe.readByte();
                    sb.append(qGl.A00());
                } else {
                    String A072 = tPe.A07(SCP.A00, CMF);
                    if (sb == null) {
                        tPe.readByte();
                        return A072;
                    }
                    sb.append(A072);
                    tPe.readByte();
                    return sb.toString();
                }
            } else {
                qGl.A0P("Unterminated string");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void close() {
        this.A00 = 0;
        this.A02[0] = 8;
        this.A00 = 1;
        this.A04.A0A();
        this.A05.close();
    }

    private char A00() {
        String str;
        StringBuilder A1A;
        int i;
        int i2;
        YCT yct = this.A05;
        if (yct.EHK(1)) {
            C13198TPe tPe = this.A04;
            byte readByte = tPe.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                A1A = AnonymousClass7TE.A1A();
                A1A.append("Invalid escape sequence: \\");
                A1A.append((char) readByte);
            } else if (yct.EHK(4)) {
                int i3 = 0;
                char c = 0;
                do {
                    byte A002 = tPe.A00((long) i3);
                    char c2 = (char) (c << 4);
                    if (A002 >= 48) {
                        if (A002 <= 57) {
                            i2 = A002 - 48;
                        } else {
                            if (A002 >= 97) {
                                if (A002 <= 102) {
                                    i = A002 - 97;
                                }
                            } else if (A002 >= 65 && A002 <= 70) {
                                i = A002 - 65;
                            }
                            i2 = i + 10;
                        }
                        c = (char) (c2 + i2);
                        i3++;
                    }
                    A1A = AnonymousClass7TE.A1A();
                    A1A.append("\\u");
                    A1A.append(tPe.A07(SCP.A00, 4));
                } while (i3 < 4);
                tPe.Evi(4);
                return c;
            } else {
                throw new EOFException(002.A0R("Unterminated escape sequence at path ", A0H()));
            }
            str = A1A.toString();
        } else {
            str = "Unterminated escape sequence";
        }
        A0P(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x013e, code lost:
        r0 = -r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x013f, code lost:
        r9.A02 = r0;
        r4.Evi((long) r13);
        r11 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0147, code lost:
        r9.A00 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0149, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x014a, code lost:
        if (r19 == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x014d, code lost:
        if (r12 == 4) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0151, code lost:
        if (r12 != 7) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0153, code lost:
        r9.A01 = r13;
        r11 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x012a, code lost:
        if (r9.A06(r10) != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x012c, code lost:
        if (r12 != 2) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012e, code lost:
        if (r20 == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0134, code lost:
        if (r0 != Long.MIN_VALUE) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0136, code lost:
        if (r19 == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x013a, code lost:
        if (r0 != 0) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x013c, code lost:
        if (r19 != false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x012c A[EDGE_INSN: B:182:0x012c->B:92:0x012c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C7494QGl r21) {
        /*
            r9 = r21
            int[] r15 = r9.A02
            int r14 = r9.A00
            r8 = 1
            int r14 = r14 - r8
            r12 = r15[r14]
            r2 = 0
            r13 = 8
            r11 = 34
            r10 = 93
            r7 = 3
            r21 = 7
            r4 = 59
            r1 = 44
            r6 = 4
            r5 = 2
            if (r12 != r8) goto L_0x0184
            r15[r14] = r5
        L_0x001f:
            int r13 = r9.A02(r8)
            if (r13 == r11) goto L_0x017b
            r0 = 39
            if (r13 == r0) goto L_0x0222
            if (r13 == r1) goto L_0x01a9
            if (r13 == r4) goto L_0x01a9
            r0 = 91
            if (r13 == r0) goto L_0x0174
            if (r13 == r10) goto L_0x019f
            r0 = 123(0x7b, float:1.72E-43)
            if (r13 == r0) goto L_0x0236
            X.TPe r4 = r9.A04
            byte r1 = r4.A00(r2)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L_0x016c
            r0 = 84
            if (r1 == r0) goto L_0x016c
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L_0x0165
            r0 = 70
            if (r1 == r0) goto L_0x0165
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x0055
            r0 = 78
            if (r1 != r0) goto L_0x0080
        L_0x0055:
            r11 = 7
            java.lang.String r15 = "null"
            java.lang.String r14 = "NULL"
        L_0x005b:
            int r10 = r15.length()
            r13 = 1
        L_0x0060:
            X.YCT r12 = r9.A05
            if (r13 >= r10) goto L_0x010b
            int r16 = r13 + 1
            r0 = r16
            long r0 = (long) r0
            boolean r0 = r12.EHK(r0)
            if (r0 == 0) goto L_0x0080
            long r0 = (long) r13
            byte r1 = r4.A00(r0)
            char r0 = r15.charAt(r13)
            if (r1 == r0) goto L_0x0107
            char r0 = r14.charAt(r13)
            if (r1 == r0) goto L_0x0107
        L_0x0080:
            r0 = 0
            r13 = 0
            r12 = 0
            r20 = 1
            r19 = 0
        L_0x0088:
            X.YCT r15 = r9.A05
            int r14 = r13 + 1
            long r10 = (long) r14
            boolean r10 = r15.EHK(r10)
            if (r10 == 0) goto L_0x012c
            long r10 = (long) r13
            byte r10 = r4.A00(r10)
            r11 = 43
            r15 = 5
            if (r10 == r11) goto L_0x0103
            r11 = 69
            if (r10 == r11) goto L_0x00fd
            r11 = 101(0x65, float:1.42E-43)
            if (r10 == r11) goto L_0x00fd
            r11 = 45
            if (r10 == r11) goto L_0x00f7
            r11 = 46
            if (r10 == r11) goto L_0x00f3
            r11 = 48
            if (r10 < r11) goto L_0x0126
            r11 = 57
            if (r10 > r11) goto L_0x0126
            if (r12 == r8) goto L_0x00ed
            if (r12 == 0) goto L_0x00ed
            if (r12 != r5) goto L_0x00e2
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0158
            r17 = 10
            long r17 = r17 * r0
            int r10 = r10 + -48
            long r10 = (long) r10
            long r17 = r17 - r10
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x00d9
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 != 0) goto L_0x00e0
            int r10 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x00e0
        L_0x00d9:
            r0 = 1
        L_0x00da:
            r20 = r20 & r0
            r0 = r17
        L_0x00de:
            r13 = r14
            goto L_0x0088
        L_0x00e0:
            r0 = 0
            goto L_0x00da
        L_0x00e2:
            if (r12 != r7) goto L_0x00e6
            r12 = 4
            goto L_0x00de
        L_0x00e6:
            if (r12 == r15) goto L_0x00eb
            r10 = 6
            if (r12 != r10) goto L_0x00de
        L_0x00eb:
            r12 = 7
            goto L_0x00de
        L_0x00ed:
            int r0 = r10 + -48
            int r0 = -r0
            long r0 = (long) r0
            r12 = 2
            goto L_0x00de
        L_0x00f3:
            if (r12 != r5) goto L_0x0158
            r12 = 3
            goto L_0x00de
        L_0x00f7:
            if (r12 != 0) goto L_0x0103
            r12 = 1
            r19 = 1
            goto L_0x00de
        L_0x00fd:
            if (r12 == r5) goto L_0x0101
            if (r12 != r6) goto L_0x0158
        L_0x0101:
            r12 = 5
            goto L_0x00de
        L_0x0103:
            if (r12 != r15) goto L_0x0158
            r12 = 6
            goto L_0x00de
        L_0x0107:
            r13 = r16
            goto L_0x0060
        L_0x010b:
            int r0 = r10 + 1
            long r0 = (long) r0
            boolean r0 = r12.EHK(r0)
            if (r0 == 0) goto L_0x0121
            long r0 = (long) r10
            byte r0 = r4.A00(r0)
            boolean r0 = r9.A06(r0)
            if (r0 == 0) goto L_0x0121
            goto L_0x0080
        L_0x0121:
            long r0 = (long) r10
            r4.Evi(r0)
            goto L_0x0147
        L_0x0126:
            boolean r7 = r9.A06(r10)
            if (r7 != 0) goto L_0x0158
        L_0x012c:
            if (r12 != r5) goto L_0x014d
            if (r20 == 0) goto L_0x0153
            r6 = -9223372036854775808
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0138
            if (r19 == 0) goto L_0x0153
        L_0x0138:
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x014a
            if (r19 != 0) goto L_0x0153
        L_0x013e:
            long r0 = -r0
        L_0x013f:
            r9.A02 = r0
            long r0 = (long) r13
            r4.Evi(r0)
            r11 = 16
        L_0x0147:
            r9.A00 = r11
            return r11
        L_0x014a:
            if (r19 == 0) goto L_0x013e
            goto L_0x013f
        L_0x014d:
            if (r12 == r6) goto L_0x0153
            r0 = r21
            if (r12 != r0) goto L_0x0158
        L_0x0153:
            r9.A01 = r13
            r11 = 17
            goto L_0x0147
        L_0x0158:
            byte r0 = r4.A00(r2)
            boolean r0 = r9.A06(r0)
            if (r0 != 0) goto L_0x0222
            java.lang.String r1 = "Expected value"
            goto L_0x0197
        L_0x0165:
            r11 = 6
            java.lang.String r15 = "false"
            java.lang.String r14 = "FALSE"
            goto L_0x005b
        L_0x016c:
            r11 = 5
            java.lang.String r15 = "true"
            java.lang.String r14 = "TRUE"
            goto L_0x005b
        L_0x0174:
            X.TPe r0 = r9.A04
            r0.readByte()
            goto L_0x021a
        L_0x017b:
            X.TPe r0 = r9.A04
            r0.readByte()
            r7 = 9
            goto L_0x021a
        L_0x0184:
            if (r12 != r5) goto L_0x01b0
            int r13 = r9.A02(r8)
            X.TPe r0 = r9.A04
            r0.readByte()
            if (r13 == r1) goto L_0x001f
            if (r13 == r4) goto L_0x0222
            if (r13 == r10) goto L_0x01a6
            java.lang.String r1 = "Unterminated array"
        L_0x0197:
            r9.A0P(r1)
        L_0x019a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x019f:
            if (r12 != r8) goto L_0x01a9
            X.TPe r0 = r9.A04
            r0.readByte()
        L_0x01a6:
            r9.A00 = r6
            return r6
        L_0x01a9:
            if (r12 == r8) goto L_0x0222
            if (r12 == r5) goto L_0x0222
            java.lang.String r1 = "Unexpected value"
            goto L_0x0197
        L_0x01b0:
            r0 = 5
            if (r12 == r7) goto L_0x01d4
            if (r12 == r0) goto L_0x01d4
            if (r12 != r6) goto L_0x01cd
            r15[r14] = r0
            int r13 = r9.A02(r8)
            X.TPe r0 = r9.A04
            r0.readByte()
            r0 = 58
            if (r13 == r0) goto L_0x001f
            r0 = 61
            if (r13 == r0) goto L_0x0222
            java.lang.String r1 = "Expected ':'"
            goto L_0x0197
        L_0x01cd:
            r0 = 6
            if (r12 != r0) goto L_0x020c
            r15[r14] = r21
            goto L_0x001f
        L_0x01d4:
            r15[r14] = r6
            r6 = 125(0x7d, float:1.75E-43)
            if (r12 != r0) goto L_0x01ec
            int r3 = r9.A02(r8)
            X.TPe r2 = r9.A04
            r2.readByte()
            if (r3 == r1) goto L_0x01ec
            if (r3 == r4) goto L_0x0222
            if (r3 == r6) goto L_0x0201
            java.lang.String r1 = "Unterminated object"
            goto L_0x0197
        L_0x01ec:
            int r2 = r9.A02(r8)
            if (r2 == r11) goto L_0x0204
            r1 = 39
            if (r2 == r1) goto L_0x021d
            java.lang.String r1 = "Expected name"
            if (r2 != r6) goto L_0x0222
            if (r12 == r0) goto L_0x0197
            X.TPe r0 = r9.A04
            r0.readByte()
        L_0x0201:
            r9.A00 = r5
            return r5
        L_0x0204:
            X.TPe r0 = r9.A04
            r0.readByte()
            r7 = 13
            goto L_0x021a
        L_0x020c:
            r0 = r21
            if (r12 != r0) goto L_0x0229
            r0 = 0
            int r1 = r9.A02(r0)
            r0 = -1
            if (r1 != r0) goto L_0x0222
            r7 = 18
        L_0x021a:
            r9.A00 = r7
            return r7
        L_0x021d:
            X.TPe r0 = r9.A04
            r0.readByte()
        L_0x0222:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            r9.A0P(r0)
            goto L_0x019a
        L_0x0229:
            if (r12 != r13) goto L_0x001f
            r0 = 2337(0x921, float:3.275E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0236:
            X.TPe r0 = r9.A04
            r0.readByte()
            r9.A00 = r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7494QGl.A01(X.QGl):int");
    }

    public static String A03(C7494QGl qGl) {
        long CMF = qGl.A05.CMF(A08);
        if (CMF != -1) {
            return qGl.A04.A07(SCP.A00, CMF);
        }
        return qGl.A04.A05();
    }

    public static void A05(C7494QGl qGl, TAH tah) {
        while (true) {
            long CMF = qGl.A05.CMF(tah);
            if (CMF != -1) {
                C13198TPe tPe = qGl.A04;
                byte A002 = tPe.A00(CMF);
                long j = CMF + 1;
                if (A002 == 92) {
                    tPe.Evi(j);
                    qGl.A00();
                } else {
                    tPe.Evi(j);
                    return;
                }
            } else {
                qGl.A0P("Unterminated string");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    private boolean A06(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A0P("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw AnonymousClass00P.createAndThrow();
    }

    public C7494QGl(YCT yct) {
        this.A05 = yct;
        this.A04 = yct.AEA();
        A0O(6);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("JsonReader(");
        return Pxg.A0q(this.A05, A1A);
    }
}
