package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vws  reason: case insensitive filesystem */
public abstract class C18694Vws {
    public static void A00(UserSession userSession, C254523sc r6, 1Xj r7, AnonymousClass4DU r8) {
        UserSession userSession2 = userSession;
        1Xj A1e = r7.A1e(userSession);
        C254523sc r2 = r6;
        if (A1e.A5D()) {
            r6.A7J = A1e.C9L();
            r6.A5u = A1e.getId();
        }
        AnonymousClass4DU r4 = r8;
        C233822wX.A0F(userSession2, r2, A1e, r4, AnonymousClass05K.A01, r7.A15(userSession), false);
    }

    public static void A01(UserSession userSession, 1Xj r11, 1Xj r12, AnonymousClass4DU r13, Product product) {
        String str;
        C254523sc r4 = new C254523sc(r13, 002.A0R("instagram_ad_", "product_tap"));
        UserSession userSession2 = userSession;
        1Xj r6 = r11;
        r4.A0G(userSession, r11);
        0qQ.A0B(product, 1);
        String str2 = product.A0H;
        Boolean valueOf = Boolean.valueOf(product.A04());
        ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
        r4.A0H(userSession2, r6, productDetailsProductItemDict.A0C, productDetailsProductItemDict.A0F, valueOf, str2, C13989Tnp.A0q(product));
        r4.A0i = product.A05;
        r4.A4J = C273654mx.A00(52);
        r4.A5K = "shopping_product_tags";
        AnonymousClass3GX A00 = AnonymousClass3GX.A00(userSession2);
        C2813657d r2 = A00.A00;
        if (!(r2 == null || !AnonymousClass3GX.A03(A00, r2.A00) || (str = r2.A03) == null)) {
            r4.A5D = str;
        }
        String A07 = C231122qu.A07(userSession2, r12);
        if (A07 != null) {
            r4.A4N = A07;
        }
        C51972G9s.A1A(r4);
        A00(userSession2, r4, r6, r13);
    }

    public static void A02(UserSession userSession, 1Xj r5, AnonymousClass4DU r6, List list, long j) {
        Object obj;
        Product product;
        String C9L;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_ad_tags_list_end");
        if (r5.A3A() == null || r5.A3A().isEmpty()) {
            if (r5.A3A() == null || r5.A3A().isEmpty()) {
                obj = list.get(0);
            } else {
                obj = r5.A3K(true).get(0);
            }
            product = (Product) obj;
        } else {
            product = C14502TxO.A00(((ProductTag) r5.A3A().get(0)).A02);
        }
        User user = product.A0B;
        C51965G9l.A1I(A0e, r5.getId());
        A0e.A8D("timespent", Double.valueOf((double) j));
        if (r5.A5E()) {
            C9L = r5.A1e(userSession).C9L();
        } else {
            C9L = r5.C9L();
        }
        C51965G9l.A1L(A0e, C9L);
        C13988Tno.A1A(A0e, AnonymousClass3ZA.A00(user));
        ArrayList A3K = r5.A3K(true);
        ArrayList arrayList = new ArrayList();
        if (A3K != null) {
            Iterator it = A3K.iterator();
            while (it.hasNext()) {
                C66582MXn.A1N(((Product) it.next()).A0H, arrayList);
            }
        }
        A0e.AAe("product_ids", arrayList);
        ArrayList A3K2 = r5.A3K(true);
        HashMap hashMap = new HashMap();
        if (A3K2 != null) {
            Iterator it2 = A3K2.iterator();
            while (it2.hasNext()) {
                Product product2 = (Product) it2.next();
                Long A0q = DbV.A0q(AnonymousClass3ZA.A00(product2.A0B));
                List list2 = (List) hashMap.get(A0q);
                if (list2 != null) {
                    list2.add(DbV.A0q(product2.A0H));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    C66582MXn.A1N(product2.A0H, arrayList2);
                    hashMap.put(A0q, arrayList2);
                }
            }
        }
        A0e.A9H("product_merchant_ids", hashMap);
        DbS.A1N(A0e, (String) null);
        C13988Tno.A1C(A0e, (String) null);
        A0e.AAJ("prior_submodule", (String) null);
        A0e.Cgf();
    }
}
