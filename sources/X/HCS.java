package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.util.ArrayList;
import java.util.List;

public final class HCS extends 17P implements C269904fs {
    public final List BIP() {
        return A08(502611593, HCR.class);
    }

    public final AfiInterestsRecoStyle C21() {
        return (AfiInterestsRecoStyle) A0N(109780401, J00.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.4fs, X.HCS] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, HTJ.A00(this));
    }

    public final String B2Z() {
        return A0i(-1319702228);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.HCS] */
    public final Integer B2c() {
        return getOptionalIntValueByHashCode(-1311205448);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.HCS] */
    public final Integer BXG() {
        return getOptionalIntValueByHashCode(-1888824590);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, X.17P, X.HCS] */
    public final C53432GoP F0O() {
        ArrayList arrayList;
        String A0i = A0i(-1319702228);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1311205448);
        List<JSM> BIP = BIP();
        if (BIP != null) {
            arrayList = AnonymousClass7TG.A0r(BIP);
            for (JSM F0N : BIP) {
                arrayList.add(F0N.F0N());
            }
        } else {
            arrayList = null;
        }
        return new C53432GoP(C21(), optionalIntValueByHashCode, getOptionalIntValueByHashCode(-1888824590), A0i, A0U(), A0Y(), arrayList);
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0Y();
    }
}
