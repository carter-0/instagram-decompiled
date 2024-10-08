package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;

public final class OMX {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;

    public OMX(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(AnonymousClass5HJ r8, PushChannelType pushChannelType, String str) {
        String str2;
        AnonymousClass5HN r5;
        1aU A0J;
        UserSession userSession = this.A01;
        if (!182.A06(0Tu.A06, userSession, 36314863315848034L)) {
            if (r8 != null) {
                str2 = r8.A11;
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str2, "direct_v2_text")) {
                r5 = AnonymousClass5HN.TEXT_MESSAGE;
            } else if (0qQ.A0K(str2, "direct_v2_reel_share")) {
                r5 = AnonymousClass5HN.IG_STORY_REPLY;
            } else {
                r5 = AnonymousClass5HN.UNKNOWN;
            }
            boolean contains = AnonymousClass5HM.A00.contains(r5);
            if (r8 != null && contains) {
                String A02 = C66630MZz.A02(r8);
                if (A02 == null) {
                    0KC.A0Q("MsysPushNotificationRouter", "Unable to process push path notification. pushId: %s", new Object[]{r8.A12});
                    0qQ.A0B(PushChannelType.SYNC, 3);
                    C67295MlU.A02(r8, userSession, "processPushPathNotification: received notification with null message_id", BaseJavaModule.METHOD_TYPE_SYNC, 7);
                } else {
                    int i = r5.A00;
                    boolean A06 = 182.A06(0Tu.A05, userSession, 36314863317093223L);
                    C49360EuO euO = ((C49361EuP) 1y0.A00(userSession).A01(C49361EuP.class, new C51797G2g(userSession, 45))).A00;
                    MYN myn = new MYN(i, A02, 2);
                    1aU r2 = euO.A00;
                    C72018Ous ous = new C72018Ous(myn, 5);
                    if (A06) {
                        A0J = r2.A0K(ous);
                    } else {
                        A0J = r2.A0J(ous);
                    }
                    0qQ.A0A(A0J);
                    1aU A0H = A0J.A0H();
                    AnonymousClass3F2.A00().A08(r8, pushChannelType, str);
                    this.A00.A02(A0H, new PUC(14, (Object) r8, (Object) pushChannelType, (Object) this));
                    return;
                }
            }
            AnonymousClass3F2.A00().A08(r8, pushChannelType, str);
        } else if (r8 != null) {
            C67295MlU.A02(r8, userSession, "onPushPathNotification: push path is disabled", (String) null, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c9, code lost:
        if (r16 > r18) goto L_0x01cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C70723OHs r41) {
        /*
            r40 = this;
            r39 = r40
            r0 = r39
            com.instagram.common.session.UserSession r13 = r0.A01
            r26 = 0
            X.0Tu r12 = X.0Tu.A06
            r0 = 2342157872530918248(0x2081042d00170b68, double:4.061230408976157E-152)
            boolean r0 = X.182.A06(r12, r13, r0)
            if (r0 != 0) goto L_0x0056
            boolean r0 = X.O1V.A00(r13)
            if (r0 == 0) goto L_0x0056
            X.Dwe r1 = new X.Dwe
            r1.<init>(r13)
            r0 = 306(0x132, float:4.29E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.1OC r0 = X.F7X.A00(r13, r0)
            r0.A00 = r1
            X.1ES.A03(r0)
            X.Dwf r1 = new X.Dwf
            r1.<init>(r13)
            java.lang.String r0 = "notifications"
            X.1OC r0 = X.F7X.A00(r13, r0)
            r0.A00 = r1
            X.1ES.A03(r0)
            X.4kA r5 = X.AnonymousClass4k9.A00(r13)
            long r3 = X.AnonymousClass7TG.A0I()
            X.0s0 r2 = r5.A0Q
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 14
            r1 = r1[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.Epx(r5, r0, r1)
        L_0x0056:
            X.2Dm r0 = X.1bJ.A00(r13)
            r5 = r41
            com.instagram.model.direct.DirectThreadKey r7 = r5.A00
            X.3U9 r25 = r0.B33(r7)
            if (r25 != 0) goto L_0x0074
            java.lang.String r3 = "onSyncPathNotification: thread is null"
        L_0x0066:
            X.5HJ r2 = X.C70132Nxm.A00(r13, r5)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r1 = 0
            r0 = 3
            X.C67295MlU.A02(r2, r13, r3, r1, r0)
        L_0x0073:
            return
        L_0x0074:
            boolean r0 = r25.CYU()
            if (r0 == 0) goto L_0x0073
            X.2EN r1 = r25.C3d()
            X.2EN r0 = X.2EN.A06
            if (r1 == r0) goto L_0x0073
            X.2EN r1 = r25.C3d()
            X.2EN r0 = X.2EN.A07
            if (r1 == r0) goto L_0x0073
            java.lang.String r6 = r13.A06
            java.lang.String r0 = r5.A04
            r33 = r0
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x0073
            X.5HN r11 = r5.A01
            r0 = r26
            X.0qQ.A0B(r11, r0)
            java.util.Set r0 = X.AnonymousClass5HM.A00
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x0073
            java.lang.String r24 = r25.C6C()
            X.0t1 r0 = X.0eE.A00(r13)
            com.instagram.user.model.User r23 = r0.A00()
            X.16V r0 = r23.A0J()
            if (r0 == 0) goto L_0x00df
            int r0 = r0.A00
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
        L_0x00bd:
            if (r24 == 0) goto L_0x00e2
            if (r22 == 0) goto L_0x00e2
            X.5HJ r0 = X.C70132Nxm.A00(r13, r5)
            r10 = 0
            r4 = 1
            X.C67295MlU.A02(r0, r13, r10, r10, r4)
            X.MYi r8 = X.C66596MYi.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            long r0 = r8.ExJ(r0)
            java.lang.String r2 = "MsysPushNotificationRouter"
            r8.Eac(r2, r0)
            X.OUn r16 = X.OUn.A00
            java.lang.String r2 = r5.A02
            r32 = r2
            monitor-enter(r16)
            goto L_0x011e
        L_0x00df:
            r22 = 0
            goto L_0x00bd
        L_0x00e2:
            java.lang.String r0 = "processSyncPathNotification:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "\n threadId: "
            r2.append(r0)
            r1 = 1
            boolean r0 = X.DbW.A1a(r24)
            r2.append(r0)
            java.lang.String r0 = "\n threadV2Id: "
            r2.append(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r25.BJz()
            java.lang.String r0 = r0.A01
            boolean r0 = X.DbW.A1a(r0)
            r2.append(r0)
            java.lang.String r0 = "\n currentUserAccountType: "
            r2.append(r0)
            if (r22 == 0) goto L_0x0110
            r1 = 0
        L_0x0110:
            r2.append(r1)
            java.lang.String r3 = X.DbT.A10(r2)
            java.lang.String r0 = "MsysPushNotificationRouter"
            X.0KC.A0E(r0, r3)
            goto L_0x0066
        L_0x011e:
            java.lang.Long r15 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02db }
            java.util.Map r14 = X.OUn.A01     // Catch:{ all -> 0x02db }
            X.JV7 r9 = new X.JV7     // Catch:{ all -> 0x02db }
            r3 = r2
            r2 = r24
            r9.<init>((X.AnonymousClass5HN) r11, (java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x02db }
            r14.put(r9, r15)     // Catch:{ all -> 0x02db }
            monitor-exit(r16)
            r8.ESg(r2, r0)
            r8.Ehq(r6, r0)
            java.lang.String r2 = X.O1U.A00(r11)
            r8.EeF(r2, r0)
            r8.EaN(r0, r4)
            java.lang.String r2 = r5.A03
            if (r2 == 0) goto L_0x0147
            r8.EdQ(r2, r0)
        L_0x0147:
            X.2Dm r2 = X.1bJ.A00(r13)
            X.3U9 r3 = r2.B33(r7)
            if (r3 == 0) goto L_0x0163
            boolean r2 = r3.CUG()
            r8.EoZ(r0, r2)
            int r2 = r3.C6a()
            java.lang.String r2 = X.AnonymousClass48O.A00(r2)
            r8.EoY(r2, r0)
        L_0x0163:
            r2 = r25
            X.3SZ r2 = r2.Aue(r6)
            if (r2 == 0) goto L_0x02d7
            long r8 = r2.A00
        L_0x016d:
            r20 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r20
            boolean r2 = r25.isMuted()
            if (r2 != 0) goto L_0x01a4
            X.0t1 r2 = X.0eE.A00(r13)
            com.instagram.user.model.User r2 = r2.A00()
            boolean r2 = r2.A2L()
            if (r2 == 0) goto L_0x02cd
            X.1Av r2 = X.1Au.A00(r13)
            java.lang.String r3 = "direct_message_professional_notification_status"
            java.lang.String r6 = "primary_and_general_inbox"
            X.0xa r2 = r2.A01
            java.lang.String r3 = r2.getString(r3, r6)
            X.0qQ.A07(r3)
            java.lang.String r2 = "primary_inbox"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x02b6
            int r2 = r25.B6d()
            if (r2 == 0) goto L_0x02ca
        L_0x01a4:
            X.0xa r14 = X.AnonymousClass7TE.A0q(r13)
            r2 = 1280(0x500, float:1.794E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r6 = -1
            long r18 = r14.getLong(r2, r6)
            r2 = 36316001482051424(0x81053600000f60, double:3.029723797825272E-306)
            boolean r2 = X.182.A06(r12, r13, r2)
            if (r2 == 0) goto L_0x02b2
            java.lang.String r2 = "quiet_mode_next_end_timestamp"
            long r16 = r14.getLong(r2, r6)
            long r16 = r16 * r20
            int r2 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b2
        L_0x01cb:
            if (r4 == 0) goto L_0x02ae
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r20 = java.lang.Long.valueOf(r2)
        L_0x01d6:
            r3 = r33
            r2 = r25
            com.instagram.user.model.User r15 = r2.CCf(r3)
            if (r15 == 0) goto L_0x02aa
            boolean r2 = r15.A2L()
            if (r2 == 0) goto L_0x02a4
            java.lang.String r27 = r15.getUsername()
        L_0x01ea:
            r7 = 35
            X.Plm r2 = X.C73911Plm.A00(r13, r7)
            java.lang.Class<com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator> r6 = com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator.class
            java.lang.Object r2 = r13.A01(r6, r2)
            com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator r2 = (com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator) r2
            boolean r14 = r2.isInitialized
            r2 = 2342157872530983785(0x2081042d00180b69, double:4.061230409031727E-152)
            boolean r2 = X.182.A06(r12, r13, r2)
            if (r2 != 0) goto L_0x0216
            if (r14 != 0) goto L_0x0216
            X.Plm r2 = X.C73911Plm.A00(r13, r7)
            java.lang.Object r3 = r13.A01(r6, r2)
            com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator r3 = (com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator) r3
            java.lang.String r2 = "CriticalPathJob"
            r3.initialize(r2)
        L_0x0216:
            X.5Cv r2 = X.C282375Cv.A00(r13)
            X.0qQ.A07(r2)
            r3 = 95
            int r6 = r11.A00
            r2 = r32
            java.lang.String r2 = X.002.A0G(r2, r3, r6)
            r11 = 14
            java.lang.String r7 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r11, r2)
            if (r7 == 0) goto L_0x0236
            r3 = 235(0xeb, float:3.3E-43)
            r2 = r26
            X.C282375Cv.A03(r7, r10, r11, r3, r2)
        L_0x0236:
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r7 = X.1y0.A00(r13)
            r2 = 45
            X.G2g r3 = new X.G2g
            r3.<init>(r13, r2)
            java.lang.Class<X.EuP> r2 = X.C49361EuP.class
            java.lang.Object r2 = r7.A01(r2, r3)
            X.EuP r2 = (X.C49361EuP) r2
            boolean r35 = r25.CUG()
            int r31 = r25.B6d()
            java.lang.String r29 = r23.getUsername()
            int r30 = r22.intValue()
            boolean r11 = r5.A06
            java.lang.String r25 = r25.C6f()
            java.lang.String r10 = r5.A05
            java.lang.Long r21 = java.lang.Long.valueOf(r16)
            if (r15 == 0) goto L_0x02a1
            java.lang.String r28 = X.DbU.A0p(r15)
        L_0x026b:
            boolean r7 = r5.A07
            X.EuO r3 = r2.A00
            X.Pn5 r2 = new X.Pn5
            r19 = r2
            r22 = r32
            r23 = r24
            r24 = r10
            r26 = r33
            r32 = r6
            r33 = r8
            r36 = r4
            r37 = r11
            r38 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38)
            X.1aU r6 = r3.A00
            r4 = 5
            X.Ous r3 = new X.Ous
            r3.<init>(r2, r4)
            X.1aU r6 = r6.A0J(r3)
            r2 = r39
            X.1a8 r4 = r2.A00
            X.PSS r3 = new X.PSS
            r3.<init>(r2, r5, r0)
            r4.A02(r6, r3)
            return
        L_0x02a1:
            r28 = 0
            goto L_0x026b
        L_0x02a4:
            java.lang.String r27 = r15.B8Q()
            goto L_0x01ea
        L_0x02aa:
            r27 = 0
            goto L_0x01ea
        L_0x02ae:
            r20 = 0
            goto L_0x01d6
        L_0x02b2:
            r16 = r18
            goto L_0x01cb
        L_0x02b6:
            boolean r2 = r3.equals(r6)
            if (r2 == 0) goto L_0x01a4
            int r2 = r25.B6d()
            if (r2 == 0) goto L_0x02ca
            int r2 = r25.B6d()
            if (r2 == r4) goto L_0x02ca
            goto L_0x01a4
        L_0x02ca:
            r4 = 0
            goto L_0x01a4
        L_0x02cd:
            X.1Av r2 = X.1Au.A00(r13)
            boolean r4 = r2.A1l()
            goto L_0x01a4
        L_0x02d7:
            r8 = 0
            goto L_0x016d
        L_0x02db:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OMX.A01(X.OHs):void");
    }
}
