package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class GUB {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass3YL A02;

    public final void A00(AnonymousClass9IE r4, C53137Gj9 gj9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        0qQ.A0B(r4, 1);
        C376459Ib r2 = (C376459Ib) r4.A00;
        if (C51971G9r.A1b((C62320sa) r2.A01)) {
            if (gj9 != null && (viewGroup3 = gj9.A00) != null) {
                viewGroup3.setVisibility(0);
            }
        } else if (C51971G9r.A1b((C62320sa) r2.A00)) {
            if (!(gj9 == null || (viewGroup2 = gj9.A00) == null)) {
                viewGroup2.setVisibility(0);
            }
            0sL r22 = (0sL) r2.A02;
            if (gj9 != null) {
                viewGroup = gj9.A00;
            } else {
                viewGroup = null;
            }
            r22.invoke(viewGroup, new C54339H8l(this));
        } else if (gj9 != null) {
            AnonymousClass7TH.A0R(gj9.A00);
        }
    }

    public GUB(Context context, AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(r3, userSession);
        this.A02 = new AnonymousClass3YL(context, userSession);
    }
}
