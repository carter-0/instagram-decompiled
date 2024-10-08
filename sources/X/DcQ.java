package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.XDTIGAIAgentBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class DcQ extends C392289uY implements G76 {
    public C61081JwJ A00 = new C61081JwJ();
    public C49585Eyu A01;
    public final UserSession A02;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        C49585Eyu eyu = new C49585Eyu(context, this.A00, this.A02, this);
        this.A01 = eyu;
        return eyu.A03;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r8, boolean z) {
        User user;
        String AaR;
        String C6f;
        Integer num;
        0qQ.A0B(puH, 1);
        if (!(r8 == null || (user = (User) 00k.A0J(r8.BRZ())) == null || (AaR = user.A03.AaR()) == null || (C6f = r8.C6f()) == null)) {
            XDTIGAIAgentBannerType AaK = user.A03.AaK();
            if (AaK == null) {
                AaK = XDTIGAIAgentBannerType.UNRECOGNIZED;
            }
            int ordinal = AaK.ordinal();
            if (ordinal == 1) {
                num = AnonymousClass05K.A01;
            } else if (ordinal == 2) {
                num = AnonymousClass05K.A0C;
            } else if (ordinal == 3) {
                num = AnonymousClass05K.A0N;
            } else if (ordinal == 4) {
                num = AnonymousClass05K.A0Y;
            } else if (ordinal != 5) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0j;
            }
            this.A00 = new C61081JwJ(C6f, 38, num);
            if (r8.C6a() == 1014 && AaR.equals(this.A02.A06) && this.A00.A00 != AnonymousClass05K.A00) {
                puH.DoM(this);
                return;
            }
        }
        puH.onFailure();
    }

    public final /* synthetic */ void onBannerDismissed() {
    }

    public final void onActionClicked() {
        C49585Eyu eyu = this.A01;
        if (eyu != null) {
            eyu.A03.setVisibility(8);
        }
    }

    public DcQ(UserSession userSession) {
        this.A02 = userSession;
    }
}
