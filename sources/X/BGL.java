package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BGL extends AnonymousClass0T0 implements C46260DSp {
    public final String A00;
    public final String A01;

    public final BGL F8t() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGL) {
                BGL bgl = (BGL) obj;
                if (!0qQ.A0K(this.A00, bgl.A00) || !0qQ.A0K(this.A01, bgl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BcD() {
        return this.A00;
    }

    public final String CEX() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSelfieStickerUrl", C44336CdI.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public BGL(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
