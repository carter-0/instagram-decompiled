package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

public abstract class HYO {
    public static final void A00(FragmentActivity fragmentActivity, CameraTool cameraTool, UserSession userSession, MagicModLaunchParams magicModLaunchParams, C351818An r12, C352218Cl r13, Integer num, String str, boolean z) {
        String str2;
        C51974G9v.A1K(userSession, fragmentActivity, r12);
        0qQ.A0B(cameraTool, 6);
        GA1 ga1 = new GA1(24, r12, z);
        C58232Ioa ioa = new C58232Ioa(fragmentActivity, cameraTool, userSession, magicModLaunchParams, r12, r13, num, str, z);
        C362088hK A00 = AnonymousClass6XS.A00(cameraTool);
        C56510Hzh hzh = (C56510Hzh) userSession.A01(C56510Hzh.class, new C58678Ivn(userSession, 30));
        if (A00 != null) {
            UserSession userSession2 = hzh.A00;
            0Tu A0J = DbS.A0J(userSession2, 0);
            if (182.A06(A0J, userSession2, 36319918494719736L) && 182.A06(A0J, userSession2, 36319918495112958L) && (!hzh.A02.A01(A00))) {
                OJO A002 = C69714Nqa.A00(userSession);
                int ordinal = cameraTool.ordinal();
                if (ordinal == 115) {
                    str2 = "source_restyle";
                } else if (ordinal == 15) {
                    str2 = "source_backdrop";
                } else if (ordinal == 4) {
                    str2 = "source_expander";
                } else {
                    throw AnonymousClass7TE.A1B("Not a magicmod camera tool");
                }
                A002.A00(fragmentActivity, new C54013Gxv(hzh, A00, ioa, ga1), "ig_magic_mod_consent_flow", str2, (String) null, (String) null, (String) null);
                return;
            }
        }
        ioa.invoke();
    }
}
