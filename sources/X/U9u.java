package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.Collections;
import java.util.List;

public final class U9u extends 2Rw {
    public C20926X4r A00;
    public VariantSelectorModel A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return new UDX(DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.non_visual_variant_selector_item, false), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r9 == r0.A05) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r8, int r9) {
        /*
            r7 = this;
            X.UDX r8 = (X.UDX) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r7.A01
            X.0qQ.A0A(r0)
            com.instagram.model.shopping.ProductVariantDimension r5 = r0.A08
            X.0qQ.A07(r5)
            java.lang.Integer r3 = r7.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r7.A01
            if (r3 != r2) goto L_0x0071
            X.0qQ.A0A(r0)
            java.util.List r0 = r0.A00
        L_0x001d:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r4 = X.AnonymousClass7TE.A19(r0, r9)
            X.0qQ.A0A(r4)
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r7.A01
            X.0qQ.A0A(r0)
            int r1 = r0.A06
            if (r1 >= 0) goto L_0x006c
            r1 = 0
        L_0x0032:
            r6 = 1
            boolean r0 = X.AnonymousClass7TF.A1W(r3, r2)
            if (r1 != r0) goto L_0x006a
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r7.A01
            X.0qQ.A0A(r0)
            int r0 = r0.A05
            if (r9 != r0) goto L_0x006a
        L_0x0042:
            X.X4r r3 = r7.A00
            r0 = 2
            X.0qQ.A0B(r4, r0)
            android.widget.TextView r0 = r8.A02
            r0.setText(r4)
            X.3oV r2 = r8.A03
            r1 = 8
            int r0 = X.C13988Tno.A0E(r6)
            r2.setVisibility(r0)
            android.view.View r0 = r8.A00
            r0.setVisibility(r1)
            android.widget.FrameLayout r2 = r8.A01
            r1 = 10
            X.WB5 r0 = new X.WB5
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r5, (java.lang.String) r4, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x006a:
            r6 = 0
            goto L_0x0042
        L_0x006c:
            boolean[] r0 = r0.A0B
            boolean r1 = r0[r1]
            goto L_0x0032
        L_0x0071:
            X.0qQ.A0A(r0)
            java.util.List r0 = r0.A01
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9u.onBindViewHolder(X.3kE, int):void");
    }

    public U9u(Integer num) {
        this.A02 = num;
    }

    public final int getItemCount() {
        List list;
        int size;
        int i;
        int A03 = AnonymousClass0fD.A03(1823405270);
        VariantSelectorModel variantSelectorModel = this.A01;
        if (variantSelectorModel == null) {
            size = 0;
            i = -1009301782;
        } else {
            if (this.A02 == AnonymousClass05K.A00) {
                0qQ.A0A(variantSelectorModel);
                list = variantSelectorModel.A00;
            } else {
                0qQ.A0A(variantSelectorModel);
                list = variantSelectorModel.A01;
            }
            size = Collections.unmodifiableList(list).size();
            i = 773325984;
        }
        AnonymousClass0fD.A0A(i, A03);
        return size;
    }
}
