package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.6PK  reason: invalid class name */
public final class AnonymousClass6PK {
    public AnonymousClass6K2 A00;
    public String A01;
    public final C252063oV A02;

    public AnonymousClass6PK(ViewStub viewStub, C313136fw r6) {
        C252063oV A012;
        0qQ.A0B(viewStub, 1);
        View view = (View) r6.A06.poll();
        ViewGroup A013 = C3019160o.A01(viewStub);
        if (view != null) {
            A013.addView(view, A013.indexOfChild(viewStub), viewStub.getLayoutParams());
            A012 = 2b1.A01(view, false, false);
        } else {
            A012 = 2b1.A01(viewStub, false, false);
        }
        this.A02 = A012;
    }
}
