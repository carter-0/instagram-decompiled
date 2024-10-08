package X;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3XG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3XG implements Runnable {
    public final /* synthetic */ AnonymousClass3XE A00;

    public /* synthetic */ AnonymousClass3XG(AnonymousClass3XE r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3XE r2 = this.A00;
        AtomicReference atomicReference = r2.A04;
        atomicReference.set(Choreographer.getInstance());
        if (r2.A02.get() > 0) {
            ((Choreographer) atomicReference.get()).postFrameCallback(r2.A00);
        }
    }
}
