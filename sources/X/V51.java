package X;

import androidx.window.extensions.layout.WindowLayoutComponent;

public abstract class V51 {
    public static final C265614Vl A00(C265584Vi r3, WindowLayoutComponent windowLayoutComponent) {
        Object obj;
        int A00 = AnonymousClass5J0.A00();
        if (A00 >= 2) {
            obj = new C18960WEn(windowLayoutComponent);
        } else if (A00 == 1) {
            obj = new C18961WEo(r3, windowLayoutComponent);
        } else {
            obj = new Object();
        }
        return (C265614Vl) obj;
    }
}
