package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class FB6 {
    public static final FB6 A00 = new Object();

    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, Integer num) {
        boolean A1U = AnonymousClass7TF.A1U(0, fragmentActivity, userSession);
        0qQ.A0B(num, 2);
        Boolean Ccr = DbX.A0m(userSession).Ccr();
        if (Ccr != null && Ccr.booleanValue()) {
            AnonymousClass6ST r5 = new AnonymousClass6ST(fragmentActivity, A1U);
            DbX.A15(r5.getContext(), r5);
            r5.setCancelable(false);
            AnonymousClass0fN.A00(r5);
            C229382nI A0L = DbY.A0L(fragmentActivity, userSession, "igy_plugin");
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A0v = DbX.A0v();
            A1E.put("entrypoint", F63.A01(num));
            A1E.put(AnonymousClass000.A00(806), Long.valueOf(1G0.A00()));
            FBO.A00(new FVS(2, fragmentActivity, r5), AnonymousClass000.A00(2828), A1E, A0v).A01(fragmentActivity, A0L);
        }
    }
}
