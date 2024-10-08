package com.google.android.gms.internal.location;

import X.AnonymousClass0fD;
import android.os.Parcel;

public final class zzao extends zzb implements zzal {
    public final void FP5(zzbe zzbe) {
        int A03 = AnonymousClass0fD.A03(-226271384);
        int A032 = AnonymousClass0fD.A03(489795492);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A00);
        AnonymousClass0fD.A0A(-1050705418, A032);
        obtain.writeInt(1);
        zzbe.writeToParcel(obtain, 0);
        A00(obtain, 59);
        AnonymousClass0fD.A0A(-1112872494, A03);
    }
}
