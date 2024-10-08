package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class W5a implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ X8P A02;
    public final /* synthetic */ C309546Yr A03;
    public final /* synthetic */ VZP A04;
    public final /* synthetic */ C232682uF A05;
    public final /* synthetic */ String A06;

    public W5a(AnonymousClass0iw r1, UserSession userSession, X8P x8p, C309546Yr r4, VZP vzp, C232682uF r6, String str) {
        this.A03 = r4;
        this.A02 = x8p;
        this.A01 = userSession;
        this.A00 = r1;
        this.A05 = r6;
        this.A06 = str;
        this.A04 = vzp;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C309546Yr r2 = this.A03;
        r2.A00 = null;
        this.A02.D9G();
        if (!r2.A03) {
            UserSession userSession = this.A01;
            C309546Yr.A01(this.A00, userSession, r2, this.A04, this.A05, this.A06, "cancel");
        }
    }
}
