package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public abstract class JZT {
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0219, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 36320721651180320L) == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r0 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        if (r0 != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.N4R A00(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C255773uh r10, X.C250973mM r11, com.instagram.model.reels.ReelViewerConfig r12, X.AnonymousClass3BQ r13, boolean r14) {
        /*
            r0 = 4
            X.DbW.A1O(r9, r0, r8)
            boolean r0 = r10.CWu()
            if (r0 != 0) goto L_0x00cc
            java.lang.Integer r3 = X.AnonymousClass05K.A0H
        L_0x000c:
            boolean r7 = X.AnonymousClass8PU.A07(r9)
            boolean r0 = X.AnonymousClass6YK.A05(r9, r10, r11, r12, r13)
            r6 = 1
            if (r0 == 0) goto L_0x00c6
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r9)
            boolean r0 = X.2Ek.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c6
            java.lang.Boolean r0 = X.C59806JZa.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316718741721707(0x8105dd0002126b, double:3.030177395728932E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00c6
        L_0x003a:
            r5 = 1
            if (r3 != 0) goto L_0x0073
            if (r7 != 0) goto L_0x009b
            boolean r0 = X.C363038ix.A01(r9)
            if (r0 != 0) goto L_0x0058
            boolean r0 = X.0oI.A0B(r8)
            if (r0 != 0) goto L_0x007d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330458342048394(0x81125c0001428a, double:3.0388663743004586E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x007d
        L_0x0058:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x005a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 != r0) goto L_0x006d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321576349869593(0x810a4800042619, double:3.033249366681673E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x006d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x0096
            java.lang.Integer r3 = X.AnonymousClass05K.A0U
        L_0x0073:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
        L_0x0075:
            r1 = 46
            X.N4R r0 = new X.N4R
            r0.<init>((java.lang.Integer) r2, (java.lang.Integer) r3, (int) r1)
            return r0
        L_0x007d:
            boolean r0 = X.0oI.A0B(r8)
            if (r0 != 0) goto L_0x0093
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330458342048394(0x81125c0001428a, double:3.0388663743004586E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0093
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x005a
        L_0x0093:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x005a
        L_0x0096:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 != r0) goto L_0x009b
            r6 = 1
        L_0x009b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328744650030657(0x8110cd00003e41, double:3.037782628567958E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x00a9
            r5 = 0
        L_0x00a9:
            if (r6 != 0) goto L_0x00bd
            if (r5 == 0) goto L_0x00b0
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x0075
        L_0x00b0:
            r0 = 36325759647954123(0x810e16000334cb, double:3.035894901235119E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r7 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x00c3
        L_0x00bd:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0075
        L_0x00c0:
            if (r0 == 0) goto L_0x00c3
            goto L_0x0073
        L_0x00c3:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x0075
        L_0x00c6:
            boolean r6 = A04(r10, r11)
            goto L_0x003a
        L_0x00cc:
            boolean r0 = r10.A1g()
            if (r0 != 0) goto L_0x00d6
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x000c
        L_0x00d6:
            X.1Xj r2 = r10.A0b
            if (r2 == 0) goto L_0x032d
            X.1Xy r0 = r2.A0C
            com.instagram.feed.media.CreativeConfigIntf r1 = r0.AsO()
            r6 = 1
            if (r1 == 0) goto L_0x00f5
            X.6Ku r0 = X.C306106Ku.CLIPS
            X.6Ku[] r0 = new X.C306106Ku[]{r0}
            boolean r0 = X.C284745Nt.A0B(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00f5
        L_0x00f1:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x000c
        L_0x00f5:
            java.util.List r0 = r10.A0b()
            boolean r0 = A05(r0)
            if (r0 == 0) goto L_0x0103
            java.lang.Integer r3 = X.AnonymousClass05K.A0P
            goto L_0x000c
        L_0x0103:
            boolean r0 = r10.A1L()
            if (r0 == 0) goto L_0x010d
            java.lang.Integer r3 = X.AnonymousClass05K.A07
            goto L_0x000c
        L_0x010d:
            com.instagram.model.reels.Reel r3 = r11.A0H
            boolean r0 = r3.A0b()
            if (r0 == 0) goto L_0x0119
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x000c
        L_0x0119:
            boolean r0 = r3.A0i()
            if (r0 == 0) goto L_0x0123
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            goto L_0x000c
        L_0x0123:
            boolean r0 = X.AnonymousClass8PU.A03(r9)
            if (r0 != 0) goto L_0x012d
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x000c
        L_0x012d:
            X.3WT r4 = X.AnonymousClass3WT.MEDIA
            java.util.List r1 = r10.Bkd(r4)
            if (r1 == 0) goto L_0x013f
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x016f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x016f
        L_0x013f:
            X.1Xy r0 = r2.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
            if (r0 == 0) goto L_0x01bb
            java.util.List r0 = r0.B92()
            if (r0 == 0) goto L_0x01bb
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x0155:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r0 = r5.next()
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = (com.instagram.api.schemas.GenAIToolInfoDictIntf) r0
            com.instagram.api.schemas.CameraTool r0 = r0.C8A()
            X.8hK r0 = X.AnonymousClass6XS.A00(r0)
            if (r0 == 0) goto L_0x0155
            r1.add(r0)
            goto L_0x0155
        L_0x016f:
            java.util.Iterator r5 = r1.iterator()
        L_0x0173:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r0 = r5.next()
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.model.mediatype.ProductType r1 = r0.A0m
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            if (r1 != r0) goto L_0x0173
            boolean r0 = X.AnonymousClass431.A00(r9)
            if (r0 != 0) goto L_0x0191
            boolean r0 = X.AnonymousClass8PU.A06(r9)
            if (r0 == 0) goto L_0x0197
        L_0x0191:
            boolean r0 = X.AnonymousClass431.A00(r9)
            if (r0 != 0) goto L_0x0329
        L_0x0197:
            boolean r0 = X.AnonymousClass431.A00(r9)
            if (r0 == 0) goto L_0x0329
            boolean r0 = X.AnonymousClass8PU.A06(r9)
            if (r0 == 0) goto L_0x0329
            goto L_0x013f
        L_0x01a4:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01bb
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319918494260979(0x8108c6001f1ef3, double:3.032200932119137E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 != 0) goto L_0x01bb
            java.lang.Integer r3 = X.AnonymousClass05K.A08
            goto L_0x000c
        L_0x01bb:
            X.1Xy r0 = r2.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
            if (r0 == 0) goto L_0x01da
            boolean r0 = X.C284745Nt.A09(r0)
            if (r0 != r6) goto L_0x01da
            X.0Tu r5 = X.0Tu.A05
            r0 = 36327258592065817(0x810f73000b3919, double:3.036842839527118E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 != 0) goto L_0x01da
            java.lang.Integer r3 = X.AnonymousClass05K.A05
            goto L_0x000c
        L_0x01da:
            X.3WT r0 = X.AnonymousClass3WT.MENTION_RESHARE
            java.util.List r1 = r10.Bkd(r0)
            if (r1 == 0) goto L_0x01f2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f2
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x021d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x021d
        L_0x01f2:
            java.util.List r0 = r10.Bkd(r4)
            if (r0 == 0) goto L_0x024e
            java.util.Iterator r4 = r0.iterator()
        L_0x01fc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x024e
            java.lang.Object r0 = r4.next()
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.model.mediatype.ProductType r1 = r0.A0m
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r1 != r0) goto L_0x01fc
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320721651180320(0x81098100012320, double:3.0327088517889814E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 != 0) goto L_0x024e
            goto L_0x00f1
        L_0x021d:
            java.util.Iterator r5 = r1.iterator()
        L_0x0221:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r0 = r5.next()
            X.3ui r0 = (X.C255783ui) r0
            java.lang.String r1 = r0.A1g
            java.lang.String r0 = "mention_reshare"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0221
            boolean r0 = X.AnonymousClass8PU.A06(r9)
            if (r0 != 0) goto L_0x01f2
            X.0Tu r5 = X.0Tu.A05
            r0 = 36317289972241367(0x810662000013d7, double:3.0305386442097255E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 != 0) goto L_0x01f2
            java.lang.Integer r3 = X.AnonymousClass05K.A0B
            goto L_0x000c
        L_0x024e:
            boolean r0 = X.C46508DgB.A00(r9)
            if (r0 == 0) goto L_0x0258
            java.lang.Integer r3 = X.AnonymousClass05K.A0T
            goto L_0x000c
        L_0x0258:
            if (r14 == 0) goto L_0x025e
            java.lang.Integer r3 = X.AnonymousClass05K.A0K
            goto L_0x000c
        L_0x025e:
            X.3WT r0 = X.AnonymousClass3WT.SECRET_STICKER
            boolean r0 = r10.A1t(r0)
            if (r0 == 0) goto L_0x026a
            java.lang.Integer r3 = X.AnonymousClass05K.A0O
            goto L_0x000c
        L_0x026a:
            boolean r0 = r3.A0k()
            if (r0 == 0) goto L_0x0274
            java.lang.Integer r3 = X.AnonymousClass05K.A0L
            goto L_0x000c
        L_0x0274:
            X.3WT r0 = X.AnonymousClass3WT.REELS_VISUAL_REPLIES
            java.util.List r0 = r10.Bkd(r0)
            if (r0 == 0) goto L_0x0286
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0286
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            goto L_0x000c
        L_0x0286:
            boolean r0 = r3.A0l()
            if (r0 == 0) goto L_0x0290
            java.lang.Integer r3 = X.AnonymousClass05K.A0G
            goto L_0x000c
        L_0x0290:
            boolean r0 = r10.A1j()
            if (r0 == 0) goto L_0x02fa
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r10.A0K()
            if (r4 == 0) goto L_0x0325
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r4.A00
            com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf r0 = r0.Bho()
            if (r0 != 0) goto L_0x0325
            boolean r0 = X.AHN.A03(r9, r4)
            if (r0 == 0) goto L_0x0325
            java.lang.Integer r1 = X.C363038ix.A00(r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x02bf
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323783963127308(0x810c4a00052e0c, double:3.034645470195197E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x0325
        L_0x02bf:
            boolean r0 = r4.A0D()
            if (r0 == 0) goto L_0x02d2
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323783962996234(0x810c4a00032e0a, double:3.0346454701123053E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x0325
        L_0x02d2:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x02e3
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323783963061771(0x810c4a00042e0b, double:3.034645470153751E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x0325
        L_0x02e3:
            boolean r0 = r4.A0E()
            if (r0 != 0) goto L_0x0325
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0325
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324930719134189(0x810d55000131ed, double:3.0353706833115644E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x0325
        L_0x02fa:
            X.3mL r1 = r10.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x030e
            java.lang.String r0 = r2.A2m()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x030e
            java.lang.Integer r3 = X.AnonymousClass05K.A0F
            goto L_0x000c
        L_0x030e:
            boolean r0 = r11.A0D()
            if (r0 == 0) goto L_0x0318
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            goto L_0x000c
        L_0x0318:
            boolean r0 = r10.A1D()
            if (r0 == 0) goto L_0x0322
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            goto L_0x000c
        L_0x0322:
            r3 = 0
            goto L_0x000c
        L_0x0325:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Q
            goto L_0x000c
        L_0x0329:
            java.lang.Integer r3 = X.AnonymousClass05K.A02
            goto L_0x000c
        L_0x032d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZT.A00(android.content.Context, com.instagram.common.session.UserSession, X.3uh, X.3mM, com.instagram.model.reels.ReelViewerConfig, X.3BQ, boolean):X.N4R");
    }

    public static final Integer A01(Context context, UserSession userSession, C255773uh r6, C250973mM r7, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r9, boolean z) {
        1Xj r2 = r6.A0b;
        Reel reel = r7.A0H;
        if (!reel.A0i() && r6.CWu() && r2 != null && AnonymousClass7TF.A1Y(r2.A0C.C0f(), true) && ((!r7.A0D() || r9 == AnonymousClass3BQ.ARCHIVE) && r6.A1g() && !r2.A53() && !r6.A1t(AnonymousClass3WT.SECRET_STICKER) && 0oI.A0C(context) && !z && !reel.A0k())) {
            0Tu r22 = 0Tu.A05;
            if (!(182.A06(r22, userSession, 36319098153540505L) || r6.A0B() == AnonymousClass3QO.CUSTOM || r6.A0B() == AnonymousClass3QO.HALLPASS || r6.A0B() == AnonymousClass3QO.OPAL)) {
                if (!AnonymousClass6YK.A05(userSession, r6, r7, reelViewerConfig, r9) || A00(context, userSession, r6, r7, reelViewerConfig, r9, z).A00 != AnonymousClass05K.A00 || !AnonymousClass6YK.A04(userSession, r6, r7) || !(!2Ek.A00(DbT.A0j(userSession))) || !C59806JZa.A00(userSession).booleanValue() || !182.A06(r22, userSession, 36316718741918318L)) {
                    return AnonymousClass05K.A00;
                }
                return AnonymousClass05K.A01;
            }
        }
        return AnonymousClass05K.A0C;
    }

    public static final boolean A04(C255773uh r4, C250973mM r5) {
        1Xj r2;
        User user;
        Reel reel = r5.A0H;
        if (reel.A1a && !reel.A1b && (r2 = r4.A0b) != null && (user = r4.A0i) != null && user.A1M() && r2.A1t() != AnonymousClass3QO.OPAL) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(java.util.List r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x000d
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            return r3
        L_0x000e:
            java.util.Iterator r2 = r4.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            X.3WT r1 = r0.A11
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT
            if (r1 == r0) goto L_0x0034
            X.3WT r0 = X.AnonymousClass3WT.MULTI_PRODUCT
            if (r1 == r0) goto L_0x0034
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT_COLLECTION
            if (r1 == r0) goto L_0x0034
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT_SHARE
            if (r1 == r0) goto L_0x0034
            X.3WT r0 = X.AnonymousClass3WT.STOREFRONT
            if (r1 != r0) goto L_0x0012
        L_0x0034:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZT.A05(java.util.List):boolean");
    }

    public static final boolean A02(UserSession userSession, C255773uh r3, C250973mM r4) {
        Reel reel = r4.A0H;
        if ((reel.A0b() || reel.A0k() || (r4.A0D() && reel.A1a)) && r3.A1g() && !r3.A1s(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, C255773uh r9, C250973mM r10) {
        1Ns r1;
        Calendar instance = Calendar.getInstance();
        long days = TimeUnit.MILLISECONDS.toDays(Math.abs(instance.getTimeInMillis() - (r9.A03() * 1000)));
        Reel reel = r10.A0H;
        if (reel.A1a && reel.A0b() && (r1 = reel.A0W) != null && r1.CCd() != null) {
            0qQ.A0A(r1);
            User CCd = r1.CCd();
            0qQ.A0A(CCd);
            if (!CCd.A2J() || days > ((long) instance.getActualMaximum(7)) || !182.A06(0Tu.A05, userSession, 36322289314637869L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
