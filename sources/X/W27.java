package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class W27 {
    public C331157Pu A00;
    public C273414mX A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final VX6 A05;
    public final Map A06;
    public final int A07;
    public final boolean A08;

    public static final void A02(W27 w27, List list, int[] iArr, int i, boolean z) {
        List list2 = list;
        int i2 = i;
        ProductVariantDimension productVariantDimension = (ProductVariantDimension) list.get(i);
        W27 w272 = w27;
        C331127Pr r4 = new C331127Pr(w27.A04);
        r4.A0d = AnonymousClass7TF.A0e(w27.A03.getResources(), productVariantDimension.A03, 2131976369);
        boolean z2 = z;
        if (i > 0) {
            C331137Ps A0h = C51971G9r.A0h(0);
            A0h.A02 = R.drawable.instagram_arrow_back_24;
            A0h.A05 = new ICX(i2, 1, list2, (Object) null, w272, productVariantDimension, z2);
            r4.A06(A0h.A00());
        } else {
            r4.A01();
        }
        r4.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        C15368UbL A012 = A01(w272, list, i, z2);
        r4.A0T = A012;
        C331157Pu r1 = w272.A00;
        if (r1 != null) {
            r1.A0G(A012, r4, false, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final MultiVariantSelectorLoadingFragment A00(C17392VTt vTt, W27 w27) {
        Product product = vTt.A00;
        MultiVariantSelectorLoadingFragment multiVariantSelectorLoadingFragment = new MultiVariantSelectorLoadingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_fixed_height", w27.A07);
        bundle.putString("product_id", product.A0H);
        bundle.putString("merchant_id", C13989Tnp.A0q(product));
        bundle.putSerializable(C273654mx.A00(893), (Serializable) null);
        multiVariantSelectorLoadingFragment.setArguments(bundle);
        multiVariantSelectorLoadingFragment.A01 = new C17393VTu(vTt, w27);
        return multiVariantSelectorLoadingFragment;
    }

    public static final C15368UbL A01(W27 w27, List list, int i, boolean z) {
        Fragment ur3;
        List list2 = list;
        ProductVariantDimension productVariantDimension = (ProductVariantDimension) list2.get(i);
        if (productVariantDimension.A00.ordinal() != 2) {
            ur3 = new C16241Ur4();
        } else {
            ur3 = new C16240Ur3();
        }
        W27 w272 = w27;
        VX6 vx6 = w27.A05;
        ProductGroup productGroup = vx6.A00;
        ArrayList arrayList = null;
        if (productGroup != null) {
            C17987VjP vjP = new C17987VjP(productGroup, productVariantDimension);
            ProductGroup productGroup2 = vx6.A00;
            if (productGroup2 != null) {
                Iterator A0h = JTQ.A0h(productGroup2.A02);
                while (A0h.hasNext()) {
                    ProductVariantDimension productVariantDimension2 = (ProductVariantDimension) AnonymousClass7TF.A0a(A0h);
                    String A11 = DbT.A11(productVariantDimension2, vx6.A02);
                    if (A11 != null && !0qQ.A0K(productVariantDimension2, productVariantDimension)) {
                        vjP.A01(productVariantDimension2, A11);
                    }
                }
                C17986VjO A002 = vjP.A00();
                ArrayList A012 = A002.A01();
                ArrayList arrayList2 = new ArrayList();
                for (Object next : A002.A02.A00.A05) {
                    Map map = A002.A01;
                    if (map.containsKey(next)) {
                        arrayList2.add(map.get(next));
                    }
                }
                ProductGroup productGroup3 = vx6.A00;
                if (productGroup3 != null) {
                    int indexOf = Collections.unmodifiableList(productGroup3.A02).indexOf(productVariantDimension);
                    if (productVariantDimension.A00 == ProductVariantVisualStyle.THUMBNAIL) {
                        arrayList = arrayList2;
                    }
                    ArrayList A003 = A002.A00();
                    Object obj = vx6.A02.get(productVariantDimension);
                    0qQ.A0B(A012, 0);
                    VariantSelectorModel variantSelectorModel = new VariantSelectorModel(productVariantDimension, A012, arrayList, A003, indexOf, A012.indexOf(obj));
                    Bundle bundle = new Bundle();
                    bundle.putInt("arg_fixed_height", w272.A07);
                    bundle.putParcelable("variant_selector_model", variantSelectorModel);
                    bundle.putBoolean("arg_disable_sold_out", w272.A08);
                    ur3.setArguments(bundle);
                    ur3.A01(new C19580Wc4(w272, list2, z));
                    C17053VGb.A00(w272.A04).A06(false);
                    return ur3;
                }
            }
        }
        0qQ.A0F("_productGroup");
        throw AnonymousClass00P.createAndThrow();
    }

    public W27(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        AnonymousClass7TG.A1O(fragmentActivity, userSession);
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        this.A08 = z;
        this.A05 = new VX6();
        this.A06 = new HashMap();
        this.A07 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
    }

    public W27(FragmentActivity fragmentActivity, UserSession userSession) {
        this(fragmentActivity, userSession, DbW.A1Y(userSession));
    }
}
