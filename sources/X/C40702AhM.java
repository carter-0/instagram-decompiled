package X;

import android.os.Handler;

/* renamed from: X.AhM  reason: case insensitive filesystem */
public final class C40702AhM implements C41824B2f {
    public final /* synthetic */ C357128Wq A00;

    public C40702AhM(C357128Wq r1) {
        this.A00 = r1;
    }

    public final void D6B(boolean z, String str) {
        this.A00.A0A.E3I();
    }

    public final void D6C(String str) {
        C357128Wq.A03(this.A00, str);
    }

    public final void onFinish() {
        C357128Wq r2 = this.A00;
        Runnable runnable = r2.A02;
        if (runnable != null) {
            Handler handler = r2.A05;
            0qQ.A0A(runnable);
            handler.removeCallbacks(runnable);
            r2.A02 = null;
        }
    }
}
