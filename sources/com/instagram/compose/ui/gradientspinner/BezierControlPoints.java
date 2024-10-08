package com.instagram.compose.ui.gradientspinner;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.C51966G9m;
import X.G9w;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class BezierControlPoints extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(92);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BezierControlPoints) {
                BezierControlPoints bezierControlPoints = (BezierControlPoints) obj;
                if (!(Float.compare(this.A00, bezierControlPoints.A00) == 0 && Float.compare(this.A02, bezierControlPoints.A02) == 0 && Float.compare(this.A01, bezierControlPoints.A01) == 0 && Float.compare(this.A03, bezierControlPoints.A03) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A00(AnonymousClass7TF.A00(G9w.A00(this.A00), this.A02), this.A01), this.A03);
    }

    public BezierControlPoints(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A03 = f4;
    }
}
