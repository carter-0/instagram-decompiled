package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.UeY  reason: case insensitive filesystem */
public final class C15544UeY extends C231632rz {
    public final XCC A00;
    public final C18044VkS A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final UAW A04;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C18001Vjd vjd = (C18001Vjd) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        C51973G9u.A1E(r2, vjd, vbr);
        r2.A7U(0);
        this.A01.A01(vjd, vbr);
    }

    public C15544UeY(AnonymousClass0iw r1, UserSession userSession, UAW uaw, XCC xcc, C18044VkS vkS) {
        this.A03 = userSession;
        this.A04 = uaw;
        this.A01 = vkS;
        this.A00 = xcc;
        this.A02 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(619748056);
        View view2 = view;
        Object obj3 = obj;
        int A022 = DbW.A02(1, view2, obj3);
        Object obj4 = obj2;
        0qQ.A0B(obj4, 3);
        UserSession userSession = this.A03;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselSeeAllViewBinder.Holder");
        UDI udi = (UDI) tag;
        XCC xcc = this.A00;
        C18044VkS vkS = this.A01;
        C18464VsD vsD = new C18464VsD(userSession, xcc, vkS);
        C16275Urc urc = (C16275Urc) obj3;
        C17661Vbr vbr = (C17661Vbr) obj4;
        C20704Wxb wxb = new C20704Wxb(20, this, obj4, obj3);
        boolean A1S = DbW.A1S(1, urc, vbr);
        vsD.A02.A01(urc, vbr);
        String str = urc.A02;
        Integer num = urc.A01;
        C19275WSi A002 = C18464VsD.A00(urc, vbr, wxb);
        0qQ.A0B(num, A022);
        UAW uaw = this.A04;
        AnonymousClass0iw r14 = this.A02;
        0qQ.A0B(userSession, A1S ? 1 : 0);
        0qQ.A0B(udi, 1);
        AnonymousClass7TF.A1D(uaw, 3, r14);
        C18535Vtn.A00.A00(r14, userSession, udi.A02, uaw, A002);
        IgdsMediaButton igdsMediaButton = udi.A01;
        igdsMediaButton.setLabel(DbW.A0h(igdsMediaButton.getContext(), num, 2131962228));
        IgImageView igImageView = udi.A00;
        ExtendedImageUrl A003 = A002.A00(AnonymousClass7TE.A0S(igImageView));
        if (A003 != null) {
            igImageView.setUrl(A003, r14);
        }
        vkS.A00(view2, str);
        AnonymousClass0fD.A0A(-2056237136, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, -1938070018);
        View A09 = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.hero_carousel_see_all, false);
        A09.setTag(new UDI(A09));
        AnonymousClass0fD.A0A(-2078477812, A042);
        return A09;
    }
}
