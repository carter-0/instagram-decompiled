package com.google.android.gms.location;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.C51968G9o;
import X.Pxe;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(63);
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof DetectedActivity)) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        if (this.A00 == detectedActivity.A00 && this.A01 == detectedActivity.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(Integer.valueOf(this.A00), this.A01));
    }

    public final String toString() {
        String str;
        int i = this.A00;
        if (i <= 22 && i >= 0) {
            if (i == 0) {
                str = "IN_VEHICLE";
            } else if (i == 1) {
                str = "ON_BICYCLE";
            } else if (i == 2) {
                str = "ON_FOOT";
            } else if (i == 3) {
                str = "STILL";
            } else if (i != 4) {
                if (i == 5) {
                    str = "TILTING";
                } else if (i == 7) {
                    str = "WALKING";
                } else if (i == 8) {
                    str = "RUNNING";
                } else if (i == 16) {
                    str = "IN_ROAD_VEHICLE";
                } else if (i != 17) {
                    str = Integer.toString(i);
                } else {
                    str = "IN_RAIL_VEHICLE";
                }
            }
            int i2 = this.A01;
            StringBuilder A14 = Pxe.A14(Pxf.A09(str) + 48);
            A14.append("DetectedActivity [type=");
            A14.append(str);
            A14.append(", confidence=");
            A14.append(i2);
            return AnonymousClass7TF.A0l("]", A14);
        }
        str = "UNKNOWN";
        int i22 = this.A01;
        StringBuilder A142 = Pxe.A14(Pxf.A09(str) + 48);
        A142.append("DetectedActivity [type=");
        A142.append(str);
        A142.append(", confidence=");
        A142.append(i22);
        return AnonymousClass7TF.A0l("]", A142);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A06(parcel, A03);
    }
}
