package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public final class TJ0 implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ QCZ A01;
    public final /* synthetic */ String A02;

    public TJ0(LifecycleCallback lifecycleCallback, QCZ qcz, String str) {
        this.A01 = qcz;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    public final void run() {
        Bundle bundle;
        QCZ qcz = this.A01;
        if (qcz.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = qcz.A01;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.A02);
            } else {
                bundle = null;
            }
            lifecycleCallback.A04(bundle);
        }
        if (qcz.A00 >= 2) {
            this.A00.A06();
        }
        if (qcz.A00 >= 3) {
            this.A00.A02();
        }
        if (qcz.A00 >= 4) {
            this.A00.A07();
        }
    }
}
