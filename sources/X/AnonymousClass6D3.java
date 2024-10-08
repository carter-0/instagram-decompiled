package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6D3  reason: invalid class name */
public final class AnonymousClass6D3 extends AnonymousClass0T0 implements C299515vK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass3WR A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final ImageUrl A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D3) {
                AnonymousClass6D3 r5 = (AnonymousClass6D3) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || this.A02 != r5.A02 || this.A00 != r5.A00 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A09, r5.A09) || this.A01 != r5.A01 || !0qQ.A0K(this.A04, r5.A04) || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AXm() {
        return this.A08;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getId() {
        return this.A05;
    }

    public final int getWidth() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((this.A05.hashCode() * 31) + this.A02) * 31) + this.A00) * 31;
        String str = this.A08;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode) * 31) + this.A03.hashCode()) * 31;
        ImageUrl imageUrl = this.A07;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        String str2 = this.A09;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (((i2 + hashCode3) * 31) + this.A01) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i4 = (i3 + i) * 31;
        int i5 = 1237;
        if (this.A06) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public AnonymousClass6D3(ImageUrl imageUrl, AnonymousClass3WR r2, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A08 = str2;
        this.A03 = r2;
        this.A07 = imageUrl;
        this.A09 = str3;
        this.A01 = i3;
        this.A04 = str4;
        this.A06 = z;
    }
}
