package X;

import android.os.Handler;

/* renamed from: X.Aqc  reason: case insensitive filesystem */
public final class C41240Aqc implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ C341607nE A02;
    public final /* synthetic */ C343487qI A03;
    public final /* synthetic */ C341427mr A04;
    public final /* synthetic */ C341687nM A05;

    public C41240Aqc(Handler handler, Handler handler2, C341607nE r3, C343487qI r4, C341427mr r5, C341687nM r6) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = handler;
        this.A05 = r6;
        this.A01 = handler2;
    }

    public final void run() {
        C341427mr r3 = this.A04;
        C343487qI r5 = this.A03;
        C341607nE r6 = this.A02;
        Handler handler = this.A00;
        C341687nM r2 = this.A05;
        Handler handler2 = this.A01;
        r3.A0I.A05.A01("prAS");
        C3730593v r4 = r3.A03;
        if (r4 == null || !r3.A07) {
            C341427mr.A01(handler2, new C382299dT("Audio pipeline should not be null or not resumed"), r2, "prepareRecorder");
        } else {
            r4.prepareRecorder(r5, r6, handler, new ATR(handler2, r3, r2, 0), handler2);
        }
    }
}
