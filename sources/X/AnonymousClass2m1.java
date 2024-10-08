package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2m1  reason: invalid class name */
public abstract class AnonymousClass2m1 implements C228632lz {
    public void Dek(AnonymousClass1GU r1) {
    }

    public void Des(AnonymousClass1GU r1, 1XM r2) {
    }

    public void Dey(AnonymousClass1GU r1, 1XM r2) {
    }

    public final void onStop() {
    }

    public final void DeP(C268654dm r10, AnonymousClass1GU r11, int i) {
        String str;
        if (this instanceof C228702mB) {
            C228702mB r1 = (C228702mB) this;
            if (!r11.A00.A02()) {
                r1.A00.A00();
            }
        } else if (this instanceof AnonymousClass2m0) {
            UserSession userSession = ((AnonymousClass2m0) this).A02;
            1FS r2 = r11.A00;
            AnonymousClass9J8 A00 = C241323Ot.A00(r2);
            String str2 = C71342cb.A00(userSession).A0D;
            Throwable A01 = r10.A01();
            0qQ.A0B(userSession, 0);
            0wc A012 = C241323Ot.A01(userSession);
            0Aj A002 = A012.A00(A012.A00, "ig_main_feed_request_failed");
            if (A002.isSampled() && str2 != null) {
                A002.AAJ("module", str2);
                A002.AAJ("request_type", A00.A01.toString());
                A002.AAJ("feed_ranking_session_id", A00.A03);
                A002.AAJ("feed_ranking_request_id", A00.A02);
                if (A01 != null) {
                    A002.AAJ("error_message", A01.getMessage());
                }
                A002.Cgf();
            }
            C228482lk.A00(userSession).A04(r10, r11, i);
            Map map = r2.A0D;
            if (map.containsKey("is_feed_eager_refresh") && 0qQ.A0K(map.get("is_feed_eager_refresh"), "true")) {
                02m r12 = C228502lm.A00(userSession).A00;
                r12.markerPoint(976041859, "network_failed");
                r12.markerEnd(976041859, 3);
            }
        } else if (this instanceof C228642m2) {
            C228642m2 r22 = (C228642m2) this;
            long currentTimeMillis = System.currentTimeMillis();
            Throwable A013 = r10.A01();
            String str3 = null;
            if (A013 != null && (A013.getCause() instanceof AnonymousClass3HN)) {
                Throwable cause = A013.getCause();
                0qQ.A0C(cause, "null cannot be cast to non-null type com.instagram.common.api.base.UnexpectedContentTypeException");
                str3 = ((AnonymousClass3HN) cause).A00;
            }
            AnonymousClass28j r6 = r22.A00;
            synchronized (r6) {
                synchronized (r6.A01) {
                    C241343Ov r23 = r6.A00;
                    if (r23 != null) {
                        r23.A02 = currentTimeMillis - r23.A05;
                        r23.A01 = i;
                        if (A013 != null) {
                            str = A013.toString();
                        } else {
                            str = null;
                        }
                        r23.A04 = str;
                        r23.A03 = str3;
                        AnonymousClass28j.A00(r6);
                    }
                }
            }
        }
    }

    public final void DeQ(AnonymousClass1GU r6) {
        if (this instanceof AnonymousClass2m0) {
            AnonymousClass2m0 r1 = (AnonymousClass2m0) this;
            r1.A03.set(r1.A01.now() - r1.A00);
        }
    }

    public final void DeU(AnonymousClass1GU r6) {
        if (this instanceof AnonymousClass2m0) {
            C228482lk.A00(((AnonymousClass2m0) this).A02).A09(r6.A00);
        } else if (this instanceof C228712mC) {
            C228322lL r3 = ((C228712mC) this).A00;
            1FS r2 = r6.A00;
            if (r3.A0M && r3.A04 && !r3.A0F.A0G) {
                C228322lL.A05(r3, AnonymousClass05K.A0C, r2.A04.toString());
            }
            r3.A04 = false;
        }
    }
}
