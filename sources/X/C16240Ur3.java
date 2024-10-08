package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;

/* renamed from: X.Ur3  reason: case insensitive filesystem */
public final class C16240Ur3 extends C15368UbL {
    public static final String __redex_internal_original_name = "ThumbnailImageVariantSelectorFragment";
    public final UA4 A00 = new UA4(this);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "thumbnail_image_variant_selector";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(443494764);
        0qQ.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            View inflate = layoutInflater.inflate(R.layout.thumbnail_image_variant_selector_drawer, viewGroup, false);
            int i = bundle2.getInt("arg_fixed_height");
            if (i > 0) {
                0qQ.A0A(inflate);
                0nA.A0V(inflate, i);
            }
            RecyclerView A0c = JTR.A0c(inflate, R.id.variant_selector_recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            linearLayoutManager.A0v(true);
            A0c.setLayoutManager(linearLayoutManager);
            JTP.A1D(A0c, AnonymousClass7TG.A02(requireContext()), JTR.A05(requireContext()));
            VariantSelectorModel variantSelectorModel = (VariantSelectorModel) bundle2.getParcelable("variant_selector_model");
            if (variantSelectorModel != null) {
                UA4 ua4 = this.A00;
                boolean z = bundle2.getBoolean("arg_disable_sold_out");
                boolean[] zArr = variantSelectorModel.A0B;
                int length = zArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (!zArr[i2]) {
                        ua4.A03 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                ua4.A05 = variantSelectorModel.A09;
                ua4.A06 = variantSelectorModel.A0A;
                ua4.A07 = zArr;
                ua4.A00 = variantSelectorModel.A06;
                ua4.A01 = variantSelectorModel.A08;
                ua4.A04 = z;
                ua4.notifyDataSetChanged();
            }
            A0c.setAdapter(this.A00);
            Context context = inflate.getContext();
            int A09 = (0nA.A09(context) / 2) - (context.getResources().getDimensionPixelSize(R.dimen.dynamic_ads_picker_padding_top) / 2);
            if (variantSelectorModel != null) {
                linearLayoutManager.A1p(variantSelectorModel.A06, A09);
            }
            AnonymousClass0fD.A09(-373209328, A02);
            return inflate;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1982916599, A02);
        throw A0y;
    }
}
