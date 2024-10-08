package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6aM  reason: invalid class name and case insensitive filesystem */
public final class C310056aM {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;
    public final C310016aI A03;
    public final C273384mU A04;

    public C310056aM(AnonymousClass0iw r2, 0wc r3, UserSession userSession, C310016aI r5, C273384mU r6) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(r5, 3);
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0733, code lost:
        r4.AAJ(r0, r1);
        r4.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0739, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0930, code lost:
        r7.A0F(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0933, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x096b, code lost:
        r6.A07(r7, r8, r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x096e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x097b, code lost:
        r3 = r5.A01;
        r6 = r0.A08(r5.A02);
        X.0qQ.A0B(r6, 1);
        X.AIK.A00(r3, X.C391479t9.A02, X.C391489tA.A02, r6, r2, r6.Bkd(r2.A11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0995, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b7, code lost:
        r4.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C255783ui r45, int r46, int r47) {
        /*
            r44 = this;
            r25 = 0
            r5 = r44
            X.4mU r1 = r5.A04
            r2 = r45
            java.lang.String r0 = r2.A1d
            X.3mM r0 = r1.AuO(r0)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x09d9
            X.3WT r3 = r2.A11
            int r6 = r3.ordinal()
            r4 = r46
            r3 = r47
            switch(r6) {
                case 0: goto L_0x097b;
                case 1: goto L_0x097b;
                case 4: goto L_0x00c1;
                case 15: goto L_0x093d;
                case 18: goto L_0x0959;
                case 19: goto L_0x079f;
                case 21: goto L_0x00f8;
                case 23: goto L_0x07c2;
                case 26: goto L_0x0046;
                case 30: goto L_0x0413;
                case 36: goto L_0x07d3;
                case 37: goto L_0x07cf;
                case 38: goto L_0x02bd;
                case 44: goto L_0x0236;
                case 48: goto L_0x07cf;
                case 50: goto L_0x06fa;
                case 51: goto L_0x097b;
                case 57: goto L_0x077b;
                case 65: goto L_0x0761;
                case 66: goto L_0x0020;
                case 69: goto L_0x074f;
                case 77: goto L_0x073d;
                default: goto L_0x001f;
            }
        L_0x001f:
            return
        L_0x0020:
            X.6aI r3 = r5.A03
            com.instagram.model.reels.Reel r0 = r0.A0H
            X.6aJ r1 = X.C310016aI.A01(r0, r3)
            com.instagram.common.session.UserSession r0 = r3.A06
            X.0wc r2 = X.AnonymousClass0kN.A01(r1, r0)
            java.lang.String r1 = "instagram_explore_shareable_grid_interact"
            X.0kJ r0 = r2.A00
            X.0Aj r4 = r2.A00(r0, r1)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x001f
            X.6aJ r0 = r3.A0A
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "containermodule"
            goto L_0x0733
        L_0x0046:
            X.6aI r3 = r5.A03
            com.instagram.model.reels.Reel r4 = r0.A0H
            com.instagram.common.session.UserSession r1 = r5.A02
            X.3uh r5 = r0.A08(r1)
            int r8 = r0.A01
            java.lang.String r6 = "message_share"
            java.lang.String r7 = "message_share_sticker_id"
            r3.A07(r4, r5, r6, r7, r8)
            X.3uh r1 = r0.A08(r1)
            r0 = r25
            X.0qQ.A0B(r1, r0)
            java.util.List r1 = r1.A0b()
            X.3WT r0 = X.AnonymousClass3WT.MESSAGE_SHARE
            X.3ui r0 = X.C289745e8.A00(r0, r1)
            if (r0 == 0) goto L_0x001f
            X.8D7 r2 = r0.A13
            if (r2 == 0) goto L_0x001f
            com.instagram.common.session.UserSession r0 = r3.A06
            X.6gx r1 = X.C313746gw.A00(r0)
            int r3 = r2.A00()
            X.UOB r0 = r2.A0E
            if (r0 == 0) goto L_0x0084
            java.lang.String r2 = r0.A0K
            if (r2 != 0) goto L_0x0086
        L_0x0084:
            java.lang.String r2 = ""
        L_0x0086:
            X.0wc r0 = r1.A03
            X.1Ln r4 = X.1Ln.A0E(r0)
            X.0Aj r0 = r4.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x001f
            long r0 = r1.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0h(r0)
            java.lang.String r0 = "see_channel_tooltip_rendered"
            r4.A0l(r0)
            java.lang.String r0 = "tap"
            r4.A0k(r0)
            java.lang.String r0 = "message_snippet"
            r4.A0p(r0)
            java.lang.String r0 = "story"
            r4.A0q(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = X.C313746gw.A01(r0)
            r4.A0o(r0)
            r4.A0s(r2)
            goto L_0x02b7
        L_0x00c1:
            boolean r3 = r2.A0O()
            if (r3 == 0) goto L_0x097b
            X.DDv r4 = r2.A1F
            if (r4 == 0) goto L_0x00f5
            java.lang.String r3 = r4.A09
            if (r3 == 0) goto L_0x00f5
            java.lang.String r2 = "bloks_tappable_animated_avatar_sticker_id"
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L_0x00f5
            java.lang.String r9 = "avatar_animated_sticker"
        L_0x00d9:
            if (r4 == 0) goto L_0x0975
            java.lang.String r2 = r4.A09
            if (r2 == 0) goto L_0x001f
            X.6aI r6 = r5.A03
            com.instagram.model.reels.Reel r7 = r0.A0H
            com.instagram.common.session.UserSession r2 = r5.A02
            X.3uh r8 = r0.A08(r2)
            int r11 = r0.A01
            java.lang.String r10 = r4.A09
            if (r10 != 0) goto L_0x096b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            java.lang.String r9 = "avatar_sticker"
            goto L_0x00d9
        L_0x00f8:
            X.6aI r15 = r5.A03
            java.lang.String r14 = "tap"
            com.instagram.common.session.UserSession r5 = r15.A06
            X.3uh r6 = r0.A08(r5)
            X.1Xj r5 = r6.A0b
            if (r5 == 0) goto L_0x099c
            java.util.Map r7 = r15.A0I
            java.lang.String r6 = r6.CFY()
            java.lang.Object r11 = r7.get(r6)
            X.GT8 r11 = (X.GT8) r11
            if (r11 == 0) goto L_0x001f
            X.0wc r8 = r15.A05
            java.lang.String r7 = "instagram_organic_story_media_reshare_attempt"
            X.0kJ r6 = r8.A00
            X.0Aj r7 = r8.A00(r6, r7)
            r6 = 305(0x131, float:4.27E-43)
            X.1Ln r9 = new X.1Ln
            r9.<init>(r7, r6)
            X.0Aj r6 = r9.A00
            boolean r6 = r6.isSampled()
            r13 = 0
            if (r6 == 0) goto L_0x001f
            android.content.Context r6 = r15.A04
            int r7 = X.AnonymousClass0nB.A01(r6)
            float r7 = (float) r7
            float r12 = X.0nA.A01(r6, r7)
            int r7 = X.AnonymousClass0nB.A00(r6)
            float r7 = (float) r7
            float r10 = X.0nA.A01(r6, r7)
            float r4 = (float) r4
            float r8 = X.0nA.A01(r6, r4)
            float r3 = (float) r3
            float r7 = X.0nA.A01(r6, r3)
            X.6Yf r3 = r11.A05
            float r4 = r3.A0A
            float r3 = r3.A0B
            float r4 = r4 * r3
            double r3 = (double) r4
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r16
            java.lang.String r6 = r5.getId()
            if (r6 == 0) goto L_0x0996
            r9.A0m(r6)
            X.1iA r1 = r5.BR7()
            int r1 = r1.A00
            long r5 = (long) r1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r1 = "m_t"
            r9.A0Q(r1, r5)
            com.instagram.model.reels.Reel r5 = r0.A0H
            java.lang.String r1 = r5.getId()
            X.0qQ.A07(r1)
            java.lang.String r0 = "reel_id"
            r9.A0R(r0, r1)
            java.lang.String r1 = r15.A0H
            java.lang.String r0 = "tray_session_id"
            r9.A0R(r0, r1)
            X.3kK r0 = r15.A0E
            java.lang.String r1 = r0.getSessionId()
            java.lang.String r0 = "viewer_session_id"
            r9.A0R(r0, r1)
            X.1Ns r0 = r5.A0W
            if (r0 == 0) goto L_0x0233
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x0233
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
        L_0x01a4:
            java.lang.String r0 = "a_pk"
            r9.A0Q(r0, r1)
            com.instagram.model.mediatype.ProductType r0 = r2.A0m
            if (r0 == 0) goto L_0x01af
            java.lang.String r13 = r0.A00
        L_0x01af:
            java.lang.String r0 = "tapped_media_product_type"
            r9.A0R(r0, r13)
            java.lang.String r1 = r2.A1a
            java.lang.String r0 = "tapped_media_id"
            r9.A0R(r0, r1)
            r9.A0k(r14)
            int r0 = r11.A00()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_position"
            r9.A0Q(r0, r1)
            com.instagram.model.reels.Reel r1 = r11.A02
            com.instagram.common.session.UserSession r0 = r11.A01
            java.util.List r0 = r1.A0O(r0)
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_size"
            r9.A0Q(r0, r1)
            X.3mM r0 = r11.A04
            int r0 = r0.A0E
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "tray_position"
            r9.A0Q(r0, r1)
            double r0 = (double) r8
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "start_x_position"
            r9.A0P(r0, r1)
            double r0 = (double) r7
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "start_y_position"
            r9.A0P(r0, r1)
            double r0 = (double) r10
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "screen_height"
            r9.A0P(r0, r1)
            double r0 = (double) r12
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "screen_width"
            r9.A0P(r0, r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.String r0 = "time_elapsed"
            r9.A0P(r0, r1)
            com.instagram.user.model.UpcomingEventImpl r0 = r2.A1A
            if (r0 == 0) goto L_0x0230
            java.lang.String r1 = r0.A0B
        L_0x0227:
            java.lang.String r0 = "upcoming_event_id"
            r9.A0R(r0, r1)
            r9.Cgf()
            return
        L_0x0230:
            java.lang.String r1 = r2.A1m
            goto L_0x0227
        L_0x0233:
            r1 = r13
            goto L_0x01a4
        L_0x0236:
            X.6aI r6 = r5.A03
            com.instagram.common.session.UserSession r4 = r6.A06
            X.3uh r3 = r0.A08(r4)
            boolean r1 = r3.CWu()
            if (r1 == 0) goto L_0x001f
            X.1Xj r7 = r3.A0b
            if (r7 == 0) goto L_0x001f
            com.instagram.model.reels.Reel r0 = r0.A0H
            X.6aJ r5 = X.C310016aI.A01(r0, r6)
            java.lang.String r1 = r2.A1c
            if (r1 == 0) goto L_0x02bb
            int r0 = r1.length()
            if (r0 == 0) goto L_0x02bb
            X.4Ny r3 = X.C263944Ny.A00(r1)
        L_0x025c:
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r4)
            java.lang.String r1 = "instagram_shopping_format_stories_reshare_view_shop_cta_tap"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 315(0x13b, float:4.41E-43)
            X.1Ln r4 = new X.1Ln
            r4.<init>(r1, r0)
            X.0Aj r0 = r4.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r7.getId()
            r4.A0m(r0)
            r4.A0e(r3)
            java.lang.String r3 = "stories_reshare_view_shop_cta"
            java.lang.String r0 = "entry_point"
            r4.A0R(r0, r3)
            X.327 r2 = new X.327
            r2.<init>()
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "shopping_session_id"
            r2.A06(r0, r1)
            java.lang.String r1 = r5.getModuleName()
            java.lang.String r0 = "prior_module"
            r2.A06(r0, r1)
            java.lang.String r0 = "prior_submodule"
            r2.A06(r0, r3)
            java.lang.String r0 = "submodule"
            r2.A06(r0, r3)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.A06(r0, r1)
            java.lang.String r0 = "navigation_info"
            r4.A0N(r2, r0)
        L_0x02b7:
            r4.Cgf()
            return
        L_0x02bb:
            r3 = 0
            goto L_0x025c
        L_0x02bd:
            X.6aI r5 = r5.A03
            com.instagram.user.model.Product r8 = r2.A0J()
            if (r8 == 0) goto L_0x09c1
            com.instagram.common.session.UserSession r6 = r5.A06
            X.3uh r3 = r0.A08(r6)
            boolean r2 = r3.CWu()
            if (r2 == 0) goto L_0x001f
            X.1Xj r10 = r3.A0b
            if (r10 == 0) goto L_0x001f
            X.ULx r4 = X.C294165ly.A03(r6, r8)
            long r2 = r4.A00
            r19 = r2
            X.4Ny r11 = r4.A01
            java.lang.Boolean r3 = r4.A04
            java.lang.Long r2 = r4.A06
            r18 = r2
            java.lang.Boolean r4 = r4.A03
            X.5lz r9 = X.C294165ly.A04(r10)
            java.util.List r12 = r9.A03
            java.util.Map r7 = r9.A08
            java.util.List r2 = r9.A02
            r17 = r2
            java.util.List r2 = r9.A05
            r16 = r2
            java.lang.String r2 = r8.A0H
            X.Jw8 r8 = X.C294165ly.A02(r10, r2)
            java.lang.Object r2 = r8.A02
            java.lang.Object r9 = r8.A01
            java.util.List r9 = (java.util.List) r9
            com.instagram.model.reels.Reel r14 = r0.A0H
            X.6aJ r0 = X.C310016aI.A01(r14, r5)
            X.0wc r6 = X.AnonymousClass0kN.A01(r0, r6)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "sticker_type"
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r2)
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r8 = "shared_product_ids"
            X.0eP r0 = new X.0eP
            r0.<init>(r8, r2)
            X.0eP[] r0 = new X.0eP[]{r13, r0}
            java.util.LinkedHashMap r13 = X.0Yt.A06(r0)
            X.1Ln r2 = X.1Ln.A01(r6)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x038e
            java.lang.String r15 = r5.A02
            if (r15 != 0) goto L_0x033d
            java.lang.String r15 = ""
        L_0x033d:
            java.lang.String r0 = "shopping_session_id"
            r2.A0R(r0, r15)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r15 = r0.A00
            java.lang.String r0 = "navigation_chain"
            r2.A0R(r0, r15)
            java.lang.String r15 = "instagram_organic_tap_product_share_sticker"
            java.lang.String r0 = "legacy_event_name"
            r2.A0R(r0, r15)
            X.V1Z r15 = X.V1Z.STICKER
            java.lang.String r0 = "analytics_component"
            r2.A0M(r15, r0)
            X.6aJ r0 = X.C310016aI.A01(r14, r5)
            java.lang.String r5 = r0.getModuleName()
            java.lang.String r0 = "legacy_surface"
            r2.A0R(r0, r5)
            java.lang.String r0 = r10.getId()
            r2.A0m(r0)
            java.lang.Long r5 = r11.A00
            java.lang.String r0 = "merchant_id"
            r2.A0Q(r0, r5)
            java.lang.String r0 = "has_drops_launched"
            r2.A0O(r0, r4)
            java.lang.String r0 = "is_checkout_enabled"
            r2.A0O(r0, r3)
            java.lang.String r0 = "product_ids"
            r2.A0S(r0, r12)
            r2.A0y(r7)
            r2.A0x(r13)
            r2.Cgf()
        L_0x038e:
            java.lang.String r2 = "instagram_organic_tap_product_share_sticker"
            X.0kJ r0 = r6.A00
            X.0Aj r5 = r6.A00(r0, r2)
            r0 = 308(0x134, float:4.32E-43)
            X.1Ln r2 = new X.1Ln
            r2.<init>(r5, r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x001f
            X.1iA r0 = r10.BR7()
            int r0 = r0.A00
            long r5 = (long) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "m_t"
            r2.A0Q(r0, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r19)
            java.lang.String r0 = "product_id"
            r2.A0Q(r0, r5)
            java.lang.String r0 = r10.getId()
            if (r0 == 0) goto L_0x09bb
            r2.A0m(r0)
            java.lang.String r5 = "merchant_id"
            X.0Aj r0 = r2.A00
            r0.AAE(r11, r5)
            if (r12 == 0) goto L_0x09b5
            java.lang.String r0 = "product_ids"
            r2.A0S(r0, r12)
            X.327 r5 = new X.327
            r5.<init>()
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r5.A06(r0, r1)
            java.lang.String r0 = "navigation_info"
            r2.A0N(r5, r0)
            r2.A0y(r7)
            r2.A0S(r8, r9)
            java.lang.String r1 = "tagged_user_ids"
            r0 = r16
            r2.A0S(r1, r0)
            java.lang.String r1 = "drops_launch_date"
            r0 = r18
            r2.A0Q(r1, r0)
            java.lang.String r0 = "has_drops_launched"
            r2.A0O(r0, r4)
            java.lang.String r1 = "drops_product_ids"
            r0 = r17
            r2.A0S(r1, r0)
            java.lang.String r0 = "is_checkout_enabled"
            r2.A0O(r0, r3)
            r2.Cgf()
            return
        L_0x0413:
            X.6aI r12 = r5.A03
            com.instagram.common.session.UserSession r11 = r12.A06
            X.3uh r4 = r0.A08(r11)
            boolean r3 = r4.CWu()
            if (r3 == 0) goto L_0x05fb
            X.1Xj r3 = r4.A0b
            r24 = r3
            if (r3 == 0) goto L_0x05fb
            boolean r3 = r24.A5v()
            if (r3 == 0) goto L_0x05fb
            com.instagram.user.model.Product r5 = r2.A0I()
            X.ULx r6 = X.C294165ly.A03(r11, r5)
            long r3 = r6.A00
            r42 = r3
            X.4Ny r3 = r6.A01
            r41 = r3
            java.lang.Boolean r3 = r6.A04
            r40 = r3
            java.lang.Long r3 = r6.A07
            r39 = r3
            java.lang.Long r3 = r6.A06
            r38 = r3
            java.lang.Boolean r3 = r6.A03
            r37 = r3
            X.5lz r4 = X.C294165ly.A04(r24)
            java.util.List r3 = r4.A03
            r36 = r3
            java.util.Map r3 = r4.A08
            r35 = r3
            java.util.List r3 = r4.A02
            r34 = r3
            java.util.List r3 = r4.A04
            r33 = r3
            java.lang.String r4 = r5.A0H
            r3 = r24
            X.Jw8 r4 = X.C294165ly.A02(r3, r4)
            java.lang.String r3 = r4.A03
            r32 = r3
            java.lang.Object r10 = r4.A02
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r4.A01
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r4.A00
            java.util.Map r8 = (java.util.Map) r8
            com.instagram.model.reels.Reel r14 = r0.A0H
            X.6aJ r3 = X.C310016aI.A01(r14, r12)
            X.0wc r13 = X.AnonymousClass0kN.A01(r3, r11)
            X.1Ln r4 = X.1Ln.A01(r13)
            java.lang.String r6 = java.lang.String.valueOf(r39)
            java.lang.String r23 = "product_inventory"
            X.0eP r22 = new X.0eP
            r5 = r23
            r3 = r22
            r3.<init>(r5, r6)
            java.lang.String r21 = "product_sticker_id"
            X.0eP r20 = new X.0eP
            r6 = r21
            r5 = r32
            r3 = r20
            r3.<init>(r6, r5)
            java.lang.String r6 = java.lang.String.valueOf(r34)
            java.lang.String r19 = "drops_product_ids"
            X.0eP r18 = new X.0eP
            r5 = r19
            r3 = r18
            r3.<init>(r5, r6)
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.String r7 = "shared_product_ids"
            X.0eP r17 = new X.0eP
            r3 = r17
            r3.<init>(r7, r5)
            java.lang.String r5 = java.lang.String.valueOf(r10)
            java.lang.String r6 = "sticker_styles"
            X.0eP r16 = new X.0eP
            r3 = r16
            r3.<init>(r6, r5)
            java.lang.String r15 = java.lang.String.valueOf(r8)
            java.lang.String r5 = "profile_shop_link"
            X.0eP r3 = new X.0eP
            r3.<init>(r5, r15)
            r27 = r20
            r28 = r18
            r29 = r17
            r30 = r16
            r31 = r3
            r26 = r22
            X.0eP[] r3 = new X.0eP[]{r26, r27, r28, r29, r30, r31}
            java.util.LinkedHashMap r16 = X.0Yt.A06(r3)
            X.0Aj r3 = r4.A00
            boolean r3 = r3.isSampled()
            if (r3 == 0) goto L_0x0556
            java.lang.String r15 = r12.A02
            if (r15 != 0) goto L_0x04f9
            java.lang.String r15 = ""
        L_0x04f9:
            java.lang.String r3 = "shopping_session_id"
            r4.A0R(r3, r15)
            X.1QJ r3 = X.AnonymousClass1QI.A00
            X.1QM r3 = r3.A02
            java.lang.String r15 = r3.A00
            java.lang.String r3 = "navigation_chain"
            r4.A0R(r3, r15)
            java.lang.String r15 = "instagram_organic_tap_product_sticker"
            java.lang.String r3 = "legacy_event_name"
            r4.A0R(r3, r15)
            X.V1Z r15 = X.V1Z.STICKER
            java.lang.String r3 = "analytics_component"
            r4.A0M(r15, r3)
            X.6aJ r3 = X.C310016aI.A01(r14, r12)
            java.lang.String r14 = r3.getModuleName()
            java.lang.String r3 = "legacy_surface"
            r4.A0R(r3, r14)
            r3 = r16
            r4.A0x(r3)
            r3 = r41
            java.lang.Long r14 = r3.A00
            java.lang.String r3 = "merchant_id"
            r4.A0Q(r3, r14)
            java.lang.String r3 = r24.getId()
            r4.A0m(r3)
            java.lang.String r14 = "has_drops_launched"
            r3 = r37
            r4.A0O(r14, r3)
            java.lang.String r14 = "is_checkout_enabled"
            r3 = r40
            r4.A0O(r14, r3)
            java.lang.String r14 = "product_ids"
            r3 = r36
            r4.A0S(r14, r3)
            r3 = r35
            r4.A0y(r3)
            r4.Cgf()
        L_0x0556:
            java.lang.String r4 = "instagram_organic_tap_product_sticker"
            X.0kJ r3 = r13.A00
            X.0Aj r4 = r13.A00(r3, r4)
            r3 = 310(0x136, float:4.34E-43)
            X.1Ln r13 = new X.1Ln
            r13.<init>(r4, r3)
            X.0Aj r3 = r13.A00
            boolean r3 = r3.isSampled()
            if (r3 == 0) goto L_0x05fb
            java.lang.String r3 = r24.getId()
            if (r3 == 0) goto L_0x09cd
            r13.A0m(r3)
            X.1iA r3 = r24.BR7()
            int r3 = r3.A00
            long r3 = (long) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "m_t"
            r13.A0Q(r3, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r42)
            java.lang.String r3 = "product_id"
            r13.A0Q(r3, r4)
            X.327 r14 = new X.327
            r14.<init>()
            java.lang.String r4 = r12.A02
            java.lang.String r3 = "shopping_session_id"
            r14.A06(r3, r4)
            X.1QJ r3 = X.AnonymousClass1QI.A00
            X.1QM r3 = r3.A02
            java.lang.String r4 = r3.A00
            java.lang.String r3 = "nav_chain"
            r14.A06(r3, r4)
            java.lang.String r3 = "navigation_info"
            r13.A0N(r14, r3)
            r3 = r41
            r13.A0e(r3)
            java.lang.String r4 = "drops_launch_date"
            r3 = r38
            r13.A0Q(r4, r3)
            java.lang.String r4 = "has_drops_launched"
            r3 = r37
            r13.A0O(r4, r3)
            java.lang.String r4 = "is_checkout_enabled"
            r3 = r40
            r13.A0O(r4, r3)
            r4 = r23
            r3 = r39
            r13.A0Q(r4, r3)
            java.lang.String r4 = "tagged_user_ids"
            r3 = r33
            r13.A0S(r4, r3)
            r4 = r19
            r3 = r34
            r13.A0S(r4, r3)
            java.lang.String r4 = "product_ids"
            r3 = r36
            r13.A0S(r4, r3)
            r3 = r35
            r13.A0y(r3)
            r13.A0S(r7, r9)
            r4 = r21
            r3 = r32
            r13.A0R(r4, r3)
            X.0Aj r3 = r13.A00
            r3.A9H(r5, r8)
            r13.A0S(r6, r10)
            r13.Cgf()
        L_0x05fb:
            r12.A0F(r0, r2)
            X.3uh r5 = r0.A08(r11)
            boolean r3 = r5.CWu()
            if (r3 == 0) goto L_0x001f
            X.1Xj r7 = r5.A0b
            if (r7 == 0) goto L_0x001f
            X.1Xj r3 = r7.BPf()
            X.1Xj r3 = r3.A1e(r11)
            boolean r3 = r3.CcK()
            if (r3 == 0) goto L_0x001f
            java.util.List r4 = r5.A0b()
            X.3WT r3 = X.AnonymousClass3WT.PRODUCT
            X.3ui r3 = X.C289745e8.A00(r3, r4)
            r10 = 0
            if (r3 == 0) goto L_0x062f
            com.instagram.model.shopping.reels.ProductSticker r3 = r3.A0q
            if (r3 == 0) goto L_0x062f
            java.lang.String r10 = X.C44936CnW.A00(r3)
        L_0x062f:
            java.lang.String r9 = ""
            if (r10 != 0) goto L_0x0634
            r10 = r9
        L_0x0634:
            com.instagram.user.model.Product r4 = r2.A0H()
            if (r4 == 0) goto L_0x001f
            X.ULx r2 = X.C294165ly.A03(r11, r4)
            X.4Ny r13 = r2.A01
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r2 = r4.A0H
            long r14 = java.lang.Long.parseLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            r3.add(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Long r4 = r13.A00
            r2.put(r4, r3)
            java.lang.String r14 = r5.ByO(r11)
            if (r14 != 0) goto L_0x0666
            java.lang.String r14 = r7.C9L()
        L_0x0666:
            java.lang.String r8 = r5.A0U(r11)
            com.instagram.model.reels.Reel r4 = r0.A0H
            X.6aJ r4 = X.C310016aI.A01(r4, r12)
            X.0wc r6 = X.AnonymousClass0kN.A01(r4, r11)
            java.lang.String r5 = "instagram_ad_tap_shopping_sticker"
            X.0kJ r4 = r6.A00
            X.0Aj r6 = r6.A00(r4, r5)
            r4 = 282(0x11a, float:3.95E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r6, r4)
            X.0Aj r6 = r5.A00
            boolean r4 = r6.isSampled()
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "merchant_id"
            r6.AAE(r13, r4)
            java.lang.String r4 = r7.getId()
            if (r4 == 0) goto L_0x09c7
            r5.A0m(r4)
            X.1Xj r1 = r7.BPf()
            X.1iA r1 = r1.BR7()
            int r1 = r1.A00
            long r6 = (long) r1
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r1 = "m_t"
            r5.A0Q(r1, r4)
            java.lang.String r1 = "shopping_sticker_id"
            r5.A0R(r1, r10)
            if (r14 == 0) goto L_0x06b5
            r9 = r14
        L_0x06b5:
            java.lang.String r1 = "tracking_token"
            r5.A0R(r1, r9)
            if (r8 == 0) goto L_0x06f7
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r8)
            if (r1 == 0) goto L_0x06f7
            long r6 = r1.longValue()
        L_0x06c8:
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r1 = "ad_id"
            r5.A0Q(r1, r4)
            java.lang.String r1 = "shopping"
            r5.A0k(r1)
            int r0 = r0.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_ix"
            r5.A0Q(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            java.lang.String r0 = "is_checkout_enabled"
            r5.A0O(r0, r1)
            java.lang.String r0 = "product_ids"
            r5.A0S(r0, r3)
            r5.A0y(r2)
            r5.Cgf()
            return
        L_0x06f7:
            r6 = 0
            goto L_0x06c8
        L_0x06fa:
            boolean r0 = r2.A1q
            if (r0 != 0) goto L_0x001f
            X.0wc r4 = r5.A01
            java.lang.String r3 = "instagram_upcoming_event_action"
            X.0kJ r0 = r4.A00
            X.0Aj r4 = r4.A00(r0, r3)
            java.lang.String r3 = "open_upcoming_event_bottom_sheet"
            java.lang.String r0 = "action"
            r4.AAJ(r0, r3)
            com.instagram.user.model.UpcomingEventImpl r0 = r2.A1A
            if (r0 == 0) goto L_0x073a
            java.lang.String r3 = r0.A0B
        L_0x0715:
            if (r3 == 0) goto L_0x09d3
            r0 = 10
            java.lang.Long r3 = X.00y.A0n(r0, r3)
            if (r3 == 0) goto L_0x09d3
            java.lang.String r0 = "upcoming_event_id"
            r4.A9F(r0, r3)
            java.lang.String r1 = r2.A1a
            java.lang.String r0 = "m_pk"
            r4.AAJ(r0, r1)
            X.0iw r0 = r5.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "source_of_action"
        L_0x0733:
            r4.AAJ(r0, r1)
            r4.Cgf()
            return
        L_0x073a:
            java.lang.String r3 = r2.A1m
            goto L_0x0715
        L_0x073d:
            X.6aI r6 = r5.A03
            com.instagram.model.reels.Reel r7 = r0.A0H
            com.instagram.common.session.UserSession r1 = r5.A02
            X.3uh r8 = r0.A08(r1)
            int r11 = r0.A01
            java.lang.String r9 = "achievement"
            java.lang.String r10 = "achievements_sticker_id"
            goto L_0x096b
        L_0x074f:
            X.6aI r6 = r5.A03
            com.instagram.model.reels.Reel r7 = r0.A0H
            com.instagram.common.session.UserSession r1 = r5.A02
            X.3uh r8 = r0.A08(r1)
            int r11 = r0.A01
            java.lang.String r9 = "notify_me"
            java.lang.String r10 = "notify_me_sticker_bundle_id"
            goto L_0x096b
        L_0x0761:
            X.6aI r6 = r5.A03
            com.instagram.model.reels.Reel r7 = r0.A0H
            com.instagram.common.session.UserSession r3 = r5.A02
            X.3uh r8 = r0.A08(r3)
            int r11 = r0.A01
            java.lang.String r10 = r2.A1i
            if (r10 == 0) goto L_0x0775
            java.lang.String r9 = "photo_credit"
            goto L_0x096b
        L_0x0775:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x077b:
            X.6aI r6 = r5.A03
            com.instagram.model.reels.Reel r7 = r0.A0H
            com.instagram.common.session.UserSession r3 = r5.A02
            X.3uh r8 = r0.A08(r3)
            int r11 = r0.A01
            X.ToH r0 = r2.A0C
            if (r0 == 0) goto L_0x0799
            java.lang.String r10 = r0.A04
            if (r10 == 0) goto L_0x0793
            java.lang.String r9 = "avatar_sticker"
            goto L_0x096b
        L_0x0793:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0799:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x079f:
            X.6aI r4 = r5.A03
            com.instagram.model.venue.Venue r3 = r2.A09()
            if (r3 == 0) goto L_0x07bc
            java.lang.String r8 = r3.A02()
            X.0qQ.A07(r8)
            java.lang.String r1 = r2.A1f
            X.0qQ.A07(r1)
            r6 = 0
            java.lang.String r7 = "location_attempt"
            r5 = r0
            r9 = r1
            r4.A0N(r5, r6, r7, r8, r9)
            return
        L_0x07bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07c2:
            X.6aI r5 = r5.A03
            r8 = 0
            java.lang.String r9 = "tag_attempt"
            r6 = r0
            r7 = r2
            r10 = r4
            r11 = r3
            r5.A0G(r6, r7, r8, r9, r10, r11)
            return
        L_0x07cf:
            X.6aI r7 = r5.A03
            goto L_0x0930
        L_0x07d3:
            X.6aI r7 = r5.A03
            com.instagram.common.session.UserSession r4 = r7.A06
            X.3uh r5 = r0.A08(r4)
            boolean r3 = r5.CWu()
            if (r3 == 0) goto L_0x0930
            X.1Xj r12 = r5.A0b
            if (r12 == 0) goto L_0x0930
            X.1Xj r3 = r12.BPf()
            X.1Xj r3 = r3.A1e(r4)
            boolean r3 = r3.CcK()
            if (r3 == 0) goto L_0x0930
            X.1Xj r3 = r12.BPf()
            X.1Xy r3 = r3.A0C
            X.41Z r3 = r3.BUC()
            if (r3 == 0) goto L_0x0884
            X.4hQ r3 = r3.B7C()
            if (r3 == 0) goto L_0x0884
            com.instagram.api.schemas.MoreInfoProductTagType r6 = r3.BgU()
        L_0x0809:
            com.instagram.api.schemas.MoreInfoProductTagType r3 = com.instagram.api.schemas.MoreInfoProductTagType.THUMBNAIL
            if (r6 != r3) goto L_0x0863
            java.lang.String r11 = "footer_product_thumbnail"
        L_0x080f:
            java.util.List r6 = r5.A0b()
            X.3WT r3 = X.AnonymousClass3WT.MULTI_PRODUCT
            X.3ui r3 = X.C289745e8.A00(r3, r6)
            java.lang.String r10 = ""
            if (r3 == 0) goto L_0x0861
            if (r11 != 0) goto L_0x0827
            com.instagram.model.shopping.reels.MultiProductSticker r3 = r3.A0n
            if (r3 == 0) goto L_0x0886
            java.lang.String r11 = X.CnO.A00(r3)
        L_0x0827:
            java.util.List r6 = r2.A0N()
            if (r6 == 0) goto L_0x0930
            r3 = r25
            java.lang.Object r3 = r6.get(r3)
            X.0qQ.A07(r3)
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3
            X.ULx r3 = X.C294165ly.A03(r4, r3)
            X.4Ny r13 = r3.A01
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0847:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x088c
            java.lang.Object r3 = r6.next()
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3
            java.lang.String r3 = r3.A0H
            long r14 = java.lang.Long.parseLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r8.add(r3)
            goto L_0x0847
        L_0x0861:
            r11 = r10
            goto L_0x0827
        L_0x0863:
            X.1Xj r3 = r12.BPf()
            X.1Xy r3 = r3.A0C
            X.41Z r3 = r3.BUC()
            if (r3 == 0) goto L_0x0880
            X.4hQ r3 = r3.B7C()
            if (r3 == 0) goto L_0x0880
            com.instagram.api.schemas.MoreInfoProductTagType r6 = r3.BgU()
        L_0x0879:
            com.instagram.api.schemas.MoreInfoProductTagType r3 = com.instagram.api.schemas.MoreInfoProductTagType.PILL
            if (r6 != r3) goto L_0x0882
            java.lang.String r11 = "footer_product_pill"
            goto L_0x080f
        L_0x0880:
            r6 = 0
            goto L_0x0879
        L_0x0882:
            r11 = 0
            goto L_0x080f
        L_0x0884:
            r6 = 0
            goto L_0x0809
        L_0x0886:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x088c:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.Long r3 = r13.A00
            r6.put(r3, r8)
            java.lang.String r14 = r5.ByO(r4)
            if (r14 != 0) goto L_0x08a0
            java.lang.String r14 = r12.C9L()
        L_0x08a0:
            java.lang.String r9 = r5.A0U(r4)
            com.instagram.model.reels.Reel r3 = r0.A0H
            X.6aJ r3 = X.C310016aI.A01(r3, r7)
            X.0wc r5 = X.AnonymousClass0kN.A01(r3, r4)
            java.lang.String r4 = "instagram_ad_tap_shopping_sticker"
            X.0kJ r3 = r5.A00
            X.0Aj r4 = r5.A00(r3, r4)
            r3 = 282(0x11a, float:3.95E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r4, r3)
            X.0Aj r4 = r5.A00
            boolean r3 = r4.isSampled()
            if (r3 == 0) goto L_0x0930
            java.lang.String r3 = "merchant_id"
            r4.AAE(r13, r3)
            java.lang.String r3 = r12.getId()
            if (r3 == 0) goto L_0x0937
            r5.A0m(r3)
            X.1Xj r1 = r12.BPf()
            X.1iA r1 = r1.BR7()
            int r1 = r1.A00
            long r3 = (long) r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "m_t"
            r5.A0Q(r1, r3)
            java.lang.String r1 = "shopping_sticker_id"
            r5.A0R(r1, r11)
            if (r14 == 0) goto L_0x08ef
            r10 = r14
        L_0x08ef:
            java.lang.String r1 = "tracking_token"
            r5.A0R(r1, r10)
            if (r9 == 0) goto L_0x0934
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r9)
            if (r1 == 0) goto L_0x0934
            long r3 = r1.longValue()
        L_0x0902:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "ad_id"
            r5.A0Q(r1, r3)
            java.lang.String r1 = "shopping"
            r5.A0k(r1)
            int r1 = r0.A01
            long r3 = (long) r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "m_ix"
            r5.A0Q(r1, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r25)
            java.lang.String r1 = "is_checkout_enabled"
            r5.A0O(r1, r3)
            java.lang.String r1 = "product_ids"
            r5.A0S(r1, r8)
            r5.A0y(r6)
            r5.Cgf()
        L_0x0930:
            r7.A0F(r0, r2)
            return
        L_0x0934:
            r3 = 0
            goto L_0x0902
        L_0x0937:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x093d:
            com.instagram.model.hashtag.HashtagImpl r4 = r2.A0k
            if (r4 == 0) goto L_0x0953
            X.6aI r3 = r5.A03
            java.lang.String r1 = r4.A0D
            if (r1 != 0) goto L_0x0949
            java.lang.String r1 = ""
        L_0x0949:
            r6 = 0
            java.lang.String r7 = "hashtag_attempt"
            r4 = r0
            r5 = r2
            r8 = r1
            r3.A0H(r4, r5, r6, r7, r8)
            return
        L_0x0953:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0959:
            X.6aI r6 = r5.A03
            com.instagram.model.reels.Reel r7 = r0.A0H
            com.instagram.common.session.UserSession r3 = r5.A02
            X.3uh r8 = r0.A08(r3)
            int r11 = r0.A01
            java.lang.String r10 = r2.A1i
            if (r10 == 0) goto L_0x096f
            java.lang.String r9 = "link_web"
        L_0x096b:
            r6.A07(r7, r8, r9, r10, r11)
            return
        L_0x096f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0975:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x097b:
            X.0wc r3 = r5.A01
            com.instagram.common.session.UserSession r1 = r5.A02
            X.3uh r6 = r0.A08(r1)
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.9t9 r4 = X.C391479t9.CLICK
            X.9tA r5 = X.C391489tA.CONSUMER_STICKER
            X.3WT r0 = r2.A11
            java.util.List r8 = r6.Bkd(r0)
            r7 = r2
            X.AIK.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x0996:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x099c:
            java.lang.String r3 = "Missing media ID for reel item: "
            java.lang.String r2 = r6.A0j
            java.lang.String r1 = ", In reel: "
            com.instagram.model.reels.Reel r0 = r0.A0H
            java.lang.String r0 = r0.getId()
            X.0qQ.A07(r0)
            java.lang.String r1 = X.002.A0u(r3, r2, r1, r0)
            java.lang.String r0 = "ReelViewerLogger"
            X.0wb.A03(r0, r1)
            return
        L_0x09b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09c7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310056aM.A00(X.3ui, int, int):void");
    }
}
