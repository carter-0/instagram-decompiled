package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Use CrosspostingAccountLinkingManager")
/* renamed from: X.A8m  reason: case insensitive filesystem */
public final class C39772A8m {
    public final UserSession A00;
    public final C363408jg A01;

    public final C363488jo A00(CallerContext callerContext) {
        C363468jm r0;
        List list;
        List list2 = (List) this.A01.A00.A00(callerContext, "ig_android_service_cache_crossposting_setting", AnonymousClass7TE.A1I("CROSS_POSTING_SETTING")).get("CROSS_POSTING_SETTING");
        if (list2 == null || (r0 = (C363468jm) 00k.A0J(list2)) == null || (list = r0.A01) == null) {
            return null;
        }
        return (C363488jo) 00k.A0J(list);
    }

    public C39772A8m(UserSession userSession) {
        this.A00 = userSession;
        0qQ.A0B(userSession, 0);
        this.A01 = (C363408jg) userSession.A01(C363408jg.class, new C73662Phb(userSession, 14));
    }
}
