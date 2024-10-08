package X;

import android.net.NetworkInfo;

/* renamed from: X.352  reason: invalid class name */
public final class AnonymousClass352 implements AnonymousClass0qK {
    public final /* synthetic */ C2365134a A00;

    public AnonymousClass352(C2365134a r1) {
        this.A00 = r1;
    }

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            C2365134a r0 = this.A00;
            r0.A0O.A0I(r0.A0G, (AnonymousClass2l3) null, AnonymousClass05K.A03);
        }
    }
}
