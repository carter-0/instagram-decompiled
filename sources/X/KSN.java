package X;

import com.instagram.common.session.UserSession;

public final class KSN extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public KSN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void DsH(AnonymousClass5Gv r7) {
        0xY r3;
        UserSession userSession;
        W3U w3u;
        String str;
        int i;
        0xa r0;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r7, 0);
                C62636KjH kjH = (C62636KjH) this.A01;
                if (kjH != null && kjH.ordinal() == 0) {
                    1Av A002 = 1Au.A00(((C60422JlF) this.A02).A04);
                    AnonymousClass7TF.A1J(A002, A002.A53, 1Av.A8a, 419, true);
                    return;
                }
                return;
            case 1:
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                ((C61818KNh) this.A02).A03.invoke(this.A01);
                return;
            default:
                KB3 kb3 = (KB3) this.A02;
                switch (AnonymousClass7TE.A0M(this.A01)) {
                    case 0:
                        UserSession userSession2 = kb3.A02;
                        0qQ.A0B(userSession2, 0);
                        W3U w3u2 = W3U.A00;
                        0xa A022 = W3U.A02(userSession2, w3u2);
                        String A003 = AnonymousClass000.A00(1871);
                        int i3 = A022.getInt(A003, 0);
                        0xY AR4 = W3U.A02(userSession2, w3u2).AR4();
                        AR4.E5Z(A003, i3 + 1);
                        AR4.apply();
                        r3 = W3U.A02(userSession2, w3u2).AR4();
                        r3.E5c(AnonymousClass000.A00(4081), JTR.A0L());
                        break;
                    case 1:
                        userSession = kb3.A02;
                        i = 0;
                        0qQ.A0B(userSession, 0);
                        w3u = W3U.A00;
                        r0 = W3U.A02(userSession, w3u);
                        str = "tag_products_affiliate_post_tooltip_seen_count";
                        break;
                    case 2:
                        userSession = kb3.A02;
                        i = 0;
                        0qQ.A0B(userSession, 0);
                        w3u = W3U.A00;
                        r0 = W3U.A02(userSession, w3u);
                        str = "tag_products_collections_promotions_tooltip_seen_count";
                        break;
                    case 3:
                        userSession = kb3.A02;
                        i = 0;
                        0qQ.A0B(userSession, 0);
                        w3u = W3U.A00;
                        r0 = W3U.A02(userSession, w3u);
                        str = "stories_font_selection_tooltip_seen_count";
                        break;
                    case 4:
                        userSession = kb3.A02;
                        i = 0;
                        0qQ.A0B(userSession, 0);
                        w3u = W3U.A00;
                        r0 = W3U.A02(userSession, w3u);
                        str = "tag_products_affiliate_story_tooltip_seen_count";
                        break;
                    case 5:
                    case 6:
                        userSession = kb3.A02;
                        i = 0;
                        0qQ.A0B(userSession, 0);
                        w3u = W3U.A00;
                        r0 = W3U.A02(userSession, w3u);
                        str = "tag_products_products_tab_tooltip_seen_count";
                        break;
                    default:
                        return;
                }
                int i4 = r0.getInt(str, i);
                r3 = W3U.A02(userSession, w3u).AR4();
                r3.E5Z(str, i4 + 1);
                r3.apply();
                return;
        }
    }
}
