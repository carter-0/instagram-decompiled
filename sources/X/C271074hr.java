package X;

import android.os.Handler;
import android.view.View;

/* renamed from: X.4hr  reason: invalid class name and case insensitive filesystem */
public abstract class C271074hr {
    public void A00() {
        Handler handler;
        C271064hq r1 = (C271064hq) this;
        View view = (View) r1.A00.get();
        if (view != null && (handler = view.getHandler()) != null) {
            handler.post(r1);
        }
    }

    public void A01(Throwable th) {
    }
}
