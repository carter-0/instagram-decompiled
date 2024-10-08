package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.TIz  reason: case insensitive filesystem */
public final class C13043TIz implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ Q5M A01;
    public final /* synthetic */ String A02;

    public C13043TIz(LifecycleCallback lifecycleCallback, Q5M q5m, String str) {
        this.A01 = q5m;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    public final void run() {
        Bundle bundle;
        Q5M q5m = this.A01;
        if (q5m.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = q5m.A01;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.A02);
            } else {
                bundle = null;
            }
            lifecycleCallback.A04(bundle);
        }
        if (q5m.A00 >= 2) {
            this.A00.A06();
        }
        if (q5m.A00 >= 3) {
            this.A00.A02();
        }
        if (q5m.A00 >= 4) {
            this.A00.A07();
        }
    }
}
