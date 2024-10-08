package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CPi  reason: case insensitive filesystem */
public final class C43993CPi extends 17P implements DUT {
    public List A00;

    public final List BRk() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'mentionedUsers' field.");
    }

    public final DUT E98(1E9 r4) {
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUT, X.CPi] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44447Cf5.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPi] */
    public final Integer Bzh() {
        return getOptionalIntValueByHashCode(1462626351);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.CPi, X.17P] */
    public final BHP FBR(1E9 r6) {
        String A0g = A0g();
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
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
        return new BHP(getOptionalIntValueByHashCode(1462626351), A0g, A0X(), A0r2);
    }

    public final BHP FBS(1E6 r2) {
        return FBR(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0g();
    }

    public final String getText() {
        return A0X();
    }
}
