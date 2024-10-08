package X;

import com.instagram.common.session.UserSession;

public final class NNA extends C228042kh {
    public final AnonymousClass12V A00;
    public final UserSession A01;
    public final C60096Jfc A02;
    public final C62320sa A03;

    public /* synthetic */ NNA(UserSession userSession, C60096Jfc jfc) {
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        C73926Pm6 pm6 = new C73926Pm6(userSession, 48);
        AnonymousClass7TG.A1U(userSession, jfc, r2);
        this.A01 = userSession;
        this.A02 = jfc;
        this.A00 = r2;
        this.A03 = pm6;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.Mex, X.NUQ] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        1aU A002 = OP5.A00(userSession, "EncryptedBackupsSettingsViewModel");
        Integer num = AnonymousClass05K.A0C;
        C72203OyT A003 = C69901Nu3.A00(userSession, num);
        C60096Jfc jfc = this.A02;
        02m A0M = C66582MXn.A0M(userSession);
        0BQ A004 = AnonymousClass0BO.A00(userSession);
        AnonymousClass65E A005 = AnonymousClass65D.A00(userSession);
        AnonymousClass7TG.A1Q(A004, A005);
        AnonymousClass12V r4 = this.A00;
        NUL nul = (NUL) userSession.A01(NUL.class, new C67485Mof(userSession, 20));
        return new C67758MuD(r4, A002, userSession, C69888Ntq.A00(userSession, num), jfc, nul, new C66913Mex(A0M, A005, A004), (OW5) this.A03.invoke(), A003);
    }
}
