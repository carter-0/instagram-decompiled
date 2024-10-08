package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9cv  reason: invalid class name and case insensitive filesystem */
public final class C381999cv extends AnonymousClass0T0 implements B3a {
    public final AnonymousClass8JL A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381999cv) {
                C381999cv r5 = (C381999cv) obj;
                if (!0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B00() {
        return this.A04;
    }

    public final String B01() {
        return this.A05;
    }

    public final String B05() {
        return this.A07;
    }

    public final Boolean B0E() {
        return this.A03;
    }

    public final ImageUrl B0H() {
        return this.A01;
    }

    public final AnonymousClass8JL C2k() {
        return this.A00;
    }

    public final ImageUrl C73() {
        return this.A02;
    }

    public final String getEffectId() {
        return this.A06;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = (((((AnonymousClass7TE.A0O(this.A06) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, (A0O + i) * 31)));
    }

    public C381999cv(AnonymousClass8JL r1, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, String str, String str2, String str3, String str4) {
        this.A06 = str;
        this.A04 = str2;
        this.A03 = bool;
        this.A07 = str3;
        this.A05 = str4;
        this.A01 = imageUrl;
        this.A00 = r1;
        this.A02 = imageUrl2;
    }
}
