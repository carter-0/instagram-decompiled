package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.56e  reason: invalid class name and case insensitive filesystem */
public final class C2811656e {
    public static C2811656e A02 = new C2811656e();
    public Choreographer A00;
    public final Handler A01;

    public static C2811656e A00() {
        return A02;
    }

    public final void A01(C2811856g r5) {
        r5.A02.set((Object) null);
        Choreographer choreographer = this.A00;
        if (choreographer != null) {
            Choreographer.FrameCallback frameCallback = r5.A00;
            if (frameCallback == null) {
                frameCallback = new C2813156u(r5);
                r5.A00 = frameCallback;
            }
            choreographer.postFrameCallback(frameCallback);
            return;
        }
        Handler handler = this.A01;
        Runnable runnable = r5.A01;
        if (runnable == null) {
            runnable = new C22378Y1g(r5);
            r5.A01 = runnable;
        }
        handler.postDelayed(runnable, 0);
    }

    public final void A02(C2811856g r5, long j) {
        r5.A02.set((Object) null);
        Choreographer choreographer = this.A00;
        if (choreographer != null) {
            Choreographer.FrameCallback frameCallback = r5.A00;
            if (frameCallback == null) {
                frameCallback = new C2813156u(r5);
                r5.A00 = frameCallback;
            }
            choreographer.postFrameCallbackDelayed(frameCallback, j);
            return;
        }
        Handler handler = this.A01;
        Runnable runnable = r5.A01;
        if (runnable == null) {
            runnable = new C22378Y1g(r5);
            r5.A01 = runnable;
        }
        handler.postDelayed(runnable, j + 17);
    }

    public C2811656e() {
        if (C245983dn.A03()) {
            this.A00 = Choreographer.getInstance();
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.A01 = handler;
        handler.post(new C22379Y1h(this));
    }
}
