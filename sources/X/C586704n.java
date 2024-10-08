package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.04n  reason: invalid class name and case insensitive filesystem */
public final class C586704n {
    public final 04l A00;

    public C586704n(View view, Window window) {
        0uL r0;
        AnonymousClass03a r2 = new AnonymousClass03a(view);
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = new 0uL(window, r2, this);
        } else {
            r0 = new C62600uM(window, r2);
        }
        this.A00 = r0;
    }
}
