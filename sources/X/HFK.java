package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;

public final class HFK extends 0px {
    public C45365Cv7 A00;
    public final 1NH A01;

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        C45365Cv7 cv7 = (C45365Cv7) obj;
        UserSession userSession = this.A02;
        try {
            C45320CuO cuO = cv7.A01;
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            C45707D2g.A00(A0A, cuO);
            A0A.close();
            String obj2 = stringWriter.toString();
            1NY A0N = DbU.A0N(userSession);
            A0N.A0A("igtv/write_seen_state/");
            A0N.A9m(AnonymousClass000.A00(3938), obj2);
            A0N.A0R(1XP.class, 1XY.class);
            return DbT.A0U(A0N, true);
        } catch (IOException e) {
            0KC.A0F("PendingIGTVSeenStateRequest", "failed to serialize to json", e);
            return null;
        }
    }

    public final Integer A0H() {
        return AnonymousClass05K.A0C;
    }

    public final void A0I() {
        HashMap hashMap;
        1NH r6 = this.A01;
        String str = this.A02.A06;
        C45254CtH ctH = (C45254CtH) r6.A02(002.A0R("pending_felix_seen_states_", str), true);
        if (!(ctH == null || (hashMap = ctH.A00) == null)) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                Object obj = ctH.A00.get(A18);
                obj.getClass();
                A0D(A18, obj);
            }
            A08();
        }
        r6.A04(002.A0R("pending_felix_seen_states_", str));
    }

    public final void A0J() {
        this.A01.A04(002.A0R("pending_felix_seen_states_", this.A02.A06));
    }

    public HFK(1NH r1, UserSession userSession) {
        super(userSession);
        this.A01 = r1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.CtH] */
    public final void A0K() {
        A02();
        ? obj = new Object();
        obj.A00 = A06();
        this.A01.A05(002.A0R("pending_felix_seen_states_", this.A02.A06), obj);
    }
}
