package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class COy extends 17P implements DUR {
    public C46295DTy A00;
    public User A01;

    public final User Amt() {
        return this.A01;
    }

    public final C46295DTy AyW() {
        C46295DTy dTy = this.A00;
        if (dTy == null) {
            return (C46295DTy) A05(1550150433, CSc.class);
        }
        return dTy;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUR, X.COy] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44397CeH.A00(this));
    }

    public final String AbN() {
        return A0i(200535999);
    }

    public final DUR E8Y(1E9 r2) {
        this.A01 = C41848B3p.A1B(r2, this, 739065240);
        C46295DTy AyW = AyW();
        if (AyW != null) {
            AyW.EAK(r2);
        } else {
            AyW = null;
        }
        this.A00 = AyW;
        return this;
    }

    public final C42091BGu FA6(1E9 r6) {
        User user;
        String A0i = A0i(200535999);
        User A1B = C41848B3p.A1B(r6, this, 739065240);
        C42136BIr bIr = null;
        if (A1B != null) {
            user = C41846B3n.A0b(r6, A1B);
        } else {
            user = null;
        }
        C46295DTy AyW = AyW();
        if (AyW != null) {
            bIr = AyW.FGG(r6);
        }
        return new C42091BGu(bIr, user, A0i, A0j(-761937713));
    }

    public final C42091BGu FA7(1E6 r2) {
        return FA6(C41846B3n.A0S(r2));
    }

    public final String getFundraiserId() {
        return A0j(-761937713);
    }
}
