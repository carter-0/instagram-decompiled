package X;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

public final class PF8 implements XCF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DirectVisualMessageViewerController A01;

    public final boolean Dpu() {
        return false;
    }

    public final boolean Dpw() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:213:0x036a, code lost:
        com.instagram.direct.visual.DirectVisualMessageViewerController.A0E(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x036d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0388, code lost:
        if (r0.A00 != -1) goto L_0x036a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqq(android.view.View r26, float r27, float r28) {
        /*
            r25 = this;
            r3 = 0
            r0 = r25
            com.instagram.direct.visual.DirectVisualMessageViewerController r4 = r0.A01
            android.view.View r0 = r4.replyComposerContainer
            java.lang.String r17 = "Required value was null."
            r7 = r27
            r5 = r28
            if (r0 == 0) goto L_0x0016
            boolean r0 = A00(r0, r7, r5)
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            return r3
        L_0x0016:
            android.view.View r0 = r4.selfViewFooterContainer
            if (r0 == 0) goto L_0x0021
            boolean r0 = A00(r0, r7, r5)
            if (r0 == 0) goto L_0x0021
            return r3
        L_0x0021:
            X.3oV r0 = r4.privacyOverlayStubHolder
            r2 = 0
            if (r0 == 0) goto L_0x0046
            boolean r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A0V(r4)
            if (r0 == 0) goto L_0x0046
            X.3oV r0 = r4.privacyOverlayStubHolder
            if (r0 == 0) goto L_0x0046
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L_0x0046
            r0 = 2131438226(0x7f0b2a92, float:1.8498373E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = A00(r0, r7, r5)
            if (r0 == 0) goto L_0x0046
            return r3
        L_0x0046:
            android.widget.EditText r0 = r4.composerEditText
            r1 = 1
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.hasFocus()
            if (r0 != r1) goto L_0x0057
            android.widget.EditText r0 = r4.composerEditText
            X.0nA.A0N(r0)
        L_0x0056:
            return r1
        L_0x0057:
            X.N3h r8 = com.instagram.direct.visual.DirectVisualMessageViewerController.A02(r4)
            if (r8 == 0) goto L_0x0015
            X.4iq r12 = r8.A07
            boolean r0 = X.AnonymousClass7TF.A1V(r12)
            java.lang.String r16 = "reelInteractiveController"
            if (r0 == 0) goto L_0x0177
            r4.A0U = r1
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x03ca
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r10 = r0.A0Q
            X.6ia r9 = r4.A0M
            if (r9 == 0) goto L_0x03e9
            java.lang.String r6 = "DirectVisualMessageViewerFragment"
            r0 = 3
            X.0qQ.A0B(r10, r0)
            if (r12 == 0) goto L_0x00a0
            com.instagram.feed.media.CreativeConfigIntf r0 = r12.A00
        L_0x007d:
            boolean r0 = X.C309126Xa.A01(r0)
            if (r0 == 0) goto L_0x00a2
            java.util.List r0 = r10.A0B
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00a2
            boolean r0 = A00(r10, r7, r5)
            if (r0 == 0) goto L_0x00a2
            if (r12 == 0) goto L_0x03b5
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r12.A08
            if (r2 == 0) goto L_0x03b5
            java.lang.String r0 = "tapped"
            r4.A0W(r0)
            r9.A02(r2)
            return r1
        L_0x00a0:
            r0 = r2
            goto L_0x007d
        L_0x00a2:
            com.instagram.common.session.UserSession r11 = r4.A0m
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x03c5
            X.52z r14 = r0.A0K
            X.6ia r10 = r4.A0M
            if (r10 == 0) goto L_0x03e9
            X.6iZ r9 = r4.A0z
            r13 = 6
            X.0qQ.A0B(r9, r13)
            java.util.List r0 = r8.A0P
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = X.C271404in.A05(r0)
            if (r6 == 0) goto L_0x00fb
            android.view.ViewGroup r14 = r14.A01
            if (r14 == 0) goto L_0x00fb
            boolean r14 = A00(r14, r7, r5)
            if (r14 == 0) goto L_0x00fb
            com.instagram.user.model.User r7 = r6.A05
            java.lang.String r0 = r6.A0T
            java.lang.String r5 = "tapped"
            if (r0 == 0) goto L_0x00d5
            r4.A0W(r5)
            r10.A01(r6)
            return r1
        L_0x00d5:
            java.lang.Boolean r0 = X.C349167zh.A00(r11)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00f3
            X.0Tu r0 = X.0Tu.A05
            r2 = 36312612752917703(0x810221000104c7, double:3.02758075187579E-306)
            boolean r0 = X.182.A06(r0, r11, r2)
            if (r0 == 0) goto L_0x00f3
            r4.A0W(r5)
            r10.A02(r6)
            return r1
        L_0x00f3:
            if (r7 == 0) goto L_0x0056
            java.lang.String r0 = "music_overlay_sticker_artist"
            r9.CHz(r7, r0)
            return r1
        L_0x00fb:
            androidx.fragment.app.FragmentActivity r14 = r4.A0e
            X.6jt r9 = r4.A0O
            if (r9 != 0) goto L_0x010b
            java.lang.String r0 = "appAttributionTooltipHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010b:
            X.OIU r6 = r4.contentHolder
            if (r6 == 0) goto L_0x03c0
            X.OL9 r15 = r6.A0H
            X.4DU r6 = r4.A0v
            java.lang.String r6 = r6.getModuleName()
            X.AnonymousClass7TF.A1E(r15, r13, r6)
            X.OGw r10 = r8.A05
            if (r10 == 0) goto L_0x0142
            java.lang.String r13 = r10.A03
            if (r13 == 0) goto L_0x0142
            java.lang.String r13 = r10.A04
            if (r13 == 0) goto L_0x0142
            android.view.ViewGroup r6 = r15.A00
            if (r6 == 0) goto L_0x0175
            boolean r0 = A00(r6, r7, r5)
            if (r0 == 0) goto L_0x0175
            java.lang.String r4 = r10.A03
            java.lang.String r3 = r10.A04
            java.lang.String r2 = r10.A05
            java.lang.String r0 = r10.A02
            r10 = r4
            r11 = r3
            r12 = r2
            r13 = r0
            r8 = r9
            r9 = r6
            r8.A00(r9, r10, r11, r12, r13)
            return r1
        L_0x0142:
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0175
            X.3ui r9 = X.O0P.A00(r8)
            if (r9 == 0) goto L_0x0175
            android.view.ViewGroup r0 = r15.A00
            if (r0 == 0) goto L_0x0175
            boolean r0 = A00(r0, r7, r5)
            if (r0 == 0) goto L_0x0175
            X.6Yo r4 = X.DbS.A0M(r14, r11)
            com.instagram.util.fragment.IgFragmentFactoryImpl r3 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            java.lang.String r0 = r9.A1a
            if (r0 == 0) goto L_0x03bb
            X.F3W r0 = r3.A03(r0)
            r0.A0E = r6
            X.32F r0 = r0.A01()
            r4.A0B(r2, r0)
            r4.A04()
            return r1
        L_0x0175:
            r4.A0U = r3
        L_0x0177:
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x03fb
            X.OEF r0 = r0.A0I
            android.view.ViewGroup r10 = r0.A00
            X.7Mm r11 = r4.A0r
            com.instagram.common.session.UserSession r0 = r4.A0m
            r24 = r0
            X.0iw r9 = r4.A0g
            r15 = 3
            r6 = 4
            X.0qQ.A0B(r11, r6)
            if (r10 == 0) goto L_0x023c
            boolean r0 = A00(r10, r7, r5)
            if (r0 == 0) goto L_0x023c
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r0 = r8.A08
            if (r0 == 0) goto L_0x023c
            java.lang.String r10 = r0.A02
            if (r10 == 0) goto L_0x023c
            int r0 = r10.length()
            if (r0 == 0) goto L_0x023c
            android.net.Uri r13 = X.DbT.A09(r10)
            java.util.List r14 = r13.getPathSegments()
            java.lang.String r0 = "reel_id"
            java.lang.String r10 = r13.getQueryParameter(r0)
            int r0 = r14.size()
            if (r0 < r15) goto L_0x023c
            java.lang.String r15 = X.AnonymousClass7TE.A19(r14, r3)
            java.lang.String r0 = "stories"
            boolean r0 = r0.equalsIgnoreCase(r15)
            if (r0 == 0) goto L_0x023c
            if (r10 == 0) goto L_0x023c
            java.lang.String r6 = X.AnonymousClass7TE.A19(r14, r1)
            r0 = 2
            java.lang.String r5 = X.DbU.A0t(r14, r0)
            java.lang.String r0 = "reel_owner_id"
            java.lang.String r4 = r13.getQueryParameter(r0)
            if (r4 != 0) goto L_0x01d6
            r4 = r10
        L_0x01d6:
            com.instagram.user.model.User r0 = new com.instagram.user.model.User
            r0.<init>(r4, r6)
            X.1Nr r12 = new X.1Nr
            r12.<init>(r0)
            X.0qQ.A0A(r5)
            X.3BQ r20 = X.AnonymousClass3BQ.DIRECT_REPLY_REMIX_REACTION
            X.0qQ.A0B(r5, r3)
            r13 = 0
            android.app.Activity r4 = r11.A04
            int r0 = X.0nA.A05(r4)
            float r7 = (float) r0
            int r0 = X.0nA.A06(r4)
            float r6 = (float) r0
            int r0 = X.0nA.A05(r4)
            float r4 = (float) r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r13, r7, r6, r4)
            X.FpB r16 = new X.FpB
            r17 = r0
            r18 = r9
            r19 = r11
            r21 = r5
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r17 = r5
            r18 = r10
            r19 = r3
            r20 = r3
            r13 = r11
            r14 = r2
            r15 = r12
            r13.A00(r14, r15, r16, r17, r18, r19, r20)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r3 = r8.A0M
            java.lang.String r0 = "message_owner_id"
            r4.put(r0, r3)
            r0 = 95
            java.lang.String r13 = X.002.A0T(r5, r10, r0)
            java.lang.String r10 = "reaction_viewer_see_original"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "reaction_viewer"
            r7 = r9
            r8 = r24
            r9 = r2
            r14 = r4
            X.C67000MgY.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x023c:
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x03f6
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = r0.A0N
            boolean r0 = A00(r0, r7, r5)
            if (r0 == 0) goto L_0x0250
            java.lang.String r2 = r8.A0M
            java.lang.String r0 = "direct_visual_message_sender_avatar"
        L_0x024c:
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0M(r4, r2, r0)
            return r1
        L_0x0250:
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x03f1
            android.widget.TextView r0 = r0.A08
            boolean r0 = A00(r0, r7, r5)
            if (r0 == 0) goto L_0x0261
            java.lang.String r2 = r8.A0M
            java.lang.String r0 = "direct_visual_message_sender_name"
            goto L_0x024c
        L_0x0261:
            if (r12 == 0) goto L_0x0278
            com.instagram.feed.media.CreativeConfigIntf r0 = r12.A00
            if (r0 == 0) goto L_0x0278
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x03cf
            X.6lS r0 = r0.A0R
            android.view.ViewGroup r0 = r0.A00
            if (r0 == 0) goto L_0x0278
            boolean r0 = A00(r0, r7, r5)
            if (r0 == 0) goto L_0x0278
            return r3
        L_0x0278:
            X.N3h r9 = com.instagram.direct.visual.DirectVisualMessageViewerController.A02(r4)
            if (r9 == 0) goto L_0x02d5
            boolean r0 = r9.A0S
            if (r0 == 0) goto L_0x02d5
            X.6ia r11 = r4.A0M
            if (r11 == 0) goto L_0x03e9
            float r10 = r9.A01
            java.util.List r9 = r9.A0P
            android.view.View r0 = r11.A05
            int r21 = r0.getWidth()
            int r22 = r0.getHeight()
            if (r9 == 0) goto L_0x02d5
            java.util.Iterator r13 = r9.iterator()
        L_0x029a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r12 = r13.next()
            X.3ui r12 = (X.C255783ui) r12
            if (r12 == 0) goto L_0x02b2
            X.3WT r0 = r12.A11
            int r9 = r0.ordinal()
            r0 = 29
            if (r9 == r0) goto L_0x029a
        L_0x02b2:
            android.graphics.Rect r18 = X.C306746Ni.A01
            r20 = r10
            r23 = r3
            r19 = r12
            X.C306746Ni.A02(r18, r19, r20, r21, r22, r23)
            boolean r0 = X.C306746Ni.A03(r12, r7, r5)
            if (r0 == 0) goto L_0x029a
            int r9 = (int) r7
            int r0 = (int) r5
            boolean r0 = r11.A05(r12, r9, r0)
            if (r0 == 0) goto L_0x029a
            boolean r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A0U(r4)
            if (r0 == 0) goto L_0x0056
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0B(r4)
            return r1
        L_0x02d5:
            X.6ia r0 = r4.A0M
            if (r0 == 0) goto L_0x03e9
            float r10 = r8.A01
            java.util.List r8 = r8.A0P
            android.view.View r0 = r0.A05
            int r21 = r0.getWidth()
            int r22 = r0.getHeight()
            if (r8 == 0) goto L_0x0317
            java.util.Iterator r11 = r8.iterator()
        L_0x02ed:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0317
            java.lang.Object r9 = r11.next()
            X.3ui r9 = (X.C255783ui) r9
            if (r9 == 0) goto L_0x02ed
            X.3WT r0 = r9.A11
            int r8 = r0.ordinal()
            r0 = 29
            if (r8 != r0) goto L_0x02ed
            android.graphics.Rect r18 = X.C306746Ni.A01
            r20 = r10
            r23 = r3
            r19 = r9
            X.C306746Ni.A02(r18, r19, r20, r21, r22, r23)
            boolean r0 = X.C306746Ni.A03(r9, r7, r5)
            if (r0 == 0) goto L_0x02ed
            return r3
        L_0x0317:
            int r0 = X.AnonymousClass1GB.A01(r7)
            float r7 = (float) r0
            boolean r5 = r4.A0V
            int r0 = r4.A01
            float r0 = (float) r0
            if (r5 == 0) goto L_0x038b
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0390
        L_0x0327:
            X.OW6 r2 = r4.A0G
            if (r2 == 0) goto L_0x0056
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x0056
            int r0 = r0 - r1
            X.N3h r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0056
            boolean r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A0T(r4)
            if (r0 == 0) goto L_0x0056
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0F(r4)
            r0 = 10
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0K(r4, r0)
            com.instagram.user.model.User r5 = X.DbT.A0j(r24)
            X.OW6 r0 = r4.A0G
            if (r0 == 0) goto L_0x0371
            int r3 = r0.A00
            int r2 = r3 + -1
        L_0x0350:
            if (r2 == r3) goto L_0x0371
            if (r2 < 0) goto L_0x0371
            X.OW6 r0 = r4.A0G
            if (r0 == 0) goto L_0x03d4
            X.N3h r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x03d4
            boolean r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A0S(r0, r4, r5)
            if (r0 == 0) goto L_0x036e
            X.OW6 r0 = r4.A0G
            if (r0 == 0) goto L_0x036a
            r0.A00 = r2
        L_0x036a:
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0E(r4)
            return r1
        L_0x036e:
            int r2 = r2 + -1
            goto L_0x0350
        L_0x0371:
            X.OW6 r0 = r4.A0G
            if (r0 == 0) goto L_0x03de
            X.N3h r0 = r0.A00()
            if (r0 == 0) goto L_0x03de
            boolean r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A0S(r0, r4, r5)
            if (r0 == 0) goto L_0x0056
            X.OW6 r0 = r4.A0G
            if (r0 == 0) goto L_0x03d9
            int r2 = r0.A00
            r0 = -1
            if (r2 == r0) goto L_0x0056
            goto L_0x036a
        L_0x038b:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0390
            goto L_0x0327
        L_0x0390:
            int r5 = r4.A03
            r0 = 2
            if (r5 == r0) goto L_0x0397
            if (r5 != r6) goto L_0x0056
        L_0x0397:
            X.6ia r0 = r4.A0M
            if (r0 == 0) goto L_0x03e9
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x03b1
            X.6ia r0 = r4.A0M
            if (r0 == 0) goto L_0x03e9
            r0.A03(r2, r3, r1)
            boolean r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A0U(r4)
            if (r0 == 0) goto L_0x03e3
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0C(r4)
        L_0x03b1:
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0O(r4, r1)
            return r1
        L_0x03b5:
            java.lang.String r0 = "Audio data not available on clips attribution tap"
            X.0wb.A03(r6, r0)
            return r1
        L_0x03bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03e3:
            java.lang.String r0 = "resume"
            r4.A0X(r0)
            return r1
        L_0x03e9:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x03fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PF8.Dqq(android.view.View, float, float):boolean");
    }

    public PF8(DirectVisualMessageViewerController directVisualMessageViewerController, int i) {
        this.A01 = directVisualMessageViewerController;
        this.A00 = i;
    }

    public final void DA9(float f) {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        float A012 = (float) AnonymousClass1GB.A01(f);
        boolean z = directVisualMessageViewerController.A0V;
        float f2 = (float) directVisualMessageViewerController.A01;
        if (z) {
            if (A012 < f2) {
                return;
            }
        } else if (A012 > f2) {
            return;
        }
        C314626ia r0 = directVisualMessageViewerController.A0M;
        if (r0 == null) {
            0qQ.A0F("reelInteractiveController");
            throw AnonymousClass00P.createAndThrow();
        } else if (!r0.A04() && DirectVisualMessageViewerController.A0T(directVisualMessageViewerController)) {
            OW6 ow6 = directVisualMessageViewerController.A0G;
            boolean z2 = false;
            if (ow6 != null && ow6.A00 > 0) {
                z2 = true;
            }
            DirectVisualMessageViewerController.A0P(directVisualMessageViewerController, z2);
        }
    }

    public final void DAd(float f) {
        OEL oel = this.A01.reelViewerShadowAnimator;
        if (oel != null) {
            float A002 = C66583MXo.A00(f);
            oel.A00 = A002;
            oel.A02.A00(oel.A01, A002);
        }
    }

    public final void DPy() {
        DirectVisualMessageViewerController.A0L(this.A01, 6, false);
    }

    public final boolean Dps(float f, float f2) {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController.replyComposerContainer == null || !directVisualMessageViewerController.A0X) {
            return false;
        }
        EditText editText = directVisualMessageViewerController.composerEditText;
        if (editText != null) {
            editText.clearFocus();
        }
        0nA.A0N(directVisualMessageViewerController.composerEditText);
        return true;
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0V(directVisualMessageViewerController) || directVisualMessageViewerController.replyComposerContainer == null || directVisualMessageViewerController.A0X) {
            return false;
        }
        EditText editText = directVisualMessageViewerController.composerEditText;
        if (editText != null) {
            editText.requestFocus();
            0nA.A0Q(editText);
        }
        return true;
    }

    public final void Dqn(float f, float f2) {
        C71662eb r0;
        View A012;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0T(directVisualMessageViewerController)) {
            directVisualMessageViewerController.A0W("tapped");
            View view = directVisualMessageViewerController.replyComposerContainer;
            if (!(view == null && (view = directVisualMessageViewerController.selfViewFooterContainer) == null)) {
                C315596kB.A08(new View[]{view}, true);
            }
            C315596kB.A08(new View[]{directVisualMessageViewerController.viewerInfoContainer}, true);
            DirectVisualMessageViewerController.A0P(directVisualMessageViewerController, false);
        } else if (DirectVisualMessageViewerController.A0U(directVisualMessageViewerController) && (r0 = directVisualMessageViewerController.sparklerAnimationStubHolder) != null && (A012 = r0.A01()) != null) {
            int i = this.A00;
            C315596kB.A09(new View[]{A012}, true);
            float f3 = (float) i;
            A012.setX(f - f3);
            A012.setY(f2 - f3);
            Drawable background = A012.getBackground();
            0qQ.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((AnimationDrawable) background).start();
        }
    }

    public final void Dqo() {
        View view;
        AnimationDrawable animationDrawable;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0T(directVisualMessageViewerController)) {
            directVisualMessageViewerController.A0X("resume");
            View view2 = directVisualMessageViewerController.replyComposerContainer;
            if (!(view2 == null && (view2 = directVisualMessageViewerController.selfViewFooterContainer) == null)) {
                C315596kB.A09(new View[]{view2}, true);
            }
            C315596kB.A09(new View[]{directVisualMessageViewerController.viewerInfoContainer}, true);
        } else if (DirectVisualMessageViewerController.A0U(directVisualMessageViewerController)) {
            C71662eb r0 = directVisualMessageViewerController.sparklerAnimationStubHolder;
            Drawable drawable = null;
            if (r0 != null) {
                view = r0.A01();
                if (view != null) {
                    drawable = view.getBackground();
                }
            } else {
                view = null;
            }
            if ((drawable instanceof AnimationDrawable) && (animationDrawable = (AnimationDrawable) drawable) != null) {
                animationDrawable.stop();
            }
            C315596kB.A08(new View[]{view}, true);
        }
    }

    public final void Dqp(float f, float f2) {
        C71662eb r0;
        View A012;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0U(directVisualMessageViewerController) && (r0 = directVisualMessageViewerController.sparklerAnimationStubHolder) != null && (A012 = r0.A01()) != null) {
            float f3 = (float) this.A00;
            A012.setX(f - f3);
            A012.setY(f2 - f3);
        }
    }

    public final void Dv9() {
        DirectVisualMessageViewerController.A0P(this.A01, false);
    }

    public static boolean A00(View view, float f, float f2) {
        return 0nA.A0F(view).contains(f, f2);
    }
}
