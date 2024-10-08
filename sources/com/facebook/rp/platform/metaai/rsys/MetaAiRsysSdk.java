package com.facebook.rp.platform.metaai.rsys;

import X.0sP;
import X.C262094Cc;
import X.C262204Co;
import X.C51974G9v;
import X.C73996PnN;
import X.DbS;
import X.MNK;
import X.MNL;
import X.NCY;
import X.OL3;
import java.util.Set;

public final class MetaAiRsysSdk {
    public NCY A00;
    public C262204Co A01;
    public final OL3 A02;
    public final String A03;
    public final Set A04 = DbS.A0y();
    public final C262094Cc A05;
    public final 0sP A06;
    public final 0sP A07;
    public final 0sP A08;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[Catch:{ CancellationException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C60940Jty r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            r7 = r12
            r4 = 14
            boolean r0 = X.MED.A04(r4, r13)
            if (r0 == 0) goto L_0x00bb
            r1 = r13
            X.MED r1 = (X.MED) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00bb
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0017:
            java.lang.Object r0 = r1.A04
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r10 = 2
            r3 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0037
            if (r4 == r3) goto L_0x002a
            if (r4 != r10) goto L_0x00c2
            X.0eS.A00(r0)
        L_0x0029:
            return r0
        L_0x002a:
            java.lang.Object r8 = r1.A03
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r1.A02
            X.Jty r7 = (X.C60940Jty) r7
            java.lang.Object r6 = r1.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r6 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r6
            goto L_0x0075
        L_0x0037:
            X.0eS.A00(r0)
            android.content.Context r4 = r12.A01
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = r4.checkSelfPermission(r0)
            boolean r5 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r8 = r12.A02
            r0 = 11
            java.lang.Integer r4 = X.JTO.A0w(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.util.Map r4 = X.AnonymousClass7TF.A0w(r4, r0)
            r0 = 0
            X.0qQ.A0B(r8, r0)
            com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel.CProxy.annotateMultipleTyped(r8, r9, r4, r9)
            if (r5 != 0) goto L_0x007f
            X.4CZ r0 = X.AnonymousClass12W.A00     // Catch:{ CancellationException -> 0x00c7 }
            X.134 r5 = X.AnonymousClass12y.A00     // Catch:{ CancellationException -> 0x00c7 }
            r4 = 31
            X.JTh r0 = new X.JTh     // Catch:{ CancellationException -> 0x00c7 }
            r0.<init>((java.lang.Object) r12, (X.AnonymousClass4D7) r9, (int) r4)     // Catch:{ CancellationException -> 0x00c7 }
            X.MED.A00(r11, r12, r8, r1, r3)     // Catch:{ CancellationException -> 0x00c7 }
            java.lang.Object r0 = X.1Eo.A00(r1, r5, r0)     // Catch:{ CancellationException -> 0x00c7 }
            if (r0 == r2) goto L_0x00a7
            r6 = r11
            goto L_0x0078
        L_0x0075:
            X.0eS.A00(r0)     // Catch:{ CancellationException -> 0x00c7 }
        L_0x0078:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ CancellationException -> 0x00c7 }
            if (r0 != 0) goto L_0x0080
            goto L_0x00d2
        L_0x007f:
            r6 = r11
        L_0x0080:
            android.content.Context r5 = r7.A01
            r4 = 1
            r0 = 75
            java.lang.String r0 = X.Pxd.A00(r0)
            int r0 = r5.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x00a3
            X.0sP r0 = r6.A06
            java.lang.Object r0 = r0.invoke(r5)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.isConnected()
            if (r0 != r3) goto L_0x00a8
        L_0x00a3:
            if (r4 != 0) goto L_0x00aa
            X.K0J r2 = X.K0J.A00
        L_0x00a7:
            return r2
        L_0x00a8:
            r4 = 0
            goto L_0x00a3
        L_0x00aa:
            X.4Cc r0 = r6.A05
            X.MH7 r5 = new X.MH7
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.MED.A03(r1, r10)
            java.lang.Object r0 = X.1Eo.A00(r1, r0, r5)
            if (r0 != r2) goto L_0x0029
            return r2
        L_0x00bb:
            X.MED r1 = new X.MED
            r1.<init>(r11, r13, r4)
            goto L_0x0017
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c7:
            java.lang.String r2 = "start_session_failure"
            java.lang.String r1 = "coroutine_job_cancelled_during_permission_request"
            r0 = 0
            X.0qQ.A0B(r8, r0)
            com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel.CProxy.fail(r8, r2, r1)
        L_0x00d2:
            X.K0I r2 = X.K0I.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk.A00(X.Jty, X.4D7):java.lang.Object");
    }

    public /* synthetic */ MetaAiRsysSdk(OL3 ol3, String str, C262094Cc r7) {
        MNK mnk = MNK.A00;
        C73996PnN pnN = C73996PnN.A00;
        MNL mnl = MNL.A00;
        C51974G9v.A0d(3, ol3, mnk, pnN, mnl);
        this.A03 = str;
        this.A05 = r7;
        this.A02 = ol3;
        this.A06 = mnk;
        this.A08 = pnN;
        this.A07 = mnl;
    }
}
