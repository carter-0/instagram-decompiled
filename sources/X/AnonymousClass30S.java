package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30S  reason: invalid class name */
public final class AnonymousClass30S {
    public AnonymousClass30X A00;
    public final UserSession A01;
    public final 2el A02;
    public final C229932oe A03 = new C229932oe();
    public final AnonymousClass30V A04;
    public final AnonymousClass30T A05;
    public final AnonymousClass30U A06;
    public final Map A07;
    public final Map A08;

    public AnonymousClass30S(AnonymousClass4DJ r4, UserSession userSession, 2el r6, List list, List list2) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = r6;
        AnonymousClass30T r2 = new AnonymousClass30T(list);
        this.A05 = r2;
        AnonymousClass30U r1 = new AnonymousClass30U(list, list2);
        this.A06 = r1;
        this.A04 = new AnonymousClass30V(userSession);
        this.A08 = new HashMap();
        this.A07 = new HashMap();
        r4.registerLifecycleListener(new AnonymousClass30W(r2, r1));
        this.A00 = AnonymousClass30X.A02;
    }
}
