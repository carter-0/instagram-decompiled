package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;

public final class CRC extends 17P implements C46312DUp {
    public DTY A00;

    public final DTY BTT() {
        DTY dty = this.A00;
        if (dty == null) {
            return (DTY) A05(689572632, CRE.class);
        }
        return dty;
    }

    public final GuideTypeStr CAN() {
        return (GuideTypeStr) A0M(3575610, C46130DNj.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CRC, com.facebook.pando.TreeJNI, X.DUp] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44739Ck7.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CRC, com.facebook.pando.TreeJNI] */
    public final int BWv() {
        return getIntValueByHashCode(1567799751);
    }

    public final C46312DUp E9i(1E9 r2) {
        DTY BTT = BTT();
        if (BTT != null) {
            BTT.E9k(r2);
        } else {
            BTT = null;
        }
        this.A00 = BTT;
        return this;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.CRC, com.facebook.pando.TreeJNI, X.17P] */
    public final BIP FE6(1E9 r8) {
        BIR bir;
        String A0T = A0T();
        String A0g = A0g();
        DTY BTT = BTT();
        if (BTT != null) {
            bir = BTT.FE8(r8);
        } else {
            bir = null;
        }
        int intValueByHashCode = getIntValueByHashCode(1567799751);
        return new BIP(CAN(), bir, A0T, A0g, A0Y(), intValueByHashCode);
    }

    public final BIP FE7(1E6 r2) {
        return FE6(C41846B3n.A0S(r2));
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getId() {
        return A0g();
    }

    public final String getTitle() {
        return A0Y();
    }
}
