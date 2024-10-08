package X;

import com.instagram.user.model.User;
import java.util.HashMap;

public final class N3B extends AnonymousClass0T0 {
    public final N37 A00;
    public final C74521PwG A01;
    public final User A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final HashMap A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3B) {
                N3B n3b = (N3B) obj;
                if (!0qQ.A0K(this.A05, n3b.A05) || !0qQ.A0K(this.A03, n3b.A03) || !0qQ.A0K(this.A04, n3b.A04) || !0qQ.A0K(this.A07, n3b.A07) || !0qQ.A0K(this.A00, n3b.A00) || !0qQ.A0K(this.A09, n3b.A09) || !0qQ.A0K(this.A01, n3b.A01) || !0qQ.A0K(this.A06, n3b.A06) || !0qQ.A0K(this.A02, n3b.A02) || !0qQ.A0K(this.A08, n3b.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A08);
    }

    public N3B(N37 n37, C74521PwG pwG, User user, Boolean bool, Boolean bool2, Integer num, Long l, String str, String str2, HashMap hashMap) {
        this.A05 = num;
        this.A03 = bool;
        this.A04 = bool2;
        this.A07 = str;
        this.A00 = n37;
        this.A09 = hashMap;
        this.A01 = pwG;
        this.A06 = l;
        this.A02 = user;
        this.A08 = str2;
    }
}
