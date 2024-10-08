package X;

public abstract class MZZ {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass5HJ r3, long r4) {
        /*
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            boolean r0 = X.0oI.A09(r0)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = r3.A0j
            X.69F r2 = X.AnonymousClass69E.A00(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A0K = r0
            X.5Lz r0 = r3.A0A
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0022
            r2.EhU(r0, r4)
        L_0x0022:
            java.lang.String r0 = r3.A12
            if (r0 == 0) goto L_0x0029
            r2.EhV(r0, r4)
        L_0x0029:
            java.lang.String r0 = r3.A0x
            if (r0 == 0) goto L_0x0030
            r2.EdQ(r0, r4)
        L_0x0030:
            java.lang.String r0 = r3.A0z
            if (r0 == 0) goto L_0x0037
            r2.EOu(r0, r4)
        L_0x0037:
            java.lang.String r0 = r3.A0j
            if (r0 == 0) goto L_0x003e
            r2.Ehq(r0, r4)
        L_0x003e:
            java.lang.String r0 = r3.A11
            java.lang.String r1 = "secure_message_over_wa"
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = r3.A0X
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            r0 = r1
        L_0x004d:
            r2.EeF(r0, r4)
        L_0x0050:
            java.lang.String r0 = r3.A1G
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = r3.A1F
            if (r0 == 0) goto L_0x005b
        L_0x0058:
            r2.ESg(r0, r4)
        L_0x005b:
            X.Psd r0 = r3.A03()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.CUG()
            r2.EoZ(r4, r0)
        L_0x0068:
            java.lang.String r0 = r3.A0u
            if (r0 == 0) goto L_0x0079
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0079
            long r0 = r0.longValue()
            r2.EdP(r4, r0)
        L_0x0079:
            java.lang.String r1 = r3.A1G
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = r3.A1F
        L_0x007f:
            if (r1 != 0) goto L_0x008d
            java.lang.String r0 = r3.A0g
            if (r0 == 0) goto L_0x00b7
            android.net.Uri r0 = X.DbT.A09(r0)
            java.lang.String r1 = X.C66630MZz.A01(r0)
        L_0x008d:
            java.lang.String r0 = r3.A0j
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = ""
        L_0x0093:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass5HM.A00(r0)
            if (r0 == 0) goto L_0x00b6
            if (r1 == 0) goto L_0x00b6
            r2.ESg(r1, r4)
            X.3U9 r1 = X.C66582MXn.A0b(r0, r1)
            if (r1 == 0) goto L_0x00b6
            boolean r0 = r1.CUG()
            r2.EoZ(r4, r0)
            int r0 = r1.C6a()
            java.lang.String r0 = X.AnonymousClass48O.A00(r0)
            r2.EoY(r0, r4)
        L_0x00b6:
            return
        L_0x00b7:
            r1 = 0
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZZ.A00(X.5HJ, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r6.length() == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.common.notifications.push.intf.PushChannelType r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            X.0fA r4 = X.0wj.A00
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1 = 216072193(0xce10001, float:3.4666741E-31)
            java.lang.String r0 = "notification_received"
            X.0f9 r2 = r4.AEh(r2, r0, r1, r3)
            if (r6 == 0) goto L_0x0019
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r1 = r0 ^ 1
            java.lang.String r0 = "has_recipient_id"
            r2.ABR(r0, r1)
            if (r7 == 0) goto L_0x0029
            int r0 = r7.length()
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            r1 = r3 ^ 1
            java.lang.String r0 = "has_mi_trace_id"
            r2.ABR(r0, r1)
            if (r5 == 0) goto L_0x004d
            java.lang.String r1 = r5.A01
        L_0x0035:
            java.lang.String r0 = "push_channel_type"
            r2.ABQ(r0, r1)
            java.lang.String r0 = "usl_logged"
            r2.ABR(r0, r9)
            java.lang.String r0 = "qpl_logged"
            r2.ABR(r0, r10)
            java.lang.String r0 = "log_point"
            r2.ABQ(r0, r8)
            r2.report()
            return
        L_0x004d:
            r1 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZZ.A01(com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
