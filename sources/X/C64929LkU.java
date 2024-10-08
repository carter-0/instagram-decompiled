package X;

import android.os.Handler;
import android.view.Surface;

/* renamed from: X.LkU  reason: case insensitive filesystem */
public final class C64929LkU implements AnonymousClass8KG {
    public final /* synthetic */ C65164LoT A00;

    public final void DpU(int i, int i2) {
    }

    public C64929LkU(C65164LoT loT) {
        this.A00 = loT;
    }

    public final void DpX(Surface surface, int i, int i2) {
        C65164LoT loT = this.A00;
        loT.A0Q = true;
        loT.A0R = false;
    }

    public final void Dpb() {
        C65164LoT loT = this.A00;
        loT.A0Q = false;
        loT.A0R = false;
        Handler handler = loT.A0F.A02;
        Runnable runnable = loT.A0J;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
