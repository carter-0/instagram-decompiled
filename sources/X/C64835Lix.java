package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lix  reason: case insensitive filesystem */
public final class C64835Lix implements AnonymousClass0lh {
    public final UserSession A00;
    public final LOp A01;
    public final C17384VTl A02;
    public final Map A03 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C13999To1(this, 29));
    public final 05G A06 = DbS.A10(new C61071Jw9());
    public final boolean A07;
    public final 1wn A08;
    public final Map A09 = AnonymousClass7TE.A1H();
    public final Map A0A = AnonymousClass7TE.A1H();

    public static final Object A01(UKY uky, C64835Lix lix, AnonymousClass4D7 r8, C62320sa r9) {
        return JTP.A0l(19E.A00(r8, new MHL(uky, lix, r9, (AnonymousClass4D7) null, 30)));
    }

    public final void A0H(C16679UzF uzF, Product product) {
        String str = null;
        C16679UzF uzF2 = uzF;
        Product product2 = product;
        if (AnonymousClass7TF.A1Z(this.A04)) {
            if (this.A05.CVQ()) {
                AnonymousClass7TE.A1Z(new C59845JaL(uzF, product, this, (AnonymousClass4D7) null, 19), DbY.A0r(AnonymousClass12T.A00, 301752202));
            }
            Map map = this.A03;
            User user = product.A0B;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            }
            Object obj = map.get(str);
            if (obj != null) {
                AnonymousClass7TE.A1Z(new MHL(uzF2, product2, obj, this, (AnonymousClass4D7) null, 31), DbY.A0r(AnonymousClass12T.A00, 301752202));
                return;
            }
            return;
        }
        User user2 = product.A0B;
        if (user2 != null) {
            str = AnonymousClass3ZA.A00(user2);
        }
        for (05G A062 : A02(this, str)) {
            A06(new ProductFeedItem(product), uzF, A062);
        }
    }

    public static final C61074JwC A00(C64835Lix lix) {
        C61069Jw7 jw7;
        if (182.A06(0Tu.A05, lix.A00, 36311835363771167L)) {
            jw7 = new C61069Jw7((C62865Knf) null, (Integer) null, 7);
        } else {
            jw7 = null;
        }
        return new C61074JwC(jw7);
    }

    public static final List A02(C64835Lix lix, String str) {
        Object obj;
        AnonymousClass0eM r1 = lix.A05;
        if (r1.CVQ()) {
            obj = r1.getValue();
        } else {
            obj = null;
        }
        05G[] r12 = {(05G) obj, (05G) lix.A03.get(str)};
        0qQ.A0B(r12, 0);
        return 03t.A0I(r12);
    }

    public static final Map A03(C64835Lix lix, String str) {
        if (str == null) {
            return lix.A09;
        }
        Map map = lix.A0A;
        Object obj = map.get(str);
        if (obj == null) {
            obj = AnonymousClass7TE.A1H();
            map.put(str, obj);
        }
        return (Map) obj;
    }

    public final 1Er A0D(UKY uky, C262224Cq r8) {
        Map A032 = A03(this, uky.A02);
        C16679UzF uzF = uky.A00;
        C262204Co r3 = (C262204Co) A032.get(uzF);
        boolean z = true;
        if (r3 == null || !r3.isActive()) {
            z = false;
        }
        if (z) {
            AnonymousClass7TE.A1Z(new MG5(r3, (AnonymousClass4D7) null, 12), r8);
        }
        1Er A1L = C51966G9m.A1L(new C66168MGf((Object) uky, (Object) this, (AnonymousClass4D7) null, 45), r8);
        A032.put(uzF, A1L);
        return A1L;
    }

    public final 05G A0E(String str) {
        if (str != null) {
            Map map = this.A03;
            Object obj = map.get(str);
            if (obj == null) {
                obj = 106.A01(A00(this));
                map.put(str, obj);
            }
            05G r0 = (05G) obj;
            if (r0 != null) {
                return r0;
            }
        }
        return (05G) this.A05.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    public final void A0F(1Xj r5, C16679UzF uzF) {
        for (05G A062 : A02(this, C51973G9u.A0j(this.A00, r5))) {
            ? obj = new Object();
            obj.A06 = AnonymousClass05K.A0C;
            obj.A00 = r5;
            obj.A06 = AnonymousClass05K.A0N;
            A06(obj, uzF, A062);
        }
        05G r2 = this.A06;
        ? obj2 = new Object();
        obj2.A06 = AnonymousClass05K.A0C;
        obj2.A00 = r5;
        obj2.A06 = AnonymousClass05K.A0N;
        A07(obj2, uzF, r2);
    }

    public final void A0G(1Xj r5, C16679UzF uzF) {
        String str;
        Iterator it = A02(this, C51973G9u.A0j(this.A00, r5)).iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            05G r1 = (05G) it.next();
            String id = r5.getId();
            if (id != null) {
                str = id;
            }
            A09(uzF, str, r1);
        }
        05G r12 = this.A06;
        String id2 = r5.getId();
        if (id2 != null) {
            str = id2;
        }
        A0A(uzF, str, r12);
    }

    public final void A0I(C16679UzF uzF, Product product) {
        String str;
        User user = product.A0B;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        for (05G A092 : A02(this, str)) {
            A09(uzF, product.A0H, A092);
        }
        A0A(uzF, product.A0H, this.A06);
    }

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A00).A02(this.A08, C323966yO.class);
    }

    public C64835Lix(UserSession userSession, LOp lOp, C17384VTl vTl, boolean z) {
        C51972G9s.A1B(userSession, lOp);
        this.A00 = userSession;
        this.A02 = vTl;
        this.A07 = z;
        this.A01 = lOp;
        C64690LgL lgL = new C64690LgL(3, userSession, this);
        this.A08 = lgL;
        this.A04 = AnonymousClass0eN.A01(new C13999To1(this, 28));
        AnonymousClass1Nd.A00(userSession).A01(lgL, C323966yO.class);
    }

    public static final AnonymousClass0r6 A04(C16679UzF uzF, C64835Lix lix, Integer num, List list) {
        Integer num2;
        int ordinal = uzF.ordinal();
        if (ordinal == 0) {
            num2 = AnonymousClass05K.A00;
        } else if (ordinal == 1) {
            num2 = AnonymousClass05K.A01;
        } else if (ordinal != 2) {
            return null;
        } else {
            num2 = AnonymousClass05K.A0C;
        }
        return C17070VGs.A00(lix.A00, num2, num, list).A03(301752202);
    }

    public static final void A05(C61069Jw7 jw7, C16679UzF uzF, 05G r6) {
        C61074JwC jwC;
        C61074JwC A0P = JTO.A0P(r6);
        int A022 = DbU.A02(uzF, 0);
        if (A022 == 0) {
            C61069Jw7 jw72 = (C61069Jw7) A0P.A03;
            C61069Jw7 jw73 = (C61069Jw7) A0P.A02;
            C61069Jw7 jw74 = (C61069Jw7) A0P.A01;
            AnonymousClass7TG.A1U(jw72, jw73, jw74);
            jwC = new C61074JwC(jw7, jw72, jw73, jw74);
        } else if (A022 == 1) {
            C61069Jw7 jw75 = (C61069Jw7) A0P.A02;
            C61069Jw7 jw76 = (C61069Jw7) A0P.A01;
            AnonymousClass7TG.A1U(jw7, jw75, jw76);
            jwC = new C61074JwC((C61069Jw7) A0P.A00, jw7, jw75, jw76);
        } else if (A022 == 2) {
            C61069Jw7 jw77 = (C61069Jw7) A0P.A03;
            C61069Jw7 jw78 = (C61069Jw7) A0P.A01;
            AnonymousClass7TG.A1U(jw77, jw7, jw78);
            jwC = new C61074JwC((C61069Jw7) A0P.A00, jw77, jw7, jw78);
        } else if (A022 == 3) {
            C61069Jw7 jw79 = (C61069Jw7) A0P.A03;
            C61069Jw7 jw710 = (C61069Jw7) A0P.A02;
            AnonymousClass7TG.A1U(jw79, jw710, jw7);
            jwC = new C61074JwC((C61069Jw7) A0P.A00, jw79, jw710, jw7);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r6.Epw(jwC);
    }

    public static final void A06(ProductFeedItem productFeedItem, C16679UzF uzF, 05G r9) {
        C61069Jw7 A042 = JTO.A0P(r9).A04(uzF);
        if (A042 != null) {
            List A1I = AnonymousClass7TE.A1I(productFeedItem);
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : (List) A042.A02) {
                DbY.A1T(((ProductFeedItem) next).getId(), productFeedItem.getId(), next, A1C);
            }
            ArrayList A0S = 00k.A0S(A1C, A1I);
            Integer num = (Integer) A042.A00;
            C62865Knf knf = (C62865Knf) A042.A01;
            AnonymousClass7TG.A1T(A0S, num, knf);
            A05(new C61069Jw7(knf, num, (List) A0S), uzF, r9);
        }
    }

    public static final void A07(ProductFeedItem productFeedItem, C16679UzF uzF, 05G r8) {
        List A1I = AnonymousClass7TE.A1I(productFeedItem);
        List A012 = ((C61071Jw9) r8.getValue()).A01(uzF);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A012) {
            DbY.A1T(((ProductFeedItem) next).getId(), productFeedItem.getId(), next, A1C);
        }
        A0C(uzF, 00k.A0S(A1C, A1I), r8);
    }

    public static final void A08(C16679UzF uzF, String str, List list, 05G r8) {
        String str2;
        User user;
        C61069Jw7 A042 = JTO.A0P(r8).A04(uzF);
        if (A042 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                Product A022 = ((ProductFeedItem) next).A02();
                if (A022 == null || (user = A022.A0B) == null) {
                    str2 = null;
                } else {
                    str2 = AnonymousClass3ZA.A00(user);
                }
                DbY.A1T(str2, str, next, A1C);
            }
            ArrayList A0S = 00k.A0S(A1C, list);
            Integer num = (Integer) A042.A00;
            C62865Knf knf = (C62865Knf) A042.A01;
            AnonymousClass7TG.A1T(A0S, num, knf);
            A05(new C61069Jw7(knf, num, (List) A0S), uzF, r8);
        }
    }

    private final void A09(C16679UzF uzF, String str, 05G r8) {
        C61069Jw7 A042 = JTO.A0P(r8).A04(uzF);
        if (A042 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : (List) A042.A02) {
                DbY.A1T(((ProductFeedItem) next).getId(), str, next, A1C);
            }
            Integer num = (Integer) A042.A00;
            C62865Knf knf = (C62865Knf) A042.A01;
            AnonymousClass7TG.A1T(A1C, num, knf);
            A05(new C61069Jw7(knf, num, (List) A1C), uzF, r8);
        }
    }

    private final void A0A(C16679UzF uzF, String str, 05G r7) {
        List A012 = ((C61071Jw9) r7.getValue()).A01(uzF);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A012) {
            DbY.A1T(((ProductFeedItem) next).getId(), str, next, A1C);
        }
        A0C(uzF, A1C, r7);
    }

    public static final void A0B(C16679UzF uzF, List list, 05G r9) {
        List A012 = ((C61071Jw9) r9.getValue()).A01(uzF);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A012) {
            ProductFeedItem productFeedItem = (ProductFeedItem) next;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0r.add(((ProductFeedItem) it.next()).getId());
            }
            DbV.A1U(next, A1C, A0r.contains(productFeedItem.getId()) ? 1 : 0);
        }
        A0C(uzF, 00k.A0S(A1C, list), r9);
    }

    public static final void A0C(C16679UzF uzF, List list, 05G r7) {
        C61071Jw9 jw9;
        C61071Jw9 jw92 = (C61071Jw9) r7.getValue();
        int A022 = DbU.A02(uzF, 0);
        if (A022 == 0) {
            List list2 = (List) jw92.A04;
            List list3 = (List) jw92.A01;
            C51973G9u.A1E(list, list2, list3);
            jw9 = new C61071Jw9(list, list2, list3);
        } else if (A022 == 1) {
            List list4 = (List) jw92.A00;
            List list5 = (List) jw92.A01;
            0qQ.A0B(list4, 0);
            AnonymousClass7TF.A1B(list, 1, list5);
            jw9 = new C61071Jw9(list4, list, list5);
        } else if (A022 == 3 || A022 == 2) {
            List list6 = (List) jw92.A00;
            List list7 = (List) jw92.A04;
            0qQ.A0B(list6, 0);
            AnonymousClass7TF.A1B(list7, 1, list);
            jw9 = new C61071Jw9(list6, list7, list);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r7.Epw(jw9);
    }
}
