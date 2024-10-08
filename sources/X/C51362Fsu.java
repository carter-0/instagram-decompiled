package X;

import android.os.Bundle;

/* renamed from: X.Fsu  reason: case insensitive filesystem */
public final class C51362Fsu implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ 0hq A01;

    public C51362Fsu(Bundle bundle, 0hq r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final void run() {
        0hq r4 = this.A01;
        if (!r4.A12() && r4.A0R("feedbackAlertDialog") == null && C238713Dd.A00.compareAndSet(false, true)) {
            C240383Kr r2 = new C240383Kr();
            r2.setArguments(this.A00);
            r2.mLifecycleRegistry.A09(new C50132FQp(this));
            r2.A0B(r4, "feedbackAlertDialog");
        }
    }
}
