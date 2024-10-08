package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

public abstract class SAP {
    public static final void A01(UserSession userSession, Context context, String str) {
        String str2;
        Context context2 = context;
        String str3 = str;
        boolean A1b = C51973G9u.A1b(userSession, context, str);
        0eP A1L = AnonymousClass7TE.A1L(C46326Dbu.A00(), str);
        if (A1b) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        C359638dF.A03(context2, new C359618dD(userSession), "com.bloks.www.bloks.browser_history.main_screen", str3, Dbb.A0e("is_prefetch", str2, A1L), SandboxRepository.CACHE_TTL);
    }

    public static final void A00(UserSession userSession, Context context, String str) {
        String str2;
        boolean A1b = C51973G9u.A1b(userSession, context, str);
        0eP A1L = AnonymousClass7TE.A1L(C46326Dbu.A00(), str);
        if (A1b) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        C359638dF.A01(context, new C359618dD(userSession), "com.bloks.www.bloks.browser_history.main_screen", str, Dbb.A0e("is_prefetch", str2, A1L));
    }
}
