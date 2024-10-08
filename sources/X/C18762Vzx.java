package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Vzx  reason: case insensitive filesystem */
public final class C18762Vzx {
    public static final C18762Vzx A00 = new Object();

    public static final void A00(VYW vyw, C18065Vkr vkr, C17661Vbr vbr) {
        if (vbr.A00 != Uw7.A02) {
            vkr.A01(vyw.A03);
        }
        C13989Tnp.A0z(vyw.A00, vyw.A03, vbr.A04.A0J, 2131963319);
    }

    public final void A01(AnonymousClass0iw r16, UserSession userSession, VYW vyw, C18065Vkr vkr, UAW uaw, XCC xcc, C16272UrZ urZ, C17661Vbr vbr, C18044VkS vkS) {
        UserSession userSession2 = userSession;
        VYW vyw2 = vyw;
        AnonymousClass7TG.A1N(userSession2, vyw2);
        C18065Vkr vkr2 = vkr;
        UAW uaw2 = uaw;
        XCC xcc2 = xcc;
        C16272UrZ urZ2 = urZ;
        C17661Vbr vbr2 = vbr;
        C51974G9v.A1S(urZ2, vbr2, vkr2, uaw2, xcc2);
        AnonymousClass0iw r5 = r16;
        C18044VkS vkS2 = vkS;
        AnonymousClass7TF.A1F(r5, 7, vkS2);
        C19514Wb0 wb0 = vyw2.A02;
        0qQ.A0B(wb0, 1);
        C18712Vyi.A00(r5, userSession2, urZ2.A00, wb0, uaw2, xcc2, urZ2, vbr2, vkS2, new C20704Wxb(17, vbr2, urZ2, xcc2));
        A00(vyw2, vkr2, vbr2);
        ExtendedImageUrl A002 = urZ2.A00(vyw2.A00);
        if (A002 != null) {
            vyw2.A01.setUrl(A002, r5);
        }
        C13989Tnp.A1B(vyw2.A01, vbr2.A00, Uw7.PLAYING, true);
    }

    public final void A02(AnonymousClass0iw r21, UserSession userSession, VYW vyw, C18065Vkr vkr, UAW uaw, XCC xcc, C17661Vbr vbr, C16274Urb urb, C18044VkS vkS) {
        UserSession userSession2 = userSession;
        VYW vyw2 = vyw;
        AnonymousClass7TG.A1N(userSession2, vyw2);
        C18065Vkr vkr2 = vkr;
        UAW uaw2 = uaw;
        XCC xcc2 = xcc;
        C17661Vbr vbr2 = vbr;
        C16274Urb urb2 = urb;
        C51974G9v.A1S(urb2, vbr2, vkr2, uaw2, xcc2);
        AnonymousClass0iw r5 = r21;
        C18044VkS vkS2 = vkS;
        AnonymousClass7TF.A1F(r5, 7, vkS2);
        C19514Wb0 wb0 = vyw2.A02;
        0qQ.A0B(wb0, 1);
        C18712Vyi.A00(r5, userSession2, urb2.A00, wb0, uaw2, xcc2, urb2, vbr2, vkS2, new C58699Iw8(22, xcc2, urb2, vbr2, wb0));
        A00(vyw2, vkr2, vbr2);
        ExtendedImageUrl A002 = urb2.A00(vyw2.A00);
        if (A002 != null) {
            vyw2.A01.setUrl(A002, r5);
        }
        C13989Tnp.A1B(vyw2.A01, vbr2.A00, Uw7.PLAYING, true);
    }
}
