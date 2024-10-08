package X;

public final class CNx extends 17P implements DS4 {
    public C46241DRw A00;
    public C46242DRx A01;
    public DSC A02;

    public final DS4 E87(1E9 r4) {
        C46241DRw dRw = this.A00;
        if (dRw == null) {
            dRw = (C46241DRw) A05(1055112536, CML.class);
        }
        DSC dsc = null;
        if (dRw != null) {
            dRw.E7e(r4);
        } else {
            dRw = null;
        }
        this.A00 = dRw;
        C46242DRx dRx = this.A01;
        if (dRx == null) {
            dRx = (C46242DRx) A05(-2007984445, C54419HCn.class);
        }
        if (dRx != null) {
            dRx.E7f(r4);
        } else {
            dRx = null;
        }
        this.A01 = dRx;
        DSC dsc2 = this.A02;
        if (!(dsc2 == null && (dsc2 = (DSC) A05(3682, CQ4.class)) == null)) {
            dsc2.E9G(r4);
            dsc = dsc2;
        }
        this.A02 = dsc;
        return this;
    }

    public final BGB F8d(1E9 r6) {
        BFZ bfz;
        C53452Gok F6L;
        C46241DRw dRw = this.A00;
        if (dRw == null) {
            dRw = (C46241DRw) A05(1055112536, CML.class);
        }
        C42100BHd bHd = null;
        if (dRw != null) {
            bfz = dRw.F6K(r6);
        } else {
            bfz = null;
        }
        C46242DRx dRx = this.A01;
        if (dRx == null && (dRx = (C46242DRx) A05(-2007984445, C54419HCn.class)) == null) {
            F6L = null;
        } else {
            F6L = dRx.F6L(r6);
        }
        DSC dsc = this.A02;
        if (!(dsc == null && (dsc = (DSC) A05(3682, CQ4.class)) == null)) {
            bHd = dsc.FC5(r6);
        }
        return new BGB(bfz, F6L, bHd);
    }
}
