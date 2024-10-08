package com.google.android.play.core.splitinstall.internal;

import X.AnonymousClass0fD;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzbm implements IInterface, zzbo {
    public final IBinder A00;

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(210492270);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(25356761, A03);
        return iBinder;
    }

    public zzbm(IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-1581730868);
        this.A00 = iBinder;
        AnonymousClass0fD.A0A(199081014, A03);
        AnonymousClass0fD.A0A(1229888723, AnonymousClass0fD.A03(-174297378));
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0fD.A03(1945677728);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        AnonymousClass0fD.A0A(-818381903, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(1763831065);
        try {
            this.A00.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
            AnonymousClass0fD.A0A(-929959655, A03);
        }
    }
}
