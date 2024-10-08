package X;

import android.os.Looper;

/* renamed from: X.55m  reason: invalid class name and case insensitive filesystem */
public final class C2810155m implements AnonymousClass4D6 {
    public static final C2810155m A00 = new Object();

    public final void schedule(AnonymousClass11X r3) {
        if (r3 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (!C62000qj.A02.A0P || (!0qQ.A0K(Looper.getMainLooper(), Looper.myLooper()))) {
            r3.onStart();
            r3.run();
            r3.onFinish();
        } else {
            throw new IllegalStateException(002.A0R("ImmediateScheduler.schedule() called on main thread: task=", r3.getName()));
        }
    }

    public final void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
