package X;

import com.instagram.user.model.User;

/* renamed from: X.7bw  reason: invalid class name and case insensitive filesystem */
public final class C334827bw extends AnonymousClass0T0 implements C334127ai {
    public final 1Xj A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334827bw) {
                C334827bw r5 = (C334827bw) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        User user = this.A01;
        int hashCode3 = (hashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        1Xj r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode3 + i;
    }

    public C334827bw(1Xj r1, User user, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A01 = user;
        this.A00 = r1;
    }
}
