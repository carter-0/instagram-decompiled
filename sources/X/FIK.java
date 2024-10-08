package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class FIK implements DialogInterface.OnClickListener {
    public final /* synthetic */ C48144EZm A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C51873G5k A02;

    public FIK(C48144EZm eZm, UserSession userSession, C51873G5k g5k) {
        this.A01 = userSession;
        this.A00 = eZm;
        this.A02 = g5k;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FGS.A01(this.A00, this.A01, "reminder_confirm");
        this.A02.D5S();
    }
}
