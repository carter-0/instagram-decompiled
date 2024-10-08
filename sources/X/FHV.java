package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FHV implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C2363133g A00;
    public final /* synthetic */ User A01;

    public FHV(C2363133g r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C2363133g r1 = this.A00;
        UserSession userSession = r1.A02;
        AnonymousClass4DU r3 = r1.A04;
        0Aj A0G = DbZ.A0G(AnonymousClass0kN.A01(r3, userSession), this.A01, "unfollow_dialog_cancelled");
        DbW.A15(A0G, r3);
        A0G.Cgf();
    }
}
