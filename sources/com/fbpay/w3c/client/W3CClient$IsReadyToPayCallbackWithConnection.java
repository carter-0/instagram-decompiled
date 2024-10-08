package com.fbpay.w3c.client;

import X.2Fg;
import X.AnonymousClass0fD;
import X.C13623Tdp;
import X.C41848B3p;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import org.chromium.IsReadyToPayServiceCallback;

public final class W3CClient$IsReadyToPayCallbackWithConnection extends Binder implements IsReadyToPayServiceCallback {
    public final ServiceConnection A00;
    public final C13623Tdp A01;
    public final /* synthetic */ 2Fg A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public W3CClient$IsReadyToPayCallbackWithConnection(ServiceConnection serviceConnection, C13623Tdp tdp, 2Fg r5) {
        this();
        this.A02 = r5;
        int A03 = AnonymousClass0fD.A03(340105661);
        this.A01 = tdp;
        this.A00 = serviceConnection;
        AnonymousClass0fD.A0A(603062361, A03);
    }

    public final void CIm(boolean z) {
        int A03 = AnonymousClass0fD.A03(571402971);
        try {
            this.A01.DLl(z);
        } finally {
            2Fg r2 = this.A02;
            2Fg.A02(r2.A04, this.A00, r2);
            AnonymousClass0fD.A0A(2065774221, A03);
        }
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1062875995, AnonymousClass0fD.A03(1847805771));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(595941057);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("org.chromium.IsReadyToPayServiceCallback");
                if (i == 1) {
                    CIm(C41848B3p.A1X(parcel));
                    i3 = 933607406;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("org.chromium.IsReadyToPayServiceCallback");
                i3 = -71856580;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-2043261294, A03);
        return onTransact;
    }

    public W3CClient$IsReadyToPayCallbackWithConnection() {
        int A03 = AnonymousClass0fD.A03(283946562);
        attachInterface(this, "org.chromium.IsReadyToPayServiceCallback");
        AnonymousClass0fD.A0A(1757333620, A03);
    }
}
