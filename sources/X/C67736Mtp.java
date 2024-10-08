package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Mtp  reason: case insensitive filesystem */
public final class C67736Mtp extends 2YL {
    public final OV0 A00;
    public final C254783t2 A01;
    public final 05G A02 = 106.A01(C68987NcI.A00);
    public final UserSession A03;
    public final AnonymousClass2Ep A04;

    public C67736Mtp(UserSession userSession, AnonymousClass2Ep r3, C254783t2 r4) {
        AnonymousClass7TG.A1O(userSession, r4);
        this.A03 = userSession;
        this.A01 = r4;
        this.A04 = r3;
        this.A00 = new OV0(userSession);
    }

    public final void A00() {
        Map A002 = AnonymousClass9HX.A00();
        ArrayList A0f = JTQ.A0f(A002);
        Iterator A0u = AnonymousClass7TF.A0u(A002);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            int A0M = AnonymousClass7TE.A0M(A1J.getKey());
            A0f.add(new C68201N5q(this.A00.A01(this.A01, AnonymousClass7TE.A0M(A1J.getKey())), ((AnonymousClass9HZ) A1J.getValue()).A01, A0M, AnonymousClass9HX.A01(this.A03, this.A04, (AnonymousClass9HZ) A1J.getValue())));
        }
        this.A02.Epw(new C68986NcH(A0f));
    }
}
