package X;

import android.view.ViewTreeObserver;
import android.view.Window;

/* renamed from: X.Oko  reason: case insensitive filesystem */
public final class C71449Oko implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Window A01;
    public final /* synthetic */ C331157Pu A02;

    public C71449Oko(Window window, C331157Pu r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = window;
    }

    public final void onGlobalLayout() {
        this.A02.A03.A0S(this.A00);
        C51967G9n.A0y(this.A01.getDecorView(), this);
    }
}
