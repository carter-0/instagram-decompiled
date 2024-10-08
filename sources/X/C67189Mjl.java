package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.Mjl  reason: case insensitive filesystem */
public final class C67189Mjl extends C232232tF {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        C67902Mwk mwk = (C67902Mwk) r3;
        0qQ.A0B(mwk, 1);
        mwk.A00.A02();
    }

    public final Class modelClass() {
        return C47769EGg.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_shimmer_placeholder_layout);
        0qQ.A0C(A0C, Pxd.A00(4));
        return new C67902Mwk((ShimmerFrameLayout) A0C);
    }
}
