package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.AnQ  reason: case insensitive filesystem */
public final class C41042AnQ implements Runnable {
    public final /* synthetic */ AnonymousClass8ME A00;
    public final /* synthetic */ boolean A01;

    public C41042AnQ(AnonymousClass8ME r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void run() {
        C39890ADo aDo = new C39890ADo();
        aDo.A0F = true;
        aDo.A0Q = this.A01;
        this.A00.A1H((Drawable) null, C317876nz.A0z, aDo);
    }
}
