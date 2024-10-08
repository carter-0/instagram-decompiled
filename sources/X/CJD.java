package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class CJD extends 17P implements DU7 {
    public User A00;

    public final User BZ1() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CJD, X.DU7] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWA.A00(this));
    }

    public final DU7 E7E(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, 963379097);
        return this;
    }

    public final BEO F21(1E9 r6) {
        User user;
        User A0b;
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, 963379097);
        if (A0Z == null || (A0b = C41845B3m.A0b(r6, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r6, A0b);
        }
        return new BEO(user, A0j(-1970527703), A0i(403787451), A0j(-1824429564));
    }

    public final String getOriginalCommentId() {
        return A0j(-1970527703);
    }

    public final String getOriginalCommentText() {
        return A0i(403787451);
    }

    public final String getOriginalMediaId() {
        return A0j(-1824429564);
    }
}
