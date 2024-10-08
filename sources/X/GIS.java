package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class GIS extends C252333ow {
    public int A00;
    public int A01;
    public AnonymousClass9I2 A02 = new AnonymousClass9I2(1);
    public Long A03;
    public int A04;
    public final UserSession A05;
    public final 1Ph A06;
    public final C233372vc A07;
    public final C228812mN A08;
    public final C233402vf A09;
    public final C233222vJ A0A;
    public final C233532vs A0B;
    public final C54575HJk A0C;
    public final C52012GBj A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GIS(UserSession userSession, AnonymousClass1PB r11, C233372vc r12, C228812mN r13, C233402vf r14, C233222vJ r15, C249863kU r16, C233522vr r17, C233532vs r18, C54575HJk hJk, C52012GBj gBj) {
        super(r12, r14, r16, r17, true);
        0Tu r2 = 0Tu.A05;
        boolean A062 = 182.A06(r2, userSession, 36318556989167869L);
        this.A09 = r14;
        this.A07 = r12;
        this.A0B = r18;
        this.A0A = r15;
        this.A08 = r13;
        this.A0E = A062;
        this.A06 = 1Pg.A02.A00(r11);
        this.A0C = hJk;
        this.A05 = userSession;
        this.A0D = gBj;
        this.A0F = 182.A06(r2, userSession, 36318556988971259L);
        this.A0G = 182.A06(r2, userSession, 36318556989167869L);
    }

    public final int A01(int i, int i2) {
        return -1;
    }

    public final 1PW A07(AnonymousClass30Y r4, C252093oY r5) {
        String str;
        0qQ.A0B(r4, 0);
        this.A04++;
        A0N(r4, r5).A03(r4, r5);
        Object obj = r4.A04;
        if (obj != null) {
            if (A04(obj) > this.A01) {
                int A042 = A04(obj);
                this.A01 = A042;
                this.A05.BtU().A02(A042);
            }
            A04(obj);
            C228812mN r1 = this.A04;
            if (r1 == null || (str = r1.BJS(r4.A03)) == null) {
                str = "";
            }
            if (!this.A0B.A00(str)) {
                return A0M(r4, r5);
            }
            this.A02.A01++;
            return 1PW.A0K;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Object A0A(Object obj) {
        0qQ.A0B(obj, 0);
        return this.A09.BTe(A04(obj));
    }

    public final void A0B() {
    }

    public final void A0C() {
        this.A01 = 0;
        this.A05.BtU().A02(0);
        AnonymousClass3VX BtU = this.A05.BtU();
        BtU.A01.clear();
        C18625VvI vvI = BtU.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void A0G(1PW r7, int i, int i2, int i3, int i4) {
        Double d;
        1Xj r0;
        BrandSafetyContentBlocklistBitmapQLObj AiG;
        List Afw;
        1Xj r02;
        BrandSafetyContentBlocklistBitmapQLObj AiG2;
        List Afw2;
        C67241sS r03;
        String BiN;
        C67241sS r04;
        AnonymousClass3W1 r4;
        0qQ.A0B(r7, 0);
        super.A0G(r7, i, i2, i3, i4);
        r7.A0C = AnonymousClass05K.A0Y;
        Object A0R = A0R();
        if (A0R != null) {
            C376489Ie r05 = (C376489Ie) A0R;
            0qQ.A0B(r05, 0);
            C54575HJk hJk = this.A0C;
            C267324bN r2 = (C267324bN) r05.A03;
            int A0B2 = hJk.A0B(r2);
            if (A0B2 != -1) {
                r7.A07 = A0B2;
            }
            1Xj r06 = r2.A02;
            if (r06 != null) {
                r4 = hJk.BQr(r06);
                if (r4 != null) {
                    r4.A0F = i3 - i;
                }
            } else {
                r4 = null;
            }
            if (182.A06(0Tu.A05, this.A05, 36317925627401873L)) {
                List A0I = hJk.A0I();
                if (r4 != null) {
                    C228812mN r22 = this.A08;
                    String BJS = r22.BJS(A0I.get(i3 - 1));
                    String BJS2 = r22.BJS(A0I.get(i3));
                    r4.A1S = BJS;
                    r4.A1O = BJS2;
                }
            }
        }
        C376489Ie r1 = (C376489Ie) A0R();
        if (r1 != null) {
            C54575HJk hJk2 = this.A0C;
            C52058GDe BzC = hJk2.BzC((C267324bN) r1.A03);
            C233462vl r42 = (C233462vl) r1.A04;
            Integer num = null;
            if (r42 == null || (r04 = r42.A01) == null) {
                d = null;
            } else {
                d = r04.C7G();
            }
            BzC.A00 = d;
            if (!(r42 == null || (r03 = r42.A01) == null || (BiN = r03.BiN()) == null)) {
                num = 00y.A0l(BiN);
            }
            BzC.A02 = num;
            C267324bN A0F2 = hJk2.A0F(i3 - 1);
            if (!(A0F2 == null || (r02 = A0F2.A02) == null || (AiG2 = r02.A0C.AiG()) == null || (Afw2 = AiG2.Afw()) == null)) {
                ArrayList A012 = C271914jn.A00.A01(Afw2);
                AnonymousClass3W1 r07 = BzC.A0E;
                if (r07 != null) {
                    r07.A1i = A012;
                }
            }
            C267324bN A0F3 = hJk2.A0F(i3);
            if (A0F3 != null && (r0 = A0F3.A02) != null && (AiG = r0.A0C.AiG()) != null && (Afw = AiG.Afw()) != null) {
                ArrayList A013 = C271914jn.A00.A01(Afw);
                AnonymousClass3W1 r08 = BzC.A0E;
                if (r08 != null) {
                    r08.A1h = A013;
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean A0H(C252093oY r3, 1PW r4, C233472vm r5, int i, int i2, int i3) {
        0qQ.A0B(r5, 3);
        return C51970G9q.A1W(A03(r5, i, i2, i3), this.A01);
    }

    public final 1PW A0M(AnonymousClass30Y r19, C252093oY r20) {
        Double C7G;
        1PW r13 = new 1PW(AnonymousClass05K.A0C);
        Object A0R = A0R();
        if (A0R == null) {
            this.A02.A03++;
            return r13;
        }
        C376489Ie r0 = (C376489Ie) A0R;
        0qQ.A0B(r0, 0);
        C54575HJk hJk = this.A0C;
        int A0B2 = hJk.A0B((C267324bN) r0.A03);
        this.A00 = 0;
        if (A0B2 != -1) {
            C233462vl r4 = (C233462vl) A09(A0R);
            C233402vf r2 = this.A09;
            int A052 = A05(r2.BYj().subList(0, this.A01 + 1));
            int A062 = A06(r2.BYj().subList(0, this.A01 + 1));
            if (r4 != null) {
                C67241sS r02 = r4.A01;
                if (!(r02 == null || (C7G = r02.C7G()) == null)) {
                    double doubleValue = C7G.doubleValue();
                    if (!this.A0E || doubleValue >= 1.0d) {
                        double A0L = A0L(r20) / 1000.0d;
                        this.A05.BtU().A00(A0L);
                        boolean z = false;
                        if (this.A0D.A0D() == AnonymousClass05K.A00) {
                            z = true;
                            if (Double.compare(A0L, doubleValue) >= 0) {
                                r13.A01("time_rule_did_meet");
                                String str = r4.A07.A02;
                                if (str == null) {
                                    str = "";
                                }
                                r13.A0F = str;
                                r13.A00 = A0L;
                                int i = new int[]{A052, A062}[0];
                                if (A062 > i) {
                                    i = A062;
                                }
                                r13.A06 = i;
                                hJk.A0I();
                                this.A08.BXm(A0R);
                                for (int A032 = A03(r4, A052, A062, A0B2); A032 < A0B2; A032 = A03(r4, A052, A062, A0B2)) {
                                    if (A03(r4, A052, A062, A0B2) > this.A01) {
                                        A0G(r13, A052, A062, A03(r4, A052, A062, A0B2), this.A01);
                                        return r13;
                                    }
                                    this.A00++;
                                }
                                this.A02.A00++;
                            }
                        }
                        AnonymousClass9I2 r1 = this.A02;
                        if (!z) {
                            r1.A06++;
                        } else {
                            r1.A05++;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            this.A02.A02++;
        }
        return 1PW.A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1.contains(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r1 != true) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0P(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x003f
            X.2mN r0 = r4.A04
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.CcL(r5)
            r0 = 1
            if (r1 == r3) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.util.List r1 = r4.A09
            X.2mN r0 = r4.A04
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.BEZ(r5)
        L_0x001c:
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003c
        L_0x0022:
            X.2mN r0 = r4.A04
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.CYA(r5)
            if (r0 != r3) goto L_0x003f
            java.util.List r1 = r4.A0A
            X.2mN r0 = r4.A04
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = r0.BEZ(r5)
        L_0x0036:
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L_0x003f
        L_0x003c:
            return r3
        L_0x003d:
            r0 = r2
            goto L_0x001c
        L_0x003f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GIS.A0P(java.lang.Object):boolean");
    }

    public final boolean A0Q(String str) {
        0qQ.A0B(str, 0);
        return this.A0B.A00(str);
    }

    public final /* bridge */ /* synthetic */ int A03(C233472vm r8, int i, int i2, int i3) {
        int[] iArr;
        int intValue;
        String BiN;
        C233462vl r82 = (C233462vl) r8;
        0qQ.A0B(r82, 0);
        C67241sS r0 = r82.A01;
        Integer num = null;
        if (!(r0 == null || (BiN = r0.BiN()) == null)) {
            num = 00y.A0l(BiN);
        }
        Integer num2 = r82.A00.A07;
        if (this.A0G && i == -1 && i2 == -1 && num2 != null) {
            iArr = new int[2];
            intValue = num2.intValue();
        } else if (num == null) {
            return i3;
        } else {
            if (i == -1 && i2 == -1) {
                return i3;
            }
            iArr = new int[2];
            int i4 = new int[]{i, i2}[0];
            if (i2 > i4) {
                i4 = i2;
            }
            intValue = i4 + num.intValue() + 1;
        }
        iArr[0] = intValue;
        iArr[1] = i3;
        int i5 = iArr[0];
        if (i3 < i5) {
            i5 = i3;
        }
        return i5 + this.A00;
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        C52058GDe gDe = (C52058GDe) obj;
        0qQ.A0B(gDe, 0);
        return gDe.A09();
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        C376489Ie r2 = (C376489Ie) obj;
        0qQ.A0B(r2, 0);
        return (C233472vm) r2.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 != true) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A0E(X.AnonymousClass30Y r6, X.C252093oY r7, java.lang.Object r8, int r9) {
        /*
            r5 = this;
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x006f
            X.2mN r0 = r5.A04
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.CcL(r8)
            r0 = 1
            if (r1 == r2) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 != 0) goto L_0x001e
            X.2mN r0 = r5.A04
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.CYA(r8)
            if (r0 != r2) goto L_0x0032
        L_0x001e:
            java.lang.Object r4 = r6.A04
            X.GDe r4 = (X.C52058GDe) r4
            double r0 = r5.A0L(r7)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A01 = r0
            java.lang.Long r0 = r5.A03
            r4.A04 = r0
            r5.A03 = r3
        L_0x0032:
            X.HJk r1 = r5.A0C
            int r0 = r9 + -1
            X.4bN r1 = r1.A0F(r0)
            if (r1 == 0) goto L_0x004b
            X.2mN r0 = r5.A04
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.CVy(r1)
            if (r0 != r2) goto L_0x0073
        L_0x0046:
            r0 = 1
        L_0x0047:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x004b:
            X.2mN r0 = r5.A04
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.CcL(r8)
            if (r0 != 0) goto L_0x006f
            X.2mN r0 = r5.A04
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.CYA(r8)
            if (r0 != 0) goto L_0x006f
            boolean r0 = X.AnonymousClass7TF.A1Y(r3, r2)
            if (r0 == 0) goto L_0x006f
            java.lang.Long r0 = r5.A03
            if (r0 != 0) goto L_0x006f
            java.lang.Long r0 = X.C51968G9o.A0u()
            r5.A03 = r0
        L_0x006f:
            super.A0E(r6, r7, r8, r9)
            return
        L_0x0073:
            X.2mN r0 = r5.A04
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.CVx(r1)
            if (r0 != r2) goto L_0x007e
            goto L_0x0046
        L_0x007e:
            r0 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GIS.A0E(X.30Y, X.3oY, java.lang.Object, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0R() {
        /*
            r6 = this;
            X.HJk r0 = r6.A0C
            java.util.List r2 = r0.A0I()
            int r1 = r2.size()
            int r0 = r6.A01
            r5 = 0
            if (r1 <= r0) goto L_0x0035
            java.util.ListIterator r4 = r2.listIterator(r0)
        L_0x0013:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0035
            int r3 = r4.nextIndex()
            java.lang.Object r2 = r4.next()
            X.2mN r1 = r6.A08
            boolean r0 = r1.CVy(r2)
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1.CVx(r2)
            if (r0 == 0) goto L_0x0013
        L_0x002f:
            X.2vf r0 = r6.A09
            java.lang.Object r5 = r0.BTe(r3)
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GIS.A0R():java.lang.Object");
    }

    public final boolean A0O(AnonymousClass30Y r6, C252093oY r7) {
        if (((double) r7.CFe(r6)) >= 0.5d) {
            C228812mN r2 = this.A08;
            Object obj = r6.A03;
            if (r2.CVy(obj) || r2.CVx(obj)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean A0K(C233472vm r2) {
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean A0I(C252093oY r2, C233472vm r3, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
