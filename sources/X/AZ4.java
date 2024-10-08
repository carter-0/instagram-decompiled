package X;

import java.util.List;

public final class AZ4 implements C41815B1v {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AZ4(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    public final void DOX() {
        switch (this.A00) {
            case 0:
                C386049jy r5 = (C386049jy) this.A05;
                r5.EE1(this);
                C387519mL r4 = (C387519mL) this.A02;
                AnonymousClass87H r2 = r4.A08;
                r2.A0C(r5, C39906AIv.A01(), true);
                C387519mL.A01(r4);
                1Xj r0 = (1Xj) this.A03;
                C387519mL.A02(r4, r0);
                C39740A7g A002 = AnonymousClass87H.A00(r2, r0);
                A002.A03 = C387519mL.A00(r4.A03, r5.A01.A01, r4.A07);
                r4.A01.add(A002);
                C387519mL.A03(r4, (List) this.A04, this.A01 + 1);
                return;
            case 1:
                C386049jy r1 = (C386049jy) this.A04;
                r1.EE1(this);
                C387539mN r52 = (C387539mN) this.A05;
                AnonymousClass87H r6 = r52.A0B;
                r6.A0C(r1, C39906AIv.A01(), true);
                C387539mN.A00(r52);
                1Xj r3 = (1Xj) this.A02;
                String id = r3.getId();
                if (id != null) {
                    C366678pU A032 = r6.A03((C349307zv) null, id);
                    0qQ.A07(A032);
                    String id2 = r3.getId();
                    if (id2 != null) {
                        C39740A7g a7g = new C39740A7g(A032, id2);
                        a7g.A00 = r52.A00;
                        List list = (List) this.A03;
                        int i = this.A01;
                        if (r52.A04) {
                            r52.A03.add(a7g);
                            i++;
                        } else {
                            r52.A04 = true;
                        }
                        C387539mN.A03(r52, list, i);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            default:
                ((C268684dp) this.A03).EE1(this);
                C387539mN r53 = (C387539mN) this.A05;
                AnonymousClass87H r42 = r53.A0B;
                r42.A08(r53.A01);
                1Xj r32 = (1Xj) this.A02;
                String id3 = r32.getId();
                if (id3 != null) {
                    C366678pU A033 = r42.A03((C349307zv) null, id3);
                    0qQ.A07(A033);
                    String id4 = r32.getId();
                    if (id4 != null) {
                        C39740A7g a7g2 = new C39740A7g(A033, id4);
                        a7g2.A00 = r53.A00;
                        r53.A03.add(a7g2);
                        C387539mN.A03(r53, (List) this.A04, this.A01 + 1);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void DXr() {
    }
}
