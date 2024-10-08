package com.xiaomi.market;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;

public final class IDownloadCallback$Stub$Proxy implements IDownloadCallback {
    public IBinder A00;

    public final void DaU(String str, float f, long j) {
        int A03 = AnonymousClass0fD.A03(-564295723);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeLong(100);
            obtain.writeFloat(f);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 3);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-259536704, A03);
        }
    }

    public final void DCq(String str, int i, String str2) {
        int A03 = AnonymousClass0fD.A03(-2107269528);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1818176817, A03);
        }
    }

    public final void Dmp(String str, int i, String str2) {
        int A03 = AnonymousClass0fD.A03(98528078);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-865783883, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1509759323);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1713897700, A03);
        return iBinder;
    }
}
