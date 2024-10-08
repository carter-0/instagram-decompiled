package com.fbpay.w3c;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;

public final class AutofillKeyFetchServiceCallback$Stub$Proxy implements AutofillKeyFetchServiceCallback {
    public IBinder A00;

    public final void DMn(String str) {
        int A03 = AnonymousClass0fD.A03(996782361);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(115435972, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(590248331);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(212583117, A03);
        return iBinder;
    }
}
