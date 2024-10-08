package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.8OA  reason: invalid class name */
public final class AnonymousClass8OA implements AnonymousClass8OB {
    public C20565Wui A00;
    public A6A A01;
    public C17872VhP A02;
    public final UserSession A03;
    public final AnonymousClass8O9 A04;
    public final AnonymousClass8OD A05 = new AnonymousClass8OC();
    public final Set A06 = new HashSet();

    public final void DHL(C20565Wui wui, C17872VhP vhP) {
        this.A02 = vhP;
        this.A00 = wui;
        for (AnonymousClass8OO DHL : this.A06) {
            DHL.DHL(wui, vhP);
        }
    }

    public AnonymousClass8OA(UserSession userSession, AnonymousClass8O9 r3) {
        this.A04 = r3;
        this.A03 = userSession;
    }
}
