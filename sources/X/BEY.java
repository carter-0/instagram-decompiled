package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BEY extends AnonymousClass0T0 implements DSZ {
    public final String A00;
    public final String A01;

    public BEY(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final BEY F2c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEY) {
                BEY bey = (BEY) obj;
                if (!0qQ.A0K(this.A00, bey.A00) || !0qQ.A0K(this.A01, bey.A01)) {
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
        return C41845B3m.A0T("XDTCutoutStickerInfo", CX4.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
