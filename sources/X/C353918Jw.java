package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.model.sharelater.ShareLaterMedia;
import java.util.HashMap;

/* renamed from: X.8Jw  reason: invalid class name and case insensitive filesystem */
public final class C353918Jw {
    public String A00;
    public final AnonymousClass4DH A01;
    public final 1wn A02 = new C353928Jx(this);
    public final UserSession A03;
    public final AnonymousClass8BA A04;
    public final AnonymousClass0eK A05;
    public final AnonymousClass0eM A06;
    public final int A07;
    public final Activity A08;
    public final AnonymousClass82X A09;
    public final C357638Yz A0A;
    public final TargetViewSizeProvider A0B;
    public final C352888Fl A0C;
    public final C3499582p A0D;
    public final AnonymousClass80D A0E;
    public final AnonymousClass81T A0F;
    public final AnonymousClass8DO A0G;
    public final AnonymousClass8H3 A0H;
    public final AnonymousClass8D8 A0I;
    public final StoryDraftsCreationViewModel A0J;
    public final C353508Hx A0K;
    public final AnonymousClass0eK A0L;
    public final AnonymousClass0eK A0M;
    public final AnonymousClass0eK A0N;
    public final AnonymousClass0eK A0O;

    public static void A00(C353918Jw r9) {
        1Xj r2;
        if (r9.A00 != null) {
            UserSession userSession = r9.A03;
            AnonymousClass3Q2 A032 = 28K.A00(userSession).A03(r9.A00);
            if (A032 != null) {
                0qQ.A0B(userSession, 0);
                C40270AYj aYj = (C40270AYj) userSession.A01(C40270AYj.class, new C20699WxV(userSession, 12));
                String str = r9.A00;
                String A0I2 = A032.A0I();
                HashMap A0W = r9.A04.A0W();
                0qQ.A0B(str, 0);
                if (0qQ.A0K(aYj.A01, str) && (r2 = aYj.A00) != null) {
                    r2.A49(AnonymousClass3YP.SHARING);
                    UserSession userSession2 = aYj.A03;
                    C63394KwF.A00(userSession2, "request", "upsell", aYj.A02, A0I2, A0W);
                    1OC A002 = C63421Kwh.A00(userSession2, new ShareLaterMedia(r2), AnonymousClass05K.A0N, A0I2, "upsell");
                    A002.A00 = new C385379iq(r2, aYj, A0I2, A0W);
                    1ES.A03(A002);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v130, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v140, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03cc, code lost:
        if (X.C347147wL.A00(r5) == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r8.isEmpty() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0185, code lost:
        if (r3.get() == X.28D.A5M) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r8.isEmpty() != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass0iw r20, X.C39651A3r r21, X.C39892ADt r22, java.lang.Integer r23, X.AnonymousClass0eM r24, boolean r25, boolean r26) {
        /*
            r19 = this;
            r0 = r21
            java.lang.String r9 = r0.A00
            r10 = r19
            r10.A00 = r9
            r11 = r22
            java.util.List r8 = r11.A00
            if (r8 == 0) goto L_0x0016
            boolean r0 = r8.isEmpty()
            r18 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r18 = 0
        L_0x0018:
            com.instagram.common.session.UserSession r7 = r10.A03
            if (r8 == 0) goto L_0x0023
            boolean r1 = r8.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r6 = 0
            X.0qQ.A0B(r7, r6)
            if (r0 == 0) goto L_0x0036
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r7)
            X.AXy r0 = new X.AXy
            r0.<init>()
            r1.A00(r0)
        L_0x0036:
            X.0eK r0 = r10.A0M
            java.lang.Object r1 = r0.get()
            X.8WK r1 = (X.AnonymousClass8WK) r1
            if (r1 == 0) goto L_0x0050
            r0 = r1
            X.8WJ r0 = (X.AnonymousClass8WJ) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0050
            X.80D r0 = r10.A0E
            boolean r0 = r0.A48
            if (r0 == 0) goto L_0x0050
            r1.APW()
        L_0x0050:
            X.0tS r3 = X.0tS.A00()
            X.0s0 r2 = r3.A2J
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 86
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0075
            com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r1 = r10.A0J
            X.82p r0 = r10.A0D
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.lang.String r0 = r0.A0G
            r1.A02(r0)
        L_0x0075:
            X.8D8 r1 = r10.A0I
            if (r1 == 0) goto L_0x0089
            boolean r0 = r1 instanceof X.C387979n5
            if (r0 == 0) goto L_0x0089
            X.9n5 r1 = (X.C387979n5) r1
            X.1Ng r1 = r1.A01
            X.WQ2 r0 = new X.WQ2
            r0.<init>()
            r1.A00(r0)
        L_0x0089:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0A
            boolean r0 = r11.A02(r0)
            if (r0 != 0) goto L_0x0099
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0B
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x00a0
        L_0x0099:
            X.8H3 r0 = r10.A0H
            X.3BK r1 = r0.A0D
            r0 = 1
            r1.A03 = r0
        L_0x00a0:
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.C323926yK.A02(r7, r0)
            if (r0 == 0) goto L_0x00f8
            android.app.Activity r2 = r10.A08
            java.lang.String r12 = X.C323926yK.A01(r7)
            int r0 = X.C323926yK.A00(r7)
            java.lang.String r3 = r2.getString(r0)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36323899926916695(0x810c6500002e57, double:3.034718806162554E-306)
            boolean r5 = X.182.A06(r4, r7, r0)
            r1 = 2131971920(0x7f134f50, float:1.9580833E38)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r3}
            java.lang.String r3 = r2.getString(r1, r0)
            r0 = 2131963044(0x7f132ca4, float:1.956283E38)
            java.lang.String r0 = r2.getString(r0)
            X.1xC r2 = X.1xC.A01
            X.6ap r1 = new X.6ap
            r1.<init>()
            if (r5 == 0) goto L_0x00e4
            r3 = r0
        L_0x00e4:
            r1.A0D = r3
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.A01 = r0
            r1.A0R = r4
            X.Dc2 r1 = r1.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            r2.A00(r0)
        L_0x00f8:
            X.80D r4 = r10.A0E
            X.LwN r1 = r4.A1V
            if (r1 == 0) goto L_0x012f
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x012f
            java.util.List r0 = r1.A09
            if (r0 == 0) goto L_0x012f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x010f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r1.next()
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r0 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r0
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x010f
            r2.add(r0)
            goto L_0x010f
        L_0x0123:
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r7)
            X.AY1 r0 = new X.AY1
            r0.<init>(r2)
            r1.A00(r0)
        L_0x012f:
            if (r25 == 0) goto L_0x033f
            X.2cc r1 = X.C71342cb.A00(r7)
            int r0 = r10.A07
            int r0 = r0 + 2
            r12 = 0
            r2 = r20
            r1.A0D(r2, r12, r0)
            X.2cc r0 = X.C71342cb.A00(r7)
            android.app.Activity r14 = r10.A08
            r0.A08(r14, r2)
            X.2cc r2 = X.C71342cb.A00(r7)
            X.8Fl r1 = r10.A0C
            java.lang.String r0 = "unknown"
            r2.A0E(r0, r1)
            X.82p r0 = r10.A0D
            X.82o r0 = r0.A02
            r0.A06()
            com.instagram.pendingmedia.model.UserStoryTarget r2 = com.instagram.pendingmedia.model.UserStoryTarget.A07
            boolean r0 = r11.A02(r2)
            r13 = 1
            if (r0 == 0) goto L_0x0187
            X.0eK r3 = r10.A05
            java.lang.Object r1 = r3.get()
            X.28D r0 = X.28D.A3y
            if (r1 == r0) goto L_0x0187
            java.lang.Object r1 = r3.get()
            X.28D r0 = X.28D.A3z
            if (r1 == r0) goto L_0x0187
            java.lang.Object r1 = r3.get()
            X.28D r0 = X.28D.A5L
            if (r1 == r0) goto L_0x0187
            java.lang.Object r1 = r3.get()
            X.28D r0 = X.28D.A5M
            r17 = 1
            if (r1 != r0) goto L_0x0189
        L_0x0187:
            r17 = 0
        L_0x0189:
            boolean r0 = r11.A02(r2)
            r1 = r0 ^ 1
            X.AVK r0 = r4.A0d
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x01e7
            if (r1 == 0) goto L_0x01e7
            X.AVK r15 = r4.A0d
            r15.getClass()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r10.A0B
            java.lang.Object r3 = r24.getValue()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.util.List r0 = r11.A01
            if (r0 == 0) goto L_0x01e2
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
        L_0x01b0:
            java.lang.String r1 = "If we are animating back to the stories tray, there must be valid user story targets"
            X.02V.A03(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x01be:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r1 = r16.next()
            com.instagram.pendingmedia.model.UserStoryTarget r1 = (com.instagram.pendingmedia.model.UserStoryTarget) r1
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01be
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.String r0 = r0.getId()
            r2.add(r0)
            goto L_0x01be
        L_0x01e2:
            r0 = 0
            goto L_0x01b0
        L_0x01e4:
            r15.A00(r3, r7, r5, r2)
        L_0x01e7:
            if (r17 == 0) goto L_0x0376
            X.B2s r1 = r4.A0l
            java.lang.String r0 = "media_posted_to_highlight"
            r1.CqO(r0)
        L_0x01f0:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x0356
            X.6jB r0 = X.C314986jA.A00(r7)
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            r0 = 1814(0x716, float:2.542E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r6)
            r1.apply()
        L_0x020e:
            java.lang.String r0 = r10.A00
            if (r0 == 0) goto L_0x0353
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r7)
            java.lang.String r0 = r10.A00
            X.3Q2 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0353
            java.util.List r8 = r1.A4e
            X.8BA r0 = r10.A04
            X.8C9 r0 = r0.A1D
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A03
            boolean r0 = r0.A0G
            r1.A5B = r0
        L_0x022a:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0C
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x02b0
            if (r8 == 0) goto L_0x02b0
            X.81T r3 = r10.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1 = r23
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0350
            android.content.res.Resources r1 = r14.getResources()
            X.8BA r0 = r10.A04
            X.0eK r0 = r0.A1v
            java.lang.Object r0 = r0.get()
            X.8Wi r0 = (X.C357068Wi) r0
            if (r0 == 0) goto L_0x034d
            android.graphics.Bitmap r0 = r0.A05()
        L_0x0254:
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r1, r0)
        L_0x0259:
            X.0qQ.A0B(r14, r6)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02b0
            java.lang.Object r2 = X.00k.A0O(r8, r6)
            java.lang.String r2 = (java.lang.String) r2
            android.content.res.Resources r4 = r14.getResources()
            X.6ap r1 = new X.6ap
            r1.<init>()
            if (r5 == 0) goto L_0x027c
            r1.A04 = r5
            r1.A03()
        L_0x027c:
            int r0 = r8.size()
            if (r0 != r13) goto L_0x0342
            if (r2 == 0) goto L_0x0342
            r0 = 2131973580(0x7f1355cc, float:1.95842E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0D = r0
            r1.A0L = r13
            r0 = 2131952148(0x7f130214, float:1.954073E38)
            java.lang.String r0 = r4.getString(r0)
            X.0qQ.A07(r0)
            r1.A0G = r0
            X.Ae4 r0 = new X.Ae4
            r0.<init>(r14, r3, r7, r2)
            r1.A0A = r0
        L_0x02a2:
            X.1xC r2 = X.1xC.A01
            X.Dc2 r1 = r1.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            r2.A00(r0)
        L_0x02b0:
            if (r18 != 0) goto L_0x033f
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x033f
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x033f
            if (r26 != 0) goto L_0x033f
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r7)
            java.lang.Class<X.Jy0> r1 = X.C61149Jy0.class
            X.1wn r0 = r10.A02
            r2.A01(r0, r1)
            java.lang.Object r0 = r24.getValue()
            if (r0 == 0) goto L_0x0340
            java.io.File r2 = X.0mb.A04(r14)
            java.lang.Object r1 = r24.getValue()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.content.res.Resources r0 = r14.getResources()
            android.graphics.Bitmap r0 = X.C394309xs.A00(r0, r1)
            X.1MF.A0M(r0, r2)
            java.lang.String r1 = r2.getAbsolutePath()
        L_0x02ec:
            X.8qK r2 = new X.8qK
            r2.<init>(r7)
            X.818 r0 = X.AnonymousClass818.IG_AFTER_STORY_SHARE
            X.LEO r3 = X.C63435Kwv.A00(r14, r0, r7)
            r3.A09 = r9
            X.81T r0 = r10.A0F
            r3.A02 = r0
            X.4DH r0 = r10.A01
            X.0qQ.A0B(r0, r6)
            r3.A01 = r0
            android.content.Context r0 = r0.getContext()
            r3.A00 = r0
            if (r1 == 0) goto L_0x031d
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r1 = -1
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            X.0qQ.A07(r0)
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.C253833rU.A00(r0, r1, r1)
        L_0x031d:
            r3.A03 = r12
            X.AfS r1 = new X.AfS
            r1.<init>(r10)
            r5 = 0
            X.8BA r0 = r10.A04
            boolean r0 = X.AnonymousClass8BA.A0L(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            X.9Im r4 = new X.9Im
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r4.<init>((java.lang.Boolean) r5, (java.lang.Boolean) r6, (java.lang.Boolean) r7, (java.lang.Boolean) r8, (java.lang.Boolean) r9, (java.lang.Boolean) r10, (java.lang.Boolean) r11, (java.lang.Boolean) r12)
            r2.A01(r4, r3, r1)
        L_0x033f:
            return
        L_0x0340:
            r1 = r12
            goto L_0x02ec
        L_0x0342:
            r0 = 2131973581(0x7f1355cd, float:1.9584202E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0D = r0
            goto L_0x02a2
        L_0x034d:
            r0 = 0
            goto L_0x0254
        L_0x0350:
            r5 = r12
            goto L_0x0259
        L_0x0353:
            r8 = r12
            goto L_0x022a
        L_0x0356:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A03
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x020e
            X.6jB r0 = X.C314986jA.A00(r7)
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            r0 = 1814(0x716, float:2.542E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r13)
            r1.apply()
            goto L_0x020e
        L_0x0376:
            if (r18 != 0) goto L_0x038b
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x038b
            if (r26 == 0) goto L_0x038b
            X.B2s r1 = r4.A0l
            java.lang.String r0 = "media_posted_to_feed"
            r1.Cpi(r0)
            goto L_0x01f0
        L_0x038b:
            X.B2s r15 = r4.A0l
            X.0eM r0 = r10.A06
            java.lang.Object r5 = r0.getValue()
            X.7wL r5 = (X.C347147wL) r5
            X.0eK r0 = r10.A05
            java.lang.Object r4 = r0.get()
            r0 = 3
            X.0qQ.A0B(r4, r0)
            r5.A01()
            com.instagram.common.session.UserSession r3 = r5.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342155841010009364(0x2081025400020514, double:4.059507851574506E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x03ce
            if (r18 != 0) goto L_0x03ce
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x03ce
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x03ce
            if (r26 != 0) goto L_0x03ce
            X.28D r0 = X.28D.A42
            if (r0 != r4) goto L_0x03ce
            boolean r0 = X.C347147wL.A00(r5)
            r1 = 1
            if (r0 != 0) goto L_0x03cf
        L_0x03ce:
            r1 = 0
        L_0x03cf:
            java.util.List r0 = r11.A01
            if (r0 == 0) goto L_0x03e2
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
        L_0x03d7:
            if (r8 == 0) goto L_0x03dd
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)
        L_0x03dd:
            r15.AI6(r9, r0, r8, r1)
            goto L_0x01f0
        L_0x03e2:
            r0 = 0
            goto L_0x03d7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353918Jw.A03(X.0iw, X.A3r, X.ADt, java.lang.Integer, X.0eM, boolean, boolean):void");
    }

    public C353918Jw(AnonymousClass82X r3, C357638Yz r4, AnonymousClass8BA r5, TargetViewSizeProvider targetViewSizeProvider, C352888Fl r7, C3499582p r8, AnonymousClass80D r9, AnonymousClass81T r10, AnonymousClass8DO r11, AnonymousClass8H3 r12, AnonymousClass8D8 r13, StoryDraftsCreationViewModel storyDraftsCreationViewModel, C353508Hx r15, AnonymousClass0eK r16, AnonymousClass0eK r17, AnonymousClass0eK r18, AnonymousClass0eK r19, AnonymousClass0eK r20, AnonymousClass0eM r21, int i) {
        this.A0E = r9;
        this.A03 = r9.A0S;
        this.A08 = r9.A05;
        r9.A0M.getClass();
        AnonymousClass4DH r1 = r9.A0M;
        this.A01 = r1;
        this.A0M = r16;
        this.A0D = r8;
        this.A0J = storyDraftsCreationViewModel;
        this.A0I = r13;
        this.A0H = r12;
        this.A07 = i;
        this.A0C = r7;
        this.A0B = targetViewSizeProvider;
        this.A06 = r21;
        this.A0F = r10;
        this.A04 = r5;
        this.A05 = r17;
        this.A0L = r18;
        this.A0O = r19;
        this.A0A = r4;
        this.A0G = r11;
        this.A09 = r3;
        this.A0K = r15;
        this.A0N = r20;
        r1.registerLifecycleListener(new C353938Jz(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (((X.JZA) ((X.JYE) ((X.C59939Jc3) r0.A04.A1I.A07.getValue()).A06.getValue()).A06.getValue()).A01 == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo A01(android.util.Pair r63, X.AnonymousClass9I6 r64, com.instagram.camera.effect.models.CameraAREffect r65, X.LMJ r66, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r67, X.1iA r68, java.lang.Integer r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.util.HashMap r76, java.util.List r77, java.util.List r78, java.util.List r79, int r80, int r81, boolean r82, boolean r83) {
        /*
            r62 = this;
            int r2 = r68.ordinal()
            r5 = 0
            r0 = r62
            if (r2 == r5) goto L_0x00f8
            r1 = 1
            if (r2 == r1) goto L_0x00fd
            X.8nd r27 = X.C365758nd.A06
            r50 = -1
        L_0x0010:
            X.8Yz r3 = r0.A0A
            X.80m r2 = r3.A09
            java.lang.Object r4 = r2.A00
            java.util.Set r4 = (java.util.Set) r4
            X.8aL r1 = X.C358088aL.A0p
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0042
            X.8BA r1 = r0.A04
            X.8CV r1 = r1.A1I
            X.0eM r1 = r1.A07
            java.lang.Object r1 = r1.getValue()
            X.Jc3 r1 = (X.C59939Jc3) r1
            X.0eM r1 = r1.A06
            java.lang.Object r1 = r1.getValue()
            X.JYE r1 = (X.JYE) r1
            X.0Ud r1 = r1.A06
            java.lang.Object r1 = r1.getValue()
            X.JZA r1 = (X.JZA) r1
            boolean r1 = r1.A01
            r61 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r61 = 0
        L_0x0044:
            com.instagram.common.session.UserSession r14 = r0.A03
            java.lang.Integer r30 = r3.A08()
            java.lang.Object r1 = r2.A00
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r28 = 0
            X.8DO r13 = r0.A0G
            r2 = 1
            X.82X r1 = r0.A09
            r15 = r80
            if (r15 == r2) goto L_0x00f2
            r1 = 0
        L_0x005f:
            java.util.List r45 = java.util.Collections.singletonList(r1)
            X.82p r1 = r0.A0D
            X.82o r1 = r1.A02
            X.80D r3 = r0.A0E
            java.lang.String r12 = r3.A2J
            java.lang.String r11 = r3.A2K
            X.82Y r2 = r1.A01
            boolean r10 = r2.A0N
            java.lang.String r6 = r2.A0G
            r56 = 0
            if (r6 == 0) goto L_0x0079
            r56 = 1
        L_0x0079:
            X.0eK r6 = r0.A0N
            java.lang.Object r6 = r6.get()
            java.lang.Number r6 = (java.lang.Number) r6
            long r52 = r6.longValue()
            boolean r58 = r1.A0D()
            X.8Hx r1 = r0.A0K
            boolean r59 = r1.FMp()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r0.A0B
            X.9Qn r0 = r3.A13
            if (r0 == 0) goto L_0x00f0
            X.293 r1 = r0.A01
        L_0x0097:
            if (r0 == 0) goto L_0x00ee
            X.EZl r0 = r0.A00
        L_0x009b:
            com.instagram.api.schemas.ACRType r8 = r2.A01
            com.instagram.reels.prompt.model.PromptStickerModel r7 = r2.A09
            java.lang.String r6 = r3.A2U
            java.lang.String r2 = r3.A2E
            r38 = r74
            r37 = r73
            r34 = r72
            r33 = r71
            r32 = r70
            r31 = r69
            r24 = r67
            r23 = r66
            r57 = r83
            r54 = r82
            r51 = r81
            r48 = r79
            r47 = r78
            r21 = r65
            r46 = r77
            r19 = r64
            r42 = r76
            r16 = r63
            r39 = r75
            r29 = r7
            r35 = r12
            r36 = r11
            r40 = r6
            r41 = r2
            r43 = r4
            r44 = r28
            r49 = r15
            r55 = r10
            r60 = r5
            r22 = r14
            r25 = r9
            r26 = r13
            r20 = r8
            r18 = r1
            r17 = r0
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = X.C59895JbK.A0A(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r55, r56, r57, r58, r59, r60, r61)
            return r0
        L_0x00ee:
            r0 = 0
            goto L_0x009b
        L_0x00f0:
            r1 = 0
            goto L_0x0097
        L_0x00f2:
            com.instagram.camera.effect.mq.IgCameraEffectsController r1 = r1.A05
            com.instagram.camera.effect.models.CameraAREffect r1 = r1.A09
            goto L_0x005f
        L_0x00f8:
            X.8nd r27 = X.C365758nd.A04
            X.0eK r1 = r0.A0L
            goto L_0x0101
        L_0x00fd:
            X.8nd r27 = X.C365758nd.A07
            X.0eK r1 = r0.A0O
        L_0x0101:
            java.lang.Object r1 = r1.get()
            java.lang.Number r1 = (java.lang.Number) r1
            int r50 = r1.intValue()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353918Jw.A01(android.util.Pair, X.9I6, com.instagram.camera.effect.models.CameraAREffect, X.LMJ, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, X.1iA, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.util.List, java.util.List, java.util.List, int, int, boolean, boolean):com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x033a, code lost:
        if (r160 != null) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0354, code lost:
        if (r160 != null) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r80 = X.2AL.A01(X.C393989xM.A00(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0377, code lost:
        X.0kD.A07("CameraLoggerHelper", X.002.A0R("Unable to find capture format for name: ", r4), (java.lang.Throwable) null);
        r80 = X.2AL.A00(r21, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0388, code lost:
        r63 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x038c, code lost:
        r6.put(r4, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0395, code lost:
        r4 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0399, code lost:
        r1 = new java.util.ArrayList(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x039f, code lost:
        if (r20 == null) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03a1, code lost:
        r1.add(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a6, code lost:
        if (r81 <= 0) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03a8, code lost:
        r1.add(java.lang.String.valueOf(r81));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        if (((X.JZA) ((X.JYE) ((X.C59939Jc3) r1.A1I.A07.getValue()).A06.getValue()).A06.getValue()).A01 == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0677, code lost:
        if (r3.intValue() <= 1) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r4.A0F() == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        if (r4.A0L() != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015a, code lost:
        if (r3.A0D() != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0161, code lost:
        if (r4 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0170, code lost:
        if (X.182.A06(X.0Tu.A05, r21, 36320678701441808L) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0172, code lost:
        r20 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0174, code lost:
        if (r20 != null) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0176, code lost:
        if (r81 > 0) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0178, code lost:
        r1 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017a, code lost:
        r11 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        if (r2 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0181, code lost:
        r0 = r2.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0183, code lost:
        if (r0 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0185, code lost:
        r11.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0188, code lost:
        r0 = r160;
        r62 = X.C59895JbK.A0C(r2, r0);
        r6 = new X.01r(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        if (r2 == null) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0199, code lost:
        r4 = r2.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019b, code lost:
        if (r4 == null) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019d, code lost:
        r5 = r5.B09(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a1, code lost:
        if (r5 != null) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
        X.0kD.A07("CameraLoggerHelper", X.002.A0R(X.AnonymousClass000.A00(1044), r4), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b0, code lost:
        r4 = r2.A0K;
        r2 = r2.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b4, code lost:
        r2 = X.2AL.A04(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b8, code lost:
        if (r2 == null) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ba, code lost:
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bc, code lost:
        if (r2 == null) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01be, code lost:
        r63 = java.util.Collections.singletonList(r2);
        X.0qQ.A07(r63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c5, code lost:
        r4 = r169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (r169 != null) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c9, code lost:
        r80 = X.2AL.A00(r21, r8, r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.util.Pair r159, com.instagram.camera.effect.models.CameraAREffect r160, com.instagram.common.gallery.metadata.MediaUploadMetadata r161, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r162, X.C254743sy r163, X.1iA r164, java.lang.Integer r165, java.lang.String r166, java.lang.String r167, java.lang.String r168, java.lang.String r169, java.lang.String r170, java.lang.String r171, java.lang.String r172, java.lang.String r173, java.lang.String r174, java.util.List r175, java.util.Map r176, int r177, int r178, int r179, boolean r180) {
        /*
            r158 = this;
            r20 = r167
            r0 = r158
            X.8BA r1 = r0.A04
            X.8it r3 = r1.A1q
            boolean r2 = r3.A06()
            r7 = r170
            r11 = r171
            if (r2 == 0) goto L_0x002e
            boolean r2 = X.AnonymousClass8BA.A0L(r1)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x002e
            com.instagram.common.session.UserSession r4 = r0.A03
            if (r171 == 0) goto L_0x06a5
            r8 = r11
        L_0x001f:
            java.util.HashMap r9 = r1.A0W()
            r2 = 890(0x37a, float:1.247E-42)
            java.lang.String r5 = X.C273654mx.A00(r2)
            java.lang.String r6 = "post_capture"
            X.C63394KwF.A00(r4, r5, r6, r7, r8, r9)
        L_0x002e:
            com.instagram.common.session.UserSession r2 = r0.A03
            r21 = r2
            X.818 r8 = X.AnonymousClass818.IG_STORY_COMPOSER
            boolean r13 = r3.A06()
            java.lang.Integer r2 = r1.A0S
            r9 = r21
            r10 = r2
            r12 = r7
            X.C64007LIn.A01(r8, r9, r10, r11, r12, r13)
            int r2 = r164.ordinal()
            r18 = 1
            r17 = 0
            r3 = r17
            if (r2 == r3) goto L_0x0697
            r3 = r18
            if (r2 == r3) goto L_0x0694
            r81 = -1
        L_0x0053:
            r19 = r159
            if (r159 == 0) goto L_0x0070
            r3 = r19
            java.lang.Object r4 = r3.first
            java.util.List r4 = (java.util.List) r4
            r3 = 191(0xbf, float:2.68E-43)
            java.lang.String r3 = X.C273654mx.A00(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x03d0
            X.FYu r3 = X.C48796EkJ.A00(r21)
            r3.A03()
        L_0x0070:
            X.8Yz r5 = r0.A0A
            X.80m r9 = r5.A09
            java.lang.Object r4 = r9.A00
            java.util.Set r4 = (java.util.Set) r4
            X.8aL r3 = X.C358088aL.A0p
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x00a0
            X.8CV r3 = r1.A1I
            X.0eM r3 = r3.A07
            java.lang.Object r3 = r3.getValue()
            X.Jc3 r3 = (X.C59939Jc3) r3
            X.0eM r3 = r3.A06
            java.lang.Object r3 = r3.getValue()
            X.JYE r3 = (X.JYE) r3
            X.0Ud r3 = r3.A06
            java.lang.Object r3 = r3.getValue()
            X.JZA r3 = (X.JZA) r3
            boolean r3 = r3.A01
            r89 = 1
            if (r3 != 0) goto L_0x00a2
        L_0x00a0:
            r89 = 0
        L_0x00a2:
            X.82p r3 = r0.A0D
            X.82o r6 = r3.A02
            X.82Y r7 = r6.A01
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r7.A09
            if (r4 == 0) goto L_0x00b4
            boolean r3 = r4.A0F()
            r16 = 1
            if (r3 != 0) goto L_0x00b6
        L_0x00b4:
            r16 = 0
        L_0x00b6:
            r12 = 0
            if (r4 == 0) goto L_0x03cd
            java.lang.String r3 = r4.A04
        L_0x00bb:
            java.lang.String r52 = X.C358188aV.A01(r3)
            r3 = r17
            if (r2 == r3) goto L_0x03c9
            r3 = r18
            if (r2 == r3) goto L_0x03c5
            X.28t r23 = X.28t.A04
        L_0x00c9:
            X.KkU r13 = X.C59895JbK.A07(r177)
            java.lang.Integer r8 = r5.A08()
            java.lang.Object r2 = r9.A00
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r2)
            X.80m r2 = r5.A08
            java.lang.Object r9 = r2.A00
            X.4yO r9 = (X.C279284yO) r9
            X.8DO r5 = r0.A0G
            X.82X r3 = r0.A09
            r10 = r178
            r2 = r18
            if (r10 == r2) goto L_0x03bf
            r3 = r12
        L_0x00eb:
            X.80D r2 = r0.A0E
            java.lang.String r11 = r2.A2J
            r43 = r11
            java.lang.String r11 = r2.A2K
            r44 = r11
            java.lang.String r7 = r7.A0G
            r85 = 0
            if (r7 == 0) goto L_0x00fd
            r85 = 1
        L_0x00fd:
            boolean r86 = r6.A0D()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r6 = r0.A0B
            r32 = r6
            X.81T r0 = r0.A0F
            java.lang.String r49 = r0.getModuleName()
            if (r4 == 0) goto L_0x0115
            boolean r0 = r4.A0L()
            r90 = 1
            if (r0 == 0) goto L_0x0117
        L_0x0115:
            r90 = 0
        L_0x0117:
            java.lang.String r15 = r2.A2E
            java.lang.String r0 = r2.A2U
            r56 = r0
            X.8C9 r0 = r1.A1D
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A03
            boolean r0 = r0.A0G
            java.lang.Boolean r35 = java.lang.Boolean.valueOf(r0)
            X.6if r0 = r1.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.util.HashMap r0 = r0.A0I
            r77 = r0
            if (r16 == 0) goto L_0x03b4
            if (r4 == 0) goto L_0x03b4
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r4.A00
            java.lang.String r57 = r0.getText()
        L_0x013d:
            java.lang.String r7 = r4.A03
        L_0x013f:
            r1 = r21
            r0 = r17
            X.0qQ.A0B(r1, r0)
            r0 = 3
            X.0qQ.A0B(r13, r0)
            r0 = 7
            X.0qQ.A0B(r9, r0)
            r0 = 8
            X.0qQ.A0B(r5, r0)
            if (r3 == 0) goto L_0x015c
            boolean r0 = r3.A0D()
            r2 = 0
            if (r0 == 0) goto L_0x03b1
        L_0x015c:
            r2 = r3
            if (r3 == 0) goto L_0x03b1
            java.lang.String r4 = r3.A0K
            if (r4 != 0) goto L_0x0172
        L_0x0163:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320678701441808(0x81097700002310, double:3.0326816902014017E-306)
            r3 = r21
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 != 0) goto L_0x0174
        L_0x0172:
            r20 = r4
        L_0x0174:
            if (r20 != 0) goto L_0x0399
            if (r81 > 0) goto L_0x0399
            X.0sn r1 = X.0sn.A00
        L_0x017a:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r2 == 0) goto L_0x0188
            java.lang.String r0 = r2.A0M
            if (r0 == 0) goto L_0x0188
            r11.add(r0)
        L_0x0188:
            r0 = r160
            java.util.ArrayList r62 = X.C59895JbK.A0C(r2, r0)
            X.0yf r6 = new X.0yf
            r3 = r18
            r6.<init>(r3)
            java.lang.String r3 = "CameraLoggerHelper"
            if (r2 == 0) goto L_0x0395
            java.lang.String r4 = r2.A0K
            if (r4 == 0) goto L_0x01b0
            java.lang.Integer r5 = r5.B09(r4)
            if (r5 != 0) goto L_0x038c
            r5 = 1044(0x414, float:1.463E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            java.lang.String r4 = X.002.A0R(r5, r4)
            X.0kD.A07(r3, r4, r12)
        L_0x01b0:
            java.lang.String r4 = r2.A0K
            java.lang.String r2 = r2.A0Q
        L_0x01b4:
            X.8xY r2 = X.2AL.A04(r4, r2)
            if (r2 == 0) goto L_0x0388
            java.lang.String r2 = r2.A00
            if (r2 == 0) goto L_0x0388
            java.util.List r63 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r63)
        L_0x01c5:
            r4 = r169
            if (r169 != 0) goto L_0x036d
            r2 = r21
            int r80 = X.2AL.A00(r2, r8, r10)
        L_0x01cf:
            r3 = r176
            if (r176 == 0) goto L_0x036a
            java.lang.String r2 = "audio_asset_id"
            java.lang.Object r5 = r3.get(r2)
            java.lang.String r5 = (java.lang.String) r5
        L_0x01db:
            X.27r r2 = X.27p.A01(r21)
            X.29f r8 = r2.A0A
            X.JYm r95 = X.2AL.A03(r10)
            java.lang.String r3 = "front"
            r2 = r166
            boolean r4 = X.0qQ.A0K(r2, r3)
            if (r4 == 0) goto L_0x035c
            r144 = 1
        L_0x01f1:
            if (r160 == 0) goto L_0x0352
            java.lang.String r4 = r0.A0K
            if (r4 == 0) goto L_0x0352
            java.util.List r133 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r133)
        L_0x01fe:
            java.lang.String r4 = r0.A0M
            if (r4 == 0) goto L_0x0358
            java.util.List r134 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r134)
        L_0x0209:
            X.JVj r24 = X.C59725JVj.POST_CAPTURE
            X.8aU r97 = X.C358168aT.A00(r32)
            if (r7 == 0) goto L_0x034e
            r4 = 10
            java.lang.Long r111 = X.00y.A0n(r4, r7)
        L_0x0217:
            r45 = r168
            r39 = r165
            r31 = r162
            r84 = r180
            r82 = r179
            r72 = r175
            r55 = r174
            r54 = r173
            r53 = r172
            r91 = r8
            r92 = r19
            r93 = r12
            r94 = r12
            r96 = r23
            r98 = r13
            r99 = r24
            r100 = r12
            r101 = r12
            r102 = r9
            r103 = r31
            r104 = r12
            r105 = r35
            r106 = r12
            r107 = r12
            r108 = r39
            r109 = r12
            r110 = r12
            r112 = r43
            r113 = r44
            r114 = r45
            r115 = r12
            r116 = r5
            r117 = r49
            r118 = r12
            r119 = r12
            r120 = r52
            r121 = r15
            r122 = r53
            r123 = r54
            r124 = r55
            r125 = r12
            r126 = r57
            r127 = r12
            r128 = r14
            r129 = r1
            r130 = r11
            r131 = r62
            r132 = r63
            r135 = r12
            r136 = r12
            r137 = r12
            r138 = r12
            r139 = r72
            r140 = r12
            r141 = r12
            r142 = r12
            r143 = r6
            r145 = r80
            r146 = r81
            r147 = r82
            r148 = r18
            r149 = r84
            r150 = r85
            r151 = r86
            r152 = r17
            r153 = r17
            r154 = r89
            r155 = r90
            r156 = r17
            r157 = r17
            r91.A0S(r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157)
            X.27r r4 = X.27p.A01(r21)
            X.29f r4 = r4.A0A
            X.JYm r22 = X.2AL.A03(r10)
            boolean r3 = X.0qQ.A0K(r2, r3)
            if (r3 == 0) goto L_0x0340
            r79 = 1
        L_0x02b8:
            if (r160 == 0) goto L_0x0338
            java.lang.String r2 = r0.A0K
            if (r2 == 0) goto L_0x0338
            java.util.List r64 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r64)
        L_0x02c5:
            java.lang.String r0 = r0.A0M
            if (r0 == 0) goto L_0x033d
            java.util.List r65 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r65)
        L_0x02d0:
            java.util.List r71 = java.util.Collections.singletonList(r13)
            X.0qQ.A07(r71)
            if (r7 == 0) goto L_0x0335
            r0 = 10
            java.lang.Long r42 = X.00y.A0n(r0, r7)
        L_0x02df:
            r34 = r163
            r29 = r161
            r20 = r12
            r21 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r12
            r30 = r9
            r33 = r12
            r36 = r12
            r37 = r12
            r38 = r12
            r40 = r12
            r41 = r12
            r46 = r12
            r47 = r5
            r48 = r12
            r50 = r12
            r51 = r12
            r58 = r12
            r59 = r14
            r60 = r1
            r61 = r11
            r66 = r12
            r67 = r12
            r68 = r12
            r69 = r12
            r70 = r12
            r73 = r12
            r74 = r12
            r75 = r12
            r76 = r6
            r78 = r10
            r83 = r18
            r87 = r17
            r88 = r17
            r91 = r17
            r92 = r17
            r93 = r17
            r18 = r4
            r18.A0T(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)
            return
        L_0x0335:
            r42 = r12
            goto L_0x02df
        L_0x0338:
            r64 = r12
            if (r160 == 0) goto L_0x033d
            goto L_0x02c5
        L_0x033d:
            r65 = r12
            goto L_0x02d0
        L_0x0340:
            java.lang.String r3 = "back"
            boolean r2 = X.0qQ.A0K(r2, r3)
            r79 = -1
            if (r2 == 0) goto L_0x02b8
            r79 = 2
            goto L_0x02b8
        L_0x034e:
            r111 = r12
            goto L_0x0217
        L_0x0352:
            r133 = r12
            if (r160 == 0) goto L_0x0358
            goto L_0x01fe
        L_0x0358:
            r134 = r12
            goto L_0x0209
        L_0x035c:
            java.lang.String r4 = "back"
            boolean r4 = X.0qQ.A0K(r2, r4)
            r144 = -1
            if (r4 == 0) goto L_0x01f1
            r144 = 2
            goto L_0x01f1
        L_0x036a:
            r5 = r12
            goto L_0x01db
        L_0x036d:
            java.lang.Integer r2 = X.C393989xM.A00(r4)     // Catch:{ IllegalArgumentException -> 0x0377 }
            int r80 = X.2AL.A01(r2)     // Catch:{ IllegalArgumentException -> 0x0377 }
            goto L_0x01cf
        L_0x0377:
            java.lang.String r2 = "Unable to find capture format for name: "
            java.lang.String r2 = X.002.A0R(r2, r4)
            X.0kD.A07(r3, r2, r12)
            r2 = r21
            int r80 = X.2AL.A00(r2, r8, r10)
            goto L_0x01cf
        L_0x0388:
            r63 = 0
            goto L_0x01c5
        L_0x038c:
            java.lang.String r5 = r5.toString()
            r6.put(r4, r5)
            goto L_0x01b0
        L_0x0395:
            r4 = 0
            r2 = 0
            goto L_0x01b4
        L_0x0399:
            r0 = 3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            if (r20 == 0) goto L_0x03a6
            r0 = r20
            r1.add(r0)
        L_0x03a6:
            if (r81 <= 0) goto L_0x017a
            java.lang.String r0 = java.lang.String.valueOf(r81)
            r1.add(r0)
            goto L_0x017a
        L_0x03b1:
            r4 = 0
            goto L_0x0163
        L_0x03b4:
            r57 = r12
            if (r16 == 0) goto L_0x03bc
            if (r4 == 0) goto L_0x03bc
            goto L_0x013d
        L_0x03bc:
            r7 = r12
            goto L_0x013f
        L_0x03bf:
            com.instagram.camera.effect.mq.IgCameraEffectsController r2 = r3.A05
            com.instagram.camera.effect.models.CameraAREffect r3 = r2.A09
            goto L_0x00eb
        L_0x03c5:
            X.28t r23 = X.28t.A06
            goto L_0x00c9
        L_0x03c9:
            X.28t r23 = X.28t.A05
            goto L_0x00c9
        L_0x03cd:
            r3 = r12
            goto L_0x00bb
        L_0x03d0:
            r3 = r19
            java.lang.Object r4 = r3.first
            java.util.List r4 = (java.util.List) r4
            r3 = 82
            java.lang.String r3 = X.C273654mx.A00(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0544
            X.80D r3 = r0.A0E
            X.WaH r9 = r3.A1W
            if (r9 != 0) goto L_0x03fc
            java.util.ArrayList r4 = r1.A0V()
            X.3WT r3 = X.AnonymousClass3WT.JOIN_CHAT
            X.3ui r3 = X.AnonymousClass497.A00(r3, r4)
            r3.getClass()
            X.WaH r9 = r3.A0A()
            r9.getClass()
        L_0x03fc:
            boolean r3 = r9.A07()
            if (r3 == 0) goto L_0x04a6
            X.6gx r12 = X.C313746gw.A00(r21)
            int r15 = r9.A00()
            java.lang.String r8 = r9.A02()
            X.UOB r3 = r9.A00
            java.lang.String r7 = r3.A0L
            java.lang.String r14 = r3.A0F
            java.lang.String r13 = r3.A0I
            boolean r4 = r9.A01
            boolean r11 = r9.A02
            boolean r10 = r9.A03
            X.0wc r3 = r12.A03
            X.1Ln r6 = X.1Ln.A0E(r3)
            X.0Aj r3 = r6.A00
            boolean r3 = r3.isSampled()
            if (r3 == 0) goto L_0x04a6
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            if (r14 == 0) goto L_0x0436
            java.lang.String r3 = "entrypoint"
            r5.put(r3, r14)
        L_0x0436:
            if (r8 == 0) goto L_0x0443
            if (r13 == 0) goto L_0x0443
            r3 = 368(0x170, float:5.16E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.put(r3, r13)
        L_0x0443:
            if (r4 == 0) goto L_0x0540
            java.lang.String r4 = "True"
        L_0x0447:
            java.lang.String r3 = "is_chat_creator"
            r5.put(r3, r4)
            if (r11 == 0) goto L_0x053c
            java.lang.String r4 = "True"
        L_0x0450:
            r3 = 1503(0x5df, float:2.106E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.put(r3, r4)
            if (r10 == 0) goto L_0x0538
            java.lang.String r4 = "True"
        L_0x045d:
            r3 = 677(0x2a5, float:9.49E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.put(r3, r4)
            long r3 = r12.A02
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.A0h(r3)
            r3 = 3819(0xeeb, float:5.352E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r6.A0l(r3)
            java.lang.String r3 = "tap"
            r6.A0k(r3)
            java.lang.String r3 = "create_button"
            r6.A0p(r3)
            java.lang.String r3 = "story"
            r6.A0q(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            java.lang.String r3 = X.C313746gw.A01(r3)
            r6.A0o(r3)
            r6.A0s(r8)
            if (r7 == 0) goto L_0x0535
            r3 = 10
            java.lang.Long r3 = X.00y.A0n(r3, r7)
        L_0x049d:
            r6.A0i(r3)
            r6.A0w(r5)
            r6.Cgf()
        L_0x04a6:
            X.UOB r3 = r9.A00
            com.instagram.reels.chat.model.ChatStickerChannelType r4 = r3.A03
            if (r4 != 0) goto L_0x04ae
            com.instagram.reels.chat.model.ChatStickerChannelType r4 = com.instagram.reels.chat.model.ChatStickerChannelType.DISCOVERABLE
        L_0x04ae:
            com.instagram.reels.chat.model.ChatStickerChannelType r3 = com.instagram.reels.chat.model.ChatStickerChannelType.DISCOVERABLE
            if (r4 != r3) goto L_0x0070
            X.FYv r7 = X.C69866NtU.A00(r21)
            java.lang.String r6 = r9.A02()
            X.UOB r3 = r9.A00
            java.lang.String r5 = r3.A0L
            java.lang.String r11 = r3.A0F
            java.lang.String r8 = r3.A0I
            boolean r4 = r9.A01
            X.0wc r3 = r7.A02
            X.1Ln r10 = X.1Ln.A0F(r3)
            X.0Aj r3 = r10.A00
            boolean r3 = r3.isSampled()
            if (r3 == 0) goto L_0x0070
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            if (r11 == 0) goto L_0x04de
            java.lang.String r3 = "entrypoint"
            r9.put(r3, r11)
        L_0x04de:
            if (r6 == 0) goto L_0x04eb
            if (r8 == 0) goto L_0x04eb
            r3 = 368(0x170, float:5.16E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r9.put(r3, r8)
        L_0x04eb:
            if (r4 == 0) goto L_0x0532
            java.lang.String r4 = "True"
        L_0x04ef:
            java.lang.String r3 = "is_chat_creator"
            r9.put(r3, r4)
            long r3 = r7.A01
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.A0h(r3)
            r3 = 3820(0xeec, float:5.353E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r10.A0l(r3)
            java.lang.String r3 = "tap"
            r10.A0k(r3)
            java.lang.String r3 = "create_button"
            r10.A0p(r3)
            java.lang.String r3 = "story"
            r10.A0q(r3)
            java.lang.String r3 = "instagram"
            r10.A0o(r3)
            r10.A0s(r6)
            if (r5 == 0) goto L_0x0530
            r3 = 10
            java.lang.Long r3 = X.00y.A0n(r3, r5)
        L_0x0525:
            r10.A0i(r3)
        L_0x0528:
            r10.A0w(r9)
            r10.Cgf()
            goto L_0x0070
        L_0x0530:
            r3 = 0
            goto L_0x0525
        L_0x0532:
            java.lang.String r4 = "False"
            goto L_0x04ef
        L_0x0535:
            r3 = 0
            goto L_0x049d
        L_0x0538:
            java.lang.String r4 = "False"
            goto L_0x045d
        L_0x053c:
            java.lang.String r4 = "False"
            goto L_0x0450
        L_0x0540:
            java.lang.String r4 = "False"
            goto L_0x0447
        L_0x0544:
            r3 = r19
            java.lang.Object r4 = r3.first
            java.util.List r4 = (java.util.List) r4
            r3 = 84
            java.lang.String r3 = X.C273654mx.A00(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0645
            java.util.ArrayList r4 = r1.A0V()
            X.3WT r3 = X.AnonymousClass3WT.MESSAGE_SHARE
            X.3ui r3 = X.AnonymousClass497.A00(r3, r4)
            r3.getClass()
            X.8D7 r5 = r3.A13
            r5.getClass()
            X.UOB r6 = r5.A0E
            if (r6 == 0) goto L_0x0570
            com.instagram.reels.chat.model.ChatStickerChannelType r4 = r6.A03
            if (r4 != 0) goto L_0x0572
        L_0x0570:
            com.instagram.reels.chat.model.ChatStickerChannelType r4 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
        L_0x0572:
            com.instagram.reels.chat.model.ChatStickerChannelType r3 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
            if (r4 != r3) goto L_0x0070
            X.6gx r14 = X.C313746gw.A00(r21)
            int r16 = r5.A00()
            if (r6 == 0) goto L_0x0584
            java.lang.String r12 = r6.A0K
            if (r12 != 0) goto L_0x0586
        L_0x0584:
            java.lang.String r12 = ""
        L_0x0586:
            if (r6 == 0) goto L_0x0642
            java.lang.String r11 = r6.A0L
        L_0x058a:
            java.lang.String r8 = r5.A07
            boolean r4 = r5.A0B
            boolean r13 = r5.A0D
            boolean r7 = r5.A0C
            java.lang.String r15 = r5.A06
            java.lang.String r6 = r5.A09
            boolean r5 = r5.A0A
            X.0wc r3 = r14.A03
            X.1Ln r10 = X.1Ln.A0E(r3)
            X.0Aj r3 = r10.A00
            boolean r3 = r3.isSampled()
            if (r3 == 0) goto L_0x0070
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r3 = "mid"
            r9.put(r3, r8)
            if (r4 == 0) goto L_0x063e
            java.lang.String r4 = "True"
        L_0x05b4:
            java.lang.String r3 = "is_chat_creator"
            r9.put(r3, r4)
            if (r13 == 0) goto L_0x063b
            java.lang.String r4 = "True"
        L_0x05bd:
            r3 = 677(0x2a5, float:9.49E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r9.put(r3, r4)
            if (r7 == 0) goto L_0x0638
            java.lang.String r4 = "True"
        L_0x05ca:
            r3 = 1503(0x5df, float:2.106E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r9.put(r3, r4)
            java.lang.String r3 = "user_type"
            r9.put(r3, r6)
            if (r5 == 0) goto L_0x0635
            r3 = 1261(0x4ed, float:1.767E-42)
        L_0x05dc:
            java.lang.String r4 = X.AnonymousClass000.A00(r3)
            r3 = 3975(0xf87, float:5.57E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r9.put(r3, r4)
            long r3 = r14.A02
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.A0h(r3)
            r3 = 381(0x17d, float:5.34E-43)
            java.lang.String r3 = X.C66579MXk.A00(r3)
            r10.A0l(r3)
            java.lang.String r3 = "tap"
            r10.A0k(r3)
            java.lang.String r3 = "create_button"
            r10.A0p(r3)
            java.lang.String r3 = "story"
            r10.A0q(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            java.lang.String r3 = X.C313746gw.A01(r3)
            r10.A0o(r3)
            r10.A0s(r12)
            if (r11 == 0) goto L_0x0633
            r3 = 10
            java.lang.Long r3 = X.00y.A0n(r3, r11)
        L_0x0620:
            r10.A0i(r3)
            java.lang.String r3 = "item_id"
            r10.A0R(r3, r8)
            r3 = 111(0x6f, float:1.56E-43)
            java.lang.String r3 = X.C66579MXk.A00(r3)
            r10.A0R(r3, r15)
            goto L_0x0528
        L_0x0633:
            r3 = 0
            goto L_0x0620
        L_0x0635:
            r3 = 648(0x288, float:9.08E-43)
            goto L_0x05dc
        L_0x0638:
            java.lang.String r4 = "False"
            goto L_0x05ca
        L_0x063b:
            java.lang.String r4 = "False"
            goto L_0x05bd
        L_0x063e:
            java.lang.String r4 = "False"
            goto L_0x05b4
        L_0x0642:
            r11 = 0
            goto L_0x058a
        L_0x0645:
            r3 = r19
            java.lang.Object r4 = r3.first
            java.util.List r4 = (java.util.List) r4
            r3 = 67
            java.lang.String r3 = X.C273654mx.A00(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0070
            java.util.ArrayList r4 = r1.A0V()
            X.3WT r3 = X.AnonymousClass3WT.CHALLENGE_CHAT
            X.3ui r3 = X.AnonymousClass497.A00(r3, r4)
            r3.getClass()
            X.LwN r5 = r3.A0w
            r5.getClass()
            X.UNV r6 = r5.A00
            java.lang.Integer r3 = r5.A02
            if (r3 == 0) goto L_0x0679
            int r4 = r3.intValue()
            r16 = 1
            r3 = r18
            if (r4 > r3) goto L_0x067b
        L_0x0679:
            r16 = 0
        L_0x067b:
            X.OyR r7 = X.C69869NtX.A00(r21)
            java.lang.String r9 = r6.A07
            java.lang.String r10 = r6.A06
            java.lang.Integer r8 = r6.A02
            java.lang.String r11 = r6.A03
            java.lang.String r12 = r5.A07
            java.lang.String r13 = r5.A03
            java.lang.String r14 = r5.A05
            java.lang.String r15 = r5.A08
            r7.A05(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0070
        L_0x0694:
            X.0eK r3 = r0.A0O
            goto L_0x0699
        L_0x0697:
            X.0eK r3 = r0.A0L
        L_0x0699:
            java.lang.Object r3 = r3.get()
            java.lang.Number r3 = (java.lang.Number) r3
            int r81 = r3.intValue()
            goto L_0x0053
        L_0x06a5:
            java.util.UUID r2 = X.AnonymousClass0HM.A00()
            java.lang.String r8 = r2.toString()
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353918Jw.A02(android.util.Pair, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, X.3sy, X.1iA, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, int, int, int, boolean):void");
    }
}
