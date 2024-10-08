package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class GB6 implements JPE {
    public final Context A00;
    public final C234072ww A01;
    public final UserSession A02;
    public final 2el A03;
    public final AnonymousClass4DU A04;
    public final C249763kK A05;
    public final GB7 A06;

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A03.A04(view);
    }

    public GB6(Context context, UserSession userSession, 2el r7, AnonymousClass4DU r8, C249763kK r9) {
        this.A00 = context;
        this.A03 = r7;
        this.A02 = userSession;
        this.A04 = r8;
        this.A05 = r9;
        C234072ww r3 = new C234072ww(userSession, r8, r9);
        this.A01 = r3;
        this.A06 = new GB7(r3, (long) context.getResources().getInteger(17694721));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.2oN, java.lang.Object] */
    public final void EBW(View view, C267324bN r11, C52058GDe gDe) {
        AnonymousClass7TG.A1T(view, r11, gDe);
        UserSession userSession = this.A02;
        0Tu r2 = 0Tu.A05;
        boolean A062 = 182.A06(r2, userSession, 36313437386835939L);
        boolean A063 = 182.A06(r2, userSession, 36313437386770402L);
        boolean z = true;
        boolean z2 = !A063;
        if (!A062 && !z2) {
            z = false;
        }
        HC5 hc5 = new HC5(this.A01, userSession, this.A04, AnonymousClass2oO.A00(userSession), new Object());
        C2354830a A0d = C51972G9s.A0d(r11, gDe, "clips_viewer_comment_preview_key_prefix");
        A0d.A00(hc5);
        if (z) {
            A0d.A00(this.A06);
        }
        C51967G9n.A0z(view, A0d, this.A03);
    }
}
