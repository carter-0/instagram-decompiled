package com.fbpay.w3c;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.IBinder;
import android.os.Parcel;

public final class FBPaymentService$Stub$Proxy implements FBPaymentService {
    public IBinder A00;

    public final void A7m(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback) {
        int A03 = AnonymousClass0fD.A03(-955696107);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
            obtain.writeStrongInterface(fBPaymentServiceAddressCallback);
            Pxi.A10(this.A00, obtain, 5);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-1973957525, A03);
        }
    }

    public final void A80(CardDetails cardDetails, FBPaymentServiceAddCardCallback fBPaymentServiceAddCardCallback) {
        int A03 = AnonymousClass0fD.A03(1970968573);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
            obtain.writeInt(1);
            cardDetails.writeToParcel(obtain, 0);
            obtain.writeStrongInterface(fBPaymentServiceAddCardCallback);
            this.A00.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-1605456731, A03);
        }
    }

    public final void A81(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback) {
        int A03 = AnonymousClass0fD.A03(-59338796);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
            obtain.writeStrongInterface(fBPaymentServiceCardDetailsCallback);
            Pxi.A10(this.A00, obtain, 3);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-385348589, A03);
        }
    }

    public final void A86(FBPaymentServiceContactCallback fBPaymentServiceContactCallback) {
        int A03 = AnonymousClass0fD.A03(562771180);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
            obtain.writeStrongInterface(fBPaymentServiceContactCallback);
            Pxi.A10(this.A00, obtain, 4);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-1841593028, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1947392523);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-472117834, A03);
        return iBinder;
    }
}
