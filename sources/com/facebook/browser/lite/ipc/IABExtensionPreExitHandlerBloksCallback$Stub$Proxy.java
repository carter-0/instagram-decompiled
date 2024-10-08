package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.IBinder;
import android.os.Parcel;

public final class IABExtensionPreExitHandlerBloksCallback$Stub$Proxy implements IABExtensionPreExitHandlerBloksCallback {
    public IBinder A00;

    public final void Czs(String str, String str2, String str3) {
        int A03 = AnonymousClass0fD.A03(-1413791551);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            Pxi.A0z(this.A00, obtain);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(-866955650, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1698125553);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-49936654, A03);
        return iBinder;
    }
}
