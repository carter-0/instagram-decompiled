package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.Amc  reason: case insensitive filesystem */
public final class C40992Amc implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass8S5 A01;

    public C40992Amc(Bitmap bitmap, AnonymousClass8S5 r2) {
        this.A01 = r2;
        this.A00 = bitmap;
    }

    public final void run() {
        AnonymousClass8LU r0 = this.A01.A0J;
        Bitmap bitmap = this.A00;
        C71662eb r1 = r0.A0x.A01;
        r1.A03(0);
        ((ImageView) r1.A01()).setImageBitmap(bitmap);
        r1.A01().invalidate();
    }
}
