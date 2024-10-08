package X;

import com.instagram.common.session.UserSession;

public final class HFI extends C252333ow {
    public int A00;
    public int A01;
    public final C233402vf A02;
    public final C233532vs A03;
    public final UserSession A04;
    public final C228162kt A05;
    public final C233552vu A06;
    public final AnonymousClass2rI A07;
    public final C233372vc A08;
    public final C249863kU A09;

    public HFI(UserSession userSession, C228162kt r9, AnonymousClass2rI r10, C233372vc r11, C233402vf r12, C249863kU r13, C233522vr r14, C233532vs r15) {
        super(r11, r12, r13, r14, true);
        this.A09 = r13;
        this.A02 = r12;
        this.A08 = r11;
        this.A03 = r15;
        this.A07 = r10;
        this.A05 = r9;
        this.A04 = userSession;
        this.A06 = new C233552vu(r10);
    }

    public final int A01(int i, int i2) {
        return -1;
    }

    public final 1PW A07(AnonymousClass30Y r4, C252093oY r5) {
        String str;
        0qQ.A0B(r4, 0);
        A0N(r4, r5).A03(r4, r5);
        Number number = (Number) r4.A04;
        if (number.intValue() > this.A01) {
            this.A01 = number.intValue();
        }
        C228812mN r1 = this.A04;
        if (r1 == null || (str = r1.BJS(r4.A03)) == null) {
            str = "";
        }
        if (!this.A03.A00(str)) {
            return A0M(r4, r5);
        }
        return 1PW.A0K;
    }

    public final void A0C() {
        this.A01 = 0;
    }

    public final void A0G(1PW r8, int i, int i2, int i3, int i4) {
        0qQ.A0B(r8, 0);
        super.A0G(r8, i, i2, i3, i4);
        C233552vu r0 = this.A06;
        C233402vf r2 = this.A02;
        int i5 = this.A01;
        r0.A06(this.A04, r2, r8, i, i3, i5);
    }

    public final 1PW A0M(AnonymousClass30Y r20, C252093oY r21) {
        Double C7G;
        Integer num;
        String BiN;
        1PW r4 = new 1PW(AnonymousClass05K.A0C);
        C233552vu r12 = this.A06;
        int i = this.A01;
        C233402vf r9 = this.A02;
        AnonymousClass4EB A052 = r12.A05(r9, i);
        if (A052 != null) {
            int A022 = r12.A02(this.A04, A052);
            this.A00 = 0;
            if (A022 != -1 && r12.A07(A022)) {
                C233462vl r7 = A052.A03;
                if (r7 != null) {
                    C67241sS r0 = r7.A01;
                    if (!(r0 == null || (C7G = r0.C7G()) == null)) {
                        double doubleValue = C7G.doubleValue();
                        double A0L = A0L(r21) / 1000.0d;
                        this.A05.BtU().A00(A0L);
                        if (this.A05.AuP() == 0 && Double.compare(A0L, doubleValue) >= 0) {
                            r4.A01("time_rule_did_meet");
                            String str = r7.A07.A02;
                            if (str == null) {
                                str = "";
                            }
                            r4.A0F = str;
                            r4.A00 = A0L;
                            int A053 = A05(r9.BYj().subList(0, this.A01 + 1));
                            int A062 = A06(r9.BYj().subList(0, this.A01 + 1));
                            int i2 = new int[]{A053, A062}[0];
                            if (A062 > i2) {
                                i2 = A062;
                            }
                            r4.A06 = i2;
                            C67241sS r02 = r7.A01;
                            if (r02 == null || (BiN = r02.BiN()) == null) {
                                num = null;
                            } else {
                                num = 00y.A0l(BiN);
                            }
                            GTT A042 = r12.A04(A052, num, A053, A062, A022, this.A01);
                            this.A00 = A042.A00;
                            if (A042.A02) {
                                A0G(r4, A053, A062, A042.A01, this.A01);
                            }
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            return 1PW.A0K;
        }
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1.contains(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r1 != true) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A0P(java.lang.Object r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.HFI.A0P(java.lang.Object):boolean");
    }

    public final boolean A0Q(String str) {
        0qQ.A0B(str, 0);
        return this.A03.A00(str);
    }

    public final /* bridge */ /* synthetic */ int A03(C233472vm r3, int i, int i2, int i3) {
        Integer num;
        String BiN;
        C233462vl r32 = (C233462vl) r3;
        0qQ.A0B(r32, 0);
        C67241sS r0 = r32.A01;
        if (r0 == null || (BiN = r0.BiN()) == null) {
            num = null;
        } else {
            num = 00y.A0l(BiN);
        }
        return C233552vu.A01(num, i, i2, i3, this.A00);
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        AnonymousClass4EB r2 = (AnonymousClass4EB) obj;
        0qQ.A0B(r2, 0);
        return r2.A03;
    }

    public final void A0B() {
        if (!182.A06(0Tu.A05, this.A04, 36315005049899959L)) {
            super.A0B();
        }
    }

    public final /* bridge */ /* synthetic */ boolean A0H(C252093oY r4, 1PW r5, C233472vm r6, int i, int i2, int i3) {
        Integer num;
        String BiN;
        C233462vl r62 = (C233462vl) r6;
        0qQ.A0B(r62, 3);
        C67241sS r0 = r62.A01;
        if (r0 == null || (BiN = r0.BiN()) == null) {
            num = null;
        } else {
            num = 00y.A0l(BiN);
        }
        int i4 = this.A00;
        return C51970G9q.A1W(C233552vu.A01(num, i, i2, i3, i4), this.A01);
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        return AnonymousClass7TE.A0M(obj);
    }

    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        return this.A02.BTe(AnonymousClass7TE.A0M(obj));
    }

    public final boolean A0O(AnonymousClass30Y r6, C252093oY r7) {
        if (((double) r7.CFe(r6)) >= 0.5d) {
            int A022 = this.A07.A02(-1);
            Number number = (Number) r6.A04;
            if (number == null || A022 != number.intValue() || AnonymousClass3VP.A01((1Xg) r6.A03)) {
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
