package org.chromium;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import android.os.IBinder;
import android.os.Parcel;

public final class IsReadyToPayServiceCallback$Stub$Proxy implements IsReadyToPayServiceCallback {
    public IBinder A00;

    public final void CIm(boolean z) {
        int A03 = AnonymousClass0fD.A03(-1745657688);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.IsReadyToPayServiceCallback");
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(763459629, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-2022918848);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(184839095, A03);
        return iBinder;
    }
}
