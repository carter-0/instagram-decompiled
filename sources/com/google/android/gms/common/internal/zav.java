package com.google.android.gms.common.internal;

import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWX;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(32);
    public final int A00;
    public final IBinder A01;
    public final ConnectionResult A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        IAccountAccessor A002;
        IAccountAccessor A003;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof zav) {
                    zav zav = (zav) obj;
                    if (this.A02.equals(zav.A02)) {
                        IBinder iBinder = this.A01;
                        if (iBinder == null) {
                            A002 = null;
                        } else {
                            A002 = AccountAccessor.A00(iBinder);
                        }
                        IBinder iBinder2 = zav.A01;
                        if (iBinder2 == null) {
                            A003 = null;
                        } else {
                            A003 = AccountAccessor.A00(iBinder2);
                        }
                        if (SA1.A01(A002, A003)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public zav(IBinder iBinder, ConnectionResult connectionResult, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = iBinder;
        this.A02 = connectionResult;
        this.A03 = z;
        this.A04 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A03(this.A01, parcel, 2);
        C301145yd.A0A(parcel, this.A02, 3, i, false);
        C301145yd.A09(parcel, 4, this.A03);
        C301145yd.A09(parcel, 5, this.A04);
        C301145yd.A06(parcel, A032);
    }
}
