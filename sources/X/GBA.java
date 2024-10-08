package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class GBA implements JPE {
    public final 2el A00;
    public final GBB A01;

    public GBA(UserSession userSession, 2el r3, String str) {
        0qQ.A0B(str, 2);
        this.A00 = r3;
        this.A01 = new GBB(userSession, str);
    }

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A00.A04(view);
    }

    public final void EBW(View view, C267324bN r4, C52058GDe gDe) {
        AnonymousClass7TG.A1T(view, r4, gDe);
        this.A00.A05(view, DbU.A0a(this.A01, C51972G9s.A0d(r4, gDe, "media_cta_component_")));
    }
}
