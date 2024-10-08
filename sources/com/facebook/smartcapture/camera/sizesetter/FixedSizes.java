package com.facebook.smartcapture.camera.sizesetter;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import X.G9t;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class FixedSizes implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(50);
    public final Size A00;
    public final Size A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FixedSizes) {
                FixedSizes fixedSizes = (FixedSizes) obj;
                if (!0qQ.A0K(this.A00, fixedSizes.A00) || !0qQ.A0K(this.A01, fixedSizes.A01) || this.A02 != fixedSizes.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public FixedSizes(Size size, Size size2, boolean z) {
        AnonymousClass7TG.A1O(size, size2);
        this.A00 = size;
        this.A01 = size2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FixedSizes(photoSize=");
        A1A.append(this.A00);
        A1A.append(", previewSize=");
        A1A.append(this.A01);
        A1A.append(", autoCapture=");
        return G9t.A1C(A1A, this.A02);
    }
}
