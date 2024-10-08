package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CP7 extends 17P implements DTR {
    public List A00;

    public final List BnO() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'requesters' field.");
    }

    public final DTR E8g(1E9 r4) {
        List A0o = A0o(37116023, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    public final C42096BGz FAO(1E9 r5) {
        List A0o = A0o(37116023, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r5, A0r, it);
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41847B3o.A1Q(r5, A0r2, it2);
        }
        return new C42096BGz(A0r2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DTR, X.CP7] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44407CeR.A00(this));
    }

    public final C42096BGz FAP(1E6 r2) {
        return FAO(C41846B3n.A0S(r2));
    }
}
