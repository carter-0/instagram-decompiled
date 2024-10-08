package X;

/* renamed from: X.SGv  reason: case insensitive filesystem */
public final class C11235SGv {
    public final 0TC A00 = new Object();
    public final C10914S0p A01 = new C10914S0p(this);

    public static void A00(0Ak r2, C10914S0p s0p, Object obj) {
        r2.A0R("initial_url", s0p.A00((String) obj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0653, code lost:
        r4.A0Q(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0692, code lost:
        r4.A0R(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0737, code lost:
        r4.A0M(r10, "nv_source");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x082a, code lost:
        X.Pxf.A1D(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x082d, code lost:
        r4.A0R("tracking_token", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0850, code lost:
        r4.A0P("event_ts", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0855, code lost:
        r4.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0858, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02b0, code lost:
        r4.A0O(r0, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0162 A[SYNTHETIC, Splitter:B:27:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a5 A[Catch:{ NumberFormatException -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.facebook.iabeventlogging.model.IABEvent r28, X.AnonymousClass0iw r29, com.instagram.common.session.UserSession r30, java.lang.Integer r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, double r42, boolean r44, boolean r45) {
        /*
            r27 = this;
            r6 = r28
            r19 = r35
            r9 = 0
            r10 = r30
            X.0qQ.A0B(r10, r9)
            r14 = 1
            r0 = 11
            r1 = r31
            X.0qQ.A0B(r1, r0)
            X.0kJ r0 = X.0kJ.A05
            r12 = r29
            X.0wc r4 = X.AnonymousClass0kN.A00(r12, r0, r10)
            X.SH7 r18 = new X.SH7
            r0 = r18
            r0.<init>(r10)
            X.RGn r0 = r6.A02
            int r13 = r0.ordinal()
            java.lang.String r0 = "IABLogger"
            r11 = 0
            r2 = r42
            r8 = r27
            r21 = r40
            r5 = r32
            r7 = r33
            r20 = r34
            r22 = r37
            switch(r13) {
                case 0: goto L_0x0393;
                case 1: goto L_0x014f;
                case 2: goto L_0x0285;
                case 3: goto L_0x02b5;
                case 4: goto L_0x0300;
                case 5: goto L_0x032a;
                case 6: goto L_0x034b;
                case 7: goto L_0x0371;
                case 8: goto L_0x081b;
                case 9: goto L_0x073f;
                case 10: goto L_0x003b;
                case 11: goto L_0x0658;
                case 12: goto L_0x067c;
                case 13: goto L_0x003b;
                case 14: goto L_0x003b;
                case 15: goto L_0x003b;
                case 16: goto L_0x003b;
                case 17: goto L_0x003c;
                case 18: goto L_0x0095;
                case 19: goto L_0x003b;
                case 20: goto L_0x0697;
                case 21: goto L_0x06eb;
                case 22: goto L_0x0778;
                case 23: goto L_0x003b;
                case 24: goto L_0x0834;
                case 25: goto L_0x07b9;
                default: goto L_0x003b;
            }
        L_0x003b:
            return
        L_0x003c:
            if (r44 != 0) goto L_0x0044
            if (r45 == 0) goto L_0x003b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x003b
        L_0x0044:
            com.facebook.iabeventlogging.model.IABHistoryEvent r6 = (com.facebook.iabeventlogging.model.IABHistoryEvent) r6
            java.lang.String r0 = "iab_navigation"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 178(0xb2, float:2.5E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x003b
            X.Pxe.A1R(r4, r5)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            X.Pxf.A1D(r4, r2)
            java.lang.String[] r1 = r6.A04
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = "urls"
            r4.A0S(r0, r1)
            java.lang.Long r1 = r6.A02
            java.lang.String r0 = "start_ts"
            r4.A0Q(r0, r1)
            java.lang.Long r1 = r6.A01
            java.lang.String r0 = "interactive_ts"
            r4.A0Q(r0, r1)
            java.lang.Long r1 = r6.A00
            java.lang.String r0 = "fully_loaded_ts"
            r4.A0Q(r0, r1)
            boolean r0 = r6.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_js_navigation"
            goto L_0x02b0
        L_0x0095:
            com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent r6 = (com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent) r6
            if (r45 == 0) goto L_0x003b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x003b
            java.lang.String r0 = r12.getModuleName()
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "in_app_browser_v2"
        L_0x00a5:
            X.SHc r3 = new X.SHc
            r3.<init>(r10, r5, r0, r14)
            long r0 = r6.A01
            r16 = r0
            long r4 = r6.A00
            java.lang.String r10 = r6.A03
            X.0qQ.A06(r10)
            java.lang.String r6 = r6.A02
            X.TXj r1 = X.C13374TXj.A00
            X.TXk r12 = X.C13375TXk.A00
            X.C51972G9s.A1E(r1, r12)
            com.instagram.common.session.UserSession r8 = r3.A01
            java.lang.String r0 = "history_write_started"
            X.C11242SHc.A00(r3, r0, r11)
            java.lang.String r13 = r3.A03
            r0 = 12
            X.MPB r2 = new X.MPB
            r2.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r1)
            r1 = 13
            X.MPB r0 = new X.MPB
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r12)
            X.1vn r3 = X.1vm.A01(r8)
            X.0K0 r15 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r12 = X.AnonymousClass7TF.A0b()
            java.lang.String r8 = "client_mutation_id"
            X.0Df r8 = X.C41845B3m.A03(r15, r12, r8)
            java.lang.String r12 = X.C46326Dbu.A00()
            X.0Df.A00(r8, r13, r12)
            java.lang.String r13 = java.lang.String.valueOf(r16)
            java.lang.String r12 = "start_time_str"
            X.0Df.A00(r8, r13, r12)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "end_time_str"
            X.0Df.A00(r8, r5, r4)
            java.lang.String r4 = "page_url"
            X.0Df.A00(r8, r10, r4)
            java.lang.String r4 = "page_title"
            X.0Df.A00(r8, r6, r4)
            java.lang.String r4 = "ad_impression_token"
            X.0Df.A00(r8, r7, r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.String r4 = "is_direct_message"
            X.2IS r6 = X.JTQ.A0D(r8, r5, r4)
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r4 = "data"
            X.1vR r16 = X.C41847B3o.A04(r8, r6, r4)
            java.util.Map r18 = r6.getParamsCopy()
            java.util.Map r19 = r5.getParamsCopy()
            java.lang.Class<X.BxA> r20 = X.C43372BxA.class
            java.util.ArrayList r26 = X.AnonymousClass7TE.A1C()
            java.lang.String r17 = "XFBCreateIabLinkHistory"
            r23 = 64
            java.lang.String r25 = "xfb_create_iab_link_history"
            com.facebook.pando.PandoGraphQLRequest r15 = new com.facebook.pando.PandoGraphQLRequest
            r22 = r11
            r24 = r11
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = 19
            X.DFg r4 = new X.DFg
            r4.<init>(r2, r5)
            X.C12090Smk.A00(r4, r15, r3, r0, r1)
            return
        L_0x014f:
            com.facebook.iabeventlogging.model.IABLaunchEvent r6 = (com.facebook.iabeventlogging.model.IABLaunchEvent) r6
            r12 = 0
            if (r36 == 0) goto L_0x015f
            int r0 = r36.length()     // Catch:{ NumberFormatException -> 0x015f }
            if (r0 <= 0) goto L_0x015f
            java.lang.Long r13 = X.DbV.A0q(r36)     // Catch:{ NumberFormatException -> 0x015f }
            goto L_0x0160
        L_0x015f:
            r13 = r11
        L_0x0160:
            if (r34 == 0) goto L_0x01a3
            int r0 = r20.length()     // Catch:{ NumberFormatException -> 0x01aa }
            if (r0 <= 0) goto L_0x01a3
            java.lang.String r1 = "_"
            r0 = r20
            java.util.List r15 = X.DbW.A0o(r0, r1)     // Catch:{ NumberFormatException -> 0x01aa }
            boolean r0 = r15.isEmpty()     // Catch:{ NumberFormatException -> 0x01aa }
            if (r0 != 0) goto L_0x01a0
            java.util.ListIterator r1 = X.C51968G9o.A18(r15)     // Catch:{ NumberFormatException -> 0x01aa }
        L_0x017a:
            boolean r0 = r1.hasPrevious()     // Catch:{ NumberFormatException -> 0x01aa }
            if (r0 == 0) goto L_0x01a0
            int r0 = X.DbX.A06(r1)     // Catch:{ NumberFormatException -> 0x01aa }
            if (r0 == 0) goto L_0x017a
            java.util.List r0 = X.DbX.A0y(r15, r1)     // Catch:{ NumberFormatException -> 0x01aa }
        L_0x018a:
            java.lang.String[] r1 = X.DbU.A1b(r0, r9)     // Catch:{ NumberFormatException -> 0x01aa }
            r0 = r1[r9]     // Catch:{ NumberFormatException -> 0x01aa }
            java.lang.Long r11 = X.DbV.A0q(r0)     // Catch:{ NumberFormatException -> 0x01aa }
            if (r13 != 0) goto L_0x01a3
            int r0 = r1.length     // Catch:{ NumberFormatException -> 0x01aa }
            if (r0 <= r14) goto L_0x01a3
            r0 = r1[r14]     // Catch:{ NumberFormatException -> 0x01aa }
            java.lang.Long r13 = X.DbV.A0q(r0)     // Catch:{ NumberFormatException -> 0x01aa }
            goto L_0x01a3
        L_0x01a0:
            X.0sn r0 = X.0sn.A00     // Catch:{ NumberFormatException -> 0x01aa }
            goto L_0x018a
        L_0x01a3:
            if (r35 == 0) goto L_0x01b2
            java.lang.Long r12 = X.AnonymousClass7TE.A10(r19)     // Catch:{ NumberFormatException -> 0x01aa }
            goto L_0x01b2
        L_0x01aa:
            r9 = move-exception
            java.lang.String r1 = "IAB Logging"
            java.lang.String r0 = "error parsing post id, author id or ad id"
            X.0wb.A06(r1, r0, r9)
        L_0x01b2:
            java.lang.String r0 = "iab_launch"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 176(0xb0, float:2.47E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "click_source"
            r4.A0R(r0, r1)
            X.S0p r1 = r8.A01
            com.facebook.privacy.zone.api.ZonedValue r0 = r6.A04
            java.lang.Object r0 = r0.A01
            A00(r4, r1, r0)
            long r0 = r6.A01
            double r8 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            java.lang.String r0 = "user_click_ts"
            r4.A0P(r0, r1)
            long r0 = r6.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "flags"
            r4.A0Q(r0, r1)
            X.Pxf.A1D(r4, r2)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            java.lang.String r0 = "post_id"
            r4.A0Q(r0, r11)
            java.lang.String r0 = "ig_media_author_id"
            r4.A0Q(r0, r13)
            java.lang.String r1 = "history_entry_id"
            r0 = r22
            r4.A0R(r1, r0)
            java.lang.String r1 = "callsite_session_id"
            r0 = r21
            r4.A0R(r1, r0)
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            java.util.List r0 = r6.A07
            if (r0 == 0) goto L_0x0249
            java.util.Iterator r1 = r0.iterator()
        L_0x0217:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r1.next()
            X.RFY r0 = (X.RFY) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0231;
                case 2: goto L_0x022e;
                case 3: goto L_0x0234;
                case 4: goto L_0x022b;
                case 5: goto L_0x0243;
                case 6: goto L_0x0240;
                case 7: goto L_0x0237;
                case 8: goto L_0x023a;
                case 9: goto L_0x023d;
                default: goto L_0x022a;
            }
        L_0x022a:
            goto L_0x0217
        L_0x022b:
            X.RIr r0 = X.C8952RIr.IAB_STICKY_UTM_PARAMS
            goto L_0x0245
        L_0x022e:
            X.RIr r0 = X.C8952RIr.IAB_META_CHECKOUT_SHOPIFY_SCA
            goto L_0x0245
        L_0x0231:
            X.RIr r0 = X.C8952RIr.IAB_META_CHECKOUT_SHOPIFY_SDK
            goto L_0x0245
        L_0x0234:
            X.RIr r0 = X.C8952RIr.IAB_META_CHECKOUT_FIRMLY
            goto L_0x0245
        L_0x0237:
            X.RIr r0 = X.C8952RIr.IAB_NO_ADS_CONTEXT
            goto L_0x0245
        L_0x023a:
            X.RIr r0 = X.C8952RIr.IAB_AUTOFILL_ADS_PERSONALIZATION
            goto L_0x0245
        L_0x023d:
            X.RIr r0 = X.C8952RIr.IAB_PAYPAL_CHECKOUT
            goto L_0x0245
        L_0x0240:
            X.RIr r0 = X.C8952RIr.IAB_WATCH_AND_BROWSE_WEB_TO_WA
            goto L_0x0245
        L_0x0243:
            X.RIr r0 = X.C8952RIr.IAB_META_CHECKOUT_METAPAYMENTS_SDK
        L_0x0245:
            r2.add(r0)
            goto L_0x0217
        L_0x0249:
            java.lang.String r1 = "post_click_eligible_experience_types"
            X.0Aj r0 = r4.A00
            r0.AAF(r1, r2)
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig r0 = r6.A03
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "view_mode_launch_config"
            r4.A0R(r0, r1)
            com.facebook.browser.iabcontext.IabCommonTrait r0 = r6.A02
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "iab_context"
            r4.A0R(r0, r1)
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "extra_info"
            r4.A0R(r0, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330475521852046(0x8112600000428e, double:3.0388772388774656E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x027e
            if (r12 == 0) goto L_0x0855
        L_0x027e:
            java.lang.String r0 = "ad_id"
            r4.A0Q(r0, r12)
            goto L_0x0855
        L_0x0285:
            com.facebook.iabeventlogging.model.IABLandingPageStartedEvent r6 = (com.facebook.iabeventlogging.model.IABLandingPageStartedEvent) r6
            java.lang.String r0 = "iab_landing_page_started"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 174(0xae, float:2.44E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            X.S0p r1 = r8.A01
            com.facebook.privacy.zone.api.ZonedValue r0 = r6.A00
            java.lang.Object r0 = r0.A01
            A00(r4, r1, r0)
            X.Pxf.A1D(r4, r2)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            boolean r0 = r6.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_cookie_load_complete"
        L_0x02b0:
            r4.A0O(r0, r1)
            goto L_0x0855
        L_0x02b5:
            com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent r6 = (com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent) r6
            java.lang.String r0 = "iab_landing_page_interactive"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 173(0xad, float:2.42E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            X.S0p r5 = r8.A01
            com.facebook.privacy.zone.api.ZonedValue r0 = r6.A04
            java.lang.Object r0 = r0.A01
            A00(r4, r5, r0)
            java.lang.String r1 = r6.A06
            r0 = r18
            java.lang.String r0 = r0.A00(r1)
            java.lang.String r1 = r5.A00(r0)
            java.lang.String r0 = "initial_land_url"
            r4.A0R(r0, r1)
            X.Pxf.A1D(r4, r2)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            int r0 = r6.A01
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "screen_width"
            r4.A0Q(r0, r1)
            int r0 = r6.A00
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "page_content_width"
            goto L_0x0653
        L_0x0300:
            com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent r6 = (com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent) r6
            java.lang.String r0 = "iab_landing_page_finished"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 172(0xac, float:2.41E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            X.S0p r5 = r8.A01
            com.facebook.privacy.zone.api.ZonedValue r0 = r6.A00
            java.lang.Object r0 = r0.A01
            A00(r4, r5, r0)
            java.lang.String r1 = r6.A01
            r0 = r18
            java.lang.String r0 = r0.A00(r1)
            java.lang.String r6 = r5.A00(r0)
            java.lang.String r0 = "initial_land_url"
            goto L_0x0692
        L_0x032a:
            com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent r6 = (com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent) r6
            java.lang.String r0 = "iab_landing_page_view_ended"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 175(0xaf, float:2.45E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            X.S0p r1 = r8.A01
            com.facebook.privacy.zone.api.ZonedValue r0 = r6.A00
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = r1.A00(r0)
            java.lang.String r0 = "initial_url"
            goto L_0x0692
        L_0x034b:
            com.facebook.iabeventlogging.model.IABOpenExternalEvent r6 = (com.facebook.iabeventlogging.model.IABOpenExternalEvent) r6
            java.lang.String r0 = "iab_open_external"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 180(0xb4, float:2.52E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "reason"
            r4.A0R(r0, r1)
            X.S0p r1 = r8.A01
            java.lang.String r0 = r6.A01
            java.lang.String r6 = r1.A00(r0)
            java.lang.String r0 = "target_url"
            goto L_0x0692
        L_0x0371:
            com.facebook.iabeventlogging.model.IABCopyLinkEvent r6 = (com.facebook.iabeventlogging.model.IABCopyLinkEvent) r6
            X.S0p r1 = r8.A01
            java.lang.String r0 = r6.A00
            java.lang.String r6 = r1.A00(r0)
            if (r6 != 0) goto L_0x037f
            java.lang.String r6 = ""
        L_0x037f:
            java.lang.String r0 = "iab_copy_link"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 170(0xaa, float:2.38E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            java.lang.String r0 = "target_url"
            goto L_0x0692
        L_0x0393:
            com.facebook.iabeventlogging.model.IABWebviewEndEvent r6 = (com.facebook.iabeventlogging.model.IABWebviewEndEvent) r6
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = r6.A0a
            java.util.Iterator r16 = X.AnonymousClass7TE.A1G(r0)
        L_0x039f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r10 = r16.next()
            java.util.AbstractList r10 = (java.util.AbstractList) r10
            java.lang.Object r0 = r10.get(r9)
            long r12 = X.AnonymousClass7TE.A0R(r0)
            double r0 = (double) r12
            java.lang.Double r15 = java.lang.Double.valueOf(r0)
            java.lang.Object r0 = r10.get(r14)
            long r12 = X.AnonymousClass7TE.A0R(r0)
            double r0 = (double) r12
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Double[] r0 = new java.lang.Double[]{r15, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            r0 = r17
            r0.add(r1)
            goto L_0x039f
        L_0x03d3:
            X.QHn r10 = new X.QHn
            r10.<init>()
            long r12 = r6.A0D
            double r0 = (double) r12
            java.lang.Double r16 = java.lang.Double.valueOf(r0)
            java.lang.String r1 = "js_based_dom_loaded_event_ts"
            r0 = r16
            r10.A04(r1, r0)
            long r12 = r6.A0H
            double r0 = (double) r12
            java.lang.Double r15 = java.lang.Double.valueOf(r0)
            java.lang.String r1 = "loading_finished_ts"
            r10.A04(r1, r15)
            long r12 = r6.A0E
            double r0 = (double) r12
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "estimated_progress_finished_ts"
            r10.A04(r0, r1)
            long r12 = r6.A0C
            double r0 = (double) r12
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "content_size_changed_ts"
            r10.A04(r0, r1)
            java.lang.String r0 = "iab_webview_end"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 188(0xbc, float:2.63E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            r0 = r20
            r4.A0m(r0)
            if (r36 == 0) goto L_0x042a
            int r0 = r36.length()     // Catch:{ NumberFormatException -> 0x042a }
            if (r0 <= 0) goto L_0x042a
            java.lang.Long r11 = X.DbV.A0q(r36)     // Catch:{ NumberFormatException -> 0x042a }
        L_0x042a:
            if (r34 == 0) goto L_0x046c
            int r0 = r20.length()     // Catch:{ NumberFormatException -> 0x0476 }
            if (r0 <= 0) goto L_0x046c
            java.lang.String r1 = "_"
            r0 = r20
            java.util.List r5 = X.DbW.A0o(r0, r1)     // Catch:{ NumberFormatException -> 0x0476 }
            boolean r0 = r5.isEmpty()     // Catch:{ NumberFormatException -> 0x0476 }
            if (r0 != 0) goto L_0x045e
            java.util.ListIterator r1 = X.C51968G9o.A18(r5)     // Catch:{ NumberFormatException -> 0x0476 }
        L_0x0444:
            boolean r0 = r1.hasPrevious()     // Catch:{ NumberFormatException -> 0x0476 }
            if (r0 == 0) goto L_0x045e
            int r0 = X.DbX.A06(r1)     // Catch:{ NumberFormatException -> 0x0476 }
            if (r0 == 0) goto L_0x0444
            java.util.List r0 = X.DbX.A0y(r5, r1)     // Catch:{ NumberFormatException -> 0x0476 }
        L_0x0454:
            java.lang.String[] r1 = X.DbU.A1b(r0, r9)     // Catch:{ NumberFormatException -> 0x0476 }
            r0 = r1[r9]     // Catch:{ NumberFormatException -> 0x0476 }
            java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0476 }
            goto L_0x0461
        L_0x045e:
            X.0sn r0 = X.0sn.A00     // Catch:{ NumberFormatException -> 0x0476 }
            goto L_0x0454
        L_0x0461:
            if (r11 != 0) goto L_0x046c
            int r0 = r1.length     // Catch:{ NumberFormatException -> 0x0476 }
            if (r0 <= r14) goto L_0x046c
            r0 = r1[r14]     // Catch:{ NumberFormatException -> 0x0476 }
            java.lang.Long r11 = X.DbV.A0q(r0)     // Catch:{ NumberFormatException -> 0x0476 }
        L_0x046c:
            if (r35 == 0) goto L_0x047e
            r1 = 10
            r0 = r19
            X.00y.A0n(r1, r0)     // Catch:{ NumberFormatException -> 0x0476 }
            goto L_0x047e
        L_0x0476:
            r5 = move-exception
            java.lang.String r1 = "IAB Logging"
            java.lang.String r0 = "error parsing post id, author id or ad id"
            X.0wb.A06(r1, r0, r5)
        L_0x047e:
            java.lang.String r0 = "ig_media_author_id"
            r4.A0Q(r0, r11)
            java.lang.String r0 = "viewer_session_id"
            r1 = r38
            r4.A0R(r0, r1)
            java.lang.String r0 = "tray_session_id"
            r1 = r39
            r4.A0R(r0, r1)
            java.lang.String r1 = r6.A0U
            java.lang.String r0 = "click_source"
            r4.A0R(r0, r1)
            long r0 = r6.A0M
            double r11 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            java.lang.String r0 = "user_click_ts"
            r4.A0P(r0, r1)
            long r0 = r6.A0A
            double r11 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            java.lang.String r0 = "browser_open_ts"
            r4.A0P(r0, r1)
            X.S0p r5 = r8.A01
            java.lang.String r1 = r6.A0Z
            r0 = r18
            java.lang.String r0 = r0.A00(r1)
            java.lang.String r1 = r5.A00(r0)
            java.lang.String r0 = "initial_land_url"
            r4.A0R(r0, r1)
            com.facebook.privacy.zone.api.ZonedValue r0 = r6.A0P
            java.lang.Object r0 = r0.A01
            A00(r4, r5, r0)
            long r0 = r6.A0N
            double r8 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            java.lang.String r0 = "web_request_started_ts"
            r4.A0P(r0, r1)
            java.lang.String r1 = "background_time_pairs"
            r0 = r17
            r4.A0S(r1, r0)
            java.lang.String r1 = "landing_page_dom_content_loaded_ts"
            r0 = r16
            r4.A0P(r1, r0)
            java.lang.String r0 = "landing_page_loading_stages"
            r4.A0N(r10, r0)
            long r0 = r6.A0L
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "scroll_ready_ts"
            r4.A0Q(r0, r1)
            java.lang.String r1 = "landing_page_loaded_ts"
            r4.A0P(r1, r15)
            long r0 = r6.A0J
            double r8 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            java.lang.String r0 = "landing_page_end_view_ts"
            r4.A0P(r0, r1)
            long r8 = r6.A09
            double r0 = (double) r8
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "browser_close_ts"
            r4.A0P(r0, r1)
            int r0 = r6.A03
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "interaction_count"
            r4.A0Q(r0, r1)
            java.lang.String r1 = r6.A0T
            java.lang.String r0 = "browser_user_agent"
            r4.A0R(r0, r1)
            int r0 = r6.A05
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "landing_page_status_code"
            r4.A0Q(r0, r1)
            int r0 = r6.A06
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "ssl_error_code"
            r4.A0Q(r0, r1)
            int r0 = r6.A02
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "dismiss_method"
            r4.A0Q(r0, r1)
            X.Pxf.A1D(r4, r2)
            boolean r0 = r6.A0j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "initial_url_is_open_app"
            r4.A0O(r0, r1)
            java.lang.String r0 = r6.A0V
            java.lang.String r1 = r5.A00(r0)
            r0 = 1267(0x4f3, float:1.775E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0R(r0, r1)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            boolean r0 = r6.A0f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "google_oauth2_encountered"
            r4.A0O(r0, r1)
            boolean r0 = r6.A0g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "google_oauth2_error_encountered"
            r4.A0O(r0, r1)
            boolean r0 = r6.A0i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "google_oauth2_is_redirect_url_schema_storagerelay"
            r4.A0O(r0, r1)
            boolean r0 = r6.A0d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "e2ee_black_hole_enforcement_unsafe_browsing_encountered"
            r4.A0O(r0, r1)
            java.lang.String r1 = "history_entry_id"
            r0 = r22
            r4.A0R(r1, r0)
            java.lang.String r1 = "callsite_session_id"
            r0 = r21
            r4.A0R(r1, r0)
            java.util.List r1 = r6.A0c
            java.lang.String r0 = "view_mode_time_pairs"
            r4.A0S(r0, r1)
            long r2 = r6.A0F
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "landing_page_fcp_ts"
            r4.A0P(r0, r1)
            long r2 = r6.A0G
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "landing_page_lcp_ts"
            r4.A0P(r0, r1)
            java.lang.Long r0 = r6.A0S
            if (r0 == 0) goto L_0x0612
            long r2 = r0.longValue()
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x05d4:
            java.lang.String r0 = "screenshot_start_time"
            r4.A0P(r0, r1)
            java.lang.Long r0 = r6.A0R
            if (r0 == 0) goto L_0x0610
            long r2 = r0.longValue()
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x05e7:
            java.lang.String r0 = "screenshot_end_time"
            r4.A0P(r0, r1)
            java.lang.Boolean r1 = r6.A0Q
            java.lang.String r0 = "screenshot_visible"
            r4.A0O(r0, r1)
            java.util.ArrayList r0 = r6.A0b
            if (r0 == 0) goto L_0x0614
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0601:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0615
            long r2 = X.Pxg.A0H(r5)
            double r0 = (double) r2
            X.Pxf.A1Q(r7, r0)
            goto L_0x0601
        L_0x0610:
            r1 = 0
            goto L_0x05e7
        L_0x0612:
            r1 = 0
            goto L_0x05d4
        L_0x0614:
            r7 = 0
        L_0x0615:
            java.lang.String r0 = "screenshot_interaction_timestamps"
            r4.A0S(r0, r7)
            boolean r0 = r6.A0l
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "using_helium"
            r4.A0O(r0, r1)
            boolean r0 = r6.A0m
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "using_multi_window"
            r4.A0O(r0, r1)
            boolean r0 = r6.A0e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fb_login_encountered"
            r4.A0O(r0, r1)
            int r0 = r6.A07
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "stack_size"
            r4.A0Q(r0, r1)
            int r0 = r6.A08
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "stack_size_max"
        L_0x0653:
            r4.A0Q(r0, r1)
            goto L_0x0855
        L_0x0658:
            com.facebook.iabeventlogging.model.IABReportStartEvent r6 = (com.facebook.iabeventlogging.model.IABReportStartEvent) r6
            java.lang.String r0 = "iab_report_start"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 183(0xb7, float:2.56E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            X.S0p r1 = r8.A01
            java.lang.String r0 = r6.A02
            java.lang.String r1 = r1.A00(r0)
            java.lang.String r0 = "target_url"
            r4.A0R(r0, r1)
            java.lang.String r6 = r6.A01
            java.lang.String r0 = "click_source"
            goto L_0x0692
        L_0x067c:
            com.facebook.iabeventlogging.model.IABRefreshEvent r6 = (com.facebook.iabeventlogging.model.IABRefreshEvent) r6
            java.lang.String r0 = "iab_refresh"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 182(0xb6, float:2.55E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
            java.lang.String r6 = r6.A00
            java.lang.String r0 = "refresh_from_type"
        L_0x0692:
            r4.A0R(r0, r6)
            goto L_0x082a
        L_0x0697:
            com.facebook.iabeventlogging.model.IABViewableEvent r6 = (com.facebook.iabeventlogging.model.IABViewableEvent) r6
            java.lang.String r1 = "iab_viewable"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r1)
            r1 = 187(0xbb, float:2.62E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r4, r1)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x003b
            X.RIg r10 = r6.A01
            if (r10 != 0) goto L_0x06b4
            java.lang.String r1 = "WARNING: The Non Viewable Source for IABEvent: IAB_VIEWABLE is null. The NVES API had been updated to require an IABNVSource on becomeViewable and becomeNonViewable. Please update your usage to reflect this change!"
            X.0KC.A0D(r0, r1)
        L_0x06b4:
            X.Pxe.A1R(r4, r5)
            X.S0p r5 = r8.A01
            com.facebook.privacy.zone.api.ZonedValue r1 = r6.A02
            X.0qQ.A0B(r1, r9)
            X.2Rb r0 = X.Pxg.A0R()
            X.RLf r0 = r0.FJI(r1)
            java.lang.Object r0 = X.RWG.A00(r0)
            A00(r4, r5, r0)
            long r5 = r6.A00
            double r0 = (double) r5
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "user_click_ts"
            r4.A0P(r0, r1)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            X.Pxf.A1D(r4, r2)
            java.lang.String r0 = "click_id"
            r1 = r41
            r4.A0R(r0, r1)
            goto L_0x0737
        L_0x06eb:
            com.facebook.iabeventlogging.model.IABNonViewableEvent r6 = (com.facebook.iabeventlogging.model.IABNonViewableEvent) r6
            java.lang.String r1 = "iab_non_viewable"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r1)
            r1 = 179(0xb3, float:2.51E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r4, r1)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x003b
            X.RIg r10 = r6.A01
            if (r10 != 0) goto L_0x0708
            java.lang.String r1 = "WARNING: The Non Viewable Source for IABEvent: IAB_NON_VIEWABLE is null. The NVES API had been updated to require an IABNVSource on becomeViewable and becomeNonViewableEvents. Please update your usage to reflect this change!"
            X.0KC.A0D(r0, r1)
        L_0x0708:
            X.Pxe.A1R(r4, r5)
            X.S0p r5 = r8.A01
            com.facebook.privacy.zone.api.ZonedValue r1 = r6.A02
            X.0qQ.A0B(r1, r9)
            X.2Rb r0 = X.Pxg.A0R()
            X.RLf r0 = r0.FJI(r1)
            java.lang.Object r0 = X.RWG.A00(r0)
            A00(r4, r5, r0)
            long r5 = r6.A00
            double r0 = (double) r5
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "user_click_ts"
            r4.A0P(r0, r1)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            X.Pxf.A1D(r4, r2)
        L_0x0737:
            java.lang.String r0 = "nv_source"
            r4.A0M(r10, r0)
            goto L_0x0855
        L_0x073f:
            com.facebook.iabeventlogging.model.IABScreenshotImpressionEvent r6 = (com.facebook.iabeventlogging.model.IABScreenshotImpressionEvent) r6
            java.lang.String r0 = "iab_screenshot_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 184(0xb8, float:2.58E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x003b
            X.RIk r1 = r6.A00
            java.lang.String r0 = "screenshot_image_source"
            r4.A0M(r1, r0)
            java.lang.String r0 = "screenshot_download_time"
            r4.A0P(r0, r11)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "screenshot_ad_destination_url"
            r4.A0R(r0, r1)
            if (r35 != 0) goto L_0x076d
            java.lang.String r19 = "0"
        L_0x076d:
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r19)
            java.lang.String r0 = "ad_id"
            r4.A0Q(r0, r1)
            goto L_0x082d
        L_0x0778:
            com.facebook.iabeventlogging.model.IABChangeViewModeEvent r6 = (com.facebook.iabeventlogging.model.IABChangeViewModeEvent) r6
            java.lang.String r0 = "iab_change_view_mode"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 169(0xa9, float:2.37E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x003b
            X.RIX r1 = r6.A01
            java.lang.String r0 = "from_view_mode"
            r4.A0M(r1, r0)
            X.RIX r1 = r6.A02
            java.lang.String r0 = "to_view_mode"
            r4.A0M(r1, r0)
            X.9t6 r1 = r6.A00
            java.lang.String r0 = "reason"
            r4.A0M(r1, r0)
            X.Pxe.A1R(r4, r5)
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "click_source"
            r4.A0R(r0, r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            goto L_0x0850
        L_0x07b9:
            com.facebook.iabeventlogging.model.IABUnifiedEvent r6 = (com.facebook.iabeventlogging.model.IABUnifiedEvent) r6
            X.9su r1 = r6.A00
            java.lang.Integer r8 = r6.A01
            java.lang.String r6 = r6.A02
            java.lang.String r0 = "iab_unified"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = r1.name()
            java.lang.String r0 = "unified_event_name"
            r4.AAJ(r0, r1)
            int r1 = r8.intValue()
            if (r1 == r9) goto L_0x0817
            if (r1 == r14) goto L_0x0813
            r0 = 2
            if (r1 == r0) goto L_0x080f
            r0 = 3
            if (r1 == r0) goto L_0x080b
            r0 = 4
            if (r1 != r0) goto L_0x0859
            java.lang.String r1 = "uncategorized"
        L_0x07eb:
            java.lang.String r0 = "category"
            r4.AAJ(r0, r1)
            java.lang.String r0 = "iab_session_id"
            r4.AAJ(r0, r5)
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "event_ts"
            r4.A8D(r0, r1)
            X.C51965G9l.A1L(r4, r7)
            java.lang.String r0 = "reason"
            r4.AAJ(r0, r6)
            r4.Cgf()
            return
        L_0x080b:
            java.lang.String r1 = "temporary"
            goto L_0x07eb
        L_0x080f:
            java.lang.String r1 = "non_ui"
            goto L_0x07eb
        L_0x0813:
            java.lang.String r1 = "ui_view"
            goto L_0x07eb
        L_0x0817:
            java.lang.String r1 = "user_interaction"
            goto L_0x07eb
        L_0x081b:
            java.lang.String r0 = "iab_open_menu"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 181(0xb5, float:2.54E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            X.Pxe.A1R(r4, r5)
        L_0x082a:
            X.Pxf.A1D(r4, r2)
        L_0x082d:
            java.lang.String r0 = "tracking_token"
            r4.A0R(r0, r7)
            goto L_0x0855
        L_0x0834:
            java.lang.String r0 = "iab_first_contentful_paint"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 171(0xab, float:2.4E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r1, r0)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x003b
            X.Pxe.A1R(r4, r5)
            long r2 = r6.A01
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0850:
            java.lang.String r0 = "event_ts"
            r4.A0P(r0, r1)
        L_0x0855:
            r4.Cgf()
            return
        L_0x0859:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11235SGv.A01(com.facebook.iabeventlogging.model.IABEvent, X.0iw, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, boolean):void");
    }
}
