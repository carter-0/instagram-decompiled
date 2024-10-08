package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.Nqb  reason: case insensitive filesystem */
public abstract class C69715Nqb {
    public static final void A00(View view, Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        }
        AnonymousClass03j.A00(view, C71493Oli.A00);
    }
}
