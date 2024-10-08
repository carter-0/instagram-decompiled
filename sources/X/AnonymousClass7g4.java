package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7g4  reason: invalid class name */
public final class AnonymousClass7g4 extends AnonymousClass0T0 implements C337297g5 {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final Boolean A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7g4) {
                AnonymousClass7g4 r5 = (AnonymousClass7g4) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long l = this.A04;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        ImageUrl imageUrl = this.A00;
        int hashCode2 = (hashCode + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ImageUrl imageUrl2 = this.A01;
        int hashCode5 = (hashCode4 + (imageUrl2 == null ? 0 : imageUrl2.hashCode())) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public final ImageUrl Bgw() {
        return this.A00;
    }

    public final Integer BnB() {
        return this.A03;
    }

    public AnonymousClass7g4(ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, Integer num, Long l, String str) {
        this.A04 = l;
        this.A00 = imageUrl;
        this.A03 = num;
        this.A02 = bool;
        this.A01 = imageUrl2;
        this.A05 = str;
    }
}
