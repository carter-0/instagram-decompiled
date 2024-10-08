package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: X.4Pk  reason: invalid class name and case insensitive filesystem */
public final class C264314Pk implements Handler.Callback, Choreographer.FrameCallback {
    public static final C264314Pk A05 = new C264314Pk();
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public final HandlerThread A03;
    public volatile long A04 = -9223372036854775807L;

    public final void doFrame(long j) {
        this.A04 = j;
        Choreographer choreographer = this.A01;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.A01 = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e) {
                2AG.A06(AnonymousClass000.A00(4414), AnonymousClass000.A00(2537), e);
                return true;
            }
        } else if (i == 1) {
            Choreographer choreographer = this.A01;
            if (choreographer == null) {
                return true;
            }
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 != 1) {
                return true;
            }
            choreographer.postFrameCallback(this);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.A01;
            if (choreographer2 == null) {
                return true;
            }
            int i3 = this.A00 - 1;
            this.A00 = i3;
            if (i3 != 0) {
                return true;
            }
            choreographer2.removeFrameCallback(this);
            this.A04 = -9223372036854775807L;
            return true;
        }
    }

    public C264314Pk() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        AnonymousClass0fe.A00(handlerThread);
        this.A03 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.A02 = handler;
        handler.sendEmptyMessage(0);
    }
}
