package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class FI6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C48144EZm A00;
    public final /* synthetic */ UserSession A01;

    public FI6(C48144EZm eZm, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = eZm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FGS.A01(this.A00, this.A01, "reminder_cancel");
    }
}
