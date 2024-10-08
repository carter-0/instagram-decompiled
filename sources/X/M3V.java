package X;

import android.net.Uri;

public final class M3V implements Runnable {
    public final /* synthetic */ K6Y A00;

    public M3V(K6Y k6y) {
        this.A00 = k6y;
    }

    public final void run() {
        K6Y k6y = this.A00;
        AnonymousClass0vF r0 = K6Y.A0O;
        Uri uri = k6y.A03;
        if (uri != null) {
            K6Y.A00(uri, (Uri) null, k6y);
        }
    }
}
