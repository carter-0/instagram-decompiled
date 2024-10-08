package X;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.80R  reason: invalid class name */
public final class AnonymousClass80R {
    public float A00 = 0.55f;
    public 28D A01;
    public C279284yO A02;
    public TargetViewSizeProvider A03;
    public ClipsAssetHubViewModel A04;
    public AVM A05;
    public Runnable A06 = null;
    public boolean A07;
    public final int A08;
    public final Activity A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final C3500082u A0D;
    public final C3503184e A0E;
    public final C3502984c A0F;
    public final C3507686c A0G;
    public final AnonymousClass86W A0H;
    public final AnonymousClass848 A0I;
    public final AnonymousClass4DH A0J;
    public final C357058Wh A0K;
    public final AnonymousClass847 A0L;
    public final AnonymousClass82W A0M;
    public final AnonymousClass84E A0N;
    public final AnonymousClass72N A0O;
    public final 1wn A0P;
    public final AnonymousClass4DM A0Q;
    public final UserSession A0R;
    public final AnonymousClass3E6 A0S;
    public final MultiListenerTextureView A0T;
    public final TouchInterceptorFrameLayout A0U;
    public final C71662eb A0V;
    public final C357638Yz A0W;
    public final C3510387i A0X;
    public final C353828Ji A0Y;
    public final AnonymousClass8S5 A0Z;
    public final AnonymousClass8QA A0a;
    public final AnonymousClass8QN A0b;
    public final AnonymousClass8K4 A0c;
    public final C355948Rz A0d;
    public final AnonymousClass8BA A0e;
    public final AnonymousClass8L1 A0f;
    public final AnonymousClass8LU A0g;
    public final AnonymousClass8MC A0h;
    public final TargetViewSizeProvider A0i;
    public final C3506485o A0j;
    public final C3506485o A0k;
    public final C352888Fl A0l;
    public final AnonymousClass8W6 A0m;
    public final AnonymousClass85X A0n;
    public final C3499582p A0o;
    public final AnonymousClass823 A0p;
    public final AnonymousClass8E7 A0q;
    public final AnonymousClass8FA A0r;
    public final C3509286x A0s;
    public final AnonymousClass872 A0t;
    public final AnonymousClass8B3 A0u;
    public final AnonymousClass80D A0v;
    public final AnonymousClass814 A0w;
    public final AnonymousClass816 A0x;
    public final C3496481e A0y;
    public final AnonymousClass80S A0z = new AnonymousClass80S();
    public final AnonymousClass815 A10;
    public final AnonymousClass81T A11;
    public final C357028Wd A12;
    public final MagicMediaRemixEditController A13;
    public final AnonymousClass8VZ A14;
    public final AnonymousClass8QG A15;
    public final AnonymousClass8WK A16;
    public final C356798Vg A17;
    public final C356848Vl A18;
    public final C3508086k A19;
    public final AnonymousClass88A A1A;
    public final AnonymousClass8FK A1B;
    public final C357068Wi A1C;
    public final C357088Wk A1D;
    public final AnonymousClass817 A1E;
    public final AnonymousClass8AL A1F;
    public final AnonymousClass8DO A1G;
    public final C3503684j A1H;
    public final AnonymousClass8DD A1I;
    public final AnonymousClass8DB A1J;
    public final AnonymousClass86Y A1K;
    public final C3504884v A1L;
    public final AnonymousClass88R A1M;
    public final AnonymousClass8WX A1N;
    public final AnonymousClass85O A1O;
    public final C355898Ru A1P;
    public final C3496881i A1Q;
    public final AnonymousClass88I A1R;
    public final C342887pK A1S;
    public final C357038Wf A1T;
    public final C357178Wv A1U;
    public final C3506685r A1V;
    public final AnonymousClass8E5 A1W;
    public final C3502083s A1X;
    public final AnonymousClass842 A1Y;
    public final C353788Jb A1Z;
    public final C3497281m A1a;
    public final AnonymousClass8H3 A1b;
    public final AnonymousClass88Z A1c;
    public final AnonymousClass8H5 A1d;
    public final AnonymousClass8E6 A1e;
    public final AnonymousClass80U A1f;
    public final AnonymousClass8D8 A1g;
    public final StoryDraftsCreationViewModel A1h;
    public final ClipsAudioMixingDrawerController A1i;
    public final C353508Hx A1j;
    public final ClipsTimelineEditorDrawerController A1k;
    public final C357188Ww A1l;
    public final AnonymousClass88E A1m;
    public final ClipsCreationViewModel A1n;
    public final C3511387s A1o;
    public final ClipsCreationDraftViewModel A1p;
    public final AnonymousClass825 A1q;
    public final C3510287h A1r;
    public final AnonymousClass869 A1s;
    public final AnonymousClass8AA A1t;
    public final AnonymousClass8AE A1u;
    public final AnonymousClass846 A1v;
    public final AnonymousClass8D9 A1w;
    public final C314676if A1x;
    public final C314676if A1y;
    public final C314676if A1z;
    public final C3495780x A20;
    public final AnonymousClass8B2 A21;
    public final AnonymousClass88F A22;
    public final AnonymousClass889 A23;
    public final AnonymousClass88B A24;
    public final C351818An A25;
    public final C3499982t A26;
    public final C352828Fe A27;
    public final AnonymousClass81B A28;
    public final ShareToFriendsStoryDrawerController A29;
    public final AnonymousClass85T A2A;
    public final InteractiveDrawableContainer A2B;
    public final Map A2C = new HashMap();
    public final AnonymousClass0eM A2D;
    public final AnonymousClass0eM A2E;
    public final boolean A2F;
    public final boolean A2G;

    /* JADX WARNING: type inference failed for: r8v2, types: [X.9oC] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass88F A00(android.view.ViewGroup r41, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r42, X.C63708L3s r43, X.C3498982i r44, com.instagram.model.mediasize.ImageInfo r45, java.lang.String r46, java.lang.String r47) {
        /*
            r40 = this;
            r1 = 0
            r11 = r44
            if (r44 != 0) goto L_0x0006
            r1 = 1
        L_0x0006:
            X.A69 r10 = new X.A69
            r0 = r40
            r2 = r43
            r10.<init>(r0, r2, r1)
            android.app.Activity r9 = r0.A09
            r13 = r45
            r36 = r46
            r34 = r47
            if (r1 == 0) goto L_0x00a6
            X.889 r1 = r0.A23
            X.AZB r2 = new X.AZB
            r2.<init>(r9, r1, r13)
            X.80U r1 = r0.A1f
            X.9oC r8 = new X.9oC
            r8.<init>(r9, r1, r2)
        L_0x0027:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r0.A2B
            X.87i r6 = r0.A0X
            X.80D r12 = r0.A0v
            X.82i r1 = r12.A18
            X.AVM r5 = new X.AVM
            r5.<init>(r6, r8, r1, r7)
            if (r44 == 0) goto L_0x00a4
            X.8JI r2 = r11.A00
            X.8JI r1 = X.AnonymousClass8JI.REMIX
            if (r2 == r1) goto L_0x0048
            X.82p r1 = r0.A0o
            X.82o r1 = r1.A02
            X.804 r2 = r8.A02()
            X.82Y r1 = r1.A01
            r1.A06 = r2
        L_0x0048:
            X.A5F r1 = r11.A01
            java.lang.String r4 = r1.A01
        L_0x004c:
            com.instagram.model.mediasize.ExtendedImageUrl r21 = X.1iI.A01(r9, r13)
            r21.getClass()
            r0.A05 = r5
            X.4DH r1 = r0.A0J
            r19 = r1
            X.81m r1 = r0.A1a
            r17 = r1
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r15 = r0.A0i
            X.8Yz r14 = r0.A0W
            X.88E r13 = r0.A1m
            X.A3m r3 = new X.A3m
            r3.<init>(r0)
            com.instagram.common.session.UserSession r2 = r0.A0R
            X.81T r1 = r0.A11
            java.lang.String r37 = r1.getModuleName()
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A52
            r38 = 0
            if (r1 != r0) goto L_0x007a
            r38 = 1
        L_0x007a:
            boolean r0 = r12.A3V
            X.88F r16 = new X.88F
            r18 = r41
            r22 = r42
            r30 = r5
            r31 = r8
            r32 = r11
            r33 = r7
            r35 = r4
            r39 = r0
            r24 = r6
            r25 = r15
            r26 = r10
            r27 = r3
            r28 = r17
            r29 = r13
            r20 = r2
            r23 = r14
            r17 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r16
        L_0x00a4:
            r4 = 0
            goto L_0x004c
        L_0x00a6:
            X.889 r1 = r0.A23
            X.AZA r5 = new X.AZA
            r5.<init>(r9, r1)
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.8Yz r1 = r0.A0W
            X.80m r1 = r1.A08
            java.lang.Object r3 = r1.A00
            X.4yO r3 = (X.C279284yO) r3
            r11.getClass()
            r34.getClass()
            X.87i r2 = r0.A0X
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r0.A0i
            X.9oD r8 = new X.9oD
            r14 = r8
            r15 = r9
            r16 = r4
            r17 = r3
            r18 = r2
            r19 = r1
            r20 = r5
            r21 = r11
            r22 = r34
            r23 = r36
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80R.A00(android.view.ViewGroup, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout, X.L3s, X.82i, com.instagram.model.mediasize.ImageInfo, java.lang.String, java.lang.String):X.88F");
    }

    public static void A01(View view, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass80D r9, boolean z) {
        View inflate;
        int i;
        if (r9.A3m) {
            ((ViewStub) view.requireViewById(R.id.video_pog_in_note_selfie_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.video_pog_in_note_selfie_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.video_pog_in_note_selfie_post_capture_texture_view_container_stub;
        } else if ("story_selfie_reply".equals(r9.A2q)) {
            ((ViewStub) view.requireViewById(R.id.direct_selfie_sticker_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.direct_selfie_sticker_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.direct_selfie_sticker_post_capture_texture_view_container_stub;
        } else if (r9.A3E) {
            ((ViewStub) view.requireViewById(R.id.birthday_selfie_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.birthday_selfie_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.birthday_selfie_post_capture_texture_view_container_stub;
        } else if (r9.A3Z) {
            ((ViewStub) view.requireViewById(R.id.potato_rounded_camera_view_stub)).inflate();
            inflate = ((ViewStub) view.requireViewById(R.id.potato_post_capture_rounded_texture_view_container_stub)).inflate();
            i = R.id.potato_post_capture_texture_view_container_stub;
        } else {
            View requireViewById = view.requireViewById(R.id.default_post_capture_texture_view_container_stub);
            0qQ.A07(requireViewById);
            ((ViewStub) requireViewById).inflate();
            if (!z) {
                int i2 = 0;
                SparseArray sparseArray = AnonymousClass81Y.A01;
                int size = sparseArray.size();
                while (i2 < size) {
                    try {
                        View requireViewById2 = view.requireViewById(sparseArray.keyAt(i2));
                        0qQ.A07(requireViewById2);
                        AnonymousClass81W r1 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
                        0nA.A0f(requireViewById2, r1.getWidth());
                        0nA.A0V(requireViewById2, r1.getHeight());
                        0nA.A0W(requireViewById2, 1);
                        i2++;
                    } catch (IllegalArgumentException e) {
                        throw new RuntimeException(002.A0R("View id not found: R.id.", (String) sparseArray.valueAt(i2)), e);
                    }
                }
                return;
            }
            return;
        }
        ((ViewStub) inflate.requireViewById(i)).inflate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03d5, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36331141241783209L) != false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03f4, code lost:
        if (r6.contains(X.C358088aL.A0B) != false) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0415, code lost:
        if (r16 != false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x026a, code lost:
        if (r12.A07 == false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0320, code lost:
        if (r16 == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x036c, code lost:
        if (r5 == X.AnonymousClass80K.A00) goto L_0x036e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.view.ViewGroup r30, com.instagram.creation.base.ui.grid.GridLinesView r31, com.instagram.creation.cameraconfiguration.CameraConfiguration r32, X.AnonymousClass80R r33, com.instagram.creation.photo.crop.CropHighlightView r34) {
        /*
            r7 = r33
            boolean r0 = r7.A2F
            if (r0 == 0) goto L_0x04d2
            r0 = r32
            java.util.Set r6 = r0.A04
            X.4yO r5 = r0.A03
            X.80U r0 = r7.A1f
            boolean r17 = r0.CZe()
            X.8aL r1 = X.C358088aL.A0C
            boolean r16 = r6.contains(r1)
            com.instagram.common.session.UserSession r4 = r7.A0R
            X.8A2 r2 = X.AnonymousClass8A1.A01(r4)
            X.27r r0 = X.27p.A01(r4)
            X.283 r0 = r0.A04
            java.lang.String r0 = r0.A0L
            r2.A07(r5, r0)
            boolean r3 = r5 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x0517
            java.lang.String r2 = "instagram_reels"
        L_0x002f:
            X.82W r8 = r7.A0M
            X.82X r0 = r8.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            r0.A0B = r2
            X.8Fl r0 = r7.A0l
            X.7l2 r9 = r0.A06
            if (r9 == 0) goto L_0x0057
            X.7rD r0 = r9.B46()
            r0.Egr(r2)
            X.7rD r2 = r9.B46()
            com.instagram.common.session.UserSession r0 = r9.A0J
            X.27r r0 = X.27p.A01(r0)
            X.283 r0 = r0.A04
            java.lang.String r0 = r0.A0L
            r2.Egs(r0)
        L_0x0057:
            X.8aL r0 = X.C358088aL.A0G
            boolean r0 = r6.contains(r0)
            r2 = 0
            if (r0 == 0) goto L_0x007d
            X.82X r0 = r8.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r10 = r0.A05
            X.6dz r0 = r10.A0L
            if (r0 == 0) goto L_0x007d
            r0 = 6
            java.util.SortedMap r9 = r10.A0T
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L_0x007d
            r9.remove(r8)
            com.instagram.camera.effect.mq.IgCameraEffectsController.A02(r10)
        L_0x007d:
            if (r16 == 0) goto L_0x0316
            X.80D r0 = r7.A0v
            boolean r0 = r0.A3y
            if (r0 == 0) goto L_0x0097
            X.6if r8 = r7.A1y
            if (r8 == 0) goto L_0x0316
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0316
            java.lang.Object r0 = r8.get()
            X.8cb r0 = (X.C359318cb) r0
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x0316
        L_0x0097:
            X.87h r0 = r7.A1r
            X.8Jc r11 = r0.A00()
            java.lang.Integer r8 = r11.A0J
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r8 != r0) goto L_0x0316
            X.AOy r0 = new X.AOy
            r0.<init>(r11)
            r11.A03 = r0
            android.view.View r8 = r11.A0R
            r0 = 2131431739(0x7f0b113b, float:1.8485216E38)
            android.view.View r0 = r8.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r8 = r0.inflate()
            r11.A05 = r8
            r0 = 2131442643(0x7f0b3bd3, float:1.8507332E38)
            android.view.View r0 = r8.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11.A06 = r0
            android.view.View r8 = r11.A05
            r8.getClass()
            r0 = 2131442640(0x7f0b3bd0, float:1.8507326E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.A07 = r0
            r0.getClass()
            X.3NG r8 = new X.3NG
            r8.<init>(r0)
            X.9kH r0 = new X.9kH
            r0.<init>(r11)
            r8.A04 = r0
            r8.A00()
            com.instagram.model.direct.camera.DirectCameraViewModel r12 = r11.A0b
            if (r12 == 0) goto L_0x00fc
            android.view.ViewGroup r9 = r11.A06
            android.content.res.Resources r8 = r9.getResources()
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            int r0 = r8.getDimensionPixelSize(r0)
            X.0nA.A0c(r9, r0)
        L_0x00fc:
            com.instagram.common.session.UserSession r15 = r11.A0U
            java.util.List r0 = X.C358878bc.A09()
            android.view.View r14 = r11.A05
            r14.getClass()
            android.view.ViewGroup r13 = r11.A06
            r13.getClass()
            r9 = 2131442641(0x7f0b3bd1, float:1.8507328E38)
            r25 = 2131438077(0x7f0b29fd, float:1.849807E38)
            java.lang.Object r0 = r0.get(r2)
            X.8bb r0 = (X.C358868bb) r0
            java.lang.Integer r10 = r0.A07
            X.Abk r8 = new X.Abk
            r8.<init>(r11)
            X.91a r0 = new X.91a
            r21 = r15
            r22 = r8
            r23 = r10
            r24 = r9
            r18 = r0
            r19 = r14
            r20 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r11.A08 = r0
            X.1Av r13 = X.1Au.A00(r15)
            X.0s0 r10 = r13.A8E
            X.0YZ[] r8 = X.1Av.A8a
            r0 = 60
            r0 = r8[r0]
            java.lang.Object r8 = r10.CDM(r13, r0)
            java.lang.String r8 = (java.lang.String) r8
            r13 = 0
            if (r8 == 0) goto L_0x0159
            java.lang.String r0 = "default"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0159
            X.1Av r0 = X.1Au.A00(r15)
            r0.A0y(r13)
            r8 = r13
        L_0x0159:
            boolean r0 = X.AnonymousClass5He.A00(r8)
            if (r0 != 0) goto L_0x0166
            X.0qQ.A0B(r8, r2)
            X.8bb r13 = X.C358878bc.A01(r8, r2, r2, r2, r2)
        L_0x0166:
            android.content.Context r10 = r11.A0P
            android.view.View r0 = r11.A05
            r0.getClass()
            android.view.View r9 = r0.requireViewById(r9)
            android.widget.EditText r9 = (android.widget.EditText) r9
            android.view.View r8 = r11.A05
            r8.getClass()
            r0 = 2131438079(0x7f0b29ff, float:1.8498075E38)
            android.view.View r20 = r8.requireViewById(r0)
            r8 = 0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r11.A0W
            r18 = r0
            X.Abn r14 = new X.Abn
            r14.<init>(r11)
            r28 = 1
            X.8f8 r0 = new X.8f8
            r22 = r8
            r23 = r15
            r24 = r18
            r25 = r8
            r26 = r14
            r27 = r13
            r29 = r2
            r18 = r0
            r19 = r10
            r21 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r11.A0A = r0
            android.view.View r9 = r11.A05
            r0 = 2131442641(0x7f0b3bd1, float:1.8507328E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.ui.text.ConstrainedEditText r0 = (com.instagram.ui.text.ConstrainedEditText) r0
            r11.A0D = r0
            android.view.View r9 = r11.A05
            r0 = 2131438078(0x7f0b29fe, float:1.8498073E38)
            android.view.View r14 = r9.requireViewById(r0)
            com.instagram.ui.text.ConstrainedEditText r13 = r11.A0D
            X.Abl r9 = new X.Abl
            r9.<init>(r11)
            X.91N r0 = new X.91N
            r0.<init>(r14, r13, r15, r9)
            r11.A09 = r0
            com.instagram.ui.text.ConstrainedEditText r0 = r11.A0D
            X.Agb r9 = new X.Agb
            r9.<init>(r11)
            java.util.List r0 = r0.A07
            r0.add(r9)
            android.view.View r9 = r11.A05
            r0 = 2131442642(0x7f0b3bd2, float:1.850733E38)
            android.view.View r0 = r9.findViewById(r0)
            r11.A04 = r0
            X.0qQ.A0B(r10, r2)
            android.content.res.Resources r13 = r10.getResources()
            r0 = 2131165296(0x7f070070, float:1.7944805E38)
            int r14 = r13.getDimensionPixelSize(r0)
            r0 = 2131165232(0x7f070030, float:1.7944675E38)
            int r9 = r13.getDimensionPixelSize(r0)
            r0 = 2131165263(0x7f07004f, float:1.7944738E38)
            int r0 = r13.getDimensionPixelSize(r0)
            int r0 = r0 - r14
            int r0 = r0 + r9
            r11.A00 = r0
            android.view.View r9 = r11.A04
            r9.getClass()
            int r0 = r11.A00
            X.0nA.A0X(r9, r0)
            com.instagram.ui.text.ConstrainedEditText r13 = r11.A0D
            X.8f8 r0 = r11.A0A
            android.view.View r0 = r0.A08
            int r9 = r0.getHeight()
            int r0 = r11.A00
            r13.A01 = r9
            r13.A00 = r0
            com.instagram.ui.text.ConstrainedEditText.A00(r13)
            X.9Xj r13 = new X.9Xj
            r13.<init>(r11)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r9 = new android.os.Handler
            r9.<init>(r0)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r10, r13, r9)
            r11.A02 = r0
            X.8f8 r0 = r11.A0A
            X.8bb r0 = r0.A07()
            X.91a r9 = r11.A08
            java.lang.Integer r0 = r0.A07
            r9.A00(r0)
            X.C353798Jc.A08(r11)
            X.C353798Jc.A0A(r11)
            X.C353798Jc.A0B(r11)
            X.C353798Jc.A0D(r11)
            X.C353798Jc.A0F(r11)
            X.C353798Jc.A0G(r11)
            android.view.View r9 = r11.A05
            r9.getClass()
            r0 = 2131441371(0x7f0b36db, float:1.8504752E38)
            android.view.View r14 = r9.findViewById(r0)
            if (r14 == 0) goto L_0x0272
            X.U0h r13 = new X.U0h
            r13.<init>(r10)
            if (r12 == 0) goto L_0x026c
            boolean r9 = r12.A07
            r0 = 1
            if (r9 != 0) goto L_0x026d
        L_0x026c:
            r0 = 0
        L_0x026d:
            r13.A00 = r0
            r14.setBackground(r13)
        L_0x0272:
            X.81m r9 = r11.A0Y
            X.81t r0 = r9.A00()
            X.8GE r23 = r0.Ap1()
            X.81t r0 = r9.A00()
            com.instagram.ui.widget.colourwheel.ColourWheelView r0 = r0.Ap6()
            r11.A0G = r0
            if (r0 == 0) goto L_0x028d
            java.util.Set r0 = r0.A0N
            r0.add(r11)
        L_0x028d:
            com.instagram.ui.widget.colourwheel.ColourWheelView r0 = r11.A0G
            r18 = r0
            android.view.View r14 = r11.A0S
            android.view.ViewStub r13 = r11.A0T
            X.80F r12 = r11.A0a
            X.A3x r9 = new X.A3x
            r9.<init>(r11)
            X.AIY r0 = new X.AIY
            r22 = r15
            r24 = r9
            r25 = r12
            r26 = r18
            r18 = r0
            r20 = r14
            r21 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r11.A0B = r0
            java.lang.String r9 = "classic_v2"
            X.8bb r9 = X.C358878bc.A01(r9, r2, r2, r2, r2)
            r0.A04(r8, r9)
            int r0 = r12.A00
            r13 = 0
            r9 = -1
            if (r0 == r9) goto L_0x02c4
            java.lang.String r8 = r10.getString(r0)
        L_0x02c4:
            r11.A0H = r8
            int r0 = r12.A01
            if (r0 == r9) goto L_0x02ce
            java.lang.String r13 = r10.getString(r0)
        L_0x02ce:
            r11.A0I = r13
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r11.A0c
            r0.A0y(r11)
            android.view.View r8 = r11.A04
            if (r8 == 0) goto L_0x02e1
            X.AOz r0 = new X.AOz
            r0.<init>(r11)
            r8.setOnTouchListener(r0)
        L_0x02e1:
            com.instagram.ui.text.ConstrainedEditText r9 = r11.A0D
            if (r9 == 0) goto L_0x0311
            android.content.Context r0 = r9.getContext()
            X.0qq r8 = X.AnonymousClass0qo.A00(r0)
            X.0qm r0 = X.0qm.A0z
            android.graphics.Typeface r0 = r8.A02(r0)
            r9.setTypeface(r0)
            com.instagram.ui.text.ConstrainedEditText r8 = r11.A0D
            X.AOY r0 = new X.AOY
            r0.<init>(r11)
            r8.setOnFocusChangeListener(r0)
            com.instagram.ui.text.ConstrainedEditText r8 = r11.A0D
            X.ALd r0 = new X.ALd
            r0.<init>(r11)
            r8.addTextChangedListener(r0)
            com.instagram.ui.text.ConstrainedEditText r8 = r11.A0D
            java.lang.String r0 = ""
            r8.setText(r0)
        L_0x0311:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C353798Jc.A0H(r11, r0)
        L_0x0316:
            X.87h r0 = r7.A1r
            X.8Jc r8 = r0.A00()
            r10 = 1
            if (r17 == 0) goto L_0x0322
            r0 = 1
            if (r16 != 0) goto L_0x0323
        L_0x0322:
            r0 = 0
        L_0x0323:
            r8.A0N(r0)
            if (r16 == 0) goto L_0x0346
            X.86x r0 = r7.A0s
            r0.A03()
            X.0qQ.A0B(r4, r10)
            r9 = 0
            r8 = 126(0x7e, float:1.77E-43)
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r0 = new com.instagram.stickersearch.AvatarStickerPreRenderInteractor
            r0.<init>(r9, r4, r8)
            X.8q9 r9 = new X.8q9
            r9.<init>(r0)
            X.6ny r8 = X.C317866ny.STORIES
            X.6nw r0 = X.C348197y2.A00(r4)
            r9.A00(r0, r8)
        L_0x0346:
            X.80L r8 = X.AnonymousClass80L.A00
            if (r5 == r8) goto L_0x034e
            X.80g r0 = X.C3494080g.A00
            if (r5 != r0) goto L_0x0357
        L_0x034e:
            X.846 r0 = r7.A1v
            X.7zw r0 = r0.A00()
            r0.A00()
        L_0x0357:
            X.81m r0 = r7.A1a
            X.81t r0 = r0.A00()
            X.81w r9 = r0.B8r()
            if (r9 == 0) goto L_0x0374
            if (r5 == r8) goto L_0x036e
            X.80g r0 = X.C3494080g.A00
            if (r5 == r0) goto L_0x036e
            X.80K r8 = X.AnonymousClass80K.A00
            r0 = 1
            if (r5 != r8) goto L_0x036f
        L_0x036e:
            r0 = 0
        L_0x036f:
            X.81v r9 = (X.C3497981v) r9
            r9.Eql(r0, r2)
        L_0x0374:
            X.4DH r14 = r7.A0J
            X.28D r12 = r7.A01
            X.4yO r11 = r7.A02
            X.8Hx r9 = r7.A1j
            boolean r22 = r9.CKX()
            boolean r23 = r9.CYQ()
            X.80D r8 = r7.A0v
            boolean r0 = r8.A3R
            r20 = r4
            r21 = r11
            r24 = r0
            r18 = r12
            r19 = r14
            boolean r11 = X.AnonymousClass8X8.A00(r18, r19, r20, r21, r22, r23, r24)
            X.8WX r13 = r7.A1N
            X.8XA r0 = r13.A00()
            if (r11 != 0) goto L_0x04f5
            r0.A0A()
        L_0x03a1:
            X.8XA r0 = r13.A00()
            X.8hG r12 = r0.A02
            if (r12 == 0) goto L_0x03db
            r12.A0D = r2
            boolean r0 = r5 instanceof X.C3493880e
            if (r0 != 0) goto L_0x03b3
            boolean r0 = r8.A3N
            if (r0 == 0) goto L_0x04f2
        L_0x03b3:
            if (r3 != 0) goto L_0x03d7
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x04f2
            X.8aL r0 = X.C358088aL.A0T
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x03d7
            boolean r0 = r5 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x04f2
            X.0qQ.A0B(r4, r2)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36331141241783209(0x8112fb000043a9, double:3.039298242842572E-306)
            boolean r0 = X.182.A06(r11, r4, r0)
            if (r0 == 0) goto L_0x04f2
        L_0x03d7:
            r0 = 1
        L_0x03d8:
            r12.A0i(r0)
        L_0x03db:
            X.8DB r0 = r7.A1J
            X.81C r0 = r0.A00
            X.81E r11 = r0.A00()
            X.8Hd r11 = (X.C353318Hd) r11
            X.8aL r12 = X.C358088aL.A0T
            boolean r0 = r6.contains(r12)
            if (r0 != 0) goto L_0x03f6
            X.8aL r0 = X.C358088aL.A0B
            boolean r1 = r6.contains(r0)
            r0 = 1
            if (r1 == 0) goto L_0x03f7
        L_0x03f6:
            r0 = 0
        L_0x03f7:
            r11.CL9(r0)
            X.8Yz r11 = r7.A0W
            X.8DD r0 = r7.A1I
            boolean r0 = X.C357308Xj.A00(r11, r0, r9)
            if (r0 == 0) goto L_0x04eb
            X.8AL r1 = r7.A1F
            boolean r0 = r6.contains(r12)
            if (r0 != 0) goto L_0x0417
            X.8aL r0 = X.C358088aL.A0B
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x0417
            r0 = 1
            if (r16 == 0) goto L_0x0418
        L_0x0417:
            r0 = 0
        L_0x0418:
            r1.A0B(r0)
        L_0x041b:
            if (r3 != 0) goto L_0x0428
            X.823 r0 = r7.A0p
            if (r0 == 0) goto L_0x0428
            X.8Xk r0 = r0.A00()
            r0.A04(r2)
        L_0x0428:
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r0 = r8.A0b
            if (r0 == 0) goto L_0x04e8
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x04e8
        L_0x0433:
            X.80m r0 = r11.A08
            java.lang.Object r1 = r0.A00
            X.8jC r0 = X.C363138jC.A00
            r6 = r31
            r11 = r34
            if (r1 == r0) goto L_0x0441
            if (r10 == 0) goto L_0x04d5
        L_0x0441:
            if (r17 == 0) goto L_0x04d5
            r11.setVisibility(r2)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r7.A0i
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r2 = r0.A0K
            int r12 = r2.getWidth()
            if (r10 == 0) goto L_0x04d3
            float r1 = (float) r12
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r0 = r8.A0b
            r0.getClass()
            float r0 = r0.A00
            float r1 = r1 / r0
            int r14 = (int) r1
        L_0x045c:
            int r0 = r2.getHeight()
            int r15 = r0 / 2
            int r0 = r14 / 2
            int r15 = r15 - r0
            int r0 = r30.getWidth()
            int r13 = r0 / 2
            int r0 = r12 / 2
            int r13 = r13 - r0
            float r10 = (float) r13
            float r9 = (float) r15
            int r8 = r13 + r12
            float r1 = (float) r8
            int r3 = r15 + r14
            int r0 = r6.A06
            int r0 = r0 * 2
            int r0 = r0 + r3
            float r0 = (float) r0
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r10, r9, r1, r0)
            X.8VZ r1 = r7.A14
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r13, r15, r8, r3)
            r1.A00 = r0
            r11.setCropDimensions(r2)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r12, r14)
            r6.setLayoutParams(r0)
            r6.setTranslationY(r9)
            r6.setTranslationX(r10)
            X.8Rz r2 = r7.A0d
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x04a5
            r0 = 8
            r1.setVisibility(r0)
        L_0x04a5:
            r2.A00 = r6
            r2.A08()
        L_0x04aa:
            X.28D r2 = r7.A01
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r1 = 1
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.28D r0 = X.28D.A0a
            if (r2 != r0) goto L_0x04d2
            java.lang.Integer r1 = com.instagram.mainactivity.camerabutton.CameraButtonDestinationUtil$Companion.A00(r4, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x04d2
            X.1Av r4 = X.1Au.A00(r4)
            java.lang.String r3 = r5.A02
            X.0s0 r2 = r4.A6E
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 385(0x181, float:5.4E-43)
            r0 = r1[r0]
            r2.Epx(r4, r3, r0)
        L_0x04d2:
            return
        L_0x04d3:
            r14 = r12
            goto L_0x045c
        L_0x04d5:
            r0 = 8
            r6.setVisibility(r0)
            r11.setVisibility(r0)
            X.8Rz r0 = r7.A0d
            r0.A08()
            X.8VZ r1 = r7.A14
            r0 = 0
            r1.A00 = r0
            goto L_0x04aa
        L_0x04e8:
            r10 = 0
            goto L_0x0433
        L_0x04eb:
            X.8AL r0 = r7.A1F
            r0.A0C(r10)
            goto L_0x041b
        L_0x04f2:
            r0 = 0
            goto L_0x03d8
        L_0x04f5:
            r0.A08()
            X.28D r12 = r7.A01
            X.4yO r11 = r7.A02
            boolean r22 = r9.CKX()
            boolean r23 = r9.CYQ()
            boolean r0 = r8.A3R
            r21 = r11
            r24 = r0
            r18 = r12
            boolean r0 = X.AnonymousClass8X8.A00(r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x03a1
            A03(r7)
            goto L_0x03a1
        L_0x0517:
            X.80L r0 = X.AnonymousClass80L.A00
            if (r5 != r0) goto L_0x051f
            java.lang.String r2 = "instagram_live"
            goto L_0x002f
        L_0x051f:
            X.8jC r0 = X.C363138jC.A00
            if (r5 != r0) goto L_0x0527
            java.lang.String r2 = "instagram_feed"
            goto L_0x002f
        L_0x0527:
            X.80h r0 = X.C3494180h.A00
            if (r5 != r0) goto L_0x052f
            java.lang.String r2 = "instagram_note"
            goto L_0x002f
        L_0x052f:
            X.28D r0 = r7.A01
            java.lang.String r2 = X.AnonymousClass828.A00(r0)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80R.A02(android.view.ViewGroup, com.instagram.creation.base.ui.grid.GridLinesView, com.instagram.creation.cameraconfiguration.CameraConfiguration, X.80R, com.instagram.creation.photo.crop.CropHighlightView):void");
    }

    public static void A03(AnonymousClass80R r6) {
        C362048hG r1 = r6.A1N.A00().A02;
        if (r1 != null) {
            r1.A0c(r6.A01);
        }
        C3497281m r4 = r6.A1a;
        r4.A00().AAq(r6.A01, r6.A0R, r6.A02, r6.A1j.CKX());
        if (r6.A05()) {
            r4.A00().CLX();
            r6.A19.A00().Emz(true);
        }
        if ("story_selfie_reply".equals(r6.A0v.A2q)) {
            r4.A00().CLX();
        }
    }

    public static void A04(AnonymousClass80R r11) {
        AnonymousClass848 r0 = r11.A0I;
        r0.A00.Epw(new AnonymousClass8YD(AnonymousClass84B.GREEN_SCREEN_TOOL, "389287015265096", "reels_camera", (String) null, (String) null, (String) null, (String) null, -1, false));
        r11.A0W.A0K(C358088aL.A0K);
        C3504884v r2 = r11.A1L;
        r2.getClass();
        r2.A0Y.Epw(true);
        r2.A0Z.Epw(true);
    }

    private boolean A05() {
        AnonymousClass804 r1;
        AnonymousClass88E r0 = this.A1m;
        if (r0 == null || !((C40375Ab8) r0.A00.A00()).A03() || (r1 = this.A0o.A02.A01.A06) == null || !(r1 instanceof C340007kX) || !((C340007kX) r1).A00.equals(C339997kW.A04)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.80R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v183, resolved type: X.85L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v95, resolved type: X.9Pb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v263, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v97, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v280, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v117, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v131, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: X.Ac0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v132, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v494, resolved type: X.8Dz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v495, resolved type: X.8Dz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v496, resolved type: X.8Dz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v612, resolved type: X.AbI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v613, resolved type: X.8Hw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r168v6, resolved type: X.85L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v942, resolved type: X.8Dz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v4, resolved type: X.80R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v78, resolved type: X.9Pb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: X.9Pb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r109v38, resolved type: X.9Pb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v189, resolved type: X.L3s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: X.83r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: X.Ac0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v16, resolved type: X.Ac0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1053, resolved type: X.8Hw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r135v17, resolved type: X.8Hw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: X.WUV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v15, resolved type: X.WUV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v17, resolved type: com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl} */
    /* JADX WARNING: type inference failed for: r18v2 */
    /* JADX WARNING: type inference failed for: r20v2 */
    /* JADX WARNING: type inference failed for: r20v7 */
    /* JADX WARNING: type inference failed for: r3v39, types: [X.07g, X.4DH] */
    /* JADX WARNING: type inference failed for: r4v393, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: type inference failed for: r8v26, types: [X.07Z, X.07g, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v95, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v96, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v414, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: type inference failed for: r2v155, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r7v120, types: [X.8DO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v37, types: [X.07Z, X.07g, X.4DH] */
    /* JADX WARNING: type inference failed for: r4v527, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r8v66, types: [X.07Z, java.lang.Object, X.4DH] */
    /* JADX WARNING: type inference failed for: r7v159, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r4v589, types: [X.8Fo, X.8HG] */
    /* JADX WARNING: type inference failed for: r8v77, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r7v188, types: [java.lang.Object, X.8Dy] */
    /* JADX WARNING: type inference failed for: r7v190, types: [java.lang.Object, X.8Dy] */
    /* JADX WARNING: type inference failed for: r8v110, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r15v20, types: [X.07g, X.4DH] */
    /* JADX WARNING: type inference failed for: r5v167, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r10v85, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r10v89, types: [X.07g, X.4DH] */
    /* JADX WARNING: type inference failed for: r158v13, types: [X.07Z] */
    /* JADX WARNING: type inference failed for: r7v452, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v250 */
    /* JADX WARNING: type inference failed for: r109v41, types: [X.Ac1] */
    /* JADX WARNING: type inference failed for: r7v481, types: [X.Abx] */
    /* JADX WARNING: type inference failed for: r64v21, types: [X.Aby] */
    /* JADX WARNING: type inference failed for: r64v22, types: [X.Abz] */
    /* JADX WARNING: type inference failed for: r9v147, types: [X.9n4] */
    /* JADX WARNING: type inference failed for: r8v215, types: [X.9nJ] */
    /* JADX WARNING: type inference failed for: r2v290 */
    /* JADX WARNING: type inference failed for: r2v291 */
    /* JADX WARNING: type inference failed for: r2v292 */
    /* JADX WARNING: type inference failed for: r10v110, types: [X.9nK] */
    /* JADX WARNING: type inference failed for: r109v42, types: [X.KLG] */
    /* JADX WARNING: type inference failed for: r2v293 */
    /* JADX WARNING: type inference failed for: r2v294 */
    /* JADX WARNING: type inference failed for: r2v295 */
    /* JADX WARNING: type inference failed for: r2v296 */
    /* JADX WARNING: type inference failed for: r2v297 */
    /* JADX WARNING: type inference failed for: r10v111, types: [X.9nL] */
    /* JADX WARNING: type inference failed for: r2v298 */
    /* JADX WARNING: type inference failed for: r2v299 */
    /* JADX WARNING: type inference failed for: r2v300 */
    /* JADX WARNING: type inference failed for: r2v301 */
    /* JADX WARNING: type inference failed for: r2v302 */
    /* JADX WARNING: type inference failed for: r109v43, types: [X.KLH] */
    /* JADX WARNING: type inference failed for: r2v303 */
    /* JADX WARNING: type inference failed for: r2v304 */
    /* JADX WARNING: type inference failed for: r2v305 */
    /* JADX WARNING: type inference failed for: r9v148, types: [X.9my] */
    /* JADX WARNING: type inference failed for: r9v149, types: [X.9n0] */
    /* JADX WARNING: type inference failed for: r9v150, types: [X.9nF] */
    /* JADX WARNING: type inference failed for: r9v151, types: [X.9nH] */
    /* JADX WARNING: type inference failed for: r109v44, types: [X.9nG] */
    /* JADX WARNING: type inference failed for: r9v152, types: [X.9nD] */
    /* JADX WARNING: type inference failed for: r2v306 */
    /* JADX WARNING: type inference failed for: r9v153, types: [X.8Dz] */
    /* JADX WARNING: type inference failed for: r120v21, types: [X.9m8] */
    /* JADX WARNING: type inference failed for: r120v22, types: [X.8HF] */
    /* JADX WARNING: type inference failed for: r109v45, types: [X.9n5] */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0859, code lost:
        if (r1.A3E != false) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0886, code lost:
        if (r4.A00 == null) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0a01, code lost:
        if (r5.A00 == null) goto L_0x0a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0ff3, code lost:
        if (r2 != null) goto L_0x0ff5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0ff9, code lost:
        if (r2.isEmpty() == false) goto L_0x1007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0ffb, code lost:
        r2 = r1.A12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0ffd, code lost:
        if (r2 == null) goto L_0x1f73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x1005, code lost:
        if (r2.A00() != true) goto L_0x1f73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x1007, code lost:
        r3 = new X.C41567AwZ(19, r86, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x1010, code lost:
        r9 = new X.AnonymousClass8AE(r7, r3);
        r0.A1u = r9;
        r4 = new X.AnonymousClass8AH(r1, r0);
        r5 = java.lang.Boolean.valueOf(X.182.A06(r108, r0.A0R, 2342169563430401862L)).booleanValue();
        r3 = r0.A1Y.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x1038, code lost:
        if (r5 == false) goto L_0x1f6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x103a, code lost:
        r2 = (android.view.ViewStub) r3.findViewById(com.instagram.android.R.id.post_capture_floating_button_picker_stub);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x1040, code lost:
        if (r2 == null) goto L_0x1f60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x1042, code lost:
        r111 = r2.inflate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x1046, code lost:
        r151 = false;
        r2 = null;
        r109 = new X.AnonymousClass8AL(r0.A1Y.A00.getContext(), r111, r0.A0J.getViewLifecycleOwner(), (com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource) null, r0.A0R, (X.C357638Yz) null, r19, r4, (X.X3Z) null, new X.AnonymousClass8AJ(r0), (X.C3504884v) null, r25, com.instagram.android.R.drawable.floating_button_background, false, true, false);
        r109.A0P.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x1095, code lost:
        if (((java.util.Set) r0.A0W.A07.A00).size() != 1) goto L_0x10a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x1097, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x10a6, code lost:
        if (((java.util.Set) r0.A0W.A07.A00).contains(X.AnonymousClass80M.A00) != false) goto L_0x10a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x10a8, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x10af, code lost:
        if (X.C305756Jk.A00(r0.A09) == false) goto L_0x10c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x10b1, code lost:
        if (r5 == false) goto L_0x10c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x10b5, code lost:
        if (r1.A3k != false) goto L_0x10c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x10bf, code lost:
        if ("story_selfie_reply".equals(r1.A2q) != false) goto L_0x10c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x10c1, code lost:
        r151 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x10c3, code lost:
        r23 = r75.getContext();
        r8 = r0.A0R;
        r138 = r0.A0J.getViewLifecycleOwner();
        r137 = r75.requireViewById(com.instagram.android.R.id.floating_button_picker_stub);
        r7 = r0.A0W;
        r5 = r0.A1L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x10dc, code lost:
        if (r151 == false) goto L_0x10e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x10de, code lost:
        r2 = new X.C378339Pk(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x10e3, code lost:
        r135 = new X.AnonymousClass8AL(r23, r137, r138, r105, r8, r7, r19, r4, r2, new X.AnonymousClass8AX(r0), r5, r25, com.instagram.android.R.drawable.floating_button_background, true, true, r151);
        r0.A1F = r135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x110d, code lost:
        if (r17 == null) goto L_0x1117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x110f, code lost:
        r165 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x1115, code lost:
        if (r17.A0A != false) goto L_0x1119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x1117, code lost:
        r165 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x1119, code lost:
        r7 = r0.A0J;
        r2 = new X.2YN(new X.C351728Ab(r7.requireContext(), r1.A0O, r0.A0R), r7).A00(com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel.class);
        r45 = r2;
        r0.A1h = r2;
        r5 = r1.A1g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x113d, code lost:
        if (r5 == null) goto L_0x1147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x113f, code lost:
        r0.A0o.A02.A01.A09 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x1147, code lost:
        r3 = r1.A1h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x1149, code lost:
        if (r3 == null) goto L_0x1153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x114b, code lost:
        r0.A0o.A02.A01.A09 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x1153, code lost:
        r2 = r0.A09;
        r2 = new X.2YN(new X.C351808Am(r2.getApplication(), r0.A0R), (X.AnonymousClass07g) r2).A00(X.C351818An.class);
        r43 = r2;
        r0.A25 = r2;
        r10 = r0.A0R;
        r8 = r0.A0J;
        r7 = r0.A09;
        r2 = new X.2YN(new X.C351868As(r7, r10, new X.C351858Ar(r0.A0z)), r8).A00(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.class);
        r42 = r2;
        r2.A0A.A06(r8, new X.C319096q2(new X.C351928Az(r7)));
        r42.A0H.A02.A06(r8, new X.AnonymousClass8B0(r10));
        r0.A1p = r42;
        r4 = r0.A0R;
        X.0qQ.A0B(r4, 0);
        r2 = (X.AnonymousClass8B2) r4.A01(X.AnonymousClass8B2.class, X.AnonymousClass8B1.A00);
        r25 = r2;
        r0.A21 = r2;
        r3 = r0.A0J.getViewModelStore();
        r2 = r7.A02.A01.A0b;
        X.0qQ.A07(r2);
        r4 = new X.AnonymousClass8B3(r3, r2);
        r0.A0u = r4;
        r62 = r0.A09;
        r163 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x11f0, code lost:
        if (r17 == null) goto L_0x11f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x11f2, code lost:
        r163 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x11f4, code lost:
        r61 = r0.A1f;
        r59 = r0.A0R;
        r114 = X.AnonymousClass07i.A00(r0.A0J);
        r2 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x1204, code lost:
        if (r2 == 0) goto L_0x1208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x1206, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x1208, code lost:
        r56 = r0.A1Y.A00;
        r54 = r0.A2B;
        r52 = r0.A0S;
        r50 = r0.A0J;
        r164 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x121c, code lost:
        if (r17 == null) goto L_0x1220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x121e, code lost:
        r164 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x1220, code lost:
        r166 = "story_selfie_reply".equals(r1.A2q);
        r2 = r1.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x122a, code lost:
        if (r2 == null) goto L_0x1f5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x122c, code lost:
        r11 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x122e, code lost:
        r49 = r0.A0W;
        r48 = r0.A11;
        r10 = new X.AnonymousClass8B6(r0);
        r8 = new X.AnonymousClass8B7(r0);
        r37 = r0.A0i;
        r36 = r0.A01;
        r19 = r0.A0y;
        r17 = r0.A0p;
        r2 = r1.A2z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x1252, code lost:
        if (r2 == null) goto L_0x1f56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x1254, code lost:
        r158 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x1258, code lost:
        r109 = new X.AnonymousClass8BA(r62, r22, r56, r32, r114, r36, r50, r5, r48, r59, r52, r30, r49, r51, r37, r4, r24, r7, r17, r4, r1, r19, r109, r109, r134, r27, r18, r16, r61, r45, r109, r42, r86, r3, r9, r4, r70, r12, r20, r25, r31, r43, r11, r5, r4, r5, r54, r1.A29, r158, r10, r8, new X.AnonymousClass8B8(r0), new X.AnonymousClass8B9(r0), r163, r164, r165, r166, r0.A2G, r1.A3e);
        r0.A0e = r109;
        r179 = new X.C352268Cr((android.view.ViewStub) r0.A1Y.A00.requireViewById(com.instagram.android.R.id.post_capture_video_trimmer_stub), r0.A0J, r0.A0R, r109, r0.A1f, r0.A11.getModuleName());
        r36 = new X.2YN(new java.lang.Object(), (X.AnonymousClass07g) r0.A09).A00(X.C352328Cx.class);
        r4 = new X.C352338Cy(r1, r0);
        r2 = r109.A1u;
        r196 = r2;
        r2.add(r4);
        r4 = r1.A1C;
        r2 = r1.A00;
        r109.A0F = r4;
        r109.A00 = r2;
        r4 = r1.A1t;
        r2 = r1.A1M;
        r109.A0N = r4;
        r109.A0I = r2;
        r109.A0L = r1.A1r;
        r109.A0M = r1.A1s;
        r109.A0f = r1.A3o;
        r109.A0H = r1.A1G;
        r109.A0G = r1.A1F;
        r109.A0P = r1.A1x;
        r109.A0J = r1.A1T;
        r7 = r1.A1D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x1355, code lost:
        if (r7 == null) goto L_0x1378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x1357, code lost:
        r109.A0A = new X.C39714A6f(r109.A0o.getContext(), r109.A0v, r7);
        ((X.AnonymousClass8ME) r109.A1g.get()).A06 = r109.A0A;
        r109.A14.A01.A08 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x1378, code lost:
        r109.A0K = r1.A1e;
        r7 = r1.A1y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x137e, code lost:
        if (r7 == null) goto L_0x1382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x1380, code lost:
        r109.A0Q = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x1382, code lost:
        r10 = r0.A11;
        r8 = r0.A1f;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x138b, code lost:
        if (r1.A1i == null) goto L_0x1bac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x138d, code lost:
        r9 = r1.A05;
        X.0qQ.A07(r9);
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r7 = r1.A1i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x1399, code lost:
        if (r7 == null) goto L_0x3a7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x139b, code lost:
        r4 = r109.A0z;
        X.0qQ.A07(r4);
        r109 = new X.C387979n5(r9, r8, r109, r4, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x13b3, code lost:
        r2 = (X.AnonymousClass8D8) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x13b5, code lost:
        r0.A1g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x13b9, code lost:
        if (r1.A1V == null) goto L_0x13c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x13bd, code lost:
        if ((r2 instanceof X.KLG) == false) goto L_0x13c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x13bf, code lost:
        r109.A08 = (X.KLG) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x13c4, code lost:
        r4 = new X.AnonymousClass8D9(r0.A09, r0.A0R, r109, r0.A2B);
        r0.A1w = r4;
        r11 = r0.A11;
        r10 = r0.A0W;
        r9 = r0.A1f;
        r8 = r0.A0M;
        r7 = r0.A0R;
        X.0qQ.A0B(r23, 0);
        X.0qQ.A0B(r10, 2);
        X.0qQ.A0B(r7, 6);
        r7 = new X.AnonymousClass8DB(r9, new X.C58701IwA(0, r23, r11, r10, r9, r135, r8, r7));
        r0.A1J = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x140d, code lost:
        if (r1.A36 == false) goto L_0x1b97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x140f, code lost:
        r14 = r0.A1f;
        r13 = r0.A0W;
        r12 = r4.A06;
        r11 = r0.A0R;
        r10 = r0.A09;
        r9 = r0.A1L;
        r9.getClass();
        r155 = new X.AnonymousClass8DD(r10, r75, r0.A0J, r12, X.C61340me.A00(), r4, r5, r11, r13, r4, r4, r64, r9, r169, r14, r0.A20, "reel_composer_camera", true);
        r0.A1I = r155;
        r4 = r155.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x1453, code lost:
        if (r4 == null) goto L_0x3a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x1455, code lost:
        r0.A1G = r4.AcK();
        r29.A0F.A06(r0.A0J, new X.C352528Ds(r0));
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x146a, code lost:
        r10 = r0.A1f;
        r9 = r0.A0W;
        X.0qQ.A0B(r9, 1);
        r8 = new X.C352538Dt(r10, new X.C66300MMj(r9, 31));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x1483, code lost:
        if ((r2 instanceof X.C352598Dz) == false) goto L_0x1486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x1485, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x1486, code lost:
        r14 = r0.A1f;
        r13 = r0.A0J;
        r12 = r0.A1a.A00().BV0();
        r117 = r0.A1a.A00().BUh();
        r11 = r0.A0R;
        r22 = r0.A0M;
        r19 = r0.A26;
        r18 = r1.A1N;
        r125 = r4.A00().BcK();
        r10 = r0.A0W;
        r9 = new X.AnonymousClass8E3(r0);
        r15 = r0.A0i;
        r7 = r1.A12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x14bf, code lost:
        if (r7 == null) goto L_0x1b94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x14c1, code lost:
        r8 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x14c3, code lost:
        if (r4 == null) goto L_0x1b91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x14c5, code lost:
        r17 = ((X.C352598Dz) r4).A01.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x14d5, code lost:
        if (r17.hasNext() == false) goto L_0x1b8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x14d7, code lost:
        r7 = r17.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x14dd, code lost:
        if ((r7 instanceof X.B3d) == false) goto L_0x14d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x14df, code lost:
        r7 = (android.graphics.drawable.Drawable) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x14e1, code lost:
        X.0qQ.A0B(r13, 2);
        X.0qQ.A0B(r12, 3);
        X.0qQ.A0B(r11, 5);
        X.0qQ.A0B(r10, 12);
        r7 = new X.AnonymousClass8E5(r14, new X.AnonymousClass8E4(r7, r75, r13, r22, r11, r10, r15, r117, r12, r9, r4, r19, r18, r4, r8, r125));
        r0.A1W = r7;
        r11 = r0.A0R;
        r10 = r0.A1f;
        r9 = r0.A1a;
        X.0qQ.A0B(r11, 0);
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x152d, code lost:
        if (r1.A3d == false) goto L_0x1541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x152f, code lost:
        r8 = r1.A1p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x1531, code lost:
        if (r8 == null) goto L_0x1541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x1533, code lost:
        r7 = new X.AnonymousClass8E6(r10, new X.C41567AwZ(20, r8, r11, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x1541, code lost:
        r0.A1e = r22;
        r11 = r0.A0R;
        r10 = r1.A3G;
        r9 = r0.A0W;
        r8 = r0.A1f;
        X.0qQ.A0B(r11, 0);
        X.0qQ.A0B(r9, 3);
        X.0qQ.A0B(r21, 5);
        r7 = new X.AnonymousClass8E7(r8, new X.C59733JVr(0, r11, r75, r9, r8, r21, r29, r10));
        r0.A0q = r7;
        r7.A00().A03(new X.AnonymousClass8F5(r0), X.C358088aL.A04);
        r7.A00().A03(new X.AnonymousClass8F6(r0), X.C358088aL.A0x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x1597, code lost:
        if (r60 == null) goto L_0x15a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x1599, code lost:
        r7.A00().A02(new X.AYP(r0), X.C358088aL.A0l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x15a7, code lost:
        r7 = r7.A00();
        r8 = X.C358088aL.A0G;
        r7.A02(new X.AnonymousClass8F7(r0), r8);
        r7.A00().A02(new X.AnonymousClass8F8(r0), X.C358088aL.A0K);
        r11 = r0.A09.getApplicationContext();
        r9 = r0.A0J;
        r10 = r0.A1f;
        r4 = r28;
        X.0qQ.A0B(r4, 0);
        r4 = new X.2YN(new X.AnonymousClass8F9(r4), r9).A00(X.AnonymousClass8FA.class);
        r32 = r4;
        r4.A00(r10).A06(r9, new X.AnonymousClass8FC(r7));
        r32.A02.Epw(java.lang.Boolean.valueOf(X.AnonymousClass8FD.A00(r11)));
        r0.A0r = r32;
        r0.A1a.A00().B8D().setOnOptionSelectedListener(new X.AnonymousClass8FF(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x1621, code lost:
        if (X.AnonymousClass81x.A00(r0.A0R) == false) goto L_0x1b8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x1623, code lost:
        r14 = new X.AnonymousClass8HD(r7);
        r14.A00 = r0.A0p;
        r11 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu) ((android.view.ViewStub) r75.requireViewById(com.instagram.android.R.id.camera_pre_capture_utility_menu_stub)).inflate().requireViewById(com.instagram.android.R.id.camera_pre_capture_utility_menu_view);
        r9 = r0.A0R;
        r7 = r7.A00();
        X.0qQ.A0B(r9, 0);
        X.0qQ.A0B(r7, 1);
        r11.A00 = r9;
        r11.A01 = r7;
        r11.A03 = new X.AnonymousClass8EP(r11, r9, r7, r11, true);
        r11.setUtilityMenuCameraTools(r14.A04);
        r11.setUtilityMenuDelegateListener(r14);
        r9 = new X.AYQ(r0);
        r7 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x167e, code lost:
        if (r7.containsKey(r8) != false) goto L_0x1688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x1680, code lost:
        r7.put(r8, new java.util.HashSet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x1688, code lost:
        r4 = (java.util.Set) r7.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x168e, code lost:
        if (r4 == null) goto L_0x1693;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x1690, code lost:
        r4.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x1693, code lost:
        r7 = new X.AnonymousClass8FH(r0.A0R, r11);
        r32.A00(r0.A1f).A06(r0.A0J, r7);
        r0.A0W.A0F(r7.A02);
        r4 = r1.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x16b0, code lost:
        if (r4 == null) goto L_0x16cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x16b2, code lost:
        r8 = r0.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x16c2, code lost:
        if (r8.A0T((X.C279284yO) r8.A08.A00, r4) == false) goto L_0x16cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x16c4, code lost:
        r0.A0W.A0K(r1.A0X);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x16cb, code lost:
        r7 = r7.A00().A04;
        X.0qQ.A0B(r7, 0);
        r109.A0Z.add(r7);
        r4 = r1.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x16dd, code lost:
        if (r4 == null) goto L_0x16fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x16e4, code lost:
        if (r4.ordinal() != 4) goto L_0x16fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x16f0, code lost:
        if (X.AnonymousClass8FD.A00(r0.A09.getApplicationContext()) == false) goto L_0x16fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x16f6, code lost:
        if (r0.A1q.A01 == false) goto L_0x16fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x16f8, code lost:
        A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x16fb, code lost:
        r13 = r0.A1f;
        r12 = r0.A0R;
        r10 = r0.A09;
        r9 = r0.A0W;
        r8 = r0.A2B;
        r7 = r0.A0i;
        X.0qQ.A0B(r12, 1);
        X.0qQ.A0B(r10, 2);
        X.0qQ.A0B(r9, 3);
        X.0qQ.A0B(r8, 6);
        X.0qQ.A0B(r7, 8);
        r7 = new X.AnonymousClass8FK(r13, new X.C73679Phs(1, r10, r12, r9, r75, r109, r8, r51, r7));
        r0.A1B = r7;
        r119 = X.1ES.A01();
        r10 = r0.A1f;
        r8 = r0.A0J;
        r7 = ((X.AnonymousClass80T) r10).A01;
        X.0qQ.A0B(r8, 3);
        X.0qQ.A0B(r7, 4);
        r4 = r21;
        ((X.AnonymousClass8FV) new X.AnonymousClass8FS(r10, new X.C41567AwZ(17, new X.AnonymousClass8FR(r8, r4, r7), r75, r4)).A00.A00()).ECG();
        r110 = r75;
        r109 = new X.C352828Fe(r110, r0.A0S, r0.A0W, r0.A0i, r109, r1, new X.C352818Fd(r0), r0.A1Q, r0.A1a);
        r0.A27 = r109;
        r112 = r109;
        r114 = r1;
        r109 = new X.C352848Fg(r110, r0.A0W, r112, r0.A0i, r114, r0.A1Q, r0.A1a, r0.A2B);
        r12 = r0.A1f;
        r10 = r0.A09;
        r9 = r0.A0R;
        X.0qQ.A0B(r10, 1);
        X.0qQ.A0B(r9, 2);
        r4 = new X.C352868Fj(r12, new X.C41567AwZ(r35, r10, r9, r75));
        r135 = new X.C352888Fl(r75, r0.A0D, r0.A0M, r0.A0N, r119, r0.A0W, r4, r0.A0i, r8, r109, r0.A0o, r0.A0p, r11, r7, r1, r0.A0y, r7, r135, r54, r0.A1I, r7, r64, r21, r105, r0.A1Q, r7, r0.A1a, r22, r4, r0.A1f, r4, r4, r0.A20, r0.A22, r109);
        r0.A0l = r135;
        X.C226292g8.A00(r103, r34.A00).A06(r0.A0J, new X.AnonymousClass8H2(r0));
        r109 = new X.AnonymousClass8H3(r0.A0W, r51, r112, r0.A0i, r114, r0.A1f, r0.A2B);
        r0.A1b = r109;
        r7 = new X.AnonymousClass8H5(r51, r109, r1, r0.A2B);
        r0.A1d = r7;
        r4 = new X.AnonymousClass8H7(r109, r1, r0.A2B);
        r4 = new X.AnonymousClass8H9(r109, r1, r0.A2B);
        r109.A06 = r135;
        r8 = r0.A1Q;
        r8.A04 = new X.AnonymousClass8HB(r0);
        r8.A03 = new X.AnonymousClass8HC(r14, r0, r4);
        ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0.A0i).A0K.getWidth();
        ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0.A0i).A0K.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x18de, code lost:
        if (X.C305756Jk.A00(r0.A09) == false) goto L_0x1b45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x18e0, code lost:
        r15 = r0.A0W;
        r13 = r0.A09;
        r12 = r0.A0R;
        r4 = r135;
        r10 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x18ea, code lost:
        if (r10 != null) goto L_0x18f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x18ec, code lost:
        r10 = new X.C353028Fz(r4);
        r4.A09 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x18f3, code lost:
        r11 = r0.A1f;
        r9 = r0.A1Y.A00;
        r8 = r0.A1Q;
        r7 = r0.A0i;
        r0.A11.getModuleName();
        r120 = new X.AnonymousClass8HF(r13, r9, r12, r15, r7, r10, r109, r54, r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x191d, code lost:
        r4.A06.A06(r0.A0J, new X.C353288Ha(r4, r0));
        r4.A07 = r109;
        r0.A1Q.A04(r4);
        r135.A08 = r4;
        r0.A1Q.A04(r135);
        ((X.C353318Hd) r7.A00.A00()).EcG(r135);
        r7 = r0.A1a.A00();
        r9 = r0.A09;
        r8 = r0.A0M.A00();
        r7 = r7.AhF();
        X.0nA.A0q(r7, new X.C353388Hk(r9, r7, r8));
        r109 = new X.C353398Hl(r0.A0J, r0.A0R, r0.A0W, r135, r4, r0.A1I, r0.A1Q);
        r4 = r0.A0C;
        X.0qQ.A0B(r4, 0);
        r7 = r109;
        r11 = r7.A09;
        r10 = r7.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x1998, code lost:
        if (X.C362988ir.A01(r10.getApplicationContext(), r11) == false) goto L_0x19c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x199a, code lost:
        r9 = new X.C40626Afo(r4, r109);
        r8 = X.C362988ir.A00();
        r7 = r4.getContext();
        X.0qQ.A07(r7);
        r8.A01(r7, r11, r9, "sup:SupDelegate_SETUP_GLASSES_CALLBACK");
        X.1pd.A00(X.C362988ir.A00()).A00(r10, r11, new X.C65697LyC(r109), "sup:SupDelegate|SupLiveDelegate_ADD_CB");
        X.C353398Hl.A04(r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x19c8, code lost:
        r7 = (java.util.Set) r0.A0W.A07.A00;
        r19 = X.AnonymousClass80L.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x19d8, code lost:
        if (r7.contains(r19) != false) goto L_0x19ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x19e0, code lost:
        if (r7.contains(r95) == false) goto L_0x1b41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x19e8, code lost:
        if (X.1NM.A01(r0.A0R) == false) goto L_0x1b41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x19ea, code lost:
        r12 = r0.A1f;
        r11 = r0.A0J;
        r10 = r0.A0W;
        r9 = r1.A0l;
        r8 = r0.A0U;
        r7 = r0.A0R;
        r33 = r0.A08;
        r29 = r1.A0v;
        r28 = r1.A1w;
        r23 = r1.A2n;
        r15 = r1.A2B;
        r13 = r0.A0M;
        X.0qQ.A0B(r11, 1);
        X.0qQ.A0B(r10, 3);
        X.0qQ.A0B(r9, 4);
        X.0qQ.A0B(r8, 5);
        X.0qQ.A0B(r7, 6);
        r7 = new X.C342887pK(r12, new X.C338937im(r8, r11, r13, r135, r7, r10, r7, r9, r109, r29, r28, r1.A25, r15, r23, r33));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x1a51, code lost:
        r0.A1S = r34;
        r7 = r0.A09;
        r4 = new X.2YN(X.C351878Au.A00(r7, r0.A0R), (X.AnonymousClass07g) r7).A00(X.C3511387s.class);
        r23 = r4;
        r0.A1o = r4;
        r4 = r1.A18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x1a77, code lost:
        if (r4 == null) goto L_0x2552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x1a7d, code lost:
        if (r4.A00 != X.AnonymousClass8JI.A08) goto L_0x2552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x1a7f, code lost:
        r4 = r1.A13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x1a81, code lost:
        if (r4 == null) goto L_0x2552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x1a85, code lost:
        if (r4.A04 == null) goto L_0x2552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x1a87, code lost:
        X.1E7.A00(r0.A0R).A00(r1.A18.A04);
        r0.A0r.A00.Epw((java.lang.Boolean) null);
        r0.A1a.A00().CLs();
        r4 = r0.A1o;
        r8 = new com.instagram.clips.template.creation.model.ClipsTemplateModel(r1.A0B, r1.A13.A04.FDm(), r1.A18.A05, r1.A18.A04.getId(), r1.A18.A04.A2U());
        r13 = r4.A0S;
        r13.Epw(X.AnonymousClass883.INIT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x1ad8, code lost:
        if (X.0qQ.A0K(r4.A05, r8) != false) goto L_0x2552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x1ada, code lost:
        r4.A05 = r8;
        r4.A0B = r8.A04;
        r10 = r8.A01;
        r4.A04 = r10;
        r4.A02 = r8.A00;
        r4.A09 = r8.A02;
        r12 = r8.A03;
        r4.A0C = r12;
        r15 = r4.A0I;
        r11 = X.C318116oQ.A00(r15);
        r8 = new X.C376959Jz((java.lang.Object) r15, (java.lang.Object) r10, (X.AnonymousClass4D7) null, 13);
        r9 = X.AnonymousClass05K.A00;
        X.1Eo.A03(r9, r103, r8, r11);
        r7 = r4.A0J;
        r7.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x1b0a, code lost:
        if (r10 == null) goto L_0x249f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x1b0c, code lost:
        r8 = r10.BrX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x1b10, code lost:
        if (r8 == null) goto L_0x249f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x1b12, code lost:
        r10 = 0;
        r21 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x1b1b, code lost:
        if (r21.hasNext() == false) goto L_0x249f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x1b1d, code lost:
        r11 = r21.next();
        r18 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x1b23, code lost:
        if (r10 >= 0) goto L_0x1b2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x1b25, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x1b2c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x1b2d, code lost:
        r11 = (X.C279454yf) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x1b33, code lost:
        if (X.AnonymousClass8YL.A03(r11) == false) goto L_0x1b3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x1b35, code lost:
        r7.A03.put(java.lang.Integer.valueOf(r10), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x1b3e, code lost:
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x1b41, code lost:
        r34 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x1b45, code lost:
        r15 = r0.A0W;
        r13 = r0.A09;
        r12 = r0.A0R;
        r4 = r135;
        r9 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x1b4f, code lost:
        if (r9 != null) goto L_0x1b58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x1b51, code lost:
        r9 = new X.C353028Fz(r4);
        r4.A09 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x1b58, code lost:
        r11 = r0.A1f;
        r8 = r0.A1Y.A00;
        r7 = r0.A1Q;
        r130 = !"story_selfie_reply".equals(r1.A2q);
        r0.A11.getModuleName();
        r120 = new X.C387389m8(r13, r8, r12, r15, r9, r109, r54, r7, r11, r130);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x1b8a, code lost:
        r11 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x1b8e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x1b91, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x1b94, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x1b99, code lost:
        if (r1.A3b == false) goto L_0x1b9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x1b9b, code lost:
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x1b9e, code lost:
        r4 = null;
        r0.A1I = null;
        r0.A1G = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x1bae, code lost:
        if (r1.A12 == null) goto L_0x1bce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x1bb0, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A0S;
        X.0qQ.A07(r4);
        r14 = r10.getModuleName();
        r8 = r1.A12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x1bc0, code lost:
        if (r8 == null) goto L_0x3a83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x1bc2, code lost:
        r9 = new X.C352598Dz(r7, r4, r109, r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x1bd0, code lost:
        if (r1.A1h == null) goto L_0x1bea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x1bd2, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A0S;
        X.0qQ.A07(r4);
        r14 = r10.getModuleName();
        r8 = r1.A1h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x1be2, code lost:
        if (r8 != null) goto L_0x1e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x1be9, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x1bec, code lost:
        if (r1.A0a == null) goto L_0x1bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x1bee, code lost:
        X.0qQ.A07(r1.A0S);
        r4 = r1.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x1bf5, code lost:
        if (r4 == null) goto L_0x3a89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x1bf7, code lost:
        r2 = new X.C387919mz(r4, r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x1c00, code lost:
        if (r1.A1c == null) goto L_0x1c20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x1c02, code lost:
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A05;
        X.0qQ.A07(r4);
        r14 = r10.getModuleName();
        r8 = r1.A1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x1c12, code lost:
        if (r8 == null) goto L_0x3a8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x1c14, code lost:
        r9 = new X.C388059nD(r4, r7, r109, r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x1c22, code lost:
        if (r1.A1v == null) goto L_0x1c4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x1c24, code lost:
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r115 = r10.getModuleName();
        r9 = r1.A1v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x1c34, code lost:
        if (r9 == null) goto L_0x3a95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x1c36, code lost:
        r109 = new X.C388089nG(r7, r1.A0F, r8, r109, r9, r115);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x1c4d, code lost:
        if (r1.A1f == null) goto L_0x1c6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x1c4f, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A0S;
        X.0qQ.A07(r4);
        r14 = r10.getModuleName();
        r8 = r1.A1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x1c5f, code lost:
        if (r8 == null) goto L_0x3a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x1c61, code lost:
        r9 = new X.C388099nH(r7, r4, r109, r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x1c6f, code lost:
        if (r1.A1R == null) goto L_0x1c8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x1c71, code lost:
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A05;
        X.0qQ.A07(r4);
        r14 = r10.getModuleName();
        r8 = r1.A1R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x1c81, code lost:
        if (r8 == null) goto L_0x3aa1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x1c83, code lost:
        r9 = new X.C388079nF(r4, r7, r109, r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x1c91, code lost:
        if (r1.A1Y == null) goto L_0x1cb1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x1c93, code lost:
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A1Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x1c9f, code lost:
        if (r4 == null) goto L_0x3aa7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x1ca1, code lost:
        r9 = new X.C387929n0(r7, r8, r109, r4, r10.getModuleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x1cb1, code lost:
        if (r7 != null) goto L_0x13b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x1cb5, code lost:
        if (r1.A1j == null) goto L_0x1cd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x1cb7, code lost:
        r8 = r1.A05;
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A1j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x1cc3, code lost:
        if (r4 == null) goto L_0x3aad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x1cc5, code lost:
        r9 = new X.C387909my(r8, r7, r109, r4, r10.getModuleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x1cd7, code lost:
        if (r1.A1b == null) goto L_0x1cee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x1cd9, code lost:
        r8 = r1.A05;
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x1ce5, code lost:
        if (r4 == null) goto L_0x3ab3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x1ce7, code lost:
        r2 = new X.C387949n2(r8, r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x1cf0, code lost:
        if (r1.A1a == null) goto L_0x1d02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x1cf2, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x1cf9, code lost:
        if (r4 == null) goto L_0x3ab9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x1cfb, code lost:
        r2 = new X.C15913Ukd(r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x1d04, code lost:
        if (r1.A1m == null) goto L_0x1d1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x1d06, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        X.0qQ.A07(r1.A0S);
        r4 = r1.A1m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x1d12, code lost:
        if (r4 == null) goto L_0x3abf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x1d14, code lost:
        r2 = new X.C15914Uke(r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x1d1d, code lost:
        if (r1.A1l == null) goto L_0x1d4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x1d1f, code lost:
        r8 = r1.A05;
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r1.A0M.getClass();
        r111 = X.AnonymousClass07i.A00(r1.A0M);
        r4 = r1.A1l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x1d36, code lost:
        if (r4 == null) goto L_0x3ac5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x1d38, code lost:
        r109 = new X.KLH(r8, r111, r10, r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x1d4d, code lost:
        if (r1.A0D == null) goto L_0x1d60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x1d4f, code lost:
        r4 = r1.A05;
        X.0qQ.A07(r4);
        X.0qQ.A07(r1.A0S);
        r2 = new X.C387989n6(r4, r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x1d62, code lost:
        if (r1.A1Z == null) goto L_0x1d79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x1d64, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        X.0qQ.A07(r1.A0S);
        r4 = r1.A1Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x1d70, code lost:
        if (r4 == null) goto L_0x3acb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x1d72, code lost:
        r2 = new X.C387939n1(r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x1d7b, code lost:
        if (r1.A0k == null) goto L_0x1d96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x1d7d, code lost:
        r8 = r1.A05.getApplicationContext();
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A0k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x1d8d, code lost:
        if (r4 == null) goto L_0x3ad1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x1d8f, code lost:
        r2 = new X.C387999n7(r8, r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x1d98, code lost:
        if (r1.A0j == null) goto L_0x1db3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x1d9a, code lost:
        r8 = r1.A05.getApplicationContext();
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x1daa, code lost:
        if (r4 == null) goto L_0x3ad7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x1dac, code lost:
        r2 = new X.C388009n8(r8, r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x1db5, code lost:
        if (r1.A1o == null) goto L_0x1dc7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x1db7, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A1o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x1dbe, code lost:
        if (r4 == null) goto L_0x3add;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x1dc0, code lost:
        r2 = new X.C388159nN(r7, r109, r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x1dc9, code lost:
        if (r1.A1X == null) goto L_0x1de6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x1dcb, code lost:
        r9 = r1.A05;
        X.0qQ.A07(r9);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A1X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x1dd7, code lost:
        if (r4 == null) goto L_0x3ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x1dd9, code lost:
        r10 = new X.C388139nL(r9, r7, r109, r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x1de8, code lost:
        if (r1.A1n == null) goto L_0x1dfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x1dea, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A1n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x1df1, code lost:
        if (r4 == null) goto L_0x3ae9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x1df3, code lost:
        r2 = new X.C388149nM(r7, r109, r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x1dfc, code lost:
        if (r1.A1u == null) goto L_0x1e13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x1dfe, code lost:
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A1u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x1e0a, code lost:
        if (r4 == null) goto L_0x3aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x1e0c, code lost:
        r2 = new X.C388019n9(r7, r8, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x1e15, code lost:
        if (r1.A0E == null) goto L_0x1e2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x1e17, code lost:
        r8 = r1.A05;
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x1e23, code lost:
        if (r4 == null) goto L_0x3af5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x1e25, code lost:
        r2 = new X.C388109nI(r8, r4, r7, r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x1e2e, code lost:
        if (r1.A1g == null) goto L_0x1e54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x1e30, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A0S;
        X.0qQ.A07(r4);
        r14 = r10.getModuleName();
        r8 = r1.A1g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x1e40, code lost:
        if (r8 != null) goto L_0x1e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x1e47, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x1e48, code lost:
        r9 = new X.C387969n4(r7, r4, r109, r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x1e56, code lost:
        if (r1.A0Y == null) goto L_0x1e6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x1e58, code lost:
        r8 = r1.A05;
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x1e64, code lost:
        if (r4 == null) goto L_0x3afb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x1e66, code lost:
        r2 = new X.C388069nE(r8, r7, r4, r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x1e6f, code lost:
        if (r1.A1W == null) goto L_0x1e86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x1e71, code lost:
        r8 = r1.A05;
        X.0qQ.A07(r8);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r4 = r1.A1W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x1e7d, code lost:
        if (r4 == null) goto L_0x3b01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x1e7f, code lost:
        r2 = new X.C388049nC(r8, r7, r109, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x1e88, code lost:
        if (r1.A1V == null) goto L_0x1eb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x1e8a, code lost:
        r9 = r1.A05;
        X.0qQ.A07(r9);
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r7 = r1.A1V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x1e96, code lost:
        if (r7 == null) goto L_0x3b07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x1e98, code lost:
        r4 = r109.A0z;
        X.0qQ.A07(r4);
        r109 = new X.KLG(r9, r8, r109, r4, r7, r10.getModuleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x1eb6, code lost:
        if (r1.A16 == null) goto L_0x1ed8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x1eb8, code lost:
        r9 = r1.A05;
        X.0qQ.A07(r9);
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r7 = r1.A16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x1ec4, code lost:
        if (r7 == null) goto L_0x3b0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x1ec6, code lost:
        r4 = r109.A0z;
        X.0qQ.A07(r4);
        r10 = new X.C388129nK(r9, r8, r109, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x1eda, code lost:
        if (r1.A39 == false) goto L_0x1eed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x1edc, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A0S;
        X.0qQ.A07(r4);
        r2 = new X.C388039nB(r7, r4, r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x1eed, code lost:
        r7 = r1.A1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x1eef, code lost:
        if (r7 == null) goto L_0x1f10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x1ef3, code lost:
        if ((r7 instanceof com.instagram.reels.musicpick.model.MusicPickStickerModel) == false) goto L_0x1f10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x1efd, code lost:
        if (((com.instagram.reels.musicpick.model.MusicPickStickerModel) r7).A02.isEmpty() == false) goto L_0x1f10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x1eff, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A0S;
        X.0qQ.A07(r4);
        r2 = new X.C388029nA(r7, r4, r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x1f12, code lost:
        if (r1.A0Z == null) goto L_0x1f2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x1f14, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r4 = r1.A0S;
        X.0qQ.A07(r4);
        r10.getModuleName();
        r8 = r1.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x1f23, code lost:
        if (r8 == null) goto L_0x3b13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x1f25, code lost:
        r2 = new X.C387959n3(r7, r4, r8, r109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x1f36, code lost:
        if (r1.A2C.longValue() <= 0) goto L_0x13b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x1f38, code lost:
        r7 = r1.A05;
        X.0qQ.A07(r7);
        r2 = r1.A2C;
        X.0qQ.A07(r2);
        r12 = r2.longValue();
        r4 = r109.A0z;
        X.0qQ.A07(r4);
        r8 = new X.C388119nJ(r7, r109, r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x1f56, code lost:
        r158 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x1f5d, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x1f60, code lost:
        r111 = r0.A1Y.A00.requireViewById(com.instagram.android.R.id.post_capture_floating_button_picker);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x1f6d, code lost:
        r111 = r3.requireViewById(com.instagram.android.R.id.post_capture_floating_button_picker_stub);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x1f73, code lost:
        r3 = X.AnonymousClass8AD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x249f, code lost:
        r8 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x24a1, code lost:
        if (r8 == null) goto L_0x24ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x24a3, code lost:
        r8 = r8.BoA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x24a7, code lost:
        if (r8 == null) goto L_0x24ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x24a9, code lost:
        r8 = r8.CEY();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x24ad, code lost:
        if (r8 == null) goto L_0x24ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x24af, code lost:
        r8 = X.C255583uN.A01((java.lang.String) null, X.AnonymousClass3WQ.A00(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x24b9, code lost:
        if (r8 == null) goto L_0x24ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x24bb, code lost:
        r8 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x24bd, code lost:
        if (r8 == null) goto L_0x24ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x24bf, code lost:
        r11 = X.C59730JVo.A03(r7.A01.getApplicationContext(), r7.A02, new X.C11211SFl(r8, "ClipsTemplateReusableAssetViewModel", true, false, false));
        r11.A00 = new X.C385779jW(r7);
        X.1ES.A05(r11, 74275874, 2, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x24ed, code lost:
        r7 = r4.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x24f3, code lost:
        if (r7.A0s() == false) goto L_0x3a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x24f5, code lost:
        r8 = X.1E7.A00(r4.A0K).A02(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x24ff, code lost:
        if (r8 == null) goto L_0x3a62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x2505, code lost:
        if (r4.A0H() != false) goto L_0x3a62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x250b, code lost:
        if (r4.A0I() != false) goto L_0x2513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x2511, code lost:
        if (r4.A0K() == false) goto L_0x3a62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x2513, code lost:
        r4.A0M.A03(r8);
        r4.A0R.Epw(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x2523, code lost:
        if (r4.A0M() == false) goto L_0x3a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x2525, code lost:
        r7 = X.AnonymousClass883.LANDING_PAGE_PLAYBACK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x2527, code lost:
        r13.Epw(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x252e, code lost:
        if (r4.A0M() == false) goto L_0x2542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x2530, code lost:
        X.1Eo.A05(r103, new X.MG6(r4, (X.AnonymousClass4D7) null, 1), X.C318116oQ.A00(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x2542, code lost:
        X.1Eo.A03(r9, r103, new X.C376909Ju(r4, (X.AnonymousClass4D7) null, 0), X.C318116oQ.A00(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x255a, code lost:
        if ("story_selfie_reply".equals(r1.A2q) != false) goto L_0x3a55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x255c, code lost:
        r9 = new X.C353468Ht(r0);
        r47 = r0.A0R;
        r46 = r0.A0J;
        r8 = new X.C71662eb((android.view.ViewStub) r75.requireViewById(com.instagram.android.R.id.previous_frame_overlay_stub));
        r44 = r0.A1f;
        r41 = r0.A0W;
        r40 = r0.A1a;
        r38 = r0.A0i;
        r37 = r0.A0C;
        r35 = r0.A1X;
        r33 = r0.A20;
        r29 = r0.A0p;
        r28 = r0.A0I;
        r21 = r0.A1L;
        r10 = r0.A0J;
        r4 = r0.A0R;
        X.0qQ.A0B(r4, 0);
        r135 = new X.C353498Hw(r37, r75, r0.A0v.A0C, r4, r5, r28, r46, r0.A0M.A00(), r47, r8, r41, r51, r38, r4, r135, r109, r0.A0o, r29, r14, r7, r32, r1, r9, r135, r54, r64, r21, r35, r40, r4, r44, r5, r82, r26, new X.2YN(new X.C353478Hu(r4), r10).A00(X.C353488Hv.class), r36, r1.A0H(), r0.A1q, r70, r33, r0.A22, r0.A26, r0.A2B);
        r0.A1j = r135;
        r135 = r135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x262f, code lost:
        r109.A0E = r4;
        r7 = X.AnonymousClass80N.A00;
        r8 = r135.A0m;
        r195 = r8;
        r8.A0B.put(r7, r4);
        r10 = r8.A00;
        ((X.C352568Dw) r10.A00()).A7v(r7, r0.A1j);
        ((X.C352568Dw) r10.A00()).A7v(X.C363138jC.A00, new X.AnonymousClass8JW(new X.AnonymousClass8JV(r109)));
        ((X.C352568Dw) r10.A00()).A7v(r19, new java.lang.Object());
        ((X.C352568Dw) r10.A00()).A7v(X.AnonymousClass80K.A00, r109);
        r40 = X.C3494080g.A00;
        ((X.C352568Dw) r10.A00()).A7v(r40, new java.lang.Object());
        r18 = r0.A0R;
        r10 = r0.A09;
        r17 = r0.A0C;
        r15 = r0.A0J;
        r14 = r0.A0W;
        r9 = new X.2YN((X.AnonymousClass07g) r10).A00(X.AnonymousClass8JZ.class);
        r8 = new X.C353778Ja(r5);
        r13 = r0.A0M;
        r12 = r0.A1f;
        r11 = r0.A0i;
        r7 = r0.A01;
        r4 = r1.A12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x26c2, code lost:
        if (r4 == null) goto L_0x26ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x26c4, code lost:
        r153 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x26c8, code lost:
        if (r4.A00 != null) goto L_0x26cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x26ca, code lost:
        r153 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x26cc, code lost:
        r135 = new X.C353788Jb(r10, r17, r7, r5, r11, r15, r8, r13, r5, r18, r14, r11, r4, r9, r109, r12, r77, r153);
        r0.A1Z = r135;
        r11 = r0.A1f;
        r10 = r0.A09;
        r9 = r0.A22;
        r8 = r0.A0i;
        r7 = r0.A0R;
        X.0qQ.A0B(r10, 1);
        X.0qQ.A0B(r8, 5);
        X.0qQ.A0B(r7, 7);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x2715, code lost:
        if (r9 == null) goto L_0x271a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x2717, code lost:
        r4.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x271a, code lost:
        r4.add(r109);
        r4.add(r4.A00());
        r4 = new X.C353828Ji(r11, new X.C58223IoR(4, r10, r109, r4, r8, r1, r7));
        r0.A0Y = r4;
        r17 = X.C314666ie.A00(new X.C353848Jk(r0), new X.C314656id[0]);
        r0.A1z = r17;
        r8 = ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0.A0i).A0K.getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x275f, code lost:
        if (r1.A3t == false) goto L_0x3a51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x2761, code lost:
        r4 = new X.C353858Jp(new X.C67001MgZ(r8, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x276f, code lost:
        r8 = ((com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0.A0i).A0K.getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x277b, code lost:
        if (r1.A3t == false) goto L_0x3a4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x277d, code lost:
        r4 = new X.C353858Jp(new X.C67001MgZ(r8, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x278b, code lost:
        r41 = X.AnonymousClass0eN.A01(new X.C353868Jq(r0));
        r0.A2D = r41;
        r141 = new X.C353918Jw(r0.A0M.A00(), r0.A0W, r109, r0.A0i, r135, r0.A0o, r0.A0v, r0.A11, r0.A1G, r109, r2, r45, r0.A1j, new X.AnonymousClass8Jr(r0), new X.C353878Js(r0), new X.C353888Jt(r0), new X.C353898Ju(r0), new X.C353908Jv(r0), r41, r0.A08);
        r182 = new com.instagram.creation.capture.quickcapture.save.CachingVideoSaver();
        r121 = new X.AnonymousClass8K4(r0.A09, r0.A1Y.A00, r0.A0J, r5, r0.A0R, r4, r109, r0.A0i, r135, r0.A0o, r1, r0.A1H, r134, r135, r182, r0.A1f, r4, r86, r0.A1v, r141, r17, r0.A20, r25, r0.A22, r19, r186, new X.AnonymousClass8K1(r0), new X.AnonymousClass8K2(r0), r1.A3W);
        r0.A0c = r121;
        r4 = new X.C354188Kz((android.view.ViewGroup) r0.A1Y.A00.requireViewById(com.instagram.android.R.id.post_capture_texture_view_container), r0.A0R, r0.A0i, r0.A0o);
        r15 = r0.A0R;
        r143 = r0.A09.getApplicationContext();
        r14 = r0.A0o;
        r13 = r0.A1v;
        r12 = r0.A1f;
        r11 = r0.A0T;
        r4 = r109.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x2894, code lost:
        if (r4 == null) goto L_0x3a49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x2896, code lost:
        r155 = r4.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x289a, code lost:
        r142 = new X.AnonymousClass8L1(r143, r0.A01, r15, r11, r4, r0.A0i, r14, r12, r13, r141, r17, X.AnonymousClass8KW.A00(r0.A0R), r155, r1.A2i, r1.A3W);
        r0.A0f = r142;
        r8 = r0.A09;
        r7 = r0.A0R;
        X.0qQ.A0B(r8, 0);
        X.0qQ.A0B(r7, 1);
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x28e4, code lost:
        if (X.182.A06(r108, r7, 2342173944297046873L) == false) goto L_0x28ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x28e6, code lost:
        r4 = new X.AnonymousClass8L4(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x28ed, code lost:
        r167 = r109;
        r173 = r1;
        r156 = new X.AnonymousClass8LU(r0.A09, r0.A0C, r0.A1Y.A00, r0.A0J, r5, new X.AnonymousClass8LT(r0), r0.A0R, r0.A0W, r51, r4, r167, r142, r4, r0.A0i, r4, r0.A0o, r173, new X.AnonymousClass8LR(r0), new X.AnonymousClass8LQ(r0), r0.A1H, r4, r134, r179, r27.A01, r135, r182, r0.A1f, r1.A0H(), r4, r0.A20, r0.A22, r18, r17, new X.AnonymousClass8LP(r0), new X.AnonymousClass8LS(r0));
        r0.A0g = r156;
        r120 = new X.AnonymousClass8MC(r0.A09, r0.A01, r0.A0R, r0.A0W, r109, r0.A0i, r0.A0k, r0.A0o, new X.AnonymousClass8MB(r0), r4, r156, r1.A0H(), r4);
        r0.A0h = r120;
        r109 = new X.AnonymousClass8PZ(r0.A09, r75, r0.A0J, r0.A0R, r0.A0i, r32, r105, r0.A1a, r0.A20);
        r10 = r0.A0o;
        r143 = r0.A0J.requireActivity();
        r9 = r0.A0R;
        r8 = r0.A0i;
        r7 = r0.A0k;
        r158 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x29f2, code lost:
        if (r60 == null) goto L_0x29f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x29f4, code lost:
        r158 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x29f6, code lost:
        r142 = new X.AnonymousClass8QA(r143, r9, r4, r121, r109, r156, r120, r8, r7, r10, r4, r7, r16, r1.A27, r0.A11.getModuleName(), r158);
        r0.A0a = r142;
        r161 = new X.AnonymousClass8QG(r0.A0M, r0.A0W, r4, r142, r121, r167, r156, r120, r0.A0i, r135, r0.A0o, r173, r0.A11, r0.A1G, r135, r0.A1j, r0.A1n, r42, r70, r31);
        r0.A15 = r161;
        r9 = r0.A1A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x2a64, code lost:
        if (r9 == null) goto L_0x2a8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x2a66, code lost:
        r9.A01 = new X.C378299Pg(r0.A0B, r142, r121, r109, r156, r0.A0o, r1, r0.A1f, r70, new X.C378309Ph(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x2a8e, code lost:
        r4 = new X.AnonymousClass8QH(r0);
        r7 = r156.A11;
        r7.add(r4);
        r7.add(r51.A0Q);
        r109.A06(r156);
        r0.A1n.A01 = new X.AnonymousClass8QI(r0);
        r161 = new X.AnonymousClass8QN(r0.A1Y.A00, r0.A0B, r0.A01, r0.A11, r30, r142, r121, r109, r156, r0.A0i, r135, r0.A0o, r109, r1, r161, r134, r182, r0.A1f, r141, r0.A20, r0.A2B, new X.AnonymousClass8QM(r0), r0.A2C, new X.AnonymousClass8QJ(r0), new X.AnonymousClass8QK(r0), new X.AnonymousClass8QL(r0), r0.A08);
        r0.A0b = r161;
        r64.A06(r0.A0J, new X.AnonymousClass8R6(r0));
        r11 = r0.A1f;
        r12 = r0.A09;
        r10 = r0.A0R;
        X.0qQ.A0B(r12, 2);
        X.0qQ.A0B(r10, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x2b46, code lost:
        if (r1.A3q == false) goto L_0x3a46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x2b48, code lost:
        r9 = new X.AnonymousClass8R7(r10, r11, new X.C41567AwZ(18, r12, r121, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x2b58, code lost:
        r188 = new com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController(r85, r0.A0J, r0.A0R, r192, r109, r0.A20);
        r0.A29 = r188;
        r28 = r0.A0R;
        r26 = r0.A1f;
        r25 = r0.A0J;
        r21 = r0.A0o;
        r10 = new X.AnonymousClass8RA(r0);
        r16 = r0.A20;
        r15 = r0.A0W;
        r8 = new X.AnonymousClass8RB(r0);
        r137 = r1.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x2b97, code lost:
        if (r53 == null) goto L_0x3a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x2b99, code lost:
        r4 = r53;
        r7 = r4.A0G;
        r14 = r4.A04;
        r13 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x2ba1, code lost:
        r12 = r0.A0i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:747:0x2ba7, code lost:
        if (X.AnonymousClass8IK.A05(r28) != false) goto L_0x3a3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x2baf, code lost:
        if (X.AnonymousClass8IK.A01(r0.A0R) != false) goto L_0x3a3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x2bb1, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x2bb3, code lost:
        r143 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x2bb7, code lost:
        if (r1.A2c == null) goto L_0x2bbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x2bb9, code lost:
        r143 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x2bbb, code lost:
        r4 = r1.A12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x2bbd, code lost:
        if (r4 == null) goto L_0x2bc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x2bbf, code lost:
        r144 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:0x2bc3, code lost:
        if (r4.A00 != null) goto L_0x2bc7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x2bc5, code lost:
        r144 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x2bc7, code lost:
        r120 = new com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController(r85, r0.A0C, r25, r13, r14, r28, r3, r15, r12, r21, r10, r9, r26, r109, r36, r42, r137, r16, r11, r70, r8, r7, r143, r144);
        r0.A1k = r120;
        r4 = r120;
        r1.A0t.A00.A0E(r4);
        r4.A06 = r109;
        r120 = new X.C355898Ru(r0.A09, r0.A0R, r0.A0U, r0.A0W, r109, r135, r8, r109, r9, r0.A1a, r0.A1f, r4, r1.A3t);
        r0.A1P = r120;
        r137 = r7;
        r120 = new X.C355948Rz(r0.A09, r0.A0U.requireViewById(com.instagram.android.R.id.quick_capture_bottom_shadow_overlay), r0.A0G, r0.A0H, r0.A0R, r0.A0W, r109, r135, r8, r0.A0n, r109, r1, r135, r0.A1I, r7, r0.A1Q, r137, r0.A1a, r22, r0.A1f, r0.A1j, r4, r0.A2B, r1.A3k, A05());
        r4 = r120;
        r0.A0d = r4;
        r109.A06(r4);
        r196.add(r4);
        r78 = r0.A0o;
        r8 = r0.A2B;
        r7 = r0.A0n;
        r77 = r0.A0W;
        r71 = r0.A1f;
        r109 = new X.AnonymousClass8S4(r77, r142, r120, r109, r7, r78, r71, r4, r8);
        r0.A0s.A01 = r109;
        r109.A01 = r109;
        r69 = r0.A0J;
        r68 = r0.A0R;
        r12 = r0.A0U;
        r64 = r0.A09;
        r60 = r0.A1j;
        r30 = r0.A0L;
        r21 = r0.A22;
        r16 = r0.A1A;
        r155 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x2cfd, code lost:
        if (r2 == null) goto L_0x2d01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x2cff, code lost:
        r155 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x2d01, code lost:
        r109 = new X.AnonymousClass8S5(r64, r12, (android.view.ViewGroup) r12.requireViewById(com.instagram.android.R.id.video_sticker_ltr_holder), (android.view.ViewGroup) r0.A0U.requireViewById(com.instagram.android.R.id.pre_capture_interactive_drawable_container_holder), (android.view.ViewGroup) r0.A0U.requireViewById(com.instagram.android.R.id.post_capture_interactive_drawable_container_holder), r69, r30, r0.A0M, r68, r119, r77, r51, r142, r161, r121, r120, r109, r156, r0.A0i, r24, r135, r78, r0.A0s, r16, r7, r0.A1H, r7, r137, r4, r135, r109, r109, r4, r7, r22, r71, r60, r4, r4, r70, r21, r43, r109, r0.A2B, r0.A08, r155);
        r0.A0Z = r109;
        r0.A11.A00 = r109;
        r9 = new X.B1P[]{r120, r109};
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:763:0x2d9a, code lost:
        r7 = r9[r8];
        X.0qQ.A0B(r7, 0);
        r4 = r109.A0k;
        r170 = r4;
        r4.add(r7);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:764:0x2dac, code lost:
        if (r8 < 2) goto L_0x2d9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x2dae, code lost:
        r7 = r1.A0q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x2db0, code lost:
        if (r7 == null) goto L_0x2db7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x2db2, code lost:
        r170.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:768:0x2db7, code lost:
        r7 = r0.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x2db9, code lost:
        if (r7 == null) goto L_0x2dcc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:770:0x2dbb, code lost:
        r7.A05 = r135;
        r7.A03 = r120;
        r4 = r7.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x2dc5, code lost:
        if (r4 == null) goto L_0x3a71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:772:0x2dc7, code lost:
        r4.EpC(r120);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x2dcc, code lost:
        r9 = r0.A1f;
        r87 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x2dd2, code lost:
        if (r0.A0N == null) goto L_0x2dd6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:775:0x2dd4, code lost:
        r87 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:0x2dd6, code lost:
        r11 = r1.A3y;
        r8 = r1.A43;
        r90 = X.AnonymousClass8IK.A05(r0.A0R);
        r91 = r1.A22.booleanValue();
        r10 = r0.A0R;
        X.0qQ.A0B(r10, 0);
        r9 = (X.AnonymousClass80T) r9;
        X.AnonymousClass8S9.A01(r9.A01, r87, r11, r8, r90, r91, X.182.A06(r100, r10, 36326030230762970L));
        X.AnonymousClass8S9.A00(r9.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x2e0a, code lost:
        if (X.AnonymousClass8VQ.A00 != null) goto L_0x2e14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x2e0c, code lost:
        X.AnonymousClass8VQ.A00 = X.0xn.A01("GalleryMetadataPreferences");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x2e14, code lost:
        r5 = X.AnonymousClass8VR.A00(r0.A0R);
        r5.A00 = null;
        r5.A01.A03(X.AnonymousClass8VS.class);
        r7 = r0.A0J.requireContext().getResources();
        r168 = r7.getDimensionPixelSize(com.instagram.android.R.dimen.asset_picker_redesign_sticker_height);
        r167 = r7.getDimensionPixelSize(com.instagram.android.R.dimen.asset_picker_static_sticker_last_row_padding);
        r5 = new X.AnonymousClass8VU(r0);
        r0.A0Q = r5;
        r1.A0R.A00(r5);
        r5 = r0.A0o.A02;
        r4 = "story_selfie_reply".equals(r1.A2q);
        r9 = r5.A01;
        r9.A0S = r4;
        r9.A0T = r1.A3m;
        r9.A0R = r1.A3Z;
        r4 = r1.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:780:0x2e63, code lost:
        if (r4 == null) goto L_0x2e6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x2e65, code lost:
        r8 = r4.A00;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:782:0x2e6a, code lost:
        if (r8 == 9) goto L_0x2e6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:0x2e6c, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x2e6d, code lost:
        r9.A0M = r4;
        r4 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:785:0x2e71, code lost:
        if (r4 == null) goto L_0x2ea4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:786:0x2e73, code lost:
        r10 = r0.A0R;
        r9 = new X.AnonymousClass8VV(r7, r4, r0);
        X.0qQ.A0B(r10, 0);
        r8 = new X.1NY(r10, -2);
        r8.A08(X.AnonymousClass05K.A0N);
        r8.A0A("creatives/get_unlockable_sticker_nux/");
        r8.A0O((X.15p) null, X.AnonymousClass8VW.class, X.AnonymousClass8VX.class, false);
        r5 = r8.A0M();
        r5.A00 = new X.AnonymousClass8VY(r9, r10);
        X.1ES.A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x2ea4, code lost:
        r14 = r0.A11;
        r13 = r0.A0M;
        r11 = r0.A1G;
        r10 = r0.A0W;
        r12 = r0.A1f;
        r9 = r0.A20;
        r8 = r0.A0o;
        r7 = r0.A1n;
        r4 = r0.A0i;
        X.0qQ.A0B(r11, 3);
        X.0qQ.A0B(r10, 5);
        X.0qQ.A0B(r9, 8);
        X.0qQ.A0B(r7, 11);
        X.0qQ.A0B(r4, 12);
        r86 = new X.AnonymousClass8VZ(r13, r14, r10, r161, r121, r4, r135, r8, r1, r11, r7, r12, r7, r9);
        r0.A14 = r86;
        r109.A02 = new X.C356738Va(r86);
        r7.A01 = new X.C356748Vb(r86);
        r4.A01 = new X.C356758Vc(r86);
        r4.A01 = new X.C356768Vd(r86);
        r4 = r109;
        r4.A01 = new X.C356778Ve(r86);
        r4.A01 = new X.C356778Ve(r86);
        r10 = r0.A1f;
        r9 = r0.A0R;
        r11 = r0.A0M;
        r8 = r0.A1G;
        r92 = r0.A11.getModuleName();
        r7 = r0.A0W;
        X.0qQ.A0B(r9, 1);
        X.0qQ.A0B(r8, 4);
        X.0qQ.A0B(r7, 6);
        r7 = new X.C356788Vf(r10, new X.C73917Pls(r135, r7, r8, r11, r9, r92, 2));
        r10 = r0.A1f;
        r8 = r0.A0k;
        r4 = r0.A0w;
        r7 = new X.C356798Vg(r8, r1, r4, r10);
        r0.A17 = r7;
        r82 = r0.A0J;
        r81 = r0.A0y;
        r80 = r0.A11;
        r79 = r0.A0M;
        r78 = r0.A0W;
        r77 = r0.A1j;
        r71 = r0.A0U;
        r15 = r0.A0C;
        r70 = r0.A0n;
        r69 = r0.A22;
        r68 = r0.A23;
        r14 = r0.A0I;
        r13 = r0.A1G;
        r64 = r0.A0S;
        r60 = r0.A0o;
        r51 = r0.A1L;
        r30 = r0.A0N;
        r24 = r0.A1K;
        r22 = r0.A0H;
        r12 = r0.A0i;
        r9 = new X.C356808Vh(r0);
        r8 = new X.C356818Vi(r0);
        r7 = new X.C356828Vj(r0);
        X.0qQ.A0B(r82, 3);
        X.0qQ.A0B(r78, 9);
        X.0qQ.A0B(r71, 12);
        X.0qQ.A0B(r15, 13);
        X.0qQ.A0B(r14, 22);
        X.0qQ.A0B(r13, 23);
        X.0qQ.A0B(r12, 34);
        r7 = new X.C356848Vl(r10, new X.C356838Vk(r71, r15, r22, r14, r82, r79, r30, r80, r64, r78, r121, r109, r7, r12, r135, r70, r60, r7, r1, r4, r81, r86, r13, r24, r51, r120, r109, r34, r10, r2, r77, r4, r69, r68, r9, r8, r7, r41));
        r0.A18 = r7;
        r120 = new X.AnonymousClass8W6(r0.A0N, r0.A0W, r0.A0X, r109, r142, r161, r121, r120, r109, r135, r0.A0n, r0.A0o, r32, r0.A0s, r1, new X.AnonymousClass8W5(r0), r0.A0y, r86, r7, r135, r0.A1I, r7, new X.C356918Vs(r0.A0J, r0.A0o.A02, new X.C356908Vr(r0), r0.A1f), r109, r34, r7, r4, r109, r0.A1a, r109, r4, r7, r0.A1f, r0.A1j, r109, r0.A22, r0.A24, r43, r109);
        r0.A0m = r120;
        r135.A0B = r120;
        r195.A04 = r120;
        r109.A01 = r120;
        r10 = r0.A0o;
        r13 = r0.A1f;
        r9 = r1.A1h;
        r7 = r43;
        r7.A08 = true;
        r7.A02 = r10;
        r7.A04 = r13;
        r7.A01 = r120;
        r7.A06 = r9;
        r7.A00 = r109;
        r7.A03 = r109;
        r7 = r10.A02;
        X.0qQ.A0B(r7, 3);
        r9 = new X.AnonymousClass8W7(r109, r120, r7, r86);
        r8 = r0.A0R;
        r7 = r0.A0J;
        X.0qQ.A0B(r8, 2);
        X.0qQ.A0B(r7, 3);
        new X.AnonymousClass81C(r13, X.AnonymousClass05K.A00, X.AnonymousClass8W8.A00, new X.C41567AwZ(26, r9, r8, r7), new X.C41567AwZ(27, r9, r8, r7), true);
        r9 = r0.A0v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:0x3143, code lost:
        if (r9.A28 != X.AnonymousClass05K.A02) goto L_0x3a38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x3145, code lost:
        r12 = r0.A0C;
        r8 = r0.A0U.getContext();
        r11 = r0.A09;
        r7 = r0.A0R;
        r86 = new com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController(r11, r8, r12, r85, r0.A0J.getViewLifecycleOwner(), r7, r109, r142, r121, r109, r9, r20, r20, X.JYB.A00(r8, r7, new java.lang.Object()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x317f, code lost:
        r0.A13 = r22;
        r0.A1Q.A04(r120);
        r13 = r0.A0R;
        r12 = r0.A0s;
        r11 = r0.A0o;
        r10 = r0.A2B;
        r9 = r0.A1f;
        r97 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:0x3194, code lost:
        if (r2 == null) goto L_0x3198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x3196, code lost:
        r97 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:0x3198, code lost:
        r0.A1r.A00().A0C = new X.AnonymousClass8WF(r0.A0U.requireViewById(com.instagram.android.R.id.quick_capture_top_shadow_overlay), r13, r63, r120, r109, r135, r11, r32, r12, r9, r0.A22, r10, r97);
        r7 = r120.A0T;
        r169 = r7;
        r7.add(r109);
        r9 = r0.A22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x31d3, code lost:
        if (r9 == null) goto L_0x31f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x31d5, code lost:
        r9.A0S.add(new X.C40434Ac5(r63, r0));
        r8 = r0.A22;
        X.0qQ.A0B(r8, 0);
        r169.add(r8);
        r8 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x31ed, code lost:
        if (r8 == null) goto L_0x31f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:0x31ef, code lost:
        r8.A01 = r135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x31f3, code lost:
        r13 = r0.A0U.getContext();
        r12 = r0.A09;
        r11 = r0.A0R;
        r10 = r0.A1f;
        r14 = r0.A0o;
        r9 = new X.C71662eb((android.view.ViewStub) r0.A1Y.A00.requireViewById(com.instagram.android.R.id.layout_post_capture_recycler_stub));
        r8 = r0.A0i;
        X.0qQ.A0B(r13, 0);
        X.0qQ.A0B(r12, 1);
        X.0qQ.A0B(r11, 2);
        X.0qQ.A0B(r8, 9);
        r8 = new X.AnonymousClass8WH(r10, new X.C41572Awe(r12, r13, r11, r119, r9, r8, r120, r14, r109, r10));
        r10 = r0.A0J;
        r9 = r10.requireActivity();
        r8 = r0.A0R;
        X.0qQ.A0B(r8, 1);
        r11 = new X.2YN(new X.AnonymousClass72M(r9, r8), r10).A00(X.AnonymousClass72N.class);
        r0.A0O = r11;
        r10 = r0.A0C;
        r9 = r0.A0U;
        r82 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x3272, code lost:
        if (r0.A22 == null) goto L_0x3276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x3274, code lost:
        r82 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:0x3276, code lost:
        r8 = new X.AnonymousClass8WI(r0);
        X.0qQ.A0B(r10, 0);
        X.0qQ.A0B(r9, 2);
        r76 = new X.AnonymousClass8WJ(r10, r9, r1, r7, r8, r82);
        r0.A16 = r76;
        r83 = r0.A1f;
        r12 = r0.A0R;
        r82 = r0.A1Q;
        r81 = r0.A1a;
        r80 = r0.A0o;
        r79 = r0.A09;
        r78 = r0.A0C;
        r77 = r0.A0U;
        r76 = r0.A0W;
        r71 = r0.A0J;
        r70 = r1.A0O;
        r69 = r0.A1X;
        r68 = r0.A0p;
        r64 = r0.A1I;
        r63 = r0.A22;
        r62 = r0.A0N;
        r61 = r0.A0M;
        r60 = r0.A0y;
        r59 = r0.A0k;
        r56 = r0.A20;
        r54 = r0.A1O;
        r52 = r0.A1j;
        r51 = r0.A0I;
        r50 = r0.A1n;
        r49 = r0.A1v;
        r7 = r71.requireContext();
        X.0qQ.A0B(r12, 0);
        r10 = new X.2YN(new X.AnonymousClass8WN(new com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService(X.C311766dD.A00(r7, r12), r12, new X.AnonymousClass8WL())), r71).A00(X.AnonymousClass8WO.class);
        r48 = r0.A0i;
        r39 = r0.A0v.A1I;
        r34 = r0.A04;
        r15 = r0.A0J;
        r14 = r0.A0R;
        r13 = r0.A0W;
        X.0qQ.A0B(r14, 0);
        X.0qQ.A0B(r13, 1);
        r9 = com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.class;
        r8 = new X.2YN(X.AnonymousClass8WR.A00(new X.AnonymousClass8WQ((java.lang.Class) r9, (X.0sP) new X.C66312MMv(29, r13, r14))), r15).A00(r9);
        r13 = r0.A0v.A0H();
        r14 = r1.A1H;
        X.0qQ.A0B(r79, 8);
        X.0qQ.A0B(r78, 9);
        X.0qQ.A0B(r77, 10);
        X.0qQ.A0B(r76, 12);
        X.0qQ.A0B(r70, 15);
        X.0qQ.A0B(r56, 34);
        X.0qQ.A0B(r58, 35);
        X.0qQ.A0B(r54, 36);
        X.0qQ.A0B(r45, 37);
        X.0qQ.A0B(r51, 39);
        X.0qQ.A0B(r50, 40);
        X.0qQ.A0B(r10, 44);
        X.0qQ.A0B(r48, 47);
        X.0qQ.A0B(r36, 48);
        X.0qQ.A0B(r11, 49);
        X.0qQ.A0B(r23, 50);
        X.0qQ.A0B(r34, 52);
        X.0qQ.A0B(r8, 53);
        X.0qQ.A0B(r13, 54);
        r9 = new X.AnonymousClass8WX(r83, new X.AnonymousClass8WW(r79, r77, r78, r75, r51, r71, r61, r62, r11, r70, r12, r76, r109, r142, r161, r120, r48, r34, r59, r135, r120, r8, r80, r68, r1, r60, r86, r76, r7, r64, r105, r8, r10, r54, r120, r82, r8, r7, r69, r81, r83, r45, r52, r50, r58, r23, r36, r42, r13, r49, r109, r56, r63, r43, r17, r14, r39));
        r0.A1N = r9;
        r0.A1j.ETA(r9);
        r120.A01 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x347e, code lost:
        if (((java.util.Set) r0.A0W.A07.A00).contains(r40) == false) goto L_0x34b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x3480, code lost:
        if (r53 == null) goto L_0x34b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:0x3486, code lost:
        if (r53.A04 != null) goto L_0x34b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:806:0x3488, code lost:
        r11 = r0.A0R;
        new X.C378689Qv(r0.A0J, r11, r0.A0W, r9, new X.2YN(new X.AnonymousClass8I5(r11), (X.AnonymousClass07g) r0.A09).A00(X.AnonymousClass8I6.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x34b3, code lost:
        r76 = new X.C357028Wd(r1, r76, r0.A1f, new X.AnonymousClass8WZ(r0), new X.C356998Wa(r0), new X.C357008Wb(r0), new X.C357018Wc(r0), new X.AnonymousClass8WY(r0));
        r0.A12 = r76;
        r120.A00 = r76;
        r0.A23.A00 = r76;
        r0.A1T = new X.C357038Wf(r0.A09, r0.A11, r0.A0R, r161, r109, r1, r0.A0y, r76, r86, r2, new X.AnonymousClass8We(r0));
        r12 = new X.C357058Wh(r0.A0J, X.C357048Wg.A05, r0.A0R);
        r0.A0K = r12;
        r109 = new X.C357068Wi(r12, r0.A0L, r0.A0T, r0.A0V, r0.A0W, r0.A0X, r4, r142, r121, r109, r156, r0.A0i, r0.A0j, r0.A0k, r0.A0o, r1, r0.A11, r7, r0.A1E, r9, r7, r0.A1X, r0.A1Y, r135, r0.A1f, r2, r0.A1j, r0.A1n, r0.A1t, r0.A1u, r0.A1y, r0.A20, r0.A2B);
        r0.A1C = r109;
        r0.A1D = new X.C357088Wk(r0.A0C, r12, r0.A0L, r0.A0U, r0.A0V, r142, r161, r121, r109, r142, r156, r120, r0.A0o, r1, r0.A11, r7, r0.A1E, r0.A1Y, r135, r0.A1f, r0.A1v, r0.A28, new X.C357078Wj(r0), r41);
        r79 = r142;
        r80 = r161;
        r81 = r121;
        r82 = r109;
        r0.A1U = new X.C357178Wv(r0.A0T, r0.A0X, r79, r80, r81, r82, r0.A0o, r0.A0s, r1, r7, r9, r0.A1O, r135, r0.A1f, r0.A1r, r0.A2B, r0.A2C, new X.C357168Wu(r0));
        r0.A1l = new X.C357188Ww(r0.A0W, r0.A0X, r79, r80, r81, r82, r142, r156, r120, r0.A0i, r0.A0k, r0.A0o, r1, r7, r120, r0.A1y, r0.A2B);
        r12 = r0.A0W;
        r11 = r0.A1n;
        r10 = r0.A0o;
        r9 = r0.A1f;
        r86 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x3696, code lost:
        if (r1.A3i == false) goto L_0x369a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x3698, code lost:
        r86 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x369a, code lost:
        r76 = new X.C357198Wx(r0.A0C.requireViewById(com.instagram.android.R.id.camera_photo_texture_view), r0.A0T, r0.A0R, r12, r109, r135, r10, r1, r76, r86, r9, r11, r19, r18, android.view.ViewConfiguration.get(r0.A09).getScaledMinimumFlingVelocity());
        r0.A1R = r76;
        r169.add(r76);
        r13 = X.C314666ie.A00(new X.AnonymousClass8X0(r0), new X.AnonymousClass8X1());
        r0.A1x = r13;
        r127 = new X.AnonymousClass8X3(r0.A0C, r0.A0I, r0.A0U, r0.A0W, r0.A0X, r142, r161, r121, r120, r0.A0e, r142, r156, r120, r0.A0i, r0.A0k, r0.A0o, r1, r0.A10, r0.A11, r22, r161, r7, r7, r109, r0.A1I, r9, r0.A1V, r0.A1Y, r135, r0.A1c, r0.A1f, r120, r0.A1n, r0.A1r, r0.A1v, r0.A1y, r13, r188, new X.AnonymousClass8X2(r0), r167, r168);
        r14 = r0.A1f;
        r3 = r0.A0o;
        r13 = r0.A0N;
        r12 = r0.A1I;
        r11 = r0.A1H;
        r14 = (X.AnonymousClass80T) r14;
        r10 = r14.A02;
        r10.A02(r109);
        r9 = r1.A05;
        X.0qQ.A07(r9);
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r7 = r3.A02;
        X.0qQ.A0B(r7, 2);
        r10.A02(new X.AnonymousClass8X4(r9, r8, r7));
        r8 = r1.A0S;
        X.0qQ.A07(r8);
        r1.A0M.getClass();
        r10.A02(new X.AnonymousClass8X5(r8, r1.A0M.requireContext()));
        r8 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x37cb, code lost:
        if (r12 == null) goto L_0x37d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:0x37cd, code lost:
        r8.A01(r12, X.AnonymousClass80V.A11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:0x37d2, code lost:
        if (r13 == null) goto L_0x37d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:814:0x37d4, code lost:
        r8.A01(r13, X.AnonymousClass80V.A0p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:815:0x37d9, code lost:
        r9 = r1.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:0x37db, code lost:
        if (r9 == null) goto L_0x37e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:817:0x37dd, code lost:
        r8.A01(new X.AfV(r9), X.AnonymousClass80V.A0j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x37e7, code lost:
        r8.A02(r127);
        r8.A02(r109.A0D);
        r7 = r1.A0S;
        X.0qQ.A07(r7);
        r8.A02((X.C3493580b) r7.A01(X.AnonymousClass8X6.class, new X.MMT(r7, 29)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:0x3808, code lost:
        if (r13 == null) goto L_0x380d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:820:0x380a, code lost:
        r8.A02(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:821:0x380d, code lost:
        r8.A02(r11);
        r2 = r0.A23;
        r2.A02 = r7;
        r2.A01 = r86;
        r2.A04 = r0.A1g;
        r2.A03 = r7;
        r58.A04.A06(r0.A0J, new X.C319096q2(new X.AnonymousClass8X7(r0)));
        r0.A2F = true;
        A02(r75, r73, r0.A0W.A06(), r0, r72);
        r21 = r0.A19;
        r15 = r0.A0C;
        r20 = r0.A0H;
        r19 = r0.A0J;
        r18 = r0.A1f;
        r16 = r0.A0U;
        r14 = r0.A2E;
        r13 = r0.A0G;
        r12 = r0.A1q;
        r11 = r0.A0n;
        r10 = r0.A1X;
        r9 = r0.A1a;
        r8 = r0.A0p;
        r7 = r0.A1F;
        r5 = r0.A1L;
        r3 = r0.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:822:0x3874, code lost:
        if (X.11Z.A07() == false) goto L_0x3a00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:823:0x3876, code lost:
        X.C357338Xm.A00(r13, r20, r19, r16, r135, r120, r11, r8, r32, r1, r21, r7, r3, r5, r9, r120, r10, r9, r18, r23, r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:824:0x38a5, code lost:
        r9 = r0.A09;
        r8 = r0.A1f;
        r7 = r0.A0R;
        r5 = r0.A11;
        r4 = r0.A0W;
        r3 = r0.A2B;
        r2 = r0.A0e;
        X.0qQ.A0B(r9, 0);
        X.0qQ.A0B(r7, 2);
        X.0qQ.A0B(r4, 4);
        X.0qQ.A0B(r3, 5);
        r3 = new X.C357438Xw(r8, new X.C58223IoR(3, r5, r2, r9, r3, r4, r7));
        r170.add(r3);
        r0.A1f.A7w(r3);
        A03(r0);
        r4 = new java.lang.Object();
        r0.A0z.A00 = r4;
        r3 = r0.A0R;
        X.0qQ.A0B(r3, 0);
        r3.A04(X.C357458Xy.class, r4);
        r7 = r0.A0W;
        r5 = r0.A0n;
        r4 = r1.A0S;
        X.0qQ.A0B(r4, 0);
        r8 = r108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:825:0x3912, code lost:
        if (X.182.A06(r8, r4, 36319415981120908L) != false) goto L_0x392a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:0x391d, code lost:
        if (X.182.A06(r8, r4, 36319415981251982L) != false) goto L_0x392a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:0x3928, code lost:
        if (X.182.A06(r8, r4, 36319415981186445L) == false) goto L_0x3988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:0x392a, code lost:
        r10 = r1.A05;
        r9 = r1.A0S;
        r8 = new android.graphics.drawable.GradientDrawable();
        r8.setStroke(r10.getResources().getDimensionPixelSize(com.instagram.android.R.dimen.abc_action_bar_elevation_material), r10.getColor(X.2Yu.A0H(r10, com.instagram.android.R.attr.igds_color_gradient_blue)));
        r4 = new android.graphics.drawable.GradientDrawable();
        r4.setStroke(r10.getResources().getDimensionPixelSize(com.instagram.android.R.dimen.abc_action_bar_elevation_material), r10.getColor(X.2Yu.A0H(r10, com.instagram.android.R.attr.igds_color_gradient_blue)));
        r4.setCornerRadius((float) r10.getResources().getDimensionPixelSize(com.instagram.android.R.dimen.abc_select_dialog_padding_start_material));
        r75.getRootView().setOnDragListener(new X.LYJ(r10, r8, r4, r75, r9, r7, r5, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:832:0x398a, code lost:
        if (r1.A3m == false) goto L_0x39b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:833:0x398c, code lost:
        r0.A0U.requireViewById(com.instagram.android.R.id.video_pog_in_note_camera_background).setVisibility(0);
        r0.A0U.requireViewById(com.instagram.android.R.id.quick_capture_top_shadow_overlay).setVisibility(8);
        r4 = r0.A0U;
        r3 = r0.A09;
        r4.setBackgroundColor(r3.getColor(X.2Yu.A0C(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:835:0x39b9, code lost:
        if (r1.A0B != X.28D.A4n) goto L_0x39c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:836:0x39bb, code lost:
        r0.A1f.A7w(new X.AfX(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:837:0x39c5, code lost:
        r4 = (X.AnonymousClass8ME) r0.A0e.A1g.get();
        r1 = r4.A1J.A0H;
        r3 = r4.A0l;
        r1.A06(r3, new X.C357468Xz(r4));
        r4.A0n.A03.A06(r3.requireActivity(), new X.AnonymousClass8Y0(r4));
        X.C226292g8.A00(r103, r4.A1n.A08).A06(r3, new X.AnonymousClass8Y1(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:838:0x39ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:839:0x3a00, code lost:
        r15.post(new X.Ar7(r13, r20, r19, r16, r135, r120, r11, r8, r32, r1, r21, r7, r3, r5, r9, r120, r10, r9, r18, r23, r12, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:840:0x3a38, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:841:0x3a3c, code lost:
        r11 = r0.A2B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:842:0x3a40, code lost:
        r7 = false;
        r14 = null;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:843:0x3a46, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:844:0x3a49, code lost:
        r155 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x3a4d, code lost:
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:846:0x3a51, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x3a55, code lost:
        r4 = new X.C40385AbI();
        r0.A1j = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:848:0x3a5e, code lost:
        r7 = X.AnonymousClass883.BUILDER_PLAYBACK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:849:0x3a62, code lost:
        X.C3511387s.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x051f, code lost:
        if (X.0qQ.A0K(r5, r7) == false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:850:0x3a67, code lost:
        r7.A0g((java.lang.String) null);
        r15.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x3a76, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x3a7c, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:0x3a82, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:858:0x3a88, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:860:0x3a8e, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:862:0x3a94, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:864:0x3a9a, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:866:0x3aa0, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x3aa6, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x3aac, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:872:0x3ab2, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x3ab8, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:876:0x3abe, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:878:0x3ac4, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:880:0x3aca, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x3ad0, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:884:0x3ad6, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x3adc, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x3ae2, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x3ae8, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x3aee, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x3af4, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x3afa, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x3b00, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:900:0x3b06, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x3b0c, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:904:0x3b12, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:906:0x3b18, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x06c3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0705  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0972  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x097a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x09eb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x09fd  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0bf2  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0bf7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0c4a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0c80  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0cc3  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0db7  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0de1  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0e03  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0eb3  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0eea  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0fef  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x1f77  */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x1f7e  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x1fac  */
    /* JADX WARNING: Removed duplicated region for block: B:578:0x1fdc  */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x1fef  */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x201c  */
    /* JADX WARNING: Removed duplicated region for block: B:633:0x232c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:640:0x235a  */
    /* JADX WARNING: Removed duplicated region for block: B:641:0x235f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:649:0x2375  */
    /* JADX WARNING: Removed duplicated region for block: B:650:0x23a5  */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x23d5  */
    /* JADX WARNING: Removed duplicated region for block: B:653:0x23dd  */
    /* JADX WARNING: Removed duplicated region for block: B:655:0x23e6  */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x2439  */
    /* JADX WARNING: Removed duplicated region for block: B:672:0x2442  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass80R(X.AnonymousClass80D r198) {
        /*
            r197 = this;
            r0 = r197
            r0.<init>()
            X.80S r1 = new X.80S
            r1.<init>()
            r0.A0z = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.A2C = r1
            r1 = 1057803469(0x3f0ccccd, float:0.55)
            r0.A00 = r1
            r106 = 0
            r1 = r106
            r0.A06 = r1
            r1 = r198
            r0.A0v = r1
            android.app.Activity r8 = r1.A05
            r0.A09 = r8
            com.instagram.common.session.UserSession r3 = r1.A0S
            r0.A0R = r3
            X.4DH r2 = r1.A0M
            r2.getClass()
            X.4DH r2 = r1.A0M
            r43 = r2
            r0.A0J = r2
            X.80T r9 = new X.80T
            r9.<init>()
            r0.A1f = r9
            r2 = r8
            X.07g r2 = (X.AnonymousClass07g) r2
            r42 = r2
            X.07f r6 = r42.getViewModelStore()
            com.instagram.model.direct.camera.DirectCameraViewModel r7 = r1.A1I
            r5 = 0
            if (r7 == 0) goto L_0x007f
            com.instagram.model.direct.DirectShareTarget r10 = r7.A03
            if (r10 == 0) goto L_0x007f
            boolean r2 = r10.A0T()
            if (r2 != 0) goto L_0x007f
            X.3t2 r2 = r10.A09
            r2.getClass()
            boolean r2 = r2 instanceof X.AnonymousClass9HR
            if (r2 != 0) goto L_0x007f
            X.3t2 r2 = r10.A09
            r2.getClass()
            X.3t1 r2 = X.AnonymousClass6W3.A01(r2)
            X.AnonymousClass6W4.A01(r2)
            int r4 = r7.A00
            if (r4 == 0) goto L_0x0070
            r2 = 3
            if (r4 != r2) goto L_0x007f
        L_0x0070:
            com.instagram.common.session.UserSession r2 = r1.A0S
            java.lang.String r2 = r2.A06
            boolean r2 = r10.A0Y(r2)
            if (r2 != 0) goto L_0x007f
            boolean r2 = r7.A09
            if (r2 != 0) goto L_0x007f
            r5 = 1
        L_0x007f:
            boolean r4 = r1.A0I()
            X.80c r2 = new X.80c
            r2.<init>(r8, r3, r5, r4)
            X.2YN r4 = new X.2YN
            r4.<init>(r2, r6)
            java.lang.Class<X.8Yz> r2 = X.C357638Yz.class
            X.2YL r16 = r4.A00(r2)
            r2 = r16
            X.8Yz r2 = (X.C357638Yz) r2
            r16 = r2
            r0.A0W = r2
            android.content.Context r4 = r8.getApplicationContext()
            r2 = 0
            X.0qQ.A0B(r4, r2)
            r7 = 1
            X.0qQ.A0B(r3, r7)
            X.80w r5 = new X.80w
            r5.<init>(r4, r3)
            X.2YN r4 = new X.2YN
            r2 = r42
            r4.<init>(r5, r2)
            java.lang.Class<X.80x> r2 = X.C3495780x.class
            X.2YL r13 = r4.A00(r2)
            X.80x r13 = (X.C3495780x) r13
            r0.A20 = r13
            android.view.ViewGroup r5 = r1.A09
            X.810 r91 = new X.810
            r4 = r91
            r2 = r43
            r4.<init>(r5, r2, r3)
            X.814 r2 = new X.814
            r2.<init>(r0)
            r0.A0w = r2
            android.app.Activity r2 = r1.A05
            java.lang.String r4 = r2.getPackageName()
            java.lang.String r22 = "com.instagram.basel"
            r2 = r22
            boolean r4 = r4.equals(r2)
            X.815 r2 = new X.815
            r2.<init>(r0, r4)
            r0.A10 = r2
            X.816 r4 = new X.816
            r4.<init>(r0)
            r0.A0x = r4
            X.80C r2 = r1.A0t
            X.2jd r2 = r2.A00
            r2.A0E(r4)
            X.817 r2 = new X.817
            r2.<init>()
            r0.A1E = r2
            java.lang.Boolean r2 = r1.A22
            boolean r10 = r2.booleanValue()
            r0.A2G = r10
            if (r10 == 0) goto L_0x0139
            android.view.ViewGroup r2 = r1.A09
            r0.A0A = r2
        L_0x0107:
            X.0Tu r108 = X.0Tu.A05
            r4 = 36315683656830438(0x8104ec00240de6, double:3.029522803875741E-306)
            r2 = r108
            boolean r2 = X.182.A06(r2, r3, r4)
            if (r2 == 0) goto L_0x0122
            X.0nO r4 = X.0nY.A00()
            X.9kj r2 = new X.9kj
            r2.<init>(r0)
            r4.ATE(r2)
        L_0x0122:
            r4 = 36327267181279548(0x810f750000393c, double:3.0368482713804673E-306)
            r2 = r108
            boolean r2 = X.182.A06(r2, r3, r4)
            r107 = 1
            if (r2 == 0) goto L_0x0133
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo.A14 = r7
        L_0x0133:
            java.lang.String r2 = "igcam_inflate_qcc_layout"
            X.0lq.A02(r2)
            goto L_0x013e
        L_0x0139:
            r2 = r106
            r0.A0A = r2
            goto L_0x0107
        L_0x013e:
            android.app.Activity r2 = r1.A05     // Catch:{ all -> 0x3b31 }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ all -> 0x3b31 }
            r2 = r22
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x3b31 }
            if (r2 == 0) goto L_0x0153
            android.view.ViewGroup r2 = r1.A09     // Catch:{ all -> 0x3b31 }
        L_0x014e:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r2     // Catch:{ all -> 0x3b31 }
            r0.A0U = r2     // Catch:{ all -> 0x3b31 }
            goto L_0x0169
        L_0x0153:
            r26 = 2131627125(0x7f0e0c75, float:1.8881506E38)
            android.view.ViewGroup r2 = r1.A09     // Catch:{ all -> 0x3b31 }
            android.view.LayoutInflater r23 = r8.getLayoutInflater()     // Catch:{ all -> 0x3b31 }
            r27 = 0
            r24 = r106
            r25 = r2
            r28 = r27
            android.view.View r2 = X.2Su.A01(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x3b31 }
            goto L_0x014e
        L_0x0169:
            X.0lq.A01()
            r6 = 0
            X.02m r11 = X.02m.A0p
            r5 = 17629194(0x10d000a, float:2.5897638E-38)
            java.lang.String r4 = "includes_layout_inflation"
            r11.markerAnnotate(r5, r4, r7)
            X.818 r26 = X.AnonymousClass818.IG_STORY_COMPOSER_CLOSE_FRIENDS_STORY_BUTTON
            X.819 r27 = X.AnonymousClass819.BOTTOMSHEET_CLOSE_FRIENDS_STORY_FEED
            X.81A r5 = new X.81A
            r5.<init>()
            java.lang.Boolean r98 = java.lang.Boolean.valueOf(r7)
            r4 = r98
            r5.A09(r4)
            java.lang.Boolean r97 = java.lang.Boolean.valueOf(r6)
            r4 = r97
            r5.A0A(r4)
            X.GVB r4 = new X.GVB
            r23 = r4
            r24 = r7
            r25 = r3
            r28 = r5
            r29 = r6
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.81B r5 = new X.81B
            r5.<init>(r9, r4)
            r0.A28 = r5
            X.0tS r4 = X.0tS.A00()
            boolean r4 = r4.A0U()
            if (r4 == 0) goto L_0x01dd
            r4 = 2131429425(0x7f0b0831, float:1.8480522E38)
            android.view.View r4 = r2.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r5 = r4.inflate()
            r4 = 2131429424(0x7f0b0830, float:1.848052E38)
            android.view.View r12 = r5.requireViewById(r4)
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.content.Context r11 = r8.getApplicationContext()
            r5 = 30
            X.MMW r4 = new X.MMW
            r4.<init>(r5, r11, r3)
            java.lang.Class<X.A6p> r5 = X.C39724A6p.class
            java.lang.Object r4 = r3.A01(r5, r4)
            X.A6p r4 = (X.C39724A6p) r4
            r4.A00 = r12
        L_0x01dd:
            r4 = 2131438067(0x7f0b29f3, float:1.849805E38)
            android.view.View r75 = r2.requireViewById(r4)
            r4 = r75
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r75 = r4
            r4 = 2131438069(0x7f0b29f5, float:1.8498054E38)
            r5 = r75
            android.view.View r73 = r5.requireViewById(r4)
            r4 = r73
            com.instagram.creation.base.ui.grid.GridLinesView r4 = (com.instagram.creation.base.ui.grid.GridLinesView) r4
            r73 = r4
            r4 = 2131431029(0x7f0b0e75, float:1.8483776E38)
            android.view.View r72 = r5.requireViewById(r4)
            r4 = r72
            com.instagram.creation.photo.crop.CropHighlightView r4 = (com.instagram.creation.photo.crop.CropHighlightView) r4
            r72 = r4
            X.81H r12 = new X.81H
            r11 = r5
            r5 = r106
            r12.<init>(r11, r5, r5)
            r4 = r72
            r4.setHighlightView(r12)
            r4 = 2131099788(0x7f06008c, float:1.781194E38)
            r5 = r72
            r5.setDarkenPaintColor(r4)
            android.app.FragmentManager r4 = r8.getFragmentManager()
            int r4 = r4.getBackStackEntryCount()
            r0.A08 = r4
            X.28D r4 = r1.A0B
            r0.A01 = r4
            X.81I r4 = new X.81I
            r4.<init>(r0)
            r0.A0P = r4
            java.lang.Boolean r4 = r1.A23
            boolean r4 = r4.booleanValue()
            X.9QA r95 = X.AnonymousClass9QA.A00
            if (r4 == 0) goto L_0x2495
            X.8aL r4 = X.C358088aL.A0C
            X.8aL[] r5 = new X.C358088aL[]{r4}
            r4 = r95
            com.instagram.creation.cameraconfiguration.CameraConfiguration r4 = X.C358098aM.A00(r4, r5)
        L_0x0246:
            X.9Qn r5 = r1.A13
            r53 = r5
            com.instagram.creation.cameraconfiguration.CameraConfiguration r5 = r1.A0V
            if (r5 == 0) goto L_0x024f
            r4 = r5
        L_0x024f:
            X.80H r5 = r1.A0W
            r18 = r5
            java.util.Set r5 = r4.A04
            r17 = r5
            X.4yO r15 = r4.A03
            X.28D r14 = r0.A01
            boolean r12 = r4.A00
            boolean r11 = r4.A02
            boolean r5 = r4.A01
            X.7wF r4 = r1.A0s
            r23 = r16
            r24 = r14
            r25 = r18
            r26 = r15
            r27 = r4
            r28 = r17
            r29 = r12
            r30 = r11
            r31 = r5
            r23.A0C(r24, r25, r26, r27, r28, r29, r30, r31)
            r0.A02 = r15
            X.81Q r11 = new X.81Q
            r5 = r73
            r12 = r72
            r4 = r75
            r11.<init>(r4, r5, r0, r12)
            r4 = r16
            r4.A0E(r11)
            X.B1x r5 = r1.A0i
            if (r5 == 0) goto L_0x0298
            X.7ig r4 = new X.7ig
            r4.<init>(r5)
            r5 = r16
            r5.A0F(r4)
        L_0x0298:
            X.28D r4 = r0.A01
            X.0qQ.A0B(r4, r6)
            r13.A00 = r4
            X.81T r37 = new X.81T
            r4 = r37
            r4.<init>(r13)
            r0.A11 = r4
            X.3E5 r24 = X.AnonymousClass3E4.A01(r0, r6, r6)
            r4 = r24
            r0.A0S = r4
            r4.A09 = r7
            boolean r4 = r1.A3K
            if (r4 == 0) goto L_0x248b
            int r4 = r1.A01
            if (r4 <= 0) goto L_0x248b
            android.app.Activity r4 = r1.A05
            int r26 = X.AnonymousClass0nB.A01(r4)
            int r4 = r1.A01
            android.app.Activity r5 = r1.A05
            android.content.res.Resources r11 = r5.getResources()
            r5 = 2131165232(0x7f070030, float:1.7944675E38)
            int r31 = r11.getDimensionPixelSize(r5)
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r19 = new com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl
            r25 = r19
            r27 = r4
            r28 = r6
            r29 = r6
            r30 = r6
            r32 = r6
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
        L_0x02e0:
            r4 = r19
            r0.A0i = r4
            if (r10 == 0) goto L_0x2484
            android.view.View r4 = r0.A0A
            if (r4 == 0) goto L_0x2484
            r5 = r19
            A01(r4, r5, r1, r10)
        L_0x02ef:
            X.81Z r14 = new X.81Z
            r14.<init>(r0)
            android.content.Context r5 = r2.getContext()
            X.81b r89 = new X.81b
            r4 = r89
            r4.<init>(r5, r14, r3)
            com.instagram.model.direct.camera.DirectCameraViewModel r4 = r1.A1I
            r17 = r4
            X.82i r4 = r1.A18
            r60 = r4
            X.81e r20 = new X.81e
            r4 = r20
            r4.<init>(r0)
            r0.A0y = r4
            android.view.View r12 = r75.getRootView()
            X.0qQ.A0B(r12, r7)
            com.instagram.common.session.UserSession r5 = r1.A0S
            X.0qQ.A07(r5)
            android.app.Activity r4 = r1.A05
            android.content.Context r4 = r4.getApplicationContext()
            boolean r4 = X.C362988ir.A01(r4, r5)
            if (r4 == 0) goto L_0x0360
            com.instagram.common.session.UserSession r15 = r1.A0S
            X.0qQ.A07(r15)
            r4 = 36316242003628188(0x81056e0034109c, double:3.02987590463892E-306)
            r11 = r108
            boolean r5 = X.182.A06(r11, r15, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            if (r4 == 0) goto L_0x0344
            X.C363058j1.A01 = r5
            X.8j3 r4 = X.C363058j1.A00
            r4.A00 = r5
        L_0x0344:
            X.1pd r4 = X.C362988ir.A00()
            X.VgJ r15 = X.1pd.A00(r4)
            android.app.Activity r11 = r1.A05
            X.0qQ.A07(r11)
            com.instagram.common.session.UserSession r5 = r1.A0S
            X.0qQ.A07(r5)
            X.WdW r4 = new X.WdW
            r4.<init>(r12, r1)
            java.lang.String r12 = "SupernovaQccInitializer"
            r15.A00(r11, r5, r4, r12)
        L_0x0360:
            X.81f r5 = new X.81f
            r5.<init>(r0)
            X.81g r4 = new X.81g
            r4.<init>(r14)
            X.7pD r12 = r1.A0p
            X.81i r11 = new X.81i
            r25 = r11
            r26 = r75
            r27 = r4
            r28 = r89
            r29 = r16
            r30 = r1
            r31 = r12
            r32 = r13
            r33 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A1Q = r11
            r104 = 15
            X.MJ9 r5 = new X.MJ9
            r4 = r104
            r5.<init>(r4, r1, r2)
            X.81m r23 = new X.81m
            r4 = r23
            r4.<init>(r9, r5)
            r0.A1a = r4
            X.81o r105 = new X.81o
            r105.<init>()
            X.27r r4 = X.27p.A01(r3)
            X.29E r12 = r4.A00
            X.0qQ.A0B(r12, r7)
            X.0Tu r100 = X.0Tu.A06
            r4 = 36599048417250687(0x8206a400070d7f, double:3.208723819383812E-306)
            r7 = r100
            long r4 = X.182.A01(r7, r3, r4)
            r14 = 17629207(0x10d0017, float:2.5897674E-38)
            X.81q r21 = new X.81q
            r7 = r21
            r7.<init>(r12, r14, r4)
            X.81t r4 = r23.A00()
            r4.getClass()
            X.820 r7 = new X.820
            r7.<init>(r4)
            X.822 r5 = new X.822
            r5.<init>(r0)
            r26 = 29
            X.IoC r4 = new X.IoC
            r25 = r4
            r27 = r37
            r28 = r3
            r29 = r2
            r30 = r7
            r25.<init>(r26, r27, r28, r29, r30)
            r26 = 30
            X.IoC r7 = new X.IoC
            r25 = r7
            r30 = r5
            r25.<init>(r26, r27, r28, r29, r30)
            X.823 r5 = new X.823
            r5.<init>(r9, r4, r7)
            r0.A0p = r5
            X.07f r12 = r43.getViewModelStore()
            android.content.Context r7 = r8.getApplicationContext()
            X.0qQ.A0B(r7, r6)
            X.824 r5 = new X.824
            r4 = r105
            r5.<init>(r7, r3, r4)
            X.2YN r4 = new X.2YN
            r4.<init>(r5, r12)
            java.lang.Class<X.825> r5 = X.AnonymousClass825.class
            X.2YL r25 = r4.A00(r5)
            r4 = r25
            X.825 r4 = (X.AnonymousClass825) r4
            r25 = r4
            r0.A1q = r4
            X.6ds r4 = r11.A00
            if (r4 != 0) goto L_0x0420
            X.827 r4 = new X.827
            r4.<init>(r11)
            r11.A00 = r4
        L_0x0420:
            X.28D r5 = r0.A01
            java.lang.String r124 = X.AnonymousClass828.A00(r5)
            X.823 r14 = r0.A0p
            X.829 r5 = new X.829
            r5.<init>(r0)
            X.82A r117 = new X.82A
            r117.<init>()
            android.content.Context r7 = r8.getApplicationContext()
            X.0qQ.A07(r7)
            boolean r7 = X.C305756Jk.A00(r7)
            if (r7 == 0) goto L_0x2480
            android.content.Context r12 = r8.getApplicationContext()
            X.0qQ.A07(r12)
            X.6dv r11 = X.C312146dt.A00(r3)
            r7 = r106
            X.6dz r116 = X.C312176dx.A00(r12, r4, r11, r7, r3)
        L_0x0450:
            android.content.Context r27 = r8.getApplicationContext()
            com.instagram.camera.effect.mq.IgCameraEffectsController r115 = new com.instagram.camera.effect.mq.IgCameraEffectsController
            r26 = r115
            r28 = r21
            r29 = r89
            r30 = r116
            r31 = r3
            r32 = r16
            r33 = r20
            r34 = r124
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            r11 = 46
            X.AwY r7 = new X.AwY
            r7.<init>(r11, r8, r3)
            X.0t0 r125 = X.AnonymousClass0eN.A01(r7)
            X.82V r7 = new X.82V
            r109 = r7
            r110 = r8
            r111 = r105
            r112 = r4
            r113 = r21
            r114 = r89
            r118 = r3
            r119 = r16
            r120 = r14
            r121 = r1
            r122 = r5
            r123 = r20
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125)
            X.82W r36 = new X.82W
            r4 = r36
            r4.<init>(r9, r7)
            r0.A0M = r4
            X.82X r11 = r36.A00()
            X.0tS r7 = X.0tS.A00()
            X.0s0 r5 = r7.A2f
            X.0YZ[] r12 = X.0tS.A4G
            r4 = 114(0x72, float:1.6E-43)
            r4 = r12[r4]
            java.lang.Object r4 = r5.CDM(r7, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x04d6
            r4 = 2131429430(0x7f0b0836, float:1.8480533E38)
            android.view.View r4 = r2.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r5 = r4.inflate()
            r4 = 2131431363(0x7f0b0fc3, float:1.8484453E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.0qQ.A0B(r4, r6)
            X.6dz r5 = r11.A06
            if (r5 == 0) goto L_0x04d6
            r5.ENN(r4)
        L_0x04d6:
            X.82a r4 = r1.A0x
            r41 = r4
            X.82b r4 = r1.A0u
            r40 = r4
            X.82c r4 = r1.A19
            r39 = r4
            X.82e r4 = r1.A11
            r38 = r4
            X.82i r4 = r1.A18
            r35 = r4
            X.50r r122 = r1.A0H()
            java.lang.String r4 = r1.A2q
            r34 = r4
            boolean r130 = r1.A0J()
            com.instagram.creation.base.CropInfo r4 = r1.A0T
            r135 = 1
            if (r4 == 0) goto L_0x0521
            r7 = 0
            android.graphics.Rect r4 = r4.A02
            if (r4 == 0) goto L_0x247d
            int r4 = r4.height()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
        L_0x0509:
            com.instagram.creation.base.CropInfo r4 = r1.A0T
            if (r4 == 0) goto L_0x0519
            android.graphics.Rect r4 = r4.A02
            if (r4 == 0) goto L_0x0519
            int r4 = r4.width()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x0519:
            boolean r4 = X.0qQ.A0K(r5, r7)
            r131 = 1
            if (r4 != 0) goto L_0x0523
        L_0x0521:
            r131 = 0
        L_0x0523:
            X.82j r4 = r1.A1y
            r33 = r4
            com.instagram.pendingmedia.model.recipients.PendingRecipient r4 = r1.A1S
            r32 = r4
            X.82k r4 = r1.A0J
            r31 = r4
            boolean r4 = r1.A3S
            r30 = r4
            com.instagram.music.common.config.MusicAttributionConfig r4 = r1.A1N
            r29 = r4
            boolean r4 = r1.A3U
            r28 = r4
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel r4 = r1.A16
            r27 = r4
            boolean r4 = r1.A3Y
            r26 = r4
            X.82d r4 = r1.A0o
            r18 = r4
            X.82f r15 = r1.A15
            X.82g r14 = r1.A10
            X.82n r12 = r1.A12
            com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel r11 = r1.A14
            X.1Xj r4 = r1.A1C
            if (r4 != 0) goto L_0x0555
            r135 = 0
        L_0x0555:
            boolean r136 = r1.A0J()
            X.82m r7 = r1.A0z
            com.instagram.common.session.UserSession r5 = r1.A0S
            java.lang.Integer r4 = r1.A27
            r137 = 0
            if (r4 == 0) goto L_0x0565
            r137 = 1
        L_0x0565:
            X.82Y r4 = new X.82Y
            r111 = r5
            r112 = r16
            r113 = r18
            r114 = r40
            r115 = r41
            r116 = r7
            r117 = r14
            r118 = r38
            r119 = r12
            r120 = r11
            r121 = r15
            r123 = r27
            r124 = r35
            r125 = r39
            r126 = r29
            r127 = r32
            r128 = r33
            r129 = r34
            r132 = r30
            r133 = r28
            r134 = r26
            r109 = r4
            r110 = r31
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137)
            X.28D r12 = r0.A01
            X.0qQ.A0B(r12, r6)
            X.82o r11 = new X.82o
            r11.<init>(r4)
            X.82p r38 = new X.82p
            r7 = r38
            r5 = r106
            r7.<init>(r12, r11, r5)
            r0.A0o = r7
            X.82s r40 = new X.82s
            r5 = r40
            r5.<init>(r4)
            r0.A26 = r5
            X.29F r5 = X.29C.A00(r3)
            X.82u r46 = new X.82u
            r4 = r46
            r4.<init>(r5)
            r0.A0D = r4
            r7 = r8
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            X.82v r5 = new X.82v
            r5.<init>(r3, r7)
            X.2YN r4 = new X.2YN
            r4.<init>(r5, r7)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r5 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r29 = r4.A00(r5)
            r4 = r29
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r4 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r4
            r29 = r4
            r0.A1n = r4
            r4 = r43
            android.os.Bundle r7 = r4.mArguments
            if (r7 == 0) goto L_0x05fc
            java.lang.String r5 = "ARGS_HIGHLIGHTED_CREATION_TOOL"
            r4 = r106
            java.lang.String r5 = r7.getString(r5, r4)
            java.util.Map r4 = com.instagram.api.schemas.CreationToolEnum.A01
            java.lang.Object r5 = r4.get(r5)
            com.instagram.api.schemas.CreationToolEnum r5 = (com.instagram.api.schemas.CreationToolEnum) r5
            if (r5 != 0) goto L_0x05f8
            com.instagram.api.schemas.CreationToolEnum r5 = com.instagram.api.schemas.CreationToolEnum.UNRECOGNIZED
        L_0x05f8:
            r4 = r29
            r4.A00 = r5
        L_0x05fc:
            if (r10 == 0) goto L_0x2474
            android.view.ViewGroup r5 = r1.A09
            r4 = 2131434955(0x7f0b1dcb, float:1.8491739E38)
            android.view.View r5 = r5.requireViewById(r4)
        L_0x0607:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = (com.instagram.ui.widget.interactive.InteractiveDrawableContainer) r5
            r0.A2B = r5
            r5.A06 = r3
            X.83p r4 = new X.83p
            r4.<init>(r0)
            r5.A08 = r4
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r4 = 2131438063(0x7f0b29ef, float:1.8498042E38)
            android.view.View r4 = r2.requireViewById(r4)
            r14.add(r4)
            r4 = 2131429459(0x7f0b0853, float:1.8480591E38)
            android.view.View r4 = r2.requireViewById(r4)
            r14.add(r4)
            r4 = 2131435179(0x7f0b1eab, float:1.8492193E38)
            android.view.View r4 = r2.requireViewById(r4)
            r14.add(r4)
            r4 = 2131429427(0x7f0b0833, float:1.8480526E38)
            android.view.View r4 = r2.requireViewById(r4)
            r14.add(r4)
            r4 = 2131439036(0x7f0b2dbc, float:1.8500016E38)
            android.view.View r12 = r2.requireViewById(r4)
            r4 = 2131439028(0x7f0b2db4, float:1.85E38)
            android.view.View r11 = r2.requireViewById(r4)
            java.lang.String r5 = r1.A2q
            java.lang.String r99 = "story_selfie_reply"
            r4 = r99
            boolean r5 = r4.equals(r5)
            android.view.Window r33 = r8.getWindow()
            r33.getClass()
            r4 = 5
            X.0qQ.A0B(r12, r4)
            r4 = 6
            X.0qQ.A0B(r11, r4)
            if (r5 != 0) goto L_0x0696
            r7 = r19
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r7
            boolean r4 = r7.A0N
            if (r4 == 0) goto L_0x0696
            int r4 = r19.BQc()
            r35 = r4
            java.lang.String r5 = "debug"
            if (r4 > 0) goto L_0x2452
            X.0wj r12 = X.0wj.A01
            r11 = 817904652(0x30c03c0c, float:1.3986905E-9)
            java.lang.String r7 = "9:16 view overlaps with system windows but no pixels overlap with nav bar"
            X.0f9 r7 = r12.AEf(r7, r11)
            java.lang.String r11 = "mediaOverlapOnNavBarHeight"
        L_0x0689:
            r7.ABO(r11, r4)
            java.lang.String r4 = r19.toString()
            r7.ABQ(r5, r4)
            r7.report()
        L_0x0696:
            X.83r r18 = new X.83r
            r18.<init>()
        L_0x069b:
            r4 = r18
            X.83s r4 = (X.C3502083s) r4
            r18 = r4
            r0.A1X = r4
            X.80b r4 = r18.BzF()
            r9.A7w(r4)
            android.app.Activity r4 = r1.A05
            java.lang.String r5 = r4.getPackageName()
            r4 = r22
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x06bd
            android.view.ViewGroup r4 = r1.A09
            r4.addView(r2, r6)
        L_0x06bd:
            if (r10 == 0) goto L_0x2442
            android.view.View r7 = r0.A0A
            if (r7 == 0) goto L_0x2442
            r35 = 21
            X.GA1 r5 = new X.GA1
            r4 = r35
            r5.<init>(r4, r7, r10)
            X.842 r4 = new X.842
            r4.<init>(r5)
        L_0x06d1:
            r0.A1Y = r4
            android.view.ViewGroup r5 = r4.A00
            r4 = 2131429054(0x7f0b06be, float:1.847977E38)
            android.view.View r5 = r5.requireViewById(r4)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            X.2eb r4 = new X.2eb
            r4.<init>(r5)
            r0.A0V = r4
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r7 = r4.A00
            r5 = r19
            r4 = r18
            X.AnonymousClass81Y.A01(r2, r7, r5, r4)
            r4 = 2131439029(0x7f0b2db5, float:1.8500002E38)
            android.view.View r22 = r2.requireViewById(r4)
            r4 = r22
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r22 = r4
            r0.A0C = r4
            if (r10 == 0) goto L_0x2439
            android.view.View r5 = r0.A0A
            if (r5 == 0) goto L_0x2439
            r4 = 2131429487(0x7f0b086f, float:1.8480648E38)
            android.view.View r4 = r5.requireViewById(r4)
        L_0x070c:
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r5 = r4.inflate()
            r4 = 2131429486(0x7f0b086e, float:1.8480646E38)
            android.view.View r4 = r5.requireViewById(r4)
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r4 = (com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r4
            r0.A0T = r4
            r4 = 2131438070(0x7f0b29f6, float:1.8498057E38)
            android.view.View r63 = r2.requireViewById(r4)
            r4 = r63
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r4 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r4
            r63 = r4
            r5 = 2131438007(0x7f0b29b7, float:1.8497929E38)
            r4 = r22
            android.view.View r4 = r4.requireViewById(r5)
            r0.A0B = r4
            r33 = 16
            X.MJ9 r11 = new X.MJ9
            r4 = r33
            r11.<init>(r4, r8, r3)
            X.844 r7 = X.AnonymousClass844.A00
            X.845 r5 = X.AnonymousClass845.A00
            X.846 r47 = new X.846
            r4 = r47
            r4.<init>(r9, r11, r7, r5)
            r0.A1v = r4
            X.847 r4 = new X.847
            r4.<init>(r8)
            r0.A0L = r4
            r7 = r2
            boolean r4 = r1.A3m
            if (r4 == 0) goto L_0x23e6
            r4 = 2131443737(0x7f0b4019, float:1.850955E38)
            android.view.View r4 = r2.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x0774
            android.view.View r7 = r4.inflate()
            r4 = 2131443738(0x7f0b401a, float:1.8509553E38)
        L_0x0769:
            android.view.View r4 = r7.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x0774
            r4.inflate()
        L_0x0774:
            X.2YN r5 = new X.2YN
            r4 = r42
            r5.<init>(r4)
            java.lang.Class<X.848> r4 = X.AnonymousClass848.class
            X.2YL r34 = r5.A00(r4)
            r4 = r34
            X.848 r4 = (X.AnonymousClass848) r4
            r34 = r4
            r0.A0I = r4
            int r5 = X.AnonymousClass0Ke.A00(r8)
            r4 = 2015(0x7df, float:2.824E-42)
            if (r5 < r4) goto L_0x23e3
            boolean r4 = X.0oI.A0C(r8)
            if (r4 == 0) goto L_0x23e3
            java.lang.String r5 = r1.A2q
            r4 = r99
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x23e3
            X.84E r4 = new X.84E
            r54 = r4
            r55 = r22
            r56 = r34
            r57 = r37
            r58 = r1
            r59 = r9
            r54.<init>(r55, r56, r57, r58, r59)
        L_0x07b2:
            r0.A0N = r4
            X.AnonymousClass84K.A00(r8, r3)
            X.0iw r7 = r1.A0O
            android.content.Context r5 = r8.getApplicationContext()
            r4 = 4
            X.0qQ.A0B(r7, r4)
            r4 = 5
            X.0qQ.A0B(r5, r4)
            X.IoM r4 = new X.IoM
            r64 = r4
            r65 = r33
            r66 = r7
            r67 = r5
            r68 = r3
            r69 = r106
            r70 = r43
            r64.<init>(r65, r66, r67, r68, r69, r70)
            X.84c r41 = new X.84c
            r5 = r41
            r5.<init>(r9, r4)
            r0.A0F = r5
            X.84d r4 = new X.84d
            r4.<init>(r0)
            r0.A0E = r4
            X.27r r4 = X.27p.A01(r3)
            X.29E r7 = r4.A00
            r4 = r107
            X.0qQ.A0B(r7, r4)
            r4 = 36599048417119613(0x8206a400050d7d, double:3.20872381930092E-306)
            r11 = r100
            long r4 = X.182.A01(r11, r3, r4)
            r12 = 17631547(0x10d093b, float:2.5904232E-38)
            X.81q r88 = new X.81q
            r11 = r88
            r11.<init>(r7, r12, r4)
            r55 = 31
            X.IoC r4 = new X.IoC
            r54 = r4
            r56 = r8
            r57 = r3
            r58 = r36
            r59 = r11
            r54.<init>(r55, r56, r57, r58, r59)
            X.84f r96 = new X.84f
            r5 = r96
            r5.<init>(r9, r4)
            X.82X r57 = r36.A00()
            X.84j r84 = new X.84j
            r54 = r84
            r55 = r22
            r56 = r43
            r58 = r3
            r59 = r13
            r54.<init>(r55, r56, r57, r58, r59)
            r4 = r84
            r0.A1H = r4
            r5 = 2131428093(0x7f0b02fd, float:1.847782E38)
            r4 = r75
            android.view.View r5 = r4.requireViewById(r5)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            X.84q r87 = new X.84q
            r4 = r87
            r4.<init>(r5)
            boolean r4 = r1.A36
            if (r4 == 0) goto L_0x23dd
            X.07f r12 = r43.getViewModelStore()
            boolean r4 = r1.A3k
            if (r4 != 0) goto L_0x085b
            boolean r4 = r1.A3E
            r126 = 0
            if (r4 == 0) goto L_0x085d
        L_0x085b:
            r126 = 1
        L_0x085d:
            X.82X r4 = r36.A00()
            X.84s r11 = new X.84s
            r11.<init>(r4)
            X.84u r15 = r1.A1p
            X.82X r116 = r36.A00()
            X.84u r14 = r1.A1q
            boolean r127 = X.C305756Jk.A00(r8)
            android.content.Context r110 = r8.getApplicationContext()
            if (r53 == 0) goto L_0x23d9
            r4 = r53
            java.util.List r7 = r4.A0F
            java.lang.String r5 = r4.A0C
        L_0x087e:
            X.82n r4 = r1.A12
            if (r4 == 0) goto L_0x0888
            X.7zz r4 = r4.A00
            r128 = 1
            if (r4 != 0) goto L_0x088a
        L_0x0888:
            r128 = 0
        L_0x088a:
            java.lang.String r123 = "pre_capture"
            X.84t r4 = new X.84t
            r111 = r46
            r112 = r41
            r113 = r34
            r114 = r21
            r115 = r11
            r117 = r3
            r118 = r16
            r119 = r9
            r120 = r13
            r121 = r15
            r122 = r14
            r124 = r5
            r125 = r7
            r109 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128)
            X.2YN r5 = new X.2YN
            r5.<init>(r4, r12)
            java.lang.Class<X.84v> r4 = X.C3504884v.class
            X.2YL r5 = r5.A00(r4)
            X.84v r5 = (X.C3504884v) r5
            r0.A1L = r5
            java.util.List r4 = r1.A2y
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            X.0qQ.A0B(r4, r6)
            r5.A01 = r4
        L_0x08c7:
            X.85L r82 = new X.85L
            r82.<init>()
            X.85M r81 = new X.85M
            r5 = r81
            r4 = r82
            r5.<init>(r4)
            X.85N r7 = new X.85N
            r7.<init>(r3)
            X.2YN r5 = new X.2YN
            r4 = r43
            r5.<init>(r7, r4)
            java.lang.Class<X.85O> r4 = X.AnonymousClass85O.class
            X.2YL r28 = r5.A00(r4)
            r4 = r28
            X.85O r4 = (X.AnonymousClass85O) r4
            r28 = r4
            r0.A1O = r4
            android.app.Application r4 = r8.getApplication()
            X.85R r7 = new X.85R
            r7.<init>(r4, r3)
            X.2YN r5 = new X.2YN
            r4 = r42
            r5.<init>(r7, r4)
            java.lang.Class<com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel> r4 = com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.class
            X.2YL r4 = r5.A00(r4)
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r4 = (com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel) r4
            r0.A04 = r4
            X.2YN r5 = new X.2YN
            r4 = r42
            r5.<init>(r4)
            java.lang.Class<X.85T> r4 = X.AnonymousClass85T.class
            X.2YL r4 = r5.A00(r4)
            X.85T r4 = (X.AnonymousClass85T) r4
            r0.A2A = r4
            X.0V2 r4 = r4.A00
            X.85U r5 = new X.85U
            r5.<init>(r4)
            X.19B r103 = X.19B.A00
            r4 = r103
            androidx.lifecycle.CoroutineLiveData r7 = X.C226292g8.A00(r4, r5)
            X.85V r4 = new X.85V
            r4.<init>(r0)
            X.6q2 r5 = new X.6q2
            r5.<init>(r4)
            r4 = r43
            r7.A06(r4, r5)
            X.85W r7 = new X.85W
            r7.<init>(r1, r0)
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r5 = r0.A04
            X.84v r4 = r0.A1L
            X.85X r80 = new X.85X
            r109 = r80
            r110 = r16
            r111 = r5
            r112 = r1
            r113 = r20
            r114 = r7
            r115 = r4
            r116 = r28
            r117 = r9
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            r4 = r80
            r0.A0n = r4
            X.85o r90 = new X.85o
            r4 = r90
            r4.<init>(r3)
            r0.A0k = r4
            X.2xu r39 = new X.2xu
            r4 = r39
            r4.<init>(r8, r3)
            X.82i r4 = r1.A18
            X.82b r5 = r1.A0u
            if (r5 == 0) goto L_0x23d5
            com.instagram.music.common.model.MusicOverlayStickerModel r11 = r5.A08
        L_0x0974:
            boolean r5 = r1.A0J()
            if (r5 == 0) goto L_0x235f
            X.1Xj r7 = r1.A1C
            if (r7 == 0) goto L_0x236f
        L_0x097e:
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r11 = r1.A0M
            X.0qQ.A07(r11)
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r4 = r1.A0M
            android.content.Context r55 = r4.requireContext()
            com.instagram.common.session.UserSession r5 = r1.A0S
            X.0qQ.A07(r5)
            X.AeN r4 = new X.AeN
            r4.<init>(r7)
            X.85r r27 = new X.85r
            r54 = r27
            r56 = r11
            r57 = r5
            r58 = r39
            r59 = r4
            r54.<init>(r55, r56, r57, r58, r59)
        L_0x09ac:
            r4 = r27
            r0.A1V = r4
            X.869 r86 = new X.869
            r86.<init>()
            r4 = r86
            r0.A1s = r4
            X.86A r169 = new X.86A
            r169.<init>()
            r4 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r4 = X.2Yu.A0H(r8, r4)
            int r114 = r8.getColor(r4)
            r5 = r34
            r4 = r107
            X.0qQ.A0B(r5, r4)
            android.app.Activity r11 = r1.A05
            java.lang.String r4 = "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner"
            X.0qQ.A0C(r11, r4)
            X.07g r11 = (X.AnonymousClass07g) r11
            com.instagram.common.session.UserSession r14 = r1.A0S
            X.0qQ.A07(r14)
            android.app.Activity r5 = r1.A05
            android.content.Context r65 = r5.getApplicationContext()
            X.0qQ.A07(r65)
            X.9Qn r5 = r1.A13
            if (r5 == 0) goto L_0x235a
            java.util.List r13 = r5.A0F
            java.lang.String r12 = r5.A0C
        L_0x09ef:
            com.instagram.common.session.UserSession r5 = r1.A0S
            X.0qQ.A07(r5)
            X.86B r7 = new X.86B
            r7.<init>(r5)
            X.82n r5 = r1.A12
            if (r5 == 0) goto L_0x0a03
            X.7zz r5 = r5.A00
            r71 = 1
            if (r5 != 0) goto L_0x0a05
        L_0x0a03:
            r71 = 0
        L_0x0a05:
            X.86C r5 = new X.86C
            r66 = r7
            r67 = r34
            r68 = r14
            r69 = r12
            r70 = r13
            r64 = r5
            r64.<init>(r65, r66, r67, r68, r69, r70, r71)
            X.2YN r7 = new X.2YN
            r7.<init>(r5, r11)
            java.lang.Class<X.86D> r12 = X.AnonymousClass86D.class
            X.2YL r11 = r7.A00(r12)
            android.app.Activity r7 = r1.A05
            X.0qQ.A0C(r7, r4)
            X.07g r7 = (X.AnonymousClass07g) r7
            com.instagram.common.session.UserSession r13 = r1.A0S
            X.0qQ.A07(r13)
            android.app.Activity r4 = r1.A05
            android.content.Context r65 = r4.getApplicationContext()
            X.0qQ.A07(r65)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            X.86B r5 = new X.86B
            r5.<init>(r4)
            X.86C r4 = new X.86C
            r64 = r4
            r66 = r5
            r68 = r13
            r69 = r106
            r70 = r106
            r71 = r6
            r64.<init>(r65, r66, r67, r68, r69, r70, r71)
            X.2YN r5 = new X.2YN
            r5.<init>(r4, r7)
            X.2YL r5 = r5.A00(r12)
            r102 = 3
            r4 = r102
            X.0qQ.A0B(r11, r4)
            r4 = 4
            X.0qQ.A0B(r5, r4)
            r7 = 2
            X.GVC r4 = new X.GVC
            r109 = r4
            r110 = r169
            r111 = r3
            r112 = r11
            r113 = r106
            r115 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115)
            X.GVC r11 = new X.GVC
            r64 = r11
            r65 = r169
            r66 = r3
            r67 = r5
            r68 = r106
            r69 = r114
            r70 = r102
            r64.<init>(r65, r66, r67, r68, r69, r70)
            X.86W r78 = new X.86W
            r5 = r78
            r5.<init>(r9, r4, r11)
            r0.A0H = r5
            X.86X r4 = new X.86X
            r4.<init>(r0)
            X.86Y r57 = new X.86Y
            r64 = r57
            r65 = r8
            r66 = r41
            r67 = r5
            r68 = r16
            r69 = r4
            r64.<init>(r65, r66, r67, r68, r69)
            r4 = r57
            r0.A1K = r4
            r4 = 2130970166(0x7f040636, float:1.7549034E38)
            int r4 = X.2Yu.A0H(r8, r4)
            int r8 = r8.getColor(r4)
            r101 = 2
            X.86Z r5 = new X.86Z
            r11 = r36
            r4 = r105
            r5.<init>(r11, r4)
            X.2YN r11 = new X.2YN
            r4 = r42
            r11.<init>(r5, r4)
            java.lang.Class<X.86a> r4 = X.C3507486a.class
            X.2YL r5 = r11.A00(r4)
            X.86a r5 = (X.C3507486a) r5
            X.86c r55 = new X.86c
            r4 = r55
            r4.<init>(r5, r3, r8)
            r0.A0G = r4
            r3 = r25
            X.2Fk r5 = r3.A04
            X.86d r4 = new X.86d
            r4.<init>(r0)
            r3 = r43
            r5.A06(r3, r4)
            X.84v r8 = r0.A1L
            X.86e r5 = new X.86e
            r5.<init>(r0)
            X.86f r4 = new X.86f
            r4.<init>(r0)
            X.86g r3 = new X.86g
            r3.<init>(r0)
            X.86h r109 = new X.86h
            r110 = r43
            r111 = r36
            r112 = r16
            r113 = r1
            r114 = r37
            r115 = r8
            r116 = r4
            r117 = r5
            r118 = r3
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118)
            boolean r11 = r1.A3d
            java.lang.String r4 = r1.A2q
            r3 = r99
            boolean r8 = r3.equals(r4)
            X.84u r3 = r1.A1p
            r4 = 0
            if (r3 == 0) goto L_0x0b27
            boolean r3 = r3.A05()
            if (r3 != 0) goto L_0x0b27
            r4 = 1
        L_0x0b27:
            r5 = r4 ^ 1
            X.86j r4 = new X.86j
            r3 = r75
            r4.<init>(r3, r11, r8, r5)
            r14 = 32
            X.IoC r3 = new X.IoC
            r64 = r3
            r65 = r14
            r66 = r1
            r67 = r19
            r68 = r109
            r69 = r4
            r64.<init>(r65, r66, r67, r68, r69)
            X.86k r44 = new X.86k
            r4 = r44
            r4.<init>(r9, r3)
            r0.A19 = r4
            X.86w r3 = new X.86w
            r3.<init>(r1, r0)
            X.0t0 r77 = X.AnonymousClass0eN.A01(r3)
            r3 = r77
            r0.A2E = r3
            X.86x r92 = new X.86x
            r109 = r92
            r110 = r22
            r111 = r37
            r112 = r24
            r113 = r19
            r114 = r1
            r115 = r4
            r116 = r9
            r117 = r40
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            r3 = r92
            r0.A0s = r3
            X.872 r93 = new X.872
            r109 = r93
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            r3 = r93
            r0.A0t = r3
            r4 = 2131443172(0x7f0b3de4, float:1.8508405E38)
            r3 = r75
            android.view.View r32 = r3.requireViewById(r4)
            r4 = 2131443174(0x7f0b3de6, float:1.8508409E38)
            android.view.View r12 = r3.requireViewById(r4)
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r11 = r0.A2B
            com.instagram.common.session.UserSession r8 = r0.A0R
            X.80F r5 = r1.A17
            r3 = r27
            X.85s r3 = r3.A05
            r186 = r3
            com.instagram.creation.cameraconfiguration.CameraConfiguration r4 = r1.A0V
            X.0qQ.A0B(r11, r7)
            r7 = r32
            r3 = r102
            X.0qQ.A0B(r7, r3)
            r3 = 4
            X.0qQ.A0B(r12, r3)
            r3 = 6
            X.0qQ.A0B(r8, r3)
            r3 = 7
            X.0qQ.A0B(r5, r3)
            r7 = 10
            r3 = r186
            X.0qQ.A0B(r3, r7)
            X.87g r3 = new X.87g
            r109 = r3
            r110 = r75
            r111 = r32
            r112 = r12
            r113 = r8
            r114 = r24
            r115 = r4
            r116 = r19
            r117 = r92
            r118 = r23
            r119 = r9
            r120 = r5
            r121 = r17
            r122 = r186
            r123 = r11
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123)
            X.87h r94 = new X.87h
            r4 = r94
            r4.<init>(r9, r3)
            r0.A1r = r4
            com.instagram.common.session.UserSession r9 = r0.A0R
            android.app.Activity r8 = r0.A09
            java.lang.String r3 = r1.A2q
            r7 = 0
            r4 = 0
            if (r3 == 0) goto L_0x0bf3
            r4 = 1
        L_0x0bf3:
            X.82i r5 = r1.A18
            if (r4 == 0) goto L_0x2356
            if (r5 == 0) goto L_0x2356
            X.1Xj r4 = r5.A03
            r4.getClass()
            X.85o r24 = new X.85o
            r3 = r24
            r3.<init>(r9)
            java.util.ArrayList r3 = r4.A3F()
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = X.C271404in.A06(r3)
            r9 = 1
            if (r3 != 0) goto L_0x0c11
            r9 = 0
        L_0x0c11:
            r3 = r24
            boolean r3 = r3.A03
            if (r3 == r9) goto L_0x0c1e
            r3 = r24
            r3.A03 = r9
            X.C3506485o.A00(r3, r6)
        L_0x0c1e:
            r4 = r107
            r3 = r24
            r3.A09 = r4
            X.C3506485o.A00(r3, r6)
            boolean r8 = X.C394329xu.A00(r8)
            X.9Tg r3 = X.C379289Tg.CLIPS
            X.9Tg r4 = r5.A02
            if (r3 == r4) goto L_0x0c36
            if (r9 != 0) goto L_0x0c35
            if (r8 != 0) goto L_0x0c36
        L_0x0c35:
            r7 = 1
        L_0x0c36:
            r3 = r24
            r3.A00 = r7
            r4 = r3
            r3 = r107
            X.C3506485o.A00(r4, r3)
        L_0x0c40:
            r3 = r24
            r0.A0j = r3
            java.lang.String r3 = r1.A2q
            X.82c r4 = r1.A19
            if (r4 == 0) goto L_0x232c
            r4 = r90
            boolean r5 = r4.A04
            r4 = r107
            if (r5 == r4) goto L_0x0c5a
            r5 = r4
            r4 = r90
            r4.A04 = r5
            X.C3506485o.A00(r4, r6)
        L_0x0c5a:
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r5 = r1.A0M
            X.0qQ.A07(r5)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            X.87i r51 = new X.87i
            r64 = r51
            r65 = r5
            r66 = r4
            r67 = r2
            r68 = r16
            r69 = r90
            r64.<init>(r65, r66, r67, r68, r69)
        L_0x0c7a:
            r4 = r51
            r0.A0X = r4
            if (r24 == 0) goto L_0x0c8c
            X.AZl r5 = new X.AZl
            r4 = r24
            r5.<init>(r4, r0)
            java.util.Set r4 = r4.A0C
            r4.add(r5)
        L_0x0c8c:
            com.instagram.common.session.UserSession r8 = r0.A0R
            X.80D r5 = r0.A0v
            X.4DH r4 = r5.A0M
            r4.getClass()
            X.4DH r4 = r5.A0M
            java.lang.String r7 = r4.getModuleName()
            X.4yO r5 = r0.A02
            X.888 r79 = new X.888
            r4 = r79
            r4.<init>(r8, r5, r7)
            X.28D r8 = r0.A01
            android.app.Activity r7 = r0.A09
            com.instagram.common.session.UserSession r5 = r0.A0R
            X.889 r4 = new X.889
            r64 = r4
            r65 = r7
            r66 = r8
            r67 = r37
            r68 = r5
            r69 = r79
            r70 = r38
            r71 = r1
            r64.<init>(r65, r66, r67, r68, r69, r70, r71)
            r0.A23 = r4
            if (r17 == 0) goto L_0x201c
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r5 = r4.A00
            r4 = 2131431753(0x7f0b1149, float:1.8485244E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.9Pb r12 = new X.9Pb
            android.app.Activity r13 = r0.A09
            r5 = r17
            boolean r11 = r5.A07
            int r9 = r5.A00
            boolean r8 = r1.A3K
            boolean r7 = r1.A46
            android.view.View r112 = r4.inflate()
            int r5 = r1.A03
            boolean r4 = r1.A32
            r109 = r12
            r110 = r13
            r111 = r75
            r113 = r19
            r114 = r38
            r115 = r9
            r116 = r5
            r117 = r11
            r118 = r8
            r119 = r7
            r120 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120)
            X.0iw r5 = r1.A0O
            boolean r4 = r1.A3B
            r7 = r17
            r12.A01(r5, r7, r4)
            com.instagram.common.session.UserSession r11 = r0.A0R
            android.app.Activity r9 = r0.A09
            X.4DH r8 = r0.A0J
            java.lang.String r7 = r1.A2O
            X.0iw r5 = r1.A0O
            X.88A r4 = new X.88A
            r110 = r9
            r111 = r8
            r112 = r5
            r113 = r11
            r115 = r12
            r116 = r17
            r117 = r7
            r109 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            r0.A1A = r4
            r5 = r106
        L_0x0d2b:
            r20 = r12
        L_0x0d2d:
            android.app.Activity r4 = r0.A09
            androidx.activity.ComponentActivity r4 = (androidx.activity.ComponentActivity) r4
            X.2YN r7 = new X.2YN
            r7.<init>(r4)
            java.lang.Class<X.88B> r4 = X.AnonymousClass88B.class
            X.2YL r31 = r7.A00(r4)
            r4 = r31
            X.88B r4 = (X.AnonymousClass88B) r4
            r31 = r4
            r0.A24 = r4
            X.80U r9 = r0.A1f
            com.instagram.common.session.UserSession r8 = r0.A0R
            X.4DH r4 = r0.A0J
            androidx.fragment.app.FragmentActivity r66 = r4.requireActivity()
            X.4DH r4 = r0.A0J
            android.content.Context r70 = r4.requireContext()
            com.instagram.common.session.UserSession r7 = r0.A0R
            X.4DH r4 = r0.A0J
            androidx.fragment.app.FragmentActivity r111 = r4.requireActivity()
            X.84v r15 = r0.A1L
            X.82i r13 = r1.A18
            X.0qQ.A0B(r7, r6)
            r11 = r31
            r4 = r101
            X.0qQ.A0B(r11, r4)
            r11 = r29
            r4 = r102
            X.0qQ.A0B(r11, r4)
            X.88D r109 = new X.88D
            r110 = r75
            r112 = r36
            r113 = r7
            r114 = r15
            r115 = r105
            r116 = r11
            r117 = r13
            r118 = r31
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118)
            r4 = r101
            X.0qQ.A0B(r8, r4)
            X.82i r11 = r1.A18
            r26 = 0
            if (r11 == 0) goto L_0x0dad
            X.8JI r7 = r11.A00
            X.8JI r4 = X.AnonymousClass8JI.TEMPLATE
            if (r7 == r4) goto L_0x0dad
            X.IoM r4 = new X.IoM
            r64 = r4
            r65 = r104
            r67 = r109
            r68 = r8
            r69 = r11
            r64.<init>(r65, r66, r67, r68, r69, r70)
            X.88E r26 = new X.88E
            r7 = r26
            r7.<init>(r9, r4)
        L_0x0dad:
            r4 = r26
            r0.A1m = r4
            com.instagram.model.mediasize.ImageInfo r9 = r1.A1K
            java.lang.String r8 = r1.A2l
            if (r17 == 0) goto L_0x1fef
            if (r3 == 0) goto L_0x1feb
            if (r9 == 0) goto L_0x1feb
            r61 = r0
            r62 = r75
            r64 = r5
            r65 = r60
            r66 = r9
            r67 = r3
            r68 = r8
            X.88F r3 = r61.A00(r62, r63, r64, r65, r66, r67, r68)
        L_0x0dcd:
            r0.A22 = r3
            X.88A r4 = r0.A1A
            r3 = r84
            java.util.Set r3 = r3.A0K
            r3.add(r4)
        L_0x0dd8:
            boolean r4 = r1.A0K()
            r3 = 2131432083(0x7f0b1293, float:1.8485913E38)
            if (r4 == 0) goto L_0x1fdc
            r3 = 2131432080(0x7f0b1290, float:1.8485907E38)
            android.view.View r4 = r2.requireViewById(r3)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.2eb r30 = new X.2eb
            r3 = r30
            r3.<init>(r4)
        L_0x0df1:
            if (r10 == 0) goto L_0x1fd8
            android.view.View r10 = r0.A0A
            if (r10 == 0) goto L_0x1fd8
        L_0x0df7:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r9 = r0.A2B
            boolean r8 = r0.A2G
            if (r8 == 0) goto L_0x1fac
            X.80D r3 = r0.A0v
            X.80G r3 = r3.A0U
            if (r3 == 0) goto L_0x1fac
            X.APO r7 = new X.APO
            r7.<init>(r0)
        L_0x0e08:
            r3 = 2131442599(0x7f0b3ba7, float:1.8507242E38)
            android.view.View r5 = r10.requireViewById(r3)
            r3 = 2131430972(0x7f0b0e3c, float:1.848366E38)
            android.view.View r10 = r10.requireViewById(r3)
        L_0x0e16:
            r3 = 2131432565(0x7f0b1475, float:1.8486891E38)
            android.view.View r4 = r5.requireViewById(r3)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            r3 = 2131432566(0x7f0b1476, float:1.8486893E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r3 = (com.instagram.ui.widget.drawing.EyedropperColorPickerTool) r3
            X.88K r71 = new X.88K
            r109 = r71
            r110 = r10
            r111 = r4
            r112 = r9
            r113 = r7
            r114 = r30
            r115 = r3
            r116 = r8
            r109.<init>(r110, r111, r112, r113, r114, r115, r116)
            X.88O r134 = new X.88O
            r134.<init>()
            X.4DH r3 = r0.A0J
            X.07f r7 = r3.getViewModelStore()
            X.80x r5 = r0.A20
            X.82X r3 = r36.A00()
            X.84s r4 = new X.84s
            r4.<init>(r3)
            X.0qQ.A0B(r5, r6)
            X.88Q r3 = new X.88Q
            r3.<init>(r4, r5)
            X.2YN r4 = new X.2YN
            r4.<init>(r3, r7)
            java.lang.Class<X.88R> r3 = X.AnonymousClass88R.class
            X.2YL r21 = r4.A00(r3)
            r3 = r21
            X.88R r3 = (X.AnonymousClass88R) r3
            r21 = r3
            r0.A1M = r3
            android.app.Activity r5 = r0.A09
            androidx.activity.ComponentActivity r5 = (androidx.activity.ComponentActivity) r5
            X.88U r4 = new X.88U
            r4.<init>()
            X.2YN r3 = new X.2YN
            r3.<init>(r4, r5)
            java.lang.Class<X.88V> r4 = X.AnonymousClass88V.class
            X.2YL r58 = r3.A00(r4)
            r3 = r58
            X.88V r3 = (X.AnonymousClass88V) r3
            r58 = r3
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.4DH r8 = r0.A0J
            X.80U r7 = r0.A1f
            X.0qQ.A0B(r9, r6)
            r3 = r107
            X.0qQ.A0B(r8, r3)
            java.lang.Integer r66 = X.AnonymousClass05K.A08
            X.AwZ r5 = new X.AwZ
            r4 = r104
            r3 = r37
            r5.<init>(r4, r8, r9, r3)
            X.MMj r10 = new X.MMj
            r10.<init>(r9, r14)
            X.AwZ r11 = new X.AwZ
            r4 = r33
            r11.<init>(r4, r8, r9, r3)
            boolean r3 = X.2CC.A00(r66)
            if (r3 != 0) goto L_0x1f7e
            java.lang.Object r16 = r5.invoke()
        L_0x0eb7:
            r3 = r16
            X.81E r3 = (X.AnonymousClass81E) r3
            r16 = r3
            r3 = r16
            X.88Z r3 = (X.AnonymousClass88Z) r3
            r16 = r3
            r0.A1c = r3
            r5 = 2131439025(0x7f0b2db1, float:1.8499993E38)
            android.view.View r4 = r2.requireViewById(r5)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.2eb r69 = new X.2eb
            r3 = r69
            r3.<init>(r4)
            android.view.View r3 = r2.requireViewById(r5)
            X.3oV r192 = X.2b1.A01(r3, r6, r6)
            r3 = 2131439024(0x7f0b2db0, float:1.8499991E38)
            android.view.View r85 = r2.requireViewById(r3)
            boolean r3 = X.C61670oa.A03()
            if (r3 == 0) goto L_0x0eff
            android.app.Activity r4 = r0.A09
            r3 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r3 = X.2Yu.A0H(r4, r3)
            int r4 = r4.getColor(r3)
            r3 = r85
            r3.setBackgroundColor(r4)
            r2.setBackgroundColor(r4)
        L_0x0eff:
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.80U r8 = r0.A1f
            X.85r r7 = r0.A1V
            X.4DH r5 = r0.A0J
            X.82t r4 = r0.A26
            X.85o r3 = r0.A0k
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r2 = r0.A0i
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r68 = new com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController
            r109 = r68
            r110 = r85
            r111 = r5
            r112 = r9
            r113 = r69
            r114 = r2
            r115 = r3
            r116 = r7
            r117 = r8
            r118 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118)
            X.80D r2 = r0.A0v
            X.80C r2 = r2.A0t
            X.2jd r3 = r2.A00
            r2 = r68
            r3.A0E(r2)
            r0.A1i = r2
            X.4DH r2 = r0.A0J
            android.content.Context r3 = r2.requireContext()
            r2 = 500(0x1f4, float:7.0E-43)
            X.89v r113 = X.C3516489r.A03(r3, r2)
            X.4DH r2 = r0.A0J
            android.content.Context r110 = r2.requireContext()
            X.4DH r2 = r0.A0J
            X.07Z r111 = r2.getViewLifecycleOwner()
            com.instagram.common.session.UserSession r2 = r0.A0R
            X.4DH r3 = r0.A0J
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            X.2YN r4 = new X.2YN
            r4.<init>(r3)
            java.lang.Class<X.860> r3 = X.AnonymousClass860.class
            X.2YL r4 = r4.A00(r3)
            X.860 r4 = (X.AnonymousClass860) r4
            java.lang.String r3 = "post_capture"
            X.89w r115 = r4.A01(r3)
            X.4DH r3 = r0.A0J
            android.content.Context r3 = r3.requireContext()
            X.89v r114 = X.C3516489r.A02(r3)
            X.8A0 r109 = new X.8A0
            r112 = r2
            r109.<init>(r110, r111, r112, r113, r114, r115)
            X.2Fj r64 = new X.2Fj
            r64.<init>()
            r2 = 2131430173(0x7f0b0b1d, float:1.848204E38)
            r3 = r22
            android.view.View r2 = r3.requireViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r3 = 2131626510(0x7f0e0a0e, float:1.8880258E38)
            r2.setLayoutResource(r3)
            X.8A8 r3 = new X.8A8
            r109 = r3
            r110 = r2
            r111 = r64
            r112 = r96
            r113 = r1
            r114 = r0
            r115 = r39
            r109.<init>(r110, r111, r112, r113, r114, r115)
            X.6id[] r2 = new X.C314656id[r6]
            X.6if r70 = X.C314666ie.A00(r3, r2)
            r2 = r70
            r0.A1y = r2
            X.80U r5 = r0.A1f
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r0.A2B
            X.8A9 r3 = new X.8A9
            r3.<init>(r0)
            X.4DH r2 = r0.A0J
            androidx.fragment.app.FragmentActivity r112 = r2.requireActivity()
            r2 = r107
            X.0qQ.A0B(r4, r2)
            X.IwA r2 = new X.IwA
            r109 = r2
            r110 = r107
            r111 = r27
            r113 = r86
            r114 = r3
            r115 = r51
            r116 = r38
            r117 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            X.8AA r33 = new X.8AA
            r3 = r33
            r3.<init>(r5, r2)
            r0.A1t = r3
            X.80U r7 = r0.A1f
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r0.A2B
            X.4DH r2 = r0.A0J
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            r2 = r101
            X.0qQ.A0B(r8, r2)
            java.util.List r2 = r1.A2z
            if (r2 == 0) goto L_0x1f77
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            if (r2 == 0) goto L_0x0ffb
        L_0x0ff5:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x1007
        L_0x0ffb:
            X.82n r2 = r1.A12
            if (r2 == 0) goto L_0x1f73
            boolean r3 = r2.A00()
            r2 = r107
            if (r3 != r2) goto L_0x1f73
        L_0x1007:
            r4 = 19
            X.AwZ r3 = new X.AwZ
            r2 = r86
            r3.<init>(r4, r2, r5, r8)
        L_0x1010:
            X.8AE r9 = new X.8AE
            r9.<init>(r7, r3)
            r0.A1u = r9
            X.8AH r4 = new X.8AH
            r4.<init>(r1, r0)
            com.instagram.common.session.UserSession r7 = r0.A0R
            r2 = 2342169563430401862(0x20810ecf00003746, double:4.071143300027088E-152)
            r5 = r108
            boolean r2 = X.182.A06(r5, r7, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r5 = r2.booleanValue()
            X.842 r2 = r0.A1Y
            android.view.ViewGroup r3 = r2.A00
            r2 = 2131437967(0x7f0b298f, float:1.8497848E38)
            if (r5 == 0) goto L_0x1f6d
            android.view.View r2 = r3.findViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            if (r2 == 0) goto L_0x1f60
            android.view.View r111 = r2.inflate()
        L_0x1046:
            X.842 r2 = r0.A1Y
            android.view.ViewGroup r2 = r2.A00
            android.content.Context r110 = r2.getContext()
            com.instagram.common.session.UserSession r5 = r0.A0R
            X.4DH r2 = r0.A0J
            X.07Z r112 = r2.getViewLifecycleOwner()
            r122 = 2131237309(0x7f0819bd, float:1.8090865E38)
            r151 = 0
            r2 = 0
            X.8AJ r3 = new X.8AJ
            r3.<init>(r0)
            X.8AL r83 = new X.8AL
            r109 = r83
            r113 = r2
            r114 = r5
            r115 = r2
            r116 = r19
            r117 = r4
            r118 = r2
            r119 = r3
            r120 = r2
            r121 = r25
            r123 = r6
            r124 = r107
            r125 = r6
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125)
            r3 = r83
            com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView r3 = r3.A0P
            r3.setVisibility(r6)
            X.8Yz r3 = r0.A0W
            X.80m r3 = r3.A07
            java.lang.Object r3 = r3.A00
            java.util.Set r3 = (java.util.Set) r3
            int r5 = r3.size()
            r3 = r107
            if (r5 != r3) goto L_0x10a8
            X.8Yz r3 = r0.A0W
            X.80m r3 = r3.A07
            java.lang.Object r5 = r3.A00
            java.util.Set r5 = (java.util.Set) r5
            X.80M r3 = X.AnonymousClass80M.A00
            boolean r3 = r5.contains(r3)
            r5 = 1
            if (r3 != 0) goto L_0x10a9
        L_0x10a8:
            r5 = 0
        L_0x10a9:
            android.app.Activity r3 = r0.A09
            boolean r3 = X.C305756Jk.A00(r3)
            if (r3 == 0) goto L_0x10c3
            if (r5 == 0) goto L_0x10c3
            boolean r3 = r1.A3k
            if (r3 != 0) goto L_0x10c3
            java.lang.String r5 = r1.A2q
            r3 = r99
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x10c3
            r151 = 1
        L_0x10c3:
            android.content.Context r23 = r75.getContext()
            com.instagram.common.session.UserSession r8 = r0.A0R
            X.4DH r3 = r0.A0J
            X.07Z r138 = r3.getViewLifecycleOwner()
            r5 = 2131432957(0x7f0b15fd, float:1.8487686E38)
            r3 = r75
            android.view.View r137 = r3.requireViewById(r5)
            X.8Yz r7 = r0.A0W
            X.84v r5 = r0.A1L
            if (r151 == 0) goto L_0x10e3
            X.9Pk r2 = new X.9Pk
            r2.<init>(r0)
        L_0x10e3:
            X.8AX r3 = new X.8AX
            r3.<init>(r0)
            X.8AL r76 = new X.8AL
            r135 = r76
            r136 = r23
            r139 = r105
            r140 = r8
            r141 = r7
            r142 = r19
            r143 = r4
            r144 = r2
            r145 = r3
            r146 = r5
            r147 = r25
            r149 = r107
            r150 = r107
            r148 = r122
            r135.<init>(r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151)
            r2 = r76
            r0.A1F = r2
            if (r17 == 0) goto L_0x1117
            r2 = r17
            boolean r2 = r2.A0A
            r165 = 1
            if (r2 != 0) goto L_0x1119
        L_0x1117:
            r165 = 0
        L_0x1119:
            X.4DH r7 = r0.A0J
            android.content.Context r5 = r7.requireContext()
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.0iw r3 = r1.A0O
            X.8Ab r2 = new X.8Ab
            r2.<init>(r5, r3, r4)
            X.2YN r3 = new X.2YN
            r3.<init>(r2, r7)
            java.lang.Class<com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel> r2 = com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel.class
            X.2YL r45 = r3.A00(r2)
            r2 = r45
            com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r2 = (com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel) r2
            r45 = r2
            r0.A1h = r2
            com.instagram.reels.prompt.model.PromptStickerModel r5 = r1.A1g
            if (r5 == 0) goto L_0x1147
            X.82p r2 = r0.A0o
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            r2.A09 = r5
        L_0x1147:
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r1.A1h
            if (r3 == 0) goto L_0x1153
            X.82p r2 = r0.A0o
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            r2.A09 = r3
        L_0x1153:
            android.app.Activity r2 = r0.A09
            r7 = r2
            X.07g r7 = (X.AnonymousClass07g) r7
            android.app.Application r4 = r2.getApplication()
            com.instagram.common.session.UserSession r3 = r0.A0R
            X.8Am r2 = new X.8Am
            r2.<init>(r4, r3)
            X.2YN r3 = new X.2YN
            r3.<init>(r2, r7)
            java.lang.Class<X.8An> r2 = X.C351818An.class
            X.2YL r43 = r3.A00(r2)
            r2 = r43
            X.8An r2 = (X.C351818An) r2
            r43 = r2
            r0.A25 = r2
            com.instagram.common.session.UserSession r10 = r0.A0R
            X.4DH r8 = r0.A0J
            android.app.Activity r7 = r0.A09
            X.80S r2 = r0.A0z
            r4 = r7
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.8Ar r3 = new X.8Ar
            r3.<init>(r2)
            X.8As r2 = new X.8As
            r2.<init>(r4, r10, r3)
            X.2YN r3 = new X.2YN
            r3.<init>(r2, r8)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel> r2 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.class
            X.2YL r42 = r3.A00(r2)
            r2 = r42
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r2
            r42 = r2
            X.2Fj r3 = r2.A0A
            X.8Az r2 = new X.8Az
            r2.<init>(r7)
            X.6q2 r4 = new X.6q2
            r4.<init>(r2)
            r3.A06(r8, r4)
            r2 = r42
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r2.A0H
            X.2Fj r3 = r2.A02
            X.8B0 r2 = new X.8B0
            r2.<init>(r10)
            r3.A06(r8, r2)
            r2 = r42
            r0.A1p = r2
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.0qQ.A0B(r4, r6)
            X.8B1 r3 = X.AnonymousClass8B1.A00
            java.lang.Class<X.8B2> r2 = X.AnonymousClass8B2.class
            java.lang.Object r25 = r4.A01(r2, r3)
            r2 = r25
            X.8B2 r2 = (X.AnonymousClass8B2) r2
            r25 = r2
            r0.A21 = r2
            X.4DH r2 = r0.A0J
            X.07f r3 = r2.getViewModelStore()
            r2 = r38
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            X.82Z r2 = r2.A0b
            X.0qQ.A07(r2)
            X.8B3 r4 = new X.8B3
            r4.<init>(r3, r2)
            r0.A0u = r4
            android.app.Activity r2 = r0.A09
            r62 = r2
            r163 = 0
            if (r17 == 0) goto L_0x11f4
            r163 = 1
        L_0x11f4:
            X.80U r2 = r0.A1f
            r61 = r2
            com.instagram.common.session.UserSession r2 = r0.A0R
            r59 = r2
            X.4DH r2 = r0.A0J
            X.0gy r114 = X.AnonymousClass07i.A00(r2)
            android.view.View r2 = r0.A0A
            if (r2 == 0) goto L_0x1208
            r22 = r2
        L_0x1208:
            X.842 r2 = r0.A1Y
            android.view.ViewGroup r2 = r2.A00
            r56 = r2
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A2B
            r54 = r2
            X.3E6 r2 = r0.A0S
            r52 = r2
            X.4DH r2 = r0.A0J
            r50 = r2
            r164 = 0
            if (r17 == 0) goto L_0x1220
            r164 = 1
        L_0x1220:
            java.lang.String r3 = r1.A2q
            r2 = r99
            boolean r166 = r2.equals(r3)
            com.instagram.model.direct.camera.DirectCameraViewModel r2 = r1.A1I
            if (r2 == 0) goto L_0x1f5d
            com.instagram.model.direct.DirectShareTarget r11 = r2.A03
        L_0x122e:
            X.8Yz r2 = r0.A0W
            r49 = r2
            X.81T r2 = r0.A11
            r48 = r2
            X.8B6 r10 = new X.8B6
            r10.<init>(r0)
            X.8B7 r8 = new X.8B7
            r8.<init>(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r2 = r0.A0i
            r37 = r2
            X.28D r2 = r0.A01
            r36 = r2
            X.81e r2 = r0.A0y
            r19 = r2
            X.823 r2 = r0.A0p
            r17 = r2
            java.util.List r2 = r1.A2z
            if (r2 == 0) goto L_0x1f56
            com.google.common.collect.ImmutableList r158 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
        L_0x1258:
            boolean r15 = r0.A2G
            boolean r14 = r1.A3e
            X.8B8 r7 = new X.8B8
            r7.<init>(r0)
            java.lang.Integer r13 = r1.A29
            X.8B9 r2 = new X.8B9
            r2.<init>(r0)
            X.8BA r3 = new X.8BA
            r109 = r3
            r110 = r62
            r111 = r22
            r112 = r56
            r113 = r32
            r115 = r36
            r116 = r50
            r117 = r96
            r118 = r48
            r119 = r59
            r120 = r52
            r121 = r30
            r122 = r49
            r123 = r51
            r124 = r37
            r125 = r90
            r126 = r24
            r127 = r38
            r128 = r17
            r129 = r4
            r130 = r1
            r131 = r19
            r132 = r71
            r133 = r83
            r135 = r27
            r136 = r18
            r137 = r16
            r138 = r61
            r139 = r45
            r140 = r68
            r141 = r42
            r142 = r86
            r143 = r33
            r144 = r9
            r145 = r47
            r146 = r70
            r147 = r12
            r148 = r20
            r149 = r25
            r150 = r31
            r151 = r43
            r152 = r11
            r153 = r40
            r154 = r39
            r155 = r5
            r156 = r54
            r157 = r13
            r159 = r10
            r160 = r8
            r161 = r7
            r162 = r2
            r167 = r15
            r168 = r14
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168)
            r0.A0e = r3
            X.4DH r7 = r0.A0J
            com.instagram.common.session.UserSession r5 = r0.A0R
            X.80U r4 = r0.A1f
            X.842 r2 = r0.A1Y
            android.view.ViewGroup r8 = r2.A00
            r2 = 2131437985(0x7f0b29a1, float:1.8497884E38)
            android.view.View r2 = r8.requireViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            X.81T r8 = r0.A11
            java.lang.String r185 = r8.getModuleName()
            X.8Cr r179 = new X.8Cr
            r180 = r2
            r181 = r7
            r182 = r5
            r183 = r3
            r184 = r4
            r179.<init>(r180, r181, r182, r183, r184, r185)
            android.app.Activity r5 = r0.A09
            X.07g r5 = (X.AnonymousClass07g) r5
            X.8Cw r4 = new X.8Cw
            r4.<init>()
            X.2YN r2 = new X.2YN
            r2.<init>(r4, r5)
            java.lang.Class<X.8Cx> r4 = X.C352328Cx.class
            X.2YL r36 = r2.A00(r4)
            r2 = r36
            X.8Cx r2 = (X.C352328Cx) r2
            r36 = r2
            X.8Cy r4 = new X.8Cy
            r4.<init>(r1, r0)
            java.util.Set r2 = r3.A1u
            r196 = r2
            r2.add(r4)
            X.1Xj r4 = r1.A1C
            int r2 = r1.A00
            r3.A0F = r4
            r3.A00 = r2
            com.instagram.user.model.Product r4 = r1.A1t
            com.instagram.model.shopping.reels.ProductShareConfig r2 = r1.A1M
            r3.A0N = r4
            r3.A0I = r2
            com.instagram.shopping.model.collection.ProductCollectionShareInfo r2 = r1.A1r
            r3.A0L = r2
            com.instagram.shopping.model.share.ShopShareInfo r2 = r1.A1s
            r3.A0M = r2
            boolean r2 = r1.A3o
            r3.A0f = r2
            com.instagram.infocenter.intf.InfoCenterShareInfoIntf r2 = r1.A1G
            r3.A0H = r2
            com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf r2 = r1.A1F
            r3.A0G = r2
            X.8D5 r2 = r1.A1x
            r3.A0P = r2
            X.8D6 r2 = r1.A1T
            r3.A0J = r2
            X.1Xj r7 = r1.A1D
            if (r7 == 0) goto L_0x1378
            android.view.View r2 = r3.A0o
            android.content.Context r5 = r2.getContext()
            com.instagram.common.session.UserSession r4 = r3.A0v
            X.A6f r2 = new X.A6f
            r2.<init>(r5, r4, r7)
            r3.A0A = r2
            X.6if r2 = r3.A1g
            java.lang.Object r4 = r2.get()
            X.8ME r4 = (X.AnonymousClass8ME) r4
            X.A6f r2 = r3.A0A
            r4.A06 = r2
            X.82o r2 = r3.A14
            X.82Y r2 = r2.A01
            r2.A08 = r7
        L_0x1378:
            X.8D7 r2 = r1.A1e
            r3.A0K = r2
            X.82j r7 = r1.A1y
            if (r7 == 0) goto L_0x1382
            r3.A0Q = r7
        L_0x1382:
            X.81T r10 = r0.A11
            X.80U r8 = r0.A1f
            com.instagram.reels.question.model.QuestionResponseReshareModel r4 = r1.A1i
            r2 = 0
            java.lang.String r5 = "Required value was null."
            if (r4 == 0) goto L_0x1bac
            android.app.Activity r9 = r1.A05
            X.0qQ.A07(r9)
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            com.instagram.reels.question.model.QuestionResponseReshareModel r7 = r1.A1i
            if (r7 == 0) goto L_0x3a7d
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r3.A0z
            X.0qQ.A07(r4)
            X.9n5 r2 = new X.9n5
            r109 = r2
            r110 = r9
            r111 = r8
            r112 = r3
            r113 = r4
            r114 = r40
            r115 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115)
        L_0x13b3:
            X.8D8 r2 = (X.AnonymousClass8D8) r2
        L_0x13b5:
            r0.A1g = r2
            X.LwN r4 = r1.A1V
            if (r4 == 0) goto L_0x13c4
            boolean r4 = r2 instanceof X.KLG
            if (r4 == 0) goto L_0x13c4
            r4 = r2
            X.KLG r4 = (X.KLG) r4
            r3.A08 = r4
        L_0x13c4:
            android.app.Activity r9 = r0.A09
            com.instagram.common.session.UserSession r8 = r0.A0R
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r0.A2B
            X.8D9 r61 = new X.8D9
            r4 = r61
            r4.<init>(r9, r8, r3, r7)
            r0.A1w = r4
            X.81T r11 = r0.A11
            X.8Yz r10 = r0.A0W
            X.80U r9 = r0.A1f
            X.82W r8 = r0.A0M
            com.instagram.common.session.UserSession r7 = r0.A0R
            r4 = r23
            X.0qQ.A0B(r4, r6)
            r4 = r101
            X.0qQ.A0B(r10, r4)
            r4 = 6
            X.0qQ.A0B(r7, r4)
            X.IwA r4 = new X.IwA
            r109 = r4
            r110 = r6
            r111 = r23
            r112 = r11
            r113 = r10
            r114 = r9
            r115 = r76
            r116 = r8
            r117 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            X.8DB r62 = new X.8DB
            r7 = r62
            r7.<init>(r9, r4)
            r0.A1J = r7
            boolean r4 = r1.A36
            if (r4 == 0) goto L_0x1b97
            X.80U r14 = r0.A1f
            X.8Yz r13 = r0.A0W
            r4 = r89
            X.2Fj r12 = r4.A06
            com.instagram.common.session.UserSession r11 = r0.A0R
            android.app.Activity r10 = r0.A09
            X.84v r9 = r0.A1L
            r9.getClass()
            java.lang.String r172 = "reel_composer_camera"
            X.80x r8 = r0.A20
            X.2cp r160 = X.C61340me.A00()
            X.4DH r7 = r0.A0J
            X.8DD r4 = new X.8DD
            r155 = r4
            r156 = r10
            r157 = r75
            r158 = r7
            r159 = r12
            r161 = r46
            r162 = r41
            r163 = r11
            r164 = r13
            r165 = r44
            r166 = r87
            r167 = r57
            r168 = r9
            r170 = r14
            r171 = r8
            r173 = r107
            r155.<init>(r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173)
            r0.A1I = r4
            X.8DM r4 = r4.A0O
            if (r4 == 0) goto L_0x3a77
            X.8DO r4 = r4.AcK()
            r0.A1G = r4
            r4 = r29
            X.2gB r8 = r4.A0F
            X.4DH r7 = r0.A0J
            X.8Ds r4 = new X.8Ds
            r4.<init>(r0)
            r8.A06(r7, r4)
            r4 = 0
        L_0x146a:
            X.80U r10 = r0.A1f
            X.8Yz r9 = r0.A0W
            r7 = r107
            X.0qQ.A0B(r9, r7)
            r8 = 31
            X.MMj r7 = new X.MMj
            r7.<init>(r9, r8)
            X.8Dt r67 = new X.8Dt
            r8 = r67
            r8.<init>(r10, r7)
            boolean r7 = r2 instanceof X.C352598Dz
            if (r7 == 0) goto L_0x1486
            r4 = r2
        L_0x1486:
            X.80U r14 = r0.A1f
            X.4DH r13 = r0.A0J
            X.81m r7 = r0.A1a
            X.81t r7 = r7.A00()
            X.8E0 r12 = r7.BV0()
            X.81m r7 = r0.A1a
            X.81t r7 = r7.A00()
            X.8E2 r117 = r7.BUh()
            com.instagram.common.session.UserSession r11 = r0.A0R
            X.82W r7 = r0.A0M
            r22 = r7
            X.82t r7 = r0.A26
            r19 = r7
            com.instagram.music.common.config.MusicAttributionConfig r7 = r1.A1N
            r18 = r7
            X.86n r7 = r44.A00()
            int r125 = r7.BcK()
            X.8Yz r10 = r0.A0W
            X.8E3 r9 = new X.8E3
            r9.<init>(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r15 = r0.A0i
            X.82n r7 = r1.A12
            if (r7 == 0) goto L_0x1b94
            X.7zz r8 = r7.A00
        L_0x14c3:
            if (r4 == 0) goto L_0x1b91
            X.8Dz r4 = (X.C352598Dz) r4
            java.util.Map r4 = r4.A01
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r17 = r4.iterator()
        L_0x14d1:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x1b8e
            java.lang.Object r7 = r17.next()
            boolean r4 = r7 instanceof X.B3d
            if (r4 == 0) goto L_0x14d1
        L_0x14df:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
        L_0x14e1:
            r4 = r101
            X.0qQ.A0B(r13, r4)
            r4 = r102
            X.0qQ.A0B(r12, r4)
            r4 = 5
            X.0qQ.A0B(r11, r4)
            r4 = 12
            X.0qQ.A0B(r10, r4)
            X.8E4 r4 = new X.8E4
            r109 = r4
            r110 = r7
            r111 = r75
            r112 = r13
            r113 = r22
            r114 = r11
            r115 = r10
            r116 = r15
            r118 = r12
            r119 = r9
            r120 = r47
            r121 = r19
            r122 = r18
            r123 = r39
            r124 = r8
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125)
            X.8E5 r74 = new X.8E5
            r7 = r74
            r7.<init>(r14, r4)
            r0.A1W = r7
            com.instagram.common.session.UserSession r11 = r0.A0R
            X.80U r10 = r0.A1f
            X.81m r9 = r0.A1a
            X.0qQ.A0B(r11, r6)
            boolean r4 = r1.A3d
            r22 = 0
            if (r4 == 0) goto L_0x1541
            X.84u r8 = r1.A1p
            if (r8 == 0) goto L_0x1541
            r7 = 20
            X.AwZ r4 = new X.AwZ
            r4.<init>(r7, r8, r11, r9)
            X.8E6 r22 = new X.8E6
            r7 = r22
            r7.<init>(r10, r4)
        L_0x1541:
            r4 = r22
            r0.A1e = r4
            com.instagram.common.session.UserSession r11 = r0.A0R
            boolean r10 = r1.A3G
            X.8Yz r9 = r0.A0W
            X.80U r8 = r0.A1f
            X.0qQ.A0B(r11, r6)
            r4 = r102
            X.0qQ.A0B(r9, r4)
            r7 = 5
            r4 = r21
            X.0qQ.A0B(r4, r7)
            X.JVr r4 = new X.JVr
            r109 = r4
            r110 = r6
            r111 = r11
            r112 = r75
            r113 = r9
            r114 = r8
            r115 = r21
            r116 = r29
            r117 = r10
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            X.8E7 r59 = new X.8E7
            r7 = r59
            r7.<init>(r8, r4)
            r0.A0q = r7
            X.8E8 r8 = r59.A00()
            X.8aL r7 = X.C358088aL.A04
            X.8F5 r4 = new X.8F5
            r4.<init>(r0)
            r8.A03(r4, r7)
            X.8E8 r8 = r59.A00()
            X.8aL r7 = X.C358088aL.A0x
            X.8F6 r4 = new X.8F6
            r4.<init>(r0)
            r8.A03(r4, r7)
            if (r60 == 0) goto L_0x15a7
            X.8E8 r8 = r59.A00()
            X.8aL r7 = X.C358088aL.A0l
            X.AYP r4 = new X.AYP
            r4.<init>(r0)
            r8.A02(r4, r7)
        L_0x15a7:
            X.8E8 r7 = r59.A00()
            X.8aL r8 = X.C358088aL.A0G
            X.8F7 r4 = new X.8F7
            r4.<init>(r0)
            r7.A02(r4, r8)
            X.8E8 r9 = r59.A00()
            X.8aL r7 = X.C358088aL.A0K
            X.8F8 r4 = new X.8F8
            r4.<init>(r0)
            r9.A02(r4, r7)
            android.app.Activity r4 = r0.A09
            android.content.Context r11 = r4.getApplicationContext()
            X.4DH r9 = r0.A0J
            X.80U r10 = r0.A1f
            r4 = r28
            X.0qQ.A0B(r4, r6)
            X.8F9 r7 = new X.8F9
            r7.<init>(r4)
            X.2YN r4 = new X.2YN
            r4.<init>(r7, r9)
            java.lang.Class<X.8FA> r7 = X.AnonymousClass8FA.class
            X.2YL r32 = r4.A00(r7)
            r4 = r32
            X.8FA r4 = (X.AnonymousClass8FA) r4
            r32 = r4
            X.2Fk r10 = r4.A00(r10)
            X.8FC r7 = new X.8FC
            r4 = r59
            r7.<init>(r4)
            r10.A06(r9, r7)
            boolean r9 = X.AnonymousClass8FD.A00(r11)
            r4 = r32
            X.05G r7 = r4.A02
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            r7.Epw(r4)
            r4 = r32
            r0.A0r = r4
            X.81m r4 = r0.A1a
            X.81t r4 = r4.A00()
            com.instagram.reels.common.ui.StoryTypeSelectorView r7 = r4.B8D()
            X.8FF r4 = new X.8FF
            r4.<init>(r0)
            r7.setOnOptionSelectedListener(r4)
            com.instagram.common.session.UserSession r4 = r0.A0R
            boolean r4 = X.AnonymousClass81x.A00(r4)
            if (r4 == 0) goto L_0x1b8a
            X.8HD r14 = new X.8HD
            r4 = r59
            r14.<init>(r4)
            X.823 r4 = r0.A0p
            r14.A00 = r4
            r7 = 2131429455(0x7f0b084f, float:1.8480583E38)
            r4 = r75
            android.view.View r4 = r4.requireViewById(r7)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r7 = r4.inflate()
            r4 = 2131429456(0x7f0b0850, float:1.8480585E38)
            android.view.View r11 = r7.requireViewById(r4)
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu r11 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu) r11
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.8E8 r7 = r59.A00()
            X.0qQ.A0B(r9, r6)
            r4 = r107
            X.0qQ.A0B(r7, r4)
            r11.A00 = r9
            r11.A01 = r7
            X.8EP r4 = new X.8EP
            r109 = r4
            r110 = r11
            r111 = r9
            r112 = r7
            r113 = r11
            r114 = r107
            r109.<init>(r110, r111, r112, r113, r114)
            r11.A03 = r4
            java.util.Set r4 = r14.A04
            r11.setUtilityMenuCameraTools(r4)
            r11.setUtilityMenuDelegateListener(r14)
            X.AYQ r9 = new X.AYQ
            r9.<init>(r0)
            java.util.Map r7 = r14.A02
            boolean r4 = r7.containsKey(r8)
            if (r4 != 0) goto L_0x1688
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r7.put(r8, r4)
        L_0x1688:
            java.lang.Object r4 = r7.get(r8)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x1693
            r4.add(r9)
        L_0x1693:
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.8FH r7 = new X.8FH
            r7.<init>(r4, r11)
            X.80U r8 = r0.A1f
            r4 = r32
            X.2Fk r8 = r4.A00(r8)
            X.4DH r4 = r0.A0J
            r8.A06(r4, r7)
            X.8Yz r4 = r0.A0W
            X.80u r7 = r7.A02
            r4.A0F(r7)
            X.8aL r4 = r1.A0X
            if (r4 == 0) goto L_0x16cb
            X.8Yz r8 = r0.A0W
            X.80m r7 = r8.A08
            java.lang.Object r7 = r7.A00
            X.4yO r7 = (X.C279284yO) r7
            X.8aL[] r4 = new X.C358088aL[]{r4}
            boolean r4 = r8.A0T(r7, r4)
            if (r4 == 0) goto L_0x16cb
            X.8Yz r7 = r0.A0W
            X.8aL r4 = r1.A0X
            r7.A0K(r4)
        L_0x16cb:
            X.8E8 r4 = r59.A00()
            X.8F4 r7 = r4.A04
            X.0qQ.A0B(r7, r6)
            r4 = r80
            java.util.Set r4 = r4.A0Z
            r4.add(r7)
            com.instagram.api.schemas.ClipsCameraCommandAction r4 = r1.A0H
            if (r4 == 0) goto L_0x16fb
            int r7 = r4.ordinal()
            r4 = 4
            if (r7 != r4) goto L_0x16fb
            android.app.Activity r4 = r0.A09
            android.content.Context r4 = r4.getApplicationContext()
            boolean r4 = X.AnonymousClass8FD.A00(r4)
            if (r4 == 0) goto L_0x16fb
            X.825 r4 = r0.A1q
            boolean r4 = r4.A01
            if (r4 == 0) goto L_0x16fb
            A04(r0)
        L_0x16fb:
            X.80U r13 = r0.A1f
            com.instagram.common.session.UserSession r12 = r0.A0R
            android.app.Activity r10 = r0.A09
            X.8Yz r9 = r0.A0W
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r0.A2B
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r0.A0i
            r4 = r107
            X.0qQ.A0B(r12, r4)
            r4 = r101
            X.0qQ.A0B(r10, r4)
            r4 = r102
            X.0qQ.A0B(r9, r4)
            r4 = 6
            X.0qQ.A0B(r8, r4)
            r4 = 8
            X.0qQ.A0B(r7, r4)
            X.Phs r4 = new X.Phs
            r109 = r4
            r110 = r107
            r111 = r10
            r112 = r12
            r113 = r9
            r114 = r75
            r115 = r3
            r116 = r8
            r117 = r51
            r118 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118)
            X.8FK r65 = new X.8FK
            r7 = r65
            r7.<init>(r13, r4)
            r0.A1B = r7
            X.1ET r119 = X.1ES.A01()
            X.80U r10 = r0.A1f
            X.4DH r8 = r0.A0J
            r4 = r10
            X.80T r4 = (X.AnonymousClass80T) r4
            X.80W r7 = r4.A01
            r4 = r102
            X.0qQ.A0B(r8, r4)
            r18 = 4
            r4 = r18
            X.0qQ.A0B(r7, r4)
            X.8FR r9 = new X.8FR
            r4 = r21
            r9.<init>(r8, r4, r7)
            r12 = 17
            X.AwZ r8 = new X.AwZ
            r7 = r75
            r8.<init>(r12, r9, r7, r4)
            X.8FS r4 = new X.8FS
            r4.<init>(r10, r8)
            X.81C r4 = r4.A00
            X.81E r4 = r4.A00()
            X.8FV r4 = (X.AnonymousClass8FV) r4
            r4.ECG()
            X.8Yz r12 = r0.A0W
            X.3E6 r10 = r0.A0S
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r0.A0i
            X.81i r8 = r0.A1Q
            X.81m r7 = r0.A1a
            X.8Fd r4 = new X.8Fd
            r4.<init>(r0)
            X.8Fe r56 = new X.8Fe
            r109 = r56
            r110 = r75
            r111 = r10
            r112 = r12
            r113 = r9
            r114 = r93
            r115 = r1
            r116 = r4
            r117 = r8
            r118 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118)
            r4 = r56
            r0.A27 = r4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r0.A2B
            X.8Yz r9 = r0.A0W
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r0.A0i
            X.81m r7 = r0.A1a
            X.81i r4 = r0.A1Q
            X.8Fg r54 = new X.8Fg
            r109 = r54
            r111 = r9
            r112 = r3
            r113 = r8
            r114 = r1
            r115 = r4
            r116 = r7
            r117 = r10
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            X.80U r12 = r0.A1f
            android.app.Activity r10 = r0.A09
            com.instagram.common.session.UserSession r9 = r0.A0R
            r4 = r107
            X.0qQ.A0B(r10, r4)
            r4 = r101
            X.0qQ.A0B(r9, r4)
            X.AwZ r8 = new X.AwZ
            r7 = r35
            r4 = r75
            r8.<init>(r7, r10, r9, r4)
            X.8Fj r17 = new X.8Fj
            r4 = r17
            r4.<init>(r12, r8)
            X.8Yz r4 = r0.A0W
            r35 = r4
            X.82p r4 = r0.A0o
            r33 = r4
            X.80U r4 = r0.A1f
            r29 = r4
            X.81m r4 = r0.A1a
            r28 = r4
            X.82W r4 = r0.A0M
            r23 = r4
            X.84E r4 = r0.A0N
            r19 = r4
            X.8DD r15 = r0.A1I
            X.81e r13 = r0.A0y
            X.81i r12 = r0.A1Q
            X.823 r10 = r0.A0p
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r0.A0i
            X.88F r8 = r0.A22
            X.80x r7 = r0.A20
            X.82u r4 = r0.A0D
            X.8Fl r66 = new X.8Fl
            r135 = r66
            r136 = r75
            r137 = r4
            r138 = r23
            r139 = r19
            r140 = r119
            r141 = r35
            r142 = r79
            r143 = r9
            r144 = r67
            r145 = r80
            r146 = r33
            r147 = r10
            r148 = r11
            r149 = r59
            r150 = r1
            r151 = r13
            r152 = r65
            r153 = r76
            r154 = r84
            r155 = r15
            r156 = r62
            r157 = r57
            r158 = r21
            r159 = r105
            r160 = r12
            r161 = r74
            r162 = r28
            r163 = r22
            r164 = r17
            r165 = r29
            r166 = r94
            r167 = r47
            r168 = r7
            r169 = r8
            r170 = r56
            r135.<init>(r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170)
            r4 = r66
            r0.A0l = r4
            r4 = r34
            X.05G r7 = r4.A00
            r4 = r103
            androidx.lifecycle.CoroutineLiveData r8 = X.C226292g8.A00(r4, r7)
            X.4DH r7 = r0.A0J
            X.8H2 r4 = new X.8H2
            r4.<init>(r0)
            r8.A06(r7, r4)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r9 = r0.A2B
            X.8Yz r8 = r0.A0W
            X.80U r7 = r0.A1f
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            X.8H3 r52 = new X.8H3
            r109 = r52
            r110 = r8
            r111 = r51
            r113 = r4
            r115 = r7
            r116 = r9
            r109.<init>(r110, r111, r112, r113, r114, r115, r116)
            r4 = r52
            r0.A1b = r4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r0.A2B
            X.8H5 r50 = new X.8H5
            r7 = r50
            r4 = r51
            r7.<init>(r4, r3, r1, r8)
            r0.A1d = r7
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r0.A2B
            X.8H7 r49 = new X.8H7
            r4 = r49
            r4.<init>(r3, r1, r7)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r0.A2B
            X.8H9 r48 = new X.8H9
            r4 = r48
            r4.<init>(r3, r1, r7)
            r7 = r66
            r4 = r80
            r4.A06 = r7
            X.81i r8 = r0.A1Q
            X.8HB r4 = new X.8HB
            r4.<init>(r0)
            r8.A04 = r4
            X.8HC r7 = new X.8HC
            r4 = r91
            r7.<init>(r14, r0, r4)
            r8.A03 = r7
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r4 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r4
            X.81W r4 = r4.A0K
            r4.getWidth()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r4 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r4
            X.81W r4 = r4.A0K
            r4.getHeight()
            android.app.Activity r4 = r0.A09
            boolean r4 = X.C305756Jk.A00(r4)
            if (r4 == 0) goto L_0x1b45
            X.8Yz r15 = r0.A0W
            android.app.Activity r13 = r0.A09
            com.instagram.common.session.UserSession r12 = r0.A0R
            r4 = r66
            X.8Fz r10 = r4.A09
            if (r10 != 0) goto L_0x18f3
            X.8Fz r10 = new X.8Fz
            r10.<init>(r4)
            r4.A09 = r10
        L_0x18f3:
            X.80U r11 = r0.A1f
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r9 = r4.A00
            X.81i r8 = r0.A1Q
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r0.A0i
            X.81T r4 = r0.A11
            r4.getModuleName()
            X.8HF r4 = new X.8HF
            r120 = r4
            r121 = r13
            r122 = r9
            r123 = r12
            r124 = r15
            r125 = r7
            r126 = r10
            r127 = r83
            r128 = r84
            r129 = r8
            r130 = r11
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130)
        L_0x191d:
            r7 = r89
            X.2Fj r9 = r7.A06
            X.4DH r8 = r0.A0J
            X.8Ha r7 = new X.8Ha
            r7.<init>(r4, r0)
            r9.A06(r8, r7)
            r4.A07 = r3
            X.81i r7 = r0.A1Q
            r7.A04(r4)
            r7 = r66
            r7.A08 = r4
            X.81i r7 = r0.A1Q
            r4 = r66
            r7.A04(r4)
            r4 = r62
            X.81C r4 = r4.A00
            X.81E r7 = r4.A00()
            X.8Hd r7 = (X.C353318Hd) r7
            r4 = r66
            r7.EcG(r4)
            X.81m r4 = r0.A1a
            X.81t r7 = r4.A00()
            android.app.Activity r9 = r0.A09
            X.82W r4 = r0.A0M
            X.82X r8 = r4.A00()
            android.view.ViewGroup r7 = r7.AhF()
            X.8Hk r4 = new X.8Hk
            r4.<init>(r9, r7, r8)
            X.0nA.A0q(r7, r4)
            X.4DH r10 = r0.A0J
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.8Yz r8 = r0.A0W
            X.81i r7 = r0.A1Q
            X.8DD r4 = r0.A1I
            X.8Hl r39 = new X.8Hl
            r109 = r39
            r110 = r10
            r111 = r9
            r112 = r8
            r113 = r66
            r114 = r44
            r115 = r4
            r116 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115, r116)
            android.view.ViewGroup r4 = r0.A0C
            X.0qQ.A0B(r4, r6)
            r7 = r39
            com.instagram.common.session.UserSession r11 = r7.A09
            android.content.Context r10 = r7.A07
            android.content.Context r7 = r10.getApplicationContext()
            boolean r7 = X.C362988ir.A01(r7, r11)
            if (r7 == 0) goto L_0x19c8
            X.Afo r9 = new X.Afo
            r7 = r39
            r9.<init>(r4, r7)
            X.1pd r8 = X.C362988ir.A00()
            android.content.Context r7 = r4.getContext()
            X.0qQ.A07(r7)
            java.lang.String r4 = "sup:SupDelegate_SETUP_GLASSES_CALLBACK"
            r8.A01(r7, r11, r9, r4)
            X.1pd r4 = X.C362988ir.A00()
            X.VgJ r8 = X.1pd.A00(r4)
            X.LyC r7 = new X.LyC
            r4 = r39
            r7.<init>(r4)
            java.lang.String r4 = "sup:SupDelegate|SupLiveDelegate_ADD_CB"
            r8.A00(r10, r11, r7, r4)
            X.C353398Hl.A04(r39)
        L_0x19c8:
            X.8Yz r4 = r0.A0W
            X.80m r4 = r4.A07
            java.lang.Object r7 = r4.A00
            java.util.Set r7 = (java.util.Set) r7
            X.80L r19 = X.AnonymousClass80L.A00
            r4 = r19
            boolean r4 = r7.contains(r4)
            if (r4 != 0) goto L_0x19ea
            r4 = r95
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto L_0x1b41
            com.instagram.common.session.UserSession r4 = r0.A0R
            boolean r4 = X.1NM.A01(r4)
            if (r4 == 0) goto L_0x1b41
        L_0x19ea:
            X.80U r12 = r0.A1f
            X.4DH r11 = r0.A0J
            X.8Yz r10 = r0.A0W
            X.B2s r9 = r1.A0l
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r8 = r0.A0U
            com.instagram.common.session.UserSession r7 = r0.A0R
            int r4 = r0.A08
            r33 = r4
            com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive r4 = r1.A0v
            r29 = r4
            X.3NV r4 = r1.A1w
            r28 = r4
            java.lang.String r4 = r1.A2n
            r23 = r4
            java.lang.Boolean r4 = r1.A25
            r21 = r4
            java.lang.Long r15 = r1.A2B
            X.82W r13 = r0.A0M
            r4 = r107
            X.0qQ.A0B(r11, r4)
            r4 = r102
            X.0qQ.A0B(r10, r4)
            r4 = r18
            X.0qQ.A0B(r9, r4)
            r4 = 5
            X.0qQ.A0B(r8, r4)
            r4 = 6
            X.0qQ.A0B(r7, r4)
            X.7im r4 = new X.7im
            r135 = r4
            r136 = r8
            r137 = r11
            r138 = r13
            r139 = r66
            r140 = r7
            r141 = r10
            r142 = r59
            r143 = r9
            r144 = r39
            r145 = r29
            r146 = r28
            r147 = r21
            r148 = r15
            r149 = r23
            r150 = r33
            r135.<init>(r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150)
            X.7pK r34 = new X.7pK
            r7 = r34
            r7.<init>(r12, r4)
        L_0x1a51:
            r4 = r34
            r0.A1S = r4
            android.app.Activity r7 = r0.A09
            r8 = r7
            X.07g r8 = (X.AnonymousClass07g) r8
            com.instagram.common.session.UserSession r4 = r0.A0R
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            X.87r r4 = X.C351878Au.A00(r7, r4)
            X.2YN r7 = new X.2YN
            r7.<init>(r4, r8)
            java.lang.Class<X.87s> r4 = X.C3511387s.class
            X.2YL r23 = r7.A00(r4)
            r4 = r23
            X.87s r4 = (X.C3511387s) r4
            r23 = r4
            r0.A1o = r4
            X.82i r4 = r1.A18
            if (r4 == 0) goto L_0x2552
            X.8JI r7 = r4.A00
            X.8JI r4 = X.AnonymousClass8JI.TEMPLATE
            if (r7 != r4) goto L_0x2552
            X.9Qn r4 = r1.A13
            if (r4 == 0) goto L_0x2552
            X.4gw r4 = r4.A04
            if (r4 == 0) goto L_0x2552
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.1E8 r7 = X.1E7.A00(r4)
            X.82i r4 = r1.A18
            X.1Xj r4 = r4.A04
            r7.A00(r4)
            X.8FA r4 = r0.A0r
            X.05G r7 = r4.A00
            r4 = r97
            r7.Epw(r4)
            X.81m r4 = r0.A1a
            X.81t r4 = r4.A00()
            r4.CLs()
            X.87s r4 = r0.A1o
            X.82i r7 = r1.A18
            X.1Xj r7 = r7.A04
            java.lang.String r12 = r7.getId()
            X.82i r7 = r1.A18
            X.1Xj r7 = r7.A04
            java.lang.String r13 = r7.A2U()
            X.9Qn r7 = r1.A13
            X.4gw r7 = r7.A04
            X.4ys r10 = r7.FDm()
            X.28D r9 = r1.A0B
            X.82i r7 = r1.A18
            com.instagram.user.model.User r11 = r7.A05
            com.instagram.clips.template.creation.model.ClipsTemplateModel r8 = new com.instagram.clips.template.creation.model.ClipsTemplateModel
            r8.<init>(r9, r10, r11, r12, r13)
            X.05G r13 = r4.A0S
            X.883 r7 = X.AnonymousClass883.INIT
            r13.Epw(r7)
            com.instagram.clips.template.creation.model.ClipsTemplateModel r7 = r4.A05
            boolean r7 = X.0qQ.A0K(r7, r8)
            if (r7 != 0) goto L_0x2552
            r4.A05 = r8
            java.lang.String r7 = r8.A04
            r4.A0B = r7
            X.4ys r10 = r8.A01
            r4.A04 = r10
            X.28D r7 = r8.A00
            r4.A02 = r7
            com.instagram.user.model.User r7 = r8.A02
            r4.A09 = r7
            java.lang.String r12 = r8.A03
            r4.A0C = r12
            X.87u r15 = r4.A0I
            X.6oS r11 = X.C318116oQ.A00(r15)
            r9 = 13
            X.9Jz r8 = new X.9Jz
            r7 = r106
            r8.<init>((java.lang.Object) r15, (java.lang.Object) r10, (X.AnonymousClass4D7) r7, (int) r9)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r7 = r103
            X.1Eo.A03(r9, r7, r8, r11)
            X.882 r7 = r4.A0J
            r7.A00 = r10
            if (r10 == 0) goto L_0x249f
            java.util.List r8 = r10.BrX()
            if (r8 == 0) goto L_0x249f
            r10 = 0
            java.util.Iterator r21 = r8.iterator()
        L_0x1b17:
            boolean r8 = r21.hasNext()
            if (r8 == 0) goto L_0x249f
            java.lang.Object r11 = r21.next()
            int r18 = r10 + 1
            if (r10 >= 0) goto L_0x1b2d
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1b2d:
            X.4yf r11 = (X.C279454yf) r11
            boolean r8 = X.AnonymousClass8YL.A03(r11)
            if (r8 == 0) goto L_0x1b3e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.util.HashMap r8 = r7.A03
            r8.put(r10, r11)
        L_0x1b3e:
            r10 = r18
            goto L_0x1b17
        L_0x1b41:
            r34 = r106
            goto L_0x1a51
        L_0x1b45:
            X.8Yz r15 = r0.A0W
            android.app.Activity r13 = r0.A09
            com.instagram.common.session.UserSession r12 = r0.A0R
            r4 = r66
            X.8Fz r9 = r4.A09
            if (r9 != 0) goto L_0x1b58
            X.8Fz r9 = new X.8Fz
            r9.<init>(r4)
            r4.A09 = r9
        L_0x1b58:
            X.80U r11 = r0.A1f
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r8 = r4.A00
            X.81i r7 = r0.A1Q
            java.lang.String r10 = r1.A2q
            r4 = r99
            boolean r4 = r4.equals(r10)
            r130 = r4 ^ 1
            X.81T r4 = r0.A11
            r4.getModuleName()
            X.9m8 r4 = new X.9m8
            r120 = r4
            r121 = r13
            r122 = r8
            r123 = r12
            r124 = r15
            r125 = r9
            r126 = r83
            r127 = r84
            r128 = r7
            r129 = r11
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130)
            goto L_0x191d
        L_0x1b8a:
            r11 = 0
            r14 = 0
            goto L_0x1693
        L_0x1b8e:
            r7 = 0
            goto L_0x14df
        L_0x1b91:
            r7 = 0
            goto L_0x14e1
        L_0x1b94:
            r8 = 0
            goto L_0x14c3
        L_0x1b97:
            boolean r4 = r1.A3b
            if (r4 == 0) goto L_0x1b9e
            r44.A00()
        L_0x1b9e:
            r4 = 0
            r7 = r106
            r0.A1I = r7
            X.AaF r7 = new X.AaF
            r7.<init>()
            r0.A1G = r7
            goto L_0x146a
        L_0x1bac:
            X.82n r4 = r1.A12
            if (r4 == 0) goto L_0x1bce
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            java.lang.String r14 = r10.getModuleName()
            X.82n r8 = r1.A12
            if (r8 == 0) goto L_0x3a83
            X.8Dz r2 = new X.8Dz
            r9 = r2
            r10 = r7
            r11 = r4
            r12 = r3
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x13b3
        L_0x1bce:
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r1.A1h
            if (r4 == 0) goto L_0x1bea
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            java.lang.String r14 = r10.getModuleName()
            com.instagram.reels.prompt.model.PromptStickerModel r8 = r1.A1h
            if (r8 != 0) goto L_0x1e48
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x1bea:
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r4 = r1.A0a
            if (r4 == 0) goto L_0x1bfe
            com.instagram.common.session.UserSession r2 = r1.A0S
            X.0qQ.A07(r2)
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r4 = r1.A0a
            if (r4 == 0) goto L_0x3a89
            X.9mz r2 = new X.9mz
            r2.<init>(r4, r3)
            goto L_0x13b3
        L_0x1bfe:
            X.9m3 r4 = r1.A1c
            if (r4 == 0) goto L_0x1c20
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            android.app.Activity r4 = r1.A05
            X.0qQ.A07(r4)
            java.lang.String r14 = r10.getModuleName()
            X.9m3 r8 = r1.A1c
            if (r8 == 0) goto L_0x3a8f
            X.9nD r2 = new X.9nD
            r9 = r2
            r10 = r4
            r11 = r7
            r12 = r3
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x13b3
        L_0x1c20:
            com.instagram.user.model.User r4 = r1.A1v
            if (r4 == 0) goto L_0x1c4b
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            java.lang.String r115 = r10.getModuleName()
            com.instagram.user.model.User r9 = r1.A1v
            if (r9 == 0) goto L_0x3a95
            X.QP8 r4 = r1.A0F
            X.9nG r2 = new X.9nG
            r109 = r2
            r110 = r7
            r111 = r4
            r112 = r8
            r113 = r3
            r114 = r9
            r109.<init>(r110, r111, r112, r113, r114, r115)
            goto L_0x13b3
        L_0x1c4b:
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r4 = r1.A1f
            if (r4 == 0) goto L_0x1c6d
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            java.lang.String r14 = r10.getModuleName()
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r8 = r1.A1f
            if (r8 == 0) goto L_0x3a9b
            X.9nH r2 = new X.9nH
            r9 = r2
            r10 = r7
            r11 = r4
            r12 = r3
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x13b3
        L_0x1c6d:
            com.instagram.music.common.model.MusicOverlayStickerModel r4 = r1.A1R
            if (r4 == 0) goto L_0x1c8f
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            android.app.Activity r4 = r1.A05
            X.0qQ.A07(r4)
            java.lang.String r14 = r10.getModuleName()
            com.instagram.music.common.model.MusicOverlayStickerModel r8 = r1.A1R
            if (r8 == 0) goto L_0x3aa1
            X.9nF r2 = new X.9nF
            r9 = r2
            r10 = r4
            r11 = r7
            r12 = r3
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x13b3
        L_0x1c8f:
            X.WaO r4 = r1.A1Y
            if (r4 == 0) goto L_0x1cb1
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            X.WaO r4 = r1.A1Y
            if (r4 == 0) goto L_0x3aa7
            java.lang.String r14 = r10.getModuleName()
            X.9n0 r2 = new X.9n0
            r9 = r2
            r10 = r7
            r11 = r8
            r12 = r3
            r13 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x13b3
        L_0x1cb1:
            if (r7 != 0) goto L_0x13b5
            X.WaP r4 = r1.A1j
            if (r4 == 0) goto L_0x1cd5
            android.app.Activity r8 = r1.A05
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.WaP r4 = r1.A1j
            if (r4 == 0) goto L_0x3aad
            java.lang.String r14 = r10.getModuleName()
            X.9my r2 = new X.9my
            r9 = r2
            r10 = r8
            r11 = r7
            r12 = r3
            r13 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x13b3
        L_0x1cd5:
            X.WaN r4 = r1.A1b
            if (r4 == 0) goto L_0x1cee
            android.app.Activity r8 = r1.A05
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.WaN r4 = r1.A1b
            if (r4 == 0) goto L_0x3ab3
            X.9n2 r2 = new X.9n2
            r2.<init>(r8, r7, r3, r4)
            goto L_0x13b3
        L_0x1cee:
            X.Vja r4 = r1.A1a
            if (r4 == 0) goto L_0x1d02
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            X.Vja r4 = r1.A1a
            if (r4 == 0) goto L_0x3ab9
            X.Ukd r2 = new X.Ukd
            r2.<init>(r7, r3, r4)
            goto L_0x13b3
        L_0x1d02:
            X.Vuw r4 = r1.A1m
            if (r4 == 0) goto L_0x1d1b
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r2 = r1.A0S
            X.0qQ.A07(r2)
            X.Vuw r4 = r1.A1m
            if (r4 == 0) goto L_0x3abf
            X.Uke r2 = new X.Uke
            r2.<init>(r7, r3, r4)
            goto L_0x13b3
        L_0x1d1b:
            com.instagram.reels.smb.model.ProfileStickerModel r4 = r1.A1l
            if (r4 == 0) goto L_0x1d4b
            android.app.Activity r8 = r1.A05
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.4DH r2 = r1.A0M
            r2.getClass()
            X.4DH r2 = r1.A0M
            X.0gy r111 = X.AnonymousClass07i.A00(r2)
            com.instagram.reels.smb.model.ProfileStickerModel r4 = r1.A1l
            if (r4 == 0) goto L_0x3ac5
            X.KLH r2 = new X.KLH
            r109 = r2
            r110 = r8
            r112 = r10
            r113 = r7
            r114 = r3
            r115 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115)
            goto L_0x13b3
        L_0x1d4b:
            X.BBV r4 = r1.A0D
            if (r4 == 0) goto L_0x1d60
            android.app.Activity r4 = r1.A05
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r2 = r1.A0S
            X.0qQ.A07(r2)
            X.9n6 r2 = new X.9n6
            r2.<init>(r4, r3)
            goto L_0x13b3
        L_0x1d60:
            X.Aem r4 = r1.A1Z
            if (r4 == 0) goto L_0x1d79
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r2 = r1.A0S
            X.0qQ.A07(r2)
            X.Aem r4 = r1.A1Z
            if (r4 == 0) goto L_0x3acb
            X.9n1 r2 = new X.9n1
            r2.<init>(r7, r3, r4)
            goto L_0x13b3
        L_0x1d79:
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r4 = r1.A0k
            if (r4 == 0) goto L_0x1d96
            android.app.Activity r2 = r1.A05
            android.content.Context r8 = r2.getApplicationContext()
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r4 = r1.A0k
            if (r4 == 0) goto L_0x3ad1
            X.9n7 r2 = new X.9n7
            r2.<init>(r8, r7, r3, r4)
            goto L_0x13b3
        L_0x1d96:
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r4 = r1.A0j
            if (r4 == 0) goto L_0x1db3
            android.app.Activity r2 = r1.A05
            android.content.Context r8 = r2.getApplicationContext()
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r4 = r1.A0j
            if (r4 == 0) goto L_0x3ad7
            X.9n8 r2 = new X.9n8
            r2.<init>(r8, r7, r3, r4)
            goto L_0x13b3
        L_0x1db3:
            X.JzL r4 = r1.A1o
            if (r4 == 0) goto L_0x1dc7
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            X.JzL r4 = r1.A1o
            if (r4 == 0) goto L_0x3add
            X.9nN r2 = new X.9nN
            r2.<init>(r7, r3, r8, r4)
            goto L_0x13b3
        L_0x1dc7:
            X.WaH r4 = r1.A1X
            if (r4 == 0) goto L_0x1de6
            android.app.Activity r9 = r1.A05
            X.0qQ.A07(r9)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.WaH r4 = r1.A1X
            if (r4 == 0) goto L_0x3ae3
            X.9nL r2 = new X.9nL
            r10 = r2
            r11 = r9
            r12 = r7
            r13 = r3
            r14 = r8
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x13b3
        L_0x1de6:
            X.Aee r4 = r1.A1n
            if (r4 == 0) goto L_0x1dfa
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            X.Aee r4 = r1.A1n
            if (r4 == 0) goto L_0x3ae9
            X.9nM r2 = new X.9nM
            r2.<init>(r7, r3, r8, r4)
            goto L_0x13b3
        L_0x1dfa:
            com.instagram.user.model.UpcomingEvent r4 = r1.A1u
            if (r4 == 0) goto L_0x1e13
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.user.model.UpcomingEvent r4 = r1.A1u
            if (r4 == 0) goto L_0x3aef
            X.9n9 r2 = new X.9n9
            r2.<init>(r7, r8, r3, r4)
            goto L_0x13b3
        L_0x1e13:
            X.N49 r4 = r1.A0E
            if (r4 == 0) goto L_0x1e2c
            android.app.Activity r8 = r1.A05
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.N49 r4 = r1.A0E
            if (r4 == 0) goto L_0x3af5
            X.9nI r2 = new X.9nI
            r2.<init>(r8, r4, r7, r3)
            goto L_0x13b3
        L_0x1e2c:
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r1.A1g
            if (r4 == 0) goto L_0x1e54
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            java.lang.String r14 = r10.getModuleName()
            com.instagram.reels.prompt.model.PromptStickerModel r8 = r1.A1g
            if (r8 != 0) goto L_0x1e48
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x1e48:
            X.9n4 r2 = new X.9n4
            r9 = r2
            r10 = r7
            r11 = r4
            r12 = r3
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x13b3
        L_0x1e54:
            X.9m5 r4 = r1.A0Y
            if (r4 == 0) goto L_0x1e6d
            android.app.Activity r8 = r1.A05
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.9m5 r4 = r1.A0Y
            if (r4 == 0) goto L_0x3afb
            X.9nE r2 = new X.9nE
            r2.<init>(r8, r7, r4, r3)
            goto L_0x13b3
        L_0x1e6d:
            X.WaH r4 = r1.A1W
            if (r4 == 0) goto L_0x1e86
            android.app.Activity r8 = r1.A05
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.WaH r4 = r1.A1W
            if (r4 == 0) goto L_0x3b01
            X.9nC r2 = new X.9nC
            r2.<init>(r8, r7, r3, r4)
            goto L_0x13b3
        L_0x1e86:
            X.LwN r4 = r1.A1V
            if (r4 == 0) goto L_0x1eb4
            android.app.Activity r9 = r1.A05
            X.0qQ.A07(r9)
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            X.LwN r7 = r1.A1V
            if (r7 == 0) goto L_0x3b07
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r3.A0z
            X.0qQ.A07(r4)
            java.lang.String r115 = r10.getModuleName()
            X.KLG r2 = new X.KLG
            r109 = r2
            r110 = r9
            r111 = r8
            r112 = r3
            r113 = r4
            r114 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115)
            goto L_0x13b3
        L_0x1eb4:
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel r4 = r1.A16
            if (r4 == 0) goto L_0x1ed8
            android.app.Activity r9 = r1.A05
            X.0qQ.A07(r9)
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel r7 = r1.A16
            if (r7 == 0) goto L_0x3b0d
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r3.A0z
            X.0qQ.A07(r4)
            X.9nK r2 = new X.9nK
            r10 = r2
            r11 = r9
            r12 = r8
            r13 = r3
            r14 = r4
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x13b3
        L_0x1ed8:
            boolean r4 = r1.A39
            if (r4 == 0) goto L_0x1eed
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            X.9nB r2 = new X.9nB
            r2.<init>(r7, r4, r3)
            goto L_0x13b3
        L_0x1eed:
            X.50v r7 = r1.A1d
            if (r7 == 0) goto L_0x1f10
            boolean r4 = r7 instanceof com.instagram.reels.musicpick.model.MusicPickStickerModel
            if (r4 == 0) goto L_0x1f10
            com.instagram.reels.musicpick.model.MusicPickStickerModel r7 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r7
            java.lang.String r4 = r7.A02
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x1f10
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            X.9nA r2 = new X.9nA
            r2.<init>(r7, r4, r3)
            goto L_0x13b3
        L_0x1f10:
            X.9m1 r4 = r1.A0Z
            if (r4 == 0) goto L_0x1f2c
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            r10.getModuleName()
            X.9m1 r8 = r1.A0Z
            if (r8 == 0) goto L_0x3b13
            X.9n3 r2 = new X.9n3
            r2.<init>(r7, r4, r8, r3)
            goto L_0x13b3
        L_0x1f2c:
            java.lang.Long r4 = r1.A2C
            long r9 = r4.longValue()
            r7 = 0
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x13b5
            android.app.Activity r7 = r1.A05
            X.0qQ.A07(r7)
            java.lang.Long r2 = r1.A2C
            X.0qQ.A07(r2)
            long r12 = r2.longValue()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r3.A0z
            X.0qQ.A07(r4)
            X.9nJ r2 = new X.9nJ
            r8 = r2
            r9 = r7
            r10 = r3
            r11 = r4
            r8.<init>(r9, r10, r11, r12)
            goto L_0x13b3
        L_0x1f56:
            java.util.ArrayList r158 = new java.util.ArrayList
            r158.<init>()
            goto L_0x1258
        L_0x1f5d:
            r11 = 0
            goto L_0x122e
        L_0x1f60:
            X.842 r2 = r0.A1Y
            android.view.ViewGroup r3 = r2.A00
            r2 = 2131437966(0x7f0b298e, float:1.8497846E38)
            android.view.View r111 = r3.requireViewById(r2)
            goto L_0x1046
        L_0x1f6d:
            android.view.View r111 = r3.requireViewById(r2)
            goto L_0x1046
        L_0x1f73:
            X.8AD r3 = X.AnonymousClass8AD.A00
            goto L_0x1010
        L_0x1f77:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x0ff5
        L_0x1f7e:
            java.lang.Class<X.88Z> r3 = X.AnonymousClass88Z.class
            java.lang.ClassLoader r8 = r3.getClassLoader()
            java.lang.Class[] r4 = new java.lang.Class[]{r3}
            X.81C r3 = new X.81C
            r64 = r3
            r65 = r7
            r67 = r5
            r68 = r10
            r69 = r11
            r70 = r107
            r64.<init>(r65, r66, r67, r68, r69, r70)
            X.ArB r5 = new X.ArB
            r5.<init>(r3)
            java.lang.Object r16 = java.lang.reflect.Proxy.newProxyInstance(r8, r4, r5)
            if (r16 == 0) goto L_0x3b19
            r3 = r16
            X.88Z r3 = (X.AnonymousClass88Z) r3
            r16 = r3
            goto L_0x0eb7
        L_0x1fac:
            if (r8 == 0) goto L_0x1fbe
            r3 = 2131430972(0x7f0b0e3c, float:1.848366E38)
            android.view.View r3 = r10.findViewById(r3)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            X.APP r7 = new X.APP
            r7.<init>(r3)
            goto L_0x0e08
        L_0x1fbe:
            r3 = 2131429453(0x7f0b084d, float:1.848058E38)
            android.view.View r4 = r10.requireViewById(r3)
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r4 = (com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r4
            r3 = 2131429486(0x7f0b086e, float:1.8480646E38)
            android.view.View r3 = r10.requireViewById(r3)
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r3 = (com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r3
            X.88J r7 = new X.88J
            r7.<init>(r10, r4, r3, r0)
            r5 = r10
            goto L_0x0e16
        L_0x1fd8:
            r10 = r22
            goto L_0x0df7
        L_0x1fdc:
            android.view.View r4 = r2.requireViewById(r3)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.2eb r30 = new X.2eb
            r3 = r30
            r3.<init>(r4)
            goto L_0x0df1
        L_0x1feb:
            r3 = r106
            goto L_0x0dcd
        L_0x1fef:
            if (r9 == 0) goto L_0x2016
            r60.getClass()
            r4 = r60
            X.8JI r7 = r4.A00
            X.8JI r4 = X.AnonymousClass8JI.SEQUENTIAL_REMIX
            if (r7 == r4) goto L_0x2016
            X.8JI r4 = X.AnonymousClass8JI.TEMPLATE
            if (r7 == r4) goto L_0x2016
            r61 = r0
            r62 = r75
            r64 = r5
            r65 = r60
            r66 = r9
            r67 = r3
            r68 = r8
            X.88F r3 = r61.A00(r62, r63, r64, r65, r66, r67, r68)
            r0.A22 = r3
            goto L_0x0dd8
        L_0x2016:
            r3 = r106
            r0.A22 = r3
            goto L_0x0dd8
        L_0x201c:
            X.82i r4 = r1.A18
            if (r4 == 0) goto L_0x20a7
            java.lang.Integer r5 = r1.A28
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r5 != r4) goto L_0x20a7
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r5 = r4.A00
            r4 = 2131431753(0x7f0b1149, float:1.8485244E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.9Pb r12 = new X.9Pb
            android.app.Activity r9 = r0.A09
            boolean r8 = r1.A3K
            boolean r7 = r1.A46
            android.view.View r112 = r4.inflate()
            int r5 = r1.A03
            boolean r4 = r1.A32
            r109 = r12
            r110 = r9
            r111 = r75
            r113 = r19
            r114 = r38
            r115 = r6
            r116 = r5
            r117 = r6
            r118 = r8
            r119 = r7
            r120 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120)
            android.view.View r7 = r12.A0D
            android.content.Context r5 = r7.getContext()
            r4 = 2131431733(0x7f0b1135, float:1.8485204E38)
            android.view.View r7 = r7.requireViewById(r4)
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4 = 2131960304(0x7f1321f0, float:1.9557273E38)
            java.lang.String r4 = r5.getString(r4)
            r7.setText(r4)
            r4 = 2131231325(0x7f08025d, float:1.8078728E38)
            r7.setCompoundDrawablesWithIntrinsicBounds(r6, r6, r4, r6)
            android.content.res.Resources r5 = r5.getResources()
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r4 = r5.getDimensionPixelSize(r4)
            X.0nA.A0Z(r7, r4)
            X.At4 r4 = new X.At4
            r4.<init>(r0)
            X.L3s r5 = new X.L3s
            r5.<init>(r12, r4)
            X.9Pb r4 = r5.A00
            android.view.View r4 = r4.A0D
            android.view.View[] r4 = new android.view.View[]{r4}
            X.C315596kB.A08(r4, r6)
            r4 = r106
            r0.A1A = r4
            goto L_0x0d2b
        L_0x20a7:
            X.28D r5 = r1.A0B
            X.28D r4 = X.28D.A2b
            if (r5 != r4) goto L_0x2182
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r5 = r4.A00
            r4 = 2131438945(0x7f0b2d61, float:1.8499831E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r66 = r4.inflate()
            X.0iw r7 = r1.A0O
            X.UKc r5 = r1.A1k
            X.A3l r4 = new X.A3l
            r4.<init>(r0)
            X.Abz r20 = new X.Abz
            r64 = r20
            r65 = r75
            r67 = r7
            r68 = r4
            r69 = r5
            r64.<init>(r65, r66, r67, r68, r69)
            r4 = r20
            android.view.View r5 = r4.A02
            X.UKc r7 = r4.A05
            if (r7 == 0) goto L_0x2139
            android.content.res.Resources r8 = r5.getResources()
            r4 = 2131439022(0x7f0b2dae, float:1.8499987E38)
            android.view.View r4 = r5.requireViewById(r4)
            X.0qQ.A07(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r5 = r4.inflate()
            X.0qQ.A0A(r5)
            r4 = 2131165375(0x7f0700bf, float:1.7944965E38)
            int r4 = r8.getDimensionPixelSize(r4)
            X.0nA.A0e(r5, r4)
            r4 = r106
            r5.setBackground(r4)
            r4 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.view.View r9 = r5.requireViewById(r4)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4 = r20
            r4.A00 = r9
            java.lang.String r11 = "headerTitle"
            if (r9 == 0) goto L_0x3b21
            android.content.res.Resources r8 = r9.getResources()
            r5 = 2131971045(0x7f134be5, float:1.9579058E38)
            java.lang.String r4 = r7.A02
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r8.getString(r5, r4)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4, r6)
            r9.setText(r4)
            r4 = r20
            android.widget.TextView r5 = r4.A00
            if (r5 == 0) goto L_0x3b21
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5.setMaxLines(r4)
        L_0x2139:
            r4 = r20
            android.view.View r9 = r4.A01
            r4 = 2131438943(0x7f0b2d5f, float:1.8499827E38)
            android.view.View r4 = r9.requireViewById(r4)
            X.0qQ.A07(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r8 = r4.inflate()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.ui.widget.stackedavatar.StackedAvatarView"
            X.0qQ.A0C(r8, r4)
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r8 = (com.instagram.ui.widget.stackedavatar.StackedAvatarView) r8
            if (r7 == 0) goto L_0x217f
            java.lang.String r4 = r7.A01
        L_0x2158:
            com.instagram.common.typedurl.SimpleImageUrl r7 = new com.instagram.common.typedurl.SimpleImageUrl
            r7.<init>(r4)
            r4 = r20
            X.0iw r5 = r4.A03
            r4 = r106
            r8.setUrls(r7, r4, r5)
            r4 = 2131438942(0x7f0b2d5e, float:1.8499825E38)
            android.view.View r5 = r9.requireViewById(r4)
            X.AMY r4 = new X.AMY
            r7 = r20
            r4.<init>(r7)
            X.AnonymousClass0fU.A00(r4, r5)
        L_0x2177:
            r4 = r106
            r0.A1A = r4
            r5 = r4
            r12 = r4
            goto L_0x0d2d
        L_0x217f:
            java.lang.String r4 = ""
            goto L_0x2158
        L_0x2182:
            X.9bv r4 = r1.A1B
            if (r4 == 0) goto L_0x2245
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r5 = r4.A00
            r4 = 2131437074(0x7f0b2612, float:1.8496036E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r66 = r4.inflate()
            X.0iw r7 = r1.A0O
            X.9bv r5 = r1.A1B
            X.AuJ r4 = new X.AuJ
            r4.<init>(r0)
            X.Aby r20 = new X.Aby
            r64 = r20
            r65 = r75
            r67 = r7
            r68 = r5
            r69 = r4
            r64.<init>(r65, r66, r67, r68, r69)
            r4 = r20
            android.view.View r5 = r4.A02
            android.content.res.Resources r7 = r5.getResources()
            r4 = 2131439022(0x7f0b2dae, float:1.8499987E38)
            android.view.View r4 = r5.requireViewById(r4)
            X.0qQ.A07(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r5 = r4.inflate()
            X.0qQ.A0A(r5)
            r4 = 2131165375(0x7f0700bf, float:1.7944965E38)
            int r4 = r7.getDimensionPixelSize(r4)
            X.0nA.A0e(r5, r4)
            r4 = r106
            r5.setBackground(r4)
            r4 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.view.View r9 = r5.requireViewById(r4)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4 = r20
            r4.A00 = r9
            java.lang.String r11 = "headerTitle"
            if (r9 == 0) goto L_0x3b21
            android.content.res.Resources r8 = r9.getResources()
            r7 = 2131968539(0x7f13421b, float:1.9573975E38)
            X.9bv r5 = r4.A04
            java.lang.String r4 = r5.A04
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r8.getString(r7, r4)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4, r6)
            r9.setText(r4)
            r4 = r20
            android.widget.TextView r7 = r4.A00
            if (r7 == 0) goto L_0x3b21
            r4 = 2147483647(0x7fffffff, float:NaN)
            r7.setMaxLines(r4)
            r4 = r20
            android.view.View r8 = r4.A01
            r4 = 2131437071(0x7f0b260f, float:1.849603E38)
            android.view.View r7 = r8.requireViewById(r4)
            X.0qQ.A07(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7
            com.instagram.common.typedurl.ImageUrl r5 = r5.A01
            if (r5 != 0) goto L_0x222b
            java.lang.String r4 = ""
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r4)
        L_0x222b:
            r4 = r20
            X.0iw r4 = r4.A03
            r7.setUrl(r5, r4)
            r4 = 2131437072(0x7f0b2610, float:1.8496032E38)
            android.view.View r5 = r8.requireViewById(r4)
            X.AMX r4 = new X.AMX
            r7 = r20
            r4.<init>(r7)
            X.AnonymousClass0fU.A00(r4, r5)
            goto L_0x2177
        L_0x2245:
            com.instagram.pendingmedia.model.recipients.PendingRecipient r4 = r1.A1S
            if (r4 == 0) goto L_0x2273
            r5 = 2131439022(0x7f0b2dae, float:1.8499987E38)
            r4 = r75
            android.view.View r5 = r4.requireViewById(r5)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            com.instagram.pendingmedia.model.recipients.PendingRecipient r4 = r1.A1S
            java.lang.String r4 = r4.A0C
            X.Abx r20 = new X.Abx
            r7 = r20
            r7.<init>(r5, r4)
            android.view.ViewStub r4 = r7.A01
            android.view.View r5 = r4.inflate()
            r7.A00 = r5
            java.lang.String r4 = "cameraHeader"
            if (r5 != 0) goto L_0x22f6
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x2273:
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r4 = r1.A0b
            if (r4 == 0) goto L_0x22b4
            r5 = 2131439022(0x7f0b2dae, float:1.8499987E38)
            r4 = r75
            android.view.View r9 = r4.requireViewById(r5)
            android.view.ViewStub r9 = (android.view.ViewStub) r9
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r5 = r4.A00
            r4 = 2131437307(0x7f0b26fb, float:1.8496509E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.A55 r8 = new X.A55
            r8.<init>(r1, r0)
            android.view.View r66 = r4.inflate()
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r7 = r1.A0b
            com.instagram.common.session.UserSession r5 = r0.A0R
            android.app.Activity r4 = r0.A09
            X.Ac0 r20 = new X.Ac0
            r64 = r20
            r65 = r4
            r67 = r9
            r68 = r5
            r69 = r7
            r70 = r8
            r64.<init>(r65, r66, r67, r68, r69, r70)
            r4 = r106
            r0.A1A = r4
            goto L_0x2320
        L_0x22b4:
            X.80D r4 = r0.A0v
            java.lang.Integer r5 = r4.A28
            java.lang.Integer r4 = X.AnonymousClass05K.A02
            if (r5 != r4) goto L_0x2324
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r5 = r4.A00
            r4 = 2131435774(0x7f0b20fe, float:1.84934E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r111 = r4.inflate()
            android.app.Activity r11 = r0.A09
            X.80U r9 = r0.A1f
            com.instagram.common.session.UserSession r8 = r0.A0R
            X.80D r4 = r0.A0v
            X.3sy r7 = r4.A1J
            com.instagram.model.direct.DirectThreadKey r7 = (com.instagram.model.direct.DirectThreadKey) r7
            java.lang.Integer r5 = r1.A27
            X.At3 r4 = new X.At3
            r4.<init>(r0)
            X.Ac1 r20 = new X.Ac1
            r109 = r20
            r110 = r11
            r112 = r37
            r113 = r8
            r114 = r9
            r115 = r7
            r116 = r5
            r117 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117)
            goto L_0x231c
        L_0x22f6:
            android.content.res.Resources r8 = r5.getResources()
            r4 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.view.View r7 = r5.requireViewById(r4)
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5 = 2131973589(0x7f1355d5, float:1.9584218E38)
            r4 = r20
            java.lang.String r4 = r4.A02
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r8.getString(r5, r4)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4, r6)
            r7.setText(r4)
        L_0x231c:
            r4 = r106
            r0.A1A = r4
        L_0x2320:
            r5 = r4
            r12 = r4
            goto L_0x0d2d
        L_0x2324:
            r4 = r106
            r0.A1A = r4
            r5 = r4
            r12 = r4
            goto L_0x0d2b
        L_0x232c:
            if (r3 == 0) goto L_0x0c5a
            X.82i r4 = r1.A18
            if (r4 == 0) goto L_0x0c5a
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r5 = r1.A0M
            X.0qQ.A07(r5)
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A07(r4)
            if (r24 == 0) goto L_0x3b29
            X.87i r51 = new X.87i
            r64 = r51
            r65 = r5
            r66 = r4
            r67 = r2
            r68 = r16
            r69 = r24
            r64.<init>(r65, r66, r67, r68, r69)
            goto L_0x0c7a
        L_0x2356:
            r24 = 0
            goto L_0x0c40
        L_0x235a:
            r13 = r106
            r12 = r13
            goto L_0x09ef
        L_0x235f:
            if (r4 == 0) goto L_0x236f
            X.1Xj r7 = r4.A03
            if (r7 == 0) goto L_0x236f
            boolean r5 = r7.CeS()
            r4 = r107
            if (r5 != r4) goto L_0x236f
            goto L_0x097e
        L_0x236f:
            if (r11 == 0) goto L_0x23a5
            java.lang.Integer r4 = r11.A0O
            if (r4 == 0) goto L_0x23a5
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r7 = r1.A0M
            X.0qQ.A07(r7)
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r4 = r1.A0M
            android.content.Context r55 = r4.requireContext()
            com.instagram.common.session.UserSession r5 = r1.A0S
            X.0qQ.A07(r5)
            X.AeO r4 = new X.AeO
            r4.<init>(r11)
            X.85r r27 = new X.85r
            r54 = r27
            r56 = r7
            r57 = r5
            r58 = r39
            r59 = r4
            r54.<init>(r55, r56, r57, r58, r59)
            goto L_0x09ac
        L_0x23a5:
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r7 = r1.A0M
            X.0qQ.A07(r7)
            X.4DH r4 = r1.A0M
            r4.getClass()
            X.4DH r4 = r1.A0M
            android.content.Context r55 = r4.requireContext()
            com.instagram.common.session.UserSession r5 = r1.A0S
            X.0qQ.A07(r5)
            X.85p r4 = new X.85p
            r4.<init>(r5)
            X.85r r27 = new X.85r
            r54 = r27
            r56 = r7
            r57 = r5
            r58 = r39
            r59 = r4
            r54.<init>(r55, r56, r57, r58, r59)
            goto L_0x09ac
        L_0x23d5:
            r11 = r106
            goto L_0x0974
        L_0x23d9:
            r7 = 0
            r5 = 0
            goto L_0x087e
        L_0x23dd:
            r4 = r106
            r0.A1L = r4
            goto L_0x08c7
        L_0x23e3:
            r4 = 0
            goto L_0x07b2
        L_0x23e6:
            java.lang.String r5 = r1.A2q
            r4 = r99
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x2404
            r4 = 2131431746(0x7f0b1142, float:1.848523E38)
            android.view.View r4 = r2.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x0774
            android.view.View r7 = r4.inflate()
            r4 = 2131431747(0x7f0b1143, float:1.8485232E38)
            goto L_0x0769
        L_0x2404:
            boolean r4 = r1.A3E
            if (r4 == 0) goto L_0x241c
            r4 = 2131428724(0x7f0b0574, float:1.84791E38)
            android.view.View r4 = r2.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x0774
            android.view.View r7 = r4.inflate()
            r4 = 2131428725(0x7f0b0575, float:1.8479103E38)
            goto L_0x0769
        L_0x241c:
            boolean r4 = r1.A3Z
            if (r4 == 0) goto L_0x2434
            r4 = 2131438050(0x7f0b29e2, float:1.8498016E38)
            android.view.View r4 = r2.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x0774
            android.view.View r7 = r4.inflate()
            r4 = 2131438051(0x7f0b29e3, float:1.8498018E38)
            goto L_0x0769
        L_0x2434:
            r4 = 2131431383(0x7f0b0fd7, float:1.8484494E38)
            goto L_0x0769
        L_0x2439:
            r5 = 2131429487(0x7f0b086f, float:1.8480648E38)
            android.view.View r4 = r4.requireViewById(r5)
            goto L_0x070c
        L_0x2442:
            r35 = 21
            X.GA1 r5 = new X.GA1
            r4 = r35
            r5.<init>(r4, r2, r10)
            X.842 r4 = new X.842
            r4.<init>(r5)
            goto L_0x06d1
        L_0x2452:
            int r4 = r7.A0I
            if (r4 > 0) goto L_0x2465
            X.0wj r12 = X.0wj.A01
            r11 = 817901646(0x30c0304e, float:1.3983568E-9)
            java.lang.String r7 = "9:16 view overlaps system windows but nav bar height"
            X.0f9 r7 = r12.AEf(r7, r11)
            java.lang.String r11 = "nav_bar_height"
            goto L_0x0689
        L_0x2465:
            X.WUV r18 = new X.WUV
            r30 = r18
            r31 = r12
            r32 = r11
            r34 = r14
            r30.<init>(r31, r32, r33, r34, r35)
            goto L_0x069b
        L_0x2474:
            r4 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r5 = r2.requireViewById(r4)
            goto L_0x0607
        L_0x247d:
            r5 = r7
            goto L_0x0509
        L_0x2480:
            r116 = 0
            goto L_0x0450
        L_0x2484:
            r4 = r19
            A01(r2, r4, r1, r10)
            goto L_0x02ef
        L_0x248b:
            android.app.Activity r5 = r1.A05
            com.instagram.common.session.UserSession r4 = r1.A0S
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r19 = X.C226132fh.A00(r5, r4)
            goto L_0x02e0
        L_0x2495:
            X.8aL[] r5 = new X.C358088aL[r6]
            r4 = r95
            com.instagram.creation.cameraconfiguration.CameraConfiguration r4 = X.C358098aM.A00(r4, r5)
            goto L_0x0246
        L_0x249f:
            X.4gw r8 = r7.A00
            if (r8 == 0) goto L_0x24ed
            X.DSI r8 = r8.BoA()
            if (r8 == 0) goto L_0x24ed
            java.util.List r8 = r8.CEY()
            if (r8 == 0) goto L_0x24ed
            java.util.ArrayList r10 = X.AnonymousClass3WQ.A00(r8)
            r8 = r106
            com.instagram.model.mediasize.VideoUrlImpl r8 = X.C255583uN.A01(r8, r10)
            if (r8 == 0) goto L_0x24ed
            java.lang.String r8 = r8.A06
            if (r8 == 0) goto L_0x24ed
            java.lang.String r111 = "ClipsTemplateReusableAssetViewModel"
            X.SFl r10 = new X.SFl
            r109 = r10
            r110 = r8
            r112 = r107
            r113 = r6
            r114 = r6
            r109.<init>(r110, r111, r112, r113, r114)
            android.app.Application r8 = r7.A01
            android.content.Context r11 = r8.getApplicationContext()
            com.instagram.common.session.UserSession r8 = r7.A02
            X.5g0 r11 = X.C59730JVo.A03(r11, r8, r10)
            X.9jW r8 = new X.9jW
            r8.<init>(r7)
            r11.A00 = r8
            r10 = 74275874(0x46d5c22, float:2.7901521E-36)
            r8 = r101
            r7 = r107
            X.1ES.A05(r11, r10, r8, r7, r6)
        L_0x24ed:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r4.A0L
            boolean r8 = r7.A0s()
            if (r8 == 0) goto L_0x3a67
            com.instagram.common.session.UserSession r7 = r4.A0K
            X.1E8 r7 = X.1E7.A00(r7)
            X.1Xj r8 = r7.A02(r12)
            if (r8 == 0) goto L_0x3a62
            boolean r7 = r4.A0H()
            if (r7 != 0) goto L_0x3a62
            boolean r7 = r4.A0I()
            if (r7 != 0) goto L_0x2513
            boolean r7 = r4.A0K()
            if (r7 == 0) goto L_0x3a62
        L_0x2513:
            X.87q r7 = r4.A0M
            r7.A03(r8)
            X.05G r8 = r4.A0R
            r7 = r98
            r8.Epw(r7)
            boolean r7 = r4.A0M()
            if (r7 == 0) goto L_0x3a5e
            X.883 r7 = X.AnonymousClass883.LANDING_PAGE_PLAYBACK
        L_0x2527:
            r13.Epw(r7)
            boolean r7 = r4.A0M()
            if (r7 == 0) goto L_0x2542
            X.6oS r11 = X.C318116oQ.A00(r4)
            X.MG6 r10 = new X.MG6
            r8 = r106
            r7 = r107
            r10.<init>(r4, r8, r7)
            r7 = r103
            X.1Eo.A05(r7, r10, r11)
        L_0x2542:
            X.6oS r10 = X.C318116oQ.A00(r4)
            X.9Ju r8 = new X.9Ju
            r7 = r106
            r8.<init>(r4, r7, r6)
            r4 = r103
            X.1Eo.A03(r9, r4, r8, r10)
        L_0x2552:
            java.lang.String r7 = r1.A2q
            r4 = r99
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x3a55
            X.8Ht r9 = new X.8Ht
            r9.<init>(r0)
            com.instagram.common.session.UserSession r4 = r0.A0R
            r47 = r4
            X.4DH r4 = r0.A0J
            r46 = r4
            r7 = 2131438156(0x7f0b2a4c, float:1.849823E38)
            r4 = r75
            android.view.View r4 = r4.requireViewById(r7)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.2eb r8 = new X.2eb
            r8.<init>(r4)
            X.80U r4 = r0.A1f
            r44 = r4
            X.8Yz r4 = r0.A0W
            r41 = r4
            X.81m r4 = r0.A1a
            r40 = r4
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            r38 = r4
            android.view.ViewGroup r4 = r0.A0C
            r37 = r4
            X.83s r4 = r0.A1X
            r35 = r4
            X.80x r4 = r0.A20
            r33 = r4
            X.823 r4 = r0.A0p
            r29 = r4
            X.848 r4 = r0.A0I
            r28 = r4
            X.84v r4 = r0.A1L
            r21 = r4
            X.4DH r10 = r0.A0J
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.0qQ.A0B(r4, r6)
            X.8Hu r7 = new X.8Hu
            r7.<init>(r4)
            X.2YN r4 = new X.2YN
            r4.<init>(r7, r10)
            java.lang.Class<X.8Hv> r7 = X.C353488Hv.class
            X.2YL r7 = r4.A00(r7)
            X.8Hv r7 = (X.C353488Hv) r7
            X.88F r4 = r0.A22
            r18 = r4
            X.82W r4 = r0.A0M
            X.82X r143 = r4.A00()
            X.50r r172 = r1.A0H()
            X.82p r15 = r0.A0o
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r13 = r0.A2B
            X.825 r12 = r0.A1q
            X.80D r4 = r0.A0v
            X.8ZN r11 = r4.A0C
            X.82t r10 = r0.A26
            X.8Hw r4 = new X.8Hw
            r135 = r4
            r136 = r37
            r137 = r75
            r138 = r11
            r139 = r55
            r140 = r78
            r141 = r28
            r142 = r46
            r144 = r47
            r145 = r8
            r146 = r41
            r147 = r51
            r148 = r38
            r149 = r90
            r150 = r66
            r151 = r80
            r152 = r15
            r153 = r29
            r154 = r14
            r155 = r59
            r156 = r32
            r157 = r1
            r158 = r9
            r159 = r76
            r160 = r84
            r161 = r57
            r162 = r21
            r163 = r35
            r164 = r40
            r165 = r17
            r166 = r44
            r167 = r81
            r168 = r82
            r169 = r26
            r170 = r7
            r171 = r36
            r173 = r12
            r174 = r70
            r175 = r33
            r176 = r18
            r177 = r10
            r178 = r13
            r135.<init>(r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178)
            r0.A1j = r4
        L_0x262f:
            r3.A0E = r4
            X.80N r7 = X.AnonymousClass80N.A00
            r8 = r66
            X.8Gi r8 = r8.A0m
            r195 = r8
            X.0yf r8 = r8.A0B
            r8.put(r7, r4)
            r4 = r67
            X.81C r10 = r4.A00
            X.81E r8 = r10.A00()
            X.8Dw r8 = (X.C352568Dw) r8
            X.8Hx r4 = r0.A1j
            r8.A7v(r7, r4)
            X.81E r9 = r10.A00()
            X.8Dw r9 = (X.C352568Dw) r9
            X.8jC r8 = X.C363138jC.A00
            X.8JV r7 = new X.8JV
            r4 = r80
            r7.<init>(r4)
            X.8JW r4 = new X.8JW
            r4.<init>(r7)
            r9.A7v(r8, r4)
            X.81E r8 = r10.A00()
            X.8Dw r8 = (X.C352568Dw) r8
            X.8JX r7 = new X.8JX
            r7.<init>()
            r4 = r19
            r8.A7v(r4, r7)
            X.81E r8 = r10.A00()
            X.8Dw r8 = (X.C352568Dw) r8
            X.80K r7 = X.AnonymousClass80K.A00
            r4 = r56
            r8.A7v(r7, r4)
            X.81E r8 = r10.A00()
            X.8Dw r8 = (X.C352568Dw) r8
            X.80g r40 = X.C3494080g.A00
            X.8JY r7 = new X.8JY
            r7.<init>()
            r4 = r40
            r8.A7v(r4, r7)
            com.instagram.common.session.UserSession r4 = r0.A0R
            r18 = r4
            android.app.Activity r10 = r0.A09
            android.view.ViewGroup r4 = r0.A0C
            r17 = r4
            X.4DH r15 = r0.A0J
            X.8Yz r14 = r0.A0W
            r4 = r10
            X.07g r4 = (X.AnonymousClass07g) r4
            X.2YN r7 = new X.2YN
            r7.<init>(r4)
            java.lang.Class<X.8JZ> r4 = X.AnonymousClass8JZ.class
            X.2YL r9 = r7.A00(r4)
            X.8JZ r9 = (X.AnonymousClass8JZ) r9
            X.8Ja r8 = new X.8Ja
            r4 = r96
            r8.<init>(r4)
            X.82W r13 = r0.A0M
            X.80U r12 = r0.A1f
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r11 = r0.A0i
            X.28D r7 = r0.A01
            X.82n r4 = r1.A12
            if (r4 == 0) goto L_0x26ca
            X.7zz r4 = r4.A00
            r153 = 1
            if (r4 != 0) goto L_0x26cc
        L_0x26ca:
            r153 = 0
        L_0x26cc:
            X.8Jb r55 = new X.8Jb
            r135 = r55
            r136 = r10
            r137 = r17
            r138 = r7
            r139 = r78
            r140 = r88
            r141 = r15
            r142 = r8
            r143 = r13
            r144 = r96
            r145 = r18
            r146 = r14
            r147 = r11
            r148 = r87
            r149 = r9
            r150 = r3
            r151 = r12
            r152 = r77
            r135.<init>(r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153)
            r4 = r55
            r0.A1Z = r4
            X.80U r11 = r0.A1f
            android.app.Activity r10 = r0.A09
            X.88F r9 = r0.A22
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r0.A0i
            com.instagram.common.session.UserSession r7 = r0.A0R
            r4 = r107
            X.0qQ.A0B(r10, r4)
            r4 = 5
            X.0qQ.A0B(r8, r4)
            r4 = 7
            X.0qQ.A0B(r7, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r9 == 0) goto L_0x271a
            r4.add(r9)
        L_0x271a:
            r4.add(r3)
            X.8Jc r9 = r94.A00()
            r4.add(r9)
            r57 = 4
            X.IoR r9 = new X.IoR
            r109 = r9
            r110 = r57
            r111 = r10
            r112 = r3
            r113 = r4
            r114 = r8
            r115 = r1
            r116 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115, r116)
            X.8Ji r44 = new X.8Ji
            r4 = r44
            r4.<init>(r11, r9)
            r0.A0Y = r4
            X.8Jk r7 = new X.8Jk
            r7.<init>(r0)
            X.6id[] r4 = new X.C314656id[r6]
            X.6if r17 = X.C314666ie.A00(r7, r4)
            r4 = r17
            r0.A1z = r4
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r4 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r4
            X.81W r4 = r4.A0K
            int r8 = r4.getWidth()
            boolean r4 = r1.A3t
            if (r4 == 0) goto L_0x3a51
            X.MgZ r7 = new X.MgZ
            r4 = r102
            r7.<init>(r8, r4)
            X.8Jp r19 = new X.8Jp
            r4 = r19
            r4.<init>(r7)
        L_0x276f:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r4 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r4
            X.81W r4 = r4.A0K
            int r8 = r4.getWidth()
            boolean r4 = r1.A3t
            if (r4 == 0) goto L_0x3a4d
            X.MgZ r7 = new X.MgZ
            r4 = r102
            r7.<init>(r8, r4)
            X.8Jp r18 = new X.8Jp
            r4 = r18
            r4.<init>(r7)
        L_0x278b:
            X.8Jq r4 = new X.8Jq
            r4.<init>(r0)
            X.0t0 r41 = X.AnonymousClass0eN.A01(r4)
            r4 = r41
            r0.A2D = r4
            X.80D r4 = r0.A0v
            r28 = r4
            X.8Jr r10 = new X.8Jr
            r10.<init>(r0)
            X.82p r4 = r0.A0o
            r26 = r4
            int r4 = r0.A08
            r21 = r4
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r15 = r0.A0i
            X.81T r14 = r0.A11
            X.8Js r9 = new X.8Js
            r9.<init>(r0)
            X.8Jt r8 = new X.8Jt
            r8.<init>(r0)
            X.8Ju r7 = new X.8Ju
            r7.<init>(r0)
            X.8Yz r13 = r0.A0W
            X.8DO r12 = r0.A1G
            X.82W r4 = r0.A0M
            X.82X r142 = r4.A00()
            X.8Hx r11 = r0.A1j
            X.8Jv r4 = new X.8Jv
            r4.<init>(r0)
            X.8Jw r141 = new X.8Jw
            r143 = r13
            r144 = r3
            r145 = r15
            r146 = r66
            r147 = r26
            r148 = r28
            r149 = r14
            r150 = r12
            r151 = r52
            r152 = r2
            r153 = r45
            r154 = r11
            r155 = r10
            r156 = r9
            r157 = r8
            r158 = r7
            r159 = r4
            r160 = r41
            r161 = r21
            r141.<init>(r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161)
            com.instagram.creation.capture.quickcapture.save.CachingVideoSaver r182 = new com.instagram.creation.capture.quickcapture.save.CachingVideoSaver
            r182.<init>()
            X.82p r4 = r0.A0o
            r29 = r4
            X.80U r4 = r0.A1f
            r28 = r4
            X.4DH r4 = r0.A0J
            r26 = r4
            android.app.Activity r4 = r0.A09
            r21 = r4
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r15 = r4.A00
            X.8K1 r9 = new X.8K1
            r9.<init>(r0)
            X.88F r14 = r0.A22
            X.846 r13 = r0.A1v
            com.instagram.common.session.UserSession r12 = r0.A0R
            X.84j r11 = r0.A1H
            boolean r10 = r1.A3W
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r0.A0i
            X.80x r7 = r0.A20
            X.8K2 r4 = new X.8K2
            r4.<init>(r0)
            X.8K4 r47 = new X.8K4
            r121 = r47
            r122 = r21
            r123 = r15
            r124 = r26
            r125 = r96
            r126 = r12
            r127 = r44
            r128 = r3
            r129 = r8
            r130 = r66
            r131 = r29
            r132 = r1
            r133 = r11
            r136 = r182
            r137 = r28
            r138 = r94
            r139 = r86
            r140 = r13
            r142 = r17
            r143 = r7
            r144 = r25
            r145 = r14
            r146 = r19
            r147 = r186
            r148 = r9
            r149 = r4
            r150 = r10
            r121.<init>(r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150)
            r4 = r47
            r0.A0c = r4
            X.82p r10 = r0.A0o
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r7 = r4.A00
            r4 = 2131437981(0x7f0b299d, float:1.8497876E38)
            android.view.View r8 = r7.requireViewById(r4)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r0.A0i
            X.8Kz r21 = new X.8Kz
            r4 = r21
            r4.<init>(r8, r9, r7, r10)
            com.instagram.common.session.UserSession r15 = r0.A0R
            android.app.Activity r4 = r0.A09
            android.content.Context r143 = r4.getApplicationContext()
            X.82p r14 = r0.A0o
            X.846 r13 = r0.A1v
            X.80U r12 = r0.A1f
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r11 = r0.A0T
            X.8Cl r4 = r3.A0O
            if (r4 == 0) goto L_0x3a49
            java.lang.String r155 = r4.A06()
        L_0x289a:
            boolean r10 = r1.A3W
            X.28D r9 = r0.A01
            java.lang.String r8 = r1.A2i
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            com.instagram.common.session.UserSession r7 = r0.A0R
            X.8KX r154 = X.AnonymousClass8KW.A00(r7)
            X.8L1 r46 = new X.8L1
            r142 = r46
            r144 = r9
            r145 = r15
            r146 = r11
            r147 = r44
            r148 = r4
            r149 = r14
            r150 = r12
            r151 = r13
            r152 = r141
            r153 = r17
            r156 = r8
            r157 = r10
            r142.<init>(r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157)
            r4 = r46
            r0.A0f = r4
            android.app.Activity r8 = r0.A09
            com.instagram.common.session.UserSession r7 = r0.A0R
            X.0qQ.A0B(r8, r6)
            r4 = r107
            X.0qQ.A0B(r7, r4)
            r9 = 2342173944297046873(0x208112cb00004359, double:4.074857903323569E-152)
            r4 = r108
            boolean r4 = X.182.A06(r4, r7, r9)
            r17 = 0
            if (r4 == 0) goto L_0x28ed
            X.8L4 r17 = new X.8L4
            r4 = r17
            r4.<init>(r8, r7)
        L_0x28ed:
            X.82p r4 = r0.A0o
            r77 = r4
            X.80U r4 = r0.A1f
            r37 = r4
            X.4DH r4 = r0.A0J
            r35 = r4
            android.app.Activity r4 = r0.A09
            r33 = r4
            android.view.ViewGroup r4 = r0.A0C
            r29 = r4
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r4 = r4.A00
            r28 = r4
            X.8LP r10 = new X.8LP
            r10.<init>(r0)
            X.8LQ r9 = new X.8LQ
            r9.<init>(r0)
            X.88F r4 = r0.A22
            r26 = r4
            r4 = r27
            X.85u r4 = r4.A01
            r25 = r4
            com.instagram.common.session.UserSession r15 = r0.A0R
            X.84j r14 = r0.A1H
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r13 = r0.A0i
            X.8Yz r12 = r0.A0W
            X.80x r11 = r0.A20
            X.50r r184 = r1.A0H()
            X.8LR r8 = new X.8LR
            r8.<init>(r0)
            X.8LS r7 = new X.8LS
            r7.<init>(r0)
            X.8LT r4 = new X.8LT
            r4.<init>(r0)
            X.8LU r38 = new X.8LU
            r156 = r38
            r157 = r33
            r158 = r29
            r159 = r28
            r160 = r35
            r161 = r96
            r162 = r4
            r163 = r15
            r164 = r12
            r165 = r51
            r166 = r44
            r167 = r3
            r168 = r46
            r169 = r79
            r170 = r13
            r171 = r90
            r172 = r77
            r173 = r1
            r174 = r8
            r175 = r9
            r176 = r14
            r177 = r21
            r178 = r134
            r180 = r25
            r181 = r55
            r183 = r37
            r185 = r94
            r186 = r11
            r187 = r26
            r188 = r18
            r189 = r17
            r190 = r10
            r191 = r7
            r156.<init>(r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191)
            r4 = r38
            r0.A0g = r4
            android.app.Activity r13 = r0.A09
            com.instagram.common.session.UserSession r12 = r0.A0R
            X.82p r11 = r0.A0o
            X.85o r10 = r0.A0k
            X.8MB r9 = new X.8MB
            r9.<init>(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r0.A0i
            X.28D r7 = r0.A01
            X.50r r132 = r1.A0H()
            X.8Yz r4 = r0.A0W
            X.8MC r37 = new X.8MC
            r120 = r37
            r121 = r13
            r122 = r7
            r123 = r12
            r124 = r4
            r125 = r3
            r126 = r8
            r127 = r10
            r128 = r11
            r129 = r9
            r130 = r21
            r131 = r38
            r133 = r94
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133)
            r4 = r37
            r0.A0h = r4
            android.app.Activity r11 = r0.A09
            X.4DH r10 = r0.A0J
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.81m r8 = r0.A1a
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r0.A0i
            X.80x r4 = r0.A20
            X.8PZ r160 = new X.8PZ
            r109 = r160
            r110 = r11
            r111 = r75
            r112 = r10
            r113 = r9
            r114 = r7
            r115 = r32
            r116 = r105
            r117 = r8
            r118 = r4
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118)
            X.82p r10 = r0.A0o
            X.4DH r4 = r0.A0J
            androidx.fragment.app.FragmentActivity r143 = r4.requireActivity()
            com.instagram.common.session.UserSession r9 = r0.A0R
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r0.A0i
            X.85o r7 = r0.A0k
            r158 = 0
            if (r60 == 0) goto L_0x29f6
            r158 = 1
        L_0x29f6:
            X.81T r4 = r0.A11
            java.lang.String r157 = r4.getModuleName()
            java.lang.Integer r4 = r1.A27
            X.8QA r35 = new X.8QA
            r142 = r35
            r144 = r9
            r145 = r44
            r146 = r47
            r147 = r3
            r148 = r38
            r149 = r37
            r150 = r8
            r151 = r7
            r152 = r10
            r153 = r21
            r154 = r74
            r155 = r16
            r156 = r4
            r142.<init>(r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158)
            r4 = r35
            r0.A0a = r4
            X.82p r13 = r0.A0o
            X.8Yz r12 = r0.A0W
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r11 = r0.A1n
            X.8Hx r10 = r0.A1j
            X.8DO r9 = r0.A1G
            X.82W r8 = r0.A0M
            X.81T r7 = r0.A11
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            X.8QG r33 = new X.8QG
            r161 = r33
            r162 = r8
            r163 = r12
            r164 = r44
            r165 = r35
            r166 = r47
            r168 = r38
            r169 = r37
            r170 = r4
            r171 = r66
            r172 = r13
            r174 = r7
            r175 = r9
            r176 = r55
            r177 = r10
            r178 = r11
            r179 = r42
            r180 = r70
            r181 = r31
            r161.<init>(r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181)
            r4 = r33
            r0.A15 = r4
            X.88A r9 = r0.A1A
            if (r9 == 0) goto L_0x2a8e
            X.82p r11 = r0.A0o
            X.80U r10 = r0.A1f
            android.view.View r8 = r0.A0B
            X.9Ph r7 = new X.9Ph
            r7.<init>(r0)
            X.9Pg r4 = new X.9Pg
            r120 = r4
            r121 = r8
            r122 = r35
            r123 = r47
            r124 = r3
            r125 = r38
            r126 = r11
            r127 = r1
            r128 = r10
            r129 = r70
            r130 = r7
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130)
            r9.A01 = r4
        L_0x2a8e:
            X.8QH r4 = new X.8QH
            r4.<init>(r0)
            r7 = r38
            java.util.List r7 = r7.A11
            r7.add(r4)
            r4 = r51
            X.87o r4 = r4.A0Q
            r7.add(r4)
            r7 = r71
            r4 = r38
            r7.A06(r4)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A1n
            X.8QI r4 = new X.8QI
            r4.<init>(r0)
            r7.A01 = r4
            X.82p r4 = r0.A0o
            r28 = r4
            X.80U r4 = r0.A1f
            r27 = r4
            X.81T r4 = r0.A11
            r26 = r4
            X.842 r4 = r0.A1Y
            android.view.ViewGroup r4 = r4.A00
            r25 = r4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r0.A2B
            r16 = r4
            X.8QJ r9 = new X.8QJ
            r9.<init>(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r15 = r0.A0i
            X.28D r14 = r0.A01
            X.80x r13 = r0.A20
            android.view.View r12 = r0.A0B
            X.8QK r8 = new X.8QK
            r8.<init>(r0)
            int r11 = r0.A08
            X.8QL r7 = new X.8QL
            r7.<init>(r0)
            java.util.Map r10 = r0.A2C
            X.8QM r4 = new X.8QM
            r4.<init>(r0)
            X.8QN r31 = new X.8QN
            r161 = r31
            r162 = r25
            r163 = r12
            r164 = r14
            r165 = r26
            r166 = r30
            r167 = r35
            r168 = r47
            r169 = r3
            r170 = r38
            r171 = r15
            r172 = r66
            r173 = r28
            r174 = r92
            r175 = r1
            r176 = r33
            r177 = r134
            r178 = r182
            r179 = r27
            r180 = r141
            r181 = r13
            r182 = r16
            r183 = r4
            r184 = r10
            r185 = r9
            r186 = r8
            r187 = r7
            r188 = r11
            r161.<init>(r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188)
            r4 = r31
            r0.A0b = r4
            X.4DH r8 = r0.A0J
            X.8R6 r7 = new X.8R6
            r7.<init>(r0)
            r4 = r64
            r4.A06(r8, r7)
            X.80U r11 = r0.A1f
            android.app.Activity r12 = r0.A09
            com.instagram.common.session.UserSession r10 = r0.A0R
            r4 = r101
            X.0qQ.A0B(r12, r4)
            r4 = r102
            X.0qQ.A0B(r10, r4)
            boolean r4 = r1.A3q
            if (r4 == 0) goto L_0x3a46
            r9 = 18
            X.AwZ r8 = new X.AwZ
            r7 = r47
            r4 = r21
            r8.<init>(r9, r12, r7, r4)
            X.8R7 r9 = new X.8R7
            r9.<init>(r10, r11, r8)
        L_0x2b58:
            com.instagram.common.session.UserSession r8 = r0.A0R
            X.80x r7 = r0.A20
            X.4DH r4 = r0.A0J
            com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController r29 = new com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController
            r188 = r29
            r189 = r85
            r190 = r4
            r191 = r8
            r193 = r3
            r194 = r7
            r188.<init>(r189, r190, r191, r192, r193, r194)
            r4 = r29
            r0.A29 = r4
            com.instagram.common.session.UserSession r4 = r0.A0R
            r28 = r4
            X.80U r4 = r0.A1f
            r26 = r4
            X.4DH r4 = r0.A0J
            r25 = r4
            X.82p r4 = r0.A0o
            r21 = r4
            X.8RA r10 = new X.8RA
            r10.<init>(r0)
            X.80x r4 = r0.A20
            r16 = r4
            X.8Yz r15 = r0.A0W
            X.8RB r8 = new X.8RB
            r8.<init>(r0)
            X.50r r137 = r1.A0H()
            if (r53 == 0) goto L_0x3a40
            r4 = r53
            boolean r7 = r4.A0G
            X.4gw r14 = r4.A04
            X.293 r13 = r4.A01
        L_0x2ba1:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12 = r0.A0i
            boolean r4 = X.AnonymousClass8IK.A05(r28)
            if (r4 != 0) goto L_0x3a3c
            com.instagram.common.session.UserSession r4 = r0.A0R
            boolean r4 = X.AnonymousClass8IK.A01(r4)
            if (r4 != 0) goto L_0x3a3c
            r11 = r106
        L_0x2bb3:
            java.lang.String r4 = r1.A2c
            r143 = 0
            if (r4 == 0) goto L_0x2bbb
            r143 = 1
        L_0x2bbb:
            X.82n r4 = r1.A12
            if (r4 == 0) goto L_0x2bc5
            X.7zz r4 = r4.A00
            r144 = 1
            if (r4 != 0) goto L_0x2bc7
        L_0x2bc5:
            r144 = 0
        L_0x2bc7:
            android.view.ViewGroup r4 = r0.A0C
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r27 = new com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController
            r120 = r27
            r121 = r85
            r122 = r4
            r123 = r25
            r124 = r13
            r125 = r14
            r126 = r28
            r127 = r69
            r128 = r15
            r129 = r12
            r130 = r21
            r131 = r10
            r132 = r9
            r133 = r26
            r134 = r68
            r135 = r36
            r136 = r42
            r138 = r16
            r139 = r11
            r140 = r70
            r141 = r8
            r142 = r7
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144)
            r4 = r27
            r0.A1k = r4
            X.80C r4 = r1.A0t
            X.2jd r7 = r4.A00
            r4 = r27
            r7.A0E(r4)
            r4.A06 = r3
            android.app.Activity r13 = r0.A09
            X.8Yz r12 = r0.A0W
            X.80U r11 = r0.A1f
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r10 = r0.A0U
            X.81m r8 = r0.A1a
            boolean r7 = r1.A3t
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.8Ru r28 = new X.8Ru
            r120 = r28
            r121 = r13
            r122 = r4
            r123 = r10
            r124 = r12
            r125 = r3
            r126 = r66
            r127 = r67
            r128 = r92
            r129 = r9
            r130 = r8
            r131 = r11
            r132 = r94
            r133 = r7
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133)
            r4 = r28
            r0.A1P = r4
            android.app.Activity r4 = r0.A09
            r25 = r4
            X.80U r4 = r0.A1f
            r21 = r4
            com.instagram.common.session.UserSession r4 = r0.A0R
            r16 = r4
            X.8Yz r15 = r0.A0W
            X.81m r14 = r0.A1a
            X.85X r13 = r0.A0n
            X.8Hx r12 = r0.A1j
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r11 = r0.A2B
            X.81i r10 = r0.A1Q
            X.8DD r9 = r0.A1I
            boolean r8 = r1.A3k
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r7 = r0.A0U
            r4 = 2131439023(0x7f0b2daf, float:1.849999E38)
            android.view.View r122 = r7.requireViewById(r4)
            X.86W r7 = r0.A0H
            X.86c r4 = r0.A0G
            boolean r145 = r0.A05()
            X.8Rz r26 = new X.8Rz
            r120 = r26
            r121 = r25
            r123 = r4
            r124 = r7
            r125 = r16
            r126 = r15
            r127 = r3
            r128 = r66
            r129 = r67
            r130 = r13
            r131 = r92
            r132 = r1
            r133 = r76
            r134 = r9
            r135 = r62
            r136 = r10
            r137 = r74
            r138 = r14
            r139 = r22
            r140 = r21
            r141 = r12
            r142 = r94
            r143 = r11
            r144 = r8
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145)
            r4 = r26
            r0.A0d = r4
            r7 = r71
            r7.A06(r4)
            r7 = r196
            r7.add(r4)
            X.82p r4 = r0.A0o
            r78 = r4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r0.A2B
            X.85X r7 = r0.A0n
            X.8Yz r4 = r0.A0W
            r77 = r4
            X.80U r4 = r0.A1f
            r71 = r4
            X.8S4 r4 = new X.8S4
            r109 = r4
            r110 = r77
            r111 = r35
            r112 = r26
            r113 = r3
            r114 = r7
            r115 = r78
            r116 = r71
            r117 = r94
            r118 = r8
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118)
            X.86x r7 = r0.A0s
            r7.A01 = r4
            r7 = r93
            r7.A01 = r4
            X.4DH r4 = r0.A0J
            r69 = r4
            com.instagram.common.session.UserSession r4 = r0.A0R
            r68 = r4
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r12 = r0.A0U
            android.app.Activity r4 = r0.A09
            r64 = r4
            X.8Hx r4 = r0.A1j
            r60 = r4
            X.847 r4 = r0.A0L
            r30 = r4
            X.88F r4 = r0.A22
            r21 = r4
            X.88A r4 = r0.A1A
            r16 = r4
            r155 = 0
            if (r2 == 0) goto L_0x2d01
            r155 = 1
        L_0x2d01:
            r4 = 2131443763(0x7f0b4033, float:1.8509603E38)
            android.view.View r11 = r12.requireViewById(r4)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r15 = r0.A2B
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r7 = r0.A0U
            r4 = 2131438071(0x7f0b29f7, float:1.8498059E38)
            android.view.View r10 = r7.requireViewById(r4)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r7 = r0.A0U
            r4 = 2131437969(0x7f0b2991, float:1.8497852E38)
            android.view.View r9 = r7.requireViewById(r4)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r14 = r0.A08
            X.84j r13 = r0.A1H
            X.86x r8 = r0.A0s
            X.82W r7 = r0.A0M
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            X.8S5 r25 = new X.8S5
            r109 = r25
            r110 = r64
            r111 = r12
            r112 = r11
            r113 = r10
            r114 = r9
            r115 = r69
            r116 = r30
            r117 = r7
            r118 = r68
            r120 = r77
            r121 = r51
            r122 = r35
            r123 = r31
            r124 = r47
            r125 = r26
            r126 = r3
            r127 = r38
            r128 = r4
            r129 = r24
            r130 = r66
            r131 = r78
            r132 = r8
            r133 = r16
            r134 = r65
            r135 = r13
            r136 = r62
            r138 = r48
            r139 = r55
            r140 = r54
            r141 = r52
            r142 = r49
            r143 = r50
            r144 = r22
            r145 = r71
            r146 = r60
            r147 = r94
            r148 = r61
            r149 = r70
            r150 = r21
            r151 = r43
            r152 = r56
            r153 = r15
            r154 = r14
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155)
            r4 = r25
            r0.A0Z = r4
            X.81T r4 = r0.A11
            r7 = r25
            r4.A00 = r7
            r4 = r26
            X.B1P[] r9 = new X.B1P[]{r4, r3}
            r8 = 0
        L_0x2d9a:
            r7 = r9[r8]
            X.0qQ.A0B(r7, r6)
            r4 = r25
            java.util.Set r4 = r4.A0k
            r170 = r4
            r4.add(r7)
            int r8 = r8 + 1
            r4 = r101
            if (r8 < r4) goto L_0x2d9a
            X.B1P r7 = r1.A0q
            if (r7 == 0) goto L_0x2db7
            r4 = r170
            r4.add(r7)
        L_0x2db7:
            X.8DD r7 = r0.A1I
            if (r7 == 0) goto L_0x2dcc
            r4 = r66
            r7.A05 = r4
            r4 = r26
            r7.A03 = r4
            X.8DM r4 = r7.A0O
            if (r4 == 0) goto L_0x3a71
            r5 = r26
            r4.EpC(r5)
        L_0x2dcc:
            X.80U r9 = r0.A1f
            X.84E r4 = r0.A0N
            r87 = 0
            if (r4 == 0) goto L_0x2dd6
            r87 = 1
        L_0x2dd6:
            boolean r11 = r1.A3y
            boolean r8 = r1.A43
            com.instagram.common.session.UserSession r4 = r0.A0R
            boolean r90 = X.AnonymousClass8IK.A05(r4)
            java.lang.Boolean r4 = r1.A22
            boolean r91 = r4.booleanValue()
            com.instagram.common.session.UserSession r10 = r0.A0R
            X.0qQ.A0B(r10, r6)
            r4 = 36326030230762970(0x810e55000135da, double:3.0360660188929835E-306)
            r7 = r100
            boolean r92 = X.182.A06(r7, r10, r4)
            X.80T r9 = (X.AnonymousClass80T) r9
            X.80W r4 = r9.A01
            r88 = r11
            r89 = r8
            r86 = r4
            X.AnonymousClass8S9.A01(r86, r87, r88, r89, r90, r91, r92)
            X.80W r4 = r9.A02
            X.AnonymousClass8S9.A00(r4)
            X.0xa r4 = X.AnonymousClass8VQ.A00
            if (r4 != 0) goto L_0x2e14
            java.lang.String r4 = "GalleryMetadataPreferences"
            X.0tX r4 = X.0xn.A01(r4)
            X.AnonymousClass8VQ.A00 = r4
        L_0x2e14:
            com.instagram.common.session.UserSession r4 = r0.A0R
            X.8VS r5 = X.AnonymousClass8VR.A00(r4)
            r4 = r106
            r5.A00 = r4
            com.instagram.common.session.UserSession r5 = r5.A01
            java.lang.Class<X.8VS> r4 = X.AnonymousClass8VS.class
            r5.A03(r4)
            X.4DH r4 = r0.A0J
            android.content.Context r4 = r4.requireContext()
            android.content.res.Resources r7 = r4.getResources()
            r4 = 2131165286(0x7f070066, float:1.7944785E38)
            int r168 = r7.getDimensionPixelSize(r4)
            r4 = 2131165288(0x7f070068, float:1.7944789E38)
            int r167 = r7.getDimensionPixelSize(r4)
            X.8VU r5 = new X.8VU
            r5.<init>(r0)
            r0.A0Q = r5
            X.2k2 r4 = r1.A0R
            r4.A00(r5)
            X.82p r4 = r0.A0o
            X.82o r5 = r4.A02
            java.lang.String r8 = r1.A2q
            r4 = r99
            boolean r4 = r4.equals(r8)
            X.82Y r9 = r5.A01
            r9.A0S = r4
            boolean r4 = r1.A3m
            r9.A0T = r4
            boolean r4 = r1.A3Z
            r9.A0R = r4
            com.instagram.model.direct.camera.DirectCameraViewModel r4 = r1.A1I
            if (r4 == 0) goto L_0x2e6c
            int r8 = r4.A00
            r5 = 9
            r4 = 1
            if (r8 == r5) goto L_0x2e6d
        L_0x2e6c:
            r4 = 0
        L_0x2e6d:
            r9.A0M = r4
            X.823 r4 = r0.A0p
            if (r4 == 0) goto L_0x2ea4
            com.instagram.common.session.UserSession r10 = r0.A0R
            X.8VV r9 = new X.8VV
            r9.<init>(r7, r4, r0)
            X.0qQ.A0B(r10, r6)
            r4 = -2
            X.1NY r8 = new X.1NY
            r8.<init>(r10, r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r8.A08(r4)
            java.lang.String r4 = "creatives/get_unlockable_sticker_nux/"
            r8.A0A(r4)
            java.lang.Class<X.8VW> r7 = X.AnonymousClass8VW.class
            java.lang.Class<X.8VX> r5 = X.AnonymousClass8VX.class
            r4 = r106
            r8.A0O(r4, r7, r5, r6)
            X.1OC r5 = r8.A0M()
            X.8VY r4 = new X.8VY
            r4.<init>(r9, r10)
            r5.A00 = r4
            X.1ES.A03(r5)
        L_0x2ea4:
            X.81T r14 = r0.A11
            X.82W r13 = r0.A0M
            X.8DO r11 = r0.A1G
            X.8Yz r10 = r0.A0W
            X.80U r12 = r0.A1f
            X.80x r9 = r0.A20
            X.82p r8 = r0.A0o
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A1n
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0i
            r5 = r102
            X.0qQ.A0B(r11, r5)
            r5 = 5
            X.0qQ.A0B(r10, r5)
            r5 = 8
            X.0qQ.A0B(r9, r5)
            r5 = 11
            X.0qQ.A0B(r7, r5)
            r5 = 12
            X.0qQ.A0B(r4, r5)
            X.8VZ r5 = new X.8VZ
            r86 = r5
            r87 = r13
            r88 = r14
            r89 = r10
            r90 = r31
            r91 = r47
            r92 = r4
            r93 = r66
            r94 = r8
            r95 = r1
            r96 = r11
            r97 = r74
            r98 = r12
            r99 = r7
            r100 = r9
            r86.<init>(r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100)
            r0.A14 = r5
            X.8Va r7 = new X.8Va
            r7.<init>(r5)
            r4 = r52
            r4.A02 = r7
            X.8Vb r7 = new X.8Vb
            r7.<init>(r5)
            r4 = r50
            r4.A01 = r7
            X.8Vc r7 = new X.8Vc
            r7.<init>(r5)
            r4 = r49
            r4.A01 = r7
            X.8Vd r7 = new X.8Vd
            r7.<init>(r5)
            r4 = r48
            r4.A01 = r7
            X.8Ve r7 = new X.8Ve
            r7.<init>(r5)
            r4 = r54
            r4.A01 = r7
            X.8Ve r7 = new X.8Ve
            r7.<init>(r5)
            r4.A01 = r7
            X.80U r10 = r0.A1f
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.82W r11 = r0.A0M
            X.8DO r8 = r0.A1G
            X.81T r4 = r0.A11
            java.lang.String r92 = r4.getModuleName()
            X.8Yz r7 = r0.A0W
            r4 = r107
            X.0qQ.A0B(r9, r4)
            r4 = r57
            X.0qQ.A0B(r8, r4)
            r4 = 6
            X.0qQ.A0B(r7, r4)
            X.Pls r4 = new X.Pls
            r86 = r4
            r87 = r66
            r88 = r7
            r89 = r8
            r90 = r11
            r91 = r9
            r93 = r101
            r86.<init>(r87, r88, r89, r90, r91, r92, r93)
            X.8Vf r16 = new X.8Vf
            r7 = r16
            r7.<init>(r10, r4)
            X.80U r10 = r0.A1f
            X.85o r8 = r0.A0k
            X.814 r4 = r0.A0w
            r84 = r4
            X.8Vg r21 = new X.8Vg
            r7 = r21
            r7.<init>(r8, r1, r4, r10)
            r0.A17 = r7
            X.4DH r4 = r0.A0J
            r82 = r4
            X.81e r4 = r0.A0y
            r81 = r4
            X.81T r4 = r0.A11
            r80 = r4
            X.82W r4 = r0.A0M
            r79 = r4
            X.8Yz r4 = r0.A0W
            r78 = r4
            X.8Hx r4 = r0.A1j
            r77 = r4
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r4 = r0.A0U
            r71 = r4
            android.view.ViewGroup r15 = r0.A0C
            X.85X r4 = r0.A0n
            r70 = r4
            X.88F r4 = r0.A22
            r69 = r4
            X.889 r4 = r0.A23
            r68 = r4
            X.848 r14 = r0.A0I
            X.8DO r13 = r0.A1G
            X.3E6 r4 = r0.A0S
            r64 = r4
            X.82p r4 = r0.A0o
            r60 = r4
            X.84v r4 = r0.A1L
            r51 = r4
            X.84E r4 = r0.A0N
            r30 = r4
            X.86Y r4 = r0.A1K
            r24 = r4
            X.86W r4 = r0.A0H
            r22 = r4
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12 = r0.A0i
            X.8Vh r9 = new X.8Vh
            r9.<init>(r0)
            X.8Vi r8 = new X.8Vi
            r8.<init>(r0)
            X.8Vj r7 = new X.8Vj
            r7.<init>(r0)
            r11 = r82
            r4 = r102
            X.0qQ.A0B(r11, r4)
            r11 = 9
            r4 = r78
            X.0qQ.A0B(r4, r11)
            r11 = 12
            r4 = r71
            X.0qQ.A0B(r4, r11)
            r4 = 13
            X.0qQ.A0B(r15, r4)
            r4 = 22
            X.0qQ.A0B(r14, r4)
            r4 = 23
            X.0qQ.A0B(r13, r4)
            r4 = 34
            X.0qQ.A0B(r12, r4)
            X.8Vk r4 = new X.8Vk
            r120 = r4
            r121 = r71
            r122 = r15
            r123 = r22
            r124 = r14
            r125 = r82
            r126 = r79
            r127 = r30
            r128 = r80
            r129 = r64
            r130 = r78
            r131 = r47
            r132 = r3
            r133 = r16
            r134 = r12
            r135 = r66
            r136 = r70
            r137 = r60
            r138 = r59
            r139 = r1
            r140 = r84
            r141 = r81
            r142 = r5
            r143 = r13
            r144 = r24
            r145 = r51
            r146 = r28
            r147 = r39
            r148 = r34
            r149 = r10
            r150 = r2
            r151 = r77
            r152 = r61
            r153 = r69
            r154 = r68
            r155 = r9
            r156 = r8
            r157 = r7
            r158 = r41
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158)
            X.8Vl r16 = new X.8Vl
            r7 = r16
            r7.<init>(r10, r4)
            r0.A18 = r7
            X.81m r4 = r0.A1a
            r60 = r4
            X.8Hx r4 = r0.A1j
            r59 = r4
            X.86x r4 = r0.A0s
            r51 = r4
            X.4DH r9 = r0.A0J
            X.80U r8 = r0.A1f
            X.82p r4 = r0.A0o
            X.82o r7 = r4.A02
            X.8Vr r4 = new X.8Vr
            r4.<init>(r0)
            X.8Vs r11 = new X.8Vs
            r11.<init>(r9, r7, r4, r8)
            X.81e r4 = r0.A0y
            r30 = r4
            X.84E r4 = r0.A0N
            r24 = r4
            X.80U r4 = r0.A1f
            r22 = r4
            X.82p r15 = r0.A0o
            X.8Yz r14 = r0.A0W
            X.88F r13 = r0.A22
            X.87i r12 = r0.A0X
            X.85X r10 = r0.A0n
            X.8DD r9 = r0.A1I
            X.88B r8 = r0.A24
            X.8W5 r7 = new X.8W5
            r7.<init>(r0)
            X.8W6 r4 = new X.8W6
            r120 = r4
            r121 = r24
            r122 = r14
            r123 = r12
            r124 = r25
            r125 = r35
            r126 = r31
            r127 = r47
            r128 = r26
            r129 = r3
            r130 = r66
            r131 = r10
            r132 = r15
            r133 = r32
            r134 = r51
            r135 = r1
            r136 = r7
            r137 = r30
            r138 = r5
            r139 = r16
            r140 = r76
            r141 = r9
            r142 = r62
            r143 = r11
            r144 = r39
            r145 = r34
            r146 = r74
            r147 = r48
            r148 = r54
            r149 = r60
            r150 = r52
            r151 = r49
            r152 = r50
            r153 = r22
            r154 = r59
            r155 = r160
            r156 = r13
            r157 = r8
            r158 = r43
            r159 = r56
            r120.<init>(r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159)
            r0.A0m = r4
            r7 = r66
            r7.A0B = r4
            r7 = r195
            r7.A04 = r4
            r7 = r56
            r7.A01 = r4
            X.82p r10 = r0.A0o
            X.80U r13 = r0.A1f
            com.instagram.reels.prompt.model.PromptStickerModel r9 = r1.A1h
            r8 = r107
            r7 = r43
            r7.A08 = r8
            r7.A02 = r10
            r7.A04 = r13
            r7.A01 = r4
            r7.A06 = r9
            r7.A00 = r3
            r7.A03 = r3
            X.82o r7 = r10.A02
            r8 = r102
            X.0qQ.A0B(r7, r8)
            X.8W7 r9 = new X.8W7
            r9.<init>(r3, r4, r7, r5)
            com.instagram.common.session.UserSession r8 = r0.A0R
            X.4DH r7 = r0.A0J
            r10 = r101
            X.0qQ.A0B(r8, r10)
            r10 = r102
            X.0qQ.A0B(r7, r10)
            java.lang.Integer r78 = X.AnonymousClass05K.A00
            X.8W8 r79 = X.AnonymousClass8W8.A00
            r10 = 26
            X.AwZ r12 = new X.AwZ
            r12.<init>(r10, r9, r8, r7)
            r10 = 27
            X.AwZ r11 = new X.AwZ
            r11.<init>(r10, r9, r8, r7)
            X.81C r76 = new X.81C
            r77 = r13
            r80 = r12
            r81 = r11
            r82 = r107
            r76.<init>(r77, r78, r79, r80, r81, r82)
            X.80D r9 = r0.A0v
            java.lang.Integer r8 = r9.A28
            java.lang.Integer r7 = X.AnonymousClass05K.A02
            if (r8 != r7) goto L_0x3a38
            android.view.ViewGroup r12 = r0.A0C
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r7 = r0.A0U
            android.content.Context r8 = r7.getContext()
            android.app.Activity r11 = r0.A09
            com.instagram.common.session.UserSession r7 = r0.A0R
            X.2jA r10 = new X.2jA
            r10.<init>()
            X.JY0 r100 = X.JYB.A00(r8, r7, r10)
            X.4DH r10 = r0.A0J
            X.07Z r91 = r10.getViewLifecycleOwner()
            com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController r22 = new com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController
            r86 = r22
            r87 = r11
            r88 = r8
            r89 = r12
            r90 = r85
            r92 = r7
            r93 = r25
            r94 = r35
            r95 = r47
            r96 = r3
            r97 = r9
            r98 = r20
            r99 = r20
            r86.<init>(r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100)
        L_0x317f:
            r7 = r22
            r0.A13 = r7
            X.81i r7 = r0.A1Q
            r7.A04(r4)
            com.instagram.common.session.UserSession r13 = r0.A0R
            X.86x r12 = r0.A0s
            X.82p r11 = r0.A0o
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r0.A2B
            X.80U r9 = r0.A1f
            r97 = 0
            if (r2 == 0) goto L_0x3198
            r97 = 1
        L_0x3198:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r8 = r0.A0U
            r7 = 2131439035(0x7f0b2dbb, float:1.8500014E38)
            android.view.View r85 = r8.requireViewById(r7)
            X.88F r8 = r0.A22
            X.8WF r7 = new X.8WF
            r84 = r7
            r86 = r13
            r87 = r63
            r88 = r26
            r89 = r3
            r90 = r66
            r91 = r11
            r92 = r32
            r93 = r12
            r94 = r9
            r95 = r8
            r96 = r10
            r84.<init>(r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97)
            X.87h r8 = r0.A1r
            X.8Jc r8 = r8.A00()
            r8.A0C = r7
            r7 = r28
            java.util.Set r7 = r7.A0T
            r169 = r7
            r7.add(r3)
            X.88F r9 = r0.A22
            if (r9 == 0) goto L_0x31f3
            X.Ac5 r8 = new X.Ac5
            r7 = r63
            r8.<init>(r7, r0)
            java.util.HashSet r7 = r9.A0S
            r7.add(r8)
            X.88F r8 = r0.A22
            X.0qQ.A0B(r8, r6)
            r7 = r169
            r7.add(r8)
            X.AVM r8 = r0.A05
            if (r8 == 0) goto L_0x31f3
            r7 = r66
            r8.A01 = r7
        L_0x31f3:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r7 = r0.A0U
            android.content.Context r13 = r7.getContext()
            android.app.Activity r12 = r0.A09
            com.instagram.common.session.UserSession r11 = r0.A0R
            X.80U r10 = r0.A1f
            X.82p r14 = r0.A0o
            X.842 r7 = r0.A1Y
            android.view.ViewGroup r8 = r7.A00
            r7 = 2131435242(0x7f0b1eea, float:1.849232E38)
            android.view.View r7 = r8.requireViewById(r7)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            X.2eb r9 = new X.2eb
            r9.<init>(r7)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r0.A0i
            X.0qQ.A0B(r13, r6)
            r7 = r107
            X.0qQ.A0B(r12, r7)
            r7 = r101
            X.0qQ.A0B(r11, r7)
            r7 = 9
            X.0qQ.A0B(r8, r7)
            X.Awe r7 = new X.Awe
            r84 = r12
            r85 = r13
            r86 = r11
            r87 = r119
            r88 = r9
            r89 = r8
            r90 = r4
            r91 = r14
            r92 = r83
            r93 = r10
            r83 = r7
            r83.<init>(r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)
            X.8WH r30 = new X.8WH
            r8 = r30
            r8.<init>(r10, r7)
            X.4DH r10 = r0.A0J
            androidx.fragment.app.FragmentActivity r9 = r10.requireActivity()
            com.instagram.common.session.UserSession r8 = r0.A0R
            r7 = r107
            X.0qQ.A0B(r8, r7)
            X.72M r7 = new X.72M
            r7.<init>(r9, r8)
            X.2YN r8 = new X.2YN
            r8.<init>(r7, r10)
            java.lang.Class<X.72N> r7 = X.AnonymousClass72N.class
            X.2YL r11 = r8.A00(r7)
            X.72N r11 = (X.AnonymousClass72N) r11
            r0.A0O = r11
            android.view.ViewGroup r10 = r0.A0C
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r9 = r0.A0U
            X.88F r7 = r0.A22
            r82 = 0
            if (r7 == 0) goto L_0x3276
            r82 = 1
        L_0x3276:
            X.8WI r8 = new X.8WI
            r8.<init>(r0)
            X.0qQ.A0B(r10, r6)
            r7 = r101
            X.0qQ.A0B(r9, r7)
            X.8WJ r24 = new X.8WJ
            r76 = r24
            r77 = r10
            r78 = r9
            r79 = r1
            r80 = r16
            r81 = r8
            r76.<init>(r77, r78, r79, r80, r81, r82)
            r7 = r24
            r0.A16 = r7
            X.80U r7 = r0.A1f
            r83 = r7
            com.instagram.common.session.UserSession r12 = r0.A0R
            X.81i r7 = r0.A1Q
            r82 = r7
            X.81m r7 = r0.A1a
            r81 = r7
            X.82p r7 = r0.A0o
            r80 = r7
            android.app.Activity r7 = r0.A09
            r79 = r7
            android.view.ViewGroup r7 = r0.A0C
            r78 = r7
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r7 = r0.A0U
            r77 = r7
            X.8Yz r7 = r0.A0W
            r76 = r7
            X.4DH r7 = r0.A0J
            r71 = r7
            X.0iw r7 = r1.A0O
            r70 = r7
            X.83s r7 = r0.A1X
            r69 = r7
            X.823 r7 = r0.A0p
            r68 = r7
            X.8DD r7 = r0.A1I
            r64 = r7
            X.88F r7 = r0.A22
            r63 = r7
            X.84E r7 = r0.A0N
            r62 = r7
            X.82W r7 = r0.A0M
            r61 = r7
            X.81e r7 = r0.A0y
            r60 = r7
            X.85o r7 = r0.A0k
            r59 = r7
            X.80x r7 = r0.A20
            r56 = r7
            X.85O r7 = r0.A1O
            r54 = r7
            X.8Hx r7 = r0.A1j
            r52 = r7
            X.848 r7 = r0.A0I
            r51 = r7
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A1n
            r50 = r7
            X.846 r7 = r0.A1v
            r49 = r7
            android.content.Context r7 = r71.requireContext()
            X.0qQ.A0B(r12, r6)
            com.instagram.ar.core.effectcollection.EffectCollectionService r9 = X.C311766dD.A00(r7, r12)
            X.8WL r8 = new X.8WL
            r8.<init>()
            com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService r7 = new com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService
            r7.<init>(r9, r12, r8)
            X.8WN r9 = new X.8WN
            r9.<init>(r7)
            X.2YN r8 = new X.2YN
            r7 = r71
            r8.<init>(r9, r7)
            java.lang.Class<X.8WO> r7 = X.AnonymousClass8WO.class
            X.2YL r10 = r8.A00(r7)
            X.8WO r10 = (X.AnonymousClass8WO) r10
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r0.A0i
            r48 = r7
            X.80D r7 = r0.A0v
            com.instagram.model.direct.camera.DirectCameraViewModel r7 = r7.A1I
            r39 = r7
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r7 = r0.A04
            r34 = r7
            X.4DH r15 = r0.A0J
            com.instagram.common.session.UserSession r14 = r0.A0R
            X.8Yz r13 = r0.A0W
            X.0qQ.A0B(r14, r6)
            r7 = r107
            X.0qQ.A0B(r13, r7)
            java.lang.Class<com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel> r9 = com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.class
            r20 = 29
            X.MMv r8 = new X.MMv
            r7 = r20
            r8.<init>(r7, r13, r14)
            X.8WQ r7 = new X.8WQ
            r7.<init>((java.lang.Class) r9, (X.0sP) r8)
            X.8WQ[] r7 = new X.AnonymousClass8WQ[]{r7}
            X.8WS r8 = X.AnonymousClass8WR.A00(r7)
            X.2YN r7 = new X.2YN
            r7.<init>(r8, r15)
            X.2YL r8 = r7.A00(r9)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r8 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel) r8
            X.80D r7 = r0.A0v
            X.50r r13 = r7.A0H()
            com.instagram.model.direct.DirectShareTarget r14 = r1.A1H
            r9 = 8
            r7 = r79
            X.0qQ.A0B(r7, r9)
            r9 = 9
            r7 = r78
            X.0qQ.A0B(r7, r9)
            r9 = 10
            r7 = r77
            X.0qQ.A0B(r7, r9)
            r9 = 12
            r7 = r76
            X.0qQ.A0B(r7, r9)
            r9 = r70
            r7 = r104
            X.0qQ.A0B(r9, r7)
            r9 = 34
            r7 = r56
            X.0qQ.A0B(r7, r9)
            r9 = 35
            r7 = r58
            X.0qQ.A0B(r7, r9)
            r9 = 36
            r7 = r54
            X.0qQ.A0B(r7, r9)
            r9 = 37
            r7 = r45
            X.0qQ.A0B(r7, r9)
            r9 = 39
            r7 = r51
            X.0qQ.A0B(r7, r9)
            r9 = 40
            r7 = r50
            X.0qQ.A0B(r7, r9)
            r7 = 44
            X.0qQ.A0B(r10, r7)
            r9 = 47
            r7 = r48
            X.0qQ.A0B(r7, r9)
            r9 = 48
            r7 = r36
            X.0qQ.A0B(r7, r9)
            r7 = 49
            X.0qQ.A0B(r11, r7)
            r9 = 50
            r7 = r23
            X.0qQ.A0B(r7, r9)
            r9 = 52
            r7 = r34
            X.0qQ.A0B(r7, r9)
            r7 = 53
            X.0qQ.A0B(r8, r7)
            r7 = 54
            X.0qQ.A0B(r13, r7)
            X.8WW r7 = new X.8WW
            r110 = r79
            r111 = r77
            r112 = r78
            r113 = r75
            r114 = r51
            r115 = r71
            r116 = r61
            r117 = r62
            r118 = r11
            r119 = r70
            r120 = r12
            r121 = r76
            r122 = r25
            r123 = r35
            r124 = r31
            r125 = r26
            r126 = r48
            r127 = r34
            r128 = r59
            r129 = r66
            r130 = r4
            r131 = r67
            r132 = r80
            r133 = r68
            r134 = r1
            r135 = r60
            r136 = r5
            r137 = r24
            r138 = r16
            r139 = r64
            r140 = r105
            r141 = r8
            r142 = r10
            r143 = r54
            r144 = r28
            r145 = r82
            r146 = r30
            r147 = r74
            r148 = r69
            r149 = r81
            r150 = r83
            r151 = r45
            r152 = r52
            r153 = r50
            r154 = r58
            r155 = r23
            r156 = r36
            r157 = r42
            r158 = r13
            r159 = r49
            r161 = r56
            r162 = r63
            r163 = r43
            r164 = r17
            r165 = r14
            r166 = r39
            r109 = r7
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166)
            X.8WX r17 = new X.8WX
            r9 = r17
            r8 = r83
            r9.<init>(r8, r7)
            r0.A1N = r9
            X.8Hx r8 = r0.A1j
            r8.ETA(r9)
            r4.A01 = r9
            X.8Yz r7 = r0.A0W
            X.80m r7 = r7.A07
            java.lang.Object r8 = r7.A00
            java.util.Set r8 = (java.util.Set) r8
            r7 = r40
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x34b3
            if (r53 == 0) goto L_0x34b3
            r7 = r53
            X.4gw r7 = r7.A04
            if (r7 != 0) goto L_0x34b3
            com.instagram.common.session.UserSession r11 = r0.A0R
            X.4DH r10 = r0.A0J
            X.8Yz r9 = r0.A0W
            android.app.Activity r12 = r0.A09
            X.07g r12 = (X.AnonymousClass07g) r12
            X.8I5 r8 = new X.8I5
            r8.<init>(r11)
            X.2YN r7 = new X.2YN
            r7.<init>(r8, r12)
            java.lang.Class<X.8I6> r8 = X.AnonymousClass8I6.class
            X.2YL r7 = r7.A00(r8)
            X.8I6 r7 = (X.AnonymousClass8I6) r7
            X.9Qv r48 = new X.9Qv
            r49 = r10
            r50 = r11
            r51 = r9
            r52 = r17
            r53 = r7
            r48.<init>(r49, r50, r51, r52, r53)
        L_0x34b3:
            X.8WY r12 = new X.8WY
            r12.<init>(r0)
            X.80U r11 = r0.A1f
            X.8WZ r10 = new X.8WZ
            r10.<init>(r0)
            X.8Wa r9 = new X.8Wa
            r9.<init>(r0)
            X.8Wb r8 = new X.8Wb
            r8.<init>(r0)
            X.8Wc r7 = new X.8Wc
            r7.<init>(r0)
            X.8Wd r13 = new X.8Wd
            r76 = r13
            r77 = r1
            r78 = r24
            r79 = r11
            r80 = r10
            r81 = r9
            r82 = r8
            r83 = r7
            r84 = r12
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84)
            r0.A12 = r13
            r4.A00 = r13
            X.889 r7 = r0.A23
            r7.A00 = r13
            X.8We r12 = new X.8We
            r12.<init>(r0)
            X.81e r11 = r0.A0y
            com.instagram.common.session.UserSession r10 = r0.A0R
            android.app.Activity r9 = r0.A09
            X.81T r8 = r0.A11
            X.8Wf r7 = new X.8Wf
            r76 = r7
            r77 = r9
            r78 = r8
            r79 = r10
            r80 = r31
            r81 = r3
            r82 = r1
            r83 = r11
            r84 = r13
            r85 = r5
            r86 = r2
            r87 = r12
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87)
            r0.A1T = r7
            com.instagram.common.session.UserSession r9 = r0.A0R
            X.4DH r8 = r0.A0J
            X.8Wg r7 = X.C357048Wg.STORY
            X.8Wh r12 = new X.8Wh
            r12.<init>(r8, r7, r9)
            r0.A0K = r12
            X.82p r7 = r0.A0o
            r53 = r7
            X.81T r7 = r0.A11
            r52 = r7
            X.80U r7 = r0.A1f
            r51 = r7
            X.847 r7 = r0.A0L
            r50 = r7
            X.842 r7 = r0.A1Y
            r49 = r7
            X.8AE r7 = r0.A1u
            r48 = r7
            X.6if r7 = r0.A1y
            r45 = r7
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r0.A2B
            r43 = r7
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r7 = r0.A0T
            r42 = r7
            X.8Yz r7 = r0.A0W
            r40 = r7
            X.8AA r7 = r0.A1t
            r39 = r7
            X.83s r7 = r0.A1X
            r36 = r7
            X.85o r7 = r0.A0j
            r34 = r7
            X.85o r15 = r0.A0k
            X.8Hx r14 = r0.A1j
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r13 = r0.A0i
            X.87i r11 = r0.A0X
            X.80x r10 = r0.A20
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r9 = r0.A1n
            X.2eb r8 = r0.A0V
            X.817 r7 = r0.A1E
            X.8Wi r30 = new X.8Wi
            r110 = r12
            r111 = r50
            r112 = r42
            r113 = r8
            r114 = r40
            r115 = r11
            r116 = r44
            r117 = r35
            r118 = r47
            r119 = r3
            r120 = r38
            r121 = r13
            r122 = r34
            r123 = r15
            r124 = r53
            r125 = r1
            r126 = r52
            r127 = r16
            r128 = r7
            r129 = r17
            r130 = r74
            r131 = r36
            r132 = r49
            r133 = r55
            r134 = r51
            r135 = r2
            r136 = r14
            r137 = r9
            r138 = r39
            r139 = r48
            r140 = r45
            r141 = r10
            r142 = r43
            r109 = r30
            r109.<init>(r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142)
            r2 = r30
            r0.A1C = r2
            X.82p r2 = r0.A0o
            r40 = r2
            X.81T r2 = r0.A11
            r39 = r2
            X.80U r2 = r0.A1f
            r36 = r2
            X.847 r2 = r0.A0L
            r34 = r2
            X.842 r15 = r0.A1Y
            X.2eb r14 = r0.A0V
            X.817 r13 = r0.A1E
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r11 = r0.A0U
            X.81B r10 = r0.A28
            X.846 r9 = r0.A1v
            android.view.ViewGroup r8 = r0.A0C
            X.8Wj r7 = new X.8Wj
            r7.<init>(r0)
            X.8Wk r2 = new X.8Wk
            r76 = r2
            r77 = r8
            r78 = r12
            r79 = r34
            r80 = r11
            r81 = r14
            r82 = r35
            r83 = r31
            r84 = r47
            r85 = r3
            r86 = r46
            r87 = r38
            r88 = r37
            r89 = r40
            r90 = r1
            r91 = r39
            r92 = r16
            r93 = r13
            r94 = r15
            r95 = r55
            r96 = r36
            r97 = r9
            r98 = r10
            r99 = r7
            r100 = r41
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100)
            r0.A1D = r2
            X.80U r2 = r0.A1f
            r34 = r2
            X.82p r15 = r0.A0o
            X.85O r14 = r0.A1O
            X.86x r13 = r0.A0s
            X.87h r12 = r0.A1r
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r11 = r0.A0T
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r0.A2B
            X.87i r9 = r0.A0X
            java.util.Map r8 = r0.A2C
            X.8Wu r7 = new X.8Wu
            r7.<init>(r0)
            X.8Wv r2 = new X.8Wv
            r76 = r2
            r77 = r11
            r78 = r9
            r79 = r35
            r80 = r31
            r81 = r47
            r82 = r3
            r83 = r15
            r84 = r13
            r85 = r1
            r86 = r65
            r87 = r17
            r88 = r14
            r89 = r55
            r90 = r34
            r91 = r12
            r92 = r10
            r93 = r8
            r94 = r7
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94)
            r0.A1U = r2
            X.87i r13 = r0.A0X
            X.6if r12 = r0.A1y
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r11 = r0.A2B
            X.8Yz r10 = r0.A0W
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r0.A0i
            X.82p r8 = r0.A0o
            X.85o r7 = r0.A0k
            X.8Ww r2 = new X.8Ww
            r76 = r2
            r77 = r10
            r78 = r13
            r83 = r46
            r84 = r38
            r85 = r37
            r86 = r9
            r87 = r7
            r88 = r8
            r89 = r1
            r90 = r16
            r91 = r27
            r92 = r12
            r93 = r11
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)
            r0.A1l = r2
            X.8Yz r12 = r0.A0W
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r11 = r0.A1n
            X.82p r10 = r0.A0o
            X.80U r9 = r0.A1f
            boolean r2 = r1.A3i
            r86 = r17
            if (r2 == 0) goto L_0x369a
            r86 = r106
        L_0x369a:
            android.app.Activity r2 = r0.A09
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r91 = r2.getScaledMinimumFlingVelocity()
            android.view.ViewGroup r7 = r0.A0C
            r2 = 2131429453(0x7f0b084d, float:1.848058E38)
            android.view.View r77 = r7.requireViewById(r2)
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r8 = r0.A0T
            com.instagram.common.session.UserSession r7 = r0.A0R
            X.8Wx r2 = new X.8Wx
            r76 = r2
            r78 = r8
            r79 = r7
            r80 = r12
            r81 = r3
            r82 = r66
            r83 = r10
            r84 = r1
            r85 = r24
            r87 = r9
            r88 = r11
            r89 = r19
            r90 = r18
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91)
            r0.A1R = r2
            r3 = r169
            r3.add(r2)
            X.8X0 r3 = new X.8X0
            r3.<init>(r0)
            X.8X1 r2 = new X.8X1
            r2.<init>()
            X.6id[] r2 = new X.C314656id[]{r2}
            X.6if r13 = X.C314666ie.A00(r3, r2)
            r0.A1x = r13
            X.82p r2 = r0.A0o
            r45 = r2
            X.80U r2 = r0.A1f
            r44 = r2
            X.815 r2 = r0.A10
            r43 = r2
            X.87i r2 = r0.A0X
            r42 = r2
            X.85r r2 = r0.A1V
            r41 = r2
            X.6if r2 = r0.A1y
            r40 = r2
            X.8BA r2 = r0.A0e
            r39 = r2
            X.87h r2 = r0.A1r
            r36 = r2
            X.8Yz r2 = r0.A0W
            r34 = r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r0.A1n
            r24 = r2
            X.8X2 r12 = new X.8X2
            r12.<init>(r0)
            X.88Z r2 = r0.A1c
            r19 = r2
            X.8DD r2 = r0.A1I
            r18 = r2
            X.848 r15 = r0.A0I
            X.846 r14 = r0.A1v
            android.view.ViewGroup r11 = r0.A0C
            X.842 r10 = r0.A1Y
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r9 = r0.A0U
            X.85o r8 = r0.A0k
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r0.A0i
            X.81T r3 = r0.A11
            X.8X3 r2 = new X.8X3
            r127 = r2
            r128 = r11
            r129 = r15
            r130 = r9
            r131 = r34
            r132 = r42
            r133 = r35
            r134 = r31
            r135 = r47
            r136 = r26
            r137 = r39
            r138 = r46
            r139 = r38
            r140 = r37
            r141 = r7
            r142 = r8
            r143 = r45
            r144 = r1
            r145 = r43
            r146 = r3
            r147 = r22
            r148 = r33
            r149 = r21
            r150 = r16
            r151 = r30
            r152 = r18
            r153 = r17
            r154 = r41
            r155 = r10
            r156 = r55
            r157 = r19
            r158 = r44
            r159 = r27
            r160 = r24
            r161 = r36
            r162 = r14
            r163 = r40
            r164 = r13
            r165 = r29
            r166 = r12
            r127.<init>(r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168)
            X.80U r14 = r0.A1f
            X.82p r3 = r0.A0o
            X.84E r13 = r0.A0N
            X.8DD r12 = r0.A1I
            X.84j r11 = r0.A1H
            X.80T r14 = (X.AnonymousClass80T) r14
            X.80W r10 = r14.A02
            r7 = r25
            r10.A02(r7)
            android.app.Activity r9 = r1.A05
            X.0qQ.A07(r9)
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            X.82o r7 = r3.A02
            r3 = r101
            X.0qQ.A0B(r7, r3)
            X.8X4 r3 = new X.8X4
            r3.<init>(r9, r8, r7)
            r10.A02(r3)
            com.instagram.common.session.UserSession r8 = r1.A0S
            X.0qQ.A07(r8)
            X.4DH r3 = r1.A0M
            r3.getClass()
            X.4DH r3 = r1.A0M
            android.content.Context r7 = r3.requireContext()
            X.8X5 r3 = new X.8X5
            r3.<init>(r8, r7)
            r10.A02(r3)
            X.80W r8 = r14.A01
            if (r12 == 0) goto L_0x37d2
            X.80V r3 = X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY
            r8.A01(r12, r3)
        L_0x37d2:
            if (r13 == 0) goto L_0x37d9
            X.80V r3 = X.AnonymousClass80V.NAMETAG_CAMERA_SCAN_SHOW_RESULT
            r8.A01(r13, r3)
        L_0x37d9:
            X.B1N r9 = r1.A0g
            if (r9 == 0) goto L_0x37e7
            X.80V r7 = X.AnonymousClass80V.MEDIA_EDIT
            X.AfV r3 = new X.AfV
            r3.<init>(r9)
            r8.A01(r3, r7)
        L_0x37e7:
            r8.A02(r2)
            r2 = r25
            X.8S6 r2 = r2.A0D
            r8.A02(r2)
            com.instagram.common.session.UserSession r7 = r1.A0S
            X.0qQ.A07(r7)
            X.MMT r3 = new X.MMT
            r2 = r20
            r3.<init>(r7, r2)
            java.lang.Class<X.8X6> r2 = X.AnonymousClass8X6.class
            java.lang.Object r2 = r7.A01(r2, r3)
            X.80b r2 = (X.C3493580b) r2
            r8.A02(r2)
            if (r13 == 0) goto L_0x380d
            r8.A02(r13)
        L_0x380d:
            r8.A02(r11)
            X.889 r2 = r0.A23
            r3 = r16
            r2.A02 = r3
            r2.A01 = r5
            X.8D8 r3 = r0.A1g
            r2.A04 = r3
            r3 = r74
            r2.A03 = r3
            r2 = r58
            X.2Fk r7 = r2.A04
            X.4DH r5 = r0.A0J
            X.8X7 r3 = new X.8X7
            r3.<init>(r0)
            X.6q2 r2 = new X.6q2
            r2.<init>(r3)
            r7.A06(r5, r2)
            r2 = r107
            r0.A2F = r2
            X.8Yz r2 = r0.A0W
            com.instagram.creation.cameraconfiguration.CameraConfiguration r2 = r2.A06()
            r3 = r73
            r5 = r72
            r7 = r75
            A02(r7, r3, r2, r0, r5)
            X.86k r2 = r0.A19
            r21 = r2
            android.view.ViewGroup r15 = r0.A0C
            X.86W r2 = r0.A0H
            r20 = r2
            X.4DH r2 = r0.A0J
            r19 = r2
            X.80U r2 = r0.A1f
            r18 = r2
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r0.A0U
            r16 = r2
            X.0eM r14 = r0.A2E
            X.86c r13 = r0.A0G
            X.825 r12 = r0.A1q
            X.85X r11 = r0.A0n
            X.83s r10 = r0.A1X
            X.81m r9 = r0.A1a
            X.823 r8 = r0.A0p
            X.8AL r7 = r0.A1F
            X.84v r5 = r0.A1L
            X.8DD r3 = r0.A1I
            boolean r2 = X.11Z.A07()
            if (r2 == 0) goto L_0x3a00
            r33 = r13
            r34 = r20
            r35 = r19
            r36 = r16
            r37 = r66
            r38 = r4
            r39 = r11
            r40 = r8
            r41 = r32
            r42 = r1
            r43 = r21
            r44 = r7
            r45 = r3
            r46 = r5
            r47 = r17
            r48 = r28
            r49 = r10
            r50 = r9
            r51 = r18
            r52 = r23
            r53 = r12
            r54 = r14
            X.C357338Xm.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
        L_0x38a5:
            android.app.Activity r9 = r0.A09
            X.80U r8 = r0.A1f
            com.instagram.common.session.UserSession r7 = r0.A0R
            X.81T r5 = r0.A11
            X.8Yz r4 = r0.A0W
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r0.A2B
            X.8BA r2 = r0.A0e
            X.0qQ.A0B(r9, r6)
            r10 = r101
            X.0qQ.A0B(r7, r10)
            r10 = r57
            X.0qQ.A0B(r4, r10)
            r10 = 5
            X.0qQ.A0B(r3, r10)
            X.IoR r10 = new X.IoR
            r18 = r10
            r19 = r102
            r20 = r5
            r21 = r2
            r22 = r9
            r23 = r3
            r24 = r4
            r25 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.8Xw r3 = new X.8Xw
            r3.<init>(r8, r10)
            r2 = r170
            r2.add(r3)
            X.80U r2 = r0.A1f
            r2.A7w(r3)
            A03(r0)
            X.8Xy r4 = new X.8Xy
            r4.<init>()
            X.80S r2 = r0.A0z
            r2.A00 = r4
            com.instagram.common.session.UserSession r3 = r0.A0R
            X.0qQ.A0B(r3, r6)
            java.lang.Class<X.8Xy> r2 = X.C357458Xy.class
            r3.A04(r2, r4)
            X.8Yz r7 = r0.A0W
            X.85X r5 = r0.A0n
            com.instagram.common.session.UserSession r4 = r1.A0S
            X.0qQ.A0B(r4, r6)
            r2 = 36319415981120908(0x81085100011d8c, double:3.031883140785898E-306)
            r8 = r108
            boolean r2 = X.182.A06(r8, r4, r2)
            if (r2 != 0) goto L_0x392a
            r2 = 36319415981251982(0x81085100031d8e, double:3.0318831408687896E-306)
            boolean r2 = X.182.A06(r8, r4, r2)
            if (r2 != 0) goto L_0x392a
            r2 = 36319415981186445(0x81085100021d8d, double:3.031883140827344E-306)
            boolean r2 = X.182.A06(r8, r4, r2)
            if (r2 == 0) goto L_0x3988
        L_0x392a:
            android.app.Activity r10 = r1.A05
            com.instagram.common.session.UserSession r9 = r1.A0S
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            android.content.res.Resources r2 = r10.getResources()
            r3 = 2131165190(0x7f070006, float:1.794459E38)
            int r4 = r2.getDimensionPixelSize(r3)
            r11 = 2130970224(0x7f040670, float:1.7549152E38)
            int r2 = X.2Yu.A0H(r10, r11)
            int r2 = r10.getColor(r2)
            r8.setStroke(r4, r2)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            android.content.res.Resources r2 = r10.getResources()
            int r3 = r2.getDimensionPixelSize(r3)
            int r2 = X.2Yu.A0H(r10, r11)
            int r2 = r10.getColor(r2)
            r4.setStroke(r3, r2)
            android.content.res.Resources r3 = r10.getResources()
            r2 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r2 = r3.getDimensionPixelSize(r2)
            float r2 = (float) r2
            r4.setCornerRadius(r2)
            android.view.View r3 = r75.getRootView()
            X.LYJ r2 = new X.LYJ
            r11 = r8
            r12 = r4
            r13 = r75
            r14 = r9
            r15 = r7
            r16 = r5
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r3.setOnDragListener(r2)
        L_0x3988:
            boolean r2 = r1.A3m
            if (r2 == 0) goto L_0x39b5
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r0.A0U
            r2 = 2131443732(0x7f0b4014, float:1.850954E38)
            android.view.View r2 = r3.requireViewById(r2)
            r2.setVisibility(r6)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r0.A0U
            r2 = 2131439035(0x7f0b2dbb, float:1.8500014E38)
            android.view.View r3 = r3.requireViewById(r2)
            r2 = 8
            r3.setVisibility(r2)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r4 = r0.A0U
            android.app.Activity r3 = r0.A09
            int r2 = X.2Yu.A0C(r3)
            int r2 = r3.getColor(r2)
            r4.setBackgroundColor(r2)
        L_0x39b5:
            X.28D r2 = r1.A0B
            X.28D r1 = X.28D.A4n
            if (r2 != r1) goto L_0x39c5
            X.80U r2 = r0.A1f
            X.AfX r1 = new X.AfX
            r1.<init>(r0)
            r2.A7w(r1)
        L_0x39c5:
            X.8BA r0 = r0.A0e
            X.6if r0 = r0.A1g
            java.lang.Object r4 = r0.get()
            X.8ME r4 = (X.AnonymousClass8ME) r4
            X.87s r0 = r4.A1J
            X.2Fk r1 = r0.A0H
            X.4DH r3 = r4.A0l
            X.8Xz r0 = new X.8Xz
            r0.<init>(r4)
            r1.A06(r3, r0)
            X.87z r0 = r4.A0n
            X.2Fk r2 = r0.A03
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.8Y0 r0 = new X.8Y0
            r0.<init>(r4)
            r2.A06(r1, r0)
            X.87q r0 = r4.A1n
            X.05G r1 = r0.A08
            r0 = r103
            androidx.lifecycle.CoroutineLiveData r1 = X.C226292g8.A00(r0, r1)
            X.8Y1 r0 = new X.8Y1
            r0.<init>(r4)
            r1.A06(r3, r0)
            return
        L_0x3a00:
            X.Ar7 r2 = new X.Ar7
            r33 = r13
            r34 = r20
            r35 = r19
            r36 = r16
            r37 = r66
            r38 = r4
            r39 = r11
            r40 = r8
            r41 = r32
            r42 = r1
            r43 = r21
            r44 = r7
            r45 = r3
            r46 = r5
            r47 = r17
            r48 = r28
            r49 = r10
            r50 = r9
            r51 = r18
            r52 = r23
            r53 = r12
            r54 = r14
            r32 = r2
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r15.post(r2)
            goto L_0x38a5
        L_0x3a38:
            r22 = r106
            goto L_0x317f
        L_0x3a3c:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r11 = r0.A2B
            goto L_0x2bb3
        L_0x3a40:
            r7 = 0
            r14 = r106
            r13 = r14
            goto L_0x2ba1
        L_0x3a46:
            r9 = 0
            goto L_0x2b58
        L_0x3a49:
            r155 = 0
            goto L_0x289a
        L_0x3a4d:
            r18 = 0
            goto L_0x278b
        L_0x3a51:
            r19 = 0
            goto L_0x276f
        L_0x3a55:
            X.AbI r4 = new X.AbI
            r4.<init>()
            r0.A1j = r4
            goto L_0x262f
        L_0x3a5e:
            X.883 r7 = X.AnonymousClass883.BUILDER_PLAYBACK
            goto L_0x2527
        L_0x3a62:
            X.C3511387s.A00(r4)
            goto L_0x2542
        L_0x3a67:
            r8 = r106
            r7.A0g(r8)
            r15.A01()
            goto L_0x2542
        L_0x3a71:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3a77:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3a7d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3a83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3a89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3a8f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3a95:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3a9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3aa1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3aa7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3aad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3ab3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3ab9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3abf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3ac5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3acb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3ad1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3ad7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3add:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3ae3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3ae9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3aef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3af5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3afb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3b01:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3b07:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3b0d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3b13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x3b19:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemStateAwareComponentInterface"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x3b21:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x3b29:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x3b31:
            r0 = move-exception
            X.0lq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80R.<init>(X.80D):void");
    }
}
