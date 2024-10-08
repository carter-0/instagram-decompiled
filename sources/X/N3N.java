package X;

import com.instagram.user.model.User;
import java.util.List;

public final class N3N extends AnonymousClass0T0 {
    public final C61080JwI A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Double A05;
    public final Double A06;
    public final Double A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final Integer A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3N) {
                N3N n3n = (N3N) obj;
                if (!0qQ.A0K(this.A00, n3n.A00) || !0qQ.A0K(this.A05, n3n.A05) || !0qQ.A0K(this.A01, n3n.A01) || !0qQ.A0K(this.A06, n3n.A06) || !0qQ.A0K(this.A07, n3n.A07) || !0qQ.A0K(this.A0A, n3n.A0A) || !0qQ.A0K(this.A0B, n3n.A0B) || !0qQ.A0K(this.A0C, n3n.A0C) || !0qQ.A0K(this.A02, n3n.A02) || !0qQ.A0K(this.A03, n3n.A03) || !0qQ.A0K(this.A0E, n3n.A0E) || !0qQ.A0K(this.A0D, n3n.A0D) || !0qQ.A0K(this.A08, n3n.A08) || !0qQ.A0K(this.A0F, n3n.A0F) || !0qQ.A0K(this.A09, n3n.A09) || !0qQ.A0K(this.A04, n3n.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public N3N(C61080JwI jwI, User user, Boolean bool, Boolean bool2, Boolean bool3, Double d, Double d2, Double d3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, List list) {
        this.A00 = jwI;
        this.A05 = d;
        this.A01 = user;
        this.A06 = d2;
        this.A07 = d3;
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A02 = bool;
        this.A03 = bool2;
        this.A0E = list;
        this.A0D = str4;
        this.A08 = num;
        this.A0F = num2;
        this.A09 = num3;
        this.A04 = bool3;
    }
}
