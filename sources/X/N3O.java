package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N3O extends AnonymousClass0T0 {
    public final JV5 A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final CharSequence A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final ImageUrl A0E;
    public final String A0F;

    public N3O(JV5 jv5, ImageUrl imageUrl, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7, CharSequence charSequence8, CharSequence charSequence9, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(charSequence, 2);
        this.A0A = z;
        this.A03 = charSequence;
        this.A01 = charSequence2;
        this.A08 = charSequence3;
        this.A05 = charSequence4;
        this.A09 = charSequence5;
        this.A02 = charSequence6;
        this.A04 = charSequence7;
        this.A00 = jv5;
        this.A0F = str;
        this.A0E = imageUrl;
        this.A0C = z2;
        this.A0D = z3;
        this.A0B = z4;
        this.A07 = charSequence8;
        this.A06 = charSequence9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3O) {
                N3O n3o = (N3O) obj;
                if (this.A0A != n3o.A0A || !0qQ.A0K(this.A03, n3o.A03) || !0qQ.A0K(this.A01, n3o.A01) || !0qQ.A0K(this.A08, n3o.A08) || !0qQ.A0K(this.A05, n3o.A05) || !0qQ.A0K(this.A09, n3o.A09) || !0qQ.A0K(this.A02, n3o.A02) || !0qQ.A0K(this.A04, n3o.A04) || !0qQ.A0K(this.A00, n3o.A00) || !0qQ.A0K(this.A0F, n3o.A0F) || !0qQ.A0K(this.A0E, n3o.A0E) || this.A0C != n3o.A0C || this.A0D != n3o.A0D || this.A0B != n3o.A0B || !0qQ.A0K(this.A07, n3o.A07) || !0qQ.A0K(this.A06, n3o.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A0A);
        CharSequence charSequence = this.A08;
        CharSequence charSequence2 = this.A09;
        String str = this.A0F;
        return ((AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0C, (AnonymousClass7TF.A08(str, (((((AnonymousClass7TF.A07(charSequence2, (AnonymousClass7TF.A07(charSequence, (AnonymousClass7TF.A07(this.A03, A052) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31))) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }
}
