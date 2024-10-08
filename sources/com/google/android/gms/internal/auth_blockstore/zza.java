package com.google.android.gms.internal.auth_blockstore;

import X.AnonymousClass0fD;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zza implements IInterface {
    public final IBinder A00;

    public zza(IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-665896670);
        this.A00 = iBinder;
        AnonymousClass0fD.A0A(1822895881, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-354355501);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1941155577, A03);
        return iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(1610818168);
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(2056383776, A03);
        }
    }
}
