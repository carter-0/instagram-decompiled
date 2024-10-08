package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2zK  reason: invalid class name and case insensitive filesystem */
public final class C235132zK implements C250603lj {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        Long l;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        if (r12.CEk(r11) == AnonymousClass05K.A00) {
            1Xj r7 = (1Xj) r11.A03;
            Object obj = r11.A04;
            String str = null;
            if (r7 != null) {
                String A2n = r7.A2n();
                if (A2n != null) {
                    l = 00y.A0n(10, A2n);
                } else {
                    l = null;
                }
                if (obj != null) {
                    for (User id : r7.A3a()) {
                        String id2 = id.getId();
                        UserSession userSession = this.A00;
                        String str2 = userSession.A06;
                        if (0qQ.A0K(id2, str2)) {
                            AnonymousClass4DU r2 = this.A01;
                            0wc A012 = AnonymousClass0kN.A01(r2, userSession);
                            0Aj A002 = A012.A00(A012.A00, "coauthor_invite_cta_impression");
                            if (l != null) {
                                A002.A9F("media_id", l);
                                User A2A = r7.A2A(userSession);
                                if (A2A != null) {
                                    str = A2A.getId();
                                }
                                A002.AAE(C263944Ny.A00(str), "media_owner_id");
                                A002.AAE(C263944Ny.A00(str2), "actor_id");
                                A002.A8M(r7.BR7().A00(), "media_type");
                                A002.AAJ("container_module", r2.getModuleName());
                                A002.AAJ("source_of_action", r2.getModuleName());
                                A002.Cgf();
                                long longValue = l.longValue();
                                0wc A013 = AnonymousClass0kN.A01(r2, userSession);
                                0Aj A003 = A013.A00(A013.A00, "ig_coauthor_invite_cta_impression");
                                if (A003.isSampled()) {
                                    A003.A9F("media_id", Long.valueOf(longValue));
                                    A003.AAJ("entrypoint", AnonymousClass000.A00(4421));
                                    A003.Cgf();
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
            }
        }
    }

    public C235132zK(UserSession userSession, AnonymousClass4DU r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
