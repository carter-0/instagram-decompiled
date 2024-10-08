package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CRB extends 17P implements DUG {
    public List A00;

    public final List AoF() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'clipsSpins' field.");
    }

    public final DUG E9h(1E9 r4) {
        List A0o = A0o(1377047637, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.CRB, X.17P] */
    public final BIO FE4(1E9 r5) {
        List A0o = A0o(1377047637, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r5, A0r, it);
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41848B3p.A1V(r5, A0r2, it2);
        }
        return new BIO(A0i(801940329), A0r2, getBooleanValueByHashCode(-1932541039));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRB, X.DUG] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44737Ck5.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRB] */
    public final boolean BUF() {
        return getBooleanValueByHashCode(-1932541039);
    }

    public final String BaN() {
        return A0i(801940329);
    }

    public final BIO FE5(1E6 r2) {
        return FE4(C41846B3n.A0S(r2));
    }
}
