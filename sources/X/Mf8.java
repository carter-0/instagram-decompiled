package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class Mf8 implements 0lm {
    public final UserSession A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final List A02 = AnonymousClass7TE.A1C();
    public final C62320sa A03;
    public final C72216Oyk A04;

    public final void onUserSessionWillEnd(boolean z) {
        this.A02.clear();
        this.A01.clear();
        C324716zm.A01((C59721JVf) null);
        if (JVU.A01(this.A00, AnonymousClass05K.A00) || z) {
            AnonymousClass1J9.A00().A02(this.A04);
        }
    }

    public Mf8(UserSession userSession, C62320sa r4) {
        AnonymousClass7TG.A1O(userSession, r4);
        this.A00 = userSession;
        this.A03 = r4;
        C72216Oyk oyk = new C72216Oyk(this, 0);
        this.A04 = oyk;
        AnonymousClass1J9.A00().A01(oyk);
    }
}
