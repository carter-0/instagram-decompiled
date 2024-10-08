package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

public final class FGZ {
    public static final FU2 A00 = new FU2();
    public static final FGZ A01 = new Object();

    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession, FBQ fbq, int i) {
        AnonymousClass7TF.A1B(userSession, 1, r6);
        0qQ.A0B(fbq, 4);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        Intent putExtra = DbS.A09().putExtra("ARG_MEDIA_ID", fbq.A05);
        0qQ.A07(putExtra);
        FGZ fgz = A01;
        Dba.A1S(userSession, AnonymousClass1HX.A02(1677891942, 3), 21, z);
        A01(fragmentActivity, r6, userSession, z);
        fgz.A07(r6, userSession, fbq, z);
        fragmentActivity.setResult(i, putExtra);
        fragmentActivity.finish();
    }

    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r9, UserSession userSession, boolean z) {
        C367288qV.A01.A0B(r9, userSession, r9.getModuleName(), new C66296MMf(fragmentActivity, 10), z, true);
    }

    public static final void A03(AnonymousClass0iw r9, UserSession userSession, FBQ fbq) {
        AnonymousClass7TF.A1H(userSession, r9);
        0qQ.A0B(fbq, 2);
        boolean A012 = fbq.A01();
        if (!A012) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r9, userSession), "ig_camera_clips_share_to_facebook_primer_impression");
            String str = 27p.A01(userSession).A04.A0L;
            if (str == null) {
                str = "";
            }
            boolean A1Z = Dbb.A1Z(C363388je.A00(userSession), "RecommendOnFbUtils");
            Long A0c = DbZ.A0c(DbX.A0m(userSession).B6v());
            if (A0e.isSampled()) {
                DbS.A1F(28D.A1R, A0e);
                Dbc.A0V(A0e);
                Dbb.A1B(fbq.A03, A0e);
                A0e.AAJ("camera_session_id", str);
                DbW.A15(A0e, r9);
                A0e.A7p("is_crosspost", false);
                DbY.A1C(A0e);
                A0e.A7p("do_not_use_is_fb_connected", Boolean.valueOf(A1Z));
                A0e.A9F("follower_count", A0c);
                String str2 = fbq.A04;
                if (str2 == null) {
                    str2 = C48093EVl.A04.A00;
                }
                Dba.A19(A0e, str2);
            }
        }
        C697329a r6 = 27p.A01(userSession).A0G;
        C59793JYm jYm = fbq.A03;
        String str3 = fbq.A04;
        if (str3 == null) {
            str3 = C48093EVl.A04.A00;
        }
        if (!A012) {
            0Aj A0e2 = AnonymousClass7TE.A0e(r6.A01, AnonymousClass000.A00(3291));
            Long A0c2 = DbZ.A0c(DbX.A0m(userSession).B6v());
            if (A0e2.isSampled()) {
                A0e2.A8M(AnonymousClass80P.SHARE_TO_FB_PRIMER, "tool_type");
                A0e2.AAJ("legacy_falco_event_name", "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_PRIMER_IMPRESSION");
                String str4 = r6.A04.A0L;
                if (str4 == null) {
                    str4 = "";
                }
                A0e2.AAJ("camera_session_id", str4);
                DbS.A1F(28D.A1R, A0e2);
                Dbc.A0V(A0e2);
                Dbb.A1B(jYm, A0e2);
                DbW.A15(A0e2, r9);
                A0e2.A7p("is_crosspost", false);
                DbY.A1C(A0e2);
                A0e2.A9F("follower_count", A0c2);
                Dba.A19(A0e2, str3);
            }
        }
        A02(C368278sM.VIEW, userSession, fbq);
    }

    public final void A06(FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, FBQ fbq, String str, int i, boolean z) {
        C368278sM r0;
        C52236GKd gKd;
        0qQ.A0B(fbq, 6);
        0xY AR4 = 2D5.A00(userSession).A04.AR4();
        AR4.E5T(AnonymousClass000.A00(995), false);
        AR4.apply();
        Dba.A1S(userSession, AnonymousClass1HX.A02(1677891942, 3), 20, z);
        A01(fragmentActivity, r5, userSession, z);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_clips_share_to_facebook_primer_selection");
        if (A0e.isSampled()) {
            if (z) {
                gKd = C52236GKd.A15;
            } else {
                gKd = C52236GKd.A16;
            }
            A0e.A8M(gKd, "action");
            A0e.A8M(AnonymousClass5OC.MENU, "action_source");
            DbW.A16(A0e, r5);
            A0e.AAJ("media_compound_key", str);
            DbZ.A1I(A0e, (long) i);
        }
        if (z) {
            r0 = C368278sM.ACCEPT;
        } else {
            r0 = C368278sM.DECLINE;
        }
        A02(r0, userSession, fbq);
    }

    public static final void A02(C368278sM r8, UserSession userSession, FBQ fbq) {
        2D6 A002 = 2D5.A00(userSession);
        AnonymousClass819 r4 = fbq.A02;
        long j = 0;
        if (r4.ordinal() == 46) {
            0xa r5 = A002.A04;
            if (!r5.getBoolean("PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER", true)) {
                j = Math.max(r5.getLong(AnonymousClass000.A00(2403), 0), 1);
            }
        }
        boolean A1Z = Dbb.A1Z(C363388je.A00(userSession), "RecommendOnFbUtils");
        AnonymousClass818 r6 = fbq.A01;
        0bb r52 = new 0bb();
        r52.A06("waterfall_id", fbq.A07);
        r52.A09(Boolean.valueOf(A1Z));
        r52.A05(AnonymousClass000.A00(161), Long.valueOf(j));
        C368288sN.A00(r6, r8, r4, r52, userSession);
    }

    public final void A04(Context context, C62575Ki8 ki8) {
        int i;
        C358248ab A0Y;
        switch (ki8.ordinal()) {
            case 0:
                i = 2131955659;
                break;
            case 1:
                i = 2131955652;
                break;
            case 3:
                i = 2131955653;
                break;
            case 4:
                i = 2131955654;
                break;
            case 5:
                i = 2131955655;
                break;
            case 6:
                i = 2131955664;
                break;
            case 11:
                i = 2131955642;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 2131955656;
                break;
            case 15:
                i = 2131955657;
                break;
            case 17:
                i = 2131955651;
                break;
            case 20:
                i = 2131955658;
                break;
            case 21:
                i = 2131955660;
                break;
            case 22:
                i = 2131955661;
                break;
            case 23:
            case 24:
                i = 2131955662;
                break;
            case 25:
                i = 2131955663;
                break;
            case 27:
                i = 2131955665;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = 2131955667;
                break;
            default:
                A0Y = DbS.A0Y(context);
                A0Y.A09(2131955666);
                i = 2131971843;
                break;
        }
        A0Y = DbS.A0Y(context);
        A0Y.A09(2131955666);
        A0Y.A08(i);
        Dba.A1L(A0Y);
    }

    public final void A05(Fragment fragment, LBK lbk) {
        FBQ fbq;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (fbq = lbk.A09) != null) {
            UserSession userSession = lbk.A05;
            C47425E1t A002 = FV2.A00(new FPH(19, (Object) fragment, (Object) userSession, (Object) fbq), new FPH(20, (Object) fragment, (Object) userSession, (Object) fbq), fbq, new C41567AwZ(31, fragment, userSession, fbq));
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A16 = true;
            DbS.A1S(A0W, false);
            A0W.A0U = new FmA(1, lbk, userSession);
            DbU.A0y(activity, A002, A0W);
        }
    }

    public final void A07(AnonymousClass0iw r8, UserSession userSession, FBQ fbq, boolean z) {
        C368278sM r0;
        boolean A012 = fbq.A01();
        if (!A012) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), "ig_camera_clips_share_to_facebook_primer_selection");
            String str = 27p.A01(userSession).A04.A0L;
            if (str == null) {
                str = "";
            }
            if (A0e.isSampled()) {
                DbS.A1F(28D.A1R, A0e);
                Dbc.A0V(A0e);
                Dbb.A1B(fbq.A03, A0e);
                A0e.AAJ("camera_session_id", str);
                DbW.A15(A0e, r8);
                Dbc.A0g(A0e, z);
                DbY.A1C(A0e);
                String str2 = fbq.A04;
                if (str2 == null) {
                    str2 = C48093EVl.A04.A00;
                }
                Dba.A19(A0e, str2);
            }
        }
        29Z r5 = 27p.A01(userSession).A0F;
        C59793JYm jYm = fbq.A03;
        String str3 = fbq.A04;
        if (str3 == null) {
            str3 = C48093EVl.A04.A00;
        }
        if (!A012) {
            0Aj A0e2 = AnonymousClass7TE.A0e(r5.A01, AnonymousClass000.A00(159));
            if (A0e2.isSampled()) {
                A0e2.A8M(AnonymousClass80P.SHARE_TO_FB_PRIMER, "tool_type");
                A0e2.AAJ("legacy_falco_event_name", "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_PRIMER_SELECTION");
                String str4 = r5.A04.A0L;
                if (str4 == null) {
                    str4 = "";
                }
                A0e2.AAJ("camera_session_id", str4);
                DbS.A1F(28D.A1R, A0e2);
                Dbc.A0V(A0e2);
                Dbb.A1B(jYm, A0e2);
                DbW.A15(A0e2, r8);
                Dbc.A0g(A0e2, z);
                DbY.A1C(A0e2);
                Dba.A19(A0e2, str3);
            }
        }
        if (z) {
            r0 = C368278sM.ACCEPT;
        } else if (A012) {
            r0 = C368278sM.OTHER;
        } else {
            r0 = C368278sM.DECLINE;
        }
        A02(r0, userSession, fbq);
    }
}
