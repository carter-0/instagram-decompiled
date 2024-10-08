package X;

import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: X.SaW  reason: case insensitive filesystem */
public final class C11468SaW implements Choreographer.FrameCallback {
    public final /* synthetic */ Q7x A00;

    public C11468SaW(Q7x q7x) {
        this.A00 = q7x;
    }

    public final void doFrame(long j) {
        Q7x q7x = this.A00;
        if (q7x.A0G || q7x.A02 == null) {
            q7x.A0B.removeFrameCallback(q7x.A0A);
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = new C10326RqO(j);
        Handler handler = q7x.A02;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
    }
}
