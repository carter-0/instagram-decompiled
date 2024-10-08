package X;

import android.view.View;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;

/* renamed from: X.ACp  reason: case insensitive filesystem */
public final class C39868ACp {
    public final C252063oV A00;

    public static final void A00(View view, UserSession userSession, C39868ACp aCp, C255783ui r9, C249693kD r10) {
        ViewParent parent = aCp.A00.getView().getParent();
        0qQ.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View view2 = (View) parent;
        int width = view2.getWidth();
        int height = view2.getHeight();
        C306406Ma.A04(view, r9, r10.AcY(userSession), width, height, true);
    }

    public C39868ACp(C252063oV r1) {
        this.A00 = r1;
    }
}
