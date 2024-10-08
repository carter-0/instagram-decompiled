package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class FRM implements CallerContextable {
    public static final String __redex_internal_original_name = "PendingSessionDelegate";
    public UserSession A00;
    public EXD A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;

    public final boolean A00() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return 2Lv.A00(userSession).A00(CallerContext.A00(FRM.class), "ig_pending_session_delegate");
        }
        return false;
    }
}
