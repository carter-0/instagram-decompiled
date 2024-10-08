package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Nuk  reason: case insensitive filesystem */
public abstract class C69944Nuk {
    public static final NJm A00(UserSession userSession, Capabilities capabilities, C254793t3 r5, int i, boolean z) {
        AnonymousClass7TG.A1N(userSession, capabilities);
        NJm nJm = new NJm();
        Bundle A09 = DbY.A09(userSession);
        OXL.A01(A09, capabilities, r5);
        A09.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", i);
        A09.putBoolean(AnonymousClass000.A00(429), z);
        nJm.setArguments(A09);
        return nJm;
    }
}
