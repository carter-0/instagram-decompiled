package X;

import java.util.ArrayList;

/* renamed from: X.8kX  reason: invalid class name and case insensitive filesystem */
public class C363898kX extends C341317mg implements C341297me {
    public C344477rv A00;
    public C390989sA A01;
    public C341147mP A02;
    public boolean A03;
    public boolean A04;

    public boolean A0B(C390989sA r3, boolean z) {
        0qQ.A0B(r3, 0);
        if (this.A01 == r3) {
            return false;
        }
        A01();
        if (A03(r3)) {
            return true;
        }
        A03(this.A01);
        return false;
    }

    private final void A01() {
        C343697qe Ape = this.A00.Ape(this.A01.A00);
        0qQ.A07(Ape);
        if (Ape instanceof C344327rg) {
            Ape.pause();
        } else if (Ape instanceof C382249dO) {
            if (!this.A04) {
                Ape.APC();
                C345107sw r1 = ((C382249dO) Ape).A06;
                if (r1 != null) {
                    r1.EeQ(C40150ATq.A00);
                } else {
                    0qQ.A0F("input");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        } else if (Ape instanceof B3R) {
            Ape.APC();
        }
    }

    private final boolean A03(C390989sA r13) {
        String str;
        C343837qt r2 = this.A00;
        C343717qg r1 = r13.A00;
        if (!r2.CQN(r1)) {
            return false;
        }
        C343697qe Ape = r2.Ape(r1);
        0qQ.A07(Ape);
        if (Ape instanceof C344327rg) {
            Ape.EIx();
        } else if (Ape instanceof C382249dO) {
            if (this.A04) {
                return false;
            }
            C382249dO r22 = (C382249dO) Ape;
            C345107sw r12 = r22.A06;
            if (r12 != null) {
                r12.EeQ(new C40148ATo(this));
                C345067ss A0C = r22.A0C();
                C344407ro r14 = new C344407ro();
                C345107sw r0 = r22.A06;
                if (r0 != null) {
                    C346277uu r3 = new C346277uu(r14, r0, false);
                    if (this.A03) {
                        r3.A00 = 9;
                    }
                    C344477rv r02 = this.A00;
                    str = "mediaGraphController";
                    if (r02 != null) {
                        r02.BQ8().EZt(r3, 0);
                        C344477rv r5 = this.A00;
                        if (r5 != null) {
                            r5.FLA(0, A0C.A01, A0C.A00, true, 1080, 1920);
                            r22.ARH();
                            C341147mP r15 = this.A02;
                            if (r15 == null) {
                                str = "renderController";
                            } else {
                                r15.EwL(new AU7(this));
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            str = "input";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else if (!(Ape instanceof B3R)) {
            return false;
        } else {
            Ape.ARH();
        }
        this.A01 = r13;
        return true;
    }

    public void A0A() {
        C390989sA r1 = this.A01;
        C390989sA r0 = C390989sA.A03;
        if (r1 != r0) {
            A01();
            this.A01 = r0;
        }
    }

    public void A09() {
        super.A09();
        C343717qg r5 = C344477rv.A01;
        C343837qt r4 = this.A00;
        if (!r4.CQN(r5)) {
            C341317mg.A00(C344477rv.class);
            this.A04 = true;
        }
        C343717qg r2 = C344447rs.A00;
        if (!r4.CQN(r2)) {
            C341317mg.A00(C344447rs.class);
            this.A04 = true;
        }
        if (0qQ.A0K(r4.Apu(C341297me.A00), true)) {
            this.A03 = true;
        }
        this.A00 = (C344477rv) r4.Ape(r5);
        this.A02 = ((C344447rs) r4.Ape(r2)).Blg();
        C390989sA[] values = C390989sA.values();
        ArrayList<C390989sA> arrayList = new ArrayList<>();
        for (C390989sA r1 : values) {
            if (r1 != C390989sA.A03 && r4.CQN(r1.A00)) {
                arrayList.add(r1);
            }
        }
        ArrayList<C343707qf> arrayList2 = new ArrayList<>(0Yv.A1E(arrayList, 10));
        for (C390989sA r0 : arrayList) {
            C343697qe Ape = r4.Ape(r0.A00);
            0qQ.A07(Ape);
            arrayList2.add(Ape);
        }
        for (C343707qf APC : arrayList2) {
            APC.APC();
        }
    }
}
