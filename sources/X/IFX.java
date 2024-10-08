package X;

public final class IFX implements C59629JQx {
    public final /* synthetic */ C52693Gb5 A00;

    public final void DAB(long j) {
    }

    public final void Dv9() {
    }

    public IFX(C52693Gb5 gb5) {
        this.A00 = gb5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (X.C56168Htx.A01(r6, false) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (X.C56168Htx.A01(r6, true) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r7 = this;
            X.Gb5 r6 = r7.A00
            r1 = 0
            X.5Oz r0 = r6.A0H
            r0.Epw(r1)
            X.5Oz r0 = r6.A0G
            r0.Epw(r1)
            r5 = 1
            X.C52693Gb5.A05(r6, r5)
            r6.A0B = r1
            X.5Oz r0 = r6.A0K
            long r0 = X.C51968G9o.A0G(r0)
            boolean r4 = X.C285965Tk.A03(r0)
            if (r4 == 0) goto L_0x005f
            X.HL2 r0 = X.HL2.Cursor
        L_0x0021:
            X.C52693Gb5.A01(r0, r6)
            X.Gc7 r2 = r6.A03
            r3 = 0
            if (r2 == 0) goto L_0x0038
            if (r4 != 0) goto L_0x0032
            boolean r0 = X.C56168Htx.A01(r6, r5)
            r1 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            X.5Oz r0 = r2.A0I
            X.C51967G9n.A16(r0, r1)
        L_0x0038:
            X.Gc7 r2 = r6.A03
            if (r2 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            boolean r0 = X.C56168Htx.A01(r6, r3)
            r1 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            X.5Oz r0 = r2.A0H
            X.C51967G9n.A16(r0, r1)
        L_0x004b:
            X.Gc7 r1 = r6.A03
            if (r1 == 0) goto L_0x005c
            if (r4 == 0) goto L_0x005d
            boolean r0 = X.C56168Htx.A01(r6, r5)
            if (r0 == 0) goto L_0x005d
        L_0x0057:
            X.5Oz r0 = r1.A0F
            X.C51967G9n.A16(r0, r5)
        L_0x005c:
            return
        L_0x005d:
            r5 = 0
            goto L_0x0057
        L_0x005f:
            X.HL2 r0 = X.HL2.Selection
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IFX.A00():void");
    }

    public final void DAT(long j) {
        C56553I1h A002;
        int A01;
        C285975Tl A0i;
        long A09;
        C59646JRo jRo;
        C52693Gb5 gb5 = this.A00;
        if (C51971G9r.A1W(gb5.A0J)) {
            C284945Oz r5 = gb5.A0K;
            if (C51973G9u.A05(r5) != 0) {
                gb5.A02 = C289295dM.A07(gb5.A02, j);
                C52754Gc7 gc7 = gb5.A03;
                if (!(gc7 == null || (A002 = C52754Gc7.A00(gc7)) == null)) {
                    C289295dM A0M = C51965G9l.A0M(C289295dM.A07(gb5.A01, gb5.A02));
                    C284945Oz r2 = gb5.A0G;
                    r2.Epw(A0M);
                    if (gb5.A0B != null || A002.A03(C51975G9x.A09(r2))) {
                        Integer num = gb5.A0B;
                        if (num != null) {
                            A01 = num.intValue();
                        } else {
                            A01 = A002.A01(gb5.A01, false);
                        }
                        int A012 = A002.A01(C51975G9x.A09(r2), false);
                        if (gb5.A0B != null || A01 != A012) {
                            A0i = C51966G9m.A0i(r5);
                            A09 = C51975G9x.A09(r2);
                            jRo = C56491HzN.A03;
                        } else {
                            return;
                        }
                    } else {
                        if (gb5.A08.FHr(A002.A01(gb5.A01, true)) == gb5.A08.FHr(A002.A01(C51975G9x.A09(r2), true))) {
                            jRo = C56491HzN.A01;
                        } else {
                            jRo = C56491HzN.A03;
                        }
                        A0i = C51966G9m.A0i(r5);
                        A09 = C51975G9x.A09(r2);
                    }
                    C52693Gb5.A00(jRo, gb5, A0i, A09, false, false, true);
                }
                C52693Gb5.A05(gb5, false);
            }
        }
    }

    public final void DmN(long j) {
        C56553I1h A002;
        C56553I1h A003;
        C52693Gb5 gb5 = this.A00;
        if (C51971G9r.A1W(gb5.A0J)) {
            C284945Oz r1 = gb5.A0H;
            if (r1.getValue() == null) {
                r1.Epw(HL1.SelectionEnd);
                gb5.A00 = -1;
                gb5.A08();
                C52754Gc7 gc7 = gb5.A03;
                long j2 = j;
                if (gc7 == null || (A003 = C52754Gc7.A00(gc7)) == null || !A003.A03(j)) {
                    C52754Gc7 gc72 = gb5.A03;
                    if (!(gc72 == null || (A002 = C52754Gc7.A00(gc72)) == null)) {
                        int FHr = gb5.A08.FHr(A002.A01(j, true));
                        C285975Tl r2 = new C285975Tl(C51966G9m.A0i(gb5.A0K).A01, (C285965Tk) null, C3026964x.A00(FHr, FHr));
                        gb5.A0E(false);
                        AnonymousClass5V6 r0 = gb5.A05;
                        if (r0 != null) {
                            ((AnonymousClass5V5) r0).A00.performHapticFeedback(9);
                        }
                        gb5.A0C.invoke(r2);
                    }
                } else {
                    C284945Oz r12 = gb5.A0K;
                    if (C51973G9u.A05(r12) != 0) {
                        gb5.A0E(false);
                        C285975Tl A0i = C51966G9m.A0i(r12);
                        gb5.A0B = Integer.valueOf(C51965G9l.A04(C52693Gb5.A00(C56491HzN.A03, gb5, new C285975Tl(A0i.A01, A0i.A02, C285965Tk.A01), j2, true, false, true)));
                    } else {
                        return;
                    }
                }
                C52693Gb5.A01(HL2.None, gb5);
                C52693Gb5.A03(gb5, j);
            }
        }
    }

    public final void onCancel() {
        A00();
    }

    public final void onStop() {
        A00();
    }
}
