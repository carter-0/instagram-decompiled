package X;

import android.view.InputEvent;

/* renamed from: X.TJv  reason: case insensitive filesystem */
public final class C13065TJv implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C11240SHa A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;

    public C13065TJv(C11240SHa sHa, Long l, String str, long j) {
        this.A01 = sHa;
        this.A00 = j;
        this.A03 = str;
        this.A02 = l;
    }

    public final void run() {
        C11240SHa sHa = this.A01;
        try {
            InputEvent inputEvent = (InputEvent) ((C277404v7) sHa.A01.A01(C277404v7.class, C277414v8.A00)).A00.takeFirst();
            if (inputEvent != null) {
                C11240SHa.A00(inputEvent, sHa, this.A02, this.A03, this.A00);
                return;
            }
        } catch (InterruptedException unused) {
        }
        sHa.A00.flowEndFail(this.A00, "EVENT_FETCH_FAILED", (String) null);
    }
}
