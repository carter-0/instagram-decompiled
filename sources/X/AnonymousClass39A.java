package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.39A  reason: invalid class name */
public final class AnonymousClass39A {
    public final 0wc A00;

    public AnonymousClass39A(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public final void A00(C54683HOo hOo) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_dogfooding_first_event");
        if (A002.isSampled()) {
            A002.A8M(hOo, TraceFieldType.AdhocEventName);
            A002.Cgf();
        }
    }
}
