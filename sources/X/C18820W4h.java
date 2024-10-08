package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.W4h  reason: case insensitive filesystem */
public final class C18820W4h implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17744VdD A01;

    public C18820W4h(1Yh r1, C17744VdD vdD) {
        this.A01 = vdD;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17744VdD vdD = this.A01;
        UserSession userSession = vdD.A08;
        WGU A002 = WGU.A00(userSession);
        C16678UzE uzE = C16678UzE.BOOST_UNAVAILABLE_DIALOG;
        A002.A01 = "boost_unavailable_dialog";
        A002.A0F(uzE, "boost_another_post_button");
        this.A00.A0A(vdD.A02, userSession, vdD.A0G, vdD.A0E, false, false, false);
    }
}
