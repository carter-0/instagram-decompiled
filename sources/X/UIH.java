package X;

import java.util.List;

public final class UIH extends C19023WGz {
    public final C17399VUa A00;
    public final C17400VUb A01;
    public final C10384RrL A02;
    public final W2K[] A03;

    public final C18556Vu8[] Aqy() {
        return null;
    }

    public final C10384RrL EIR(VXH vxh) {
        W2K[] w2kArr;
        C17399VUa vUa = this.A00;
        if (vUa != null) {
            w2kArr = C16776V5j.A00(vUa, vxh);
        } else {
            w2kArr = null;
        }
        this.A06.EAs(this, (W2K[]) null, w2kArr, this.A03, (String[]) null, this.A00);
        return this.A02;
    }

    public final C18556Vu8[] BU2() {
        C17399VUa vUa = this.A00;
        if (vUa != null) {
            return vUa.A02;
        }
        return null;
    }

    public final int BaR(String str) {
        Number A14 = C51966G9m.A14("min_bitrate", this.A01.A01);
        if (A14 == null) {
            return -1;
        }
        return A14.intValue();
    }

    public UIH(S7E s7e, X5t x5t, UIK uik, 0kX r6) {
        super(s7e, x5t, uik);
        C17399VUa vUa;
        C17400VUb A012 = W0W.A01(uik.A01);
        this.A01 = A012;
        W2K[] A032 = W0W.A03(A012, uik.A02);
        this.A03 = A032;
        this.A02 = new C10384RrL(this, A032);
        List list = uik.A00;
        if (list == null || list.isEmpty()) {
            vUa = null;
        } else {
            vUa = W0W.A00(r6, uik.A00);
        }
        this.A00 = vUa;
    }
}
