package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;

/* renamed from: X.U9v  reason: case insensitive filesystem */
public final class C14800U9v extends 2Rw {
    public C20926X4r A00;
    public VariantSelectorModel A01;
    public boolean A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UDX(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.non_visual_variant_selector_item, false), false);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r10, int i) {
        UDX udx = (UDX) r10;
        0qQ.A0B(udx, 0);
        VariantSelectorModel variantSelectorModel = this.A01;
        if (variantSelectorModel != null) {
            ProductVariantDimension productVariantDimension = variantSelectorModel.A08;
            0qQ.A07(productVariantDimension);
            String str = variantSelectorModel.A0A[i];
            0qQ.A04(str);
            boolean A1S = AnonymousClass7TF.A1S(i, variantSelectorModel.A06);
            boolean z = variantSelectorModel.A0B[i];
            boolean z2 = this.A02;
            C20926X4r x4r = this.A00;
            udx.A02.setText(str);
            int i2 = 0;
            udx.A03.setVisibility(C13988Tno.A0E(A1S));
            View view = udx.A00;
            if (z) {
                i2 = 8;
            }
            view.setVisibility(i2);
            if (z || !z2) {
                AnonymousClass0fU.A00(new WB5((Object) x4r, (Object) productVariantDimension, str, 9), udx.A01);
                return;
            }
            udx.A01.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final int getItemCount() {
        int i;
        String[] strArr;
        int A03 = AnonymousClass0fD.A03(311179371);
        VariantSelectorModel variantSelectorModel = this.A01;
        if (variantSelectorModel == null || (strArr = variantSelectorModel.A0A) == null) {
            i = 0;
        } else {
            i = strArr.length;
        }
        AnonymousClass0fD.A0A(2077499795, A03);
        return i;
    }
}
