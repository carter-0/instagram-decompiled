package X;

import android.content.Intent;

public final class TJ7 implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C7197Pyl A02;

    public TJ7(Intent intent, Intent intent2, C7197Pyl pyl) {
        this.A02 = pyl;
        this.A00 = intent;
        this.A01 = intent2;
    }

    public final void run() {
        C7197Pyl pyl = this.A02;
        pyl.A01(this.A00);
        C7197Pyl.A00(this.A01, pyl);
    }
}
