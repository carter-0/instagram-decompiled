package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFX extends AnonymousClass0T0 implements DUP {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final BFX F6E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFX) {
                BFX bfx = (BFX) obj;
                if (!0qQ.A0K(this.A00, bfx.A00) || !0qQ.A0K(this.A01, bfx.A01) || !0qQ.A0K(this.A02, bfx.A02) || !0qQ.A0K(this.A03, bfx.A03) || !0qQ.A0K(this.A04, bfx.A04) || !0qQ.A0K(this.A05, bfx.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B4L() {
        return this.A00;
    }

    public final String Bgr() {
        return this.A02;
    }

    public final String Bh8() {
        return this.A03;
    }

    public final String BhP() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMicroFbUserDict", CaW.A00(this));
    }

    public final String getFullName() {
        return this.A01;
    }

    public final String getUsername() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public BFX(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }
}
