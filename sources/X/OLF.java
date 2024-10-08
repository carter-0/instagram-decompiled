package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class OLF {
    public final Activity A00;
    public final C71111Ocu A01;
    public final View A02;
    public final UserSession A03;

    public final C331127Pr A00(C62320sa r7, float f, float f2, boolean z, boolean z2, boolean z3) {
        02M r1;
        0qQ.A0B(r7, 9);
        04k A002 = C586203k.A00(this.A02);
        if (A002 != null) {
            r1 = A002.A00.A03();
        } else {
            r1 = 02M.A04;
            0qQ.A08(r1);
        }
        Rect A0W = AnonymousClass7TE.A0W();
        A0W.bottom = r1.A00;
        A0W.right = r1.A02;
        A0W.left = r1.A01;
        C331127Pr A0e = DbX.A0e(this.A03, z2);
        A0e.A03 = f;
        A0e.A04 = f2;
        A0e.A0G = A0W;
        A0e.A1O = z;
        A0e.A11 = true;
        A0e.A0A = R.color.igds_transparent_navigation_bar;
        A0e.A1I = true;
        A0e.A0U = new C72954PQm(this, r7);
        A0e.A1G = z3;
        A0e.A0g = null;
        A0e.A0v = false;
        A0e.A1J = false;
        A0e.A0K = null;
        return A0e;
    }

    public OLF(Activity activity, View view, UserSession userSession, C71111Ocu ocu) {
        this.A00 = activity;
        this.A02 = view;
        this.A03 = userSession;
        this.A01 = ocu;
    }
}
