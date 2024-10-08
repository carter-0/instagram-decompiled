package com.google.android.gms.location;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(50);
    public float A00 = 0.0f;
    public int A01 = 102;
    public int A02 = Integer.MAX_VALUE;
    public long A03 = 3600000;
    public long A04 = 600000;
    public long A05 = Long.MAX_VALUE;
    public long A06 = 0;
    public boolean A07 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationRequest) {
                LocationRequest locationRequest = (LocationRequest) obj;
                if (this.A01 == locationRequest.A01) {
                    long j = this.A03;
                    long j2 = locationRequest.A03;
                    if (j == j2 && this.A04 == locationRequest.A04 && this.A07 == locationRequest.A07 && this.A05 == locationRequest.A05 && this.A02 == locationRequest.A02 && this.A00 == locationRequest.A00) {
                        long j3 = this.A06;
                        if (j3 < j) {
                            j3 = j;
                        }
                        long j4 = locationRequest.A06;
                        if (j4 < j2) {
                            j4 = j2;
                        }
                        if (j3 == j4) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void A00(long j) {
        if (j >= 0) {
            this.A03 = j;
            if (!this.A07) {
                this.A04 = (long) (((double) j) / 6.0d);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w(Pxg.A0u("invalid interval: ", Pxe.A14(38), j));
    }

    public final int hashCode() {
        return Pxh.A0A(Integer.valueOf(this.A01), Long.valueOf(this.A03), Float.valueOf(this.A00), Long.valueOf(this.A06));
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Request[");
        int i = this.A01;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        A1A.append(str);
        if (i != 105) {
            A1A.append(" requested=");
            A1A.append(this.A03);
            A1A.append("ms");
        }
        A1A.append(" fastest=");
        A1A.append(this.A04);
        A1A.append("ms");
        long j = this.A06;
        if (j > this.A03) {
            A1A.append(" maxWait=");
            A1A.append(j);
            A1A.append("ms");
        }
        float f = this.A00;
        if (f > 0.0f) {
            A1A.append(" smallestDisplacement=");
            A1A.append(f);
            A1A.append("m");
        }
        long j2 = this.A05;
        if (j2 != Long.MAX_VALUE) {
            A1A.append(" expireIn=");
            A1A.append(j2 - SystemClock.elapsedRealtime());
            A1A.append("ms");
        }
        int i2 = this.A02;
        if (i2 != Integer.MAX_VALUE) {
            A1A.append(" num=");
            A1A.append(i2);
        }
        return Pxg.A0w(A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A01);
        C301145yd.A08(parcel, 2, this.A03);
        C301145yd.A08(parcel, 3, this.A04);
        C301145yd.A09(parcel, 4, this.A07);
        C301145yd.A08(parcel, 5, this.A05);
        C301145yd.A07(parcel, 6, this.A02);
        C301145yd.A04(parcel, this.A00, 7);
        C301145yd.A08(parcel, 8, this.A06);
        C301145yd.A06(parcel, A032);
    }
}
