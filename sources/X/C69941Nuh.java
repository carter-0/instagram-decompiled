package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Nuh  reason: case insensitive filesystem */
public abstract class C69941Nuh {
    public static final NKQ A00(UserSession userSession, Capabilities capabilities, C254793t3 r5, int i, boolean z, boolean z2) {
        DbY.A1S(userSession, r5);
        NKQ nkq = new NKQ();
        Bundle A09 = DbY.A09(userSession);
        OXL.A01(A09, capabilities, r5);
        A09.putInt(AnonymousClass000.A00(105), i);
        A09.putBoolean("DirectThreadDetailFragment.SHOULD_ALLOW_LEAVE_CONVERSATION", z);
        A09.putBoolean("DirectThreadDetailFragment.SHOULD_SHOW_PRIVACY_SETTINGS_ONLY", z2);
        nkq.setArguments(A09);
        return nkq;
    }
}
