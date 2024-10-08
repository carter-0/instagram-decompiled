package X;

import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.MlU  reason: case insensitive filesystem */
public abstract class C67295MlU {
    public static final void A00(PushInfraMetaData pushInfraMetaData, Exception exc, String str, int i) {
        0qQ.A0B(str, 0);
        1Ln A0K = 1Ln.A0K(new AnonymousClass0kM(C61170le.A00).A00());
        String A00 = MYa.A00(i);
        String str2 = pushInfraMetaData.A05;
        if (str2 == null) {
            str2 = "0";
        }
        long A04 = DbY.A04(pushInfraMetaData.A00);
        A0K.A0R("notif_event", A00);
        A0K.A0R("channel", str);
        C66583MXo.A19(A0K, pushInfraMetaData, str2, A04);
        A0K.A0R("extra_info", 2Og.A00(exc));
        A0K.Cgf();
    }

    public static final void A01(PushInfraMetaData pushInfraMetaData, String str, int i) {
        0qQ.A0B(str, 0);
        1Ln A0K = 1Ln.A0K(new AnonymousClass0kM(C61170le.A00).A00());
        String A00 = MYa.A00(i);
        String str2 = pushInfraMetaData.A05;
        if (str2 == null) {
            str2 = "0";
        }
        long A04 = DbY.A04(pushInfraMetaData.A00);
        if (C282435Db.A01(pushInfraMetaData)) {
            A0K.A0R("notif_event", A00);
            A0K.A0R("channel", str);
            C66583MXo.A19(A0K, pushInfraMetaData, str2, A04);
            A0K.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (X.0qQ.A0K(((com.instagram.common.session.UserSession) r14).A06, r6.A0j) == false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass5HJ r13, X.0lg r14, java.lang.String r15, java.lang.String r16, int r17) {
        /*
            r3 = 1
            boolean r2 = r14 instanceof com.instagram.common.session.UserSession
            r6 = r13
            r12 = r15
            r13 = r17
            if (r2 == 0) goto L_0x0036
            java.lang.String r0 = r6.A0g
            if (r0 == 0) goto L_0x00a1
            android.net.Uri r1 = X.DbT.A09(r0)
            java.lang.String r0 = "x"
            java.lang.String r9 = r1.getQueryParameter(r0)
        L_0x0017:
            r0 = r14
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6Bt r7 = X.C304006Bs.A00(r0)
            java.lang.String r10 = r6.A0w
            if (r10 != 0) goto L_0x002f
            java.lang.String r1 = r6.A0X
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = "direct_v2_delete_item"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
        L_0x002e:
            r10 = r1
        L_0x002f:
            java.lang.String r8 = r6.A12
            r11 = r16
            r7.A00(r8, r9, r10, r11, r12, r13)
        L_0x0036:
            r5 = 1
            if (r13 == r3) goto L_0x00a4
            r0 = 3
            r1 = 5
            if (r13 == r0) goto L_0x0065
            if (r13 == r1) goto L_0x0065
            r0 = 6
            if (r13 == r0) goto L_0x0065
            r0 = 7
            if (r13 == r0) goto L_0x0065
            java.lang.String r4 = r6.A12
            X.0qQ.A07(r4)
            boolean r0 = X.C67290MlP.A00(r6)
            if (r0 == 0) goto L_0x0064
            java.lang.String r3 = X.MYa.A00(r13)
            com.facebook.quicklog.reliability.UserFlowLogger r2 = X.C67290MlP.A01
            r1 = 550451290(0x20cf385a, float:3.5104454E-19)
            int r0 = r4.hashCode()
            long r0 = r2.generateFlowId(r1, r0)
            r2.flowMarkPoint(r0, r3)
        L_0x0064:
            return
        L_0x0065:
            java.lang.String r2 = r6.A12
            X.0qQ.A07(r2)
            if (r13 == r1) goto L_0x006d
            r5 = 0
        L_0x006d:
            boolean r0 = X.C67290MlP.A00(r6)
            if (r0 == 0) goto L_0x0064
            com.facebook.quicklog.reliability.UserFlowLogger r4 = X.C67290MlP.A01
            r1 = 550451290(0x20cf385a, float:3.5104454E-19)
            int r0 = r2.hashCode()
            long r2 = r4.generateFlowId(r1, r0)
            X.ULg r1 = X.C67290MlP.A00
            java.lang.String r0 = r1.A01
            r4.flowMarkPoint(r2, r0)
            java.lang.String r0 = "is_rendered"
            r4.flowAnnotate(r2, r0, r5)
            java.lang.String r0 = "suppress_reason"
            r4.flowAnnotate(r2, r0, r15)
            java.lang.String r1 = r1.A00
            java.lang.String r0 = "c"
            r4.flowAnnotateWithCrucialData(r2, r0, r1)
            r4.flowEndSuccess(r2)
            return
        L_0x009c:
            java.lang.String r10 = r6.A11
            if (r10 == 0) goto L_0x002e
            goto L_0x002f
        L_0x00a1:
            r9 = 0
            goto L_0x0017
        L_0x00a4:
            X.MlP r5 = X.C67290MlP.A02
            java.lang.String r7 = r6.A12
            X.0qQ.A07(r7)
            r8 = 0
            java.lang.Integer r1 = r6.A0H
            java.lang.Integer r0 = r6.A0I
            if (r1 == 0) goto L_0x00d9
            if (r0 == 0) goto L_0x00d9
            int r10 = r1.intValue()
            int r0 = r0.intValue()
            int r10 = r10 - r0
        L_0x00bd:
            if (r2 == 0) goto L_0x00cc
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            java.lang.String r1 = r14.A06
            java.lang.String r0 = r6.A0j
            boolean r0 = X.0qQ.A0K(r1, r0)
            r11 = 1
            if (r0 != 0) goto L_0x00cd
        L_0x00cc:
            r11 = 0
        L_0x00cd:
            boolean r12 = X.14i.A08()
            boolean r13 = r6.A1U
            java.lang.String r9 = "sync"
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x00d9:
            r10 = 0
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67295MlU.A02(X.5HJ, X.0lg, java.lang.String, java.lang.String, int):void");
    }
}
