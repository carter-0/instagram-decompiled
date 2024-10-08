package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CNH extends 17P implements DTM {
    public final List Abc() {
        return A08(-683992599, ImmutablePandoAndroidLink.class);
    }

    public final List BIw() {
        return A08(1180716295, ImmutablePandoAndroidLink.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CNH, X.DTM] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, Cc3.A00(this));
    }

    public final C42071BFz F7u() {
        ArrayList arrayList;
        List Abc = Abc();
        ArrayList arrayList2 = null;
        if (Abc != null) {
            arrayList = AnonymousClass7TF.A0p(Abc);
            Iterator it = Abc.iterator();
            while (it.hasNext()) {
                C41846B3n.A1W(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        List BIw = BIw();
        if (BIw != null) {
            arrayList2 = AnonymousClass7TF.A0p(BIw);
            Iterator it2 = BIw.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1W(arrayList2, it2);
            }
        }
        return new C42071BFz(arrayList, arrayList2, A0j(1753008747));
    }

    public final String getProductId() {
        return A0j(1753008747);
    }
}
