package X;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* renamed from: X.Si3  reason: case insensitive filesystem */
public final class C11875Si3 implements C13691Tf9 {
    public final C13813Thg A00 = new Object();

    /* renamed from: A00 */
    public final C11911Sik ANe(ImageDecoder.Source source, C11856Shi shi, int i, int i2) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new SVd(shi, i, i2));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new C11911Sik(decodeBitmap, this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        return true;
    }
}
