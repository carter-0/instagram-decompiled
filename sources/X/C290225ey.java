package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;

/* renamed from: X.5ey  reason: invalid class name and case insensitive filesystem */
public final class C290225ey extends C267974cY implements C268074ci, AnonymousClass5SK, C268044cf {
    public int A00 = Integer.MAX_VALUE;
    public int A01 = Integer.MAX_VALUE;
    public long A02 = 0;
    public GraphicsLayer A03;
    public Constraints A04;
    public Integer A05 = AnonymousClass05K.A0C;
    public Object A06;
    public 0sP A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C285045Pl A0H = new C285045Pl(new C290225ey[16]);
    public final AnonymousClass5SM A0I = new AnonymousClass5SM(this);
    public final /* synthetic */ AnonymousClass5SI A0J;

    public final void A0I(GraphicsLayer graphicsLayer, float f, long j) {
        A02(graphicsLayer, this, (0sP) null, j);
    }

    public final void A0J(0sP r2, float f, long j) {
        A02((GraphicsLayer) null, this, r2, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r2 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2 = r2.A0U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M() {
        /*
            r3 = this;
            r0 = 1
            r3.A0B = r0
            X.5SI r0 = r3.A0J
            X.5R6 r0 = r0.A0I
            X.5R6 r2 = r0.A0B()
            boolean r0 = r3.A09
            r1 = 0
            if (r0 != 0) goto L_0x003f
            r3.A00()
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x0042
            r2.A0X(r1)
        L_0x001c:
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x003b
            X.5SI r2 = r2.A0U
            java.lang.Integer r1 = r2.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x003b
        L_0x002c:
            int r1 = r3.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0045
            int r0 = r2.A02
            r3.A00 = r0
            int r0 = r0 + 1
            r2.A02 = r0
        L_0x003b:
            r3.Cfl()
            return
        L_0x003f:
            if (r2 == 0) goto L_0x0042
            goto L_0x001c
        L_0x0042:
            r3.A00 = r1
            goto L_0x003b
        L_0x0045:
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290225ey.A0M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r9 = r7.A0I;
        r0 = r9.A0A();
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cfl() {
        /*
            r10 = this;
            r6 = 1
            r10.A0A = r6
            X.5SM r4 = r10.A0I
            r4.A06()
            X.5SI r7 = r10.A0J
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x0051
            X.5R6 r9 = r7.A0I
            X.5Pl r0 = r9.A0A()
            int r8 = r0.A00
            if (r8 <= 0) goto L_0x0051
            r5 = 0
            java.lang.Object[] r3 = r0.A02
        L_0x001b:
            r2 = r3[r5]
            X.5R6 r2 = (X.AnonymousClass5R6) r2
            X.5SI r0 = r2.A0U
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x004d
            X.5SI r0 = r2.A0U
            X.5ey r0 = r0.A05
            if (r0 == 0) goto L_0x00cb
            java.lang.Integer r1 = r0.A05
        L_0x002d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x004d
            X.5SI r0 = r2.A0U
            X.5ey r2 = r0.A05
            X.0qQ.A0A(r2)
            X.5ey r0 = r0.A05
            if (r0 == 0) goto L_0x00c8
            androidx.compose.ui.unit.Constraints r0 = r0.A04
        L_0x003e:
            X.0qQ.A0A(r0)
            long r0 = r0.A00
            boolean r0 = r2.A0N(r0)
            if (r0 == 0) goto L_0x004d
            r0 = 0
            r9.A0Z(r0, r6, r6)
        L_0x004d:
            int r5 = r5 + 1
            if (r5 < r8) goto L_0x001b
        L_0x0051:
            X.4e4 r0 = r10.BHL()
            X.6GP r8 = r0.A0Z()
            X.0qQ.A0A(r8)
            boolean r0 = r7.A0F
            r3 = 0
            if (r0 != 0) goto L_0x006d
            boolean r0 = r10.A0F
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x00ae
        L_0x006d:
            r7.A0E = r3
            java.lang.Integer r9 = r7.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r7.A06 = r0
            X.5R6 r5 = r7.A0I
            X.4co r1 = X.AnonymousClass5RJ.A00(r5)
            boolean r0 = r7.A0D
            if (r0 == r3) goto L_0x008c
            r7.A0D = r3
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x008c
            int r0 = r7.A01
            int r0 = r0 + -1
            r7.A02(r0)
        L_0x008c:
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            X.5TD r2 = r1.A0b
            r0 = 4
            X.Iw5 r1 = new X.Iw5
            r1.<init>(r0, r8, r10, r7)
            X.5R6 r0 = r5.A08
            if (r0 == 0) goto L_0x00c5
            X.0sP r0 = r2.A04
        L_0x009c:
            r2.A00(r5, r1, r0)
            r7.A06 = r9
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x00ac
            r10.requestLayout()
        L_0x00ac:
            r7.A0F = r3
        L_0x00ae:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x00b4
            r4.A02 = r6
        L_0x00b4:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00c2
            r4.A06()
            X.5SK r0 = r4.A00
            if (r0 == 0) goto L_0x00c2
            r4.A05()
        L_0x00c2:
            r10.A0A = r3
            return
        L_0x00c5:
            X.0sP r0 = r2.A01
            goto L_0x009c
        L_0x00c8:
            r0 = 0
            goto L_0x003e
        L_0x00cb:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290225ey.Cfl():void");
    }

    public C290225ey(AnonymousClass5SI r3) {
        this.A0J = r3;
        this.A06 = r3.A0J.A0A;
    }

    private final void A00() {
        boolean z = this.A09;
        this.A09 = true;
        if (!z) {
            AnonymousClass5SI r1 = this.A0J;
            if (r1.A0G) {
                r1.A0I.A0Z(true, true, true);
            }
        }
        C285045Pl A0A2 = this.A0J.A0I.A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                AnonymousClass5R6 r2 = (AnonymousClass5R6) objArr[i2];
                if (r2.A0U.A0J.A03 != Integer.MAX_VALUE) {
                    C290225ey r0 = r2.A0U.A05;
                    0qQ.A0A(r0);
                    r0.A00();
                    AnonymousClass5R6.A08(r2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A01() {
        Integer num;
        AnonymousClass5R6 r4 = this.A0J.A0I;
        r4.A0Z(false, true, true);
        AnonymousClass5R6 A0B2 = r4.A0B();
        if (A0B2 != null && r4.A0F == AnonymousClass05K.A0C) {
            int intValue = A0B2.A0U.A06.intValue();
            if (intValue == 0) {
                num = AnonymousClass05K.A00;
            } else if (intValue != 2) {
                num = A0B2.A0F;
            } else {
                num = AnonymousClass05K.A01;
            }
            r4.A0F = num;
        }
    }

    public static final void A02(GraphicsLayer graphicsLayer, C290225ey r11, 0sP r12, long j) {
        0sP r0;
        AnonymousClass5SI r8 = r11.A0J;
        AnonymousClass5R6 r2 = r8.A0I;
        if (!(!r2.A0L)) {
            I2E.A00("place is called on a deactivated node");
            throw AnonymousClass00P.createAndThrow();
        }
        r8.A06 = AnonymousClass05K.A0N;
        r11.A0D = true;
        r11.A0B = false;
        long j2 = j;
        if (j != r11.A02) {
            if (r8.A0C || r8.A0D) {
                r8.A0E = true;
            }
            r11.A0L();
        }
        C268124co A002 = AnonymousClass5RJ.A00(r2);
        if (r8.A0E || !r11.A09) {
            if (r8.A0C) {
                r8.A0C = false;
                if (!r8.A0D) {
                    r8.A02(r8.A01 - 1);
                }
            }
            r11.A0I.A03 = false;
            AnonymousClass5TD r1 = ((AndroidComposeView) A002).A0b;
            C58193Inx inx = new C58193Inx(j2, A002, r8, 0);
            if (r2.A08 != null) {
                r0 = r1.A03;
            } else {
                r0 = r1.A02;
            }
            r1.A00(r2, inx, r0);
        } else {
            AnonymousClass6GP A0Z = r2.A0W.A04.A0Z();
            0qQ.A0A(A0Z);
            AnonymousClass6GP.A03(A0Z, C289165d8.A01(j, A0Z.A02));
            r11.A0M();
        }
        r11.A02 = j;
        r11.A07 = r12;
        r11.A03 = graphicsLayer;
        r8.A06 = AnonymousClass05K.A0Y;
    }

    public static final void A03(C290225ey r4) {
        if (r4.A09) {
            int i = 0;
            r4.A09 = false;
            C285045Pl A0A2 = r4.A0J.A0I.A0A();
            int i2 = A0A2.A00;
            if (i2 > 0) {
                Object[] objArr = A0A2.A02;
                do {
                    C290225ey r0 = ((AnonymousClass5R6) objArr[i]).A0U.A05;
                    0qQ.A0A(r0);
                    A03(r0);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final int A0G() {
        AnonymousClass6GP A0Z = this.A0J.A0I.A0W.A04.A0Z();
        0qQ.A0A(A0Z);
        return A0Z.A0G();
    }

    public final int A0H() {
        AnonymousClass6GP A0Z = this.A0J.A0I.A0W.A04.A0Z();
        0qQ.A0A(A0Z);
        return A0Z.A0H();
    }

    public final Map A0K() {
        if (!this.A0F) {
            AnonymousClass5SI r3 = this.A0J;
            Integer num = r3.A06;
            Integer num2 = AnonymousClass05K.A01;
            AnonymousClass5SM r2 = this.A0I;
            if (num == num2) {
                r2.A04 = true;
                if (r2.A01) {
                    r3.A0E = true;
                    r3.A0F = true;
                }
            } else {
                r2.A03 = true;
            }
        }
        C268834e4 BHL = BHL();
        AnonymousClass6GP A0Z = BHL.A0Z();
        if (A0Z != null) {
            A0Z.A02 = true;
        }
        Cfl();
        AnonymousClass6GP A0Z2 = BHL.A0Z();
        if (A0Z2 != null) {
            A0Z2.A02 = false;
        }
        return this.A0I.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.A0I.A0A();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L() {
        /*
            r6 = this;
            X.5SI r1 = r6.A0J
            int r0 = r1.A01
            if (r0 <= 0) goto L_0x0034
            X.5R6 r0 = r1.A0I
            X.5Pl r0 = r0.A0A()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0034
            java.lang.Object[] r4 = r0.A02
            r3 = 0
        L_0x0013:
            r2 = r4[r3]
            X.5R6 r2 = (X.AnonymousClass5R6) r2
            X.5SI r1 = r2.A0U
            boolean r0 = r1.A0D
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0029
        L_0x0021:
            boolean r0 = r1.A0E
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r2.A0X(r0)
        L_0x0029:
            X.5ey r0 = r1.A05
            if (r0 == 0) goto L_0x0030
            r0.A0L()
        L_0x0030:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0013
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290225ey.A0L():void");
    }

    public final boolean A0N(long j) {
        boolean z;
        long A002;
        0sP r0;
        Constraints constraints;
        AnonymousClass5SI r6 = this.A0J;
        AnonymousClass5R6 r5 = r6.A0I;
        if (!(!r5.A0L)) {
            I2E.A00("measure is called on a deactivated node");
        } else {
            AnonymousClass5R6 A0B2 = r5.A0B();
            if (r5.A0I || (A0B2 != null && A0B2.A0I)) {
                z = true;
            } else {
                z = false;
            }
            r5.A0I = z;
            if (r5.A0U.A0G || (constraints = this.A04) == null || constraints.A00 != j) {
                this.A04 = new Constraints(j);
                A0F(j);
                this.A0I.A04 = false;
                AWC(C58907IzW.A00);
                if (this.A0G) {
                    A002 = this.A03;
                } else {
                    A002 = C289155d7.A00(AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK);
                }
                this.A0G = true;
                AnonymousClass6GP A0Z = r5.A0W.A04.A0Z();
                if (A0Z != null) {
                    r6.A06 = AnonymousClass05K.A01;
                    r6.A0G = false;
                    AnonymousClass5TD r9 = ((AndroidComposeView) AnonymousClass5RJ.A00(r5)).A0b;
                    C41565AwX awX = new C41565AwX(j, r6, 0);
                    if (r5.A08 != null) {
                        r0 = r9.A05;
                    } else {
                        r0 = r9.A06;
                    }
                    r9.A00(r5, awX, r0);
                    r6.A0E = true;
                    r6.A0F = true;
                    if (C289045cv.A00(r5)) {
                        r6.A0A = true;
                        r6.A0B = true;
                    } else {
                        r6.A0H = true;
                    }
                    r6.A06 = AnonymousClass05K.A0Y;
                    A0E(C289155d7.A00(A0Z.A01, A0Z.A00));
                    if (((int) (A002 >> 32)) == A0Z.A01 && C289005cr.A00(A002) == A0Z.A00) {
                        return false;
                    }
                    return true;
                }
                I2E.A01("Lookahead result from lookaheadRemeasure cannot be null");
            } else {
                C268124co r02 = r5.A0A;
                if (r02 != null) {
                    ((AndroidComposeView) r02).A0a.A0B(r5, true);
                }
                r5.A0R();
                return false;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AWC(0sP r5) {
        C285045Pl A0A2 = this.A0J.A0I.A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                C290225ey r0 = ((AnonymousClass5R6) objArr[i2]).A0U.A05;
                0qQ.A0A(r0);
                r5.invoke(r0);
                i2++;
            } while (i2 < i);
        }
    }

    public final int AWx(C292215ia r7) {
        Integer num;
        AnonymousClass5R6 r5 = this.A0J.A0I;
        AnonymousClass5R6 A0B2 = r5.A0B();
        Integer num2 = null;
        if (A0B2 != null) {
            num = A0B2.A0U.A06;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A01) {
            this.A0I.A06 = true;
        } else {
            if (A0B2 != null) {
                num2 = A0B2.A0U.A06;
            }
            if (num2 == AnonymousClass05K.A0N) {
                this.A0I.A05 = true;
            }
        }
        this.A0F = true;
        AnonymousClass6GP A0Z = r5.A0W.A04.A0Z();
        0qQ.A0A(A0Z);
        int AWx = A0Z.AWx(r7);
        this.A0F = false;
        return AWx;
    }

    public final AnonymousClass5SM Aal() {
        return this.A0I;
    }

    public final C268834e4 BHL() {
        return this.A0J.A0I.A0W.A06;
    }

    public final AnonymousClass5SK BaU() {
        AnonymousClass5SI r0;
        AnonymousClass5R6 A0B2 = this.A0J.A0I.A0B();
        if (A0B2 == null || (r0 = A0B2.A0U) == null) {
            return null;
        }
        return r0.A05;
    }

    public final Object BaX() {
        return this.A06;
    }

    public final boolean CZK() {
        return this.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1 == X.AnonymousClass05K.A0N) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C267974cY Cnz(long r8) {
        /*
            r7 = this;
            X.5SI r3 = r7.A0J
            X.5R6 r5 = r3.A0I
            X.5R6 r2 = r5.A0B()
            r1 = 0
            if (r2 == 0) goto L_0x0037
            X.5SI r0 = r2.A0U
            java.lang.Integer r0 = r0.A06
        L_0x000f:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r0 == r6) goto L_0x001d
            if (r2 == 0) goto L_0x0019
            X.5SI r0 = r2.A0U
            java.lang.Integer r1 = r0.A06
        L_0x0019:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0020
        L_0x001d:
            r0 = 0
            r3.A09 = r0
        L_0x0020:
            if (r2 == 0) goto L_0x005c
            java.lang.Integer r0 = r7.A05
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            r3 = 1
            if (r0 == r4) goto L_0x0039
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0037:
            r0 = r1
            goto L_0x000f
        L_0x0039:
            X.5SI r0 = r2.A0U
            java.lang.Integer r2 = r0.A06
            int r1 = r2.intValue()
            if (r1 == r3) goto L_0x0060
            r0 = 0
            if (r1 == r0) goto L_0x0060
            r0 = 2
            if (r1 == r0) goto L_0x0062
            r0 = 3
            if (r1 == r0) goto L_0x0062
            java.lang.String r1 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            java.lang.String r0 = X.C62952Kp4.A00(r2)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x005c:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r4 = r6
            goto L_0x0062
        L_0x0060:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x0062:
            r7.A05 = r6
            java.lang.Integer r0 = r5.A0F
            if (r0 != r4) goto L_0x006b
            r5.A0H()
        L_0x006b:
            r7.A0N(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290225ey.Cnz(long):X.4cY");
    }

    public final void EHV() {
        this.A0J.A0I.A0Z(false, true, true);
    }

    public final void Efr(boolean z) {
        Boolean bool;
        AnonymousClass6GP A0Z;
        AnonymousClass5RP r2 = this.A0J.A0I.A0W;
        AnonymousClass6GP A0Z2 = r2.A04.A0Z();
        if (A0Z2 != null) {
            bool = Boolean.valueOf(A0Z2.A01);
        } else {
            bool = null;
        }
        if (!0qQ.A0K(Boolean.valueOf(z), bool) && (A0Z = r2.A04.A0Z()) != null) {
            A0Z.A01 = z;
        }
    }

    public final void requestLayout() {
        this.A0J.A0I.A0X(false);
    }

    public final int CmV(int i) {
        A01();
        AnonymousClass6GP A0Z = this.A0J.A0I.A0W.A04.A0Z();
        0qQ.A0A(A0Z);
        return A0Z.CmV(i);
    }

    public final int CmY(int i) {
        A01();
        AnonymousClass6GP A0Z = this.A0J.A0I.A0W.A04.A0Z();
        0qQ.A0A(A0Z);
        return A0Z.CmY(i);
    }

    public final int CoO(int i) {
        A01();
        AnonymousClass6GP A0Z = this.A0J.A0I.A0W.A04.A0Z();
        0qQ.A0A(A0Z);
        return A0Z.CoO(i);
    }

    public final int CoR(int i) {
        A01();
        AnonymousClass6GP A0Z = this.A0J.A0I.A0W.A04.A0Z();
        0qQ.A0A(A0Z);
        return A0Z.CoR(i);
    }
}
