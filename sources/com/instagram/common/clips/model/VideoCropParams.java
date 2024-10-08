package com.instagram.common.clips.model;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51968G9o;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class VideoCropParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(85);
    public final double A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoCropParams) {
                VideoCropParams videoCropParams = (VideoCropParams) obj;
                if (!(Double.compare(this.A00, videoCropParams.A00) == 0 && Float.compare(this.A01, videoCropParams.A01) == 0 && Float.compare(this.A03, videoCropParams.A03) == 0 && Float.compare(this.A02, videoCropParams.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(C51968G9o.A03(Double.doubleToLongBits(this.A00)) * 31, this.A01), this.A03) + Float.floatToIntBits(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoCropParams(timestampUs=");
        sb.append(this.A00);
        sb.append(", leftPercent=");
        sb.append(this.A01);
        sb.append(", topPercent=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(405));
        sb.append(this.A02);
        return AnonymousClass7TG.A0p(sb);
    }

    public VideoCropParams(double d, float f, float f2, float f3) {
        this.A00 = d;
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
    }
}
