package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class FIY implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ DwR A02;
    public final /* synthetic */ C294705mt A03;

    public FIY(Context context, 1P0 r2, DwR dwR, C294705mt r4) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = dwR;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C294705mt r6 = this.A03;
        UserSession userSession = r6.A02;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/set_public/");
        Dbb.A1K(A0a, new FVE(3), userSession);
        1OC A0K = DbW.A0K(A0a);
        A0K.A00 = new ED2(this.A00, userSession, new C47933ENk(this.A01, this.A02));
        C294705mt.A03(A0K, r6);
    }
}
