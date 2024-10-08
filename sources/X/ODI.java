package X;

import android.view.View;
import android.view.Window;

public final class ODI {
    public final C586704n A00;
    public final View A01;
    public final Window A02;

    public ODI(View view, Window window) {
        C586704n r0;
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A02 = window;
        if (window != null) {
            r0 = new C586704n(view, window);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
