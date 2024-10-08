package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import java.util.Map;

/* renamed from: X.5SJ  reason: invalid class name */
public final class AnonymousClass5SJ extends C267974cY implements C268074ci, AnonymousClass5SK, C268044cf {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = Integer.MAX_VALUE;
    public int A04 = Integer.MAX_VALUE;
    public long A05 = 0;
    public long A06 = 0;
    public GraphicsLayer A07;
    public GraphicsLayer A08;
    public Integer A09 = AnonymousClass05K.A0C;
    public Object A0A;
    public 0sP A0B;
    public 0sP A0C;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass5SM A0O = new AnonymousClass5SM(this);
    public final C285045Pl A0P = new C285045Pl(new AnonymousClass5SJ[16]);
    public final C62320sa A0Q = new AnonymousClass9L8(this, 29);
    public final C62320sa A0R;
    public final /* synthetic */ AnonymousClass5SI A0S;

    private final void A03(GraphicsLayer graphicsLayer, 0sP r15, float f, long j) {
        C268104cl r6;
        this.A0F = true;
        long j2 = j;
        boolean z = false;
        if (j == this.A05) {
            z = true;
        }
        if (!z || this.A0N) {
            AnonymousClass5SI r1 = this.A0S;
            if (r1.A07 || r1.A08 || this.A0N) {
                r1.A0A = true;
                this.A0N = false;
            }
            A0M();
        }
        AnonymousClass5SI r7 = this.A0S;
        AnonymousClass5R6 r12 = r7.A0I;
        if (C289045cv.A00(r12)) {
            C268054cg r0 = r12.A0W.A04.A07;
            if (r0 == null || (r6 = r0.A05) == null) {
                r6 = new C268114cm(AnonymousClass5RJ.A00(r12));
            }
            C290225ey r5 = r7.A05;
            0qQ.A0A(r5);
            AnonymousClass5R6 A0B2 = r12.A0B();
            if (A0B2 != null) {
                A0B2.A0U.A02 = 0;
            }
            r5.A00 = Integer.MAX_VALUE;
            r6.A05(r5, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
        }
        C290225ey r02 = r7.A05;
        if (r02 == null || r02.A0D) {
            A02(graphicsLayer, this, r15, f, j2);
        } else {
            I2E.A01("Error: Placement happened before lookahead.");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0I(GraphicsLayer graphicsLayer, float f, long j) {
        A03(graphicsLayer, (0sP) null, f, j);
    }

    public final void A0J(0sP r7, float f, long j) {
        A03((GraphicsLayer) null, r7, f, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r4 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N() {
        /*
            r5 = this;
            r0 = 1
            r5.A0I = r0
            X.5SI r0 = r5.A0S
            X.5R6 r1 = r0.A0I
            X.5R6 r4 = r1.A0B()
            X.4e4 r0 = r5.BHL()
            float r3 = r0.A00
            X.5RP r0 = r1.A0W
            X.4cg r2 = r0.A04
            X.4e4 r1 = r0.A06
        L_0x0017:
            if (r2 == r1) goto L_0x0024
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"
            X.0qQ.A0C(r2, r0)
            float r0 = r2.A00
            float r3 = r3 + r0
            X.4cg r2 = r2.A06
            goto L_0x0017
        L_0x0024:
            float r0 = r5.A02
            r1 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            r5.A02 = r3
            if (r4 == 0) goto L_0x0035
            r4.A0O()
            r4.A0J()
        L_0x0035:
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x0069
            if (r4 == 0) goto L_0x003e
            r4.A0J()
        L_0x003e:
            r5.A00()
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x0069
            if (r4 == 0) goto L_0x006c
            r4.A0Y(r1)
        L_0x004a:
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0065
            X.5SI r2 = r4.A0U
            java.lang.Integer r1 = r2.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0065
            int r1 = r5.A03
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x006f
            int r0 = r2.A03
            r5.A03 = r0
            int r0 = r0 + 1
            r2.A03 = r0
        L_0x0065:
            r5.Cfl()
            return
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x004a
        L_0x006c:
            r5.A03 = r1
            goto L_0x0065
        L_0x006f:
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SJ.A0N():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r9 = r7.A0I;
        r0 = r9.A0A();
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cfl() {
        /*
            r11 = this;
            r6 = 1
            r11.A0G = r6
            X.5SM r5 = r11.A0O
            r5.A06()
            X.5SI r7 = r11.A0S
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x005b
            X.5R6 r9 = r7.A0I
            X.5Pl r0 = r9.A0A()
            int r8 = r0.A00
            if (r8 <= 0) goto L_0x005b
            r4 = 0
            java.lang.Object[] r3 = r0.A02
        L_0x001b:
            r2 = r3[r4]
            X.5R6 r2 = (X.AnonymousClass5R6) r2
            X.5SI r0 = r2.A0U
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0057
            X.5SI r0 = r2.A0U
            X.5SJ r0 = r0.A0J
            java.lang.Integer r1 = r0.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0057
            X.5SI r0 = r2.A0U
            X.5SJ r1 = r0.A0J
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x0057
            long r0 = r1.A04
            androidx.compose.ui.unit.Constraints r10 = new androidx.compose.ui.unit.Constraints
            r10.<init>(r0)
            java.lang.Integer r1 = r2.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0047
            r2.A0H()
        L_0x0047:
            X.5SI r0 = r2.A0U
            X.5SJ r2 = r0.A0J
            long r0 = r10.A00
            boolean r0 = r2.A0O(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 0
            r9.A0a(r0, r6, r6)
        L_0x0057:
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x001b
        L_0x005b:
            boolean r0 = r7.A0B
            r4 = 0
            if (r0 != 0) goto L_0x0070
            boolean r0 = r11.A0M
            if (r0 != 0) goto L_0x00ad
            X.4e4 r0 = r11.BHL()
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x00ad
        L_0x0070:
            r7.A0A = r4
            java.lang.Integer r8 = r7.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r7.A06 = r0
            boolean r0 = r7.A08
            if (r0 == r4) goto L_0x0089
            r7.A08 = r4
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x0089
            int r0 = r7.A00
            int r0 = r0 + -1
            r7.A01(r0)
        L_0x0089:
            X.5R6 r3 = r7.A0I
            X.4co r0 = X.AnonymousClass5RJ.A00(r3)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5TD r2 = r0.A0b
            X.0sa r1 = r11.A0Q
            X.0sP r0 = r2.A01
            r2.A00(r3, r1, r0)
            r7.A06 = r8
            X.4e4 r0 = r11.BHL()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00ab
            r11.requestLayout()
        L_0x00ab:
            r7.A0B = r4
        L_0x00ad:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x00b3
            r5.A02 = r6
        L_0x00b3:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x00c1
            r5.A06()
            X.5SK r0 = r5.A00
            if (r0 == 0) goto L_0x00c1
            r5.A05()
        L_0x00c1:
            r11.A0G = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SJ.Cfl():void");
    }

    public AnonymousClass5SJ(AnonymousClass5SI r6) {
        this.A0S = r6;
        this.A0R = new AnonymousClass9M0(5, r6, this);
    }

    private final void A00() {
        boolean z = this.A0E;
        this.A0E = true;
        AnonymousClass5R6 r3 = this.A0S.A0I;
        if (!z) {
            AnonymousClass5SI r1 = r3.A0U;
            if (r1.A0H) {
                r3.A0a(true, true, true);
            } else if (r1.A0G) {
                r3.A0Z(true, true, true);
            }
        }
        AnonymousClass5RP r0 = r3.A0W;
        C268054cg r2 = r0.A04;
        C268054cg r12 = r0.A06.A06;
        while (!0qQ.A0K(r2, r12) && r2 != null) {
            if (r2.A0B) {
                r2.A0c();
            }
            r2 = r2.A06;
        }
        C285045Pl A0A2 = r3.A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                AnonymousClass5R6 r22 = (AnonymousClass5R6) objArr[i2];
                if (r22.A0U.A0J.A03 != Integer.MAX_VALUE) {
                    r22.A0U.A0J.A00();
                    AnonymousClass5R6.A08(r22);
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A01() {
        Integer num;
        AnonymousClass5R6 r4 = this.A0S.A0I;
        r4.A0a(false, true, true);
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

    public static final void A02(GraphicsLayer graphicsLayer, AnonymousClass5SJ r13, 0sP r14, float f, long j) {
        AnonymousClass5SI r4 = r13.A0S;
        AnonymousClass5R6 r3 = r4.A0I;
        if (!(!r3.A0L)) {
            I2E.A00("place is called on a deactivated node");
            throw AnonymousClass00P.createAndThrow();
        }
        r4.A06 = AnonymousClass05K.A0C;
        long j2 = j;
        r13.A05 = j2;
        float f2 = f;
        r13.A00 = f;
        0sP r9 = r14;
        r13.A0B = r14;
        GraphicsLayer graphicsLayer2 = graphicsLayer;
        r13.A07 = graphicsLayer;
        r13.A0K = true;
        r13.A0I = false;
        C268124co A002 = AnonymousClass5RJ.A00(r3);
        if (r4.A0A || !r13.A0E) {
            r13.A0O.A03 = false;
            if (r4.A07) {
                r4.A07 = false;
                if (!r4.A08) {
                    r4.A01(r4.A00 - 1);
                }
            }
            r13.A0C = r14;
            r13.A06 = j2;
            r13.A01 = f;
            r13.A08 = graphicsLayer;
            AnonymousClass5TD r2 = ((AndroidComposeView) A002).A0b;
            r2.A00(r3, r13.A0R, r2.A02);
        } else {
            C268054cg r8 = r3.A0W.A04;
            C268054cg.A0A(graphicsLayer2, r8, r9, f2, C289165d8.A01(j2, r8.A02));
            r13.A0N();
        }
        r4.A06 = AnonymousClass05K.A0Y;
    }

    public static final void A04(AnonymousClass5SJ r5) {
        if (r5.A0E) {
            int i = 0;
            r5.A0E = false;
            AnonymousClass5R6 r3 = r5.A0S.A0I;
            AnonymousClass5RP r0 = r3.A0W;
            C268054cg r2 = r0.A04;
            C268054cg r1 = r0.A06.A06;
            while (!0qQ.A0K(r2, r1) && r2 != null) {
                r2.A0g();
                r2 = r2.A06;
            }
            C285045Pl A0A2 = r3.A0A();
            int i2 = A0A2.A00;
            if (i2 > 0) {
                Object[] objArr = A0A2.A02;
                do {
                    A04(((AnonymousClass5R6) objArr[i]).A0U.A0J);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final int A0G() {
        return this.A0S.A0I.A0W.A04.A0G();
    }

    public final int A0H() {
        return this.A0S.A0I.A0W.A04.A0H();
    }

    public final List A0K() {
        AnonymousClass5R6 r8 = this.A0S.A0I;
        r8.A0S();
        boolean z = this.A0D;
        C285045Pl r7 = this.A0P;
        if (z) {
            C285045Pl A0A2 = r8.A0A();
            int i = A0A2.A00;
            if (i > 0) {
                Object[] objArr = A0A2.A02;
                int i2 = 0;
                do {
                    int i3 = r7.A00;
                    AnonymousClass5SJ r1 = ((AnonymousClass5R6) objArr[i2]).A0U.A0J;
                    if (i3 <= i2) {
                        r7.A09(r1);
                    } else {
                        r7.A02[i2] = r1;
                    }
                    i2++;
                } while (i2 < i);
            }
            r7.A03(r8.A0F().size(), r7.A00);
            this.A0D = false;
        }
        List list = r7.A01;
        if (list != null) {
            return list;
        }
        C289025ct r0 = new C289025ct(r7);
        r7.A01 = r0;
        return r0;
    }

    public final Map A0L() {
        if (!this.A0M) {
            AnonymousClass5SI r3 = this.A0S;
            Integer num = r3.A06;
            Integer num2 = AnonymousClass05K.A00;
            AnonymousClass5SM r2 = this.A0O;
            if (num == num2) {
                r2.A04 = true;
                if (r2.A01) {
                    r3.A0A = true;
                    r3.A0B = true;
                }
            } else {
                r2.A03 = true;
            }
        }
        C268834e4 BHL = BHL();
        BHL.A02 = true;
        Cfl();
        BHL.A02 = false;
        return this.A0O.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.A0I.A0A();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M() {
        /*
            r6 = this;
            X.5SI r1 = r6.A0S
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0032
            X.5R6 r0 = r1.A0I
            X.5Pl r0 = r0.A0A()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0032
            java.lang.Object[] r4 = r0.A02
            r3 = 0
        L_0x0013:
            r2 = r4[r3]
            X.5R6 r2 = (X.AnonymousClass5R6) r2
            X.5SI r1 = r2.A0U
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0029
        L_0x0021:
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r2.A0Y(r0)
        L_0x0029:
            X.5SJ r0 = r1.A0J
            r0.A0M()
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0013
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SJ.A0M():void");
    }

    public final boolean A0O(long j) {
        boolean z;
        AnonymousClass5SI r9 = this.A0S;
        AnonymousClass5R6 r10 = r9.A0I;
        boolean z2 = true;
        if (!(!r10.A0L)) {
            I2E.A00("measure is called on a deactivated node");
        } else {
            C268124co A002 = AnonymousClass5RJ.A00(r10);
            AnonymousClass5R6 A0B2 = r10.A0B();
            if (r10.A0I || (A0B2 != null && A0B2.A0I)) {
                z = true;
            } else {
                z = false;
            }
            r10.A0I = z;
            if (r10.A0U.A0H || this.A04 != j) {
                this.A0O.A04 = false;
                AWC(C288995cq.A00);
                this.A0H = true;
                AnonymousClass5RP r8 = r10.A0W;
                long j2 = r8.A04.A03;
                A0F(j);
                Integer num = r9.A06;
                Integer num2 = AnonymousClass05K.A0Y;
                if (num == num2) {
                    Integer num3 = AnonymousClass05K.A00;
                    r9.A06 = num3;
                    r9.A0H = false;
                    r9.A04 = j;
                    AnonymousClass5TD r2 = ((AndroidComposeView) AnonymousClass5RJ.A00(r10)).A0b;
                    r2.A00(r10, r9.A0K, r2.A06);
                    if (r9.A06 == num3) {
                        r9.A0A = true;
                        r9.A0B = true;
                        r9.A06 = num2;
                    }
                    C268054cg r6 = r8.A04;
                    if (r6.A03 == j2 && r6.A01 == this.A01 && r6.A00 == this.A00) {
                        z2 = false;
                    }
                    A0E(C289155d7.A00(r6.A01, r6.A00));
                    return z2;
                }
                I2E.A01("layout state is not idle before measure starts");
            } else {
                ((AndroidComposeView) A002).A0a.A0B(r10, false);
                r10.A0R();
                return false;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AWC(0sP r5) {
        C285045Pl A0A2 = this.A0S.A0I.A0A();
        int i = A0A2.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A2.A02;
            do {
                r5.invoke(((AnonymousClass5R6) objArr[i2]).A0U.A0J);
                i2++;
            } while (i2 < i);
        }
    }

    public final int AWx(C292215ia r7) {
        Integer num;
        AnonymousClass5R6 r5 = this.A0S.A0I;
        AnonymousClass5R6 A0B2 = r5.A0B();
        Integer num2 = null;
        if (A0B2 != null) {
            num = A0B2.A0U.A06;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A00) {
            this.A0O.A06 = true;
        } else {
            if (A0B2 != null) {
                num2 = A0B2.A0U.A06;
            }
            if (num2 == AnonymousClass05K.A0C) {
                this.A0O.A05 = true;
            }
        }
        this.A0M = true;
        int AWx = r5.A0W.A04.AWx(r7);
        this.A0M = false;
        return AWx;
    }

    public final AnonymousClass5SM Aal() {
        return this.A0O;
    }

    public final C268834e4 BHL() {
        return this.A0S.A0I.A0W.A06;
    }

    public final AnonymousClass5SK BaU() {
        AnonymousClass5SI r0;
        AnonymousClass5R6 A0B2 = this.A0S.A0I.A0B();
        if (A0B2 == null || (r0 = A0B2.A0U) == null) {
            return null;
        }
        return r0.A0J;
    }

    public final Object BaX() {
        return this.A0A;
    }

    public final boolean CZK() {
        return this.A0E;
    }

    public final C267974cY Cnz(long j) {
        AnonymousClass5SI r1 = this.A0S;
        AnonymousClass5R6 r4 = r1.A0I;
        Integer num = r4.A0F;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2) {
            r4.A0H();
        }
        if (C289045cv.A00(r4)) {
            C290225ey r0 = r1.A05;
            0qQ.A0A(r0);
            r0.A05 = num2;
            r0.Cnz(j);
        }
        AnonymousClass5R6 A0B2 = r4.A0B();
        if (A0B2 != null) {
            if (this.A09 == num2 || r4.A0I) {
                Integer num3 = A0B2.A0U.A06;
                int intValue = num3.intValue();
                if (intValue == 0) {
                    num2 = AnonymousClass05K.A00;
                } else if (intValue == 2) {
                    num2 = AnonymousClass05K.A01;
                } else {
                    throw new IllegalStateException(002.A0R("Measurable could be only measured from the parent's measure or layout block. Parents state is ", C62952Kp4.A00(num3)));
                }
            } else {
                I2E.A01("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        this.A09 = num2;
        A0O(j);
        return this;
    }

    public final void EHV() {
        this.A0S.A0I.A0a(false, true, true);
    }

    public final void Efr(boolean z) {
        C268054cg r1 = this.A0S.A0I.A0W.A04;
        boolean z2 = r1.A01;
        if (z != z2) {
            r1.A01 = z2;
            this.A0N = true;
        }
    }

    public final void requestLayout() {
        this.A0S.A0I.A0Y(false);
    }

    public final int CmV(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.CmV(i);
    }

    public final int CmY(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.CmY(i);
    }

    public final int CoO(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.CoO(i);
    }

    public final int CoR(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.CoR(i);
    }
}
