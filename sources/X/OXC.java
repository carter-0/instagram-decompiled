package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

public abstract class OXC {
    public static final C333547Zj A00(UserSession userSession, C254783t2 r2) {
        C333547Zj A00;
        if (r2 instanceof AnonymousClass9HR) {
            A00 = C67497Mor.A00(userSession);
        } else {
            A00 = C333527Zh.A00(userSession);
        }
        return A00;
    }

    public static final void A02(Activity activity, AnonymousClass4DH r5, C331157Pu r6, C62320sa r7) {
        AnonymousClass7TF.A0D().postDelayed(new C73358PbH(activity, r5, r6, r7), 200);
    }

    public static final AnonymousClass7Z7 A01(UserSession userSession, DirectShareTarget directShareTarget) {
        return AnonymousClass1pH.A00().E52(userSession).A00(directShareTarget);
    }
}
