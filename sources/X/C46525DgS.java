package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This client storage of representing Fb linkage is deprecated, please see FxIGMasterAccountCache.kt")
/* renamed from: X.DgS  reason: case insensitive filesystem */
public final class C46525DgS implements CallerContextable {
    public static final String __redex_internal_original_name = "FacebookLinkageHelper";
    public final UserSession A00;

    public C46525DgS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }
}
