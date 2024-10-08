package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2m0  reason: invalid class name */
public final class AnonymousClass2m0 extends AnonymousClass2m1 {
    public long A00;
    public final AnonymousClass0JR A01;
    public final UserSession A02;
    public final AtomicLong A03 = new AtomicLong(-1);

    public final void Dek(AnonymousClass1GU r9) {
        0qQ.A0B(r9, 0);
        this.A00 = this.A01.now();
        UserSession userSession = this.A02;
        AnonymousClass9J8 A002 = C241323Ot.A00(r9.A00);
        0qQ.A0B(userSession, 0);
        0wc A012 = C241323Ot.A01(userSession);
        0Aj A003 = A012.A00(A012.A00, "instagram_feed_request_sent");
        if (A003.isSampled()) {
            A003.AAJ(TraceFieldType.RequestID, A002.A02);
            A003.AAJ(Dbf.A02(21, 10, 84), A002.A03);
            A003.AAJ("request_type", A002.A01.toString());
            A003.Cgf();
        }
        C228482lk.A00(userSession).A08(r9, "request_observer", false);
    }

    public final void Des(AnonymousClass1GU r7, 1XM r8) {
        0qQ.A0B(r7, 0);
        UserSession userSession = this.A02;
        AnonymousClass9J8 A002 = C241323Ot.A00(r7.A00);
        0qQ.A0B(userSession, 0);
        0wc A012 = C241323Ot.A01(userSession);
        0Aj A003 = A012.A00(A012.A00, "instagram_feed_request_completed");
        if (A003.isSampled()) {
            A003.AAJ(TraceFieldType.RequestID, A002.A02);
            A003.AAJ(Dbf.A02(21, 10, 84), A002.A03);
            A003.AAJ("request_type", A002.A01.toString());
            A003.Cgf();
        }
    }

    public final void Dey(AnonymousClass1GU r6, 1XM r7) {
        this.A03.set(this.A01.now() - this.A00);
    }

    public AnonymousClass2m0(AnonymousClass0JR r4, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r4;
    }
}
