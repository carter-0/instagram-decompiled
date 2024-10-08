package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ur1  reason: case insensitive filesystem */
public final class C16238Ur1 extends VP2 implements X50 {
    public final C19221WQb A00 = new C19221WQb(this, 45);
    public final UserSession A01;
    public final C18782W1i A02;
    public final C18021Vjx A03;
    public final X9C A04;
    public final W03 A05;
    public final W1W A06;
    public final C18583VuZ A07;
    public final C15678Ugj A08;
    public final C18738VzJ A09;
    public final C18616Vv9 A0A;

    public final void D1c(Integer num, String str, boolean z) {
        String str2;
        User user;
        int A032 = C51967G9n.A03(num, 1);
        String str3 = str;
        if (A032 == 1) {
            A03(this, str3, z);
        } else if (A032 == 2) {
            A02(this, str3);
        } else if (A032 != 3) {
            Product product = this.A04.Bz5().A09;
            if (product != null) {
                A01();
                this.A02.A04(product);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else {
            A01();
            X9C x9c = this.A04;
            Product product2 = x9c.Bz5().A09;
            String BOK = x9c.BTa().BOK();
            if (BOK != null) {
                C18782W1i w1i = this.A02;
                String str4 = null;
                if (!(product2 == null || (user = product2.A0B) == null)) {
                    str4 = AnonymousClass3ZA.A00(user);
                }
                String str5 = "";
                if (str4 == null) {
                    str4 = str5;
                }
                if (!(product2 == null || (str2 = product2.A0H) == null)) {
                    str5 = str2;
                }
                String str6 = null;
                if (C18782W1i.A02(w1i)) {
                    AnonymousClass4DH r8 = w1i.A07;
                    BottomSheetFragment bottomSheetFragment = r8.mParentFragment;
                    if (bottomSheetFragment != null) {
                        C331157Pu r5 = bottomSheetFragment.A02;
                        if (r5 != null) {
                            UserSession userSession = w1i.A08;
                            C331127Pr r4 = new C331127Pr(userSession);
                            DbZ.A0z(r8.requireContext(), r4, 2131973759);
                            DbS.A1S(r4, true);
                            r4.A0x = true;
                            r4.A03 = 0.66f;
                            r4.A1O = false;
                            int[] iArr = C331127Pr.A1X;
                            r4.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
                            C249713kF r7 = C249713kF.A00;
                            String str7 = w1i.A0J;
                            String moduleName = w1i.A09.getModuleName();
                            1Xj r2 = w1i.A01;
                            if (r2 != null) {
                                str6 = C231122qu.A06(userSession, r2);
                            }
                            r7.A1J(r5, r4, (Long) null, str4, str7, moduleName, "view_in_cart_cta", BOK, str6, (String) null, (String) null, w1i.A0C, str5, (String) null, (String) null, false);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                C249713kF r3 = C249713kF.A00;
                FragmentActivity fragmentActivity = w1i.A05;
                UserSession userSession2 = w1i.A08;
                String str8 = w1i.A0J;
                String moduleName2 = w1i.A09.getModuleName();
                1Xj r22 = w1i.A01;
                if (r22 != null) {
                    str6 = C231122qu.A06(userSession2, r22);
                }
                r3.A0m(fragmentActivity, V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, userSession2, (Long) null, str4, str8, moduleName2, "view_in_cart_cta", BOK, str6, (String) null, (String) null, w1i.A0C, str5, (String) null, (String) null, (String) null, (HashMap) null, false);
            }
        }
    }

    public static final ProductVariantDimension A00(C16238Ur1 ur1) {
        C18588Vuf Bz5 = ur1.A04.Bz5();
        ProductGroup productGroup = Bz5.A00;
        if (!(productGroup == null || Collections.unmodifiableList(productGroup.A02) == null)) {
            Iterator A0h = JTQ.A0h(productGroup.A02);
            while (A0h.hasNext()) {
                ProductVariantDimension productVariantDimension = (ProductVariantDimension) A0h.next();
                C18448Vrv vrv = Bz5.A07;
                String str = productVariantDimension.A02;
                0qQ.A07(str);
                if (vrv.A01.get(str) == null) {
                    return productVariantDimension;
                }
            }
        }
        return null;
    }

    private final void A01() {
        Product product = this.A04.Bz5().A09;
        if (product != null) {
            W03 w03 = this.A05;
            if (w03 != null) {
                w03.A03(product, "webclick");
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A03(C16238Ur1 ur1, String str, boolean z) {
        User user;
        String str2;
        String str3;
        String str4;
        String A062;
        String str5;
        C16238Ur1 ur12 = ur1;
        A00(ur12);
        ur12.A01();
        ProductVariantDimension A002 = A00(ur12);
        boolean z2 = z;
        if (A002 != null) {
            String str6 = str;
            ur12.A0A.A01(A002, new C19619Wci(ur12, str6, z2), new C19684Wdm(ur12, str6, z2));
            return;
        }
        Product product = ur12.A04.Bz5().A09;
        if (product != null) {
            ur12.A09.A00 = true;
            if (product.A0P) {
                AnonymousClass1Nd.A00(ur12.A01).A01(ur12.A00, WQO.class);
                C18782W1i w1i = ur12.A02;
                SFL sfl = (SFL) SFL.A04.getValue();
                List A1I = AnonymousClass7TE.A1I(product);
                sfl.A03 = A1I;
                IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = sfl.A01;
                if (igReactPurchaseExperienceBridgeModule != null) {
                    igReactPurchaseExperienceBridgeModule.mProducts = A1I;
                }
                1Xj r4 = w1i.A01;
                if (r4 != null) {
                    user = r4.A2A(w1i.A08);
                } else {
                    user = null;
                }
                User user2 = product.A0B;
                if (user2 == null || (str2 = AnonymousClass3ZA.A00(user2)) == null) {
                    str2 = "";
                }
                String str7 = w1i.A0C;
                String moduleName = w1i.A09.getModuleName();
                String str8 = w1i.A0G;
                String str9 = w1i.A0E;
                if (w1i.A01 == null || user == null) {
                    str3 = null;
                } else {
                    str3 = user.getId();
                }
                1Xj r0 = w1i.A01;
                if (r0 != null) {
                    str4 = r0.A30();
                } else {
                    str4 = null;
                }
                1Xj r42 = w1i.A01;
                if (r42 == null) {
                    A062 = null;
                } else {
                    A062 = C231122qu.A06(w1i.A08, r42);
                }
                String str10 = w1i.A0J;
                X9C x9c = w1i.A0B;
                Set keySet = x9c.Bz5().A0D.keySet();
                User BRo = x9c.BTa().BRo();
                if (BRo != null) {
                    str5 = AnonymousClass3ZA.A00(BRo);
                } else {
                    str5 = null;
                }
                CheckoutLaunchParams A012 = C18769W0q.A01(product, str2, str7, moduleName, str8, str9, str3, str4, A062, (String) null, str10, "pdp", str5, w1i.A0F, keySet, z);
                1Y5 A003 = VFA.A00();
                boolean A022 = C18782W1i.A02(w1i);
                FragmentActivity fragmentActivity = w1i.A05;
                UserSession userSession = w1i.A08;
                if (A022) {
                    1Y5.A02(fragmentActivity, userSession, A012, A003, "pdp", true);
                } else {
                    A003.A04(fragmentActivity, userSession, A012, "pdp");
                }
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16238Ur1(UserSession userSession, W03 w03, W1W w1w, C18782W1i w1i, C18021Vjx vjx, C18583VuZ vuZ, C15678Ugj ugj, C18738VzJ vzJ, C18616Vv9 vv9, X9C x9c, C18020Vjw vjw) {
        super(vjw);
        AnonymousClass7TG.A1P(userSession, w1w);
        AnonymousClass7TG.A1S(w1i, vjx);
        C51974G9v.A1Q(vzJ, vjw, vv9, vuZ);
        0qQ.A0B(ugj, 11);
        this.A01 = userSession;
        this.A04 = x9c;
        this.A06 = w1w;
        this.A05 = w03;
        this.A02 = w1i;
        this.A03 = vjx;
        this.A09 = vzJ;
        this.A0A = vv9;
        this.A07 = vuZ;
        this.A08 = ugj;
    }

    public static final void A02(C16238Ur1 ur1, String str) {
        A00(ur1);
        ur1.A01();
        ProductVariantDimension A002 = A00(ur1);
        if (A002 != null) {
            ur1.A0A.A01(A002, new C19618Wch(ur1, str), new C19687Wdp(str, (Object) ur1, 2));
            return;
        }
        Product product = ur1.A04.Bz5().A09;
        if (product == null) {
            throw AnonymousClass7TE.A0y();
        } else if (product.A0P) {
            C18021Vjx vjx = ur1.A03;
            0qQ.A0B(str, 0);
            vjx.A00(product, str, vjx.A0A, vjx.A0B);
        }
    }
}
