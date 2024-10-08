package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class BEB extends AnonymousClass0T0 implements DU6 {
    public final ImageUrl A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public final BEB F1b(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEB) {
                BEB beb = (BEB) obj;
                if (!0qQ.A0K(this.A02, beb.A02) || !0qQ.A0K(this.A00, beb.A00) || !0qQ.A0K(this.A03, beb.A03) || !0qQ.A0K(this.A01, beb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ImageUrl Awq() {
        return this.A00;
    }

    public final User Bge() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsPivotPageHeader", C44089CVg.A00(this));
    }

    public final String getContentUrl() {
        return this.A02;
    }

    public final String getMediaCount() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BEB(ImageUrl imageUrl, User user, String str, String str2) {
        this.A02 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A01 = user;
    }

    public final DU6 E7D(1E9 r1) {
        return this;
    }
}
