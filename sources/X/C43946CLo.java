package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CLo  reason: case insensitive filesystem */
public final class C43946CLo extends 17P implements C46297DUa {
    public final List C9X() {
        return A08(-405853034, C43947CLq.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUa, X.CLo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44198CZl.A00(this));
    }

    public final String B0s() {
        return A0i(-1226012370);
    }

    public final String BZ0() {
        return A0i(-740105691);
    }

    public final String Bzi() {
        return A0i(1462626351);
    }

    public final BFH F5J() {
        ArrayList arrayList;
        String A0r = C41845B3m.A0r(this);
        String A0i = A0i(-1226012370);
        String A0e = A0e();
        String A0i2 = A0i(-740105691);
        String A0i3 = A0i(1462626351);
        String A0p = C41845B3m.A0p(this);
        List<C46250DSf> C9X = C9X();
        if (C9X != null) {
            arrayList = AnonymousClass7TG.A0r(C9X);
            for (C46250DSf F5M : C9X) {
                arrayList.add(F5M.F5M());
            }
        } else {
            arrayList = null;
        }
        return new BFH(A0r, A0i, A0e, A0i2, A0i3, A0p, arrayList);
    }

    public final String getBackgroundColor() {
        return C41845B3m.A0r(this);
    }

    public final String getId() {
        return A0e();
    }

    public final String getTextColor() {
        return C41845B3m.A0p(this);
    }
}
