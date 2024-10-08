package X;

import android.view.Choreographer;

/* renamed from: X.5tn  reason: invalid class name and case insensitive filesystem */
public final class C298645tn implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass5PQ A00;
    public final /* synthetic */ 0sP A01;
    public final /* synthetic */ 1IX A02;

    public C298645tn(AnonymousClass5PQ r1, 0sP r2, 1IX r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void doFrame(long j) {
        Object obj;
        1IX r2 = this.A02;
        try {
            obj = this.A01.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = new 0eQ(th);
        }
        r2.resumeWith(obj);
    }
}
