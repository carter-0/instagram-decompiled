package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

public final class XF9 implements ViewTreeObserver.OnDrawListener {
    public boolean A00;
    public final View A01;
    public final C62320sa A02;

    public final void onDraw() {
        if (!this.A00) {
            this.A00 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new Y27(this));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        this.A01.post(new Y28(this));
    }

    public XF9(View view, C62320sa r2) {
        this.A01 = view;
        this.A02 = r2;
    }
}
