package com.fbpay.w3c;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;

public final class AutofillKeyFetchService$Stub$Proxy implements AutofillKeyFetchService {
    public IBinder A00;

    public final void BYd(AutofillKeyFetchServiceCallback autofillKeyFetchServiceCallback) {
        int A03 = AnonymousClass0fD.A03(-907037063);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.AutofillKeyFetchService");
            obtain.writeStrongInterface(autofillKeyFetchServiceCallback);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(827527645, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(522582386);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-1005545242, A03);
        return iBinder;
    }
}
