package X;

import android.content.res.Resources;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ur5  reason: case insensitive filesystem */
public final class C16242Ur5 extends C15368UbL {
    public static final String __redex_internal_original_name = "NonVisualSegregatedVariantSelectorFragment";
    public RecyclerView A00;
    public RecyclerView A01;
    public final U9u A02 = new U9u(AnonymousClass05K.A00);
    public final U9u A03 = new U9u(AnonymousClass05K.A01);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = C13999To1.A00(this, 9);

    public final String getModuleName() {
        return "non_visual_variant_selector";
    }

    private final int A00(VariantSelectorModel variantSelectorModel) {
        String[] strArr = variantSelectorModel.A0A;
        int length = strArr.length;
        if (length == 1) {
            return 1;
        }
        if (length == 2) {
            return 2;
        }
        List A0A = 03t.A0A(new C20373WqD(13), strArr);
        int i = 3;
        if (length != 3) {
            i = 4;
        }
        Resources A0R = JTR.A0R(this);
        int A06 = (((JTT.A06(this) - (AnonymousClass7TE.A0F(A0R) * 2)) - (((JTP.A03(A0R) * 2) * i) - 1)) - ((AnonymousClass7TE.A0D(A0R) * 2) * i)) / i;
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            0qQ.A0A(A18);
            if (((Paint) this.A05.getValue()).measureText(A18) > ((float) A06)) {
                return 2;
            }
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0106, code lost:
        if (X.C13988Tno.A1a(r8.A01) != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = -1653750536(0xffffffff9d6dc4f8, float:-3.146852E-21)
            int r7 = X.AnonymousClass0fD.A02(r0)
            r1 = 0
            X.0qQ.A0B(r13, r1)
            r0 = 2131626986(0x7f0e0bea, float:1.8881224E38)
            android.view.View r9 = X.DbT.A0D(r13, r14, r0, r1)
            android.os.Bundle r1 = r12.mArguments
            X.0qQ.A0A(r1)
            java.lang.Class<com.instagram.shopping.model.variantselector.VariantSelectorModel> r2 = com.instagram.shopping.model.variantselector.VariantSelectorModel.class
            java.lang.String r0 = "variant_selector_model"
            android.os.Parcelable r8 = X.C320236s2.A00(r1, r2, r0)
            com.instagram.shopping.model.variantselector.VariantSelectorModel r8 = (com.instagram.shopping.model.variantselector.VariantSelectorModel) r8
            java.lang.String r0 = "arg_fixed_height"
            int r0 = r1.getInt(r0)
            if (r0 <= 0) goto L_0x0037
            X.0nA.A0V(r9, r0)
            android.content.Context r0 = r12.requireContext()
            int r0 = X.0nA.A06(r0)
            X.0nA.A0f(r9, r0)
        L_0x0037:
            r0 = 2131434632(0x7f0b1c88, float:1.8491083E38)
            androidx.recyclerview.widget.RecyclerView r5 = X.DbZ.A0F(r9, r0)
            r12.A00 = r5
            r0 = 2131441547(0x7f0b378b, float:1.8505109E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.DbZ.A0F(r9, r0)
            r12.A01 = r4
            android.content.Context r3 = r12.getContext()
            int r2 = r12.A00(r8)
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r3, r2)
            r5.setLayoutManager(r0)
            android.content.Context r3 = r12.getContext()
            int r2 = r12.A00(r8)
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r3, r2)
            r4.setLayoutManager(r0)
            int r2 = X.DbZ.A02(r12)
            X.0nA.A0h(r5, r2, r2)
            X.0nA.A0h(r4, r2, r2)
            X.MvU r0 = new X.MvU
            r0.<init>(r2, r2)
            r5.A11(r0)
            X.MvU r0 = new X.MvU
            r0.<init>(r2, r2)
            r4.A11(r0)
            X.U9u r2 = r12.A02
            r2.A01 = r8
            r2.notifyDataSetChanged()
            X.U9u r0 = r12.A03
            r0.A01 = r8
            r0.notifyDataSetChanged()
            r5.setAdapter(r2)
            r4.setAdapter(r0)
            r0 = 2131434633(0x7f0b1c89, float:1.8491085E38)
            android.view.View r6 = r9.findViewById(r0)
            r0 = 2131441550(0x7f0b378e, float:1.8505115E38)
            android.view.View r5 = r9.findViewById(r0)
            r0 = 2131428526(0x7f0b04ae, float:1.8478699E38)
            android.widget.TextView r4 = X.AnonymousClass7TE.A0d(r9, r0)
            r0 = 2131441421(0x7f0b370d, float:1.8504853E38)
            android.view.View r11 = r9.findViewById(r0)
            com.instagram.model.shopping.ProductVariantDimension r3 = r8.A08
            java.lang.String r10 = r3.A03
            X.0qQ.A07(r10)
            java.lang.String r0 = "product"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            r2 = 8
            r11.setVisibility(r2)
            java.lang.String r0 = "Size"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f7
            if (r1 == 0) goto L_0x00f7
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r1.A01
            com.instagram.api.schemas.XFBsizeCalibrationScore r10 = r0.A0A
            android.content.res.Resources r1 = X.JTR.A0R(r12)
            r0 = 3
            r11.setVisibility(r2)
            if (r10 == 0) goto L_0x00f7
            int r10 = r10.ordinal()
            if (r10 == r0) goto L_0x014c
            r0 = 6
            if (r10 == r0) goto L_0x0142
            r0 = 2
            if (r10 != r0) goto L_0x00f7
            r0 = 2131972480(0x7f135180, float:1.9581969E38)
            r1.getString(r0)
            r0 = 2131972479(0x7f13517f, float:1.9581967E38)
        L_0x00f4:
            r1.getString(r0)
        L_0x00f7:
            java.util.List r0 = r8.A00
            boolean r0 = X.C13988Tno.A1a(r0)
            if (r0 != 0) goto L_0x0108
            java.util.List r0 = r8.A01
            boolean r1 = X.C13988Tno.A1a(r0)
            r0 = 0
            if (r1 == 0) goto L_0x010a
        L_0x0108:
            r0 = 8
        L_0x010a:
            r6.setVisibility(r0)
            java.util.List r1 = r8.A01
            boolean r0 = X.C13988Tno.A1a(r1)
            int r0 = X.DbW.A00(r0)
            r5.setVisibility(r0)
            boolean r0 = X.C13988Tno.A1a(r1)
            if (r0 != 0) goto L_0x0121
            r2 = 0
        L_0x0121:
            r4.setVisibility(r2)
            android.content.res.Resources r5 = X.DbV.A05(r12)
            r2 = 2131953558(0x7f130796, float:1.954359E38)
            java.lang.String r1 = r3.A03
            X.0qQ.A07(r1)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = X.DbT.A12(r0, r1)
            X.DbY.A0y(r5, r4, r0, r2)
            r0 = 394298(0x6043a, float:5.52529E-40)
            X.AnonymousClass0fD.A09(r0, r7)
            return r9
        L_0x0142:
            r0 = 2131975543(0x7f135d77, float:1.9588181E38)
            r1.getString(r0)
            r0 = 2131975542(0x7f135d76, float:1.958818E38)
            goto L_0x00f4
        L_0x014c:
            r0 = 2131972482(0x7f135182, float:1.9581973E38)
            r1.getString(r0)
            r0 = 2131972481(0x7f135181, float:1.958197E38)
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16242Ur5.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
