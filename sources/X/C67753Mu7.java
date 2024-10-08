package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mu7  reason: case insensitive filesystem */
public final class C67753Mu7 extends 2YL {
    public final UserSession A00;
    public final C68714NUa A01;
    public final 05G A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;
    public final 1aU A06;
    public final 1a8 A07 = C66581MXm.A0P();

    public final void A01() {
        if (((List) this.A02.getValue()).isEmpty()) {
            this.A03.FIA(AnonymousClass7TE.A0v());
            PU8.A00(this.A06, this.A07, this, 6);
        }
    }

    public final void onCleared() {
        this.A07.A01();
    }

    public C67753Mu7(1aU r2, UserSession userSession, C68714NUa nUa) {
        AnonymousClass7TG.A1U(userSession, nUa, r2);
        this.A00 = userSession;
        this.A01 = nUa;
        this.A06 = r2;
        02z A10 = C51970G9q.A10(false);
        this.A03 = A10;
        this.A05 = A10;
        02z A1J = JTO.A1J();
        this.A02 = A1J;
        this.A04 = A1J;
    }

    public static C68714NUa A00(AnonymousClass0eM r0) {
        return ((C67753Mu7) r0.getValue()).A01;
    }
}
