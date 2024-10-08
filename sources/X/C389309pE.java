package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9pE  reason: invalid class name and case insensitive filesystem */
public final class C389309pE extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;

    public C389309pE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DsH(AnonymousClass5Gv r10) {
        0xa r3;
        0xY r2;
        String str;
        switch (this.A00) {
            case 0:
                ((C338677iL) this.A01).A03 = true;
                break;
            case 1:
                ((C349057zW) this.A01).A02 = true;
                break;
            case 2:
                C353798Jc.A0e = true;
                r3 = AnonymousClass0xl.A00(C61170le.A00).A00;
                r2 = r3.AR4();
                str = "create_mode_colour_wheel_tooltip_impressions";
                break;
            default:
                UserSession userSession = (UserSession) this.A01;
                0xa A0q = AnonymousClass7TE.A0q(userSession);
                0xY AR4 = A0q.AR4();
                AR4.E5Z("feed_last_server_xposting_turn_on_time_in_second", A0q.getInt("xpost_to_facebook_feed_server_mtime_in_second", 0));
                AR4.apply();
                0xa A0q2 = AnonymousClass7TE.A0q(userSession);
                AnonymousClass7TG.A1L(A0q2.AR4(), A0q2, "fb_currently_sharing_feed_tooltip_show_times", 0);
                boolean A03 = C363388je.A03(C363388je.A00(userSession).A00(CallerContext.A01(AnonymousClass000.A00(2190))));
                AnonymousClass818 r5 = AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP;
                AnonymousClass819 r4 = AnonymousClass819.TOOLTIP_CURRENTLY_SHARING_FEED;
                C368278sM r32 = C368278sM.VIEW;
                0bb r22 = new 0bb();
                r22.A09(Boolean.valueOf(A03));
                r22.A05("impression_count", Long.valueOf((long) AnonymousClass7TE.A0q(userSession).getInt("fb_currently_sharing_feed_tooltip_show_times", 0)));
                C368288sN.A00(r5, r32, r4, r22, userSession);
                return;
        }
        r3 = AnonymousClass0xl.A00(C61170le.A00).A00;
        r2 = r3.AR4();
        str = "text_animation_button_tooltip_impressions";
        AnonymousClass7TG.A1L(r2, r3, str, 0);
    }
}
