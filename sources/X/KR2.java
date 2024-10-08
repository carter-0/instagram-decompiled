package X;

import java.util.ArrayList;
import java.util.List;

public final class KR2 extends OO0 {
    public final LZE A00;

    public KR2(AnonymousClass4D6 r2, LZE lze, C65267LqM lqM) {
        super(r2, lqM, true);
        this.A00 = lze;
    }

    public final /* bridge */ /* synthetic */ void A00(1XP r6, String str) {
        C61293K1g k1g = (C61293K1g) r6;
        0qQ.A0B(k1g, 0);
        List<C317486nL> A16 = JTR.A16(k1g.A01.A02);
        0qQ.A07(A16);
        ArrayList A0r = AnonymousClass7TG.A0r(A16);
        for (C317486nL r1 : A16) {
            0qQ.A0A(r1);
            A0r.add(new C317456nI(r1));
        }
        LZE lze = this.A00;
        LZE.A00(lze, false);
        lze.A02.A05(A0r);
    }

    public final void A01(C268654dm r3, String str) {
        LZE.A00(this.A00, false);
    }

    public final void A02(String str) {
        LZE.A00(this.A00, true);
    }
}
