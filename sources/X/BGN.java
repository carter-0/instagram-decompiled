package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BGN extends AnonymousClass0T0 implements C46284DTn {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final BGN F92() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGN) {
                BGN bgn = (BGN) obj;
                if (!0qQ.A0K(this.A00, bgn.A00) || !0qQ.A0K(this.A01, bgn.A01) || !0qQ.A0K(this.A03, bgn.A03) || !0qQ.A0K(this.A02, bgn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AYU() {
        return this.A00;
    }

    public final String C2W() {
        return this.A01;
    }

    public final List C2n() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShoppingFeaturedProductMediaCTA", C44347CdT.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }

    public BGN(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = list;
        this.A02 = str3;
    }
}
