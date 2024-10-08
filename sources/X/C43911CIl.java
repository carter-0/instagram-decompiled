package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.CIl  reason: case insensitive filesystem */
public final class C43911CIl extends 17P implements DU6 {
    public User A00;

    public final User Bge() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DU6, X.CIl] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44089CVg.A00(this));
    }

    public final ImageUrl Awq() {
        return A0A(-64851058);
    }

    public final DU6 E7D(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -309425751);
        return this;
    }

    public final BEB F1b(1E9 r6) {
        User user;
        User A0b;
        String A0i = A0i(-388807511);
        ImageUrl A0A = A0A(-64851058);
        String A0i2 = A0i(-9393932);
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -309425751);
        if (A0Z == null || (A0b = C41845B3m.A0b(r6, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r6, A0b);
        }
        return new BEB(A0A, user, A0i, A0i2);
    }

    public final String getContentUrl() {
        return A0i(-388807511);
    }

    public final String getMediaCount() {
        return A0i(-9393932);
    }
}
