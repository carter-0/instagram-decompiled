package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dt4  reason: case insensitive filesystem */
public final class C47217Dt4 extends AnonymousClass0T0 implements C74532PwR {
    public final User A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Boolean A07;
    public final Float A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47217Dt4) {
                C47217Dt4 dt4 = (C47217Dt4) obj;
                if (!0qQ.A0K(this.A02, dt4.A02) || !0qQ.A0K(this.A09, dt4.A09) || !0qQ.A0K(this.A01, dt4.A01) || !0qQ.A0K(this.A0A, dt4.A0A) || !0qQ.A0K(this.A03, dt4.A03) || !0qQ.A0K(this.A07, dt4.A07) || !0qQ.A0K(this.A0B, dt4.A0B) || !0qQ.A0K(this.A0C, dt4.A0C) || !0qQ.A0K(this.A0D, dt4.A0D) || !0qQ.A0K(this.A04, dt4.A04) || !0qQ.A0K(this.A06, dt4.A06) || !0qQ.A0K(this.A0E, dt4.A0E) || !0qQ.A0K(this.A00, dt4.A00) || !0qQ.A0K(this.A05, dt4.A05) || !0qQ.A0K(this.A08, dt4.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public C47217Dt4(User user, Boolean bool, Boolean bool2, Float f, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, List list5) {
        this.A02 = str;
        this.A09 = str2;
        this.A01 = bool;
        this.A0A = str3;
        this.A03 = str4;
        this.A07 = bool2;
        this.A0B = list;
        this.A0C = list2;
        this.A0D = list3;
        this.A04 = str5;
        this.A06 = list4;
        this.A0E = list5;
        this.A00 = user;
        this.A05 = str6;
        this.A08 = f;
    }
}
