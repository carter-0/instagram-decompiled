package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elx  reason: case insensitive filesystem */
public abstract class C48897Elx {
    public static final void A00(String str, UserSession userSession, 1Xj r5) {
        AnonymousClass7TG.A1N(userSession, r5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_to_fb_deep_deletion_client");
        A0e.AAJ("ig_user_id", userSession.A06);
        A0e.AAJ(TraceFieldType.AdhocEventName, str);
        DbS.A1M(A0e, "FEED");
        A0e.AAJ("post_id", r5.getId());
        A0e.Cgf();
    }
}
