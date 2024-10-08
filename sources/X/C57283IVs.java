package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IVs  reason: case insensitive filesystem */
public final class C57283IVs implements C233992wo {
    public final /* synthetic */ AnonymousClass1GU A00;
    public final /* synthetic */ C228552lr A01;

    public C57283IVs(AnonymousClass1GU r1, C228552lr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DFr(boolean z) {
        AnonymousClass9IV r1 = new AnonymousClass9IV(AnonymousClass3PG.LOCAL, AnonymousClass05K.A01);
        C228472lj r0 = this.A01.A0A;
        if (r0 != null) {
            r0.A05(r1);
        }
    }

    public final List CsY(List list) {
        list.size();
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list.isEmpty()) {
            C228482lk.A00(this.A01.A0J).A07(this.A00, "0 feed items to vend from flash feed");
        } else {
            C228552lr r4 = this.A01;
            if (r4.A0A != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    1Xg r2 = (1Xg) it.next();
                    if (r2.A06 == 1UQ.A0Y) {
                        A1C.add(r2);
                    }
                }
                0rm A11 = C51965G9l.A11();
                A11.A00 = A1C;
                1V0 r1 = r4.A09;
                0uX r6 = null;
                if (r1 == null) {
                    0qQ.A0F("initialFeedCache");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (r1.A00 == null) {
                    r1.A01();
                }
                1XM r7 = r1.A00;
                if (r7 != null) {
                    UserSession userSession = r4.A0J;
                    1Ua A002 = 1UX.A00(r4.A0G, userSession);
                    0qQ.A07(A002);
                    if (182.A06(0Tu.A05, userSession, 36317620687869317L)) {
                        r6 = (0uX) userSession.A00(0uX.class);
                    }
                    AnonymousClass3z6.A00(userSession, r6, r7, A002, A1C, 4);
                    List A003 = r7.A00();
                    A11.A00 = A003;
                    A1C.retainAll(A003);
                }
                C228562ls r5 = r4.A0S;
                Long A0u = C51968G9o.A0u();
                r5.A00 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                if (A0u != null) {
                    r5.A01 = A0u;
                }
                r4.A01 = System.currentTimeMillis();
                r4.A0H.post(new C57909IiQ(this.A00, r4, A11));
                A1C.size();
                return A1C;
            }
        }
        return A1C;
    }
}
