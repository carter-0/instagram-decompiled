package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.W4m  reason: case insensitive filesystem */
public final class C18825W4m implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17744VdD A01;

    public C18825W4m(1Yh r1, C17744VdD vdD) {
        this.A01 = vdD;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17744VdD vdD = this.A01;
        UserSession userSession = vdD.A08;
        WGU.A00(userSession).A0F(C16678UzE.AUDIO_SWAP_DIALOG, "cancel_button");
        WGU A002 = WGU.A00(userSession);
        String str = vdD.A0H;
        String str2 = vdD.A0G;
        C16616UyC uyC = vdD.A09;
        1Xj r1 = vdD.A0A;
        String boostUnavailableIdentifier = r1.A0C.getBoostUnavailableIdentifier();
        if (boostUnavailableIdentifier != null) {
            A002.A0P(uyC, str, str2, boostUnavailableIdentifier, C13992Tns.A0J(vdD, r1));
            1Yh.A01(this.A00);
            return;
        }
        throw new IllegalStateException("boost_unavailable_identifier cannot be null when boosted_status == UNAVAILABLE");
    }
}
