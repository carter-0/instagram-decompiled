package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uhe  reason: case insensitive filesystem */
public final class C15733Uhe extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C14835UBo(DbT.A0D(layoutInflater, viewGroup, R.layout.gap_binder_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        int dimensionPixelSize;
        UO2 uo2 = (UO2) r4;
        C14835UBo uBo = (C14835UBo) r5;
        AnonymousClass7TG.A1N(uo2, uBo);
        View view = uBo.A00;
        Integer num = uo2.A02;
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            dimensionPixelSize = view.getResources().getDimensionPixelSize(uo2.A00);
        }
        if (dimensionPixelSize != view.getLayoutParams().height) {
            0nA.A0V(view, dimensionPixelSize);
        }
        Integer num2 = uo2.A01;
        if (num2 != null) {
            DbT.A16(view.getContext(), view, num2.intValue());
        }
    }

    public final Class modelClass() {
        return UO2.class;
    }
}
