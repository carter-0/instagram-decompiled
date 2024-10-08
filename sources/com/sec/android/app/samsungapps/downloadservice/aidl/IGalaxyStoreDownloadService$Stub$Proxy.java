package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class IGalaxyStoreDownloadService$Stub$Proxy implements IGalaxyStoreDownloadService {
    public IBinder A00;

    public final void AGF(String str) {
        int A03 = AnonymousClass0fD.A03(1126411774);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-380424201, A03);
        }
    }

    public final void AQ7(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback) {
        int A03 = AnonymousClass0fD.A03(-1433854231);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongInterface(iGalaxyStoreDownloadCallback);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-733732898, A03);
        }
    }

    public final void CM1(Bundle bundle) {
        int A03 = AnonymousClass0fD.A03(-1804808989);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1816901655, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(2113744178);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1009501896, A03);
        return iBinder;
    }
}
