package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Sjt  reason: case insensitive filesystem */
public final class C11978Sjt implements C13538TcA {
    public final C13813Thg A00;
    public final C13538TcA A01;
    public final C13538TcA A02;

    public C11978Sjt(C13813Thg thg, C13538TcA tcA, C13538TcA tcA2) {
        this.A00 = thg;
        this.A01 = tcA;
        this.A02 = tcA2;
    }

    public final C13796ThF FHZ(C11856Shi shi, C13796ThF thF) {
        C11911Sik sik;
        Drawable drawable = (Drawable) thF.get();
        if (drawable instanceof BitmapDrawable) {
            C13538TcA tcA = this.A01;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C13813Thg thg = this.A00;
            if (bitmap == null) {
                sik = null;
            } else {
                sik = new C11911Sik(bitmap, thg);
            }
            return tcA.FHZ(shi, sik);
        } else if (drawable instanceof Q6Z) {
            return this.A02.FHZ(shi, thF);
        } else {
            return null;
        }
    }
}
