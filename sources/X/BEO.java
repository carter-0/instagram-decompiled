package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class BEO extends AnonymousClass0T0 implements DU7 {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final BEO F21(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEO) {
                BEO beo = (BEO) obj;
                if (!0qQ.A0K(this.A00, beo.A00) || !0qQ.A0K(this.A01, beo.A01) || !0qQ.A0K(this.A02, beo.A02) || !0qQ.A0K(this.A03, beo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final User BZ1() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCommentStickerData", CWA.A00(this));
    }

    public final String getOriginalCommentId() {
        return this.A01;
    }

    public final String getOriginalCommentText() {
        return this.A02;
    }

    public final String getOriginalMediaId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public BEO(User user, String str, String str2, String str3) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final DU7 E7E(1E9 r1) {
        return this;
    }
}
