package com.instagram.direct.securityalert.data;

import X.0sr;
import X.136;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C59836JaB;
import X.C62154KbC;
import X.MFW;
import java.util.List;

public final class SecurityAlertRepository extends C252733pa {
    public static final C59836JaB A04 = new Object();
    public static final List A05 = 0sr.A1P(new Integer[]{1520, 1519});
    public boolean A00;
    public final C62154KbC A01;
    public final SecurityAlertLocalDataSource A02;
    public final 136 A03 = new 136();

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x00fe A[EDGE_INSN: B:114:0x00fe->B:36:0x00fe ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0142 A[EDGE_INSN: B:117:0x0142->B:53:0x0142 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015f A[LOOP:5: B:55:0x0159->B:57:0x015f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0195 A[LOOP:7: B:65:0x018f->B:67:0x0195, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01af A[LOOP:8: B:69:0x01a9->B:71:0x01af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r24) {
        /*
            r23 = this;
            r5 = 23
            r6 = r24
            boolean r0 = X.C66145MDx.A02(r5, r6)
            r4 = r23
            if (r0 == 0) goto L_0x00ed
            r3 = r6
            X.MDx r3 = (X.C66145MDx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ed
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r9 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x0050
            if (r1 != r0) goto L_0x02a4
            java.lang.Object r7 = r3.A02
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r3 = r3.A01
            com.instagram.direct.securityalert.data.SecurityAlertRepository r3 = (com.instagram.direct.securityalert.data.SecurityAlertRepository) r3
            X.0eS.A00(r9)
        L_0x0030:
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r9.iterator()
        L_0x003a:
            boolean r1 = r5.hasNext()
            r4 = 2
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r2 = r5.next()
            r1 = r2
            X.JvM r1 = (X.C61022JvM) r1
            int r1 = r1.A05
            if (r1 != r4) goto L_0x003a
            r6.add(r2)
            goto L_0x003a
        L_0x0050:
            X.0eS.A00(r9)
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r1 = r4.A02
            com.instagram.common.session.UserSession r7 = r1.A00
            long r14 = java.lang.System.currentTimeMillis()
            r9 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r14 = r14 - r9
            r5 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r5
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 / r5
            java.util.List r13 = A05
            X.5GM r6 = X.AnonymousClass5GL.A00(r7)
            X.0eK r5 = r6.A03
            X.5GY r11 = X.JTR.A0q(r5)
            com.instagram.common.session.UserSession r5 = r6.A01
            java.lang.String r12 = r5.A06
            java.util.ArrayList r5 = r11.A01(r12, r13, r14, r16)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r5.iterator()
        L_0x0086:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x009c
            java.lang.Object r5 = r6.next()
            X.5Gg r5 = (X.C283135Gg) r5
            X.5Gi r5 = r5.A00()
            if (r5 == 0) goto L_0x0086
            r7.add(r5)
            goto L_0x0086
        L_0x009c:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r7.iterator()
        L_0x00a4:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x00c9
            java.lang.Object r6 = r7.next()
            X.5Gi r6 = (X.C283155Gi) r6
            X.0qQ.A0A(r6)
            r5 = 0
            X.0qQ.A0B(r6, r5)
            java.lang.String r5 = "ids"
            java.lang.String r5 = r6.A09(r5)
            if (r5 != 0) goto L_0x00c1
            java.lang.String r5 = ""
        L_0x00c1:
            java.util.List r5 = X.DbX.A0x(r5)
            X.018.A16(r5, r8)
            goto L_0x00a4
        L_0x00c9:
            java.util.Set r7 = X.00k.A0k(r8)
            long r12 = X.C51966G9m.A07(r9)
            X.C66145MDx.A00(r4, r7, r3, r0)
            r11 = 100
            X.12T r5 = X.AnonymousClass12T.A00
            r10 = 0
            X.0nV r6 = X.DbX.A0c(r5)
            X.MGA r5 = new X.MGA
            r8 = r5
            r9 = r1
            r8.<init>((com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource) r9, (X.AnonymousClass4D7) r10, (int) r11, (long) r12)
            java.lang.Object r9 = X.1Eo.A00(r3, r6, r5)
            if (r9 == r2) goto L_0x02a9
            r3 = r4
            goto L_0x0030
        L_0x00ed:
            X.MDx r3 = new X.MDx
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00f4:
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x011c
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x011c
        L_0x00fe:
            r14 = 0
        L_0x00ff:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r9.iterator()
        L_0x0107:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0138
            java.lang.Object r2 = r5.next()
            r1 = r2
            X.JvM r1 = (X.C61022JvM) r1
            int r1 = r1.A05
            if (r1 != r0) goto L_0x0107
            r4.add(r2)
            goto L_0x0107
        L_0x011c:
            java.util.Iterator r2 = r6.iterator()
        L_0x0120:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r1 = r2.next()
            X.JvM r1 = (X.C61022JvM) r1
            java.lang.String r1 = r1.A08
            boolean r1 = r7.contains(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0120
            r14 = 1
            goto L_0x00ff
        L_0x0138:
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L_0x016b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x016b
        L_0x0142:
            r13 = 0
        L_0x0143:
            X.KbC r5 = r3.A01
            int r12 = r7.size()
            int r11 = r9.size()
            java.util.List r10 = X.00k.A0a(r7)
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0159:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0187
            java.lang.Object r1 = r2.next()
            X.JvM r1 = (X.C61022JvM) r1
            java.lang.String r1 = r1.A08
            r8.add(r1)
            goto L_0x0159
        L_0x016b:
            java.util.Iterator r2 = r4.iterator()
        L_0x016f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0142
            java.lang.Object r1 = r2.next()
            X.JvM r1 = (X.C61022JvM) r1
            java.lang.String r1 = r1.A08
            boolean r1 = r7.contains(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x016f
            r13 = 1
            goto L_0x0143
        L_0x0187:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x018f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01a1
            java.lang.Object r1 = r2.next()
            X.JvM r1 = (X.C61022JvM) r1
            java.lang.String r1 = r1.A08
            r7.add(r1)
            goto L_0x018f
        L_0x01a1:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r9 = r4.iterator()
        L_0x01a9:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x01bb
            java.lang.Object r1 = r9.next()
            X.JvM r1 = (X.C61022JvM) r1
            java.lang.String r1 = r1.A08
            r2.add(r1)
            goto L_0x01a9
        L_0x01bb:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = "af_local_stories_count"
            X.0eP r15 = X.AnonymousClass7TE.A1L(r1, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = "sa_unread_alerts_count"
            X.0eP r16 = X.AnonymousClass7TE.A1L(r1, r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)
            java.lang.String r1 = "has_new_login_alert"
            X.0eP r17 = X.AnonymousClass7TE.A1L(r1, r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r13)
            java.lang.String r1 = "has_new_keys_changed_alert"
            X.0eP r18 = X.AnonymousClass7TE.A1L(r1, r9)
            java.lang.String r1 = "af_local_stories"
            X.0eP r19 = X.AnonymousClass7TE.A1L(r1, r10)
            java.lang.String r1 = "sa_unread_alerts"
            X.0eP r20 = X.AnonymousClass7TE.A1L(r1, r8)
            java.lang.String r1 = "new_login_alerts"
            X.0eP r21 = X.AnonymousClass7TE.A1L(r1, r7)
            java.lang.String r1 = "new_key_change_alerts"
            X.0eP r22 = X.AnonymousClass7TE.A1L(r1, r2)
            X.0eP[] r1 = new X.0eP[]{r15, r16, r17, r18, r19, r20, r21, r22}
            java.util.LinkedHashMap r9 = X.0Yt.A06(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r1 = r1 % r7
            int r7 = (int) r1
            r2 = 959397013(0x392f3c95, float:1.6711869E-4)
            java.lang.String r1 = "AGGREGATION"
            r5.A01(r2, r7, r1, r9)
            r5 = 0
            if (r14 == 0) goto L_0x02a1
            int r1 = r6.size()
            if (r1 == 0) goto L_0x02a1
            if (r1 == r0) goto L_0x0292
            X.Jvr r2 = new X.Jvr
            r2.<init>(r6)
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r1 = r3.A02
            com.instagram.common.session.UserSession r1 = r1.A00
            X.5Gi r2 = r2.A04(r1)
        L_0x0230:
            if (r13 == 0) goto L_0x0247
            int r1 = r4.size()
            if (r1 == 0) goto L_0x0247
            if (r1 == r0) goto L_0x0283
            X.Jvr r1 = new X.Jvr
            r1.<init>(r4)
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r0 = r3.A02
            com.instagram.common.session.UserSession r0 = r0.A00
            X.5Gi r5 = r1.A04(r0)
        L_0x0247:
            X.5Gi[] r1 = new X.C283155Gi[]{r2, r5}
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r2 = X.03t.A0I(r1)
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r0 = r3.A02
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r3 = X.0Tu.A06
            r0 = 36321481861506487(0x810a32001225b7, double:3.0331896118603707E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x02a9
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r2.iterator()
        L_0x026c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Gi r0 = (X.C283155Gi) r0
            int r1 = r0.A00
            r0 = 1520(0x5f0, float:2.13E-42)
            if (r1 == r0) goto L_0x026c
            r4.add(r2)
            goto L_0x026c
        L_0x0283:
            java.lang.Object r1 = X.00k.A0M(r4)
            X.JvM r1 = (X.C61022JvM) r1
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r0 = r3.A02
            com.instagram.common.session.UserSession r0 = r0.A00
            X.5Gi r5 = r1.A01(r0)
            goto L_0x0247
        L_0x0292:
            java.lang.Object r2 = X.00k.A0M(r6)
            X.JvM r2 = (X.C61022JvM) r2
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r1 = r3.A02
            com.instagram.common.session.UserSession r1 = r1.A00
            X.5Gi r2 = r2.A01(r1)
            goto L_0x0230
        L_0x02a1:
            r2 = r5
            goto L_0x0230
        L_0x02a3:
            return r4
        L_0x02a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.data.SecurityAlertRepository.A00(X.4D7):java.lang.Object");
    }

    public final void A01(String str) {
        AnonymousClass7TE.A1Z(new MFW(this, str, (AnonymousClass4D7) null, 38), this.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityAlertRepository(C62154KbC kbC, SecurityAlertLocalDataSource securityAlertLocalDataSource) {
        super("SecurityAlertFeed", AnonymousClass43D.A00(92144098));
        AnonymousClass7TG.A1O(securityAlertLocalDataSource, kbC);
        this.A02 = securityAlertLocalDataSource;
        this.A01 = kbC;
    }
}
