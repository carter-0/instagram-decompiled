package X;

import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;

/* renamed from: X.PbU  reason: case insensitive filesystem */
public final class C73371PbU implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CountdownTimerPill A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ boolean A03;

    public C73371PbU(CountdownTimerPill countdownTimerPill, C62320sa r2, long j, boolean z) {
        this.A01 = countdownTimerPill;
        this.A00 = j;
        this.A03 = z;
        this.A02 = r2;
    }

    public final void run() {
        CountdownTimerPill countdownTimerPill = this.A01;
        long j = this.A00;
        long j2 = CountdownTimerPill.A04;
        boolean z = this.A03;
        countdownTimerPill.A00 = new C67660Mrq(countdownTimerPill, this.A02, j, j - j2, j2, z).start();
    }
}
