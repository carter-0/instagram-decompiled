package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFJ extends AnonymousClass0T0 implements C46250DSf {
    public final String A00;
    public final String A01;

    public final BFJ F5M() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFJ) {
                BFJ bfj = (BFJ) obj;
                if (!0qQ.A0K(this.A00, bfj.A00) || !0qQ.A0K(this.A01, bfj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BKV() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTKaraokeTranslatedCaptionData", C44200CZn.A00(this));
    }

    public final String getUri() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BFJ(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
