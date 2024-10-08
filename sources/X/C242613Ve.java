package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ve  reason: invalid class name and case insensitive filesystem */
public abstract class C242613Ve {
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03ad, code lost:
        r2 = r0.A04;
        r6 = new java.util.ArrayList(r2.size());
        r8 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03c0, code lost:
        if (r8.hasNext() == false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03c2, code lost:
        r7 = (com.instagram.model.reels.Reel) r8.next();
        r1 = r0.A06.get(r7);
        r1.getClass();
        r23 = ((java.lang.Number) r1).intValue();
        r5 = r0.A02;
        r4 = r0.A03;
        r21 = r0.A01.getModuleName();
        r3 = r0.A00;
        r17 = r3;
        r18 = r5;
        r19 = r7;
        r20 = r4;
        r1 = X.GWQ.A00(r17, r18, r19, r20, r21, r13, r23, r0.A07, r0.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03f9, code lost:
        if (r1 == null) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03fb, code lost:
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x040f, code lost:
        r16.add(new X.AnonymousClass4FT(r6, r13, 3));
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041b, code lost:
        r2 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0421, code lost:
        if (r4 >= r2.size()) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0423, code lost:
        r3 = r4 + 1;
        r10 = new java.util.HashSet(X.C256393vh.A02(new X.AnonymousClass5G9(r0), r2.subList(r4, java.lang.Math.min(r3, r2.size()))));
        r7 = new X.AnonymousClass5GE(r0, r13);
        new X.AnonymousClass3PT(r0.A02, X.AnonymousClass3BU.ON_TAP, r7, r0.A01.getModuleName(), (java.util.Map) null, r10).A06();
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d6, code lost:
        if (X.AnonymousClass0t1.A01.A01(r1).equals(r10.CCd()) == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0260, code lost:
        r1 = new X.AnonymousClass4FT(r7, r13, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x031a, code lost:
        r1 = new X.AnonymousClass4FT(r7, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0363, code lost:
        r16.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0368, code lost:
        return r16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A00(android.content.Context r29, X.AnonymousClass0iw r30, com.instagram.common.session.UserSession r31, X.1Xg r32, int r33) {
        /*
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            boolean r27 = X.AnonymousClass3HA.A00(r29)
            r6 = r32
            X.1UQ r0 = r6.A06
            int r0 = r0.ordinal()
            r5 = 4
            r7 = 0
            r2 = 0
            r17 = r30
            r1 = r31
            r13 = r33
            switch(r0) {
                case 0: goto L_0x0459;
                case 1: goto L_0x0459;
                case 3: goto L_0x046e;
                case 4: goto L_0x046e;
                case 5: goto L_0x046e;
                case 11: goto L_0x046e;
                case 13: goto L_0x0459;
                case 18: goto L_0x0369;
                case 19: goto L_0x0195;
                case 34: goto L_0x0320;
                case 38: goto L_0x001f;
                case 41: goto L_0x0204;
                case 43: goto L_0x0142;
                case 56: goto L_0x0267;
                default: goto L_0x001e;
            }
        L_0x001e:
            return r16
        L_0x001f:
            X.1Xn r9 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego"
            X.0qQ.A0C(r9, r0)
            r0 = r9
            X.3Y6 r0 = (X.AnonymousClass3Y6) r0
            java.util.List r0 = r0.A0M
            java.util.List r14 = X.C295325ny.A07(r0)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0062
            java.lang.String r25 = r9.C9L()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "clips_netego_empty"
            r4.put(r3, r0)
            if (r25 != 0) goto L_0x004b
            java.lang.String r25 = ""
        L_0x004b:
            r19 = 0
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r19
            r26 = r19
            r27 = r19
            r28 = r4
            r18 = r1
            X.C233822wX.A07(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0062:
            int r0 = r14.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
        L_0x006b:
            int r0 = r14.size()
            if (r2 >= r0) goto L_0x013f
            java.lang.Object r0 = r14.get(r2)
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r11 = r0.A02
            if (r11 == 0) goto L_0x00f3
            java.lang.String r12 = r17.getModuleName()
            r10 = 0
            r8 = 1
            X.0qQ.A0B(r1, r8)
            X.5jW r3 = X.C292785jW.A00
            r0 = r29
            boolean r0 = r3.A00(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x013c
            X.3WR r6 = r11.CEL()
        L_0x0094:
            java.lang.String r5 = r11.getId()
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C242663Vj.A01(r11)
            if (r0 == 0) goto L_0x012c
            X.0Tu r0 = X.0Tu.A05
            r3 = 36314270611081724(0x8103a3000d09fc, double:3.028629188054376E-306)
            boolean r3 = X.182.A06(r0, r1, r3)
            if (r3 == 0) goto L_0x00b1
            boolean r3 = X.C61970qY.A0G(r29)
            if (r3 == 0) goto L_0x012c
        L_0x00b1:
            X.0Tu r15 = X.0Tu.A06
            r3 = 36314270610426361(0x8103a3000309f9, double:3.0286291876399216E-306)
            boolean r3 = X.182.A06(r15, r1, r3)
            if (r3 == 0) goto L_0x012c
            r3 = 36314270610885115(0x8103a3000a09fb, double:3.0286291879300395E-306)
            boolean r0 = X.182.A06(r0, r1, r3)
            if (r0 == 0) goto L_0x012c
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.C242663Vj.A01(r11)
        L_0x00cd:
            if (r3 != 0) goto L_0x00f7
            r0 = 0
        L_0x00d0:
            X.3Vo r8 = new X.3Vo
            r8.<init>(r0, r6, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r3, r0)
            java.lang.Integer r0 = r9.CBd()
            X.3Vp r3 = new X.3Vp
            r3.<init>(r4, r0)
            X.1yX r0 = new X.1yX
            r0.<init>(r8, r3)
            r7.add(r0)
        L_0x00f3:
            int r2 = r2 + 1
            goto L_0x006b
        L_0x00f7:
            X.1NK r0 = X.1NK.A00()
            X.1OO r3 = r0.A0J(r3, r12)
            r3.A0I = r8
            r3.A0L = r10
            boolean r0 = r11.CeS()
            r3.A0K = r0
            r11.A17()
            r11.getId()
            X.1MK r0 = X.C242663Vj.A00
            X.1wY.A00(r1)
            r3.A02(r0)
            java.lang.String r0 = r11.BTL()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0127
            java.lang.String r0 = r11.BTL()
            r3.A09 = r0
        L_0x0127:
            X.2iF r0 = r3.A00()
            goto L_0x00d0
        L_0x012c:
            android.content.res.Resources r3 = r29.getResources()
            r0 = 2131165482(0x7f07012a, float:1.7945182E38)
            int r0 = r3.getDimensionPixelSize(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r11.A1m(r0)
            goto L_0x00cd
        L_0x013c:
            r6 = 0
            goto L_0x0094
        L_0x013f:
            r0 = 3
            goto L_0x031a
        L_0x0142:
            X.1Xn r9 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            X.0qQ.A0C(r9, r0)
            r0 = r9
            X.1Xj r0 = (X.1Xj) r0
            com.google.common.collect.ImmutableList r8 = r0.A1D()
            int r0 = r8.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r6 = 0
        L_0x015a:
            int r0 = r8.size()
            if (r6 >= r0) goto L_0x0260
            java.lang.Object r4 = r8.get(r6)
            X.1Xj r4 = (X.1Xj) r4
            if (r4 == 0) goto L_0x0192
            java.lang.String r3 = r17.getModuleName()
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r0 = r29
            X.3Vo r4 = X.C242663Vj.A03(r0, r1, r4, r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r2, r0)
            java.lang.Integer r0 = r9.CBd()
            X.3Vp r2 = new X.3Vp
            r2.<init>(r3, r0)
            X.1yX r0 = new X.1yX
            r0.<init>(r4, r2)
            r7.add(r0)
        L_0x0192:
            int r6 = r6 + 1
            goto L_0x015a
        L_0x0195:
            X.1Xn r3 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.StoriesNetegoItem"
            X.0qQ.A0C(r3, r0)
            r0 = r3
            X.4qK r0 = (X.C275464qK) r0
            java.lang.Integer r22 = r3.CBd()
            r25 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.4qJ r0 = r0.A00
            java.util.List r8 = r0.A0C
            if (r8 == 0) goto L_0x01e5
            r7 = 0
        L_0x01b1:
            int r0 = r8.size()
            if (r7 >= r0) goto L_0x01e5
            java.lang.Object r9 = r8.get(r7)
            X.3HX r9 = (X.AnonymousClass3HX) r9
            X.1Ns r10 = X.AnonymousClass3P9.A01(r1, r9)
            com.instagram.reels.store.ReelStore r6 = X.1OP.A05(r1)
            if (r10 == 0) goto L_0x01d8
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = r0.A01(r1)
            com.instagram.user.model.User r0 = r10.CCd()
            boolean r3 = r3.equals(r0)
            r0 = 1
            if (r3 != 0) goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            com.instagram.model.reels.Reel r0 = r6.A0I(r9, r0)
            r4.add(r0)
            int r7 = r7 + 1
            if (r7 >= r5) goto L_0x01e5
            goto L_0x01b1
        L_0x01e5:
            X.0qQ.A0B(r1, r2)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36325330151158649(0x810db200023379, double:3.0356232857322166E-306)
            boolean r24 = X.182.A06(r0, r1, r2)
            X.5G8 r0 = new X.5G8
            r18 = r0
            r19 = r29
            r20 = r17
            r21 = r1
            r23 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x03ad
        L_0x0204:
            X.0Tu r0 = X.0Tu.A06
            r2 = 36312887643801085(0x81026100c705fd, double:3.0277545939773374E-306)
            boolean r0 = X.182.A06(r0, r1, r2)
            if (r0 == 0) goto L_0x001e
            X.Gz1 r0 = r6.A01()
            java.util.List r9 = r0.A0B
            int r0 = r9.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r8 = 0
        L_0x0221:
            int r0 = r9.size()
            if (r8 >= r0) goto L_0x0260
            java.lang.Object r0 = r9.get(r8)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r4 = r0.A00()
            java.lang.String r3 = r17.getModuleName()
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r0 = r29
            X.3Vo r4 = X.C242663Vj.A03(r0, r1, r4, r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r2, r0)
            X.1Xn r0 = r6.A05
            java.lang.Integer r0 = r0.CBd()
            X.3Vp r2 = new X.3Vp
            r2.<init>(r3, r0)
            X.1yX r0 = new X.1yX
            r0.<init>(r4, r2)
            r7.add(r0)
            int r8 = r8 + 1
            goto L_0x0221
        L_0x0260:
            X.4FT r1 = new X.4FT
            r1.<init>(r7, r13, r5)
            goto L_0x0363
        L_0x0267:
            X.0Tu r5 = X.0Tu.A05
            r3 = 36326339469326045(0x810e9d000f36dd, double:3.036261582605476E-306)
            boolean r0 = X.182.A06(r5, r1, r3)
            if (r0 == 0) goto L_0x001e
            X.1Xn r3 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.tifu.model.TifuNetegoItem"
            X.0qQ.A0C(r3, r0)
            X.4oe r3 = (X.C274594oe) r3
            java.util.List r0 = r3.A09
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
            r23 = 0
        L_0x028a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0319
            java.lang.Object r6 = r8.next()
            X.1Xj r6 = (X.1Xj) r6
            boolean r0 = r6.A5p()
            if (r0 != 0) goto L_0x02f1
            boolean r0 = r6.A6D()
            if (r0 != 0) goto L_0x02f1
            boolean r0 = r6.A5F()
            if (r0 == 0) goto L_0x028a
            X.1Xy r0 = r6.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x028a
            X.1Xy r0 = r6.A0C
            java.util.List r0 = r0.Alu()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x028a
            r3 = 36326339469194972(0x810e9d000d36dc, double:3.036261582522585E-306)
            boolean r0 = X.182.A06(r5, r1, r3)
            if (r0 == 0) goto L_0x02fc
            int r3 = r6.A0o()
            r0 = 3
            int r4 = java.lang.Math.min(r3, r0)
            r3 = 0
        L_0x02d1:
            if (r3 >= r4) goto L_0x028a
            X.1Xy r0 = r6.A0C
            java.util.List r0 = r0.Alu()
            java.lang.Object r0 = r0.get(r3)
            X.1Xj r0 = (X.1Xj) r0
            java.lang.Integer r20 = X.AnonymousClass05K.A0N
            r18 = r1
            r19 = r0
            r21 = r7
            r22 = r13
            A04(r17, r18, r19, r20, r21, r22, r23)
            int r23 = r23 + 1
            int r3 = r3 + 1
            goto L_0x02d1
        L_0x02f1:
            java.lang.Integer r20 = X.AnonymousClass05K.A0N
            r21 = r7
            r22 = r13
            r18 = r1
            r19 = r6
            goto L_0x0312
        L_0x02fc:
            X.1Xy r0 = r6.A0C
            java.util.List r0 = r0.Alu()
            java.lang.Object r0 = r0.get(r2)
            X.1Xj r0 = (X.1Xj) r0
            java.lang.Integer r20 = X.AnonymousClass05K.A0N
            r21 = r7
            r22 = r13
            r18 = r1
            r19 = r0
        L_0x0312:
            A04(r17, r18, r19, r20, r21, r22, r23)
            int r23 = r23 + 1
            goto L_0x028a
        L_0x0319:
            r0 = 2
        L_0x031a:
            X.4FT r1 = new X.4FT
            r1.<init>(r7, r13, r0)
            goto L_0x0363
        L_0x0320:
            X.4gm r5 = r6.A00
            if (r5 == 0) goto L_0x001e
            X.0Tu r0 = X.0Tu.A05
            r3 = 36592180764148053(0x82006500010155, double:3.204380687907887E-306)
            long r3 = X.182.A01(r0, r1, r3)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            X.4tV r7 = r5.A00()
            if (r7 == 0) goto L_0x001e
            r5 = 1
            int[] r23 = new int[]{r2}
            int r0 = (int) r3
            int r0 = java.lang.Math.max(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            X.WPr r0 = new X.WPr
            r24 = r13
            r25 = r3
            r18 = r0
            r19 = r17
            r20 = r1
            r21 = r6
            r22 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27)
            r7.A0S(r0)
            X.4FT r1 = new X.4FT
            r1.<init>(r2, r13, r5)
        L_0x0363:
            r0 = r16
            r0.add(r1)
            return r16
        L_0x0369:
            X.1Xn r3 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.StoriesNetegoItem"
            X.0qQ.A0C(r3, r0)
            r7 = r3
            X.4qK r7 = (X.C275464qK) r7
            java.lang.Integer r8 = r3.CBd()
            r0 = 1
            com.instagram.reels.store.ReelStore r6 = X.1OP.A05(r1)
            X.0qQ.A0B(r1, r0)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36324286475153359(0x810cbf00122fcf, double:3.034963260823925E-306)
            boolean r4 = X.182.A06(r0, r1, r3)
            X.4qJ r0 = r7.A00
            java.util.List r3 = r0.A0B
            if (r4 == 0) goto L_0x03ff
            java.util.ArrayList r3 = r6.A0T(r3)
        L_0x0394:
            int r0 = r3.size()
            int r0 = java.lang.Math.min(r5, r0)
            java.util.List r9 = r3.subList(r2, r0)
            X.5G8 r0 = new X.5G8
            r4 = r0
            r5 = r29
            r6 = r17
            r7 = r1
            r10 = r2
            r11 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x03ad:
            java.util.List r2 = r0.A04
            int r1 = r2.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            java.util.Iterator r8 = r2.iterator()
        L_0x03bc:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x040f
            java.lang.Object r7 = r8.next()
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            java.util.Map r1 = r0.A06
            java.lang.Object r1 = r1.get(r7)
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            int r23 = r1.intValue()
            com.instagram.common.session.UserSession r5 = r0.A02
            java.lang.Integer r4 = r0.A03
            X.0iw r1 = r0.A01
            java.lang.String r21 = r1.getModuleName()
            android.content.Context r3 = r0.A00
            boolean r2 = r0.A07
            boolean r1 = r0.A08
            r22 = r13
            r24 = r2
            r25 = r1
            r17 = r3
            r18 = r5
            r19 = r7
            r20 = r4
            X.1yX r1 = X.GWQ.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x03bc
            r6.add(r1)
            goto L_0x03bc
        L_0x03ff:
            java.lang.String r0 = r7.getId()
            if (r3 == 0) goto L_0x040a
            java.util.ArrayList r3 = r6.A0R(r0, r3)
            goto L_0x0394
        L_0x040a:
            java.util.ArrayList r3 = r6.A0Q(r0)
            goto L_0x0394
        L_0x040f:
            r1 = 3
            X.4FT r2 = new X.4FT
            r2.<init>(r6, r13, r1)
            r1 = r16
            r1.add(r2)
            r4 = 0
        L_0x041b:
            java.util.List r2 = r0.A05
            int r1 = r2.size()
            if (r4 >= r1) goto L_0x001e
            int r3 = r4 + 1
            int r1 = r2.size()
            int r1 = java.lang.Math.min(r3, r1)
            java.util.List r2 = r2.subList(r4, r1)
            X.5G9 r1 = new X.5G9
            r1.<init>(r0)
            java.util.List r1 = X.C256393vh.A02(r1, r2)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>(r1)
            X.5GE r7 = new X.5GE
            r7.<init>(r0, r13)
            r9 = 0
            com.instagram.common.session.UserSession r5 = r0.A02
            X.0iw r1 = r0.A01
            java.lang.String r8 = r1.getModuleName()
            X.3BU r6 = X.AnonymousClass3BU.ON_TAP
            X.3PT r4 = new X.3PT
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4.A06()
            r4 = r3
            goto L_0x041b
        L_0x0459:
            X.1Xn r0 = r6.A05
            X.1Xj r5 = X.1Xi.A02(r0)
            r5.getClass()
            r2 = r29
            r3 = r17
            r4 = r1
            r6 = r16
            r7 = r13
            A02(r2, r3, r4, r5, r6, r7)
            return r16
        L_0x046e:
            X.1Xn r2 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers"
            X.0qQ.A0C(r2, r0)
            X.3UH r2 = (X.AnonymousClass3UH) r2
            r3 = r29
            r4 = r17
            r5 = r1
            r6 = r2
            r7 = r16
            r8 = r13
            A03(r3, r4, r5, r6, r7, r8)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242613Ve.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.1Xg, int):java.util.ArrayList");
    }

    public static void A02(Context context, AnonymousClass0iw r25, UserSession userSession, 1Xj r27, List list, int i) {
        Object obj;
        C250513lZ injected;
        IGAdsIABScreenshotDataDict BEo;
        String Bq0;
        int i2;
        int A0o;
        long j;
        1Xj r4 = r27;
        Context context2 = context;
        UserSession userSession2 = userSession;
        List list2 = list;
        int i3 = i;
        if (r4.A5H()) {
            List Aok = r4.A0C.Aok();
            if (Aok != null) {
                ArrayList arrayList = new ArrayList(Aok.size());
                for (int i4 = 0; i4 < Aok.size(); i4++) {
                    1Xj r12 = (1Xj) Aok.get(i4);
                    1iA BR7 = r12.BR7();
                    if (r4.CcK() && 182.A06(0Tu.A05, userSession2, 36311234068414938L) && (BR7 == 1iA.A0Q || BR7 == 1iA.A0a)) {
                        Context context3 = context2;
                        UserSession userSession3 = userSession2;
                        1Xj r15 = r12;
                        arrayList.add(new 1yX(C242663Vj.A04(context3, userSession3, r15, AnonymousClass05K.A00, r25.getModuleName(), false), new C242703Vp(new Pair(Integer.valueOf(i3), 0), r4.CBd())));
                    } else if (BR7 == 1iA.A0V) {
                        IgShowreelNativeAnimationIntf BwB = r12.A0C.BwB();
                        17k.A07(BwB, "Media collection item of SHOWREEL_NATIVE type should have SN animation model!");
                        AnonymousClass6Q6 r1 = new AnonymousClass6Q6(C231122qu.A07(userSession2, r4), r4.A2v());
                        ImmutableList Ack = B7C.A00(BwB).Ack();
                        try {
                            String A00 = C273654mx.A00(393);
                            AnonymousClass6OC r14 = AnonymousClass6OB.A01;
                            0qQ.A0B(userSession2, 0);
                            AnonymousClass6OE A01 = r14.A01(AnonymousClass6OC.A00(userSession2, A00), userSession2, A00);
                            String Anf = BwB.Anf();
                            String C4b = BwB.C4b();
                            String AqT = BwB.AqT();
                            if (Anf == null) {
                                Anf = "";
                            }
                            if (C4b == null) {
                                C4b = "";
                            }
                            if (AqT == null) {
                                AqT = "";
                            }
                            C52510GVn A002 = C52509GVm.A00((Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, Anf, AqT, r1.F01(), r25.getModuleName(), "IG_FEED", C4b, Ack, (List) null);
                            A01.A04(new C56998IKq(), A002, A01.A02(A002, true));
                        } catch (C242623Vf e) {
                            0wb.A07("igbv_feed_sn_prefetch_invalid_req_params", e);
                        }
                    }
                }
                list2.add(new AnonymousClass4FT(arrayList, i3, 1));
            }
        } else if (r4.A4w()) {
            if (r4.A5D()) {
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, userSession2, 36328714585259567L)) {
                    if (!182.A06(r3, userSession2, 36328714585390640L) || 1Bh.A00().A03()) {
                        j = 36610189562025965L;
                    } else {
                        j = 36610189562157038L;
                    }
                    i2 = Long.valueOf(182.A01(r3, userSession2, j)).intValue();
                } else {
                    i2 = 2;
                    if (1Bh.A00().A03()) {
                        i2 = 1;
                    }
                }
                if (182.A06(r3, userSession2, 36328714585521713L)) {
                    A0o = r4.A0p();
                } else {
                    A0o = r4.A0o();
                }
                int min = Math.min(i2, A0o);
                int A0w = r4.A0w();
                int min2 = Math.min(min, r4.A0o() - A0w);
                ArrayList arrayList2 = new ArrayList(Math.max(min2, 0));
                for (int i5 = A0w; i5 < A0w + min2; i5++) {
                    int A0w2 = i5 - r4.A0w();
                    1Xj A1c = r4.A1c(i5);
                    if (A1c != null) {
                        arrayList2.add(new 1yX(C242663Vj.A03(context2, userSession2, A1c, AnonymousClass05K.A00, r25.getModuleName()), new C242703Vp(new Pair(Integer.valueOf(i3), Integer.valueOf(A0w2)), r4.CBd())));
                    }
                }
                obj = new AnonymousClass4FT(arrayList2, i3, 1);
            } else {
                if (182.A06(0Tu.A06, userSession2, 36319819708047018L) || 182.A06(0Tu.A05, userSession2, 36319819707981481L)) {
                    C297715sD.A00(context2, userSession2, r4, r25.getModuleName());
                }
                C242693Vo A03 = C242663Vj.A03(context2, userSession2, r4, AnonymousClass05K.A00, r25.getModuleName());
                Integer valueOf = Integer.valueOf(i3);
                1yX r7 = new 1yX(A03, new C242703Vp(new Pair(valueOf, 0), r4.CBd()));
                0qQ.A0B(userSession2, 2);
                if (!(!r4.CcK() || (injected = r4.A0C.getInjected()) == null || (BEo = injected.BEo()) == null || (Bq0 = BEo.Bq0()) == null)) {
                    0Tu r10 = 0Tu.A05;
                    if (182.A06(r10, userSession2, 36323741013192129L) && (1Bh.A00().A03() || 182.A06(r10, userSession2, 36323741013257666L))) {
                        obj = new AnonymousClass9IN(ImmutableList.of(r7, new 1yX(C242663Vj.A06(userSession2, new SimpleImageUrl(Bq0), r25.getModuleName()), new C242703Vp(new Pair(valueOf, 0), r4.CBd()))), i3);
                    }
                }
                obj = new AnonymousClass9IN(r7, i3, 0);
            }
            list2.add(obj);
        }
    }

    public static ArrayList A01(Context context, AnonymousClass0iw r12, UserSession userSession, List list, int i) {
        String moduleName = r12.getModuleName();
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            1Xj r10 = (1Xj) list.get(i2);
            int i3 = i + i2;
            arrayList.add(new AnonymousClass9IN(new 1yX(C242663Vj.A03(context, userSession, r10, AnonymousClass05K.A00, moduleName), new C242703Vp(new Pair(Integer.valueOf(i3), 0), r10.CBd())), i3, 0));
        }
        return arrayList;
    }

    public static void A03(Context context, AnonymousClass0iw r10, UserSession userSession, AnonymousClass3UH r12, List list, int i) {
        List A04 = r12.A04();
        if (A04 != null) {
            int min = Math.min(A04.size(), 2);
            ArrayList arrayList = new ArrayList(min);
            for (int i2 = 0; i2 < min; i2++) {
                for (1Xj A02 : ((C17674Vc5) A04.get(i2)).A07) {
                    arrayList.add(new 1yX(C242663Vj.A02(context, userSession, A02, AnonymousClass05K.A00, r10.getModuleName()), new C242703Vp(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), AnonymousClass05K.A0N)));
                }
            }
            list.add(new AnonymousClass4FT(arrayList, i, 1));
        }
    }

    public static void A04(AnonymousClass0iw r6, UserSession userSession, 1Xj r8, Integer num, List list, int i, int i2) {
        AnonymousClass3WR CEL;
        ExtendedImageUrl A00;
        String moduleName = r6.getModuleName();
        if (r8.CeS() || r8.A5h()) {
            CEL = r8.CEL();
        } else {
            CEL = null;
        }
        String id = r8.getId();
        C226952iF r62 = null;
        if (!(r8.A1p() == null || (A00 = C299535vM.A00(userSession, r8, Double.valueOf(182.A00(0Tu.A05, userSession, 37170764399510032L)))) == null)) {
            1OO A0J = 1NK.A00().A0J(A00, moduleName);
            A0J.A0I = true;
            A0J.A05 = userSession;
            A0J.A0L = false;
            r8.A17();
            String BTL = r8.BTL();
            if (!TextUtils.isEmpty(BTL)) {
                A0J.A09 = BTL;
            }
            r62 = A0J.A00();
        }
        list.add(new 1yX(new C242693Vo(r62, CEL, id), new C242703Vp(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), num)));
    }
}
