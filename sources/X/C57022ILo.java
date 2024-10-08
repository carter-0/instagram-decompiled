package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ILo  reason: case insensitive filesystem */
public final class C57022ILo implements JPE {
    public final 2el A00;
    public final IPH A01;
    public final C54338H8k A02;
    public final C54335H8h A03;
    public final List A04;

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A00.A04(view);
    }

    public C57022ILo(Context context, UserSession userSession, 2el r9, AnonymousClass4DU r10, C249763kK r11, String str, List list) {
        this.A00 = r9;
        this.A04 = list;
        this.A03 = new C54335H8h(context, userSession, r10, str, list);
        this.A02 = new C54338H8k(userSession, r10, str);
        this.A01 = new IPH(context, userSession, r10, r11);
    }

    public final void EBW(View view, C267324bN r4, C52058GDe gDe) {
        AnonymousClass7TG.A1T(view, r4, gDe);
        C2354830a A0d = C51972G9s.A0d(r4, gDe, "overlay_ads_cta_");
        A0d.A00(this.A03);
        A0d.A00(this.A02);
        this.A00.A05(view, DbU.A0a(this.A01, A0d));
    }
}
