package com.google.android.gms.internal.fido;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zza implements IInterface {
    public final String A00 = "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    public final IBinder A01;

    public zza(IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(1141805010);
        this.A01 = iBinder;
        AnonymousClass0fD.A0A(332168626, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(9426838);
        IBinder iBinder = this.A01;
        AnonymousClass0fD.A0A(-950449876, A03);
        return iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(-691077886);
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A01, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1844929344, A03);
        }
    }
}
