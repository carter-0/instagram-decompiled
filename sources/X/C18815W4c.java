package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.W4c  reason: case insensitive filesystem */
public final class C18815W4c implements DialogInterface.OnClickListener {
    public final /* synthetic */ C17744VdD A00;

    public C18815W4c(C17744VdD vdD) {
        this.A00 = vdD;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17744VdD vdD = this.A00;
        UserSession userSession = vdD.A08;
        WGU A002 = WGU.A00(userSession);
        String str = vdD.A0H;
        String str2 = vdD.A0G;
        C16616UyC uyC = vdD.A09;
        1Xj r1 = vdD.A0A;
        String boostUnavailableIdentifier = r1.A0C.getBoostUnavailableIdentifier();
        if (boostUnavailableIdentifier != null) {
            A002.A0P(uyC, str, str2, boostUnavailableIdentifier, C13992Tns.A0J(vdD, r1));
            WGU.A00(userSession).A0F(C16678UzE.AUDIO_SWAP_BOOST_AGAIN_DIALOG, "go_to_ad_tools_button");
            C48732EjH.A00().A02(vdD.A02, userSession, str2, vdD.A0E, false);
            return;
        }
        throw new IllegalStateException("boost_unavailable_identifier cannot be null when boosted_status == UNAVAILABLE");
    }
}
