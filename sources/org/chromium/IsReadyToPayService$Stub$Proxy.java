package org.chromium;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.IBinder;
import android.os.Parcel;

public final class IsReadyToPayService$Stub$Proxy implements IsReadyToPayService {
    public IBinder A00;

    public final void CaP(IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        int A03 = AnonymousClass0fD.A03(-2082030202);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.IsReadyToPayService");
            obtain.writeStrongInterface(isReadyToPayServiceCallback);
            Pxi.A0z(this.A00, obtain);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(1560862038, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1198109200);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-274148220, A03);
        return iBinder;
    }
}
