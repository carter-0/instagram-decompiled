package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.5BE  reason: invalid class name */
public final class AnonymousClass5BE implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass5BD A00;

    public AnonymousClass5BE(AnonymousClass5BD r1) {
        this.A00 = r1;
    }

    public final boolean onPreDraw() {
        View view = this.A00.A01;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.setTranslationY((float) (view.getHeight() / 4));
        return false;
    }
}
