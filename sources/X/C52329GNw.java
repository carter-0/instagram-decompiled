package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GNw  reason: case insensitive filesystem */
public final class C52329GNw implements JPE {
    public final 2el A00;
    public final 1Xj A01;
    public final C52330GNx A02;

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A00.A04(view);
    }

    public C52329GNw(AnonymousClass0iw r2, UserSession userSession, 2el r4, 1Xj r5) {
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = new C52330GNx(r2, userSession, r5);
    }

    public final void EBW(View view, C267324bN r5, C52058GDe gDe) {
        AnonymousClass7TG.A1N(view, r5);
        this.A00.A05(view, DbU.A0a(this.A02, AnonymousClass30Y.A00(r5, C60340gF.A00, 002.A0R("interest_controls_component", this.A01.getId()))));
    }
}
