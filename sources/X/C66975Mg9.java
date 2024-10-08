package X;

import java.util.Map;

/* renamed from: X.Mg9  reason: case insensitive filesystem */
public final class C66975Mg9 implements C74503Pvy {
    public final C67106MiQ A00;
    public final C67098MiI A01;
    public final C66741Mbm A02;
    public final P3Z A03;
    public final C67014Mgn A04;
    public final C67517MpC A05;
    public final C74565PxE A06;
    public final C74566PxF A07;
    public final C74542Pwb A08;

    public C66975Mg9(C67106MiQ miQ, C67098MiI miI, C66741Mbm mbm, P3Z p3z, C67014Mgn mgn, C67517MpC mpC, C74542Pwb pwb) {
        0qQ.A0B(pwb, 2);
        this.A02 = mbm;
        this.A08 = pwb;
        this.A05 = mpC;
        this.A01 = miI;
        this.A04 = mgn;
        this.A00 = miQ;
        this.A03 = p3z;
        this.A06 = mgn.A08;
        this.A07 = mgn.A09;
    }

    public final void A8Y(Map map) {
        map.put("direct_inbox_infra_type", "open");
    }

    public final C74542Pwb B4p() {
        return this.A08;
    }

    public final C74565PxE B6g() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ C74510Pw5 BNZ() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C74395PuB BVW() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C74462PvH BbU() {
        return this.A05;
    }

    public final P3Z BbV() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C74504Pvz BzE() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ C74515PwA C61() {
        return this.A01;
    }

    public final C74566PxF C6W() {
        return this.A07;
    }
}
