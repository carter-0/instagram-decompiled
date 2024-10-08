package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class KB3 extends C252233om implements C252243on {
    public AnonymousClass5Gv A00;
    public String A01;
    public final UserSession A02;

    public final void A00(Activity activity, View view, View view2, Integer num) {
        AnonymousClass7TG.A1T(view, view2, num);
        Activity activity2 = activity;
        view.post(new C66066M9z(activity2, view, view2, this, num));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0078, code lost:
        r0 = r1.getInt(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007c, code lost:
        if (r0 >= r3) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(java.lang.Integer r10) {
        /*
            r9 = this;
            r2 = 0
            int r0 = X.C51967G9n.A03(r10, r2)
            r3 = 3
            r8 = 0
            com.instagram.common.session.UserSession r7 = r9.A02
            switch(r0) {
                case 0: goto L_0x0033;
                case 1: goto L_0x0049;
                case 2: goto L_0x0055;
                case 3: goto L_0x0061;
                case 4: goto L_0x006d;
                default: goto L_0x000c;
            }
        L_0x000c:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36595831486286090(0x8203b70000090a, double:3.2066894192882596E-306)
            long r5 = X.182.A01(r3, r7, r0)
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            X.0qQ.A0B(r7, r2)
            X.W3U r0 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r7, r0)
            java.lang.String r0 = "tag_products_products_tab_tooltip_seen_count"
            int r0 = r1.getInt(r0, r2)
            long r1 = (long) r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
        L_0x0031:
            r8 = 1
        L_0x0032:
            return r8
        L_0x0033:
            X.0qQ.A0B(r7, r2)
            X.W3U r0 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r7, r0)
            r0 = 1871(0x74f, float:2.622E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r1.getInt(r0, r2)
            r3 = 10
            goto L_0x007c
        L_0x0049:
            X.0qQ.A0B(r7, r2)
            X.W3U r0 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r7, r0)
            java.lang.String r0 = "tag_products_affiliate_post_tooltip_seen_count"
            goto L_0x0078
        L_0x0055:
            X.0qQ.A0B(r7, r2)
            X.W3U r0 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r7, r0)
            java.lang.String r0 = "tag_products_collections_promotions_tooltip_seen_count"
            goto L_0x0078
        L_0x0061:
            X.0qQ.A0B(r7, r2)
            X.W3U r0 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r7, r0)
            java.lang.String r0 = "stories_font_selection_tooltip_seen_count"
            goto L_0x0078
        L_0x006d:
            X.0qQ.A0B(r7, r2)
            X.W3U r0 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r7, r0)
            java.lang.String r0 = "tag_products_affiliate_story_tooltip_seen_count"
        L_0x0078:
            int r0 = r1.getInt(r0, r2)
        L_0x007c:
            if (r0 >= r3) goto L_0x0032
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KB3.A01(java.lang.Integer):boolean");
    }

    public final void onDestroyView() {
        this.A00 = null;
    }

    public final void onPause() {
        AnonymousClass5Gv r3 = this.A00;
        if (r3 != null && r3.A09()) {
            r3.A08(false);
            this.A00 = null;
        }
    }

    public KB3(UserSession userSession) {
        this.A02 = userSession;
    }
}
