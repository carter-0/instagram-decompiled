package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDictImpl;
import com.instagram.api.schemas.ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict;

public final class CL5 extends 17P implements C257813y0 {
    public final C279794zK B68() {
        return (C279794zK) A05(489495828, CL7.class);
    }

    public final C279774zI BMA() {
        return (C279774zI) A05(-806921072, CL4.class);
    }

    public final IGLeadGenSubheaderTrustSignalDataDict CA2() {
        return (IGLeadGenSubheaderTrustSignalDataDict) A05(-1640432774, ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CL5, X.3y0] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44185CYy.A00(this));
    }

    public final C279784zJ F4J() {
        AnonymousClass54h r2;
        B47 b47;
        C279794zK B68 = B68();
        IGLeadGenSubheaderTrustSignalDataDictImpl iGLeadGenSubheaderTrustSignalDataDictImpl = null;
        if (B68 != null) {
            r2 = B68.F4L();
        } else {
            r2 = null;
        }
        C279774zI BMA = BMA();
        if (BMA != null) {
            b47 = BMA.F4I();
        } else {
            b47 = null;
        }
        IGLeadGenSubheaderTrustSignalDataDict CA2 = CA2();
        if (CA2 != null) {
            iGLeadGenSubheaderTrustSignalDataDictImpl = CA2.F4M();
        }
        return new C279784zJ(b47, r2, iGLeadGenSubheaderTrustSignalDataDictImpl);
    }
}
