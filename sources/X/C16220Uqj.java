package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uqj  reason: case insensitive filesystem */
public final class C16220Uqj extends C15732Uhd {
    public final AnonymousClass0iw A00;
    public final C14819UAy A01;
    public final UserSession A02;
    public final C18065Vkr A03;
    public final UAW A04;
    public final XCC A05;
    public final C18044VkS A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16220Uqj(Context context, AnonymousClass0iw r9, C14819UAy uAy, UserSession userSession, 2el r12, W03 w03, W1W w1w, C18065Vkr vkr, XCC xcc, C18020Vjw vjw) {
        super(vjw);
        XCC xcc2 = xcc;
        0qQ.A0B(xcc2, 12);
        this.A02 = userSession;
        this.A01 = uAy;
        this.A03 = vkr;
        this.A00 = r9;
        this.A05 = xcc2;
        this.A04 = new UAW(context, userSession);
        this.A06 = new C18044VkS(userSession, r12, w03, w1w, xcc2, true);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        UserSession userSession = this.A02;
        LayoutInflater A0D = DbV.A0D(viewGroup);
        boolean A1V = AnonymousClass7TF.A1V(userSession);
        View A09 = DbU.A09(A0D, viewGroup, R.layout.hero_carousel_section, false);
        A09.setTag(new UEE(A09, A1V));
        Object tag = A09.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselSectionViewBinder.Holder");
        return (C249703kE) tag;
    }

    public final Class modelClass() {
        return C15082UNz.class;
    }
}
