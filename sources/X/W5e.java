package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class W5e implements DialogInterface.OnShowListener {
    public final /* synthetic */ C17744VdD A00;

    public W5e(C17744VdD vdD) {
        this.A00 = vdD;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C17744VdD vdD = this.A00;
        UserSession userSession = vdD.A08;
        C13988Tno.A1J(WGU.A00(userSession), C16678UzE.AUDIO_SWAP_DIALOG);
        WGU A002 = WGU.A00(userSession);
        C16678UzE uzE = C16678UzE.BOOST_UNAVAILABLE_DIALOG;
        String str = vdD.A0G;
        A002.A02 = vdD.A0H;
        A002.A01 = str;
        A002.A0H(uzE, "boost_unavailable_dialog");
    }
}
