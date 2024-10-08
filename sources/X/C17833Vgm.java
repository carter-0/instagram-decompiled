package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vgm  reason: case insensitive filesystem */
public final class C17833Vgm {
    public long A00;
    public final 1QP A01;
    public final UserSession A02;

    public C17833Vgm(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AnonymousClass1QO.A00(userSession);
    }

    public final void A00(String str, boolean z) {
        1QP r3 = this.A01;
        long flowStartForMarker = r3.flowStartForMarker(18946361, "story_text_area_tap", false);
        this.A00 = flowStartForMarker;
        r3.flowAnnotate(flowStartForMarker, AnonymousClass000.A00(795), str);
        r3.flowAnnotate(this.A00, "e2ee_enabled", z);
    }
}
