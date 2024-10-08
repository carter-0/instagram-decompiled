package X;

import android.os.Handler;
import android.view.Choreographer;

/* renamed from: X.6NV  reason: invalid class name */
public final class AnonymousClass6NV implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass6QX A00;

    public AnonymousClass6NV(AnonymousClass6QX r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        AnonymousClass6QX r2 = this.A00;
        ((Handler) r2.A05.getValue()).postAtFrontOfQueue(r2.A03);
    }
}
