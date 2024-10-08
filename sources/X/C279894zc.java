package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4zc  reason: invalid class name and case insensitive filesystem */
public final class C279894zc extends AnonymousClass0T0 {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C279894zc(User user, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(list, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = user;
        this.A02 = str3;
        this.A01 = str4;
        this.A05 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279894zc) {
                C279894zc r5 = (C279894zc) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31;
        User user = this.A00;
        int i = 0;
        int hashCode2 = (hashCode + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.A05.hashCode();
    }
}
