package X;

import com.instagram.user.model.User;
import java.util.HashMap;

public final class N3F extends AnonymousClass0T0 {
    public final N37 A00;
    public final C300925yB A01;
    public final User A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final HashMap A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3F) {
                N3F n3f = (N3F) obj;
                if (!0qQ.A0K(this.A05, n3f.A05) || !0qQ.A0K(this.A00, n3f.A00) || !0qQ.A0K(this.A01, n3f.A01) || !0qQ.A0K(this.A08, n3f.A08) || !0qQ.A0K(this.A06, n3f.A06) || !0qQ.A0K(this.A04, n3f.A04) || !0qQ.A0K(this.A02, n3f.A02) || !0qQ.A0K(this.A07, n3f.A07) || this.A03 != n3f.A03 || this.A0B != n3f.A0B || this.A0A != n3f.A0A || this.A09 != n3f.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public N3F(N37 n37, C300925yB r3, User user, Integer num, Integer num2, String str, String str2, String str3, HashMap hashMap, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(num2, 9);
        this.A05 = str;
        this.A00 = n37;
        this.A01 = r3;
        this.A08 = hashMap;
        this.A06 = str2;
        this.A04 = num;
        this.A02 = user;
        this.A07 = str3;
        this.A03 = num2;
        this.A0B = z;
        this.A0A = z2;
        this.A09 = z3;
    }

    public final int hashCode() {
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0B, ((((((((((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A07)) * 31) + C69907Nu9.A00(this.A03)) * 31)));
    }
}
