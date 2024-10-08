package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class W1B {
    public final UserSession A00;
    public final 1Xj A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass3W1 A03;
    public final C47518E6c A04;
    public final C54660HMr A05;
    public final String A06;

    public static final void A00(W1B w1b) {
        Context context = w1b.A04.getContext();
        if (context != null) {
            DbX.A14(context, AnonymousClass37D.A00);
        }
    }

    public static final void A01(W1B w1b) {
        UserSession userSession = w1b.A00;
        if (182.A06(0Tu.A05, userSession, 2342154934771778354L)) {
            C47518E6c e6c = w1b.A04;
            C309516Yo r3 = new C309516Yo((FragmentActivity) e6c.requireContextAs(FragmentActivity.class), userSession);
            r3.A0D(C48883Elj.A00().A00.A00(e6c.requireContext(), userSession, AnonymousClass05K.A0Y));
            r3.A04();
            return;
        }
        C46649DiU A042 = C46649DiU.A04(C273654mx.A00(74), new HashMap());
        C47518E6c e6c2 = w1b.A04;
        Context requireContext = e6c2.requireContext();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = e6c2.getString(2131976116);
        igBloksScreenConfig.A0i = true;
        A042.A0D(requireContext, igBloksScreenConfig);
    }

    public static final void A02(W1B w1b, String str) {
        new C56058Hs7(w1b.A04, w1b.A00).A02("upsell_bottom_sheet", w1b.A06, w1b.A05.A00, str);
    }

    public W1B(UserSession userSession, 1Xj r2, AnonymousClass4DU r3, AnonymousClass3W1 r4, C47518E6c e6c, C54660HMr hMr, String str) {
        C51972G9s.A1C(userSession, hMr);
        this.A04 = e6c;
        this.A00 = userSession;
        this.A06 = str;
        this.A05 = hMr;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
