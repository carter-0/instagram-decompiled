package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6cB  reason: invalid class name and case insensitive filesystem */
public abstract class C311126cB implements C250603lj {
    public final UserSession A00;
    public final C310666bQ A01;

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b8, code lost:
        if (X.C305976Kh.A01(r7, r10) == false) goto L_0x02bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x028f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r40, X.C252093oY r41) {
        /*
            r39 = this;
            r35 = 0
            r13 = r40
            r0 = r35
            X.0qQ.A0B(r13, r0)
            r22 = 1
            r1 = r41
            r0 = r22
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r1 = r1.CEk(r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0039
            r2 = r39
            boolean r11 = r2 instanceof X.C311116cA
            if (r11 == 0) goto L_0x00fe
            java.lang.Object r10 = r13.A03
            X.0qQ.A06(r10)
            X.3uh r10 = (X.C255773uh) r10
        L_0x0027:
            boolean r0 = r10.CWu()
            if (r0 != 0) goto L_0x003a
            boolean r0 = r10.A17()
            if (r0 != 0) goto L_0x003a
            boolean r0 = r10.A1U()
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            return
        L_0x003a:
            if (r11 == 0) goto L_0x00f5
            java.lang.Object r0 = r13.A04
            X.6YY r0 = (X.AnonymousClass6YY) r0
            X.3mM r14 = r0.A00
        L_0x0042:
            java.lang.Object r12 = r13.A04
            if (r11 == 0) goto L_0x00ee
            r0 = r12
            X.6YY r0 = (X.AnonymousClass6YY) r0
            X.6Yf r9 = r0.A02
        L_0x004b:
            if (r11 == 0) goto L_0x00ea
            r0 = r12
            X.6YY r0 = (X.AnonymousClass6YY) r0
            boolean r0 = r0.A03
            r34 = r0
        L_0x0054:
            X.6bQ r8 = r2.A01
            X.4DU r0 = r8.A02
            r38 = r0
            X.3BQ r0 = r8.A03
            r37 = r0
            if (r11 == 0) goto L_0x00e1
            r0 = r12
            X.6YY r0 = (X.AnonymousClass6YY) r0
            X.3mM r0 = r0.A00
        L_0x0065:
            com.instagram.model.reels.Reel r3 = r0.A0H
            r1 = r38
            r0 = r37
            X.6KG r23 = X.AnonymousClass6KF.A00(r1, r3, r0)
            com.instagram.common.session.UserSession r7 = r2.A00
            r0 = r23
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r7)
            java.lang.String r1 = "reel_playback_navigation"
            X.0kJ r0 = r2.A00
            X.0Aj r6 = r2.A00(r0, r1)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0039
            X.1Xj r5 = r10.A0b
            if (r5 != 0) goto L_0x0095
            boolean r0 = X.C278264wZ.A05(r7)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r10.A17()
            if (r0 == 0) goto L_0x0039
        L_0x0095:
            com.instagram.model.reels.Reel r4 = r14.A0H
            float r0 = r9.A0B
            r33 = r0
            float r0 = r9.A0A
            double r2 = (double) r0
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r16
            java.lang.Float r0 = r9.A0T
            r31 = r0
            java.lang.Float r0 = r9.A0U
            r30 = r0
            com.instagram.common.session.UserSession r0 = r14.A0G
            X.0wX r0 = r0.A03
            android.content.Context r1 = r0.A06()
            int r0 = X.AnonymousClass0nB.A00(r1)
            float r0 = (float) r0
            float r29 = X.0nA.A01(r1, r0)
            int r0 = X.AnonymousClass0nB.A01(r1)
            float r0 = (float) r0
            float r28 = X.0nA.A01(r1, r0)
            X.1Ns r0 = r4.A0W
            r24 = r0
            if (r11 == 0) goto L_0x00d6
            r32 = 0
        L_0x00cf:
            r25 = 0
            r20 = 0
            if (r24 == 0) goto L_0x0131
            goto L_0x0106
        L_0x00d6:
            r0 = r12
            X.6Ld r0 = (X.C306176Ld) r0
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r32 = java.lang.Long.valueOf(r0)
            goto L_0x00cf
        L_0x00e1:
            java.lang.Object r0 = r13.A03
            X.0qQ.A06(r0)
            X.3mM r0 = (X.C250973mM) r0
            goto L_0x0065
        L_0x00ea:
            r34 = 0
            goto L_0x0054
        L_0x00ee:
            r0 = r12
            X.6Ld r0 = (X.C306176Ld) r0
            X.6Yf r9 = r0.A02
            goto L_0x004b
        L_0x00f5:
            java.lang.Object r14 = r13.A03
            X.0qQ.A06(r14)
            X.3mM r14 = (X.C250973mM) r14
            goto L_0x0042
        L_0x00fe:
            java.lang.Object r0 = r13.A04
            X.6Ld r0 = (X.C306176Ld) r0
            X.3uh r10 = r0.A01
            goto L_0x0027
        L_0x0106:
            com.instagram.user.model.User r0 = r24.CCd()     // Catch:{ NumberFormatException -> 0x012b }
            if (r0 == 0) goto L_0x0131
            X.1Xv r0 = X.1Xj.A0h     // Catch:{ NumberFormatException -> 0x012b }
            java.lang.String r0 = r24.getId()     // Catch:{ NumberFormatException -> 0x012b }
            X.0qQ.A07(r0)     // Catch:{ NumberFormatException -> 0x012b }
            java.lang.String r1 = X.1Xv.A06(r0)     // Catch:{ NumberFormatException -> 0x012b }
            r0 = r35
            X.0qQ.A0B(r1, r0)     // Catch:{ NumberFormatException -> 0x012b }
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)     // Catch:{ NumberFormatException -> 0x012b }
            if (r0 == 0) goto L_0x0131
            long r18 = r0.longValue()     // Catch:{ NumberFormatException -> 0x012b }
            goto L_0x0133
        L_0x012b:
            r1 = move-exception
            java.lang.String r0 = "ReelPlaybackNavigationAction"
            X.0wb.A07(r0, r1)
        L_0x0131:
            r18 = 0
        L_0x0133:
            java.lang.Integer r0 = r9.A0W
            r36 = r0
            X.0qQ.A07(r36)
            X.4gi r0 = r8.A05
            X.3mM r1 = r0.BfF(r14)
            if (r1 == 0) goto L_0x060e
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x060e
            java.lang.Integer r15 = X.AnonymousClass05K.A0N
            r27 = 1
            r26 = 0
            r0 = r36
            if (r15 != r0) goto L_0x0152
            r26 = 1
        L_0x0152:
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            if (r15 == r0) goto L_0x0158
            r27 = 0
        L_0x0158:
            if (r26 != 0) goto L_0x015c
            if (r27 == 0) goto L_0x060e
        L_0x015c:
            r0 = r35
            X.3uh r0 = r1.A0A(r7, r0)
            java.lang.String r15 = r0.A0U(r7)
        L_0x0166:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r0.A01(r7)
            com.instagram.user.model.User r0 = r10.A0i
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x060a
            java.lang.Integer r27 = X.AnonymousClass05K.A01
        L_0x0176:
            java.util.List r0 = r4.A17
            r26 = r0
            java.lang.String r1 = X.C305726Jh.A00(r36)
            java.lang.String r0 = "action"
            r6.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r34)
            java.lang.String r0 = "first_view"
            r6.A7p(r0, r1)
            if (r5 == 0) goto L_0x05fb
            java.lang.String r0 = X.C294185m0.A09(r5)
        L_0x0192:
            java.lang.String r1 = "m_pk"
            r6.AAJ(r1, r0)
            if (r5 == 0) goto L_0x05f4
            X.1iA r0 = r5.BR7()
            int r0 = r0.A00
            long r0 = (long) r0
        L_0x01a0:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_t"
            r6.A9F(r0, r1)
            if (r5 == 0) goto L_0x05df
            int r0 = r5.A10()
        L_0x01af:
            long r0 = (long) r0
        L_0x01b0:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_viewers"
            r6.A9F(r0, r1)
            double r0 = r9.A03
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "pause_duration"
            r6.A8D(r0, r1)
            int r0 = r14.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_position"
            r6.A9F(r0, r1)
            java.lang.Integer r0 = r4.A0e
            if (r0 == 0) goto L_0x05db
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x01d9:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_size"
            r6.A9F(r0, r1)
            java.lang.String r1 = r4.A0H(r7)
            java.lang.String r0 = "reel_type"
            r6.AAJ(r0, r1)
            if (r11 == 0) goto L_0x05d8
            X.6YY r12 = (X.AnonymousClass6YY) r12
            X.6cM r0 = r12.A01
            java.lang.Object r1 = r13.A03
            X.0qQ.A06(r1)
            X.3uh r1 = (X.C255773uh) r1
            int r0 = r0.A00(r1)
        L_0x01fc:
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "session_reel_counter"
            r6.A9F(r0, r1)
            int r0 = r27.intValue()
            if (r0 == 0) goto L_0x05d5
            r0 = 2
        L_0x020d:
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "source"
            r6.A9F(r0, r1)
            r0 = r33
            double r0 = (double) r0
            double r0 = r0 * r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_elapsed"
            r6.A8D(r0, r1)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r33
            float r0 = java.lang.Math.max(r1, r0)
            double r0 = (double) r0
            double r0 = r0 * r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_remaining"
            r6.A8D(r0, r1)
            int r0 = r9.A0I
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "tray_position"
            r6.A9F(r0, r1)
            java.lang.String r1 = r8.A08
            java.lang.String r0 = "tray_session_id"
            r6.AAJ(r0, r1)
            X.3kK r0 = r8.A06
            java.lang.String r1 = r0.getSessionId()
            java.lang.String r0 = "viewer_session_id"
            r6.AAJ(r0, r1)
            boolean r0 = r9.A0v
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "viewer_volume_on"
            r6.A7p(r0, r1)
            boolean r0 = r9.A19
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "viewer_volume_toggled"
            r6.A7p(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r6.AAJ(r0, r1)
            boolean r0 = r10.CcK()
            if (r0 == 0) goto L_0x05d1
            java.lang.String r1 = "ad"
        L_0x027f:
            java.lang.String r0 = "a_i"
            r6.AAJ(r0, r1)
            r0 = r37
            java.lang.String r2 = r0.A00
            int r1 = r36.intValue()
            r0 = 6
            if (r1 == r0) goto L_0x05cd
            r0 = 5
            if (r1 == r0) goto L_0x0299
            r0 = 7
            if (r1 == r0) goto L_0x0299
            java.lang.String r2 = r38.getModuleName()
        L_0x0299:
            java.lang.String r0 = "dest_module"
            r6.AAJ(r0, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            java.lang.String r0 = "carousel_index"
            r6.A9F(r0, r2)
            boolean r0 = r10.A1m()
            if (r0 == 0) goto L_0x02ba
            boolean r0 = r10.A0m()
            if (r0 == 0) goto L_0x02ba
            boolean r1 = X.C305976Kh.A01(r7, r10)
            r0 = 1
            if (r1 == 0) goto L_0x02bb
        L_0x02ba:
            r0 = 0
        L_0x02bb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_playable_audio"
            r6.A7p(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            java.lang.String r0 = "o_pk"
            r6.A9F(r0, r1)
            java.lang.String r1 = r10.A0k
            java.lang.String r0 = "reel_id"
            r6.AAJ(r0, r1)
            if (r26 == 0) goto L_0x05c9
            int r0 = r26.size()
            long r0 = (long) r0
        L_0x02db:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "segment_count"
            r6.A9F(r0, r1)
            if (r32 == 0) goto L_0x05c5
            long r0 = r32.longValue()
        L_0x02ea:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "segment_index"
            r6.A9F(r0, r1)
            java.lang.String r1 = r23.getModuleName()
            java.lang.String r0 = "source_module"
            r6.AAJ(r0, r1)
            java.lang.String r1 = r23.getModuleName()
            java.lang.String r0 = "source_of_action"
            r6.AAJ(r0, r1)
            if (r5 == 0) goto L_0x05a3
            long r0 = X.C294185m0.A00(r7, r5)
        L_0x030b:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "a_pk"
            r6.A9F(r0, r1)
            java.lang.String r0 = "anti_bully_tap_counter"
            r6.A9F(r0, r2)
            double r0 = r9.A04
            double r0 = r0 / r16
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "context_sheet_duration"
            r6.A8D(r0, r1)
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            int r0 = r0.A00()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "dark_mode_state"
            r6.A9F(r0, r1)
            int r0 = r9.A0F
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r2 = "election_tap_counter"
            r6.A9F(r2, r0)
            java.util.Map r0 = r9.A1F
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "hashtags_tap_counter"
            r6.A9F(r0, r1)
            r3 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r35)
            java.lang.String r0 = "is_acp_delivered"
            r6.A7p(r0, r1)
            boolean r0 = r4.A0x(r7)
            if (r0 != 0) goto L_0x0370
            boolean r0 = r4.A12(r7)
            if (r0 == 0) goto L_0x0371
        L_0x0370:
            r3 = 1
        L_0x0371:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "is_besties_reel"
            r6.A7p(r0, r1)
            boolean r0 = X.AnonymousClass1GD.A03()
            if (r0 == 0) goto L_0x059f
            r0 = 1
        L_0x0382:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "is_dark_mode"
            r6.A9F(r0, r1)
            boolean r0 = r10.A1J()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_highlights_sourced"
            r6.A7p(r0, r1)
            boolean r0 = r10.A17()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_live_streaming"
            r6.A7p(r0, r1)
            if (r11 == 0) goto L_0x059c
            r0 = 0
        L_0x03a8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_video_to_carousel"
            r6.A7p(r0, r1)
            java.lang.String r1 = r23.getModuleName()
            java.lang.String r0 = "module_name"
            r6.AAJ(r0, r1)
            java.lang.Integer r0 = r4.A0f
            if (r0 == 0) goto L_0x0599
            java.lang.String r1 = X.C14510TxW.A00(r0)
        L_0x03c2:
            java.lang.String r0 = "netego_type"
            r6.AAJ(r0, r1)
            int r0 = r9.A0J
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "profile_tap_counter"
            r6.A9F(r0, r1)
            int r0 = r9.A0L
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "subscription_promo_taps"
            r6.A9F(r0, r1)
            int r0 = r4.A03(r7)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_start_position"
            r6.A9F(r0, r1)
            if (r15 == 0) goto L_0x0595
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r15)
        L_0x03f5:
            java.lang.String r0 = "previous_ad_id"
            r6.A9F(r0, r1)
            if (r31 == 0) goto L_0x0591
            float r0 = r31.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0405:
            java.lang.String r0 = "tap_x_position"
            r6.A8D(r0, r1)
            if (r30 == 0) goto L_0x058d
            float r0 = r30.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0415:
            java.lang.String r0 = "tap_y_position"
            r6.A8D(r0, r1)
            if (r31 == 0) goto L_0x0589
            float r0 = r31.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0425:
            java.lang.String r0 = "start_x_position"
            r6.A8D(r0, r1)
            if (r30 == 0) goto L_0x0585
            float r0 = r30.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0435:
            java.lang.String r0 = "start_y_position"
            r6.A8D(r0, r1)
            r0 = r29
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "screen_height"
            r6.A9F(r0, r1)
            r0 = r28
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "screen_width"
            r6.A9F(r0, r1)
            java.lang.String r1 = r8.A07
            java.lang.String r0 = "story_ranking_token"
            r6.AAJ(r0, r1)
            boolean r0 = r10.CcK()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_ad"
            r6.A7p(r0, r1)
            if (r5 == 0) goto L_0x051c
            X.1Xy r0 = r5.A0C
            com.instagram.model.hashtag.Hashtag r0 = r0.B6n()
            if (r0 == 0) goto L_0x0482
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x0482
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x0482
            long r20 = r0.longValue()
        L_0x0482:
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            java.lang.String r0 = "hashtag_id"
            r6.A9F(r0, r1)
            java.lang.Long r1 = X.C294185m0.A01(r7, r5)
            java.lang.String r0 = "ad_id"
            r6.A9F(r0, r1)
            java.util.List r0 = r5.A0e
            java.lang.String r1 = X.C243413Yr.A00(r0)
            java.lang.String r0 = "delivery_flags"
            r6.AAJ(r0, r1)
            X.1Xy r0 = r5.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
            if (r0 == 0) goto L_0x0581
            java.lang.String r1 = r0.B3W()
            if (r1 == 0) goto L_0x0581
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
        L_0x04b3:
            java.lang.String r0 = "effect_id"
            r6.A9F(r0, r1)
            int r0 = r9.A0F
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A9F(r2, r0)
            java.lang.String r1 = X.C294185m0.A06(r7, r5)
            java.lang.String r0 = "follow_status"
            r6.AAJ(r0, r1)
            boolean r0 = r9.A0l
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_media_loaded"
            r6.A7p(r0, r1)
            X.1Xy r0 = r5.A0C
            java.lang.String r1 = r0.BIl()
            java.lang.String r0 = "inventory_source"
            r6.AAJ(r0, r1)
            long r0 = r5.A1A()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_ts"
            r6.A9F(r0, r1)
            java.lang.Long r1 = X.C294185m0.A02(r7, r5)
            java.lang.String r0 = "top_liker_count"
            r6.A9F(r0, r1)
            r0 = r23
            java.lang.String r1 = X.C294185m0.A07(r7, r5, r0)
            java.lang.String r0 = "tracking_token"
            r6.AAJ(r0, r1)
            boolean r0 = r5.A5D()
            if (r0 == 0) goto L_0x051c
            boolean r0 = r4.A17(r7)
            if (r0 == 0) goto L_0x0515
            int r0 = r4.A00
            long r0 = (long) r0
            java.lang.Long r25 = java.lang.Long.valueOf(r0)
        L_0x0515:
            java.lang.String r1 = "carousel_opt_in_position"
            r0 = r25
            r6.A9F(r1, r0)
        L_0x051c:
            boolean r0 = r10.CcK()
            if (r0 != 0) goto L_0x0530
            double r0 = r9.A01
            double r0 = r0 * r16
            long r2 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "media_load_duration"
            r6.A9F(r0, r1)
        L_0x0530:
            r0 = r24
            boolean r0 = r0 instanceof X.AnonymousClass6YJ
            if (r0 == 0) goto L_0x0545
            r0 = r24
            X.6YJ r0 = (X.AnonymousClass6YJ) r0
            r24 = r0
            java.lang.String r1 = r24.A00()
            java.lang.String r0 = "o_t"
            r6.AAJ(r0, r1)
        L_0x0545:
            com.instagram.api.schemas.IntentAwareAdsInfo r2 = r4.A0B
            if (r2 == 0) goto L_0x056d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            java.lang.String r0 = "is_multi_ads"
            r6.A7p(r0, r1)
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x0564
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "multi_ads_type"
            r6.A9F(r0, r1)
        L_0x0564:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x056d
            java.lang.String r0 = "multi_ads_unit_id"
            r6.AAJ(r0, r1)
        L_0x056d:
            X.3Hd r0 = r4.A0X
            if (r0 == 0) goto L_0x057d
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "index_in_ad_pod"
            r6.A9F(r0, r1)
        L_0x057d:
            r6.Cgf()
            return
        L_0x0581:
            r1 = r25
            goto L_0x04b3
        L_0x0585:
            r1 = r25
            goto L_0x0435
        L_0x0589:
            r1 = r25
            goto L_0x0425
        L_0x058d:
            r1 = r25
            goto L_0x0415
        L_0x0591:
            r1 = r25
            goto L_0x0405
        L_0x0595:
            r1 = r25
            goto L_0x03f5
        L_0x0599:
            r1 = 0
            goto L_0x03c2
        L_0x059c:
            r0 = 1
            goto L_0x03a8
        L_0x059f:
            r0 = 0
            goto L_0x0382
        L_0x05a3:
            X.4gL r0 = r10.A0c
            if (r0 == 0) goto L_0x05c1
            com.instagram.user.model.User r0 = r0.A03()
            X.4Cl r0 = r0.A03
            java.lang.String r1 = r0.getPkId()
            if (r1 == 0) goto L_0x05c1
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x05c1
            long r0 = r0.longValue()
            goto L_0x030b
        L_0x05c1:
            r0 = 0
            goto L_0x030b
        L_0x05c5:
            r0 = 0
            goto L_0x02ea
        L_0x05c9:
            r0 = 0
            goto L_0x02db
        L_0x05cd:
            java.lang.String r2 = "dashboard"
            goto L_0x0299
        L_0x05d1:
            java.lang.String r1 = "organic"
            goto L_0x027f
        L_0x05d5:
            r0 = 1
            goto L_0x020d
        L_0x05d8:
            r0 = -1
            goto L_0x01fc
        L_0x05db:
            r0 = 0
            goto L_0x01d9
        L_0x05df:
            X.4gL r0 = r10.A0c
            if (r0 == 0) goto L_0x05f0
            java.lang.Integer r0 = r0.A0Q
            if (r0 != 0) goto L_0x05ea
            r0 = 0
            goto L_0x01af
        L_0x05ea:
            int r0 = r0.intValue()
            goto L_0x01af
        L_0x05f0:
            r0 = 0
            goto L_0x01b0
        L_0x05f4:
            X.1iA r0 = X.1iA.A0L
            int r0 = r0.A00
            long r0 = (long) r0
            goto L_0x01a0
        L_0x05fb:
            X.4gL r0 = r10.A0c
            if (r0 == 0) goto L_0x0606
            java.lang.String r0 = r0.A0e
            r0.getClass()
            goto L_0x0192
        L_0x0606:
            java.lang.String r0 = ""
            goto L_0x0192
        L_0x060a:
            java.lang.Integer r27 = X.AnonymousClass05K.A00
            goto L_0x0176
        L_0x060e:
            r15 = r25
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311126cB.ATF(X.30Y, X.3oY):void");
    }

    public C311126cB(C310666bQ r2) {
        this.A01 = r2;
        this.A00 = r2.A01;
    }
}
