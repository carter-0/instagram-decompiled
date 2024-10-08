package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.FBk  reason: case insensitive filesystem */
public final class C49884FBk {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r8, UserSession userSession, C49884FBk fBk, FBQ fbq, String str, String str2, int i) {
        C368278sM r0;
        28D r02;
        boolean A1S = AnonymousClass7TF.A1S(i, 1);
        boolean z = !0qQ.A0K(str2, "QP");
        0qQ.A0B(fbq, 3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), "ig_camera_clips_share_to_facebook_primer_selection");
        String str3 = 27p.A01(userSession).A04.A0L;
        if (str3 == null) {
            str3 = "";
        }
        if (A0e.isSampled()) {
            if (z) {
                r02 = 28D.A2C;
            } else {
                r02 = 28D.A48;
            }
            DbS.A1F(r02, A0e);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            A0e.A8M(C59725JVj.NO_CAMERA_SESSION, "surface");
            A0e.A8M(28t.A03, "media_type");
            A0e.A8M(C59793JYm.OTHER, "media_source");
            A0e.A8M(C360948fP.NORMAL, "capture_type");
            A0e.AAJ("camera_session_id", str3);
            DbW.A15(A0e, r8);
            Dbc.A0g(A0e, A1S);
            DbY.A1C(A0e);
            Dba.A19(A0e, "1337");
        }
        if (A1S) {
            r0 = C368278sM.ACCEPT;
        } else {
            r0 = C368278sM.DECLINE;
        }
        FGZ.A02(r0, userSession, fbq);
        if (0qQ.A0K(str2, "PRO_HOME")) {
            fragmentActivity.finish();
        } else {
            DbS.A0M(fragmentActivity, userSession).A0G(str2, 1);
        }
        if (A1S) {
            FGZ.A01(fragmentActivity, r8, userSession, A1S);
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            A0Q.A0A = str2;
            A0Q.A0D(fBk.A02(userSession, str2, str));
            A0Q.A04();
        } else if (0qQ.A0K(str2, "PRO_HOME")) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A(AnonymousClass000.A00(2796));
            A0a.A9m(AnonymousClass000.A00(2983), "false");
            A0a.A9m("bonus_xar_upsell_declined_via_comms", "true");
            DbX.A1M(A0a, "container_module", r8.getModuleName());
            1ES.A03(DbT.A0U(A0a, true));
        }
    }

    public final AnonymousClass3M3 A01(UserSession userSession, String str, String str2) {
        String str3;
        0qQ.A0B(userSession, 0);
        0eP A1L = AnonymousClass7TE.A1L("deal_template_id", str);
        if (str2 != null) {
            str3 = DbY.A0j(str2);
        } else {
            str3 = null;
        }
        return C46649DiU.A02(userSession, "com.instagram.incentive_platform.screens.deal_information_unit", Dbb.A0e(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3, A1L));
    }

    public final K5L A04(FragmentActivity fragmentActivity, AnonymousClass0iw r34, UserSession userSession, String str, String str2) {
        AnonymousClass818 r9;
        28D r12;
        C59793JYm jYm = C59793JYm.OTHER;
        String str3 = str2;
        boolean equals = str3.equals("QP");
        if (!equals) {
            r9 = AnonymousClass818.IG_NOTIF;
        } else {
            r9 = AnonymousClass818.IG_PROFILE_QP;
        }
        AnonymousClass0iw r2 = r34;
        FBQ fbq = new FBQ(r9, AnonymousClass819.FULLSCREEN_INCENTIVES_XAR_REELS, jYm, (String) null, r2.getModuleName(), "1337", (String) null, 0);
        boolean z = !equals;
        UserSession userSession2 = userSession;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession2), "ig_camera_clips_share_to_facebook_primer_impression");
        String str4 = 27p.A01(userSession2).A04.A0L;
        if (str4 == null) {
            str4 = "";
        }
        boolean A1Z = Dbb.A1Z(C363388je.A00(userSession2), "RecommendOnFbUtils");
        0eE r8 = AnonymousClass0t1.A01;
        Long A0c = DbZ.A0c(DbS.A0h(userSession2, r8).B6v());
        if (A0e.isSampled()) {
            if (z) {
                r12 = 28D.A2C;
            } else {
                r12 = 28D.A48;
            }
            DbS.A1F(r12, A0e);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            A0e.A8M(C59725JVj.NO_CAMERA_SESSION, "surface");
            A0e.A8M(28t.A03, "media_type");
            A0e.A8M(jYm, "media_source");
            A0e.A8M(C360948fP.NORMAL, "capture_type");
            A0e.AAJ("camera_session_id", str4);
            DbW.A15(A0e, r2);
            A0e.A7p("is_crosspost", false);
            DbY.A1C(A0e);
            A0e.A7p("do_not_use_is_fb_connected", Boolean.valueOf(A1Z));
            A0e.A9F("follower_count", A0c);
            Dba.A19(A0e, "1337");
        }
        FGZ.A02(C368278sM.VIEW, userSession2, fbq);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String A16 = AnonymousClass7TE.A16(fragmentActivity2, 2131955646);
        IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_money_pano_outline_24);
        Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
        InfoItem infoItem = new InfoItem(simpleIconConfig, valueOf, A16, (String) null);
        String A0b = DbY.A0b(fragmentActivity2, r8.A01(userSession2), 2131955647);
        0qQ.A07(A0b);
        PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(new TitleIcon((ColorTint) null, R.drawable.ig_illustrations_illo_reels_distribution_refresh), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, "recommend_on_facebook_primer", AnonymousClass7TE.A16(fragmentActivity2, 2131955644), AnonymousClass7TE.A16(fragmentActivity2, 2131955649), (String) null, 0sr.A1P(new InfoItem[]{infoItem, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), valueOf, A0b, (String) null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_circle_play_pano_outline_24), valueOf, AnonymousClass7TE.A16(fragmentActivity2, 2131955648), (String) null)}), 2131955650, true, true, false);
        String A162 = AnonymousClass7TE.A16(fragmentActivity2, 2131955675);
        SpannableStringBuilder A0C = DbS.A0C(DbY.A0c(fragmentActivity2, A162, 2131955645));
        AnonymousClass7AV.A03(A0C, new C46684DjD(0, fragmentActivity2, userSession2), A162);
        LOZ loz = new LOZ(userSession2, primerBottomSheetConfig, A0C, false, false, false);
        loz.A00 = new FOV(fragmentActivity2, r2, userSession2, this, fbq, str, str3);
        loz.A01 = new FOS(fragmentActivity2, r2, this, userSession2, fbq, str3, 3);
        return LOZ.A00(loz);
    }

    public final AnonymousClass3M3 A02(UserSession userSession, String str, String str2) {
        return C46649DiU.A02(userSession, C66579MXk.A00(719), Dbb.A0e("fbid_of_incentive", str2, AnonymousClass7TE.A1L("origin", DbY.A0j(str))));
    }

    public final C47480E4f A03(UserSession userSession, String str, String str2, String str3) {
        Fragment eMz;
        Bundle A0A = DbY.A0A(userSession);
        A0A.putString("ARGUMENT_ENTRY_POINT", str);
        A0A.putString(AnonymousClass000.A00(203), str2);
        if (str3 != null) {
            A0A.putString("ARGUMENT_PROGRAM_TYPE", str3);
        }
        if (182.A06(0Tu.A05, userSession, 36316581302637061L)) {
            eMz = new EN0();
        } else {
            eMz = new C47922EMz();
        }
        eMz.setArguments(A0A);
        return eMz;
    }
}
