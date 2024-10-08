package X;

import android.content.Context;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;

/* renamed from: X.GBx  reason: case insensitive filesystem */
public final class C52025GBx {
    public boolean A00;
    public final GDR A01;
    public final C52022GBt A02;
    public final ClipsMidcardVirtualVideoPlayerController A03;
    public final C52016GBn A04;
    public final C52012GBj A05;
    public final Context A06;
    public final AnonymousClass07V A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;
    public final AnonymousClass93U A0A;
    public final C55684Hlh A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r5 == com.instagram.api.schemas.InstagramMidcardType.A0F) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r3.A01().A05 == com.instagram.api.schemas.InstagramMidcardType.A0C) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C267324bN r19, X.C52079GDz r20, X.C52025GBx r21, int r22, int r23, boolean r24) {
        /*
            r3 = r19
            r13 = r20
            r2 = r21
            r0 = r22
            if (r24 == 0) goto L_0x01f2
            boolean r1 = A01(r3)
            if (r1 != 0) goto L_0x01f2
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r10 = r2.A03
            X.GmI r1 = r3.A01()
            X.Gok r1 = r1.A06
            if (r1 == 0) goto L_0x01ef
            com.instagram.api.schemas.MidCardLayoutType r4 = r1.A07
        L_0x001c:
            com.instagram.api.schemas.MidCardLayoutType r1 = com.instagram.api.schemas.MidCardLayoutType.GRID
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r1)
            r10.A01 = r1
            X.GmI r1 = r3.A01()
            com.instagram.api.schemas.InstagramMidcardType r5 = r1.A05
            com.instagram.api.schemas.InstagramMidcardType r7 = com.instagram.api.schemas.InstagramMidcardType.A0a
            if (r5 == r7) goto L_0x0033
            com.instagram.api.schemas.InstagramMidcardType r4 = com.instagram.api.schemas.InstagramMidcardType.A0F
            r1 = 0
            if (r5 != r4) goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            r12 = 0
            if (r1 != 0) goto L_0x0042
            X.GmI r1 = r3.A01()
            com.instagram.api.schemas.InstagramMidcardType r4 = r1.A05
            com.instagram.api.schemas.InstagramMidcardType r1 = com.instagram.api.schemas.InstagramMidcardType.A0C
            r6 = 0
            if (r4 != r1) goto L_0x0043
        L_0x0042:
            r6 = 1
        L_0x0043:
            java.util.List r1 = r13.A0D
            if (r1 == 0) goto L_0x0142
            java.lang.Object r4 = X.00k.A0O(r1, r12)
            X.Hlk r4 = (X.C55687Hlk) r4
            if (r4 == 0) goto L_0x0142
            android.view.TextureView r4 = r4.A00
            if (r4 == 0) goto L_0x0142
            X.5o2 r5 = r3.A01
            X.5o2 r4 = X.C295365o2.MIDCARD
            if (r5 != r4) goto L_0x0142
            if (r6 == 0) goto L_0x0142
            X.GmI r4 = r3.A01()
            com.instagram.api.schemas.InstagramMidcardType r5 = r4.A05
            if (r5 == r7) goto L_0x0152
            com.instagram.api.schemas.InstagramMidcardType r4 = com.instagram.api.schemas.InstagramMidcardType.A0F
            if (r5 == r4) goto L_0x0152
            X.GmI r4 = r3.A01()
            com.instagram.api.schemas.InstagramMidcardType r5 = r4.A05
            com.instagram.api.schemas.InstagramMidcardType r4 = com.instagram.api.schemas.InstagramMidcardType.A0C
            if (r5 != r4) goto L_0x00aa
            boolean r8 = r10.A01
            r6 = 0
            r4 = 758(0x2f6, float:1.062E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r4)
            android.content.Context r7 = r10.A02
            com.instagram.common.session.UserSession r5 = r10.A05
            if (r8 == 0) goto L_0x00fc
            X.I04 r4 = new X.I04
            r4.<init>(r7, r5)
            r10.sequentialPlayerManager = r4
            X.GmI r4 = r3.A01()
            java.util.List r7 = r4.A0F
            if (r7 == 0) goto L_0x00aa
            int r1 = r1.size()
            r4 = 4
            if (r1 != r4) goto L_0x022d
            int r1 = r7.size()
            if (r1 != r4) goto L_0x022d
            X.07V r1 = r10.A03
            X.0xx r5 = X.C71772f0.A00(r1)
            X.Im4 r1 = new X.Im4
            r1.<init>(r13, r10, r7, r6)
        L_0x00a7:
            X.AnonymousClass7TE.A1Z(r1, r5)
        L_0x00aa:
            com.instagram.common.session.UserSession r14 = r2.A08
            X.4DU r5 = r2.A09
            X.Hlh r4 = r2.A0B
            X.93U r7 = r2.A0A
            X.07V r13 = r2.A07
            X.GmI r15 = r3.A01()
            java.lang.String r16 = "ClipsMidcardPlaybackCoordinator"
            java.lang.String r11 = r15.A0D
            java.lang.String r1 = X.I3w.A00
            boolean r1 = X.0qQ.A0K(r11, r1)
            if (r1 != 0) goto L_0x04e6
            X.I3w.A00 = r11
            r12 = 3
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r14)
            java.lang.String r1 = "instagram_clips_midcard_impression"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r9.isSampled()
            if (r1 == 0) goto L_0x03f5
            java.util.List r8 = r15.A0H
            java.util.List r1 = X.00k.A0d(r8, r12)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x00e5:
            boolean r1 = r2.hasNext()
            r3 = 0
            if (r1 == 0) goto L_0x037b
            X.1Xj r1 = X.C51968G9o.A0n(r2)
            if (r1 == 0) goto L_0x00e5
            java.lang.String r1 = r1.A30()
            if (r1 == 0) goto L_0x00e5
            X.C51973G9u.A1F(r1, r6)
            goto L_0x00e5
        L_0x00fc:
            X.HnX r8 = new X.HnX
            r8.<init>(r7, r5, r9)
            r10.midcardPlayerManager = r8
            java.lang.Object r1 = r1.get(r12)
            X.Hlk r1 = (X.C55687Hlk) r1
            android.view.TextureView r7 = r1.A00
            if (r7 == 0) goto L_0x04e7
            X.LVB r1 = r8.A00
            if (r1 != 0) goto L_0x0125
            android.content.Context r5 = r8.A01
            com.instagram.common.session.UserSession r4 = r8.A02
            X.LVB r1 = new X.LVB
            r13 = r1
            r14 = r5
            r15 = r7
            r16 = r4
            r17 = r6
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            r8.A00 = r1
        L_0x0125:
            X.GmI r1 = r3.A01()
            java.util.List r1 = r1.A0F
            if (r1 == 0) goto L_0x00aa
            java.lang.String r7 = X.C51966G9m.A1G(r1, r12)
            if (r7 == 0) goto L_0x00aa
            X.07V r1 = r10.A03
            X.0xx r5 = X.C71772f0.A00(r1)
            r4 = 14
            X.IlT r1 = new X.IlT
            r1.<init>(r10, r7, r6, r4)
            goto L_0x00a7
        L_0x0142:
            X.0wj r5 = X.0wj.A01
            r4 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r1 = "ClipsMidcardVirtualVideoPlayerController"
            X.0f9 r5 = r5.AEf(r1, r4)
            java.lang.String r4 = "message"
            java.lang.String r1 = "failed to resume virtual video player"
            goto L_0x016c
        L_0x0152:
            r11 = 1
            com.instagram.common.session.UserSession r9 = r10.A05
            X.GLi r4 = X.C52266GLh.A00(r9)
            X.I75 r8 = r4.A00
            if (r8 != 0) goto L_0x0174
            X.0wj r5 = X.0wj.A01
            r4 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r1 = "ClipsMidcardVirtualVideoPlayerController"
            X.0f9 r5 = r5.AEf(r1, r4)
            java.lang.String r4 = "message"
            java.lang.String r1 = "failed to retrieve medias"
        L_0x016c:
            r5.ABQ(r4, r1)
            r5.report()
            goto L_0x00aa
        L_0x0174:
            X.GmI r4 = r3.A01()
            java.lang.String r7 = r4.A0C
            java.lang.String r16 = "Required value was null."
            if (r7 == 0) goto L_0x0500
            X.GmI r4 = r3.A01()
            java.util.List r6 = r4.A0I
            if (r6 == 0) goto L_0x04fb
            X.GmI r4 = r3.A01()
            java.util.List r5 = r4.A0J
            if (r5 == 0) goto L_0x04f6
            X.GmI r4 = r3.A01()
            com.instagram.music.common.model.AudioOverlayTrack r4 = r4.A0A
            if (r4 == 0) goto L_0x04f1
            android.content.Context r15 = r10.A02
            java.lang.String r14 = "reels_acr_midcard"
            X.HnX r13 = new X.HnX
            r13.<init>(r15, r9, r14)
            r10.midcardPlayerManager = r13
            java.lang.Object r1 = r1.get(r12)
            X.Hlk r1 = (X.C55687Hlk) r1
            android.view.TextureView r12 = r1.A00
            if (r12 == 0) goto L_0x04ec
            X.LVB r1 = r13.A00
            if (r1 != 0) goto L_0x01c6
            android.content.Context r1 = r13.A01
            r17 = r1
            com.instagram.common.session.UserSession r15 = r13.A02
            r20 = 0
            X.LVB r1 = new X.LVB
            r16 = r1
            r18 = r12
            r19 = r15
            r21 = r14
            r16.<init>(r17, r18, r19, r20, r21)
            r13.A00 = r1
        L_0x01c6:
            X.07V r1 = r10.A03
            X.0xx r1 = X.C71772f0.A00(r1)
            r20 = 0
            r21 = 5
            X.MGr r12 = new X.MGr
            r17 = r5
            r18 = r8
            r19 = r7
            r14 = r3
            r15 = r4
            r16 = r6
            r13 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = 3
            X.AnonymousClass7TE.A1Z(r12, r1)
            r10.A00 = r11
            X.1wS r1 = X.1wS.A01(r9)
            r1.A0C(r4)
            goto L_0x00aa
        L_0x01ef:
            r4 = 0
            goto L_0x001c
        L_0x01f2:
            boolean r1 = A01(r3)
            if (r1 == 0) goto L_0x0250
            X.GDR r14 = r2.A01
            if (r24 == 0) goto L_0x024b
            android.app.Application r5 = r14.A0D()
            com.instagram.common.session.UserSession r4 = r14.A06
            X.Hqu r1 = new X.Hqu
            r1.<init>(r5, r4)
            r14.A00 = r1
            X.GmI r1 = r3.A01()
            java.util.List r15 = r1.A0F
            if (r15 == 0) goto L_0x00aa
            int r4 = r15.size()
            java.util.List r1 = r13.A0D
            if (r1 == 0) goto L_0x0225
            int r1 = r1.size()
            if (r4 != r1) goto L_0x0225
            r1 = 4
            if (r4 == r1) goto L_0x0239
            r1 = 5
            if (r4 == r1) goto L_0x0239
        L_0x0225:
            X.0wj r5 = X.0wj.A01
            r4 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r1 = "ClipsMidCardMegacardVideoPlayerViewModel: insufficient number of drafts for mega card layout"
            goto L_0x0234
        L_0x022d:
            X.0wj r5 = X.0wj.A01
            r4 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r1 = "ClipsMidcardVirtualVideoPlayerController: insufficient number of drafts for grid layout"
        L_0x0234:
            r5.AEf(r1, r4)
            goto L_0x00aa
        L_0x0239:
            X.6oS r1 = X.C318116oQ.A00(r14)
            r16 = 0
            X.Im3 r12 = new X.Im3
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            X.AnonymousClass7TE.A1Z(r12, r1)
            goto L_0x00aa
        L_0x024b:
            r14.CNH(r3, r13, r0)
            goto L_0x00aa
        L_0x0250:
            X.GBt r6 = r2.A02
            r10 = 1
            X.GmI r1 = r3.A01()
            X.Gok r1 = r1.A06
            if (r1 == 0) goto L_0x02b5
            com.instagram.api.schemas.MidCardLayoutType r4 = r1.A07
        L_0x025d:
            com.instagram.api.schemas.MidCardLayoutType r1 = com.instagram.api.schemas.MidCardLayoutType.GRID
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r1)
            r6.A01 = r1
            java.lang.String r9 = "message"
            java.lang.String r8 = "ClipsMultipleVideoPlayerController"
            r5 = 817902720(0x30c03480, float:1.398476E-9)
            X.5o2 r4 = r3.A01
            X.5o2 r1 = X.C295365o2.MIDCARD
            if (r4 == r1) goto L_0x0282
            X.0wj r1 = X.0wj.A01
            X.0f9 r4 = r1.AEf(r8, r5)
            java.lang.String r1 = "failed to resume multiple players"
        L_0x027a:
            r4.ABQ(r9, r1)
            r4.report()
            goto L_0x00aa
        L_0x0282:
            X.GmI r1 = r3.A01()
            java.util.List r1 = r1.A0H
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x0290:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x02a0
            X.1Xj r1 = X.C51968G9o.A0n(r4)
            if (r1 == 0) goto L_0x0290
            r11.add(r1)
            goto L_0x0290
        L_0x02a0:
            java.util.List r7 = r13.A0C
            int r4 = r7.size()
            int r1 = r11.size()
            if (r4 <= r1) goto L_0x02b7
            X.0wj r1 = X.0wj.A01
            X.0f9 r4 = r1.AEf(r8, r5)
            java.lang.String r1 = "insufficient medias to bind to players"
            goto L_0x027a
        L_0x02b5:
            r4 = 0
            goto L_0x025d
        L_0x02b7:
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            java.util.Iterator r16 = r7.iterator()     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            r4 = 0
        L_0x02c4:
            boolean r1 = r16.hasNext()     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            if (r1 == 0) goto L_0x0322
            java.lang.Object r13 = r16.next()     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            int r15 = r4 + 1
            if (r4 >= 0) goto L_0x02da
            X.0sr.A1T()     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            throw r1     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
        L_0x02da:
            X.JQi r13 = (X.C59614JQi) r13     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            java.lang.Object r1 = r11.get(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.1Xj r1 = (X.1Xj) r1     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            boolean r1 = r1.CeS()     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            if (r1 == 0) goto L_0x031b
            java.lang.Object r9 = r11.get(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            java.lang.Object r8 = r11.get(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.1Xj r8 = (X.1Xj) r8     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            boolean r22 = X.AnonymousClass7TF.A1Q(r4)
            com.instagram.common.session.UserSession r14 = r6.A03     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.0iw r7 = r6.A02     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            r1 = 2
            java.lang.String r1 = X.C66579MXk.A00(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.0qQ.A0C(r7, r1)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.4DU r7 = (X.AnonymousClass4DU) r7     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.Uty r4 = new X.Uty     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            r4.<init>(r14, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            X.HGt r1 = new X.HGt     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            r17 = r1
            r18 = r8
            r19 = r4
            r20 = r13
            r21 = r0
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            r5.put(r9, r1)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
        L_0x031b:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            r12.add(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0322 }
            r4 = r15
            goto L_0x02c4
        L_0x0322:
            r6.A00 = r10
            com.instagram.common.session.UserSession r1 = r6.A03
            X.1wS r7 = X.1wS.A01(r1)
            boolean r1 = r6.A01
            r4 = 3
            if (r1 == 0) goto L_0x0343
            X.GmI r1 = r3.A01()
            X.Gok r1 = r1.A06
            if (r1 == 0) goto L_0x0343
            X.Goh r1 = r1.A06
            if (r1 == 0) goto L_0x0343
            java.util.List r1 = r1.A08
            if (r1 == 0) goto L_0x0343
            int r4 = r1.size()
        L_0x0343:
            r7.A0C(r4)
            boolean r1 = r6.A01
            if (r1 == 0) goto L_0x0374
            X.GBv r7 = r6.A04
            java.util.Collection r1 = r5.values()
            java.util.ArrayList r1 = X.00k.A0U(r1)
            r7.A04 = r1
            X.IbB r1 = r7.A03
            if (r1 != 0) goto L_0x0367
            android.content.Context r6 = r7.A05
            com.instagram.common.session.UserSession r5 = r7.A07
            X.0iw r4 = r7.A06
            X.IbB r1 = new X.IbB
            r1.<init>(r6, r4, r5, r7)
            r7.A03 = r1
        L_0x0367:
            int r4 = r7.A00
            r1 = -1
            if (r4 != r1) goto L_0x036f
            r1 = 0
            r7.A00 = r1
        L_0x036f:
            X.C52024GBv.A01(r7)
            goto L_0x00aa
        L_0x0374:
            X.GBu r1 = r6.concurrentPlayerManager
            r1.A01(r5)
            goto L_0x00aa
        L_0x037b:
            java.lang.String r10 = r5.getModuleName()
            X.Gok r1 = r15.A06
            if (r1 == 0) goto L_0x0406
            com.instagram.api.schemas.MidCardLayoutType r1 = r1.A07
            if (r1 == 0) goto L_0x0406
            int r2 = r1.ordinal()
            r1 = 2
            if (r2 == r1) goto L_0x0403
            r1 = 1
            if (r2 == r1) goto L_0x0400
            if (r2 == r12) goto L_0x03fd
            r1 = 4
            if (r2 != r1) goto L_0x0406
            X.5OC r1 = X.AnonymousClass5OC.THREE_CLIPS
        L_0x0398:
            X.C51965G9l.A1C(r1, r9)
            X.C51965G9l.A1M(r9, r10)
            r10 = 0
            X.0qQ.A0B(r11, r10)
            long r1 = X.DbZ.A07(r11)
            X.C51970G9q.A1A(r9, r1)
            long r1 = (long) r0
            X.C51974G9v.A0q(r9, r7, r1)
            X.C51973G9u.A10(r9)
            com.instagram.api.schemas.InstagramMidcardType r2 = r15.A05
            com.instagram.api.schemas.InstagramMidcardType r1 = com.instagram.api.schemas.InstagramMidcardType.A0e
            r11 = 0
            if (r2 != r1) goto L_0x03c3
            java.lang.Object r1 = X.00k.A0O(r8, r10)
            X.4bN r1 = (X.C267324bN) r1
            if (r1 == 0) goto L_0x03c3
            java.lang.String r11 = r1.getId()
        L_0x03c3:
            X.C51965G9l.A1P(r9, r11)
            java.lang.String r1 = "media_ids"
            r9.AAe(r1, r6)
            java.lang.String r2 = r2.A00
            java.lang.String r1 = "midcard_type"
            r9.AAJ(r1, r2)
            com.instagram.api.schemas.ClipsMidCardSubtype r1 = r15.A04
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "midcard_sub_category_type"
            r9.AAJ(r1, r2)
            X.C51970G9q.A1F(r9, r7)
            java.lang.String r2 = r4.A00
            java.lang.String r1 = "viewer_init_media_compound_key"
            r9.AAJ(r1, r2)
            java.lang.String r1 = "mezql_token"
            r9.AAJ(r1, r3)
            X.C51965G9l.A1Q(r9, r3)
            java.lang.String r1 = "playlist_ids"
            r9.AAe(r1, r3)
            X.DbX.A1L(r9)
        L_0x03f5:
            X.GLi r7 = X.C52266GLh.A00(r14)
            java.lang.Object r6 = r7.A01
            monitor-enter(r6)
            goto L_0x0412
        L_0x03fd:
            X.5OC r1 = X.AnonymousClass5OC.SINGLE_CLIP
            goto L_0x0398
        L_0x0400:
            X.5OC r1 = X.AnonymousClass5OC.GRID
            goto L_0x0398
        L_0x0403:
            X.5OC r1 = X.AnonymousClass5OC.MEGA_CARD
            goto L_0x0398
        L_0x0406:
            com.instagram.api.schemas.InstagramMidcardType r2 = r15.A05
            com.instagram.api.schemas.InstagramMidcardType r1 = com.instagram.api.schemas.InstagramMidcardType.A0e
            if (r2 != r1) goto L_0x040f
            X.5OC r1 = X.AnonymousClass5OC.CLIPS_IMMERSIVE_MIDCARD
            goto L_0x0398
        L_0x040f:
            X.5OC r1 = X.AnonymousClass5OC.CLIPS_DESCRIPTIVE_MIDCARD
            goto L_0x0398
        L_0x0412:
            java.util.HashMap r3 = r7.A03     // Catch:{ all -> 0x04e3 }
            int r1 = r15.A01     // Catch:{ all -> 0x04e3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x04e3 }
            boolean r1 = r3.containsKey(r2)     // Catch:{ all -> 0x04e3 }
            if (r1 != 0) goto L_0x042b
            X.0wj r3 = X.0wj.A01     // Catch:{ all -> 0x04e3 }
            r2 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r1 = "ClipsMidcardCache: Inserted midcard is not cached"
            X.DbT.A1Q(r3, r1, r2)     // Catch:{ all -> 0x04e3 }
            goto L_0x0430
        L_0x042b:
            java.util.HashMap r1 = r7.A03     // Catch:{ all -> 0x04e3 }
            r1.remove(r2)     // Catch:{ all -> 0x04e3 }
        L_0x0430:
            monitor-exit(r6)
            X.0xx r1 = X.C71772f0.A00(r13)
            r6 = 0
            r18 = 2
            X.Ilc r13 = new X.Ilc
            r17 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass7TE.A1Z(r13, r1)
            java.util.List r1 = r15.A0H
            r2 = r23
            java.util.List r1 = X.00k.A0d(r1, r2)
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r11 = r1.iterator()
            r10 = 0
        L_0x0453:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x04e6
            java.lang.Object r1 = r11.next()
            int r9 = r10 + 1
            if (r10 >= 0) goto L_0x0469
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0469:
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r3 = r1.A02
            if (r3 == 0) goto L_0x04db
            X.0Aj r7 = X.C51972G9s.A0N(r5, r14)
            boolean r1 = r7.isSampled()
            if (r1 == 0) goto L_0x04db
            java.lang.String r2 = r3.getId()
            java.lang.String r1 = "id"
            r7.AAJ(r1, r2)
            java.lang.String r1 = r3.A30()
            java.lang.Long r1 = X.C51970G9q.A0i(r1)
            X.C51965G9l.A1E(r7, r1)
            X.G9t.A1H(r7, r3)
            java.lang.String r2 = X.C320166rs.A01(r0, r10)
            java.lang.String r1 = "position"
            X.G9t.A1I(r7, r3, r1, r2)
            java.lang.String r1 = r4.A00
            java.lang.Long r2 = X.C51970G9q.A0i(r1)
            r1 = 965(0x3c5, float:1.352E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r7.A9F(r1, r2)
            X.C51972G9s.A15(r7, r3)
            java.util.List r2 = r3.A3g()
            java.lang.String r1 = "product_ids"
            r7.AAe(r1, r2)
            java.util.ArrayList r1 = r3.A3C()
            if (r1 == 0) goto L_0x04cc
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x04c2:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x04cd
            X.C51972G9s.A1H(r3, r2)
            goto L_0x04c2
        L_0x04cc:
            r3 = r6
        L_0x04cd:
            java.lang.String r1 = "merchant_ids"
            r7.AAe(r1, r3)
            X.C51965G9l.A1Q(r7, r6)
            X.C51969G9p.A19(r7, r5)
            X.G9w.A17(r7)
        L_0x04db:
            X.0gF r1 = X.C60340gF.A00
            r8.add(r1)
            r10 = r9
            goto L_0x0453
        L_0x04e3:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x04e6:
            return
        L_0x04e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x04f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x04f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x04fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0500:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52025GBx.A00(X.4bN, X.GDz, X.GBx, int, int, boolean):void");
    }

    public C52025GBx(Context context, AnonymousClass07V r3, UserSession userSession, AnonymousClass4DU r5, AnonymousClass93U r6, GDR gdr, C55684Hlh hlh, C52022GBt gBt, ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController, C52016GBn gBn, C52012GBj gBj) {
        C51972G9s.A1C(r3, gBn);
        C51974G9v.A1Q(gdr, hlh, r6, r5);
        0qQ.A0B(userSession, 11);
        this.A06 = context;
        this.A07 = r3;
        this.A05 = gBj;
        this.A04 = gBn;
        this.A02 = gBt;
        this.A03 = clipsMidcardVirtualVideoPlayerController;
        this.A01 = gdr;
        this.A0B = hlh;
        this.A0A = r6;
        this.A09 = r5;
        this.A08 = userSession;
        gBn.A04 = C58711IwK.A00(this, 38);
    }

    public static final boolean A01(C267324bN r1) {
        MidCardLayoutType midCardLayoutType;
        C53452Gok gok = r1.A01().A06;
        if (gok != null) {
            midCardLayoutType = gok.A07;
        } else {
            midCardLayoutType = null;
        }
        return AnonymousClass7TF.A1W(midCardLayoutType, MidCardLayoutType.MEGA_CARD);
    }
}
