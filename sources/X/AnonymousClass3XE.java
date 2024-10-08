package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3XE  reason: invalid class name */
public final class AnonymousClass3XE {
    public final Choreographer.FrameCallback A00 = new AnonymousClass3XF(this);
    public final Runnable A01 = new AnonymousClass3XG(this);
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final AtomicReference A03 = new AtomicReference("");
    public final AtomicReference A04 = new AtomicReference();
    public final /* synthetic */ ComponentTree A05;

    public AnonymousClass3XE(ComponentTree componentTree) {
        this.A05 = componentTree;
        AtomicReference atomicReference = this.A04;
        if (atomicReference.get() != null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            atomicReference.set(Choreographer.getInstance());
            return;
        }
        AnonymousClass2Ss r1 = this.A05.A0D;
        Runnable runnable = this.A01;
        0qQ.A0B(runnable, 0);
        ((Handler) r1).postAtFrontOfQueue(runnable);
    }
}
