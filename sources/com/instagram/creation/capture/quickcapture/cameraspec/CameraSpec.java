package com.instagram.creation.capture.quickcapture.cameraspec;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class CameraSpec extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(83);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public CameraSpec(int i, int i2, int i3, int i4, String str) {
        0qQ.A0B(str, 3);
        this.A03 = i;
        this.A02 = i2;
        this.A04 = str;
        this.A00 = i3;
        this.A01 = i4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CameraSpec) {
                CameraSpec cameraSpec = (CameraSpec) obj;
                if (!(this.A03 == cameraSpec.A03 && this.A02 == cameraSpec.A02 && 0qQ.A0K(this.A04, cameraSpec.A04) && this.A00 == cameraSpec.A00 && this.A01 == cameraSpec.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A03 * 31) + this.A02) * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
