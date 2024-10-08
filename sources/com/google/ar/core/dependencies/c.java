package com.google.ar.core.dependencies;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class c implements IInterface {
    public final IBinder A00;
    public final String A01;

    public c(String str, IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-79936279);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0fD.A0A(351660420, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-2068705332);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-1729244673, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0fD.A03(-1602738171);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0fD.A0A(452269711, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(143463957);
        parcel = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0fD.A0A(-347165406, A03);
        }
    }
}
