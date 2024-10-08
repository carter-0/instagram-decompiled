package X;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: X.JdG  reason: case insensitive filesystem */
public final class C60007JdG extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ LCW A00;
    public final /* synthetic */ C252683pV A01;

    public C60007JdG(LCW lcw, C252683pV r2) {
        this.A01 = r2;
        this.A00 = lcw;
    }

    public final void onAvailable(Network network) {
        this.A01.FIG(this.A00.A00());
    }

    public final void onLost(Network network) {
        this.A01.FIG(C62471KgM.NONE);
    }
}
