package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNT extends AnonymousClass0T0 implements XAY {
    public final String A00;
    public final String A01;
    public final String A02;

    public final UNT F9C() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNT) {
                UNT unt = (UNT) obj;
                if (!0qQ.A0K(this.A00, unt.A00) || !0qQ.A0K(this.A01, unt.A01) || !0qQ.A0K(this.A02, unt.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String CCq() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextUser", V86.A00(this));
    }

    public final String getProfilePicUrl() {
        return this.A00;
    }

    public final String getUsername() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public UNT(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
