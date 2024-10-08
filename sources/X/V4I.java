package X;

import android.os.CountDownTimer;

public final class V4I {
    public long A00;
    public long A01;
    public CountDownTimer A02;
    public VLO A03;

    public final void A00() {
        CountDownTimer countDownTimer = this.A02;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A02 = null;
    }
}
