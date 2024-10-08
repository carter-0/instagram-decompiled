package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BIC extends AnonymousClass0T0 implements DT4 {
    public final long A00;
    public final String A01;

    public BIC(long j, String str) {
        0qQ.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    public final BIC FDI() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIC) {
                BIC bic = (BIC) obj;
                if (this.A00 != bic.A00 || !0qQ.A0K(this.A01, bic.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTViewerReaction", C44575Ch9.A00(this));
    }

    public final long getCreatedAt() {
        return this.A00;
    }

    public final String getEmoji() {
        return this.A01;
    }

    public final int hashCode() {
        long j = this.A00;
        return C41845B3m.A01(this.A01, ((int) (j ^ (j >>> 32))) * 31);
    }
}
