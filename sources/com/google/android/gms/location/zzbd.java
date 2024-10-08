package com.google.android.gms.location;

import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(56);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzbd zzbd = (zzbd) obj;
                if (!(this.A00 == zzbd.A00 && this.A01 == zzbd.A01 && this.A02 == zzbd.A02 && this.A03 == zzbd.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxh.A0A(Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A03), Long.valueOf(this.A02));
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("NetworkLocationStatus:");
        A16.append(" Wifi status: ");
        A16.append(this.A00);
        A16.append(" Cell status: ");
        A16.append(this.A01);
        A16.append(" elapsed time NS: ");
        A16.append(this.A03);
        A16.append(" system time ms: ");
        return Pxe.A10(A16, this.A02);
    }

    public zzbd(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A08(parcel, 3, this.A02);
        C301145yd.A08(parcel, 4, this.A03);
        C301145yd.A06(parcel, A032);
    }
}
