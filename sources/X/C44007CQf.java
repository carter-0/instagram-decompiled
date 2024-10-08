package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CQf  reason: case insensitive filesystem */
public final class C44007CQf extends 17P implements DT2 {
    public final List B0d() {
        return A08(654519859, C44008CQg.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DT2, X.CQf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44563Cgx.A00(this));
    }

    public final String BTA() {
        return A0j(-1193720462);
    }

    public final BI7 FD7() {
        ArrayList arrayList;
        List<C46291DTu> B0d = B0d();
        if (B0d != null) {
            arrayList = AnonymousClass7TG.A0r(B0d);
            for (C46291DTu FD8 : B0d) {
                arrayList.add(FD8.FD8());
            }
        } else {
            arrayList = null;
        }
        return new BI7(arrayList, A0j(-1193720462));
    }
}
