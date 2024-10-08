package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

public final class LDR {
    public C62652KkE A00;
    public UUID A01;
    public UUID A02;
    public final 0wc A03;

    public LDR(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = AnonymousClass0kN.A02(userSession);
    }

    public final void A00(C62665KkR kkR) {
        String obj;
        C62652KkE kkE = this.A00;
        if (kkE == null) {
            0KC.A0E("SuggestedRepliesLogger", C273654mx.A00(223));
            return;
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "ig_creator_agents_suggested_replies_collapse");
        if (A0e.isSampled()) {
            A0e.A8M(kkE, "inbox_type");
            UUID uuid = this.A01;
            String str = null;
            if (uuid != null) {
                str = uuid.toString();
            }
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            A0e.AAJ("sr_session_id", str);
            UUID uuid2 = this.A02;
            if (!(uuid2 == null || (obj = uuid2.toString()) == null)) {
                str2 = obj;
            }
            A0e.AAJ("thread_session_id", str2);
            0bb r1 = new 0bb();
            r1.A01(kkR, "type_of_collapse");
            A0e.AAK(r1, "sr_context");
            A0e.Cgf();
        }
        this.A01 = AnonymousClass0HM.A00();
    }
}
