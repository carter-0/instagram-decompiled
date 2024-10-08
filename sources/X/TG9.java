package X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class TG9 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ String A01;

    public TG9(Activity activity, String str) {
        this.A00 = activity;
        this.A01 = str;
    }

    public final void run() {
        Window window = this.A00.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT > 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController == null) {
                return;
            }
            if ("dark-content".equals(this.A01)) {
                insetsController.setSystemBarsAppearance(8, 8);
            } else {
                insetsController.setSystemBarsAppearance(0, 8);
            }
        } else {
            View decorView = window.getDecorView();
            0qQ.A07(decorView);
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i = systemUiVisibility & -8193;
            if ("dark-content".equals(this.A01)) {
                i = systemUiVisibility | 8192;
            }
            decorView.setSystemUiVisibility(i);
        }
    }
}
