package com.fbpay.w3c;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class FBPaymentServiceAddressCallback$Stub$Proxy implements FBPaymentServiceAddressCallback {
    public IBinder A00;

    public final void DvO(List list) {
        int A03 = AnonymousClass0fD.A03(1880098880);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceAddressCallback");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
            obtain2.readTypedList(list, Address.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(2034643464, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1232462984);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-1356085874, A03);
        return iBinder;
    }
}
