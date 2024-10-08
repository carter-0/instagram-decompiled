package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6Vg  reason: invalid class name and case insensitive filesystem */
public final class C308696Vg implements C233022up {
    public boolean A00;
    public final HashMap A01 = 0Yt.A02(new 0eP[]{new 0eP(C233162v9.PROFILE_TAP, AnonymousClass3DY.PROFILE_TAP), new 0eP(C233162v9.CTA_CLICK, AnonymousClass3DY.CTA_CLICK), new 0eP(C233162v9.TAP_AND_HOLD, AnonymousClass3DY.TAP_AND_HOLD)});
    public final UserSession A02;
    public final C308686Vf A03;
    public final Set A04 = new LinkedHashSet();

    public final String B4s() {
        return "stories_iaa";
    }

    public final Set Bsw() {
        if (!this.A00) {
            Set<C233162v9> keySet = this.A01.keySet();
            0qQ.A07(keySet);
            for (C233162v9 r4 : keySet) {
                Set set = this.A04;
                0qQ.A0A(r4);
                set.add(new C376459Ib(C230472pg.SPONSORED, r4, C230432pc.STORIES));
            }
            this.A00 = true;
        }
        ImmutableSet A032 = ImmutableSet.A03(this.A04);
        0qQ.A07(A032);
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021c, code lost:
        if (r1 != null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0260, code lost:
        if (r1 != null) goto L_0x0230;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CJE(X.C376459Ib r42, java.util.List r43) {
        /*
            r41 = this;
            r25 = 0
            r2 = r42
            r0 = r25
            X.0qQ.A0B(r2, r0)
            r9 = 1
            r1 = r43
            X.0qQ.A0B(r1, r9)
            r3 = r41
            java.util.Set r0 = r3.Bsw()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0409
            int r0 = r1.size()
            if (r0 != r9) goto L_0x0409
            r0 = r25
            java.lang.Object r2 = r1.get(r0)
            X.9IV r2 = (X.AnonymousClass9IV) r2
            java.util.HashMap r1 = r3.A01
            java.lang.Object r0 = r2.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            java.lang.Object r0 = r0.A04
            java.lang.Object r14 = r1.get(r0)
            X.3DY r14 = (X.AnonymousClass3DY) r14
            if (r14 == 0) goto L_0x0409
            X.6Vf r10 = r3.A03
            java.lang.Object r0 = r2.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            java.lang.Object r0 = r0.A02
            X.9JO r0 = (X.AnonymousClass9JO) r0
            java.lang.String r1 = r0.A04
            r0 = r25
            X.0qQ.A0B(r1, r0)
            com.instagram.common.session.UserSession r0 = r10.A04
            X.1E8 r0 = X.1E7.A00(r0)
            X.1Xj r8 = r0.A02(r1)
            if (r8 == 0) goto L_0x0409
            X.4gi r13 = r10.A06
            X.3mM r7 = r13.Bkz(r1)
            if (r7 == 0) goto L_0x0409
            X.6VU r6 = r10.A05
            int r18 = r13.CMI(r7)
            X.3kU r0 = r10.A07
            r19 = r0
            r17 = 3
            X.1Xy r0 = r8.A0C
            X.3lZ r0 = r0.getInjected()
            r24 = 0
            if (r0 == 0) goto L_0x0409
            java.util.List r0 = r0.BeK()
            if (r0 == 0) goto L_0x0409
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0083:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger r0 = (com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x009f;
                case 2: goto L_0x00a8;
                case 3: goto L_0x0083;
                case 4: goto L_0x0083;
                case 5: goto L_0x00a5;
                case 6: goto L_0x009c;
                case 7: goto L_0x00a2;
                default: goto L_0x0096;
            }
        L_0x0096:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x009c:
            X.3DY r0 = X.AnonymousClass3DY.SHARE_BUTTON
            goto L_0x00aa
        L_0x009f:
            X.3DY r0 = X.AnonymousClass3DY.CAPTION_CLICK
            goto L_0x00aa
        L_0x00a2:
            X.3DY r0 = X.AnonymousClass3DY.TAP_AND_HOLD
            goto L_0x00aa
        L_0x00a5:
            X.3DY r0 = X.AnonymousClass3DY.PROFILE_TAP
            goto L_0x00aa
        L_0x00a8:
            X.3DY r0 = X.AnonymousClass3DY.CTA_CLICK
        L_0x00aa:
            r2.add(r0)
            goto L_0x0083
        L_0x00ae:
            boolean r0 = r2.contains(r14)
            if (r0 != r9) goto L_0x0409
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x0409
            com.instagram.model.reels.Reel r5 = r7.A0H
            boolean r0 = r5.A0m()
            if (r0 != 0) goto L_0x0409
            com.instagram.common.session.UserSession r4 = r6.A04
            X.0Tu r3 = X.0Tu.A06
            r0 = 36321666544117366(0x810a5d00032676, double:3.033306405887148E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x0409
            r0 = 100
            X.2HY r1 = new X.2HY
            r1.<init>(r9, r0)
            X.2SQ r0 = X.2SP.A00
            int r0 = X.C229632nm.A04(r0, r1)
            double r11 = (double) r0
            r0 = 37162243183804638(0x8406dd000700de, double:3.5648904575558285E-306)
            double r1 = X.182.A00(r3, r4, r0)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0409
            r0 = r19
            java.util.LinkedList r0 = r0.A02
            r29 = r0
            boolean r0 = r29.isEmpty()
            if (r0 == 0) goto L_0x01d9
            r1 = r24
        L_0x00fa:
            X.2vm r0 = r5.A0b
            if (r0 == 0) goto L_0x01d5
            X.2vo r11 = r0.A00
        L_0x0100:
            java.lang.String r27 = X.C231122qu.A07(r4, r8)
            if (r27 == 0) goto L_0x0401
            if (r1 == 0) goto L_0x01d1
            java.util.List r0 = X.C250973mM.A00(r4, r1)
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3uh r0 = (X.C255773uh) r0
            if (r0 == 0) goto L_0x01d1
            java.lang.String r28 = r0.A0U(r4)
        L_0x011a:
            boolean r33 = X.AnonymousClass6VU.A01(r7, r6)
            java.lang.String r30 = X.C231122qu.A0F(r4, r8)
            java.lang.Integer r26 = X.AnonymousClass6VU.A00(r7, r6)
            if (r11 == 0) goto L_0x01cd
            java.lang.Integer r0 = r11.A04
            r16 = r0
        L_0x012c:
            boolean r0 = r5.A1I
            if (r0 == 0) goto L_0x0146
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
        L_0x0132:
            X.6aH r0 = r6.A07
            int r32 = r29.size()
            java.lang.String r29 = X.C55095Hc4.A00(r2)
            r25 = r14
            r31 = r18
            r24 = r0
            r24.A02(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return
        L_0x0146:
            boolean r0 = X.C297785sK.A0l(r7)
            if (r0 == 0) goto L_0x014f
            java.lang.Integer r2 = X.AnonymousClass05K.A06
            goto L_0x0132
        L_0x014f:
            if (r1 == 0) goto L_0x015a
            com.instagram.model.reels.Reel r0 = r1.A0H
            com.instagram.api.schemas.IntentAwareAdsInfo r0 = r0.A0B
            if (r0 == 0) goto L_0x015a
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            goto L_0x0132
        L_0x015a:
            X.1Ph r0 = r6.A08
            X.1Pi r15 = X.1Pi.A02
            r12 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            boolean r0 = r0.A03(r15, r2, r12)
            if (r0 == 0) goto L_0x0132
            if (r11 != 0) goto L_0x016e
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            goto L_0x0132
        L_0x016e:
            if (r1 == 0) goto L_0x0184
            com.instagram.model.reels.Reel r0 = r1.A0H
            X.3Hd r0 = r0.A0X
            if (r0 == 0) goto L_0x0184
            r11 = 2342160827468027462(0x208106dd00111646, double:4.0637359449844895E-152)
            boolean r0 = X.182.A06(r3, r4, r11)
            if (r0 == 0) goto L_0x0184
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x0132
        L_0x0184:
            if (r16 == 0) goto L_0x01c9
            int r0 = r16.intValue()
            if (r0 <= 0) goto L_0x01c9
            r11 = 36317818253940289(0x8106dd000b1641, double:3.0308727316833435E-306)
            boolean r0 = X.182.A06(r3, r4, r11)
            if (r0 == 0) goto L_0x01a4
            if (r1 == 0) goto L_0x01a4
            com.instagram.model.reels.Reel r0 = r1.A0H
            boolean r0 = r0.A0m()
            if (r0 == 0) goto L_0x01a4
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x0132
        L_0x01a4:
            r0 = 2342160827467437630(0x208106dd0008163e, double:4.063735944484362E-152)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x01ef
            X.3Hd r0 = r5.A0X
            if (r0 == 0) goto L_0x01b7
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            goto L_0x0132
        L_0x01b7:
            com.instagram.api.schemas.IntentAwareAdsInfo r0 = r5.A0B
            if (r0 == 0) goto L_0x01bf
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            goto L_0x0132
        L_0x01bf:
            int r1 = r6.A00
            r0 = r18
            if (r0 == r1) goto L_0x01ef
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            goto L_0x0132
        L_0x01c9:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0132
        L_0x01cd:
            r16 = r24
            goto L_0x012c
        L_0x01d1:
            r28 = r24
            goto L_0x011a
        L_0x01d5:
            r11 = r24
            goto L_0x0100
        L_0x01d9:
            X.3n0 r0 = r19.A00()
            java.lang.Object r1 = r0.BTb()
            X.3mM r1 = (X.C250973mM) r1
            if (r1 == 0) goto L_0x00fa
            com.instagram.model.reels.Reel r0 = r1.A0H
            X.2vm r0 = r0.A0b
            if (r0 == 0) goto L_0x00fa
            X.2vo r11 = r0.A00
            goto L_0x0100
        L_0x01ef:
            int r13 = r13.CMI(r7)
            X.2uu r0 = r10.A01
            r23 = r0
            java.lang.String r11 = "Required value was null."
            if (r0 == 0) goto L_0x03fb
            X.2ur r0 = r10.A00
            r40 = r0
            java.util.List r0 = r10.A02
            r22 = r0
            if (r0 == 0) goto L_0x03f5
            java.lang.Integer r0 = r6.A02
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            if (r0 == r10) goto L_0x0409
            r6.A02 = r10
            java.lang.String r12 = X.C231122qu.A07(r4, r8)
            if (r12 == 0) goto L_0x03ef
            boolean r0 = r29.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x026a
            r1 = r3
        L_0x021b:
            r15 = r3
            if (r1 == 0) goto L_0x025e
        L_0x021e:
            java.util.List r0 = X.C250973mM.A00(r4, r1)
            if (r0 == 0) goto L_0x025e
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3uh r0 = (X.C255773uh) r0
            if (r0 == 0) goto L_0x025e
            java.lang.String r21 = r0.ByO(r4)
        L_0x0230:
            com.instagram.model.reels.Reel r0 = r1.A0H
            X.2vm r0 = r0.A0b
            if (r0 == 0) goto L_0x0263
            X.2vo r3 = r0.A00
        L_0x0238:
            boolean r20 = X.AnonymousClass6VU.A01(r7, r6)
            java.lang.String r2 = X.C231122qu.A0F(r4, r8)
            java.lang.Integer r19 = X.AnonymousClass6VU.A00(r7, r6)
            X.6aH r1 = r6.A07
            int r18 = r29.size()
            if (r3 != 0) goto L_0x0289
            java.lang.String r7 = "all_gap_rules_null"
            r3 = r14
            r4 = r19
            r5 = r12
            r6 = r15
            r8 = r2
            r9 = r13
            r10 = r18
            r11 = r20
            r2 = r1
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x025e:
            r21 = r3
            if (r1 == 0) goto L_0x0263
            goto L_0x0230
        L_0x0263:
            X.2vm r0 = r5.A0b
            if (r0 == 0) goto L_0x0238
            X.2vo r3 = r0.A00
            goto L_0x0238
        L_0x026a:
            X.3n0 r0 = r19.A00()
            java.lang.Object r1 = r0.BTb()
            X.3mM r1 = (X.C250973mM) r1
            if (r1 == 0) goto L_0x021b
            java.util.List r0 = X.C250973mM.A00(r4, r1)
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3uh r0 = (X.C255773uh) r0
            if (r0 == 0) goto L_0x021b
            java.lang.String r15 = r0.A0U(r4)
            goto L_0x021e
        L_0x0289:
            r5 = r17
            r0 = r19
            X.0qQ.A0B(r0, r5)
            X.0wc r8 = r1.A02
            java.lang.String r5 = "instagram_ad_pivots_fetch_start"
            X.0kJ r0 = r8.A00
            X.0Aj r5 = r8.A00(r0, r5)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x0320
            r16 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "chaining_position"
            r5.A9F(r0, r8)
            X.3kK r0 = r1.A04
            r8 = r0
            java.lang.String r1 = r0.getSessionId()
            java.lang.String r0 = "chaining_session_id"
            r5.AAJ(r0, r1)
            java.lang.String r1 = r8.getSessionId()
            java.lang.String r0 = "client_session_id"
            r5.AAJ(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r0 = "contextual_ads_category"
            r5.AAJ(r0, r1)
            java.lang.String r1 = "reel_feed_timeline"
            java.lang.String r0 = "container_module"
            r5.AAJ(r0, r1)
            java.lang.String r1 = r14.A00
            java.lang.String r0 = "trigger_type"
            r5.AAJ(r0, r1)
            int r0 = X.AnonymousClass59V.A00(r19)
            long r0 = (long) r0
            r16 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "multi_ads_type_number"
            r5.A9F(r0, r1)
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r12)
            java.lang.String r0 = "hscroll_seed_ad_id"
            r5.A9F(r0, r1)
            long r0 = (long) r13
            r16 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "hscroll_seed_ad_position"
            r5.A9F(r0, r1)
            r0 = r18
            long r0 = (long) r0
            r16 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "num_ads_in_ad_pool"
            r5.A9F(r0, r1)
            java.lang.String r0 = "top_of_ad_pool_ad_id"
            r5.AAJ(r0, r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "is_seed_ad_multi_ads_eligible"
            r5.A7p(r0, r1)
            java.lang.String r0 = "hscroll_seed_ad_tracking_token"
            r5.AAJ(r0, r2)
            r5.Cgf()
        L_0x0320:
            X.4LN r1 = new X.4LN
            r27 = r24
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r32 = r24
            r33 = r24
            r34 = r24
            r35 = r22
            r36 = r25
            r37 = r25
            r38 = r25
            r39 = r25
            r26 = r1
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0 = r40
            r0.DFK(r1)
            r6.A01 = r13
            if (r2 == 0) goto L_0x03e9
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            X.15p r0 = X.AnonymousClass15o.A00
            X.17W r0 = r0.A0A(r1)
            X.C250043ko.A00(r0, r3)
            r0.close()
            java.lang.String r5 = r1.toString()
            X.0qQ.A07(r5)
            r0 = -2
            X.1NY r3 = new X.1NY
            r3.<init>(r4, r0)
            r3.A08(r10)
            java.lang.String r0 = "stories/stories_intent_aware_ads/"
            r3.A0A(r0)
            java.lang.Class<X.CFu> r10 = X.C43854CFu.class
            java.lang.Class<X.D27> r8 = X.D27.class
            r1 = r24
            r0 = r25
            r3.A0O(r1, r10, r8, r0)
            java.lang.String r1 = "container_module"
            java.lang.String r0 = "reel_feed_timeline"
            r3.A9m(r1, r0)
            java.lang.String r0 = "seed_ad_id"
            r3.A9m(r0, r12)
            java.lang.String r0 = "seed_ad_token"
            r3.A9m(r0, r2)
            java.lang.String r0 = "position"
            r3.A0C(r0, r13)
            java.lang.String r1 = r14.A00
            java.lang.String r0 = "trigger_type"
            r3.A9m(r0, r1)
            java.lang.String r0 = "next_slot_ad_id"
            r3.A0G(r0, r15)
            java.lang.String r1 = "next_slot_ad_tracking_token"
            r0 = r21
            r3.A0G(r1, r0)
            java.lang.String r0 = "client_gap_rules"
            r3.A9m(r0, r5)
            java.lang.String r1 = "is_seed_ad_eligible"
            r0 = r20
            r3.A0H(r1, r0)
            r3.A0R = r9
            android.content.Context r5 = r6.A03
            X.1Cn r1 = new X.1Cn
            r1.<init>(r5)
            r0 = r25
            X.1G2.A00(r5, r3, r4, r1, r0)
            X.1OC r3 = r3.A0M()
            X.6VX r1 = r6.A06
            java.util.UUID r22 = java.util.UUID.randomUUID()
            X.0qQ.A07(r22)
            X.H4W r0 = new X.H4W
            r15 = r0
            r16 = r14
            r17 = r7
            r18 = r1
            r19 = r23
            r20 = r12
            r21 = r2
            r23 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A00 = r0
            r1 = 1613189636(0x60275204, float:4.8226814E19)
            r0 = 2
            X.1ES.A05(r3, r1, r0, r9, r9)
            return
        L_0x03e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L_0x03ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L_0x03f5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L_0x03fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L_0x0401:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0409:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308696Vg.CJE(X.9Ib, java.util.List):void");
    }

    public C308696Vg(UserSession userSession, C308686Vf r7) {
        this.A03 = r7;
        this.A02 = userSession;
    }
}
