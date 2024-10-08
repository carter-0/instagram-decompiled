package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.CNz  reason: case insensitive filesystem */
public final class C43966CNz extends 17P implements C46300DUd {
    public User A00;

    public final User Bn4() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'reposter' field.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUd, X.CNz] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44313Ccv.A00(this));
    }

    public final String Bmu() {
        return A0i(1285435075);
    }

    public final String Bmw() {
        return A0k(640522819);
    }

    public final String Bmx() {
        return A0k(-352405625);
    }

    public final long Bn0() {
        return A03(646001248);
    }

    public final C46300DUd E88(1E9 r2) {
        this.A00 = C41846B3n.A0c(r2, this, -427009728);
        return this;
    }

    public final BGD F8f(1E9 r8) {
        return new BGD(C41847B3o.A0r(r8, this, -427009728), A0i(1285435075), A0k(640522819), A0k(-352405625), A03(646001248));
    }

    public final BGD F8g(1E6 r2) {
        return F8f(C41846B3n.A0S(r2));
    }
}
