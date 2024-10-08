package X;

import android.os.SystemClock;

/* renamed from: X.Am8  reason: case insensitive filesystem */
public final class C40962Am8 implements Runnable {
    public final /* synthetic */ C39676A4s A00;
    public final /* synthetic */ C341667nK A01;

    public C40962Am8(C39676A4s a4s, C341667nK r2) {
        this.A01 = r2;
        this.A00 = a4s;
    }

    public final void run() {
        C349257zq.A03("onFirstDataWrittenToFile");
        C39676A4s a4s = this.A00;
        C341627nG r6 = a4s.A01;
        r6.A01 = SystemClock.elapsedRealtime();
        C341627nG.A01(r6, AnonymousClass05K.A0Y);
        r6.A08.Cjl(19, "recording_start_finished");
        C41827B2i b2i = r6.A0A;
        if (b2i != null) {
            r6.A06.post(new C41113AoZ(b2i, r6, b2i.now()));
        }
        if (!r6.A07.CTO(117)) {
            a4s.A00.onFinished();
        }
    }
}
