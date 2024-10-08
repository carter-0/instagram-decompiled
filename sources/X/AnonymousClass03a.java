package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.03a  reason: invalid class name */
public final class AnonymousClass03a {
    public final AnonymousClass03Z A00;

    public AnonymousClass03a(View view) {
        0ky r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = new 0ky(view);
        } else {
            r0 = new C62630uh(view);
        }
        this.A00 = r0;
    }
}
