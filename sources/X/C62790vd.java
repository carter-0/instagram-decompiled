package X;

import android.content.Intent;

/* renamed from: X.0vd  reason: invalid class name and case insensitive filesystem */
public final class C62790vd implements AnonymousClass02A {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ 02C A02;

    public C62790vd(Intent intent, 02C r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }

    public final void AIa() {
        this.A02.stopSelf(this.A00);
    }

    public final Intent getIntent() {
        return this.A01;
    }
}
