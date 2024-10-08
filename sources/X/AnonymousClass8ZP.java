package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;

/* renamed from: X.8ZP  reason: invalid class name */
public final class AnonymousClass8ZP {
    public long A00;
    public long A01;
    public final 1QP A02;

    public AnonymousClass8ZP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = AnonymousClass1QO.A00(userSession);
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        long j = this.A00;
        if (j != 0) {
            this.A02.flowEndFail(j, str, (String) null);
        }
        this.A00 = 0;
    }

    public final void A00(28D r11, ACRType aCRType) {
        1QP r4 = this.A02;
        long flowStartForMarker = r4.flowStartForMarker(246614672, AnonymousClass000.A00(2676), false);
        this.A01 = flowStartForMarker;
        if (r11 != null) {
            r4.flowAnnotate(flowStartForMarker, "camera_entry_point", r11.A00);
        }
        if (aCRType != null) {
            r4.flowAnnotate(this.A01, "acr_type", aCRType.A00);
        }
    }

    public final void A02(String str) {
        this.A02.flowEndFail(this.A01, str, (String) null);
        this.A01 = 0;
    }
}
