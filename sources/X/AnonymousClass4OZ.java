package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4OZ  reason: invalid class name */
public final class AnonymousClass4OZ implements Runnable {
    public final WeakReference A00;

    public AnonymousClass4OZ(AnonymousClass4NN r2) {
        0qQ.A0B(r2, 1);
        this.A00 = new WeakReference(r2);
    }

    public final void run() {
        AnonymousClass4NN r0 = (AnonymousClass4NN) this.A00.get();
        if (r0 != null) {
            AnonymousClass4NN.A03(r0);
        }
    }
}
