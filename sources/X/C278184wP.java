package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4wP  reason: invalid class name and case insensitive filesystem */
public final class C278184wP implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass3N9 A00;

    public C278184wP(AnonymousClass3N9 r1) {
        this.A00 = r1;
    }

    public final boolean onPreDraw() {
        AnonymousClass3N9 r1 = this.A00;
        r1.A03.getClass();
        r1.A03.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = r1.A03;
        view.setTranslationY((float) (view.getHeight() / 4));
        return false;
    }
}
