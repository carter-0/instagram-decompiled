package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class UeV extends C231632rz {
    public final XCC A00;
    public final C18044VkS A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final UAW A04;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj2;
        int A032 = AnonymousClass0fD.A03(-704456776);
        View view2 = view;
        Object obj4 = obj;
        AnonymousClass7TF.A1B(view2, 1, obj4);
        0qQ.A0B(obj3, 3);
        UserSession userSession = this.A03;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselARViewBinder.Holder");
        UDW udw = (UDW) tag;
        XCC xcc = this.A00;
        C18044VkS vkS = this.A01;
        C18464VsD vsD = new C18464VsD(userSession, xcc, vkS);
        C16276Urd urd = (C16276Urd) obj4;
        C17661Vbr vbr = (C17661Vbr) obj3;
        C20613Wvu wvu = new C20613Wvu(20, this, obj4);
        boolean A1S = DbW.A1S(1, urd, vbr);
        vsD.A02.A01(urd, vbr);
        String str = urd.A02;
        String str2 = urd.A06;
        String str3 = urd.A05;
        C19275WSi A002 = C18464VsD.A00(urd, vbr, wvu);
        UAW uaw = this.A04;
        AnonymousClass0iw r14 = this.A02;
        0qQ.A0B(userSession, A1S ? 1 : 0);
        0qQ.A0B(udw, 1);
        0qQ.A0B(uaw, 3);
        0qQ.A0B(r14, 4);
        C18535Vtn.A00.A00(r14, userSession, udw.A03, uaw, A002);
        udw.A01.setText(str2);
        udw.A00.setText(str3);
        IgImageView igImageView = udw.A02;
        ExtendedImageUrl A003 = A002.A00(AnonymousClass7TE.A0S(igImageView));
        if (A003 != null) {
            igImageView.setUrl(A003, r14);
        } else {
            igImageView.A09();
        }
        vkS.A00(view2, str);
        AnonymousClass0fD.A0A(-1954222064, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C18001Vjd vjd = (C18001Vjd) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        C51973G9u.A1E(r2, vjd, vbr);
        r2.A7U(0);
        this.A01.A01(vjd, vbr);
    }

    public UeV(AnonymousClass0iw r1, UserSession userSession, UAW uaw, XCC xcc, C18044VkS vkS) {
        this.A03 = userSession;
        this.A04 = uaw;
        this.A01 = vkS;
        this.A00 = xcc;
        this.A02 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 1949287861);
        View A09 = DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.hero_carousel_try_in_ar, false);
        A09.setTag(new UDW(A09));
        AnonymousClass0fD.A0A(-2093142873, A042);
        return A09;
    }
}
