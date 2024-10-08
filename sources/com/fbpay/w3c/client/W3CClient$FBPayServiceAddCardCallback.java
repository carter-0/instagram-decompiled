package com.fbpay.w3c.client;

import X.2Fg;
import X.AnonymousClass0fD;
import X.AnonymousClass2Fj;
import X.AnonymousClass7TG;
import X.SEH;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.fbpay.w3c.FBPaymentServiceAddCardCallback;

public final class W3CClient$FBPayServiceAddCardCallback extends Binder implements FBPaymentServiceAddCardCallback {
    public final Context A00;
    public final ServiceConnection A01;
    public final AnonymousClass2Fj A02;
    public final /* synthetic */ 2Fg A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public W3CClient$FBPayServiceAddCardCallback(Context context, ServiceConnection serviceConnection, AnonymousClass2Fj r5, 2Fg r6) {
        this();
        AnonymousClass7TG.A1Q(context, r5);
        this.A03 = r6;
        int A032 = AnonymousClass0fD.A03(2030455983);
        this.A00 = context;
        this.A02 = r5;
        this.A01 = serviceConnection;
        AnonymousClass0fD.A0A(2070080992, A032);
    }

    public final void DgV(String str) {
        int A0D = AnonymousClass7TG.A0D(str, 2009648834);
        this.A02.A0A(new SEH(str, (Throwable) null));
        2Fg.A02(this.A00, this.A01, this.A03);
        AnonymousClass0fD.A0A(-1511772356, A0D);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1854622382, AnonymousClass0fD.A03(-1531229076));
        return this;
    }

    public final void onError(String str) {
        int A0D = AnonymousClass7TG.A0D(str, -1085684141);
        SEH.A00(this.A02, new RemoteException(str));
        2Fg.A02(this.A00, this.A01, this.A03);
        AnonymousClass0fD.A0A(-778519455, A0D);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A032 = AnonymousClass0fD.A03(-679827041);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
                if (i == 1) {
                    DgV(parcel.readString());
                } else if (i == 2) {
                    onError(parcel.readString());
                }
                parcel2.writeNoException();
                i3 = -1002513679;
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
                i3 = 938709291;
            }
            AnonymousClass0fD.A0A(i3, A032);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-464843938, A032);
        return onTransact;
    }

    public W3CClient$FBPayServiceAddCardCallback() {
        int A032 = AnonymousClass0fD.A03(1367463107);
        attachInterface(this, "com.fbpay.w3c.FBPaymentServiceAddCardCallback");
        AnonymousClass0fD.A0A(-1096754480, A032);
    }
}
