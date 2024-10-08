package X;

import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.6zg  reason: invalid class name and case insensitive filesystem */
public final class C324656zg implements 0lm {
    public SearchContext A00;

    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = null;
    }

    public final void A00(0jB r4) {
        SearchContext searchContext = this.A00;
        if (searchContext != null) {
            r4.A00.put("search_context", searchContext.A00());
        }
    }
}
