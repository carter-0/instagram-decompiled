package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NNK extends C228042kh {
    public final Application A00;
    public final AnonymousClass12V A01;
    public final UserSession A02;
    public final C68714NUa A03;
    public final C62320sa A04;

    public /* synthetic */ NNK(Application application, UserSession userSession, C68714NUa nUa) {
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        C73663Phc phc = new C73663Phc(userSession, 13);
        C51972G9s.A1B(userSession, r2);
        this.A02 = userSession;
        this.A00 = application;
        this.A03 = nUa;
        this.A01 = r2;
        this.A04 = phc;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        AnonymousClass61K r1 = AnonymousClass61K.ENCRYPTED_BACKUPS_ENTER_CODE_VIEWMODEL;
        0qQ.A0B(userSession, 0);
        AnonymousClass1aS r12 = 1aD.A00(userSession, r1).A02;
        0qQ.A07(r12);
        1aU A0B = r12.A0L(C72066Ovf.A00).A0B();
        C68714NUa nUa = this.A03;
        AnonymousClass12V r2 = this.A01;
        return new C67711MtQ(this.A00, r2, (1aU) this.A04.invoke(), A0B, userSession, nUa);
    }
}
