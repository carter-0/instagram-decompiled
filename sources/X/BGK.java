package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BGK extends AnonymousClass0T0 implements C275654qh {
    public final String A00;
    public final String A01;
    public final String A02;

    public final BGK F8s() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGK) {
                BGK bgk = (BGK) obj;
                if (!0qQ.A0K(this.A00, bgk.A00) || !0qQ.A0K(this.A01, bgk.A01) || !0qQ.A0K(this.A02, bgk.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BZp() {
        return this.A00;
    }

    public final String BZr() {
        return this.A01;
    }

    public final String BZt() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSeeMoreCardDict", C44334CdG.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public BGK(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
