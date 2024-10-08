package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BG9 extends AnonymousClass0T0 implements DTP {
    public final int A00;
    public final String A01;
    public final String A02;

    public final BG9 F8V() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BG9) {
                BG9 bg9 = (BG9) obj;
                if (this.A00 != bg9.A00 || !0qQ.A0K(this.A01, bg9.A01) || !0qQ.A0K(this.A02, bg9.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTReactionMetadata", C44301Ccj.A00(this));
    }

    public final int getCount() {
        return this.A00;
    }

    public final String getName() {
        return this.A01;
    }

    public final String getValue() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31));
    }

    public BG9(int i, String str, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
