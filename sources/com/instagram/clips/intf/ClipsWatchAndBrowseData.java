package com.instagram.clips.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass9OE;
import X.C376419Hx;
import X.C393789x0;
import X.C393799x1;
import X.C51968G9o;
import android.os.Parcel;
import android.os.Parcelable;

public final class ClipsWatchAndBrowseData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(66);
    public final double A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final float A0P;
    public final int A0Q;
    public final int A0R;
    public final Integer A0S;
    public final boolean A0T;
    public final boolean A0U;

    public ClipsWatchAndBrowseData(Integer num, Integer num2, Integer num3, Integer num4, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        0qQ.A0B(num, 4);
        0qQ.A0B(num2, 5);
        0qQ.A0B(num3, 6);
        0qQ.A0B(num4, 7);
        this.A0R = i;
        this.A04 = f;
        this.A0Q = i2;
        this.A0S = num;
        this.A07 = num2;
        this.A08 = num3;
        this.A09 = num4;
        this.A0F = z;
        this.A0H = z2;
        this.A03 = f2;
        this.A0B = z3;
        this.A0L = z4;
        this.A0I = z5;
        this.A0K = z6;
        this.A0D = z7;
        this.A0E = z8;
        this.A0O = z9;
        this.A0G = z10;
        this.A0T = z11;
        this.A0N = z12;
        this.A0J = z13;
        this.A0A = z14;
        this.A0U = z15;
        this.A0P = f3;
        this.A00 = d;
        this.A02 = d2;
        this.A06 = f4;
        this.A01 = d3;
        this.A05 = f5;
        this.A0C = z16;
        this.A0M = z17;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsWatchAndBrowseData) {
                ClipsWatchAndBrowseData clipsWatchAndBrowseData = (ClipsWatchAndBrowseData) obj;
                if (!(this.A0R == clipsWatchAndBrowseData.A0R && Float.compare(this.A04, clipsWatchAndBrowseData.A04) == 0 && this.A0Q == clipsWatchAndBrowseData.A0Q && this.A0S == clipsWatchAndBrowseData.A0S && this.A07 == clipsWatchAndBrowseData.A07 && this.A08 == clipsWatchAndBrowseData.A08 && this.A09 == clipsWatchAndBrowseData.A09 && this.A0F == clipsWatchAndBrowseData.A0F && this.A0H == clipsWatchAndBrowseData.A0H && Float.compare(this.A03, clipsWatchAndBrowseData.A03) == 0 && this.A0B == clipsWatchAndBrowseData.A0B && this.A0L == clipsWatchAndBrowseData.A0L && this.A0I == clipsWatchAndBrowseData.A0I && this.A0K == clipsWatchAndBrowseData.A0K && this.A0D == clipsWatchAndBrowseData.A0D && this.A0E == clipsWatchAndBrowseData.A0E && this.A0O == clipsWatchAndBrowseData.A0O && this.A0G == clipsWatchAndBrowseData.A0G && this.A0T == clipsWatchAndBrowseData.A0T && this.A0N == clipsWatchAndBrowseData.A0N && this.A0J == clipsWatchAndBrowseData.A0J && this.A0A == clipsWatchAndBrowseData.A0A && this.A0U == clipsWatchAndBrowseData.A0U && Float.compare(this.A0P, clipsWatchAndBrowseData.A0P) == 0 && Double.compare(this.A00, clipsWatchAndBrowseData.A00) == 0 && Double.compare(this.A02, clipsWatchAndBrowseData.A02) == 0 && Float.compare(this.A06, clipsWatchAndBrowseData.A06) == 0 && Double.compare(this.A01, clipsWatchAndBrowseData.A01) == 0 && Float.compare(this.A05, clipsWatchAndBrowseData.A05) == 0 && this.A0C == clipsWatchAndBrowseData.A0C && this.A0M == clipsWatchAndBrowseData.A0M)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A0R);
        parcel.writeFloat(this.A04);
        parcel.writeInt(this.A0Q);
        parcel.writeString(AnonymousClass9OE.A01(this.A0S));
        parcel.writeString(AnonymousClass9OE.A01(this.A07));
        parcel.writeString(C393789x0.A00(this.A08));
        parcel.writeString(C393799x1.A00(this.A09));
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeFloat(this.A03);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeFloat(this.A0P);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A02);
        parcel.writeFloat(this.A06);
        parcel.writeDouble(this.A01);
        parcel.writeFloat(this.A05);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
    }

    public final int hashCode() {
        Integer num = this.A0S;
        Integer num2 = this.A07;
        Integer num3 = this.A08;
        Integer num4 = this.A09;
        int floatToIntBits = ((((((((((((this.A0R * 31) + Float.floatToIntBits(this.A04)) * 31) + this.A0Q) * 31) + AnonymousClass9OE.A01(num).hashCode() + num.intValue()) * 31) + AnonymousClass9OE.A01(num2).hashCode() + num2.intValue()) * 31) + C393789x0.A00(num3).hashCode() + num3.intValue()) * 31) + C393799x1.A00(num4).hashCode() + num4.intValue()) * 31;
        int i = 1237;
        if (this.A0F) {
            i = 1231;
        }
        int i2 = (floatToIntBits + i) * 31;
        int i3 = 1237;
        if (this.A0H) {
            i3 = 1231;
        }
        int floatToIntBits2 = (((i2 + i3) * 31) + Float.floatToIntBits(this.A03)) * 31;
        int i4 = 1237;
        if (this.A0B) {
            i4 = 1231;
        }
        int i5 = (floatToIntBits2 + i4) * 31;
        int i6 = 1237;
        if (this.A0L) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0I) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0K) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0D) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A0E) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0O) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A0G) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0T) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0N) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A0J) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        int i26 = 1237;
        if (this.A0A) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0U) {
            i28 = 1231;
        }
        int floatToIntBits3 = (((((((((((((i27 + i28) * 31) + Float.floatToIntBits(this.A0P)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A02))) * 31) + Float.floatToIntBits(this.A06)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + Float.floatToIntBits(this.A05)) * 31;
        int i29 = 1237;
        if (this.A0C) {
            i29 = 1231;
        }
        int i30 = (floatToIntBits3 + i29) * 31;
        int i31 = 1237;
        if (this.A0M) {
            i31 = 1231;
        }
        return i30 + i31;
    }
}
