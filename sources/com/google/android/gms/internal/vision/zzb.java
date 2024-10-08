package com.google.android.gms.internal.vision;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzb implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-1638587878);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0fD.A0A(-1751965058, A03);
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0fD.A03(-2046101151);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0fD.A0A(-2105106140, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(1649271168);
        parcel = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0fD.A0A(1060249796, A03);
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(-752308422);
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-60744900, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1029853520);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1436259827, A03);
        return iBinder;
    }
}
