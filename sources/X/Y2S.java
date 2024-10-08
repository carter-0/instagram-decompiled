package X;

import com.facebook.mediastreaming.opt.transport.SpeedTestStatus;

public final class Y2S implements Runnable {
    public final /* synthetic */ C22229Xxk A00;
    public final /* synthetic */ SpeedTestStatus A01;

    public Y2S(C22229Xxk xxk, SpeedTestStatus speedTestStatus) {
        this.A00 = xxk;
        this.A01 = speedTestStatus;
    }

    public final void run() {
        this.A00.A00.onSpeedTestResult(this.A01);
    }
}
