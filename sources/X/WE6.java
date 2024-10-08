package X;

import android.os.Handler;

public final class WE6 implements AnonymousClass0hF {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C14191TrW A01;
    public final /* synthetic */ Runnable A02;

    public WE6(Handler handler, C14191TrW trW, Runnable runnable) {
        this.A01 = trW;
        this.A00 = handler;
        this.A02 = runnable;
    }

    public final void Dms(07T r3, AnonymousClass07Z r4) {
        if (r3 == 07T.ON_DESTROY) {
            this.A00.removeCallbacks(this.A02);
            r4.getLifecycle().A0A(this);
        }
    }
}
