package X;

import android.content.Context;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

public final class LG3 {
    public final Context A00;
    public final 0hq A01;
    public final AnonymousClass07i A02;
    public final AnonymousClass0iw A03;
    public final 1Ng A04;
    public final UserSession A05;

    public LG3(Context context, 0hq r3, AnonymousClass07i r4, AnonymousClass0iw r5, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A05 = userSession;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = AnonymousClass1Nd.A00(userSession);
    }

    public final void A00(MRV mrv, Reel reel) {
        int i;
        int i2;
        Reel reel2 = reel;
        boolean z = true;
        boolean A1W = AnonymousClass7TF.A1W(reel.A0P, ReelType.A0b);
        if (reel.A09 != HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY) {
            z = false;
        }
        C358248ab A0Y = DbS.A0Y(this.A00);
        if (A1W) {
            i = 2131957599;
        } else {
            i = 2131957561;
            if (z) {
                i = 2131957560;
            }
        }
        A0Y.A09(i);
        A0Y.A0L(new C49992FIb(0, reel2, this, mrv, A1W), 2131957531);
        A0Y.A0C(C64211LUb.A00);
        if (A1W) {
            i2 = 2131957598;
        } else {
            if (z) {
                i2 = 2131957559;
            }
            DbT.A1V(A0Y);
        }
        A0Y.A08(i2);
        DbT.A1V(A0Y);
    }

    public final void A01(MRV mrv, String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A05;
        String A06 = 0mp.A06("highlights/suggestions/%s/delete/", new Object[]{str});
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        Dba.A1H(A0a, A06);
        1OC A0U = DbT.A0U(A0a, true);
        A0U.A00 = new KAM(mrv, this, str);
        SQH.A02(this.A01);
        1ES.A00(this.A00, this.A02, A0U);
    }

    public final void A02(MRW mrw) {
        C358248ab A0Y = DbS.A0Y(this.A00);
        A0Y.A09(2131975840);
        A0Y.A08(2131975839);
        LV3.A01(A0Y, mrw, 11, 2131975838);
        A0Y.A05();
        DbT.A1V(A0Y);
    }
}
