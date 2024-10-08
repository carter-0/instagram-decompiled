package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideMediaType;

public final class CRE extends 17P implements DTY {
    public DTX A00;

    public final DTX AqS() {
        DTX dtx = this.A00;
        if (dtx == null) {
            return (DTX) A04(951530617, CRD.class);
        }
        return dtx;
    }

    public final GuideMediaType CAM() {
        return (GuideMediaType) A0M(3575610, C46131DNk.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DTY, X.CRE] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44743CkC.A00(this));
    }

    public final DTY E9k(1E9 r2) {
        DTX AqS = AqS();
        AqS.E9j(r2);
        this.A00 = AqS;
        return this;
    }

    public final BIR FE8(1E9 r4) {
        return new BIR(CAM(), AqS().FE9(r4));
    }
}
