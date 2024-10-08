package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.dsp.point.DspPointContextHelper;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.user.model.User;
import com.meta.analytics.gnv.vista.core.VistaViewPoint;
import java.util.List;
import java.util.Set;

/* renamed from: X.InT  reason: case insensitive filesystem */
public final class C58163InT extends 03J implements 0sK {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58163InT(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                case 2: goto L_0x0023;
                case 3: goto L_0x001b;
                case 4: goto L_0x002b;
                case 5: goto L_0x0033;
                case 6: goto L_0x003b;
                case 7: goto L_0x0043;
                case 8: goto L_0x0043;
                case 9: goto L_0x0043;
                case 10: goto L_0x004b;
                case 11: goto L_0x0053;
                case 12: goto L_0x005b;
                case 13: goto L_0x0063;
                case 14: goto L_0x006b;
                case 15: goto L_0x0073;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.I4A> r3 = X.I4A.class
            r1 = 3
            java.lang.String r4 = "launchCameraWithAudio"
            java.lang.String r5 = "launchCameraWithAudio(Lcom/instagram/clips/model/metadata/ClipsAudioMetadata;Lcom/facebook/analytics/structuredlogger/enums/InstagramCameraEntryPointTypes;Lcom/instagram/api/schemas/ClipsCameraCommandAction;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.QgP> r3 = X.C8071QgP.class
            r1 = 3
            java.lang.String r4 = "onClickCard"
            java.lang.String r5 = "onClickCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.Hrc> r3 = X.C56030Hrc.class
            r1 = 3
            java.lang.String r4 = "onUserNameClicked"
            java.lang.String r5 = "onUserNameClicked(Lcom/instagram/user/model/User;Ljava/lang/String;Z)V"
            goto L_0x000d
        L_0x0023:
            java.lang.Class<X.Hrc> r3 = X.C56030Hrc.class
            r1 = 3
            java.lang.String r4 = "onCommentPollVoterCountsClicked"
            java.lang.String r5 = "onCommentPollVoterCountsClicked(Ljava/lang/String;Ljava/lang/String;Z)V"
            goto L_0x000d
        L_0x002b:
            java.lang.Class<X.Hrc> r3 = X.C56030Hrc.class
            r1 = 3
            java.lang.String r4 = "onLikeCommentClicked"
            java.lang.String r5 = "onLikeCommentClicked(Ljava/lang/String;Ljava/lang/String;Z)V"
            goto L_0x000d
        L_0x0033:
            java.lang.Class<X.3fL> r3 = X.C246853fL.class
            r1 = 3
            java.lang.String r4 = "onCommentBubbleLiked"
            java.lang.String r5 = "onCommentBubbleLiked(Ljava/lang/String;Ljava/lang/String;Z)V"
            goto L_0x000d
        L_0x003b:
            java.lang.Class<X.He2> r3 = X.C55212He2.class
            r1 = 3
            java.lang.String r4 = "createVistaViewPoint"
            java.lang.String r5 = "createVistaViewPoint(Landroid/view/View;ILcom/meta/analytics/gnv/vista/core/VistaViewContext;)Lcom/meta/analytics/gnv/vista/core/VistaViewPoint;"
            goto L_0x000d
        L_0x0043:
            java.lang.Class<X.GBI> r3 = X.GBI.class
            r1 = 3
            java.lang.String r4 = "launchPeopleTags"
            java.lang.String r5 = "launchPeopleTags(Lcom/instagram/feed/media/Media;ZZ)V"
            goto L_0x000d
        L_0x004b:
            java.lang.Class<X.GBL> r3 = X.GBL.class
            r1 = 3
            java.lang.String r4 = "launchAudioPage"
            java.lang.String r5 = "launchAudioPage(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/intf/ClipsViewerConfig;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;)Z"
            goto L_0x000d
        L_0x0053:
            java.lang.Class<X.JTB> r3 = X.JTB.class
            r1 = 3
            java.lang.String r4 = "cancelAutoScroll"
            java.lang.String r5 = "cancelAutoScroll(Linstagram/features/clips/viewer/controller/listener/ClipsAutoScrollDelegate$AutoScrollCancellationReason;Lcom/instagram/clips/model/ClipsItem;Linstagram/features/clips/viewer/controller/listener/ClipsAutoScrollDelegate$CancellationReasonInteractionType;)V"
            goto L_0x000d
        L_0x005b:
            java.lang.Class<X.JTB> r3 = X.JTB.class
            r1 = 3
            java.lang.String r4 = "onINIButtonTap"
            java.lang.String r5 = "onINIButtonTap(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;Landroid/view/View;)V"
            goto L_0x000d
        L_0x0063:
            java.lang.Class<X.GBD> r3 = X.GBD.class
            r1 = 3
            java.lang.String r4 = "launchReelViewer"
            java.lang.String r5 = "launchReelViewer(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lcom/instagram/model/reels/Reel;)V"
            goto L_0x000d
        L_0x006b:
            java.lang.Class<X.GBD> r3 = X.GBD.class
            r1 = 3
            java.lang.String r4 = "launchPbiaProfileFragment"
            java.lang.String r5 = "launchPbiaProfileFragment(Lcom/instagram/pbiaproxyprofile/intf/PBIAProxyProfileLaunchConfig;Lcom/instagram/feed/media/Media;Lcom/instagram/feed/ui/state/MediaState;)V"
            goto L_0x000d
        L_0x0073:
            java.lang.Class<X.GBM> r3 = X.GBM.class
            r1 = 3
            java.lang.String r4 = "launchOrganicOverflowMenu"
            java.lang.String r5 = "launchOrganicOverflowMenu(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;Landroid/view/View;)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58163InT.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        C67091rt Adl;
        Object obj4 = obj3;
        Object obj5 = obj2;
        Object obj6 = obj;
        switch (this.A00) {
            case 0:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                AnonymousClass7TG.A1N(str2, str3);
                ((C8071QgP) this.receiver).A0G(str2, str3, (String) obj4);
                break;
            case 1:
            case 3:
                User user = (User) obj6;
                String str4 = (String) obj5;
                boolean A1a = AnonymousClass7TE.A1a(obj4);
                AnonymousClass7TG.A1N(user, str4);
                C56030Hrc hrc = (C56030Hrc) this.receiver;
                C333827aD r1 = hrc.A01;
                if (((r1 instanceof C335907dj) && !((C335907dj) r1).A0W) || (r1 instanceof C385149iT)) {
                    hrc.A02.A0X(user, str4, A1a);
                    break;
                }
            case 2:
                String str5 = (String) obj6;
                String str6 = (String) obj5;
                boolean A1a2 = AnonymousClass7TE.A1a(obj4);
                AnonymousClass7TG.A1N(str5, str6);
                ((C56030Hrc) this.receiver).A02.A0O.Epw(new C334817bv(str5, str6, A1a2));
                break;
            case 4:
                String str7 = (String) obj6;
                String str8 = (String) obj5;
                boolean A1X = C51975G9x.A1X(obj4, str7);
                C56030Hrc hrc2 = (C56030Hrc) this.receiver;
                C333827aD r12 = hrc2.A01;
                if ((r12 instanceof C335907dj) && !((C335907dj) r12).A0W) {
                    hrc2.A02.A0h(str7, str8, A1X);
                    break;
                }
            case 5:
                String str9 = (String) obj6;
                String str10 = (String) obj5;
                boolean A1a3 = AnonymousClass7TE.A1a(obj4);
                AnonymousClass7TG.A1N(str9, str10);
                ((C246853fL) this.receiver).D4e(str9, str10, A1a3);
                break;
            case 6:
                View view = (View) obj6;
                int A0M = AnonymousClass7TE.A0M(obj5);
                C55748Hmj hmj = (C55748Hmj) obj4;
                DbY.A1S(view, hmj);
                return new VistaViewPoint(view, DspPointContextHelper.A00, hmj, A0M);
            case 7:
            case 8:
            case 9:
                1Xj r122 = (1Xj) obj6;
                ((GBI) this.receiver).A0D(r122, AnonymousClass7TE.A1a(obj5), C51975G9x.A1X(obj4, r122));
                break;
            case 10:
                C267324bN r123 = (C267324bN) obj6;
                ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) obj5;
                AnonymousClass8ZN r11 = (AnonymousClass8ZN) obj4;
                AnonymousClass7TG.A1T(r123, clipsViewerConfig, r11);
                GBL gbl = (GBL) this.receiver;
                1Xj r14 = r123.A02;
                if (r14 == null || !C51971G9r.A1a(r14, gbl.A04)) {
                    z = false;
                } else {
                    GF2.A00(gbl.A03, AnonymousClass05K.A01);
                    JU5 ju5 = gbl.A02;
                    C51971G9r.A1P(ju5, ju5.A0N, 3);
                    boolean z2 = !C51971G9r.A1a(r123, gbl.A05);
                    FragmentActivity fragmentActivity = gbl.A00;
                    UserSession userSession = gbl.A01;
                    String A0j = AnonymousClass7TG.A0j();
                    String str11 = clipsViewerConfig.A16;
                    if (str11 == null) {
                        str11 = r123.A0C();
                    }
                    String str12 = clipsViewerConfig.A17;
                    if (str12 == null) {
                        str12 = r123.A0Q;
                    }
                    String str13 = r123.A0Q;
                    C67231sQ A0n = C51966G9m.A0n(r14);
                    if (A0n == null || (Adl = A0n.Adl()) == null) {
                        str = null;
                    } else {
                        str = Adl.getBestAudioClusterId();
                    }
                    C52273GLp.A00(fragmentActivity, r11, r123, userSession, r14, A0j, str11, str12, str13, str, AnonymousClass7TG.A0j(), z2);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                C52318GNk gNk = (C52318GNk) obj6;
                C52317GNj gNj = (C52317GNj) obj4;
                DbY.A1S(gNk, gNj);
                ((JR1) this.receiver).AGC((C267324bN) obj5, gNk, gNj);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C267324bN r124 = (C267324bN) obj6;
                C52058GDe gDe = (C52058GDe) obj5;
                View view2 = (View) obj4;
                AnonymousClass7TG.A1T(r124, gDe, view2);
                ((JTC) this.receiver).DJh(view2, r124, gDe);
                break;
            case 13:
                View view3 = (View) obj6;
                Reel reel = (Reel) obj4;
                DbY.A1S(view3, reel);
                GBD gbd = (GBD) this.receiver;
                AnonymousClass32A r10 = gbd.A02;
                r10.A05 = new C16165Upq((Activity) gbd.A00, view3, (C230222pE) new C57304IWn(obj5, 4));
                r10.A0C = AnonymousClass7TF.A0b();
                r10.A05(reel, AnonymousClass3BQ.CLIPS_VIEWER_AUTHOR_STORY_RING, (AnonymousClass3N3) null, AnonymousClass7TE.A1I(reel), AnonymousClass7TE.A1I(reel), AnonymousClass7TE.A1I(reel));
                break;
            case 14:
                C55813Hnt hnt = (C55813Hnt) obj6;
                1Xj r5 = (1Xj) obj5;
                AnonymousClass3W1 r112 = (AnonymousClass3W1) obj4;
                AnonymousClass7TG.A1T(hnt, r5, r112);
                GBD gbd2 = (GBD) this.receiver;
                FragmentActivity fragmentActivity2 = gbd2.A00;
                UserSession userSession2 = gbd2.A01;
                DbW.A0x(C55081Hbq.A00(hnt), new C15383Ubh(), DbU.A0Q(fragmentActivity2, userSession2));
                if (r112.A1p && GED.A03(userSession2, r5)) {
                    DbX.A10(fragmentActivity2, AnonymousClass37D.A00);
                    break;
                }
            case 15:
                AnonymousClass7TG.A1N(obj6, obj5);
                0sK r0 = ((GBM) this.receiver).A00;
                if (r0 != null) {
                    r0.invoke(obj6, obj5, obj4);
                    break;
                } else {
                    0qQ.A0F("displayOrganicOverflowMenu");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 16:
            case 17:
                C2606046i r125 = (C2606046i) obj6;
                28D r52 = (28D) obj5;
                ClipsCameraCommandAction clipsCameraCommandAction = (ClipsCameraCommandAction) obj4;
                boolean A1U = AnonymousClass7TF.A1U(0, r125, r52);
                I4A i4a = (I4A) this.receiver;
                UserSession userSession3 = i4a.A04;
                Integer num = null;
                ClipsCameraCommandAction clipsCameraCommandAction2 = null;
                AnonymousClass8JL r102 = AnonymousClass8JL.NONE;
                C2801950r r16 = C2801950r.CLIPS;
                Set A0N = C51976G9y.A0N(r52);
                MusicAttributionConfig Col = r125.Col(i4a.A01);
                String audioAssetId = r125.getAudioAssetId();
                if (clipsCameraCommandAction != null) {
                    clipsCameraCommandAction2 = clipsCameraCommandAction;
                    if (clipsCameraCommandAction == ClipsCameraCommandAction.USE_AUDIO_TRIMMING) {
                        num = AnonymousClass05K.A00;
                    }
                }
                I3M.A01(i4a.A02, AEX.A00(r52, (293) null, (AnonymousClass8ZN) null, clipsCameraCommandAction2, (AnonymousClass84B) null, r102, (C279584ys) null, (ImageUrl) null, (C279284yO) null, (SharePlatformStickerClientModel) null, (ReelsVisualRepliesModel) null, r16, (AnonymousClass8JI) null, (DirectCameraViewModel) null, Col, (AudioOverlayTrack) null, (InstagramAudioApplySource) null, (PendingRecipient) null, (PromptStickerModel) null, (QuestionResponseReshareModel) null, (Boolean) null, num, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, audioAssetId, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, A0N, false, false, false, false, false, false, false, false, false, false, false, A1U, false, false, false, false, A1U), i4a.A03, r52, userSession3, A1U, false);
                break;
            default:
                return null;
        }
        return C60340gF.A00;
    }
}
