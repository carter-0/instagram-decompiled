package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.VbT  reason: case insensitive filesystem */
public final class C17637VbT {
    public final VMF A00;
    public final VMG A01;
    public final C14221Ts1 A02;
    public final Set A03 = new HashSet();
    public final UserSession A04;
    public final G9d A05;
    public final C337287g2 A06;

    public C17637VbT(VMF vmf, VMG vmg, UserSession userSession, AnonymousClass4D6 r17, C337287g2 r18) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 6);
        C337287g2 r5 = r18;
        this.A06 = r5;
        this.A00 = vmf;
        this.A01 = vmg;
        this.A04 = userSession2;
        C19551Wbb wbb = new C19551Wbb(this, 1);
        this.A05 = wbb;
        this.A02 = C14225Ts5.A00(userSession2, r17, (C337247fx) null, wbb, r5, AnonymousClass05K.A00, 0, 200, false, true);
    }
}
