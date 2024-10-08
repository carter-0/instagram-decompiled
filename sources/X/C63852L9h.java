package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.L9h  reason: case insensitive filesystem */
public final class C63852L9h {
    public final LGV A00;
    public final AvatarStore A01;
    public final UserSession A02;
    public final L85 A03;
    public final C62320sa A04;
    public final boolean A05;

    public /* synthetic */ C63852L9h(UserSession userSession, boolean z) {
        LGV A002 = C63061Kqq.A00(userSession);
        L85 l85 = (L85) userSession.A01(L85.class, new MMO(userSession, 26));
        C66250MKl mKl = C66250MKl.A00;
        AvatarStore A003 = 25x.A00(userSession);
        0qQ.A0B(l85, 4);
        AnonymousClass7TG.A1S(mKl, A003);
        this.A02 = userSession;
        this.A05 = z;
        this.A00 = A002;
        this.A03 = l85;
        this.A04 = mKl;
        this.A01 = A003;
    }
}
