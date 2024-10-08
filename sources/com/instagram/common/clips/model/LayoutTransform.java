package com.instagram.common.clips.model;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.VB0;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class LayoutTransform implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(84);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final Integer A06;
    public final boolean A07;

    public LayoutTransform(Integer num, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        0qQ.A0B(num, 6);
        this.A07 = z;
        this.A02 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A01 = f4;
        this.A06 = num;
        this.A04 = i;
        this.A05 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LayoutTransform) {
                LayoutTransform layoutTransform = (LayoutTransform) obj;
                if (!(this.A07 == layoutTransform.A07 && Float.compare(this.A02, layoutTransform.A02) == 0 && Float.compare(this.A00, layoutTransform.A00) == 0 && Float.compare(this.A03, layoutTransform.A03) == 0 && Float.compare(this.A01, layoutTransform.A01) == 0 && this.A06 == layoutTransform.A06 && this.A04 == layoutTransform.A04 && this.A05 == layoutTransform.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A01);
        parcel.writeString(VB0.A00(this.A06));
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(i * 31, this.A02), this.A00), this.A03), this.A01);
        Integer num = this.A06;
        return ((AnonymousClass7TG.A0B(num, VB0.A00(num), A002) + this.A04) * 31) + this.A05;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LayoutTransform(hflip=");
        A1A.append(this.A07);
        A1A.append(", scale=");
        A1A.append(this.A02);
        A1A.append(", leftPercentage=");
        A1A.append(this.A00);
        A1A.append(", topPercentage=");
        A1A.append(this.A03);
        A1A.append(", rotationDegrees=");
        A1A.append(this.A01);
        A1A.append(", cropType=");
        A1A.append(VB0.A00(this.A06));
        A1A.append(", underlayGradientBottomColor=");
        A1A.append(this.A04);
        A1A.append(", underlayGradientTopColor=");
        A1A.append(this.A05);
        return AnonymousClass7TG.A0p(A1A);
    }

    public LayoutTransform() {
        this(AnonymousClass05K.A00, 1.0f, 0.0f, 0.0f, 0.0f, 0, 0, false);
    }
}
