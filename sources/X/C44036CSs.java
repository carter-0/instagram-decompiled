package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CSs  reason: case insensitive filesystem */
public final class C44036CSs extends 17P implements DST {
    public final List B2Y() {
        return A08(100893, C44037CSt.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DST, X.CSs] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45095CqD.A00(this));
    }

    public final C42142BIx FGb() {
        ArrayList arrayList;
        List<C46272DTb> B2Y = B2Y();
        if (B2Y != null) {
            arrayList = AnonymousClass7TG.A0r(B2Y);
            for (C46272DTb FGc : B2Y) {
                arrayList.add(FGc.FGc());
            }
        } else {
            arrayList = null;
        }
        return new C42142BIx(arrayList);
    }
}
