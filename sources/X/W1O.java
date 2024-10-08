package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class W1O {
    public static final C64136LPl A0B = new Object();
    public final String A00;
    public final Map A01;
    public final C62320sa A02;
    public final 0sP A03;
    public final boolean A04;
    public final ProductCardSubtitleType A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C15335Uak A08;
    public final 05G A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != true) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C19279WSm A02(X.C61074JwC r8, X.C16679UzF r9) {
        /*
            r7 = this;
            r3 = 0
            r5 = 1
            java.lang.Object r0 = r8.A00
            X.Jw7 r0 = (X.C61069Jw7) r0
            if (r0 == 0) goto L_0x000f
            boolean r1 = X.C64136LPl.A01(r0)
            r0 = 1
            if (r1 == r5) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.String r2 = "_title_row"
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r8.A03
            X.Jw7 r0 = (X.C61069Jw7) r0
            boolean r0 = X.C64136LPl.A01(r0)
            if (r0 == 0) goto L_0x0057
            X.UzF r0 = X.C16679UzF.RECENTLY_VIEWED
            if (r9 == r0) goto L_0x0057
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x0057
            X.UzF r1 = X.C16679UzF.CART
            X.UzF r0 = X.C16679UzF.WISH_LIST
            java.lang.String r0 = r0.A00(r2)
            java.lang.String r5 = r1.A00(r0)
            r6 = 0
            r2 = 2131973813(0x7f1356b5, float:1.9584672E38)
        L_0x0036:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.HsR r0 = new X.HsR
            r0.<init>(r1, r2)
            X.WSm r3 = new X.WSm
            r3.<init>(r0, r6, r5)
        L_0x0042:
            X.05G r2 = r7.A09
            java.lang.Object r1 = r2.getValue()
            java.util.Map r1 = (java.util.Map) r1
            X.0eP r0 = new X.0eP
            r0.<init>(r5, r3)
            java.util.Map r0 = X.0Yt.A0C(r1, r0)
            r2.Epw(r0)
            return r3
        L_0x0057:
            int r1 = r9.ordinal()
            if (r1 == r3) goto L_0x00b2
            r4 = 0
            if (r1 == r5) goto L_0x006e
            r0 = 2
            if (r1 == r0) goto L_0x008e
            X.UzF r0 = X.C16679UzF.LIKED
            java.lang.String r5 = r0.A00(r2)
            r6 = 0
            r2 = 2131973821(0x7f1356bd, float:1.9584689E38)
            goto L_0x0036
        L_0x006e:
            X.UzF r0 = X.C16679UzF.WISH_LIST
            java.lang.String r5 = r0.A00(r2)
            boolean r0 = r7.A04
            r6 = 0
            r2 = 2131972593(0x7f1351f1, float:1.9582198E38)
            if (r0 != 0) goto L_0x0036
            r1 = 2131973825(0x7f1356c1, float:1.9584697E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.HsR r2 = new X.HsR
            r2.<init>(r0, r1)
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x00ac
            r1 = 2131973826(0x7f1356c2, float:1.9584699E38)
            goto L_0x00a5
        L_0x008e:
            X.UzF r0 = X.C16679UzF.RECENTLY_VIEWED
            java.lang.String r5 = r0.A00(r2)
            r1 = 2131973823(0x7f1356bf, float:1.9584693E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.HsR r2 = new X.HsR
            r2.<init>(r0, r1)
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x00ac
            r1 = 2131973822(0x7f1356be, float:1.958469E38)
        L_0x00a5:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.HsR r4 = new X.HsR
            r4.<init>(r0, r1)
        L_0x00ac:
            X.WSm r3 = new X.WSm
            r3.<init>(r2, r4, r5)
            goto L_0x0042
        L_0x00b2:
            X.UzF r0 = X.C16679UzF.CART
            java.lang.String r5 = r0.A00(r2)
            r6 = 0
            r2 = 2131973759(0x7f13567f, float:1.9584563E38)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1O.A02(X.JwC, X.UzF):X.WSm");
    }

    public static final List A00(C61069Jw7 jw7, W1O w1o, C16679UzF uzF, Set set) {
        C16675UzB uzB;
        W1O w1o2;
        C61069Jw7 jw72 = jw7;
        List list = (List) jw72.A02;
        2HY A0C = C229632nm.A0C(0, JTP.A01((double) list.size(), 2.0d));
        ArrayList arrayList = new ArrayList();
        0sh it = A0C.iterator();
        while (it.hasNext()) {
            int A002 = it.A00();
            C3251571g r4 = new C3251571g(list, A002 * 2, 2);
            if (r4.A01() == 2 || (jw72.A01 instanceof C62084KZo)) {
                C16679UzF uzF2 = uzF;
                int ordinal = uzF2.ordinal();
                if (ordinal == 0) {
                    uzB = C16675UzB.CART;
                } else if (ordinal != 1) {
                    uzB = C16675UzB.RECENTLY_VIEWED;
                } else {
                    uzB = C16675UzB.SAVED;
                }
                String name = uzF2.name();
                Locale locale = Locale.ENGLISH;
                0qQ.A08(locale);
                ULC ulc = new ULC((C376699Iz) null, (FiltersLoggingInfo) null, DbT.A12(locale, name), (String) null, (String) null);
                int A012 = JTP.A01((double) list.size(), 2.0d);
                AnonymousClass6u8 r12 = new AnonymousClass6u8();
                boolean z = true;
                if (A002 != A012 - 1) {
                    z = false;
                }
                r12.A00(A002, z);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = r4.iterator();
                while (true) {
                    w1o2 = w1o;
                    if (!it2.hasNext()) {
                        break;
                    }
                    ProductFeedItem productFeedItem = (ProductFeedItem) it2.next();
                    String id = productFeedItem.getId();
                    0qQ.A07(id);
                    Map map = w1o2.A01;
                    String id2 = productFeedItem.getId();
                    0qQ.A07(id2);
                    String A0R = 002.A0R(uzF2.A01, id2);
                    Object obj = map.get(A0R);
                    if (obj == null) {
                        obj = new Object();
                        map.put(A0R, obj);
                    }
                    linkedHashMap.put(id, obj);
                }
                ProductCardSubtitleType productCardSubtitleType = w1o2.A05;
                arrayList.add(new C19278WSl(productCardSubtitleType, uzB, new Vz5(r12, linkedHashMap), ulc, r4, (String) null, (String) null, set, A002, 130560));
            }
        }
        return arrayList;
    }

    public static final List A01(C61069Jw7 jw7, W1O w1o, C16679UzF uzF, Set set) {
        C16675UzB uzB;
        List list = (List) jw7.A02;
        UserSession userSession = w1o.A07;
        AnonymousClass0iw r2 = w1o.A06;
        C15335Uak uak = w1o.A08;
        String name = uzF.name();
        Locale locale = Locale.ENGLISH;
        0qQ.A08(locale);
        String A12 = DbT.A12(locale, name);
        Integer num = AnonymousClass05K.A1F;
        int ordinal = uzF.ordinal();
        if (ordinal == 1) {
            uzB = C16675UzB.SAVED;
        } else if (ordinal != 2) {
            uzB = C16675UzB.LIKED;
        } else {
            uzB = C16675UzB.RECENTLY_VIEWED;
        }
        return VH0.A00(r2, userSession, uzB, uak, uak, num, A12, (String) null, list, set);
    }

    public W1O(AnonymousClass0iw r2, UserSession userSession, C15335Uak uak, String str, C62320sa r6, 0sP r7, boolean z, boolean z2) {
        ProductCardSubtitleType productCardSubtitleType;
        this.A00 = str;
        this.A0A = z;
        this.A07 = userSession;
        this.A06 = r2;
        this.A08 = uak;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = z2;
        if (str == null) {
            productCardSubtitleType = ProductCardSubtitleType.MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING;
        } else {
            productCardSubtitleType = ProductCardSubtitleType.PRICE_WITH_SOLD_OUT;
        }
        this.A05 = productCardSubtitleType;
        this.A01 = new LinkedHashMap();
        this.A09 = 106.A01(0Yt.A0E());
    }
}
