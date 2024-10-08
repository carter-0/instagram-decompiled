package X;

import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.6q8  reason: invalid class name and case insensitive filesystem */
public abstract class C319156q8 {
    public final int A00;
    public final C323256xC A01;
    public final C319176qA A02;
    public final String A03;
    public final String A04;

    public static final void A00(C319156q8 r9) {
        C323256xC r0 = r9.A01;
        String str = r9.A04;
        C319976rX.A08(r0.A07, r0.A09, C319986rY.SELF, str, r0.A0I, r0.A0G, r0.A0H, "bottom_sheet_menu");
    }

    public G5B A01() {
        G5B g5b;
        G5B g5b2;
        if (this instanceof C319256qI) {
            UserSession userSession = this.A01.A09;
            1Av A002 = 1Au.A00(userSession);
            if (((Boolean) A002.A5g.CDM(A002, 1Av.A8a[222])).booleanValue() || !182.A06(0Tu.A05, userSession, 36317427411915896L)) {
                g5b2 = C50691Fgq.A00;
            } else {
                g5b2 = C50690Fgp.A00;
            }
            return g5b2;
        } else if (!(this instanceof C319266qJ)) {
            return C50691Fgq.A00;
        } else {
            int A022 = this.A01.A02();
            if (A022 > 0) {
                g5b = new C50692Fgr(A022);
            } else {
                g5b = C50691Fgq.A00;
            }
            return g5b;
        }
    }

    public void A02() {
        C309516Yo r1;
        FragmentActivity fragmentActivity;
        AnonymousClass6W8 r5;
        if (this instanceof C319266qJ) {
            C323256xC r6 = this.A01;
            UserSession userSession = r6.A09;
            2aT A002 = 2aN.A00(userSession).A00();
            2aX r12 = new 2aX(2aD.A0F, r6.A02());
            AnonymousClass2g1 r0 = AnonymousClass2g1.PROFILE_MENU;
            C226252fx r7 = C226252fx.NUMBERED;
            A002.A01(r7, r0, r12);
            2aV A012 = 2aN.A00(userSession).A01();
            2aX r4 = new 2aX(2aD.A0b, r6.A02());
            AnonymousClass2g1 r13 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
            0qQ.A0B(r13, 0);
            A012.A03(new C239993Jd(r7, r13, (C71062aE) null, (Set) null), r4, false);
            0xY AR4 = 1Au.A00(userSession).A01.AR4();
            AR4.E5T("has_tapped_on_favorites_profile_navbar_icon", true);
            AR4.apply();
            r6.A08.CfX(C62574Ki7.SELF_PROFILE_NAV_BUTTON, false, false);
        } else if (this instanceof C319236qG) {
            C323256xC r02 = this.A01;
            C250563lf.A0b(r02.A06, r02.A09, AnonymousClass05K.A1I);
        } else {
            if (this instanceof C319146q7) {
                C323256xC r3 = this.A01;
                UserSession userSession2 = r3.A09;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession2, 36316564124340727L)) {
                    C317816nt.A00(userSession2).A09(r3.A05, userSession2, (G75) null, "IG_FB_RIGHT_BEFORE_LOGOUT_SSO_UPSELL", (String) null, true, false);
                }
                if (182.A06(r2, userSession2, 36324526992339079L)) {
                    FCT.A02(userSession2, "settings", "bloks_settings_entrypoint_click_event");
                    FCS.A01(userSession2, r3.A06);
                    return;
                }
                FCT.A02(userSession2, "settings", "settings_2_entrypoint_click_event");
                r1 = new C309516Yo(r3.A06, userSession2);
                r1.A0F = true;
                r1.A0E(Eq6.A00(C21251XQw.MAIN_SETTINGS_SCREEN, (String) null));
                r1.A0A = "UserOptionsFragment.USER_OPTIONS_FRAGMENT_BACKSTATE_NAME";
            } else if (this instanceof C319226qF) {
                C323256xC r03 = this.A01;
                C55115HcO.A00().A04(r03.A06, r03.A09);
                return;
            } else {
                if (this instanceof C319216qE) {
                    C323256xC r32 = this.A01;
                    Bundle A003 = C343547qO.A00((RectF) null, EWD.PROFILE_NAV_ICON, false);
                    fragmentActivity = r32.A06;
                    r5 = new AnonymousClass6W8(fragmentActivity, A003, r32.A09, TransparentModalActivity.class, "nametag");
                } else if (this instanceof C319256qI) {
                    C323256xC r42 = this.A01;
                    UserSession userSession3 = r42.A09;
                    0wc A013 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession3);
                    0Aj A004 = A013.A00(A013.A00, "ig_native_meta_verified_profile_menu_click");
                    if (A004.isSampled()) {
                        A004.Cgf();
                    }
                    F6X.A00(r42.A07, new FVQ(r42), userSession3, "nme_ig_slideout_menu");
                    1Av A005 = 1Au.A00(userSession3);
                    A005.A5g.Epx(A005, true, 1Av.A8a[222]);
                    return;
                } else if (this instanceof C319276qK) {
                    C323256xC r14 = this.A01;
                    r14.A08.A04(r14.A0A.getModuleName(), r14.A0F, "settings");
                    return;
                } else if (this instanceof C319246qH) {
                    C323256xC r8 = this.A01;
                    UserSession userSession4 = r8.A09;
                    2aT A006 = 2aN.A00(userSession4).A00();
                    2aX r04 = new 2aX(2aD.A0L, 0);
                    AnonymousClass2g1 r52 = AnonymousClass2g1.PROFILE_MENU;
                    C226252fx r43 = C226252fx.NUMBERED;
                    A006.A01(r43, r52, r04);
                    2aV A014 = 2aN.A00(userSession4).A01();
                    2aX r22 = new 2aX(2aD.A0b, 0);
                    0qQ.A0B(r52, 0);
                    A014.A03(new C239993Jd(r43, r52, (C71062aE) null, (Set) null), r22, false);
                    Bundle bundle = new Bundle();
                    bundle.putString("referrer", "profile_menu");
                    r1 = new C309516Yo(r8.A06, userSession4);
                    r1.A0E(SAY.A00(bundle));
                } else if (this instanceof C319206qD) {
                    C323256xC r23 = this.A01;
                    0lg r44 = r23.A09;
                    C319976rX.A08(r23.A07, r44, C319986rY.SELF, "tap_archive", r23.A0I, r23.A0G, r23.A0H, "user_profile_header");
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("is_in_archive_home", true);
                    if (r23.A0C != null) {
                        bundle2.putBoolean("is_archive_home_badged", false);
                    }
                    fragmentActivity = r23.A06;
                    r5 = new AnonymousClass6W8(fragmentActivity, bundle2, r44, ModalActivity.class, "archive_home");
                } else {
                    C323256xC r53 = this.A01;
                    FragmentActivity fragmentActivity2 = r53.A06;
                    String string = fragmentActivity2.getString(2131952193);
                    0qQ.A07(string);
                    C46649DiU A042 = C46649DiU.A04("com.instagram.privacy.activity_center.activity_center_entry_business_screen", new HashMap());
                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) r53.A09);
                    igBloksScreenConfig.A0U = string;
                    A042.A0D(fragmentActivity2, igBloksScreenConfig);
                    return;
                }
                r5.A07();
                r5.A0C(fragmentActivity);
                return;
            }
            r1.A04();
        }
    }

    public C319156q8(C323256xC r3, C319176qA r4, String str, int i) {
        this.A00 = i;
        this.A02 = r4;
        this.A04 = str;
        this.A01 = r3;
        this.A03 = 002.A0H(r4.A00(), ':', i);
    }

    public void A03() {
        A02();
    }

    public C319156q8(C323256xC r2, String str, int i, int i2) {
        this(r2, (C319176qA) new C319166q9(i2), str, i);
    }
}
