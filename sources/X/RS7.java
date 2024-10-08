package X;

import android.view.Window;
import android.view.WindowInsets;

public abstract class RS7 {
    public static void A00(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
