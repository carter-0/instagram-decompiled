package X;

import android.content.Context;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;

public final class UFP extends C60140do {
    public final /* synthetic */ C15354Ub5 A00;
    public final /* synthetic */ C15354Ub5 A01;

    public UFP(C15354Ub5 ub5, C15354Ub5 ub52) {
        this.A01 = ub5;
        this.A00 = ub52;
    }

    public final void onPageSelected(int i) {
        String str;
        String str2;
        C15354Ub5 ub5 = this.A01;
        C16293UsB usB = ub5.A02;
        if (usB == null) {
            str2 = "tabFragmentPagerAdapter";
        } else {
            C16553Ux0 ux0 = (C16553Ux0) usB.A02.get(i);
            C15354Ub5 ub52 = this.A00;
            0lg A0X = DbT.A0X(ub5.A0A);
            String A11 = DbT.A11(ux0, ub5.A09);
            String str3 = ub5.A05;
            if (str3 == null) {
                str2 = "priorModule";
            } else {
                String str4 = ub5.A06;
                0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(ub52, A0X, 1), "instagram_shopping_tags_list_navigated_to_tab");
                if (A0e.isSampled()) {
                    C13988Tno.A1C(A0e, str3);
                    if (A11 == null) {
                        A11 = "";
                    }
                    A0e.AAJ("tags_list_tab_destination", A11);
                    C13988Tno.A1D(A0e, str4);
                    A0e.Cgf();
                }
                C17644Vba vba = ub5.A03;
                if (vba != null) {
                    int ordinal = ux0.ordinal();
                    if (ordinal == 1) {
                        ShoppingMoreProductsFragment shoppingMoreProductsFragment = ub5.A00;
                        if (shoppingMoreProductsFragment == null) {
                            throw AnonymousClass7TE.A0y();
                        } else if (shoppingMoreProductsFragment instanceof ShoppingMoreProductsFragment) {
                            ShoppingMoreProductsFragment shoppingMoreProductsFragment2 = shoppingMoreProductsFragment;
                            Context requireContext = ub5.requireContext();
                            if (shoppingMoreProductsFragment2.A02 == C16559UxB.TAGGED_PRODUCT) {
                                str = shoppingMoreProductsFragment2.A0C;
                                if (str == null) {
                                    1Xj r0 = shoppingMoreProductsFragment2.A01;
                                    if (r0 != null) {
                                        str = LTZ.A03(requireContext, r0);
                                    }
                                }
                            }
                            str = AnonymousClass7TF.A0d(requireContext.getResources(), 2131973778);
                        } else {
                            return;
                        }
                    } else if (ordinal == 0 || ordinal == 2 || ordinal == 3) {
                        str = LTZ.A03(ub5.requireContext(), ub5.A01);
                    } else {
                        throw new RuntimeException();
                    }
                    vba.A04.A0M(str);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
