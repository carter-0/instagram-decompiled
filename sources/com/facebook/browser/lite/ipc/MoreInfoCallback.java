package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface MoreInfoCallback extends IInterface {

    public abstract class Stub extends Binder implements MoreInfoCallback {
        public static void A00(IBinder iBinder) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.MoreInfoCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof MoreInfoCallback)) {
                    AnonymousClass0fD.A0A(796634712, AnonymousClass0fD.A03(-265240033));
                }
            }
        }
    }
}
