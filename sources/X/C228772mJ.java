package X;

import android.net.NetworkInfo;
import android.os.Handler;

/* renamed from: X.2mJ  reason: invalid class name and case insensitive filesystem */
public final class C228772mJ implements AnonymousClass0qK {
    public final /* synthetic */ C228472lj A00;

    public C228772mJ(C228472lj r1) {
        this.A00 = r1;
    }

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            C228472lj r2 = this.A00;
            ((Handler) r2.A0p.getValue()).post(new AnonymousClass4I6(r2));
        }
    }
}
