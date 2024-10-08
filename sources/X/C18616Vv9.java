package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vv9  reason: case insensitive filesystem */
public final class C18616Vv9 {
    public final Context A00;
    public final UserSession A01;
    public final W1W A02;
    public final C18583VuZ A03;
    public final C19676Wde A04;
    public final C231142qw A05;
    public final X9C A06;
    public final C18021Vjx A07;

    public C18616Vv9(Context context, UserSession userSession, W1W w1w, C18021Vjx vjx, C18583VuZ vuZ, C19676Wde wde, C231142qw r8, X9C x9c) {
        DbW.A1N(userSession, 1, w1w);
        C51973G9u.A0t(6, vjx, wde, vuZ);
        this.A01 = userSession;
        this.A00 = context;
        this.A06 = x9c;
        this.A02 = w1w;
        this.A07 = vjx;
        this.A05 = r8;
        this.A04 = wde;
        this.A03 = vuZ;
    }

    public static final ProductVariantDimension A00(ProductVariantDimension productVariantDimension, C18616Vv9 vv9) {
        X9C x9c = vv9.A06;
        ProductGroup productGroup = x9c.Bz5().A00;
        ProductVariantDimension productVariantDimension2 = null;
        if (productGroup != null) {
            Iterator A0h = JTQ.A0h(productGroup.A02);
            while (A0h.hasNext()) {
                ProductVariantDimension productVariantDimension3 = (ProductVariantDimension) A0h.next();
                if (!0qQ.A0K(productVariantDimension3, productVariantDimension) && productVariantDimension3.A00 == ProductVariantVisualStyle.PICKER) {
                    C18448Vrv vrv = x9c.Bz5().A07;
                    String str = productVariantDimension3.A02;
                    0qQ.A07(str);
                    if (vrv.A01.get(str) == null) {
                        productVariantDimension2 = productVariantDimension3;
                    }
                }
            }
        }
        return productVariantDimension2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A06, 36311835363771167L) != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r1.equals(r0.A03) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.model.shopping.ProductVariantDimension r14, X.C20932X4x r15, X.C273414mX r16) {
        /*
            r13 = this;
            X.X9C r4 = r13.A06
            X.Vuf r0 = r4.Bz5()
            com.instagram.user.model.Product r1 = r0.A09
            r6 = 1
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0024
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r1.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0024
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = r0.A03
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            X.Vuf r0 = r4.Bz5()
            X.0qQ.A07(r0)
            com.instagram.shopping.model.variantselector.VariantSelectorModel r2 = X.C17071VGt.A00(r14, r0)
            X.W1W r7 = r13.A02
            X.X9L r0 = r4.BTa()
            com.instagram.user.model.Product r10 = r0.Bft()
            java.lang.String r9 = r14.A02
            X.0qQ.A07(r9)
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = r14.A00
            X.0qQ.A07(r0)
            java.lang.String r8 = r0.A00
            if (r3 == 0) goto L_0x00fb
            java.util.List r0 = r2.A01
            boolean r0 = X.C13988Tno.A1a(r0)
            if (r0 != 0) goto L_0x00fb
        L_0x0050:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            boolean r1 = X.DbW.A1Y(r8)
            X.0wc r5 = r7.A04
            java.lang.String r0 = "instagram_shopping_reveal_product_variant_selector"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r0)
            java.lang.String r0 = r10.A0H
            X.C13991Tnr.A17(r5, r0)
            java.lang.String r0 = X.C13989Tnp.A0q(r10)
            X.C13988Tno.A1A(r5, r0)
            X.C13989Tnp.A1H(r5, r10)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r10.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            r12 = 1
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r0.A02
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x00f9
            com.instagram.common.session.UserSession r11 = r7.A06
            X.0Tu r10 = X.0Tu.A05
            r0 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r0 = X.182.A06(r10, r11, r0)
            if (r0 == 0) goto L_0x00f9
        L_0x008d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "can_add_to_bag"
            r5.A7p(r0, r1)
            r0 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "item_count"
            r5.A9F(r0, r1)
            java.lang.String r0 = "variant_id"
            r5.AAJ(r0, r9)
            java.lang.String r0 = "visual_style"
            r5.AAJ(r0, r8)
            java.lang.String r1 = r7.A0E
            java.lang.String r0 = "checkout_session_id"
            r5.AAJ(r0, r1)
            X.W1W.A02(r5, r7)
            java.lang.String r1 = r7.A0H
            java.lang.String r0 = "shopping_session_id"
            java.lang.Boolean r1 = X.JTP.A0g(r5, r0, r1, r6)
            r0 = 2761(0xac9, float:3.869E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A7p(r0, r1)
            r5.Cgf()
            X.Wde r1 = r13.A04
            X.Wc3 r0 = new X.Wc3
            r0.<init>(r13, r15, r3)
            r5 = r16
            r1.A01(r0, r2, r5, r3)
            X.Vuf r0 = r4.Bz5()
            X.W2j r3 = new X.W2j
            r3.<init>(r0)
            X.Vrv r0 = r0.A07
            X.0qQ.A07(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Map r0 = r0.A01
            r2.putAll(r0)
            r1 = 0
            X.Vrv r0 = new X.Vrv
            r0.<init>(r1, r2)
            r3.A07 = r0
            X.C18588Vuf.A00(r4, r3)
            return
        L_0x00f9:
            r12 = 0
            goto L_0x008d
        L_0x00fb:
            r6 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18616Vv9.A01(com.instagram.model.shopping.ProductVariantDimension, X.X4x, X.4mX):void");
    }

    public final void A02(ProductVariantDimension productVariantDimension, String str, boolean z) {
        String str2;
        String A002;
        X9C x9c = this.A06;
        C18588Vuf Bz5 = x9c.Bz5();
        ProductGroup productGroup = Bz5.A00;
        if (productGroup != null) {
            C18448Vrv vrv = Bz5.A07;
            ProductVariantDimension productVariantDimension2 = productVariantDimension;
            String str3 = productVariantDimension2.A02;
            0qQ.A07(str3);
            Map map = vrv.A01;
            Object obj = map.get(str3);
            Product product = Bz5.A09;
            if (product != null) {
                C18562VuE vuE = new C18562VuE(productGroup, product);
                String str4 = str;
                vuE.A01(productVariantDimension2, str4);
                Iterator A0h = JTQ.A0h(productGroup.A02);
                while (A0h.hasNext()) {
                    ProductVariantDimension productVariantDimension3 = (ProductVariantDimension) A0h.next();
                    if (!productVariantDimension2.equals(productVariantDimension3)) {
                        String str5 = productVariantDimension3.A02;
                        0qQ.A07(str5);
                        String A11 = DbT.A11(str5, map);
                        if (A11 != null) {
                            vuE.A01(productVariantDimension3, A11);
                        }
                    }
                }
                C17463VWq vWq = new C17463VWq(C18562VuE.A00(vuE), vuE.A01, vuE.A02);
                if (!0qQ.A0K(obj, str4)) {
                    W1W w1w = this.A02;
                    Product product2 = vWq.A00;
                    0qQ.A06(product2);
                    C15054ULx A032 = C294165ly.A03(w1w.A06, product2);
                    0Aj A0e = AnonymousClass7TE.A0e(w1w.A04, "instagram_shopping_change_product_variant");
                    W1W.A02(A0e, w1w);
                    Boolean bool = A032.A04;
                    0qQ.A0A(bool);
                    A0e.A7p("is_checkout_enabled", bool);
                    Boolean bool2 = A032.A02;
                    0qQ.A0A(bool2);
                    A0e.A7p("can_add_to_bag", bool2);
                    A0e.A7p("is_variant_selection_in_stock", Boolean.valueOf(product2.A0P));
                    C15054ULx.A02(A0e, A032);
                    C13988Tno.A1D(A0e, w1w.A0H);
                    C18588Vuf Bz52 = w1w.A0A.Bz5();
                    0qQ.A0A(Bz52);
                    A0e.AAK(W1W.A01(w1w, Bz52), "pdp_logging_info");
                    A0e.AAJ("checkout_session_id", w1w.A0E);
                    A0e.A7p("has_drops_launched", A032.A03);
                    A0e.AAJ("submodule", "variant_selector");
                    String str6 = w1w.A0C;
                    if (str6 != null && !00l.A0W(str6)) {
                        A0e.A9F("collection_page_id", AnonymousClass7TE.A10(str6));
                    }
                    C13991Tnr.A10(A0e);
                    A0e.Cgf();
                }
                C18588Vuf Bz53 = x9c.Bz5();
                Product product3 = vWq.A00;
                String str7 = product3.A0H;
                boolean A003 = 2PP.A00(Bz53.A0B.get(str7), Boolean.TRUE);
                W2j w2j = new W2j(Bz5);
                w2j.A09 = product3;
                HashMap hashMap = new HashMap();
                hashMap.putAll(map);
                String str8 = vrv.A00;
                hashMap.clear();
                Map map2 = vWq.A02;
                0qQ.A06(map2);
                hashMap.putAll(map2);
                w2j.A07 = new C18448Vrv(str8, hashMap);
                w2j.A0G = C323426xT.A00(this.A01).A08(product3);
                if (z && productVariantDimension2.A00 == ProductVariantVisualStyle.PICKER && !A003 && !product3.A0P) {
                    JTP.A1R(str7, w2j.A0B, true);
                }
                C18588Vuf.A00(x9c, w2j);
                if (product != product3) {
                    C18021Vjx vjx = this.A07;
                    vjx.A01((String) null);
                    X9C x9c2 = vjx.A07;
                    C18588Vuf Bz54 = x9c2.Bz5();
                    Product product4 = Bz54.A09;
                    if (product4 != null) {
                        Product product5 = Bz54.A08;
                        if (product5 != null) {
                            W2j w2j2 = new W2j(Bz54);
                            C18502Vsx vsx = Bz54.A02;
                            C16605Uxz uxz = vsx.A03;
                            boolean z2 = vsx.A06;
                            C16605Uxz uxz2 = vsx.A00;
                            C16605Uxz uxz3 = vsx.A04;
                            C16605Uxz uxz4 = vsx.A01;
                            w2j2.A02 = new C18502Vsx(uxz2, uxz4, vsx.A02, uxz, uxz3, C16605Uxz.LOADING, z2);
                            C18588Vuf.A00(x9c2, w2j2);
                            Fragment fragment = vjx.A00;
                            Context context = fragment.getContext();
                            if (context != null) {
                                0gy A004 = AnonymousClass07i.A00(fragment);
                                UserSession userSession = vjx.A01;
                                String str9 = product5.A0H;
                                User user = product4.A0B;
                                if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                C17451VWe vWe = new C17451VWe(vjx, Bz54, product4);
                                0qQ.A0B(str9, 3);
                                String str10 = product4.A0H;
                                1NY A0b = AnonymousClass7TG.A0b(userSession);
                                A0b.A0K("commerce/products/%s/variant_sections/", new Object[]{str9});
                                A0b.A9m(AnonymousClass000.A00(1795), str10);
                                A0b.A9m("merchant_id", A002);
                                A0b.A9m("device_width", String.valueOf(0nA.A09(context)));
                                A0b.A9m("shopping_bag_enabled", "false");
                                1OC A0R = DbT.A0R((15p) null, A0b, C15247UXh.class, C18261VoS.class, false);
                                C15619Ufl.A00(A0R, vWe, userSession, 20);
                                1ES.A00(context, A004, A0R);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (z && productVariantDimension2.A00 == ProductVariantVisualStyle.PICKER && !A003 && !product3.A0P) {
                    C18021Vjx vjx2 = this.A07;
                    User user2 = product3.A0B;
                    if (user2 == null || (str2 = AnonymousClass3ZA.A00(user2)) == null) {
                        str2 = "";
                    }
                    C15619Ufl ufl = new C15619Ufl(22, vWq, this);
                    0qQ.A0B(str7, 0);
                    AnonymousClass4DH r4 = vjx2.A00;
                    1NY A0a = AnonymousClass7TG.A0a(vjx2.A01);
                    A0a.A0K("commerce/restock_reminder/%s/set/", new Object[]{str7});
                    A0a.A0Q(1XP.class, 1XY.class);
                    A0a.A9m("enabled", "true");
                    1OC A0T = DbT.A0T(A0a, "merchant_id", str2);
                    A0T.A00 = ufl;
                    r4.schedule(A0T);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
