package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class AKX implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C247733gp A01;
    public final /* synthetic */ boolean A02;

    public AKX(UserSession userSession, C247733gp r2, boolean z) {
        this.A02 = z;
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A02) {
            AAQ.A00(this.A00, this.A01, "cancel_unhide");
        }
        dialogInterface.dismiss();
    }
}
