package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4hL  reason: invalid class name and case insensitive filesystem */
public final class C270814hL extends AnonymousClass0T0 implements C270824hM {
    public final User A00;
    public final List A01;

    public final C270814hL F6z(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C270814hL) {
                C270814hL r5 = (C270814hL) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        User user = this.A00;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode + i;
    }

    public final List BeM() {
        return this.A01;
    }

    public final User CCd() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNuxMediaResponse", Cb4.A00(this));
    }

    public C270814hL(User user, List list) {
        this.A01 = list;
        this.A00 = user;
    }

    public final C270824hM E7o(1E9 r1) {
        return this;
    }
}
