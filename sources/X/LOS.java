package X;

import android.content.Context;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class LOS {
    public final LRm A00;
    public final C62320sa A01;

    public final void A01(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, List list) {
        UserSession userSession2 = userSession;
        List<AudienceListViewModel> list2 = list;
        AnonymousClass7TF.A1C(userSession2, 1, list2);
        IngestSessionShim ingestSessionShim2 = ingestSessionShim;
        AnonymousClass3Q2 A03 = 28K.A00(userSession2).A03(AnonymousClass7TE.A19(ingestSessionShim2.A00, 0));
        Context context2 = context;
        if (list2.size() == 1 && (!(list2 instanceof Collection) || !list2.isEmpty())) {
            for (AudienceListViewModel audienceListViewModel : list2) {
                if (audienceListViewModel.A05) {
                    A00(context2, userSession2, ingestSessionShim2, C61002Juy.A05, UserStoryTarget.A02, (Integer) null, (String) null, (String) null, (Map) null, false);
                    if (A03 != null) {
                        A03.A0U(AnonymousClass3QO.CLOSE_FRIENDS);
                        return;
                    }
                    return;
                }
            }
        }
        if (A03 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list2);
            for (AudienceListViewModel audienceListViewModel2 : list2) {
                A0r.add(audienceListViewModel2.A01);
            }
            A03.A49 = A0r;
            A03.A0U(AnonymousClass3QO.CUSTOM);
        }
        A00(context2, userSession2, ingestSessionShim2, C61002Juy.A0C, UserStoryTarget.A09, (Integer) null, (String) null, (String) null, (Map) null, false);
    }

    public final void A00(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, C61002Juy juy, UserStoryTarget userStoryTarget, Integer num, String str, String str2, Map map, boolean z) {
        String str3;
        Integer num2;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(context2, userSession2);
        C61002Juy juy2 = juy;
        UserStoryTarget userStoryTarget2 = userStoryTarget;
        C51972G9s.A1E(juy2, userStoryTarget2);
        String str4 = str;
        String str5 = str2;
        boolean z2 = z;
        if (z) {
            C63394KwF.A00(userSession2, "primary_click", "share_sheet", str5, str4, map);
            if (C363018iu.A00(userSession2)) {
                num2 = AnonymousClass05K.A00;
            } else {
                num2 = AnonymousClass05K.A0j;
            }
            str3 = C63422Kwi.A00(num2);
        } else {
            str3 = null;
        }
        C64007LIn.A01(AnonymousClass818.IG_STORY_SHARE_SHEET, userSession2, num, str4, str5, z2);
        C65294Lqn lqn = new C65294Lqn(context2, userSession2, ingestSessionShim, userStoryTarget2, (String) null, str3, z2);
        LRm lRm = this.A00;
        MA7 ma7 = new MA7(lRm.A00, lRm.A01, lqn, AnonymousClass05K.A01);
        ma7.A00 = 0;
        LRm.A00(lRm, ma7, juy2);
    }

    public LOS(C62320sa r3) {
        this.A01 = r3;
        this.A00 = new LRm(new C65288Lqh(this, 0));
    }

    public LOS() {
        this((C62320sa) null);
    }
}
