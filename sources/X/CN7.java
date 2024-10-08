package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class CN7 extends 17P implements C279644yz {
    public User A00;

    public final User BRo() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.4yz, X.CN7] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44245Cbg.A00(this));
    }

    public final String An9() {
        return A0i(1523138936);
    }

    public final C279644yz E7y(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -505296440);
        return this;
    }

    public final C279634yy F7e(1E9 r9) {
        User user;
        User A0b;
        String A0i = A0i(1523138936);
        String A0i2 = A0i(-1711795453);
        String A0i3 = A0i(-1385596165);
        String A0i4 = A0i(-450506855);
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -505296440);
        if (A0Z == null || (A0b = C41845B3m.A0b(r9, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r9, A0b);
        }
        return new C279634yy(user, A0i, A0i2, A0i3, A0i4, A0W(), A0j(1753008747));
    }

    public final C279634yy F7f(1E6 r2) {
        return F7e(C41846B3n.A0S(r2));
    }

    public final String getCurrentPrice() {
        return A0i(-1711795453);
    }

    public final String getExternalUrl() {
        return A0i(-1385596165);
    }

    public final String getFullPrice() {
        return A0i(-450506855);
    }

    public final String getName() {
        return A0W();
    }

    public final String getProductId() {
        return A0j(1753008747);
    }
}
