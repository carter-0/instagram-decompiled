package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6bR  reason: invalid class name and case insensitive filesystem */
public final class C310676bR {
    public final Map A00 = new HashMap();
    public final String A01;

    public final void A00(C250603lj r4, C255773uh r5, C309426Yf r6) {
        String str;
        Map map = this.A00;
        if (!map.containsKey(r6)) {
            StringBuilder sb = new StringBuilder();
            sb.append("could not clean state at: ");
            sb.append(r6.A0I);
            sb.append(" last action: ");
            switch (r6.A0W.intValue()) {
                case 0:
                    str = "TAP_FORWARD";
                    break;
                case 1:
                    str = "TAP_BACK";
                    break;
                case 2:
                    str = "SWIPE_FORWARD";
                    break;
                case 3:
                    str = "SWIPE_BACK";
                    break;
                case 4:
                    str = "AUTOMATIC_FORWARD";
                    break;
                case 5:
                    str = "SWIPE_DOWN";
                    break;
                case 6:
                    str = "SWIPE_UP";
                    break;
                case 7:
                    str = "TAP_EXIT";
                    break;
                case 8:
                    str = "TAP_DASHBOARD";
                    break;
                case 9:
                    str = "HIDE_AD";
                    break;
                case 10:
                    str = "HIDE";
                    break;
                case 11:
                    str = "DELETE_LAST_ITEM";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "DELETE_LAST_PENDING_ITEM";
                    break;
                case 13:
                    str = "TYPE_SELECTOR_TAP";
                    break;
                case 14:
                    str = "REEL_VIEWER_TRAY_TAP";
                    break;
                case 15:
                    str = "MID_CARD_CREATE_STORY_TAP";
                    break;
                case 16:
                    str = "MID_CARD_PROFILE_PICTURE_TAP";
                    break;
                default:
                    str = "TAP_CREATOR_INSIGHTS_TIP";
                    break;
            }
            sb.append(str);
            sb.append(" for action: ");
            sb.append(r4);
            sb.append(" is netego: ");
            sb.append(r5.A1P());
            sb.append(" is ad: ");
            sb.append(r5.CcK());
            sb.append(" id: ");
            sb.append(r5.A0j);
            sb.append(" session id: ");
            sb.append(this.A01);
            0wb.A03("reel_item_state_cleaner_mismatch", sb.toString());
            r6.A01();
            return;
        }
        Set set = (Set) map.get(r6);
        if (set.remove(r4) && set.isEmpty()) {
            r6.A01();
            map.remove(r6);
        }
    }

    public C310676bR(String str) {
        this.A01 = str;
    }
}
