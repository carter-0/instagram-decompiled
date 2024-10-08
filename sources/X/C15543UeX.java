package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.UeX  reason: case insensitive filesystem */
public final class C15543UeX extends C231632rz {
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

    public C15543UeX(AnonymousClass0iw r1, UserSession userSession, UAW uaw, XCC xcc, C18044VkS vkS) {
        this.A03 = userSession;
        this.A04 = uaw;
        this.A01 = vkS;
        this.A00 = xcc;
        this.A02 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-1792626937);
        View view2 = view;
        Object obj3 = obj;
        AnonymousClass7TF.A1B(view2, 1, obj3);
        Object obj4 = obj2;
        0qQ.A0B(obj4, 3);
        UserSession userSession = this.A03;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselProductImageViewBinder.Holder");
        UDH udh = (UDH) tag;
        XCC xcc = this.A00;
        C18044VkS vkS = this.A01;
        C18464VsD vsD = new C18464VsD(userSession, xcc, vkS);
        C16273Ura ura = (C16273Ura) obj3;
        C17661Vbr vbr = (C17661Vbr) obj4;
        C20704Wxb wxb = new C20704Wxb(18, this, obj4, obj3);
        boolean A1S = DbW.A1S(1, ura, vbr);
        vsD.A02.A01(ura, vbr);
        String str = ura.A01;
        String str2 = vbr.A04.A0J;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = ura.A02;
        C19275WSi A002 = C18464VsD.A00(ura, vbr, wxb);
        0qQ.A0B(str2, 1);
        UAW uaw = this.A04;
        AnonymousClass0iw r14 = this.A02;
        0qQ.A0B(userSession, A1S ? 1 : 0);
        0qQ.A0B(udh, 1);
        0qQ.A0B(uaw, 3);
        0qQ.A0B(r14, 4);
        C18535Vtn.A00.A00(r14, userSession, udh.A02, uaw, A002);
        if (str3 != null) {
            udh.A01.A0K = str3;
        }
        Context context = udh.A00;
        0qQ.A07(context);
        ExtendedImageUrl A003 = A002.A00(context);
        if (A003 != null) {
            udh.A01.setUrl(A003, r14);
        }
        C13989Tnp.A0z(context, udh.A01, str2, 2131963318);
        vkS.A00(view2, str);
        AnonymousClass0fD.A0A(-1609893647, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 831604054);
        View A09 = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.hero_carousel_product_image, false);
        A09.setTag(new UDH(A09));
        AnonymousClass0fD.A0A(-604837778, A042);
        return A09;
    }
}
