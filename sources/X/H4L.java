package X;

import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class H4L extends 1P0 {
    public final /* synthetic */ C2363133g A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    public H4L(C2363133g r1, 1Xj r2, AnonymousClass3W1 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1111405215);
        UserSession userSession = this.A00.A02;
        User A2A = this.A01.A2A(userSession);
        if (A2A != null) {
            1Ln A0F = Dbb.A0F(AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "unfollow_failed"), A2A, 383);
            A0F.A0n(1Rm.A00().A00);
            A0F.Cgf();
            AnonymousClass0fD.A0A(58973656, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1902660557, A03);
        throw A0y;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-165455304);
        int A032 = AnonymousClass0fD.A03(1536557037);
        C2363133g r7 = this.A00;
        C2360732i BD7 = r7.A03.BD7();
        1Xj r5 = this.A01;
        BD7.DJB((MediaControlEventSourceEnum) null, r5, AnonymousClass3WA.MAIN_FEED_UNFOLLOW_USER, this.A02);
        UserSession userSession = r7.A02;
        User A2A = r5.A2A(userSession);
        if (A2A != null) {
            1Ln A0F = Dbb.A0F(AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "unfollow_successful"), A2A, 384);
            A0F.A0n(1Rm.A00().A00);
            A0F.Cgf();
            AnonymousClass0fD.A0A(1575623718, A032);
            AnonymousClass0fD.A0A(-1942162546, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(1230408063, A032);
        throw A0y;
    }
}
