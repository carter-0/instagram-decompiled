package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.UKs  reason: case insensitive filesystem */
public final class C15039UKs extends AnonymousClass0T0 {
    public final C67241sS A00;
    public final User A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15039UKs) {
                C15039UKs uKs = (C15039UKs) obj;
                if (!0qQ.A0K(this.A05, uKs.A05) || !0qQ.A0K(this.A03, uKs.A03) || !0qQ.A0K(this.A0A, uKs.A0A) || !0qQ.A0K(this.A06, uKs.A06) || !0qQ.A0K(this.A00, uKs.A00) || !0qQ.A0K(this.A07, uKs.A07) || !0qQ.A0K(this.A0B, uKs.A0B) || !0qQ.A0K(this.A02, uKs.A02) || !0qQ.A0K(this.A01, uKs.A01) || !0qQ.A0K(this.A08, uKs.A08) || !0qQ.A0K(this.A09, uKs.A09) || !0qQ.A0K(this.A04, uKs.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C15039UKs(C67241sS r1, User user, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        this.A05 = str;
        this.A03 = num;
        this.A0A = list;
        this.A06 = str2;
        this.A00 = r1;
        this.A07 = str3;
        this.A0B = list2;
        this.A02 = bool;
        this.A01 = user;
        this.A08 = str4;
        this.A09 = str5;
        this.A04 = num2;
    }
}
