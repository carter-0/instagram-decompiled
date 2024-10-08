package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;
import java.io.IOException;

/* renamed from: X.A0x  reason: case insensitive filesystem */
public abstract class C39581A0x {
    public static final BackgroundGradientColors A00(UserSession userSession, File file, boolean z) {
        String str;
        BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(-16777216, -16777216);
        if (file == null || !file.exists() || userSession == null) {
            return backgroundGradientColors;
        }
        if (z) {
            return C39908AIz.A02(file);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            str = file.getCanonicalPath();
        } catch (IOException unused) {
            str = file.getAbsolutePath();
        }
        int i = 1;
        while (options.outWidth / i > 200 && options.outHeight / i > 200) {
            i *= 2;
        }
        if (i < 1) {
            i = 1;
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile != null) {
            return 0oT.A01(decodeFile, AnonymousClass05K.A00);
        }
        return backgroundGradientColors;
    }
}
