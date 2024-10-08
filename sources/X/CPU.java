package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class CPU extends 17P implements DUC {
    public User A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPU] */
    public final Integer CA7() {
        return getOptionalIntValueByHashCode(3711);
    }

    public final User CCd() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUC, X.CPU] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44429Cen.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPU] */
    public final Integer Abv() {
        return getOptionalIntValueByHashCode(-1412808770);
    }

    public final DUC E8x(1E9 r2) {
        this.A00 = C41847B3o.A0y(r2, this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CPU] */
    public final BHC FB1(1E9 r5) {
        User user;
        User A0b;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1412808770);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(3711);
        ImmutablePandoUserDict A0Z = C41846B3n.A0Z(this);
        if (A0Z == null || (A0b = C41845B3m.A0b(r5, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r5, A0b);
        }
        return new BHC(user, optionalIntValueByHashCode, optionalIntValueByHashCode2);
    }

    public final BHC FB2(1E6 r2) {
        return FB1(C41847B3o.A0q(r2));
    }
}
