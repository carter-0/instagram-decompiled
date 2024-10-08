package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class NN0 extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C60096Jfc A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        C309516Yo A0M = DbS.A0M(this.A00, userSession);
        1Av A002 = 1Au.A00(userSession);
        C72203OyT A003 = C69901Nu3.A00(userSession, AnonymousClass05K.A0Y);
        return new C67754Mu9(A0M, AnonymousClass12T.A00, OP5.A00(userSession, "EncryptedBackupsFishfoodingViewModel"), OP5.A01(userSession, "EncryptedBackupsFishfoodingViewModel"), userSession, this.A02, A003, A002);
    }

    public NN0(FragmentActivity fragmentActivity, UserSession userSession, C60096Jfc jfc) {
        AnonymousClass7TG.A1P(userSession, jfc);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = jfc;
    }
}
