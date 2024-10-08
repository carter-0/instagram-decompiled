package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.shopping.productfeed.ProductTileMedia;

/* renamed from: X.UeW  reason: case insensitive filesystem */
public final class C15542UeW extends C231632rz {
    public final C18044VkS A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final UAW A03;
    public final XCC A04;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(46777821);
        View view2 = view;
        int A022 = DbW.A02(1, view2, obj4);
        0qQ.A0B(obj3, 3);
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselMediaPreviewViewBinder.Holder");
        UDG udg = (UDG) tag;
        UserSession userSession = this.A02;
        XCC xcc = this.A04;
        C18044VkS vkS = this.A00;
        C18464VsD vsD = new C18464VsD(userSession, xcc, vkS);
        C16270UrX urX = (C16270UrX) obj4;
        C17661Vbr vbr = (C17661Vbr) obj3;
        C20657Wwp wwp = C20657Wwp.A00;
        boolean A1S = DbW.A1S(1, urX, vbr);
        0qQ.A0B(wwp, A022);
        vsD.A02.A01(urX, vbr);
        String A012 = urX.A01();
        ProductTileMedia productTileMedia = urX.A00;
        String str = productTileMedia.A03;
        productTileMedia.A01.getUsername();
        C19275WSi A002 = C18464VsD.A00(urX, vbr, wwp);
        UAW uaw = this.A03;
        AnonymousClass0iw r13 = this.A01;
        0qQ.A0B(udg, A1S ? 1 : 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(uaw, 3);
        0qQ.A0B(r13, 4);
        C18535Vtn.A00.A00(r13, userSession, udg.A02.A02, uaw, A002);
        IgProgressImageView igProgressImageView = udg.A01;
        igProgressImageView.setMiniPreviewPayload(str);
        ExtendedImageUrl A003 = A002.A00(udg.A00);
        if (A003 != null) {
            igProgressImageView.setUrl(A003, r13);
        } else {
            igProgressImageView.A04();
        }
        vkS.A00(view2, A012);
        AnonymousClass0fD.A0A(-242216698, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C18001Vjd vjd = (C18001Vjd) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        C51973G9u.A1E(r2, vjd, vbr);
        r2.A7U(0);
        this.A00.A01(vjd, vbr);
    }

    public C15542UeW(AnonymousClass0iw r1, UserSession userSession, UAW uaw, XCC xcc, C18044VkS vkS) {
        this.A02 = userSession;
        this.A03 = uaw;
        this.A00 = vkS;
        this.A04 = xcc;
        this.A01 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, -378455258);
        View A09 = DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.hero_carousel_media_photo, false);
        A09.setTag(new UDG(A09));
        AnonymousClass0fD.A0A(540734893, A042);
        return A09;
    }
}
