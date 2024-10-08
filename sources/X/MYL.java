package X;

import java.util.Iterator;

public abstract class MYL extends 2YL {
    public final C249513ju A00;
    public final AnonymousClass0r6 A01;
    public final AnonymousClass0Ud A02;
    public final 05G A03;

    public final void A0Q(C74260Pro pro, long j) {
        if (j > 0) {
            C70290O0u.A00(this, new MH0((Object) pro, (Object) this, (AnonymousClass4D7) null, 22), j);
            return;
        }
        AnonymousClass7TE.A1Z(new MH0((Object) pro, (Object) this, (AnonymousClass4D7) null, 23), C318116oQ.A00(this));
    }

    public final JM9 A0O() {
        return (JM9) this.A03.getValue();
    }

    public final void A0P(C74260Pro pro) {
        A0Q(pro, 0);
    }

    public final void A0R(0sP r4) {
        Object value;
        05G r2 = this.A03;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, r4.invoke(value)));
    }

    public MYL(JM9 jm9) {
        1HR A1G = JTO.A1G(Integer.MAX_VALUE);
        this.A00 = A1G;
        this.A01 = 0u9.A04(A1G);
        02z A10 = DbS.A10(jm9);
        this.A03 = A10;
        this.A02 = 10b.A03(A10);
    }

    public static O93 A01(MYL myl) {
        return ((C68280N8r) myl.A0O()).A00;
    }

    public static Iterator A02(MYL myl) {
        return ((C68280N8r) myl.A0O()).A03.iterator();
    }
}
