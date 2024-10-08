package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CQ8 extends 17P implements AnonymousClass3IQ {
    public List A00;

    public final List C2y() {
        List list = this.A00;
        if (list == null) {
            return A08(-1977568904, CQ6.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3IQ, X.CQ8] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44489Cfl.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ8] */
    public final Integer BdP() {
        return getOptionalIntValueByHashCode(929798881);
    }

    public final String C30() {
        return A0j(-1835623808);
    }

    public final AnonymousClass3IQ E9K(1E9 r4) {
        ArrayList arrayList;
        List<C46302DUf> C2y = C2y();
        if (C2y != null) {
            arrayList = AnonymousClass7TG.A0r(C2y);
            for (C46302DUf dUf : C2y) {
                dUf.E9I(r4);
                arrayList.add(dUf);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CQ8] */
    public final AnonymousClass3IP FC9(1E9 r5) {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(929798881);
        List<C46302DUf> C2y = C2y();
        if (C2y != null) {
            arrayList = AnonymousClass7TG.A0r(C2y);
            for (C46302DUf FC7 : C2y) {
                arrayList.add(FC7.FC7(r5));
            }
        } else {
            arrayList = null;
        }
        return new AnonymousClass3IP(optionalIntValueByHashCode, A0j(-1835623808), arrayList);
    }
}
