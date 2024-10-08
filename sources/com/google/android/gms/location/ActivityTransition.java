package com.google.android.gms.location;

import X.C301145yd;
import X.C51968G9o;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(59);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTransition) {
                ActivityTransition activityTransition = (ActivityTransition) obj;
                if (!(this.A00 == activityTransition.A00 && this.A01 == activityTransition.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(Integer.valueOf(this.A00), this.A01));
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        StringBuilder A14 = Pxe.A14(75);
        A14.append("ActivityTransition [mActivityType=");
        A14.append(i);
        A14.append(", mTransitionType=");
        A14.append(i2);
        return Pxg.A0w(A14);
    }

    public ActivityTransition(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A06(parcel, A03);
    }
}
