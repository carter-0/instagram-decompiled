package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EFc  reason: case insensitive filesystem */
public final class C47742EFc extends C228042kh {
    public final UserSession A00;

    public C47742EFc(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C46788DlI(userSession, F6S.A00(userSession, AnonymousClass7TE.A1E()), AnonymousClass2o3.A00(userSession));
    }

    public static C46788DlI A00(AnonymousClass07g r2, AnonymousClass0eM r3) {
        return new 2YN(new C47742EFc((UserSession) r3.getValue()), r2).A00(C46788DlI.class);
    }
}
