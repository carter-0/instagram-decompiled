package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.5R6  reason: invalid class name */
public final class AnonymousClass5R6 implements AnonymousClass5R7, AnonymousClass5R8, AnonymousClass5R9, C268094ck, AnonymousClass5RA {
    public static final Comparator A0Z = new AnonymousClass5RH();
    public static final C62320sa A0a = AnonymousClass5RE.A00;
    public static final AnonymousClass5RC A0b = new AnonymousClass5RB();
    public static final AnonymousClass5RG A0c = new AnonymousClass5RF();
    public int A00;
    public int A01;
    public AnonymousClass5RO A02;
    public C285045Pl A03;
    public Modifier A04;
    public Modifier A05;
    public AnonymousClass6IJ A06;
    public AnonymousClass5RD A07;
    public AnonymousClass5R6 A08;
    public C268054cg A09;
    public C268124co A0A;
    public AnonymousClass5RG A0B;
    public C268024cd A0C;
    public AnonymousClass5Q8 A0D;
    public C52849Gdi A0E;
    public Integer A0F;
    public 0sP A0G;
    public 0sP A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public int A0O;
    public GRF A0P;
    public AnonymousClass5R6 A0Q;
    public AnonymousClass5SV A0R;
    public Integer A0S;
    public boolean A0T;
    public final AnonymousClass5SI A0U;
    public final AnonymousClass5RI A0V;
    public final AnonymousClass5RP A0W;
    public final boolean A0X;
    public final C285045Pl A0Y;

    public final void A0M() {
        this.A0R = null;
        AnonymousClass5RJ.A00(this).Diy();
    }

    public final void A0T(int i, int i2) {
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    AnonymousClass5RI r2 = this.A0V;
                    C285045Pl r1 = r2.A00;
                    A05((AnonymousClass5R6) r1.A02[i3]);
                    r1.A00(i3);
                    r2.A01.invoke();
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            I2E.A00(002.A0c("count (", ") must be greater than 0", i2));
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final GRF A00(AnonymousClass5R6 r2) {
        GRF grf = r2.A0P;
        if (grf != null) {
            return grf;
        }
        GRF grf2 = new GRF(r2.A07, r2);
        r2.A0P = grf2;
        return grf2;
    }

    private final String A01(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        C285045Pl A0A2 = A0A();
        int i3 = A0A2.A00;
        if (i3 > 0) {
            Object[] objArr = A0A2.A02;
            int i4 = 0;
            do {
                sb.append(((AnonymousClass5R6) objArr[i4]).A01(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String obj = sb.toString();
        if (i != 0) {
            return obj;
        }
        String substring = obj.substring(0, obj.length() - 1);
        0qQ.A07(substring);
        return substring;
    }

    private final void A02() {
        AnonymousClass5R6 r0;
        if (this.A0O > 0) {
            this.A0N = true;
        }
        if (this.A0X && (r0 = this.A0Q) != null) {
            r0.A02();
        }
    }

    private final void A03() {
        C267794cD r1 = this.A0W.A05;
        C267794cD r2 = r1;
        while (r1 != null) {
            if (r1.A08) {
                r1.A0A();
            }
            r1 = r1.A04;
        }
        for (C267794cD r12 = r2; r12 != null; r12 = r12.A04) {
            if (r12.A08) {
                r12.A0C();
            }
        }
        while (r2 != null) {
            if (r2.A08) {
                r2.A09();
            }
            r2 = r2.A04;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
        if (r15 >= r6) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r11 == null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r13 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r14.A07.A05 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        r16 = !r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f3, code lost:
        r9 = "structuralUpdate requires a non-null tail";
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(androidx.compose.ui.Modifier r18) {
        /*
            r17 = this;
            r3 = r17
            r1 = r18
            r3.A04 = r1
            X.5RP r14 = r3.A0W
            X.4cD r0 = r14.A02
            X.5VV r4 = X.AnonymousClass5VU.A00
            if (r0 == r4) goto L_0x0157
            r0.A04 = r4
            r4.A02 = r0
            X.5Pl r11 = r14.A01
            r5 = 0
            if (r11 == 0) goto L_0x0067
            int r6 = r11.A00
        L_0x0019:
            X.5Pl r12 = r14.A00
            r10 = 16
            if (r12 != 0) goto L_0x0026
            X.5QQ[] r0 = new X.AnonymousClass5QQ[r10]
            X.5Pl r12 = new X.5Pl
            r12.<init>(r0)
        L_0x0026:
            int r0 = r12.A00
            if (r0 >= r10) goto L_0x002c
            r0 = 16
        L_0x002c:
            androidx.compose.ui.Modifier[] r0 = new androidx.compose.ui.Modifier[r0]
            X.5Pl r7 = new X.5Pl
            r7.<init>(r0)
            r7.A09(r1)
            r2 = 0
        L_0x0037:
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0069
            int r0 = r0 + -1
            java.lang.Object r1 = r7.A00(r0)
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            boolean r0 = r1 instanceof X.C285255Ql
            if (r0 == 0) goto L_0x0054
            X.5Ql r1 = (X.C285255Ql) r1
            androidx.compose.ui.Modifier r0 = r1.A00
            r7.A09(r0)
            androidx.compose.ui.Modifier r0 = r1.A01
            r7.A09(r0)
            goto L_0x0037
        L_0x0054:
            boolean r0 = r1 instanceof X.AnonymousClass5QQ
            if (r0 == 0) goto L_0x005c
            r12.A09(r1)
            goto L_0x0037
        L_0x005c:
            if (r2 != 0) goto L_0x0063
            X.9Kw r2 = new X.9Kw
            r2.<init>(r12, r5)
        L_0x0063:
            r1.AB4(r2)
            goto L_0x0037
        L_0x0067:
            r6 = 0
            goto L_0x0019
        L_0x0069:
            int r8 = r12.A00
            r2 = 0
            java.lang.String r9 = "expected prior modifier list to be non-empty"
            if (r8 != r6) goto L_0x00b0
            X.4cD r13 = r4.A02
            r15 = 0
        L_0x0073:
            if (r13 == 0) goto L_0x009f
            if (r15 >= r6) goto L_0x009f
            if (r11 == 0) goto L_0x00f5
            java.lang.Object[] r0 = r11.A02
            r8 = r0[r15]
            X.5QQ r8 = (X.AnonymousClass5QQ) r8
            java.lang.Object[] r0 = r12.A02
            r7 = r0[r15]
            X.5QQ r7 = (X.AnonymousClass5QQ) r7
            boolean r0 = X.0qQ.A0K(r8, r7)
            if (r0 != 0) goto L_0x0098
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r0 = r7.getClass()
            if (r1 != r0) goto L_0x009d
            X.AnonymousClass5RP.A03(r8, r7, r13)
        L_0x0098:
            X.4cD r13 = r13.A02
            int r15 = r15 + 1
            goto L_0x0073
        L_0x009d:
            X.4cD r13 = r13.A04
        L_0x009f:
            if (r15 >= r6) goto L_0x011b
            if (r11 == 0) goto L_0x00f5
            if (r13 == 0) goto L_0x00f3
            X.5R6 r0 = r14.A07
            androidx.compose.ui.Modifier r1 = r0.A05
            r0 = 0
            if (r1 == 0) goto L_0x00ad
            r0 = 1
        L_0x00ad:
            r16 = r0 ^ 1
            goto L_0x0106
        L_0x00b0:
            X.5R6 r7 = r14.A07
            androidx.compose.ui.Modifier r0 = r7.A05
            r1 = 0
            if (r0 == 0) goto L_0x00dd
            r1 = 1
            if (r6 != 0) goto L_0x00dd
            r0 = r4
        L_0x00bb:
            int r1 = r12.A00
            if (r5 >= r1) goto L_0x00cc
            java.lang.Object[] r1 = r12.A02
            r1 = r1[r5]
            X.5QQ r1 = (X.AnonymousClass5QQ) r1
            X.4cD r0 = X.AnonymousClass5RP.A00(r1, r0)
            int r5 = r5 + 1
            goto L_0x00bb
        L_0x00cc:
            X.4cD r0 = r14.A05
            X.4cD r5 = r0.A04
            r1 = 0
        L_0x00d1:
            if (r5 == 0) goto L_0x0109
            if (r5 == r4) goto L_0x0109
            int r0 = r5.A01
            r1 = r1 | r0
            r5.A00 = r1
            X.4cD r5 = r5.A04
            goto L_0x00d1
        L_0x00dd:
            if (r8 != 0) goto L_0x00f9
            if (r11 == 0) goto L_0x00f5
            X.4cD r6 = r4.A02
            r1 = 0
        L_0x00e4:
            if (r6 == 0) goto L_0x010b
            int r0 = r11.A00
            if (r1 >= r0) goto L_0x010b
            X.4cD r0 = X.AnonymousClass5RP.A01(r6)
            X.4cD r6 = r0.A02
            int r1 = r1 + 1
            goto L_0x00e4
        L_0x00f3:
            java.lang.String r9 = "structuralUpdate requires a non-null tail"
        L_0x00f5:
            X.I2E.A02(r9)
            goto L_0x015f
        L_0x00f9:
            if (r11 != 0) goto L_0x0102
            X.5QQ[] r0 = new X.AnonymousClass5QQ[r10]
            X.5Pl r11 = new X.5Pl
            r11.<init>(r0)
        L_0x0102:
            r16 = r1 ^ 1
            r13 = r4
            r15 = r5
        L_0x0106:
            X.AnonymousClass5RP.A02(r11, r12, r13, r14, r15, r16)
        L_0x0109:
            r5 = 1
            goto L_0x011b
        L_0x010b:
            X.4e4 r1 = r14.A06
            X.5R6 r0 = r7.A0B()
            if (r0 == 0) goto L_0x0155
            X.5RP r0 = r0.A0W
            X.4e4 r0 = r0.A06
        L_0x0117:
            r1.A07 = r0
            r14.A04 = r1
        L_0x011b:
            r14.A01 = r12
            if (r11 == 0) goto L_0x0123
            r11.A01()
            r2 = r11
        L_0x0123:
            r14.A00 = r2
            X.4cD r2 = r4.A02
            if (r2 != 0) goto L_0x012b
            X.4cD r2 = r14.A05
        L_0x012b:
            r1 = 0
            r2.A04 = r1
            r4.A02 = r1
            r0 = -1
            r4.A00 = r0
            r4.A07(r1)
            if (r2 == r4) goto L_0x015a
            r14.A02 = r2
            if (r5 == 0) goto L_0x013f
            r14.A06()
        L_0x013f:
            X.5SI r0 = r3.A0U
            r0.A00()
            X.5R6 r0 = r3.A08
            if (r0 != 0) goto L_0x0154
            r1 = 512(0x200, float:7.175E-43)
            X.4cD r0 = r14.A02
            int r0 = r0.A00
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0154
            r3.A06(r3)
        L_0x0154:
            return
        L_0x0155:
            r0 = r2
            goto L_0x0117
        L_0x0157:
            java.lang.String r0 = "padChain called on already padded chain"
            goto L_0x015c
        L_0x015a:
            java.lang.String r0 = "trimChain did not update the head"
        L_0x015c:
            X.I2E.A01(r0)
        L_0x015f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R6.A04(androidx.compose.ui.Modifier):void");
    }

    private final void A05(AnonymousClass5R6 r6) {
        if (r6.A0U.A00 > 0) {
            AnonymousClass5SI r1 = this.A0U;
            r1.A01(r1.A00 - 1);
        }
        if (this.A0A != null) {
            r6.A0I();
        }
        r6.A0Q = null;
        r6.A0W.A04.A07 = null;
        if (r6.A0X) {
            this.A0O--;
            C285045Pl r0 = r6.A0V.A00;
            int i = r0.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r0.A02;
                do {
                    ((AnonymousClass5R6) objArr[i2]).A0W.A04.A07 = null;
                    i2++;
                } while (i2 < i);
            }
        }
        A02();
        A0O();
    }

    private final void A06(AnonymousClass5R6 r4) {
        if (!0qQ.A0K(r4, this.A08)) {
            this.A08 = r4;
            if (r4 != null) {
                AnonymousClass5SI r1 = this.A0U;
                if (r1.A05 == null) {
                    r1.A05 = new C290225ey(r1);
                }
                AnonymousClass5RP r0 = this.A0W;
                C268054cg r2 = r0.A04;
                C268054cg r12 = r0.A06.A06;
                while (!0qQ.A0K(r2, r12) && r2 != null) {
                    r2.A0b();
                    r2 = r2.A06;
                }
            }
            A0L();
        }
    }

    public static final void A07(AnonymousClass5R6 r5) {
        r5.A0S = r5.A0F;
        r5.A0F = AnonymousClass05K.A0C;
        C285045Pl A0A2 = r5.A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                AnonymousClass5R6 r2 = (AnonymousClass5R6) objArr[i2];
                if (r2.A0F == AnonymousClass05K.A01) {
                    A07(r2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A08(AnonymousClass5R6 r5) {
        AnonymousClass5SI r4 = r5.A0U;
        Integer num = r4.A06;
        if (num.intValue() != 4) {
            throw new IllegalStateException(002.A0R("Unexpected state ", C62952Kp4.A00(num)));
        } else if (r4.A0G) {
            r5.A0Z(true, true, true);
        } else {
            if (r4.A0E) {
                r5.A0X(true);
            }
            if (r4.A0H) {
                r5.A0a(true, true, true);
            } else if (r4.A0A) {
                r5.A0Y(true);
            }
        }
    }

    public final C285045Pl A09() {
        if (this.A0T) {
            C285045Pl r2 = this.A0Y;
            r2.A01();
            r2.A06(A0A(), r2.A00);
            r2.A07(A0Z);
            this.A0T = false;
        }
        return this.A0Y;
    }

    public final AnonymousClass5R6 A0B() {
        AnonymousClass5R6 r2 = this.A0Q;
        while (r2 != null && r2.A0X) {
            r2 = r2.A0Q;
        }
        return r2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    public final AnonymousClass5SV A0C() {
        if (this.A0A == null || this.A0L) {
            return null;
        }
        if ((this.A0W.A02.A00 & 8) == 0 || this.A0R != null) {
            return this.A0R;
        }
        ? obj = new Object();
        obj.A00 = new AnonymousClass5SV();
        AnonymousClass5TD r2 = ((AndroidComposeView) AnonymousClass5RJ.A00(this)).A0b;
        r2.A00(this, new AnonymousClass9M0(4, obj, this), r2.A07);
        AnonymousClass5SV r0 = (AnonymousClass5SV) obj.A00;
        this.A0R = r0;
        return r0;
    }

    public final Boolean A0D() {
        C290225ey r0 = this.A0U.A05;
        if (r0 != null) {
            return Boolean.valueOf(r0.A09);
        }
        return null;
    }

    public final List A0E() {
        C290225ey r8 = this.A0U.A05;
        0qQ.A0A(r8);
        AnonymousClass5R6 r9 = r8.A0J.A0I;
        r9.A0F();
        boolean z = r8.A08;
        C285045Pl r7 = r8.A0H;
        if (z) {
            C285045Pl A0A2 = r9.A0A();
            int i = A0A2.A00;
            if (i > 0) {
                Object[] objArr = A0A2.A02;
                int i2 = 0;
                do {
                    int i3 = r7.A00;
                    C290225ey r1 = ((AnonymousClass5R6) objArr[i2]).A0U.A05;
                    if (i3 <= i2) {
                        0qQ.A0A(r1);
                        r7.A09(r1);
                    } else {
                        0qQ.A0A(r1);
                        r7.A02[i2] = r1;
                    }
                    i2++;
                } while (i2 < i);
            }
            r7.A03(r9.A0F().size(), r7.A00);
            r8.A08 = false;
        }
        List list = r7.A01;
        if (list != null) {
            return list;
        }
        C289025ct r0 = new C289025ct(r7);
        r7.A01 = r0;
        return r0;
    }

    public final List A0G() {
        C285045Pl r1 = this.A0V.A00;
        List list = r1.A01;
        if (list != null) {
            return list;
        }
        C289025ct r0 = new C289025ct(r1);
        r1.A01 = r0;
        return r0;
    }

    public final void A0H() {
        this.A0S = this.A0F;
        Integer num = AnonymousClass05K.A0C;
        this.A0F = num;
        C285045Pl A0A2 = A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                AnonymousClass5R6 r1 = (AnonymousClass5R6) objArr[i2];
                if (r1.A0F != num) {
                    r1.A0H();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void A0I() {
        AnonymousClass5SM r0;
        C268124co r8 = this.A0A;
        String str = null;
        if (r8 == null) {
            AnonymousClass5R6 A0B2 = A0B();
            if (A0B2 != null) {
                str = A0B2.A01(0);
            }
            I2E.A02(002.A0R("Cannot detach node that is already detached!  Tree: ", str));
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass5R6 A0B3 = A0B();
        if (A0B3 != null) {
            A0B3.A0J();
            A0B3.A0L();
            AnonymousClass5SI r2 = this.A0U;
            AnonymousClass5SJ r02 = r2.A0J;
            Integer num = AnonymousClass05K.A0C;
            r02.A09 = num;
            C290225ey r03 = r2.A05;
            if (r03 != null) {
                r03.A05 = num;
            }
        }
        AnonymousClass5SI r5 = this.A0U;
        AnonymousClass5SJ r4 = r5.A0J;
        AnonymousClass5SM r04 = r4.A0O;
        r04.A01 = true;
        r04.A06 = false;
        r04.A02 = false;
        r04.A05 = false;
        r04.A04 = false;
        r04.A03 = false;
        r04.A00 = null;
        C290225ey r05 = r5.A05;
        if (!(r05 == null || (r0 = r05.A0I) == null)) {
            r0.A01 = true;
            r0.A06 = false;
            r0.A02 = false;
            r0.A05 = false;
            r0.A04 = false;
            r0.A03 = false;
            r0.A00 = null;
        }
        0sP r06 = this.A0H;
        if (r06 != null) {
            r06.invoke(r8);
        }
        AnonymousClass5RP r1 = this.A0W;
        if ((r1.A02.A00 & 8) != 0) {
            A0M();
        }
        C267794cD r12 = r1.A05;
        while (r12 != null) {
            if (r12.A08) {
                r12.A0C();
            }
            r12 = r12.A04;
        }
        this.A0J = true;
        C285045Pl r07 = this.A0V.A00;
        int i = r07.A00;
        if (i > 0) {
            Object[] objArr = r07.A02;
            int i2 = 0;
            do {
                ((AnonymousClass5R6) objArr[i2]).A0I();
                i2++;
            } while (i2 < i);
        }
        this.A0J = false;
        for (C267794cD r10 = r12; r10 != null; r10 = r10.A04) {
            if (r10.A08) {
                r10.A09();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) r8;
        AnonymousClass5TN r22 = androidComposeView.A0a;
        AnonymousClass5TO r13 = r22.A04;
        r13.A00.A00(this);
        r13.A01.A00(this);
        r22.A06.A01.A0B(this);
        androidComposeView.A09 = true;
        this.A0A = null;
        A06((AnonymousClass5R6) null);
        this.A00 = 0;
        r4.A03 = Integer.MAX_VALUE;
        r4.A04 = Integer.MAX_VALUE;
        r4.A0E = false;
        C290225ey r08 = r5.A05;
        if (r08 != null) {
            r08.A00 = Integer.MAX_VALUE;
            r08.A01 = Integer.MAX_VALUE;
            r08.A09 = false;
        }
    }

    public final void A0J() {
        if (this.A0K) {
            AnonymousClass5RP r0 = this.A0W;
            C268054cg r3 = r0.A06;
            C268054cg r2 = r0.A04.A07;
            this.A09 = null;
            while (true) {
                if (0qQ.A0K(r3, r2)) {
                    break;
                } else if (r3 == null) {
                    r3 = null;
                } else if (r3.A08 != null) {
                    this.A09 = r3;
                    break;
                } else {
                    r3 = r3.A07;
                }
            }
        }
        C268054cg r1 = this.A09;
        if (r1 == null) {
            AnonymousClass5R6 A0B2 = A0B();
            if (A0B2 != null) {
                A0B2.A0J();
            }
        } else if (r1.A08 != null) {
            r1.A0c();
        } else {
            I2E.A02("layer was not set");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0K() {
        AnonymousClass5RP r0 = this.A0W;
        C268834e4 r1 = r0.A06;
        for (C268054cg r2 = r0.A04; r2 != r1; r2 = r2.A06) {
            0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C289195dB r02 = r2.A08;
            if (r02 != null) {
                r02.invalidate();
            }
        }
        C289195dB r03 = r1.A08;
        if (r03 != null) {
            r03.invalidate();
        }
    }

    public final void A0L() {
        if (this.A08 != null) {
            A0Z(false, true, true);
        } else {
            A0a(false, true, true);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0N() {
        AnonymousClass5R6 A0B2;
        if (this.A0F == AnonymousClass05K.A0C) {
            A07(this);
        }
        C290225ey r6 = this.A0U.A05;
        0qQ.A0A(r6);
        try {
            r6.A0E = true;
            if (!r6.A0D) {
                I2E.A01("replace() called on item that was not placed");
                throw AnonymousClass00P.createAndThrow();
            }
            r6.A0B = false;
            boolean z = r6.A09;
            long j = r6.A02;
            C290225ey.A02(r6.A03, r6, r6.A07, j);
            if (z && !r6.A0B && (A0B2 = r6.A0J.A0I.A0B()) != null) {
                A0B2.A0X(false);
            }
            r6.A0E = false;
        } catch (Throwable th) {
            r6.A0E = false;
            throw th;
        }
    }

    public final void A0O() {
        if (this.A0X) {
            AnonymousClass5R6 A0B2 = A0B();
            if (A0B2 != null) {
                A0B2.A0O();
                return;
            }
            return;
        }
        this.A0T = true;
    }

    public final void A0P() {
        AnonymousClass5RI r3 = this.A0V;
        C285045Pl r2 = r3.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 < i) {
                A05((AnonymousClass5R6) r2.A02[i]);
            } else {
                r2.A01();
                r3.A01.invoke();
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0Q() {
        AnonymousClass5R6 A0B2;
        if (this.A0F == AnonymousClass05K.A0C) {
            A07(this);
        }
        AnonymousClass5SJ r3 = this.A0U.A0J;
        try {
            r3.A0L = true;
            if (!r3.A0K) {
                I2E.A01("replace called on unplaced item");
                throw AnonymousClass00P.createAndThrow();
            }
            boolean z = r3.A0E;
            long j = r3.A05;
            float f = r3.A00;
            AnonymousClass5SJ.A02(r3.A07, r3, r3.A0B, f, j);
            if (z && !r3.A0I && (A0B2 = r3.A0S.A0I.A0B()) != null) {
                A0B2.A0Y(false);
            }
            r3.A0L = false;
        } catch (Throwable th) {
            r3.A0L = false;
            throw th;
        }
    }

    public final void A0S() {
        if (this.A0O > 0 && this.A0N) {
            int i = 0;
            this.A0N = false;
            C285045Pl r4 = this.A03;
            if (r4 == null) {
                r4 = new C285045Pl(new AnonymousClass5R6[16]);
                this.A03 = r4;
            }
            r4.A01();
            C285045Pl r0 = this.A0V.A00;
            int i2 = r0.A00;
            if (i2 > 0) {
                Object[] objArr = r0.A02;
                do {
                    AnonymousClass5R6 r1 = (AnonymousClass5R6) objArr[i];
                    if (r1.A0X) {
                        r4.A06(r1.A0A(), r4.A00);
                    } else {
                        r4.A09(r1);
                    }
                    i++;
                } while (i < i2);
            }
            AnonymousClass5SI r2 = this.A0U;
            r2.A0J.A0D = true;
            C290225ey r02 = r2.A05;
            if (r02 != null) {
                r02.A08 = true;
            }
        }
    }

    public final void A0U(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i;
                if (i > i2) {
                    i5 = i + i4;
                }
                int i6 = i2 + i4;
                if (i <= i2) {
                    i6 = (i2 + i3) - 2;
                }
                AnonymousClass5RI r0 = this.A0V;
                C285045Pl r2 = r0.A00;
                Object A002 = r2.A00(i5);
                C62320sa r02 = r0.A01;
                r02.invoke();
                r2.A04(i6, A002);
                r02.invoke();
            }
            A0O();
            A02();
            A0L();
        }
    }

    public final void A0V(AnonymousClass5R6 r6, int i) {
        StringBuilder sb;
        boolean z = false;
        if (r6.A0Q == null) {
            z = true;
        }
        String str = null;
        if (!z) {
            sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(r6);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(A01(0));
            sb.append(" Other tree: ");
            AnonymousClass5R6 r1 = r6.A0Q;
            if (r1 != null) {
                str = r1.A01(0);
            }
        } else if (r6.A0A == null) {
            r6.A0Q = this;
            AnonymousClass5RI r12 = this.A0V;
            r12.A00.A04(i, r6);
            r12.A01.invoke();
            A0O();
            if (r6.A0X) {
                this.A0O++;
            }
            A02();
            C268124co r0 = this.A0A;
            if (r0 != null) {
                r6.A0W(r0);
            }
            if (r6.A0U.A00 > 0) {
                AnonymousClass5SI r13 = this.A0U;
                r13.A01(r13.A00 + 1);
                return;
            }
            return;
        } else {
            sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(r6);
            sb.append(" because it already has an owner. This tree: ");
            sb.append(A01(0));
            sb.append(" Other tree: ");
            str = r6.A01(0);
        }
        sb.append(str);
        I2E.A01(sb.toString());
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0W(C268124co r8) {
        StringBuilder sb;
        String A012;
        C268834e4 r1;
        int i;
        AnonymousClass5R6 r0;
        C268124co r12;
        int i2 = 0;
        if (this.A0A == null) {
            A012 = null;
            AnonymousClass5R6 r13 = this.A0Q;
            if (r13 == null || 0qQ.A0K(r13.A0A, r8)) {
                AnonymousClass5R6 A0B2 = A0B();
                if (A0B2 == null) {
                    AnonymousClass5SI r2 = this.A0U;
                    r2.A0J.A0E = true;
                    C290225ey r14 = r2.A05;
                    if (r14 != null) {
                        r14.A09 = true;
                    }
                }
                AnonymousClass5RP r3 = this.A0W;
                C268054cg r22 = r3.A04;
                if (A0B2 != null) {
                    r1 = A0B2.A0W.A06;
                } else {
                    r1 = null;
                }
                r22.A07 = r1;
                this.A0A = r8;
                if (A0B2 != null) {
                    i = A0B2.A00;
                } else {
                    i = -1;
                }
                this.A00 = i + 1;
                Modifier modifier = this.A05;
                if (modifier != null) {
                    A04(modifier);
                }
                this.A05 = null;
                if ((r3.A02.A00 & 8) != 0) {
                    A0M();
                }
                AnonymousClass5R6 r02 = this.A0Q;
                if (r02 == null || (r0 = r02.A08) == null) {
                    r0 = this.A08;
                }
                A06(r0);
                if (this.A08 == null && (512 & r3.A02.A00) != 0) {
                    A06(this);
                }
                if (!this.A0L) {
                    for (C267794cD r03 = r3.A02; r03 != null; r03 = r03.A02) {
                        r03.A08();
                    }
                }
                C285045Pl r04 = this.A0V.A00;
                int i3 = r04.A00;
                if (i3 > 0) {
                    Object[] objArr = r04.A02;
                    do {
                        ((AnonymousClass5R6) objArr[i2]).A0W(r8);
                        i2++;
                    } while (i2 < i3);
                }
                if (!this.A0L) {
                    r3.A05();
                }
                A0L();
                if (A0B2 != null) {
                    A0B2.A0L();
                }
                C268054cg r23 = r3.A04;
                C268054cg r15 = r3.A06.A06;
                while (!0qQ.A0K(r23, r15) && r23 != null) {
                    r23.A0o(r23.A09, true);
                    C289195dB r05 = r23.A08;
                    if (r05 != null) {
                        r05.invalidate();
                    }
                    r23 = r23.A06;
                }
                0sP r06 = this.A0G;
                if (r06 != null) {
                    r06.invoke(r8);
                }
                this.A0U.A00();
                if (!this.A0L) {
                    C267794cD r4 = r3.A02;
                    if ((7168 & r4.A00) != 0) {
                        do {
                            boolean z = true;
                            boolean z2 = false;
                            if ((1024 & r4.A01) != 0) {
                                z2 = true;
                            }
                            boolean z3 = false;
                            if ((2048 & r4.A01) != 0) {
                                z3 = true;
                            }
                            boolean z4 = z2 | z3;
                            if ((4096 & r4.A01) == 0) {
                                z = false;
                            }
                            if (z4 || z) {
                                AnonymousClass5WB.A03(r4);
                            }
                            r4 = r4.A02;
                        } while (r4 != null);
                        return;
                    }
                    return;
                }
                return;
            }
            sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(r8);
            sb.append(") than the parent's owner(");
            AnonymousClass5R6 A0B3 = A0B();
            if (A0B3 != null) {
                r12 = A0B3.A0A;
            } else {
                r12 = null;
            }
            sb.append(r12);
            sb.append("). This tree: ");
            sb.append(A01(0));
            sb.append(" Parent tree: ");
            AnonymousClass5R6 r16 = this.A0Q;
            if (r16 != null) {
                A012 = r16.A01(0);
            }
        } else {
            sb = new StringBuilder();
            sb.append("Cannot attach ");
            sb.append(this);
            sb.append(" as it already is attached.  Tree: ");
            A012 = A01(0);
        }
        sb.append(A012);
        I2E.A01(sb.toString());
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r1.A0E != true) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (r1.A0H != true) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.A0X
            if (r0 != 0) goto L_0x0034
            X.4co r4 = r9.A0A
            if (r4 == 0) goto L_0x0034
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            r3 = 0
            X.5TN r5 = r4.A0a
            X.5SI r8 = r9.A0U
            java.lang.Integer r0 = r8.A06
            int r1 = r0.intValue()
            r6 = 1
            r2 = 0
            if (r1 == r6) goto L_0x0034
            if (r1 == r2) goto L_0x002a
            r0 = 3
            if (r1 == r0) goto L_0x0034
            r0 = 2
            if (r1 == r0) goto L_0x002a
            r0 = 4
            if (r1 == r0) goto L_0x002a
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x002a:
            boolean r0 = r8.A0G
            if (r0 != 0) goto L_0x0032
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x0035
        L_0x0032:
            if (r10 != 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            r8.A0E = r6
            r8.A0F = r6
            r8.A0A = r6
            r8.A0B = r6
            boolean r0 = r9.A0L
            if (r0 != 0) goto L_0x0034
            X.5R6 r7 = r9.A0B()
            java.lang.Boolean r1 = r9.A0D()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005f
            if (r7 == 0) goto L_0x007f
            X.5SI r1 = r7.A0U
            boolean r0 = r1.A0G
            if (r0 == r6) goto L_0x005f
            boolean r0 = r1.A0E
            if (r0 != r6) goto L_0x007f
        L_0x005f:
            X.5SJ r0 = r8.A0J
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0071
            if (r7 == 0) goto L_0x0079
            X.5SI r1 = r7.A0U
            boolean r0 = r1.A0A
            if (r0 == r6) goto L_0x0071
            boolean r0 = r1.A0H
            if (r0 != r6) goto L_0x0079
        L_0x0071:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0034
            androidx.compose.ui.platform.AndroidComposeView.A0B(r3, r4)
            return
        L_0x0079:
            X.5TO r0 = r5.A04
            r0.A00(r9, r2)
            goto L_0x0071
        L_0x007f:
            X.5TO r0 = r5.A04
            r0.A00(r9, r6)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R6.A0X(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r1.A0H != true) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0X
            if (r0 != 0) goto L_0x0036
            X.4co r4 = r8.A0A
            if (r4 == 0) goto L_0x0036
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            r3 = 0
            X.5TN r5 = r4.A0a
            X.5SI r7 = r8.A0U
            java.lang.Integer r0 = r7.A06
            int r1 = r0.intValue()
            r6 = 1
            r2 = 0
            if (r1 == r6) goto L_0x0036
            if (r1 == r2) goto L_0x0036
            r0 = 3
            if (r1 == r0) goto L_0x0036
            r0 = 2
            if (r1 == r0) goto L_0x0036
            r0 = 4
            if (r1 != r0) goto L_0x0063
            if (r9 != 0) goto L_0x0037
            X.5SJ r0 = r7.A0J
            boolean r1 = r0.A0E
            boolean r0 = r0.A0F
            if (r1 != r0) goto L_0x0037
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x0036
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            return
        L_0x0037:
            r7.A0A = r6
            r7.A0B = r6
            boolean r0 = r8.A0L
            if (r0 != 0) goto L_0x0036
            X.5SJ r0 = r7.A0J
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x0036
            X.5R6 r0 = r8.A0B()
            if (r0 == 0) goto L_0x005d
            X.5SI r1 = r0.A0U
            boolean r0 = r1.A0A
            if (r0 == r6) goto L_0x0055
            boolean r0 = r1.A0H
            if (r0 != r6) goto L_0x005d
        L_0x0055:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0036
            androidx.compose.ui.platform.AndroidComposeView.A0B(r3, r4)
            return
        L_0x005d:
            X.5TO r0 = r5.A04
            r0.A00(r8, r2)
            goto L_0x0055
        L_0x0063:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R6.A0Y(boolean):void");
    }

    public final void A0Z(boolean z, boolean z2, boolean z3) {
        AnonymousClass5R6 r1;
        AnonymousClass5R6 A0B2;
        AnonymousClass5R6 A0B3;
        if (this.A08 != null) {
            C268124co r12 = this.A0A;
            if (r12 != null && !this.A0J && !this.A0X) {
                AndroidComposeView androidComposeView = (AndroidComposeView) r12;
                AnonymousClass5TN r5 = androidComposeView.A0a;
                AnonymousClass5SI r2 = this.A0U;
                int intValue = r2.A06.intValue();
                if (intValue != 1) {
                    if (intValue == 0 || intValue == 3 || intValue == 2) {
                        r5.A03.A09(new AnonymousClass5TU(this, true, z));
                    } else if (intValue != 4) {
                        throw new RuntimeException();
                    } else if (!r2.A0G || z) {
                        r2.A0G = true;
                        r2.A0H = true;
                        if (!this.A0L) {
                            if ((0qQ.A0K(A0D(), true) || (r2.A0G && AnonymousClass5TN.A07(this))) && ((A0B3 = A0B()) == null || !A0B3.A0U.A0G)) {
                                r5.A04.A00(this, true);
                            } else if ((r2.A0J.A0E || (r2.A0H && AnonymousClass5TN.A06(this))) && ((A0B2 = A0B()) == null || !A0B2.A0U.A0H)) {
                                r5.A04.A00(this, false);
                            }
                            if (!r5.A01 && z2) {
                                AndroidComposeView.A0B(this, androidComposeView);
                            }
                        }
                    }
                }
                if (z3) {
                    C290225ey r0 = r2.A05;
                    0qQ.A0A(r0);
                    AnonymousClass5R6 r02 = r0.A0J.A0I;
                    AnonymousClass5R6 A0B4 = r02.A0B();
                    Integer num = r02.A0F;
                    if (A0B4 != null && num != AnonymousClass05K.A0C) {
                        do {
                            r1 = A0B4;
                            if (A0B4.A0F != num || (A0B4 = A0B4.A0B()) == null) {
                                int intValue2 = num.intValue();
                            }
                            r1 = A0B4;
                            break;
                        } while ((A0B4 = A0B4.A0B()) == null);
                        int intValue22 = num.intValue();
                        if (intValue22 != 0) {
                            if (intValue22 != 1) {
                                throw new IllegalStateException("Intrinsics isn't used by the parent");
                            } else if (r1.A08 != null) {
                                r1.A0X(z);
                            } else {
                                r1.A0Y(z);
                            }
                        } else if (r1.A08 != null) {
                            r1.A0Z(z, true, true);
                        } else {
                            r1.A0a(z, true, true);
                        }
                    }
                }
            }
        } else {
            I2E.A01("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0a(boolean z, boolean z2, boolean z3) {
        C268124co r1;
        AnonymousClass5R6 r2;
        if (!this.A0J && !this.A0X && (r1 = this.A0A) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r1;
            if (androidComposeView.A0a.A0C(this, z) && z2) {
                AndroidComposeView.A0B(this, androidComposeView);
            }
            if (z3) {
                AnonymousClass5R6 r0 = this.A0U.A0J.A0S.A0I;
                AnonymousClass5R6 A0B2 = r0.A0B();
                Integer num = r0.A0F;
                if (A0B2 != null && num != AnonymousClass05K.A0C) {
                    do {
                        r2 = A0B2;
                        if (A0B2.A0F != num || (A0B2 = A0B2.A0B()) == null) {
                            int intValue = num.intValue();
                        }
                        r2 = A0B2;
                        break;
                    } while ((A0B2 = A0B2.A0B()) == null);
                    int intValue2 = num.intValue();
                    if (intValue2 == 0) {
                        r2.A0a(z, true, true);
                    } else if (intValue2 == 1) {
                        r2.A0Y(z);
                    } else {
                        throw new IllegalStateException("Intrinsics isn't used by the parent");
                    }
                }
            }
        }
    }

    public final void AWL() {
        boolean z;
        if (this.A08 != null) {
            z = true;
            A0Z(false, false, true);
        } else {
            z = true;
            A0a(false, false, true);
        }
        AnonymousClass5SJ r1 = this.A0U.A0J;
        if (r1.A0H) {
            long j = r1.A04;
            C268124co r0 = this.A0A;
            if (r0 != null) {
                r0.Co1(this, j);
                return;
            }
            return;
        }
        C268124co r02 = this.A0A;
        if (r02 != null) {
            r02.Co0(z);
        }
    }

    public final boolean CeH() {
        if (this.A0A != null) {
            return true;
        }
        return false;
    }

    public final void D7s() {
        C52849Gdi gdi = this.A0E;
        if (gdi != null) {
            gdi.D7s();
        }
        AnonymousClass6IJ r1 = this.A06;
        if (r1 != null) {
            AnonymousClass6IJ.A03(r1, true);
        }
        this.A0L = true;
        A03();
        if (this.A0A != null) {
            A0M();
        }
    }

    public final void Dcz() {
        C52849Gdi gdi = this.A0E;
        if (gdi != null) {
            gdi.Dcz();
        }
        AnonymousClass6IJ r0 = this.A06;
        if (r0 != null) {
            r0.Dcz();
        }
        AnonymousClass5RP r02 = this.A0W;
        C268054cg r2 = r02.A04;
        C268054cg r1 = r02.A06.A06;
        while (!0qQ.A0K(r2, r1) && r2 != null) {
            r2.A0C = true;
            r2.A0I.invoke();
            r2.A0g();
            r2 = r2.A06;
        }
    }

    public final void Dfm() {
        if (this.A0A != null) {
            C52849Gdi gdi = this.A0E;
            if (gdi != null) {
                gdi.Dfm();
            }
            AnonymousClass6IJ r1 = this.A06;
            if (r1 != null) {
                AnonymousClass6IJ.A03(r1, false);
            }
            if (this.A0L) {
                this.A0L = false;
                A0M();
            } else {
                A03();
            }
            this.A01 = AnonymousClass5R5.A00.addAndGet(1);
            AnonymousClass5RP r12 = this.A0W;
            for (C267794cD r0 = r12.A02; r0 != null; r0 = r0.A02) {
                r0.A08();
            }
            r12.A05();
            A08(this);
            return;
        }
        I2E.A00("onReuse is only expected on attached node");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EUC(C268024cd r3) {
        if (!0qQ.A0K(this.A0C, r3)) {
            this.A0C = r3;
            A0L();
            AnonymousClass5R6 A0B2 = A0B();
            if (A0B2 != null) {
                A0B2.A0J();
            }
            A0K();
            for (C267794cD r1 = this.A0W.A02; r1 != null; r1 = r1.A02) {
                if ((r1.A01 & 16) != 0) {
                    ((AnonymousClass5VD) r1).D8P();
                } else if (r1 instanceof AnonymousClass5SO) {
                    ((AnonymousClass5SO) r1).CNm();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ebv(X.AnonymousClass5Q8 r9) {
        /*
            r8 = this;
            X.5Q8 r0 = r8.A0D
            if (r0 == r9) goto L_0x0082
            r8.A0D = r9
            r8.A0L()
            X.5R6 r0 = r8.A0B()
            if (r0 == 0) goto L_0x0012
            r0.A0J()
        L_0x0012:
            r8.A0K()
            X.5RP r0 = r8.A0W
            X.4cD r5 = r0.A02
            int r0 = r5.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0082
        L_0x001f:
            int r0 = r5.A01
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0077
            r7 = 0
            r6 = r5
            r0 = r7
        L_0x0028:
            boolean r1 = r6 instanceof X.C267814cG
            if (r1 == 0) goto L_0x003e
            X.4cG r6 = (X.C267814cG) r6
            boolean r1 = r6 instanceof X.AnonymousClass5SO
            if (r1 == 0) goto L_0x0037
            X.5SO r6 = (X.AnonymousClass5SO) r6
            r6.CNm()
        L_0x0037:
            X.4cD r6 = X.AnonymousClass5WH.A00(r0)
        L_0x003b:
            if (r6 == 0) goto L_0x0077
            goto L_0x0028
        L_0x003e:
            int r1 = r6.A01
            r1 = r1 & 4
            r4 = 1
            if (r1 == 0) goto L_0x0037
            boolean r1 = r6 instanceof X.C267944cV
            if (r1 == 0) goto L_0x0037
            r1 = r6
            X.4cV r1 = (X.C267944cV) r1
            X.4cD r3 = r1.A00
            r2 = 0
        L_0x004f:
            if (r3 == 0) goto L_0x0074
            int r1 = r3.A01
            r1 = r1 & 4
            if (r1 == 0) goto L_0x005c
            int r2 = r2 + 1
            if (r2 != r4) goto L_0x005f
            r6 = r3
        L_0x005c:
            X.4cD r3 = r3.A02
            goto L_0x004f
        L_0x005f:
            if (r0 != 0) goto L_0x006a
            r0 = 16
            X.4cD[] r1 = new X.C267794cD[r0]
            X.5Pl r0 = new X.5Pl
            r0.<init>(r1)
        L_0x006a:
            if (r6 == 0) goto L_0x0070
            r0.A09(r6)
            r6 = r7
        L_0x0070:
            r0.A09(r3)
            goto L_0x005c
        L_0x0074:
            if (r2 != r4) goto L_0x0037
            goto L_0x003b
        L_0x0077:
            int r0 = r5.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0082
            X.4cD r5 = r5.A02
            if (r5 == 0) goto L_0x0082
            goto L_0x001f
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R6.Ebv(X.5Q8):void");
    }

    public final void Ecq(AnonymousClass5RD r2) {
        if (!0qQ.A0K(this.A07, r2)) {
            this.A07 = r2;
            GRF grf = this.A0P;
            if (grf != null) {
                grf.A00.Epw(r2);
            }
            A0L();
        }
    }

    public final void Edb(Modifier modifier) {
        String str;
        if (this.A0X && this.A04 != Modifier.A00) {
            str = "Modifiers are not supported on virtual LayoutNodes";
        } else if (!(!this.A0L)) {
            str = "modifier is updated when deactivated";
        } else if (this.A0A != null) {
            A04(modifier);
            return;
        } else {
            this.A05 = modifier;
            return;
        }
        I2E.A00(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EqV(X.AnonymousClass5RG r10) {
        /*
            r9 = this;
            X.5RG r0 = r9.A0B
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x0071
            r9.A0B = r10
            X.5RP r0 = r9.A0W
            r5 = 16
            X.4cD r4 = r0.A02
            int r0 = r4.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0071
        L_0x0016:
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0066
            r8 = 0
            r7 = r4
            r6 = r8
        L_0x001f:
            boolean r0 = r7 instanceof X.AnonymousClass5VD
            if (r0 == 0) goto L_0x002f
            X.5VD r7 = (X.AnonymousClass5VD) r7
            r7.Dyp()
        L_0x0028:
            X.4cD r7 = X.AnonymousClass5WH.A00(r6)
        L_0x002c:
            if (r7 == 0) goto L_0x0066
            goto L_0x001f
        L_0x002f:
            int r0 = r7.A01
            r0 = r0 & 16
            r3 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r7 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0028
            r0 = r7
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x0040:
            if (r2 == 0) goto L_0x0063
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x004d
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x0050
            r7 = r2
        L_0x004d:
            X.4cD r2 = r2.A02
            goto L_0x0040
        L_0x0050:
            if (r6 != 0) goto L_0x0059
            X.4cD[] r0 = new X.C267794cD[r5]
            X.5Pl r6 = new X.5Pl
            r6.<init>(r0)
        L_0x0059:
            if (r7 == 0) goto L_0x005f
            r6.A09(r7)
            r7 = r8
        L_0x005f:
            r6.A09(r2)
            goto L_0x004d
        L_0x0063:
            if (r1 != r3) goto L_0x0028
            goto L_0x002c
        L_0x0066:
            int r0 = r4.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0071
            X.4cD r4 = r4.A02
            if (r4 == 0) goto L_0x0071
            goto L_0x0016
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R6.EqV(X.5RG):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C9150RRb.A00(this));
        sb.append(" children: ");
        C285045Pl A0A2 = A0A();
        List list = A0A2.A01;
        if (list == null) {
            list = new C289025ct(A0A2);
            A0A2.A01 = list;
        }
        sb.append(list.size());
        sb.append(" measurePolicy: ");
        sb.append(this.A07);
        return sb.toString();
    }

    public AnonymousClass5R6(boolean z, int i) {
        this.A0X = z;
        this.A01 = i;
        this.A0V = new AnonymousClass5RI(new C285045Pl(new AnonymousClass5R6[16]), new AnonymousClass9L8(this, 28));
        this.A0Y = new C285045Pl(new AnonymousClass5R6[16]);
        this.A0T = true;
        this.A07 = A0b;
        this.A0C = AnonymousClass5RJ.A00;
        this.A0D = AnonymousClass5Q8.Ltr;
        this.A0B = A0c;
        this.A02 = AnonymousClass5RK.A00;
        Integer num = AnonymousClass05K.A0C;
        this.A0F = num;
        this.A0S = num;
        this.A0W = new AnonymousClass5RP(this);
        this.A0U = new AnonymousClass5SI(this);
        this.A0K = true;
        this.A04 = Modifier.A00;
    }

    public final C285045Pl A0A() {
        A0S();
        if (this.A0O == 0) {
            return this.A0V.A00;
        }
        C285045Pl r0 = this.A03;
        0qQ.A0A(r0);
        return r0;
    }

    public final List A0F() {
        C285045Pl A0A2 = A0A();
        List list = A0A2.A01;
        if (list != null) {
            return list;
        }
        C289025ct r0 = new C289025ct(A0A2);
        A0A2.A01 = r0;
        return r0;
    }

    public final void A0R() {
        C285045Pl A0A2 = A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                AnonymousClass5R6 r2 = (AnonymousClass5R6) objArr[i2];
                Integer num = r2.A0S;
                r2.A0F = num;
                if (num != AnonymousClass05K.A0C) {
                    r2.A0R();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public AnonymousClass5R6() {
        this(false, AnonymousClass5R5.A00.addAndGet(1));
    }
}
