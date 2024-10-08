package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CPX extends 17P implements C46288DTr {
    public List A00;

    public final List Bjt() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'reactors' field.");
    }

    public final C46288DTr E90(1E9 r4) {
        List A0o = A0o(-867503855, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DTr, X.CPX] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44434Ces.A00(this));
    }

    public final BHF FB8(1E9 r6) {
        String A0h = A0h(96632902);
        List A0o = A0o(-867503855, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r6, A0r, it);
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41847B3o.A1Q(r6, A0r2, it2);
        }
        return new BHF(A0h, A0r2);
    }

    public final BHF FB9(1E6 r2) {
        return FB8(C41846B3n.A0S(r2));
    }

    public final String getEmoji() {
        return A0h(96632902);
    }
}
