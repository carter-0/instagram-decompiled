package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class KVZ extends 17P implements C2816758y {
    public final C2816558w AqC() {
        return (C2816558w) A04(1356895302, KVV.class);
    }

    public final C2816258t BcY() {
        return (C2816258t) A04(-2123773938, KVW.class);
    }

    public final List C7B() {
        return A0o(-1278380824, KVX.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.KVZ, X.58y] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C63022KqD.A00(this), this);
    }

    public final long Ax0() {
        return A03(549122670);
    }

    public final long Ax1() {
        return A03(466154226);
    }

    public final long Baw() {
        return A03(1375279474);
    }

    public final C2816658x F5b() {
        C2816458v F5X = AqC().F5X();
        long A03 = A03(549122670);
        long A032 = A03(466154226);
        long A033 = A03(1375279474);
        C2816158s F5Y = BcY().F5Y();
        List<C2815958q> C7B = C7B();
        ArrayList A0r = AnonymousClass7TG.A0r(C7B);
        for (C2815958q F5Z : C7B) {
            A0r.add(F5Z.F5Z());
        }
        return new C2816658x(F5X, F5Y, A0r, A03, A032, A033);
    }
}
