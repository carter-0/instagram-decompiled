package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6c1  reason: invalid class name and case insensitive filesystem */
public final class C311036c1 implements C250603lj {
    public final UserSession A00;
    public final C310666bQ A01;
    public final C311016bz A02;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r46, X.C252093oY r47) {
        /*
            r45 = this;
            r4 = 0
            r2 = r46
            X.0qQ.A0B(r2, r4)
            r3 = 1
            r0 = r47
            X.0qQ.A0B(r0, r3)
            java.lang.Integer r1 = r0.CEk(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x037e
            java.lang.Object r10 = r2.A03
            X.3mM r10 = (X.C250973mM) r10
            com.instagram.model.reels.Reel r9 = r10.A0H
            java.lang.Object r11 = r2.A04
            X.6YZ r11 = (X.AnonymousClass6YZ) r11
            X.6cM r7 = r11.A02
            r5 = r45
            X.6bQ r1 = r5.A01
            X.3kK r6 = r1.A06
            X.4gi r2 = r1.A05
            java.util.List r0 = r9.A0w
            if (r0 == 0) goto L_0x015a
            int r8 = X.C297785sK.A03(r0)
        L_0x0030:
            int r0 = r10.A0E
            r44 = r0
            X.3uh r0 = r11.A01
            int r41 = r7.A00(r0)
            X.4DU r7 = r1.A02
            X.3BQ r0 = r1.A03
            X.6KG r40 = X.AnonymousClass6KF.A00(r7, r9, r0)
            com.instagram.common.session.UserSession r7 = r5.A00
            java.lang.String r0 = r1.A08
            r43 = r0
            java.lang.String r6 = r6.getSessionId()
            boolean r39 = r2.CW8(r10)
            java.lang.String r38 = r9.A0H(r7)
            java.lang.String r0 = r1.A07
            r42 = r0
            r10 = 0
            r37 = 0
            r31 = 0
            r26 = 0
            r36 = 0
            r25 = 0
            r2 = 0
            r33 = 0
            r23 = 0
            r32 = 0
            r29 = 0
            r12 = 0
            r24 = 0
            r27 = 0
            r35 = 0
            r13 = 0
            r21 = 0
            r20 = 0
            r17 = 0
            r1 = 0
            r16 = 0
            r0 = 0
            r19 = 0
            r18 = 0
            r22 = 0
            r11 = 0
            r14 = 4
            X.0qQ.A0B(r6, r14)
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r4)
            X.6bz r4 = r5.A02
            java.lang.String r14 = r9.getId()
            X.0qQ.A07(r14)
            java.util.Map r5 = r4.A01
            java.lang.Object r5 = r5.remove(r14)
            X.30Y r5 = (X.AnonymousClass30Y) r5
            if (r5 == 0) goto L_0x0166
            java.lang.Object r5 = r5.A03
            X.3uh r5 = (X.C255773uh) r5
            X.6aL r4 = r4.A00
            X.0qQ.A0A(r5)
            X.0qQ.A0B(r5, r3)
            java.util.Map r3 = r4.A00
            java.lang.String r15 = r5.A0k
            java.lang.Object r3 = r3.remove(r15)
            X.B5e r3 = (X.C41886B5e) r3
            if (r3 == 0) goto L_0x01bf
            boolean r0 = r5.CcK()
            if (r0 == 0) goto L_0x012e
            java.util.Set r1 = r4.A02
            java.util.Set r0 = r3.A07
            r1.addAll(r0)
            java.util.Set r0 = r3.A08
            r1.addAll(r0)
            java.util.Set r0 = r4.A03
        L_0x00cc:
            X.0qQ.A07(r15)
            r0.add(r15)
        L_0x00d2:
            double r0 = r3.A02
            r29 = r0
            double r0 = r3.A03
            r27 = r0
            double r0 = r3.A00
            java.lang.Double r31 = java.lang.Double.valueOf(r0)
            java.util.Set r0 = r3.A0A
            int r12 = r0.size()
            java.util.Set r0 = r3.A0B
            int r13 = r0.size()
            java.util.Set r0 = r3.A07
            int r0 = r0.size()
            java.lang.Integer r26 = java.lang.Integer.valueOf(r0)
            java.util.Set r0 = r3.A08
            int r0 = r0.size()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)
            java.util.Set r0 = r3.A09
            int r0 = r0.size()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r0)
            java.util.Set r0 = r3.A0C
            int r0 = r0.size()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.A05
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A06
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r0 = r3.A04
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "lastAction"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x012e:
            boolean r0 = r5.A17()
            if (r0 == 0) goto L_0x0137
            java.util.Set r0 = r4.A05
            goto L_0x00cc
        L_0x0137:
            boolean r0 = r5.A1P()
            if (r0 == 0) goto L_0x014a
            java.util.Set r1 = r4.A04
            java.lang.String r0 = r9.A0G()
            X.0qQ.A07(r0)
            r1.add(r0)
            goto L_0x00d2
        L_0x014a:
            java.util.Set r1 = r4.A08
            java.util.Set r0 = r3.A0A
            r1.addAll(r0)
            java.util.Set r0 = r3.A0B
            r1.addAll(r0)
            java.util.Set r0 = r4.A09
            goto L_0x00cc
        L_0x015a:
            com.instagram.common.session.UserSession r0 = r5.A00
            java.util.List r0 = r9.A0O(r0)
            int r8 = r0.size()
            goto L_0x0030
        L_0x0166:
            java.lang.String r1 = "Could not find last reel item information for provided reel."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x016e:
            java.lang.String r10 = X.C305726Jh.A00(r0)
            java.util.Set r0 = r4.A08
            int r1 = r0.size()
            java.util.Set r0 = r4.A09
            int r0 = r0.size()
            java.util.Set r3 = r4.A02
            int r3 = r3.size()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r3)
            java.util.Set r3 = r4.A01
            r3.size()
            java.util.Set r3 = r4.A03
            int r3 = r3.size()
            java.lang.Integer r20 = java.lang.Integer.valueOf(r3)
            java.util.Set r3 = r4.A06
            int r3 = r3.size()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r3)
            java.util.Set r3 = r4.A07
            int r3 = r3.size()
            java.lang.Integer r18 = java.lang.Integer.valueOf(r3)
            java.util.Set r3 = r4.A05
            int r3 = r3.size()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)
            java.util.Set r3 = r4.A04
            int r3 = r3.size()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
        L_0x01bf:
            com.instagram.user.model.User r3 = r5.A0i
            if (r3 == 0) goto L_0x01cb
            java.lang.String r2 = r3.getId()
            com.instagram.user.model.FollowStatus r33 = r3.B6o()
        L_0x01cb:
            boolean r4 = r5.CcK()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r44)
            if (r4 == 0) goto L_0x03a5
            r36 = r3
            r37 = r14
        L_0x01d9:
            boolean r3 = r9.A0m()
            if (r3 == 0) goto L_0x01e3
            java.lang.Integer r3 = r9.A0f
            r32 = r3
        L_0x01e3:
            r3 = r40
            X.0wc r5 = X.AnonymousClass0kN.A01(r3, r7)
            java.lang.String r4 = "reel_session_summary"
            X.0kJ r3 = r5.A00
            X.0Aj r4 = r5.A00(r3, r4)
            r3 = 369(0x171, float:5.17E-43)
            X.1Ln r7 = new X.1Ln
            r7.<init>(r4, r3)
            X.0Aj r3 = r7.A00
            boolean r3 = r3.isSampled()
            r5 = 0
            if (r3 == 0) goto L_0x037e
            long r3 = (long) r8
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "reel_size"
            r7.A0Q(r3, r4)
            r3 = r41
            long r3 = (long) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "session_reel_counter"
            r7.A0Q(r3, r4)
            java.lang.String r3 = "viewer_session_id"
            r7.A0R(r3, r6)
            java.lang.String r4 = "tray_session_id"
            r3 = r43
            r7.A0R(r4, r3)
            java.lang.Double r4 = java.lang.Double.valueOf(r29)
            java.lang.String r3 = "pause_duration"
            r7.A0P(r3, r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r27)
            java.lang.String r3 = "time_elapsed"
            r7.A0P(r3, r4)
            long r3 = (long) r13
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "videos_consumed"
            r7.A0Q(r3, r4)
            long r3 = (long) r12
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "photos_consumed"
            r7.A0Q(r3, r4)
            long r3 = (long) r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "viewer_session_media_consumed"
            r7.A0Q(r1, r3)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "viewer_session_reels_consumed"
            r7.A0Q(r0, r1)
            if (r2 == 0) goto L_0x03a2
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r2)
        L_0x0265:
            java.lang.String r0 = "a_pk"
            r7.A0Q(r0, r1)
            r7.A0k(r10)
            java.lang.String r1 = "reel_type"
            r0 = r38
            r7.A0R(r1, r0)
            if (r23 == 0) goto L_0x039f
            int r0 = r23.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x027f:
            java.lang.String r0 = "live_videos_consumed"
            r7.A0Q(r0, r1)
            if (r26 == 0) goto L_0x039c
            int r0 = r26.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x028f:
            java.lang.String r0 = "ad_photos_consumed"
            r7.A0Q(r0, r1)
            if (r25 == 0) goto L_0x0399
            int r0 = r25.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x029f:
            java.lang.String r0 = "ad_videos_consumed"
            r7.A0Q(r0, r1)
            if (r24 == 0) goto L_0x0396
            int r0 = r24.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02af:
            java.lang.String r0 = "replay_videos_consumed"
            r7.A0Q(r0, r1)
            if (r35 == 0) goto L_0x0393
            int r0 = r35.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02bf:
            java.lang.String r0 = "tray_position"
            r7.A0Q(r0, r1)
            if (r21 == 0) goto L_0x0390
            int r0 = r21.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02cf:
            java.lang.String r0 = "viewer_session_ad_media_consumed"
            r7.A0Q(r0, r1)
            if (r20 == 0) goto L_0x038d
            int r0 = r20.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02df:
            java.lang.String r0 = "viewer_session_ad_reels_consumed"
            r7.A0Q(r0, r1)
            if (r16 == 0) goto L_0x038a
            int r0 = r16.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02ef:
            java.lang.String r0 = "viewer_session_netego_reels_consumed"
            r7.A0Q(r0, r1)
            if (r17 == 0) goto L_0x0387
            int r0 = r17.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02ff:
            java.lang.String r0 = "viewer_session_live_reels_consumed"
            r7.A0Q(r0, r1)
            if (r19 == 0) goto L_0x0385
            int r0 = r19.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x030f:
            java.lang.String r0 = "viewer_session_replay_reels_consumed"
            r7.A0Q(r0, r1)
            if (r18 == 0) goto L_0x0383
            int r0 = r18.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x031f:
            java.lang.String r0 = "viewer_session_replay_videos_consumed"
            r7.A0Q(r0, r1)
            if (r33 == 0) goto L_0x0381
            java.lang.String r1 = r33.toString()
        L_0x032a:
            java.lang.String r0 = "follow_status"
            r7.A0R(r0, r1)
            if (r32 == 0) goto L_0x037f
            java.lang.String r1 = X.C14510TxW.A00(r32)
        L_0x0335:
            java.lang.String r0 = "netego_type"
            r7.A0R(r0, r1)
            java.lang.String r1 = "ad_id"
            r0 = r37
            r7.A0R(r1, r0)
            if (r36 == 0) goto L_0x034c
            int r0 = r36.intValue()
            long r0 = (long) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x034c:
            java.lang.String r0 = "ad_position_from_server"
            r7.A0Q(r0, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r39)
            java.lang.String r0 = "is_last_reel"
            r7.A0O(r0, r1)
            java.lang.String r1 = "ad_pause_duration"
            r0 = r31
            r7.A0P(r1, r0)
            java.lang.String r1 = "viewer_volume_on"
            r0 = r22
            r7.A0O(r1, r0)
            java.lang.String r0 = "viewer_volume_toggled"
            r7.A0O(r0, r11)
            java.lang.String r1 = "story_ranking_token"
            r0 = r42
            r7.A0R(r1, r0)
            java.lang.String r1 = "is_wedged"
            r0 = r34
            r7.A0O(r1, r0)
            r7.Cgf()
        L_0x037e:
            return
        L_0x037f:
            r1 = r5
            goto L_0x0335
        L_0x0381:
            r1 = r5
            goto L_0x032a
        L_0x0383:
            r1 = r5
            goto L_0x031f
        L_0x0385:
            r1 = r5
            goto L_0x030f
        L_0x0387:
            r1 = r5
            goto L_0x02ff
        L_0x038a:
            r1 = r5
            goto L_0x02ef
        L_0x038d:
            r1 = r5
            goto L_0x02df
        L_0x0390:
            r1 = r5
            goto L_0x02cf
        L_0x0393:
            r1 = r5
            goto L_0x02bf
        L_0x0396:
            r1 = r5
            goto L_0x02af
        L_0x0399:
            r1 = r5
            goto L_0x029f
        L_0x039c:
            r1 = r5
            goto L_0x028f
        L_0x039f:
            r1 = r5
            goto L_0x027f
        L_0x03a2:
            r1 = r5
            goto L_0x0265
        L_0x03a5:
            r35 = r3
            goto L_0x01d9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311036c1.ATF(X.30Y, X.3oY):void");
    }

    public C311036c1(C310666bQ r2, C311016bz r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r2.A01;
    }
}
