package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6ae  reason: invalid class name and case insensitive filesystem */
public final class C310236ae implements AnonymousClass6Z1, C317566nT, C310246af {
    public StoriesTemplateParticipationViewModel A00;
    public C314676if A01;
    public C314676if A02;
    public C314116hg A03;
    public boolean A04 = false;
    public C231142qw A05;
    public final Context A06;
    public final FragmentActivity A07;
    public final AnonymousClass4DH A08;
    public final UserSession A09;
    public final C310466b6 A0A;
    public final C310256ag A0B;
    public final ReelViewerConfig A0C;
    public final C310016aI A0D;
    public final C317766nn A0E;
    public final C273384mU A0F;
    public final AnonymousClass6Z0 A0G;
    public final String A0H;
    public final C310516bB A0I;
    public final AnonymousClass4DU A0J;
    public final AnonymousClass3BQ A0K;
    public final C310326ao A0L;
    public final C310306am A0M;
    public final UpcomingEventReminderRepository A0N;

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DWT(String str) {
    }

    public final void DbH(C249693kD r1, C19477WaP waP) {
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.07Z, X.4DH] */
    public C310236ae(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r26, UserSession userSession, AnonymousClass4DU r28, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r30, C310016aI r31, C317766nn r32, C273384mU r33, AnonymousClass6Z0 r34, String str) {
        Context context2 = context;
        this.A06 = context2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.A07 = fragmentActivity2;
        UserSession userSession2 = userSession;
        this.A09 = userSession2;
        AnonymousClass4DH r5 = r26;
        this.A08 = r5;
        AnonymousClass4DU r10 = r28;
        this.A0J = r10;
        AnonymousClass3BQ r4 = r30;
        this.A0K = r4;
        this.A0D = r31;
        this.A0F = r33;
        this.A0C = reelViewerConfig;
        this.A0E = r32;
        this.A0G = r34;
        this.A0H = str;
        this.A0B = new C310256ag(context2, userSession2);
        this.A0N = new UpcomingEventReminderRepository(userSession2, r10, r5.getModuleName());
        this.A0L = new C310326ao(context2, (C249463jp) null);
        this.A0M = new C310306am(r10, userSession2, r5.getModuleName());
        this.A00 = new 2YN(new C310366as(userSession2), fragmentActivity2).A00(StoriesTemplateParticipationViewModel.class);
        if (C249713kF.A00 != null) {
            this.A05 = C231132qv.A00(context2, fragmentActivity2, (RankingInfo) null, userSession2, r10, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, r4.toString(), (String) null, (String) null, (String) null, false, false);
        }
        this.A0A = new C310466b6(fragmentActivity2, 28D.A46, userSession2, new C310506bA(this), new C317786np(this));
        this.A0I = new C310516bB(fragmentActivity2, userSession2, new C317796nq(this));
        this.A00.A04.A06(this.A08, new C317806nr(this));
    }

    public static int A00(C310236ae r2) {
        C250973mM r0 = ((ReelViewerFragment) r2.A0F).A0a;
        if (r0 != null) {
            return (int) r0.A0H.A04();
        }
        return -1;
    }

    private String A01() {
        1Xj r0;
        C273384mU r1 = this.A0F;
        if (r1.Au5() == null || r1.Au5().A0b == null) {
            return null;
        }
        if (r1.Au5() != null) {
            r0 = r1.Au5().A0b;
        } else {
            r0 = null;
        }
        return r0.getId();
    }

    private void A02() {
        C273384mU r1 = this.A0F;
        C250973mM r0 = ((ReelViewerFragment) r1).A0a;
        C255773uh Au5 = r1.Au5();
        if (r0 != null && Au5 != null) {
            this.A0D.A07(r0.A0H, Au5, "quick_captions", "", r0.A01);
        }
    }

    public final void A03() {
        EditText editText;
        C314676if r0 = this.A02;
        if (r0 != null) {
            C14061Tp9 tp9 = (C14061Tp9) r0.get();
            if (!(tp9.A01 == null || (editText = tp9.A04) == null)) {
                editText.setText("");
            }
        }
        C314676if r02 = this.A01;
        if (r02 != null) {
            C14211Trq trq = (C14211Trq) r02.get();
            if (trq.A01 != null) {
                EditText editText2 = trq.A05;
                if (editText2 == null) {
                    0qQ.A0F("stickerAnswerView");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    editText2.setText("");
                }
            }
        }
    }

    public final boolean A04() {
        C316026kz Aui = this.A0F.Aui();
        if (Aui instanceof C316006kx) {
            return ((C316006kx) Aui).A17.A04;
        }
        return false;
    }

    public final boolean A05(boolean z) {
        1Xj r2;
        C255773uh Au5 = this.A0F.Au5();
        if (Au5 == null || (r2 = Au5.A0b) == null) {
            return false;
        }
        AnonymousClass1Nd.A00(this.A09).A00(new C240163Jv(r2, z));
        return true;
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void Cy9(UpcomingEvent upcomingEvent, String str, boolean z) {
        if (z) {
            this.A0M.A04(upcomingEvent, str, "upcoming_event_consumption_impression", "cta_story_sticker");
        }
    }

    public final void CzJ(List list) {
        C64135LPk.A01(this.A07, this.A09, list);
    }

    public final void D0m() {
        C273384mU r1 = this.A0F;
        r1.EHS(false);
        r1.EHd();
        A02();
    }

    public final void D0o() {
        C273384mU r1 = this.A0F;
        r1.EHS(false);
        r1.CLU();
        r1.EHY("tapped");
        A02();
    }

    public final void D0r(C255783ui r6, int i, int i2) {
        C273384mU r4 = this.A0F;
        r4.EHS(false);
        r4.CLU();
        r4.EHY("tapped");
        C316026kz Aui = r4.Aui();
        if (!(Aui == null || Aui.BQU() == null)) {
            int[] iArr = {0, 0};
            Aui.BQU().getLocationOnScreen(iArr);
            i -= iArr[0];
            i2 -= iArr[1];
        }
        C314626ia r0 = ((ReelViewerFragment) r4).mReelInteractiveController;
        if (r0 != null) {
            r0.A05(r6, i, i2);
        }
    }

    public final void D1U(1Xj r19, C317556nS r20, C317546nR r21, C255783ui r22) {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        C273384mU r1 = this.A0F;
        r1.EHS(false);
        r1.CLU();
        C19469WaH A0A2 = r22.A0A();
        A0A2.getClass();
        1Xj r8 = r19;
        if (A0A2.A07()) {
            UserSession userSession = this.A09;
            if (182.A06(0Tu.A05, userSession, 36330015960351137L)) {
                C316026kz Aui = r1.Aui();
                FragmentActivity fragmentActivity = this.A07;
                String A022 = A0A2.A02();
                UOB uob = A0A2.A00;
                String str = uob.A0L;
                StoryJoinChatStatus storyJoinChatStatus = uob.A02;
                if (storyJoinChatStatus == null) {
                    storyJoinChatStatus = StoryJoinChatStatus.DEFAULT;
                }
                int A002 = A0A2.A00();
                AnonymousClass4DU r9 = this.A0J;
                if (Aui != null) {
                    roundedCornerFrameLayout = Aui.BQU();
                } else {
                    roundedCornerFrameLayout = null;
                }
                C56376HxV.A01(roundedCornerFrameLayout, fragmentActivity, storyJoinChatStatus, userSession, r8, r9, r20, new VQD(r1), A022, str, A002);
                C310016aI r3 = this.A0D;
                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r1;
                C250973mM r0 = reelViewerFragment.A0a;
                r0.getClass();
                Reel reel = r0.A0H;
                C255773uh Au5 = r1.Au5();
                Au5.getClass();
                r3.A07(reel, Au5, "chat", "join_chat_sticker_default_id", reelViewerFragment.A0a.A01);
            }
        }
        r1.EHY("tapped");
        FragmentActivity fragmentActivity2 = this.A07;
        UserSession userSession2 = this.A09;
        String A2n = r8.A2n();
        String A023 = A0A2.A02();
        ChatStickerChannelType chatStickerChannelType = A0A2.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.DISCOVERABLE;
        }
        C317546nR r11 = r21;
        C49095EpK.A00(fragmentActivity2, userSession2, r11, A2n, A023, chatStickerChannelType.A00, new C20411Wqv(this), A0A2.A00(), false);
        C310016aI r32 = this.A0D;
        ReelViewerFragment reelViewerFragment2 = (ReelViewerFragment) r1;
        C250973mM r02 = reelViewerFragment2.A0a;
        r02.getClass();
        Reel reel2 = r02.A0H;
        C255773uh Au52 = r1.Au5();
        Au52.getClass();
        r32.A07(reel2, Au52, "chat", "join_chat_sticker_default_id", reelViewerFragment2.A0a.A01);
    }

    public final void D6R(C255773uh r21, C19476WaO waO) {
        User A2A;
        Long A0n;
        String str;
        int i;
        Long A0n2;
        C273384mU r6 = this.A0F;
        r6.EHS(false);
        r6.EHY("tapped");
        C19476WaO waO2 = waO;
        if (C309186Xg.A02(waO2)) {
            0xY AR4 = 1Au.A00(this.A09).A01.AR4();
            AR4.E5T("has_ever_tapped_on_story_countdown", true);
            AR4.apply();
        }
        C15370UbN ubN = new C15370UbN();
        C255773uh r8 = r21;
        if (r8.CcK()) {
            C310016aI r4 = this.A0D;
            String str2 = waO2.A00.A06;
            str2.getClass();
            AnonymousClass4DU r3 = this.A0J;
            String str3 = this.A0K.A00;
            0qQ.A0B(str3, 3);
            if (r8.CWu()) {
                1Xj r15 = r8.A0b;
                if (r15 != null) {
                    GT8 gt8 = (GT8) r4.A0I.get(r8.CFY());
                    if (gt8 != null) {
                        UserSession userSession = r4.A06;
                        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
                        1Ln r32 = new 1Ln(A012.A00(A012.A00, "instagram_ad_countdown_attempt"), 280);
                        if (!(!r32.A00.isSampled() || (A2A = r15.A2A(userSession)) == null || (A0n = 00y.A0n(10, A2A.getId())) == null)) {
                            r32.A0Q("a_pk", A0n);
                            String id = r15.getId();
                            if (id != null) {
                                r32.A0m(id);
                                User A2A2 = r15.A2A(userSession);
                                String str4 = "";
                                if (A2A2 == null || (str = A2A2.B6o().name()) == null) {
                                    str = str4;
                                }
                                r32.A0R("follow_status", str);
                                r32.A0Q("m_t", Long.valueOf((long) r15.BR7().A00));
                                long j = 0;
                                r32.A0Q("m_ts", 0L);
                                r32.A0R("source_of_action", str3);
                                String A2v = r15.A2v();
                                if (A2v != null) {
                                    str4 = A2v;
                                }
                                r32.A0R("tracking_token", str4);
                                String A0U = r8.A0U(userSession);
                                if (!(A0U == null || (A0n2 = 00y.A0n(10, A0U)) == null)) {
                                    j = A0n2.longValue();
                                }
                                r32.A0Q("ad_id", Long.valueOf(j));
                                Reel reel = gt8.A02;
                                String id2 = reel.getId();
                                0qQ.A07(id2);
                                r32.A0R("reel_id", id2);
                                r32.A0Q("reel_size", Long.valueOf((long) reel.A0O(gt8.A01).size()));
                                r32.A0Q("session_reel_counter", Long.valueOf((long) gt8.A00));
                                r32.A0R("tray_session_id", r4.A0H);
                                r32.A0R("viewer_session_id", r4.A0E.getSessionId());
                                r32.A0R("reel_type", (String) null);
                                r32.A0P("time_elapsed", (Double) null);
                                r32.A0R("from", str3);
                                C250973mM r1 = gt8.A04;
                                if (r1.A0L) {
                                    i = 0;
                                } else {
                                    i = r1.A00;
                                }
                                r32.A0Q("reel_start_position", Long.valueOf((long) i));
                                r32.A0Q("reel_viewer_position", Long.valueOf((long) gt8.A05.A0I));
                                r32.A0Q("ad_position_from_server", (Long) null);
                                r32.A0R("story_ranking_token", r4.A0G);
                                r32.A0k("countdown_attempt");
                                r32.A0P("elapsed_time_since_last_item", (Double) null);
                                r32.A0O("production_build", (Boolean) null);
                                r32.A0R("countdown_id", str2);
                                r32.A0Q("sticker_id", (Long) null);
                                r32.Cgf();
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        ubN.A02 = new VUA(waO2, this);
        Bundle bundle = new Bundle();
        try {
            BGi bGi = waO2.A00;
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            C45635Czl.A00(A0A2, bGi, true);
            A0A2.close();
            bundle.putString("countdown_sticker_model_json", stringWriter.toString());
            UserSession userSession2 = this.A09;
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
            User user = r8.A0i;
            user.getClass();
            bundle.putString("countdown_sticker_story_creator_user_id", user.getId());
            1Xj r2 = r8.A0b;
            if (r2 != null) {
                bundle.putString(AnonymousClass000.A00(795), r2.A2n());
                bundle.putBoolean("is_story_sponsored", r2.CcK());
            }
            ubN.setArguments(bundle);
            C331127Pr r12 = new C331127Pr(userSession2);
            r12.A0a = false;
            r12.A0T = ubN;
            r12.A0X = new C16290Us2(this);
            r12.A00().A02(this.A07, ubN);
        } catch (IOException unused) {
            r6.EHd();
            0wb.A03("ReelViewerInteractiveController", "Could not json serialize CountdownStickerModel for the countdown consumption sheet.");
        }
    }

    public final void DHK(C255773uh r11, C19475WaN waN, C316716m6 r13) {
        UserSession userSession = this.A09;
        AnonymousClass4DH r0 = this.A08;
        AnonymousClass8YF r8 = waN.A00;
        String str = r8.A08;
        0wc A012 = AnonymousClass0kN.A01(r0, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_cg_click_sticker");
        A002.A9F("sticker_id", Long.valueOf(Long.parseLong(str)));
        A002.Cgf();
        C273384mU r7 = this.A0F;
        r7.EHS(false);
        r7.EHY("tapped");
        UZ1 uz1 = new UZ1();
        uz1.A06 = new C19467WaF(r13, this);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putSerializable("fundraiser_entrypoint", C16506Uw2.STICKER);
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            AB9.A00(A0A2, r8, true);
            A0A2.close();
            bundle.putString("fundraiser_sticker_model_json", stringWriter.toString());
            uz1.setArguments(bundle);
            User user = r8.A02;
            user.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(user.getUsername());
            if (user.isVerified()) {
                C244273av.A08(this.A06, spannableStringBuilder, true);
            }
            C331127Pr r1 = new C331127Pr(userSession);
            r1.A0a = false;
            r1.A0d = spannableStringBuilder;
            r1.A0X = new Us1(this);
            r1.A00().A02(this.A07, uz1);
        } catch (IOException unused) {
            r7.EHd();
            0wb.A03("ReelViewerInteractiveController", "Could not json serialize FundraiserStickerModel for the fundraiser consumption sheet.");
        }
    }

    public final void DIK(C387339m3 r4) {
        C63409KwV.A00(this.A07, 28D.A30, this.A09, r4);
    }

    public final void DIM(C255773uh r16, C387339m3 r17) {
        C310016aI r2 = this.A0D;
        C273384mU r12 = this.A0F;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r12;
        C250973mM r0 = reelViewerFragment.A0a;
        r0.getClass();
        Reel reel = r0.A0H;
        C255773uh Au5 = r12.Au5();
        Au5.getClass();
        C387339m3 r14 = r17;
        r2.A07(reel, Au5, "group_mention", r14.A04, reelViewerFragment.A0a.A01);
        r12.EHS(false);
        r12.CLU();
        r12.EHY("tapped");
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A09;
        0qQ.A0B(userSession, 2);
        C48213Eau.A00 = false;
        List list = r14.A05;
        boolean contains = list.contains(0eE.A00(userSession).A00());
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putParcelable("group_mention_sticker_model", r14.A00());
        C255773uh r4 = r16;
        bundle.putString("group_mention_base_reel_id", r4.A0k);
        bundle.putString("group_mention_base_reel_item_id", r4.A0j);
        bundle.putParcelable("group_mention_base_reel_owner", r4.A0i);
        C47499E5e e5e = new C47499E5e();
        e5e.setArguments(bundle);
        C331127Pr r22 = new C331127Pr(userSession);
        String str = r14.A00.A03;
        if (str == null || str.length() == 0) {
            str = fragmentActivity.getString(2131963184);
        }
        r22.A0d = str;
        if (contains) {
            r22.A0g = fragmentActivity.getString(2131963199);
            r22.A0K = new LX4(e5e);
        }
        r22.A0w = true;
        if (182.A06(0Tu.A05, userSession, 36317453181326490L) && list.size() > 2 && contains) {
            C331137Ps r42 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
            r42.A02 = R.drawable.instagram_more_vertical_pano_outline_24;
            r42.A0A = true;
            r42.A05 = new C50056FLw(fragmentActivity);
            r22.A0R = r42.A00();
        }
        r22.A0U = new FmD(fragmentActivity, userSession, r12, e5e, r14);
        C331157Pu A002 = r22.A00();
        A002.A0Q(false);
        A002.A02(fragmentActivity, e5e);
    }

    public final void DKH(PromptStickerModel promptStickerModel) {
        Integer num;
        1Xj r0;
        C273384mU r1 = this.A0F;
        r1.EHY("tapped");
        UserSession userSession = this.A09;
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        String str = null;
        LN4.A00(new LN4(this.A08, userSession, promptStickerModel, A01(), this.A0H, this.A0D.A0E.getSessionId()), "memu_cta_click", (String) null);
        C65131Lnt lnt = new C65131Lnt(this);
        FragmentActivity fragmentActivity = this.A07;
        if (promptStickerModel.A0I()) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A1I;
        }
        C255773uh Au5 = r1.Au5();
        if (!(Au5 == null || (r0 = Au5.A0b) == null)) {
            str = r0.getId();
        }
        C64135LPk.A02(fragmentActivity, userSession, lnt, promptStickerModel2, num, str, new C20412Wqw(this), false);
    }

    public final void DKI(PromptStickerModel promptStickerModel) {
        String str;
        String Bhm;
        1Xj r0;
        C273384mU r8 = this.A0F;
        r8.EHY("tapped");
        UserSession userSession = this.A09;
        AnonymousClass4DH r4 = this.A08;
        String A012 = A01();
        String str2 = this.A0H;
        C310016aI r3 = this.A0D;
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        String str3 = null;
        LN4.A00(new LN4(r4, userSession, promptStickerModel2, A012, str2, r3.A0E.getSessionId()), "imagine_cta_click", (String) null);
        FragmentActivity fragmentActivity = this.A07;
        C255773uh Au5 = r8.Au5();
        if (!(Au5 == null || (r0 = Au5.A0b) == null)) {
            str3 = r0.getId();
        }
        C250973mM r1 = ((ReelViewerFragment) r8).A0a;
        C314686ig r42 = new C314686ig(this);
        0qQ.A0B(userSession, 1);
        C65132Lnu lnu = new C65132Lnu(r1, r3);
        Context context = C60960kU.A00;
        0qQ.A07(context);
        if (C305756Jk.A00(context)) {
            0Tu r32 = 0Tu.A05;
            if (182.A06(r32, userSession, 36327258593704236L) && LQF.A00(userSession, C59809JZd.IMAGINE)) {
                GenAIToolInfoDictIntf B91 = promptStickerModel2.A00.B91();
                if (B91 == null || (Bhm = B91.Bhm()) == null) {
                    str = null;
                } else {
                    str = 00l.A0B(00l.A0F("Imagine", Bhm)).toString();
                }
                C73901Plc plc = new C73901Plc(r42, 37);
                C62498Kgo kgo = C62498Kgo.LAUNCHED_FROM_STORY_VIEWER;
                Integer num = AnonymousClass05K.A15;
                String obj = UUID.randomUUID().toString();
                0qQ.A07(obj);
                if (!182.A06(r32, userSession, 36327258594359606L)) {
                    str = null;
                }
                LI3.A00(fragmentActivity, userSession, kgo, (PromptStickerModel) null, num, obj, str, (String) null, MKD.A00, MKE.A00, plc, (C262224Cq) null, false, false);
                return;
            }
        }
        LIV.A00(fragmentActivity, userSession, lnu, promptStickerModel2, str3);
    }

    public final void DRq(1Xj r16, C317556nS r17, C255783ui r18) {
        UOB uob;
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        C273384mU r3 = this.A0F;
        C316026kz Aui = r3.Aui();
        r3.EHY("tapped");
        AnonymousClass8D7 r1 = r18.A13;
        if (r1 != null && (uob = r1.A0E) != null) {
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A09;
            String str = uob.A0K;
            str.getClass();
            UOB uob2 = r1.A0E;
            String str2 = uob2.A0L;
            StoryJoinChatStatus storyJoinChatStatus = uob2.A02;
            int A002 = r1.A00();
            AnonymousClass4DU r9 = this.A0J;
            if (Aui != null) {
                roundedCornerFrameLayout = Aui.BQU();
            } else {
                roundedCornerFrameLayout = null;
            }
            C56376HxV.A01(roundedCornerFrameLayout, fragmentActivity, storyJoinChatStatus, userSession, r16, r9, r17, new VQD(r3), str, str2, A002);
        }
    }

    public final void DSw(MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel) {
        this.A0F.EHY("launching_music_pick_template");
        this.A0I.A01(28D.A3X, musicPickReelTag, musicPickStickerModel);
    }

    public final void DSx(C255773uh r10, MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel, String str) {
        FragmentActivity fragmentActivity = this.A07;
        C273384mU r2 = this.A0F;
        UserSession userSession = this.A09;
        0qQ.A0B(userSession, 2);
        r2.EHY("single_tap_paused");
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_music_pick_model", musicPickStickerModel);
        bundle.putParcelable("arg_music_pick_reel_tag", musicPickReelTag);
        K7b k7b = new K7b();
        k7b.setArguments(bundle);
        k7b.A02 = r10;
        C331127Pr r3 = new C331127Pr(userSession);
        r3.A0d = fragmentActivity.getString(2131967831);
        r3.A0T = k7b;
        r3.A0U = new Fm6(r2);
        r3.A1C = true;
        r3.A0g = fragmentActivity.getString(2131967830);
        r3.A0K = new LXC(fragmentActivity, k7b);
        C331157Pu A002 = r3.A00();
        A002.A0Q(true);
        A002.A02(fragmentActivity, k7b);
        C310016aI r32 = this.A0D;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r2;
        C250973mM r0 = reelViewerFragment.A0a;
        r0.getClass();
        Reel reel = r0.A0H;
        C255773uh Au5 = r2.Au5();
        Au5.getClass();
        r32.A07(reel, Au5, "music_pick", str, reelViewerFragment.A0a.A01);
    }

    public final void DXD(String str) {
        C273384mU r2 = this.A0F;
        r2.EHY("tapped");
        UserSession userSession = this.A09;
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0a = true;
        r1.A03 = 0.7f;
        r1.A0U = new C19682Wdk(this);
        C331157Pu A002 = r1.A00();
        if (r2.Au5() != null && r2.Au5().A0i != null) {
            String username = r2.Au5().A0i.getUsername();
            FragmentActivity fragmentActivity = this.A07;
            L7U l7u = new L7U(A002, this, str);
            0qQ.A0B(userSession, 0);
            K7H k7h = new K7H();
            Bundle bundle = new Bundle();
            bundle.putString("ReelPicsPleaseMediaSelectionFragment_storyAuthorUsername", username);
            C227642jf.A04(bundle, userSession);
            k7h.setArguments(bundle);
            k7h.A02 = l7u;
            A002.A02(fragmentActivity, k7h);
        }
    }

    public final void DXz(C249693kD r6, C317026mb r7) {
        C273384mU r4 = this.A0F;
        r4.EHY("animation");
        C316026kz Aui = r4.Aui();
        if (Aui instanceof C316006kx) {
            ((C316006kx) Aui).A1m.A00(true);
        }
        r7.A00(r6.BPf(), this.A0J, new C57311IWu(r4), true);
    }

    public final void DY3() {
        ((ReelViewerFragment) this.A0F).A3G.A0D();
    }

    public final void DY4(C249693kD r16, C272024jy r17, C265854Wo r18, String str, String str2, float f, int i) {
        String str3;
        C273384mU r4 = this.A0F;
        C250973mM r0 = ((ReelViewerFragment) r4).A0a;
        if (r0 == null || !r0.A0D) {
            String str4 = str;
            str4.getClass();
            String str5 = str2;
            str5.getClass();
            C272024jy r6 = r17;
            boolean equals = Boolean.TRUE.equals(r6.A04);
            UserSession userSession = this.A09;
            0xY AR4 = 1Au.A00(userSession).A01.AR4();
            if (equals) {
                str3 = "has_ever_voted_on_story_poll_v2";
            } else {
                str3 = "has_ever_voted_on_story_poll";
            }
            AR4.E5T(str3, true);
            AR4.apply();
            r4.EHY("tapped");
            C297825sP.A01(this.A06, userSession, r6, (Integer) null, Integer.valueOf(i), str4, this.A08.getModuleName(), str5, this.A0H, A00(this), false);
            r18.Ext(userSession, new C20111Wl9(this));
            C249693kD r8 = r16;
            if (r16 != null && r8.CcK()) {
                C310016aI r7 = this.A0D;
                String A002 = AnonymousClass9OX.A00(r6);
                String valueOf = String.valueOf(i);
                C310026aJ A003 = C310016aI.A00(r8, r7);
                UserSession userSession2 = r7.A06;
                C254523sc A004 = GTA.A00(userSession2, r8, A003, "interact");
                A004.A6d = A002;
                A004.A6f = "poll";
                A004.A6e = valueOf;
                A004.A04 = f;
                C310016aI.A04(A004, (GT8) r7.A0I.get(r8.CFY()), r7);
                C233822wX.A0H(userSession2, A004, r7.A0A);
            }
        }
    }

    public final void Dae(PromptStickerModel promptStickerModel) {
        String str;
        CameraTool cameraTool;
        28D r5;
        UserSession userSession = this.A09;
        LN4 ln4 = new LN4(this.A08, userSession, promptStickerModel, A01(), this.A0H, this.A0D.A0E.getSessionId());
        int ordinal = promptStickerModel.A03().ordinal();
        if (ordinal == 9) {
            str = "magicmod_restyle_cta_click";
        } else if (ordinal == 8) {
            str = "magicmod_wand_cta_click";
        } else if (ordinal != 7) {
            str = "";
        } else {
            str = "magicmod_backdrop_cta_click";
        }
        LN4.A00(ln4, str, (String) null);
        this.A0F.EHY("tapped");
        FragmentActivity fragmentActivity = this.A07;
        String A012 = A01();
        0qQ.A0B(userSession, 1);
        int ordinal2 = promptStickerModel.A03().ordinal();
        if (ordinal2 == 7 || ordinal2 == 6) {
            cameraTool = CameraTool.BACKDROP;
        } else if (ordinal2 == 9) {
            cameraTool = CameraTool.RESTYLE;
        } else {
            return;
        }
        int ordinal3 = promptStickerModel.A03().ordinal();
        if (ordinal3 != 7) {
            if (ordinal3 == 6) {
                r5 = 28D.A0H;
                LNN lnn = LNN.A00;
                String text = promptStickerModel.A00.getText();
                PromptStickerModel A042 = promptStickerModel.A04();
                A042.A08(0eE.A00(userSession).A00());
                lnn.A00(fragmentActivity, r5, cameraTool, userSession, A042, A012, text);
            } else if (ordinal3 != 9) {
                return;
            }
        }
        r5 = 28D.A4i;
        LNN lnn2 = LNN.A00;
        String text2 = promptStickerModel.A00.getText();
        PromptStickerModel A0422 = promptStickerModel.A04();
        A0422.A08(0eE.A00(userSession).A00());
        lnn2.A00(fragmentActivity, r5, cameraTool, userSession, A0422, A012, text2);
    }

    public final void Dak(1Xj r10, PromptStickerModel promptStickerModel) {
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A09;
        28D r2 = 28D.A46;
        0qQ.A0B(userSession, 1);
        C64135LPk.A00(fragmentActivity, r2, userSession, promptStickerModel);
        LN4.A00(new LN4(this.A08, userSession, promptStickerModel, A01(), this.A0H, this.A0D.A0E.getSessionId()), "cta_tap", (String) null);
    }

    public final void Dal(AnonymousClass8ZN r16, 1Xj r17, PromptStickerModel promptStickerModel, C310416b1 r19, List list) {
        C273384mU r8 = this.A0F;
        r8.EHS(false);
        r8.CLU();
        r8.EHY("tapped");
        FragmentActivity fragmentActivity = this.A07;
        AnonymousClass4DH r3 = this.A08;
        UserSession userSession = this.A09;
        String A012 = A01();
        String str = this.A0H;
        C310016aI r6 = this.A0D;
        C64019LJg.A00(fragmentActivity, 28D.A46, r3, userSession, r8.Au5(), r6, this.A0E, r8, promptStickerModel, r19, A012, str, r6.A0E.getSessionId(), list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x030f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DbG(X.C249693kD r18, X.C19477WaP r19, X.JMB r20) {
        /*
            r17 = this;
            r2 = r17
            X.4mU r1 = r2.A0F
            r6 = 0
            r1.EHS(r6)
            android.view.View r0 = r1.AuD()
            if (r0 != 0) goto L_0x0030
            X.6kz r0 = r1.Aui()
            X.3uh r5 = r1.Au5()
            if (r0 == 0) goto L_0x001a
            if (r5 != 0) goto L_0x002f
        L_0x001a:
            java.lang.String r4 = "ReelViewerInteractiveController"
            java.lang.String r3 = "currentViewerItemBindable == null: "
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            java.lang.String r0 = "currentItem == null: "
            if (r5 == 0) goto L_0x0028
            r2 = 0
        L_0x0028:
            java.lang.String r0 = X.002.A1C(r3, r0, r1, r2)
            X.0wb.A03(r4, r0)
        L_0x002f:
            return
        L_0x0030:
            r9 = r19
            java.util.List r0 = r9.A06()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x045b
            X.6if r0 = r2.A01
            r0.getClass()
            java.lang.Object r5 = r0.get()
            X.Trq r5 = (X.C14211Trq) r5
            com.instagram.user.model.User r4 = r18.CCd()
            r4.getClass()
            X.1Xj r0 = r18.BPf()
            r0.getClass()
            java.lang.String r7 = r0.getId()
            android.view.View r3 = r1.AuD()
            r3.getClass()
            X.1Xj r0 = r18.BPf()
            java.lang.Integer r0 = r0.A2L()
            java.lang.String r1 = X.C2606846q.A00(r0)
            int r0 = A00(r2)
            r5.A0E = r7
            r5.A0B = r9
            r5.A0D = r1
            r5.A00 = r0
            X.6ib r1 = r5.A0L
            boolean r0 = r9.A08()
            r1.A00(r4, r0)
            r5.A0C = r4
            r5.A04 = r3
            android.view.View r0 = r5.A01
            if (r0 != 0) goto L_0x01b9
            android.view.ViewStub r0 = r5.A0I
            android.view.View r1 = r0.inflate()
            r5.A01 = r1
            java.lang.String r8 = "rootView"
            if (r1 == 0) goto L_0x00e0
            X.W9C r0 = new X.W9C
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r1)
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131438993(0x7f0b2d91, float:1.8499929E38)
            android.view.View r7 = r1.findViewById(r0)
            X.0qQ.A07(r7)
            X.8Z5 r0 = r5.A0N
            r0.A02 = r7
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131438996(0x7f0b2d94, float:1.8499935E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.reels.interactive.view.AvatarView r0 = (com.instagram.reels.interactive.view.AvatarView) r0
            r5.A0A = r0
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131438997(0x7f0b2d95, float:1.8499937E38)
            android.view.View r0 = r1.findViewById(r0)
            r5.A03 = r0
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131439007(0x7f0b2d9f, float:1.8499957E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A08 = r0
            if (r0 != 0) goto L_0x00e8
            java.lang.String r8 = "stickerQuestionView"
        L_0x00e0:
            X.0qQ.A0F(r8)
        L_0x00e3:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e8:
            X.ABM.A01(r0)
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131438995(0x7f0b2d93, float:1.8499933E38)
            android.view.View r0 = r1.findViewById(r0)
            r5.A02 = r0
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131438994(0x7f0b2d92, float:1.849993E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r5.A05 = r0
            java.lang.String r2 = "stickerAnswerView"
            if (r0 == 0) goto L_0x0166
            r0.addTextChangedListener(r5)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x0166
            r0.setOnFocusChangeListener(r5)
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A06 = r0
            java.lang.String r2 = "cancelButton"
            if (r0 == 0) goto L_0x0166
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            android.widget.TextView r0 = r5.A06
            if (r0 == 0) goto L_0x0166
            r1.A01(r0)
            r1.A04 = r5
            r2 = 1
            r1.A0C = r2
            r1.A00()
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131439009(0x7f0b2da1, float:1.8499961E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A07 = r0
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131438978(0x7f0b2d82, float:1.8499898E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x015e
            X.3oV r0 = X.2b1.A01(r0, r6, r6)
            r5.A09 = r0
        L_0x015e:
            android.widget.TextView r1 = r5.A07
            if (r1 != 0) goto L_0x016b
            java.lang.String r8 = "sendButton"
            goto L_0x00e0
        L_0x0166:
            X.0qQ.A0F(r2)
            goto L_0x00e3
        L_0x016b:
            X.3NG r0 = new X.3NG
            r0.<init>(r1)
            r0.A01(r7)
            r0.A04 = r5
            r0.A07 = r2
            r0.A0C = r2
            r0.A00()
            java.util.List r1 = r9.A06()
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = com.instagram.reels.question.model.responsetype.QuestionResponseType.MEDIA
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x01b6
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00e0
            r0 = 2131432547(0x7f0b1463, float:1.8486855E38)
            android.view.View r2 = r1.requireViewById(r0)
            X.0qQ.A07(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setVisibility(r6)
            java.util.ArrayList r0 = r5.A0Q
            r0.add(r2)
            boolean r0 = X.C61670oa.A0H()
            if (r0 == 0) goto L_0x01ae
            r1 = 2131100376(0x7f0602d8, float:1.7813132E38)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r2.setColorFilter(r1, r0)
        L_0x01ae:
            X.WA0 r0 = new X.WA0
            r0.<init>(r2, r9, r4, r5)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x01b6:
            X.C14211Trq.A00(r5)
        L_0x01b9:
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x0232
            X.WaP r0 = r5.A0B
            java.lang.String r16 = "stickerAvatarView"
            java.lang.String r15 = "stickerCardView"
            java.lang.String r14 = "stickerQuestionView"
            java.lang.String r10 = "stickerAnswerView"
            if (r0 != 0) goto L_0x02aa
            android.widget.TextView r1 = r5.A08
            if (r1 == 0) goto L_0x0442
            java.lang.String r0 = ""
            r1.setText(r0)
            android.widget.TextView r1 = r5.A08
            if (r1 == 0) goto L_0x0442
            android.content.Context r2 = r5.A0H
            int r0 = X.C19477WaP.A01(r2)
            r1.setTextColor(r0)
            android.widget.EditText r1 = r5.A05
            if (r1 == 0) goto L_0x0456
            int r0 = X.C19477WaP.A01(r2)
            r1.setTextColor(r0)
            android.widget.EditText r4 = r5.A05
            if (r4 == 0) goto L_0x0456
            int r1 = X.C19477WaP.A01(r2)
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = X.0nH.A07(r1, r0)
            r4.setHintTextColor(r0)
            android.view.View r0 = r5.A03
            if (r0 == 0) goto L_0x0451
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            int r0 = X.C19477WaP.A00(r2)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            com.instagram.reels.interactive.view.AvatarView r1 = r5.A0A
            if (r1 == 0) goto L_0x044c
            int r0 = X.C19477WaP.A00(r2)
            r1.setStrokeColor(r0)
            X.WaP r0 = r5.A0B
            java.lang.String r12 = "sendButton"
            if (r0 == 0) goto L_0x02a2
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x02a2
            android.widget.TextView r1 = r5.A07
            if (r1 == 0) goto L_0x02d4
            r0 = 2131239649(0x7f0822e1, float:1.809561E38)
        L_0x022b:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r1.setBackground(r0)
        L_0x0232:
            android.view.View r7 = r5.A01
            java.lang.String r4 = "rootView"
            if (r7 == 0) goto L_0x0253
            java.lang.String r1 = "QuestionStickerMultimediaResponseController"
            android.view.View[] r0 = new android.view.View[]{r3}
            X.Vc0 r2 = new X.Vc0
            r2.<init>(r7, r1, r0)
            r0 = 12
            r2.A00 = r0
            r0 = 15
            r2.A02 = r0
            android.content.Context r3 = r5.A0H
            X.WaP r0 = r5.A0B
            if (r0 != 0) goto L_0x0258
            java.lang.String r4 = "stickerModel"
        L_0x0253:
            X.0qQ.A0F(r4)
            goto L_0x00e3
        L_0x0258:
            boolean r1 = r0.A08()
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
            if (r1 == 0) goto L_0x0264
            r0 = 2131099787(0x7f06008b, float:1.7811937E38)
        L_0x0264:
            int r0 = r3.getColor(r0)
            r2.A03 = r0
            X.U1A r0 = new X.U1A
            r0.<init>(r2)
            r7.setBackground(r0)
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x0253
            r0.setVisibility(r6)
            android.widget.EditText r0 = r5.A05
            if (r0 != 0) goto L_0x0280
            java.lang.String r4 = "stickerAnswerView"
            goto L_0x0253
        L_0x0280:
            r0.requestFocus()
            X.X6q r0 = r5.A0M
            r0.DbD()
            java.lang.String r4 = "stickerQuestionView"
            boolean r0 = X.C61670oa.A0H()
            if (r0 == 0) goto L_0x002f
            android.widget.TextView r2 = r5.A08
            if (r2 == 0) goto L_0x0253
            X.0qq r1 = X.AnonymousClass0qo.A00(r3)
            X.0qm r0 = X.0qm.A0V
            android.graphics.Typeface r0 = r1.A02(r0)
            r2.setTypeface(r0)
            return
        L_0x02a2:
            android.widget.TextView r1 = r5.A07
            if (r1 == 0) goto L_0x02d4
            r0 = 2131239646(0x7f0822de, float:1.8095605E38)
            goto L_0x022b
        L_0x02aa:
            java.lang.String r13 = "stickerModel"
            android.content.Context r9 = r5.A0H
            int r7 = r0.A04(r9)
            X.WaP r0 = r5.A0B
            if (r0 == 0) goto L_0x033c
            int r11 = r0.A03(r9)
            android.widget.TextView r1 = r5.A08
            if (r1 == 0) goto L_0x0442
            X.WaP r0 = r5.A0B
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = r0.A05()
            r1.setText(r0)
            int r0 = X.C19477WaP.A00(r9)
            if (r11 != r0) goto L_0x0341
            X.WaP r0 = r5.A0B
            if (r0 != 0) goto L_0x02d9
            r12 = r13
        L_0x02d4:
            X.0qQ.A0F(r12)
            goto L_0x00e3
        L_0x02d9:
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0341
            boolean r0 = X.C61670oa.A0H()
            if (r0 != 0) goto L_0x0341
            android.widget.TextView r0 = r5.A08
            r12 = r14
            r1 = 0
            if (r0 == 0) goto L_0x02d4
            java.lang.CharSequence r0 = r0.getText()
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r0)
            int[] r0 = X.C19477WaP.A02
            X.ALh r2 = new X.ALh
            r2.<init>(r1, r0)
            int r1 = r8.length()
            r0 = 33
            r8.setSpan(r2, r6, r1, r0)
            android.widget.TextView r0 = r5.A08
            if (r0 == 0) goto L_0x02d4
            r0.setText(r8)
        L_0x030b:
            android.widget.EditText r1 = r5.A05
            if (r1 == 0) goto L_0x0456
            r8 = 1058642330(0x3f19999a, float:0.6)
            int r0 = X.0nH.A07(r7, r8)
            r1.setHintTextColor(r0)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x0456
            r0.setTextColor(r7)
            android.view.View r0 = r5.A03
            if (r0 == 0) goto L_0x0451
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r11)
            r1.setColorFilter(r0)
            com.instagram.reels.interactive.view.AvatarView r0 = r5.A0A
            if (r0 == 0) goto L_0x044c
            r0.setStrokeColor(r11)
            android.view.View r0 = r5.A02
            if (r0 != 0) goto L_0x0349
            java.lang.String r13 = "stickerAnswerCardView"
        L_0x033c:
            X.0qQ.A0F(r13)
            goto L_0x00e3
        L_0x0341:
            android.widget.TextView r0 = r5.A08
            if (r0 == 0) goto L_0x0423
            r0.setTextColor(r7)
            goto L_0x030b
        L_0x0349:
            android.graphics.drawable.Drawable r7 = r0.getBackground()
            int r2 = X.AnonymousClass6YG.A01(r9, r11)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r1)
            r7.setColorFilter(r0)
            int r0 = android.graphics.Color.red(r11)
            float r10 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r10 = r10 / r1
            int r0 = android.graphics.Color.green(r11)
            float r7 = (float) r0
            float r7 = r7 / r1
            int r0 = android.graphics.Color.blue(r11)
            float r2 = (float) r0
            float r2 = r2 / r1
            r1 = 1
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0420
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0420
        L_0x0378:
            r2 = r1 ^ 1
            r5.A0F = r2
            X.WaP r1 = r5.A0B
            java.lang.String r0 = "sendButton"
            if (r1 == 0) goto L_0x0417
            if (r2 == 0) goto L_0x0417
            android.widget.TextView r1 = r5.A07
            if (r1 == 0) goto L_0x0447
            r0 = 2131239649(0x7f0822e1, float:1.809561E38)
        L_0x038b:
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r1.setBackground(r0)
            X.WaP r0 = r5.A0B
            r12 = r13
            if (r0 == 0) goto L_0x02d4
            boolean r0 = r0.A08()
            r2 = 8
            if (r0 == 0) goto L_0x042b
            com.instagram.reels.interactive.view.AvatarView r0 = r5.A0A
            if (r0 == 0) goto L_0x044c
            r0.setVisibility(r2)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r7 = r1.getDimensionPixelSize(r0)
            android.widget.TextView r0 = r5.A08
            if (r0 == 0) goto L_0x0423
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r4, r0)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            X.WaP r0 = r5.A0B
            if (r0 == 0) goto L_0x040b
            int r0 = r0.A02()
            if (r0 <= 0) goto L_0x040b
            r0 = 0
        L_0x03ca:
            r4.setMargins(r7, r6, r7, r0)
            X.3oV r0 = r5.A09
            if (r0 == 0) goto L_0x0232
            android.view.View r10 = r0.getView()
            android.widget.TextView r10 = (android.widget.TextView) r10
            X.WaP r7 = r5.A0B
            if (r7 == 0) goto L_0x02d4
            int r0 = r7.A02()
            if (r0 <= 0) goto L_0x0426
            android.content.res.Resources r4 = r9.getResources()
            r2 = 2131820615(0x7f110047, float:1.927395E38)
            int r1 = r7.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r4.getQuantityString(r2, r1, r0)
            r10.setText(r0)
            r10.setVisibility(r6)
            int r0 = r7.A04(r9)
            int r0 = X.0nH.A07(r0, r8)
            r10.setTextColor(r0)
            goto L_0x0232
        L_0x040b:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r1.getDimensionPixelSize(r0)
            goto L_0x03ca
        L_0x0417:
            android.widget.TextView r1 = r5.A07
            if (r1 == 0) goto L_0x0447
            r0 = 2131239646(0x7f0822de, float:1.8095605E38)
            goto L_0x038b
        L_0x0420:
            r1 = 0
            goto L_0x0378
        L_0x0423:
            r12 = r14
            goto L_0x02d4
        L_0x0426:
            r10.setVisibility(r2)
            goto L_0x0232
        L_0x042b:
            com.instagram.reels.interactive.view.AvatarView r0 = r5.A0A
            if (r0 == 0) goto L_0x044c
            r0.setAvatarUser(r4)
            com.instagram.reels.interactive.view.AvatarView r0 = r5.A0A
            if (r0 == 0) goto L_0x044c
            r0.setVisibility(r6)
            X.3oV r0 = r5.A09
            if (r0 == 0) goto L_0x0232
            r0.setVisibility(r2)
            goto L_0x0232
        L_0x0442:
            X.0qQ.A0F(r14)
            goto L_0x00e3
        L_0x0447:
            X.0qQ.A0F(r0)
            goto L_0x00e3
        L_0x044c:
            X.0qQ.A0F(r16)
            goto L_0x00e3
        L_0x0451:
            X.0qQ.A0F(r15)
            goto L_0x00e3
        L_0x0456:
            X.0qQ.A0F(r10)
            goto L_0x00e3
        L_0x045b:
            X.6if r0 = r2.A02
            r0.getClass()
            java.lang.Object r7 = r0.get()
            X.Tp9 r7 = (X.C14061Tp9) r7
            com.instagram.user.model.User r11 = r18.CCd()
            r11.getClass()
            X.1Xj r0 = r18.BPf()
            r0.getClass()
            java.lang.String r12 = r0.getId()
            android.view.View r8 = r1.AuD()
            r8.getClass()
            X.1Xj r0 = r18.BPf()
            java.lang.Integer r0 = r0.A2L()
            java.lang.String r13 = X.C2606846q.A00(r0)
            int r14 = A00(r2)
            r10 = r20
            r7.A02(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310236ae.DbG(X.3kD, X.WaP, X.JMB):void");
    }

    public final void DbY(C255783ui r10) {
        1Xj r5;
        String A012;
        C283405Hn r4 = r10.A16;
        r4.getClass();
        C273384mU r2 = this.A0F;
        if (r2.Au5() != null) {
            r5 = r2.Au5().A0b;
            if (!(r5 == null || r5.A0C.CCd() == null || !2R8.A05(this.A09, r5.A0C.CCd().getId()))) {
                return;
            }
        } else {
            r5 = null;
        }
        if (this.A03 != null) {
            r2.EHY("animation");
            this.A03.A02(new C65774LzS(this), r4.A00);
        }
        if (!(r4.A01 || (A012 = A01()) == null || r5 == null)) {
            AnonymousClass4DH r3 = this.A08;
            UserSession userSession = this.A09;
            String moduleName = r3.getModuleName();
            String A002 = C2606846q.A00(r5.A2L());
            int A003 = A00(this);
            1NY r22 = new 1NY(userSession);
            r22.A04();
            r22.A0A("story_interactions/reaction_sticker/react/");
            r22.A9m("media_id", A012);
            r22.A9m("container_module", moduleName);
            r22.A9m("delivery_class", A002);
            r22.A0C("tray_position", A003);
            r22.A0R(1XP.class, 1XY.class);
            r22.A0R = true;
            1OC A0M2 = r22.A0M();
            A0M2.A00 = new C15597UfP(r10, r4, this);
            r3.schedule(A0M2);
        }
        r10.A16 = new C283405Hn(r4.A00, true);
    }

    public final void Di9() {
        this.A0F.E4O(false);
    }

    public final void DiA(C249693kD r12) {
        String str;
        Long A0n;
        String str2;
        C250973mM AuO;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A0F;
        C255773uh Au5 = reelViewerFragment.Au5();
        if (!(Au5 == null || (str2 = Au5.A0j) == null || (AuO = reelViewerFragment.AuO(str2)) == null)) {
            reelViewerFragment.A3G.E0w(Au5, AuO, AnonymousClass05K.A0C, false);
        }
        1Xj BPf = r12.BPf();
        if (BPf != null) {
            UserSession userSession = this.A09;
            AnonymousClass4DU r6 = this.A0J;
            0qQ.A0B(userSession, 0);
            1Ln A0I2 = 1Ln.A0I(AnonymousClass0kN.A01(r6, userSession));
            User A2A = BPf.A2A(userSession);
            long j = 0;
            if (!(A2A == null || (A0n = 00y.A0n(10, A2A.getId())) == null)) {
                j = A0n.longValue();
            }
            A0I2.A0Q("a_pk", Long.valueOf(j));
            User A2A2 = BPf.A2A(userSession);
            if (A2A2 == null || (str = A2A2.B6o().name()) == null) {
                str = "";
            }
            A0I2.A0R("follow_status", str);
            A0I2.A0R("is_coming_from", "");
            A0I2.A0O("is_context_sheet", false);
            String id = BPf.getId();
            if (id != null) {
                A0I2.A0m(id);
                A0I2.A0Q("m_t", Long.valueOf((long) BPf.BR7().A00));
                A0I2.A0R(AnonymousClass000.A00(53), "");
                A0I2.A0Q("post_id", 0L);
                A0I2.A0R("reel_id", "");
                A0I2.A0Q("reel_position", 0L);
                A0I2.A0Q("reel_size", 0L);
                A0I2.A0R("reel_type", "");
                A0I2.A0Q("session_reel_counter", 0L);
                A0I2.A0R("source_of_action", r6.getModuleName());
                A0I2.A0R("sticker_id", "secret_sticker_bundle_id");
                A0I2.A0R("sticker_type", "secret_stories");
                A0I2.A0R("story_ranking_token", "");
                Double valueOf = Double.valueOf(0.0d);
                A0I2.A0P("time_elapsed", valueOf);
                A0I2.A0P("time_remaining", valueOf);
                A0I2.A0Q("tray_pos_excl_own_story", 0L);
                A0I2.A0Q("tray_position", 0L);
                A0I2.A0R("tray_session_id", "");
                A0I2.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06);
                A0I2.A0R("viewer_session_id", "");
                A0I2.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DiB() {
        this.A0F.Crd(false);
    }

    public final void DiC() {
        this.A0F.EHd();
    }

    public final void DiD() {
        this.A0F.EHY("tapped");
    }

    public final void DlS(C265804Wi r4, boolean z) {
        if (z) {
            AnonymousClass6Z0 r0 = this.A0G;
            AnonymousClass32V r2 = r0.A03;
            if (r2 == null) {
                return;
            }
            if (r0.A00 == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r4.A06.post(new C20225WnP(r4, r2));
            }
        } else {
            this.A0F.EHd();
        }
    }

    public final void DlT() {
        C273384mU r1 = this.A0F;
        r1.EHS(false);
        r1.EHY("tapped");
    }

    public final void DlU(C265804Wi r4, C45419Cvz cvz) {
        AnonymousClass6UJ.A01(this.A09, this.A08, cvz);
        AnonymousClass6Z0 r0 = this.A0G;
        AnonymousClass32V r2 = r0.A03;
        if (r2 == null) {
            return;
        }
        if (r0.A00 == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r4.A06.post(new C20225WnP(r4, r2));
        }
    }

    public final void DlV() {
        this.A0F.EHY("tapped");
    }

    public final void Dla(C255773uh r19, C18603Vuw vuw) {
        C273384mU r1 = this.A0F;
        r1.EHS(false);
        r1.EHY("tapped");
        UserSession userSession = this.A09;
        C18603Vuw vuw2 = vuw;
        User A002 = vuw2.A00();
        17k.A07(A002, "in story viewer, the user object from server should not be null");
        boolean A052 = 2R8.A05(userSession, A002.getId());
        Integer A012 = vuw2.A01();
        A012.getClass();
        AnonymousClass4DU r9 = this.A0J;
        C255773uh r12 = r19;
        String str = r12.A0j;
        String str2 = vuw2.A00.A0A;
        String id = vuw2.A00().getId();
        SMBSupportStickerDict sMBSupportStickerDict = vuw2.A00;
        String str3 = sMBSupportStickerDict.A09;
        String str4 = sMBSupportStickerDict.A06;
        0qQ.A0B(userSession, 0);
        0wc A013 = AnonymousClass0kN.A01(r9, userSession);
        0Aj A003 = A013.A00(A013.A00, "instagram_smb_partner_flow_consumer");
        A003.A9F("igid", Long.valueOf(C49959FGr.A00(userSession)));
        A003.AAJ("step", "story_support_sticker");
        A003.AAJ("action", "tap");
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        A003.AAJ(C46346Dcp.A00(), obj);
        A003.A7p("is_profile_owner", Boolean.valueOf(A052));
        A003.A9F("profile_owner_id", Long.valueOf(C49959FGr.A01(id)));
        A003.AAJ("partner_name", str3);
        A003.AAJ("url", str4);
        A003.AAJ("service_type", VG1.A00(A012));
        A003.AAJ("sticker_id", str2);
        A003.AAJ("reel_item_id", str);
        A003.Cgf();
        if (A012.equals(AnonymousClass05K.A0C)) {
            002.A0R("ReelViewerInteractiveController", ".BACK_STACK");
            FGE.A01(this.A07, userSession, C16602Uxw.A06, vuw2.A00());
        } else if (A052) {
            if (vuw2.A01().equals(AnonymousClass05K.A01)) {
                FragmentActivity fragmentActivity = this.A07;
                str4.getClass();
                if (C324066yY.A04(fragmentActivity, (ActionButtonPartnerType) null, SMBPartnerType.FOOD_DELIVERY, str4)) {
                    String str5 = str;
                    String str6 = str2;
                    AnonymousClass4DU r8 = r9;
                    UserSession userSession2 = userSession;
                    C49959FGr.A07(r8, userSession2, vuw2.A01(), str5, str6, vuw2.A00().getId(), str3, str4);
                    return;
                }
            }
            FragmentActivity fragmentActivity2 = this.A07;
            str4.getClass();
            SUL sul = new SUL(fragmentActivity2, userSession, 2EG.A3V, str4);
            sul.A0S = this.A08.getModuleName();
            sul.A0A();
        } else {
            C47512E5v e5v = new C47512E5v();
            e5v.A01 = r12;
            e5v.A02 = vuw2;
            C331127Pr r13 = new C331127Pr(userSession);
            r13.A0a = false;
            r13.A0T = e5v;
            e5v.A00 = r13.A00().A02(this.A07, e5v);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r3.A00 != null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DnC(android.view.View r5, X.C255773uh r6, X.C255783ui r7) {
        /*
            r4 = this;
            X.6ag r2 = r4.A0B
            com.instagram.common.session.UserSession r3 = r4.A09
            r0 = 2
            X.0qQ.A0B(r3, r0)
            X.3WT r0 = r7.A11
            int r1 = r0.ordinal()
            r0 = 8
            if (r1 == r0) goto L_0x008a
            r0 = 14
            if (r1 != r0) goto L_0x0058
            java.util.List r1 = r6.A0b()
            X.3WT r0 = X.AnonymousClass3WT.FUNDRAISER
            X.3ui r0 = X.C289745e8.A00(r0, r1)
            if (r0 == 0) goto L_0x0088
            X.8YF r1 = r0.A0y
            if (r1 == 0) goto L_0x0088
            X.WaN r0 = new X.WaN
            r0.<init>(r1)
        L_0x002b:
            X.A8l r1 = X.C39575A0r.A00(r3)
            boolean r0 = r1.A00(r0)
        L_0x0033:
            if (r0 == 0) goto L_0x0058
            r0 = 0
            X.3WT r1 = r7.A11
            int r3 = r1.ordinal()
            r1 = 30
            if (r3 == r1) goto L_0x0059
            r1 = 37
            if (r3 != r1) goto L_0x0051
            X.BIk r0 = r7.A0o
            if (r0 == 0) goto L_0x0050
            com.instagram.model.shopping.drops.DropsLaunchAnimation r3 = r0.A01
            if (r3 == 0) goto L_0x0050
            java.lang.Boolean r0 = r3.A00
            if (r0 != 0) goto L_0x007c
        L_0x0050:
            r0 = 0
        L_0x0051:
            r3 = 1
            r1 = r0 ^ 1
            r0 = 0
            r2.A04(r0, r5, r3, r1)
        L_0x0058:
            return
        L_0x0059:
            com.instagram.model.shopping.reels.ProductSticker r0 = r7.A0q
            if (r0 == 0) goto L_0x0050
            com.instagram.model.shopping.drops.DropsLaunchAnimation r3 = r0.A02
            r1 = r3
            if (r3 != 0) goto L_0x006c
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.instagram.model.shopping.drops.DropsLaunchAnimation r1 = new com.instagram.model.shopping.drops.DropsLaunchAnimation
            r1.<init>(r0)
        L_0x006c:
            java.lang.Boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0050
            if (r3 != 0) goto L_0x007c
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.instagram.model.shopping.drops.DropsLaunchAnimation r3 = new com.instagram.model.shopping.drops.DropsLaunchAnimation
            r3.<init>(r0)
        L_0x007c:
            java.lang.Boolean r0 = r3.A00
            X.0qQ.A0A(r0)
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            goto L_0x0051
        L_0x0088:
            r0 = 0
            goto L_0x002b
        L_0x008a:
            java.util.List r1 = r6.A0b()
            X.3WT r0 = X.AnonymousClass3WT.COUNTDOWN
            X.3ui r0 = X.C289745e8.A00(r0, r1)
            if (r0 == 0) goto L_0x009f
            X.WaO r0 = r0.A0B()
        L_0x009a:
            boolean r0 = X.C309186Xg.A00(r0)
            goto L_0x0033
        L_0x009f:
            r0 = 0
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310236ae.DnC(android.view.View, X.3uh, X.3ui):void");
    }

    public final void Dnh(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C310416b1 r7) {
        UserSession userSession = this.A09;
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("stories_template_add_yours_clicked", true);
        AR4.apply();
        this.A0F.EHY("launching_stories_template");
        if (promptStickerModel.A00.Ban() != null) {
            C64019LJg.A01(this.A07, userSession, promptStickerModel, new MBS(creativeConfigIntf, promptStickerModel, r7, this), new C314646ic(this));
        } else {
            this.A00.A01(creativeConfigIntf, promptStickerModel, r7, false);
        }
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final void DvJ(C17530VZj vZj, UpcomingEvent upcomingEvent, String str) {
        C19788WfV wfV = new C19788WfV(vZj, this);
        this.A0F.EHY("tapped");
        C63468KxX.A00();
        Context context = this.A06;
        UserSession userSession = this.A09;
        AnonymousClass4DU r3 = this.A0J;
        String moduleName = this.A08.getModuleName();
        C19683Wdl wdl = new C19683Wdl(this);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(moduleName, 4);
        1ZC.A00(context, userSession, r3, wdl, wfV, upcomingEvent, str, moduleName, "story_sticker_bottom_sheet", true, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0.A5f() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7Q(X.C255773uh r3, X.C250973mM r4, X.C316026kz r5, X.C309426Yf r6) {
        /*
            r2 = this;
            boolean r0 = r3.CWu()
            if (r0 == 0) goto L_0x0011
            X.1Xj r0 = r3.A0b
            r0.getClass()
            boolean r0 = r0.A5f()
            if (r0 == 0) goto L_0x0017
        L_0x0011:
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x0029
        L_0x0017:
            boolean r0 = r5 instanceof X.C316006kx
            if (r0 == 0) goto L_0x0029
            X.6kx r5 = (X.C316006kx) r5
            X.6ag r1 = r2.A0B
            r1.A06(r3)
            android.widget.ImageView r0 = r5.A05
            if (r0 == 0) goto L_0x0029
            r1.A05(r0, r3)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310236ae.D7Q(X.3uh, X.3mM, X.6kz, X.6Yf):void");
    }

    public final void DbN(C249693kD r10, C265924Wv r11, C19471WaJ waJ, int i) {
        1Xj BPf = r10.BPf();
        C19471WaJ waJ2 = waJ;
        int i2 = i;
        if (BPf != null) {
            C265894Ws.A02(this.A09, waJ2, BPf.A30(), this.A08.getModuleName(), C2606846q.A00(BPf.A2L()), this.A0H, i2);
        }
        W43 w43 = new W43(r11, waJ, this, i);
        int A002 = waJ.A00();
        C310256ag r3 = this.A0B;
        View view = r11.A01;
        view.getClass();
        if (i == A002) {
            r3.A04(w43, view, false, true);
        } else {
            r3.A03(w43, view);
        }
        r11.A01(i);
    }

    public final boolean Dqd() {
        if (!A04() || !A05(true)) {
            return false;
        }
        return true;
    }
}
