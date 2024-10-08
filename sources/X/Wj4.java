package X;

import android.view.View;

public final class Wj4 implements Runnable {
    public final /* synthetic */ C15295Ua1 A00;

    public Wj4(C15295Ua1 ua1) {
        this.A00 = ua1;
    }

    public final void run() {
        String str;
        C15697Uh3 uh3 = this.A00.A01;
        if (uh3 == null) {
            str = "controller";
        } else {
            View view = uh3.A00;
            if (view == null) {
                str = "canvasContainer";
            } else {
                C15697Uh3.A02(uh3, view.getTranslationY(), 0.0f);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
