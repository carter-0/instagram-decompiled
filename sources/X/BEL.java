package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaType;

public final class BEL extends AnonymousClass0T0 implements C269804fi {
    public final MediaType A00;
    public final String A01;
    public final String A02;

    public final BEL F1u() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEL) {
                BEL bel = (BEL) obj;
                if (!0qQ.A0K(this.A01, bel.A01) || !0qQ.A0K(this.A02, bel.A02) || this.A00 != bel.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AeQ() {
        return this.A01;
    }

    public final String AeS() {
        return this.A02;
    }

    public final MediaType CAR() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCommentAvatarMediaInfo", CW2.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BEL(MediaType mediaType, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = mediaType;
    }
}
