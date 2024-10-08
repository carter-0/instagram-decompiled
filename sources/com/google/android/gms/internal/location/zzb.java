package com.google.android.gms.internal.location;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzb implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(335478558);
        this.A01 = iBinder;
        this.A00 = str;
        AnonymousClass0fD.A0A(658887038, A03);
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(-1066251307);
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A01, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-493153613, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-856015257);
        IBinder iBinder = this.A01;
        AnonymousClass0fD.A0A(440586488, A03);
        return iBinder;
    }
}
