package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class COS extends 17P implements AnonymousClass536 {
    public User A00;

    public final User ByI() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'sponsor' field.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COS, X.536] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44365Cdl.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COS] */
    public final Boolean Bbh() {
        return getOptionalBooleanValueByHashCode(-517618225);
    }

    public final String ByJ() {
        return A0j(722276448);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COS] */
    public final Boolean CYy() {
        return getOptionalBooleanValueByHashCode(817722242);
    }

    public final AnonymousClass536 E8F(1E9 r2) {
        this.A00 = C41846B3n.A0c(r2, this, -1998892262);
        return this;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.17P, X.COS] */
    public final AnonymousClass535 F9G(1E9 r7) {
        return new AnonymousClass535(C41847B3o.A0r(r7, this, -1998892262), getOptionalBooleanValueByHashCode(817722242), getOptionalBooleanValueByHashCode(-517618225), A0j(722276448), C41845B3m.A0q(this));
    }

    public final AnonymousClass535 F9H(1E6 r2) {
        return F9G(C41846B3n.A0S(r2));
    }

    public final String getUsername() {
        return C41845B3m.A0q(this);
    }
}
