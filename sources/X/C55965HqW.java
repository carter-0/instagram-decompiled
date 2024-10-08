package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.HqW  reason: case insensitive filesystem */
public final class C55965HqW {
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final Runnable A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final long A03;

    public C55965HqW(Runnable runnable, long j) {
        0qQ.A0B(runnable, 2);
        this.A03 = j;
        this.A01 = runnable;
    }

    public final void A00() {
        this.A00.postDelayed(new C57725IfS(this), this.A03);
    }
}
