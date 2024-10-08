package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AZq  reason: case insensitive filesystem */
public final class C40301AZq implements AnonymousClass8GH {
    public final /* synthetic */ C352948Fr A00;

    public C40301AZq(C352948Fr r1) {
        this.A00 = r1;
    }

    public final boolean D26() {
        C352948Fr r5 = this.A00;
        C340297l2 r1 = r5.A04;
        int A09 = r1.A09();
        int i = 2;
        if (A09 == 1 || A09 == 2) {
            i = 3;
        }
        UserSession userSession = r5.A05;
        r1.A07();
        29Z r7 = 27p.A01(userSession).A0F;
        0Aj A0e = AnonymousClass7TE.A0e(r7.A01, "ig_camera_ui_tool_click");
        if (r7.A0P() && A0e.isSampled()) {
            A0e.A8M(AnonymousClass80P.LOW_LIGHT, "tool_type");
            AnonymousClass283 r6 = r7.A04;
            String str = r6.A0L;
            if (str == null) {
                str = "";
            }
            A0e.AAJ("camera_session_id", str);
            AnonymousClass7TH.A0W(A0e, r7);
            int i2 = 2;
            if (r6.A01 != 2) {
                i2 = 1;
            }
            AnonymousClass7TE.A1W(A0e, "camera_position", i2);
            AnonymousClass7TH.A0X(A0e, r7);
            AnonymousClass7TE.A1V(A0e, r6);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            A0e.A8M(r6.A0A, "media_type");
            AnonymousClass7TH.A0U(A0e);
            A0e.A8M(C59725JVj.PRE_CAPTURE, "surface");
            AnonymousClass7TH.A0V(A0e);
        }
        C352948Fr.A00(r5, i);
        return true;
    }
}
