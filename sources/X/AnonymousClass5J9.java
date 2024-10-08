package X;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5J9  reason: invalid class name */
public final class AnonymousClass5J9 implements AnonymousClass5J8 {
    public final WeakHashMap A00 = new WeakHashMap();
    public final ReentrantLock A01 = new ReentrantLock();
    public final AnonymousClass5J8 A02;

    public final void E0T(Activity activity, C265674Vs r5) {
        0qQ.A0B(activity, 0);
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.A00;
            if (!0qQ.A0K(r5, (C265674Vs) weakHashMap.get(activity))) {
                weakHashMap.put(activity, r5);
                reentrantLock.unlock();
                this.A02.E0T(activity, r5);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public AnonymousClass5J9(AnonymousClass5J8 r2) {
        this.A02 = r2;
    }
}
