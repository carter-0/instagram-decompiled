package X;

import java.lang.ref.WeakReference;

public final class TAc implements Runnable {
    public final WeakReference A00;

    public final void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((QDG) weakReference.get()).A0M = false;
        }
    }

    public TAc(QDG qdg) {
        this.A00 = C51965G9l.A0v(qdg);
    }
}
