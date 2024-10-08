package X;

import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.Hcl  reason: case insensitive filesystem */
public abstract class C55137Hcl {
    public static final SearchContext A00(HashMap hashMap) {
        return new SearchContext((String) hashMap.get("search_session_id"), (String) hashMap.get("rank_token"), (String) hashMap.get("query_text"), (String) hashMap.get(AnonymousClass000.A00(2803)), (String) hashMap.get("serp_session_id"), (String) hashMap.get("click_id"), (String) hashMap.get("reels_page_index"), (String) null);
    }
}
