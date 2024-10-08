package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class CSb extends 17P implements C46294DTx {
    public User A00;

    public final User CCd() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSb, X.DTx] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44974CoD.A00(this));
    }

    public final Long C7Y() {
        return A0L(55126294);
    }

    public final C46294DTx EAJ(1E9 r2) {
        this.A00 = C41847B3o.A0y(r2, this);
        return this;
    }

    public final C42135BIq FGF(1E9 r5) {
        User user;
        User A0b;
        String A0i = A0i(-1413853096);
        Long A0L = A0L(55126294);
        ImmutablePandoUserDict A0Z = C41846B3n.A0Z(this);
        if (A0Z == null || (A0b = C41845B3m.A0b(r5, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r5, A0b);
        }
        return new C42135BIq(user, A0L, A0i);
    }

    public final String getAmount() {
        return A0i(-1413853096);
    }
}
