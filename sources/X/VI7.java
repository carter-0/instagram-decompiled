package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public abstract class VI7 {
    public static final C15354Ub5 A00(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, 1sy r6, XCE xce, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", r4.getId());
        DbU.A1D(bundle, userSession);
        bundle.putString("prior_module_name", r5.getModuleName());
        bundle.putSerializable("media_surface", r6);
        bundle.putString("shopping_session_id", str);
        bundle.putString("prior_submodule_name", str2);
        C15354Ub5 ub5 = new C15354Ub5();
        ub5.setArguments(bundle);
        if (xce != null) {
            ub5.A04 = xce;
        }
        return ub5;
    }
}
