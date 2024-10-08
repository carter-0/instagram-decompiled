package X;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.SdX  reason: case insensitive filesystem */
public final class C11629SdX implements AnonymousClass2gO {
    public final 2Fk A00;
    public final 0sP A01;

    public final void onChanged(Object obj) {
        try {
            this.A01.invoke(obj);
        } catch (RemoteException e) {
            Log.wtf("com.facebook.fbpay.w3c.FBPayObservable", "Callback invocation failed", e);
            this.A00.A08(this);
        }
    }

    public C11629SdX(2Fk r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
