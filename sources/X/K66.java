package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class K66 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, MV2, C66477MTf, CallerContextable {
    public static final String __redex_internal_original_name = "ClipsPublishScreenFragment";
    public AnonymousClass847 A00;
    public AnonymousClass9P8 A01;
    public AnonymousClass8ZP A02;
    public C64146LQj A03;
    public C61823KNm A04;
    public C60089JfV A05;
    public LBG A06;
    public C60228Jhl A07;
    public DirectCameraViewModel A08;
    public PromptStickerModel A09;
    public AnonymousClass6ST A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public 2da A0H;
    public C357058Wh A0I;
    public String A0J;
    public ArrayList A0K;
    public boolean A0L;
    public final TextWatcher A0M;
    public final AnonymousClass0iw A0N = new C64580LeM(this);
    public final Set A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S;
    public final AnonymousClass0eM A0T;
    public final 1wn A0U;
    public final 1wn A0V;
    public final 1wn A0W;
    public final 1wn A0X;
    public final 1wn A0Y;
    public final 1wn A0Z;
    public final 1wn A0a;
    public final 1wn A0b;
    public final C15681Ugm A0c;
    public final C252213ok A0d;
    public final AnonymousClass3E6 A0e;
    public final String A0f = AnonymousClass7TG.A0j();

    private final int A00() {
        int[] iArr = new int[2];
        LBG lbg = this.A06;
        if (lbg != null) {
            lbg.A0A.getLocationOnScreen(iArr);
            int i = iArr[1];
            int[] iArr2 = new int[2];
            LBG lbg2 = this.A06;
            if (lbg2 != null) {
                lbg2.A03.getLocationOnScreen(iArr2);
                int i2 = iArr2[1];
                LBG lbg3 = this.A06;
                if (lbg3 != null) {
                    return (i + lbg3.A03.getScrollY()) - i2;
                }
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0B(C272044k0 r51, K66 k66) {
        C272024jy r4;
        CommentPrompt commentPrompt = null;
        C272044k0 r5 = r51;
        if (r51 != null) {
            r4 = r5.A01;
        } else {
            r4 = null;
        }
        KOA koa = A06(k66).A0J;
        koa.A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, koa.A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, r4, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -2097153, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
        if (r51 != null) {
            commentPrompt = r5.A00;
        }
        KOA koa2 = A06(k66).A0J;
        koa2.A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, koa2.A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -1, 262141, false, false, false, false, AnonymousClass7TF.A1V(commentPrompt), false, false, false, false, false, false, false, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r1 == null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(java.lang.String r13) {
        /*
            r12 = this;
            r6 = r12
            r9 = r13
            if (r13 != 0) goto L_0x0008
            java.lang.String r9 = r12.getModuleName()
        L_0x0008:
            X.3Q2 r4 = X.C61829KNs.A02(r12)
            if (r4 == 0) goto L_0x0109
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A02(r12)
            if (r0 == 0) goto L_0x0109
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r12)
            X.JwI r0 = r0.A02
            if (r0 == 0) goto L_0x0037
            X.0eM r0 = r12.A0T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0iw r1 = r12.A0N
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r12)
            java.lang.String r0 = r0.A0T
            X.LSk r3 = X.LK1.A01(r1, r2, r0)
            java.lang.String r2 = "user"
            java.lang.String r1 = "share_sheet"
            java.lang.String r0 = "tap_share_trial"
            X.LSk.A03(r3, r2, r1, r0)
        L_0x0037:
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r12)
            boolean r11 = r0.A17
            X.LBG r0 = r12.A06
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "viewHolder"
        L_0x0043:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004b:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            java.lang.String r7 = X.AnonymousClass7TF.A0f(r0)
            X.KNs r0 = A06(r12)
            X.K1L r0 = r0.A00
            if (r0 == 0) goto L_0x00bd
            X.L7h r0 = r0.A00
            if (r0 == 0) goto L_0x00bd
            java.util.List r10 = r0.A02
        L_0x005f:
            X.KNs r0 = A06(r12)
            X.KOZ r0 = r0.A0O
            X.05G r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.KO4 r0 = (X.KO4) r0
            java.lang.String r8 = r0.A00
            X.KNs r0 = A06(r12)
            X.KOY r0 = r0.A0a
            r0.A0A(r11)
            X.0eM r3 = r12.A0T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.1Av r2 = X.1Au.A00(r0)
            X.JxB r0 = r4.A0v
            if (r0 == 0) goto L_0x008b
            java.lang.Integer r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            r2.A1J(r0)
            X.3Q2 r0 = X.C61829KNs.A02(r12)
            if (r0 == 0) goto L_0x009b
            boolean r0 = r0.A0o()
            if (r0 != 0) goto L_0x00a5
        L_0x009b:
            X.3Q2 r0 = X.C61829KNs.A02(r12)
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r0.A51
            if (r0 == 0) goto L_0x00c8
        L_0x00a5:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321206982550692(0x8109f2000224a4, double:3.033015777301877E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00c8
            X.8Wh r0 = r12.A0I
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "adsEligibilityController"
            goto L_0x0043
        L_0x00bd:
            r10 = 0
            goto L_0x005f
        L_0x00bf:
            X.MJF r5 = new X.MJF
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.A04(r4, r5)
            return
        L_0x00c8:
            X.KNs r0 = A06(r12)
            X.KOa r1 = r0.A0I
            r3 = 1
            X.05G r0 = r1.A06
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.A0A(r0)
            if (r7 == 0) goto L_0x0103
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0103
        L_0x00e2:
            X.KNs r1 = A06(r12)
            if (r7 != 0) goto L_0x0101
            java.lang.String r2 = ""
        L_0x00ea:
            X.JwD r0 = r1.A01
            if (r0 == 0) goto L_0x0105
            if (r3 == 0) goto L_0x0105
            X.KOa r1 = r1.A0I
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r0, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, r2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -5, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r1.A09(r0)
            X.8Wq r0 = r1.A01
            if (r0 == 0) goto L_0x010c
            r0.A04()
            return
        L_0x0101:
            r2 = r7
            goto L_0x00ea
        L_0x0103:
            r3 = 0
            goto L_0x00e2
        L_0x0105:
            A0O(r6, r7, r8, r9, r10, r11)
            return
        L_0x0109:
            A0J(r12)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.A0T(java.lang.String):void");
    }

    public final void Dft() {
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        this.A0H = r4;
        r4.Eu4(true);
        int i = 2131973661;
        if (A0R(this)) {
            i = 2131969140;
        }
        r4.Eom(i);
        if (A02(this) == C62482KgX.DIRECT_TO_SHARE) {
            r4.AA9(new KIR(this, 4), 2131961425);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: X.K66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r19v1, types: [X.8Wp, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0453, code lost:
        if ((r4.A01() instanceof X.AnonymousClass9HR) != true) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0219, code lost:
        if (X.JUO.A00(X.AnonymousClass7TE.A0l(r35)) == false) goto L_0x021b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r37, android.os.Bundle r38) {
        /*
            r36 = this;
            r1 = 0
            r7 = r37
            X.0qQ.A0B(r7, r1)
            r0 = r36
            r2 = r38
            super.onViewCreated(r7, r2)
            X.0eM r2 = r0.A0T
            r35 = r2
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r35)
            X.8A2 r2 = X.AnonymousClass8A1.A01(r2)
            java.lang.String r6 = "reels"
            X.1QP r5 = r2.A0J
            long r2 = r2.A07
            X.AE4 r4 = new X.AE4
            r4.<init>(r5)
            r4.A01 = r2
            java.lang.String r3 = "share_sheet_type"
            java.util.Map r2 = r4.A04
            r2.put(r3, r6)
            r4.A02()
            X.JTT.A15(r7, r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r35)
            java.lang.String r3 = A08(r0)
            X.LBG r2 = new X.LBG
            r2.<init>(r7, r4, r3)
            r0.A06 = r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r2 = A01(r0)
            X.2gB r5 = r2.A00
            X.07Z r4 = r0.getViewLifecycleOwner()
            r3 = 44
            X.MP4 r2 = new X.MP4
            r2.<init>(r0, r3)
            r13 = 12
            X.Dba.A15(r4, r5, r2, r13)
            r0.A09()
            X.LBG r2 = r0.A06
            if (r2 == 0) goto L_0x04b0
            X.I22 r8 = r2.A09
            X.KNs r2 = A06(r0)
            X.KOo r6 = r2.A0L
            java.util.Set r9 = r0.A0O
            X.Kka r2 = X.C62674Kka.A0B
            r9.add(r2)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r35)
            X.0Tu r2 = X.0Tu.A05
            r3 = 36324746035933523(0x810d2a00073153, double:3.0352538889118037E-306)
            boolean r3 = X.182.A06(r2, r5, r3)
            if (r3 == 0) goto L_0x0099
            r4 = 47
            X.MP4 r3 = new X.MP4
            r3.<init>(r0, r4)
            r8.A04(r3)
            X.27r r5 = X.JTP.A0X(r0)
            X.80P r4 = X.AnonymousClass80P.PUBLISH_SCREEN_PREVIEW
            X.4yP r3 = X.C279294yP.CLIPS
            r5.A15(r3, r4)
            X.Kka r3 = X.C62674Kka.A0F
            r9.add(r3)
        L_0x0099:
            X.07U r10 = X.07U.A05
            X.07Z r19 = r0.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r19)
            r7 = 0
            r21 = 33
            X.JUk r4 = new X.JUk
            r14 = r4
            r15 = r8
            r16 = r0
            r17 = r6
            r18 = r10
            r20 = r7
            r14.<init>((java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (X.AnonymousClass4D7) r20, (int) r21)
            X.19B r6 = X.19B.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.1Eo.A03(r3, r6, r4, r5)
            X.KNs r4 = A06(r0)
            X.KOa r5 = r4.A0I
            r14 = 4
            X.M17 r8 = new X.M17
            r8.<init>(r0, r14)
            X.1Yl r15 = X.C357108Wn.A00()
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r35)
            X.C357108Wn.A00()
            X.M15 r19 = new X.M15
            r19.<init>()
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x04b0
            android.view.ViewStub r4 = r4.A02
            r16 = r4
            r17 = r0
            r20 = r8
            X.8Wq r4 = r15.A00(r16, r17, r18, r19, r20)
            r5.A01 = r4
            X.27r r8 = X.JTP.A0X(r0)
            X.80P r5 = X.AnonymousClass80P.WRITE_CAPTION
            X.4yP r18 = X.C279294yP.CLIPS
            r4 = r18
            r8.A15(r4, r5)
            com.instagram.common.session.UserSession r8 = X.JTP.A0S(r0, r1)
            r4 = 36604992651924644(0x820c0c000614a4, double:3.212482977327134E-306)
            long r15 = X.182.A01(r2, r8, r4)
            java.lang.String r17 = "viewHolder"
            r11 = 0
            int r4 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0117
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r5 = r4.A0A
            android.text.TextWatcher r4 = r0.A0M
            r5.addTextChangedListener(r4)
        L_0x0117:
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r8 = r4.A0A
            android.content.res.Resources r5 = X.DbV.A05(r0)
            r4 = 2131973655(0x7f135617, float:1.9584352E38)
            java.lang.String r4 = r5.getString(r4)
            r8.setHint(r4)
            X.07Z r8 = r0.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r8)
            r4 = 5
            X.MHO r4 = X.MHO.A03(r8, r10, r0, r7, r4)
            X.1Eo.A03(r3, r6, r4, r5)
            X.07Z r8 = r0.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r8)
            r4 = 6
            X.MHO r4 = X.MHO.A03(r8, r10, r0, r7, r4)
            X.1Eo.A03(r3, r6, r4, r5)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r4 = r4.A0A
            X.LWP.A00(r4, r0, r13)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r5 = r4.A0A
            r16 = 7
            r4 = r16
            X.LYN.A00(r5, r4, r0)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r5 = r4.A0A
            r4 = 57
            X.LYF.A01(r5, r4, r0)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r5 = r4.A0A
            r4 = 17
            X.C64286LYm.A00(r5, r4, r0)
            X.7eY r11 = new X.7eY
            r11.<init>(r0)
            com.instagram.common.session.UserSession r8 = X.JTP.A0S(r0, r1)
            r4 = 36323401710840968(0x810bf100022c88, double:3.034403732310109E-306)
            boolean r4 = X.182.A06(r2, r8, r4)
            if (r4 == 0) goto L_0x03e2
            java.lang.String r28 = "share_post_page"
        L_0x018d:
            android.content.Context r19 = r0.requireContext()
            com.instagram.common.session.UserSession r23 = X.AnonymousClass7TE.A0l(r35)
            android.content.Context r8 = r0.requireContext()
            X.0gy r5 = X.AnonymousClass07i.A00(r0)
            X.2lw r4 = new X.2lw
            r4.<init>(r8, r5, r7)
            X.0iw r5 = r0.A0N
            r34 = r5
            r8 = 1
            r24 = r11
            r25 = r7
            r26 = r7
            r27 = r7
            r29 = r7
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r8
            r20 = r7
            r21 = r5
            r22 = r4
            X.7eF r5 = X.C336207eF.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r4 = r4.A0A
            r4.A02 = r8
            r4.A07 = r8
            r4.setAdapter(r5)
            X.Kka r4 = X.C62674Kka.A0P
            r9.add(r4)
            boolean r4 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A02(r0)
            if (r4 == 0) goto L_0x020b
            X.5kq r4 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r0)
            java.lang.String r4 = r4.A0S
            if (r4 == 0) goto L_0x020b
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x020b
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r35)
            r4 = 36325587849065542(0x810dee00003446, double:3.035786254926202E-306)
            boolean r4 = X.182.A06(r2, r11, r4)
            if (r4 == 0) goto L_0x020b
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r5 = r4.A0A
            X.5kq r4 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r0)
            java.lang.String r4 = r4.A0S
            if (r4 != 0) goto L_0x0208
            java.lang.String r4 = ""
        L_0x0208:
            r5.setText(r4)
        L_0x020b:
            boolean r4 = r0.A0E
            if (r4 != 0) goto L_0x021b
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r35)
            boolean r4 = X.JUO.A00(r4)
            r27 = 1
            if (r4 != 0) goto L_0x021d
        L_0x021b:
            r27 = 0
        L_0x021d:
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r35)
            r4 = 36326244979062422(0x810e8700003696, double:3.036201826582279E-306)
            boolean r28 = X.182.A06(r2, r11, r4)
            com.instagram.common.session.UserSession r11 = X.JTP.A0S(r0, r1)
            r4 = 36325111108022894(0x810d7f0005326e, double:3.035484761971149E-306)
            boolean r26 = X.182.A06(r2, r11, r4)
            X.LCg r11 = new X.LCg
            r11.<init>(r0)
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            X.Jkf r4 = r11.A00
            r4.A00 = r15
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            androidx.recyclerview.widget.RecyclerView r4 = r4.A06
            r11.A00(r4)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r4 = r4.A0A
            X.0nA.A0X(r4, r1)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            androidx.recyclerview.widget.RecyclerView r4 = r4.A06
            r4.setVisibility(r1)
            com.instagram.common.session.UserSession r12 = X.JTP.A0S(r0, r1)
            r4 = 36318840455961083(0x8107cb000819fb, double:3.031519176357371E-306)
            boolean r4 = X.182.A06(r2, r12, r4)
            if (r4 == 0) goto L_0x0279
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            android.view.View r5 = r4.A01
            r4 = 16
            X.C64286LYm.A00(r5, r4, r0)
        L_0x0279:
            if (r28 != 0) goto L_0x027f
            if (r27 != 0) goto L_0x027f
            if (r26 == 0) goto L_0x02a3
        L_0x027f:
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.0xx r4 = X.AnonymousClass07a.A00(r5)
            X.MHO r5 = X.MHO.A03(r5, r10, r0, r7, r14)
            X.1Eo.A03(r3, r6, r5, r4)
            X.0eM r4 = r0.A0P
            java.lang.Object r4 = r4.getValue()
            X.Jg1 r4 = (X.C60120Jg1) r4
            if (r4 == 0) goto L_0x02a3
            X.2Fj r5 = r4.A00
            r4 = 53
            X.MId r4 = X.JTO.A1C(r0, r4)
            X.Dba.A15(r0, r5, r4, r13)
        L_0x02a3:
            X.07Z r21 = r0.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r21)
            com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2 r4 = new com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2
            r19 = r4
            r20 = r10
            r22 = r11
            r23 = r0
            r24 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.1Eo.A03(r3, r6, r4, r5)
            com.instagram.common.session.UserSession r11 = X.JTP.A0S(r0, r1)
            r4 = 36323401710906505(0x810bf100032c89, double:3.034403732351555E-306)
            boolean r4 = X.182.A06(r2, r11, r4)
            if (r4 == 0) goto L_0x0303
            X.KNs r4 = A06(r0)
            X.KOa r11 = r4.A0I
            X.3Q2 r4 = X.C61829KNs.A02(r0)
            if (r4 == 0) goto L_0x03df
            X.28D r12 = r4.A0i
        L_0x02da:
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r35)
            boolean r4 = A0R(r0)
            r23 = r4 ^ 1
            X.Lgz r5 = new X.Lgz
            r20 = r12
            r21 = r0
            r24 = r1
            r19 = r5
            r19.<init>(r20, r21, r22, r23, r24)
            X.Lo1 r4 = new X.Lo1
            r4.<init>(r12, r0)
            r5.A01 = r4
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r4 = r4.A0A
            r5.A00(r4, r4)
            r11.A00 = r5
        L_0x0303:
            X.3Q2 r4 = X.C61829KNs.A02(r0)
            if (r4 == 0) goto L_0x03a7
            X.3Q2 r4 = X.C61829KNs.A02(r0)
            if (r4 == 0) goto L_0x03a7
            X.JxB r4 = r4.A0v
            if (r4 == 0) goto L_0x03a7
            java.lang.Integer r4 = r4.A00
            if (r4 == 0) goto L_0x03a7
        L_0x0317:
            X.KNs r4 = A06(r0)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r11 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MAIN
            X.KNn r5 = r4.A0B
            X.JwD r4 = r4.A01
            java.util.ArrayList r4 = r5.A06(r11, r4)
            java.util.Iterator r13 = r4.iterator()
        L_0x0329:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x03e6
            java.lang.Object r5 = r13.next()
            X.KmH r5 = (X.C62779KmH) r5
            boolean r4 = r5 instanceof X.C61832KNv
            if (r4 == 0) goto L_0x0377
            X.KNv r5 = (X.C61832KNv) r5
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r4 = r5.A00
            X.KNv r11 = new X.KNv
            r11.<init>(r4)
        L_0x0342:
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            X.LAv r4 = r4.A08
            android.view.ViewGroup r5 = r4.A01
            X.KNm r4 = r0.A04
            if (r4 == 0) goto L_0x0548
            X.Kp2 r4 = r4.A03()
            X.MVS r12 = r4.A05(r11)
            android.view.View r4 = r12.ANH()
            r5.addView(r4)
            X.Kka r4 = r12.B1s()
            if (r4 == 0) goto L_0x0366
            r9.add(r4)
        L_0x0366:
            X.27r r11 = X.JTP.A0X(r0)
            X.80P r5 = r12.BHl()
            r4 = r18
            r11.A15(r4, r5)
            r12.CsQ()
            goto L_0x0329
        L_0x0377:
            boolean r4 = r5 instanceof X.C61833KNw
            if (r4 == 0) goto L_0x0385
            X.KNw r5 = (X.C61833KNw) r5
            java.lang.Integer r4 = r5.A00
            X.KNw r11 = new X.KNw
            r11.<init>(r4)
            goto L_0x0342
        L_0x0385:
            boolean r4 = r5 instanceof X.KNx
            if (r4 == 0) goto L_0x0329
            X.KNm r4 = r0.A04
            if (r4 == 0) goto L_0x0548
            X.Kp2 r5 = r4.A03()
            X.KNx r4 = X.KNx.A00
            X.MVS r11 = r5.A05(r4)
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x04b0
            X.LAv r4 = r4.A08
            android.view.ViewGroup r5 = r4.A01
            android.view.View r4 = r11.ANH()
            r5.addView(r4)
            goto L_0x0329
        L_0x03a7:
            X.KNs r12 = A06(r0)
            X.K1L r4 = r12.A00
            if (r4 != 0) goto L_0x0317
            com.instagram.common.session.UserSession r5 = r12.A07
            r4 = 14
            X.MP9 r11 = new X.MP9
            r11.<init>(r12, r4)
            X.1NY r12 = X.AnonymousClass7TG.A0b(r5)
            java.lang.String r4 = "clips/clips_info_for_creation/"
            r12.A0A(r4)
            java.lang.String r4 = "m_pk"
            X.0qQ.A0B(r4, r1)
            java.lang.Class<X.K1L> r5 = X.K1L.class
            java.lang.Class<X.LHl> r4 = X.C63993LHl.class
            X.1OC r5 = X.DbU.A0S(r12, r5, r4)
            r4 = 20
            X.C61500KAf.A00(r5, r11, r4)
            X.1ET r4 = X.1ES.A01()
            X.0qQ.A0B(r4, r1)
            r4.schedule(r5)
            goto L_0x0317
        L_0x03df:
            r12 = r7
            goto L_0x02da
        L_0x03e2:
            java.lang.String r28 = "clips_edit_page"
            goto L_0x018d
        L_0x03e6:
            X.3Q2 r4 = X.C61829KNs.A02(r0)
            if (r4 == 0) goto L_0x049e
            X.3Q2 r4 = X.C61829KNs.A02(r0)
            if (r4 == 0) goto L_0x049e
            X.JxB r4 = r4.A0v
            if (r4 == 0) goto L_0x049e
            java.lang.Integer r4 = r4.A00
            if (r4 == 0) goto L_0x049e
        L_0x03fa:
            X.LBG r4 = r0.A06
            if (r4 == 0) goto L_0x0540
            X.LAv r4 = r4.A08
            com.instagram.igds.components.button.IgdsButton r5 = r4.A07
            r4 = 58
            X.LYF.A01(r5, r4, r0)
            X.LBG r5 = r0.A06
            r4 = 0
            if (r5 == 0) goto L_0x0540
            X.LAv r11 = r5.A08
            com.instagram.igds.components.button.IgdsButton r5 = r11.A07
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            X.2eS.A04(r5, r9)
            com.instagram.igds.components.button.IgdsButton r12 = r11.A06
            r5 = 54
            X.LYF.A01(r12, r5, r0)
            X.2eS.A04(r12, r9)
            r15 = 46
            X.MP4 r14 = new X.MP4
            r14.<init>(r0, r15)
            com.instagram.common.ui.base.IgTextView r12 = r11.A04
            X.2eS.A04(r12, r9)
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            boolean r5 = r13 instanceof X.C71492dQ
            if (r5 == 0) goto L_0x043f
            X.2dQ r13 = (X.C71492dQ) r13
            if (r13 == 0) goto L_0x043f
            com.instagram.igds.components.button.IgdsButton r5 = r11.A07
            int r5 = r5.getId()
            r13.A0t = r5
        L_0x043f:
            X.LYD.A02(r12, r15, r14)
            com.instagram.model.direct.camera.DirectCameraViewModel r5 = r0.A08
            if (r5 == 0) goto L_0x0448
            com.instagram.model.direct.DirectShareTarget r4 = r5.A03
        L_0x0448:
            r15 = 0
            if (r4 == 0) goto L_0x0455
            r15 = 1
            X.3t2 r5 = r4.A01()
            boolean r5 = r5 instanceof X.AnonymousClass9HR
            r14 = 1
            if (r5 == r8) goto L_0x0456
        L_0x0455:
            r14 = 0
        L_0x0456:
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r35)
            boolean r5 = A0R(r0)
            X.0qQ.A0B(r13, r1)
            if (r5 != 0) goto L_0x049b
            java.lang.Integer r5 = X.JTS.A0e(r13)
            if (r5 == r9) goto L_0x049b
            com.instagram.user.model.User r5 = X.AnonymousClass7TF.A0Q(r13)
            int r5 = r5.A07()
            if (r5 != 0) goto L_0x049b
            if (r15 == 0) goto L_0x0477
            if (r14 == 0) goto L_0x049b
        L_0x0477:
            r5 = 0
        L_0x0478:
            r12.setVisibility(r5)
            if (r4 == 0) goto L_0x04f8
            if (r14 != 0) goto L_0x04f8
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.List r5 = r4.A0Q
            java.util.Iterator r13 = X.JTQ.A0h(r5)
        L_0x0489:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x04b4
            java.lang.Object r5 = r13.next()
            com.instagram.pendingmedia.model.recipients.PendingRecipient r5 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r5
            com.instagram.common.typedurl.ImageUrl r5 = r5.A03
            r12.add(r5)
            goto L_0x0489
        L_0x049b:
            r5 = 8
            goto L_0x0478
        L_0x049e:
            X.07Z r9 = r0.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r9)
            r4 = 2
            X.MHO r4 = X.MHO.A03(r9, r10, r0, r7, r4)
            X.1Eo.A03(r3, r6, r4, r5)
            goto L_0x03fa
        L_0x04b0:
            java.lang.String r17 = "viewHolder"
            goto L_0x0540
        L_0x04b4:
            android.content.Context r17 = r0.requireContext()
            java.lang.String r22 = r34.getModuleName()
            android.content.Context r5 = r0.requireContext()
            int r24 = X.AnonymousClass7TH.A01(r5)
            r18 = r7
            r19 = r3
            r20 = r7
            r21 = r7
            r23 = r12
            r25 = r1
            X.3b0 r12 = X.C244283aw.A05(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r11.A05
            r5.setImageDrawable(r12)
            r5.setVisibility(r1)
            r5.setImageDrawable(r7)
            android.content.res.Resources r12 = X.DbV.A05(r0)
            r5 = 2131973662(0x7f13561e, float:1.9584366E38)
            java.lang.String r4 = r4.A0I
            if (r4 != 0) goto L_0x04ec
            java.lang.String r4 = ""
        L_0x04ec:
            android.text.Spanned r5 = X.JTR.A0T(r12, r4, r5)
            com.instagram.common.ui.base.IgTextView r4 = r11.A03
            r4.setText(r5)
            r4.setVisibility(r1)
        L_0x04f8:
            X.07Z r18 = r0.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r18)
            X.MHF r4 = new X.MHF
            r17 = r4
            r19 = r10
            r20 = r11
            r21 = r0
            r22 = r7
            r23 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.1Eo.A03(r3, r6, r4, r5)
            X.KNm r4 = r0.A04
            if (r4 == 0) goto L_0x0548
            X.MVR r4 = r4.A01
            r4.Dh3()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r35)
            X.0Tu r10 = X.AnonymousClass7TF.A0H(r11)
            r4 = 36323517675678955(0x810c0c000d2ceb, double:3.034477068940605E-306)
            boolean r4 = X.182.A06(r10, r11, r4)
            if (r4 == 0) goto L_0x0557
            X.3E6 r5 = r0.A0e
            X.3ok r4 = r0.A0d
            r5.A9Y(r4)
            X.JTP.A17(r0, r5)
            X.JfV r4 = r0.A05
            if (r4 != 0) goto L_0x054b
            java.lang.String r17 = "clipsPublishScreenCaptionSuggestionViewModel"
        L_0x0540:
            X.0qQ.A0F(r17)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0548:
            java.lang.String r17 = "dependencyProvider"
            goto L_0x0540
        L_0x054b:
            X.05G r10 = r4.A01
            r5 = 22
            X.MGX r4 = new X.MGX
            r4.<init>(r0, r7, r5)
            X.DbZ.A1C(r0, r4, r10)
        L_0x0557:
            com.instagram.common.session.UserSession r10 = X.JTP.A0S(r0, r1)
            r4 = 36323517675875566(0x810c0c00102cee, double:3.034477069064943E-306)
            boolean r4 = X.182.A06(r2, r10, r4)
            if (r4 == 0) goto L_0x0570
            X.3E6 r5 = r0.A0e
            X.3ok r4 = r0.A0d
            r5.A9Y(r4)
            X.JTP.A17(r0, r5)
        L_0x0570:
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r35)
            android.content.Context r11 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r10 = r0.requireActivity()
            X.0qQ.A0B(r12, r1)
            java.lang.Integer r4 = X.JTS.A0e(r12)
            if (r4 != r9) goto L_0x05cb
            X.17i r5 = X.17h.A00(r12)
            java.lang.String r4 = r12.A06
            com.instagram.user.model.User r4 = r5.A02(r4)
            if (r4 == 0) goto L_0x05cb
            X.4Cl r4 = r4.A03
            java.lang.Boolean r4 = r4.Cae()
            if (r4 == 0) goto L_0x05cb
            boolean r4 = r4.booleanValue()
            if (r4 != r8) goto L_0x05cb
            X.1Av r8 = X.1Au.A00(r12)
            X.0s0 r5 = r8.A4p
            X.0YZ[] r9 = X.1Av.A8a
            r4 = 333(0x14d, float:4.67E-43)
            boolean r4 = X.AnonymousClass7TG.A1a(r8, r5, r9, r4)
            if (r4 != 0) goto L_0x05cb
            X.1Av r8 = X.1Au.A00(r12)
            X.0s0 r5 = r8.A4n
            r4 = 331(0x14b, float:4.64E-43)
            boolean r4 = X.AnonymousClass7TG.A1a(r8, r5, r9, r4)
            if (r4 != 0) goto L_0x05cb
            com.instagram.user.model.User r4 = X.AnonymousClass7TF.A0Q(r12)
            int r4 = r4.A07()
            if (r4 <= 0) goto L_0x05cb
            X.C52345GOp.A03(r11, r10, r12)
        L_0x05ca:
            return
        L_0x05cb:
            com.instagram.common.session.UserSession r8 = X.JTP.A0S(r0, r1)
            java.lang.Boolean r1 = X.AnonymousClass35I.A00(r8)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x05ca
            r4 = 2342172144707125074(0x2081112800153f52, double:4.073332003724812E-152)
            boolean r1 = X.182.A06(r2, r8, r4)
            if (r1 == 0) goto L_0x05ca
            X.0xx r2 = X.DbV.A0J(r0)
            X.MHO r1 = new X.MHO
            r1.<init>(r0, r7)
            X.1Eo.A03(r3, r6, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ClipsSharingDraftViewModel A01(K66 k66) {
        C61823KNm kNm = k66.A04;
        if (kNm != null) {
            return (ClipsSharingDraftViewModel) kNm.A0S.getValue();
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C62482KgX A02(K66 k66) {
        C61823KNm kNm = k66.A04;
        if (kNm != null) {
            return (C62482KgX) kNm.A0R.getValue();
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C66576MXh A03(K66 k66) {
        C61823KNm kNm = k66.A04;
        if (kNm != null) {
            return kNm.A02();
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final LFG A04(K66 k66) {
        C61823KNm kNm = k66.A04;
        if (kNm != null) {
            return (LFG) kNm.A0H.getValue();
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C60264JiL A05(K66 k66) {
        C61823KNm kNm = k66.A04;
        if (kNm != null) {
            return (C60264JiL) kNm.A0G.getValue();
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C61829KNs A06(K66 k66) {
        String str;
        C61823KNm kNm = k66.A04;
        if (kNm == null) {
            str = "dependencyProvider";
        } else {
            C61829KNs kNs = kNm.A04;
            if (kNs != null) {
                return kNs;
            }
            str = "clipsPublishScreenViewModel";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final String A07(K66 k66) {
        LBG lbg = k66.A06;
        if (lbg != null) {
            return AnonymousClass7TF.A0f(lbg.A0A);
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final String A08(K66 k66) {
        C61823KNm kNm = k66.A04;
        if (kNm != null) {
            return DbS.A0t(kNm.A0F);
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0114, code lost:
        if (X.JTQ.A0R(X.AnonymousClass7TE.A0l(r5), X.AnonymousClass0t1.A01) == X.AnonymousClass05K.A0C) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ca, code lost:
        if (r1 != false) goto L_0x01cc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(X.C293505kq r15, X.K66 r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r0 = r16
            X.3Q2 r12 = X.C61829KNs.A02(r0)
            r2 = 0
            if (r12 != 0) goto L_0x0011
            java.lang.String r1 = "ClipsPublishScreenFragment"
            java.lang.String r0 = "pending media is null in onMediaPostedSuccess"
            X.0kD.A07(r1, r0, r2)
            return
        L_0x0011:
            android.os.Bundle r4 = r0.mArguments
            r1 = 0
            if (r4 == 0) goto L_0x01bf
            r3 = 2156(0x86c, float:3.021E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            android.os.Parcelable r9 = r4.getParcelable(r3)
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r9 = (com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation) r9
            r3 = 2154(0x86a, float:3.018E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r4.getBoolean(r3)
            r3 = 2157(0x86d, float:3.023E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            android.os.Parcelable r10 = r4.getParcelable(r3)
            com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r10 = (com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig) r10
        L_0x0037:
            X.0eM r5 = r0.A0T
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            X.KkB r7 = X.C62649KkB.PUBLISH_SCREEN
            X.KNs r3 = A06(r0)
            X.KOn r3 = r3.A0i
            X.0Ud r3 = r3.A06
            java.lang.Object r3 = r3.getValue()
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r14 = r3.A00
            X.HPj r14 = (X.C54704HPj) r14
            X.KNs r3 = A06(r0)
            X.KOn r3 = r3.A0i
            X.Drk r3 = X.LSR.A04(r3)
            X.Ju9 r13 = r3.A01
            r11 = r15
            r15 = r18
            r16 = r19
            X.LPV.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.model.direct.camera.DirectCameraViewModel r3 = r0.A08
            if (r3 == 0) goto L_0x0099
            com.instagram.model.direct.DirectShareTarget r3 = r3.A03
            if (r3 == 0) goto L_0x0099
            android.content.Context r8 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r5)
            java.util.List r13 = X.AnonymousClass7TE.A1I(r3)
            X.C51973G9u.A1E(r8, r9, r10)
            r6 = 3
            X.AnonymousClass7TG.A1S(r13, r11)
            X.12T r4 = X.AnonymousClass12T.A00
            r3 = 653905865(0x26f9cfc9, float:1.7334166E-15)
            X.0nV r3 = r4.AOJ(r3, r6)
            X.19S r14 = X.19E.A02(r3)
            X.Luu r7 = new X.Luu
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r12.A0Y(r7)
        L_0x0099:
            android.content.Context r9 = r0.requireContext()
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            r3 = 1
            X.0qQ.A0B(r8, r3)
            java.util.List r4 = r12.A4J
            if (r4 == 0) goto L_0x00b3
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L_0x012c
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x012c
        L_0x00b3:
            java.util.List r4 = r12.A4b
            X.3WT r3 = X.AnonymousClass3WT.CLIPS_JOIN_CHAT
            X.3ui r3 = X.AnonymousClass497.A00(r3, r4)
            if (r3 == 0) goto L_0x00fe
            X.WaH r4 = r3.A0A()
            if (r4 == 0) goto L_0x00fe
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r5)
            X.6gx r9 = X.C313746gw.A00(r3)
            int r8 = r4.A00()
            java.lang.String r7 = r4.A02()
            X.UOB r3 = r4.A00
            java.lang.String r6 = r3.A0L
            X.1Ln r4 = X.DbT.A0J(r9)
            boolean r3 = X.DbT.A1Y(r4)
            if (r3 == 0) goto L_0x00fe
            X.DbW.A17(r4, r9)
            java.lang.String r3 = "publish_reel_with_broadcast_jcs"
            X.DbV.A1M(r4, r3)
            r3 = 281(0x119, float:3.94E-43)
            java.lang.String r3 = X.C66579MXk.A00(r3)
            r4.A0p(r3)
            java.lang.String r3 = "reel"
            java.lang.Long r3 = X.DbZ.A0b(r4, r3, r7, r6, r8)
            r4.A0i(r3)
            r4.Cgf()
        L_0x00fe:
            android.content.Intent r4 = X.DbS.A09()
            boolean r3 = A0R(r0)
            if (r3 != 0) goto L_0x0116
            X.0eE r6 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r5)
            java.lang.Integer r5 = X.JTQ.A0R(r3, r6)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            if (r5 != r3) goto L_0x0117
        L_0x0116:
            r1 = 1
        L_0x0117:
            r3 = 891(0x37b, float:1.249E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r4.putExtra(r3, r1)
            X.KNm r3 = r0.A04
            if (r3 != 0) goto L_0x01c3
            X.JTO.A1M()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x012c:
            java.util.Iterator r6 = r4.iterator()
        L_0x0130:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x00b3
            java.lang.Object r3 = r6.next()
            X.4aA r3 = (X.C266684aA) r3
            X.9JE r3 = r3.A05
            if (r3 == 0) goto L_0x0171
            java.lang.Object r4 = r3.A00
        L_0x0142:
            com.instagram.api.schemas.ACRType r3 = com.instagram.api.schemas.ACRType.CAMERA_ROLL
            if (r4 != r3) goto L_0x0130
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.List r3 = r12.A4J
            if (r3 == 0) goto L_0x0173
            java.util.Iterator r10 = r3.iterator()
        L_0x0152:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0173
            java.lang.Object r3 = r10.next()
            X.4aA r3 = (X.C266684aA) r3
            X.9JE r3 = r3.A05
            if (r3 == 0) goto L_0x0152
            java.lang.Object r3 = r3.A02
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0152
            long r3 = r3.longValue()
            int r6 = (int) r3
            X.AnonymousClass7TF.A1M(r7, r6)
            goto L_0x0152
        L_0x0171:
            r4 = 0
            goto L_0x0142
        L_0x0173:
            X.2jA r3 = new X.2jA
            r3.<init>()
            X.JY0 r10 = X.JTS.A0Q(r9, r8, r3)
            java.util.Set r4 = X.00k.A0k(r7)
            X.JY2 r3 = r10.A00
            X.0xa r9 = X.JTS.A0V(r3)
            java.util.LinkedHashSet r3 = X.DbS.A0y()
            java.lang.String r8 = "suggestions_media_hide_prefs_key"
            java.util.Set r3 = r9.getStringSet(r8, r3)
            if (r3 == 0) goto L_0x01ec
            java.util.Set r7 = X.00k.A0j(r3)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x019e:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x01b0
            int r3 = X.AnonymousClass7TG.A0F(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.add(r3)
            goto L_0x019e
        L_0x01b0:
            r7.addAll(r6)
            X.JTU.A1E(r9, r8, r7)
            X.JY3 r3 = r10.A01
            java.util.Map r3 = r3.A05
            r3.clear()
            goto L_0x00b3
        L_0x01bf:
            r9 = r2
            r10 = r2
            goto L_0x0037
        L_0x01c3:
            boolean r1 = r3.A0Y
            if (r1 != 0) goto L_0x01cc
            boolean r1 = r3.A0Z
            r3 = 0
            if (r1 == 0) goto L_0x01cd
        L_0x01cc:
            r3 = 1
        L_0x01cd:
            r1 = 2126(0x84e, float:2.979E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putExtra(r1, r3)
            X.0xx r1 = X.DbW.A0E(r0)
            r12 = 0
            X.MEk r6 = new X.MEk
            r10 = r17
            r7 = r0
            r8 = r11
            r9 = r4
            r11 = r2
            r13 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7TE.A1Z(r6, r1)
            return
        L_0x01ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.A0C(X.5kq, X.K66, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A0D(C293505kq r16, K66 k66, String str, String str2, boolean z) {
        String str3;
        AnonymousClass3Q2 r1;
        C62668KkU kkU;
        String str4;
        C61100JxB jxB;
        Integer num;
        K66 k662 = k66;
        AnonymousClass0eM r4 = k662.A0T;
        C293505kq r8 = r16;
        if (AnonymousClass2o3.A00(AnonymousClass7TE.A0l(r4)).A04(UserMonetizationProductType.INCENTIVE_PLATFORM)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("deal_id", r8.A0X);
            AnonymousClass3Q2 A022 = C61829KNs.A02(k662);
            if (A022 == null || (jxB = A022.A0v) == null || (num = jxB.A00) == null) {
                str4 = null;
            } else {
                str4 = num.toString();
            }
            A1E.put("scheduled_publish_time", str4);
            C63304Kun.A00(AnonymousClass7TE.A0l(r4)).A00(AnonymousClass05K.A0N, A06(k662).A0O.A02, (String) null, A1E.toString());
        }
        AnonymousClass3Q2 A023 = C61829KNs.A02(k662);
        if (A023 == null) {
            0kD.A07(__redex_internal_original_name, "pendingMedia is null in onShareButtonClicked", (Throwable) null);
            return;
        }
        boolean z2 = z;
        if (A023.A0q != null) {
            C61823KNm kNm = k662.A04;
            if (kNm == null) {
                str3 = "dependencyProvider";
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            C17990VjS vjS = (C17990VjS) kNm.A0T.getValue();
            if (vjS != null) {
                if (z) {
                    kkU = C62668KkU.FEED;
                } else {
                    kkU = C62668KkU.CLIPS;
                }
                vjS.A00(kkU, (1Xj) null);
            }
        }
        if (A023.A0v != null) {
            28D r0 = JTP.A0X(k662).A04.A09;
            0qQ.A07(r0);
            new LPH(C63094KrN.A00(r0), k662.A0N, AnonymousClass7TE.A0l(r4)).A05(AnonymousClass05K.A01);
        }
        C61848KOn kOn = A06(k662).A0i;
        C61829KNs A062 = A06(k662);
        kOn.A0D(A062.A0B.A06(PublishScreenCategoryType.MAIN, A062.A01));
        String str5 = r8.A0g;
        if (str5 != null && !str5.equals(k662.getString(2131955706))) {
            A023.A1V.A02 = str5;
        }
        if (A023.A0i == 28D.A37) {
            A023.A0K = 108;
        }
        Activity rootActivity = k662.getRootActivity();
        if (rootActivity != null) {
            if (k662.A0A == null) {
                k662.A0A = DbV.A0h(rootActivity);
            }
            str3 = "clipsShareSheetViewModel";
            String str6 = str;
            String str7 = str2;
            if (A04(k662) != null) {
                C60228Jhl jhl = k662.A07;
                if (jhl != null) {
                    LRt.A02((MediaCroppingCoordinates) jhl.A01.A00("PROFILE_CROP_COORDINATES_KEY"), r8, A023, z2, false);
                    LRt.A03(AnonymousClass7TE.A0l(r4), r8, A023, str6);
                    LFG A042 = A04(k662);
                    if (!(A042 == null || (r1 = A042.A00) == null)) {
                        r1.A2Z = str6;
                        r1.A5P = z2;
                        r1.A5g = false;
                        r1.A5S = false;
                        A042.A00();
                        AnonymousClass3Q2 A012 = AnonymousClass8YL.A01(A042.A02, r1);
                        if (A012.A1G == 1iA.A0A) {
                            A042.A03.A0D(A012);
                        }
                        A042.A03.A0B(A012);
                    }
                    1Av A002 = 1Au.A00(AnonymousClass7TE.A0l(r4));
                    if (AnonymousClass7TG.A1a(A002, A002.A0F, 1Av.A8a, 131)) {
                        A0H(k662);
                    }
                    A0C(r8, k662, str6, str7, z2);
                    return;
                }
            } else {
                String A0Z2 = JTQ.A0Z();
                0qQ.A0B(A0Z2, 0);
                A023.A3t = A0Z2;
                A023.A0d(AnonymousClass3QD.NOT_UPLOADED);
                UserSession A0l = AnonymousClass7TE.A0l(r4);
                C60228Jhl jhl2 = k662.A07;
                if (jhl2 != null) {
                    LRt.A01(rootActivity, (MediaCroppingCoordinates) jhl2.A01.A00("PROFILE_CROP_COORDINATES_KEY"), A0l, r8, new C65117Lnf(r16, k66, str, str2, z), k662, A023, str6, z2, false);
                    return;
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0E(K66 k66) {
        C64146LQj lQj;
        K66 k662 = k66;
        if (k662.getContext() != null) {
            String str = "viewHolder";
            if (k662.A03 == null) {
                Context requireContext = k662.requireContext();
                UserSession A0l = AnonymousClass7TE.A0l(k662.A0T);
                LBG lbg = k662.A06;
                if (lbg != null) {
                    k662.A03 = new C64146LQj(requireContext, A0l, lbg.A07, C66303MMm.A01(k662, 33), C66303MMm.A01(k662, 34), C66303MMm.A01(k662, 35));
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C60089JfV jfV = k662.A05;
            if (jfV == null) {
                str = "clipsPublishScreenCaptionSuggestionViewModel";
            } else {
                0eP r4 = (0eP) jfV.A01.getValue();
                if (r4 != null) {
                    if (0qQ.A0K(r4.A00, A08(k662))) {
                        Object obj = r4.A01;
                        if (!((Collection) obj).isEmpty()) {
                            String str2 = (String) 00k.A0J((List) obj);
                            if (str2 != null && (lQj = k662.A03) != null) {
                                C63628L0q l0q = new C63628L0q(k662);
                                LBG lbg2 = k662.A06;
                                if (lbg2 != null) {
                                    ArrayList A002 = C253063q9.A00(AnonymousClass7TF.A0f(lbg2.A0A));
                                    if (!lQj.A02) {
                                        List list = lQj.A01;
                                        if (list == null || list.isEmpty()) {
                                            1vn r2 = lQj.A05;
                                            2IS A042 = C41845B3m.A04();
                                            2IS A043 = C41845B3m.A04();
                                            A042.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, lQj.A03.A06);
                                            A042.A04("personalizedHashtagSurface", "clips_creation_composer");
                                            A042.A04("personalizedHashtagType", "recommended");
                                            r2.A06(new PandoGraphQLRequest(DbU.A0J(A042, "opaque_token", str2), "IGContentBasedHashtagSuggestionsQuery", A042.getParamsCopy(), A043.getParamsCopy(), BoQ.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_users__info", AnonymousClass7TE.A1C()), new KAR(3, A002, l0q, lQj));
                                            return;
                                        }
                                        C64146LQj.A01(lQj, l0q, A002);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    C64146LQj lQj2 = k662.A03;
                    if (lQj2 != null && lQj2.A02) {
                        A0I(k662);
                        return;
                    }
                    return;
                }
                C64146LQj lQj3 = k662.A03;
                if (lQj3 != null && !lQj3.A02) {
                    L97 l97 = lQj3.A04;
                    DbS.A1T(l97.A04);
                    l97.A02.setVisibility(0);
                    lQj3.A02 = true;
                    return;
                }
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0H(K66 k66) {
        int A082;
        C366688pV r0;
        AnonymousClass8PW r02;
        LinkedHashMap linkedHashMap;
        MusicAssetModel musicAssetModel;
        K66 k662 = k66;
        AnonymousClass3Q2 A022 = C61829KNs.A02(k662);
        if (A022 != null) {
            Context requireContext = k662.requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(k662.A0T);
            C293505kq A002 = ClipsSharingDraftViewModel.A00(k662);
            0qQ.A0B(A0l, 1);
            AnonymousClass3Q2 A003 = AnonymousClass9T3.A00(A022, "pending_media_save_copy");
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            AnonymousClass3QS r13 = A022.A1V;
            0qQ.A0B(r13, 0);
            boolean z = true;
            A022.A1V.A00(AnonymousClass51J.VOICEOVER);
            AudioOverlayTrack audioOverlayTrack = A002.A0N;
            if (audioOverlayTrack != null) {
                int i = audioOverlayTrack.A02;
                int i2 = 30000;
                if (182.A06(0Tu.A05, A0l, 36317972872369875L)) {
                    i2 = 60000;
                }
                if (i <= i2) {
                    z = false;
                }
            }
            MusicOverlayStickerModel A052 = C271404in.A05(A022.A4b);
            int A092 = 0nA.A09(requireContext);
            if (!0qQ.A0K(A022.A1N, C376399Hv.A00())) {
                A082 = (int) (((float) A092) / A022.A1N.A00);
            } else {
                A082 = 0nA.A08(requireContext);
            }
            int A072 = JTT.A07(A0l, A022);
            String username = AnonymousClass7TF.A0Q(A0l).getUsername();
            if (!0mp.A0B(username)) {
                if (A052 == null || !AnonymousClass7TF.A1Y(A052.A0E, false)) {
                    musicAssetModel = null;
                } else {
                    musicAssetModel = MusicAssetModel.A03(A052);
                }
                JTT.A11(C39604A1u.A00(requireContext, musicAssetModel, username, A092, A082, A072, z, false), A1H);
            }
            C370018vh r03 = A002.A0C;
            if (!(r03 == null || (r0 = r03.A01) == null || (r02 = r0.A05) == null || (linkedHashMap = r02.A09) == null)) {
                A1H.putAll(linkedHashMap);
            }
            if (z) {
                A003.A1V = new AnonymousClass3QS(0.0f, 31);
            }
            boolean A062 = 182.A06(0Tu.A05, A0l, 36319132513278902L);
            LBC lbc = new LBC(requireContext, A0l, (1GK) null, (TransformMatrixConfig) null, (AnonymousClass51W) null, r13, A003, A1H, z, false, true);
            if (A062) {
                LS1.A01(lbc, (MV5) null);
            } else {
                1ES.A03(LS1.A00(lbc, (MV5) null));
            }
        }
    }

    public static final void A0J(K66 k66) {
        DbT.A1Q(0wj.A01, "clips_draft_null_showing_error_dialog", 817899173);
        C358248ab A0U2 = DbW.A0U(k66);
        A0U2.A08(2131974097);
        A0U2.A0E(LV3.A00(k66, 61));
        A0U2.A0r(false);
        DbT.A1V(A0U2);
    }

    public static final void A0K(K66 k66, C61149Jy0 jy0) {
        Integer num = jy0.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                C367288qV.A01.A0C(AnonymousClass7TE.A0l(k66.A0T), "reels", true, true);
            } else if (intValue == 1) {
                C367288qV r3 = C367288qV.A01;
                AnonymousClass0eM r2 = k66.A0T;
                r3.A0C(AnonymousClass7TE.A0l(r2), "reels", false, true);
                C367288qV.A02(AnonymousClass7TE.A0l(r2), true);
            } else if (intValue == 2) {
                C367288qV.A01.A0C(AnonymousClass7TE.A0l(k66.A0T), "reels", false, true);
            }
        }
    }

    public static final void A0L(K66 k66, String str) {
        String str2;
        C279584ys r1;
        28D r6;
        String str3;
        AnonymousClass8JI r10;
        K66 k662 = k66;
        if (!ClipsSharingDraftViewModel.A02(k662)) {
            A0J(k662);
            return;
        }
        C293505kq A002 = ClipsSharingDraftViewModel.A00(k662);
        29L r2 = JTP.A0X(k662).A0J;
        List list = A002.A0v;
        r2.A06(A002.A0H, str, list.size());
        AnonymousClass0eM r22 = k662.A0T;
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(AnonymousClass7TE.A0l(r22));
        int size = list.size();
        boolean z = true;
        boolean A1V = AnonymousClass7TF.A1V(A002.A0N);
        AnonymousClass9P8 r62 = A002.A0E;
        if (r62 == null) {
            z = false;
        }
        AE4 A013 = A012.A0J.A01("drafts", 838605197);
        A013.A05(AnonymousClass000.A00(3681), size);
        String A003 = Pxd.A00(752);
        Map map = A013.A04;
        map.put(A003, String.valueOf(A1V));
        map.put("is_remix", String.valueOf(z));
        A012.A02 = A013.A01();
        if (r62 == null) {
            k662.A0S();
            str2 = A002.A0V;
        } else {
            str2 = null;
        }
        int[] iArr = null;
        if (ClipsSharingDraftViewModel.A02(k662)) {
            r1 = ClipsSharingDraftViewModel.A00(k662).A08;
        } else {
            r1 = null;
        }
        if (!ClipsSharingDraftViewModel.A02(k662)) {
            r6 = 28D.A0z;
        } else if (r1 != null) {
            r6 = 28D.A10;
        } else {
            String str4 = ClipsSharingDraftViewModel.A00(k662).A0W;
            if (str4 != null) {
                28D valueOf = 28D.valueOf(str4);
                if (C367268qT.A00(valueOf) || valueOf == 28D.A2d) {
                    String str5 = ClipsSharingDraftViewModel.A00(k662).A0W;
                    if (str5 == null || (r6 = 28D.valueOf(str5)) == null) {
                        r6 = 28D.A0z;
                    }
                }
            }
            r6 = 28D.A0z;
        }
        k662.A0S();
        Set set = null;
        C279584ys r8 = null;
        if (LKV.A01(r6)) {
            set = 0sc.A06(new C279284yO[]{C3494080g.A00});
        }
        AnonymousClass9P8 r0 = ClipsSharingDraftViewModel.A00(k662).A0E;
        if (r0 != null) {
            str3 = r0.A09;
        } else {
            str3 = null;
        }
        AnonymousClass9P8 r02 = ClipsSharingDraftViewModel.A00(k662).A0E;
        if (r02 != null) {
            r10 = r02.A06;
        } else {
            r10 = null;
        }
        String str6 = ClipsSharingDraftViewModel.A00(k662).A0T;
        PendingRecipient pendingRecipient = A06(k662).A0j;
        C2801950r r9 = ClipsSharingDraftViewModel.A00(k662).A0H;
        0qQ.A0B(r9, 0);
        if (r1 != null) {
            r8 = r1;
            C279584ys r03 = ClipsSharingDraftViewModel.A00(k662).A08;
            if (r03 != null) {
                str3 = Long.valueOf(r03.A00).toString();
            } else {
                str3 = null;
            }
        }
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(k662.requireActivity(), AEX.A02(r6, (AnonymousClass8ZN) null, r8, r9, r10, (MusicAttributionConfig) null, pendingRecipient, str6, str2, (String) null, (String) null, (String) null, str3, (String) null, (String) null, set, true, false), AnonymousClass7TE.A0l(r22), ModalActivity.class, "clips_camera");
        UserSession A0l = AnonymousClass7TE.A0l(r22);
        if (182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36321550580327946L)) {
            iArr = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
        }
        A022.A0J = iArr;
        A022.A0D(k662, 9686);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, java.lang.Object, X.K66] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0156, code lost:
        if (X.1KU.A0C(X.AnonymousClass7TE.A0l(r4)) == false) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0M(X.K66 r17, java.lang.String r18) {
        /*
            r15 = r17
            X.3Q2 r6 = X.C61829KNs.A02(r15)
            if (r6 == 0) goto L_0x016e
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A02(r15)
            if (r0 == 0) goto L_0x016e
            X.KNs r0 = A06(r15)
            X.KOn r3 = r0.A0i
            X.KNs r0 = A06(r15)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r2 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MAIN
            X.KNn r1 = r0.A0B
            X.JwD r0 = r0.A01
            java.util.ArrayList r0 = r1.A06(r2, r0)
            r3.A0D(r0)
            X.KNs r0 = A06(r15)
            X.KOa r1 = r0.A0I
            java.lang.String r0 = A07(r15)
            r1.A0A(r0)
            X.27r r7 = X.JTP.A0X(r15)
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r15)
            java.lang.String r10 = r0.A0T
            X.JVj r9 = X.C59725JVj.SHARE_SHEET
            r12 = 0
            X.8xY r8 = X.C371088xY.SHARE_SHEET
            X.KNm r0 = r15.A04
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "dependencyProvider"
        L_0x0047:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004f:
            X.0eM r0 = r0.A0U
            java.lang.Object r0 = r0.getValue()
            X.GhF r0 = (X.C53024GhF) r0
            X.05G r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.GSY r0 = (X.GSY) r0
            java.lang.Object r0 = r0.A01
            r5 = 0
            boolean r14 = X.AnonymousClass7TF.A1V(r0)
            r3 = 1
            r11 = r18
            r13 = r12
            r7.A1D(r8, r9, r10, r11, r12, r13, r14)
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r15)
            X.JwI r0 = r0.A02
            if (r0 == 0) goto L_0x0090
            X.0eM r0 = r15.A0T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0iw r1 = r15.A0N
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r15)
            java.lang.String r0 = r0.A0T
            X.LSk r4 = X.LK1.A01(r1, r2, r0)
            java.lang.String r2 = "user"
            java.lang.String r1 = "share_sheet"
            java.lang.String r0 = "tap_save_as_draft"
            X.LSk.A03(r4, r2, r1, r0)
        L_0x0090:
            X.0eM r4 = r15.A0T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.8A2 r0 = X.AnonymousClass8A1.A01(r0)
            r0.A0P(r3, r5)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.AYm r1 = X.C394779yg.A00(r0)
            X.9s5 r0 = X.C390939s5.SAVED_DRAFT
            r1.A01(r0)
            X.LFG r0 = A04(r15)
            if (r0 == 0) goto L_0x00b3
            r0.A01(r3)
        L_0x00b3:
            X.5kq r9 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r15)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            X.Jhl r0 = r15.A07
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "clipsShareSheetViewModel"
            goto L_0x0047
        L_0x00c2:
            X.6rJ r1 = r0.A01
            java.lang.String r0 = "PROFILE_CROP_COORDINATES_KEY"
            java.lang.Object r2 = r1.A00(r0)
            X.0qQ.A0B(r6, r5)
            X.0qQ.A0B(r7, r3)
            X.9Ua r10 = X.AnonymousClass9T6.A00(r7)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Set r3 = r10.A01
            r1.addAll(r3)
            X.JXe r5 = new X.JXe
            r5.<init>()
            X.JXu r0 = X.JXu.A03
            r5.A05(r0)
            X.JXc r0 = X.C59764JXc.A00(r2)
            r5.A0D = r0
            X.JXc r0 = X.C59764JXc.A00(r1)
            r5.A0m = r0
            long r0 = r9.A01
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00ff
            long r0 = java.lang.System.currentTimeMillis()
        L_0x00ff:
            r5.A03(r0)
            boolean r0 = r10.A00
            if (r0 != 0) goto L_0x0109
            r3.clear()
        L_0x0109:
            X.9P8 r3 = r9.A0E
            if (r3 == 0) goto L_0x013b
            java.util.List r0 = r6.A4a
            if (r0 == 0) goto L_0x016b
            java.util.Iterator r2 = r0.iterator()
        L_0x0115:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r1 = r2.next()
            X.5Eo r1 = (X.C282745Eo) r1
            X.513 r0 = r1.A04
            if (r0 == 0) goto L_0x0115
            X.50v r0 = r0.A00()
            if (r0 == 0) goto L_0x0115
            boolean r0 = r0 instanceof X.C40607Aev
            if (r0 == 0) goto L_0x0115
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
        L_0x0133:
            r3.A01 = r0
            X.JXc r0 = X.C59764JXc.A00(r3)
            r5.A0j = r0
        L_0x013b:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = A01(r15)
            r0.A06(r5)
            X.5kq r14 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r15)
            boolean r0 = A0R(r15)
            if (r0 != 0) goto L_0x0158
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.1KU.A0C(r0)
            r18 = 1
            if (r0 != 0) goto L_0x015a
        L_0x0158:
            r18 = 0
        L_0x015a:
            X.0xx r0 = X.DbW.A0E(r15)
            r17 = 8
            X.JTe r13 = new X.JTe
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass7TE.A1Z(r13, r0)
            return
        L_0x016b:
            X.0sn r0 = X.0sn.A00
            goto L_0x0133
        L_0x016e:
            A0J(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.A0M(X.K66, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.TgR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: X.LoX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.LoX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: X.LoX} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023c, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0268, code lost:
        if (r0.A08.A01() != false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0282, code lost:
        if (r1 == null) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0291, code lost:
        if (r9.A1i.A01 == 0) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x029e, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36329646593294574L) == false) goto L_0x023d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0N(X.K66 r19, java.lang.String r20, java.lang.String r21) {
        /*
            r2 = r19
            X.0eM r3 = r2.A0T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            r4 = r20
            X.3Q2 r5 = X.JTQ.A0M(r0, r4)
            r13 = 0
            if (r5 != 0) goto L_0x002c
            android.content.Context r3 = r2.getContext()
            r1 = 2131963032(0x7f132c98, float:1.9562806E38)
            java.lang.String r0 = "pending_media_is_null"
            X.C59689JTv.A01(r3, r0, r1, r13)
            java.lang.String r1 = "ClipsPublishScreenFragment"
            java.lang.String r0 = "onNewPendingMedia: PendingMedia not found for draft PendingMedia key: "
            java.lang.String r0 = X.002.A0R(r0, r4)
            X.0wb.A03(r1, r0)
            X.DbX.A1I(r2)
            return
        L_0x002c:
            X.KNs r4 = A06(r2)
            r4.A02 = r5
            X.KOi r0 = r4.A0V
            r0.A01 = r5
            X.KOZ r0 = r4.A0O
            r0.A01 = r5
            X.KOU r0 = r4.A0H
            r0.A00 = r5
            X.KNn r1 = r4.A0B
            X.8J0 r0 = r5.A12
            r1.A00 = r0
            X.KOn r0 = r4.A0i
            r0.A00 = r5
            X.C61848KOn.A00(r0)
            X.KOM r0 = r4.A0Q
            r0.A00 = r5
            X.KOK r0 = r4.A0X
            r0.A00 = r5
            X.KOQ r0 = r4.A0D
            r0.A00 = r5
            X.05G r7 = r0.A05
            r7.getValue()
            X.3Q2 r0 = r0.A00
            boolean r6 = X.AnonymousClass7TF.A1V(r0)
            r1 = 5
            X.JTb r0 = new X.JTb
            r0.<init>(r6, r1)
            r7.Epw(r0)
            X.KOm r7 = r4.A0Y
            r7.A00 = r5
            X.JxB r1 = r5.A0v
            r0 = 0
            if (r1 == 0) goto L_0x009b
            java.lang.Integer r6 = r1.A00
            if (r6 == 0) goto L_0x009b
            int r1 = r6.intValue()
            if (r1 <= 0) goto L_0x009b
            X.JwD r1 = r7.A06()
            X.JxB r1 = r1.A08
            if (r1 == 0) goto L_0x0088
            java.lang.Integer r0 = r1.A00
        L_0x0088:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x009b
            X.JwD r1 = r7.A06()
            X.JxB r0 = r5.A0v
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, r0, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r1, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -134217729, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r7.A09(r0)
        L_0x009b:
            X.KOl r1 = r4.A0E
            r1.A00 = r5
            X.3QO r0 = X.C61075JwD.A0M(r1)
            X.C61846KOl.A01(r1, r0, r5)
            X.KOh r8 = r4.A0b
            r8.A00 = r5
            java.util.List r0 = r5.A4o
            if (r0 == 0) goto L_0x00ca
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x00b6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r1.next()
            X.5JJ r0 = (X.AnonymousClass5JJ) r0
            X.3ik r0 = r0.A02
            if (r0 == 0) goto L_0x00b6
            r9.add(r0)
            goto L_0x00b6
        L_0x00ca:
            X.0sn r9 = X.0sn.A00
        L_0x00cc:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x02c1
            X.05G r6 = r8.A05
        L_0x00d4:
            java.lang.Object r1 = r6.getValue()
            r0 = r1
            X.KO6 r0 = (X.KO6) r0
            java.lang.String r8 = r0.A01
            java.util.List r9 = r0.A02
            boolean r11 = r0.A03
            int r10 = r0.A00
            boolean r12 = r0.A04
            X.KO6 r7 = new X.KO6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            boolean r0 = r6.AIY(r1, r7)
            if (r0 == 0) goto L_0x00d4
        L_0x00f0:
            X.KOV r0 = r4.A0e
            r0.A00 = r5
            X.05G r6 = r0.A02
            r6.getValue()
            boolean r5 = r5.A6E
            X.3Q2 r4 = r0.A00
            if (r4 != 0) goto L_0x02a8
            r0 = 0
        L_0x0100:
            r1 = 10
            X.C61042Jvg.A00(r6, r1, r5, r0)
            X.3Q2 r1 = X.C61829KNs.A02(r2)
            if (r1 == 0) goto L_0x0111
            java.lang.String r0 = A08(r2)
            r1.A2g = r0
        L_0x0111:
            X.3Q2 r1 = X.C61829KNs.A02(r2)
            if (r1 == 0) goto L_0x0129
            boolean r0 = A0R(r2)
            java.lang.Integer r0 = X.JTP.A0j(r0)
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x02a4
            java.lang.String r0 = "clips"
        L_0x0127:
            r1.A2b = r0
        L_0x0129:
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A02(r2)
            r6 = 0
            if (r0 == 0) goto L_0x014a
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r2)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = r0.A0B
            if (r0 == 0) goto L_0x014a
            X.3Q2 r1 = X.C61829KNs.A02(r2)
            if (r1 == 0) goto L_0x014a
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r2)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = r0.A0B
            if (r0 == 0) goto L_0x02a1
            java.lang.String r0 = r0.A0M
        L_0x0148:
            r1.A3i = r0
        L_0x014a:
            X.3Q2 r0 = X.C61829KNs.A02(r2)
            r7 = 1
            if (r0 == 0) goto L_0x015d
            boolean r0 = r0.A5F
            if (r0 != r7) goto L_0x015d
            X.3Q2 r0 = X.C61829KNs.A02(r2)
            if (r0 == 0) goto L_0x015d
            r0.A5F = r13
        L_0x015d:
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L_0x0164
            r2.A09()
        L_0x0164:
            java.util.ArrayList r0 = r2.A0K
            if (r0 == 0) goto L_0x0178
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0178
            X.3Q2 r1 = X.C61829KNs.A02(r2)
            if (r1 == 0) goto L_0x0178
            java.util.ArrayList r0 = r2.A0K
            r1.A47 = r0
        L_0x0178:
            java.lang.String r1 = r2.A0J
            if (r1 == 0) goto L_0x0184
            X.3Q2 r0 = X.C61829KNs.A02(r2)
            if (r0 == 0) goto L_0x0184
            r0.A3g = r1
        L_0x0184:
            X.3Q2 r9 = X.C61829KNs.A02(r2)
            if (r9 == 0) goto L_0x01ec
            X.KNs r0 = A06(r2)
            X.KOo r5 = r0.A0L
            X.M3g r8 = new X.M3g
            r8.<init>(r2)
            X.LBG r0 = r2.A06
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "viewHolder"
        L_0x019b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01a3:
            X.I22 r4 = r0.A09
            android.content.res.Resources r1 = X.DbV.A05(r2)
            r0 = 2131165323(0x7f07008b, float:1.794486E38)
            int r11 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.DbV.A05(r2)
            r0 = 2131165335(0x7f070097, float:1.7944884E38)
            int r12 = r1.getDimensionPixelSize(r0)
            r10 = r21
            X.0qQ.A0B(r10, r7)
            java.lang.String r7 = r9.A33
            r1 = r7
            if (r7 != 0) goto L_0x01c7
            java.lang.String r1 = ""
        L_0x01c7:
            r5.A01 = r9
            r5.A02 = r8
            if (r7 == 0) goto L_0x0213
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0213
            boolean r0 = X.JTQ.A1Z(r7)
            if (r0 == 0) goto L_0x0213
            X.C61849KOo.A01(r5, r1)
        L_0x01dc:
            X.C61849KOo.A00(r5, r4, r9)
            X.KNs r0 = A06(r2)
            X.KOp r1 = r0.A0S
            java.lang.String r0 = r2.getModuleName()
            r1.A0A(r9, r0)
        L_0x01ec:
            A0G(r2)
            X.JXe r4 = new X.JXe
            r4.<init>()
            X.3Q2 r0 = X.C61829KNs.A02(r2)
            if (r0 == 0) goto L_0x020c
            com.instagram.user.model.UpcomingEventImpl r1 = r0.A1p
            if (r1 == 0) goto L_0x020c
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r2)
            com.instagram.user.model.UpcomingEventImpl r0 = r0.A0Q
            if (r0 != 0) goto L_0x020c
            X.JXc r0 = X.C59764JXc.A00(r1)
            r4.A0s = r0
        L_0x020c:
            X.KNm r0 = r2.A04
            if (r0 != 0) goto L_0x02fd
            java.lang.String r0 = "dependencyProvider"
            goto L_0x019b
        L_0x0213:
            com.instagram.common.session.UserSession r7 = r5.A03
            X.8J0 r0 = r9.A12
            if (r0 == 0) goto L_0x021b
            X.8JI r6 = r0.A03
        L_0x021b:
            X.8JI r0 = X.AnonymousClass8JI.REMIX
            r8 = 0
            if (r6 == r0) goto L_0x023d
            java.util.List r0 = r9.A4a
            if (r0 == 0) goto L_0x025d
            java.util.Iterator r1 = r0.iterator()
        L_0x0228:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x025d
            java.lang.Object r0 = r1.next()
            X.5Eo r0 = (X.C282745Eo) r0
            X.A5d r0 = r0.A02
            if (r0 == 0) goto L_0x023c
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0228
        L_0x023c:
            r8 = 1
        L_0x023d:
            X.LO3 r7 = r5.A05
            if (r8 == 0) goto L_0x0259
            r15 = 1
            X.LoX r8 = new X.LoX
            r16 = r8
            r17 = r5
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x0253:
            r13 = 0
            r7.A01(r8, r9, r10, r11, r12, r13, r15)
            goto L_0x01dc
        L_0x0259:
            r15 = 0
            X.TgR r8 = r5.A04
            goto L_0x0253
        L_0x025d:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r9.A16
            if (r0 == 0) goto L_0x026a
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A08
            boolean r0 = r0.A01()
            r6 = 1
            if (r0 == 0) goto L_0x026b
        L_0x026a:
            r6 = 0
        L_0x026b:
            X.51W r0 = r9.A1P
            if (r0 == 0) goto L_0x0284
            java.util.List r0 = r0.A01()
            if (r0 == 0) goto L_0x0284
            java.lang.Object r0 = X.00k.A0O(r0, r13)
            X.51N r0 = (X.AnonymousClass51N) r0
            if (r0 == 0) goto L_0x0284
            X.9Hy r1 = r0.A04()
            r0 = 1
            if (r1 != 0) goto L_0x0285
        L_0x0284:
            r0 = 0
        L_0x0285:
            if (r6 != 0) goto L_0x0293
            if (r0 != 0) goto L_0x0293
            com.instagram.camera.effect.models.CameraAREffect r0 = r9.A10
            if (r0 != 0) goto L_0x0293
            X.3QG r0 = r9.A1i
            int r0 = r0.A01
            if (r0 == r13) goto L_0x023d
        L_0x0293:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36329646593294574(0x81119f000240ee, double:3.038353021119893E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x023d
            goto L_0x023c
        L_0x02a1:
            r0 = r6
            goto L_0x0148
        L_0x02a4:
            java.lang.String r0 = "feed"
            goto L_0x0127
        L_0x02a8:
            r1 = 46
            X.Ivi r0 = new X.Ivi
            r0.<init>(r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            goto L_0x0100
        L_0x02c1:
            com.instagram.common.session.UserSession r7 = r8.A03
            X.0Tu r6 = X.0Tu.A05
            r0 = 36326996598470769(0x810f3600023871, double:3.036677153722646E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x00f0
            X.Lj0 r1 = r8.A02
            android.content.Context r0 = r8.A01
            r20 = 1
            r1.A00(r0, r5)
            X.05G r8 = r8.A05
            java.lang.Object r0 = r8.getValue()
            X.KO6 r0 = (X.KO6) r0
            int r17 = X.JTT.A07(r7, r5)
            java.lang.String r7 = r0.A01
            boolean r6 = r0.A03
            boolean r1 = r0.A04
            X.KO6 r0 = new X.KO6
            r14 = r0
            r15 = r7
            r16 = r9
            r18 = r6
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r8.Epw(r0)
            goto L_0x00f0
        L_0x02fd:
            boolean r0 = r0.A0a
            if (r0 == 0) goto L_0x0309
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            X.JXc r0 = X.C59764JXc.A00(r0)
            r4.A00 = r0
        L_0x0309:
            X.KNs r0 = A06(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = r0.A0j
            if (r1 != 0) goto L_0x0322
            android.os.Parcelable$Creator r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r1.<init>((com.instagram.user.model.User) r0)
        L_0x0322:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            X.JXc r0 = X.C59764JXc.A00(r0)
            r4.A0o = r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = A01(r2)
            r0.A06(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.A0N(X.K66, java.lang.String, java.lang.String):void");
    }

    public static final void A0O(K66 k66, String str, String str2, String str3, List list, boolean z) {
        C46401DeO deO;
        AnonymousClass818 r1;
        String str4;
        String str5;
        String str6;
        K66 k662 = k66;
        AnonymousClass3Q2 A022 = C61829KNs.A02(k662);
        if (A022 != null && k662.getContext() != null && ClipsSharingDraftViewModel.A02(k662)) {
            C293505kq A002 = ClipsSharingDraftViewModel.A00(k662);
            List list2 = A002.A0r;
            boolean z2 = false;
            if (list2 != null && AnonymousClass7TE.A1b(list2)) {
                C379469Ua A003 = AnonymousClass9T6.A00(AnonymousClass7TE.A0l(k662.A0T));
                A003.A01.addAll(list2);
                A003.A00 = true;
            }
            AnonymousClass0eM r6 = k662.A0T;
            UserSession A0l = AnonymousClass7TE.A0l(r6);
            C61823KNm kNm = k662.A04;
            if (kNm == null) {
                str5 = "dependencyProvider";
            } else {
                ClipsFanClubMetadata A004 = C48792EkF.A00(A0l, A022, kNm.A0Y, kNm.A0Z);
                if (A004 != null) {
                    deO = A004.A00;
                } else {
                    deO = null;
                }
                if (deO == C46401DeO.WELCOME) {
                    C293505kq A005 = ClipsSharingDraftViewModel.A00(k662);
                    if (!(A022.A1V.A00(AnonymousClass51J.AUDIO_TRACK) == null && A005.A0N == null)) {
                        UserSession A0l2 = AnonymousClass7TE.A0l(r6);
                        C66303MMm A012 = C66303MMm.A01(k662, 36);
                        0qQ.A0B(A0l2, 1);
                        C358248ab A0U2 = DbW.A0U(k662);
                        A0U2.A09(2131961835);
                        String A0m = DbU.A0m(k662, 2131976290);
                        A0U2.A0Z(new C50025FJk(13, (Object) k662, (Object) A0l2), DbU.A0m(k662, 2131961833), A0m);
                        A0U2.A0I(LV0.A00(k662, A012, 35), 2131961834);
                        A0U2.A0s(false);
                        DbT.A1V(A0U2);
                        C273004lm A006 = C272994ll.A00(A0l2);
                        long A072 = DbZ.A07(A0l2.A06);
                        0Aj A0e2 = AnonymousClass7TE.A0e(A006.A00, "ig_fan_club_exclusive_reel_music_attempted");
                        A0e2.A9F("creator_igid", Long.valueOf(A072));
                        DbS.A1O(A0e2, "reels_viewer");
                        A0e2.Cgf();
                        return;
                    }
                }
                1Av A007 = 1Au.A00(AnonymousClass7TE.A0l(r6));
                if (A022.A1F == AnonymousClass3QO.FAN_CLUB) {
                    z2 = true;
                }
                boolean A1Y = C51970G9q.A1Y(A007);
                String str7 = str;
                String str8 = str3;
                boolean z3 = z;
                if (list == null || list.isEmpty() || A007.A01.getInt("clips_funded_content_confirmation_dialog_view_count", A1Y ? 1 : 0) >= 3 || z2 || !((str6 = A002.A0X) == null || str6.length() == 0)) {
                    if (A022.A12 == null && !A022.A5i) {
                        AnonymousClass847 r9 = k662.A00;
                        if (r9 == null) {
                            str5 = "brandedContentTaggingUpsellController";
                        } else {
                            UserSession A0l3 = AnonymousClass7TE.A0l(r6);
                            Context requireContext = k662.requireContext();
                            if (str == null) {
                                str4 = "";
                            } else {
                                str4 = str7;
                            }
                            List list3 = A022.A4C;
                            if (list3 == null) {
                                list3 = AnonymousClass7TE.A1C();
                            }
                            if (r9.A04(requireContext, new LV1(str7, (Object) k662, 7), new LUY(A002, k662, str7, str3, 1, z), A0l3, str4, "reel", list3)) {
                                return;
                            }
                        }
                    }
                    C65645LxM lxM = new C65645LxM(A002, k662, str7, str8, z3);
                    if (A0R(k662)) {
                        r1 = AnonymousClass818.IG_REELS_PANAVISION_COMPOSER_SHARE_BUTTON;
                    } else {
                        r1 = AnonymousClass818.IG_REELS_COMPOSER_SHARE_BUTTON;
                    }
                    if (!k662.A0Q(r1, lxM)) {
                        C394779yg.A00(AnonymousClass7TE.A0l(r6)).A00(k662.requireActivity(), AnonymousClass7TE.A0l(r6), AnonymousClass05K.A0C);
                        A0D(A002, k662, str7, str8, z3);
                        return;
                    }
                    return;
                }
                Context requireContext2 = k662.requireContext();
                1Av A008 = 1Au.A00(AnonymousClass7TE.A0l(r6));
                LV1 lv1 = new LV1(str2, (Object) k662, 6);
                String str9 = str7;
                K66 k663 = k662;
                C293505kq r13 = A002;
                LUY luy = new LUY(r13, k663, str9, str8, A1Y ? 1 : 0, z3);
                0qQ.A0B(A008, 1);
                JTS.A1S(A008.A01, "clips_funded_content_confirmation_dialog_view_count", A1Y);
                C358248ab A0Y2 = DbS.A0Y(requireContext2);
                A0Y2.A09(2131955328);
                A0Y2.A08(2131955326);
                A0Y2.A0I(lv1, 2131955327);
                A0Y2.A0H(luy, 2131955349);
                DbT.A1V(A0Y2);
                return;
            }
            0qQ.A0F(str5);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final boolean A0Q(AnonymousClass818 r28, C66461MSp mSp) {
        String str;
        Object obj;
        C62787KmP kmP = (C62787KmP) A06(this).A0h.A01.getValue();
        AnonymousClass3Q2 A022 = C61829KNs.A02(this);
        if (A022 != null && (kmP instanceof KP3)) {
            C47169Drk drk = (C47169Drk) A06(this).A0i.A08.getValue();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0T);
            KP3 kp3 = (KP3) kmP;
            C61084JwM jwM = (C61084JwM) A06(this).A0i.A06.getValue();
            Integer num = drk.A02;
            Integer num2 = AnonymousClass05K.A00;
            boolean A1W = AnonymousClass7TF.A1W(num, num2);
            boolean A1W2 = AnonymousClass7TF.A1W(num, AnonymousClass05K.A0Y);
            C59793JYm A023 = C64191LSy.A02(A022);
            String str2 = this.A0f;
            0qQ.A0B(A0l, 1);
            C51973G9u.A0t(2, kp3, A023, str2);
            C368368sV r1 = kp3.A00;
            Object obj2 = null;
            if (r1 != null) {
                str = r1.getOptionalStringField(6, "client_session_id");
            } else {
                str = null;
            }
            if ((!C367288qV.A04((BBV) null, A0l) || !(jwM == null || jwM.A00 == null)) && ((!C347167wN.A00.A00(A0l, true) || !(jwM == null || jwM.A01 == null)) && str != null)) {
                Map map = kp3.A02;
                AnonymousClass818 r9 = r28;
                LGS lgs = (LGS) map.get(r9.toString());
                if (lgs != null) {
                    Boolean valueOf = Boolean.valueOf(drk.A04);
                    Boolean valueOf2 = Boolean.valueOf(drk.A05);
                    if (jwM != null) {
                        obj = jwM.A00;
                    } else {
                        obj = null;
                    }
                    Boolean valueOf3 = Boolean.valueOf(obj instanceof KYY);
                    if (jwM != null) {
                        obj2 = jwM.A01;
                    }
                    if (C367278qU.A02(r9, new C376569Im(valueOf, valueOf2, valueOf3, Boolean.valueOf(obj2 instanceof KYY), Boolean.valueOf(A1W), Boolean.valueOf(A1W2), (Boolean) null, 192), A0l, (C367198qL) null, lgs, str)) {
                        C49887FBn A002 = C49797F7i.A00(A0l);
                        A002.A02(getActivity(), num2, getModuleName(), lgs.A03());
                        A002.A01(this);
                        FBQ fbq = new FBQ(r9, lgs.A01(), A023, str2, getModuleName(), (String) null, (String) null, A002.A00);
                        FragmentActivity activity = getActivity();
                        if (activity != null) {
                            LEO leo = new LEO(activity, fbq.A01, A0l);
                            leo.A06 = fbq;
                            leo.A05 = null;
                            leo.A01 = this;
                            leo.A05 = mSp;
                            C63433Kwt.A00(A0l, r1, leo);
                            lgs.A05(leo.A00());
                            A1G.A00(r9, A0l, new CXPNoticeStateRepository(A0l, num2), lgs);
                        }
                        A06(this).A0h.A0A();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A0R(K66 k66) {
        C61823KNm kNm = k66.A04;
        if (kNm != null) {
            return kNm.A0b;
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }

    public final UserSession A0S() {
        return AnonymousClass7TE.A0l(this.A0T);
    }

    public final void APc() {
        AnonymousClass6ST r0;
        AnonymousClass6ST r02 = this.A0A;
        if (r02 != null && r02.isShowing() && (r0 = this.A0A) != null) {
            r0.dismiss();
        }
    }

    public final void EvY() {
        AnonymousClass6ST r0 = this.A0A;
        if (r0 != null) {
            if (r0.isShowing()) {
                0wb.A03(__redex_internal_original_name, "Attempting to show progress dialog when already showing.");
            }
            AnonymousClass6ST r2 = this.A0A;
            if (r2 != null) {
                DbU.A18(requireContext(), r2, 2131965491);
            }
            AnonymousClass6ST r02 = this.A0A;
            if (r02 != null) {
                AnonymousClass0fN.A00(r02);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0T);
    }

    public K66() {
        0Yh A0z = DbS.A0z(C60120Jg1.class);
        this.A0P = DbS.A0I(C66303MMm.A01(this, 40), C66303MMm.A01(this, 41), MMY.A00(this, (Object) null, 19), A0z);
        this.A0O = AnonymousClass7TE.A1F();
        this.A0R = C66303MMm.A00(this, 37);
        this.A0S = AnonymousClass0eN.A01(C66242MKd.A00);
        this.A0c = new C15681Ugm(this, 1);
        this.A0Y = C64698LgT.A00(this, 47);
        this.A0U = C64698LgT.A00(this, 43);
        this.A0b = C64698LgT.A00(this, 50);
        this.A0a = C64698LgT.A00(this, 49);
        this.A0V = C64698LgT.A00(this, 44);
        this.A0B = "";
        this.A0M = new LWP((Object) this, 11);
        this.A0Q = DbS.A0I(C66303MMm.A01(this, 42), C66303MMm.A01(this, 32), MMY.A00(this, (Object) null, 20), DbS.A0z(C60114Jfv.class));
        this.A0e = AnonymousClass3E4.A01(this, false, true);
        this.A0d = new C64871LjX(this, 7);
        this.A0W = C64698LgT.A00(this, 45);
        this.A0T = C227642jf.A02(this);
        this.A0X = C64698LgT.A00(this, 46);
        this.A0Z = C64698LgT.A00(this, 48);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A09() {
        /*
            r7 = this;
            X.3Q2 r3 = X.C61829KNs.A02(r7)
            if (r3 == 0) goto L_0x009f
            X.0eM r5 = r7.A0T
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.KNm r0 = r7.A04
            if (r0 != 0) goto L_0x001e
            java.lang.String r2 = "dependencyProvider"
        L_0x0016:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            boolean r1 = r0.A0Y
            boolean r0 = r0.A0Z
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r1 = X.C48792EkF.A00(r2, r3, r1, r0)
            r4 = 1
            X.0qQ.A0B(r6, r4)
            r3.A11 = r1
            X.4Cl r0 = X.DbX.A0m(r6)
            com.instagram.api.schemas.FanClubInfoDict r2 = r0.B3v()
            if (r2 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00a0
            X.DeO r1 = r1.A00
        L_0x003a:
            X.DeO r0 = X.C46401DeO.WELCOME
            if (r1 != r0) goto L_0x00a2
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            r3.A0U(r0)
            java.lang.String r0 = r2.getFanClubId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x004b:
            r3.A2q = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.LTW.A06(r0)
            X.0qQ.A0B(r1, r4)
            if (r0 != 0) goto L_0x0077
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r1)
            boolean r0 = X.LTW.A09(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.Boolean r0 = X.C63501KyC.A00(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0077
            r3.A6E = r4
            X.C52086GEg.A0g(r7, r1, r4, r4)
        L_0x0077:
            X.LBG r0 = r7.A06
            java.lang.String r2 = "viewHolder"
            if (r0 == 0) goto L_0x0016
            X.LAv r0 = r0.A08
            com.instagram.igds.components.button.IgdsButton r1 = r0.A06
            r0 = 0
            r1.setVisibility(r0)
            X.LBG r0 = r7.A06
            if (r0 == 0) goto L_0x0016
            android.view.View r3 = r0.A00
            X.LAv r0 = r0.A08
            com.instagram.igds.components.button.IgdsButton r2 = r0.A07
            com.instagram.igds.components.button.IgdsButton r1 = r0.A06
            X.AnonymousClass7TG.A1Q(r2, r1)
            r0 = 8
            r3.setVisibility(r0)
            r2.setEnabled(r4)
            r1.setEnabled(r4)
        L_0x009f:
            return
        L_0x00a0:
            r1 = 0
            goto L_0x003a
        L_0x00a2:
            r0 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.A09():void");
    }

    public static final void A0A(Intent intent, K66 k66, int i) {
        LFG A042;
        FragmentActivity activity = k66.getActivity();
        if (activity != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
        if (i == 0 && (A042 = A04(k66)) != null) {
            A042.A01(AnonymousClass7TF.A1W(A02(k66), C62482KgX.DIRECT_TO_SHARE));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r1 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.K66 r9) {
        /*
            X.3Q2 r1 = X.C61829KNs.A02(r9)
            if (r1 == 0) goto L_0x0035
            X.KNs r0 = A06(r9)
            X.KOS r4 = r0.A0U
            java.lang.String r3 = r1.A3t
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.JwD r0 = r4.A06()
            java.util.List r0 = r0.A0W
            if (r0 == 0) goto L_0x0035
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002c
            X.JTU.A1M(r2, r1)
            goto L_0x0022
        L_0x002c:
            com.instagram.common.session.UserSession r0 = r4.A01
            X.8Oa r0 = X.AnonymousClass8OY.A00(r0)
            r0.A01(r3, r2)
        L_0x0035:
            X.3Q2 r3 = X.C61829KNs.A02(r9)
            X.0eM r4 = r9.A0T
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            r7 = 1
            X.0qQ.A0B(r5, r7)
            X.1Av r2 = X.1Au.A00(r5)
            if (r3 == 0) goto L_0x0052
            X.JxB r0 = r3.A0v
            if (r0 == 0) goto L_0x0052
            java.lang.Integer r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r2.A1J(r0)
            if (r3 == 0) goto L_0x0077
            X.28D r1 = r3.A0i
            X.28D r0 = X.28D.A42
            if (r1 != r0) goto L_0x0077
            X.1Av r1 = X.1Au.A00(r5)
            X.0s0 r0 = r1.A6f
            X.0YZ[] r3 = X.1Av.A8a
            r2 = 192(0xc0, float:2.69E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r3, r2)
            if (r0 != 0) goto L_0x0077
            X.1Av r1 = X.1Au.A00(r5)
            X.0s0 r0 = r1.A6f
            X.AnonymousClass7TF.A1J(r1, r0, r3, r2, r7)
        L_0x0077:
            X.3Q2 r8 = X.C61829KNs.A02(r9)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            X.0iw r5 = r9.A0N
            java.lang.String r4 = r9.A0f
            X.DbZ.A0t(r7, r6, r5, r4)
            if (r8 == 0) goto L_0x00ed
            java.lang.String r3 = r8.A3t
            X.Jw0 r1 = r8.A0q
            r7 = 2
            X.0qQ.A0B(r3, r7)
            boolean r0 = X.C367088qA.A03(r6)
            if (r0 == 0) goto L_0x00b5
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00b0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b2
            X.JTU.A1K(r2, r1)
            goto L_0x00a6
        L_0x00b0:
            X.0sn r2 = X.0sn.A00
        L_0x00b2:
            X.LTQ.A09(r5, r6, r4, r3, r2)
        L_0x00b5:
            java.util.ArrayList r0 = r8.A43
            java.util.List r0 = X.LTX.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = X.C63447KxC.A00(r6)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r3 = r8.A3t
            X.Jw0 r0 = r8.A0q
            X.0qQ.A0B(r3, r7)
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00e8
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00de:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ea
            X.JTU.A1K(r2, r1)
            goto L_0x00de
        L_0x00e8:
            X.0sn r2 = X.0sn.A00
        L_0x00ea:
            X.LTQ.A09(r5, r6, r4, r3, r2)
        L_0x00ed:
            java.lang.String r0 = r9.getModuleName()
            r9.A0T(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.A0F(X.K66):void");
    }

    public static final void A0G(K66 k66) {
        AnonymousClass818 r1;
        Handler A0D2;
        Runnable fsf;
        Object value = A06(k66).A0h.A01.getValue();
        AnonymousClass3Q2 A022 = C61829KNs.A02(k66);
        if (A022 != null) {
            if (value instanceof KP6) {
                A0D2 = AnonymousClass7TF.A0D();
                fsf = new C51346Fse(k66, A022);
            } else if (value instanceof KP4) {
                A0D2 = AnonymousClass7TF.A0D();
                fsf = new C51347Fsf(k66, A022);
            } else if (value instanceof KP3) {
                if (A0R(k66)) {
                    r1 = AnonymousClass818.IG_REELS_PANAVISION_COMPOSER;
                } else {
                    r1 = AnonymousClass818.IG_REELS_COMPOSER;
                }
                k66.A0Q(r1, (C66461MSp) null);
                return;
            } else {
                return;
            }
            A0D2.post(fsf);
        }
    }

    public static final void A0I(K66 k66) {
        if (k66.getContext() != null) {
            C64146LQj lQj = k66.A03;
            if (lQj != null) {
                lQj.A01 = null;
                lQj.A06.clear();
            }
            LBG lbg = k66.A06;
            if (lbg != null) {
                lbg.A07.A00.setVisibility(8);
                LBG lbg2 = k66.A06;
                if (lbg2 != null) {
                    lbg2.A08.A00.setVisibility(0);
                    C59689JTv.A0B(k66.getActivity(), "clips_publish_screen_caption_suggestions_fetch_failed");
                    return;
                }
            }
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0P(K66 k66, boolean z) {
        2da r0;
        int i;
        Resources resources;
        if (k66.getContext() != null) {
            boolean z2 = k66.A0L;
            k66.A0L = z;
            UserSession A0l = AnonymousClass7TE.A0l(k66.A0T);
            int i2 = 8;
            if (!182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36323517675678955L) || !k66.A0C) {
                boolean A062 = 182.A06(0Tu.A05, JTP.A0S(k66, 0), 36323517675744492L);
                if (z) {
                    if (A062 && !z2) {
                        2da r3 = k66.A0H;
                        if (r3 != null) {
                            r3.ErD(new LYF((Object) k66, 51), R.drawable.instagram_check_pano_outline_24);
                        }
                        2da r02 = k66.A0H;
                        if (r02 != null) {
                            r02.Ets(true);
                        }
                    }
                    int A002 = k66.A00();
                    LBG lbg = k66.A06;
                    if (lbg != null) {
                        lbg.A03.postDelayed(new M7H(k66, A002), 200);
                    }
                    0qQ.A0F("viewHolder");
                    throw AnonymousClass00P.createAndThrow();
                } else if (A062 && (r0 = k66.A0H) != null) {
                    r0.Ets(false);
                }
            } else if (z) {
                int A003 = k66.A00();
                LBG lbg2 = k66.A06;
                if (lbg2 != null) {
                    L97 l97 = lbg2.A07;
                    int[] iArr = new int[2];
                    lbg2.A08.A02.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    LBG lbg3 = k66.A06;
                    if (lbg3 != null) {
                        lbg3.A08.A00.getLocationOnScreen(iArr2);
                        int i3 = (iArr[1] - iArr2[1]) + A003;
                        LBG lbg4 = k66.A06;
                        if (lbg4 != null) {
                            int scrollY = i3 - lbg4.A03.getScrollY();
                            Context context = k66.getContext();
                            if (context == null || (resources = context.getResources()) == null) {
                                i = 0;
                            } else {
                                i = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
                            }
                            View view = l97.A00;
                            view.setVisibility(0);
                            view.post(new M7M(l97, scrollY + i));
                            LBG lbg5 = k66.A06;
                            if (lbg5 != null) {
                                lbg5.A08.A00.setVisibility(8);
                                LBG lbg6 = k66.A06;
                                if (lbg6 != null) {
                                    lbg6.A03.postDelayed(new M7H(k66, A003), 200);
                                    if (!z2) {
                                        2da r32 = k66.A0H;
                                        if (r32 != null) {
                                            r32.ErD(new LYF((Object) k66, 50), R.drawable.instagram_check_pano_outline_24);
                                        }
                                        2da r03 = k66.A0H;
                                        if (r03 != null) {
                                            r03.Ets(true);
                                        }
                                        A0E(k66);
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F("viewHolder");
                throw AnonymousClass00P.createAndThrow();
            } else {
                2da r04 = k66.A0H;
                if (r04 != null) {
                    r04.Ets(false);
                }
                LBG lbg7 = k66.A06;
                if (lbg7 != null) {
                    lbg7.A07.A00.setVisibility(8);
                    LBG lbg8 = k66.A06;
                    if (lbg8 != null) {
                        lbg8.A08.A00.setVisibility(0);
                    }
                }
                0qQ.A0F("viewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            if (182.A06(0Tu.A05, JTP.A0S(k66, 0), 36318840455961083L)) {
                LBG lbg9 = k66.A06;
                if (lbg9 != null) {
                    View view2 = lbg9.A01;
                    if (z) {
                        i2 = 0;
                    }
                    view2.setVisibility(i2);
                    return;
                }
                0qQ.A0F("viewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void D4q() {
        GAX gax;
        JTP.A0X(this).A1B(C62674Kka.A09, AnonymousClass80P.COMMENT_POLL);
        AnonymousClass0eM r3 = this.A0T;
        27p.A01(AnonymousClass7TE.A0l(r3));
        if (A06(this).A0J.A06().A08 != null) {
            gax = new GAX(2131953882, 2131961769);
        } else {
            gax = null;
        }
        if (gax != null) {
            A03(this).EvB(gax, (C62320sa) null);
            return;
        }
        C309516Yo A0Q2 = DbU.A0Q(requireActivity(), AnonymousClass7TE.A0l(r3));
        C3018960m.A00().A00();
        A0Q2.A0B((Bundle) null, C48776Ejz.A00(ClipsSharingDraftViewModel.A00(this).A0O, A07(this), false));
        A0Q2.A04();
    }

    public final void D4t() {
        27r A0X2 = JTP.A0X(this);
        A0X2.A0F.A0V((C62674Kka) null, AnonymousClass80P.COMMENT_PROMPTS, "IG_CAMERA_CLIPS_SHARE_SHEET_ENTITY_TAP", true);
        C309516Yo A0Q2 = DbU.A0Q(requireActivity(), AnonymousClass7TE.A0l(this.A0T));
        C3018960m.A00().A00();
        String A072 = A07(this);
        boolean z = ClipsSharingDraftViewModel.A00(this).A0x;
        K50 k50 = new K50();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putString("args_comment_prompt_text", A072);
        A0a2.putBoolean(AnonymousClass000.A00(254), false);
        A0a2.putBoolean("args_should_show_delete_prompt_button", z);
        DbW.A0x(A0a2, k50, A0Q2);
    }

    public final void DIj() {
        JTP.A0X(this).A1X(AnonymousClass80P.HASHTAG);
        LBG lbg = this.A06;
        if (lbg != null) {
            lbg.A0A.append("#");
            LBG lbg2 = this.A06;
            if (lbg2 != null) {
                lbg2.A0A.requestFocus();
                LBG lbg3 = this.A06;
                if (lbg3 != null) {
                    0nA.A0Q(lbg3.A0A);
                    return;
                }
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        if (A0R(this)) {
            return "panavideo_share_sheet";
        }
        return "clips_share_sheet";
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1599214888);
        K66.super.onActivityCreated(bundle);
        IgFragmentActivity activity = getActivity();
        if (activity instanceof BaseFragmentActivity) {
            activity.registerOnActivityResultListener(this.A0c);
        }
        AnonymousClass0fD.A09(1660973464, A022);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            A03(this).onActivityResult(i, i2, intent);
        } else if (i == 9686) {
            if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A0T), 36323375940906099L)) {
                A0A(intent, this, i2);
            }
        }
    }

    public final boolean onBackPressed() {
        JTP.A0X(this).A1Q(C59725JVj.SHARE_SHEET, "SHARE_SHEET_CANCEL_BUTTON_TAP");
        ClipsSharingDraftViewModel A012 = A01(this);
        AnonymousClass9P8 r6 = this.A01;
        if (A012.A07() && A012.A03().A0E == null && r6 != null) {
            AnonymousClass7TE.A1Z(new C59673JTe(r6, A012, (AnonymousClass4D7) null, 7, false), C318116oQ.A00(A012));
        }
        boolean A1W = AnonymousClass7TF.A1W(A02(this), C62482KgX.DIRECT_TO_SHARE);
        LV3 A002 = LV3.A00(this, 60);
        AnonymousClass0eM r4 = this.A0T;
        L4H A003 = C63209KtG.A00(AnonymousClass7TE.A0l(r4));
        A003.A01.flowEndCancel(A003.A00, CancelReason.USER_CANCELLED);
        AnonymousClass8ZP r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("autoCreatedReelFlowsPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A02.flowMarkPoint(r0.A01, "REELS_SHARE_SHEET_BACK_BUTTON_TAPPED");
        if (A1W) {
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            0Tu r62 = 0Tu.A05;
            if (!182.A06(r62, A0l, 36328237843889253L)) {
                if (182.A06(r62, JTP.A0S(this, 0), 36321550579869187L)) {
                    C64170LRv.A01(requireContext(), new LYF((Object) this, 52), new LYF((Object) this, 53), (View.OnClickListener) null, AnonymousClass7TE.A0l(r4), AnonymousClass05K.A0C, A1W, false).A03(requireActivity());
                    return true;
                }
                Context requireContext = requireContext();
                UserSession A0S2 = JTP.A0S(this, 1);
                C358248ab A0Y2 = DbS.A0Y(requireContext);
                A0Y2.A09(2131973659);
                A0Y2.A08(2131973658);
                A0Y2.A0K(LV0.A00(A002, A0S2, 36), 2131973656);
                A0Y2.A0r(true);
                A0Y2.A0s(true);
                A0Y2.A0B(new C64207LTx(A0S2, 3));
                A0Y2.A0G(LV2.A00(A0S2, 5), 2131973657);
                DbT.A1V(A0Y2);
                return true;
            }
        }
        A0A((Intent) null, this, 0);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(603349463);
        K66.super.onCreate(bundle);
        AnonymousClass0eM r2 = this.A0T;
        AnonymousClass8A1.A00(AnonymousClass7TE.A0l(r2)).A04("launch_clips_share_sheet_end");
        AnonymousClass8A1.A00(AnonymousClass7TE.A0l(r2)).A04("share_sheet_creation_start");
        Bundle requireArguments = requireArguments();
        this.A04 = new C61823KNm(requireArguments, this, this.A0N, AnonymousClass7TE.A0l(r2), this.A0f);
        this.A0K = requireArguments.getParcelableArrayList(C66579MXk.A00(87));
        this.A0J = requireArguments.getString(C66579MXk.A00(89));
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        0qQ.A0B(A0l, 0);
        Class<C357458Xy> cls = C357458Xy.class;
        if (A0l.A00(cls) == null) {
            UserSession A0l2 = AnonymousClass7TE.A0l(r2);
            Object obj = new Object();
            0qQ.A0B(A0l2, 0);
            A0l2.A04(cls, obj);
        }
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            A0G2.setSoftInputMode(32);
        }
        this.A07 = DbW.A0F(this).A00(C60228Jhl.class);
        this.A09 = (PromptStickerModel) requireArguments.getParcelable(AnonymousClass000.A00(2148));
        this.A05 = JTO.A0L(new C61554KCh(DbY.A05(this), AnonymousClass7TE.A0l(r2)), requireActivity()).A00(C60089JfV.class);
        Dba.A15(requireActivity(), DbW.A0F(this).A00(QD0.class).A00, new MP4(this, 45), 12);
        setModuleNameV2(getModuleName());
        C64317LZr.A00(requireActivity(), A01(this).A02, this, 12);
        this.A08 = (DirectCameraViewModel) requireArguments.getParcelable("ClipsConstants.ARG_DIRECT_CAMERA_VIEW_MODEL");
        String A002 = AnonymousClass000.A00(2147);
        this.A0E = requireArguments.getBoolean(A002, false);
        this.A00 = new AnonymousClass847(requireActivity());
        this.A0I = new C357058Wh(this, C357048Wg.REEL, AnonymousClass7TE.A0l(r2));
        C61823KNm kNm = this.A04;
        if (kNm == null) {
            str = "dependencyProvider";
        } else {
            kNm.A01.EBi();
            this.A02 = AnonymousClass8ZO.A00(AnonymousClass7TE.A0l(r2));
            L4H A003 = C63209KtG.A00(AnonymousClass7TE.A0l(r2));
            1QP r7 = A003.A01;
            long flowStartForMarker = r7.flowStartForMarker(658054533, "post_reel", false);
            A003.A00 = flowStartForMarker;
            r7.flowAnnotate(flowStartForMarker, "share_sheet_type", "reels");
            C64317LZr.A00(requireActivity(), A01(this).A03, this, 13);
            C64317LZr.A00(requireActivity(), A01(this).A01, this, 14);
            1Ng A004 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r2));
            A004.A01(this.A0X, C64679Lg6.class);
            A004.A01(this.A0Z, Lg8.class);
            A004.A01(this.A0Y, C64664Lfq.class);
            A004.A01(this.A0U, C64663Lfp.class);
            A004.A01(this.A0a, C354838No.class);
            A004.A01(this.A0b, C64645LfX.class);
            A004.A01(this.A0V, C61149Jy0.class);
            if (182.A06(0Tu.A05, JTP.A0S(this, 0), 36317358692570195L)) {
                AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r2)).A01(this.A0W, C64646LfY.class);
            }
            C61823KNm kNm2 = this.A04;
            str = "dependencyProvider";
            if (kNm2 != null) {
                kNm2.A05();
                if (JUO.A00(AnonymousClass7TE.A0l(r2)) && requireArguments.getBoolean(A002, false)) {
                    A0B((C272044k0) null, this);
                }
                if (C319116q4.A06(AnonymousClass7TE.A0l(r2))) {
                    C61823KNm kNm3 = this.A04;
                    if (kNm3 != null) {
                        2YL A0H2 = DbS.A0H(kNm3.A0Q);
                        AnonymousClass7TE.A1Z(new JVD(A0H2, (AnonymousClass4D7) null, 43), C318116oQ.A00(A0H2));
                    }
                }
                AnonymousClass0fD.A09(-816906485, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(752553072);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_sharesheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1826904647, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        BBV bbv;
        C64146LQj lQj;
        C62659KkL kkL;
        KP1 kp1;
        int A022 = AnonymousClass0fD.A02(-954439166);
        super.onDestroy();
        AnonymousClass0eM r12 = this.A0T;
        UserSession A0l = AnonymousClass7TE.A0l(r12);
        AnonymousClass0iw r2 = this.A0N;
        AnonymousClass3Q2 A023 = C61829KNs.A02(this);
        if (A023 == null || (str = A023.A2X) == null) {
            str = "";
        }
        C47169Drk A042 = LSR.A04(A06(this).A0i);
        Object value = A06(this).A0i.A03.A03.getValue();
        if (!(value instanceof KP1) || (kp1 = (KP1) value) == null) {
            bbv = null;
        } else {
            bbv = kp1.A00;
        }
        boolean A1U = AnonymousClass7TF.A1U(0, A0l, r2);
        int A032 = DbW.A03(2, str, A042);
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, A0l), "ig_reels_share_sheet_share_to_facebook_row_state");
        if (A0e2.isSampled()) {
            A0e2.A8M(C63208KtF.A00(A042), "xpost_type");
            JTO.A1S(A0e2, str);
            16V A0J2 = AnonymousClass7TF.A0Q(A0l).A0J();
            if (A0J2 != null) {
                int ordinal = A0J2.ordinal();
                if (ordinal == A1U) {
                    kkL = C62659KkL.PERSONAL;
                } else if (ordinal == A032) {
                    kkL = C62659KkL.CREATOR;
                } else if (ordinal == 2) {
                    kkL = C62659KkL.PROFESSIONAL;
                }
                A0e2.A8M(kkL, "user_type");
                A0e2.AAJ("surface", r2.getModuleName());
                C62660KkM kkM = C62660KkM.REELS_CCP_IS_ENABLED;
                0Tu r22 = 0Tu.A06;
                A0e2.A9H("launcher_values", 0Yt.A06(AnonymousClass7TH.A0h(C62660KkM.SERVICE_CACHE, Boolean.valueOf(A1U), AnonymousClass7TE.A1L(kkM, AnonymousClass7TF.A0R(r22, A0l, 36314571257940663L)), AnonymousClass7TE.A1L(C62660KkM.REELS_CONTENT_ELIGIBILITY_PLATFORMIZATION, AnonymousClass7TF.A0R(r22, A0l, 36316615662572054L)), AnonymousClass7TE.A1L(C62660KkM.REELS_XAR_IS_ENABLED, AnonymousClass7TF.A0R(r22, A0l, 36313123854092066L)))));
                A0e2.A9H("client_user_state_values", 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(C62663KkP.CCP_LAST_CHANGE, String.valueOf(C367288qV.A00(A0l))), AnonymousClass7TE.A1L(C62663KkP.FBLINKED, String.valueOf(Dbb.A1Z(C363388je.A00(A0l), "ClipsShareToFacebookLoggerUtil"))), AnonymousClass7TE.A1L(C62663KkP.USER_AUTO_CCP_SETTINGS, String.valueOf(C367288qV.A06(A0l))), AnonymousClass7TE.A1L(C62663KkP.USER_AUTO_XAR_SETTINGS, String.valueOf(2D5.A00(A0l).A0C())), AnonymousClass7TE.A1L(C62663KkP.XAR_LAST_CHANGE, String.valueOf(DbW.A06(2D5.A00(A0l).A04, AnonymousClass000.A00(2402))))}));
                String str2 = null;
                if (!(C63208KtF.A00(A042) == C62658KkK.CCP || bbv == null)) {
                    str2 = bbv.A00;
                }
                A0e2.AAJ("hide_reason", str2);
                A0e2.Cgf();
            }
            kkL = C62659KkL.UNKNOWN;
            A0e2.A8M(kkL, "user_type");
            A0e2.AAJ("surface", r2.getModuleName());
            C62660KkM kkM2 = C62660KkM.REELS_CCP_IS_ENABLED;
            0Tu r222 = 0Tu.A06;
            A0e2.A9H("launcher_values", 0Yt.A06(AnonymousClass7TH.A0h(C62660KkM.SERVICE_CACHE, Boolean.valueOf(A1U), AnonymousClass7TE.A1L(kkM2, AnonymousClass7TF.A0R(r222, A0l, 36314571257940663L)), AnonymousClass7TE.A1L(C62660KkM.REELS_CONTENT_ELIGIBILITY_PLATFORMIZATION, AnonymousClass7TF.A0R(r222, A0l, 36316615662572054L)), AnonymousClass7TE.A1L(C62660KkM.REELS_XAR_IS_ENABLED, AnonymousClass7TF.A0R(r222, A0l, 36313123854092066L)))));
            A0e2.A9H("client_user_state_values", 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(C62663KkP.CCP_LAST_CHANGE, String.valueOf(C367288qV.A00(A0l))), AnonymousClass7TE.A1L(C62663KkP.FBLINKED, String.valueOf(Dbb.A1Z(C363388je.A00(A0l), "ClipsShareToFacebookLoggerUtil"))), AnonymousClass7TE.A1L(C62663KkP.USER_AUTO_CCP_SETTINGS, String.valueOf(C367288qV.A06(A0l))), AnonymousClass7TE.A1L(C62663KkP.USER_AUTO_XAR_SETTINGS, String.valueOf(2D5.A00(A0l).A0C())), AnonymousClass7TE.A1L(C62663KkP.XAR_LAST_CHANGE, String.valueOf(DbW.A06(2D5.A00(A0l).A04, AnonymousClass000.A00(2402))))}));
            String str22 = null;
            str22 = bbv.A00;
            A0e2.AAJ("hide_reason", str22);
            A0e2.Cgf();
        }
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r12));
        A002.A02(this.A0X, C64679Lg6.class);
        A002.A02(this.A0Z, Lg8.class);
        A002.A02(this.A0Y, C64664Lfq.class);
        A002.A02(this.A0U, C64663Lfp.class);
        A002.A02(this.A0a, C354838No.class);
        A002.A02(this.A0b, C64645LfX.class);
        A002.A02(this.A0V, C61149Jy0.class);
        if (182.A06(0Tu.A05, JTP.A0S(this, 0), 36317358692570195L)) {
            AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r12)).A02(this.A0W, C64646LfY.class);
        }
        if (A02(this) == C62482KgX.DIRECT_TO_SHARE) {
            JTP.A0X(this).A0W();
            27p.A02(AnonymousClass7TE.A0l(r12));
        }
        C61823KNm kNm = this.A04;
        if (kNm == null) {
            JTO.A1M();
            throw AnonymousClass00P.createAndThrow();
        }
        kNm.A01.FIx();
        IgFragmentActivity activity = getActivity();
        if (activity instanceof BaseFragmentActivity) {
            activity.unregisterOnActivityResultListener(this.A0c);
        }
        A06(this).A0L.A00 = null;
        this.A01 = null;
        this.A0K = null;
        this.A09 = null;
        this.A0A = null;
        UserSession A0l2 = AnonymousClass7TE.A0l(r12);
        if (182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36323517675678955L) && (lQj = this.A03) != null) {
            lQj.A01 = null;
            lQj.A06.clear();
        }
        AnonymousClass0fD.A09(174232574, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r3), r3, 36323517675875566L) != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r6 = this;
            r0 = 173771604(0xa5b8b54, float:1.0570671E-32)
            int r5 = X.AnonymousClass0fD.A02(r0)
            super.onDestroyView()
            X.6ST r0 = r6.A0A
            r1 = 1
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isShowing()
            if (r0 != r1) goto L_0x001c
            X.6ST r0 = r6.A0A
            if (r0 == 0) goto L_0x001c
            r0.dismiss()
        L_0x001c:
            X.KNm r0 = r6.A04
            if (r0 != 0) goto L_0x0028
            X.JTO.A1M()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0028:
            X.MVR r1 = r0.A01
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CONTENT_FUNDING_REELS_ROW
            r1.FIr(r0)
            X.0eM r4 = r6.A0T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36323517675678955(0x810c0c000d2ceb, double:3.034477068940605E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0057
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36323517675875566(0x810c0c00102cee, double:3.034477069064943E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0057:
            X.3E6 r1 = r6.A0e
            r1.onStop()
            X.3ok r0 = r6.A0d
            r1.EEH(r0)
        L_0x0061:
            X.KNs r4 = A06(r6)
            X.KOo r1 = r4.A0L
            r0 = 0
            r1.A00 = r0
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318058775123798(0x81071500391756, double:3.0310248382482956E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0082
            X.KOp r0 = r4.A0S
            X.LgV r0 = r0.A00
            if (r0 == 0) goto L_0x0082
            r0.A01()
        L_0x0082:
            r0 = -1500530762(0xffffffffa68fb7b6, float:-9.972413E-16)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K66.onDestroyView():void");
    }

    public final void onPause() {
        STU stu;
        int A022 = AnonymousClass0fD.A02(-1738646815);
        C61829KNs A062 = A06(this);
        boolean z = this.A0F;
        if (A062.A0N.A03.A07() && !z) {
            C61836KOa kOa = A062.A0I;
            kOa.A0A((String) kOa.A06.getValue());
        }
        LWf lWf = A062.A0L.A00;
        if (!(lWf == null || (stu = lWf.A00) == null)) {
            stu.A05();
        }
        K66.super.onPause();
        AnonymousClass0fD.A09(-164160902, A022);
    }

    public final void onResume() {
        STU stu;
        int A022 = AnonymousClass0fD.A02(685960980);
        LWf lWf = A06(this).A0L.A00;
        if (!(lWf == null || (stu = lWf.A00) == null)) {
            stu.A06();
        }
        super.onResume();
        AnonymousClass0fD.A09(1556544403, A022);
    }
}
