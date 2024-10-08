package com.facebook.location.parcelable;

import X.AnonymousClass7TF;
import X.C10815Ryb;
import X.Pxf;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableFbLocationOperationParams extends C10815Ryb implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(19);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.A07.intValue()) {
            case 1:
                str = "BALANCED_POWER_AND_ACCURACY";
                break;
            case 2:
                str = "HIGH_ACCURACY";
                break;
            default:
                str = "LOW_POWER";
                break;
        }
        parcel.writeString(str);
        parcel.writeLong(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A05);
        Long l = this.A08;
        int i2 = 1;
        parcel.writeInt(AnonymousClass7TF.A1V(l) ? 1 : 0);
        if (l != null) {
            Pxf.A18(parcel, l);
        }
        Float f = this.A06;
        if (f == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (f != null) {
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
        parcel.writeFloat(this.A01);
    }
}
