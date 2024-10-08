package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CIg  reason: case insensitive filesystem */
public final class C43907CIg extends 17P implements C270534gt {
    public final List B9M() {
        return A08(-798613960, CKP.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIg, X.4gt] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44085CVc.A00(this));
    }

    public final BE7 F1V() {
        ArrayList arrayList;
        List<C46279DTi> B9M = B9M();
        if (B9M != null) {
            arrayList = AnonymousClass7TG.A0r(B9M);
            for (C46279DTi F3R : B9M) {
                arrayList.add(F3R.F3R());
            }
        } else {
            arrayList = null;
        }
        return new BE7(arrayList);
    }
}
