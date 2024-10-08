package X;

import android.os.CountDownTimer;

/* renamed from: X.Ihw  reason: case insensitive filesystem */
public final class C57879Ihw implements Runnable {
    public final /* synthetic */ C267324bN A00;
    public final /* synthetic */ GE5 A01;

    public C57879Ihw(C267324bN r1, GE5 ge5) {
        this.A01 = ge5;
        this.A00 = r1;
    }

    public final void run() {
        long j;
        long j2;
        GE5 ge5 = this.A01;
        C267324bN r3 = this.A00;
        Long A012 = GE5.A01(r3, ge5);
        if (A012 != null) {
            j = A012.longValue();
            j2 = ge5.A0L;
            if (j == j2) {
                j = j2;
            }
        } else {
            j = ge5.A0L;
            j2 = j;
        }
        ge5.A05 = j;
        if (j == j2 && !ge5.A0C) {
            GE5.A06(ge5, AnonymousClass05K.A0C);
            ge5.A0C = true;
        } else if (!ge5.A0F) {
            GE5.A06(ge5, AnonymousClass05K.A0Y);
        }
        ge5.A0F = false;
        CountDownTimer countDownTimer = ge5.A07;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ge5.A06.cancel();
        ge5.A07 = new C52809Gd1(r3, ge5, ge5.A05).start();
        GE5.A05(ge5);
    }
}
