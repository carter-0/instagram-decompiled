package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;

/* renamed from: X.Hd3  reason: case insensitive filesystem */
public abstract class C55153Hd3 {
    public static final void A00(UserSession userSession, 1Xj r8, AndroidLink androidLink, String str, String str2, boolean z) {
        Long A10;
        String B8i = androidLink.B8i();
        if (B8i != null && (A10 = AnonymousClass7TE.A10(B8i)) != null && A10.longValue() > 0) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), "ig_deeplink_funnel_event");
            A0e.AAJ("ig_deeplink_event_name", str);
            if (str2 == null) {
                str2 = "invalid";
            }
            A0e.AAJ(C273654mx.A00(70), str2);
            A0e.A9F(AnonymousClass000.A00(3176), A10);
            A0e.AAJ("ig_deeplink_reason", String.valueOf(androidLink.B8j()));
            if (z) {
                String name = r8.BR7().name();
                0bb r2 = new 0bb();
                r2.A06(C66579MXk.A00(670), name);
                r2.A06("checkout_experience", C9855RiU.A00(androidLink));
                A0e.AAK(r2, "client_dict");
            }
            C55697Hlu Ae6 = C240443Kx.A00(userSession).Ae6();
            if (Ae6 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (C238873Dt r0 : Ae6.A01) {
                    DbU.A1X(Long.valueOf(((C238863Ds) r0.A01).A00), A1C);
                }
                A0e.AAe(AnonymousClass000.A00(4126), A1C);
            }
            A0e.Cgf();
        }
    }
}
