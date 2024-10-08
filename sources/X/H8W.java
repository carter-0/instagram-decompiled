package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.atomic.AtomicBoolean;

public final class H8W extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Long l;
        1Xj r5 = (1Xj) obj;
        AnonymousClass7TG.A1N(r5, obj2);
        UserSession userSession = this.A00;
        AnonymousClass4DU r2 = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "barcelona_social_context_impression");
        DbW.A15(A0e, r2);
        C51965G9l.A1K(A0e, DbY.A0a());
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        String id = r5.getId();
        if (id != null) {
            String A06 = 1Xv.A06(id);
            0qQ.A0B(A06, 0);
            C51965G9l.A1E(A0e, 00y.A0n(10, A06));
            User A11 = C51966G9m.A11(r5);
            if (A11 != null) {
                l = 00y.A0n(10, A11.getId());
            } else {
                l = null;
            }
            C51965G9l.A1H(A0e, l);
            A0e.A9F("target_id", (Long) null);
            A0e.AAJ("social_context_type", (String) null);
            A0e.AAJ("social_context", (String) null);
            A0e.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public H8W(1Bk r1, UserSession userSession, AnonymousClass4DU r3) {
        super(r1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
