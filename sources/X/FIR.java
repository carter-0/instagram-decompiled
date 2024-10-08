package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FIR implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C267064at A01;
    public final /* synthetic */ User A02;

    public FIR(UserSession userSession, C267064at r2, User user) {
        this.A02 = user;
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C49173Eqe.A00(this.A00, this.A02, "user_selected_cancel_on_dialog");
        this.A01.A0R.setEnabled(true);
    }
}
