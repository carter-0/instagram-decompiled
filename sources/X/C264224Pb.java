package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: X.4Pb  reason: invalid class name and case insensitive filesystem */
public final class C264224Pb implements Handler.Callback, Choreographer.FrameCallback {
    public static final C264224Pb A05 = new C264224Pb();
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public final HandlerThread A03;
    public volatile long A04 = -9223372036854775807L;

    public final void doFrame(long j) {
        this.A04 = j;
        this.A01.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.A01 = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 != 1) {
                return true;
            }
            this.A01.postFrameCallback(this);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.A00 - 1;
            this.A00 = i3;
            if (i3 != 0) {
                return true;
            }
            this.A01.removeFrameCallback(this);
            this.A04 = -9223372036854775807L;
            return true;
        }
    }

    public C264224Pb() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        AnonymousClass0fe.A00(handlerThread);
        this.A03 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.A02 = handler;
        handler.sendEmptyMessage(0);
    }
}
