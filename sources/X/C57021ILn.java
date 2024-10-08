package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ILn  reason: case insensitive filesystem */
public final class C57021ILn implements JPE {
    public final 2el A00;
    public final C54329H8b A01;

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A00.A04(view);
    }

    public C57021ILn(UserSession userSession, 2el r3, AnonymousClass4DU r4, String str) {
        this.A00 = r3;
        this.A01 = new C54329H8b(userSession, r4, str);
    }

    public final void EBW(View view, C267324bN r4, C52058GDe gDe) {
        AnonymousClass7TG.A1T(view, r4, gDe);
        this.A00.A05(view, DbU.A0a(this.A01, C51972G9s.A0d(r4, gDe, "shopping_cta_component_")));
    }
}
