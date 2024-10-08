package X;

import java.util.List;

/* renamed from: X.Or8  reason: case insensitive filesystem */
public final class C71807Or8 implements C323836yB {
    public final /* synthetic */ O7N A00;
    public final /* synthetic */ OF6 A01;

    public final void DqI(C324746zp r9) {
        OF6 of6 = this.A01;
        List list = of6.A03;
        if (list.get(r9.A01) == C67237MkX.A04 && !of6.A01) {
            1bO.A00(of6.A02).A0D(C300885y7.A00, (C74340PtG) null, "initial_snapshot");
            of6.A01 = true;
        }
        O7N o7n = this.A00;
        C67237MkX mkX = (C67237MkX) list.get(r9.A01);
        0qQ.A0B(mkX, 0);
        if (mkX == C67237MkX.A07) {
            C66633Ma2.A0S(o7n.A00);
        }
        C66633Ma2 ma2 = o7n.A00;
        C67479MoZ moZ = ma2.A0c;
        if (moZ != null) {
            moZ.A00(mkX.A00);
        }
        C66633Ma2.A0V(ma2, mkX);
        of6.A00 = r9.A01;
    }

    public final void DqN(C324746zp r1) {
    }

    public C71807Or8(O7N o7n, OF6 of6) {
        this.A01 = of6;
        this.A00 = o7n;
    }
}
