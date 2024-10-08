package X;

import com.instagram.user.model.User;

/* renamed from: X.3Ke  reason: invalid class name and case insensitive filesystem */
public final class C240253Ke extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final 1Xj A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C240253Ke(1Xj r2, User user, String str, String str2, boolean z) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(user, 2);
        0qQ.A0B(str, 3);
        this.A00 = r2;
        this.A01 = user;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240253Ke) {
                C240253Ke r5 = (C240253Ke) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        String str = this.A03;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        return i + i2;
    }
}
