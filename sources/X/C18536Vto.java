package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Vto  reason: case insensitive filesystem */
public final class C18536Vto {
    public static final C18536Vto A00 = new Object();

    public final void A00(AnonymousClass0iw r15, UserSession userSession, VYV vyv, C18065Vkr vkr, UAW uaw, XCC xcc, C17661Vbr vbr, C16271UrY urY, C18044VkS vkS) {
        UserSession userSession2 = userSession;
        VYV vyv2 = vyv;
        AnonymousClass7TG.A1N(userSession2, vyv2);
        UAW uaw2 = uaw;
        XCC xcc2 = xcc;
        C17661Vbr vbr2 = vbr;
        C16271UrY urY2 = urY;
        C18065Vkr vkr2 = vkr;
        C51974G9v.A1S(urY2, vbr2, vkr2, uaw2, xcc2);
        C18044VkS vkS2 = vkS;
        AnonymousClass7TF.A1F(r15, 7, vkS2);
        C18535Vtn vtn = C18535Vtn.A00;
        C17533VZm vZm = vyv2.A02;
        new C18464VsD(userSession2, xcc2, vkS2);
        vtn.A00(r15, userSession2, vZm, uaw2, C18464VsD.A00(urY2, vbr2, new C20704Wxb(19, vbr2, urY2, xcc2)));
        if (vbr2.A00 != Uw7.A02) {
            vkr2.A01(vyv2.A03);
        }
        MediaFrameLayout mediaFrameLayout = vyv2.A03;
        Context context = vyv2.A00;
        C13989Tnp.A0z(context, mediaFrameLayout, vbr2.A04.A0J, 2131963319);
        ExtendedImageUrl A002 = urY2.A00(context);
        if (A002 != null) {
            vyv2.A01.setUrl(A002, r15);
        }
        C13989Tnp.A1B(vyv2.A01, vbr2.A00, Uw7.PLAYING, true);
    }
}
