package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Vfu  reason: case insensitive filesystem */
public final class C17783Vfu {
    public final /* synthetic */ C15338Uan A00;

    public C17783Vfu(C15338Uan uan) {
        this.A00 = uan;
    }

    public final void A00(C18043VkR vkR, Product product) {
        ProductGroup productGroup;
        List unmodifiableList;
        C15338Uan uan = this.A00;
        1Ng A0R = DbX.A0R(uan.A0N);
        ProductPickerArguments productPickerArguments = uan.A08;
        String str = "arguments";
        if (productPickerArguments != null) {
            A0R.A00(new C62153KbB(product, productPickerArguments.A01, productPickerArguments.A05));
            W02 w02 = uan.A05;
            if (w02 == null) {
                str = "logger";
            } else {
                ProductSourceOverrideState productSourceOverrideState = uan.A09;
                if (productSourceOverrideState == null) {
                    str = "productSourceOverrideState";
                } else {
                    ProductSource productSource = productSourceOverrideState.A00;
                    0Aj A0e = AnonymousClass7TE.A0e(w02.A03, "instagram_shopping_product_tagging_product_selected");
                    C13988Tno.A1C(A0e, w02.A04);
                    A0e.AAJ("product_id", product.A0H);
                    String str2 = vkR.A01;
                    if (str2 != null) {
                        A0e.AAJ("section_group", str2);
                        A0e.AAJ("section_type", vkR.A02());
                        C13988Tno.A1A(A0e, C13989Tnp.A0q(product));
                        A0e.A7p("is_sku_match", Boolean.valueOf(C17056VGe.A00(vkR)));
                        A0e.AAJ("waterfall_id", w02.A06);
                        W02.A01(A0e, w02);
                        UntaggableReason untaggableReason = product.A06;
                        if (untaggableReason != null) {
                            A0e.AAJ(C273654mx.A00(418), untaggableReason.A04);
                        }
                        C17461VWo vWo = vkR.A00().A01;
                        if (!(vWo == null || (productGroup = vWo.A00) == null || (unmodifiableList = Collections.unmodifiableList(productGroup.A02)) == null)) {
                            A0e.AAJ("variant_id", ((ProductVariantDimension) unmodifiableList.get(0)).A02);
                        }
                        if (productSource != null) {
                            A0e.AAJ("selected_source_id", productSource.A01);
                            String str3 = productSource.A03;
                            if (str3 == null) {
                                str3 = productSource.A04;
                            }
                            A0e.AAJ("selected_source_name", str3);
                            A0e.AAJ("selected_source_type", productSource.A00.toString());
                        }
                        A0e.Cgf();
                        ProductPickerArguments productPickerArguments2 = uan.A08;
                        if (productPickerArguments2 != null) {
                            if (!productPickerArguments2.A0B || !productPickerArguments2.A0C) {
                                uan.A0D = false;
                                FragmentActivity activity = uan.getActivity();
                                if (activity != null) {
                                    activity.onBackPressed();
                                    return;
                                }
                                throw AnonymousClass7TE.A0y();
                            }
                            FragmentActivity activity2 = uan.getActivity();
                            if (activity2 != null) {
                                Intent intent = new Intent();
                                intent.putExtra("selected_product", product);
                                Dba.A0k(activity2, intent);
                                return;
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        0qQ.A0F("sectionGroup");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
