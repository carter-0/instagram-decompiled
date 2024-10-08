package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class BGi extends AnonymousClass0T0 implements DV4 {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final BGi F9k(1E9 r1) {
        return this;
    }

    public final BGi F9l(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGi) {
                BGi bGi = (BGi) obj;
                if (!0qQ.A0K(this.A00, bGi.A00) || !0qQ.A0K(this.A05, bGi.A05) || !0qQ.A0K(this.A06, bGi.A06) || !0qQ.A0K(this.A07, bGi.A07) || !0qQ.A0K(this.A08, bGi.A08) || !0qQ.A0K(this.A09, bGi.A09) || !0qQ.A0K(this.A04, bGi.A04) || !0qQ.A0K(this.A01, bGi.A01) || !0qQ.A0K(this.A02, bGi.A02) || !0qQ.A0K(this.A0A, bGi.A0A) || !0qQ.A0K(this.A0B, bGi.A0B) || !0qQ.A0K(this.A0C, bGi.A0C) || !0qQ.A0K(this.A03, bGi.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final User Acz() {
        return this.A00;
    }

    public final String Aeo() {
        return this.A05;
    }

    public final String Arf() {
        return this.A06;
    }

    public final String Awy() {
        return this.A07;
    }

    public final String Awz() {
        return this.A08;
    }

    public final Long B1l() {
        return this.A04;
    }

    public final Boolean B71() {
        return this.A01;
    }

    public final Boolean CF5() {
        return this.A03;
    }

    public final Boolean CYm() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryCountdownTappableData", C44385Ce5.A00(this));
    }

    public final String getEndBackgroundColor() {
        return this.A09;
    }

    public final String getStartBackgroundColor() {
        return this.A0A;
    }

    public final String getText() {
        return this.A0B;
    }

    public final String getTextColor() {
        return this.A0C;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public BGi(User user, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = user;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A04 = l;
        this.A01 = bool;
        this.A02 = bool2;
        this.A0A = str6;
        this.A0B = str7;
        this.A0C = str8;
        this.A03 = bool3;
    }

    public final DV4 E8P(1E9 r1) {
        return this;
    }
}
