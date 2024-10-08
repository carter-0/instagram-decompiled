package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public abstract class F6X {
    public static final void A00(AnonymousClass4DH r8, C51897G6n g6n, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        C229382nI A0M = DbT.A0M(r8, userSession);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        BitSet A0w = DbS.A0w(1);
        A1E.put("entrypoint", str);
        A0w.set(0);
        FragmentActivity activity = r8.getActivity();
        if (A0w.nextClearBit(0) >= 1) {
            FBO.A00(g6n, AnonymousClass000.A00(552), A1E, A1E2).A01(activity, A0M);
            return;
        }
        throw DbU.A0i();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.G6n, java.lang.Object] */
    public static final void A01(AnonymousClass4DH r6, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        C229382nI A0M = DbT.A0M(r6, userSession);
        Map A0w = AnonymousClass7TF.A0w("node_id", "upgrade_account");
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A0v = DbX.A0v();
        A1E.put("entrypoint", str);
        A1E.put("deeplink_destination", "individual_setting");
        if (!A0w.isEmpty()) {
            A1E.put("deeplink_params", A0w);
        }
        FBO.A00(new Object(), "com.bloks.www.fxcal.settings.async", A1E, A0v).A01(r6.getActivity(), A0M);
    }
}
