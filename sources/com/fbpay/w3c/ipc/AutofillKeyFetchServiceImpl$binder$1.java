package com.fbpay.w3c.ipc;

import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.Pxf;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.fbpay.w3c.AutofillKeyFetchService;
import com.fbpay.w3c.AutofillKeyFetchServiceCallback;

public final class AutofillKeyFetchServiceImpl$binder$1 extends Binder implements AutofillKeyFetchService {
    public AutofillKeyFetchServiceImpl$binder$1() {
        int A03 = AnonymousClass0fD.A03(-2086826610);
        attachInterface(this, "com.fbpay.w3c.AutofillKeyFetchService");
        AnonymousClass0fD.A0A(-1626864496, A03);
        AnonymousClass0fD.A0A(1805563517, AnonymousClass0fD.A03(-1713676913));
    }

    public final void BYd(AutofillKeyFetchServiceCallback autofillKeyFetchServiceCallback) {
        int A0D = AnonymousClass7TG.A0D(autofillKeyFetchServiceCallback, -681092645);
        autofillKeyFetchServiceCallback.DMn(Pxf.A0k("autofill_key"));
        AnonymousClass0fD.A0A(1418425937, A0D);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1775177058, AnonymousClass0fD.A03(-1135029640));
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.fbpay.w3c.AutofillKeyFetchServiceCallback$Stub$Proxy, java.lang.Object] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        AutofillKeyFetchServiceCallback autofillKeyFetchServiceCallback;
        int A03 = AnonymousClass0fD.A03(-1395777180);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.AutofillKeyFetchService");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        autofillKeyFetchServiceCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AutofillKeyFetchServiceCallback)) {
                            ? obj = new Object();
                            int A032 = AnonymousClass0fD.A03(628504447);
                            obj.A00 = readStrongBinder;
                            AnonymousClass0fD.A0A(-1903702369, A032);
                            autofillKeyFetchServiceCallback = obj;
                        } else {
                            autofillKeyFetchServiceCallback = (AutofillKeyFetchServiceCallback) queryLocalInterface;
                        }
                    }
                    BYd(autofillKeyFetchServiceCallback);
                    parcel2.writeNoException();
                    i3 = 1179263099;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.AutofillKeyFetchService");
                i3 = 2114756982;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-199218179, A03);
        return onTransact;
    }
}
