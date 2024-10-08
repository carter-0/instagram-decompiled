package com.fbpay.w3c.client;

import X.2Fg;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.SEH;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.fbpay.w3c.AutofillKeyFetchServiceCallback;

public final class W3CClient$AutofillKeyFetchServiceCallbackImpl extends Binder implements AutofillKeyFetchServiceCallback {
    public final /* synthetic */ 2Fg A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public W3CClient$AutofillKeyFetchServiceCallbackImpl(2Fg r3) {
        this();
        this.A00 = r3;
        AnonymousClass0fD.A0A(-740512437, AnonymousClass0fD.A03(-1788740951));
    }

    public final void DMn(String str) {
        int A0D = AnonymousClass7TG.A0D(str, -778260113);
        this.A00.A05.A0A(new SEH(str, (Throwable) null));
        AnonymousClass0fD.A0A(-658241482, A0D);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-2097102086, AnonymousClass0fD.A03(2124261914));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(355360402);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                if (i == 1) {
                    DMn(parcel.readString());
                    parcel2.writeNoException();
                    i3 = -194203271;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                i3 = -936323531;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-1874112196, A03);
        return onTransact;
    }

    public W3CClient$AutofillKeyFetchServiceCallbackImpl() {
        int A03 = AnonymousClass0fD.A03(-125617242);
        attachInterface(this, "com.fbpay.w3c.AutofillKeyFetchServiceCallback");
        AnonymousClass0fD.A0A(-1535947328, A03);
    }
}
