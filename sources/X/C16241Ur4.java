package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Ur4  reason: case insensitive filesystem */
public final class C16241Ur4 extends C15368UbL {
    public static final String __redex_internal_original_name = "NonVisualVariantSelectorFragment";
    public RecyclerView A00;
    public final C14800U9v A01 = new 2Rw();
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "non_visual_variant_selector";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1371891166);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            int i = bundle2.getInt("arg_fixed_height");
            if (i > 0) {
                0qQ.A0A(inflate);
                0nA.A0V(inflate, i);
                0nA.A0f(inflate, 0nA.A06(requireContext()));
            }
            VariantSelectorModel variantSelectorModel = (VariantSelectorModel) bundle2.getParcelable("variant_selector_model");
            if (variantSelectorModel != null) {
                Context context = getContext();
                String[] strArr = variantSelectorModel.A0A;
                int length = strArr.length;
                int i2 = 1;
                if (length != 1) {
                    if (length != 2) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(0sr.A1P(Arrays.copyOf(strArr, length)));
                        01V.A1D(arrayList, C20379WqK.A00);
                        i2 = 3;
                        if (length != 3) {
                            i2 = 4;
                        }
                        Resources A0R = JTR.A0R(this);
                        int A06 = (((JTT.A06(this) - (AnonymousClass7TE.A0F(A0R) * 2)) - (((JTP.A03(A0R) * 2) * i2) - 1)) - ((AnonymousClass7TE.A0D(A0R) * 2) * i2)) / i2;
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String A18 = AnonymousClass7TE.A18(it);
                            TextPaint textPaint = new TextPaint();
                            C13988Tno.A0t(DbV.A05(this), textPaint, R.dimen.abc_text_size_menu_header_material);
                            AnonymousClass7TE.A1N(requireContext(), textPaint, 2Yu.A07(getContext()));
                            textPaint.setFakeBoldText(true);
                            TextPaint textPaint2 = new TextPaint();
                            C13988Tno.A0t(DbV.A05(this), textPaint2, R.dimen.abc_text_size_menu_header_material);
                            AnonymousClass7TE.A1N(requireContext(), textPaint2, 2Yu.A07(getContext()));
                            textPaint2.setFakeBoldText(true);
                            if (textPaint2.measureText(A18) > ((float) A06)) {
                                break;
                            }
                        }
                    } else {
                        i2 = 2;
                    }
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i2);
                RecyclerView A0K = DbX.A0K(inflate);
                this.A00 = A0K;
                if (A0K != null) {
                    A0K.setLayoutManager(gridLayoutManager);
                    int A023 = DbZ.A02(this);
                    0nA.A0h(A0K, A023, A023);
                    A0K.A11(new C67826MvU(A023, A023));
                    C14800U9v u9v = this.A01;
                    boolean z = bundle2.getBoolean("arg_disable_sold_out");
                    u9v.A01 = variantSelectorModel;
                    u9v.A02 = z;
                    u9v.notifyDataSetChanged();
                    A0K.setAdapter(u9v);
                    A0K.A0o(variantSelectorModel.A06);
                }
            }
            AnonymousClass0fD.A09(-83824118, A022);
            return inflate;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1666716248, A022);
        throw A0y;
    }
}
