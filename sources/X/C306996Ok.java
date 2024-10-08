package X;

import android.view.MotionEvent;

/* renamed from: X.6Ok  reason: invalid class name and case insensitive filesystem */
public final class C306996Ok implements Runnable {
    public final /* synthetic */ C306976Oi A00;

    public C306996Ok(C306976Oi r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        C306976Oi r3 = this.A00;
        C307026On r0 = r3.A00;
        if (r0 != null) {
            MotionEvent obtain = MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0);
            try {
                r0.A04.onTouchEvent(obtain);
                obtain.recycle();
                r3.A00 = null;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        r3.A01 = null;
        r3.A02 = false;
    }
}
