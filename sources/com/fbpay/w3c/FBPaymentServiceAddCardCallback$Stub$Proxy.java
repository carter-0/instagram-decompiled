package com.fbpay.w3c;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;

public final class FBPaymentServiceAddCardCallback$Stub$Proxy implements FBPaymentServiceAddCardCallback {
    public IBinder A00;

    public final void DgV(String str) {
        int A03 = AnonymousClass0fD.A03(1864499208);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1121706190, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1811929652);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(790638230, A03);
        return iBinder;
    }

    public final void onError(String str) {
        int A03 = AnonymousClass0fD.A03(1562235628);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-753278879, A03);
        }
    }
}
