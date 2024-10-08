package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class ANG implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public ANG(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(190135337);
        27p.A01(this.A00).A09.A0T("CUTOUT_STICKER_DELETION_DIALOG_CANCEL_TAP", this.A01);
        AnonymousClass0fD.A0C(328270573, A05);
    }
}
