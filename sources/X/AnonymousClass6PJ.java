package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;

/* renamed from: X.6PJ  reason: invalid class name */
public final class AnonymousClass6PJ {
    public final AnonymousClass62E A00;
    public final C252063oV A01;

    public AnonymousClass6PJ(ViewStub viewStub, UserSession userSession, C313136fw r8) {
        C252063oV A012;
        0qQ.A0B(viewStub, 2);
        AnonymousClass62E r4 = null;
        View view = (View) r8.A07.poll();
        if (view != null) {
            ViewGroup A013 = C3019160o.A01(viewStub);
            A013.addView(view, A013.indexOfChild(viewStub), viewStub.getLayoutParams());
            A012 = 2b1.A01(view, false, false);
        } else {
            A012 = 2b1.A01(viewStub, false, false);
        }
        this.A01 = A012;
        this.A00 = 182.A06(0Tu.A05, userSession, 36310778806010141L) ? new AnonymousClass62E() : r4;
    }
}
