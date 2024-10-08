package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CKC extends 17P implements C246213eD {
    public final List BIO() {
        return A08(-1598910135, CKB.class);
    }

    public final List BWW() {
        return A08(3387192, CKB.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3eD, X.CKC] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C370568wg.A00(this));
    }

    public final C246203eC F3E() {
        ArrayList arrayList;
        List BIO = BIO();
        ArrayList arrayList2 = null;
        if (BIO != null) {
            arrayList = AnonymousClass7TF.A0p(BIO);
            Iterator it = BIO.iterator();
            while (it.hasNext()) {
                C41846B3n.A1X(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        List BWW = BWW();
        if (BWW != null) {
            arrayList2 = AnonymousClass7TF.A0p(BWW);
            Iterator it2 = BWW.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1X(arrayList2, it2);
            }
        }
        return new C246203eC(arrayList, arrayList2);
    }
}
