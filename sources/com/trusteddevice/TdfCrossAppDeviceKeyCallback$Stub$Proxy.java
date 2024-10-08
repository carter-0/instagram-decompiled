package com.trusteddevice;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;

public final class TdfCrossAppDeviceKeyCallback$Stub$Proxy implements TdfCrossAppDeviceKeyCallback {
    public IBinder A00;

    public final void D7I(String str) {
        int A03 = AnonymousClass0fD.A03(-2060704538);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(776700380, A03);
        }
    }

    public final void D7J(String str, String str2) {
        int A03 = AnonymousClass0fD.A03(-2060008766);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-929191204, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(399972138);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1525836972, A03);
        return iBinder;
    }
}
