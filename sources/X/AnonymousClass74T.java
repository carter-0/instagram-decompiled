package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.74T  reason: invalid class name */
public final class AnonymousClass74T extends AnonymousClass0T0 {
    public final int A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final C254893tE A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final String A0E;

    public AnonymousClass74T(ImageUrl imageUrl, ImageUrl imageUrl2, C254893tE r4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, Integer num, Integer num2, Integer num3, Integer num4, String str, int i) {
        0qQ.A0B(charSequence, 1);
        this.A09 = charSequence;
        this.A04 = charSequence2;
        this.A01 = imageUrl;
        this.A03 = r4;
        this.A05 = charSequence3;
        this.A08 = charSequence4;
        this.A00 = i;
        this.A0A = num;
        this.A0D = num2;
        this.A0E = str;
        this.A0C = num3;
        this.A07 = charSequence5;
        this.A06 = charSequence6;
        this.A02 = imageUrl2;
        this.A0B = num4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass74T) {
                AnonymousClass74T r5 = (AnonymousClass74T) obj;
                if (!0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || this.A03 != r5.A03 || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A08, r5.A08) || this.A00 != r5.A00 || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0B, r5.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A09.hashCode() * 31;
        CharSequence charSequence = this.A04;
        int i = 0;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ImageUrl imageUrl = this.A01;
        int hashCode3 = (hashCode2 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        C254893tE r0 = this.A03;
        int hashCode4 = (hashCode3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        CharSequence charSequence2 = this.A05;
        int hashCode5 = (hashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.A08;
        int hashCode6 = (((hashCode5 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31) + this.A00) * 31;
        Integer num = this.A0A;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0D;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A0E;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.A0C;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CharSequence charSequence4 = this.A07;
        int hashCode11 = (hashCode10 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.A06;
        int hashCode12 = (hashCode11 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        ImageUrl imageUrl2 = this.A02;
        int hashCode13 = (hashCode12 + (imageUrl2 == null ? 0 : imageUrl2.hashCode())) * 31;
        Integer num4 = this.A0B;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode13 + i;
    }
}
