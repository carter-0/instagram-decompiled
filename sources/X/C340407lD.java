package X;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

/* renamed from: X.7lD  reason: invalid class name and case insensitive filesystem */
public final class C340407lD {
    public WeakReference A00;
    public C372028zY A01;

    public final synchronized void A00(C372028zY r2) {
        this.A01 = r2;
        if (r2 != null) {
            r2.A02(this.A00);
        }
    }

    public final void A01(WeakReference weakReference) {
        boolean z = false;
        if (weakReference != this.A00) {
            this.A00 = weakReference;
            z = true;
        }
        synchronized (this) {
            if (z) {
                C372028zY r1 = this.A01;
                if (r1 != null) {
                    r1.A02(this.A00);
                }
            }
        }
    }

    public final synchronized boolean A02(MotionEvent motionEvent) {
        boolean z;
        C372028zY r0 = this.A01;
        if (r0 == null) {
            z = false;
        } else {
            z = r0.A03(motionEvent, 0);
        }
        return z;
    }
}
