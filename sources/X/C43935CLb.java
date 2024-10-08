package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CLb  reason: case insensitive filesystem */
public final class C43935CLb extends 17P implements C257983yH {
    public final List BVS() {
        return A08(-225550348, C16092UoQ.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3yH, X.CLb] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CZO.A00(this));
    }

    public final BFC F52() {
        ArrayList arrayList;
        List<C21034XAn> BVS = BVS();
        if (BVS != null) {
            arrayList = AnonymousClass7TG.A0r(BVS);
            for (C21034XAn F4m : BVS) {
                arrayList.add(F4m.F4m());
            }
        } else {
            arrayList = null;
        }
        return new BFC(arrayList);
    }
}
