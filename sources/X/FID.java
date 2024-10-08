package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

public final class FID implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass35M A00;
    public final /* synthetic */ Integer A01;

    public final void onClick(DialogInterface dialogInterface, int i) {
        Fragment fragment;
        UserSession userSession;
        UserSession userSession2;
        User user;
        UserSession userSession3;
        User user2;
        User user3;
        UserSession userSession4;
        User user4;
        UserSession userSession5;
        User user5;
        0qQ.A0B(dialogInterface, 0);
        AnonymousClass35M r4 = this.A00;
        WeakReference weakReference = r4.A03;
        FragmentActivity fragmentActivity = null;
        if (weakReference != null) {
            fragment = (Fragment) weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference weakReference2 = r4.A04;
        if (weakReference2 != null) {
            fragmentActivity = (FragmentActivity) weakReference2.get();
        }
        Integer num = this.A01;
        switch (num.intValue()) {
            case 0:
            case 5:
                if (fragmentActivity != null && (userSession5 = r4.A01) != null && (user5 = r4.A02) != null) {
                    W3r.A0F(userSession5, "instagram_shopping_post_onboarding_nux_tag_product_button_clicked", user5.A03.Btq());
                    C50348FZf fZf = new C50348FZf(r4, 9);
                    UserSession userSession6 = r4.A01;
                    0qQ.A0A(userSession6);
                    EXF exf = EXF.A0X;
                    String string = fragmentActivity.getString(2131973798);
                    0qQ.A0B(userSession6, 2);
                    AnonymousClass36R.A00(fragmentActivity, userSession6, fZf).Ewb(exf, AnonymousClass36W.FOLLOWERS_SHARE);
                    AnonymousClass6SR.A01().A0X = true;
                    AnonymousClass6SR.A01().A0D = string;
                    return;
                }
                return;
            case 1:
                if (fragmentActivity != null && fragment != null && (userSession4 = r4.A01) != null && (user4 = r4.A02) != null) {
                    String Btq = user4.A03.Btq();
                    String A002 = AnonymousClass000.A00(80);
                    W3r.A0F(userSession4, "instagram_shopping_post_onboarding_nux_add_product_to_shop_button_clicked", Btq);
                    C249713kF r6 = C249713kF.A00;
                    UserSession userSession7 = r4.A01;
                    0qQ.A0A(userSession7);
                    r6.A0a(fragmentActivity, fragment, userSession7, r4.A05, A002);
                    return;
                }
                return;
            case 2:
                if (fragmentActivity != null && r4.A01 != null && (user3 = r4.A02) != null) {
                    List A0T = user3.A0T();
                    if (A0T != null) {
                        EWE ewe = EWE.POST_ONBOARDING_NUX;
                        if (A0T.contains(ewe) && num == AnonymousClass05K.A0C) {
                            C249713kF r62 = C249713kF.A00;
                            UserSession userSession8 = r4.A01;
                            0qQ.A0A(userSession8);
                            r62.A1D(fragmentActivity, userSession8, r4.A05, ewe.toString(), (String) null, (String) null, true, false, false);
                            return;
                        }
                    }
                    UserSession userSession9 = r4.A01;
                    if (userSession9 != null) {
                        User user6 = r4.A02;
                        0qQ.A0A(user6);
                        String Btq2 = user6.A03.Btq();
                        String A003 = AnonymousClass000.A00(80);
                        W3r.A0F(userSession9, "instagram_shopping_post_onboarding_nux_add_product_to_catalog_button_clicked", Btq2);
                        UserSession userSession10 = r4.A01;
                        if (userSession10 == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        } else if (r4.A02 != null) {
                            C324476zN.A0P(fragmentActivity, userSession10, A003, "feed_post_onboard_nux_dialog", true);
                            return;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    return;
                }
            case 3:
                if (fragmentActivity != null && fragment != null && (userSession3 = r4.A01) != null && (user2 = r4.A02) != null) {
                    String Btq3 = user2.A03.Btq();
                    String A004 = AnonymousClass000.A00(80);
                    W3r.A0F(userSession3, "instagram_shopping_post_onboarding_nux_finish_checkout_setup_button_clicked", Btq3);
                    C324476zN.A0Q(fragmentActivity, r4.A01, "feed_post_onboard_nux_dialog", A004, false);
                    return;
                }
                return;
            case 4:
                if (fragmentActivity != null && fragment != null && (userSession2 = r4.A01) != null && (user = r4.A02) != null) {
                    String Btq4 = user.A03.Btq();
                    String A005 = AnonymousClass000.A00(80);
                    W3r.A0F(userSession2, "instagram_shopping_post_onboarding_nux_add_payout_info_button_clicked", Btq4);
                    C324476zN.A0Q(fragmentActivity, r4.A01, "feed_post_onboard_nux_dialog", A005, true);
                    return;
                }
                return;
            case 6:
            case 7:
                if (fragmentActivity != null && (userSession = r4.A01) != null) {
                    C324476zN.A0H(fragmentActivity, userSession, "feed_post_onboard_nux_dialog", AnonymousClass000.A00(80));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public FID(AnonymousClass35M r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }
}
