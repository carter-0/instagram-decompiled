package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.5XK  reason: invalid class name */
public final class AnonymousClass5XK extends 0Yg implements 0sP {
    public static final AnonymousClass5XK A00 = new AnonymousClass5XK();

    public AnonymousClass5XK() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        0qQ.A0B(view, 0);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return parent;
        }
        return null;
    }
}
