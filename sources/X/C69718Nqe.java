package X;

import android.os.Build;
import android.view.Window;

/* renamed from: X.Nqe  reason: case insensitive filesystem */
public abstract class C69718Nqe {
    public static final void A00(Window window, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (z) {
            if (i2 >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
                window.setDecorFitsSystemWindows(false);
            }
            window.addFlags(1024);
            i = C249703kE.FLAG_MOVED;
        } else {
            if (i2 >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 0;
                window.setDecorFitsSystemWindows(true);
            }
            window.addFlags(C249703kE.FLAG_MOVED);
            i = 1024;
        }
        window.clearFlags(i);
    }
}
