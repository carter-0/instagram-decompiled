package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;

/* renamed from: X.67o  reason: invalid class name and case insensitive filesystem */
public final class C3031467o implements C3031367n {
    public final Mailbox A00;
    public final AnonymousClass28d A01;

    public C3031467o(Mailbox mailbox, AnonymousClass28d r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = mailbox;
    }

    public final /* synthetic */ void Ezd() {
    }

    public final /* bridge */ /* synthetic */ void EpW(Object obj) {
        C3031167l r4 = (C3031167l) obj;
        0qQ.A0B(r4, 0);
        AnonymousClass1aS r0 = 1aD.A06;
        UserSession userSession = r4.A02;
        userSession.A01(C3032167w.class, new C73920Pm0(userSession, 35));
        AnonymousClass28d r2 = this.A01;
        Mailbox mailbox = this.A00;
        r2.A00(new C3032267x(mailbox));
        r2.A00(new C3032367y(mailbox));
        r2.A00(new C3032467z(AnonymousClass05K.A01));
        r2.A00(new C3032467z(AnonymousClass05K.A0C));
        r2.A00(new C3032467z(AnonymousClass05K.A0N));
        r2.A00(new C3032467z(AnonymousClass05K.A0Y));
    }
}
