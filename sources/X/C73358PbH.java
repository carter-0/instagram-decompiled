package X;

import android.app.Activity;

/* renamed from: X.PbH  reason: case insensitive filesystem */
public final class C73358PbH implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ C331157Pu A02;
    public final /* synthetic */ C62320sa A03;

    public C73358PbH(Activity activity, AnonymousClass4DH r2, C331157Pu r3, C62320sa r4) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void run() {
        this.A02.A02(this.A00, this.A01);
        C62320sa r0 = this.A03;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
