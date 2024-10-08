package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.AnT  reason: case insensitive filesystem */
public final class C41045AnT implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ AnonymousClass8ME A01;

    public C41045AnT(Drawable drawable, AnonymousClass8ME r2) {
        this.A01 = r2;
        this.A00 = drawable;
    }

    public final void run() {
        AnonymousClass8ME r0 = this.A01;
        r0.A1m.A0S(this.A00);
    }
}
