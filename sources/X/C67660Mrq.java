package X;

import android.os.CountDownTimer;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;
import com.instagram.direct.ui.countertextview.CounterTextView;

/* renamed from: X.Mrq  reason: case insensitive filesystem */
public final class C67660Mrq extends CountDownTimer {
    public boolean A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CountdownTimerPill A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67660Mrq(CountdownTimerPill countdownTimerPill, C62320sa r2, long j, long j2, long j3, boolean z) {
        super(j2, j3);
        this.A02 = countdownTimerPill;
        this.A01 = j;
        this.A04 = z;
        this.A03 = r2;
    }

    public final void onFinish() {
        if (!this.A00) {
            C62320sa r0 = this.A03;
            if (r0 != null) {
                r0.invoke();
            }
            this.A00 = true;
        }
    }

    public final void onTick(long j) {
        CountdownTimerPill countdownTimerPill = this.A02;
        CounterTextView counterTextView = countdownTimerPill.A03;
        counterTextView.A06((int) this.A01, CountdownTimerPill.A00(countdownTimerPill, j), true);
        if (j < CountdownTimerPill.A04) {
            if (this.A04) {
                counterTextView.setVisibility(4);
                countdownTimerPill.A02.A06.start();
                CountDownTimer countDownTimer = countdownTimerPill.A00;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
            }
            if (!this.A00) {
                C62320sa r0 = this.A03;
                if (r0 != null) {
                    r0.invoke();
                }
                this.A00 = true;
            }
        }
    }
}
