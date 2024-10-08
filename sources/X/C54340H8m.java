package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H8m  reason: case insensitive filesystem */
public final class C54340H8m extends IPM {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;

    public C54340H8m(UserSession userSession, C232852uY r2, AnonymousClass4DU r3) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        AnonymousClass7TG.A1N(r9, r10);
        Object obj = r9.A03;
        0qQ.A06(obj);
        1Xj r3 = (1Xj) obj;
        UserSession userSession = this.A00;
        if (C231122qu.A0U(userSession, r3) && !A03(r9)) {
            A02(r9, r10);
            if (A03(r9)) {
                C232852uY r2 = this.A01;
                AnonymousClass4DU r4 = this.A02;
                int position = ((AnonymousClass3W1) r9.A04).getPosition();
                0qQ.A0A(r3);
                C254523sc A04 = r2.A04(r3, r4, "full_view_impression", position, -1);
                if (A04 != null) {
                    C233822wX.A0H(userSession, A04, r4);
                }
            }
        }
    }
}
