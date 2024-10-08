package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

public final class OI7 {
    public boolean A00;
    public final UserSession A01;
    public final 0ng A02;
    public final 0no A03;
    public final OC0 A04;
    public final 2Dm A05;
    public final C70808OMd A06;
    public final AnonymousClass65S A07;
    public final OZY A08;
    public final List A09;
    public final List A0A = AnonymousClass7TE.A1C();

    public OI7(UserSession userSession, 2Dm r3, C70808OMd oMd, AnonymousClass65S r5) {
        C51974G9v.A1P(userSession, oMd, r5, r3);
        this.A01 = userSession;
        this.A06 = oMd;
        this.A07 = r5;
        this.A05 = r3;
        this.A04 = new OC0(userSession);
        this.A08 = new OZY(userSession);
        0no A002 = 0no.A00();
        0qQ.A07(A002);
        this.A03 = A002;
        List synchronizedList = Collections.synchronizedList(AnonymousClass7TE.A1C());
        0qQ.A07(synchronizedList);
        this.A09 = synchronizedList;
        this.A02 = new NRS(this);
    }
}
