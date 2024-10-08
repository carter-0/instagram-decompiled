package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CKN extends 17P implements C266554Zl {
    public List A00;

    public final List B3g() {
        return this.A00;
    }

    public final C266554Zl E7S(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(549161688, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final C266544Zk F3P(1E9 r8) {
        ArrayList arrayList;
        ImmutableList A08 = A08(549161688, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r8, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1Q(r8, arrayList, it2);
                }
                return new C266544Zk(A0g(), A0h(1932263261), A0h(-2060497896), A0S(), A0h(3575610), arrayList);
            }
        }
        arrayList = null;
        return new C266544Zk(A0g(), A0h(1932263261), A0h(-2060497896), A0S(), A0h(3575610), arrayList);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.4Zl, X.CKN] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CY6.A00(this));
    }

    public final String BfT() {
        return A0h(1932263261);
    }

    public final String CAh() {
        return A0h(3575610);
    }

    public final String getId() {
        return A0g();
    }

    public final String getSubtitle() {
        return A0h(-2060497896);
    }

    public final String getTitle() {
        return A0S();
    }
}
