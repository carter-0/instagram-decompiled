package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class P9G implements C332817Wm, AnonymousClass7Wt, C332917Wy, AnonymousClass7X7, AnonymousClass7X8, AnonymousClass7X9, AnonymousClass7XE, AnonymousClass7XH, AnonymousClass7XI, AnonymousClass7XT, AnonymousClass7XU, AnonymousClass7XV, C333007Xh, C333017Xi, C333027Xj, C333047Xl, C333057Xm, AnonymousClass7Y5, AnonymousClass7Y6, AnonymousClass7Y7, AnonymousClass7YA, AnonymousClass7YD, AnonymousClass7YE, AnonymousClass7YF {
    public final FragmentActivity A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass7SM A04;
    public final OT9 A05;
    public final C332257Ug A06;
    public final C273434mZ A07;
    public final AnonymousClass0eK A08;
    public final AnonymousClass0eK A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;
    public final AnonymousClass0eK A0C;
    public final AnonymousClass0eK A0D;
    public final AnonymousClass0eK A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass7TO A0K;
    public final C332837Wo A0L;
    public final AnonymousClass7X4 A0M;
    public final AnonymousClass7XW A0N;
    public final AnonymousClass7SN A0O;
    public final AnonymousClass7XP A0P;
    public final PA3 A0Q;
    public final AnonymousClass4DU A0R;

    public final void CpK(String str, String str2) {
        ((P9I) this.A0G.getValue()).CpK(str, (String) null);
    }

    public final void CpQ(String str, String str2, List list) {
        Bundle A0B2 = DbV.A0B(list, 2);
        A0B2.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A0B2.putString("client_context", str2);
        A0B2.putStringArrayList("message_ids_list", AnonymousClass7TE.A1D(list));
        C67002Mga.A01(A0B2, (C254743sy) C66580MXl.A0s(this.A0C), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        UserSession userSession = this.A03;
        C68493NKm nKm = new C68493NKm();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putAll(A0B2);
        DbU.A1D(A0a, userSession);
        nKm.setArguments(A0a);
        AnonymousClass0eK r0 = this.A08;
        0qQ.A0B(r0, 0);
        nKm.A09 = r0;
        nKm.A07 = this.A0Q;
        nKm.A04 = this.A0N;
        nKm.A05 = this.A0P;
        nKm.A02 = this.A0L;
        nKm.A03 = this.A0M;
        Dba.A12(nKm, DbS.A0M(this.A00, userSession));
    }

    public final void CpS(RectF rectF, ImageUrl imageUrl, OMU omu, MessageIdentifier messageIdentifier, AnonymousClass3OA r19, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(rectF, 6);
        ((P9I) this.A0G.getValue()).CpS(rectF, imageUrl, omu, messageIdentifier, r19, bool, bool2, str, str2, str3, str4, str5, z);
    }

    public final void Cpb(DirectMessageIdentifier directMessageIdentifier) {
        C254703su r10;
        Object obj;
        String str;
        DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
        0qQ.A0B(directMessageIdentifier2, 0);
        AnonymousClass0eK r0 = this.A08;
        C333517Zg A0V = C66580MXl.A0V(r0);
        AnonymousClass7ZY BSN = A0V.BSN();
        String ArO = BSN.ArO(directMessageIdentifier2);
        String AaJ = BSN.AaJ(directMessageIdentifier2);
        AnonymousClass7LQ BSO = C66580MXl.A0V(r0).AvL().BSO(directMessageIdentifier2.A01);
        String str2 = null;
        if (BSO != null && (r10 = BSO.A0e) != null) {
            Iterator it = A0V.C6l().BRZ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(DbS.A0q(obj), r10.A1u)) {
                    break;
                }
            }
            User user = (User) obj;
            if (user == null) {
                return;
            }
            if (BSN.CXL(directMessageIdentifier2)) {
                UserSession userSession = this.A03;
                C52369GPq.A01(C54688HOt.A0S, new C52369GPq(userSession, (String) null));
                AnonymousClass7AG r02 = r10.A0Q;
                if (r02 != null && (str = r02.A05) != null && str.length() != 0) {
                    User A0j = DbT.A0j(userSession);
                    1px A002 = AnonymousClass1q4.A00();
                    FragmentActivity fragmentActivity = this.A00;
                    0eP A1L = AnonymousClass7TE.A1L("creator_ai_add_fact_question_extra", AaJ);
                    0eP A1L2 = AnonymousClass7TE.A1L("creator_ai_add_fact_answer_extra", ArO);
                    0eP A1L3 = AnonymousClass7TE.A1L("creator_ai_bot_response_id_extra", str);
                    0eP A1L4 = AnonymousClass7TE.A1L("creator_ai_add_fact_message_igid_extra", r10.A0g());
                    0eP A1L5 = AnonymousClass7TE.A1L("creator_ai_add_fact_message_otid_extra", r10.A0f());
                    C254763t0 A0U = r10.A0U();
                    if (A0U != null) {
                        str2 = A0U.A00;
                    }
                    0eP A1L6 = AnonymousClass7TE.A1L("creator_ai_add_fact_thread_igid_extra", str2);
                    String AaQ = user.A03.AaQ();
                    if (AaQ == null) {
                        AaQ = A0j.A03.getFbidV2();
                    }
                    A002.Cfa(fragmentActivity, Q21.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AnonymousClass7TE.A1L("creator_ai_creator_fbid", AaQ)), userSession);
                    return;
                }
                return;
            }
            String AaU = user.A03.AaU();
            if (AaU != null) {
                UserSession userSession2 = this.A03;
                1Ln A003 = LTH.A00(new LTH(userSession2));
                if (DbT.A1Y(A003)) {
                    A003.A0l("thread_view_edit_ai_icon_clicked");
                    A003.A0j(AnonymousClass7TE.A10(AaU));
                    A003.Cgf();
                }
                boolean A1W = AnonymousClass7TF.A1W(user.A03.AaY(), IGAIAgentVisibilityStatus.PUBLIC);
                C331127Pr A0W = DbS.A0W(userSession2);
                FragmentActivity fragmentActivity2 = this.A00;
                A0W.A0d = AnonymousClass7TE.A16(fragmentActivity2, 2131952756);
                C331157Pu A004 = C72959PQr.A00(A0W, this, 12);
                C63855L9k l9k = new C63855L9k(this, A004, AaU, AaJ, ArO, A1W);
                K47 k47 = new K47();
                k47.A01 = AaU;
                k47.A00 = l9k;
                this.A0O.CLU();
                A004.A02(fragmentActivity2, k47);
                this.A06.Cyt();
            }
        }
    }

    public final boolean Cpc(String str) {
        String str2;
        List list;
        AnonymousClass3U9 A0d;
        boolean A1S = AnonymousClass7TF.A1S(C66582MXn.A0X(this.A08).A08, 29);
        AnonymousClass0eK r2 = this.A0C;
        DirectThreadKey A042 = C66647MaG.A04((C254743sy) r2.get());
        Boolean bool = null;
        if (A042 != null) {
            str2 = A042.A00;
        } else {
            str2 = null;
        }
        DirectThreadKey A043 = C66647MaG.A04((C254743sy) r2.get());
        if (A043 != null) {
            list = A043.A02;
        } else {
            list = null;
        }
        UserSession userSession = this.A03;
        2Dm A002 = 1bJ.A00(userSession);
        if (!(str2 == null || (A0d = C66580MXl.A0d(A002, str2)) == null)) {
            bool = Boolean.valueOf(C66640Ma9.A01(A0d));
        }
        if (A1S || str2 == null || list == null || AnonymousClass7TF.A1Y(bool, true) || !182.A06(0Tu.A05, userSession, 36323307221429306L)) {
            return false;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("direct_emoji_pong_fragment_argument_emoji", str);
        A0a.putString("direct_emoji_pong_fragment_argument_thread_id", str2);
        A0a.putStringArray("direct_emoji_pong_fragment_argument_recipient_ids", DbU.A1b(list, 0));
        DbU.A0w(this.A00, A0a, userSession, ModalActivity.class, C273654mx.A00(2253));
        return true;
    }

    public final void Cpe(RectF rectF, C74455PvA pvA, MessageIdentifier messageIdentifier, List list, List list2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(messageIdentifier, 0);
        ((P9K) this.A0I.getValue()).Cpe(rectF, pvA, messageIdentifier, list, list2, z, z2, z3);
    }

    public final void Cpg(String str) {
        if (C70005Nvj.A00(str)) {
            String str2 = DbT.A09(str).getPathSegments().get(0);
            0qQ.A07(str2);
            FEC.A00(this.A00, this.A02, this.A03, C51971G9r.A0n(0, str2), "ig_direct");
            return;
        }
        throw AnonymousClass7TE.A0w("Uri is not a valid Facebook profile uri");
    }

    public final void Cpj(String str) {
        0qQ.A0B(str, 0);
        ((C50401Fb9) this.A0J.getValue()).Cpj(str);
    }

    public final void Cpn(String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A03;
        AnonymousClass0iw r4 = this.A02;
        boolean A0E2 = C66647MaG.A0E(C66582MXn.A0d(this.A08).B8S());
        FragmentActivity fragmentActivity = this.A00;
        1Ln A002 = C3265677h.A00(r4, userSession, (C254743sy) this.A0C.get(), A0E2, 0oI.A0A(fragmentActivity), C321406u6.A06(str));
        A002.A0R("hashtag", str);
        A002.Cgf();
        Dba.A12(W0l.A02(userSession, C281965Ag.A00(str), r4.getModuleName(), "DEFAULT"), DbS.A0M(fragmentActivity, userSession));
    }

    public final void Cpy(1iA r9, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C254743sy r4;
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1S(str4, str5);
        AnonymousClass7S7 A0d = C66582MXn.A0d(this.A08);
        C254763t0 BN3 = A0d.BN3();
        if (BN3 == null || (r4 = C300965yF.A05(BN3)) == null) {
            r4 = A0d.AfV();
        }
        UserSession userSession = this.A03;
        AnonymousClass0iw r2 = this.A02;
        boolean A0E2 = C66647MaG.A0E(A0d.B8S());
        AnonymousClass4DH r1 = this.A01;
        1Ln A002 = C3265677h.A00(r2, userSession, r4, A0E2, 0oI.A0A(r1.requireContext()), false);
        A002.A0R("media_id", str);
        A002.Cgf();
        F3W A032 = IgFragmentFactoryImpl.A00().A03(str);
        A032.A0C = str4;
        A032.A0D = str5;
        A032.A0K = true;
        A032.A0J = true;
        if (z) {
            A032.A0L = true;
        }
        if (i != -1) {
            A032.A00 = i;
        }
        Dba.A12(A032.A01(), DbS.A0M(r1.requireActivity(), userSession));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0052: MOVE  (r81v0 int) = (r88v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void Cpz(android.view.View r84, X.C68168N3i r85, java.lang.Integer r86, java.util.List r87, int r88, boolean r89, boolean r90) {
        /*
            r83 = this;
            r14 = 4
            r82 = r86
            r0 = r82
            X.0qQ.A0B(r0, r14)
            r1 = r83
            X.0eM r0 = r1.A0H
            java.lang.Object r3 = r0.getValue()
            X.7SQ r3 = (X.AnonymousClass7SQ) r3
            X.0eK r0 = r1.A0C
            java.lang.Object r2 = r0.get()
            X.3sy r2 = (X.C254743sy) r2
            X.0eK r0 = r1.A0D
            java.lang.Object r0 = r0.get()
            X.9HC r0 = (X.AnonymousClass9HC) r0
            X.0eM r0 = r0.A1A
            boolean r74 = X.AnonymousClass7TF.A1Z(r0)
            X.7XW r0 = r1.A0N
            r80 = r0
            X.0eK r0 = r1.A08
            X.7S7 r6 = X.C66582MXn.A0d(r0)
            X.0iw r0 = r1.A02
            r79 = r0
            r18 = 1
            r17 = 8
            r7 = 10
            X.9H7 r5 = r3.A00
            com.instagram.common.session.UserSession r1 = r5.A10
            X.4DH r0 = r5.A0u
            r78 = r0
            androidx.fragment.app.FragmentActivity r0 = r78.requireActivity()
            boolean r0 = X.C69874Ntc.A00(r0, r1, r2)
            if (r0 == 0) goto L_0x0272
            int r4 = r87.size()
            r81 = r88
            r0 = r81
            if (r0 >= r4) goto L_0x0272
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r87)
            java.util.Iterator r16 = r87.iterator()
        L_0x0060:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r16.next()
            X.77B r0 = (X.AnonymousClass77B) r0
            java.util.List r51 = r6.BRZ()
            java.lang.String r42 = r6.C6f()
            int r56 = X.C66580MXl.A05(r6)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            com.instagram.common.session.UserSession r4 = r0.A0D
            r26 = r4
            boolean r4 = r0.A0s
            r57 = r4
            boolean r4 = r0.A0n
            r58 = r4
            float r4 = r0.A02
            r52 = r4
            X.1aU r4 = r0.A09
            r77 = r4
            X.1aU r4 = r0.A0B
            r76 = r4
            X.1aU r4 = r0.A0A
            r23 = r4
            X.1aU r4 = r0.A0C
            r24 = r4
            java.lang.String r4 = r0.A0U
            r38 = r4
            java.lang.String r4 = r0.A0T
            r39 = r4
            X.2FW r4 = r0.A0G
            r31 = r4
            X.1iA r4 = r0.A0I
            r33 = r4
            int r4 = r0.A03
            r53 = r4
            int r4 = r0.A05
            r54 = r4
            int r4 = r0.A06
            r55 = r4
            X.5yB r4 = r0.A0F
            r30 = r4
            X.1Xj r4 = r0.A0E
            r29 = r4
            java.lang.String r4 = r0.A0S
            r40 = r4
            java.lang.String r4 = r0.A0N
            r41 = r4
            boolean r4 = r0.A0m
            r59 = r4
            boolean r4 = r0.A0q
            r60 = r4
            boolean r4 = r0.A0i
            r61 = r4
            boolean r4 = r0.A0d
            r62 = r4
            X.1aU r4 = r0.A08
            r25 = r4
            boolean r4 = r0.A0h
            r63 = r4
            boolean r4 = r0.A0j
            r64 = r4
            java.lang.Long r4 = r0.A0K
            r35 = r4
            java.lang.Boolean r4 = r0.A0J
            r34 = r4
            java.lang.Long r4 = r0.A0L
            r36 = r4
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r4 = r0.A01
            r28 = r4
            boolean r4 = r0.A0g
            r65 = r4
            java.lang.Long r4 = r0.A0M
            r37 = r4
            X.79H r4 = r0.A00
            r27 = r4
            boolean r4 = r0.A0p
            r66 = r4
            java.lang.String r4 = r0.A0a
            r43 = r4
            android.net.Uri r4 = r0.A07
            r75 = r4
            java.lang.String r4 = r0.A0Y
            r44 = r4
            java.lang.String r4 = r0.A0R
            r45 = r4
            boolean r4 = r0.A0l
            r67 = r4
            boolean r4 = r0.A0k
            r68 = r4
            java.lang.String r4 = r0.A0O
            r22 = r4
            X.3t3 r4 = r0.A0H
            r21 = r4
            boolean r4 = r0.A0o
            r20 = r4
            boolean r4 = r0.A0c
            r19 = r4
            java.lang.String r15 = r0.A0V
            java.lang.String r13 = r0.A0X
            boolean r12 = r0.A0e
            boolean r11 = r0.A0f
            boolean r10 = r0.A0r
            java.lang.String r8 = r0.A0Q
            java.lang.String r4 = r0.A0W
            X.77B r0 = new X.77B
            r32 = r21
            r46 = r22
            r47 = r15
            r48 = r13
            r49 = r8
            r50 = r4
            r69 = r20
            r70 = r19
            r71 = r12
            r72 = r11
            r73 = r10
            r19 = r0
            r20 = r75
            r21 = r77
            r22 = r76
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            r9.add(r0)
            goto L_0x0060
        L_0x0162:
            r0 = r81
            java.lang.Object r4 = r9.get(r0)
            X.77B r4 = (X.AnonymousClass77B) r4
            if (r89 != 0) goto L_0x01e3
            if (r90 != 0) goto L_0x01e3
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl r0 = X.C69918NuK.A00(r1, r6)
        L_0x0172:
            androidx.fragment.app.FragmentActivity r8 = r78.requireActivity()
            com.instagram.model.direct.DirectShareTarget r62 = r6.C6Z(r8)
            X.7Hl r8 = X.AnonymousClass9H7.A06(r5)
            boolean r6 = r8.A1U()
            if (r6 == 0) goto L_0x0187
            r8.A19()
        L_0x0187:
            X.P1A r8 = new X.P1A
            r6 = r84
            r8.<init>(r6, r5)
            X.L4N r12 = new X.L4N
            r12.<init>(r8)
            X.3sy r8 = r5.A0b
            boolean r8 = r8 instanceof com.instagram.model.direct.DirectThreadKey
            if (r8 == 0) goto L_0x01c5
            X.2Dm r11 = X.2L2.A00(r1)
            X.3sy r8 = r5.A0b
            com.instagram.model.direct.DirectThreadKey r10 = X.C66647MaG.A03(r8)
            java.lang.String r8 = r4.A0T
            X.3su r8 = r11.BRz(r10, r8)
            if (r8 == 0) goto L_0x01c5
            com.google.common.collect.ImmutableList r13 = r8.A0H()
            r11 = 0
            if (r13 == 0) goto L_0x01c5
            int r10 = r13.size()
            r8 = r18
            if (r10 < r8) goto L_0x01c5
            java.lang.Object r8 = r13.get(r11)
            X.3tC r8 = (X.C254873tC) r8
            int r8 = r8.A02
            r15 = 1
            if (r8 == r7) goto L_0x01c6
        L_0x01c5:
            r15 = 0
        L_0x01c6:
            X.7H6 r10 = r5.A0D
            r68 = 0
            if (r10 != 0) goto L_0x01d6
            java.lang.String r0 = "directAggregatedMediaViewerController"
        L_0x01ce:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d6:
            java.lang.String r13 = r12.A01
            boolean r7 = r4.A0m
            r73 = r7 ^ 1
            android.content.Context r8 = r5.A02
            if (r8 != 0) goto L_0x01ea
            java.lang.String r0 = "context"
            goto L_0x01ce
        L_0x01e3:
            r8 = 0
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl r0 = new com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl
            r0.<init>(r8, r8, r8)
            goto L_0x0172
        L_0x01ea:
            r7 = 20
            float r71 = X.0nA.A04(r8, r7)
            X.7TI r7 = X.AnonymousClass9H7.A01(r5)
            X.7Tw r7 = r7.A0j
            X.7U1 r7 = r7.A0M
            X.7L2 r7 = r7.A04
            X.7L0 r12 = r7.A07
            X.7TI r5 = X.AnonymousClass9H7.A01(r5)
            X.7Tw r5 = r5.A0j
            X.7U1 r5 = r5.A0M
            X.7L2 r5 = r5.A04
            X.7Kx r11 = r5.A04
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r5 = r82
            boolean r76 = X.AnonymousClass7TF.A1W(r5, r7)
            int r7 = r4.A04
            r5 = 29
            if (r7 != r5) goto L_0x0225
            X.0Tu r5 = X.0Tu.A05
            r7 = 36319407392431402(0x81084f00141d2a, double:3.0318777092640704E-306)
            boolean r5 = X.182.A06(r5, r1, r7)
            r77 = 1
            if (r5 != 0) goto L_0x0227
        L_0x0225:
            r77 = 0
        L_0x0227:
            if (r15 == 0) goto L_0x026e
            X.PmE r8 = new X.PmE
            r5 = r17
            r8.<init>(r3, r5)
            r7 = 9
            X.PmE r5 = new X.PmE
            r5.<init>(r3, r7)
        L_0x0237:
            java.lang.Integer r65 = X.AnonymousClass05K.A01
            r61 = r85
            r58 = r80
            r59 = r11
            r60 = r12
            r63 = r2
            r64 = r82
            r66 = r13
            r67 = r9
            r69 = r8
            r70 = r5
            r72 = r81
            r75 = r18
            r56 = r10
            r57 = r0
            r56.A0g(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)
            if (r84 == 0) goto L_0x025d
            r6.setVisibility(r14)
        L_0x025d:
            X.1iA r2 = r4.A0I
            X.1iA r0 = X.1iA.A0Q
            if (r2 != r0) goto L_0x026b
            java.lang.String r2 = "photo"
        L_0x0265:
            r0 = r79
            X.C3265677h.A0I(r0, r1, r2)
            return
        L_0x026b:
            java.lang.String r2 = "video"
            goto L_0x0265
        L_0x026e:
            r8 = r68
            r5 = r8
            goto L_0x0237
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9G.Cpz(android.view.View, X.N3i, java.lang.Integer, java.util.List, int, boolean, boolean):void");
    }

    public final void Cq5(String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A03;
        boolean A0E2 = C66647MaG.A0E(C66582MXn.A0d(this.A08).B8S());
        FragmentActivity fragmentActivity = this.A00;
        1Ln A002 = C3265677h.A00(this.A02, userSession, (C254743sy) this.A0C.get(), A0E2, 0oI.A0A(fragmentActivity), C321406u6.A06(str));
        A002.A0R("destination", "phone");
        A002.Cgf();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.addFlags(268435456);
        intent.setData(0cp.A01((0bY) this.A0F.getValue(), 002.A0R("tel:", str)));
        0kR.A0D(fragmentActivity, intent);
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [int, boolean] */
    public final void Cq6(View view, String str, boolean z) {
        C367618rI r1;
        int i;
        View view2 = view;
        String str2 = str;
        ? A1U = AnonymousClass7TF.A1U(0, str2, view2);
        UserSession userSession = this.A03;
        AnonymousClass0iw r2 = this.A02;
        AnonymousClass0eK r7 = this.A08;
        1Ln A002 = C3265677h.A00(r2, userSession, (C254743sy) this.A0C.get(), C66647MaG.A0E(C66582MXn.A0d(r7).B8S()), 0oI.A0A(this.A00), C321406u6.A06(str2));
        A002.A0R("destination", "phone");
        A002.Cgf();
        C254783t2 C6c = C66582MXn.A0d(r7).C6c();
        0qQ.A07(C6c);
        Context A0S = AnonymousClass7TE.A0S(view2);
        C70742OJn oJn = new C70742OJn(r2, userSession);
        0bY A0G2 = DbW.A0G();
        C367618rI r8 = new C367618rI((Drawable) null, A0S.getDrawable(R.drawable.instagram_call_pano_outline_24), (C15048ULb) null, new PHS(A0S, A0G2, oJn, C6c, str2, A1U), (Integer) null, AnonymousClass7TE.A16(A0S, 2131960002), 0, 0, 0, false, false, false, A1U, false, false, false);
        if (182.A06(0Tu.A05, userSession, 36322516947511527L)) {
            r1 = new C367618rI((Drawable) null, A0S.getDrawable(R.drawable.instagram_app_imessage_pano_outline_24), (C15048ULb) null, new C50489Fcb(A0S, oJn, C6c, str2, A1U), (Integer) null, AnonymousClass7TE.A16(A0S, 2131960004), 0, 0, 0, false, false, false, A1U, false, false, false);
        } else {
            r1 = null;
        }
        C367618rI[] r12 = {r8, r1, new C367618rI((Drawable) null, A0S.getDrawable(R.drawable.instagram_copy_pano_outline_24), (C15048ULb) null, new C50489Fcb(A0S, oJn, C6c, str2, 0), (Integer) null, AnonymousClass7TE.A16(A0S, 2131960003), 0, 0, 0, false, false, false, A1U, false, false, false)};
        0qQ.A0B(r12, 0);
        C355148Ov A0c = C66581MXm.A0c(A0S, userSession, (Integer) null, 03t.A0I(r12), false);
        int i2 = 8388611;
        if (z) {
            i2 = 8388613;
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        0eP A003 = A0c.A00();
        int i3 = 0nA.A0D(A0S).y - AnonymousClass2uJ.A00;
        Number number = (Number) A003.A01;
        if (iArr[A1U] + view2.getHeight() + number.intValue() > i3) {
            i = (-number.intValue()) - view2.getMeasuredHeight();
        } else {
            i = 0;
        }
        A0c.showAsDropDown(view2, 0, i, i2);
        0Aj A0e = AnonymousClass7TE.A0e(oJn.A00, "direct_phone_number_menu_impression");
        if (A0e.isSampled()) {
            C66580MXl.A1K(A0e, AnonymousClass4KK.A02(C6c));
            C66581MXm.A1H(A0e, AnonymousClass6W3.A07(C6c));
            A0e.Cgf();
        }
    }

    public final void CqU(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1N(str, str2);
        ((C50401Fb9) this.A0J.getValue()).CqU(str, str2, str3, z, z2, z3);
    }

    public final void CqV(OMU omu, 1Ns r11, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 0);
        ((C50401Fb9) this.A0J.getValue()).CqV(omu, r11, str, str2, str3, z, z2, z3);
    }

    public final void CqX(RectF rectF, OMU omu, MessageIdentifier messageIdentifier, 1Ns r14, String str, String str2, String str3, String str4, String str5) {
        String str6 = str2;
        AnonymousClass7TG.A1T(str, str6, r14);
        String str7 = str5;
        AnonymousClass7TF.A1F(messageIdentifier, 7, str7);
        C50401Fb9 fb9 = (C50401Fb9) this.A0J.getValue();
        RectF rectF2 = rectF;
        OMU omu2 = omu;
        fb9.CqX(rectF2, omu2, messageIdentifier, r14, str, str6, str3, str4, str7);
    }

    public final void Cql(String str, boolean z, String str2) {
        String str3;
        0qQ.A0B(str, 0);
        AnonymousClass0eK r2 = this.A08;
        AnonymousClass7ZY A0W = C66582MXn.A0W(r2);
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        Map BOG = A0W.BOG(C66580MXl.A0i(str3, (String) null));
        if (BOG != null) {
            1Ln A002 = C3265677h.A00(this.A02, this.A03, (C254743sy) this.A0C.get(), C66647MaG.A0E(C66582MXn.A0d(r2).B8S()), 0oI.A0A(this.A00), C321406u6.A06(str));
            A002.A0R("destination", "profile");
            A002.A0R("message_id", str2);
            A002.A0w(BOG);
            A002.Cgf();
        }
        1a1 r22 = C46447Df9.A03().A01;
        UserSession userSession = this.A03;
        Fragment A022 = r22.A02(userSession, C46548Dgp.A02(userSession, str, "direct_thread_username", this.A02.getModuleName()).A04());
        if (!z || !182.A06(0Tu.A05, userSession, 36326193439520343L)) {
            C309516Yo A0P2 = DbU.A0P((Bundle) null, A022, this.A00, userSession);
            A0P2.A0B = "ds_message_mention";
            A0P2.A08();
            A0P2.A04();
            return;
        }
        Bundle bundle = A022.mArguments;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass6W8 A0b = DbS.A0b(fragmentActivity, bundle, userSession, ModalActivity.class, "profile");
        A0b.A05 = "ds_message_mention";
        A0b.A08();
        A0b.A0C(fragmentActivity);
    }

    public static AnonymousClass0eM A00(UserSession userSession, Object obj, 0eO r4, int i) {
        C73909Plk plk = new C73909Plk(obj, i);
        if (C331817Sm.A00(userSession)) {
            return AnonymousClass0eN.A00(r4, plk);
        }
        return new 1Ue(plk.invoke());
    }

    public final void AGh(String str) {
        AnonymousClass0eK r1 = this.A08;
        DirectThreadThemeInfo C6d = C66582MXn.A0d(r1).C6d();
        C254743sy B6F = C66582MXn.A0d(r1).B6F();
        if (C6d != null && B6F != null) {
            this.A0O.CLU();
            UserSession userSession = this.A03;
            Context requireContext = this.A01.requireContext();
            FragmentActivity fragmentActivity = this.A00;
            C332257Ug r6 = this.A06;
            int i = C66582MXn.A0X(r1).A08;
            String str2 = str;
            C69961Nv1.A00(requireContext, fragmentActivity, userSession, r6, OSB.A00(C6d), B6F, str2, i, C66582MXn.A0X(r1).A07, C66582MXn.A0d(r1).CVr(), C66582MXn.A0d(r1).CVE(), C331057Pi.A02(C66582MXn.A0X(r1).A0H));
        }
    }

    public final void CHu(String str) {
        C49906FEe fEe = SimpleWebViewActivity.A02;
        FragmentActivity fragmentActivity = this.A00;
        fEe.A02(fragmentActivity, this.A03, new SimpleWebViewConfig(new C11225SFz(SQU.A01(fragmentActivity, str))));
    }

    public final void CHv(String str) {
        AnonymousClass14B A002 = AnonymousClass14B.A03.A00();
        FragmentActivity fragmentActivity = this.A00;
        Intent A042 = A002.A04(fragmentActivity, DbT.A09(str));
        A042.putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", true);
        0kR.A0B(fragmentActivity, A042);
    }

    public final void CpF(String str) {
        String queryParameter;
        Long A10;
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A00;
        if (182.A06(0Tu.A05, userSession, 36325188417106609L) && (queryParameter = DbT.A09(str).getQueryParameter("ad_id")) != null && (A10 = AnonymousClass7TE.A10(queryParameter)) != null) {
            C46649DiU A042 = C46649DiU.A04("com.bloks.www.instagram.ctx.adcontext", DbY.A0m("ad_id", C66581MXm.A0x(A10)));
            IgBloksScreenConfig A0N2 = DbS.A0N(userSession);
            A0N2.A0U = fragmentActivity.getResources().getString(2131952232);
            A0N2.A0P = AnonymousClass05K.A01;
            A042.A0D(fragmentActivity, A0N2);
        }
    }

    public final void CpH(String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A03;
        boolean A0E2 = C66647MaG.A0E(C66582MXn.A0d(this.A08).B8S());
        FragmentActivity fragmentActivity = this.A00;
        1Ln A002 = C3265677h.A00(this.A02, userSession, (C254743sy) this.A0C.get(), A0E2, 0oI.A0A(fragmentActivity), C321406u6.A06(str));
        A002.A0R("destination", "address");
        A002.Cgf();
        FFS.A03(fragmentActivity, str, (String) null, (String) null);
    }

    public final void CpI() {
        Dba.A12(new ArchiveHomeFragment(), DbS.A0M(this.A00, this.A03));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e1, code lost:
        if (X.182.A06(r9, r2, 36316448160878976L) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        if (X.182.A06(r9, r2, 36316448160944513L) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f4, code lost:
        if (r31 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
        r10 = X.AnonymousClass7TE.A1C();
        r15 = r31.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0102, code lost:
        if (r15.hasNext() == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        r1 = r15.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        if (X.ORH.A00(r2, (com.instagram.user.model.User) r1) != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        r10.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        r1 = X.AnonymousClass7TE.A1D(X.00k.A0d(r10, X.DbS.A04(r9, r2, 36597923137719358L)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0134, code lost:
        if (r1.size() == r10.size()) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0136, code lost:
        r3.putBoolean("removed_clips_collaborators_from_chat", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013d, code lost:
        r3.putParcelableArrayList("card_gallery_recipients", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CpM(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.List r29, java.util.List r30, X.0sn r31) {
        /*
            r21 = this;
            r8 = r21
            r7 = r24
            X.0eK r14 = r8.A0C
            java.lang.Object r0 = r14.get()
            X.3sy r0 = (X.C254743sy) r0
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r0)
            r5 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = r0.A00
        L_0x0015:
            java.lang.String r13 = "challenges"
            r4 = r22
            boolean r0 = X.0qQ.A0K(r4, r13)
            r1 = r23
            if (r0 == 0) goto L_0x0040
            if (r24 == 0) goto L_0x0040
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L_0x0040
            androidx.fragment.app.FragmentActivity r4 = r8.A00
            com.instagram.common.session.UserSession r3 = r8.A03
            X.4DU r2 = r8.A0R
            java.lang.String r0 = "channel_challenge_share_xma"
            X.1pE r0 = X.1pE.A01(r4, r2, r3, r0)
            r0.A0A(r7)
            r0.A0M = r1
            r0.A06()
            return
        L_0x003e:
            r2 = r5
            goto L_0x0015
        L_0x0040:
            X.0eK r0 = r8.A08
            X.7S7 r12 = X.C66582MXn.A0d(r0)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r8.A03
            com.instagram.user.model.User r0 = r0.A01(r2)
            java.lang.Integer r10 = r0.A0N()
            java.lang.String r0 = "surface"
            r3.putString(r0, r4)
            java.lang.String r0 = "collection_id"
            r3.putString(r0, r1)
            java.lang.String r0 = "thread_id"
            r3.putString(r0, r7)
            java.lang.String r0 = "seed_message_sender_id"
            r1 = r25
            r3.putString(r0, r1)
            java.lang.String r0 = "message_id"
            r1 = r26
            r3.putString(r0, r1)
            java.lang.String r0 = "client_context"
            r1 = r27
            r3.putString(r0, r1)
            if (r29 == 0) goto L_0x0118
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r29)
        L_0x0080:
            java.lang.String r0 = "source_image_urls"
            r3.putParcelableArrayList(r0, r1)
            if (r30 == 0) goto L_0x0115
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r30)
        L_0x008b:
            java.lang.String r0 = "pending_video_cover_frame_file_paths"
            r3.putStringArrayList(r0, r1)
            java.lang.String r0 = "card_gallery_sender_id"
            r1 = r28
            r3.putString(r0, r1)
            int r1 = X.C66580MXl.A05(r12)
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putInt(r0, r1)
            java.lang.Object r1 = X.C66580MXl.A0s(r14)
            X.3sy r1 = (X.C254743sy) r1
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            X.C67002Mga.A01(r3, r1, r0)
            androidx.fragment.app.FragmentActivity r6 = r8.A00
            com.instagram.model.direct.DirectShareTarget r0 = r12.C6Z(r6)
            com.facebook.base.activity.parcel.OpaqueParcelable r1 = X.0B0.A00(r0)
            java.lang.String r0 = "DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET"
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "shared_stack"
            boolean r0 = X.0qQ.A0K(r4, r0)
            r11 = 1
            if (r0 == 0) goto L_0x0142
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r0 != r10) goto L_0x00e3
            X.0Tu r9 = X.0Tu.A05
            r0 = 36313012184811092(0x81027e00000654, double:3.027833354213552E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x00e3
            r0 = 36316448160878976(0x81059e00221180, double:3.030006279314447E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 != 0) goto L_0x00f4
        L_0x00e3:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r0 != r10) goto L_0x0142
            X.0Tu r9 = X.0Tu.A05
            r0 = 36316448160944513(0x81059e00231181, double:3.030006279355893E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0142
        L_0x00f4:
            if (r31 == 0) goto L_0x013c
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r31.iterator()
        L_0x00fe:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r15.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = X.ORH.A00(r2, r0)
            if (r0 != 0) goto L_0x00fe
            r10.add(r1)
            goto L_0x00fe
        L_0x0115:
            r1 = r5
            goto L_0x008b
        L_0x0118:
            r1 = r5
            goto L_0x0080
        L_0x011b:
            r0 = 36597923137719358(0x82059e00240c3e, double:3.2080121880770626E-306)
            int r0 = X.DbS.A04(r9, r2, r0)
            java.util.List r0 = X.00k.A0d(r10, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            int r9 = r1.size()
            int r0 = r10.size()
            if (r9 == r0) goto L_0x013d
            java.lang.String r0 = "removed_clips_collaborators_from_chat"
            r3.putBoolean(r0, r11)
            goto L_0x013d
        L_0x013c:
            r1 = r5
        L_0x013d:
            java.lang.String r0 = "card_gallery_recipients"
            r3.putParcelableArrayList(r0, r1)
        L_0x0142:
            if (r31 != 0) goto L_0x0146
            X.0sn r31 = X.0sn.A00
        L_0x0146:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r31)
            java.lang.String r0 = "all_clips_media_receivers_from_chat"
            r3.putParcelableArrayList(r0, r1)
            X.2Dm r0 = X.1bJ.A00(r2)
            if (r24 == 0) goto L_0x0195
            X.3U9 r5 = X.C66580MXl.A0d(r0, r7)
            if (r5 == 0) goto L_0x0195
            boolean r0 = r5.CY7()
            if (r0 == 0) goto L_0x016a
            java.lang.String r1 = r5.C6f()
            java.lang.String r0 = "source_chat_thread_name"
            r3.putString(r0, r1)
        L_0x016a:
            int r1 = r5.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x0195
            X.3S9 r0 = r5.A01
            X.3Te r9 = r0.A0s
            if (r9 == 0) goto L_0x0195
            java.lang.String r1 = r2.A06
            int r0 = r5.C6a()
            java.lang.String r1 = X.C329997La.A00(r9, r1, r0)
            java.lang.String r0 = "channel_user_type"
            r3.putString(r0, r1)
            int r1 = r9.A00
            java.lang.String r0 = "direct_channel_audience_type"
            r3.putInt(r0, r1)
            boolean r1 = r9.A0I
            java.lang.String r0 = "channel_is_member"
            r3.putBoolean(r0, r1)
        L_0x0195:
            if (r22 == 0) goto L_0x01bc
            int r1 = r4.hashCode()
            r0 = -1782234803(0xffffffff95c5414d, float:-7.967069E-26)
            if (r1 == r0) goto L_0x020e
            r0 = -1417536950(0xffffffffab821a4a, float:-9.244352E-13)
            if (r1 == r0) goto L_0x01fe
            r0 = -892498197(0xffffffffcacd8eeb, float:-6735733.5)
            if (r1 != r0) goto L_0x01bc
            java.lang.String r0 = "stacks"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01bc
            X.0iw r1 = r8.A02
            if (r24 != 0) goto L_0x01b8
            java.lang.String r7 = ""
        L_0x01b8:
            r0 = -1
            X.C3265677h.A0J(r1, r2, r7, r0)
        L_0x01bc:
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl r1 = X.C69918NuK.A00(r2, r12)
            java.lang.String r0 = "DirectThreadSharedMediaFragment.DIRECT_MEDIA_REPLY_ELIGIBILITY_CHECKER"
            r3.putParcelable(r0, r1)
            X.3Te r0 = r12.BiC()
            if (r0 == 0) goto L_0x01de
            java.util.List r1 = r0.A09
            if (r1 == 0) goto L_0x01de
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01de
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r1)
            java.lang.String r0 = "blocked_reactions_in_thread"
            r3.putStringArrayList(r0, r1)
        L_0x01de:
            boolean r0 = X.0qQ.A0K(r4, r13)
            if (r0 == 0) goto L_0x0236
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324312244498404(0x810cc5000b2fe4, double:3.0349795574614965E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0236
            java.lang.Object r0 = r14.get()
            X.3sy r0 = (X.C254743sy) r0
            boolean r0 = X.C69874Ntc.A00(r6, r2, r0)
            if (r0 != 0) goto L_0x0236
            return
        L_0x01fe:
            java.lang.String r0 = "daily_prompt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01bc
            X.NjA r1 = X.C69309NjA.XMA
            java.lang.String r0 = "prompts_entry_point"
            r3.putSerializable(r0, r1)
            goto L_0x01bc
        L_0x020e:
            java.lang.String r0 = "questions"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01bc
            if (r5 == 0) goto L_0x01bc
            X.0iw r0 = r8.A02
            X.7IQ r15 = X.AnonymousClass7IP.A00(r0, r2)
            java.lang.String r17 = r5.C6C()
            java.lang.String r18 = r5.C6k()
            int r19 = r5.C6a()
            int r20 = r5.AdN()
            com.instagram.direct.prompts.DirectPromptTypes r16 = X.AnonymousClass79B.A01(r4)
            r15.A05(r16, r17, r18, r19, r20)
            goto L_0x01bc
        L_0x0236:
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "direct_card_gallery"
            X.6W8 r0 = X.DbS.A0b(r6, r3, r2, r1, r0)
            r0.A00 = r11
            X.C66581MXm.A16(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9G.CpM(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }

    public final void CpY(String str) {
        float f;
        Float A0q;
        DirectThreadKey A042 = C66647MaG.A04((C254743sy) this.A0C.get());
        if (A042 != null) {
            UserSession userSession = this.A03;
            IgBloksScreenConfig A0N2 = DbS.A0N(userSession);
            A0N2.A0U = "Composer";
            A0N2.A0R = "com.bloks.www.p2p.payment.androidcomposer";
            ArrayList A1D = AnonymousClass7TE.A1D(A042.A02);
            FragmentActivity fragmentActivity = this.A00;
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            HashMap A1E3 = AnonymousClass7TE.A1E();
            BitSet bitSet = new BitSet(3);
            A1E.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_currency_underline");
            bitSet.set(0);
            if (str == null || (A0q = 012.A0q(str)) == null) {
                f = 0.0f;
            } else {
                f = A0q.floatValue();
            }
            A1E.put("prefill_amount", Float.valueOf(f));
            A1E.put("prefill_memo", "");
            if (!A1D.isEmpty()) {
                A1E.put("recipients", A1D);
                bitSet.set(1);
            }
            A1E.put(DcV.A02(114, 10, 118), userSession.A06);
            bitSet.set(2);
            if (bitSet.nextClearBit(0) >= 3) {
                C46649DiU A062 = C46649DiU.A06("com.bloks.www.p2p.payment.androidcomposer", C359608dC.A01(A1E), A1E2);
                C46649DiU.A0B(A062, 719983200);
                A062.A03 = null;
                A062.A02 = null;
                A062.A04 = null;
                A062.A0H(A1E3);
                A062.A0D(fragmentActivity, A0N2);
                return;
            }
            throw AnonymousClass7TE.A0z("Missing Required Props");
        }
    }

    public final void Cpk() {
        AnonymousClass2S0.A01.A03();
        C49908FEg.A00(this.A00, this.A03);
    }

    public final void Cpp(RectF rectF, String str, String str2) {
        UserSession userSession = this.A03;
        C270634h3 r2 = new C270634h3(ClipsViewerSource.DIRECT, userSession);
        if (str == null) {
            if (str2 != null) {
                str = C70282O0m.A00(str2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        r2.A1S = true;
        r2.A1C = str;
        C250563lf.A0Y(this.A00, r2.A00(), userSession);
        this.A0O.CLU();
    }

    public final void Cpr(View view, ImageUrl imageUrl, Long l, String str, String str2) {
        String C6C;
        C329067Hl A062 = AnonymousClass9H7.A06(((AnonymousClass7SQ) this.A0H.getValue()).A00);
        if (imageUrl != null) {
            AnonymousClass7IV r6 = A062.A1r;
            Context context = A062.A1R;
            2Er r0 = A062.A0W;
            String url = imageUrl.getUrl();
            0qQ.A0B(context, 0);
            if (r0 != null && (C6C = r0.C6C()) != null) {
                UserSession userSession = r6.A02;
                02m.A0p.markerStart(619714951, 0);
                String A042 = 182.A04(0Tu.A05, userSession, 36884998749487700L);
                HashMap A022 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("igd_thread_id", C6C), AnonymousClass7TE.A1L("entrypoint", "ig_direct_from_generated_image"), AnonymousClass7TE.A1L("creation_session_id", r6.A00), AnonymousClass7TE.A1L("ig_comments_media_id", url), AnonymousClass7TE.A1L("generated_image_media_id", str), AnonymousClass7TE.A1L("generated_image_message_id", str2), AnonymousClass7TE.A1L("generated_image_send_timestamp", String.valueOf(l))});
                if (A042.length() > 0) {
                    A022.put("qe_variant", A042);
                }
                C46649DiU A043 = C46649DiU.A04("com.bloks.www.bloks.imagine_create.bottomsheet", A022);
                IgBloksScreenConfig A0N2 = DbS.A0N(userSession);
                A0N2.A0P = AnonymousClass05K.A01;
                A0N2.A00 = 16;
                A043.A0E(context, A0N2);
            }
        }
    }

    public final void Cq7() {
        0oI.A07(this.A01.requireContext(), AnonymousClass000.A00(74), (String) null);
    }

    public final void CqK(String str, String str2) {
        String str3;
        AnonymousClass0eK r4 = this.A08;
        if (C66582MXn.A0d(r4).CdE()) {
            Capabilities AlE = C66582MXn.A0d(r4).AlE();
            C376179Gx r1 = C376179Gx.PSEUDO_LOG_NAVIGATION_TO_PRODUCT_VIEWER;
            if (AlE.A00(r1)) {
                AnonymousClass7S9 AvL = C66580MXl.A0V(r4).AvL();
                0qQ.A0C(AvL, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.open.DirectThreadViewDataLoader");
                AnonymousClass7S6 r2 = (AnonymousClass7S6) AvL;
                C254703su BRz = r2.A0O.BRz(r2.B8S(), str2);
                if (BRz != null) {
                    str3 = BRz.A1u;
                } else {
                    str3 = "";
                }
                if (C66580MXl.A06(str3) > 0) {
                    1Ln A002 = C3265677h.A00(this.A02, this.A03, (C254743sy) this.A0C.get(), C66647MaG.A0E(C66582MXn.A0d(r4).B8S()), 0oI.A0A(this.A00), C321406u6.A06(str));
                    A002.A0R("destination", "Product");
                    A002.A0R("message_id", str2);
                    A002.A0Q("sender_id", AnonymousClass7TE.A10(str3));
                    A002.Cgf();
                }
            } else {
                C69932NuY.A00(r1);
            }
        }
        Product product = (Product) this.A0K.A04.get(str);
        if (product != null) {
            WNN.A01(C249713kF.A00.A0L(this.A00, this.A03, this.A0R, product, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, (String) null));
        }
    }

    public final void CqW(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        ((C50401Fb9) this.A0J.getValue()).CqW(reel, gradientSpinnerAvatarView);
    }

    public final void Cqh(String str) {
        User A022;
        String str2;
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass0eK r1 = this.A08;
        C254793t3 CBU = C66582MXn.A0d(r1).CBU();
        Map map = C66582MXn.A0X(r1).A0g;
        int i = C66582MXn.A0X(r1).A07;
        if (CBU != null && i != 8) {
            List<String> pathSegments = DbT.A09(str).getPathSegments();
            if (pathSegments.size() >= 4 && (A022 = 17h.A00(userSession).A02(AnonymousClass7TE.A19(pathSegments, 3))) != null) {
                if (map != null) {
                    str2 = DbT.A11(A022.getId(), map);
                } else {
                    str2 = null;
                }
                String B8Q = A022.B8Q();
                String id = A022.getId();
                C68481NJy nJy = new C68481NJy();
                Bundle A0A2 = DbV.A0A(userSession);
                A0A2.putString("username_hint", B8Q);
                A0A2.putString(C66654MaN.A01(0, 8, 88), str2);
                OXL.A02(A0A2, CBU, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                A0A2.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, id);
                A0A2.putString("nickname_change_entry_point", "admin_text");
                A0A2.putParcelable("thread_capabilities", (Parcelable) null);
                nJy.setArguments(A0A2);
                C331157Pu A002 = C69940Nug.A00(fragmentActivity, userSession, new C58208IoC(41, fragmentActivity, userSession, CBU, A022), new C58195Inz(6, fragmentActivity, userSession, A022));
                0qQ.A0A(nJy);
                A002.A02(fragmentActivity, nJy);
            }
        }
    }

    public final void E0y(MessageIdentifier messageIdentifier, long j) {
        ((P9K) this.A0I.getValue()).E0y(messageIdentifier, j);
    }

    public final void EFg(MessageIdentifier messageIdentifier) {
        ((P9K) this.A0I.getValue()).EFg(messageIdentifier);
    }

    public P9G(FragmentActivity fragmentActivity, AnonymousClass4DH r5, AnonymousClass0iw r6, UserSession userSession, AnonymousClass7SM r8, OT9 ot9, AnonymousClass7TO r10, C332837Wo r11, AnonymousClass7X4 r12, C332257Ug r13, AnonymousClass7XW r14, AnonymousClass7SN r15, AnonymousClass7XP r16, PA3 pa3, AnonymousClass4DU r18, C273434mZ r19, AnonymousClass0eK r20, AnonymousClass0eK r21, AnonymousClass0eK r22, AnonymousClass0eK r23, AnonymousClass0eK r24, AnonymousClass0eK r25, AnonymousClass0eK r26) {
        AnonymousClass0eM r0;
        this.A00 = fragmentActivity;
        this.A01 = r5;
        this.A03 = userSession;
        this.A0C = r20;
        this.A02 = r6;
        this.A07 = r19;
        this.A0R = r18;
        this.A08 = r21;
        this.A0O = r15;
        this.A06 = r13;
        this.A0K = r10;
        this.A0D = r22;
        this.A09 = r23;
        this.A04 = r8;
        this.A0B = r24;
        this.A0A = r25;
        this.A0E = r26;
        this.A05 = ot9;
        this.A0N = r14;
        this.A0Q = pa3;
        this.A0P = r16;
        this.A0L = r11;
        this.A0M = r12;
        C73786Pjl pjl = C73786Pjl.A00;
        0eO r2 = 0eO.A03;
        if (C331817Sm.A00(userSession)) {
            r0 = AnonymousClass0eN.A00(r2, pjl);
        } else {
            r0 = new 1Ue(DbW.A0G());
        }
        this.A0F = r0;
        this.A0H = C73909Plk.A00(this, 42);
        this.A0G = A00(userSession, this, r2, 41);
        this.A0J = A00(userSession, this, r2, 48);
        this.A0I = A00(userSession, this, r2, 44);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r0 = X.C66582MXn.A0d(r14.A08);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cfc(java.lang.String r15) {
        /*
            r14 = this;
            boolean r0 = X.C69935Nub.A00(r15)
            if (r0 == 0) goto L_0x002a
            android.net.Uri r4 = X.DbT.A09(r15)
            java.util.Set r0 = r4.getQueryParameterNames()
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r3 = r0.iterator()
        L_0x0016:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)
            java.lang.String r0 = r4.getQueryParameter(r2)
            if (r0 == 0) goto L_0x0016
            r1.put(r2, r0)
            goto L_0x0016
        L_0x002a:
            r1 = 0
        L_0x002b:
            X.7SN r0 = r14.A0O
            r0.CLU()
            if (r1 == 0) goto L_0x00a5
            X.0eK r0 = r14.A08
            X.7S7 r0 = X.C66582MXn.A0d(r0)
            java.lang.String r12 = r0.C6C()
            if (r12 == 0) goto L_0x00a5
            java.lang.String r13 = r0.BY8()
            X.3t3 r6 = r0.CBU()
            if (r13 == 0) goto L_0x00a5
            if (r6 == 0) goto L_0x00a5
            com.instagram.common.session.UserSession r8 = r14.A03
            androidx.fragment.app.FragmentActivity r7 = r14.A00
            com.instagram.direct.capabilities.Capabilities r5 = r0.AlE()
            X.0qQ.A07(r5)
            r4 = 1
            java.lang.String r0 = "user_action_type"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "token_ent_id_string"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            X.17i r11 = X.17h.A00(r8)
            if (r3 == 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00a5
            android.os.Bundle r1 = X.DbV.A0A(r8)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_TOKEN_ENT_ID"
            r1.putString(r0, r2)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_USER_ACTION_TYPE"
            r1.putString(r0, r3)
            X.OXL.A01(r1, r5, r6)
            X.NKB r9 = new X.NKB
            r9.<init>()
            X.7Pr r1 = X.DbV.A0V(r1, r9, r8)
            r1.A0T = r9
            X.DbS.A1S(r1, r4)
            r0 = 2131165595(0x7f07019b, float:1.7945412E38)
            r1.A05(r7, r0)
            X.7Pu r10 = r1.A00()
            X.OHK r6 = new X.OHK
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r9.A01 = r6
            android.app.Activity r0 = X.C61190ls.A00(r7)
            r10.A02(r0, r9)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9G.Cfc(java.lang.String):void");
    }

    public final void CpR(String str, String str2, String str3, String str4, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("direct_clips_preview_cdn_url", str);
        A0a.putString("direct_clips_preview_author_id", str2);
        A0a.putString("direct_clips_preview_audio_cluster_id", str3);
        A0a.putString("direct_clips_preview_draft_id", str4);
        A0a.putBoolean("direct_clips_preview_should_mute", z);
        Dbb.A0i(this.A00, A0a, this.A03, ModalActivity.class, C273654mx.A00(2250));
    }

    public final void CqG() {
        C46649DiU A042 = C46649DiU.A04("com.bloks.www.ig.direct.pro.p2b.privacy.disclosure", AnonymousClass7TE.A1E());
        UserSession userSession = this.A03;
        C46622Di2 A012 = C49891FBs.A01(DbS.A0N(userSession), A042);
        C331127Pr A0W = DbS.A0W(userSession);
        DbS.A1S(A0W, true);
        A0W.A03 = 0.7f;
        C72959PQr.A00(A0W, this, 13).A02(this.A00, A012);
        this.A06.Cyt();
    }

    public final void Cqn() {
        C48953Emr.A00().A00(this.A00, this.A03, EWI.DIRECT_SHARE, (String) null, (String) null, (String) null);
    }
}
