package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uec  reason: case insensitive filesystem */
public final class C15548Uec extends C231632rz {
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
        C16272UrZ urZ;
        C18044VkS vkS;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(-577187454);
        View view2 = view;
        AnonymousClass7TF.A1B(view2, 1, obj4);
        0qQ.A0B(obj3, 3);
        int i2 = i;
        if (i == 0) {
            UserSession userSession = this.A02;
            Object tag = view2.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselPhotoMediaViewBinder.Holder");
            VWR vwr = (VWR) tag;
            urZ = (C16272UrZ) obj4;
            C17661Vbr vbr = (C17661Vbr) obj3;
            UAW uaw = this.A04;
            XCC xcc = this.A05;
            AnonymousClass0iw r14 = this.A01;
            vkS = this.A00;
            0qQ.A0B(userSession, 0);
            AnonymousClass7TF.A1B(vwr, 1, urZ);
            C51974G9v.A0d(3, vbr, uaw, xcc, r14);
            0qQ.A0B(vkS, 7);
            C19514Wb0 wb0 = vwr.A02;
            0qQ.A0B(wb0, 1);
            1Xj r4 = urZ.A00;
            C18712Vyi.A00(r14, userSession, r4, wb0, uaw, xcc, urZ, vbr, vkS, new C20704Wxb(17, vbr, urZ, xcc));
            C18720Vyu.A00(userSession, r4, vwr, vbr);
        } else if (i2 == 1) {
            C18762Vzx vzx = C18762Vzx.A00;
            UserSession userSession2 = this.A02;
            Object tag2 = view2.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselVideoMediaViewBinder.Holder");
            urZ = (C16272UrZ) obj4;
            C18065Vkr vkr = this.A03;
            UAW uaw2 = this.A04;
            XCC xcc2 = this.A05;
            AnonymousClass0iw r5 = this.A01;
            vkS = this.A00;
            vzx.A01(r5, userSession2, (VYW) tag2, vkr, uaw2, xcc2, urZ, (C17661Vbr) obj3, vkS);
        } else {
            IllegalStateException A0b = DbW.A0b("Unsupported view type: ", i2);
            AnonymousClass0fD.A0A(-347461686, A032);
            throw A0b;
        }
        vkS.A00(view2, urZ.A02);
        AnonymousClass0fD.A0A(-577979575, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C16272UrZ urZ = (C16272UrZ) obj;
        C17661Vbr vbr = (C17661Vbr) obj2;
        boolean A1b = C51973G9u.A1b(r4, urZ, vbr);
        int ordinal = urZ.A00.BR7().ordinal();
        if (ordinal == 0) {
            r4.A7V(0, urZ, vbr);
            this.A00.A01(urZ, vbr);
        } else if (ordinal == A1b) {
            r4.A7V(A1b ? 1 : 0, urZ, vbr);
            this.A00.A02(urZ, vbr);
        }
    }

    public C15548Uec(AnonymousClass0iw r1, UserSession userSession, C18065Vkr vkr, UAW uaw, XCC xcc, C18044VkS vkS) {
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
        int A032 = AnonymousClass0fD.A03(-470175025);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A0A = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.hero_carousel_media_photo, false);
            vwr = new VWR(A0A);
        } else if (i == 1) {
            A0A = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.hero_carousel_media_video, false);
            vwr = new VYW(A0A);
        } else {
            IllegalStateException A0b = DbW.A0b("Unsupported view type: ", i);
            AnonymousClass0fD.A0A(-774840910, A032);
            throw A0b;
        }
        A0A.setTag(vwr);
        AnonymousClass0fD.A0A(1111001535, A032);
        return A0A;
    }
}
