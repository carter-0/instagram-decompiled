package com.instagram.compose.ui.gradientspinner;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51975G9x;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class Segment extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(93);
    public float A00;
    public float A01;
    public int A02;
    public final int A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (!(this.A03 == segment.A03 && Float.compare(this.A00, segment.A00) == 0 && Float.compare(this.A01, segment.A01) == 0 && this.A02 == segment.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(this.A03 * 31, this.A00), this.A01) + this.A02;
    }

    public Segment(int i, float f, float f2, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Segment(segmentIndex=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(850));
        A1A.append(this.A00);
        A1A.append(", startDelay=");
        A1A.append(this.A01);
        A1A.append(", iterations=");
        return C51975G9x.A0j(A1A, this.A02);
    }
}
