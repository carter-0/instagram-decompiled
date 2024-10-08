package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BE1 extends AnonymousClass0T0 implements DT8 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final BE1 F1D() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE1) {
                BE1 be1 = (BE1) obj;
                if (!0qQ.A0K(this.A00, be1.A00) || !0qQ.A0K(this.A01, be1.A01) || !0qQ.A0K(this.A02, be1.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aev() {
        return this.A00;
    }

    public final String CAh() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCardsCreateModeCard", CVM.A00(this));
    }

    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TG.A0E(this.A00) * 31));
    }

    public BE1(String str, String str2, String str3) {
        AnonymousClass7TG.A1Q(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
