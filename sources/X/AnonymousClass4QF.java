package X;

import android.os.Handler;

/* renamed from: X.4QF  reason: invalid class name */
public final class AnonymousClass4QF {
    public final Handler A00;
    public final AnonymousClass4PB A01;

    public final void A00(C266094Xn r3) {
        synchronized (r3) {
        }
        this.A00.post(new C291255gr(this, r3));
    }

    public AnonymousClass4QF(Handler handler, AnonymousClass4PB r2) {
        handler.getClass();
        this.A00 = handler;
        this.A01 = r2;
    }
}
