package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BF7 extends AnonymousClass0T0 implements DTF {
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final BF7 F4H() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF7) {
                BF7 bf7 = (BF7) obj;
                if (!0qQ.A0K(this.A00, bf7.A00) || !0qQ.A0K(this.A01, bf7.A01) || !0qQ.A0K(this.A02, bf7.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BMP() {
        return this.A00;
    }

    public final Integer BXp() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGIABPostClickDisclaimerBodyRangeDict", C44183CYw.A00(this));
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public BF7(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }
}
