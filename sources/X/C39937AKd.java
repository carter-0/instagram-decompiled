package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.AKd  reason: case insensitive filesystem */
public final class C39937AKd implements DialogInterface.OnClickListener {
    public final /* synthetic */ C334107ag A00;
    public final /* synthetic */ C52971GgO A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass4DU A03;

    public C39937AKd(C334107ag r1, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r4) {
        this.A01 = ggO;
        this.A00 = r1;
        this.A02 = userSession;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C52971GgO ggO = this.A01;
        AXY axy = (AXY) this.A00;
        ggO.A0R((C337207ft) null, axy.A02, axy.A01);
        UserSession userSession = this.A02;
        C49241Erk.A00(AnonymousClass0kN.A01(this.A03, userSession), userSession, (User) null, "comments", "click", "cant_mention_alert_nux_edit_comment");
    }
}
