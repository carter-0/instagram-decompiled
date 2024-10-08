package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.6Tk  reason: invalid class name and case insensitive filesystem */
public final class C308266Tk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C308246Th A01;

    public C308266Tk(View view, C308246Th r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final boolean onPreDraw() {
        View view;
        C308246Th r2 = this.A01;
        if (r2.A0E && r2.A0B == (view = this.A00)) {
            AnonymousClass6Tj.A01(view, r2);
        }
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
