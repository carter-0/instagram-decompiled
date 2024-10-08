package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CHq  reason: case insensitive filesystem */
public final class C43897CHq extends 17P implements C257583xd {
    public List A00;

    public final List B1b() {
        List list = this.A00;
        if (list == null) {
            return A08(-1926923365, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3xd, X.CHq] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CUT.A00(this));
    }

    public final C257583xd E72(1E9 r4) {
        ArrayList arrayList;
        List B1b = B1b();
        if (B1b != null) {
            arrayList = AnonymousClass7TG.A0r(B1b);
            Iterator it = B1b.iterator();
            while (it.hasNext()) {
                C41848B3p.A1R(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final C257573xc F0I(1E9 r4) {
        ArrayList arrayList;
        List B1b = B1b();
        if (B1b != null) {
            arrayList = AnonymousClass7TG.A0r(B1b);
            Iterator it = B1b.iterator();
            while (it.hasNext()) {
                C41848B3p.A1S(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        return new C257573xc(arrayList);
    }
}
