package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5uJ  reason: invalid class name and case insensitive filesystem */
public final class C298955uJ implements AnonymousClass0lh {
    public final 0xa A00;
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A01.A03(C298955uJ.class);
    }

    public C298955uJ(UserSession userSession) {
        this.A01 = userSession;
        0xa A03 = 1Al.A01(userSession).A03(1An.A2Y);
        this.A00 = A03;
        int i = A03.getInt("app_version_number", -1);
        int A002 = C61120lW.A00();
        if (i != A002) {
            0xY AR4 = this.A00.AR4();
            AR4.AHM();
            AR4.apply();
            0xY AR42 = A03.AR4();
            AR42.E5Z("app_version_number", A002);
            AR42.apply();
        }
    }
}
