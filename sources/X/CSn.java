package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class CSn extends 17P implements DUJ {
    public User A00;

    public final User C4Y() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSn, X.DUJ] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45005Coi.A00(this));
    }

    public final String BGL() {
        return A0h(-877823861);
    }

    public final String C4Z() {
        return A0k(1769642752);
    }

    public final DUJ EAT(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -1741409040);
        return this;
    }

    public final C42140BIv FGW(1E9 r5) {
        User user;
        User A0b;
        String A0h = A0h(-877823861);
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -1741409040);
        if (A0Z == null || (A0b = C41845B3m.A0b(r5, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r5, A0b);
        }
        return new C42140BIv(user, A0h, A0k(1769642752));
    }

    public final C42140BIv FGX(1E6 r2) {
        return FGW(C41847B3o.A0q(r2));
    }
}
