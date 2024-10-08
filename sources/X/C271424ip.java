package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4ip  reason: invalid class name and case insensitive filesystem */
public final class C271424ip implements 1Nv {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String A03;
    public final boolean A04;

    public final boolean CUz() {
        return this.A01;
    }

    public final boolean CYg() {
        return this.A04;
    }

    public final boolean CcK() {
        return this.A02;
    }

    public final String getId() {
        String str = this.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C271424ip(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = str;
        this.A02 = z2;
        this.A04 = z3;
        this.A03 = str2;
    }

    public final String ByO(UserSession userSession) {
        return this.A03;
    }
}
