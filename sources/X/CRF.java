package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.user.model.User;

public final class CRF extends 17P implements AnonymousClass5FT {
    public DTY A00;
    public User A01;

    public final long BEV() {
        return A03(3355);
    }

    public final DTY BTT() {
        DTY dty = this.A00;
        if (dty == null) {
            return (DTY) A05(689572632, CRE.class);
        }
        return dty;
    }

    public final User BZw() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'owner' field.");
    }

    public final GuideTypeStr CAN() {
        return (GuideTypeStr) A0M(3575610, C46132DNl.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5FT, com.facebook.pando.TreeJNI, X.CRF] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44744CkD.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRF] */
    public final boolean B5Z() {
        return getBooleanValueByHashCode(-1784166265);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRF] */
    public final int BWv() {
        return getIntValueByHashCode(1567799751);
    }

    public final long CC8() {
        return A03(747083410);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRF] */
    public final boolean CRY() {
        return getBooleanValueByHashCode(110813772);
    }

    public final AnonymousClass5FT E9l(1E9 r2) {
        DTY BTT = BTT();
        if (BTT != null) {
            BTT.E9k(r2);
        } else {
            BTT = null;
        }
        this.A00 = BTT;
        this.A01 = C41846B3n.A0c(r2, this, 106164915);
        return this;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CRF] */
    public final AnonymousClass5FS FEA(1E9 r15) {
        BIR bir;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1051141294);
        String A0T = A0T();
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(-1784166265);
        long A03 = A03(3355);
        boolean booleanValueByHashCode3 = getBooleanValueByHashCode(110813772);
        DTY BTT = BTT();
        if (BTT != null) {
            bir = BTT.FE8(r15);
        } else {
            bir = null;
        }
        int intValueByHashCode = getIntValueByHashCode(1567799751);
        String A0Y = A0Y();
        return new AnonymousClass5FS(CAN(), bir, C41847B3o.A0r(r15, this, 106164915), A0T, A0Y, intValueByHashCode, A03, A03(747083410), booleanValueByHashCode, booleanValueByHashCode2, booleanValueByHashCode3);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRF] */
    public final boolean getCanViewerReshare() {
        return getBooleanValueByHashCode(1051141294);
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getTitle() {
        return A0Y();
    }
}
