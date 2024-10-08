package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5fj  reason: invalid class name and case insensitive filesystem */
public abstract class C290685fj {
    public static final Map A00;
    public static final Map A01;

    public static final boolean A00(String str) {
        0qQ.A0B(str, 0);
        if (str.equals("direct_user_search_nullstate") || str.equals("direct_ibc_nullstate") || str.equals("direct_user_search_keypressed")) {
            return true;
        }
        return false;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A00 = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        A01 = linkedHashMap2;
        linkedHashMap.put("reshare_share_sheet", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("story_share_sheet", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap.put("direct_inbox_active_now", "direct_target");
        linkedHashMap.put("forwarding_recipient_sheet", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("call_recipients", "direct_target");
        linkedHashMap.put("direct_ibc_inbox_discovery", "direct_target");
        linkedHashMap.put("direct_ibc_inbox_invitations", "direct_target");
        linkedHashMap.put("direct_ibc_inbox_discovery_nullstate", "direct_target");
        linkedHashMap2.put("reshare_share_sheet", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap2.put("direct_inbox_active_now", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("call_recipients", "direct_target");
        linkedHashMap2.put("direct_ibc_inbox_discovery", "direct_target");
        linkedHashMap2.put("direct_ibc_inbox_invitations", "direct_target");
        linkedHashMap2.put("direct_ibc_inbox_discovery_nullstate", "direct_target");
    }

    public static final boolean A01(String str) {
        if (str.equals("reshare_share_sheet") || str.equals("story_share_sheet") || str.equals("forwarding_recipient_sheet")) {
            return true;
        }
        return false;
    }
}
