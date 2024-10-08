package com.fbpay.w3c;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class FBPaymentServiceCardDetailsCallback$Stub$Proxy implements FBPaymentServiceCardDetailsCallback {
    public IBinder A00;

    public final void DvO(List list) {
        int A03 = AnonymousClass0fD.A03(860508626);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
            obtain2.readTypedList(list, W3CCardDetail.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1268753590, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1973448199);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(248855082, A03);
        return iBinder;
    }
}
