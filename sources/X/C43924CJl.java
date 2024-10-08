package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CJl  reason: case insensitive filesystem */
public final class C43924CJl extends 17P implements DTD {
    public final List Abc() {
        return A08(-683992599, ImmutablePandoAndroidLink.class);
    }

    public final List BIw() {
        return A08(1180716295, ImmutablePandoAndroidLink.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DTD, com.facebook.pando.TreeJNI, X.CJl] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CXJ.A00(this));
    }

    public final String Azc() {
        return A0j(986649031);
    }

    public final C42028BEd F2i() {
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
        String A0j = A0j(986649031);
        List BIw = BIw();
        if (BIw != null) {
            arrayList2 = AnonymousClass7TF.A0p(BIw);
            Iterator it2 = BIw.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1W(arrayList2, it2);
            }
        }
        return new C42028BEd(arrayList, arrayList2, A0j);
    }
}
