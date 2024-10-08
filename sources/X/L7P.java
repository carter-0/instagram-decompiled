package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class L7P {
    public final Context A00;
    public final C57451Iav A01;
    public final AnonymousClass0eM A02;

    public L7P(View view, AnonymousClass4DH r11, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        C66293MMc mMc = new C66293MMc(userSession, 43);
        AnonymousClass0eM A012 = C66293MMc.A01(new C66293MMc(r11, 40), 0eO.A02, 41);
        this.A02 = DbS.A0I(new C66293MMc(A012, 42), mMc, C66304MMn.A01(A012, (Object) null, 31), DbS.A0z(C60183Jh2.class));
        Context requireContext = r11.requireContext();
        this.A00 = requireContext;
        C57451Iav iav = new C57451Iav(requireContext);
        iav.A05.setText(AnonymousClass7TE.A16(requireContext, 2131954722));
        this.A01 = iav;
        AnonymousClass0r6 r0 = ((C60183Jh2) this.A02.getValue()).A04;
        View view2 = view;
        DbZ.A1C(r11, new C66172MGj(view2, r11, this, (AnonymousClass4D7) null, 34), r0);
    }
}
