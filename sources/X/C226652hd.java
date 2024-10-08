package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2hd  reason: invalid class name and case insensitive filesystem */
public final class C226652hd extends AnonymousClass0T0 implements C226662he {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C247833gz A04;
    public final ImageUrl A05;
    public final C226632hb A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C226652hd) {
                C226652hd r8 = (C226652hd) obj;
                if (!(0qQ.A0K(this.A05, r8.A05) && 0qQ.A0K(this.A07, r8.A07) && this.A02 == r8.A02 && 0qQ.A0K(this.A04, r8.A04) && this.A03 == r8.A03 && Float.compare(this.A00, r8.A00) == 0 && this.A01 == r8.A01 && this.A08 == r8.A08 && this.A0B == r8.A0B && this.A09 == r8.A09 && 0qQ.A0K(this.A06, r8.A06) && this.A0A == r8.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IgSingleImageSource(imageUrl=");
        sb.append(this.A05);
        sb.append(", miniPreviewPayload=");
        sb.append(this.A07);
        sb.append(", miniPreviewBlurRadius=");
        sb.append(this.A02);
        sb.append(", progressiveImageConfig=");
        sb.append(this.A04);
        sb.append(C66579MXk.A00(431));
        sb.append(this.A03);
        sb.append(", decodeAspectRatio=");
        sb.append(this.A00);
        sb.append(", maxSampleSize=");
        sb.append(this.A01);
        sb.append(", clearCachedItem=");
        sb.append(this.A08);
        sb.append(", shouldSkipNetworkRequest=");
        sb.append(this.A0B);
        sb.append(", reportProgress=");
        sb.append(this.A09);
        sb.append(", imagePostProcessor=");
        sb.append(this.A06);
        sb.append(", requestLowFidelityDecoding=");
        sb.append(this.A0A);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A05.hashCode() * 31;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode3 + hashCode) * 31) + this.A02) * 31;
        C247833gz r0 = this.A04;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        long j = this.A03;
        int floatToIntBits = (((((((i2 + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A01) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (floatToIntBits + i3) * 31;
        int i5 = 1237;
        if (this.A0B) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        C226632hb r02 = this.A06;
        if (r02 != null) {
            i = r02.hashCode();
        }
        int i9 = (i8 + i) * 31;
        int i10 = 1237;
        if (this.A0A) {
            i10 = 1231;
        }
        return i9 + i10;
    }

    public C226652hd(C247833gz r1, ImageUrl imageUrl, C226632hb r3, String str, float f, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = imageUrl;
        this.A07 = str;
        this.A02 = i;
        this.A04 = r1;
        this.A03 = j;
        this.A00 = f;
        this.A01 = i2;
        this.A08 = z;
        this.A0B = z2;
        this.A09 = z3;
        this.A06 = r3;
        this.A0A = z4;
    }
}
