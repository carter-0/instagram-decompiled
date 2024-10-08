package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3WZ  reason: invalid class name */
public final class AnonymousClass3WZ implements C242813Wa {
    public final Fragment A00;
    public final 0hq A01;
    public final C2355930l A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C231332rR A05;
    public final AnonymousClass57Q A06;
    public final C249763kK A07;
    public final String A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(C242823Wc.A00);
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new C377239Lb(this, 33));
    public final AnonymousClass57V A0B;
    public final AnonymousClass57T A0C;
    public final AnonymousClass311 A0D;
    public final 1GI A0E;
    public final AnonymousClass2xS A0F;
    public final C242833We A0G;
    public final AnonymousClass32A A0H;
    public final C228232l0 A0I;
    public final String A0J;

    public static final void A01(AnonymousClass3WZ r12, AnonymousClass3W1 r13, Reel reel, AnonymousClass3N3 r15) {
        AnonymousClass3BQ r9;
        Reel reel2 = reel;
        ArrayList A1M = 0sr.A1M(new Reel[]{reel});
        if (r13.A0o == 1sy.A0U) {
            r9 = AnonymousClass3BQ.SINGLE_FEED_ITEM_HEADER;
        } else {
            r9 = AnonymousClass3BQ.FEED_ITEM_HEADER;
        }
        UserSession userSession = r12.A03;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36328027390688119L);
        List A0U = 1OP.A05(userSession).A0U(true);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0U) {
            Reel reel3 = (Reel) next;
            if (!reel3.A16(userSession) && !reel3.A0f() && !reel3.A0e() && !A1M.contains(reel3)) {
                arrayList.add(next);
            }
        }
        if (A062 && arrayList.size() >= 5) {
            Reel reel4 = new Reel(AnonymousClass05K.A0N, (List) null, arrayList);
            reel4.A1B = false;
            A1M.add(reel4);
            A1M.addAll(arrayList);
        }
        AnonymousClass32A r7 = r12.A0H;
        r7.A0C = r12.A0J;
        r7.A05 = new C16165Upq((Activity) r12.A00.getActivity(), r15.AeY(), (C230222pE) new FkZ(r12));
        r7.A05(reel2, r9, r15, A1M, A1M, A1M);
    }

    public final void CnN(View view, String str) {
        0qQ.A0B(view, 0);
        0qQ.A0B(str, 1);
        if (!1Au.A00(this.A03).A01.getBoolean("has_seen_feed_close_friends_indicator_tooltip", false)) {
            FragmentActivity requireActivity = this.A00.requireActivity();
            String string = view.getResources().getString(2131956184, new Object[]{str});
            0qQ.A07(string);
            AnonymousClass5Gt r1 = new AnonymousClass5Gt(requireActivity, new C315476jx((CharSequence) string));
            r1.A03(view);
            r1.A06(C226262fy.BELOW_ANCHOR);
            r1.A00 = 5000;
            r1.A0A = true;
            r1.A04 = new C389249p8(this);
            view.postDelayed(new C51203FqK(r1.A00()), 500);
        }
    }

    public final void Cna(View view, String str) {
        0qQ.A0B(view, 0);
        0qQ.A0B(str, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C318996ps.A00().A01().A01(activity, view, this.A03, str);
        }
    }

    public final void CuN(1Xj r8, AnonymousClass3W1 r9, Integer num, String str, boolean z) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        0qQ.A0B(num, 3);
        this.A0D.BYI().CuO(r8, r9, num, str, z, false);
    }

    public final void Cx1(1Xj r8) {
        1Xj r3 = r8;
        0qQ.A0B(r8, 0);
        ArrayList arrayList = new ArrayList();
        User CCd = r8.A0C.CCd();
        if (CCd != null) {
            arrayList.add(CCd);
        }
        List Aay = r8.A0C.Aay();
        if (Aay != null) {
            arrayList.addAll(Aay);
        }
        Fragment fragment = this.A00;
        AnonymousClass4DU r4 = this.A04;
        UserSession userSession = this.A03;
        String string = fragment.getString(2131975423);
        0qQ.A07(string);
        LTZ.A0C(fragment, userSession, r3, r4, string, arrayList);
    }

    public final void Cy5(AnonymousClass3ZH r10, AnonymousClass3W1 r11) {
        AnonymousClass57V r7;
        String str;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        if (C246383eV.A00(r10) && (r7 = this.A0B) != null) {
            AnonymousClass3OA r6 = (AnonymousClass3OA) r7.A01.BTe(r11.getPosition());
            if (r6 == null) {
                0f9 A002 = 0wj.A00("An injected ad is missing in sponsored content injector.", 817898950, true);
                A002.ABQ("ig_host_profile_id", r7.A02);
                A002.ABO(C273654mx.A00(231), r11.getPosition());
                A002.ABQ("module_name", r7.A03);
                A002.report();
                return;
            }
            AnonymousClass1wP A003 = 1wN.A00(r7.A00);
            AnonymousClass3OA A004 = A003.A00(r6.A0K);
            if (!(A004 == null || (str = A004.A0c) == null)) {
                String str2 = r6.A0c;
                if (!str.equals(str2)) {
                    0f9 A005 = 0wj.A00("ad locator host_profile_id overwrite", 817896121, true);
                    A005.ABQ(AnonymousClass000.A00(3686), str);
                    A005.ABQ(AnonymousClass000.A00(3624), str2);
                    A005.ABQ("module_name", r7.A03);
                    A005.report();
                }
            }
            A003.A01(r6);
        }
    }

    public final void Cy7(1Xj r7, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r7, 1);
        C313716gt r3 = (C313716gt) this.A0A.getValue();
        User A2A = r7.A2A(this.A03);
        if (A2A != null) {
            String id = A2A.getId();
            String id2 = r7.getId();
            if (id2 != null) {
                0wc r2 = r3.A08;
                0Aj A002 = r2.A00(r2.A00, "ig_live_feed_ring_impression");
                A002.AAE(new C263944Ny(Long.valueOf(Long.parseLong(id))), "a_pk");
                A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str)));
                A002.AAJ("m_pk", id2);
                A002.AAJ("container_module", r3.A07.getModuleName());
                A002.AAJ("view_mode", "viewer");
                A002.AAe(C273654mx.A00(2229), 00k.A0a(r3.A06));
                A002.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    public final void D2C(1Xj r24, AnonymousClass3W1 r25, User user, int i) {
        User user2 = user;
        0qQ.A0B(user2, 0);
        1Xj r9 = r24;
        0qQ.A0B(r9, 1);
        AnonymousClass3W1 r0 = r25;
        0qQ.A0B(r0, 2);
        UserSession userSession = this.A03;
        C271794jb r7 = new C271794jb(userSession, r9, r0.A06());
        r7.A06 = user2.getId();
        AnonymousClass4DU r10 = this.A04;
        User A2A = r9.A2A(userSession);
        if (A2A != null) {
            boolean A2Q = A2A.A2Q();
            C233822wX.A0K(userSession, r7, HLF.BRAND, r9, r10, this.A07, Integer.valueOf(r0.A03), "sponsor_above_caption", A2Q);
            A03(r9);
            if (user2.A2Q()) {
                String A072 = C231122qu.A07(userSession, r9);
                if (A072 != null) {
                    FragmentActivity activity = this.A00.getActivity();
                    if (activity != null) {
                        C309516Yo r72 = new C309516Yo(activity, userSession);
                        r72.A08();
                        String id = r9.getId();
                        if (id != null) {
                            String id2 = user2.getId();
                            int position = r0.getPosition();
                            int i2 = r0.A03;
                            ? obj = new Object();
                            obj.A06 = id;
                            obj.A02 = position;
                            obj.A00 = i2;
                            obj.A08 = id2;
                            r72.A0B((Bundle) null, C250563lf.A0A(obj, A072, false));
                            r72.A04();
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    return;
                }
                A04(r9, r0);
                return;
            }
            AnonymousClass3W1 r17 = r0;
            A05(r9, r17, (Boolean) null, user2.getId(), "sponsor_above_caption", i, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D2D(1Xj r7, AnonymousClass3W1 r8) {
        1Xj r3 = r7;
        0qQ.A0B(r7, 0);
        UserSession userSession = this.A03;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            I3z.A00(activity, IGAdTransparencyDisclaimerPlacement.ABOVE_IMAGE, userSession, r3, C54646HMd.FEED, C46027DJk.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D2E(User user) {
        0qQ.A0B(user, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && !(!AnonymousClass06S.A01(this.A01))) {
            C49805F7r.A01(activity, 28D.A31, this.A03, new PendingRecipient(user), false, false);
        }
    }

    public final void D2I(1Xj r15) {
        1Xj r4 = r15;
        0qQ.A0B(r15, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            boolean A5G = r15.A5G();
            String str = null;
            String A002 = AnonymousClass000.A00(4770);
            UserSession userSession = this.A03;
            AnonymousClass4DU r2 = this.A04;
            User A2A = r15.A2A(userSession);
            if (A5G) {
                if (A2A != null) {
                    str = A2A.getId();
                }
                C321406u6.A00(r2, userSession, r4, A002, str, 0oI.A0A(activity));
            } else {
                if (A2A != null) {
                    str = A2A.getId();
                }
                C321406u6.A01(r2, userSession, r4, A002, str, 0oI.A0A(activity));
            }
            C49965FGy.A05(activity, userSession, r2.getModuleName(), r15.A0C.Ad2(), A002, !r15.A5G());
        }
    }

    public final void D2J(1Xj r3, AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        User A29 = r3.A29();
        if (A29 != null) {
            D2C(r3, r4, A29, i);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D2L(1Xj r12) {
        C376689Iy Ato;
        1Xj r7 = r12;
        0qQ.A0B(r12, 0);
        UserSession userSession = this.A03;
        C52086GEg.A0D(C52236GKd.A1Q, userSession, r7, this.A04, AnonymousClass000.A00(4730), true);
        if (AnonymousClass3WS.A09(userSession, r12)) {
            FragmentActivity activity = this.A00.getActivity();
            if (activity != null) {
                String id = r12.getId();
                C270634h3 r1 = new C270634h3(ClipsViewerSource.FEED_CONTEXTUAL_SELF_PROFILE, userSession);
                r1.A1C = id;
                r1.A1a = true;
                r1.A1B = userSession.A06;
                r1.A1c = false;
                ClipsViewerConfig A002 = r1.A00();
                0qQ.A0B(A002, 2);
                C243473Yx.A07(activity, A002, userSession, false, false);
                return;
            }
            return;
        }
        C232722uK r8 = this.A0F.A0G;
        if (r8 != null) {
            Fragment fragment = this.A00;
            Context requireContext = fragment.requireContext();
            AnonymousClass4M3 r0 = r8.A05;
            if (r0 == null || (Ato = r0.Ato()) == null) {
                C310336ap r13 = new C310336ap();
                r13.A0D = requireContext.getString(2131954779);
                1xC.A01.A00(new AnonymousClass3GP(r13.A00()));
                return;
            }
            boolean z = Ato.A03;
            FragmentActivity requireActivity = fragment.requireActivity();
            C54159H1d h1d = new C54159H1d();
            Bundle bundle = new Bundle();
            bundle.putBoolean(AnonymousClass000.A00(1507), z);
            h1d.setArguments(bundle);
            h1d.A00 = new ICP(requireActivity, requireContext, userSession, r7, r8);
            new C331127Pr(userSession).A00().A03(requireContext, h1d);
        }
    }

    public final void D2O(1Xj r2, AnonymousClass3W1 r3, int i, boolean z) {
        String A002;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (r2.A4z() || C231122qu.A0Q(this.A03, r2)) {
            A002 = C273654mx.A00(753);
        } else {
            A002 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }
        A06(r2, r3, A002, z);
    }

    public final void D2P(1Xj r2, AnonymousClass3W1 r3, int i, boolean z) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        A06(r2, r3, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, z);
    }

    public final void D2U(1Xj r7, AnonymousClass3W1 r8) {
        String str;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C358248ab r2 = new C358248ab((Activity) activity);
            r2.A0i(activity.getDrawable(R.drawable.ig_illustrations_qp_star_refresh));
            r2.A09(2131962081);
            r2.A08(2131962082);
            r2.A0J(new FIV(activity, this, r7, r8), 2131961450);
            r2.A0H(new FIJ(this, r7, r8), 2131960992);
            AnonymousClass0fN.A00(r2.A02());
            C297555rw A002 = C297545rv.A00(this.A03);
            String moduleName = this.A04.getModuleName();
            String sessionId = this.A07.getSessionId();
            UserSession userSession = A002.A00;
            0wc A012 = AnonymousClass0kN.A01(new 0xG(moduleName), userSession);
            0Aj A003 = A012.A00(A012.A00, "instagram_feed_favorite_pin_tap");
            if (A003.isSampled()) {
                A003.AAJ("module", moduleName);
                String A30 = r7.A30();
                A30.getClass();
                A003.A9F("ig_media_id", Long.valueOf(Long.parseLong(A30)));
                if (r7.A0C.BIl() != null) {
                    str = r7.A0C.BIl();
                } else {
                    str = "";
                }
                A003.AAJ("inventory_source", str);
                A003.AAJ("ranking_info_token", r7.A0C.getLoggingInfoToken());
                User A2A = r7.A2A(userSession);
                A2A.getClass();
                A003.A9F("media_author_id", Long.valueOf(Long.parseLong(A2A.getId())));
                A003.A9F("m_ix", Long.valueOf((long) r8.getPosition()));
                A003.A9F("recs_ix", Long.valueOf((long) r8.A0W));
                A003.AAJ("ranking_session_id", sessionId);
                A003.A9F("m_t", Long.valueOf((long) r7.BR7().A00));
                A003.Cgf();
            }
        }
    }

    public final void D2Z(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        AnonymousClass57T r0 = this.A0C;
        if (r0 != null) {
            r0.D21(r2, r3);
        }
    }

    public final void D2c(1Xj r13) {
        AnonymousClass9OT r2;
        AnonymousClass9OT r6;
        0qQ.A0B(r13, 0);
        UserSession userSession = this.A03;
        AnonymousClass4DU r1 = this.A04;
        String moduleName = r1.getModuleName();
        String A2n = r13.A2n();
        if (r13.A5G()) {
            r2 = AnonymousClass9OT.REEL;
        } else {
            r2 = AnonymousClass9OT.POST;
        }
        C250563lf.A0e(r2, r13.A1I(), userSession, (Boolean) null, moduleName, C273654mx.A00(152), A2n);
        Context requireContext = this.A00.requireContext();
        String moduleName2 = r1.getModuleName();
        String A2n2 = r13.A2n();
        if (r13.A5G()) {
            r6 = AnonymousClass9OT.REEL;
        } else {
            r6 = AnonymousClass9OT.POST;
        }
        JUL.A00(requireContext, r6, r13.A1I(), userSession, moduleName2, A2n2, false);
    }

    public final void D2f(1Xj r5, AnonymousClass3W1 r6, Hashtag hashtag, int i) {
        FragmentActivity activity;
        0qQ.A0B(hashtag, 1);
        if (!(!AnonymousClass06S.A01(this.A01)) && (activity = this.A00.getActivity()) != null) {
            UserSession userSession = this.A03;
            C309516Yo r3 = new C309516Yo(activity, userSession);
            r3.A08();
            String moduleName = this.A04.getModuleName();
            Fragment A012 = W0l.A01(userSession);
            A012.setArguments(W0l.A00(hashtag, moduleName, "feed_story_media"));
            r3.A0D(A012);
            r3.A0B = "media_header_hashtag";
            r3.A04();
        }
    }

    public final void D2h(1Xj r9) {
        0qQ.A0B(r9, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C55316Hfj.A00.A00(activity, C391589tK.FEED_ATTRIBUTION, AnonymousClass8ZN.FEED_ATTRIBUTION_LINE, this.A03, r9.getId(), this.A04.getModuleName());
        }
    }

    public final void D2k(1Xj r4) {
        0qQ.A0B(r4, 0);
        2AS r2 = AnonymousClass2AV.A00;
        A03(r4);
        if (r4.A2M().intValue() != 2) {
            if (r2 != null) {
                r2.A02(this.A00.requireContext(), r4, this.A04);
            }
        } else if (r2 != null) {
            r2.A03(this.A00.requireActivity(), r4, this.A04);
        }
        2cc A002 = C71342cb.A00(this.A03);
        String A2n = r4.A2n();
        if (A2n != null) {
            A002.A0A = A2n;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D2l(String str) {
        0qQ.A0B(str, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            IgFragmentFactoryImpl.A00();
            F3W f3w = new F3W();
            f3w.A0B = str;
            f3w.A0E = this.A04.getModuleName();
            f3w.A0N = true;
            AnonymousClass6W8 r1 = new AnonymousClass6W8(activity, f3w.A00(), this.A03, ModalActivity.class, AnonymousClass000.A00(192));
            r1.A08();
            r1.A0C(activity);
        }
    }

    public final void D2m(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A0D.BRD().D2m(r2, r3, i);
    }

    public final void D2n(1Xj r12, AnonymousClass3W1 r13) {
        String str;
        1Xj r3 = r12;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r13, 1);
        AnonymousClass4DU r4 = this.A04;
        UserSession userSession = this.A03;
        long position = (long) r13.getPosition();
        C249763kK r1 = this.A07;
        if (r1 instanceof AnonymousClass93U) {
            str = ((AnonymousClass93U) r1).CFD();
        } else {
            str = "";
        }
        C52086GEg.A0l(userSession, r3, r4, str, r1.getSessionId(), position);
        C52345GOp.A05(this.A00, userSession, r12, r4, r1.getSessionId(), this.A08);
    }

    public final void D2q(1Xj r11, AnonymousClass3W1 r12, String str) {
        0qQ.A0B(r11, 0);
        UserSession userSession = this.A03;
        User A2A = r11.A2A(userSession);
        if (A2A != null) {
            List singletonList = Collections.singletonList(new PendingRecipient(A2A));
            0qQ.A07(singletonList);
            C291175gg r8 = new C291175gg(singletonList);
            if (182.A06(0Tu.A05, userSession, 36325282906518340L)) {
                E5H e5h = new E5H();
                C309516Yo r1 = new C309516Yo(this.A00.requireActivity(), userSession);
                r1.A08();
                String str2 = str;
                if (str == null) {
                    str2 = "feed";
                }
                r1.A0A = str2;
                r1.A0B((Bundle) null, e5h);
                r1.A04();
            } else {
                String id = r11.getId();
                if (id != null) {
                    FragmentActivity activity = this.A00.getActivity();
                    if (activity != null) {
                        1pE A012 = 1pE.A01(activity, this.A04, userSession, "feed_ufi");
                        A012.A0B = r8;
                        A012.A0h = id;
                        A012.A0y = true;
                        A012.A06();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0wc A013 = AnonymousClass0kN.A01(this.A04, userSession);
            0Aj A002 = A013.A00(A013.A00, AnonymousClass000.A00(1279));
            if (str == null) {
                str = "feed";
            }
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A002.AAJ("author_id", AnonymousClass3ZA.A00(A2A));
            A002.AAJ("media_type", r11.BR7().name());
            A002.AAJ("open_thread_id", (String) null);
            A002.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D2u(1Xj r24, AnonymousClass3W1 r25, Boolean bool, int i, boolean z) {
        HLF hlf;
        int i2;
        1Xj r9 = r24;
        0qQ.A0B(r9, 0);
        AnonymousClass3W1 r3 = r25;
        0qQ.A0B(r3, 1);
        if (Systrace.A0E(1)) {
            0fS.A01("DefaultMediaHeaderViewBinderDelegateImpl.onClickProfilePicture", -703048709);
        }
        try {
            if (r9.A4z() || C231122qu.A0Q(this.A03, r9)) {
                hlf = HLF.INFLUENCER;
            } else {
                hlf = HLF.BRAND;
            }
            C228232l0 r4 = this.A0I;
            C233162v9 r2 = C233162v9.PROFILE_TAP;
            UserSession userSession = this.A03;
            r4.DUE(new C301165yf((C376459Ib) null, (C53251Gkz) null, (String) null, r9.A2B(userSession).A02), r2, r9, r3);
            if (!r9.CcK()) {
                this.A0E.A06(r9.getId());
            }
            A03(r9);
            User A2A = r9.A2A(userSession);
            if (A2A != null) {
                boolean z2 = z;
                if (r9.CcK() && ((r9.A4z() || C231122qu.A0Q(userSession, r9)) && A2A.A2Q())) {
                    A06(r9, r3, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, z2);
                } else if (!r9.A4b() || !C271174i4.A03(userSession, r9)) {
                    A02(new C271794jb(userSession, r9, r3.A06()), hlf, r9, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, r3.A03, z2);
                    1Xj r11 = r9;
                    AnonymousClass3W1 r12 = r3;
                    A05(r11, r12, bool, A2A.getId(), PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i, z2);
                } else {
                    LTZ.A09(this.A00, userSession, r9, this.A04, (C262944Gp) null, (String) null, true, false);
                    if (Systrace.A0E(1)) {
                        i2 = -1121515506;
                        0fS.A00(i2);
                        return;
                    }
                    return;
                }
                AnonymousClass57Q r0 = this.A06;
                if (r0 != null) {
                    r0.A05(r9);
                }
                if (Systrace.A0E(1)) {
                    i2 = 494280940;
                    0fS.A00(i2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(851783824);
            }
            throw th;
        }
    }

    public final void D2w(1Xj r4, AnonymousClass3W1 r5, Reel reel, AnonymousClass3N3 r7) {
        0qQ.A0B(reel, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r7, 3);
        UserSession userSession = this.A03;
        String id = reel.getId();
        0qQ.A07(id);
        1OC A062 = LTC.A06(userSession, id, true);
        A062.A00 = new C61298K1l(userSession, this, r4, r5, reel, r7);
        1ES.A03(A062);
    }

    public final void D2z(1Xj r8, AnonymousClass3W1 r9, Reel reel, AnonymousClass3N3 r11) {
        Integer num;
        String organicTrackingToken;
        1Xy r0;
        0qQ.A0B(reel, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r11, 3);
        int position = r9.getPosition();
        if (r8.A5D()) {
            num = Integer.valueOf(r9.A03);
        } else {
            num = null;
        }
        AnonymousClass4DU r3 = this.A04;
        C254523sc A042 = C254513sb.A04(r8, r3, "profile_story_tap");
        if (AnonymousClass3WX.A02(r8, r3)) {
            organicTrackingToken = C231122qu.A0F(this.A03, r8);
        } else {
            organicTrackingToken = r8.A0C.getOrganicTrackingToken();
        }
        A042.A7J = organicTrackingToken;
        A042.A5u = r8.getId();
        A042.A6t = this.A07.getSessionId();
        A042.A09(position);
        String BIl = r8.A0C.BIl();
        if (BIl != null) {
            A042.A5m = BIl;
        }
        String str = r8.A0R;
        if (str != null) {
            A042.A6v = str;
        }
        List list = r8.A0e;
        if (!list.isEmpty()) {
            String A002 = C243413Yr.A00(list);
            if (A002 != null) {
                A042.A50 = A002;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (r8.A5D() && num != null) {
            int intValue = num.intValue();
            1Xj A1c = r8.A1c(intValue);
            if (A1c != null) {
                A042.A08(intValue);
                A042.A4f = A1c.getId();
                1Xj A1c2 = r8.A1c(0);
                if (A1c2 != null) {
                    A042.A4e = A1c2.getId();
                    A042.A5t = r8.A0C.BOq();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (r8.A5D()) {
            1Xj A1c3 = r8.A1c(0);
            if (A1c3 != null) {
                r0 = A1c3.A0C;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            r0 = r8.A0C;
        }
        String AYt = r0.AYt();
        if (AYt != null) {
            A042.A4J = AYt;
        }
        UserSession userSession = this.A03;
        String A072 = C231122qu.A07(userSession, r8);
        if (A072 != null) {
            A042.A4N = A072;
        }
        Integer num2 = reel.A0e;
        if (num2 != null) {
            A042.A45 = Long.valueOf((long) num2.intValue());
        }
        C233822wX.A0C(userSession, A042, r8, r3, (Integer) null);
        A01(this, r9, reel, r11);
        AnonymousClass57Q r02 = this.A06;
        if (r02 != null) {
            r02.A05(r8);
        }
    }

    public final void D30(1Xj r16) {
        String str;
        boolean z;
        String str2;
        1Xj r6 = r16;
        0qQ.A0B(r6, 0);
        JSO CGF = r6.A0C.CGF();
        if (CGF != null) {
            User Bcj = CGF.Bcj();
            FragmentActivity requireActivity = this.A00.requireActivity();
            UserSession userSession = this.A03;
            String Bck = CGF.Bck();
            ImageUrl imageUrl = null;
            if (Bcj != null) {
                str = Bcj.getUsername();
                z = Bcj.isVerified();
            } else {
                str = null;
                z = false;
            }
            String Bcg = CGF.Bcg();
            String Bci = CGF.Bci();
            if (Bcj != null) {
                imageUrl = Bcj.Bh3();
                str2 = Bcj.getId();
            } else {
                str2 = null;
            }
            HWQ.A00(requireActivity, userSession, imageUrl, r6, Bck, str, Bcg, Bci, str2, r6.getId(), "feed", z);
        }
    }

    public final void D3B(1Xj r20, AnonymousClass3W1 r21, int i) {
        1Xj r5 = r20;
        0qQ.A0B(r5, 0);
        AnonymousClass3W1 r6 = r21;
        0qQ.A0B(r6, 1);
        if (r5.A3Q().size() == 2) {
            LTZ.A0A(this.A00, this.A03, r5, this.A04, (C262934Go) null);
            return;
        }
        User user = (User) 00k.A0J(r5.A3Q());
        if (user != null) {
            String id = user.getId();
            C271794jb r13 = new C271794jb(this.A03, r5, r6.A06());
            r13.A06 = id;
            HLF hlf = HLF.BRAND;
            int i2 = r6.A03;
            String A002 = C273654mx.A00(964);
            A02(r13, hlf, r5, A002, i2, false);
            A03(r5);
            A05(r5, r6, (Boolean) null, id, A002, i, false);
        }
    }

    public final void D3D(1Xj r15, AnonymousClass3W1 r16, boolean z) {
        0qQ.A0B(r15, 0);
        AnonymousClass3W1 r10 = r16;
        0qQ.A0B(r10, 1);
        UserSession userSession = this.A03;
        C233822wX.A0Q(userSession, r15, this.A04, (C249763kK) null, (Integer) null, (Integer) null, "sponsored_label", r10.A03);
        User A2A = r15.A2A(userSession);
        if (A2A != null) {
            D3K(r15, r10, A2A.getId(), r10.getPosition(), z);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D3I(1Xj r12, AnonymousClass3W1 r13, boolean z) {
        1Xj r5 = r12;
        0qQ.A0B(r12, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() == null) {
            return;
        }
        if (r12.A0z() == 1) {
            LTZ.A0B(fragment, this.A03, r12, this.A04, this.A08);
            return;
        }
        LTZ.A09(fragment, this.A03, r5, this.A04, (C262944Gp) null, (String) null, z, false);
    }

    public final void D3K(1Xj r21, AnonymousClass3W1 r22, String str, int i, boolean z) {
        HLF hlf;
        String A002;
        String id;
        User CCd;
        1Xj r6 = r21;
        0qQ.A0B(r6, 0);
        AnonymousClass3W1 r7 = r22;
        0qQ.A0B(r7, 1);
        String str2 = str;
        0qQ.A0B(str2, 2);
        if (r6.A4z() || C231122qu.A0Q(this.A03, r6)) {
            hlf = HLF.INFLUENCER;
        } else {
            hlf = HLF.BRAND;
        }
        if (r6.A4z() || C231122qu.A0Q(this.A03, r6)) {
            A002 = C273654mx.A00(753);
        } else {
            A002 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }
        boolean z2 = z;
        if (!r6.CcK() || (CCd = r6.A0C.CCd()) == null || !CCd.A2Q()) {
            UserSession userSession = this.A03;
            A02(new C271794jb(userSession, r6, r7.A06()), hlf, r6, A002, r7.A03, z2);
            this.A0I.DUE(new C301165yf((C376459Ib) null, (C53251Gkz) null, (String) null, r6.A2B(userSession).A02), C233162v9.PROFILE_TAP, r6, r7);
            if (!r6.CcK()) {
                this.A0E.A06(r6.getId());
            }
            A03(r6);
            A05(r6, r7, (Boolean) null, str2, A002, i, z2);
        } else {
            A06(r6, r7, A002, z2);
        }
        AnonymousClass57Q r1 = this.A06;
        if (r1 != null && r1.A08(r6, false) && (id = r6.getId()) != null) {
            AnonymousClass57Q.A01(r1, id, true);
        }
    }

    public final void D3L(User user) {
        0qQ.A0B(user, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C249713kF r1 = C249713kF.A00;
            UserSession userSession = this.A03;
            AnonymousClass4DU r5 = this.A04;
            String str = this.A08;
            String A002 = AnonymousClass3ZA.A00(user);
            if (A002 != null) {
                r1.A0N(activity, user.A03.BsB(), userSession, r5, str, (String) null, "feed_media_header_cta", A002, user.A03.getUsername()).A05();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void D3M(1Xj r10, AnonymousClass3W1 r11, int i) {
        1Xj r3 = r10;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        Fragment fragment = this.A00;
        if (fragment instanceof AnonymousClass4DH) {
            C56624I5c.A01(fragment, this.A03, r3, this.A04, AnonymousClass05K.A0C, String.valueOf(i), String.valueOf(r11.A0W), this.A07.getSessionId());
        }
    }

    public final void D3N(1Xj r4) {
        0qQ.A0B(r4, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C55208Hdy.A00(activity, HOV.POSTS, this.A03, r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (X.C291335gz.A00(r6) != com.instagram.api.schemas.OriginalAudioSubtype.A06) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3b(X.AnonymousClass8ZN r38, X.C67231sQ r39, X.1Xj r40, X.AnonymousClass3W1 r41) {
        /*
            r37 = this;
            r3 = 0
            r14 = r40
            X.0qQ.A0B(r14, r3)
            r5 = 1
            r4 = r41
            X.0qQ.A0B(r4, r5)
            r0 = 2
            r11 = r38
            X.0qQ.A0B(r11, r0)
            r0 = 3
            r6 = r39
            X.0qQ.A0B(r6, r0)
            r2 = r37
            com.instagram.common.session.UserSession r13 = r2.A03
            boolean r0 = X.AnonymousClass3ZJ.A0D(r13, r14)
            if (r0 == 0) goto L_0x003e
            boolean r0 = X.AnonymousClass3ZJ.A0C(r13, r14)
            if (r0 == 0) goto L_0x003d
            X.0eM r0 = r2.A09
            java.lang.Object r3 = r0.getValue()
            X.Hpl r3 = (X.C55924Hpl) r3
            androidx.fragment.app.Fragment r0 = r2.A00
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = X.AnonymousClass3ZJ.A05(r13, r14)
            r3.A00(r1, r0, r5)
        L_0x003d:
            return
        L_0x003e:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r6.BZB()
            if (r0 == 0) goto L_0x005f
            java.lang.Boolean r1 = r0.Caw()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005f
            androidx.fragment.app.Fragment r0 = r2.A00
            android.content.Context r0 = r0.requireContext()
            r3 = 2131955894(0x7f1310b6, float:1.9548328E38)
        L_0x005b:
            X.C59689JTv.A07(r0, r3)
            return
        L_0x005f:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r6.BZB()
            if (r0 == 0) goto L_0x0096
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r6.BZB()
            if (r0 == 0) goto L_0x0094
            com.instagram.user.model.User r0 = r0.BEv()
            if (r0 == 0) goto L_0x0094
            java.lang.Integer r1 = r0.A0N()
        L_0x0075:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0096
            com.instagram.api.schemas.OriginalAudioSubtype r0 = X.C291335gz.A00(r6)
            if (r0 == 0) goto L_0x008a
            com.instagram.api.schemas.OriginalAudioSubtype r1 = X.C291335gz.A00(r6)
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            r3 = 2131955612(0x7f130f9c, float:1.9547756E38)
            if (r1 == r0) goto L_0x008d
        L_0x008a:
            r3 = 2131955613(0x7f130f9d, float:1.9547758E38)
        L_0x008d:
            androidx.fragment.app.Fragment r0 = r2.A00
            android.content.Context r0 = r0.requireContext()
            goto L_0x005b
        L_0x0094:
            r1 = 0
            goto L_0x0075
        L_0x0096:
            X.3QO r0 = r14.A1t()
            boolean r0 = X.AnonymousClass3ZJ.A0F(r13, r14, r0)
            if (r0 != 0) goto L_0x00af
            X.3QO r1 = r14.A1t()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            r3 = 2131955640(0x7f130fb8, float:1.9547813E38)
            if (r1 != r0) goto L_0x008d
            r3 = 2131955314(0x7f130e72, float:1.9547152E38)
            goto L_0x008d
        L_0x00af:
            com.instagram.api.schemas.OriginalAudioSubtype r0 = X.C291335gz.A00(r6)
            if (r0 == 0) goto L_0x00d1
            X.1s9 r0 = r14.A1N()
            if (r0 == 0) goto L_0x00d1
            X.4bJ r0 = r0.BZ6()
            if (r0 == 0) goto L_0x00d1
            boolean r0 = X.HWO.A00(r0)
            if (r0 != r5) goto L_0x00d1
            androidx.fragment.app.Fragment r0 = r2.A00
            android.content.Context r0 = r0.requireContext()
            r3 = 2131955465(0x7f130f09, float:1.9547458E38)
            goto L_0x005b
        L_0x00d1:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r20 = r0.toString()
            X.0qQ.A07(r20)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            X.1rt r7 = r6.Adl()
            java.lang.Long r19 = X.C291335gz.A04(r6)
            X.8ZN r5 = X.AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_PILL
            r1 = 0
            if (r5 != r11) goto L_0x01ae
            X.4DU r9 = r2.A04
            X.5OC r8 = X.AnonymousClass5OC.AUDIO_PILL
            int r10 = r4.getPosition()
            r14.getId()
            X.0wc r7 = X.AnonymousClass0kN.A01(r9, r13)
            r4 = 3367(0xd27, float:4.718E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r4)
            X.0kJ r4 = r7.A00
            X.0Aj r7 = r7.A00(r4, r5)
            boolean r4 = r7.isSampled()
            if (r4 == 0) goto L_0x0161
            java.lang.String r5 = r9.getModuleName()
            java.lang.String r4 = "containermodule"
            r7.AAJ(r4, r5)
            java.lang.String r5 = r14.A2n()
            if (r5 == 0) goto L_0x01ab
            r4 = 10
            java.lang.Long r4 = X.00y.A0n(r4, r5)
            if (r4 == 0) goto L_0x01ab
            long r4 = r4.longValue()
        L_0x0130:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "media_id"
            r7.A9F(r4, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.String r4 = "media_index"
            r7.A8k(r4, r5)
            java.lang.String r4 = "viewer_session_id"
            r7.AAJ(r4, r0)
            X.GKd r5 = X.C52236GKd.A0B
            java.lang.String r4 = "action"
            r7.A8M(r5, r4)
            java.lang.String r4 = "action_source"
            r7.A8M(r8, r4)
            X.1Xy r4 = r14.A0C
            java.lang.String r5 = r4.getLoggingInfoToken()
            java.lang.String r4 = "ranking_info_token"
            r7.AAJ(r4, r5)
            r7.Cgf()
        L_0x0161:
            X.46i r18 = X.C291335gz.A01(r6)
            if (r18 == 0) goto L_0x003d
            androidx.fragment.app.Fragment r2 = r2.A00
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            java.lang.Class<com.instagram.modal.ModalActivity> r7 = com.instagram.modal.ModalActivity.class
            android.content.Context r16 = r2.requireContext()
            java.lang.String r19 = r14.getId()
            java.lang.String r21 = r14.getId()
            X.1Xy r2 = r14.A0C
            java.lang.String r22 = r2.getLoggingInfoToken()
            java.lang.String r26 = r6.getMusicCanonicalId()
            com.instagram.api.schemas.AudioFilterType r17 = X.C263304Kd.A01(r6)
            r23 = r1
            r24 = r1
            r25 = r1
            r27 = r3
            r28 = r3
            com.instagram.clips.model.metadata.AudioPageMetadata r2 = X.LT9.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            android.os.Bundle r5 = X.C250563lf.A02(r1, r11, r2, r0)
            r0 = 1123(0x463, float:1.574E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            X.6W8 r3 = new X.6W8
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r3.A0C(r4)
            return
        L_0x01ab:
            r4 = 0
            goto L_0x0130
        L_0x01ae:
            if (r19 == 0) goto L_0x0161
            long r26 = r19.longValue()
            X.4DU r12 = r2.A04
            X.HOu r10 = X.C54689HOu.A0T
            int r4 = r4.getPosition()
            long r4 = (long) r4
            if (r7 == 0) goto L_0x01f5
            java.lang.String r24 = r7.getBestAudioClusterId()
        L_0x01c3:
            com.instagram.search.common.analytics.SearchContext r15 = new com.instagram.search.common.analytics.SearchContext
            r28 = r15
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r7 = X.AnonymousClass3ZJ.A0D(r13, r14)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r7)
            r18 = r1
            r21 = r1
            r22 = r1
            r23 = r0
            r25 = r1
            r28 = r4
            r17 = r1
            X.C52086GEg.A0K(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            goto L_0x0161
        L_0x01f5:
            r24 = r1
            goto L_0x01c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WZ.D3b(X.8ZN, X.1sQ, X.1Xj, X.3W1):void");
    }

    public final View.OnTouchListener D3c(1Xj r7) {
        1Xj r3 = r7;
        0qQ.A0B(r7, 0);
        Context context = this.A00.getContext();
        if (context == null) {
            return null;
        }
        return new AnonymousClass532(context, this.A03, r3, AnonymousClass05K.A00, this.A04.getModuleName());
    }

    public final void D3d(1Xj r7, boolean z) {
        MusicMuteAudioReason musicMuteAudioReason;
        Boolean bool;
        String str;
        MusicConsumptionModel BUp;
        OriginalSoundConsumptionInfoIntf AqB;
        0qQ.A0B(r7, 0);
        OriginalSoundDataIntf A1J = r7.A1J();
        Long l = null;
        if (A1J == null || (AqB = A1J.AqB()) == null || (musicMuteAudioReason = AqB.BuG()) == null) {
            C2605946h A1O = r7.A1O();
            if (A1O != null) {
                musicMuteAudioReason = A1O.BuG();
            } else {
                musicMuteAudioReason = null;
            }
        }
        C2605946h A1O2 = r7.A1O();
        if (A1O2 == null || (BUp = A1O2.A00.BUp()) == null) {
            bool = null;
        } else {
            bool = BUp.Bty();
        }
        C242833We r2 = this.A0G;
        r2.A01 = Boolean.valueOf(z);
        if (z) {
            if (musicMuteAudioReason != null) {
                str = musicMuteAudioReason.A00;
            } else {
                str = null;
            }
            r2.A02 = str;
            r2.A00 = bool;
            AnonymousClass4DU r5 = this.A04;
            UserSession userSession = this.A03;
            String A30 = r7.A30();
            if (A30 != null) {
                Long A0n = 00y.A0n(10, A30);
                String A062 = AnonymousClass3ZJ.A06(r7);
                if (A062 != null) {
                    l = 00y.A0n(10, A062);
                }
                C56326Hwd.A01(r5, userSession, A0n, l);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        r2.A02 = null;
        r2.A00 = null;
    }

    public final void D3x(1Xj r11) {
        String str;
        C67161s9 BP1;
        C267284bJ BZ6;
        User CCd;
        0qQ.A0B(r11, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            AnonymousClass4DU r7 = this.A04;
            UserSession userSession = this.A03;
            Bundle bundle = new Bundle();
            String obj = AnonymousClass0HM.A00().toString();
            0qQ.A07(obj);
            bundle.putString("media_id", r11.getId());
            bundle.putSerializable("media_type", r11.BR7());
            bundle.putString("prior_module", r7.getModuleName());
            bundle.putString(AnonymousClass000.A00(263), obj);
            bundle.putString(AnonymousClass000.A00(528), AnonymousClass000.A00(262));
            ArrayList A052 = AnonymousClass3Y9.A00.A05(userSession, r11);
            bundle.putString(AnonymousClass000.A00(71), 002.A0R("feed_header_mashup_content_clips", "_bottom_sheet"));
            bundle.putParcelableArrayList(AnonymousClass000.A00(800), A052);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
            C67231sQ clipsMetadata = r11.A0C.getClipsMetadata();
            String str2 = null;
            if (clipsMetadata == null || (BP1 = clipsMetadata.BP1()) == null || (BZ6 = BP1.BZ6()) == null || (CCd = BZ6.CCd()) == null) {
                str = null;
            } else {
                str = CCd.getId();
            }
            String A002 = C66579MXk.A00(38);
            bundle.putString(A002, str);
            User A012 = AnonymousClass3Y9.A01(r11);
            if (A012 != null) {
                str2 = A012.getId();
            }
            bundle.putString(A002, str2);
            String string = fragment.getString(2131975420);
            0qQ.A07(string);
            LTZ.A07(bundle, fragment, userSession, r7, (C262944Gp) null, string);
        }
    }

    public final void D44(1Xj r8) {
        1Xj r3 = r8;
        0qQ.A0B(r8, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            AnonymousClass4DU r4 = this.A04;
            UserSession userSession = this.A03;
            LTZ.A0C(fragment, userSession, r3, r4, fragment.getString(2131975422), r8.A3m(userSession));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r6 = r11.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D4B(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.1E7 r1 = X.1E8.A03
            java.lang.String r0 = "DefaultFeedListAdapterDelegate"
            com.instagram.common.session.UserSession r3 = r11.A03
            X.1Xj r2 = r1.A01(r3, r0, r12)
            if (r2 == 0) goto L_0x0033
            androidx.fragment.app.Fragment r6 = r11.A00
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            if (r1 == 0) goto L_0x0033
            X.30l r0 = r11.A02
            if (r0 == 0) goto L_0x0033
            X.LFp r4 = new X.LFp
            r4.<init>(r1, r0, r3)
            X.Ldx r8 = new X.Ldx
            r8.<init>(r3, r2)
            X.Le1 r9 = new X.Le1
            r9.<init>(r1, r11)
            X.4DU r10 = r11.A04
            X.Ki7 r7 = X.C62574Ki7.CLIPS_VIEWER
            r5 = 0
            r4.A02(r5, r6, r7, r8, r9, r10)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WZ.D4B(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r10.A4t() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D4L(X.1Xj r10) {
        /*
            r9 = this;
            r8 = 0
            r3 = r10
            X.0qQ.A0B(r10, r8)
            androidx.fragment.app.Fragment r1 = r9.A00
            X.4DU r4 = r9.A04
            com.instagram.common.session.UserSession r2 = r9.A03
            boolean r0 = r10.A4b()
            if (r0 != 0) goto L_0x0018
            boolean r0 = r10.A4t()
            r7 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r7 = 1
        L_0x0019:
            r5 = 0
            java.lang.String r6 = "collab_post_follow_button_from_feed_surface"
            X.LTZ.A09(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WZ.D4L(X.1Xj):void");
    }

    public final void DQd(View view, 1Xj r3) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(view, 1);
        this.A0D.BRD().DQd(view, r3);
    }

    public final void DV6(String str) {
        FragmentActivity activity;
        0qQ.A0B(str, 0);
        1E7 r1 = 1E8.A03;
        UserSession userSession = this.A03;
        1Xj A012 = r1.A01(userSession, "DefaultFeedListAdapterDelegate", str);
        if (A012 != null && (activity = this.A00.getActivity()) != null && C318996ps.A01() && C318996ps.A00().A04(userSession)) {
            C318996ps.A00().A01();
            C49050EoU.A00(activity, (DialogInterface.OnDismissListener) null, userSession, A012);
        }
    }

    public final void DVd(1Xj r10) {
        String str;
        User CCd;
        0qQ.A0B(r10, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            AnonymousClass4DU r6 = this.A04;
            UserSession userSession = this.A03;
            Bundle bundle = new Bundle();
            String obj = AnonymousClass0HM.A00().toString();
            0qQ.A07(obj);
            bundle.putString("media_id", r10.getId());
            bundle.putSerializable("media_type", r10.BR7());
            bundle.putString("prior_module", r6.getModuleName());
            bundle.putString(AnonymousClass000.A00(263), obj);
            bundle.putString(AnonymousClass000.A00(528), AnonymousClass000.A00(262));
            ArrayList A042 = AnonymousClass3Y9.A00.A04(userSession, r10);
            bundle.putString(AnonymousClass000.A00(71), 002.A0R("feed_header_original_content_clips", "_bottom_sheet"));
            bundle.putParcelableArrayList(AnonymousClass000.A00(800), A042);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
            OriginalitySourceMediaInfo A002 = AnonymousClass3Y9.A00(r10);
            if (A002 == null || (CCd = A002.CCd()) == null) {
                str = null;
            } else {
                str = CCd.getId();
            }
            bundle.putString(C66579MXk.A00(38), str);
            String string = fragment.getString(2131975420);
            0qQ.A07(string);
            LTZ.A07(bundle, fragment, userSession, r6, (C262944Gp) null, string);
        }
    }

    public final void DVe(1Xj r9, AnonymousClass3W1 r10) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A03;
            C52086GEg.A0V((C267324bN) null, userSession, this.A04, Integer.valueOf(r10.getPosition()), r9.A2n(), true);
            AnonymousClass3Y9.A00.A06(activity, userSession, r9);
        }
    }

    public final void DbT(1Xj r6) {
        WearablesAppAttributionType wearablesAppAttributionType;
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A03;
        C54676HOh hOh = C54676HOh.ATTRIBUTE_IMPRESSION;
        JSO CGF = r6.A0C.CGF();
        if (CGF != null) {
            wearablesAppAttributionType = CGF.AdB();
        } else {
            wearablesAppAttributionType = null;
        }
        HWP.A00(hOh, wearablesAppAttributionType, userSession, r6.getId(), "feed");
    }

    public final void Dtz(1Xj r12) {
        0qQ.A0B(r12, 0);
        UserSession userSession = this.A03;
        AnonymousClass70U r5 = new AnonymousClass70U(userSession);
        User A2A = r12.A2A(userSession);
        if (A2A != null) {
            Fragment fragment = this.A00;
            Context context = fragment.getContext();
            if (context != null && (fragment instanceof AnonymousClass4DH)) {
                String C9f = A2A.A03.C9f();
                if (C9f != null) {
                    String id = A2A.getId();
                    C8956RIv rIv = C8956RIv.FEED;
                    String A2n = r12.A2n();
                    if (A2n != null) {
                        r5.A00(rIv, id, C9f, A2n, true);
                        AnonymousClass3ZQ.A01(context, rIv, userSession, A2A.getId(), C9f);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass3WZ(Fragment fragment, 0hq r4, C2355930l r5, UserSession userSession, AnonymousClass57V r7, AnonymousClass57T r8, AnonymousClass311 r9, AnonymousClass4DU r10, C231332rR r11, AnonymousClass2xS r12, AnonymousClass57Q r13, AnonymousClass32A r14, C228232l0 r15, C249763kK r16, String str, String str2) {
        C249763kK r1 = r16;
        0qQ.A0B(r1, 8);
        0qQ.A0B(r14, 11);
        this.A0D = r9;
        this.A03 = userSession;
        this.A00 = fragment;
        this.A02 = r5;
        this.A04 = r10;
        this.A01 = r4;
        this.A0I = r15;
        this.A07 = r1;
        this.A08 = str;
        this.A0H = r14;
        this.A0J = str2;
        this.A05 = r11;
        this.A0C = r8;
        this.A0B = r7;
        this.A06 = r13;
        this.A0F = r12;
        this.A0E = 1GH.A00(userSession);
        this.A0G = (C242833We) userSession.A01(C242833We.class, new MMS(userSession, 6));
    }

    public static final void A00(AnonymousClass3WZ r6, 1Xj r7, Boolean bool, String str) {
        C313716gt r4 = (C313716gt) r6.A0A.getValue();
        User A2A = r7.A2A(r6.A03);
        if (A2A != null) {
            String id = A2A.getId();
            String id2 = r7.getId();
            if (id2 != null) {
                0wc r2 = r4.A08;
                0Aj A002 = r2.A00(r2.A00, "ig_live_viewer_entry");
                A002.AAE(new C263944Ny(Long.valueOf(Long.parseLong(id))), "a_pk");
                A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str)));
                A002.AAJ("m_pk", id2);
                A002.AAJ("container_module", r4.A07.getModuleName());
                A002.AAJ("view_mode", "viewer");
                A002.AAJ("method", "feed_ring");
                A002.A7p("is_currently_live", bool);
                A002.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02(C271794jb r21, HLF hlf, 1Xj r23, String str, int i, boolean z) {
        Integer num;
        boolean z2;
        UserSession userSession = this.A03;
        1Xj r6 = r23;
        User A2A = r6.A2A(userSession);
        if (C247643gg.A0B(userSession, r6)) {
            num = r6.A0I;
        } else {
            num = null;
        }
        AnonymousClass4DU r7 = this.A04;
        IT3 it3 = new IT3(r21, A2A);
        if (A2A != null) {
            z2 = A2A.A2Q();
        } else {
            z2 = false;
        }
        HLF hlf2 = hlf;
        C233822wX.A0J(userSession, it3, hlf2, r6, r7, this.A07, (Float) null, (Float) null, Integer.valueOf(i), num, str, (String) null, (String) null, (String) null, 0, z2, z);
    }

    private final void A03(1Xj r6) {
        AnonymousClass0iw r4 = this.A00;
        FragmentActivity activity = r4.getActivity();
        if (activity != null) {
            2cc A002 = C71342cb.A00(this.A03);
            AnonymousClass0iw r42 = r4;
            String id = r6.getId();
            if (id != null) {
                A002.A09(activity, r42, AnonymousClass000.A00(4209), id);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A04(1Xj r3, AnonymousClass3W1 r4) {
        User A2A = r3.A2A(this.A03);
        if (A2A == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (A2A.A2Q() && 1sx.A0Q(r3, r4.A03)) {
            r4.A0m(!r4.A29, true);
            if (r4.A29) {
                r4.A1L = "pbia_profile_tap";
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105 A[Catch:{ all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011c A[Catch:{ all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(X.1Xj r20, X.AnonymousClass3W1 r21, java.lang.Boolean r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26) {
        /*
            r19 = this;
            r9 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x0010
            r1 = 664230264(0x27975978, float:4.200792E-15)
            java.lang.String r0 = "DefaultMediaHeaderViewBinderDelegateImpl.gotoUserProfile"
            X.0fS.A01(r0, r1)
        L_0x0010:
            r7 = r19
            X.0hq r0 = r7.A01     // Catch:{ all -> 0x0180 }
            boolean r0 = X.AnonymousClass06S.A01(r0)     // Catch:{ all -> 0x0180 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001e
            goto L_0x016b
        L_0x001e:
            r1 = r20
            X.3QO r2 = r1.A1t()     // Catch:{ all -> 0x0180 }
            X.3QO r0 = X.AnonymousClass3QO.OPAL     // Catch:{ all -> 0x0180 }
            r15 = r23
            if (r2 != r0) goto L_0x0078
            boolean r0 = X.C318996ps.A01()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x006d
            X.1q7 r0 = X.C318996ps.A00()     // Catch:{ all -> 0x0180 }
            com.instagram.common.session.UserSession r13 = r7.A03     // Catch:{ all -> 0x0180 }
            boolean r0 = r0.A04(r13)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x006d
            X.1q7 r0 = X.C318996ps.A00()     // Catch:{ all -> 0x0180 }
            X.FBp r11 = r0.A01()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "icon"
            r2 = r24
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r16 = "profile_picture"
        L_0x0050:
            r1.getId()     // Catch:{ all -> 0x0180 }
            androidx.fragment.app.Fragment r0 = r7.A00     // Catch:{ all -> 0x0180 }
            androidx.fragment.app.FragmentActivity r12 = r0.requireActivity()     // Catch:{ all -> 0x0180 }
            r14 = 0
            r17 = 1
            r18 = 0
            r11.A04(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0180 }
            goto L_0x006d
        L_0x0062:
            r3 = 27
            r2 = 8
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r16 = X.C66955Mfo.A02(r3, r2, r0)     // Catch:{ all -> 0x0180 }
            goto L_0x0050
        L_0x006d:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x0177
            r0 = -378035023(0xffffffffe977a4b1, float:-1.8711401E25)
            goto L_0x0174
        L_0x0078:
            androidx.fragment.app.Fragment r6 = r7.A00     // Catch:{ all -> 0x0180 }
            r0 = r6
            X.0iw r0 = (X.AnonymousClass0iw) r0     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = r0.getModuleName()     // Catch:{ all -> 0x0180 }
            X.1Xy r0 = r1.A0C     // Catch:{ all -> 0x0180 }
            com.instagram.model.hashtag.Hashtag r8 = r0.B6n()     // Catch:{ all -> 0x0180 }
            com.instagram.common.session.UserSession r4 = r7.A03     // Catch:{ all -> 0x0180 }
            r0 = 4779(0x12ab, float:6.697E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0180 }
            X.Dfc r5 = X.C46548Dgp.A01(r4, r15, r0, r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = r1.getId()     // Catch:{ all -> 0x0180 }
            if (r3 == 0) goto L_0x0178
            r0 = r21
            int r2 = r0.A03     // Catch:{ all -> 0x0180 }
            com.instagram.sponsored.analytics.SourceModelInfoParams r0 = new com.instagram.sponsored.analytics.SourceModelInfoParams     // Catch:{ all -> 0x0180 }
            r11 = r25
            r0.<init>(r3, r11, r2)     // Catch:{ all -> 0x0180 }
            r5.A04 = r0     // Catch:{ all -> 0x0180 }
            r3 = 0
            if (r8 == 0) goto L_0x00b9
            java.lang.String r2 = r8.getId()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x0180 }
            if (r2 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00b9
            r5.A0D = r2     // Catch:{ all -> 0x0180 }
            r5.A0E = r0     // Catch:{ all -> 0x0180 }
        L_0x00b9:
            java.lang.String r0 = r7.A08     // Catch:{ all -> 0x0180 }
            r5.A0L = r0     // Catch:{ all -> 0x0180 }
            r0 = r26
            r5.A0U = r0     // Catch:{ all -> 0x0180 }
            boolean r0 = r6 instanceof X.C266514Zg     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x00cd
            r0 = r6
            X.4Zg r0 = (X.C266514Zg) r0     // Catch:{ all -> 0x0180 }
            com.instagram.model.hashtag.Hashtag r0 = r0.BCW()     // Catch:{ all -> 0x0180 }
            goto L_0x00d3
        L_0x00cd:
            X.1Xy r0 = r1.A0C     // Catch:{ all -> 0x0180 }
            com.instagram.model.hashtag.Hashtag r0 = r0.B6n()     // Catch:{ all -> 0x0180 }
        L_0x00d3:
            if (r0 == 0) goto L_0x00db
            com.instagram.profile.intf.UserDetailEntryInfo r0 = X.C49077Eov.A00(r0)     // Catch:{ all -> 0x0180 }
            r5.A03 = r0     // Catch:{ all -> 0x0180 }
        L_0x00db:
            boolean r0 = r1.CcK()     // Catch:{ all -> 0x0180 }
            if (r0 != 0) goto L_0x0149
            boolean r0 = r1.A5G()     // Catch:{ all -> 0x0180 }
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r1.A5I()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0149
        L_0x00ed:
            java.lang.String r0 = "profile_clips"
            r5.A0O = r0     // Catch:{ all -> 0x0180 }
        L_0x00f1:
            r0 = 0
            r5.A0c = r0     // Catch:{ all -> 0x0180 }
        L_0x00f4:
            X.3Z8 r0 = new X.3Z8     // Catch:{ all -> 0x0180 }
            r0.<init>(r4)     // Catch:{ all -> 0x0180 }
            X.9IZ r0 = r0.A00(r1)     // Catch:{ all -> 0x0180 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0180 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0180 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0180 }
            if (r1 != r0) goto L_0x010f
            java.util.Set r0 = X.C49280EsP.A00     // Catch:{ all -> 0x0180 }
            r0 = 2931(0xb73, float:4.107E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0180 }
            r5.A0C = r0     // Catch:{ all -> 0x0180 }
        L_0x010f:
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0180 }
            r0 = 36324737446981944(0x810d2800163138, double:3.03524845722424E-306)
            boolean r0 = X.182.A06(r2, r4, r0)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0120
            r0 = r22
            r5.A05 = r0     // Catch:{ all -> 0x0180 }
        L_0x0120:
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()     // Catch:{ all -> 0x0180 }
            X.6Yo r2 = new X.6Yo     // Catch:{ all -> 0x0180 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0180 }
            r2.A08()     // Catch:{ all -> 0x0180 }
            X.1a0 r0 = X.C46447Df9.A03()     // Catch:{ all -> 0x0180 }
            X.1a1 r1 = r0.A01     // Catch:{ all -> 0x0180 }
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r5.A04()     // Catch:{ all -> 0x0180 }
            androidx.fragment.app.Fragment r0 = r1.A02(r4, r0)     // Catch:{ all -> 0x0180 }
            r2.A0B(r3, r0)     // Catch:{ all -> 0x0180 }
            r0 = 699(0x2bb, float:9.8E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0180 }
            r2.A0B = r0     // Catch:{ all -> 0x0180 }
            r2.A04()     // Catch:{ all -> 0x0180 }
            goto L_0x0161
        L_0x0149:
            java.lang.String r2 = r1.getId()     // Catch:{ all -> 0x0180 }
            if (r2 != 0) goto L_0x0151
            java.lang.String r2 = ""
        L_0x0151:
            X.6zo r0 = new X.6zo     // Catch:{ all -> 0x0180 }
            r0.<init>(r4)     // Catch:{ all -> 0x0180 }
            boolean r0 = r0.A01(r2, r15)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "profile_products"
            r5.A0O = r0     // Catch:{ all -> 0x0180 }
            goto L_0x00f1
        L_0x0161:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x0177
            r0 = -126191047(0xfffffffff87a7a39, float:-2.0321144E34)
            goto L_0x0174
        L_0x016b:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x0177
            r0 = 1954918630(0x7485b0e6, float:8.473674E31)
        L_0x0174:
            X.0fS.A00(r0)
        L_0x0177:
            return
        L_0x0178:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0180 }
            r0.<init>(r1)     // Catch:{ all -> 0x0180 }
            throw r0     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x018d
            r0 = -1080168917(0xffffffffbf9dee2b, float:-1.2338308)
            X.0fS.A00(r0)
        L_0x018d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WZ.A05(X.1Xj, X.3W1, java.lang.Boolean, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (X.C231122qu.A0Q(r15, r11) != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.1Xj r21, X.AnonymousClass3W1 r22, java.lang.String r23, boolean r24) {
        /*
            r20 = this;
            r11 = r21
            boolean r0 = r11.A4z()
            r8 = r20
            if (r0 != 0) goto L_0x00b6
            com.instagram.common.session.UserSession r0 = r8.A03
            boolean r0 = X.C231122qu.A0Q(r0, r11)
            if (r0 != 0) goto L_0x00b6
            X.HLF r10 = X.HLF.BRAND
        L_0x0014:
            boolean r0 = r11.A4z()
            r2 = 0
            if (r0 != 0) goto L_0x0023
            com.instagram.common.session.UserSession r15 = r8.A03
            boolean r0 = X.C231122qu.A0Q(r15, r11)
            if (r0 == 0) goto L_0x00b3
        L_0x0023:
            com.instagram.common.session.UserSession r15 = r8.A03
            com.instagram.user.model.User r0 = r11.A2A(r15)
            if (r0 == 0) goto L_0x00b3
            java.lang.String r7 = r0.getId()
        L_0x002f:
            java.lang.String r6 = X.C231122qu.A07(r15, r11)
            r1 = r22
            r12 = r23
            if (r6 == 0) goto L_0x00c6
            com.instagram.user.model.User r0 = r11.A2A(r15)
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x00c0
            int r5 = r0.A01()
            r4 = 31
            X.GlN r0 = r1.A06()
            X.4jb r9 = new X.4jb
            r9.<init>(r15, r11, r0)
            int r13 = r1.A03
            if (r5 != r4) goto L_0x007a
            r14 = 0
            r8.A02(r9, r10, r11, r12, r13, r14)
            X.I0T r13 = X.I0T.A00
            androidx.fragment.app.Fragment r0 = r8.A00
            androidx.fragment.app.FragmentActivity r14 = r0.requireActivity()
            X.1Xy r0 = r11.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x006e
            java.lang.String r19 = r0.AZH()
            if (r19 != 0) goto L_0x0070
        L_0x006e:
            java.lang.String r19 = ""
        L_0x0070:
            r16 = r11
            r17 = r1
            r18 = r2
            r13.A00(r14, r15, r16, r17, r18, r19)
        L_0x0079:
            return
        L_0x007a:
            r14 = r24
            r8.A02(r9, r10, r11, r12, r13, r14)
            androidx.fragment.app.Fragment r0 = r8.A00
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0079
            X.6Yo r5 = new X.6Yo
            r5.<init>(r0, r15)
            r5.A08()
            java.lang.String r4 = r11.getId()
            if (r4 == 0) goto L_0x00ba
            int r3 = r1.getPosition()
            int r1 = r1.A03
            com.instagram.sponsored.analytics.SourceModelInfoParams r0 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r0.<init>()
            r0.A06 = r4
            r0.A02 = r3
            r0.A00 = r1
            r0.A08 = r7
            X.Ubh r0 = X.C250563lf.A0A(r0, r6, r14)
            r5.A0B(r2, r0)
            r5.A04()
            return
        L_0x00b3:
            r7 = r2
            goto L_0x002f
        L_0x00b6:
            X.HLF r10 = X.HLF.INFLUENCER
            goto L_0x0014
        L_0x00ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x00c0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x00c6:
            X.GlN r0 = r1.A06()
            X.4jb r9 = new X.4jb
            r9.<init>(r15, r11, r0)
            int r13 = r1.A03
            r14 = 0
            r8.A02(r9, r10, r11, r12, r13, r14)
            r8.A04(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WZ.A06(X.1Xj, X.3W1, java.lang.String, boolean):void");
    }

    public final C2360732i BD7() {
        return this.A0D.BD7();
    }

    public final void D2r() {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C54903HXl.A00(activity, this.A03);
        }
    }

    public final void D3C(1Xj r5, AnonymousClass3W1 r6) {
        HashMap hashMap = new HashMap();
        hashMap.put("entrypoint", AnonymousClass000.A00(4474));
        hashMap.put(AnonymousClass000.A00(3615), "CLOSE");
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C46649DiU.A04("com.bloks.www.fxcal.settings.ads.basic_ads", hashMap).A0E(activity, new IgBloksScreenConfig((0lg) this.A03));
        }
    }

    public final View.OnTouchListener Dsc(1Xj r2, String str, String str2) {
        return C11503SbQ.A00;
    }

    public final View.OnTouchListener Dsd(1Xj r2, String str, String str2) {
        return C11504SbR.A00;
    }

    public final View.OnTouchListener Dsk(1Xj r2, String str, String str2) {
        return C244043aY.A00;
    }
}
