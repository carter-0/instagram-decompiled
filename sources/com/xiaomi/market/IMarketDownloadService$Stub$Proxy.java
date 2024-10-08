package com.xiaomi.market;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import X.Pxg;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class IMarketDownloadService$Stub$Proxy implements IMarketDownloadService {
    public IBinder A00;

    public final boolean AG8(String str) {
        int A03 = AnonymousClass0fD.A03(-2022353659);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            obtain.writeString(str);
            boolean z = false;
            if (Pxg.A02(this.A00, obtain, obtain2, 4) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-2095468727, A03);
        }
    }

    public final boolean AQ6(Bundle bundle) {
        int A03 = AnonymousClass0fD.A03(-495027169);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            boolean z = false;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            if (Pxg.A02(this.A00, obtain, obtain2, 1) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(111992093, A03);
        }
    }

    public final int AXa() {
        int A03 = AnonymousClass0fD.A03(-157122105);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 8);
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1927447758, A03);
        }
    }

    public final boolean CQd() {
        int A03 = AnonymousClass0fD.A03(-1772007582);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            boolean z = false;
            if (Pxg.A02(this.A00, obtain, obtain2, 7) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-162752194, A03);
        }
    }

    public final boolean EBZ(IDownloadCallback iDownloadCallback) {
        int A03 = AnonymousClass0fD.A03(-1603349227);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            obtain.writeStrongInterface(iDownloadCallback);
            boolean z = false;
            if (Pxg.A02(this.A00, obtain, obtain2, 5) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(2119061890, A03);
        }
    }

    public final boolean FIM(IDownloadCallback iDownloadCallback) {
        int A03 = AnonymousClass0fD.A03(-78849943);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            obtain.writeStrongInterface(iDownloadCallback);
            boolean z = false;
            if (Pxg.A02(this.A00, obtain, obtain2, 6) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(499832632, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1508016265);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(377503589, A03);
        return iBinder;
    }
}
