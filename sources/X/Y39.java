package X;

import android.media.AudioRecord;
import android.os.Handler;

public final class Y39 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22018Xss A01;
    public final /* synthetic */ C341687nM A02;

    public Y39(Handler handler, C22018Xss xss, C341687nM r3) {
        this.A01 = xss;
        this.A02 = r3;
        this.A00 = handler;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9tX, X.9dT] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.9tX, X.9dT] */
    public final void run() {
        C22018Xss xss = this.A01;
        C341687nM r4 = this.A02;
        Handler handler = this.A00;
        if (xss.A0F != AnonymousClass05K.A00) {
            ? r0 = new C391719tX(22002, "Must only call prepare() on a stopped AudioRecorder.");
            C22018Xss.A02(r0, xss);
            C18097VlR.A00(handler, r0, r4);
            return;
        }
        try {
            C341467mw r1 = xss.A09;
            r1.A01("pAR");
            int i = xss.A04;
            C343487qI r02 = xss.A08;
            AudioRecord audioRecord = new AudioRecord(i, r02.A04, r02.A01, r02.A02, xss.A01);
            xss.A02 = audioRecord;
            if (audioRecord.getState() != 0) {
                r1.A01("pARs");
                xss.A0F = AnonymousClass05K.A01;
                C18097VlR.A01(r4, handler);
                return;
            }
            throw AnonymousClass7TE.A0z(AnonymousClass000.A00(2185));
        } catch (Exception e) {
            xss.A09.A01("pARe");
            ? r03 = new C391719tX(22002, (Throwable) e);
            C22018Xss.A02(r03, xss);
            C18097VlR.A00(handler, r03, r4);
        }
    }
}
