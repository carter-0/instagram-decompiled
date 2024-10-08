package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.W4o  reason: case insensitive filesystem */
public final class C18827W4o implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17744VdD A01;

    public C18827W4o(1Yh r1, C17744VdD vdD) {
        this.A01 = vdD;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17744VdD vdD = this.A01;
        UserSession userSession = vdD.A08;
        WGU.A00(userSession).A0F(C16678UzE.AUDIO_SELECTION_DIALOG, "boost_another_post_button");
        this.A00.A0A(vdD.A02, userSession, vdD.A0G, vdD.A0E, false, false, false);
    }
}
