package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LsB  reason: case insensitive filesystem */
public final class C65370LsB implements C358618bC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65370LsB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final boolean onToggle(boolean z) {
        String str;
        String str2;
        boolean z2;
        int i;
        Object value;
        GSY gsy;
        String str3;
        AnonymousClass62O r1;
        Drawable drawable;
        String str4;
        C62652KkE kkE;
        String str5;
        boolean z3 = z;
        switch (this.A00) {
            case 0:
                Object obj = this.A01;
                C61520KAz kAz = (C61520KAz) this.A02;
                C63648L1k l1k = kAz.A08;
                if (l1k == null) {
                    return false;
                }
                K8A k8a = l1k.A00;
                if (k8a instanceof C61942KSr) {
                    C61942KSr kSr = (C61942KSr) k8a;
                    if (JTT.A0Y(kSr).A0U) {
                        LM3 lm3 = kSr.A0A;
                        if (lm3 == null) {
                            return false;
                        }
                        LM3.A00(lm3, 2131961823, 2131961794);
                        return false;
                    }
                }
                TextView textView = kAz.A03;
                if (textView != null) {
                    textView.setVisibility(DbW.A01(z3 ? 1 : 0));
                }
                WGU wgu = kAz.A0B;
                String str6 = kAz.A0E;
                String str7 = kAz.A09;
                String obj2 = obj.toString();
                if (z) {
                    str = "create_promotion_toggle_on";
                } else {
                    str = "create_promotion_toggle_off";
                }
                wgu.A01 = str6;
                wgu.A02 = str7;
                wgu.A0R(obj2, str);
                C63648L1k l1k2 = kAz.A08;
                if (l1k2 == null) {
                    return true;
                }
                K8A k8a2 = l1k2.A00;
                if (!(k8a2 instanceof C61942KSr)) {
                    return true;
                }
                C61942KSr kSr2 = (C61942KSr) k8a2;
                kSr2.A0O = z3;
                C61942KSr.A0A(kSr2);
                return true;
            case 1:
                L10 l10 = (L10) this.A01;
                if (z) {
                    str2 = ((Reel) this.A02).getId();
                } else {
                    str2 = null;
                }
                l10.A00.A01(str2, (ArrayList) null);
                return true;
            case 2:
                if (C363388je.A03((C299935wF) this.A01)) {
                    if (z) {
                        C65228LpY lpY = (C65228LpY) this.A02;
                        UserSession userSession = lpY.A05;
                        if (!182.A06(0Tu.A05, userSession, 36328345218071818L)) {
                            C367188qK r4 = new C367188qK(userSession);
                            AnonymousClass4DH r3 = lpY.A04;
                            LEO A002 = C63435Kwv.A00(r3.requireActivity(), AnonymousClass818.IG_FEED_COMPOSER_ADVANCED_SETTINGS_TOGGLE_ENABLE, userSession);
                            A002.A0A = AnonymousClass6SR.A02();
                            A002.A01 = r3;
                            r4.A01((C376569Im) null, A002, C65669Lxk.A00);
                        }
                    }
                    return true;
                }
                C65228LpY lpY2 = (C65228LpY) this.A02;
                UserSession userSession2 = lpY2.A05;
                if (userSession2 != null && AnonymousClass0eD.A01(userSession2) == 16V.A05 && 182.A06(0Tu.A05, userSession2, 36322233479604246L)) {
                    return true;
                }
                lpY2.A06.A06("ig_fb_share_advanced_settings", (List) null);
                return false;
            case 3:
                C65183Lom lom = (C65183Lom) this.A02;
                UserSession userSession3 = lom.A02;
                27p.A01(userSession3).A1B(lom.A00, lom.A01);
                1QP A003 = AnonymousClass1QO.A00(userSession3);
                0xY A0p = AnonymousClass7TE.A0p((1Av) this.A01);
                if (z) {
                    A0p.E5Z(AnonymousClass000.A00(296), 1);
                    A0p.apply();
                    z2 = false;
                    FCT.A01((AnonymousClass0iw) null, userSession3, "reels_advanced_setting", AnonymousClass000.A00(3242), (String) null);
                    i = 681252206;
                } else {
                    A0p.E5Z(AnonymousClass000.A00(296), 0);
                    A0p.apply();
                    z2 = false;
                    FCT.A01((AnonymousClass0iw) null, userSession3, "reels_advanced_setting", AnonymousClass000.A00(3241), (String) null);
                    i = 681257100;
                }
                long flowStartForMarker = A003.flowStartForMarker(i, "reels_advanced_setting", z2);
                A003.flowAnnotate(flowStartForMarker, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "reels_advanced_setting");
                A003.flowEndSuccess(flowStartForMarker);
                return true;
            case 4:
                C65226LpW lpW = (C65226LpW) this.A02;
                C61843KOh kOh = lpW.A05;
                AnonymousClass0Ud r10 = kOh.A06;
                if (((KO6) r10.getValue()).A04) {
                    C65226LpW.A01(lpW);
                    return false;
                } else if (z) {
                    UserSession userSession4 = lpW.A04;
                    AnonymousClass4DH r12 = lpW.A02;
                    Context requireContext = r12.requireContext();
                    C55974Hqf A004 = C55252Heh.A00(userSession4);
                    1Av r9 = A004.A01;
                    0s0 r5 = r9.A4F;
                    AnonymousClass0YZ[] r42 = 1Av.A8a;
                    if (!AnonymousClass7TG.A1a(r9, r5, r42, 50) && (drawable = requireContext.getDrawable(R.drawable.riffs_qp_riffs_qp)) != null) {
                        F3t f3t = new F3t(requireContext);
                        JRL jrl = A004.A00;
                        f3t.A06 = AnonymousClass7TE.A16(requireContext, jrl.AsJ());
                        f3t.A04 = AnonymousClass7TE.A16(requireContext, jrl.AsI());
                        f3t.A03(drawable);
                        f3t.A05 = AnonymousClass05K.A01;
                        f3t.A02(new C56719I8z(A004, 46), AnonymousClass7TE.A16(requireContext, 2131955799));
                        String A16 = AnonymousClass7TE.A16(requireContext, 2131964884);
                        C56718I8y i8y = new C56718I8y(13, (Object) requireContext, (Object) A004);
                        f3t.A07 = A16;
                        f3t.A00 = i8y;
                        f3t.A09 = true;
                        f3t.A01();
                        AnonymousClass29V r13 = ((27r) A004.A02.A02.getValue()).A0C;
                        0Aj A0e = AnonymousClass7TE.A0e(r13.A01, "ig_camera_nux");
                        if (A0e.isSampled()) {
                            JTO.A1Q(A0e, AnonymousClass000.A00(1025));
                            A0e.AAJ("nux_step", "OPEN");
                            JTO.A1S(A0e, JTP.A0p(r13.A04));
                            AnonymousClass7TE.A1W(A0e, "event_type", 2);
                            JTP.A1E(A0e);
                            C51965G9l.A1A(C59725JVj.SHARE_SHEET, A0e);
                            A0e.A8M(HOA.SPINNABLE_REEL, "spin_type");
                            A0e.Cgf();
                        }
                        AnonymousClass7TF.A1J(r9, r5, r42, 50, true);
                    }
                    C53024GhF ghF = lpW.A03;
                    String str8 = ((KO6) r10.getValue()).A01;
                    05G r92 = ghF.A00;
                    do {
                        value = r92.getValue();
                        gsy = (GSY) value;
                        str3 = gsy.A03;
                        r1 = (AnonymousClass62O) gsy.A00;
                        0qQ.A0B(r1, 3);
                    } while (!r92.AIY(value, new GSY((C381879cj) gsy.A01, str8, str3, r1)));
                    KO6 ko6 = (KO6) r10.getValue();
                    List<C248883ik> list = ko6.A02;
                    if (list != null) {
                        int i2 = ko6.A00;
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        for (C248883ik r2 : list) {
                            A0r.add(new C381879cj(r2, JTQ.A1O((int) (r2.A00 - r2.A07), i2)));
                        }
                        C53024GhF.A00(ghF, AnonymousClass62Q.A03(A0r));
                    }
                    C55366HgY.A00(r12.requireActivity(), userSession4, (C62320sa) this.A01, C66296MMf.A00(lpW, 14), C66296MMf.A00(lpW, 15), new C58132Imy(kOh, 63), new MIX(kOh, 5));
                    return false;
                } else {
                    C53024GhF.A00(lpW.A03, AnonymousClass62M.A01);
                    C65226LpW.A02(lpW, false);
                    AnonymousClass29c r32 = C65226LpW.A00(lpW).A0H;
                    1Ln A0B = 1Ln.A0B(r32.A01);
                    if (!DbT.A1Y(A0B)) {
                        return false;
                    }
                    A0B.A0M(AnonymousClass80P.SPINS_TOGGLE, "tool_type");
                    AnonymousClass29c.A00(A0B, r32);
                    A0B.A0a(C279294yP.CLIPS);
                    A0B.A0d(C59725JVj.SHARE_SHEET);
                    A0B.Cgf();
                    return false;
                }
            case 5:
                if (this.A01 == C48153EZv.A05) {
                    C65229LpZ lpZ = (C65229LpZ) this.A02;
                    UserSession userSession5 = lpZ.A0J;
                    if (C363558jv.A00(userSession5) != z3 && lpZ.A0F) {
                        if (lpZ.A0E) {
                            str4 = "tooltip_shown_only";
                        } else {
                            str4 = null;
                        }
                        C63424Kwk.A00(userSession5, "click", str4, z3);
                        if (!2Lv.A00(userSession5).A00(CallerContext.A00(C60058JeZ.class), "ig_android_linking_cache_feed_composer")) {
                            FFL.A00(C48152EZu.A0E, userSession5, "upsell_primary_click");
                        }
                        lpZ.A0F = false;
                    }
                }
                View view = ((C65229LpZ) this.A02).A01;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            default:
                C61372K4q k4q = (C61372K4q) this.A02;
                L6U l6u = k4q.A00;
                if (l6u == null) {
                    0qQ.A0F("logger");
                    throw AnonymousClass00P.createAndThrow();
                }
                0Aj A0e2 = AnonymousClass7TE.A0e(l6u.A00, "ig_creator_agents_suggested_replies_settings_toggle");
                if (A0e2.isSampled()) {
                    0bb r22 = new 0bb();
                    r22.A03("toggle_enabled", Boolean.valueOf(z3));
                    A0e2.AAK(r22, "sr_context");
                    SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext = l6u.A01;
                    String str9 = null;
                    if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                        kkE = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A00;
                    } else {
                        kkE = null;
                    }
                    A0e2.A8M(kkE, "inbox_type");
                    if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                        str5 = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A02;
                    } else {
                        str5 = null;
                    }
                    A0e2.AAJ("sr_session_id", str5);
                    if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                        str9 = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A03;
                    }
                    A0e2.AAJ("thread_session_id", str9);
                    DbV.A1J(A0e2, l6u.A02);
                }
                C60225Jhi jhi = (C60225Jhi) k4q.A02.getValue();
                if (z) {
                    jhi.A00();
                    return z3;
                }
                CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository = jhi.A00;
                if (JTR.A1a(creatorAgentSuggestedRepliesSettingsRepository.A01)) {
                    AnonymousClass7TE.A1Z(new C58102ImO(creatorAgentSuggestedRepliesSettingsRepository, C51975G9x.A0t(creatorAgentSuggestedRepliesSettingsRepository.A00), 49), creatorAgentSuggestedRepliesSettingsRepository.A01);
                }
                C310336ap A0W = DbV.A0W();
                Context context = ((View) this.A01).getContext();
                DbS.A19(context, A0W, 2131974721);
                A0W.A0I = context.getString(2131974720);
                DbY.A1N(A0W);
                return z3;
        }
    }
}
