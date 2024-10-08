package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class BGD extends AnonymousClass0T0 implements C46300DUd {
    public final long A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final BGD F8f(1E9 r1) {
        return this;
    }

    public final BGD F8g(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGD) {
                BGD bgd = (BGD) obj;
                if (!0qQ.A0K(this.A02, bgd.A02) || !0qQ.A0K(this.A03, bgd.A03) || !0qQ.A0K(this.A04, bgd.A04) || this.A00 != bgd.A00 || !0qQ.A0K(this.A01, bgd.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bmu() {
        return this.A02;
    }

    public final String Bmw() {
        return this.A03;
    }

    public final String Bmx() {
        return this.A04;
    }

    public final long Bn0() {
        return this.A00;
    }

    public final User Bn4() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTRepostInfo", C44313Ccv.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TG.A0E(this.A02) * 31))));
    }

    public BGD(User user, String str, String str2, String str3, long j) {
        AnonymousClass7TG.A1Q(str2, str3);
        0qQ.A0B(user, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A01 = user;
    }

    public final C46300DUd E88(1E9 r1) {
        return this;
    }
}
