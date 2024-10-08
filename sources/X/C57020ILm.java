package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ILm  reason: case insensitive filesystem */
public final class C57020ILm implements JPE {
    public final 2el A00;
    public final C54331H8d A01;

    public C57020ILm(UserSession userSession, 2el r3, String str) {
        0qQ.A0B(str, 2);
        this.A00 = r3;
        this.A01 = new C54331H8d(userSession, str);
    }

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A00.A04(view);
    }

    public final void EBW(View view, C267324bN r4, C52058GDe gDe) {
        AnonymousClass7TG.A1T(view, r4, gDe);
        this.A00.A05(view, DbU.A0a(this.A01, C51972G9s.A0d(r4, gDe, "igbio_cta_component_")));
    }
}
