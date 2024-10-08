package X;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView;

public final class UEE extends C249703kE {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final View A04;
    public final RecyclerView A05;
    public final L9J A06;
    public final V3E A07;
    public final HeroCarouselScrollbarView A08;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.V3E] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEE(View view, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = view;
        RecyclerView A0c = JTR.A0c(view, R.id.container);
        this.A05 = A0c;
        ViewStub viewStub = (ViewStub) AnonymousClass7TE.A0b(view, R.id.hero_carousel_index_indicator_stub);
        0qQ.A0B(viewStub, 1);
        ? obj = new Object();
        obj.A00 = viewStub;
        this.A07 = obj;
        JTP.A1D(A0c, 0, AnonymousClass7TE.A0D(view.getResources()));
        A0c.setItemAnimator((AnonymousClass3AS) null);
        HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) view.requireViewById(R.id.scrollbar);
        this.A08 = heroCarouselScrollbarView;
        this.A06 = new L9J(view);
        heroCarouselScrollbarView.A02 = z;
        heroCarouselScrollbarView.A01 = new C19650WdE(this);
    }
}
