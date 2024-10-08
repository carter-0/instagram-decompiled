package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GEm  reason: case insensitive filesystem */
public final class C52092GEm extends C247303g7 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r5.getInt("clips_mute_button_text_shown_count", 0) >= 3) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f3, code lost:
        if (r2 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f8, code lost:
        if (r2 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        if (r2 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0102, code lost:
        if (r4 != null) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52093GEn A05(X.C267324bN r25, X.AnonymousClass3W1 r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            com.instagram.common.session.UserSession r0 = r0.A01
            r3 = r25
            boolean r10 = X.AnonymousClass3ZJ.A09(r3, r0)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36326077475468780(0x810e60000235ec, double:3.036095896635177E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            if (r1 == 0) goto L_0x0111
            if (r10 == 0) goto L_0x0111
            r1 = 36326077475534317(0x810e60000335ed, double:3.036095896676623E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            if (r1 == 0) goto L_0x010d
            java.lang.Integer r8 = X.AnonymousClass05K.A00
        L_0x0026:
            X.1Av r7 = X.1Au.A00(r0)
            r1 = 36326077475403243(0x810e60000135eb, double:3.036095896593731E-306)
            boolean r1 = X.182.A06(r4, r0, r1)
            if (r1 == 0) goto L_0x004a
            X.0xa r5 = r7.A01
            java.lang.String r1 = "clips_mute_button_text_clicked"
            r2 = 0
            boolean r1 = r5.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = "clips_mute_button_text_shown_count"
            int r2 = r5.getInt(r1, r2)
            r1 = 3
            r11 = 1
            if (r2 < r1) goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            r1 = 36326077475599854(0x810e60000435ee, double:3.0360958967180686E-306)
            boolean r12 = X.182.A06(r4, r0, r1)
            X.1Xj r4 = r3.A02
            if (r4 == 0) goto L_0x0109
            java.lang.String r2 = r4.A2n()
            if (r2 == 0) goto L_0x0109
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r2)
            if (r1 == 0) goto L_0x0109
            long r18 = r1.longValue()
        L_0x006a:
            r20 = 0
            if (r4 == 0) goto L_0x0100
            X.1Xy r1 = r4.A0C
            X.DUF r1 = r1.Anr()
            if (r1 == 0) goto L_0x0100
            java.lang.String r2 = r1.getAttributionAppId()
            if (r2 == 0) goto L_0x0100
            r1 = 10
            java.lang.Long r15 = X.00y.A0n(r1, r2)
        L_0x0082:
            com.instagram.user.model.User r1 = r4.A2A(r0)
            if (r1 == 0) goto L_0x0106
            java.lang.String r2 = r1.getId()
            r1 = 10
            java.lang.Long r16 = X.00y.A0n(r1, r2)
        L_0x0092:
            X.GJB r14 = X.C52086GEg.A00(r3)
            r17 = 1
            X.GEh r4 = new X.GEh
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            X.1Xj r2 = r3.A02
            if (r2 == 0) goto L_0x00f1
            java.lang.String r3 = r2.A2n()
            if (r3 == 0) goto L_0x00f1
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r3)
            if (r1 == 0) goto L_0x00f1
            long r22 = r1.longValue()
        L_0x00b4:
            X.1Xy r1 = r2.A0C
            X.DUF r1 = r1.Anr()
            if (r1 == 0) goto L_0x00f6
            java.lang.String r3 = r1.getAttributionAppId()
            if (r3 == 0) goto L_0x00f6
            r1 = 10
            java.lang.Long r18 = X.00y.A0n(r1, r3)
        L_0x00c8:
            com.instagram.user.model.User r0 = r2.A2A(r0)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = r0.getId()
            r0 = 10
            java.lang.Long r19 = X.00y.A0n(r0, r1)
        L_0x00d8:
            X.1Xy r0 = r2.A0C
            java.lang.String r20 = r0.getLoggingInfoToken()
        L_0x00de:
            r21 = 5
            X.GEi r5 = new X.GEi
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22)
            X.GEn r3 = new X.GEn
            r6 = r26
            r9 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x00f1:
            r22 = 0
            if (r2 == 0) goto L_0x00f6
            goto L_0x00b4
        L_0x00f6:
            r18 = r20
            if (r2 == 0) goto L_0x00fb
            goto L_0x00c8
        L_0x00fb:
            r19 = r20
            if (r2 == 0) goto L_0x00de
            goto L_0x00d8
        L_0x0100:
            r15 = r20
            if (r4 == 0) goto L_0x0106
            goto L_0x0082
        L_0x0106:
            r16 = r20
            goto L_0x0092
        L_0x0109:
            r18 = 0
            goto L_0x006a
        L_0x010d:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x0026
        L_0x0111:
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52092GEm.A05(X.4bN, X.3W1, int):X.GEn");
    }

    public C52092GEm(AnonymousClass0iw r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
