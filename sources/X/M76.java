package X;

import android.content.Intent;

public final class M76 implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C63877LAg A01;

    public M76(Intent intent, C63877LAg lAg) {
        this.A01 = lAg;
        this.A00 = intent;
    }

    public final void run() {
        ((LFL) this.A01.A04.getValue()).A00(this.A00);
    }
}
