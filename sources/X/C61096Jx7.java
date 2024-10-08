package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jx7  reason: case insensitive filesystem */
public final class C61096Jx7 extends AnonymousClass0T0 implements DU2 {
    public final User A00;
    public final String A01;
    public final List A02;

    public C61096Jx7(User user, String str, List list) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = user;
        this.A02 = list;
    }

    public final C61096Jx7 F0l(1E9 r1) {
        return this;
    }

    public final C61096Jx7 F0m(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61096Jx7) {
                C61096Jx7 jx7 = (C61096Jx7) obj;
                if (!0qQ.A0K(this.A01, jx7.A01) || !0qQ.A0K(this.A00, jx7.A00) || !0qQ.A0K(this.A02, jx7.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final User ByI() {
        return this.A00;
    }

    public final List ByP() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBCAdsBoostPostAccessToken", C44070CUn.A00(this));
    }

    public final String getAccessToken() {
        return this.A01;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public final DU2 E73(1E9 r1) {
        return this;
    }
}
