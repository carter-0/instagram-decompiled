package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFY extends AnonymousClass0T0 implements DTJ {
    public final String A00;
    public final String A01;
    public final String A02;

    public final BFY F6F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFY) {
                BFY bfy = (BFY) obj;
                if (!0qQ.A0K(this.A00, bfy.A00) || !0qQ.A0K(this.A01, bfy.A01) || !0qQ.A0K(this.A02, bfy.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AcE() {
        return this.A00;
    }

    public final String Axs() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMicroProductDiscountTileDict", CaY.A00(this));
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public BFY(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
