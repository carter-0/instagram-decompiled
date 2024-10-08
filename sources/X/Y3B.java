package X;

import android.media.AudioRecord;
import android.os.Handler;

public final class Y3B implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22018Xss A01;
    public final /* synthetic */ C341687nM A02;

    public Y3B(Handler handler, C22018Xss xss, C341687nM r3) {
        this.A01 = xss;
        this.A02 = r3;
        this.A00 = handler;
    }

    public final void run() {
        C22018Xss xss = this.A01;
        C341687nM r3 = this.A02;
        Handler handler = this.A00;
        synchronized (xss) {
            C341467mw r1 = xss.A09;
            r1.A01("sAR");
            xss.A0F = AnonymousClass05K.A00;
            AudioRecord audioRecord = xss.A02;
            if (audioRecord != null) {
                audioRecord.release();
            }
            xss.A02 = null;
            r1.A01("sARs");
            C18097VlR.A01(r3, handler);
        }
    }
}
