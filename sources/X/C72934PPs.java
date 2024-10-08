package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PPs  reason: case insensitive filesystem */
public final class C72934PPs implements 0Jp {
    public final /* synthetic */ NUS A00;
    public final /* synthetic */ 2Qz A01;
    public final /* synthetic */ C70792OLn A02;

    public C72934PPs(NUS nus, 2Qz r2, C70792OLn oLn) {
        this.A00 = nus;
        this.A01 = r2;
        this.A02 = oLn;
    }

    public final void ATC(UserSession userSession, 0Jv r4) {
        AnonymousClass7TG.A1N(userSession, r4);
        NUS nus = this.A00;
        nus.A0B("OTC_NOTIFICATION_CHECKING_BACKGROUND_ACCOUNT");
        2Qz.A00(userSession, nus, this.A02);
        r4.AId((Object) null);
    }
}
