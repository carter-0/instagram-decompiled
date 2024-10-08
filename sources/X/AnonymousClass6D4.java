package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6D4  reason: invalid class name */
public final class AnonymousClass6D4 extends AnonymousClass0T0 implements C299515vK {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final ImageUrl A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D4) {
                AnonymousClass6D4 r8 = (AnonymousClass6D4) obj;
                if (!0qQ.A0K(this.A01, r8.A01) || this.A04 != r8.A04 || this.A03 != r8.A03 || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A00, r8.A00) || !0qQ.A0K(this.A09, r8.A09) || !0qQ.A0K(this.A02, r8.A02) || this.A05 != r8.A05 || !0qQ.A0K(this.A0A, r8.A0A) || this.A07 != r8.A07 || !0qQ.A0K(this.A06, r8.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass6D4(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, long j) {
        0qQ.A0B(num, 10);
        this.A01 = str;
        this.A04 = i;
        this.A03 = i2;
        this.A08 = str2;
        this.A00 = imageUrl;
        this.A09 = str3;
        this.A02 = str4;
        this.A05 = j;
        this.A0A = str5;
        this.A07 = num;
        this.A06 = imageUrl2;
    }

    public final String AXm() {
        return this.A08;
    }

    public final int getHeight() {
        return this.A03;
    }

    public final String getId() {
        return this.A01;
    }

    public final int getWidth() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((this.A01.hashCode() * 31) + this.A04) * 31) + this.A03) * 31;
        String str = this.A08;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A00.hashCode()) * 31;
        String str2 = this.A09;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode6 + hashCode2) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.A05;
        int i3 = (((i2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str4 = this.A0A;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int A002 = (((i3 + hashCode4) * 31) + A08.A00(this.A07)) * 31;
        ImageUrl imageUrl = this.A06;
        if (imageUrl != null) {
            i = imageUrl.hashCode();
        }
        return A002 + i;
    }
}
