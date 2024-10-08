package X;

import android.net.NetworkInfo;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: X.2mH  reason: invalid class name and case insensitive filesystem */
public final class C228762mH implements AnonymousClass0qK {
    public final WeakReference A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(AnonymousClass2mI.A00);

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            ((Handler) this.A01.getValue()).post(new C239233Fp(this));
        }
    }

    public C228762mH(C62320sa r2) {
        this.A00 = new WeakReference(r2);
    }
}
