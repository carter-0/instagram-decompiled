package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ny2  reason: case insensitive filesystem */
public abstract class C70148Ny2 {
    public static final void A00(UserSession userSession, AnonymousClass651 r3, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), "direct_e2e_message_delivery_waterfall");
        A0e.A7p("realtime", Boolean.valueOf(r3.A06));
        C66580MXl.A1J(A0e, str);
        A0e.AAJ("sender_id", str2);
        DbS.A1I(A0e, "persisted_in_memory");
        String str3 = r3.A03;
        if (str3 != null) {
            A0e.AAJ("client_context", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            A0e.AAJ("mutation_token", str4);
        }
        A0e.Cgf();
    }
}
