package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WPh  reason: case insensitive filesystem */
public final class C19201WPh implements AnonymousClass0iw {
    public static final DialogInterface A0X = new C18846W5p();
    public static final W2A A0Y = new Object();
    public static final String __redex_internal_original_name = "ReelOptionsOverflowHelper";
    public Dialog A00;
    public DialogInterface.OnDismissListener A01;
    public CharSequence A02;
    public CharSequence A03;
    public final Activity A04;
    public final Resources A05;
    public final Fragment A06;
    public final 0hq A07;
    public final AnonymousClass07i A08;
    public final AnonymousClass0iw A09;
    public final 0wc A0A;
    public final UserSession A0B;
    public final AnonymousClass36V A0C;
    public final C270594gz A0D;
    public final AnonymousClass4DU A0E;
    public final C255773uh A0F;
    public final C250973mM A0G;
    public final ReelViewerConfig A0H;
    public final AnonymousClass3BQ A0I;
    public final C238513Cd A0J;
    public final LEM A0K;
    public final C17528VZh A0L;
    public final C309426Yf A0M;
    public final AnonymousClass6Z6 A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final C62320sa A0T;
    public final 0Pl A0U;
    public final C309966aD A0V;
    public final C310066aN A0W;

    public static final void A03(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r11, AnonymousClass6ZF r12, C19201WPh wPh, AnonymousClass6ZB r14, VUB vub, VQE vqe, CharSequence charSequence) {
        C19201WPh wPh2 = wPh;
        C255773uh r13 = wPh.A0F;
        1Xj r8 = r13.A0b;
        Resources resources = wPh2.A05;
        CharSequence charSequence2 = charSequence;
        if (C13988Tno.A1X(resources, charSequence2, 2131957531)) {
            W2A.A03(r11, r13, r12, wPh2);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131972588) || C13988Tno.A1X(resources, charSequence2, 2131972572)) {
            Activity activity = wPh2.A04;
            UserSession userSession = wPh2.A0B;
            W2A.A01(activity, wPh2.A01, wPh2.A07, wPh2.A08, userSession, r13);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131973445)) {
            UserSession userSession2 = wPh2.A0B;
            0hq r9 = wPh2.A07;
            AnonymousClass07i r10 = wPh2.A08;
            DialogInterface.OnDismissListener onDismissListener2 = wPh2.A01;
            AnonymousClass36V r122 = wPh2.A0C;
            if (r122 != null) {
                Activity activity2 = wPh2.A04;
                0qQ.A0B(r10, 3);
                FCO.A00(activity2, r13, new C19524WbA(activity2, onDismissListener2, r9, r10, userSession2, r122, r13));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (r8 != null && (C13988Tno.A1X(resources, charSequence2, C305796Jo.A00(ProductType.STORY, false)) || C13988Tno.A1X(resources, charSequence2, 2131953965))) {
            1Yh A002 = C18138VmE.A00();
            UserSession userSession3 = wPh2.A0B;
            AnonymousClass0iw r6 = wPh2.A09;
            A002.A07(wPh2.A06, new C57016ILi(onDismissListener, 1), (PromoteLaunchOrigin) null, r6, userSession3, r8, r6.getModuleName(), (String) null, true);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131969192)) {
            wPh2.A0K.A00(onDismissListener, true);
        } else if (C66581MXm.A11(resources.getString(2131961467), resources.getString(2131952328)).contains(charSequence2.toString())) {
            A06(onDismissListener, wPh2, charSequence2);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131963113)) {
            C13990Tnq.A1M(wPh2);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131970695)) {
            AnonymousClass6Z5.A09(r14.A00);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131973441)) {
            vub.A00.Cvw(r13, vub.A01);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131973099)) {
            C250973mM r3 = wPh2.A0G;
            vqe.A00.Df3(r13, r3.A0H.A0P, r3, (String) null);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131974324)) {
            C63406KwS.A00(wPh2.A04, new W5U(wPh2, 37), r11, wPh2.A0B, r13);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131974282)) {
            C17040VFo.A00(wPh2.A04, wPh2.A07, wPh2.A0B, r13);
        }
        wPh2.A01 = null;
    }

    public static final void A04(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r10, XCI xci, C19201WPh wPh) {
        String str;
        C270194gL r0;
        C14068TpH tpH;
        List BPz;
        1Xj r02;
        AnonymousClass0iw r8 = r10;
        C62429Kfe kfe = new C62429Kfe(5, onDismissListener, xci);
        long A0I2 = AnonymousClass7TG.A0I();
        UserSession userSession = wPh.A0B;
        Activity activity = wPh.A04;
        C255773uh r4 = wPh.A0F;
        boolean A1V = r4.A1V();
        if (A1V) {
            r8 = new 0xG(C273654mx.A00(2854));
        }
        if (A1V) {
            C270114gD r1 = r4.A0D;
            17k.A07(r1, C273654mx.A00(21));
            if (r1 == null || (BPz = r1.A00.BPz()) == null || (r02 = (1Xj) AnonymousClass7TE.A13(BPz)) == null) {
                str = null;
            } else {
                str = r02.getId();
            }
        } else if (r4.A0e.ordinal() != 3 || (r0 = r4.A0c) == null) {
            str = r4.A0j;
            0qQ.A07(str);
        } else {
            str = r0.A0e;
            str.getClass();
        }
        if (r4.A17()) {
            tpH = C14068TpH.LIVE;
        } else if (A1V) {
            tpH = C14068TpH.BCN_POST_TIFU;
        } else {
            tpH = C14068TpH.STORY;
        }
        C71093OcF A012 = ORV.A01(activity, r8, userSession, tpH, C16677UzD.MEDIA, str);
        A012.A01 = r4.A0i;
        A012.A07(kfe);
        A012.A08(AnonymousClass000.A00(3882), String.valueOf(A0I2));
        C71093OcF.A00((C331157Pu) null, A012);
    }

    public final void A0X(Context context, DialogInterface.OnDismissListener onDismissListener, View view, AnonymousClass0iw r34, AnonymousClass6ZA r35, AnonymousClass6ZF r36, XCI xci, X4S x4s, X4T x4t, X4U x4u, C273414mX r41, AnonymousClass6ZK r42, AnonymousClass6ZH r43, AnonymousClass6ZC r44, AnonymousClass6ZJ r45, AnonymousClass6ZI r46) {
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        0qQ.A0B(onDismissListener2, 4);
        AnonymousClass6ZK r8 = r42;
        AnonymousClass6ZF r10 = r36;
        AnonymousClass7TG.A1S(r10, r8);
        AnonymousClass6ZI r4 = r46;
        AnonymousClass6ZJ r5 = r45;
        AnonymousClass6ZC r6 = r44;
        AnonymousClass6ZH r7 = r43;
        C51974G9v.A1Q(r6, r7, r4, r5);
        User user = this.A0F.A0i;
        C273414mX r23 = r41;
        X4T x4t2 = x4t;
        View view2 = view;
        Context context2 = context;
        AnonymousClass0iw r15 = r34;
        AnonymousClass6ZA r16 = r35;
        XCI xci2 = xci;
        X4S x4s2 = x4s;
        if (user == null || user.A0N() != AnonymousClass05K.A00) {
            A0Y(context2, onDismissListener2, view2, r15, r16, r10, xci2, x4s2, x4t2, r23, r8, r7, r6, r5, r4);
            return;
        }
        1NY A0b = AnonymousClass7TG.A0b(this.A0B);
        A0b.A0Q(C3727892k.class, C3727992l.class);
        A0b.A0A("users/{user_id}/info/");
        A0b.A0A = "users/{user_id}/info/";
        A0b.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
        A0b.A9m("from_module", "ReelOptionsDialog");
        A0b.A03();
        AnonymousClass6ZF r17 = r10;
        C15609Ufb ufb = new C15609Ufb(context2, onDismissListener2, view2, r15, r16, r17, xci2, x4s2, x4t2, x4u, this, r23, user, r8, r7, r6, r5, r4);
        Activity activity = this.A04;
        AnonymousClass07i r1 = this.A08;
        1OC A0M2 = A0b.A0M();
        A0M2.A00 = ufb;
        1ES.A00(activity, r1, A0M2);
    }

    public final void A0a(DialogInterface.OnDismissListener onDismissListener, XCI xci) {
        0qQ.A0B(onDismissListener, 1);
        Dialog A002 = A00(new C18833W4v(16, xci, this), onDismissListener, this, A0W(this));
        AnonymousClass0fN.A00(A002);
        this.A00 = A002;
    }

    public static final Dialog A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, C19201WPh wPh, CharSequence[] charSequenceArr) {
        wPh.A01 = onDismissListener;
        C358248ab r2 = new C358248ab(wPh.A04);
        r2.A0l(wPh.A06, wPh.A0B);
        r2.A0e(onClickListener, charSequenceArr);
        r2.A0r(true);
        r2.A0s(true);
        W5b.A00(r2, wPh, 5);
        return r2.A02();
    }

    private final String A01(String str) {
        Resources resources = this.A05;
        if (C13988Tno.A1X(resources, str, 2131953142)) {
            return "archive_highlight_option";
        }
        if (C13988Tno.A1X(resources, str, 2131954722)) {
            return "cancel";
        }
        if (C13988Tno.A1X(resources, str, 2131956749)) {
            return "copy_link_url";
        }
        if (C13988Tno.A1X(resources, str, 2131957531)) {
            return "delete";
        }
        if (C13988Tno.A1X(resources, str, 2131957583)) {
            return "delete_photo_message";
        }
        if (C13988Tno.A1X(resources, str, 2131957584)) {
            return "delete_photo_title";
        }
        if (C13988Tno.A1X(resources, str, 2131957615)) {
            return "delete_video_message";
        }
        if (C13988Tno.A1X(resources, str, 2131957616)) {
            return "delete_video_title";
        }
        if (C13988Tno.A1X(resources, str, 2131961468)) {
            return "edit_partner";
        }
        if (C13988Tno.A1X(resources, str, 2131961512)) {
            return "edit_story_option";
        }
        if (C13988Tno.A1X(resources, str, 2131961740)) {
            return "error";
        }
        if (C13988Tno.A1X(resources, str, 2131963113)) {
            return "go_to_promo_manager";
        }
        if (C13988Tno.A1X(resources, str, 2131963394)) {
            return "hide_this";
        }
        if (C13988Tno.A1X(resources, str, 2131964349)) {
            return "inline_removed_notif_title";
        }
        if (C13988Tno.A1X(resources, str, 2131971579)) {
            return "leave_group";
        }
        if (C13988Tno.A1X(resources, str, 2131965446)) {
            return "live_videos_show_less";
        }
        if (C13988Tno.A1X(resources, str, 2131965920)) {
            return "media_logging_title";
        }
        if (C13988Tno.A1X(resources, str, 2131965923)) {
            return "media_option_share_link";
        }
        if (C13988Tno.A1X(resources, str, 2131967801)) {
            return "music_overlay_cant_save_story_alert";
        }
        if (C13988Tno.A1X(resources, str, 2131968513)) {
            return "not_now";
        }
        if (C13988Tno.A1X(resources, str, 2131968772)) {
            return "ok";
        }
        if (C13988Tno.A1X(resources, str, C305796Jo.A00(ProductType.STORY, false))) {
            return "promote";
        }
        if (C13988Tno.A1X(resources, str, 2131953965)) {
            return "promote_again";
        }
        if (C13988Tno.A1X(resources, str, 2131971635)) {
            return "reel_settings_title";
        }
        if (C13988Tno.A1X(resources, str, 2131971974)) {
            return "remove";
        }
        if (C13988Tno.A1X(resources, str, 2131971998)) {
            return "remove_business_partner";
        }
        if (C13988Tno.A1X(resources, str, 2131971999)) {
            return "remove_business_partner_description";
        }
        if (C13988Tno.A1X(resources, str, 2131972033) || C13988Tno.A1X(resources, str, 2131972037)) {
            return "remove_from_highlight_option";
        }
        if (C13988Tno.A1X(resources, str, 2131957604)) {
            return "delete_story";
        }
        if (C13988Tno.A1X(resources, str, 2131972038)) {
            return "remove_from_paid_partnership_label";
        }
        if (C13988Tno.A1X(resources, str, 2131972085)) {
            return "remove_photo_highlight_button";
        }
        if (C13988Tno.A1X(resources, str, 2131972086)) {
            return "remove_photo_highlight_message";
        }
        if (C13988Tno.A1X(resources, str, 2131972087)) {
            return "remove_photo_highlight_message_active";
        }
        if (C13988Tno.A1X(resources, str, 2131972088)) {
            return "remove_photo_highlight_title";
        }
        if (C13988Tno.A1X(resources, str, 2131972089)) {
            return "remove_photo_lately_title";
        }
        if (C13988Tno.A1X(resources, str, 2131972104) || C13988Tno.A1X(resources, str, 2131972106)) {
            return "remove_sponsor_tag_subtitle";
        }
        if (C13988Tno.A1X(resources, str, 2131972107)) {
            return "remove_sponsor_tag_title";
        }
        if (C13988Tno.A1X(resources, str, 2131972126)) {
            return "remove_video_highlight_button";
        }
        if (C13988Tno.A1X(resources, str, 2131972127)) {
            return "remove_video_highlight_message";
        }
        if (C13988Tno.A1X(resources, str, 2131972128)) {
            return "remove_video_highlight_message_active";
        }
        if (C13988Tno.A1X(resources, str, 2131972129)) {
            return "remove_video_highlight_title";
        }
        if (C13988Tno.A1X(resources, str, 2131972130)) {
            return "remove_video_lately_title";
        }
        if (C13988Tno.A1X(resources, str, 2131972143)) {
            return "removing_from_highlights_progress";
        }
        if (C13988Tno.A1X(resources, str, 2131972204)) {
            return "report_options";
        }
        if (C13988Tno.A1X(resources, str, 2131972213)) {
            return "report_thanks_toast_msg_ads";
        }
        if (C13988Tno.A1X(resources, str, 2131972502)) {
            return "save";
        }
        if (C13988Tno.A1X(resources, str, 2131972572)) {
            return "save_photo";
        }
        if (C13988Tno.A1X(resources, str, 2131972588)) {
            return "save_video";
        }
        if (C13988Tno.A1X(resources, str, 2131972636)) {
            return "saved_to_camera_roll";
        }
        if (C13988Tno.A1X(resources, str, 2131973099) || C13988Tno.A1X(resources, str, 2131973100)) {
            return "send_to_direct";
        }
        if (C13988Tno.A1X(resources, str, 2131973441)) {
            return "share";
        }
        if (C13988Tno.A1X(resources, str, 2131973445)) {
            return "share_as_post";
        }
        if (C13988Tno.A1X(resources, str, 2131973490)) {
            return "share_photo_to_facebook_message";
        }
        if (C13988Tno.A1X(resources, str, 2131973564)) {
            return "share_to_facebook_title";
        }
        if (C13988Tno.A1X(resources, str, 2131973603)) {
            return "share_video_to_facebook_message";
        }
        if (C13988Tno.A1X(resources, str, 2131974135)) {
            return "sponsor_tag_dialog_title";
        }
        if (C13988Tno.A1X(resources, str, 2131974138)) {
            return "sponsored_label_dialog_title";
        }
        if (C13988Tno.A1X(resources, str, 2131968504)) {
            return AnonymousClass000.A00(1619);
        }
        if (C13988Tno.A1X(resources, str, 2131974932)) {
            return "tag_business_partner";
        }
        if (C13988Tno.A1X(resources, str, 2131975820)) {
            return "unable_to_delete_promoted_story";
        }
        if (C13988Tno.A1X(resources, str, 2131975821)) {
            return "unable_to_delete_story";
        }
        if (C13988Tno.A1X(resources, str, 2131975841)) {
            return "unarchive_highlight_option";
        }
        if (C13988Tno.A1X(resources, str, 2131975944)) {
            return AnonymousClass000.A00(4146);
        }
        if (C13988Tno.A1X(resources, str, 2131970695)) {
            return "view_ad_insights";
        }
        if (C13988Tno.A1X(resources, str, 2131973016)) {
            return "see_why_button_misinformation";
        }
        if (C13988Tno.A1X(resources, str, 2131969192)) {
            return AnonymousClass000.A00(3720);
        }
        if (C13988Tno.A1X(resources, str, 2131972233)) {
            return "request_mentions";
        }
        if (C13988Tno.A1X(resources, str, 2131969789)) {
            return "producer_delete_story";
        }
        if (C13988Tno.A1X(resources, str, 2131961453)) {
            return "edit_gen_ai_label";
        }
        if (C13988Tno.A1X(resources, str, 2131974388)) {
            return "story_comments_disable_title";
        }
        if (C13988Tno.A1X(resources, str, 2131974390)) {
            return "story_comments_enable_title";
        }
        return "unknown_menu_option";
    }

    public static final void A05(DialogInterface.OnDismissListener onDismissListener, C19201WPh wPh) {
        Fragment A002;
        if (wPh.A0F.A0b != null) {
            Fragment fragment = wPh.A06;
            Context requireContext = fragment.requireContext();
            UserSession userSession = wPh.A0B;
            String A003 = AnonymousClass000.A00(198);
            boolean z = false;
            if (AnonymousClass3WP.A05(userSession)) {
                A002 = C48763Ejm.A00(false);
            } else {
                A002 = C48762Ejl.A00(userSession, A003, (String) null, false, true, false, false, false);
            }
            if (AnonymousClass3WS.A04(userSession) || AnonymousClass3WS.A02(userSession)) {
                z = true;
            }
            C331127Pr r2 = new C331127Pr(userSession);
            Resources resources = requireContext.getResources();
            int i = 2131954758;
            if (z) {
                i = 2131954760;
            }
            r2.A0d = resources.getString(i);
            C331157Pu A004 = r2.A00();
            FCT.A01((AnonymousClass0iw) null, userSession, A003, AnonymousClass000.A00(56), (String) null);
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                A004.A02(activity, A002);
                AnonymousClass37D A0i = DbT.A0i(activity);
                if (A0i != null) {
                    ((AnonymousClass37F) A0i).A0H = new C57392IZx(onDismissListener);
                }
            }
        }
    }

    public static final void A06(DialogInterface.OnDismissListener onDismissListener, C19201WPh wPh, CharSequence charSequence) {
        Resources resources = wPh.A05;
        String A0d = AnonymousClass7TF.A0d(resources, 2131961467);
        String A0d2 = AnonymousClass7TF.A0d(resources, 2131952328);
        1Xj r1 = wPh.A0F.A0b;
        if (A0d.equals(charSequence) || A0d2.equals(charSequence)) {
            if (r1 == null || r1.A0C.getBoostedBySponsor() == null) {
                wPh.A0K.A00(onDismissListener, false);
            } else {
                LEM lem = wPh.A0K;
                FragmentActivity fragmentActivity = lem.A07;
                C49946FGa.A04(fragmentActivity, new C18833W4v(15, lem, onDismissListener), lem.A0B, fragmentActivity.getString(2131954745), fragmentActivity.getString(2131954743));
            }
        }
        UserSession userSession = wPh.A0B;
        JVF.A02(wPh, userSession, AnonymousClass05K.A0H, AnonymousClass05K.A0Y, LPL.A00(userSession));
    }

    public static final void A08(AnonymousClass0iw r12, C19201WPh wPh) {
        String str;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        String str2;
        Activity activity = wPh.A04;
        UserSession userSession = wPh.A0B;
        String moduleName = r12.getModuleName();
        1Xj r0 = wPh.A0F.A0b;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = null;
        if (r0 != null) {
            str = r0.A2n();
        } else {
            str = null;
        }
        AnonymousClass9OT r2 = AnonymousClass9OT.STORY;
        if (r0 != null) {
            mediaGenAIDetectionMethod = r0.A1I();
        } else {
            mediaGenAIDetectionMethod = null;
        }
        JUL.A00(activity, r2, mediaGenAIDetectionMethod, userSession, moduleName, str, false);
        String moduleName2 = r12.getModuleName();
        if (r0 != null) {
            str2 = r0.A2n();
            mediaGenAIDetectionMethod2 = r0.A1I();
        } else {
            str2 = null;
        }
        C250563lf.A0e(r2, mediaGenAIDetectionMethod2, userSession, (Boolean) null, moduleName2, AnonymousClass000.A00(1388), str2);
    }

    public static final void A09(1Xj r5, C19201WPh wPh, List list) {
        if (r5 == null || C51970G9q.A1T(((r5.A1A() + SandboxRepository.CACHE_TTL) > AnonymousClass7TG.A0I() ? 1 : ((r5.A1A() + SandboxRepository.CACHE_TTL) == AnonymousClass7TG.A0I() ? 0 : -1))) || !r5.A5O() || !AnonymousClass8PU.A08(wPh.A0B)) {
            if (182.A06(0Tu.A05, wPh.A0B, 36318909174913766L)) {
                list.add(AnonymousClass7TF.A0d(wPh.A05, 2131953150));
            }
        }
    }

    public static final void A0A(1Xj r8, C19201WPh wPh, List list) {
        String str;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        UserSession userSession = wPh.A0B;
        if (JUL.A02(userSession, r8)) {
            String moduleName = wPh.A09.getModuleName();
            if (r8 != null) {
                str = r8.A2n();
            } else {
                str = null;
            }
            AnonymousClass9OT r1 = AnonymousClass9OT.STORY;
            if (r8 != null) {
                mediaGenAIDetectionMethod = r8.A1I();
            } else {
                mediaGenAIDetectionMethod = null;
            }
            C250563lf.A0e(r1, mediaGenAIDetectionMethod, userSession, (Boolean) null, moduleName, AnonymousClass000.A00(1389), str);
            list.add(AnonymousClass7TF.A0d(wPh.A05, 2131952630));
        }
    }

    public static final void A0B(1Xj r0, C19201WPh wPh, List list) {
        if (r0 != null && C56587I2r.A02(r0)) {
            list.add(AnonymousClass7TF.A0d(wPh.A05, 2131973016));
        }
    }

    public static final void A0C(XCI xci, C19201WPh wPh, CharSequence charSequence) {
        CharSequence charSequence2 = wPh.A02;
        if (charSequence2 != null && charSequence2.equals(charSequence)) {
            UserSession userSession = wPh.A0B;
            AnonymousClass4DU r4 = wPh.A0E;
            1Nv A092 = wPh.A0F.A09();
            if (A092 != null) {
                C233822wX.A0N(userSession, wPh.A0D, A092, r4, (Integer) null, "hide_button");
                xci.DJC();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        wPh.A01 = null;
    }

    public static final void A0D(C19201WPh wPh) {
        C19201WPh wPh2 = wPh;
        Activity activity = wPh2.A04;
        0hq r3 = wPh2.A07;
        C255773uh r0 = wPh2.A0F;
        String str = r0.A0k;
        String str2 = r0.A0j;
        AnonymousClass4DU r7 = wPh2.A0E;
        AnonymousClass07i r4 = wPh2.A08;
        UserSession userSession = wPh2.A0B;
        String str3 = wPh2.A0P;
        C46395DeI.A0D(activity, r3, r4, new FT3(activity, (View) null, 0, false), userSession, r7, true, AnonymousClass05K.A00, (Runnable) null, str, str2, str3, "story_highlight_action_sheet", "copy_link", (String) null, true);
    }

    public static final void A0E(C19201WPh wPh) {
        Activity activity = wPh.A04;
        0hq r2 = wPh.A07;
        C255773uh r6 = wPh.A0F;
        C46395DeI.A07(activity, (View) null, r2, wPh.A08, wPh.A0B, wPh.A0E, r6, (Runnable) null, "location_story_action_sheet", false);
    }

    public static final void A0F(C19201WPh wPh) {
        Activity activity = wPh.A04;
        0hq r2 = wPh.A07;
        C255773uh r0 = wPh.A0F;
        String str = r0.A0k;
        String str2 = r0.A0j;
        User user = r0.A0i;
        if (user != null) {
            C46395DeI.A0J(activity, r2, wPh.A08, wPh.A0B, wPh.A0E, user, (Runnable) null, str, str2, "story_highlight_action_sheet");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0G(C19201WPh wPh) {
        Activity activity = wPh.A04;
        0hq r1 = wPh.A07;
        C255773uh r5 = wPh.A0F;
        C46395DeI.A0G(activity, r1, wPh.A08, wPh.A0B, wPh.A0E, r5, (Runnable) null, "location_story_action_sheet");
    }

    public static final void A0H(C19201WPh wPh) {
        UserSession userSession = wPh.A0B;
        ReelStore A032 = ReelStore.A03(userSession);
        C255773uh r2 = wPh.A0F;
        String str = r2.A0k;
        Reel A0M2 = A032.A0M(str);
        String str2 = null;
        if (A0M2 != null) {
            1Ns r0 = A0M2.A0W;
            if (r0 != null) {
                str2 = r0.getName();
            }
            if (A0M2.A0h() && str2 != null) {
                String str3 = A0M2.A0r;
                if (str3 == null) {
                    str3 = AnonymousClass7TF.A0d(wPh.A04.getResources(), 2131971002);
                }
                Activity activity = wPh.A04;
                0hq r5 = wPh.A07;
                String str4 = r2.A0j;
                String A0e = AnonymousClass7TF.A0e(activity.getResources(), 002.A0D(str2, '@'), 2131970991);
                String str5 = wPh.A0P;
                C46395DeI.A0K(activity, r5, wPh.A08, userSession, wPh.A0E, str, str4, str3, A0e, str5, "story_highlight_action_sheet");
            }
        }
    }

    public static final void A0I(C19201WPh wPh, String str) {
        String str2;
        if (!0qQ.A0K(wPh.A0R, str) && !0qQ.A0K(wPh.A0O, str)) {
            C255773uh r1 = wPh.A0F;
            if (r1.A1J()) {
                str2 = "story_highlight_action_sheet";
            } else {
                str2 = "location_story_action_sheet";
            }
            String A012 = wPh.A01(str);
            C22031Xty.A08(wPh.A0E, wPh.A0B, (Long) null, (Long) null, (Long) null, r1.A0j, wPh.A0P, str2, A012, (String) null, (String) null, (String) null, false);
        }
    }

    public static final void A0L(C19201WPh wPh, String str, List list) {
        UserSession userSession = wPh.A0B;
        Reel A0M2 = ReelStore.A03(userSession).A0M(wPh.A0F.A0k);
        if (A0M2 != null && A0M2.A0h() && wPh.A0U() && C14290TtO.A00(userSession)) {
            list.add(wPh.A0S);
            wPh.A0T(str, "qr_code");
        }
    }

    public static final void A0M(C19201WPh wPh, List list) {
        boolean A1m = wPh.A0F.A1m();
        Resources resources = wPh.A05;
        int i = 2131972572;
        if (A1m) {
            i = 2131972588;
        }
        String string = resources.getString(i);
        0qQ.A0A(string);
        list.add(string);
    }

    public static final void A0N(C19201WPh wPh, List list) {
        C255773uh r0 = wPh.A0F;
        1Xj r5 = r0.A0b;
        if (r5 != null && r0.CcK()) {
            UserSession userSession = wPh.A0B;
            boolean CeS = r5.CeS();
            boolean A51 = r5.A51();
            boolean A4L = r5.A4L();
            String A0k = C51973G9u.A0k(r5);
            if (CeS && A51) {
                if (!2R8.A05(userSession, A0k) || A4L) {
                    list.add(AnonymousClass7TF.A0d(wPh.A05, 2131954764));
                }
            }
        }
    }

    public static final void A0O(C19201WPh wPh, List list) {
        list.add(AnonymousClass7TF.A0d(wPh.A05, 2131957531));
    }

    public static final void A0Q(C19201WPh wPh, List list) {
        if (wPh.A0F.A13()) {
            if (182.A06(0Tu.A05, wPh.A0B, 36319939967524664L)) {
                list.add(1, AnonymousClass7TF.A0d(wPh.A05, 2131974324));
            }
        }
    }

    public static final void A0R(C19201WPh wPh, List list) {
        C255773uh r1 = wPh.A0F;
        if (r1.A0i() && !r1.A0j()) {
            if (182.A06(0Tu.A05, wPh.A0B, 36318247749949468L)) {
                list.add(AnonymousClass7TF.A0d(wPh.A05, 2131974388));
            }
        }
    }

    public static final void A0S(C19201WPh wPh, List list) {
        C255773uh r1 = wPh.A0F;
        if (r1.A0i() && r1.A0j()) {
            if (182.A06(0Tu.A05, wPh.A0B, 36318247749949468L)) {
                list.add(AnonymousClass7TF.A0d(wPh.A05, 2131974390));
            }
        }
    }

    private final void A0T(String str, String str2) {
        C22031Xty.A0A(this.A0E, this.A0B, (Long) null, this.A0F.A0j, this.A0P, str, str2);
    }

    private final boolean A0U() {
        C250973mM r1 = this.A0G;
        C255773uh r2 = this.A0F;
        if (!C17120VIq.A00(this.A0B, r2, r1) || r2.A0B() == AnonymousClass3QO.HALLPASS || r2.A1t(AnonymousClass3WT.SECRET_STICKER)) {
            return false;
        }
        return true;
    }

    public static final boolean A0V(C19201WPh wPh) {
        ReelViewerConfig reelViewerConfig = wPh.A0H;
        C250973mM r3 = wPh.A0G;
        return AnonymousClass6YK.A05(wPh.A0B, wPh.A0F, r3, reelViewerConfig, wPh.A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019a, code lost:
        if (X.AnonymousClass7TF.A1Y(r0.A03.Ccd(), true) == false) goto L_0x019c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence[] A0W(X.C19201WPh r13) {
        /*
            X.3uh r11 = r13.A0F
            X.1Xj r10 = r11.A0b
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.4g8 r0 = r11.A0f
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0049
            X.0Pl r2 = r13.A0U
            android.app.Activity r1 = r13.A04
            android.content.res.Resources r6 = r13.A05
            r0 = 2131963394(0x7f132e02, float:1.956354E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r6, r0)
            java.lang.CharSequence r0 = r2.A0H(r1, r0)
            r9.add(r0)
            r13.A02 = r0
        L_0x0028:
            boolean r0 = r11.A1R()
            if (r0 == 0) goto L_0x0034
            r0 = 2131963108(0x7f132ce4, float:1.956296E38)
            A07(r6, r9, r0)
        L_0x0034:
            boolean r0 = r11.A1V()
            if (r0 == 0) goto L_0x0040
            r0 = 2131972204(0x7f13506c, float:1.9581409E38)
            A07(r6, r9, r0)
        L_0x0040:
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r8]
            java.lang.Object[] r0 = r9.toArray(r0)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            return r0
        L_0x0049:
            boolean r0 = r11.A1U()
            if (r0 != 0) goto L_0x01d9
            boolean r0 = r11.A1T()
            if (r0 != 0) goto L_0x01d9
            X.3mL r1 = r11.A0e
            X.3mL r0 = X.C250963mL.NETEGO_VISIT_THESE_SHOPS_AGAIN
            if (r1 == r0) goto L_0x01d9
            boolean r0 = r11.A1S()
            if (r0 != 0) goto L_0x01d9
            boolean r0 = r11.A1Q()
            if (r0 != 0) goto L_0x01d9
            boolean r0 = r11.A1R()
            if (r0 != 0) goto L_0x01d9
            boolean r0 = r11.A1V()
            if (r0 != 0) goto L_0x01d9
            X.3mL r0 = X.C250963mL.NETEGO_META_GALLERY_STORIES
            if (r1 == r0) goto L_0x01d9
            com.instagram.common.session.UserSession r7 = r13.A0B
            boolean r0 = r11.A1n(r7)
            if (r0 == 0) goto L_0x0087
            android.content.res.Resources r1 = r13.A05
            r0 = 2131974282(0x7f13588a, float:1.9585624E38)
            A07(r1, r9, r0)
        L_0x0087:
            android.content.res.Resources r6 = r13.A05
            r0 = 2131972204(0x7f13506c, float:1.9581409E38)
            A07(r6, r9, r0)
            boolean r12 = r11.A17()
            r1 = 0
            r5 = 1
            A0N(r13, r9)
            X.3BQ r4 = r13.A0I
            X.3BQ r0 = X.AnonymousClass3BQ.EXPLORE
            if (r4 != r0) goto L_0x01cc
            r0 = 2131968504(0x7f1341f8, float:1.9573904E38)
        L_0x00a1:
            A07(r6, r9, r0)
        L_0x00a4:
            boolean r0 = r11.A0z()
            if (r0 == 0) goto L_0x00b0
            r0 = 2131974135(0x7f1357f7, float:1.9585325E38)
            A07(r6, r9, r0)
        L_0x00b0:
            if (r10 == 0) goto L_0x0127
            boolean r0 = X.2R8.A03(r7, r10)
            if (r0 == 0) goto L_0x00be
            r0 = 2131972038(0x7f134fc6, float:1.9581072E38)
            A07(r6, r9, r0)
        L_0x00be:
            boolean r0 = r10.A4N()
            if (r0 == 0) goto L_0x00ca
            r0 = 2131976639(0x7f1361bf, float:1.9590404E38)
            A07(r6, r9, r0)
        L_0x00ca:
            X.1Xy r0 = r10.A0C
            java.lang.Boolean r0 = r0.CEw()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            if (r0 == 0) goto L_0x00e9
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323556329532678(0x810c1500002d06, double:3.034501513793346E-306)
            boolean r0 = X.182.A06(r0, r7, r2)
            if (r0 == 0) goto L_0x00e9
            r0 = 2131972233(0x7f135089, float:1.9581468E38)
            A07(r6, r9, r0)
        L_0x00e9:
            X.3WT r0 = X.AnonymousClass3WT.PHOTO_CRED_STICKER
            java.util.List r0 = r10.A3o(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3ui r0 = (X.C255783ui) r0
            if (r0 == 0) goto L_0x010c
            X.BFl r2 = r0.A0L
            if (r2 == 0) goto L_0x010c
            com.instagram.user.model.User r0 = r2.A00
            if (r0 == 0) goto L_0x0104
            r0.Bh3()
        L_0x0104:
            com.instagram.user.model.User r0 = r2.A00
            if (r0 == 0) goto L_0x01c8
            java.lang.String r1 = r0.getId()
        L_0x010c:
            java.lang.String r0 = r7.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0127
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321675133986431(0x810a5f0002267f, double:3.033311838154933E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0127
            r0 = 2131969789(0x7f1346fd, float:1.957651E38)
            A07(r6, r9, r0)
        L_0x0127:
            boolean r0 = X.2R8.A00(r7)
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "[INTERNAL] Pause Playback"
            r9.add(r0)
            java.lang.String r0 = "[INTERNAL] Resume Playback"
            r9.add(r0)
            java.lang.String r0 = "[INTERNAL] Clear EQR cache"
            r9.add(r0)
            java.lang.String r0 = "[INTERNAL] Show Reel Ranker Score"
            r9.add(r0)
        L_0x0141:
            X.3mM r2 = r13.A0G
            boolean r0 = r2.A0D()
            if (r0 != 0) goto L_0x0180
            boolean r0 = r11.A1e()
            if (r0 != 0) goto L_0x0180
            X.1as r1 = X.1as.A04
            if (r12 == 0) goto L_0x01c5
            X.2FW r0 = X.2FW.A19
        L_0x0155:
            boolean r0 = r1.A0J(r7, r0)
            if (r0 == 0) goto L_0x0163
            com.instagram.model.reels.ReelViewerConfig r0 = r13.A0H
            boolean r0 = X.AnonymousClass6YK.A05(r7, r11, r2, r0, r4)
            if (r0 != 0) goto L_0x0180
        L_0x0163:
            X.1as r1 = X.1as.A04
            if (r12 == 0) goto L_0x01c2
            X.2FW r0 = X.2FW.A19
        L_0x0169:
            boolean r0 = r1.A0J(r7, r0)
            if (r0 != 0) goto L_0x0180
            boolean r0 = r11.A1J()
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = "story_highlight_action_sheet"
        L_0x0177:
            A0J(r13, r0, r9)
            A0L(r13, r0, r9)
            A0K(r13, r0, r9)
        L_0x0180:
            A0B(r10, r13, r9)
            boolean r1 = r11.A1E()
            com.instagram.user.model.User r0 = r11.A0i
            if (r1 == 0) goto L_0x01b0
            if (r0 == 0) goto L_0x019c
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.Ccd()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            r1 = 2131975957(0x7f135f15, float:1.958902E38)
            if (r0 != 0) goto L_0x019f
        L_0x019c:
            r1 = 2131967905(0x7f133fa1, float:1.957269E38)
        L_0x019f:
            A07(r6, r9, r1)
        L_0x01a2:
            A0A(r10, r13, r9)
            boolean r0 = X.C17120VIq.A00(r7, r11, r2)
            if (r0 == 0) goto L_0x0028
            A0P(r13, r9)
            goto L_0x0028
        L_0x01b0:
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r0.A1u()
            r1 = 2131967920(0x7f133fb0, float:1.957272E38)
            if (r0 != 0) goto L_0x019f
            r1 = 2131967919(0x7f133faf, float:1.9572718E38)
            goto L_0x019f
        L_0x01bf:
            java.lang.String r0 = "location_story_action_sheet"
            goto L_0x0177
        L_0x01c2:
            X.2FW r0 = X.2FW.A1e
            goto L_0x0169
        L_0x01c5:
            X.2FW r0 = X.2FW.A1e
            goto L_0x0155
        L_0x01c8:
            java.lang.String r1 = ""
            goto L_0x010c
        L_0x01cc:
            X.3BQ r0 = X.AnonymousClass3BQ.EXPLORE_LIVE
            if (r4 == r0) goto L_0x01d4
            X.3BQ r0 = X.AnonymousClass3BQ.TOP_LIVE
            if (r4 != r0) goto L_0x00a4
        L_0x01d4:
            r0 = 2131965446(0x7f133606, float:1.9567702E38)
            goto L_0x00a1
        L_0x01d9:
            android.content.res.Resources r6 = r13.A05
            r0 = 2131972989(0x7f13537d, float:1.9583001E38)
            java.lang.String r0 = r6.getString(r0)
            X.0qQ.A0A(r0)
            r9.add(r0)
            r13.A03 = r0
            com.instagram.common.session.UserSession r0 = r13.A0B
            boolean r0 = X.2R8.A00(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "[INTERNAL] Pause Playback"
            r9.add(r0)
            java.lang.String r0 = "[INTERNAL] Resume Playback"
            r9.add(r0)
            java.lang.String r0 = "[INTERNAL] Clear EQR cache"
            r9.add(r0)
            java.lang.String r0 = "[INTERNAL] Show Reel Ranker Score"
            r9.add(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19201WPh.A0W(X.WPh):java.lang.CharSequence[]");
    }

    public final void A0Z(Context context, DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r27, AnonymousClass6ZA r28, AnonymousClass6ZF r29, X4U x4u, AnonymousClass6ZG r31, AnonymousClass6ZB r32, AnonymousClass6ZC r33) {
        ArrayList arrayList;
        C255773uh r3;
        int i;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        AnonymousClass6ZA r10 = r28;
        AnonymousClass6ZB r9 = r32;
        AnonymousClass6ZC r8 = r33;
        C51974G9v.A1P(r10, onDismissListener2, r9, r8);
        AnonymousClass6ZF r17 = r29;
        AnonymousClass6ZG r20 = r31;
        C51972G9s.A1E(r17, r20);
        this.A01 = onDismissListener2;
        UserSession userSession = this.A0B;
        Context context2 = context;
        C46498Dg1 dg1 = new C46498Dg1(context2, userSession);
        Resources resources = this.A05;
        String A0d = AnonymousClass7TF.A0d(resources, 2131972033);
        String A0d2 = AnonymousClass7TF.A0d(resources, 2131957604);
        if (this.A0I == AnonymousClass3BQ.HIGHLIGHTS_ARCHIVE_GRID_SUBTAB) {
            A07(resources, arrayList, 2131972033);
            if (this.A0G.A0H.A09 != HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY) {
                A07(resources, arrayList, 2131961512);
            }
            A07(resources, arrayList, 2131975841);
            A0P(this, arrayList);
        } else {
            arrayList = new ArrayList();
            Reel reel = this.A0G.A0H;
            if (reel.A0l()) {
                A07(resources, arrayList, 2131957604);
                A07(resources, arrayList, 2131972037);
                r3 = this.A0F;
                if (r3.A1g() && !A0V(this)) {
                    i = 2131973099;
                }
                A0P(this, arrayList);
                A0A(r3.A0b, this, arrayList);
            } else {
                A07(resources, arrayList, 2131972033);
                if (reel.A09 != HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY) {
                    A07(resources, arrayList, 2131961512);
                }
                r3 = this.A0F;
                if (r3.A1g() && !A0V(this)) {
                    A07(resources, arrayList, 2131973099);
                }
                A0K(this, "story_highlight_action_sheet", arrayList);
                A0J(this, "story_highlight_action_sheet", arrayList);
                A0L(this, "story_highlight_action_sheet", arrayList);
                if (182.A06(0Tu.A05, userSession, 36329019529051887L)) {
                    i = 2131953142;
                }
                A0P(this, arrayList);
                A0A(r3.A0b, this, arrayList);
            }
            A07(resources, arrayList, i);
            A0P(this, arrayList);
            A0A(r3.A0b, this, arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            WAJ waj = new WAJ(onDismissListener2, r27, r17, x4u, this, r20, r9, r8, charSequence);
            if (0qQ.A0K(charSequence, A0d) || 0qQ.A0K(charSequence, A0d2)) {
                dg1.A0A(charSequence.toString(), waj);
            } else {
                dg1.A0C(charSequence.toString(), waj);
            }
        }
        dg1.A03 = r10;
        C13988Tno.A0r(context2, dg1);
    }

    public final String getModuleName() {
        return "ReelOptionsDialog";
    }

    public static void A07(Resources resources, AbstractCollection abstractCollection, int i) {
        String string = resources.getString(i);
        0qQ.A07(string);
        abstractCollection.add(string);
    }

    public static final void A0J(C19201WPh wPh, String str, List list) {
        if (wPh.A0U()) {
            if (!182.A06(0Tu.A05, wPh.A0B, 36329079657545497L)) {
                list.add(wPh.A0O);
                wPh.A0T(str, "copy_link");
            }
        }
    }

    public static final void A0K(C19201WPh wPh, String str, List list) {
        if (wPh.A0U()) {
            if (!182.A06(0Tu.A05, wPh.A0B, 36329079657479960L)) {
                list.add(wPh.A0R);
                wPh.A0T(str, C273654mx.A00(405));
            }
        }
    }

    public static final void A0P(C19201WPh wPh, List list) {
        for (Object next : list) {
            if (!0qQ.A0K(wPh.A0R, next) && !0qQ.A0K(wPh.A0O, next)) {
                wPh.A0T("location_story_action_sheet", wPh.A01(AnonymousClass7TG.A0m(next, "", new StringBuilder())));
            }
        }
    }

    public C19201WPh(Activity activity, Resources resources, Fragment fragment, AnonymousClass0iw r10, UserSession userSession, AnonymousClass36V r12, C270594gz r13, AnonymousClass4DU r14, 0Pl r15, C255773uh r16, C250973mM r17, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r19, C309966aD r20, C309426Yf r21, C310066aN r22, AnonymousClass6Z6 r23, String str, String str2, C62320sa r26) {
        AnonymousClass6Z6 r5 = r23;
        0qQ.A0B(r5, 14);
        this.A04 = activity;
        this.A06 = fragment;
        this.A09 = r10;
        this.A05 = resources;
        this.A0V = r20;
        this.A0G = r17;
        C255773uh r4 = r16;
        this.A0F = r4;
        this.A0E = r14;
        this.A0I = r19;
        this.A0Q = str;
        this.A0B = userSession;
        this.A0D = r13;
        this.A0N = r5;
        this.A0U = r15;
        this.A0C = r12;
        this.A0H = reelViewerConfig;
        this.A0W = r22;
        this.A0M = r21;
        this.A0T = r26;
        this.A07 = fragment.getParentFragmentManager();
        this.A08 = AnonymousClass07i.A00(fragment);
        this.A0R = AnonymousClass7TF.A0d(resources, 2131973441);
        this.A0O = AnonymousClass7TF.A0d(resources, 2131956749);
        this.A0S = AnonymousClass7TF.A0d(resources, 2131971010);
        this.A0K = new LEM(fragment, r10, userSession, r4, r5);
        this.A0L = new C17528VZh(fragment, userSession, r4);
        this.A0P = DbX.A0r(r4.A0i);
        this.A0A = AnonymousClass0kN.A01(r10, userSession);
        this.A0J = C309976aE.A00(userSession, r14, str2);
    }

    public final void A0Y(Context context, DialogInterface.OnDismissListener onDismissListener, View view, AnonymousClass0iw r32, AnonymousClass6ZA r33, AnonymousClass6ZF r34, XCI xci, X4S x4s, X4T x4t, C273414mX r38, AnonymousClass6ZK r39, AnonymousClass6ZH r40, AnonymousClass6ZC r41, AnonymousClass6ZJ r42, AnonymousClass6ZI r43) {
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        this.A01 = onDismissListener2;
        UserSession userSession = this.A0B;
        Context context2 = context;
        C46498Dg1 dg1 = new C46498Dg1(context2, userSession);
        for (CharSequence charSequence : A0W(this)) {
            Resources resources = this.A05;
            AnonymousClass6ZH r22 = r40;
            AnonymousClass6ZK r21 = r39;
            C273414mX r20 = r38;
            AnonymousClass6ZI r25 = r43;
            AnonymousClass6ZJ r24 = r42;
            AnonymousClass6ZC r23 = r41;
            AnonymousClass0iw r14 = r32;
            AnonymousClass6ZF r15 = r34;
            XCI xci2 = xci;
            X4S x4s2 = x4s;
            X4T x4t2 = x4t;
            if (C13989Tnp.A1W(resources, charSequence, 2131972204) || C13989Tnp.A1W(resources, charSequence, 2131957531) || C13989Tnp.A1W(resources, charSequence, 2131965273) || C13989Tnp.A1W(resources, charSequence, 2131974282)) {
                dg1.A0A(charSequence.toString(), new WB7(onDismissListener2, r14, r15, xci2, x4s2, x4t2, this, r20, r21, r22, r23, r24, r25, charSequence, 0));
            } else {
                dg1.A0C(charSequence.toString(), new WB7(onDismissListener2, r14, r15, xci2, x4s2, x4t2, this, r20, r21, r22, r23, r24, r25, charSequence, 1));
            }
        }
        View view2 = view;
        if (view == null || this.A0F.CcK() || !182.A06(0Tu.A05, userSession, 36328040275458949L)) {
            dg1.A03 = r33;
            C13988Tno.A0r(context2, dg1);
            return;
        }
        C355148Ov r3 = new C355148Ov(context2, userSession, (Integer) null, false);
        ArrayList arrayList = new ArrayList();
        ArrayList A1L = 0sr.A1L(new CharSequence[]{"[INTERNAL] Pause Playback", "[INTERNAL] Resume Playback", C273654mx.A00(226), "[INTERNAL] Clear EQR cache", "[INTERNAL] Show Reel Ranker Score", null});
        List list = dg1.A09;
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            DbV.A1U(next, arrayList2, A1L.contains(((C67293MlS) next).A04) ? 1 : 0);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C67293MlS mlS = (C67293MlS) it.next();
            String str = mlS.A04;
            if (str == null) {
                str = AnonymousClass7TE.A16(context2, mlS.A02);
            }
            arrayList.add(new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new C19398WXr(mlS, 6), Integer.valueOf(mlS.A08), str, 0, 0, 0, false, false, false, true, false, false, false));
        }
        r3.A02(arrayList);
        r3.A01(view2);
    }

    public static final void A02(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r34, AnonymousClass6ZF r35, XCI xci, X4S x4s, X4T x4t, C19201WPh wPh, C273414mX r40, AnonymousClass6ZK r41, AnonymousClass6ZH r42, AnonymousClass6ZC r43, AnonymousClass6ZJ r44, AnonymousClass6ZI r45, CharSequence charSequence) {
        Context context;
        C270194gL r7;
        C19201WPh wPh2 = wPh;
        Resources resources = wPh2.A05;
        CharSequence charSequence2 = charSequence;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        AnonymousClass0iw r5 = r34;
        XCI xci2 = xci;
        if (C13988Tno.A1X(resources, charSequence2, 2131972204)) {
            A04(onDismissListener2, r5, xci2, wPh2);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131954764)) {
            A05(onDismissListener2, wPh2);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131968504)) {
            UserSession userSession = wPh2.A0B;
            C255773uh r13 = wPh2.A0F;
            User user = r13.A0i;
            if (user != null) {
                Reel reel = wPh2.A0G.A0H;
                String A0H2 = reel.A0H(userSession);
                1NY r12 = new 1NY(userSession);
                Integer num = AnonymousClass05K.A01;
                r12.A08(num);
                r12.A0K("friendships/mute_friend_reel/%s/", new Object[]{user.getId()});
                r12.A9m("source", "explore_viewer");
                r12.A9m("reel_type", A0H2);
                r12.A0R(C320136rp.class, C320146rq.class);
                r12.A0R = true;
                1ES.A00(wPh2.A04, wPh2.A08, r12.A0M());
                AnonymousClass4DU r14 = wPh2.A0E;
                1Xj r4 = r13.A0b;
                if (r4 != null) {
                    String str = reel.A0n;
                    String str2 = wPh2.A0Q;
                    String id = r4.getId();
                    if (id != null) {
                        I7O.A06(r14, (0xF) null, userSession, r4.BR7(), id, r4.getId(), "sfplt_in_viewer", str2, str, r4.A0C.getMezqlToken(), (String) null, (String) null, (String) null, (String) null, -1);
                    }
                    UserSession userSession2 = userSession;
                    I7O.A09(r14, userSession2, (AnonymousClass3W1) null, r4.BR7(), "explore_see_less", r4.getId(), r4.getId(), "sfplt_in_viewer", str2, str, r4.A0C.getLoggingInfoToken(), (String) null, (String) null, (String) null, r4.A0C.BkE(), (String) null, (String) null, (String) null, -1, true, false);
                    1Ns r8 = reel.A0W;
                    if (r8 != null) {
                        if (r8.CAm() == num) {
                            User CCd = r8.CCd();
                            if (CCd == null) {
                                throw new IllegalStateException("Required value was null.");
                            } else if (CCd.equals(user)) {
                                reel.A1Y = true;
                                xci2.DJC();
                            }
                        }
                        xci2.DJA(AnonymousClass3WA.ORGANIC_SHOW_LESS);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (C13988Tno.A1X(resources, charSequence2, 2131965446)) {
            C270194gL r2 = wPh2.A0F.A0c;
            if (r2 != null) {
                UserSession userSession3 = wPh2.A0B;
                AnonymousClass4DU r52 = wPh2.A0E;
                String str3 = r2.A0e;
                str3.getClass();
                String id2 = r2.A03().getId();
                String str4 = wPh2.A0G.A0H.A0n;
                String str5 = wPh2.A0Q;
                1iA r142 = 1iA.A0L;
                I7O.A06(r52, (0xF) null, userSession3, r142, str3, id2, "sfplt_in_viewer", str5, str4, (String) null, (String) null, (String) null, (String) null, (String) null, -1);
                I7O.A09(r52, userSession3, (AnonymousClass3W1) null, r142, "explore_see_less", str3, id2, "sfplt_in_viewer", str5, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, true, false);
                xci2.DJA(AnonymousClass3WA.ORGANIC_SHOW_LESS);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (C13988Tno.A1X(resources, charSequence2, 2131974135)) {
            UserSession userSession4 = wPh2.A0B;
            AnonymousClass4DU r72 = wPh2.A0E;
            1Nv A092 = wPh2.A0F.A09();
            if (A092 != null) {
                C270594gz r53 = wPh2.A0D;
                String A002 = AnonymousClass000.A00(529);
                C60510iO.A00(userSession4);
                if (AnonymousClass3WX.A00(A092, r72)) {
                    C254523sc A012 = C233822wX.A01(r53, A092, r72, A002);
                    A012.A6z = "about";
                    C233822wX.A0C(userSession4, A012, A092, r72, (Integer) null);
                }
                SUL sul = new SUL(wPh2.A04, userSession4, 2EG.A0X, AnonymousClass000.A00(156), false);
                sul.A0S = "ReelOptionsDialog";
                sul.A0A();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (C13988Tno.A1X(resources, charSequence2, 2131972038)) {
            LEM lem = wPh2.A0K;
            C358248ab r54 = new C358248ab((Activity) lem.A07);
            r54.A09(2131972038);
            1Xj r22 = lem.A0C.A0b;
            r22.getClass();
            boolean A4W = r22.A4W();
            int i = 2131972104;
            if (A4W) {
                i = 2131972106;
            }
            r54.A08(i);
            r54.A0K(new LV2(lem, 36), 2131971974);
            DbX.A16(new C18833W4v(14, lem, onDismissListener2), r54);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131976639)) {
            C255773uh r55 = wPh2.A0F;
            if (r55.A0y()) {
                wPh2.A0W.A07(r55, wPh2.A0G, (C297795sM) null, 2EG.A3e);
            } else if (r55.A0w()) {
                wPh2.A0W.A06(r55, wPh2.A0G, (C297795sM) null, 2EG.A3e);
            } else if (r55.A0x()) {
                wPh2.A0W.A05(onDismissListener2, r55, wPh2.A0G, (C297795sM) null, 2EG.A3e);
            } else if (r55.A0v()) {
                C310066aN r3 = wPh2.A0W;
                C310066aN r10 = r3;
                DialogInterface.OnDismissListener onDismissListener3 = onDismissListener2;
                C255773uh r122 = r55;
                C250973mM r132 = wPh2.A0G;
                r10.A04(onDismissListener3, r122, r132, (C297795sM) null, r40, 2EG.A3e);
            }
        } else if (C13988Tno.A1X(resources, charSequence2, 2131972233)) {
            x4t.Dec(wPh2.A0F);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131969789)) {
            x4s.DZX(wPh2.A0F);
        } else if (C13988Tno.A1X(resources, charSequence2, 2131973016)) {
            r41.A00(wPh2.A0F);
        } else {
            AnonymousClass6ZC r46 = r43;
            if ("[INTERNAL] Pause Playback".equals(charSequence2)) {
                r46.A00.A17.EHY("user_paused_video");
            } else if ("[INTERNAL] Resume Playback".equals(charSequence2)) {
                G9w.A1O(r46.A00);
            } else if (0qQ.A0K(wPh2.A0R, charSequence2)) {
                C255773uh r32 = wPh2.A0F;
                if (r32.A1J()) {
                    A0F(wPh2);
                } else if (r32.A17()) {
                    C270194gL r23 = r32.A0c;
                    if (r23 != null) {
                        Activity activity = wPh2.A04;
                        0hq r11 = wPh2.A07;
                        AnonymousClass07i r6 = wPh2.A08;
                        User A032 = r23.A03();
                        String str6 = r23.A0X;
                        str6.getClass();
                        String str7 = r23.A0e;
                        str7.getClass();
                        AnonymousClass4DU r24 = wPh2.A0E;
                        UserSession userSession5 = wPh2.A0B;
                        C48003EQm eQm = new C48003EQm(r11, (Object) activity, (Object) A032, (Object) r24, (Object) userSession5, str6, str7, 3);
                        1OC A013 = FGA.A01(userSession5, AnonymousClass05K.A0Y, A032.getUsername(), str6, r24.getModuleName());
                        A013.A00 = eQm;
                        1ES.A00(activity, r6, A013);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    A0G(wPh2);
                }
                wPh2.A0V.DNy();
            } else if (0qQ.A0K(wPh2.A0O, charSequence2)) {
                C255773uh r33 = wPh2.A0F;
                if (r33.A1J()) {
                    A0D(wPh2);
                } else if (r33.A17()) {
                    C270194gL r36 = r33.A0c;
                    if (r36 != null) {
                        Activity activity2 = wPh2.A04;
                        0hq r123 = wPh2.A07;
                        AnonymousClass07i r62 = wPh2.A08;
                        User A033 = r36.A03();
                        String str8 = r36.A0X;
                        str8.getClass();
                        String str9 = r36.A0e;
                        str9.getClass();
                        AnonymousClass4DU r133 = wPh2.A0E;
                        UserSession userSession6 = wPh2.A0B;
                        EQX eqx = new EQX(activity2, r123, r133, userSession6, str9);
                        1OC A014 = FGA.A01(userSession6, AnonymousClass05K.A00, A033.getUsername(), str8, r133.getModuleName());
                        A014.A00 = eqx;
                        1ES.A00(activity2, r62, A014);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    A0E(wPh2);
                }
                wPh2.A0V.DNx();
            } else if (0qQ.A0K(wPh2.A0S, charSequence2)) {
                A0H(wPh2);
            } else {
                AnonymousClass6ZH r47 = r42;
                if (C13988Tno.A1X(resources, charSequence2, 2131967919)) {
                    AnonymousClass6Z5 r48 = r47.A00;
                    Object obj = r48.A1A.get();
                    if (obj != null) {
                        AnonymousClass4DH r56 = (AnonymousClass4DH) obj;
                        Context context2 = r56.getContext();
                        if (context2 != null) {
                            C273384mU r63 = r48.A17;
                            C255773uh Au5 = r63.Au5();
                            if (Au5 != null) {
                                User user2 = Au5.A0i;
                                String str10 = Au5.A0k;
                                0qQ.A07(str10);
                                C250973mM AuO = r63.AuO(str10);
                                if (user2 == null) {
                                    C59689JTv.A03(context2, context2.getString(2131967926), Pxd.A00(35), 0);
                                } else {
                                    UserSession userSession7 = r48.A09;
                                    if (userSession7 != null) {
                                        Dialog A003 = C49811F7y.A00(context2, r48.A15, userSession7, user2, new C57443Ian(context2, r56, AuO, r48), AnonymousClass05K.A0C, (String) null, "reel_overflow");
                                        r48.A02 = A003;
                                        if (A003 != null) {
                                            A003.setOnCancelListener(new W4V(r48, 8));
                                            A003.setOnDismissListener(new W5b(r48, 7));
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (C13988Tno.A1X(resources, charSequence2, 2131952630)) {
                    A08(r5, wPh2);
                } else if (C13988Tno.A1X(resources, charSequence2, 2131967920)) {
                    AnonymousClass6Z5 r64 = r47.A00;
                    Object obj2 = r64.A1A.get();
                    if (obj2 != null) {
                        Fragment fragment = (Fragment) obj2;
                        Context context3 = fragment.getContext();
                        if (context3 != null) {
                            C255773uh Au52 = r64.A17.Au5();
                            if (Au52 != null) {
                                User user3 = Au52.A0i;
                                if (user3 == null) {
                                    C59689JTv.A03(context3, context3.getString(2131967926), Pxd.A00(35), 0);
                                } else {
                                    UserSession userSession8 = r64.A09;
                                    if (userSession8 != null) {
                                        AnonymousClass4DU r102 = r64.A15;
                                        C49176Eqh.A00(r102, userSession8, user3, AnonymousClass05K.A00, (String) null, "reel_overflow");
                                        UserSession userSession9 = r64.A09;
                                        if (userSession9 != null) {
                                            C49176Eqh.A00(r102, userSession9, user3, AnonymousClass05K.A1I, (String) null, "reel_overflow");
                                            C47692EDb eDb = new C47692EDb(26, (Object) fragment, (Object) r64, (Object) context3);
                                            UserSession userSession10 = r64.A09;
                                            if (userSession10 != null) {
                                                FCW.A02(eDb, userSession10, user3, r102.getModuleName());
                                            }
                                        }
                                    }
                                    0qQ.A0F("userSession");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (C13988Tno.A1X(resources, charSequence2, 2131967905)) {
                    Context requireContext = wPh2.A06.requireContext();
                    User user4 = wPh2.A0F.A0i;
                    if (user4 != null) {
                        C358248ab r57 = new C358248ab(requireContext);
                        r57.A05 = DbY.A0b(requireContext, user4, 2131962023);
                        r57.A08(2131962022);
                        r57.A0O(new W5R(4, (Object) requireContext, (Object) user4, (Object) wPh2), C358278ae.RED, 2131967919);
                        r57.A05();
                        r57.A0f(onDismissListener2);
                        DbT.A1V(r57);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else if (C13988Tno.A1X(resources, charSequence2, 2131975957)) {
                    Fragment fragment2 = wPh2.A06;
                    Context requireContext2 = fragment2.requireContext();
                    User user5 = wPh2.A0F.A0i;
                    if (user5 != null) {
                        AnonymousClass7TE.A1Z(new MH5(requireContext2, wPh2, user5, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(fragment2));
                        onDismissListener2.onDismiss((DialogInterface) null);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    AnonymousClass6ZI r49 = r45;
                    if (C13988Tno.A1X(resources, charSequence2, 2131965449)) {
                        r49.A00(true);
                    } else if (C13988Tno.A1X(resources, charSequence2, 2131965448)) {
                        r49.A00(false);
                    } else if (C13988Tno.A1X(resources, charSequence2, 2131965273)) {
                        C255773uh r37 = wPh2.A0F;
                        AnonymousClass6Z5 r103 = r44.A00;
                        Fragment fragment3 = (Fragment) r103.A1A.get();
                        if (!(fragment3 == null || (context = fragment3.getContext()) == null || (r7 = r37.A0c) == null)) {
                            C228602lw r58 = new C228602lw(fragment3.requireContext(), AnonymousClass07i.A00(fragment3), (Integer) null);
                            String str11 = r7.A0X;
                            str11.getClass();
                            UserSession userSession11 = r103.A09;
                            if (userSession11 != null) {
                                1OC A052 = LTC.A05(userSession11, str11);
                                A052.A00 = new KAR(9, context, r7, r103);
                                r58.schedule(A052);
                            }
                        }
                        onDismissListener2.onDismiss(A0X);
                    } else if (C13988Tno.A1X(resources, charSequence2, 2131957531)) {
                        W2A w2a = A0Y;
                        Reel reel2 = wPh2.A0G.A0H;
                        C255773uh r38 = wPh2.A0F;
                        Activity activity3 = wPh2.A04;
                        Fragment fragment4 = wPh2.A06;
                        0hq r143 = wPh2.A07;
                        AnonymousClass0iw r15 = wPh2.A09;
                        w2a.A04(activity3, wPh2.A01, fragment4, r143, r15, r5, wPh2.A0B, reel2, r38, r35);
                    } else if ("[INTERNAL] Clear EQR cache".equals(charSequence2)) {
                        C314266hv.A03.A00(wPh2.A0B);
                    } else if ("[INTERNAL] Show Reel Ranker Score".equals(charSequence2)) {
                        C255773uh r39 = wPh2.A0F;
                        FragmentActivity requireActivity = wPh2.A06.requireActivity();
                        UserSession userSession12 = wPh2.A0B;
                        C309516Yo r410 = new C309516Yo(requireActivity, userSession12);
                        Bundle A0B2 = DbY.A0B("reel_id", r39.A0k);
                        AnonymousClass0Dg.A00(A0B2, userSession12);
                        C54138H0i h0i = new C54138H0i();
                        h0i.setArguments(A0B2);
                        r410.A0B((Bundle) null, h0i);
                        r410.A04();
                    } else if (C13988Tno.A1X(resources, charSequence2, 2131974282)) {
                        C17040VFo.A00(wPh2.A04, wPh2.A07, wPh2.A0B, wPh2.A0F);
                    }
                }
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        wPh2.A01 = null;
        C250973mM r411 = wPh2.A0G;
        if (C17120VIq.A00(wPh2.A0B, wPh2.A0F, r411)) {
            A0I(wPh2, AnonymousClass7TG.A0m(charSequence2, "", new StringBuilder()));
        }
    }
}
