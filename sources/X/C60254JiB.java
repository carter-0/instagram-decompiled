package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JiB  reason: case insensitive filesystem */
public final class C60254JiB extends 2YL {
    public User A00;
    public final UserSession A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final EQ3 A05;

    public C60254JiB(UserSession userSession, EQ3 eq3) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A05 = eq3;
        02z A012 = 106.A01(C51043FnZ.A00);
        this.A03 = A012;
        this.A04 = 10b.A03(A012);
    }

    public final void A00(C46434Dew dew, String str, String str2) {
        String str3 = str;
        if (str != null) {
            String str4 = str2;
            if (str2 != null) {
                dew.A02 = true;
                C318136oS A002 = C318116oQ.A00(this);
                AnonymousClass7TE.A1Z(new MGN(this, dew, str4, str3, (AnonymousClass4D7) null, 20), A002);
            }
        }
    }

    public final void onCleared() {
        this.A05.onUserSessionWillEnd(false);
    }
}
