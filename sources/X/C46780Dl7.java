package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dl7  reason: case insensitive filesystem */
public final class C46780Dl7 extends 2YL {
    public final 2Fk A00;
    public final UserSession A01;
    public final C49587Eyw A02;

    public C46780Dl7(UserSession userSession, String str) {
        AnonymousClass7TF.A1B(userSession, 1, str);
        this.A01 = userSession;
        C49587Eyw eyw = new C49587Eyw(userSession, str);
        this.A02 = eyw;
        this.A00 = DbT.A0G(AnonymousClass10H.A00(new MHs(this, (AnonymousClass4D7) null, 1), eyw.A01, eyw.A02, eyw.A00));
    }

    public static final void A00(C320136rp r2, User user) {
        user.A03.Eal(user.B6o());
        user.A12(r2.A0E);
        user.A13(AnonymousClass7TG.A1X(r2.A02));
    }
}
