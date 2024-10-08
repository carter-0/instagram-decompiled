package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class OnShopsLiteCallback$Stub$Proxy implements OnShopsLiteCallback {
    public IBinder A00;

    public final void DS1(Bundle bundle) {
        int A03 = AnonymousClass0fD.A03(-527650080);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            Pxi.A10(this.A00, obtain, 2);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-1858213395, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-628686181);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(646421585, A03);
        return iBinder;
    }
}
