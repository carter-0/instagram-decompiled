package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9JJ  reason: invalid class name */
public final class AnonymousClass9JJ extends AnonymousClass0T0 implements C299515vK {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public AnonymousClass9JJ(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, String str3, int i, int i2, long j) {
        0qQ.A0B(str, 1);
        0qQ.A0B(num, 8);
        this.A08 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = str2;
        this.A04 = imageUrl;
        this.A03 = j;
        this.A09 = str3;
        this.A06 = num;
        this.A05 = imageUrl2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JJ) || ((AnonymousClass9JJ) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String AXm() {
        return this.A07;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj)) {
                return false;
            }
            AnonymousClass9JJ r6 = (AnonymousClass9JJ) obj;
            if (!0qQ.A0K(this.A08, r6.A08) || this.A02 != r6.A02 || this.A01 != r6.A01 || !0qQ.A0K(this.A07, r6.A07) || !0qQ.A0K(this.A06, r6.A06) || !0qQ.A0K(this.A04, r6.A04) || this.A03 != r6.A03 || !0qQ.A0K(this.A09, r6.A09) || this.A05 != r6.A05) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj)) {
                return false;
            }
            AnonymousClass9JJ r62 = (AnonymousClass9JJ) obj;
            if (!0qQ.A0K(this.A08, r62.A08) || this.A02 != r62.A02 || this.A01 != r62.A01 || !0qQ.A0K(this.A07, r62.A07) || !0qQ.A0K(this.A04, r62.A04) || this.A03 != r62.A03 || !0qQ.A0K(this.A09, r62.A09) || this.A06 != r62.A06 || !0qQ.A0K(this.A05, r62.A05)) {
                return false;
            }
            return true;
        }
    }

    public final int getHeight() {
        return this.A01;
    }

    public final String getId() {
        return this.A08;
    }

    public final int getWidth() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = this.A00;
        int hashCode5 = ((((this.A08.hashCode() * 31) + this.A02) * 31) + this.A01) * 31;
        String str = this.A07;
        int i2 = 0;
        if (i != 0) {
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int hashCode6 = (((hashCode5 + hashCode3) * 31) + this.A06.hashCode()) * 31;
            Object obj = this.A04;
            if (obj == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj.hashCode();
            }
            long j = this.A03;
            int i3 = (((hashCode6 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            String str2 = this.A09;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((i3 + i2) * 31) + A08.A00((Integer) this.A05);
        }
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j2 = this.A03;
        int hashCode7 = (((((hashCode5 + hashCode) * 31) + this.A04.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.A09;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int A002 = (((hashCode7 + hashCode2) * 31) + A08.A00((Integer) this.A06)) * 31;
        Object obj2 = this.A05;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return A002 + i2;
    }

    public AnonymousClass9JJ(ImageUrl imageUrl, AnonymousClass3WR r3, Integer num, String str, String str2, String str3, int i, int i2, long j) {
        0qQ.A0B(num, 9);
        this.A08 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = str2;
        this.A06 = r3;
        this.A04 = imageUrl;
        this.A03 = j;
        this.A09 = str3;
        this.A05 = num;
    }
}
