package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CSg extends 17P implements DUZ {
    public List A00;

    public final List CG0() {
        List list = this.A00;
        if (list == null) {
            return A0o(-810660181, CSf.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUZ, X.CSg] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44985CoO.A00(this));
    }

    public final String BP8() {
        return A0j(-1081138730);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSg] */
    public final boolean BU8() {
        return getBooleanValueByHashCode(1024940639);
    }

    public final DUZ EAO(1E9 r4) {
        List<DUY> CG0 = CG0();
        ArrayList A0r = AnonymousClass7TG.A0r(CG0);
        for (DUY duy : CG0) {
            duy.EAN(r4);
            A0r.add(duy);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CSg] */
    public final C42138BIt FGM(1E9 r7) {
        String A0j = A0j(-1081138730);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1024940639);
        String A0k = A0k(-397914725);
        List<DUY> CG0 = CG0();
        ArrayList A0r = AnonymousClass7TG.A0r(CG0);
        for (DUY FGL : CG0) {
            A0r.add(FGL.FGL(r7));
        }
        return new C42138BIt(A0r, booleanValueByHashCode, A0j, A0k);
    }

    public final C42138BIt FGN(1E6 r2) {
        return FGM(C41847B3o.A0q(r2));
    }

    public final String getPollId() {
        return A0k(-397914725);
    }
}
