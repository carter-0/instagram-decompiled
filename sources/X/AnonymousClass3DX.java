package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3DX  reason: invalid class name */
public final class AnonymousClass3DX implements C233022up {
    public boolean A00;
    public final Map A01;
    public final UserSession A02;
    public final C233002un A03;
    public final Map A04;
    public final Map A05;
    public final Set A06 = new LinkedHashSet();
    public final boolean A07;

    public final String B4s() {
        return "feed_iaa";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        if (((double) X.C229632nm.A04(X.2SP.A00, new X.2HY(1, 100))) > X.182.A00(X.0Tu.A06, r8.A02, 37160538081919098L)) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CJE(X.C376459Ib r29, java.util.List r30) {
        /*
            r28 = this;
            r2 = 0
            r1 = r29
            X.0qQ.A0B(r1, r2)
            r10 = 1
            r0 = r30
            X.0qQ.A0B(r0, r10)
            java.lang.Object r7 = X.00k.A0N(r0)
            X.9IV r7 = (X.AnonymousClass9IV) r7
            if (r7 == 0) goto L_0x00f7
            r8 = r28
            java.util.Set r0 = r8.Bsw()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x00f7
            java.util.Map r1 = r8.A01
            java.lang.Object r0 = r7.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            java.lang.Object r0 = r0.A04
            java.lang.Object r12 = r1.get(r0)
            X.3DY r12 = (X.AnonymousClass3DY) r12
            java.util.Map r0 = r8.A04
            java.util.Collection r0 = r0.values()
            boolean r0 = X.00k.A0u(r0, r12)
            if (r0 != 0) goto L_0x0094
            java.lang.Object r0 = r7.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            java.lang.Object r11 = r0.A01
            X.2pg r0 = X.C230472pg.ORGANIC
            r9 = 100
            if (r11 != r0) goto L_0x0073
            java.util.Map r0 = r8.A05
            java.util.Collection r0 = r0.values()
            boolean r0 = X.00k.A0u(r0, r12)
            if (r0 == 0) goto L_0x0073
            X.2HY r1 = new X.2HY
            r1.<init>(r10, r9)
            X.2SQ r0 = X.2SP.A00
            int r0 = X.C229632nm.A04(r0, r1)
            double r3 = (double) r0
            com.instagram.common.session.UserSession r6 = r8.A02
            X.0Tu r5 = X.0Tu.A06
            r0 = 37160538081919098(0x8405500009007a, double:3.563812144257519E-306)
            double r5 = X.182.A00(r5, r6, r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
        L_0x0073:
            X.2pg r0 = X.C230472pg.SPONSORED
            if (r11 != r0) goto L_0x00f7
            X.2HY r1 = new X.2HY
            r1.<init>(r10, r9)
            X.2SQ r0 = X.2SP.A00
            int r0 = X.C229632nm.A04(r0, r1)
            double r5 = (double) r0
            com.instagram.common.session.UserSession r4 = r8.A02
            X.0Tu r3 = X.0Tu.A06
            r0 = 37160538081460345(0x84055000020079, double:3.5638121439674015E-306)
            double r3 = X.182.A00(r3, r4, r0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00f7
        L_0x0094:
            if (r12 == 0) goto L_0x00f7
            X.2un r11 = r8.A03
            java.lang.Object r0 = r7.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            java.lang.Object r0 = r0.A02
            X.9JO r0 = (X.AnonymousClass9JO) r0
            java.lang.String r1 = r0.A04
            X.0qQ.A0B(r1, r2)
            com.instagram.common.session.UserSession r4 = r11.A0I
            X.1E8 r0 = X.1E7.A00(r4)
            X.1Xj r8 = r0.A02(r1)
            if (r8 == 0) goto L_0x00f7
            X.2rI r0 = r11.A07
            if (r0 == 0) goto L_0x00f7
            X.2lb r0 = r0.A0S
            X.3W1 r5 = r0.BQr(r8)
            int r1 = r5.getPosition()
            r0 = -1
            if (r1 == r0) goto L_0x00f7
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x015d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r11.A09(r8, r5, r12, r0)
            if (r0 == 0) goto L_0x00f7
            X.2rI r0 = r11.A07
            java.util.LinkedHashMap r0 = X.I52.A02(r0)
            java.util.LinkedHashMap r0 = X.0Yt.A03(r0)
            r11.A0D = r0
            java.lang.Integer r1 = X.C55045HbG.A00(r4, r8, r12)
            java.util.Map r0 = r11.A0D
            boolean r0 = X.I52.A03(r4, r1, r0)
            if (r0 == 0) goto L_0x00f8
            X.2pK r7 = r11.A0K
            java.lang.String r11 = r12.A00
            r9 = 0
            r0 = 339(0x153, float:4.75E-43)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
        L_0x00f3:
            r10 = r9
            r7.A0B(r8, r9, r10, r11, r12)
        L_0x00f7:
            return
        L_0x00f8:
            X.3DY r0 = X.AnonymousClass3DY.GESTURE
            if (r12 == r0) goto L_0x0104
            X.3DY r0 = X.AnonymousClass3DY.LIKE_CLICK
            if (r12 == r0) goto L_0x0104
            X.3DY r0 = X.AnonymousClass3DY.SAVE_CLICK
            if (r12 != r0) goto L_0x013f
        L_0x0104:
            X.0Tu r3 = X.0Tu.A06
            r0 = 36312887639279042(0x810261008205c2, double:3.027754591117579E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x013f
            X.2rI r1 = r11.A07
            if (r1 == 0) goto L_0x0137
            int r0 = r5.getPosition()
            int r0 = r0 + 1
            X.1Xg r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0137
            X.1Xn r0 = r0.A05
            X.1Xj r1 = X.1Xi.A02(r0)
            if (r1 == 0) goto L_0x0137
            X.2rI r0 = r11.A07
            if (r0 == 0) goto L_0x0137
            X.2lb r0 = r0.A0S
            X.3W1 r0 = r0.BQr(r1)
            boolean r0 = r0.A1w
            if (r0 == 0) goto L_0x013f
        L_0x0137:
            X.2pK r7 = r11.A0K
            java.lang.String r11 = r12.A00
            r9 = 0
            java.lang.String r12 = "next_post_showing"
            goto L_0x00f3
        L_0x013f:
            X.2rI r3 = r11.A07
            int r1 = r5.getPosition()
            int r0 = r11.A00
            X.Hl3 r1 = X.C55044HbF.A00(r8, r3, r1, r0)
            boolean r0 = X.C55035Hb6.A00(r4, r12)
            if (r0 != 0) goto L_0x0179
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0179
            X.2pK r7 = r11.A0K
            java.lang.String r11 = r12.A00
            java.lang.String r12 = r1.A00
            r9 = 0
            goto L_0x00f3
        L_0x015d:
            X.1Xy r0 = r8.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0177
            X.16V r0 = r0.A0J()
        L_0x0169:
            boolean r0 = r11.A08(r8, r5, r12, r0)
            if (r0 == 0) goto L_0x00f7
            int r0 = r5.getPosition()
            r11.A05(r8, r5, r12, r0)
            return
        L_0x0177:
            r0 = 0
            goto L_0x0169
        L_0x0179:
            X.2rI r1 = r11.A07
            int r0 = r5.getPosition()
            X.Hl2 r0 = X.I52.A01(r1, r0)
            int r1 = r0.A00
            r11.A01 = r1
            X.2rI r0 = r11.A07
            r3 = 0
            if (r0 == 0) goto L_0x022c
            X.1Xg r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x022c
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x022c
            java.lang.String r21 = X.C231122qu.A07(r4, r0)
            java.lang.String r22 = X.C231122qu.A0F(r4, r0)
        L_0x01a2:
            java.util.Map r6 = r11.A0D
            X.0Tu r7 = X.0Tu.A06
            r0 = 36312887633905033(0x81026100300589, double:3.027754587719034E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x0229
            r0 = 36312887639999947(0x810261008d05cb, double:3.0277545915734825E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x0229
            X.2us r0 = X.C233052us.FEED_POST_AD_CLICK_MULTI_ADS
        L_0x01be:
            int r6 = X.I52.A00(r4, r0, r6)
            X.2pK r1 = r11.A0K
            java.lang.String r0 = r12.A00
            r1.A0A(r8, r3, r0, r6)
            r11.A04 = r8
            r11.A05 = r5
            int r0 = r5.getPosition()
            r11.A03 = r0
            r11.A06 = r12
            r11.A0E = r2
            r11.A08 = r3
            boolean r0 = X.C231122qu.A0O(r4, r8)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            java.lang.String r18 = X.C231122qu.A07(r4, r8)
            java.lang.String r1 = "Required value was null."
            if (r18 == 0) goto L_0x0238
            java.lang.String r19 = X.C231122qu.A0F(r4, r8)
            if (r19 == 0) goto L_0x0232
            int r0 = r11.A03
            X.1Xy r1 = r8.A0C
            java.lang.String r20 = r1.BIl()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r1 = r8.CeS()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            X.1Xj r1 = X.C233002un.A01(r8)
            int r1 = r1.A0y()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            X.1Xj r1 = X.C233002un.A01(r8)
            int r1 = r1.A0x()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)
            r23 = r3
            r24 = r3
            r25 = r3
            r26 = r0
            r27 = r2
            r11.A07(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        L_0x0229:
            X.2us r0 = X.C233052us.FEED_POST_AD_CLICK_SINGLE_AD
            goto L_0x01be
        L_0x022c:
            r21 = r3
            r22 = r3
            goto L_0x01a2
        L_0x0232:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0238:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DX.CJE(X.9Ib, java.util.List):void");
    }

    public AnonymousClass3DX(UserSession userSession, C233002un r31) {
        this.A03 = r31;
        UserSession userSession2 = userSession;
        this.A02 = userSession2;
        C233162v9 r15 = C233162v9.PROFILE_USERNAME_CAPTION_TAP;
        AnonymousClass3DY r3 = AnonymousClass3DY.PROFILE_USERNAME_CAPTION_TAP;
        0eP r4 = new 0eP(r15, r3);
        C233162v9 r2 = C233162v9.VIEW_ALL_COMMENTS_TAP;
        AnonymousClass3DY r1 = AnonymousClass3DY.VIEW_ALL_COMMENTS_TAP;
        this.A04 = 0Yt.A06(new 0eP[]{r4, new 0eP(r2, r1)});
        C233162v9 r13 = C233162v9.VIDEO_TAP;
        AnonymousClass3DY r12 = AnonymousClass3DY.VIDEO_TAP;
        this.A05 = 0se.A0M(new 0eP(r13, r12));
        0eP r0 = new 0eP(C233162v9.CAPTION_CLICK, AnonymousClass3DY.CAPTION_CLICK);
        0eP r14 = new 0eP(C233162v9.LIKE_CLICK, AnonymousClass3DY.LIKE_CLICK);
        0eP r11 = new 0eP(C233162v9.GESTURE, AnonymousClass3DY.GESTURE);
        0eP r10 = new 0eP(C233162v9.SAVE_CLICK, AnonymousClass3DY.SAVE_CLICK);
        0eP r9 = new 0eP(C233162v9.SEE_TRANSLATION, AnonymousClass3DY.SEE_TRANSLATION);
        0eP r8 = new 0eP(C233162v9.HASHTAG_CLICK, AnonymousClass3DY.HASHTAG_CLICK);
        0eP r7 = new 0eP(C233162v9.SEEN_STATE, AnonymousClass3DY.DWELL);
        0eP r6 = new 0eP(C233162v9.TAG_CLICK, AnonymousClass3DY.TAG_CLICK);
        0eP r21 = r7;
        0eP r22 = r6;
        0eP r19 = r9;
        0eP r20 = r8;
        0eP r17 = r11;
        0eP r18 = r10;
        0eP r152 = r0;
        0eP r16 = r14;
        this.A01 = 0Yt.A06(new 0eP[]{r152, r16, r17, r18, r19, r20, r21, r22, new 0eP(r15, r3), new 0eP(r2, r1), new 0eP(C233162v9.USER_TAG_CLICK, AnonymousClass3DY.USER_TAG_CLICK), new 0eP(C233162v9.PRODUCT_TAG_CLICK, AnonymousClass3DY.PRODUCT_TAG_CLICK), new 0eP(r13, r12)});
        this.A07 = 182.A06(0Tu.A06, userSession2, 36316113151201232L);
    }

    public final Set Bsw() {
        Boolean bool;
        Boolean bool2;
        if (!this.A07) {
            return 0sl.A00;
        }
        if (!this.A00) {
            Set<C233162v9> keySet = this.A04.keySet();
            ArrayList arrayList = new ArrayList(0Yv.A1E(keySet, 10));
            for (C233162v9 r0 : keySet) {
                arrayList.add(r0.A01);
            }
            ArrayList A0U = 00k.A0U(arrayList);
            UserSession userSession = this.A02;
            0Tu r6 = 0Tu.A06;
            List A0R = 00l.A0R(182.A04(r6, userSession, 36879063104684266L), new String[]{","}, 0);
            List<String> A0R2 = 00l.A0R(182.A04(r6, userSession, 36879063105077483L), new String[]{","}, 0);
            A0U.addAll(A0R);
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(A0U, 10));
            Iterator it = A0U.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C233162v9[] values = C233162v9.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bool2 = null;
                        break;
                    }
                    C233162v9 r9 = values[i];
                    if (0qQ.A0K(r9.A01, 00l.A0B(str).toString())) {
                        bool2 = Boolean.valueOf(this.A06.add(new C376459Ib(C230472pg.SPONSORED, r9, C230432pc.FEED)));
                        break;
                    }
                    i++;
                }
                arrayList2.add(bool2);
            }
            ArrayList arrayList3 = new ArrayList(0Yv.A1E(A0R2, 10));
            for (String str2 : A0R2) {
                C233162v9[] values2 = C233162v9.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        bool = null;
                        break;
                    }
                    C233162v9 r4 = values2[i2];
                    if (0qQ.A0K(r4.A01, 00l.A0B(str2).toString())) {
                        bool = Boolean.valueOf(this.A06.add(new C376459Ib(C230472pg.ORGANIC, r4, C230432pc.FEED)));
                        break;
                    }
                    i2++;
                }
                arrayList3.add(bool);
            }
            A0U.addAll(A0R2);
            this.A00 = true;
        }
        ImmutableSet A032 = ImmutableSet.A03(this.A06);
        0qQ.A07(A032);
        return A032;
    }
}
