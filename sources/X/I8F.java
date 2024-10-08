package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class I8F implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ Long A02;

    public I8F(UserSession userSession, AnonymousClass4DU r2, Long l) {
        this.A02 = l;
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Long l = this.A02;
        if (l != null) {
            C51974G9v.A1E(AnonymousClass0kN.A01(this.A01, this.A00), l, "ig_coauthor_invite_dismiss_tap");
        }
    }
}
