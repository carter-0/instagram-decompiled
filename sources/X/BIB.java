package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BIB extends AnonymousClass0T0 implements DTV {
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final BIB FDG() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIB) {
                BIB bib = (BIB) obj;
                if (!0qQ.A0K(this.A00, bib.A00) || !0qQ.A0K(this.A02, bib.A02) || !0qQ.A0K(this.A01, bib.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer B1k() {
        return this.A00;
    }

    public final String BDY() {
        return this.A02;
    }

    public final Integer Byu() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGVideoHighlightsDict", C44573Ch7.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BIB(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
