package com.google.android.gms.location;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(64);
    public float A00 = 0.0f;
    public int A01 = Integer.MAX_VALUE;
    public long A02 = 50;
    public long A03 = Long.MAX_VALUE;
    public boolean A04 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzo) {
                zzo zzo = (zzo) obj;
                if (!(this.A04 == zzo.A04 && this.A02 == zzo.A02 && Float.compare(this.A00, zzo.A00) == 0 && this.A03 == zzo.A03 && this.A01 == zzo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0C(Boolean.valueOf(this.A04), Long.valueOf(this.A02), Float.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DeviceOrientationRequest[mShouldUseMag=");
        A1A.append(this.A04);
        A1A.append(" mMinimumSamplingPeriodMs=");
        A1A.append(this.A02);
        A1A.append(" mSmallestAngleChangeRadians=");
        A1A.append(this.A00);
        long j = this.A03;
        if (j != Long.MAX_VALUE) {
            A1A.append(" expireIn=");
            A1A.append(j - SystemClock.elapsedRealtime());
            A1A.append("ms");
        }
        int i = this.A01;
        if (i != Integer.MAX_VALUE) {
            A1A.append(" num=");
            A1A.append(i);
        }
        return Pxg.A0w(A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, this.A04);
        C301145yd.A08(parcel, 2, this.A02);
        C301145yd.A04(parcel, this.A00, 3);
        C301145yd.A08(parcel, 4, this.A03);
        C301145yd.A07(parcel, 5, this.A01);
        C301145yd.A06(parcel, A032);
    }
}
