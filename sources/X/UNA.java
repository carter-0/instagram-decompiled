package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class UNA extends AnonymousClass0T0 implements XAW {
    public final String A00;
    public final String A01;
    public final List A02;

    public final UNA F4v() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNA) {
                UNA una = (UNA) obj;
                if (!0qQ.A0K(this.A00, una.A00) || !0qQ.A0K(this.A01, una.A01) || !0qQ.A0K(this.A02, una.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bjb() {
        return this.A00;
    }

    public final String C8Z() {
        return this.A01;
    }

    public final List C8a() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardRatingsAndReviewsTopicsInfoDict", C16819V7a.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public UNA(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
