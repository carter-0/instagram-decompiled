package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ued  reason: case insensitive filesystem */
public final class C15549Ued extends C231632rz {
    public final C18044VkS A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C18065Vkr A03;
    public final UAW A04;
    public final XCC A05;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj2;
        int A032 = AnonymousClass0fD.A03(446922080);
        AnonymousClass7TG.A1U(view, obj, obj3);
        C18536Vto vto = C18536Vto.A00;
        UserSession userSession = this.A02;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselProductVideoViewBinder.Holder");
        C16271UrY urY = (C16271UrY) obj;
        C18065Vkr vkr = this.A03;
        UAW uaw = this.A04;
        XCC xcc = this.A05;
        AnonymousClass0iw r3 = this.A01;
        C18044VkS vkS = this.A00;
        vto.A00(r3, userSession, (VYV) tag, vkr, uaw, xcc, (C17661Vbr) obj3, urY, vkS);
        vkS.A00(view, urY.A01);
        AnonymousClass0fD.A0A(-130315171, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C18001Vjd vjd = (C18001Vjd) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        C51973G9u.A1E(r2, vjd, vbr);
        r2.A7U(0);
        this.A00.A02(vjd, vbr);
    }

    public C15549Ued(AnonymousClass0iw r1, UserSession userSession, C18065Vkr vkr, UAW uaw, XCC xcc, C18044VkS vkS) {
        this.A02 = userSession;
        this.A03 = vkr;
        this.A04 = uaw;
        this.A00 = vkS;
        this.A05 = xcc;
        this.A01 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, -92722506);
        View A0A = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.hero_carousel_product_video, false);
        A0A.setTag(new VYV(A0A));
        AnonymousClass0fD.A0A(843976390, A042);
        return A0A;
    }
}
