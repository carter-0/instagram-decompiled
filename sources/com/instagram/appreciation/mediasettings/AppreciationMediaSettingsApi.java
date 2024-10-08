package com.instagram.appreciation.mediasettings;

import com.instagram.common.session.UserSession;

public final class AppreciationMediaSettingsApi {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.1Xj r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r13 = this;
            r6 = 3
            r3 = r18
            boolean r0 = X.ME4.A03(r6, r3)
            if (r0 == 0) goto L_0x00b2
            r5 = r3
            X.ME4 r5 = (X.ME4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b2
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 != r3) goto L_0x00bd
            X.0eS.A00(r1)
        L_0x0025:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003a
            X.3Ih r1 = X.JTT.A0j(r3)
        L_0x002d:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0039
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b8
            X.5sO r1 = X.DbU.A0f()
        L_0x0039:
            return r1
        L_0x003a:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0043:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r13.A00
            java.lang.String r8 = r14.A2n()
            if (r8 == 0) goto L_0x00c2
            r0 = 5
            r9 = r17
            X.0qQ.A0B(r9, r0)
            r2 = 0
            X.1NY r7 = X.DbU.A0M(r1)
            java.lang.String r12 = "api/"
            java.lang.String r11 = "v1/"
            java.lang.String r10 = "creators/"
            java.lang.String r1 = "content_appreciation/"
            java.lang.String r0 = "update_media_gifting_status/"
            r7.A04()
            r7.A02()
            java.lang.String r0 = X.002.A11(r12, r11, r10, r1, r0)
            X.0qQ.A07(r0)
            r7.A0E = r0
            java.lang.Class<X.CCt> r1 = X.C43775CCt.class
            java.lang.Class<X.CyG> r0 = X.C45542CyG.class
            r7.A0Q(r1, r0)
            java.lang.String r0 = X.Dbg.A00()
            r7.A9m(r0, r9)
            X.JTO.A1W(r7, r8)
            if (r15 == 0) goto L_0x008e
            boolean r1 = r15.booleanValue()
            java.lang.String r0 = "is_gifting_enabled"
            r7.A0H(r0, r1)
        L_0x008e:
            if (r16 == 0) goto L_0x0099
            boolean r1 = r16.booleanValue()
            java.lang.String r0 = "gift_counts_disabled"
            r7.A0H(r0, r1)
        L_0x0099:
            X.1OC r1 = r7.A0M()
            r0 = 8
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            r5.A00 = r3
            r0 = 1422693781(0x54cc9595, float:7.0294632E12)
            java.lang.Object r1 = r1.A02(r5, r0, r6, r2)
            if (r1 != r4) goto L_0x0025
            return r4
        L_0x00b2:
            X.ME4 r5 = X.ME4.A00(r13, r3, r6)
            goto L_0x0017
        L_0x00b8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.mediasettings.AppreciationMediaSettingsApi.A00(X.1Xj, java.lang.Boolean, java.lang.Boolean, java.lang.String, X.4D7):java.lang.Object");
    }

    public AppreciationMediaSettingsApi(UserSession userSession) {
        this.A00 = userSession;
    }
}
