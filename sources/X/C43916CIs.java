package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CIs  reason: case insensitive filesystem */
public final class C43916CIs extends 17P implements C279514yl {
    public final List BrQ() {
        return A08(896355159, C43917CIt.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIs, X.4yl] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B6c.A00(this));
    }

    public final Long BZc() {
        return A0L(-1174282985);
    }

    public final C279504yk F1j() {
        ArrayList arrayList;
        Long A0L = A0L(-1174282985);
        List<DSW> BrQ = BrQ();
        if (BrQ != null) {
            arrayList = AnonymousClass7TG.A0r(BrQ);
            for (DSW F1k : BrQ) {
                arrayList.add(F1k.F1k());
            }
        } else {
            arrayList = null;
        }
        return new C279504yk(A0L, arrayList);
    }
}
