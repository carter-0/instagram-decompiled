package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class CSm extends 17P implements C46296DTz {
    public User A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSm] */
    public final Integer CA7() {
        return getOptionalIntValueByHashCode(3711);
    }

    public final User CCd() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.CSm, X.17P] */
    public final C42139BIu FGU(1E9 r5) {
        User user;
        User A0b;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(3711);
        ImmutablePandoUserDict A0Z = C41846B3n.A0Z(this);
        if (A0Z == null || (A0b = C41845B3m.A0b(r5, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r5, A0b);
        }
        return new C42139BIu(user, A0K(3625706), optionalIntValueByHashCode);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSm, X.DTz] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45004Coh.A00(this));
    }

    public final Float CFx() {
        return A0K(3625706);
    }

    public final C46296DTz EAS(1E9 r2) {
        this.A00 = C41847B3o.A0y(r2, this);
        return this;
    }
}
