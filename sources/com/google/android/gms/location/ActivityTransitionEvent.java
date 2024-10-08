package com.google.android.gms.location;

import X.002;
import X.AnonymousClass3Qk;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(60);
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTransitionEvent) {
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
                if (!(this.A00 == activityTransitionEvent.A00 && this.A01 == activityTransitionEvent.A01 && this.A02 == activityTransitionEvent.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0B(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02));
    }

    public final String toString() {
        return 002.A11(Pxg.A0t("ActivityType ", Pxe.A14(24), this.A00), " ", Pxg.A0t("TransitionType ", Pxe.A14(26), this.A01), " ", Pxg.A0u("ElapsedRealTimeNanos ", Pxe.A14(41), this.A02));
    }

    public ActivityTransitionEvent(int i, int i2, long j) {
        boolean z = true;
        z = (i2 < 0 || i2 > 1) ? false : z;
        StringBuilder A14 = Pxe.A14(41);
        A14.append("Transition type ");
        A14.append(i2);
        AnonymousClass3Qk.A08(z, AnonymousClass7TF.A0l(" is not valid.", A14));
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A08(parcel, 3, this.A02);
        C301145yd.A06(parcel, A03);
    }
}
