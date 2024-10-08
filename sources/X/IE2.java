package X;

import android.view.ViewTreeObserver;

public final class IE2 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C314226hr A00;

    public IE2(C314226hr r1) {
        this.A00 = r1;
    }

    public final boolean onPreDraw() {
        C314226hr r1 = this.A00;
        r1.A0C.getViewTreeObserver().removeOnPreDrawListener(this);
        C314226hr.A0A(r1);
        return false;
    }
}
