package com.trusteddevice;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;

public final class TdfTrustChainBindingSignPttPayloadCallback$Stub$Proxy implements TdfTrustChainBindingSignPttPayloadCallback {
    public IBinder A00;

    public final void Daq(String str) {
        int A03 = AnonymousClass0fD.A03(127949090);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-178473426, A03);
        }
    }

    public final void Dar(String str) {
        int A03 = AnonymousClass0fD.A03(-771350381);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(147985978, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1886455891);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1550586234, A03);
        return iBinder;
    }
}
