package X;

import java.util.Map;

/* renamed from: X.Mkf  reason: case insensitive filesystem */
public final class C67245Mkf implements C74503Pvy {
    public final C67247Mkh A00;
    public final C74515PwA A01;
    public final C66752Mbx A02;
    public final C74504Pvz A03;
    public final C67054MhR A04;
    public final C74542Pwb A05;
    public final C74565PxE A06;
    public final C74566PxF A07;

    public C67245Mkf(C67247Mkh mkh, C74515PwA pwA, C66752Mbx mbx, C74504Pvz pvz, C67054MhR mhR, C74542Pwb pwb) {
        0qQ.A0B(pwb, 2);
        this.A02 = mbx;
        this.A05 = pwb;
        this.A04 = mhR;
        this.A01 = pwA;
        this.A03 = pvz;
        this.A00 = mkh;
        this.A06 = pvz.B6g();
        this.A07 = pvz.C6W();
    }

    public final void A8Y(Map map) {
        map.put("direct_inbox_infra_type", "msys");
    }

    public final C74542Pwb B4p() {
        return this.A05;
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
        return this.A04;
    }

    public final P3Z BbV() {
        return null;
    }

    public final C74504Pvz BzE() {
        return this.A03;
    }

    public final C74515PwA C61() {
        return this.A01;
    }

    public final C74566PxF C6W() {
        return this.A07;
    }
}
