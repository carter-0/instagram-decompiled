package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public class EC7 extends 1P0 {
    public final UserSession A00;
    public final C267094ax A01;
    public final User A02;
    public final String A03;
    public final boolean A04;

    public EC7(UserSession userSession, C267094ax r2, User user, String str, boolean z) {
        this.A00 = userSession;
        this.A02 = user;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = z;
    }

    public final void onFailInBackground(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-1542193393);
        C267094ax r2 = this.A01;
        if (r2 == null) {
            C294695ms.A00(this.A00).A0E(this.A02);
        } else if ("create".equals(this.A03) && this.A02.A28()) {
            AnonymousClass2f1.A00(this.A00).A0O(r2);
        }
        AnonymousClass0fD.A0A(1240025993, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1728454387);
        DwR dwR = (DwR) obj;
        int A0D = AnonymousClass7TG.A0D(dwR, 1360865800);
        if (!this.A04) {
            C294695ms.A00(this.A00).A0C(dwR.A00(), this.A02, this.A03);
        }
        C267094ax r1 = this.A01;
        if (r1 != null) {
            AnonymousClass2f1.A00(this.A00).A0O(r1);
        }
        AnonymousClass0fD.A0A(959314683, A0D);
        AnonymousClass0fD.A0A(1246138539, A032);
    }
}
