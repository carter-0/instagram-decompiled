package com.meta.arfx.engine.interfaces;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.Pxd;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class IARNetworkClientWorkerHost$Stub$Proxy implements IARNetworkClientWorkerHost {
    public IBinder A00;

    public final void AI8(String str) {
        int A03 = AnonymousClass0fD.A03(188885147);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(Pxd.A00(32));
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 3);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-277715726, A03);
        }
    }

    public final Bundle Bnl() {
        Object obj;
        int A03 = AnonymousClass0fD.A03(-952689277);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(Pxd.A00(32));
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
            Parcelable.Creator creator = Bundle.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            return (Bundle) obj;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(692843032, A03);
        }
    }

    public final void EMa(String str, String str2, String str3, String str4, String[] strArr, String[] strArr2, boolean z) {
        int A03 = AnonymousClass0fD.A03(2130548200);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(Pxd.A00(32));
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeStringArray(strArr);
            obtain.writeStringArray(strArr2);
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-295749193, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(312878635);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-1300226794, A03);
        return iBinder;
    }
}
