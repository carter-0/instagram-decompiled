package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.IBinder;
import android.os.Parcel;

public final class IGalaxyStoreDownloadCallback$Stub$Proxy implements IGalaxyStoreDownloadCallback {
    public IBinder A00;

    public final void DaU(String str, float f, long j) {
        int A03 = AnonymousClass0fD.A03(-1116893604);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeLong(100);
            obtain.writeFloat(f);
            Pxi.A10(this.A00, obtain, 3);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(609468397, A03);
        }
    }

    public final void DCp(String str, int i) {
        int A03 = AnonymousClass0fD.A03(1262266218);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            Pxi.A10(this.A00, obtain, 2);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(1793551453, A03);
        }
    }

    public final void Dmp(String str, int i, String str2) {
        int A03 = AnonymousClass0fD.A03(1513386760);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            Pxi.A0z(this.A00, obtain);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-103999645, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1284916534);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-1826486074, A03);
        return iBinder;
    }
}
