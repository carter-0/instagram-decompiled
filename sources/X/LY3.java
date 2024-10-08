package X;

import android.view.View;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;

public final class LY3 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LY3(ReelMoreOptionsFragment reelMoreOptionsFragment, int i) {
        this.A00 = i;
        if (34 - i != 0) {
            this.A01 = reelMoreOptionsFragment;
        } else {
            this.A01 = reelMoreOptionsFragment;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LY3(obj, i), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0495, code lost:
        if (X.182.A06(X.0Tu.A06, r4, 36321249932289222L) == false) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0687, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x068a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x071c, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0723, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        X.DbT.A1V(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0809, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x080c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0940, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0943, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0971, code lost:
        if (X.DbT.A0j(r5).A21() == false) goto L_0x0981;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0973, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x097f, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36318522627856604L) != false) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0981, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0982, code lost:
        r2 = java.lang.Boolean.valueOf(r0);
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0988, code lost:
        if (r0 == null) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x098e, code lost:
        if (r0.getVisibility() != 0) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0990, code lost:
        X.LTM.A07(r3.A0A, r5, "ml_fundraiser_creation_nudge", "FEED_COMPOSER", (java.lang.String) null, (java.util.Map) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0999, code lost:
        r1 = r3.A0C.A0E;
        r0 = r3.A0A;
        X.LKP.A01(r0, r5, r1, "FEED_COMPOSER");
        X.LTV.A0B(r0.requireActivity(), r5, "FEED_COMPOSER", r2.booleanValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x09ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1.A0A();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01f0 */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x022e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r35) {
        /*
            r34 = this;
            r1 = r34
            int r0 = r1.A00
            r6 = r35
            switch(r0) {
                case 0: goto L_0x0927;
                case 1: goto L_0x0909;
                case 2: goto L_0x08eb;
                case 3: goto L_0x08d1;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00a1;
                case 6: goto L_0x08a0;
                case 7: goto L_0x0881;
                case 8: goto L_0x0862;
                case 9: goto L_0x084e;
                case 10: goto L_0x0844;
                case 11: goto L_0x0009;
                case 12: goto L_0x0060;
                case 13: goto L_0x0009;
                case 14: goto L_0x0944;
                case 15: goto L_0x0013;
                case 16: goto L_0x0822;
                case 17: goto L_0x080d;
                case 18: goto L_0x07dd;
                case 19: goto L_0x07cc;
                case 20: goto L_0x07b8;
                case 21: goto L_0x079d;
                case 22: goto L_0x078a;
                case 23: goto L_0x0774;
                case 24: goto L_0x074d;
                case 25: goto L_0x073a;
                case 26: goto L_0x0729;
                case 27: goto L_0x05cc;
                case 28: goto L_0x0668;
                case 29: goto L_0x05a8;
                case 30: goto L_0x0594;
                case 31: goto L_0x0580;
                case 32: goto L_0x0559;
                case 33: goto L_0x0513;
                case 34: goto L_0x0463;
                case 35: goto L_0x03f9;
                case 36: goto L_0x036f;
                case 37: goto L_0x0350;
                case 38: goto L_0x0328;
                case 39: goto L_0x0306;
                case 40: goto L_0x02e4;
                case 41: goto L_0x02c2;
                case 42: goto L_0x0290;
                case 43: goto L_0x0278;
                case 44: goto L_0x0264;
                case 45: goto L_0x0241;
                case 46: goto L_0x00db;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.LRa r0 = (X.C64159LRa) r0
            X.KOf r1 = r0.A0C
        L_0x000f:
            r1.A0A()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r3 = r1.A01
            X.LRa r3 = (X.C64159LRa) r3
            com.instagram.common.session.UserSession r5 = r3.A0B
            X.27r r1 = X.27p.A01(r5)
            X.80P r0 = X.AnonymousClass80P.ADD_FUNDRAISER
            r1.A1X(r0)
            X.KOf r0 = r3.A0C
            X.3QO r1 = r0.A03
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 != r0) goto L_0x0040
            X.4DH r0 = r3.A0A
            X.8ab r3 = X.DbW.A0U(r0)
            r0 = 2131953241(0x7f130659, float:1.9542947E38)
            r3.A09(r0)
            r0 = 2131953240(0x7f130658, float:1.9542945E38)
        L_0x0039:
            r3.A08(r0)
            r3.A06()
            goto L_0x009d
        L_0x0040:
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x0967
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x0012
            X.4DH r0 = r3.A0A
            X.8ab r3 = X.DbW.A0U(r0)
            X.C51967G9n.A0v()
            r0 = 2131968866(0x7f134362, float:1.9574639E38)
            r3.A09(r0)
            X.C51967G9n.A0v()
            r0 = 2131968865(0x7f134361, float:1.9574637E38)
            goto L_0x0039
        L_0x0060:
            java.lang.Object r2 = r1.A01
            X.LRa r2 = (X.C64159LRa) r2
            com.instagram.common.session.UserSession r0 = r2.A0B
            X.27r r1 = X.27p.A01(r0)
            X.80P r0 = X.AnonymousClass80P.ADD_FUNDRAISER
            r1.A1Y(r0)
            X.KOf r1 = r2.A0C
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r0 = r1.A04
            if (r0 != 0) goto L_0x000f
            X.4DH r0 = r2.A0A
            X.8ab r3 = X.DbW.A0U(r0)
            r0 = 2131972061(0x7f134fdd, float:1.9581119E38)
            r3.A09(r0)
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r1 = r1.A04
            r0 = 2131972059(0x7f134fdb, float:1.9581115E38)
            if (r1 == 0) goto L_0x008b
            r0 = 2131971988(0x7f134f94, float:1.958097E38)
        L_0x008b:
            r3.A08(r0)
            r1 = 2131972051(0x7f134fd3, float:1.9581099E38)
            r0 = 57
            X.LV2 r0 = X.LV2.A00(r2, r0)
            r3.A0K(r0, r1)
            r3.A05()
        L_0x009d:
            X.DbT.A1V(r3)
            return
        L_0x00a1:
            java.lang.Object r5 = r1.A01
            X.LOO r5 = (X.LOO) r5
            android.view.View r1 = r5.A00
            r0 = 8
            r1.setVisibility(r0)
            X.6gx r4 = r5.A02
            java.lang.String r2 = r5.A08
            X.3NV r0 = r5.A04
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r5.A09
            r3 = 0
            r4.A0X(r2, r1, r0, r3)
            X.M0Y r2 = r5.A06
            if (r2 == 0) goto L_0x0012
            X.4DH r0 = r2.A05
            X.0xx r1 = X.DbV.A0J(r0)
            r0 = 38
            X.MG2.A01(r2, r1, r0)
            X.LjZ r0 = r2.A0E
            r0.A01 = r3
            return
        L_0x00ce:
            java.lang.Object r0 = r1.A01
            X.LOO r0 = (X.LOO) r0
            X.M0Y r1 = r0.A06
            if (r1 == 0) goto L_0x0012
            r0 = 0
            r1.A03(r0, r0)
            return
        L_0x00db:
            r0 = -664447106(0xffffffffd865577e, float:-1.00865576E15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K7H r0 = (X.K7H) r0
            X.L7U r4 = r0.A02
            if (r4 == 0) goto L_0x023c
            X.K6V r0 = r0.A03
            if (r0 != 0) goto L_0x00f2
            java.lang.String r6 = "currentFragment"
            goto L_0x071c
        L_0x00f2:
            X.LPF r0 = r0.A00
            if (r0 == 0) goto L_0x0112
            java.util.List r0 = r0.A01()
        L_0x00fa:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0102:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0115
            com.instagram.common.gallery.Medium r0 = X.JTP.A0O(r2)
            if (r0 == 0) goto L_0x0102
            r1.add(r0)
            goto L_0x0102
        L_0x0112:
            X.0sn r0 = X.0sn.A00
            goto L_0x00fa
        L_0x0115:
            X.6ae r2 = r4.A01
            java.lang.String r10 = r4.A02
            X.7Pu r9 = r4.A00
            X.4mU r4 = r2.A0F
            X.3uh r0 = r4.Au5()
            if (r0 == 0) goto L_0x023c
            X.3uh r0 = r4.Au5()
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x023c
            X.3uh r0 = r4.Au5()
            X.1Xj r0 = r0.A0b
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x023c
            X.3uh r0 = r4.Au5()
            X.1Xj r0 = r0.A0b
            java.lang.String r8 = r0.getId()
            androidx.fragment.app.FragmentActivity r7 = r2.A07
            com.instagram.common.session.UserSession r6 = r2.A09
            java.lang.String r5 = r2.A0H
            int r24 = X.C310236ae.A00(r2)
            r0 = 3
            X.MBI r4 = new X.MBI
            r4.<init>(r2, r0)
            boolean r2 = X.DbW.A1X(r6)
            X.AnonymousClass7TF.A1D(r8, r0, r10)
            r0 = 6
            X.0qQ.A0B(r5, r0)
            java.util.Iterator r15 = r1.iterator()
        L_0x0160:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0238
            java.lang.Object r13 = r15.next()
            com.instagram.common.gallery.Medium r13 = (com.instagram.common.gallery.Medium) r13
            boolean r0 = r13.A05()
            if (r0 == 0) goto L_0x018b
            X.LlI r0 = new X.LlI
            r23 = r4
            r22 = r5
            r21 = r10
            r20 = r8
            r19 = r6
            r18 = r13
            r17 = r7
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            X.C226132fh.A03(r7, r6, r0)
            goto L_0x0160
        L_0x018b:
            boolean r0 = r13.CeS()
            if (r0 == 0) goto L_0x0160
            X.JZ5 r0 = new X.JZ5
            r0.<init>(r7, r13, r6, r2)
            X.7zv r12 = r0.call()
            java.lang.String r11 = r12.A0k
            int r0 = r12.A07
            long r0 = (long) r0
            r16 = r6
            r17 = r11
            r18 = r0
            r20 = r0
            com.instagram.pendingmedia.model.ClipInfo r1 = X.Q0X.A03(r16, r17, r18, r20)
            r25 = 0
            r26 = r25
            r27 = r6
            r28 = r25
            r29 = r1
            r30 = r12
            r31 = r25
            r32 = r25
            r33 = r2
            X.3Q2 r11 = X.C59797JYq.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.0qQ.A07(r11)
            X.1iA r0 = X.1iA.A0a
            r11.A0V(r0)
            java.lang.String r0 = r13.A0X
            r11.A2t = r0
            r11.A33 = r0
            r11.A3L = r0
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.EXPRESSIVE_QUESTION_STICKER
            r11.A0e(r0)
            java.lang.String r0 = r12.A0k
            X.0qQ.A0B(r0, r2)
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever
            r12.<init>()
            r12.setDataSource(r0)     // Catch:{ all -> 0x0233 }
            r0 = 24
            r14 = 0
            java.lang.String r0 = r12.extractMetadata(r0)     // Catch:{ all -> 0x0233 }
            if (r0 == 0) goto L_0x01f0
            int r14 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01f0 }
        L_0x01f0:
            r12.release()     // Catch:{ Exception -> 0x01f3 }
        L_0x01f3:
            int r12 = r14 % 180
            r0 = 90
            if (r12 != r0) goto L_0x022e
            r12 = 1065353216(0x3f800000, float:1.0)
            float r0 = r13.A00()
            float r12 = r12 / r0
        L_0x0200:
            X.JZ1.A06(r1, r11, r12)
            X.C63387Kw8.A00(r11)
            X.1ua r1 = X.JTO.A0n(r7, r6)
            boolean r0 = r11.A12()
            X.JTQ.A1J(r11, r1, r0)
            r1.A0B(r11)
            X.Luv r0 = new X.Luv
            r17 = r6
            r18 = r11
            r19 = r8
            r20 = r10
            r21 = r5
            r22 = r4
            r23 = r24
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r11.A0Y(r0)
            goto L_0x0160
        L_0x022e:
            float r12 = r13.A00()
            goto L_0x0200
        L_0x0233:
            r0 = move-exception
            r12.release()     // Catch:{ Exception -> 0x0237 }
        L_0x0237:
            throw r0
        L_0x0238:
            r0 = 0
            r9.A0L(r0)
        L_0x023c:
            r0 = -364053025(0xffffffffea4cfddf, float:-6.1954934E25)
            goto L_0x0940
        L_0x0241:
            java.lang.Object r4 = r1.A01
            X.LlP r4 = (X.C64986LlP) r4
            java.lang.String r1 = "com.instagram.settings.privacy.hype"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.DiU r3 = X.C46649DiU.A04(r1, r0)
            android.content.Context r2 = r4.A09
            com.instagram.common.session.UserSession r0 = r4.A0C
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            r0 = 2131974395(0x7f1358fb, float:1.9585853E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0U = r0
            r3.A0D(r2, r1)
            return
        L_0x0264:
            java.lang.Object r0 = r1.A01
            X.LlP r0 = (X.C64986LlP) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A0B
            com.instagram.common.session.UserSession r0 = r0.A0C
            X.30l r2 = new X.30l
            r2.<init>(r1, r0)
            X.Ki7 r1 = X.C62574Ki7.STORY_SETTINGS
            r0 = 0
            r2.CfX(r1, r0, r0)
            return
        L_0x0278:
            java.lang.Object r0 = r1.A01
            X.LlP r0 = (X.C64986LlP) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A0B
            com.instagram.common.session.UserSession r0 = r0.A0C
            X.6Yo r1 = X.DbU.A0Q(r1, r0)
            X.E4s r0 = new X.E4s
            r0.<init>()
            r1.A0E(r0)
            r1.A04()
            return
        L_0x0290:
            r0 = 1089869677(0x40f6176d, float:7.6903596)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r5 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r5
            X.PR7 r3 = r5.A08
            r3.getClass()
            android.view.View$OnClickListener r2 = r5.A0Z
            android.view.View$OnClickListener r1 = r5.A0Y
            r0 = 0
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A08(r2, r1, r3, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(r5, r0)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r5.A03
            X.8CB r1 = new X.8CB
            r1.<init>(r0)
            r0 = 0
            r1.A0A = r0
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r1.A01()
            r5.A03 = r0
            r0 = 1777802519(0x69f71d17, float:3.7342756E25)
            goto L_0x0687
        L_0x02c2:
            r0 = 241258259(0xe614f13, float:2.7771464E-30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r5 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r5
            X.PR7 r3 = r5.A08
            r3.getClass()
            android.view.View$OnClickListener r2 = r5.A0Z
            android.view.View$OnClickListener r1 = r5.A0Y
            r0 = 1
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A08(r2, r1, r3, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(r5, r0)
            r0 = 397860930(0x17b6e042, float:1.1818085E-24)
            goto L_0x0687
        L_0x02e4:
            r0 = 2119235496(0x7e50f7a8, float:6.944133E37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r5 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r5
            X.PR7 r3 = r5.A09
            r3.getClass()
            android.view.View$OnClickListener r2 = r5.A0d
            android.view.View$OnClickListener r1 = r5.A0c
            r0 = 0
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A08(r2, r1, r3, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(r5, r0)
            r0 = 265823880(0xfd82688, float:2.1314086E-29)
            goto L_0x0687
        L_0x0306:
            r0 = -700911055(0xffffffffd638f231, float:-5.0837586E13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r5 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r5
            X.PR7 r3 = r5.A09
            r3.getClass()
            android.view.View$OnClickListener r2 = r5.A0d
            android.view.View$OnClickListener r1 = r5.A0c
            r0 = 1
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A08(r2, r1, r3, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(r5, r0)
            r0 = -310881950(0xffffffffed785162, float:-4.8031668E27)
            goto L_0x0687
        L_0x0328:
            r0 = 1214039216(0x485cc4b0, float:226066.75)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r5 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r5
            X.PR7 r3 = r5.A0A
            android.view.View$OnClickListener r2 = r5.A0b
            android.view.View$OnClickListener r1 = r5.A0a
            r0 = 0
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A08(r2, r1, r3, r5, r0)
            X.OhI r1 = r5.A07
            java.lang.String r0 = ""
            r1.A00 = r0
            X.0nA.A0N(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(r5, r0)
            r0 = 432507634(0x19c78af2, float:2.0632237E-23)
            goto L_0x0687
        L_0x0350:
            r0 = -1933931869(0xffffffff8cba8aa3, float:-2.8741277E-31)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r5 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r5
            X.PR7 r3 = r5.A0A
            android.view.View$OnClickListener r2 = r5.A0b
            android.view.View$OnClickListener r1 = r5.A0a
            r0 = 1
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A08(r2, r1, r3, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0C(r5, r0)
            r0 = -2054575332(0xffffffff8589ab1c, float:-1.2946274E-35)
            goto L_0x0687
        L_0x036f:
            r0 = 734438237(0x2bc6a35d, float:1.4114089E-12)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r4 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r4
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r4.A03
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r4.A04
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x03f5
            X.8ab r3 = X.DbW.A0U(r4)
            r0 = 2131975992(0x7f135f38, float:1.9589092E38)
            r3.A09(r0)
            r0 = 2131975991(0x7f135f37, float:1.958909E38)
            r3.A08(r0)
            r2 = 2131968381(0x7f13417d, float:1.9573655E38)
            r0 = 0
            r3.A0H(r0, r2)
            r2 = 2131976948(0x7f1362f4, float:1.959103E38)
            r0 = 59
            X.LV2 r0 = X.LV2.A00(r1, r0)
            X.Dba.A0t(r0, r3, r2)
        L_0x03a7:
            com.instagram.common.session.UserSession r0 = r4.A02
            boolean r0 = X.JTR.A1Z(r0)
            if (r0 == 0) goto L_0x03f0
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321619299346017(0x810a5200012661, double:3.033276528103507E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x03f0
            com.instagram.common.session.UserSession r0 = r4.A02
            X.27r r0 = X.27p.A01(r0)
            boolean r4 = r4.A0F
            X.29R r3 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r3)
            X.4yP r1 = r3.A0J()
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x03f0
            if (r1 == 0) goto L_0x03f0
            X.JTO.A1V(r2)
            java.lang.String r0 = "ADS_MODE_SETTINGS_CANCEL"
            X.283 r0 = X.Dbc.A08(r2, r1, r3, r0)
            X.Dbc.A0i(r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "ads_mode_boost_story_enabled"
            r2.A0O(r0, r1)
            r2.Cgf()
        L_0x03f0:
            r0 = -1169797295(0xffffffffba464f51, float:-7.5649197E-4)
            goto L_0x0809
        L_0x03f5:
            X.DbT.A1J(r4)
            goto L_0x03a7
        L_0x03f9:
            r0 = 17796943(0x10f8f4f, float:2.636777E-38)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r3 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r3
            android.content.Intent r0 = X.DbS.A09()
            r3.A00 = r0
            X.OhI r0 = r3.A07
            if (r0 == 0) goto L_0x044f
            java.lang.String r0 = r0.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x044f
            X.OhI r0 = r3.A07
            java.lang.String r0 = r0.A00
            java.lang.String r4 = X.LIL.A01(r0)
            X.1OC r0 = r3.A01
            if (r0 == 0) goto L_0x0425
            r0.cancel()
        L_0x0425:
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "media/validate_reel_url/"
            r2.A0A(r0)
            java.lang.String r0 = "url"
            r2.A9m(r0, r4)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r2 = X.DbY.A0N(r2, r1, r0)
            r1 = 6
            X.Ufe r0 = new X.Ufe
            r0.<init>(r4, r3, r1)
            r2.A00 = r0
            r3.A01 = r2
            X.1ES.A03(r2)
        L_0x044a:
            r0 = 1937310744(0x73790418, float:1.972908E31)
            goto L_0x0809
        L_0x044f:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r3.A03
            X.8CB r1 = new X.8CB
            r1.<init>(r0)
            r0 = 0
            r1.A0C = r0
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r1.A01()
            r3.A03 = r0
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0A(r3)
            goto L_0x044a
        L_0x0463:
            java.lang.Object r0 = r1.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r0 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.Lg6> r2 = X.C64679Lg6.class
            X.1wn r1 = r0.A0e
            r3.A01(r1, r2)
            java.lang.Class<X.Lg8> r2 = X.Lg8.class
            X.1wn r1 = r0.A0f
            r3.A01(r1, r2)
            com.instagram.common.session.UserSession r1 = r0.A02
            boolean r1 = X.LPL.A02(r1)
            if (r1 == 0) goto L_0x0497
            com.instagram.common.session.UserSession r4 = r0.A02
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.0Tu r3 = X.0Tu.A06
            r1 = 36321249932289222(0x8109fc000324c6, double:3.033042938889468E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r3 = 1
            if (r1 != 0) goto L_0x0498
        L_0x0497:
            r3 = 0
        L_0x0498:
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r0.A02
            if (r3 == 0) goto L_0x04e2
            X.6Yo r1 = X.C49892FBu.A00(r2, r1)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r0.A03
            java.util.List r2 = r2.A00()
            if (r2 != 0) goto L_0x04db
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x04b0:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r0.A03
            com.instagram.api.schemas.BrandedContentProjectMetadata r3 = r2.A01
            com.instagram.api.schemas.BrandedContentGatingInfo r2 = r2.A00
            r7 = 0
            boolean r9 = r0.A0L
            r5 = 0
            r13 = 1
            boolean r14 = r0.A0E
            java.lang.String r4 = "story"
            r8 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            X.K8V r2 = X.LSU.A04(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x04c7:
            r1.A0E(r2)
            r1.A04()
            com.instagram.common.session.UserSession r4 = r0.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A0H
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            java.lang.Integer r1 = X.LPL.A00(r4)
            X.JVF.A02(r0, r4, r3, r2, r1)
            return
        L_0x04db:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r0.A03
            java.util.List r6 = r2.A00()
            goto L_0x04b0
        L_0x04e2:
            X.6Yo r1 = X.DbS.A0M(r2, r1)
            com.instagram.common.session.UserSession r4 = r0.A02
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r0.A03
            java.util.List r2 = r2.A00()
            if (r2 != 0) goto L_0x050c
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x04f4:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r0.A03
            com.instagram.api.schemas.BrandedContentProjectMetadata r3 = r2.A01
            com.instagram.api.schemas.BrandedContentGatingInfo r2 = r2.A00
            boolean r12 = r0.A0L
            r5 = 0
            boolean r8 = r0.A0J
            java.lang.String r6 = "story"
            X.AnonymousClass7TG.A1O(r4, r7)
            r9 = 0
            r10 = r9
            r11 = r9
            androidx.fragment.app.Fragment r2 = X.LLA.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x04c7
        L_0x050c:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r0.A03
            java.util.List r7 = r2.A00()
            goto L_0x04f4
        L_0x0513:
            r0 = 1263911043(0x4b55c083, float:1.4008451E7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K7i r3 = (X.C61433K7i) r3
            com.instagram.common.ui.base.IgEditText r0 = r3.A00
            java.lang.String r6 = "editText"
            if (r0 == 0) goto L_0x071c
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r2 = X.DbV.A12(r0)
            int r0 = r2.length()
            r1 = 1
            if (r0 == 0) goto L_0x0547
            boolean r0 = X.C51966G9m.A1X(r2)
            if (r0 != r1) goto L_0x0547
            X.0eM r0 = r3.A03
            X.1Ng r1 = X.DbX.A0R(r0)
            X.Lfg r0 = new X.Lfg
            r0.<init>(r2)
            r1.A00(r0)
        L_0x0547:
            X.37E r1 = X.AnonymousClass37D.A00
            com.instagram.common.ui.base.IgEditText r0 = r3.A00
            if (r0 == 0) goto L_0x071c
            android.content.Context r0 = r0.getContext()
            X.DbX.A14(r0, r1)
            r0 = 271075683(0x10284963, float:3.3188693E-29)
            goto L_0x0687
        L_0x0559:
            r0 = -979406267(0xffffffffc59f7245, float:-5102.2837)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K5w r1 = (X.C61402K5w) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0577
            instagram.features.clips.edit.ClipsEditMetadataController r1 = r1.A01
            if (r1 != 0) goto L_0x0570
            java.lang.String r6 = "clipsEditMetadataController"
            goto L_0x071c
        L_0x0570:
            X.8Wq r0 = r1.A0K
            if (r0 == 0) goto L_0x057c
            r0.A04()
        L_0x0577:
            r0 = 912414161(0x366255d1, float:3.3726576E-6)
            goto L_0x0687
        L_0x057c:
            instagram.features.clips.edit.ClipsEditMetadataController.A09(r1)
            goto L_0x0577
        L_0x0580:
            r0 = -1370000745(0xffffffffae577297, float:-4.8987116E-11)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            r0 = 0
            instagram.features.clips.edit.ClipsEditMetadataController.A0F(r1, r0)
            r0 = -1597575359(0xffffffffa0c6ef41, float:-3.370083E-19)
            goto L_0x0940
        L_0x0594:
            r0 = -92162209(0xfffffffffa81b75f, float:-3.3676275E35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            r0 = 1
            instagram.features.clips.edit.ClipsEditMetadataController.A0F(r1, r0)
            r0 = 648527677(0x26a7bf3d, float:1.1639788E-15)
            goto L_0x0940
        L_0x05a8:
            r0 = 264897828(0xfca0524, float:1.9920718E-29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            instagram.features.clips.edit.ClipsEditMetadataController r2 = (instagram.features.clips.edit.ClipsEditMetadataController) r2
            X.4DH r0 = r2.A0q
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.A0s
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            X.K4k r0 = new X.K4k
            r0.<init>()
            X.Dba.A12(r0, r1)
            r0 = 998162271(0x3b7ebf5f, float:0.003887139)
            goto L_0x0940
        L_0x05cc:
            r0 = -669130602(0xffffffffd81de096, float:-6.9435166E14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.clips.edit.ClipsEditMetadataController r5 = (instagram.features.clips.edit.ClipsEditMetadataController) r5
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.thumbnailImage
            if (r1 == 0) goto L_0x071a
            r0 = 0
            r1.setEnabled(r0)
            r6 = 1
            instagram.features.clips.edit.ClipsEditMetadataController.A0G(r5, r6)
            java.lang.String r8 = r5.A13
            X.0iw r0 = r5.A0r
            java.lang.String r7 = r0.getModuleName()
            X.28D r4 = X.28D.A0J
            com.instagram.common.session.UserSession r0 = r5.A0s
            X.0qQ.A0B(r7, r6)
            X.29R r1 = X.JTO.A0b(r0)
            X.1Ln r2 = X.JTO.A0N(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0631
            java.lang.String r0 = "IG_CAMERA_VIDEO_COVER_PHOTO_TAP"
            r2.A0t(r0)
            java.lang.String r0 = "VIDEO_COVER_PHOTO_TAP"
            X.JTU.A16(r2, r1, r0)
            r2.A0b(r4)
            r2.A0T()
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            r2.A0d(r0)
            X.28t r0 = X.28t.A06
            r2.A0c(r0)
            X.JYm r1 = X.C59793JYm.OTHER
            java.lang.String r0 = "media_source"
            r2.A0M(r1, r0)
            X.JTO.A1U(r2, r8)
            r2.A0n(r7)
            X.8fP r1 = X.C360948fP.CLIPS
            java.lang.String r0 = "capture_type"
            r2.A0M(r1, r0)
            X.JTS.A1E(r2)
        L_0x0631:
            java.io.File r0 = r5.A0L
            if (r0 != 0) goto L_0x064b
            X.4DH r0 = r5.A0q
            android.content.Context r4 = r0.requireContext()
            long r1 = java.lang.System.nanoTime()
            java.lang.String r0 = "mp4"
            java.lang.String r0 = X.AnonymousClass457.A09(r4, r0, r1, r6)
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            r5.A0L = r0
        L_0x064b:
            X.M5Y r2 = new X.M5Y
            r2.<init>(r5)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            X.0nc r1 = new X.0nc
            r1.<init>(r2, r0)
            X.0nO r0 = X.0nY.A00()
            r0.ATD(r1)
            r5.A08 = r1
            r0 = -772972420(0xffffffffd1ed607c, float:-1.27440749E11)
            goto L_0x0940
        L_0x0668:
            r0 = 170495701(0xa298ed5, float:8.163918E-33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            instagram.features.clips.edit.ClipsEditMetadataController r3 = (instagram.features.clips.edit.ClipsEditMetadataController) r3
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x0724
            X.LM3 r2 = r3.A0C
            if (r2 == 0) goto L_0x068b
            r1 = 2131961824(0x7f1327e0, float:1.9560356E38)
            r0 = 2131961796(0x7f1327c4, float:1.95603E38)
            X.LM3.A00(r2, r1, r0)
        L_0x0684:
            r0 = 733286909(0x2bb511fd, float:1.2865816E-12)
        L_0x0687:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x068b:
            X.K1L r0 = r3.A07
            if (r0 == 0) goto L_0x0697
            X.L7h r0 = r0.A00
            if (r0 == 0) goto L_0x0697
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x06f6
        L_0x0697:
            java.lang.String r0 = r3.A0N
            if (r0 != 0) goto L_0x06f6
            X.K5w r5 = r3.A11
            boolean r1 = r3.A0f
            java.util.List r12 = r3.A0P
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r8 = r3.A05
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r7 = r3.A04
            r15 = 1
            X.0qQ.A0B(r12, r15)
            X.0eM r3 = r5.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.LPL.A02(r0)
            java.lang.String r6 = "mediaId"
            if (r0 == 0) goto L_0x06e1
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r10 = r5.A02
            if (r10 == 0) goto L_0x071c
            java.lang.String r11 = "reel"
            X.0qQ.A0B(r9, r15)
            r13 = 0
            r14 = r13
            r16 = r13
            r17 = r1
            androidx.fragment.app.Fragment r1 = X.LLA.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x06ce:
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.Dbc.A0S(r1, r0, r3)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            X.LPL.A01(r5, r2, r1, r0, r3)
            goto L_0x0684
        L_0x06e1:
            X.C49892FBu.A02()
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x071c
            java.lang.String r8 = "reel"
            r11 = 0
            r9 = r0
            r10 = r12
            r12 = r15
            r13 = r1
            r14 = r11
            r15 = r11
            X.K8W r1 = X.LSU.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x06ce
        L_0x06f6:
            com.instagram.monetization.repository.MonetizationRepository r1 = r3.A0v
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            boolean r2 = r1.A05(r0)
            android.content.Context r0 = r3.A0n
            X.8ab r1 = X.DbS.A0Y(r0)
            r0 = 2131963713(0x7f132f41, float:1.9564187E38)
            r1.A09(r0)
            r0 = 2131963711(0x7f132f3f, float:1.9564183E38)
            if (r2 == 0) goto L_0x0712
            r0 = 2131963712(0x7f132f40, float:1.9564185E38)
        L_0x0712:
            r1.A08(r0)
            X.Dba.A1L(r1)
            goto L_0x0684
        L_0x071a:
            java.lang.String r6 = "thumbnailImage"
        L_0x071c:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0724:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0729:
            r0 = 1759195226(0x68db305a, float:8.2807215E24)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = 562547069(0x2187c97d, float:9.201289E-19)
            goto L_0x0809
        L_0x073a:
            r0 = -1161270565(0xffffffffbac86adb, float:-0.0015290634)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K4Z r0 = (X.K4Z) r0
            X.K4Z.A00(r0)
            r0 = -858905318(0xffffffffccce251a, float:-1.08079312E8)
            goto L_0x0940
        L_0x074d:
            r0 = 404312161(0x18195061, float:1.9815367E-24)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K57 r2 = (X.K57) r2
            X.KgJ r1 = X.C62468KgJ.SCHEDULED
            r0 = 1
            X.K57.A00(r1, r2, r0)
            X.0eM r0 = r2.A0H
            java.lang.Object r2 = r0.getValue()
            X.JgE r2 = (X.C60133JgE) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 12
            X.MG7.A01(r2, r1, r0)
            r0 = 1847368162(0x6e1c99e2, float:1.2116424E28)
            goto L_0x0940
        L_0x0774:
            r0 = -516649822(0xffffffffe1348ca2, float:-2.0815922E20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K57 r2 = (X.K57) r2
            X.KgJ r1 = X.C62468KgJ.DRAFTS
            r0 = 1
            X.K57.A00(r1, r2, r0)
            r0 = 937088360(0x37dad568, float:2.6087E-5)
            goto L_0x0940
        L_0x078a:
            r0 = 1668145890(0x636de2e2, float:4.388227E21)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K57 r0 = (X.K57) r0
            X.K57.A02(r0)
            r0 = -1523844785(0xffffffffa52bf94f, float:-1.4916355E-16)
            goto L_0x0940
        L_0x079d:
            r0 = -1890356477(0xffffffff8f537303, float:-1.0425254E-29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K7J r1 = (X.K7J) r1
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            X.K7J.A00(r0, r1)
            r0 = -571885035(0xffffffffdde9ba15, float:-2.10522461E18)
            goto L_0x0940
        L_0x07b8:
            r0 = -282963785(0xffffffffef2250b7, float:-5.023415E28)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K7J r1 = (X.K7J) r1
            r0 = 0
            X.K7J.A00(r0, r1)
            r0 = -1419416293(0xffffffffab656d1b, float:-8.150856E-13)
            goto L_0x0940
        L_0x07cc:
            r0 = 380758564(0x16b1ea24, float:2.8743656E-25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1950430551(0x74413557, float:6.1230173E31)
            goto L_0x0940
        L_0x07dd:
            r0 = -1551816365(0xffffffffa3812953, float:-1.400371E-17)
            int r6 = X.DbX.A03(r6, r0)
            java.lang.Object r5 = r1.A01
            X.LBA r5 = (X.LBA) r5
            com.instagram.model.fundraiser.NewFundraiserInfo r4 = r5.A05
            if (r4 == 0) goto L_0x0806
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x0806
            X.L8e r0 = r5.A07
            com.instagram.common.session.UserSession r3 = r0.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317474655835306(0x81068d000014aa, double:3.030655438858194E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0806
            X.MVJ r0 = r5.A06
            r0.DBJ(r4)
        L_0x0806:
            r0 = -999690448(0xffffffffc469ef30, float:-935.7373)
        L_0x0809:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x080d:
            r0 = -1993928963(0xffffffff89270efd, float:-2.0108941E-33)
            int r3 = X.DbX.A03(r6, r0)
            java.lang.Object r0 = r1.A01
            X.LBA r0 = (X.LBA) r0
            X.MVJ r0 = r0.A06
            r0.D1u()
            r0 = -79445246(0xfffffffffb43c302, float:-1.0164531E36)
            goto L_0x0940
        L_0x0822:
            r0 = -683525925(0xffffffffd74238db, float:-2.13549448E14)
            int r3 = X.DbX.A03(r6, r0)
            java.lang.Object r5 = r1.A01
            X.LBA r5 = (X.LBA) r5
            X.L8e r0 = r5.A07
            com.instagram.common.session.UserSession r4 = r0.A01
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A03
            X.0iw r0 = r0.A00
            X.LKP.A01(r0, r4, r2, r1)
            X.MVJ r0 = r5.A06
            r0.Cu7()
            r0 = -1617235426(0xffffffff9f9af21e, float:-6.5622086E-20)
            goto L_0x0940
        L_0x0844:
            java.lang.Object r0 = r1.A01
            X.LRa r0 = (X.C64159LRa) r0
            X.KOf r0 = r0.A0C
            r0.A0B()
            return
        L_0x084e:
            java.lang.Object r3 = r1.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r2 = r3.requireContext()
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 6
            X.Lh4 r0 = new X.Lh4
            r0.<init>(r3, r1)
            X.C2604245p.A01(r2, r0)
            return
        L_0x0862:
            r0 = 1397488692(0x534bfc34, float:8.7610963E11)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K40 r0 = (X.K40) r0
            X.0eM r0 = r0.A01
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 24
            X.MG2.A01(r2, r1, r0)
            r0 = -1360184916(0xffffffffaeed39ac, float:-1.0787757E-10)
            goto L_0x0940
        L_0x0881:
            r0 = 623672944(0x252c7e70, float:1.496146E-16)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K40 r0 = (X.K40) r0
            X.0eM r0 = r0.A01
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 25
            X.MG2.A01(r2, r1, r0)
            r0 = -1906655741(0xffffffff8e5abe03, float:-2.6962062E-30)
            goto L_0x0940
        L_0x08a0:
            r0 = -210830129(0xfffffffff36efccf, float:-1.8934543E31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LAW r0 = (X.LAW) r0
            X.L5R r2 = r0.A05
            X.1Yy r4 = X.FC8.A01()
            X.6gj r1 = r2.A01
            X.4DH r0 = r1.A0K
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = r1.A0N
            X.4gL r0 = r2.A00
            java.lang.String r8 = X.JTP.A0q(r0)
            java.util.Set r0 = X.C49280EsP.A00
            r0 = 5008(0x1390, float:7.018E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            r7 = 0
            r4.A03(r5, r6, r7, r8, r9)
            r0 = 908501955(0x3626a3c3, float:2.483125E-6)
            goto L_0x0940
        L_0x08d1:
            r0 = -1858854972(0xffffffff91341fc4, float:-1.4209285E-28)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LjI r0 = (X.C64856LjI) r0
            X.0eM r0 = r0.A0I
            java.lang.Object r0 = r0.getValue()
            X.JiC r0 = (X.C60255JiC) r0
            r0.A00()
            r0 = -814078463(0xffffffffcf7a2601, float:-4.19679462E9)
            goto L_0x0940
        L_0x08eb:
            r0 = 1124129358(0x4300da4e, float:128.85275)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lm3 r0 = (X.C65025Lm3) r0
            X.0eM r0 = r0.A0F
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 11
            X.MG2.A01(r2, r1, r0)
            r0 = -1016728137(0xffffffffc365f5b7, float:-229.95982)
            goto L_0x0940
        L_0x0909:
            r0 = -1526658830(0xffffffffa50108f2, float:-1.1191997E-16)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LlW r0 = (X.C64993LlW) r0
            X.0eM r0 = r0.A0A
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 9
            X.MG2.A01(r2, r1, r0)
            r0 = 1082716382(0x4088f0de, float:4.2794027)
            goto L_0x0940
        L_0x0927:
            r0 = 437198927(0x1a0f204f, float:2.9597806E-23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lm4 r0 = (X.C65026Lm4) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.8O4 r0 = (X.AnonymousClass8O4) r0
            r0.A0B()
            r0 = 1648230407(0x623e0007, float:8.7622084E20)
        L_0x0940:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0944:
            java.lang.Object r3 = r1.A01
            X.LRa r3 = (X.C64159LRa) r3
            com.instagram.common.session.UserSession r5 = r3.A0B
            X.27r r1 = X.27p.A01(r5)
            X.80P r0 = X.AnonymousClass80P.ADD_FUNDRAISER
            r1.A1X(r0)
            X.4DH r4 = r3.A0A
            java.lang.String r7 = "FEED_COMPOSER"
            java.lang.String r6 = "suggested_fundraiser_see_more_pill"
            r8 = 0
            r9 = r8
            X.LTM.A07(r4, r5, r6, r7, r8, r9)
            X.AE4 r1 = X.C59847JaN.A00(r5)
            java.lang.String r0 = "FUNDRAISER_SEE_MORE_TAPPED"
            r1.A04(r0)
        L_0x0967:
            java.lang.String r7 = "FEED_COMPOSER"
            com.instagram.user.model.User r0 = X.DbT.A0j(r5)
            boolean r0 = r0.A21()
            if (r0 == 0) goto L_0x0981
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318522627856604(0x810781000018dc, double:3.031318180584307E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0982
        L_0x0981:
            r0 = 0
        L_0x0982:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0999
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0999
            r8 = 0
            X.4DH r4 = r3.A0A
            java.lang.String r6 = "ml_fundraiser_creation_nudge"
            r9 = r8
            X.LTM.A07(r4, r5, r6, r7, r8, r9)
        L_0x0999:
            X.KOf r0 = r3.A0C
            java.lang.String r1 = r0.A0E
            X.4DH r0 = r3.A0A
            X.LKP.A01(r0, r5, r1, r7)
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            boolean r0 = r2.booleanValue()
            X.LTV.A0B(r1, r5, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY3.onClick(android.view.View):void");
    }

    public LY3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
