package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;

public final class XuX implements ViewTreeObserver.OnDrawListener {
    public boolean A00;
    public final View A01;
    public final C62320sa A02;
    public final Handler A03 = AnonymousClass7TF.A0D();

    public final void onDraw() {
        if (!this.A00) {
            this.A00 = true;
            this.A03.postAtFrontOfQueue(new C22387Y1s(this));
        }
    }

    public XuX(View view, C62320sa r3) {
        this.A01 = view;
        this.A02 = r3;
    }
}
