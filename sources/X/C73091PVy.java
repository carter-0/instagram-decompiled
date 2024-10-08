package X;

import android.view.View;

/* renamed from: X.PVy  reason: case insensitive filesystem */
public final class C73091PVy implements Runnable {
    public final /* synthetic */ C72574PBf A00;

    public C73091PVy(C72574PBf pBf) {
        this.A00 = pBf;
    }

    public final void run() {
        C252063oV r2 = this.A00.A05;
        if (r2.CFV() != 8) {
            View view = r2.getView();
            AnonymousClass7TE.A1U(view, view.isAttachedToWindow());
        }
    }
}
