package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class I7Q {
    public static final void A03(C54685HOq hOq, UserSession userSession, AnonymousClass4DU r8, String str, String str2, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r8, userSession, hOq, 5), "commerce_feed_server");
        if (A0e.isSampled()) {
            V1Q v1q = V1Q.FAILURE;
            if (z) {
                v1q = V1Q.SUCCESS;
            }
            Map A0w = AnonymousClass7TF.A0w("product_id", str);
            String A0k = DbS.A0k();
            if (A0k == null) {
                A0k = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            A0e.AAJ("navigation_chain", A0k);
            A0e.A8M(hOq, AnonymousClass000.A00(1799));
            A0e.A8M(v1q, AnonymousClass000.A00(1800));
            A0e.A8M(V1X.POSTS_FEED, "analytics_page");
            A0e.A8M(V1W.TAB_FEED, AnonymousClass000.A00(3867));
            A0e.AAJ(AnonymousClass000.A00(5175), "save_to_collection_bottom_sheet");
            A0e.AAJ("shopping_session_id", str2);
            A0e.A9F("product_id", DbZ.A0d(str));
            A0e.A8M(V1Z.PRODUCT_ITEM, "analytics_component");
            A0e.A8M(V1Y.SAVE_TO_COLLECTION_BOTTOM_SHEET, "analytics_module");
            A0e.A9H("extra_data", A0w);
            A0e.Cgf();
        }
    }

    public static final void A07(UserSession userSession, 1Xj r6, SavedCollection savedCollection, Integer num, int i) {
        0qQ.A0B(userSession, 0);
        C51972G9s.A1D(savedCollection, num);
        if (savedCollection.A07 == C54665HMw.PRODUCT_AUTO_COLLECTION) {
            Integer num2 = AnonymousClass05K.A00;
            List<Product> A01 = A01(r6, i);
            if (num != num2) {
                if (A01 != null && AnonymousClass7TE.A1b(A01)) {
                    ArrayList A1D = AnonymousClass7TE.A1D(C51966G9m.A1J(savedCollection.A0M));
                    for (Product product : A01) {
                        ProductImageContainer productImageContainer = product.A0A;
                        if (productImageContainer != null) {
                            A1D.remove(productImageContainer);
                        }
                    }
                    savedCollection.A04(00k.A0a(A1D));
                }
                if (Collections.unmodifiableList(savedCollection.A0M).isEmpty()) {
                    C57096IOk A00 = C55124HcX.A00(userSession);
                    String str = savedCollection.A0F;
                    0qQ.A07(str);
                    A00.A05(str);
                }
            } else if (A01 != null && AnonymousClass7TE.A1b(A01)) {
                ArrayList A1D2 = AnonymousClass7TE.A1D(C51966G9m.A1J(savedCollection.A0M));
                for (Product product2 : A01) {
                    ProductImageContainer productImageContainer2 = product2.A0A;
                    if (productImageContainer2 != null) {
                        if (!(A1D2 instanceof Collection) || !A1D2.isEmpty()) {
                            Iterator it = A1D2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (productImageContainer2.BGO().equals(((ProductImageContainer) it.next()).BGO())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        A1D2.add(0, productImageContainer2);
                    }
                }
                savedCollection.A04(00k.A0a(A1D2));
            }
        }
    }

    public static final boolean A08(UserSession userSession) {
        0Tu A0J = DbS.A0J(userSession, 0);
        if (182.A06(A0J, userSession, 36316014367412075L)) {
            return 182.A06(A0J, userSession, 36316014367281002L);
        }
        return false;
    }

    public static final boolean A09(UserSession userSession, 1Xj r5, int i) {
        List<Product> A01;
        0qQ.A0B(userSession, 2);
        if (r5 == null || (A01 = A01(r5, i)) == null) {
            return false;
        }
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            for (Product A03 : A01) {
                if (!C323496xa.A00(userSession).A03(A03)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, 1Xj r5, int i) {
        List<Product> A01 = A01(r5, i);
        if (A01 == null) {
            return false;
        }
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            for (Product A03 : A01) {
                if (C323496xa.A00(userSession).A03(A03)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, 1Xj r4, List list, int i) {
        List A01;
        AnonymousClass7TF.A1C(list, 0, userSession);
        C57096IOk A00 = C55124HcX.A00(userSession);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((SavedCollection) it.next()).A07 == C54665HMw.PRODUCT_AUTO_COLLECTION) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (AnonymousClass7TE.A1b(A00.A02(AnonymousClass7TE.A1I(C54665HMw.PRODUCT_AUTO_COLLECTION), (List) null)) || r4 == null || (A01 = A01(r4, i)) == null || !AnonymousClass7TE.A1b(A01)) {
            return false;
        }
        return true;
    }

    public static final void A02(Context context, 1P0 r30, UserSession userSession, 1Xj r32, AnonymousClass4DU r33, C243373Ym r34, String str, int i) {
        ArrayList<Product> arrayList;
        String str2;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(context2, userSession2);
        AnonymousClass4DU r9 = r33;
        0qQ.A0B(r9, 4);
        int i2 = i;
        1Xj r8 = r32;
        ArrayList A3J = r8.A3J(Integer.valueOf(i2));
        if (A3J != null) {
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = A3J.iterator();
            while (it.hasNext()) {
                arrayList.add(C14502TxO.A00(((ProductTag) it.next()).A02));
            }
        } else {
            arrayList = null;
        }
        0rm A11 = C51965G9l.A11();
        A11.A00 = C54685HOq.A02;
        C243373Ym r1 = C243373Ym.NOT_SAVED;
        C243373Ym r11 = r34;
        if (r11 == r1) {
            A11.A00 = C54685HOq.A03;
        }
        if (arrayList != null) {
            for (Product product : arrayList) {
                if (C323496xa.A00(userSession2).A03(product)) {
                    if (r11 != r1) {
                    }
                } else if (r11 != C243373Ym.SAVED) {
                }
                User user = product.A0B;
                if (user != null) {
                    str2 = AnonymousClass3ZA.A00(user);
                } else {
                    str2 = null;
                }
                String str3 = str;
                SaveApiUtil.A06(context2, new H4Z(r30, userSession2, r8, r9, r11, product, str3, arrayList, A11, i2), userSession2, r8, r9, product, r11, String.valueOf(str2), (String) null, (String) null, (String) null, (String) null, (String) null, str3, (String) null, (String) null);
            }
        }
    }

    public static final boolean A0C(SavedCollection savedCollection) {
        C54665HMw hMw;
        List A1P = 0sr.A1P(new C54665HMw[]{C54665HMw.PRODUCT_AUTO_COLLECTION, C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION});
        if (savedCollection != null) {
            hMw = savedCollection.A07;
        } else {
            hMw = null;
        }
        return 00k.A0u(A1P, hMw);
    }

    public static final List A00(UserSession userSession, 1Xj r2, List list, int i) {
        ArrayList A3J;
        AnonymousClass7TG.A1Q(userSession, list);
        if (r2 == null || !r2.A4u() || !A08(userSession) || (A3J = r2.A3J(Integer.valueOf(i))) == null || !DbT.A1b(A3J)) {
            return list;
        }
        return 00k.A0T(C54665HMw.PRODUCT_AUTO_COLLECTION, list);
    }

    public static final List A01(1Xj r1, int i) {
        ArrayList A3J = r1.A3J(Integer.valueOf(i));
        if (A3J == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A3J.iterator();
        while (it.hasNext()) {
            A1C.add(C14502TxO.A00(((ProductTag) it.next()).A02));
        }
        return A1C;
    }

    public static final void A04(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, String str, int i) {
        AnonymousClass7TG.A1N(userSession, r5);
        1Ln A02 = 1Ln.A02(AnonymousClass0kN.A01(r5, userSession));
        if (DbT.A1Y(A02)) {
            List<Product> A01 = A01(r4, i);
            ArrayList arrayList = null;
            if (A01 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (Product product : A01) {
                    String str2 = product.A0H;
                    if (str2 != null) {
                        C51973G9u.A1F(str2, arrayList);
                    }
                }
            }
            if (str == null) {
                str = "";
            }
            A02.A0R("shopping_session_id", str);
            A02.A0M(V1Z.WISHLIST_COLLECTION, "analytics_component");
            A02.A0M(V1X.POSTS_FEED, "analytics_page");
            A02.A0M(V1Y.SAVE_TO_COLLECTION_BOTTOM_SHEET, "analytics_module");
            C51975G9x.A1A(A02, r4, "instagram_wishlist_save_to_collections_impression", arrayList);
            A02.Cgf();
        }
    }

    public static final void A05(UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, int i) {
        1Ln A01 = 1Ln.A01(DbX.A0O(r6, userSession));
        if (DbT.A1Y(A01)) {
            List<Product> A012 = A01(r5, i);
            ArrayList arrayList = null;
            if (A012 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (Product product : A012) {
                    String str2 = product.A0H;
                    if (str2 != null) {
                        C51973G9u.A1F(str2, arrayList);
                    }
                }
            }
            if (str == null) {
                str = "";
            }
            Map A0w = AnonymousClass7TF.A0w("extra_ui", "wishlist_saved_unsaved_from_collections_toast");
            A01.A0R("shopping_session_id", str);
            A01.A0M(V1Z.TOAST, "analytics_component");
            A01.A0M(V1X.POSTS_FEED, "analytics_page");
            A01.A0M(V1Y.TOAST, "analytics_module");
            C51975G9x.A1A(A01, r5, "wishlist_save_unsaved_from_collections_toast_click", arrayList);
            A01.A0x(A0w);
            A01.Cgf();
        }
    }

    public static final void A06(UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, int i) {
        1Ln A02 = 1Ln.A02(DbX.A0O(r6, userSession));
        if (DbT.A1Y(A02)) {
            List<Product> A01 = A01(r5, i);
            ArrayList arrayList = null;
            if (A01 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (Product product : A01) {
                    String str2 = product.A0H;
                    if (str2 != null) {
                        C51973G9u.A1F(str2, arrayList);
                    }
                }
            }
            if (str == null) {
                str = "";
            }
            Map A0w = AnonymousClass7TF.A0w("extra_ui", "wishlist_saved_unsaved_from_collections_toast");
            A02.A0R("shopping_session_id", str);
            A02.A0M(V1Z.TOAST, "analytics_component");
            A02.A0M(V1X.POSTS_FEED, "analytics_page");
            A02.A0M(V1Y.TOAST, "analytics_module");
            C51975G9x.A1A(A02, r5, "wishlist_save_unsaved_from_collections_toast_impression", arrayList);
            A02.A0x(A0w);
            A02.Cgf();
        }
    }
}
