package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class LUH implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass6SP A00;
    public final /* synthetic */ String A01;

    public LUH(AnonymousClass6SP r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A00.A00;
        String str = this.A01;
        0qQ.A0B(userSession, 0);
        C63400KwL.A00(userSession, "cancel", str);
    }
}
