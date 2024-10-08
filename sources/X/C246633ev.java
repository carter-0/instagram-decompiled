package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3ev  reason: invalid class name and case insensitive filesystem */
public final class C246633ev extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass9IV A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246633ev) {
                C246633ev r5 = (C246633ev) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00 || !0qQ.A0K(this.A05, r5.A05) || this.A07 != r5.A07 || this.A06 != r5.A06 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || this.A08 != r5.A08 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        ImageUrl imageUrl = this.A02;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = ((hashCode * 31) + this.A00) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode4 = (((i7 + hashCode3) * 31) + this.A01.hashCode()) * 31;
        int i8 = 1237;
        if (this.A08) {
            i8 = 1231;
        }
        int i9 = (hashCode4 + i8) * 31;
        ImageUrl imageUrl2 = this.A03;
        if (imageUrl2 != null) {
            i = imageUrl2.hashCode();
        }
        return i9 + i;
    }

    public C246633ev(AnonymousClass9IV r1, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = imageUrl;
        this.A00 = i;
        this.A05 = str;
        this.A07 = z;
        this.A06 = z2;
        this.A04 = str2;
        this.A01 = r1;
        this.A08 = z3;
        this.A03 = imageUrl2;
    }
}
