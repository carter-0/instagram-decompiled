package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EIL extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Wh A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIL(UserSession userSession, 1Wh r5, User user, String str, String str2, String str3, String str4) {
        super(151, 4, true, true);
        this.A00 = userSession;
        this.A06 = str;
        this.A03 = str2;
        this.A01 = r5;
        this.A02 = user;
        this.A05 = str3;
        this.A04 = str4;
    }

    public final void run() {
        long j;
        Long A10;
        UserSession userSession = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "igauthhelper_forced_logout");
        A0e.AAJ("reason", AnonymousClass000.A00(3530));
        String str = this.A06;
        if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        A0e.A9F("reason_code", Long.valueOf(j));
        String str2 = this.A03;
        A0e.AAJ("request", str2);
        A0e.Cgf();
        1Wh r5 = this.A01;
        Handler handler = r5.A00;
        if (handler != null) {
            handler.postDelayed(new C51548Fvu(userSession, r5, this.A02, this.A05, this.A04, str, str2), 1000);
        }
    }
}
