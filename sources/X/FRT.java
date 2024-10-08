package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class FRT implements CallerContextable {
    public static final String __redex_internal_original_name = "OnboardingStepNavigator";
    public final C51950G8t A00;

    public FRT(C51950G8t g8t) {
        this.A00 = g8t;
    }

    public static final Bundle A00(FRM frm) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession userSession = frm.A00;
        if (userSession != null) {
            AnonymousClass0Dg.A00(A0a, userSession);
        }
        return A0a;
    }
}
