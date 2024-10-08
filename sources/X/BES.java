package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class BES extends AnonymousClass0T0 implements DUK {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final BES F2A(1E9 r1) {
        return this;
    }

    public final BES F2B(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BES) {
                BES bes = (BES) obj;
                if (!0qQ.A0K(this.A01, bes.A01) || !0qQ.A0K(this.A02, bes.A02) || !0qQ.A0K(this.A00, bes.A00) || !0qQ.A0K(this.A03, bes.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ad1() {
        return this.A01;
    }

    public final String Ad6() {
        return this.A02;
    }

    public final User Ad7() {
        return this.A00;
    }

    public final String Ad9() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCopyrightAttributionInfo", CWP.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A03);
    }

    public BES(User user, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = user;
        this.A03 = str3;
    }

    public final DUK E7G(1E9 r1) {
        return this;
    }
}
