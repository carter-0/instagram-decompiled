package X;

import android.graphics.Bitmap;

public final class PGM implements C247813gx {
    public final /* synthetic */ AnonymousClass6g5 A00;

    public PGM(AnonymousClass6g5 r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ void DEN() {
    }

    public final void DO4(C240983Nk r3) {
        0qQ.A0B(r3, 0);
        Bitmap bitmap = r3.A02;
        AnonymousClass6g5 r1 = this.A00;
        if (bitmap == null) {
            r1.A00();
            return;
        }
        Runnable runnable = r1.A06;
        if (runnable != null) {
            runnable.run();
            r1.A06 = null;
        }
    }
}
