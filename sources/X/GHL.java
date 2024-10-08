package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GHL extends C251343mx {
    public final GEG A00;
    public final ClipsViewerConfig A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final JTB A06;
    public final JQX A07;

    public GHL(GEG geg, ClipsViewerConfig clipsViewerConfig, C267324bN r4, C52058GDe gDe, AnonymousClass0iw r6, UserSession userSession, JTB jtb, JQX jqx) {
        AnonymousClass7TF.A1F(gDe, 5, jtb);
        this.A07 = jqx;
        this.A05 = userSession;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = gDe;
        this.A00 = geg;
        this.A01 = clipsViewerConfig;
        this.A06 = jtb;
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [X.GtB] */
    /* JADX WARNING: type inference failed for: r1v22, types: [X.GtA] */
    /* JADX WARNING: type inference failed for: r1v23, types: [X.Gtk] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0294, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36325690928280715L) != false) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b0, code lost:
        if (X.C51969G9p.A1X(r8, r1, r0.A01(r1)) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0537  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r36) {
        /*
            r35 = this;
            r2 = 0
            r34 = r36
            r0 = r34
            X.0qQ.A0B(r0, r2)
            r1 = 1063675494(0x3f666666, float:0.9)
            X.2V5 r29 = X.C51968G9o.A0Z(r0, r1)
            r1 = 0
            X.2V5 r30 = X.C51968G9o.A0Z(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            X.2V5 r31 = X.C247343gB.A00(r0, r1)
            r5 = r35
            X.JTB r14 = r5.A06
            r4 = 1
            r28 = 0
            if (r14 == 0) goto L_0x005a
            X.4bN r6 = r5.A02
            boolean r0 = r14.CRt(r6, r1)
            if (r0 != r4) goto L_0x005a
            com.instagram.common.session.UserSession r7 = r5.A05
            X.0Tu r3 = X.C51965G9l.A0Z(r7, r2)
            r0 = 36322916379798179(0x810b8000062aa3, double:3.034096807004378E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x005a
            r28 = r5
            r32 = r34
            r33 = r2
            X.2WX r3 = r28.A00(r29, r30, r31, r32, r33)
            X.2Wb r2 = X.C51972G9s.A0Q(r34)
            X.GDe r0 = r5.A03
            X.Gt3 r1 = new X.Gt3
            r1.<init>(r6, r0, r14)
            r0 = r34
            X.2Tp r0 = X.C51967G9n.A0Q(r1, r2, r0, r3)
            return r0
        L_0x005a:
            X.4bN r8 = r5.A02
            X.1Xj r7 = r8.A02
            r20 = 3
            X.GJI r19 = X.GJI.QUESTION_RESPONSE_LABEL
            X.GJI r15 = X.GJI.VISUAL_REPLIES
            X.GJI r13 = X.GJI.WAS_LIVE
            r18 = 2
            r0 = r19
            X.GJI[] r0 = new X.GJI[]{r0, r15, r13}
            java.util.Set r17 = X.C51967G9n.A0t(r0, r2)
            X.GDe r0 = r5.A03
            r32 = r0
            X.3W1 r6 = r0.A0E
            if (r6 == 0) goto L_0x00b2
            r3 = 74
            r0 = 27
            X.J6N r1 = X.J6N.A00(r6, r0)
            r0 = r34
            X.2Wa r0 = X.C243753a2.A01(r0, r6, r1, r3, r2)
            boolean r0 = X.C51969G9p.A1V(r0)
            if (r0 != 0) goto L_0x00b2
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0508
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.ClipsTrialDict r0 = r0.AoL()
            if (r0 == 0) goto L_0x0508
            com.instagram.api.schemas.MediaTrialStatus r1 = r0.BzK()
        L_0x009e:
            com.instagram.api.schemas.MediaTrialStatus r0 = com.instagram.api.schemas.MediaTrialStatus.ACTIVE
            if (r1 != r0) goto L_0x00b2
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r5.A05
            com.instagram.user.model.User r0 = r0.A01(r1)
            boolean r0 = X.C51969G9p.A1X(r8, r1, r0)
            r16 = 1
            if (r0 != 0) goto L_0x00b4
        L_0x00b2:
            r16 = 0
        L_0x00b4:
            if (r7 == 0) goto L_0x023d
            X.1Xy r0 = r7.A0C
            X.DUj r0 = r0.ArB()
            if (r0 == 0) goto L_0x023d
            com.instagram.common.session.UserSession r6 = r5.A05
            android.content.Context r18 = X.C243803a8.A00(r34)
            X.GEG r0 = r5.A00
            r19 = r0
            com.instagram.clips.intf.ClipsViewerConfig r3 = r5.A01
            X.0qQ.A0B(r6, r2)
            r11 = 5
            r1 = 4
            X.0qQ.A0B(r0, r1)
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0q(r3, r11)
            X.1Xy r0 = r7.A0C
            X.DUj r0 = r0.ArB()
            if (r0 == 0) goto L_0x023a
            com.instagram.api.schemas.ContextualLinkCtaType r9 = r0.ArC()
        L_0x00e2:
            com.instagram.api.schemas.ContextualLinkCtaType r0 = com.instagram.api.schemas.ContextualLinkCtaType.TEMPLATE
            if (r9 != r0) goto L_0x0173
            boolean r0 = X.AnonymousClass3ZC.A0P(r6, r7)
            if (r0 != 0) goto L_0x0173
            X.GJI r0 = X.GJI.TEMPLATE_CREATION
        L_0x00ee:
            java.util.List r10 = X.AnonymousClass7TE.A1I(r0)
        L_0x00f2:
            boolean r0 = r17.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0109
            java.util.ArrayList r10 = X.00k.A0U(r10)
            r1 = 26
            r0 = r17
            X.J6N r0 = X.J6N.A00(r0, r1)
            X.018.A1A(r10, r0)
        L_0x0109:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r10.iterator()
        L_0x0111:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x050c
            java.lang.Object r9 = r12.next()
            X.GJI r9 = (X.GJI) r9
            int r1 = r9.ordinal()
            switch(r1) {
                case 0: goto L_0x0125;
                case 1: goto L_0x0142;
                case 2: goto L_0x0142;
                case 3: goto L_0x0124;
                case 4: goto L_0x0124;
                case 5: goto L_0x0142;
                case 6: goto L_0x0124;
                case 7: goto L_0x0124;
                case 8: goto L_0x013a;
                case 9: goto L_0x0132;
                case 10: goto L_0x0142;
                case 11: goto L_0x0142;
                case 12: goto L_0x0142;
                case 13: goto L_0x0142;
                case 14: goto L_0x0142;
                case 15: goto L_0x0142;
                case 16: goto L_0x0142;
                case 17: goto L_0x0142;
                case 18: goto L_0x0142;
                case 19: goto L_0x0142;
                case 20: goto L_0x0142;
                case 21: goto L_0x0142;
                default: goto L_0x0124;
            }
        L_0x0124:
            goto L_0x0111
        L_0x0125:
            java.util.WeakHashMap r9 = new java.util.WeakHashMap
            r9.<init>()
            X.Gtk r1 = new X.Gtk
            r7 = r32
            r1.<init>(r8, r7, r14, r9)
            goto L_0x016f
        L_0x0132:
            X.GtA r1 = new X.GtA
            r7 = r32
            r1.<init>(r8, r7, r14)
            goto L_0x016f
        L_0x013a:
            X.GtB r1 = new X.GtB
            r7 = r32
            r1.<init>(r8, r7, r14)
            goto L_0x016f
        L_0x0142:
            r1 = r17
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0154
            X.GJI r1 = X.GJI.TEMPLATE_CREATION
            if (r9 != r1) goto L_0x0111
            com.instagram.clips.intf.ClipsViewerSource r7 = r3.A0J
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_TILE_TWO_BY_TWO
            if (r7 != r1) goto L_0x0111
        L_0x0154:
            X.JQX r11 = r5.A07
            X.0iw r7 = r5.A04
            X.Gv6 r1 = new X.Gv6
            r21 = r32
            r22 = r7
            r23 = r6
            r24 = r14
            r25 = r9
            r26 = r11
            r19 = r3
            r20 = r8
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x016f:
            r0.add(r1)
            goto L_0x0111
        L_0x0173:
            com.instagram.api.schemas.ContextualLinkCtaType r0 = com.instagram.api.schemas.ContextualLinkCtaType.CREATOR_PICK
            if (r9 != r0) goto L_0x017b
            X.GJI r0 = X.GJI.CREATOR_PICK
            goto L_0x00ee
        L_0x017b:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = X.C51969G9p.A1X(r8, r6, r0)
            if (r0 == 0) goto L_0x01c2
            boolean r0 = r7.A5G()
            if (r0 == 0) goto L_0x01c2
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.1sy r0 = X.1sy.A07
            boolean r0 = X.AnonymousClass3YR.A05(r6, r7, r0, r1, r4)
            if (r0 == 0) goto L_0x01c2
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = r0.A2L()
            if (r0 != 0) goto L_0x01b2
            boolean r0 = X.AnonymousClass3YR.A01(r6)
            if (r0 == 0) goto L_0x01c2
            X.0Tu r12 = X.0Tu.A05
            r0 = 36321803983136539(0x810a7d0004271b, double:3.033393322876295E-306)
            boolean r0 = X.182.A06(r12, r6, r0)
            if (r0 == 0) goto L_0x01c2
        L_0x01b2:
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0238
            X.1i4 r0 = r0.A0c
            boolean r0 = r0.A08
        L_0x01ba:
            boolean r1 = X.AnonymousClass3YR.A02(r6)
            if (r1 == 0) goto L_0x0226
            if (r0 == 0) goto L_0x0226
        L_0x01c2:
            boolean r0 = X.AnonymousClass3ZC.A0V(r7)
            if (r0 == 0) goto L_0x01cb
            r10.add(r15)
        L_0x01cb:
            if (r9 == 0) goto L_0x01dc
            int r1 = r9.ordinal()
            r0 = r20
            if (r1 == r0) goto L_0x0223
            if (r1 != r11) goto L_0x01dc
            X.GJI r0 = X.GJI.CONTEXTUAL_HIGHLIGHT_TRY_SEQUENCE
        L_0x01d9:
            r10.add(r0)
        L_0x01dc:
            com.instagram.user.model.User r0 = r8.A0K
            if (r0 == 0) goto L_0x01fe
            boolean r0 = X.AnonymousClass3ZQ.A03(r0)
            if (r0 == 0) goto L_0x01fe
            X.GJI r0 = X.GJI.STATE_OWNED_MEDIA_LABEL
            r10.add(r0)
            r20 = r3
            r21 = r8
            r22 = r32
            r23 = r6
            r24 = r7
            X.AnonymousClass3ZC.A02(r18, r19, r20, r21, r22, r23, r24)
        L_0x01f8:
            java.util.List r10 = X.00k.A0a(r10)
            goto L_0x00f2
        L_0x01fe:
            boolean r0 = X.AnonymousClass3ZC.A0D(r8)
            if (r0 == 0) goto L_0x020a
            X.GJI r13 = X.GJI.REMIX
        L_0x0206:
            r10.add(r13)
            goto L_0x01f8
        L_0x020a:
            X.1Xy r0 = r7.A0C
            java.lang.Boolean r0 = r0.CZZ()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == r4) goto L_0x0206
            com.instagram.api.schemas.ContextualLinkCtaType r0 = com.instagram.api.schemas.ContextualLinkCtaType.SEE_MORE_PROMPTS
            if (r9 != r0) goto L_0x01f8
            boolean r0 = X.AnonymousClass3ZC.A0P(r6, r7)
            if (r0 != 0) goto L_0x01f8
            X.GJI r13 = X.GJI.SEE_MORE_PROMPTS
            goto L_0x0206
        L_0x0223:
            X.GJI r0 = X.GJI.CONTEXTUAL_HIGHLIGHT_TRY_REMIX
            goto L_0x01d9
        L_0x0226:
            boolean r0 = X.AnonymousClass3YR.A00(r8)
            if (r0 != 0) goto L_0x01c2
            r0 = r16
            boolean r0 = X.AnonymousClass3ZC.A0U(r6, r0)
            if (r0 != 0) goto L_0x01c2
            X.GJI r0 = X.GJI.INSIGHTS
            goto L_0x00ee
        L_0x0238:
            r0 = 0
            goto L_0x01ba
        L_0x023a:
            r9 = 0
            goto L_0x00e2
        L_0x023d:
            com.instagram.common.session.UserSession r6 = r5.A05
            android.content.Context r21 = X.C243803a8.A00(r34)
            X.GEG r0 = r5.A00
            r27 = r0
            com.instagram.clips.intf.ClipsViewerConfig r3 = r5.A01
            if (r7 == 0) goto L_0x0504
            X.1sQ r9 = X.C51966G9m.A0n(r7)
        L_0x024f:
            X.0qQ.A0B(r6, r2)
            X.AnonymousClass7TG.A1R(r0, r3)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            X.GJI r0 = X.GJI.TRENDING_AUDIO
            boolean r10 = X.AnonymousClass3ZC.A0Z(r0, r1)
            if (r10 == 0) goto L_0x02a8
            if (r7 == 0) goto L_0x02a8
            boolean r10 = X.AnonymousClass3ZC.A0P(r6, r7)
            if (r10 != 0) goto L_0x02a8
            X.GIT r20 = X.GIT.A00
            com.instagram.music.common.model.AudioOverlayTrack r10 = r3.A0Q
            if (r10 == 0) goto L_0x02a6
            com.instagram.music.common.model.MusicAssetModel r10 = r10.A08
        L_0x0271:
            r22 = r8
            r23 = r9
            r24 = r6
            r25 = r7
            r26 = r10
            X.4Ke r10 = r20.A02(r21, r22, r23, r24, r25, r26)
            if (r10 == 0) goto L_0x02a8
            boolean r11 = r10.A05
            boolean r10 = r10.A0A
            if (r10 == 0) goto L_0x02a8
            if (r11 != 0) goto L_0x02a8
            X.0Tu r12 = X.0Tu.A05
            r10 = 36325690928280715(0x810e060000348b, double:3.035851442636944E-306)
            boolean r10 = X.182.A06(r12, r6, r10)
            if (r10 == 0) goto L_0x02a8
        L_0x0296:
            X.AnonymousClass3ZC.A03(r0, r1)
            r0 = 2131430780(0x7f0b0d7c, float:1.848327E38)
            java.lang.Object r0 = X.C51968G9o.A0z(r1, r0)
            java.util.List r10 = X.0sr.A1N(r0)
            goto L_0x00f2
        L_0x02a6:
            r10 = 0
            goto L_0x0271
        L_0x02a8:
            X.GJI r0 = X.GJI.BLEND_SOCIAL_CONTEXT
            boolean r10 = X.AnonymousClass3ZC.A0Z(r0, r1)
            if (r10 == 0) goto L_0x02bf
            if (r7 == 0) goto L_0x02bf
            X.3yf r10 = r7.A1L()
            if (r10 == 0) goto L_0x02bf
            com.instagram.clips.intf.ClipsViewerSource r11 = r3.A0J
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r11 != r10) goto L_0x02bf
            goto L_0x0296
        L_0x02bf:
            X.GJI r0 = X.GJI.ICONIC_ENTRYPOINTS
            boolean r10 = X.AnonymousClass3ZC.A0Z(r0, r1)
            if (r10 == 0) goto L_0x02dd
            if (r7 == 0) goto L_0x02dd
            boolean r10 = r7.A6a(r6)
            if (r10 == 0) goto L_0x02dd
            X.0Tu r12 = X.0Tu.A05
            r10 = 36329083952578332(0x81111c00023f1c, double:3.037997204865369E-306)
            boolean r10 = X.182.A06(r12, r6, r10)
            if (r10 == 0) goto L_0x02dd
            goto L_0x0296
        L_0x02dd:
            X.GJI r0 = X.GJI.CREATOR_PICK
            boolean r10 = X.AnonymousClass3ZC.A0Z(r0, r1)
            if (r10 == 0) goto L_0x02fa
            boolean r10 = X.AnonymousClass3ZC.A0P(r6, r7)
            if (r10 != 0) goto L_0x02fa
            X.1Xj r10 = r8.A02
            com.instagram.reels.prompt.model.PromptStickerModel r10 = X.C52200GIr.A00(r10)
            if (r10 == 0) goto L_0x02fa
            boolean r10 = r10.A0K()
            if (r10 != r4) goto L_0x02fa
            goto L_0x0296
        L_0x02fa:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = X.C51969G9p.A1X(r8, r6, r0)
            if (r0 == 0) goto L_0x0343
            if (r7 == 0) goto L_0x0343
            boolean r0 = r7.A5G()
            if (r0 == 0) goto L_0x0343
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            X.1sy r0 = X.1sy.A07
            boolean r0 = X.AnonymousClass3YR.A05(r6, r7, r0, r10, r4)
            if (r0 == 0) goto L_0x0343
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = r0.A2L()
            if (r0 != 0) goto L_0x0333
            boolean r0 = X.AnonymousClass3YR.A01(r6)
            if (r0 == 0) goto L_0x0343
            X.0Tu r0 = X.0Tu.A05
            r10 = 36321803983136539(0x810a7d0004271b, double:3.033393322876295E-306)
            boolean r0 = X.182.A06(r0, r6, r10)
            if (r0 == 0) goto L_0x0343
        L_0x0333:
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0501
            X.1i4 r0 = r0.A0c
            boolean r0 = r0.A08
        L_0x033b:
            boolean r10 = X.AnonymousClass3YR.A02(r6)
            if (r10 == 0) goto L_0x04ef
            if (r0 == 0) goto L_0x04ef
        L_0x0343:
            boolean r0 = X.AnonymousClass3ZC.A0P(r6, r7)
            if (r0 != 0) goto L_0x0386
            X.GJI r10 = X.GJI.TEMPLATE_CREATION
            boolean r0 = X.AnonymousClass3ZC.A0Z(r10, r1)
            if (r0 == 0) goto L_0x0386
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0386
            X.4gw r0 = r0.A1P()
            if (r0 == 0) goto L_0x0386
            java.util.List r0 = r0.BrX()
            if (r0 == 0) goto L_0x0386
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0386
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0383
            X.1sQ r0 = X.C51966G9m.A0n(r0)
            if (r0 == 0) goto L_0x0383
            X.4gw r0 = r0.C4a()
            if (r0 == 0) goto L_0x0383
            java.lang.Boolean r0 = r0.BuB()
            if (r0 == 0) goto L_0x0383
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0386
        L_0x0383:
            X.AnonymousClass3ZC.A03(r10, r1)
        L_0x0386:
            X.GJI r10 = X.GJI.STATE_OWNED_MEDIA_LABEL
            boolean r0 = X.AnonymousClass3ZC.A0Z(r10, r1)
            if (r0 == 0) goto L_0x03ac
            if (r7 == 0) goto L_0x03ac
            com.instagram.user.model.User r0 = r8.A0K
            if (r0 == 0) goto L_0x03ac
            boolean r0 = X.AnonymousClass3ZQ.A03(r0)
            if (r0 == 0) goto L_0x03ac
            X.AnonymousClass3ZC.A03(r10, r1)
            r22 = r27
            r23 = r3
            r24 = r8
            r25 = r32
            r26 = r6
            r27 = r7
            X.AnonymousClass3ZC.A02(r21, r22, r23, r24, r25, r26, r27)
        L_0x03ac:
            boolean r0 = X.AnonymousClass3ZC.A0P(r6, r7)
            if (r0 != 0) goto L_0x04a1
            X.GJI r12 = X.GJI.CONSUMPTION_INTERACTION_UPSELL
            boolean r0 = X.AnonymousClass3ZC.A0Z(r12, r1)
            r11 = 0
            if (r0 == 0) goto L_0x03db
            boolean r0 = r8.CcK()
            if (r0 != 0) goto L_0x03db
            X.4gy r0 = r8.A0H
            if (r0 == 0) goto L_0x03db
            com.instagram.clips.model.metadata.InteractionUpsellCTAType r0 = r0.BII()
            if (r0 == 0) goto L_0x03db
            int r10 = r0.ordinal()
            r0 = 4
            if (r10 == r0) goto L_0x04ea
            r0 = r18
            if (r10 == r0) goto L_0x04ea
            if (r10 == r4) goto L_0x04ea
            r0 = 7
            if (r10 == r0) goto L_0x04ea
        L_0x03db:
            boolean r0 = X.AnonymousClass3ZC.A0Z(r15, r1)
            if (r0 == 0) goto L_0x03ea
            boolean r0 = X.AnonymousClass3ZC.A0V(r7)
            if (r0 == 0) goto L_0x03ea
            X.AnonymousClass3ZC.A03(r15, r1)
        L_0x03ea:
            X.GJI r10 = X.GJI.CONTEXTUAL_HIGHLIGHT_TRY_SEQUENCE
            boolean r0 = X.AnonymousClass3ZC.A0Z(r10, r1)
            if (r0 == 0) goto L_0x040b
            boolean r0 = X.AnonymousClass3ZC.A0E(r8, r9)
            if (r0 == 0) goto L_0x040b
            if (r9 == 0) goto L_0x04e7
            X.1s9 r0 = r9.BP1()
            if (r0 == 0) goto L_0x04e7
            com.instagram.api.schemas.ClipsMashupType r12 = r0.BP2()
        L_0x0404:
            com.instagram.api.schemas.ClipsMashupType r0 = com.instagram.api.schemas.ClipsMashupType.A0A
            if (r12 != r0) goto L_0x040b
            X.AnonymousClass3ZC.A03(r10, r1)
        L_0x040b:
            X.GJI r10 = X.GJI.CONTEXTUAL_HIGHLIGHT_TRY_REMIX
            boolean r0 = X.AnonymousClass3ZC.A0Z(r10, r1)
            if (r0 == 0) goto L_0x042c
            boolean r0 = X.AnonymousClass3ZC.A0E(r8, r9)
            if (r0 == 0) goto L_0x042c
            if (r9 == 0) goto L_0x0425
            X.1s9 r0 = r9.BP1()
            if (r0 == 0) goto L_0x0425
            com.instagram.api.schemas.ClipsMashupType r11 = r0.BP2()
        L_0x0425:
            com.instagram.api.schemas.ClipsMashupType r0 = com.instagram.api.schemas.ClipsMashupType.A0A
            if (r11 == r0) goto L_0x042c
            X.AnonymousClass3ZC.A03(r10, r1)
        L_0x042c:
            X.GJI r0 = X.GJI.REMIX
            boolean r10 = X.AnonymousClass3ZC.A0Z(r0, r1)
            if (r10 == 0) goto L_0x043d
            boolean r10 = X.AnonymousClass3ZC.A0D(r8)
            if (r10 == 0) goto L_0x043d
            X.AnonymousClass3ZC.A03(r0, r1)
        L_0x043d:
            X.GJI r10 = X.GJI.CHALLENGE
            boolean r0 = X.AnonymousClass3ZC.A0Z(r10, r1)
            if (r0 == 0) goto L_0x0464
            boolean r0 = X.AnonymousClass3ZC.A0D(r8)
            if (r0 != 0) goto L_0x0464
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0464
            X.1sQ r0 = X.C51966G9m.A0n(r0)
            if (r0 == 0) goto L_0x0464
            X.4gs r0 = r0.Ame()
            if (r0 == 0) goto L_0x0464
            java.lang.String r0 = r0.C3v()
            if (r0 == 0) goto L_0x0464
            X.AnonymousClass3ZC.A03(r10, r1)
        L_0x0464:
            boolean r0 = X.AnonymousClass3ZC.A0Z(r13, r1)
            if (r0 == 0) goto L_0x047b
            if (r7 == 0) goto L_0x047b
            X.1Xy r0 = r7.A0C
            java.lang.Boolean r0 = r0.CZZ()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 != r4) goto L_0x047b
            X.AnonymousClass3ZC.A03(r13, r1)
        L_0x047b:
            r0 = r19
            boolean r0 = X.AnonymousClass3ZC.A0Z(r0, r1)
            if (r0 == 0) goto L_0x0490
            if (r7 == 0) goto L_0x0490
            X.DTO r0 = r7.A1K()
            if (r0 == 0) goto L_0x0490
            r0 = r19
            X.AnonymousClass3ZC.A03(r0, r1)
        L_0x0490:
            X.GJI r10 = X.GJI.TRY_AUDIO_FILTERS
            boolean r0 = X.AnonymousClass3ZC.A0Z(r10, r1)
            if (r0 == 0) goto L_0x04a1
            boolean r0 = X.C263304Kd.A06(r9, r6)
            if (r0 == 0) goto L_0x04a1
            X.AnonymousClass3ZC.A03(r10, r1)
        L_0x04a1:
            X.GJI r9 = X.GJI.SEE_MORE_PROMPTS
            boolean r0 = X.AnonymousClass3ZC.A0Z(r9, r1)
            if (r0 == 0) goto L_0x04c2
            boolean r0 = X.AnonymousClass3ZC.A0P(r6, r7)
            if (r0 != 0) goto L_0x04c2
            if (r7 == 0) goto L_0x04c2
            X.3WT r0 = X.AnonymousClass3WT.CLIPS_PROMPT
            java.util.List r0 = r7.A3o(r0)
            if (r0 == 0) goto L_0x04c2
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r4) goto L_0x04c2
            X.AnonymousClass3ZC.A03(r9, r1)
        L_0x04c2:
            r0 = 2131443895(0x7f0b40b7, float:1.850987E38)
            java.lang.Object r9 = X.C51968G9o.A0z(r1, r0)
            X.GJI r9 = (X.GJI) r9
            r0 = 2131430780(0x7f0b0d7c, float:1.848327E38)
            java.lang.Object r7 = X.C51968G9o.A0z(r1, r0)
            X.GJI r7 = (X.GJI) r7
            r0 = 2131442064(0x7f0b3990, float:1.8506157E38)
            java.lang.Object r0 = X.C51968G9o.A0z(r1, r0)
            X.GJI r0 = (X.GJI) r0
            X.GJI[] r0 = new X.GJI[]{r9, r7, r0}
            java.util.List r10 = X.C51967G9n.A0s(r0)
            goto L_0x00f2
        L_0x04e7:
            r12 = r11
            goto L_0x0404
        L_0x04ea:
            X.AnonymousClass3ZC.A03(r12, r1)
            goto L_0x03db
        L_0x04ef:
            boolean r0 = X.AnonymousClass3YR.A00(r8)
            if (r0 != 0) goto L_0x0343
            r0 = r16
            boolean r0 = X.AnonymousClass3ZC.A0U(r6, r0)
            if (r0 != 0) goto L_0x0343
            X.GJI r0 = X.GJI.INSIGHTS
            goto L_0x0296
        L_0x0501:
            r0 = 0
            goto L_0x033b
        L_0x0504:
            r9 = r28
            goto L_0x024f
        L_0x0508:
            r1 = r28
            goto L_0x009e
        L_0x050c:
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto L_0x057b
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x057b
        L_0x0516:
            r33 = 0
        L_0x0518:
            int r1 = r0.size()
            if (r1 != r4) goto L_0x0537
            r28 = r5
            r32 = r34
            X.2WX r4 = r28.A00(r29, r30, r31, r32, r33)
            X.2Wb r3 = X.C51972G9s.A0Q(r34)
            java.lang.Object r1 = r0.get(r2)
            X.3mp r1 = (X.C251263mp) r1
            r0 = r34
            X.2Tp r28 = X.C51967G9n.A0Q(r1, r3, r0, r4)
        L_0x0536:
            return r28
        L_0x0537:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0536
            r3 = r5
            r7 = r34
            r4 = r29
            r5 = r30
            r6 = r31
            r8 = r33
            X.2WX r26 = r3.A00(r4, r5, r6, r7, r8)
            X.3Zh r27 = X.C243573Zh.FLEX_START
            X.3Zi r29 = X.C243583Zi.FLEX_END
            X.2Wb r6 = X.C51972G9s.A0Q(r34)
            java.util.Iterator r5 = r0.iterator()
        L_0x0558:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0590
            java.lang.Object r4 = r5.next()
            X.3mp r4 = (X.C251263mp) r4
            X.2V1 r3 = r6.A00
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r0 = new X.2Wb
            r0.<init>(r3, r1)
            r0.A00(r4)
            X.2Tp r0 = X.C243563Zg.A0A(r0, r6)
            r6.A00(r0)
            goto L_0x0558
        L_0x057b:
            java.util.Iterator r6 = r10.iterator()
        L_0x057f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0516
            java.lang.Object r3 = r6.next()
            X.GJI r1 = X.GJI.BLEND_SOCIAL_CONTEXT
            if (r3 != r1) goto L_0x057f
            r33 = 1
            goto L_0x0518
        L_0x0590:
            r24 = r6
            r25 = r7
            r30 = r2
            X.2Tl r28 = X.C243563Zg.A06(r24, r25, r26, r27, r28, r29, r30)
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GHL.A0X(X.3Y5):X.3mp");
    }

    private final 2WX A00(2V5 r13, 2V5 r14, 2V5 r15, C70832Wc r16, boolean z) {
        2WX r0 = 2WX.A02;
        2WX A0V = C51971G9r.A0V(r16.Aqq(), C51965G9l.A0X((2WX) null, G9t.A14()), C243533Zd.GLOBAL, "element_above_username");
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.9f, 1.0f});
            C51969G9p.A10(ofFloat);
            ofFloat.setDuration(250);
            ofFloat.addUpdateListener(new I84(r13, 34));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            C51969G9p.A10(ofFloat2);
            ofFloat2.setDuration(250);
            ofFloat2.addUpdateListener(new I84(r14, 33));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            C56678I7i.A00(animatorSet, r15, 12);
            2WX A0A = C51974G9v.A0A(r13, (2WX) null, new AnonymousClass9JS(r13, AnonymousClass05K.A1F));
            Integer num = AnonymousClass05K.A00;
            r0 = C51965G9l.A0X(C51971G9r.A0Z(C51971G9r.A0W(r14, A0A, num), num, new C58768IxF(35, r15, r13, animatorSet, r14), (String) null), new C244253at(AnonymousClass05K.A01, J6R.A00(r13, r14, 29), (String) null));
        }
        return A0V.A00(r0);
    }
}
