package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Dh3  reason: case insensitive filesystem */
public final class C46561Dh3 extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C46566Dh8 dh8 = new C46566Dh8(DbU.A09(layoutInflater, viewGroup, R.layout.row_divider_dynamic_margin, false));
        View view = dh8.A00;
        view.setBackgroundResource(2Yu.A0H(view.getContext(), R.attr.igds_color_separator));
        return dh8;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        View view;
        C46565Dh7 dh7 = (C46565Dh7) r4;
        C46566Dh8 dh8 = (C46566Dh8) r5;
        0qQ.A0B(dh7, 0);
        0qQ.A0B(dh8, 1);
        int ordinal = dh7.A00.ordinal();
        if (ordinal == 3) {
            View view2 = dh8.A01;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, DbY.A01(view2.getContext()));
            }
        } else if (ordinal == 4 && (view = dh8.A01) != null) {
            int A03 = AnonymousClass7TG.A03(view.getContext());
            view.setPadding(0, A03, 0, A03);
        }
    }

    public final Class modelClass() {
        return C46565Dh7.class;
    }
}
