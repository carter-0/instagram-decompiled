package com.trusteddevice;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;

public final class TrustedDeviceFoundationService$Stub$Proxy implements TrustedDeviceFoundationService {
    public IBinder A00;

    public final void BYe(TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback) {
        int A03 = AnonymousClass0fD.A03(-1602253689);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TrustedDeviceFoundationService");
            obtain.writeStrongInterface(tdfCrossAppDeviceKeyCallback);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-601254360, A03);
        }
    }

    public final void Evb(TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback, byte[] bArr) {
        int A03 = AnonymousClass0fD.A03(-1063273470);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TrustedDeviceFoundationService");
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(tdfTrustChainBindingSignPttPayloadCallback);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 3);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1430326307, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(452035007);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-1746639586, A03);
        return iBinder;
    }
}
