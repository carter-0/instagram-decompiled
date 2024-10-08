package X;

import java.util.HashSet;

/* renamed from: X.Hxl  reason: case insensitive filesystem */
public abstract class C56392Hxl {
    public static final HashSet A00 = new HashSet(0sr.A1P(new String[]{"delegate", "feedPrefetcher", "parentFeedContextChain", "child", "children", "childComponent", "trackingCode", "eventsController", "itemAnimator", "onScrollListeners", "recyclerConfiguration", "threadTileViewData", "textColorStateList", "typeface", "text", "params"}));

    public static final String A00(int i, Object obj) {
        if (obj == null) {
            return "";
        }
        String A0g = 00p.A0g(00p.A0g(00p.A0g(obj.toString(), " \n", " ", false), "\n", " ", false), "\"", "", false);
        if (A0g.length() > i) {
            return 002.A0R(C51967G9n.A0q(A0g, 0, i), "...");
        }
        return A0g;
    }
}
