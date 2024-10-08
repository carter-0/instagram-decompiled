package X;

import android.telephony.SubscriptionManager;

/* renamed from: X.3pG  reason: invalid class name and case insensitive filesystem */
public final class C252533pG implements Runnable {
    public final /* synthetic */ 1DI A00;

    public C252533pG(1DI r1) {
        this.A00 = r1;
    }

    public final void run() {
        1DI r2 = this.A00;
        SubscriptionManager subscriptionManager = r2.A02;
        if (subscriptionManager != null) {
            C252543pH r0 = new C252543pH(this);
            r2.A01 = r0;
            subscriptionManager.addOnSubscriptionsChangedListener(r0);
        }
    }
}
