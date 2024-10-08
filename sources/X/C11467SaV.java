package X;

import android.view.Choreographer;
import com.facebook.react.bridge.queue.MessageQueueThread;

/* renamed from: X.SaV  reason: case insensitive filesystem */
public final class C11467SaV implements Choreographer.FrameCallback {
    public final /* synthetic */ C12216SpG A00;

    public C11467SaV(C12216SpG spG) {
        this.A00 = spG;
    }

    public final void doFrame(long j) {
        C12216SpG spG = this.A00;
        if (!spG.A0D.get() || spG.A0E.get()) {
            C13024TIg tIg = spG.A00;
            if (tIg != null) {
                tIg.A01 = true;
            }
            C13024TIg tIg2 = new C13024TIg(spG, j);
            spG.A00 = tIg2;
            MessageQueueThread messageQueueThread = spG.A05.A03;
            0Sd.A00(messageQueueThread);
            messageQueueThread.runOnQueue(tIg2);
            spG.A08.A02(this, RFI.IDLE_EVENT);
        }
    }
}
