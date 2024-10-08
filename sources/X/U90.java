package X;

import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class U90 extends 2YL {
    public boolean A00;
    public final int A01;
    public final 2Fk A02;
    public final UserSession A03;
    public final C18778W1d A04;
    public final C17785Vfw A05;
    public final C17936ViR A06;
    public final C19290WSy A07;
    public final Product A08;
    public final String A09;
    public final Map A0A;
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new C13999To1(this, 23));
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new C13999To1(this, 24));
    public final C249513ju A0D;
    public final AnonymousClass0r6 A0E;

    public final void A04(ProductVariantDimension productVariantDimension, Integer num, String str) {
        String str2;
        boolean A1Y = DbW.A1Y(num);
        this.A05.A00.put(productVariantDimension.A02, str);
        C18778W1d w1d = this.A04;
        Product product = this.A08;
        C15054ULx A032 = C294165ly.A03(w1d.A03, product);
        0Aj A0e = AnonymousClass7TE.A0e(w1d.A02, "instagram_shopping_change_product_variant");
        C13988Tno.A1C(A0e, w1d.A0A);
        A0e.AAJ("prior_submodule", w1d.A0B);
        Boolean bool = A032.A04;
        if (bool != null) {
            A0e.A7p("is_checkout_enabled", bool);
            Boolean bool2 = A032.A02;
            if (bool2 != null) {
                A0e.A7p("can_add_to_bag", bool2);
                A0e.A7p("is_variant_selection_in_stock", Boolean.valueOf(product.A0P));
                C15054ULx.A02(A0e, A032);
                C13988Tno.A1D(A0e, w1d.A0D);
                0bb r9 = new 0bb();
                r9.A05(AnonymousClass000.A00(308), 00y.A0n(10, w1d.A09));
                Product product2 = w1d.A05;
                String str3 = product2.A0H;
                0qQ.A0B(str3, 0);
                r9.A05("pdp_product_id", 00y.A0n(10, str3));
                User user = product2.A0B;
                if (user == null || (str2 = AnonymousClass3ZA.A00(user)) == null) {
                    str2 = "";
                }
                r9.A00.put("pdp_merchant_id", C263944Ny.A00(str2).FH4());
                A0e.AAK(r9, "pdp_logging_info");
                A0e.AAJ("checkout_session_id", w1d.A07);
                A0e.A7p("has_drops_launched", A032.A03);
                A0e.AAJ("submodule", "instagram_shopping_lightbox");
                String str4 = w1d.A08;
                if (!(str4 == null || str4.length() == 0)) {
                    A0e.A9F("collection_page_id", 00y.A0n(10, str4));
                }
                C13991Tnr.A10(A0e);
                A0e.Cgf();
                C13991Tnr.A1K(this, C318116oQ.A00(this), 5);
                int intValue = num.intValue();
                if (intValue == 0) {
                    A05(A1Y);
                } else if (intValue == A1Y) {
                    A06(A1Y);
                } else {
                    throw new RuntimeException();
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final ProductGroup A00() {
        C19290WSy wSy = this.A07;
        String str = this.A08.A0H;
        0qQ.A0B(str, 0);
        return (ProductGroup) wSy.A00.get(str);
    }

    public static final Product A01(U90 u90) {
        List A002;
        Object obj;
        C17785Vfw vfw = u90.A05;
        ProductGroup A003 = u90.A00();
        Product product = u90.A08;
        if (!(A003 == null || (A002 = A003.A00()) == null)) {
            Iterator it = A002.iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Product product2 = (Product) obj;
                0qQ.A0A(product2);
                List<ProductVariantPossibleValueDictIntf> list = product2.A0O;
                if (list != null) {
                    if ((list instanceof Collection) && list.isEmpty()) {
                        break;
                    }
                    for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                        if (!0qQ.A0K(vfw.A00.get(productVariantPossibleValueDictIntf.getId()), productVariantPossibleValueDictIntf.getValue())) {
                        }
                    }
                    break loop0;
                }
            }
            Product product3 = (Product) obj;
            if (product3 != null) {
                return product3;
            }
        }
        return product;
    }

    private final void A02(String str, boolean z) {
        0Aj A0e;
        C18778W1d w1d = this.A04;
        Product product = this.A08;
        C15054ULx A032 = C294165ly.A03(w1d.A03, product);
        0wc r1 = w1d.A02;
        if (z) {
            A0e = AnonymousClass7TE.A0e(r1, "instagram_shopping_pdp_action_with_unselected_variants");
            C15054ULx.A02(A0e, A032);
            DbS.A1J(A0e, str);
            Boolean bool = A032.A04;
            if (bool != null) {
                A0e.A7p("is_checkout_enabled", bool);
                Boolean bool2 = A032.A02;
                if (bool2 != null) {
                    A0e.A7p("can_add_to_bag", bool2);
                    C13988Tno.A1D(A0e, w1d.A0D);
                    A0e.AAJ("checkout_session_id", w1d.A07);
                    C13988Tno.A1C(A0e, w1d.A0A);
                    C13991Tnr.A12(A0e, w1d.A00);
                    A0e.A9F("drops_launch_date", A032.A06);
                    A0e.A7p("has_drops_launched", A032.A03);
                    A0e.AAJ("prior_submodule", w1d.A0B);
                    A0e.AAJ("submodule", "shopping_pdp_button");
                    A0e.A9F(C273654mx.A00(366), A032.A07);
                    ArrayList A002 = C18778W1d.A00(product.A0N);
                    if (A002 != null) {
                        A0e.AAe("discount_ids", A002);
                    }
                    1Xj r0 = w1d.A04;
                    if (r0 != null) {
                        C51965G9l.A1I(A0e, r0.getId());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            A0e = AnonymousClass7TE.A0e(r1, "instagram_shopping_pdp_action");
            C15054ULx.A02(A0e, A032);
            DbS.A1J(A0e, str);
            Boolean bool3 = A032.A04;
            if (bool3 != null) {
                A0e.A7p("is_checkout_enabled", bool3);
                Boolean bool4 = A032.A02;
                if (bool4 != null) {
                    A0e.A7p("can_add_to_bag", bool4);
                    C13988Tno.A1D(A0e, w1d.A0D);
                    A0e.AAJ("prior_submodule", w1d.A0B);
                    C13991Tnr.A12(A0e, w1d.A00);
                    String A0k = DbS.A0k();
                    if (A0k != null) {
                        C51965G9l.A1K(A0e, A0k);
                    }
                    A0e.AAJ("checkout_session_id", w1d.A07);
                    A0e.A9F("drops_launch_date", A032.A06);
                    A0e.A7p("has_drops_launched", A032.A03);
                    C13988Tno.A1C(A0e, w1d.A0A);
                    A0e.AAJ("submodule", "shopping_pdp_button");
                    A0e.AAJ("url", product.A0F);
                    ArrayList A003 = C18778W1d.A00(product.A0N);
                    if (A003 != null) {
                        A0e.AAe("discount_ids", A003);
                    }
                    1Xj r02 = w1d.A04;
                    if (r02 != null) {
                        C51965G9l.A1I(A0e, r02.getId());
                    }
                    String str2 = w1d.A08;
                    if (!(str2 == null || str2.length() == 0)) {
                        A0e.A9F("collection_page_id", AnonymousClass7TE.A10(str2));
                    }
                    String str3 = w1d.A0C;
                    if (str3 != null) {
                        0bb r12 = new 0bb();
                        r12.A06("search_session_id", str3);
                        A0e.AAK(r12, AnonymousClass000.A00(3983));
                    }
                    C13991Tnr.A10(A0e);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A0e.Cgf();
    }

    private final boolean A03(Integer num) {
        Object obj;
        ProductGroup A002 = A00();
        if (A002 == null) {
            return false;
        }
        C17785Vfw vfw = this.A05;
        Iterator A0o = DbY.A0o(A002.A02);
        while (true) {
            if (!A0o.hasNext()) {
                obj = null;
                break;
            }
            obj = A0o.next();
            if (vfw.A00.get(((ProductVariantDimension) obj).A02) == null) {
                break;
            }
        }
        ProductVariantDimension productVariantDimension = (ProductVariantDimension) obj;
        if (productVariantDimension == null) {
            return false;
        }
        C17987VjP vjP = new C17987VjP(A002, productVariantDimension);
        Iterator A0o2 = DbY.A0o(A002.A02);
        while (A0o2.hasNext()) {
            ProductVariantDimension productVariantDimension2 = (ProductVariantDimension) A0o2.next();
            String A11 = DbT.A11(productVariantDimension2.A02, vfw.A00);
            if (A11 != null && !productVariantDimension2.equals(productVariantDimension)) {
                vjP.A01(productVariantDimension2, A11);
            }
        }
        C17986VjO A003 = vjP.A00();
        ArrayList A012 = A003.A01();
        VariantSelectorModel variantSelectorModel = new VariantSelectorModel(productVariantDimension, A012, (List) null, A003.A00(), Collections.unmodifiableList(A002.A02).indexOf(productVariantDimension), A012.indexOf(vfw.A00.get(productVariantDimension.A02)));
        C18778W1d w1d = this.A04;
        Product product = this.A08;
        ProductVariantDimension productVariantDimension3 = variantSelectorModel.A08;
        String str = productVariantDimension3.A02;
        0qQ.A07(str);
        ProductVariantVisualStyle productVariantVisualStyle = productVariantDimension3.A00;
        0qQ.A07(productVariantVisualStyle);
        String str2 = productVariantVisualStyle.A00;
        boolean A1Y = C51970G9q.A1Y(str2);
        C15054ULx A032 = C294165ly.A03(w1d.A03, product);
        0Aj A0e = AnonymousClass7TE.A0e(w1d.A02, "instagram_shopping_reveal_product_variant_selector");
        C15054ULx.A02(A0e, A032);
        Boolean bool = A032.A04;
        if (bool != null) {
            A0e.A7p("is_checkout_enabled", bool);
            Boolean bool2 = A032.A02;
            if (bool2 != null) {
                A0e.A7p("can_add_to_bag", bool2);
                A0e.A9F("item_count", -1L);
                A0e.AAJ("variant_id", str);
                A0e.AAJ("visual_style", str2);
                C18778W1d.A01(A0e, w1d);
                A0e.A7p(AnonymousClass000.A00(2761), JTP.A0g(A0e, "shopping_session_id", w1d.A0D, A1Y));
                A0e.Cgf();
                AnonymousClass7TE.A1Z(new C59845JaL(variantSelectorModel, num, this, (AnonymousClass4D7) null, 15), C318116oQ.A00(this));
                return true;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A05(boolean z) {
        C318136oS r2;
        int i;
        0sL mg5;
        boolean A002 = this.A05.A00(this.A08);
        if (z) {
            A02("add_to_bag", A002);
        }
        if (!A002) {
            r2 = C318116oQ.A00(this);
            i = 1;
            mg5 = new MG5(this, (AnonymousClass4D7) null, i);
        } else if (A00() == null) {
            r2 = C318116oQ.A00(this);
            mg5 = new MG4(this, (AnonymousClass4D7) null, 49);
        } else if (!A03(AnonymousClass05K.A00)) {
            r2 = C318116oQ.A00(this);
            i = 0;
            mg5 = new MG5(this, (AnonymousClass4D7) null, i);
        } else {
            return;
        }
        AnonymousClass7TE.A1Z(mg5, r2);
    }

    public final void A06(boolean z) {
        C318136oS A002;
        int i;
        boolean A003 = this.A05.A00(this.A08);
        if (z) {
            A02("checkout", A003);
        }
        if (!A003) {
            A002 = C318116oQ.A00(this);
            i = 4;
        } else if (A00() == null) {
            A002 = C318116oQ.A00(this);
            i = 2;
        } else if (!A03(AnonymousClass05K.A01)) {
            A002 = C318116oQ.A00(this);
            i = 3;
        } else {
            return;
        }
        C13991Tnr.A1K(this, A002, i);
    }

    public /* synthetic */ U90(UserSession userSession, C18778W1d w1d, Product product, String str, Map map, int i) {
        C17936ViR viR = new C17936ViR(userSession, w1d, C323426xT.A00(userSession), product);
        C17785Vfw vfw = new C17785Vfw(map);
        0qQ.A0B(userSession, 0);
        C19290WSy wSy = (C19290WSy) userSession.A01(C19290WSy.class, C20670Wx2.A00);
        AnonymousClass7TG.A1U(userSession, product, map);
        AnonymousClass7TF.A1G(w1d, 5, wSy);
        this.A03 = userSession;
        this.A08 = product;
        this.A0A = map;
        this.A09 = str;
        this.A04 = w1d;
        this.A01 = i;
        this.A06 = viR;
        this.A05 = vfw;
        this.A07 = wSy;
        1HR A0f = C13990Tnq.A0f();
        this.A0D = A0f;
        this.A0E = 0u9.A04(A0f);
        this.A02 = DbT.A0G(AnonymousClass10H.A00(new C20593WvW(this), viR.A06, viR.A05, viR.A07));
    }
}
