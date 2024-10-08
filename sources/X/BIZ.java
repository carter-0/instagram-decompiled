package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BIZ extends AnonymousClass0T0 implements DT6 {
    public final String A00;
    public final String A01;

    public final BIZ FET() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIZ) {
                BIZ biz = (BIZ) obj;
                if (!0qQ.A0K(this.A00, biz.A00) || !0qQ.A0K(this.A01, biz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B5z() {
        return this.A00;
    }

    public final String BMi() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryElectionStickerDict", C44855Cm6.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BIZ(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
