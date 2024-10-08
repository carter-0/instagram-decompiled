package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.I6j  reason: case insensitive filesystem */
public final class C56654I6j {
    public static final C56654I6j A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, C267324bN r13, JRO jro, UserSession userSession, AnonymousClass4DU r16, C14068TpH tpH, GBE gbe, C55948HqC hqC, C52016GBn gBn, String str) {
        String str2;
        String str3;
        C376689Iy A0B;
        String str4 = null;
        if (gBn == null || (A0B = gBn.A0B()) == null) {
            str2 = null;
        } else {
            str2 = A0B.A02;
        }
        C267324bN r7 = r13;
        User A08 = r13.A08(userSession);
        HH4 hh4 = new HH4(2, r7, jro, gbe, hqC);
        C71093OcF A01 = ORV.A01(fragmentActivity, r16, userSession, tpH, C16677UzD.MEDIA, str);
        A01.A01 = A08;
        A01.A08("ranking_info_token", r7.A0Q);
        1Xj r0 = r7.A02;
        if (r0 != null) {
            str3 = r0.A0C.BkE();
        } else {
            str3 = null;
        }
        A01.A08("recommendation_data", str3);
        1Xj r02 = r7.A02;
        if (r02 != null) {
            str4 = C51965G9l.A0t(r02);
        }
        A01.A08("inventory_source", str4);
        A01.A08("translation_data", str2);
        A01.A07(hh4);
        C71093OcF.A00((C331157Pu) null, A01);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r7) {
        C358248ab A0X = DbS.A0X(fragmentActivity);
        A0X.A09(2131952383);
        A0X.A0q(002.A0g(fragmentActivity.getString(2131952381), "\n\n", fragmentActivity.getString(2131952382)));
        A0X.A0Y(new C50026FJl(40, (Object) fragmentActivity, (Object) userSession, (Object) r7), C358278ae.BLUE_BOLD, AnonymousClass7TE.A16(fragmentActivity, 2131952385), true);
        A0X.A05();
        DbT.A1V(A0X);
    }

    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass4DH r15, ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C267324bN r18, C52058GDe gDe, AnonymousClass0iw r20, UserSession userSession, 1Xj r22, C55684Hlh hlh) {
        C267284bJ BZ6;
        String pk;
        C67161s9 A1N;
        C267284bJ BZ62;
        ClipsViewerSource clipsViewerSource2 = clipsViewerSource;
        0qQ.A0B(clipsViewerSource2, 9);
        1Xj r11 = r22;
        C67161s9 A1N2 = r11.A1N();
        if (A1N2 == null || (BZ6 = A1N2.BZ6()) == null) {
            0f9 AEf = 0wj.A01.AEf("ClipsOrganicMoreOptionsActionUtil", 817902720);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "No original media found for Remix passthrough.");
            AEf.report();
            return;
        }
        0rm A11 = C51965G9l.A11();
        AnonymousClass4DH r4 = r15;
        UserSession userSession2 = userSession;
        if (clipsViewerSource2 == ClipsViewerSource.REMIX_REEL_CTA && (A1N = r11.A1N()) != null && (BZ62 = A1N.BZ6()) != null && AnonymousClass7TF.A1Y(BZ62.CWC(), true)) {
            String A2n = r11.A2n();
            if (A2n != null) {
                A11.A00 = I66.A02(r15.getViewLifecycleOwner(), userSession2, A2n, "try_remix");
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (182.A06(0Tu.A05, userSession2, 36327477634677206L)) {
            pk = 002.A0T(BZ6.getPk(), BZ6.CCd().getId(), '_');
        } else {
            pk = BZ6.getPk();
        }
        C48898Ely.A00(userSession2, 1ES.A01(), new C57209ISw(fragmentActivity, r4, clipsViewerConfig, clipsViewerSource2, r18, gDe, r20, userSession2, r11, hlh, A11), pk);
    }

    public static final void A03(AnonymousClass4DH r2, ClipsViewerSource clipsViewerSource) {
        ClipsMashupType clipsMashupType;
        String str;
        int i;
        if (clipsViewerSource == ClipsViewerSource.SEQUENCE_ORIGINAL_REEL || clipsViewerSource == ClipsViewerSource.SEQUENCE_REEL_CTA) {
            clipsMashupType = ClipsMashupType.A0A;
        } else {
            clipsMashupType = ClipsMashupType.A0B;
        }
        ClipsMashupType clipsMashupType2 = ClipsMashupType.A0A;
        Context context = r2.getContext();
        if (clipsMashupType == clipsMashupType2) {
            str = "sequencing_unavailable";
            i = 2131956128;
        } else {
            str = "remix_unavailable";
            i = 2131956124;
        }
        C59689JTv.A0F(context, str, i);
    }

    public static final void A04(AnonymousClass4DH r1, AnonymousClass0iw r2, UserSession userSession, 1Xj r4) {
        C48899Elz.A00(r1, userSession, r4, r2.getModuleName());
        if (DbT.A0j(userSession).equals(r4.A2A(userSession))) {
            C51974G9v.A1F(AnonymousClass0kN.A02(userSession), "instagram_feed_overflow_menu_insights_option_tap");
        }
    }
}
