package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CSo extends 17P implements DT7 {
    public List A00;

    public final List C4e() {
        List list = this.A00;
        if (list == null) {
            return A0o(1981727545, CSn.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSo, X.DT7] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45006Coj.A00(this));
    }

    public final DT7 EAU(1E9 r4) {
        List<DUJ> C4e = C4e();
        ArrayList A0r = AnonymousClass7TG.A0r(C4e);
        for (DUJ duj : C4e) {
            duj.EAT(r4);
            A0r.add(duj);
        }
        this.A00 = A0r;
        return this;
    }

    public final C42141BIw FGV(1E9 r4) {
        List<DUJ> C4e = C4e();
        ArrayList A0r = AnonymousClass7TG.A0r(C4e);
        for (DUJ FGW : C4e) {
            A0r.add(FGW.FGW(r4));
        }
        return new C42141BIw(A0r);
    }
}
