package X;

import android.content.Context;

/* renamed from: X.3eE  reason: invalid class name and case insensitive filesystem */
public final class C246223eE implements Runnable {
    public final /* synthetic */ Context A00;

    public C246223eE(Context context) {
        this.A00 = context;
    }

    public final void run() {
        AnonymousClass07Z r0 = (AnonymousClass07Z) this.A00;
        r0.getLifecycle().A09(new C246233eF(r0.getLifecycle().A07()));
    }
}
