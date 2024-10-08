package com.google.android.gms.internal.p002authapi;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth-api.zba  reason: invalid package */
public abstract class zba implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zba(String str, IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(203213487);
        this.A01 = iBinder;
        this.A00 = str;
        AnonymousClass0fD.A0A(496381104, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(250671105);
        IBinder iBinder = this.A01;
        AnonymousClass0fD.A0A(1592559146, A03);
        return iBinder;
    }

    public static Parcel A00(IInterface iInterface, Parcelable parcelable, zba zba) {
        int A03 = AnonymousClass0fD.A03(1625149835);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(zba.A00);
        AnonymousClass0fD.A0A(-135530439, A03);
        obtain.writeStrongBinder(iInterface.asBinder());
        if (parcelable == null) {
            obtain.writeInt(0);
            return obtain;
        }
        obtain.writeInt(1);
        parcelable.writeToParcel(obtain, 0);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(-1096005477);
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A01, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(849984768, A03);
        }
    }
}
