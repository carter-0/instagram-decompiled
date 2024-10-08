package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.776  reason: invalid class name */
public final class AnonymousClass776 extends AnonymousClass777 {
    public final ImageUrl A00;
    public final Boolean A01;
    public final Float A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass776) {
                AnonymousClass776 r5 = (AnonymousClass776) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Integer num = this.A05;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A04;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.A03;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.A02;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode6 + i;
    }

    public AnonymousClass776(ImageUrl imageUrl, Boolean bool, Float f, Integer num, Integer num2, Integer num3, String str) {
        this.A00 = imageUrl;
        this.A05 = num;
        this.A04 = num2;
        this.A01 = bool;
        this.A03 = num3;
        this.A02 = f;
        this.A06 = str;
    }
}
