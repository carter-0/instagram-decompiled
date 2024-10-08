package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uee  reason: case insensitive filesystem */
public final class C15550Uee extends C231632rz {
    public final C18044VkS A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C18065Vkr A03;
    public final UAW A04;
    public final XCC A05;

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C16274Urb urb;
        C18044VkS vkS;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(1122242528);
        View view2 = view;
        DbZ.A0t(1, view2, obj4, obj3);
        int i2 = i;
        if (i == 0) {
            UserSession userSession = this.A02;
            Object tag = view2.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselPhotoMediaViewBinder.Holder");
            VWR vwr = (VWR) tag;
            urb = (C16274Urb) obj4;
            C17661Vbr vbr = (C17661Vbr) obj3;
            UAW uaw = this.A04;
            XCC xcc = this.A05;
            AnonymousClass0iw r14 = this.A01;
            vkS = this.A00;
            AnonymousClass7TG.A1N(userSession, vwr);
            C51974G9v.A1S(urb, vbr, uaw, xcc, r14);
            0qQ.A0B(vkS, 7);
            C19514Wb0 wb0 = vwr.A02;
            0qQ.A0B(wb0, 1);
            1Xj r2 = urb.A00;
            1Xj r16 = r2;
            C19514Wb0 wb02 = wb0;
            C18712Vyi.A00(r14, userSession, r16, wb02, uaw, xcc, urb, vbr, vkS, new C58699Iw8(22, xcc, urb, vbr, wb0));
            C18720Vyu.A00(userSession, r2, vwr, vbr);
        } else if (i2 == 1) {
            C18762Vzx vzx = C18762Vzx.A00;
            UserSession userSession2 = this.A02;
            Object tag2 = view2.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselVideoMediaViewBinder.Holder");
            urb = (C16274Urb) obj4;
            C18065Vkr vkr = this.A03;
            UAW uaw2 = this.A04;
            XCC xcc2 = this.A05;
            AnonymousClass0iw r5 = this.A01;
            vkS = this.A00;
            vzx.A02(r5, userSession2, (VYW) tag2, vkr, uaw2, xcc2, (C17661Vbr) obj3, urb, vkS);
        } else {
            IllegalStateException A0b = DbW.A0b("Unsupported view type: ", i2);
            AnonymousClass0fD.A0A(2103785107, A032);
            throw A0b;
        }
        vkS.A00(view2, urb.A02);
        AnonymousClass0fD.A0A(-887000719, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C16274Urb urb = (C16274Urb) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        boolean A1b = C51973G9u.A1b(r4, urb, vbr);
        int ordinal = urb.A00.BR7().ordinal();
        if (ordinal == 0) {
            r4.A7V(0, urb, vbr);
            this.A00.A01(urb, vbr);
        } else if (ordinal == A1b) {
            r4.A7V(A1b ? 1 : 0, urb, vbr);
            this.A00.A02(urb, vbr);
        }
    }

    public C15550Uee(AnonymousClass0iw r1, UserSession userSession, C18065Vkr vkr, UAW uaw, XCC xcc, C18044VkS vkS) {
        this.A02 = userSession;
        this.A03 = vkr;
        this.A04 = uaw;
        this.A00 = vkS;
        this.A05 = xcc;
        this.A01 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0A;
        Object vwr;
        int A032 = AnonymousClass0fD.A03(1685349110);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A0A = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.hero_carousel_media_photo, false);
            vwr = new VWR(A0A);
        } else if (i == 1) {
            A0A = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.hero_carousel_media_video, false);
            vwr = new VYW(A0A);
        } else {
            IllegalStateException A0b = DbW.A0b("Unsupported view type: ", i);
            AnonymousClass0fD.A0A(-537877282, A032);
            throw A0b;
        }
        A0A.setTag(vwr);
        AnonymousClass0fD.A0A(1587003312, A032);
        return A0A;
    }
}
