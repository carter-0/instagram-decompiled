package com.facebook.location.parcelable;

import X.AnonymousClass7TF;
import X.C10774Rxt;
import X.Pxf;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ParcelableFbLocationContinuousListenerParams extends C10774Rxt implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(18);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C10774Rxt)) {
            C10774Rxt rxt = (C10774Rxt) obj;
            if (this.A01 == rxt.A01 && this.A03 == rxt.A03 && Float.compare(rxt.A00, this.A00) == 0 && this.A02 == rxt.A02 && this.A04 == rxt.A04) {
                Long l = this.A05;
                Long l2 = rxt.A05;
                if (l != null) {
                    return l.equals(l2);
                }
                return l2 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int i;
        int i2 = 0;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "LOW_POWER";
                break;
            case 2:
                str = "BALANCED_POWER_AND_ACCURACY";
                break;
            case 3:
                str = "HIGH_ACCURACY";
                break;
            default:
                str = "NO_POWER";
                break;
        }
        int A01 = AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A01(this.A01, (str.hashCode() + intValue) * 31));
        float f = this.A00;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int A012 = AnonymousClass7TF.A01(this.A02, (A01 + i) * 31);
        Long l = this.A05;
        if (l != null) {
            i2 = l.hashCode();
        }
        return A012 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxf.A19(parcel, this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A02);
        Long l = this.A05;
        if (l == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        Pxf.A18(parcel, l);
    }
}
