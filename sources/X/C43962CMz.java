package X;

/* renamed from: X.CMz  reason: case insensitive filesystem */
public final class C43962CMz extends 17P implements DSN {
    public C66563MWr A00;
    public C66566MWu A01;

    public final C66563MWr AmG() {
        C66563MWr mWr = this.A00;
        if (mWr == null) {
            return (C66563MWr) A05(50511102, CIU.class);
        }
        return mWr;
    }

    public final C66566MWu BdJ() {
        C66566MWu mWu = this.A01;
        if (mWu == null) {
            return (C66566MWu) A05(1879474642, CMx.class);
        }
        return mWu;
    }

    public final DSN E7w(1E9 r3) {
        C66563MWr AmG = AmG();
        C66566MWu mWu = null;
        if (AmG != null) {
            AmG.E79(r3);
        } else {
            AmG = null;
        }
        this.A00 = AmG;
        C66566MWu BdJ = BdJ();
        if (BdJ != null) {
            BdJ.E7u(r3);
            mWu = BdJ;
        }
        this.A01 = mWu;
        return this;
    }
}
