package com.google.android.gms.internal.location;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzak;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(26);
    public int A00;
    public zzai A01;
    public zzj A02;
    public zzak A03;

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A0A(parcel, this.A02, 2, i, false);
        zzak zzak = this.A03;
        IBinder iBinder = null;
        if (zzak == null) {
            asBinder = null;
        } else {
            asBinder = zzak.asBinder();
        }
        C301145yd.A03(asBinder, parcel, 3);
        zzai zzai = this.A01;
        if (zzai != null) {
            iBinder = zzai.asBinder();
        }
        C301145yd.A03(iBinder, parcel, 4);
        C301145yd.A06(parcel, A032);
    }
}
