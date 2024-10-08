package X;

import android.view.Choreographer;

/* renamed from: X.7GI  reason: invalid class name */
public final class AnonymousClass7GI implements Choreographer.FrameCallback {
    public final Choreographer A00;
    public final C62320sa A01;
    public final /* synthetic */ AnonymousClass7UL A02;

    public AnonymousClass7GI(Choreographer choreographer, AnonymousClass7UL r3, C62320sa r4) {
        0qQ.A0B(choreographer, 2);
        this.A02 = r3;
        this.A00 = choreographer;
        this.A01 = r4;
    }

    public final void doFrame(long j) {
        this.A01.invoke();
        this.A00.removeFrameCallback(this);
    }
}
