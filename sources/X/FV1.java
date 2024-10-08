package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;

public abstract class FV1 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IGBloksActionFanClubViewWelcomeStoryImpl";

    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        Object A03 = r10.A03(0);
        if (!(A03 instanceof String)) {
            A03 = null;
        }
        C277014uI A0S = DbX.A0S(r10, 1);
        UserSession A0Z = DbT.A0Z(r9);
        FragmentActivity A04 = C308206Td.A04(r9);
        1Ng A00 = AnonymousClass1Nd.A00(A0Z);
        C57085INz iNz = new C57085INz(0, r9, A0S);
        C308206Td.A0K(r9, new C50298FXd(2, iNz, A00));
        A00.A01(iNz, 1qJ.class);
        if (0qQ.A0K(A03, "pending")) {
            Reel reel = 1O2.A00(A0Z).A00;
            0qQ.A0A(reel);
            A01(A04, A0Z, reel);
            return null;
        }
        1NY A0b = AnonymousClass7TG.A0b(A0Z);
        A0b.A0A("media/infos/");
        A0b.A9m("media_ids", DbT.A0z(", ", AnonymousClass7TE.A1I(A03), (0sP) null));
        new C324356z9(A04, AnonymousClass07i.A00(A04), A0Z).A03(DbT.A0R((15p) null, A0b, 1XO.class, 1XW.class, false), new C54379HAu(0, A04, A0Z));
        return null;
    }

    public static final void A01(Activity activity, UserSession userSession, Reel reel) {
        C309416Ye A0i = DbS.A0i();
        A0i.A02(userSession, reel.getId(), AnonymousClass7TE.A1I(reel));
        int i = 0;
        A0i.A09(0sr.A1L(new String[]{reel.getId()}));
        A0i.A0A(0sr.A1L(new String[]{reel.getId()}));
        A0i.A02 = new AnonymousClass3BN();
        Integer num = reel.A0e;
        if (num != null) {
            i = num.intValue();
        }
        A0i.A04(Integer.valueOf(i));
        A0i.A03(AnonymousClass3BQ.FAN_CLUB_WELCOME_STORY_VIEWER);
        DbY.A1R(A0i);
        DbU.A0w(activity, A0i.A00(), userSession, TransparentModalActivity.class, "reel_viewer");
    }
}
