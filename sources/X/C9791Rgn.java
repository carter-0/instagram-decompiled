package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.util.HashMap;

/* renamed from: X.Rgn  reason: case insensitive filesystem */
public abstract class C9791Rgn {
    public static final HashMap A00(AnonymousClass6Tm r3) {
        Bitmap decodeFile;
        String path = 0cp.A03(DbY.A0g(r3)).getPath();
        if (path == null || (decodeFile = BitmapFactory.decodeFile(path)) == null) {
            return null;
        }
        int height = decodeFile.getHeight();
        int width = decodeFile.getWidth();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(StatusBarModule.HEIGHT_KEY, Integer.valueOf(height));
        A1E.put("WIDTH", Integer.valueOf(width));
        return A1E;
    }
}
