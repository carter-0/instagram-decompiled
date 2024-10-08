package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class GB8 implements JPE {
    public final C234072ww A00;
    public final UserSession A01;
    public final 2el A02;
    public final AnonymousClass4DU A03;
    public final GB9 A04;

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A02.A04(view);
    }

    public GB8(Context context, UserSession userSession, 2el r7, AnonymousClass4DU r8, C249763kK r9) {
        this.A02 = r7;
        this.A01 = userSession;
        this.A03 = r8;
        C234072ww r3 = new C234072ww(userSession, r8, r9);
        this.A00 = r3;
        this.A04 = new GB9(r3, (long) context.getResources().getInteger(17694721));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.2oN, java.lang.Object] */
    public final void EBW(View view, C267324bN r10, C52058GDe gDe) {
        AnonymousClass7TG.A1T(view, r10, gDe);
        C234072ww r3 = this.A00;
        ? obj = new Object();
        AnonymousClass4DU r5 = this.A03;
        UserSession userSession = this.A01;
        HC6 hc6 = new HC6(r3, userSession, r5, AnonymousClass2oO.A00(userSession), obj);
        C2354830a A0d = C51972G9s.A0d(r10, gDe, "clips_viewer_inline_comment_key_prefix");
        A0d.A00(hc6);
        A0d.A00(this.A04);
        C51967G9n.A0z(view, A0d, this.A02);
    }
}
