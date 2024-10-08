package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6sN  reason: invalid class name and case insensitive filesystem */
public final class C320436sN {
    public final C320446sO A00;
    public final List A01 = new ArrayList();
    public final Set A02 = new LinkedHashSet();
    public final UserSession A03;

    public final C52238GKf A00(UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(userSession, 0);
        Set set = this.A02;
        return new C52238GKf((C320446sO) null, userSession, AnonymousClass05K.A0C, str, this.A01, set, AnonymousClass9OL.A00, z, z2, false, z3, z4, z5);
    }

    public C320436sN(C320446sO r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = r3;
        0qQ.A0B(userSession, 0);
        this.A01.add(new C320456sP(1sd.A00(userSession)));
    }
}
