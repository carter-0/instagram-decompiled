package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class OL7 {
    public long A00;
    public final 0wc A01;
    public final UserSession A02;
    public final String A03;

    public OL7(AnonymousClass0iw r3, UserSession userSession, String str, String str2) {
        this.A01 = AnonymousClass0kN.A01(r3, userSession);
        this.A02 = userSession;
        this.A03 = str == null ? "Null" : str;
        if (str2 != null) {
            try {
                this.A00 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                this.A00 = -1;
            }
        }
    }

    public final void A00(String str, boolean z, boolean z2, boolean z3) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(String.valueOf(this.A00));
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "direct_welcome_message_events");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            C66580MXl.A1J(A0e, this.A03);
            A0e.AAe("participant_ids", A1C);
            A0e.A7p(C273654mx.A00(720), Boolean.valueOf(z2));
            A0e.A7p("is_from_icebreaker", Boolean.valueOf(z));
            A0e.A7p("is_ctd_wm_override", Boolean.valueOf(z3));
            A0e.Cgf();
        }
    }
}
