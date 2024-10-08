package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class CJK extends 17P implements DUK {
    public User A00;

    public final User Ad7() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CJK, com.facebook.pando.TreeJNI, X.DUK] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWP.A00(this));
    }

    public final String Ad1() {
        return A0i(-1249066087);
    }

    public final String Ad6() {
        return A0j(1123048935);
    }

    public final String Ad9() {
        return A0i(-900411602);
    }

    public final DUK E7G(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -927272610);
        return this;
    }

    public final BES F2A(1E9 r6) {
        User user;
        User A0b;
        String A0i = A0i(-1249066087);
        String A0j = A0j(1123048935);
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -927272610);
        if (A0Z == null || (A0b = C41845B3m.A0b(r6, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r6, A0b);
        }
        return new BES(user, A0i, A0j, A0i(-900411602));
    }

    public final BES F2B(1E6 r2) {
        return F2A(C41846B3n.A0S(r2));
    }
}
