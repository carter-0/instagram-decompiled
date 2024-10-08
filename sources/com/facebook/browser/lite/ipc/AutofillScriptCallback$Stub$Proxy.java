package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.IBinder;
import android.os.Parcel;

public final class AutofillScriptCallback$Stub$Proxy implements AutofillScriptCallback {
    public IBinder A00;

    public final void Czq(String str) {
        int A03 = AnonymousClass0fD.A03(-1602331463);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillScriptCallback");
            obtain.writeString(str);
            Pxi.A0z(this.A00, obtain);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-1732556768, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(475732767);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(700273535, A03);
        return iBinder;
    }
}
