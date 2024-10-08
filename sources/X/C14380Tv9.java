package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.Tv9  reason: case insensitive filesystem */
public final class C14380Tv9 extends C14381TvA {
    public final C14369Tuy A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        ShimmerFrameLayout A01 = C241123Ny.A00.A01(AnonymousClass7TE.A0S(viewGroup), viewGroup);
        0qQ.A0C(A01, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View childAt = A01.getChildAt(0);
        0qQ.A0C(childAt, "null cannot be cast to non-null type com.instagram.igds.components.shimmer.placeholder.GridShimmeringPlaceholderView");
        return new C14423Tvs(A01, (C14422Tvr) childAt);
    }

    public final Class modelClass() {
        return C14386TvF.class;
    }

    public C14380Tv9(C14369Tuy tuy, boolean z) {
        super(z);
        this.A00 = tuy;
    }

    /* renamed from: A01 */
    public final void bind(C14423Tvs tvs, C14386TvF tvF) {
        AnonymousClass7TG.A1N(tvF, tvs);
        C14422Tvr tvr = tvs.A00;
        tvr.setLayoutType(tvF.A01);
        C14369Tuy tuy = this.A00;
        if (tuy != null) {
            tuy.A00.A05(tvr, DbU.A0a(tuy.A01, AnonymousClass30Y.A00(tvF, C60340gF.A00, String.valueOf(tvF.getKey()))));
        }
        super.bind(tvs, tvF);
    }
}
