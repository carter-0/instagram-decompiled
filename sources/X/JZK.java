package X;

import android.graphics.Bitmap;
import java.io.OutputStream;

public abstract class JZK {
    public static final boolean A00(Bitmap.CompressFormat compressFormat, Bitmap bitmap, OutputStream outputStream) {
        AnonymousClass7TG.A1N(bitmap, compressFormat);
        0fO.A01(compressFormat, bitmap, 100);
        return bitmap.compress(compressFormat, 100, outputStream);
    }
}
