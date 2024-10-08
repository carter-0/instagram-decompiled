package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.ArrayList;
import java.util.List;

public final class CL2 extends 17P implements DTE {
    public final List Axn() {
        return A08(2122981139, CL3.class);
    }

    public final IGPostClickEligibleExperienceTypes B0e() {
        return (IGPostClickEligibleExperienceTypes) A0N(176560507, DL1.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DTE, X.CL2] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44181CYu.A00(this));
    }

    public final String Axp() {
        return A0i(682813800);
    }

    public final BF6 F4G() {
        ArrayList arrayList;
        List<DTF> Axn = Axn();
        if (Axn != null) {
            arrayList = AnonymousClass7TG.A0r(Axn);
            for (DTF F4H : Axn) {
                arrayList.add(F4H.F4H());
            }
        } else {
            arrayList = null;
        }
        return new BF6(B0e(), A0i(682813800), arrayList);
    }
}
