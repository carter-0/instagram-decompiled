package X;

import android.graphics.Bitmap;

/* renamed from: X.60g  reason: invalid class name and case insensitive filesystem */
public final class C3018360g implements C3018260f {
    public final Bitmap A00;

    public final int App() {
        Bitmap.Config config = this.A00.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        if (config == Bitmap.Config.HARDWARE) {
            return 4;
        }
        return 0;
    }

    public C3018360g(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
