package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BE6 extends AnonymousClass0T0 implements DSU {
    public final String A00;
    public final String A01;

    public BE6(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final BE6 F1T() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE6) {
                BE6 be6 = (BE6) obj;
                if (!0qQ.A0K(this.A00, be6.A00) || !0qQ.A0K(this.A01, be6.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bxn() {
        return this.A00;
    }

    public final String Bxs() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsCutoutStickerInfo", C44083CVa.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
