package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6D2  reason: invalid class name */
public final class AnonymousClass6D2 extends AnonymousClass0T0 implements C299515vK {
    public final int A00;
    public final int A01;
    public final AnonymousClass3WR A02;
    public final String A03;
    public final String A04;
    public final long A05;
    public final ImageUrl A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D2) {
                AnonymousClass6D2 r8 = (AnonymousClass6D2) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || this.A01 != r8.A01 || this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A04, r8.A04) || this.A05 != r8.A05 || !0qQ.A0K(this.A09, r8.A09) || this.A07 != r8.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass6D2(ImageUrl imageUrl, AnonymousClass3WR r3, Integer num, String str, String str2, String str3, String str4, int i, int i2, long j) {
        0qQ.A0B(num, 12);
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r3;
        this.A06 = imageUrl;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = j;
        this.A09 = str4;
        this.A07 = num;
    }

    public final String AXm() {
        return null;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getId() {
        return this.A03;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        int hashCode4 = ((((((this.A03.hashCode() * 31) + this.A01) * 31) + this.A00) * 31 * 31 * 31) + this.A02.hashCode()) * 31;
        ImageUrl imageUrl = this.A06;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str = this.A08;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        long j = this.A05;
        int i4 = (((i3 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.A09;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i4 + i) * 31) + A08.A00(this.A07);
    }
}
