package com.instagram.pendingmedia.service.igapi;

public final class ConfigureAsyncHelper {
    public static final ConfigureAsyncHelper A00 = new Object();

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDW, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.K1X, X.1XQ, X.1XT, X.1XP] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f4, code lost:
        if ("feed".equals(r3.A2b) == false) goto L_0x0145;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x021f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass0iw r28, X.LP8 r29, com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper r30, X.AnonymousClass4D7 r31) {
        /*
            r4 = r31
            r9 = r28
            r2 = r29
            boolean r0 = r4 instanceof X.MDW
            if (r0 == 0) goto L_0x02da
            r6 = r4
            X.MDW r6 = (X.MDW) r6
            int r3 = r6.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x02da
            int r3 = r3 - r1
            r6.A03 = r3
        L_0x0018:
            java.lang.Object r11 = r6.A0D
            X.1Hj r23 = X.1Hj.A02
            int r3 = r6.A03
            r19 = 0
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L_0x0189
            if (r3 == r0) goto L_0x0220
            if (r3 != r1) goto L_0x02e3
            int r0 = r6.A02
            r18 = r0
            long r0 = r6.A04
            r16 = r0
            int r10 = r6.A01
            int r12 = r6.A00
            java.lang.Object r0 = r6.A0C
            r22 = r0
            java.lang.Object r7 = r6.A0B
            X.37l r7 = (X.C2373937l) r7
            java.lang.Object r5 = r6.A0A
            X.1ut r5 = (X.1ut) r5
            java.lang.Object r8 = r6.A09
            X.1us r8 = (X.1us) r8
            java.lang.Object r4 = r6.A08
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r6.A07
            X.3Q2 r3 = (X.AnonymousClass3Q2) r3
            java.lang.Object r2 = r6.A06
            X.LP8 r2 = (X.LP8) r2
            java.lang.Object r9 = r6.A05
            X.0iw r9 = (X.AnonymousClass0iw) r9
            X.0eS.A00(r11)
            r19 = r23
        L_0x0059:
            X.L6w r11 = (X.C63790L6w) r11
        L_0x005b:
            r1 = r7
            X.37j r1 = (X.C2373737j) r1
            r21 = 0
            r0 = r21
            X.0qQ.A0B(r3, r0)
            X.0wc r13 = r1.A01
            java.lang.String r0 = "ig_media_upload_configure_status_invoke"
            X.0Aj r13 = X.AnonymousClass7TE.A0e(r13, r0)
            boolean r0 = r13.isSampled()
            if (r0 == 0) goto L_0x010c
            android.content.Context r0 = r1.A00
            com.instagram.common.session.UserSession r15 = r1.A02
            X.JbW r1 = new X.JbW
            r1.<init>(r0, r15, r3)
            X.3Q2 r0 = r1.A02
            X.JTS.A1B(r13, r0)
            X.3QF r0 = r3.A1T
            int r0 = r0.A00()
            java.lang.String r20 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "publish_id"
            r14 = r0
            r0 = r20
            r13.AAJ(r14, r0)
            X.C59908JbX.A06(r13, r1)
            java.lang.String r20 = X.C59906JbV.A01(r15, r3)
            java.lang.String r0 = "ingest_surface"
            r14 = r0
            r0 = r20
            r13.AAJ(r14, r0)
            r20 = 0
            r0 = 1
            r14 = r20
            java.lang.String r0 = X.C59906JbV.A03(r15, r3, r14, r0)
            java.lang.String r14 = "target_surface"
            X.C59908JbX.A05(r13, r1, r14, r0)
            X.C59908JbX.A03(r13, r1)
            java.lang.String r0 = X.AnonymousClass5BB.A00()
            java.lang.String r14 = "application_state"
            r13.AAJ(r14, r0)
            boolean r0 = r3.A5D
            if (r0 == 0) goto L_0x0183
            r1 = r20
        L_0x00c2:
            java.lang.String r0 = "custom_fields"
            r13.A9H(r0, r1)
            r0 = 1289(0x509, float:1.806E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = r20
            r13.A9F(r1, r0)
            boolean r0 = r3.A5S
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "from_draft"
            r0 = r21
            java.lang.Boolean r1 = X.JTP.A0g(r13, r1, r14, r0)
            java.lang.String r0 = "is_panavision"
            r13.A7p(r0, r1)
            X.3QP r0 = r3.A1j
            double r0 = r0.A00
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = 4590(0x11ee, float:6.432E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.A8D(r0, r1)
            long r0 = r3.A0g
            long r0 = X.AnonymousClass7TE.A0P(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3565(0xded, float:4.996E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.A9F(r0, r1)
            r13.Cgf()
        L_0x010c:
            X.LQw r24 = X.C64155LQw.A00
            X.0eP r0 = X.C64155LQw.A00(r11)
            java.lang.Object r13 = r0.A00
            X.2ZL r13 = (X.2ZL) r13
            java.lang.Object r1 = r0.A01
            X.K1X r1 = (X.K1X) r1
            int r14 = r1.mStatusCode
            r0 = 200(0xc8, float:2.8E-43)
            if (r14 == r0) goto L_0x015a
            r0 = 202(0xca, float:2.83E-43)
            if (r14 == r0) goto L_0x0153
            r15 = 1
            r0 = 400(0x190, float:5.6E-43)
            if (r14 != r0) goto L_0x01c2
            java.lang.String r0 = r1.getErrorMessage()
            if (r0 == 0) goto L_0x01c2
            java.lang.Boolean r14 = r1.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r14, r15)
            if (r0 == 0) goto L_0x01c2
            X.3QQ r0 = r3.A1d
            int r0 = r0.A00
            r14 = 10
            if (r0 >= r14) goto L_0x01c2
            X.55U r19 = X.C63381Kw2.A00(r11, r2)
        L_0x0143:
            if (r12 == 0) goto L_0x0152
        L_0x0145:
            X.55S r1 = X.AnonymousClass55S.A0M
            java.lang.String r0 = "Failed on configure: Reply: Server needs too many 202 retries"
            X.55U r19 = r2.A02(r1, r0)
            X.3Q2 r0 = r2.A0D
            r7.EFb(r0)
        L_0x0152:
            return r19
        L_0x0153:
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
            goto L_0x01cd
        L_0x015a:
            java.lang.String r13 = r1.getErrorMessage()
            java.lang.String r0 = "media_needs_reupload"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x016b
            X.55U r19 = X.C63381Kw2.A00(r11, r2)
            goto L_0x0143
        L_0x016b:
            r7.EGC(r3)
            java.lang.String r30 = X.AnonymousClass7TF.A0b()
            r31 = 1
            r25 = r1
            r26 = r9
            r27 = r5
            r28 = r8
            r29 = r2
            r24.A01(r25, r26, r27, r28, r29, r30, r31)
            r12 = 0
            goto L_0x01cd
        L_0x0183:
            java.util.Map r1 = r1.A07()
            goto L_0x00c2
        L_0x0189:
            X.0eS.A00(r11)
            X.3Q2 r3 = r2.A0D
            com.instagram.common.session.UserSession r4 = r2.A0C
            X.1us r8 = r3.A0B()
            if (r8 == 0) goto L_0x01b3
            r5 = r8
        L_0x0197:
            X.37k r7 = r2.A0E
            X.0Tu r10 = X.0Tu.A05
            r0 = 36603592492454849(0x820ac6000413c1, double:3.211597510840446E-306)
            long r16 = X.JTS.A05(r10, r4, r0)
            r0 = 36603592492520386(0x820ac6000513c2, double:3.211597510881892E-306)
            int r18 = X.DbS.A04(r10, r4, r0)
            r10 = 0
            r22 = r19
            r19 = r23
            goto L_0x01f6
        L_0x01b3:
            java.util.Map r1 = r2.A0L
            com.instagram.pendingmedia.model.constants.ShareType r0 = r3.A0E()
            java.lang.Object r5 = r1.get(r0)
            X.1ut r5 = (X.1ut) r5
            if (r5 != 0) goto L_0x0197
            return r19
        L_0x01c2:
            X.3Q2 r0 = r2.A0D
            r7.EFb(r0)
            java.lang.String r0 = "Server returns failure on status polling"
            X.55U r22 = r2.A01(r1, r13, r0)
        L_0x01cd:
            X.C63378Kvz.A00(r1, r2)
            if (r12 == 0) goto L_0x02e8
            int r10 = r10 + 1
            r0 = r18
            if (r10 < r0) goto L_0x01f6
            boolean r0 = r3.A0x()
            if (r0 != 0) goto L_0x01f6
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV
            if (r1 == r0) goto L_0x01f6
            boolean r0 = r3.A0v()
            if (r0 == 0) goto L_0x0145
            java.lang.String r1 = "feed"
            java.lang.String r0 = r3.A2b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0145
        L_0x01f6:
            r6.A05 = r9
            r6.A06 = r2
            r6.A07 = r3
            r6.A08 = r4
            r6.A09 = r8
            r6.A0A = r5
            r6.A0B = r7
            r0 = r22
            r6.A0C = r0
            r6.A00 = r10
            r0 = r16
            r6.A04 = r0
            r0 = r18
            r6.A01 = r0
            r0 = 1
            r6.A03 = r0
            r0 = r16
            java.lang.Object r1 = X.C241603Pv.A01(r6, r0)
            r0 = r23
            if (r1 != r0) goto L_0x024f
            return r19
        L_0x0220:
            int r0 = r6.A01
            r18 = r0
            long r0 = r6.A04
            r16 = r0
            int r10 = r6.A00
            java.lang.Object r0 = r6.A0C
            r22 = r0
            java.lang.Object r7 = r6.A0B
            X.37l r7 = (X.C2373937l) r7
            java.lang.Object r5 = r6.A0A
            X.1ut r5 = (X.1ut) r5
            java.lang.Object r8 = r6.A09
            X.1us r8 = (X.1us) r8
            java.lang.Object r4 = r6.A08
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r6.A07
            X.3Q2 r3 = (X.AnonymousClass3Q2) r3
            java.lang.Object r2 = r6.A06
            X.LP8 r2 = (X.LP8) r2
            java.lang.Object r9 = r6.A05
            X.0iw r9 = (X.AnonymousClass0iw) r9
            X.0eS.A00(r11)
            r19 = r23
        L_0x024f:
            X.3Q2 r0 = r2.A0D
            java.lang.String r0 = r0.A3t
            r15 = r0
            boolean r14 = X.AnonymousClass7TG.A1Z(r3, r4)
            r12 = 2
            X.0qQ.A0B(r0, r12)
            com.instagram.pendingmedia.model.constants.ShareType r13 = r3.A0E()
            X.0qQ.A0B(r13, r12)
            X.1NY r11 = X.AnonymousClass7TG.A0b(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            if (r13 != r0) goto L_0x02d0
            X.UzA r0 = X.C16674UzA.CONFIGURE_STATUS_CLIPS
        L_0x0271:
            r0.A00(r11, r4, r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r15}
            java.lang.String r0 = "?upload_id=%s"
            java.lang.String r0 = X.0mp.A06(r0, r13)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            X.0qQ.A07(r0)
            r11.A0E = r0
            X.1QX r11 = r11.A0N()
            X.1QS r13 = r11.A02
            java.lang.String r1 = r3.A0H()
            java.lang.String r0 = "retry_context"
            r13.A01(r0, r1)
            X.0Tu r13 = X.0Tu.A05
            r0 = 36318084542502767(0x81071b0014176f, double:3.0310411336425125E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x02d3
            com.instagram.pendingmedia.service.common.ParsingSyncHttpService r13 = com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A00
            r6.A05 = r9
            r6.A06 = r2
            r6.A07 = r3
            r6.A08 = r4
            r6.A09 = r8
            r6.A0A = r5
            r6.A0B = r7
            r0 = r22
            r6.A0C = r0
            r6.A00 = r14
            r6.A01 = r10
            r0 = r16
            r6.A04 = r0
            r0 = r18
            r6.A02 = r0
            r6.A03 = r12
            java.lang.Object r11 = r13.A02(r11, r4, r5, r6)
            r0 = r23
            if (r11 == r0) goto L_0x0152
            r12 = 1
            goto L_0x0059
        L_0x02d0:
            X.UzA r0 = X.C16674UzA.CONFIGURE_STATUS_STORY
            goto L_0x0271
        L_0x02d3:
            X.L6w r11 = com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A01(r11, r4, r5)
            r12 = 1
            goto L_0x005b
        L_0x02da:
            X.MDW r6 = new X.MDW
            r0 = r30
            r6.<init>(r0, r4)
            goto L_0x0018
        L_0x02e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e8:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper.A00(X.0iw, X.LP8, com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r7 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass0iw r13, X.LP8 r14, X.AnonymousClass4D7 r15) {
        /*
            r12 = this;
            r3 = 22
            boolean r0 = X.ME6.A02(r3, r15)
            if (r0 == 0) goto L_0x00cc
            r4 = r15
            X.ME6 r4 = (X.ME6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cc
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r8 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r5) goto L_0x00d5
            X.0eS.A00(r8)
        L_0x0024:
            return r8
        L_0x0025:
            X.0eS.A00(r8)
            X.3Q2 r3 = r14.A0D
            X.37k r2 = r14.A0E
            X.1us r9 = r3.A0B()
            r8 = 0
            if (r9 == 0) goto L_0x0039
            com.instagram.pendingmedia.model.constants.ShareType r10 = r9.BtR()
            if (r10 != 0) goto L_0x003d
        L_0x0039:
            com.instagram.pendingmedia.model.constants.ShareType r10 = r3.A0E()
        L_0x003d:
            if (r9 == 0) goto L_0x006c
            r7 = r9
        L_0x0040:
            X.0Tu r11 = X.0Tu.A05
            X.0qQ.A08(r11)
            r0 = 18313074830883285(0x410fa5000a39d5, double:1.8981116545102583E-307)
            boolean r0 = X.1AW.A06(r11, r0)
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r3.A3V
            if (r0 == 0) goto L_0x007b
            X.OOC r11 = new X.OOC
            r11.<init>()
            r11.A06(r0)
            java.lang.String[] r1 = X.C9949Rk2.A00
            r0 = 3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11.A07(r0)
            r11.A00()
            goto L_0x007b
        L_0x006c:
            java.util.Map r1 = r14.A0L
            com.instagram.pendingmedia.model.constants.ShareType r0 = r3.A0E()
            java.lang.Object r7 = r1.get(r0)
            X.1ut r7 = (X.1ut) r7
            if (r7 != 0) goto L_0x0040
            goto L_0x00c1
        L_0x007b:
            java.lang.String r0 = X.AnonymousClass7TG.A0j()     // Catch:{ IOException -> 0x00b6 }
            X.1QX r10 = X.C63379Kw0.A00(r7, r10, r14, r0, r5)     // Catch:{ IOException -> 0x00b6 }
            r0 = 0
            X.Lel r7 = new X.Lel     // Catch:{ IOException -> 0x00b6 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x00b6 }
            X.9Fq r1 = X.C375889Fq.A00     // Catch:{ IOException -> 0x00b6 }
            X.Lj4 r0 = new X.Lj4     // Catch:{ IOException -> 0x00b6 }
            r0.<init>(r1, r7)     // Catch:{ IOException -> 0x00b6 }
            X.L6w r0 = com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A00(r0, r10)     // Catch:{ IOException -> 0x00b6 }
            X.2ZL r0 = r0.A00     // Catch:{ IOException -> 0x00b6 }
            if (r0 == 0) goto L_0x00aa
            int r7 = r0.A02     // Catch:{ IOException -> 0x00b6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00b6 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == 0) goto L_0x00aa
            if (r7 != r0) goto L_0x00aa
            java.lang.String r0 = r14.A0I     // Catch:{ IOException -> 0x00b6 }
            r2.EFl(r3, r9, r0, r5)     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00c1
        L_0x00aa:
            X.55S r1 = X.AnonymousClass55S.A0M     // Catch:{ IOException -> 0x00b6 }
            java.lang.String r0 = "Failed on upload params: did not receive a 200"
            X.55U r8 = r14.A02(r1, r0)     // Catch:{ IOException -> 0x00b6 }
            r2.EFc(r3)     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00c1
        L_0x00b6:
            X.55S r1 = X.AnonymousClass55S.A0M
            java.lang.String r0 = "Failed on initial async configure call"
            X.55U r8 = r14.A02(r1, r0)
            r2.EFc(r3)
        L_0x00c1:
            if (r8 != 0) goto L_0x0024
            r4.A00 = r5
            java.lang.Object r8 = A00(r13, r14, r12, r4)
            if (r8 != r6) goto L_0x0024
            return r6
        L_0x00cc:
            r0 = 42
            X.ME6 r4 = new X.ME6
            r4.<init>(r12, r15, r3, r0)
            goto L_0x0016
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper.A01(X.0iw, X.LP8, X.4D7):java.lang.Object");
    }
}
