package com.fbpay.w3c.ipc;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass2IJ;
import X.SIW;
import X.TH0;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import org.chromium.IsReadyToPayService;
import org.chromium.IsReadyToPayServiceCallback;

public final class BaseIsReadyToPayServiceImpl$handler$1 extends Binder implements IsReadyToPayService {
    public final /* synthetic */ IsReadyToPayServiceImpl A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseIsReadyToPayServiceImpl$handler$1(IsReadyToPayServiceImpl isReadyToPayServiceImpl) {
        this();
        this.A00 = isReadyToPayServiceImpl;
        AnonymousClass0fD.A0A(-963490237, AnonymousClass0fD.A03(1861477710));
    }

    public final void CaP(IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        int A03 = AnonymousClass0fD.A03(-1049630147);
        0qQ.A0B(isReadyToPayServiceCallback, 0);
        IsReadyToPayServiceImpl isReadyToPayServiceImpl = this.A00;
        0qQ.A0B(isReadyToPayServiceImpl, 0);
        if (!((SIW) AnonymousClass2IJ.A00().A03.getValue()).A01(isReadyToPayServiceImpl, (Intent) null)) {
            isReadyToPayServiceCallback.CIm(false);
        } else {
            isReadyToPayServiceImpl.A00.post(new TH0(isReadyToPayServiceImpl, isReadyToPayServiceCallback));
        }
        AnonymousClass0fD.A0A(-440141967, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(406429348, AnonymousClass0fD.A03(809232851));
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [org.chromium.IsReadyToPayServiceCallback$Stub$Proxy, java.lang.Object] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IsReadyToPayServiceCallback isReadyToPayServiceCallback;
        int A03 = AnonymousClass0fD.A03(1467281001);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("org.chromium.IsReadyToPayService");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        isReadyToPayServiceCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.IsReadyToPayServiceCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IsReadyToPayServiceCallback)) {
                            ? obj = new Object();
                            int A032 = AnonymousClass0fD.A03(295817915);
                            obj.A00 = readStrongBinder;
                            AnonymousClass0fD.A0A(1595062059, A032);
                            isReadyToPayServiceCallback = obj;
                        } else {
                            isReadyToPayServiceCallback = (IsReadyToPayServiceCallback) queryLocalInterface;
                        }
                    }
                    CaP(isReadyToPayServiceCallback);
                    i3 = -1781826570;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("org.chromium.IsReadyToPayService");
                i3 = -1969948559;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-335294993, A03);
        return onTransact;
    }

    public BaseIsReadyToPayServiceImpl$handler$1() {
        int A03 = AnonymousClass0fD.A03(-1685531222);
        attachInterface(this, "org.chromium.IsReadyToPayService");
        AnonymousClass0fD.A0A(1814162377, A03);
    }
}
