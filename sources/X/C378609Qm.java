package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.9Qm  reason: invalid class name and case insensitive filesystem */
public final class C378609Qm extends AnonymousClass4DH implements AnonymousClass4DR, B1Q, C70992Zi, C60580id {
    public static final String __redex_internal_original_name = "ClipsCameraFragment";
    public 28D A00 = 28D.A5J;
    public C2366634p A01;
    public AnonymousClass80Q A02;
    public String A03 = "clips_precapture_camera";
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C48143EZl A07;
    public 293 A08;
    public AnonymousClass8ZN A09;
    public MYU A0A;
    public ACRType A0B;
    public ClipsCameraCommandAction A0C;
    public AnonymousClass84B A0D;
    public AnonymousClass8JL A0E = AnonymousClass8JL.NONE;
    public C270564gw A0F;
    public ImageUrl A0G;
    public TouchInterceptorFrameLayout A0H;
    public CropInfo A0I;
    public C279284yO A0J = AnonymousClass80N.A00;
    public SharePlatformStickerClientModel A0K;
    public ReelsVisualRepliesModel A0L;
    public C41837B2s A0M;
    public AnonymousClass80C A0N;
    public C2801950r A0O = C2801950r.CLIPS;
    public AnonymousClass8JI A0P;
    public DirectCameraViewModel A0Q;
    public MusicAttributionConfig A0R;
    public AudioOverlayTrack A0S;
    public AudioOverlayTrack A0T;
    public InstagramAudioApplySource A0U;
    public PendingRecipient A0V;
    public PromptStickerModel A0W;
    public QuestionResponseReshareModel A0X;
    public 2L6 A0Y;
    public Boolean A0Z;
    public Integer A0a = AnonymousClass05K.A0C;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public ArrayList A13;
    public ArrayList A14;
    public ArrayList A15;
    public ArrayList A16;
    public ArrayList A17;
    public ArrayList A18;
    public ArrayList A19;
    public ArrayList A1A;
    public List A1B;
    public List A1C;
    public List A1D;
    public Set A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R = true;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U = true;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public final AnonymousClass0eM A1Y = AnonymousClass0eN.A01(new C58679Ivo(this, 48));
    public final AnonymousClass0eM A1Z = C227642jf.A02(this);

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029f, code lost:
        if (r3.A0P == X.AnonymousClass8JI.REMIX) goto L_0x02a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.os.Bundle r32) {
        /*
            r31 = this;
            r2 = 0
            r3 = r31
            r3.A1Q = r2
            X.80C r0 = new X.80C
            r0.<init>()
            r3.A0N = r0
            r3.registerLifecycleListener(r0)
            r1 = 11
            X.WUP r0 = new X.WUP
            r0.<init>(r3, r1)
            r3.A0M = r0
            X.28D r4 = r3.A00
            X.28D r0 = X.28D.A2c
            r1 = 1
            if (r4 == r0) goto L_0x0023
            X.28D r0 = X.28D.A5H
            if (r4 != r0) goto L_0x0048
        L_0x0023:
            java.util.ArrayList r0 = r3.A17
            if (r0 == 0) goto L_0x0088
            int r10 = r0.size()
        L_0x002b:
            X.0eM r4 = r3.A1Z
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.8A2 r5 = X.AnonymousClass8A1.A01(r0)
            X.28D r6 = r3.A00
            X.4yO r0 = r3.A0J
            java.lang.String r8 = r0.A02
            X.50r r7 = r3.A0O
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r9 = X.AnonymousClass7TF.A0g(r0)
            r5.A04(r6, r7, r8, r9, r10)
        L_0x0048:
            java.util.Set r5 = r3.A1E
            if (r5 == 0) goto L_0x0081
            r0 = 2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            X.4yO r0 = r3.A0J
            r4.add(r0)
            X.4yO[] r0 = new X.C279284yO[r2]
            java.lang.Object[] r0 = r5.toArray(r0)
            X.0tw.A00(r0, r4)
            int r0 = r4.size()
            X.4yO[] r0 = new X.C279284yO[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.util.List r4 = X.0sr.A1P(r0)
        L_0x006e:
            X.80D r5 = X.AnonymousClass80D.A00()
            X.B2s r0 = r3.A0M
            r6 = 0
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "quickCaptureEnvironment"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0081:
            X.4yO r0 = r3.A0J
            java.util.List r4 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x006e
        L_0x0088:
            r10 = 1
            goto L_0x002b
        L_0x008a:
            r5.A0l = r0
            X.0eM r0 = r3.A1Z
            r30 = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r30)
            r0.getClass()
            r5.A0S = r0
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r5.A05 = r0
            r5.A0M = r3
            X.80I r8 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r30)
            X.4yO[] r0 = new X.C279284yO[r2]
            java.lang.Object[] r4 = r4.toArray(r0)
            X.4yO[] r4 = (X.C279284yO[]) r4
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            X.4yO[] r0 = (X.C279284yO[]) r0
            X.80H r0 = r8.A01(r7, r0)
            r0.getClass()
            r5.A0W = r0
            boolean r0 = r3.A05
            r0 = r0 ^ 1
            r5.A3h = r0
            X.2k2 r0 = r3.volumeKeyPressController
            r5.A0R = r0
            X.80C r0 = r3.A0N
            r0.getClass()
            r5.A0t = r0
            android.view.View r4 = r3.mView
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r4, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.getClass()
            r5.A09 = r4
            X.28D r0 = r3.A00
            r5.A0B = r0
            r5.A0O = r3
            r5.A0r = r3
            r5.A3i = r2
            r5.A3F = r1
            X.4yO r4 = r3.A0J
            X.8aL[] r0 = new X.C358088aL[r2]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = X.C358098aM.A00(r4, r0)
            r5.A0V = r0
            r5.A3H = r1
            X.9Qp r0 = new X.9Qp
            r0.<init>(r3)
            r5.A0f = r0
            boolean r0 = r3.A1H
            r5.A38 = r0
            r5.A3Q = r1
            r5.A3N = r1
            java.lang.String r0 = r3.A0j
            r16 = r0
            X.50r r0 = r3.A0O
            r29 = r0
            X.8JL r0 = r3.A0E
            r28 = r0
            java.lang.Integer r0 = r3.A0a
            r27 = r0
            java.lang.String r0 = r3.A0n
            r17 = r0
            java.lang.String r0 = r3.A0l
            r18 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r3.A0G
            r26 = r0
            java.util.ArrayList r0 = r3.A19
            r23 = r0
            java.lang.String r15 = r3.A0w
            java.lang.String r14 = r3.A0x
            java.lang.String r13 = r3.A10
            X.4gw r12 = r3.A0F
            boolean r11 = r3.A1O
            boolean r10 = r3.A1N
            X.293 r9 = r3.A08
            X.EZl r8 = r3.A07
            java.lang.String r7 = r3.A0i
            com.instagram.api.schemas.ClipsCameraCommandAction r4 = r3.A0C
            X.9Qn r0 = new X.9Qn
            r19 = r15
            r20 = r14
            r21 = r13
            r22 = r7
            r24 = r11
            r25 = r10
            r7 = r0
            r10 = r4
            r11 = r28
            r13 = r26
            r14 = r29
            r15 = r27
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r5.A13 = r0
            r5.A3g = r1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = r3.A0V
            if (r0 == 0) goto L_0x039c
            X.80E r0 = X.AnonymousClass80E.GROUP_PROFILE
        L_0x015e:
            r5.A0y = r0
            java.util.ArrayList r0 = r3.A17
            r5.A2t = r0
            java.util.ArrayList r0 = r3.A18
            r5.A2u = r0
            java.util.List r0 = r3.A1B
            r5.A2x = r0
            com.instagram.creation.base.CropInfo r0 = r3.A0I
            r5.A0T = r0
            boolean r0 = r3.A1J
            r5.A3A = r0
            boolean r0 = r3.A1F
            r5.A34 = r0
            java.lang.String r0 = r3.A0q
            r5.A2Y = r0
            java.lang.String r0 = r3.A0g
            r5.A2M = r0
            java.util.ArrayList r0 = r3.A1A
            r5.A2v = r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A0T
            r5.A1P = r0
            com.instagram.api.schemas.ACRType r0 = r3.A0B
            r5.A0G = r0
            java.lang.String r0 = r3.A0r
            r5.A2Z = r0
            java.lang.String r0 = r3.A0s
            r5.A2a = r0
            java.lang.String r4 = r3.A0t
            if (r4 == 0) goto L_0x0399
            java.util.Map r0 = com.instagram.api.schemas.MusicProduct.A01
            java.lang.Object r0 = r0.get(r4)
            com.instagram.api.schemas.MusicProduct r0 = (com.instagram.api.schemas.MusicProduct) r0
            if (r0 != 0) goto L_0x01a4
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.UNRECOGNIZED
        L_0x01a4:
            r5.A0K = r0
            X.28D r4 = r3.A00
            X.28D r0 = X.28D.A1n
            boolean r0 = X.AnonymousClass7TF.A1W(r4, r0)
            r5.A41 = r0
            X.84B r0 = r3.A0D
            r5.A0L = r0
            boolean r7 = r3.A1K
            boolean r4 = r3.A1L
            boolean r0 = r3.A1M
            r5.A3O = r7
            r5.A3a = r4
            r5.A3p = r0
            java.lang.String r0 = r3.A0u
            r5.A2b = r0
            X.8ZN r0 = r3.A09
            r5.A0C = r0
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = r3.A0V
            r5.A1S = r0
            boolean r0 = r3.A1V
            r5.A42 = r0
            java.lang.String r0 = r3.A0b
            r5.A2D = r0
            boolean r0 = r3.A1T
            r5.A3w = r0
            boolean r0 = r3.A1W
            r5.A45 = r0
            java.util.ArrayList r0 = r3.A16
            r5.A2w = r0
            boolean r0 = r3.A1I
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A21 = r0
            boolean r0 = r3.A1X
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A24 = r0
            java.lang.String r0 = "clips_gallery"
            r5.A2S = r0
            boolean r0 = r3.A1U
            r5.A3z = r0
            r5.A3J = r1
            com.instagram.music.common.config.MusicAttributionConfig r0 = r3.A0R
            if (r0 == 0) goto L_0x0200
            r5.A1N = r0
        L_0x0200:
            java.lang.String r0 = r3.A0y
            if (r0 == 0) goto L_0x0206
            r5.A2j = r0
        L_0x0206:
            java.lang.String r0 = r3.A0f
            if (r0 == 0) goto L_0x020c
            r5.A2L = r0
        L_0x020c:
            com.instagram.music.common.model.InstagramAudioApplySource r0 = r3.A0U
            if (r0 == 0) goto L_0x0212
            r5.A1Q = r0
        L_0x0212:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A0S
            if (r0 == 0) goto L_0x0218
            r5.A1O = r0
        L_0x0218:
            X.4gw r0 = r3.A0F
            if (r0 == 0) goto L_0x022e
            X.4yi r0 = r0.Ad4()
            if (r0 == 0) goto L_0x022e
            java.lang.String r0 = r0.getTemplateMediaId()
            if (r0 == 0) goto L_0x022e
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 != 0) goto L_0x023c
        L_0x022e:
            X.4gw r0 = r3.A0F
            if (r0 == 0) goto L_0x0260
            long r7 = r0.getTemplateClipsMediaId()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            if (r0 == 0) goto L_0x0260
        L_0x023c:
            X.4gw r0 = r3.A0F
            if (r0 == 0) goto L_0x0252
            X.4yi r0 = r0.Ad4()
            if (r0 == 0) goto L_0x0252
            java.lang.String r0 = r0.getTemplateMediaId()
            if (r0 == 0) goto L_0x0252
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 != 0) goto L_0x025e
        L_0x0252:
            X.4gw r0 = r3.A0F
            if (r0 == 0) goto L_0x0396
            long r7 = r0.getTemplateClipsMediaId()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
        L_0x025e:
            r5.A2A = r0
        L_0x0260:
            java.lang.String r0 = r3.A0m
            if (r0 == 0) goto L_0x0266
            r5.A2G = r0
        L_0x0266:
            java.lang.String r0 = r3.A0k
            if (r0 == 0) goto L_0x026c
            r5.A2F = r0
        L_0x026c:
            java.lang.Boolean r0 = r3.A0Z
            if (r0 == 0) goto L_0x0272
            r5.A20 = r0
        L_0x0272:
            java.lang.String r0 = r3.A0h
            if (r0 == 0) goto L_0x027c
            X.8aL r0 = X.C358088aL.valueOf(r0)
            r5.A0X = r0
        L_0x027c:
            java.lang.String r0 = r3.A0c
            if (r0 == 0) goto L_0x0282
            r5.A2I = r0
        L_0x0282:
            java.lang.String r0 = r3.A0d
            if (r0 == 0) goto L_0x0288
            r5.A2J = r0
        L_0x0288:
            java.lang.String r0 = r3.A0e
            if (r0 == 0) goto L_0x028e
            r5.A2K = r0
        L_0x028e:
            java.lang.String r0 = r3.A11
            if (r0 == 0) goto L_0x0294
            r5.A2m = r0
        L_0x0294:
            java.lang.String r0 = r3.A0j
            if (r0 != 0) goto L_0x02a1
            r30.getValue()
            X.8JI r4 = r3.A0P
            X.8JI r0 = X.AnonymousClass8JI.REMIX
            if (r4 != r0) goto L_0x02a3
        L_0x02a1:
            r5.A3y = r1
        L_0x02a3:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x02b7
            r5.A47 = r1
            r7 = 0
            r5.A06 = r6
            r5.A07 = r6
            r5.A3r = r2
            r5.A3v = r2
            r5.A33 = r1
            r5.A04 = r7
        L_0x02b7:
            java.lang.String r0 = r3.A12
            if (r0 == 0) goto L_0x02e9
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02e9
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r30)
            java.lang.String r4 = r3.A12
            X.8JI r0 = r3.A0P
            if (r0 != 0) goto L_0x02cd
            X.8JI r0 = X.AnonymousClass8JI.REMIX
        L_0x02cd:
            X.82i r7 = X.C52345GOp.A01(r7, r0, r4)
            if (r7 == 0) goto L_0x0390
            X.1Xj r0 = r7.A04
            com.instagram.model.mediasize.ImageInfo r4 = r0.A1p()
            java.lang.String r0 = r0.A30()
            r5.A2q = r6
            r5.A1K = r4
            r5.A2l = r0
            r5.A37 = r2
            r5.A3V = r2
            r5.A18 = r7
        L_0x02e9:
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r3.A0L
            if (r0 == 0) goto L_0x02ef
            r5.A0k = r0
        L_0x02ef:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0W
            if (r0 == 0) goto L_0x02f5
            r5.A1g = r0
        L_0x02f5:
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r0 = r3.A0K
            if (r0 == 0) goto L_0x02fb
            r5.A0a = r0
        L_0x02fb:
            com.instagram.reels.question.model.QuestionResponseReshareModel r0 = r3.A0X
            if (r0 == 0) goto L_0x0301
            r5.A1i = r0
        L_0x0301:
            java.lang.String r0 = r3.A0p
            if (r0 == 0) goto L_0x030b
            r5.A2V = r0
            java.lang.String r0 = r3.A0o
            r5.A2T = r0
        L_0x030b:
            com.instagram.api.schemas.ClipsCameraCommandAction r2 = com.instagram.api.schemas.ClipsCameraCommandAction.GREEN_SCREEN_CAMERA_TOOL_OPEN
            com.instagram.api.schemas.ClipsCameraCommandAction r0 = r3.A0C
            if (r2 == r0) goto L_0x031d
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r30)
            java.lang.String r0 = r3.A0m
            boolean r0 = X.C378629Qo.A00(r2, r0)
            if (r0 == 0) goto L_0x0323
        L_0x031d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A26 = r0
        L_0x0323:
            java.util.ArrayList r0 = r3.A14
            if (r0 == 0) goto L_0x0335
            r5.A2s = r0
            boolean r0 = r3.A1S
            r5.A3u = r0
            java.util.ArrayList r0 = r3.A13
            r5.A2r = r0
            java.lang.String r0 = r3.A0z
            r5.A2k = r0
        L_0x0335:
            java.util.List r0 = r3.A1D
            if (r0 == 0) goto L_0x033b
            r5.A2z = r0
        L_0x033b:
            com.instagram.api.schemas.ClipsCameraCommandAction r0 = r3.A0C
            if (r0 == 0) goto L_0x0341
            r5.A0H = r0
        L_0x0341:
            java.lang.String r0 = r3.A0v
            if (r0 == 0) goto L_0x0347
            r5.A2c = r0
        L_0x0347:
            X.9Qq r2 = new X.9Qq
            r2.<init>(r5, r3)
            X.2ff r6 = X.C226112fe.A0B
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r6.A05(r0, r2)
            X.12T r0 = X.AnonymousClass12T.A00
            X.2L6 r5 = new X.2L6
            r5.<init>(r0)
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            X.07Z r2 = r3.getViewLifecycleOwner()
            X.AhQ r0 = new X.AhQ
            r0.<init>(r3, r1)
            r5.A00(r4, r2, r0, r1)
            r3.A0Y = r5
            r1 = r32
            if (r32 == 0) goto L_0x037f
            X.80Q r0 = r3.A02
            if (r0 == 0) goto L_0x037f
            X.80R r0 = r0.A00
            X.8Hx r0 = r0.A1j
            if (r0 == 0) goto L_0x037f
            r0.EIn(r1)
        L_0x037f:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x038f
            X.9Sw r1 = new X.9Sw
            r1.<init>(r3)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r6.A05(r0, r1)
        L_0x038f:
            return
        L_0x0390:
            java.lang.String r0 = r3.A12
            r5.A2l = r0
            goto L_0x02e9
        L_0x0396:
            r0 = r6
            goto L_0x025e
        L_0x0399:
            r0 = r6
            goto L_0x01a4
        L_0x039c:
            X.80E r0 = X.AnonymousClass80E.ALL
            goto L_0x015e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378609Qm.A00(android.os.Bundle):void");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = requireContext().getResources().getConfiguration();
        0qQ.A07(configuration2);
        if (O3Z.A00(configuration2, configuration)) {
            C226132fh.A02();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C353508Hx r0;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        AnonymousClass80Q r02 = this.A02;
        if (r02 != null && (r0 = r02.A00.A1j) != null) {
            r0.onSaveInstanceState(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0H = view.findViewById(R.id.quick_capture_fragment_container);
        this.A1Q = true;
        if (!this.A1G) {
            A00(bundle);
        }
        if (AnonymousClass7TF.A1Z(this.A1Y)) {
            C226112fe.A0B.A05(requireActivity(), new C40926AlY(view));
        }
    }

    public final void DHb(boolean z) {
        String str;
        if (z != this.A06) {
            this.A06 = z;
            if (z) {
                str = "clips_gallery";
            } else {
                str = "clips_precapture_camera";
            }
            this.A03 = str;
            updateModuleNameV2_USE_WITH_CAUTION(str);
            if (!this.A04) {
                this.A04 = true;
                1Jk.A04(this);
            }
            1Jk.A08.A0D(this);
        }
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A1Z.getValue();
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A02;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v17, types: [java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x025c, code lost:
        if (r0.ordinal() != 357) goto L_0x025e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            java.lang.String r6 = "ARGS_CLIPS_TEMPLATE_INFO"
            r0 = -1117699137(0xffffffffbd6143bf, float:-0.05499625)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C378609Qm.super.onCreate(r14)
            android.os.Bundle r1 = r13.mArguments
            if (r1 == 0) goto L_0x0535
            X.0eM r4 = r13.A1Z
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.9PT r3 = new X.9PT
            r3.<init>(r0)
            r13.A0A = r3
            java.lang.String r0 = "init_camera"
            X.34p r0 = r3.A02(r0)
            r13.A01 = r0
            X.MYU r9 = r13.A0A
            r12 = 0
            if (r9 != 0) goto L_0x0034
            java.lang.String r0 = "navigationPerfLogger"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0034:
            android.content.Context r10 = r13.requireContext()
            java.lang.Object r0 = r4.getValue()
            X.0lg r0 = (X.0lg) r0
            X.2cc r11 = X.C71342cb.A00(r0)
            r14 = 0
            r3 = 0
            r9.A0P(r10, r11, r12, r13, r14)
            r0 = 23
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r13.A0j = r0
            java.lang.String r0 = "ARGS_IS_LOADED_FROM_DRAFT"
            boolean r0 = r1.getBoolean(r0)
            r13.A1O = r0
            java.lang.String r0 = "ARGS_MUSIC_ATTRIBUTION_CONFIG"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.music.common.config.MusicAttributionConfig r0 = (com.instagram.music.common.config.MusicAttributionConfig) r0
            r13.A0R = r0
            java.lang.String r0 = "ARGS_EFFECT_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0m = r0
            java.lang.String r0 = "ARGS_EFFECT_ATTRIBUTION_USER_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0k = r0
            java.lang.String r5 = "ARGS_EFFECT_SUPPORTED"
            boolean r0 = r1.containsKey(r5)
            if (r0 == 0) goto L_0x0087
            boolean r0 = r1.getBoolean(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.A0Z = r0
        L_0x0087:
            java.lang.String r0 = "ARGS_EFFECT_NAME"
            java.lang.String r0 = r1.getString(r0)
            r13.A0n = r0
            java.lang.String r0 = "ARGS_EFFECT_AUTHOR_NAME"
            java.lang.String r0 = r1.getString(r0)
            r13.A0l = r0
            java.lang.String r0 = "ARGS_EFFECT_THUMBNAIL_URL"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r13.A0G = r0
            java.lang.String r0 = "ARGS_PRELOAD_EFFECT_IDS"
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            r13.A19 = r0
            java.lang.String r0 = "ARGS_PRELOAD_EFFECT_COLLECTION_NAME"
            java.lang.String r0 = r1.getString(r0)
            r13.A0w = r0
            java.lang.String r0 = "ARGS_CAMERA_TOOL_NAME"
            java.lang.String r0 = r1.getString(r0)
            r13.A0h = r0
            java.lang.String r0 = "ARGS_CAMERA_TOOL_ID"
            r1.getString(r0)
            java.lang.String r0 = "ARGS_AUDIO_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0c = r0
            java.lang.String r0 = "ARGS_SONG_ISRC"
            java.lang.String r0 = r1.getString(r0)
            r13.A0y = r0
            java.lang.String r0 = "ARGS_AUDIO_PLATFORM_APP_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0f = r0
            java.lang.String r0 = "ARGS_AUDIO_APPLY_SOURCE"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.music.common.model.InstagramAudioApplySource r0 = (com.instagram.music.common.model.InstagramAudioApplySource) r0
            r13.A0U = r0
            java.lang.String r0 = "ARGS_AUDIO_OR_EFFECT_MEDIA_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0d = r0
            java.lang.String r0 = "ARGS_AUDIO_OR_EFFECT_MEDIA_RANKING_TOKEN"
            java.lang.String r0 = r1.getString(r0)
            r13.A0e = r0
            r0 = 407(0x197, float:5.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r13.A05 = r0
            java.lang.String r0 = "ARGS_VISUAL_SOURCE_ORIGINAL_MEDIA_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A12 = r0
            java.lang.String r0 = "ARGS_REELS_VISUAL_REPLIES"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = (com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel) r0
            r13.A0L = r0
            r0 = 32
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            r13.A17 = r0
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            r13.A18 = r0
            r0 = 424(0x1a8, float:5.94E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.getString(r0)
            java.lang.String r0 = "ClipsConstants.ARGS_PREFILL_MEDIA_ID_LIST"
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            if (r0 == 0) goto L_0x015b
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x013f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.String r5 = X.AnonymousClass7TE.A18(r7)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.1E8 r0 = X.1E7.A00(r0)
            X.1Xj r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x013f
            r8.add(r0)
            goto L_0x013f
        L_0x015b:
            r8 = r12
        L_0x015c:
            r13.A1B = r8
            java.lang.String r0 = "ARGS_DIRECT_SHARE_TARGETS"
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            r13.A15 = r0
            java.lang.String r0 = "ARGS_PRELOAD_STICKER_TEXT"
            r1.getString(r0)
            java.lang.String r0 = "ClipsConstants.ARGS_PREFILL_SEGMENT_SERIALIZED_JSON_LIST"
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            if (r0 == 0) goto L_0x018f
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x017b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = X.AnonymousClass7TE.A18(r5)
            X.51M r0 = X.LIO.A00(r0)
            if (r0 == 0) goto L_0x017b
            r7.add(r0)
            goto L_0x017b
        L_0x018f:
            r7 = r12
        L_0x0190:
            r13.A1C = r7
            java.lang.String r0 = "ARGS_PREFILL_MEDIUM_CROP_INFO"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.creation.base.CropInfo r0 = (com.instagram.creation.base.CropInfo) r0
            r13.A0I = r0
            java.lang.String r0 = "ARGS_LINKED_HIGHLIGHT_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0p = r0
            java.lang.String r0 = "ARGS_HIGHLIGHT_MEDIA_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0o = r0
            java.lang.String r0 = "ARGS_SOURCE_MEDIA_USER_NAME"
            java.lang.String r0 = r1.getString(r0)
            r13.A11 = r0
            java.lang.String r0 = "ARGS_SOURCE_MEDIA_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A10 = r0
            java.lang.String r0 = "ARGS_SOURCE_AUDIO_TRACK"
            java.lang.String r0 = r1.getString(r0)
            r13.A0t = r0
            java.lang.String r0 = "ARGS_PRELOAD_CAPTION"
            java.lang.String r0 = r1.getString(r0)
            r13.A0x = r0
            r0 = 33
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r13.A0q = r0
            r0 = 211(0xd3, float:2.96E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r13.A0g = r0
            r0 = 96
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r1.get(r5)
            boolean r0 = r0 instanceof X.28D
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes"
            X.0qQ.A0C(r5, r0)
            X.28D r5 = (X.28D) r5
            r13.A00 = r5
        L_0x01ff:
            r0 = 471(0x1d7, float:6.6E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r5 = r1.getString(r0)
            if (r5 == 0) goto L_0x026c
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r0)
            com.instagram.model.reels.Reel r5 = r0.A0M(r5)
            if (r5 == 0) goto L_0x026c
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            r8 = 0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            java.util.List r0 = r5.A0O(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x022a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0276
            java.lang.Object r0 = r11.next()
            X.3uh r0 = (X.C255773uh) r0
            X.1Xj r10 = r0.A0b
            if (r10 == 0) goto L_0x022a
            X.3QO r5 = r10.A1t()
            X.3QO r0 = X.AnonymousClass3QO.DEFAULT
            if (r5 != r0) goto L_0x022a
            java.lang.String r5 = r10.A2y()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.C379209Sy.A00(r0, r5)
            if (r0 != 0) goto L_0x022a
            X.28D r0 = r13.A00
            if (r0 == 0) goto L_0x025e
            int r5 = r0.ordinal()
            r0 = 357(0x165, float:5.0E-43)
            r7 = 10
            if (r5 == r0) goto L_0x0260
        L_0x025e:
            r7 = 50
        L_0x0260:
            if (r8 >= r7) goto L_0x022a
            java.lang.String r0 = r10.getId()
            r9.add(r0)
            int r8 = r8 + 1
            goto L_0x022a
        L_0x026c:
            r0 = 209(0xd1, float:2.93E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r9 = r1.getStringArrayList(r0)
        L_0x0276:
            r13.A1A = r9
            r0 = 888(0x378, float:1.244E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            r13.A0T = r0
            r0 = 55
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0366
            com.instagram.api.schemas.ACRType r0 = X.C378199Ow.A00(r0)
        L_0x0296:
            r13.A0B = r0
            r0 = 2150(0x866, float:3.013E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r5 = r1.getSerializable(r0)
            boolean r0 = r5 instanceof X.C48143EZl
            if (r0 == 0) goto L_0x0363
            X.EZl r5 = (X.C48143EZl) r5
        L_0x02a8:
            r13.A07 = r5
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_DRAFT_COVER_PHOTO_FILE_URI"
            java.lang.String r0 = r1.getString(r0)
            r13.A0i = r0
            java.lang.String r0 = "ClipsConstants.ARG_PIVOT_PAGE_SESSION_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0u = r0
            java.lang.String r0 = "ClipsConstants.ARG_PIVOT_PAGE_ENTRY_POINT"
            java.io.Serializable r5 = r1.getSerializable(r0)
            boolean r0 = r5 instanceof X.AnonymousClass8ZN
            if (r0 == 0) goto L_0x0360
            X.8ZN r5 = (X.AnonymousClass8ZN) r5
        L_0x02c6:
            r13.A09 = r5
            java.lang.String r0 = "ARGS_TARGET_GROUP_PROFILE"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            r13.A0V = r0
            java.lang.String r0 = "ARGS_MEDIA_PRIOR_TO_CAMERA_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0r = r0
            java.lang.String r0 = "ARGS_MEDIA_PRIOR_TO_CAMERA_RANKING_TOKEN"
            java.lang.String r0 = r1.getString(r0)
            r13.A0s = r0
            java.lang.String r0 = "ARGS_EFFECT_SOURCE"
            java.io.Serializable r5 = r1.getSerializable(r0)
            boolean r0 = r5 instanceof X.AnonymousClass84B
            if (r0 == 0) goto L_0x035e
            X.84B r5 = (X.AnonymousClass84B) r5
        L_0x02ee:
            r13.A0D = r5
            r0 = 497(0x1f1, float:6.96E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            r13.A14 = r0
            r0 = 88
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r13.A1S = r0
            r0 = 87
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            r13.A13 = r0
            r0 = 89
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r13.A0z = r0
            r0 = 19
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.io.Serializable r5 = r1.getSerializable(r0)
            boolean r0 = r5 instanceof X.C2801950r
            if (r0 == 0) goto L_0x0332
            X.50r r5 = (X.C2801950r) r5
            if (r5 != 0) goto L_0x0334
        L_0x0332:
            X.50r r5 = X.C2801950r.CLIPS
        L_0x0334:
            r13.A0O = r5
            java.lang.String r5 = "ARGS_ADDITIONAL_CAMERA_DESTINATION"
            boolean r0 = r1.containsKey(r5)
            if (r0 == 0) goto L_0x0371
            java.util.ArrayList r0 = r1.getStringArrayList(r5)
            if (r0 == 0) goto L_0x0369
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x034c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x036b
            java.lang.String r0 = X.AnonymousClass7TE.A18(r5)
            X.4yO r0 = X.C338817ia.A00(r0)
            r7.add(r0)
            goto L_0x034c
        L_0x035e:
            r5 = r12
            goto L_0x02ee
        L_0x0360:
            r5 = r12
            goto L_0x02c6
        L_0x0363:
            r5 = r12
            goto L_0x02a8
        L_0x0366:
            r0 = r12
            goto L_0x0296
        L_0x0369:
            r0 = r12
            goto L_0x036f
        L_0x036b:
            java.util.Set r0 = X.00k.A0k(r7)
        L_0x036f:
            r13.A1E = r0
        L_0x0371:
            java.lang.String r5 = "ARGS_CAMERA_CONFIGURATION_DESTINATION"
            boolean r0 = r1.containsKey(r5)
            if (r0 == 0) goto L_0x0383
            java.lang.String r0 = r1.getString(r5)
            X.4yO r0 = X.C338817ia.A00(r0)
            r13.A0J = r0
        L_0x0383:
            java.lang.String r7 = "ARGS_CAMERA_SUB_SCREEN_DESTINATION"
            java.lang.Object r0 = r1.get(r7)
            if (r0 == 0) goto L_0x0398
            r0 = 3
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r0 = r1.getInt(r7)
            r0 = r5[r0]
            r13.A0a = r0
        L_0x0398:
            java.lang.String r5 = "ARGS_SUGGESTED_CAMERA_SETTINGS"
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L_0x03ad
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.clips.enums.SuggestedCameraSettings"
            X.0qQ.A0C(r5, r0)
            X.8JL r5 = (X.AnonymousClass8JL) r5
            r13.A0E = r5
        L_0x03ad:
            java.lang.String r0 = "ARGS_VISUAL_SOURCE_CREATION_STATE"
            java.io.Serializable r5 = r1.getSerializable(r0)
            boolean r0 = r5 instanceof X.AnonymousClass8JI
            if (r0 == 0) goto L_0x03ba
            r12 = r5
            X.8JI r12 = (X.AnonymousClass8JI) r12
        L_0x03ba:
            r13.A0P = r12
            java.lang.String r0 = "ARGS_HIDE_UNSAVED_DRAFT"
            boolean r0 = r1.getBoolean(r0)
            r13.A1J = r0
            java.lang.String r0 = "ARGS_AUTO_LOAD_UNSAVED_DRAFT"
            boolean r0 = r1.getBoolean(r0)
            r13.A1F = r0
            java.lang.String r0 = "ARGS_HIDE_CAMERA_DESTINATION_PICKER"
            boolean r0 = r1.getBoolean(r0)
            r13.A1I = r0
            java.lang.String r0 = "ARGS_IS_EXCLUSIVE_BY_DEFAULT"
            boolean r0 = r1.getBoolean(r0)
            r13.A1K = r0
            java.lang.String r0 = "ARGS_IS_FAN_CLUB_PROMO_VIDEO"
            boolean r0 = r1.getBoolean(r0)
            r13.A1L = r0
            java.lang.String r0 = "ARGS_IS_FAN_CLUB_WELCOME_VIDEO"
            boolean r0 = r1.getBoolean(r0)
            r13.A1M = r0
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_FINISH_ACTIVITY_AFTER_POST"
            r5 = 1
            boolean r0 = r1.getBoolean(r0, r5)
            r13.A1H = r0
            java.lang.String r0 = "ARGS_APP_ATTRIBUTION_NAMESPACE"
            java.lang.String r0 = r1.getString(r0)
            r13.A0b = r0
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_IS_OPEN_FROM_CAMERA_GALLERY"
            boolean r0 = r1.getBoolean(r0)
            r13.A1N = r0
            r0 = 213(0xd5, float:2.98E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r1.getBoolean(r0, r14)
            r13.A1T = r0
            java.lang.String r0 = "ClipsConstants.ARG_SHOULD_SKIP_TO_POST_CAPTURE"
            boolean r0 = r1.getBoolean(r0, r14)
            r13.A1W = r0
            java.lang.String r0 = "ClipsConstants.ARGS_PREDEFINED_HIGHLIGHTS_START_TIME_IN_MS"
            java.util.ArrayList r0 = r1.getIntegerArrayList(r0)
            r13.A16 = r0
            java.lang.String r0 = "ARGS_PRELOAD_CUTOUT_STICKER_SOURCE_MEDIA_ID"
            java.lang.String r0 = r1.getString(r0)
            r13.A0v = r0
            java.lang.String r0 = "ARGS_SHOULD_EXIT_CREATION_AFTER_CLIPS_DRAFT_EDIT"
            boolean r0 = r1.getBoolean(r0, r5)
            r13.A1U = r0
            java.lang.String r0 = r1.getString(r6)     // Catch:{ IOException -> 0x0476 }
            if (r0 == 0) goto L_0x0445
            java.lang.String r0 = X.C320236s2.A01(r1, r6)     // Catch:{ IOException -> 0x0476 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x0476 }
            X.4ys r0 = X.C67211sN.parseFromJson(r0)     // Catch:{ IOException -> 0x0476 }
            r13.A0F = r0     // Catch:{ IOException -> 0x0476 }
        L_0x0445:
            java.lang.String r0 = "REUSABLE_TEXT_INFO"
            java.util.ArrayList r6 = r1.getStringArrayList(r0)     // Catch:{ IOException -> 0x0476 }
            if (r6 == 0) goto L_0x048b
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0476 }
            r13.A1D = r0     // Catch:{ IOException -> 0x0476 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0476 }
            java.util.Iterator r6 = X.AnonymousClass7TE.A1G(r6)     // Catch:{ IOException -> 0x0476 }
        L_0x045b:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x0476 }
            if (r0 == 0) goto L_0x0473
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r6)     // Catch:{ IOException -> 0x0476 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0476 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x0476 }
            X.3ik r0 = X.AnonymousClass3i0.parseFromJson(r0)     // Catch:{ IOException -> 0x0476 }
            r7.add(r0)     // Catch:{ IOException -> 0x0476 }
            goto L_0x045b
        L_0x0473:
            r13.A1D = r7     // Catch:{ IOException -> 0x0476 }
            goto L_0x048b
        L_0x0476:
            X.0wj r7 = X.0wj.A01
            r6 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsCameraFragment"
            X.0f9 r7 = r7.AEf(r0, r6)
            java.lang.String r6 = "message"
            java.lang.String r0 = "Error getting json parameters"
            r7.ABQ(r6, r0)
            r7.report()
        L_0x048b:
            java.lang.String r0 = "ARGS_TEMPLATE_BROWSER_ENTRY_POINT"
            java.io.Serializable r0 = r1.getSerializable(r0)
            X.293 r0 = (X.293) r0
            r13.A08 = r0
            java.lang.String r0 = "ARGS_CLIPS_PROMP_STICKER"
            android.os.Parcelable r6 = r1.getParcelable(r0)
            com.instagram.api.schemas.StoryPromptTappableData r6 = (com.instagram.api.schemas.StoryPromptTappableData) r6
            if (r6 == 0) goto L_0x04a6
            com.instagram.reels.prompt.model.PromptStickerModel r0 = new com.instagram.reels.prompt.model.PromptStickerModel
            r0.<init>(r6)
            r13.A0W = r0
        L_0x04a6:
            java.lang.String r0 = "ARGS_SHOW_COLLAB_EDUCATION_FLOW"
            boolean r0 = r1.getBoolean(r0)
            r13.A1X = r0
            java.lang.String r0 = "ARGS_CLIPS_SHARE_PLATFORM_STICKER"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r0 = (com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel) r0
            r13.A0K = r0
            java.lang.String r0 = "ARGS_CLIPS_QUESTION_RESPONSE_RESHARE_STICKER"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.reels.question.model.QuestionResponseReshareModel r0 = (com.instagram.reels.question.model.QuestionResponseReshareModel) r0
            r13.A0X = r0
            java.lang.String r0 = "ClipsConstants.ARG_SHOULD_RETAIN_AUDIO_AFTER_RESTART_CAPTURE"
            boolean r0 = r1.getBoolean(r0, r14)
            r13.A1V = r0
            java.lang.String r0 = "DIRECT_CAMERA_VIEW_MODEL"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = (com.instagram.model.direct.camera.DirectCameraViewModel) r0
            r13.A0Q = r0
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_ATTRIBUTION_ONLY_AUDIO_OVERLAY_TRACK"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            r13.A0S = r0
            java.lang.String r0 = "ClipsConstants.ARGS_CLIPS_CAMERA_COMMAND_ACTION"
            java.io.Serializable r0 = r1.getSerializable(r0)
            com.instagram.api.schemas.ClipsCameraCommandAction r0 = (com.instagram.api.schemas.ClipsCameraCommandAction) r0
            r13.A0C = r0
            java.lang.String r0 = "ClipsConstants.ARGS_REINITIALIZE_DRAFTS_REPOSITORY"
            boolean r0 = r1.getBoolean(r0, r5)
            r13.A1R = r0
            java.lang.String r0 = "ARGS_DELAYED_QCC_INITIALIZATION"
            boolean r0 = r1.getBoolean(r0, r14)
            r13.A1G = r0
            java.lang.String r0 = r13.A12
            if (r0 == 0) goto L_0x0511
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0511
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.0qQ.A0B(r0, r14)
            X.1wS r1 = X.1wS.A01(r0)
            r0 = 4
            r1.A0C(r0)
        L_0x0511:
            java.lang.String r0 = r13.A03
            r13.setModuleNameV2(r0)
            boolean r0 = r13.A1R
            if (r0 == 0) goto L_0x052e
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r1 = X.AnonymousClass72U.A00(r1, r0)
            r1.A0L()
            X.50r r0 = X.C2801950r.CLIPS
            r1.A0P(r0, r3)
        L_0x052e:
            r0 = 1568667541(0x5d7ff795, float:1.15277341E18)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0535:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1904178930(0x717f76f2, float:1.2649996E30)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378609Qm.onCreate(android.os.Bundle):void");
    }

    public final void DV0(C71162bE r6) {
        C356848Vl r0;
        C356858Vm A002;
        int A0D2 = AnonymousClass7TG.A0D(r6, -2072973224);
        boolean A1Q2 = AnonymousClass7TF.A1Q((r6.A01 > -1.0f ? 1 : (r6.A01 == -1.0f ? 0 : -1)));
        this.A1P = A1Q2;
        if (A1Q2 && this.A1Q && this.A1G) {
            A00((Bundle) null);
        } else if (isResumed() && !this.A1Q && AnonymousClass7TF.A1Z(this.A1Y)) {
            float f = r6.A01;
            AnonymousClass2a4 r02 = r6.A04;
            0qQ.A07(r02);
            float A012 = r02.A01(f);
            AnonymousClass80Q r03 = this.A02;
            if (!(r03 == null || (r0 = r03.A00.A18) == null || (A002 = r0.A00()) == null)) {
                A002.A0A(28D.A0Y, AnonymousClass05K.A0C, A012);
            }
        }
        AnonymousClass0fD.A0A(-1593727350, A0D2);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            C41837B2s b2s = this.A0M;
            if (b2s == null) {
                0qQ.A0F("quickCaptureEnvironment");
                throw AnonymousClass00P.createAndThrow();
            }
            b2s.Cpi("media_posted_to_feed");
            requireActivity().setResult(9691);
            requireActivity().finish();
        }
        if (i == 1) {
            AnonymousClass7TG.A1C(this, i2, 9683);
        }
        if (this.A1T && i == 9583) {
            AnonymousClass7TG.A1C(this, i2, 9685);
        }
        if (this.A0Q != null && i == 9583) {
            AnonymousClass7TG.A1C(this, i2, 9683);
        }
        for (Fragment fragment : getChildFragmentManager().A0U.A04()) {
            if (fragment instanceof C54144H0o) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A022 = AnonymousClass0fD.A02(-1611713665);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = viewGroup;
        if (AnonymousClass7TF.A1Z(this.A1Y)) {
            inflate = 2Su.A01(layoutInflater2, (ViewGroup.LayoutParams) null, viewGroup2, R.layout.layout_quick_capture_controller, false, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.layout_clips_camera_fragment, viewGroup, false);
            0qQ.A0A(inflate);
        }
        AnonymousClass0fD.A09(1816946506, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1324736365);
        super.onDestroy();
        String str = this.A12;
        if (!(str == null || str.length() == 0)) {
            UserSession A0l2 = AnonymousClass7TE.A0l(this.A1Z);
            0qQ.A0B(A0l2, 0);
            1wS.A01(A0l2).A0C(3);
        }
        AnonymousClass0fD.A09(-2046699586, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-201577490);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
        this.A02 = null;
        unregisterLifecycleListener(this.A0N);
        AnonymousClass80C r02 = this.A0N;
        if (r02 != null) {
            r02.onDestroyView();
        }
        this.A0N = null;
        AnonymousClass0fD.A09(539345886, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r4.A1P != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r4 = this;
            r0 = -767761609(0xffffffffd23ce337, float:-2.02816471E11)
            int r3 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            X.MYU r2 = r4.A0A
            if (r2 != 0) goto L_0x0018
            java.lang.String r0 = "navigationPerfLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "destination"
            r2.A0J(r0, r1)
            X.0eM r0 = r4.A1Y
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0049
            android.app.Activity r1 = r4.getRootActivity()
            X.0qQ.A0A(r1)
            X.0eM r0 = r4.A1Z
            r0.getValue()
            X.C357628Yy.A00(r1)
        L_0x0036:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0042
            X.9Sw r0 = new X.9Sw
            r0.<init>(r4)
            X.AnonymousClass7TF.A17(r4, r0)
        L_0x0042:
            r0 = -1231035501(0xffffffffb69fe393, float:-4.7650624E-6)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x0049:
            boolean r0 = r4.A1P
            if (r0 == 0) goto L_0x0042
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378609Qm.onResume():void");
    }
}
