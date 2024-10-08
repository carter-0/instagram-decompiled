package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.session.UserSession;

public abstract class HWP {
    public static final void A00(C54676HOh hOh, WearablesAppAttributionType wearablesAppAttributionType, UserSession userSession, String str, String str2) {
        HOM hom;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_wearables_pivot_page");
        A0e.A8M(hOh, "pivot_page_event_name");
        if (wearablesAppAttributionType != null) {
            int ordinal = wearablesAppAttributionType.ordinal();
            if (ordinal == 2) {
                hom = HOM.RAY_BAN_META;
            } else if (ordinal == 7) {
                hom = HOM.RAY_BAN_STORIES;
            }
            C51974G9v.A0k(hom, A0e, str, str2, (String) null);
        }
        hom = null;
        C51974G9v.A0k(hom, A0e, str, str2, (String) null);
    }
}
