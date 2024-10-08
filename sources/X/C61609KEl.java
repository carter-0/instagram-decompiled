package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.KEl  reason: case insensitive filesystem */
public final class C61609KEl extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60578Jnn(DbT.A0D(layoutInflater, viewGroup, R.layout.placeholder_generic, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        int dimensionPixelSize;
        C255943uy r0;
        KGO kgo = (KGO) r4;
        C60578Jnn jnn = (C60578Jnn) r5;
        AnonymousClass7TG.A1N(kgo, jnn);
        ViewGroup.LayoutParams layoutParams = jnn.A00.getLayoutParams();
        Integer num = kgo.A00;
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            Resources resources = jnn.itemView.getResources();
            0qQ.A07(resources);
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.browser_actions_context_menu_max_width);
        }
        layoutParams.height = dimensionPixelSize;
        SpinnerImageView spinnerImageView = jnn.A01;
        if (kgo.A01) {
            r0 = C255943uy.LOADING;
        } else {
            r0 = C255943uy.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(r0);
    }

    public final Class modelClass() {
        return KGO.class;
    }
}
