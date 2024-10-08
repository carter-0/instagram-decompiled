package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.4e0  reason: invalid class name and case insensitive filesystem */
public final class C268794e0 extends C267794cD implements C268804e1, C267824cH, C268824e3, C267804cE {
    public C288905cg A00;
    public boolean A01;
    public boolean A02;

    public final C56876IFx A0H() {
        C56876IFx iFx = new C56876IFx();
        C267794cD r7 = this.A03;
        if (r7.A08) {
            C267794cD r0 = r7;
            AnonymousClass5R6 A022 = AnonymousClass5WH.A02(this);
            if (A022 != null) {
                loop0:
                while (true) {
                    if ((A022.A0W.A02.A00 & 3072) != 0) {
                        while (true) {
                            if (r0 == null) {
                                break;
                            }
                            int i = r0.A01;
                            if ((i & 3072) != 0) {
                                if (r0 != r7 && (i & 1024) != 0) {
                                    break loop0;
                                } else if ((i & C249703kE.FLAG_MOVED) != 0) {
                                    C267794cD r5 = r0;
                                    C285045Pl r1 = null;
                                    do {
                                        if (r5 instanceof AnonymousClass5VG) {
                                            ((AnonymousClass5VG) r5).AC1(iFx);
                                        } else if ((r5.A01 & C249703kE.FLAG_MOVED) != 0 && (r5 instanceof C267944cV)) {
                                            int i2 = 0;
                                            for (C267794cD r4 = ((C267944cV) r5).A00; r4 != null; r4 = r4.A02) {
                                                if ((r4.A01 & C249703kE.FLAG_MOVED) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        r5 = r4;
                                                    } else {
                                                        if (r1 == null) {
                                                            r1 = new C285045Pl(new C267794cD[16]);
                                                        }
                                                        if (r5 != null) {
                                                            r1.A09(r5);
                                                            r5 = null;
                                                        }
                                                        r1.A09(r4);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                                continue;
                                            }
                                        }
                                        r5 = AnonymousClass5WH.A00(r1);
                                        continue;
                                    } while (r5 != null);
                                }
                            }
                            r0 = r0.A04;
                        }
                    }
                    A022 = A022.A0B();
                    if (A022 == null) {
                        break;
                    }
                    AnonymousClass5RP r02 = A022.A0W;
                    if (r02 != null) {
                        r0 = r02.A05;
                    } else {
                        r0 = null;
                    }
                }
            }
            return iFx;
        }
        throw new IllegalStateException(C273654mx.A00(196));
    }

    public final C288905cg A0I() {
        AnonymousClass5R6 r0;
        C268124co r02;
        AnonymousClass5QZ r03;
        C285195Qd r04;
        C288905cg r05;
        C268054cg r06 = this.A03.A05;
        if (r06 != null && (r0 = r06.A0H) != null && (r02 = r0.A0A) != null && (r03 = ((AndroidComposeView) r02).A0S) != null && (r04 = ((AnonymousClass5QY) r03).A04) != null && (r05 = (C288905cg) r04.A01.A03(this)) != null) {
            return r05;
        }
        C288905cg r07 = this.A00;
        if (r07 == null) {
            return C288905cg.Inactive;
        }
        return r07;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0127, code lost:
        r6 = X.AnonymousClass5WH.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x012c, code lost:
        if (r2 != 1) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x012e, code lost:
        if (r6 == null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0131, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0133, code lost:
        if (r0 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0136, code lost:
        X.AnonymousClass5WH.A06(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x013a, code lost:
        if (r1 == 2) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x013c, code lost:
        if (r1 == 1) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x013f, code lost:
        if (r1 == 3) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0141, code lost:
        r1 = new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0147, code lost:
        r1 = X.C288905cg.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x014a, code lost:
        r1 = X.C288905cg.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x014c, code lost:
        X.C286375Wc.A00(r15).A01.A09(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0162, code lost:
        r1 = new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r1 = r5.A0I().ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r1 == 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (r2 == 1) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009a, code lost:
        if (r1 == 2) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009c, code lost:
        if (r1 == 1) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009f, code lost:
        if (r1 == 3) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a3, code lost:
        r9 = r15.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a7, code lost:
        if (r9.A08 != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a9, code lost:
        X.I2E.A01(X.C273654mx.A00(427));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b2, code lost:
        r1 = X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r7 = new X.C285045Pl(new X.C267794cD[16]);
        r0 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c3, code lost:
        if (r0 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c5, code lost:
        r7.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c8, code lost:
        r0 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ca, code lost:
        if (r0 == 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cc, code lost:
        r9 = (X.C267794cD) r7.A00(r0 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
        if ((r9.A00 & 1024) == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d8, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dc, code lost:
        if ((r0.A01 & 1024) == 0) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00de, code lost:
        r6 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e3, code lost:
        if ((r6 instanceof X.C268794e0) == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e5, code lost:
        r6 = (X.C268794e0) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00e9, code lost:
        if (r6.A00 == null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
        r1 = r6.A0I().ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f3, code lost:
        if (r1 == 0) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00f9, code lost:
        if ((r6.A01 & 1024) == 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00fd, code lost:
        if ((r6 instanceof X.C267944cV) == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00ff, code lost:
        r3 = ((X.C267944cV) r6).A00;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0105, code lost:
        if (r3 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x010a, code lost:
        if ((r3.A01 & 1024) == 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x010c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x010e, code lost:
        if (r2 != 1) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0110, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0112, code lost:
        if (r5 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0114, code lost:
        r5 = new X.C285045Pl(new X.C267794cD[16]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x011b, code lost:
        if (r6 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x011d, code lost:
        r5.A09(r6);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0121, code lost:
        r5.A09(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0124, code lost:
        r3 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J() {
        /*
            r15 = this;
            X.5cg r0 = r15.A00
            if (r0 != 0) goto L_0x0170
            X.5Qd r4 = X.C286375Wc.A00(r15)
            boolean r0 = r4.A00     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x000f
            X.C285195Qd.A00(r4)     // Catch:{ all -> 0x0168 }
        L_0x000f:
            r12 = 1
            r4.A00 = r12     // Catch:{ all -> 0x0168 }
            r14 = 1024(0x400, float:1.435E-42)
            X.4cD r1 = r15.A03     // Catch:{ all -> 0x0168 }
            boolean r0 = r1.A08     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0156
            X.4cD r8 = r1.A04     // Catch:{ all -> 0x0168 }
            X.5R6 r7 = X.AnonymousClass5WH.A02(r15)     // Catch:{ all -> 0x0168 }
        L_0x0020:
            r11 = 0
            if (r7 == 0) goto L_0x0147
            X.5RP r0 = r7.A0W     // Catch:{ all -> 0x0168 }
            X.4cD r0 = r0.A02     // Catch:{ all -> 0x0168 }
            int r0 = r0.A00     // Catch:{ all -> 0x0168 }
            r0 = r0 & r14
            r6 = 0
            if (r0 == 0) goto L_0x008b
        L_0x002d:
            if (r8 == 0) goto L_0x008b
            int r0 = r8.A01     // Catch:{ all -> 0x0168 }
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0088
            r5 = r8
            r0 = r6
        L_0x0036:
            boolean r1 = r5 instanceof X.C268794e0     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x004b
            X.4e0 r5 = (X.C268794e0) r5     // Catch:{ all -> 0x0168 }
            X.5cg r1 = r5.A00     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x007e
            X.5cg r0 = r5.A0I()     // Catch:{ all -> 0x0168 }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x0168 }
            if (r1 == r11) goto L_0x0147
            goto L_0x0099
        L_0x004b:
            int r1 = r5.A01     // Catch:{ all -> 0x0168 }
            r1 = r1 & r14
            if (r1 == 0) goto L_0x007e
            boolean r1 = r5 instanceof X.C267944cV     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x007e
            r1 = r5
            X.4cV r1 = (X.C267944cV) r1     // Catch:{ all -> 0x0168 }
            X.4cD r3 = r1.A00     // Catch:{ all -> 0x0168 }
            r2 = 0
        L_0x005a:
            if (r3 == 0) goto L_0x0083
            int r1 = r3.A01     // Catch:{ all -> 0x0168 }
            r1 = r1 & r14
            if (r1 == 0) goto L_0x007b
            int r2 = r2 + 1
            if (r2 != r12) goto L_0x0067
            r5 = r3
            goto L_0x007b
        L_0x0067:
            if (r0 != 0) goto L_0x0072
            r0 = 16
            X.4cD[] r1 = new X.C267794cD[r0]     // Catch:{ all -> 0x0168 }
            X.5Pl r0 = new X.5Pl     // Catch:{ all -> 0x0168 }
            r0.<init>(r1)     // Catch:{ all -> 0x0168 }
        L_0x0072:
            if (r5 == 0) goto L_0x0078
            r0.A09(r5)     // Catch:{ all -> 0x0168 }
            r5 = r6
        L_0x0078:
            r0.A09(r3)     // Catch:{ all -> 0x0168 }
        L_0x007b:
            X.4cD r3 = r3.A02     // Catch:{ all -> 0x0168 }
            goto L_0x005a
        L_0x007e:
            X.4cD r5 = X.AnonymousClass5WH.A00(r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0085
        L_0x0083:
            if (r2 != r12) goto L_0x007e
        L_0x0085:
            if (r5 == 0) goto L_0x0088
            goto L_0x0036
        L_0x0088:
            X.4cD r8 = r8.A04     // Catch:{ all -> 0x0168 }
            goto L_0x002d
        L_0x008b:
            X.5R6 r7 = r7.A0B()     // Catch:{ all -> 0x0168 }
            if (r7 == 0) goto L_0x0147
            X.5RP r0 = r7.A0W     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0097
            X.4cD r6 = r0.A05     // Catch:{ all -> 0x0168 }
        L_0x0097:
            r8 = r6
            goto L_0x0020
        L_0x0099:
            r10 = 2
            if (r1 == r10) goto L_0x0147
            if (r1 == r12) goto L_0x00a3
            r0 = 3
            if (r1 == r0) goto L_0x0147
            goto L_0x0162
        L_0x00a3:
            X.4cD r9 = r15.A03     // Catch:{ all -> 0x0168 }
            boolean r0 = r9.A08     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x00b8
            r0 = 427(0x1ab, float:5.98E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x0168 }
            X.I2E.A01(r0)     // Catch:{ all -> 0x0168 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0167
        L_0x00b8:
            r8 = 16
            X.4cD[] r0 = new X.C267794cD[r8]     // Catch:{ all -> 0x0168 }
            X.5Pl r7 = new X.5Pl     // Catch:{ all -> 0x0168 }
            r7.<init>(r0)     // Catch:{ all -> 0x0168 }
            X.4cD r0 = r9.A02     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0136
            r7.A09(r0)     // Catch:{ all -> 0x0168 }
        L_0x00c8:
            int r0 = r7.A00     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0147
            int r0 = r0 - r12
            java.lang.Object r9 = r7.A00(r0)     // Catch:{ all -> 0x0168 }
            X.4cD r9 = (X.C267794cD) r9     // Catch:{ all -> 0x0168 }
            int r0 = r9.A00     // Catch:{ all -> 0x0168 }
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0136
            r0 = r9
        L_0x00d9:
            int r1 = r0.A01     // Catch:{ all -> 0x0168 }
            r1 = r1 & r14
            if (r1 == 0) goto L_0x0131
            r13 = 0
            r6 = r0
            r5 = r13
        L_0x00e1:
            boolean r1 = r6 instanceof X.C268794e0     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x00f6
            X.4e0 r6 = (X.C268794e0) r6     // Catch:{ all -> 0x0168 }
            X.5cg r1 = r6.A00     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x0127
            X.5cg r0 = r6.A0I()     // Catch:{ all -> 0x0168 }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x0168 }
            if (r1 == r11) goto L_0x014a
            goto L_0x013a
        L_0x00f6:
            int r1 = r6.A01     // Catch:{ all -> 0x0168 }
            r1 = r1 & r14
            if (r1 == 0) goto L_0x0127
            boolean r1 = r6 instanceof X.C267944cV     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x0127
            r1 = r6
            X.4cV r1 = (X.C267944cV) r1     // Catch:{ all -> 0x0168 }
            X.4cD r3 = r1.A00     // Catch:{ all -> 0x0168 }
            r2 = 0
        L_0x0105:
            if (r3 == 0) goto L_0x012c
            int r1 = r3.A01     // Catch:{ all -> 0x0168 }
            r1 = r1 & r14
            if (r1 == 0) goto L_0x0124
            int r2 = r2 + 1
            if (r2 != r12) goto L_0x0112
            r6 = r3
            goto L_0x0124
        L_0x0112:
            if (r5 != 0) goto L_0x011b
            X.4cD[] r1 = new X.C267794cD[r8]     // Catch:{ all -> 0x0168 }
            X.5Pl r5 = new X.5Pl     // Catch:{ all -> 0x0168 }
            r5.<init>(r1)     // Catch:{ all -> 0x0168 }
        L_0x011b:
            if (r6 == 0) goto L_0x0121
            r5.A09(r6)     // Catch:{ all -> 0x0168 }
            r6 = r13
        L_0x0121:
            r5.A09(r3)     // Catch:{ all -> 0x0168 }
        L_0x0124:
            X.4cD r3 = r3.A02     // Catch:{ all -> 0x0168 }
            goto L_0x0105
        L_0x0127:
            X.4cD r6 = X.AnonymousClass5WH.A00(r5)     // Catch:{ all -> 0x0168 }
            goto L_0x012e
        L_0x012c:
            if (r2 != r12) goto L_0x0127
        L_0x012e:
            if (r6 == 0) goto L_0x0131
            goto L_0x00e1
        L_0x0131:
            X.4cD r0 = r0.A02     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0136
            goto L_0x00d9
        L_0x0136:
            X.AnonymousClass5WH.A06(r7, r9)     // Catch:{ all -> 0x0168 }
            goto L_0x00c8
        L_0x013a:
            if (r1 == r10) goto L_0x014a
            if (r1 == r12) goto L_0x014a
            r0 = 3
            if (r1 == r0) goto L_0x0147
            X.Wub r1 = new X.Wub     // Catch:{ all -> 0x0168 }
            r1.<init>()     // Catch:{ all -> 0x0168 }
            goto L_0x0167
        L_0x0147:
            X.5cg r1 = X.C288905cg.Inactive     // Catch:{ all -> 0x0168 }
            goto L_0x014c
        L_0x014a:
            X.5cg r1 = X.C288905cg.ActiveParent     // Catch:{ all -> 0x0168 }
        L_0x014c:
            X.5Qd r0 = X.C286375Wc.A00(r15)     // Catch:{ all -> 0x0168 }
            X.0vr r0 = r0.A01     // Catch:{ all -> 0x0168 }
            r0.A09(r15, r1)     // Catch:{ all -> 0x0168 }
            goto L_0x016d
        L_0x0156:
            r0 = 196(0xc4, float:2.75E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x0168 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0168 }
            r1.<init>(r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0167
        L_0x0162:
            X.Wub r1 = new X.Wub     // Catch:{ all -> 0x0168 }
            r1.<init>()     // Catch:{ all -> 0x0168 }
        L_0x0167:
            throw r1     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            X.C285195Qd.A01(r4)
            throw r0
        L_0x016d:
            X.C285195Qd.A01(r4)
        L_0x0170:
            X.5cg r0 = r15.A0I()
            int r1 = r0.ordinal()
            r3 = 1
            r0 = 0
            if (r1 == r0) goto L_0x0180
            r0 = 2
            if (r1 == r0) goto L_0x0180
        L_0x017f:
            return
        L_0x0180:
            X.0rm r2 = new X.0rm
            r2.<init>()
            r1 = 17
            X.IwR r0 = new X.IwR
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r15)
            X.AnonymousClass6GW.A00(r15, r0)
            java.lang.Object r0 = r2.A00
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "focusProperties"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x019d:
            X.5Wa r0 = (X.AnonymousClass5Wa) r0
            boolean r0 = r0.AkA()
            if (r0 != 0) goto L_0x017f
            X.4co r0 = X.AnonymousClass5WH.A05(r15)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5QZ r0 = r0.A0S
            r0.AHc(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268794e0.A0J():void");
    }

    public final /* synthetic */ Object Atk(AnonymousClass5VK r10) {
        C267794cD r1 = this.A03;
        if (!r1.A08) {
            I2E.A00("ModifierLocal accessed from an unattached node");
            throw AnonymousClass00P.createAndThrow();
        }
        C267794cD r7 = r1.A04;
        AnonymousClass5R6 A022 = AnonymousClass5WH.A02(this);
        if (A022 != null) {
            while (true) {
                if ((A022.A0W.A02.A00 & 32) != 0) {
                    while (r7 != null) {
                        if ((r7.A01 & 32) != 0) {
                            C267794cD r5 = r7;
                            C285045Pl r0 = null;
                            do {
                                if (r5 instanceof C268804e1) {
                                    C305506Ii Bi2 = ((C268804e1) r5).Bi2();
                                    if (Bi2.A01(r10)) {
                                        return Bi2.A00(r10);
                                    }
                                } else if ((r5.A01 & 32) != 0 && (r5 instanceof C267944cV)) {
                                    int i = 0;
                                    for (C267794cD r3 = ((C267944cV) r5).A00; r3 != null; r3 = r3.A02) {
                                        if ((r3.A01 & 32) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r5 = r3;
                                            } else {
                                                if (r0 == null) {
                                                    r0 = new C285045Pl(new C267794cD[16]);
                                                }
                                                if (r5 != null) {
                                                    r0.A09(r5);
                                                    r5 = null;
                                                }
                                                r0.A09(r3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                        continue;
                                    }
                                }
                                r5 = AnonymousClass5WH.A00(r0);
                                continue;
                            } while (r5 != null);
                        }
                        r7 = r7.A04;
                    }
                }
                A022 = A022.A0B();
                if (A022 == null) {
                    break;
                }
                AnonymousClass5RP r02 = A022.A0W;
                if (r02 != null) {
                    r7 = r02.A05;
                } else {
                    r7 = null;
                }
            }
        }
        return r10.A00.invoke();
    }

    public final /* synthetic */ C305506Ii Bi2() {
        return C52934Gf8.A00;
    }

    public final void DUu() {
        C288905cg A0I = A0I();
        A0J();
        if (A0I != A0I()) {
            C288925ci.A01(this);
        }
    }
}
