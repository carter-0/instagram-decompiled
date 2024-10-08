package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class W54 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ X8P A02;
    public final /* synthetic */ C309546Yr A03;
    public final /* synthetic */ VZP A04;
    public final /* synthetic */ C232682uF A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public W54(AnonymousClass0iw r1, UserSession userSession, X8P x8p, C309546Yr r4, VZP vzp, C232682uF r6, String str, String str2) {
        this.A03 = r4;
        this.A07 = str;
        this.A01 = userSession;
        this.A02 = x8p;
        this.A00 = r1;
        this.A05 = r6;
        this.A06 = str2;
        this.A04 = vzp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C309546Yr r4 = this.A03;
        r4.A03 = true;
        String str = this.A07;
        if (str != null) {
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 0);
            ((C17248VOa) userSession.A01(C17248VOa.class, C20655Wwn.A00)).A00.add(str);
        }
        this.A02.D5V();
        UserSession userSession2 = this.A01;
        C309546Yr.A01(this.A00, userSession2, r4, this.A04, this.A05, this.A06, "show_posts");
    }
}
