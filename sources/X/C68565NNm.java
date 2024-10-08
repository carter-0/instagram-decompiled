package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.NNm  reason: case insensitive filesystem */
public final class C68565NNm extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.trending_prompt_single_card_shimmer_item, viewGroup, false);
        0qQ.A0C(inflate, Pxd.A00(4));
        return new C67922Mx8((ShimmerFrameLayout) inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        C67922Mx8 mx8 = (C67922Mx8) r3;
        0qQ.A0B(mx8, 1);
        mx8.A00.A02();
    }

    public final Class modelClass() {
        return C71955Otg.class;
    }
}
