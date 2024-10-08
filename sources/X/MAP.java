package X;

import android.app.ProgressDialog;
import android.os.Handler;

public final class MAP implements Runnable {
    public final ProgressDialog A00;
    public final Handler A01;
    public final K6Y A02;
    public final Runnable A03;
    public final Runnable A04;

    public MAP(ProgressDialog progressDialog, Handler handler, K6Y k6y, Runnable runnable) {
        0qQ.A0B(progressDialog, 3);
        this.A02 = k6y;
        this.A04 = runnable;
        this.A00 = progressDialog;
        this.A03 = new M3X(this);
        JTR.A1S(this, k6y.A0M);
        this.A01 = handler;
    }

    public final void run() {
        try {
            this.A04.run();
        } finally {
            this.A01.post(this.A03);
        }
    }

    public MAP() {
    }
}
