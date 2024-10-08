package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.535  reason: invalid class name */
public final class AnonymousClass535 extends AnonymousClass0T0 implements AnonymousClass536 {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;

    public AnonymousClass535(User user, Boolean bool, Boolean bool2, String str, String str2) {
        0qQ.A0B(user, 3);
        this.A01 = bool;
        this.A02 = bool2;
        this.A00 = user;
        this.A03 = str;
        this.A04 = str2;
    }

    public final AnonymousClass535 F9G(1E9 r1) {
        return this;
    }

    public final AnonymousClass535 F9H(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass535) {
                AnonymousClass535 r5 = (AnonymousClass535) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A01;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A02;
        int hashCode2 = (((hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.A00.hashCode()) * 31;
        String str = this.A03;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final Boolean Bbh() {
        return this.A02;
    }

    public final User ByI() {
        return this.A00;
    }

    public final String ByJ() {
        return this.A03;
    }

    public final Boolean CYy() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSponsorTag", C44365Cdl.A00(this));
    }

    public final String getUsername() {
        return this.A04;
    }

    public final AnonymousClass536 E8F(1E9 r1) {
        return this;
    }
}
