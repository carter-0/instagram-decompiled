package X;

import android.net.NetworkInfo;

/* renamed from: X.0q9  reason: invalid class name and case insensitive filesystem */
public final class C61890q9 implements AnonymousClass0qK {
    public final /* synthetic */ 0rJ A00;

    public C61890q9(0rJ r1) {
        this.A00 = r1;
    }

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            this.A00.A00();
        }
    }
}
