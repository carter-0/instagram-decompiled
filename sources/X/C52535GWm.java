package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GWm  reason: case insensitive filesystem */
public final class C52535GWm implements C250603lj {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass2pP A03;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r14, X.C252093oY r15) {
        /*
            r13 = this;
            r6 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r6, r14, r15)
            java.lang.Object r5 = r14.A03
            X.5qt r5 = (X.C296935qt) r5
            boolean r0 = r5 instanceof X.C52435GSn
            if (r0 == 0) goto L_0x00f1
            X.2pP r1 = r13.A03
            X.GSn r5 = (X.C52435GSn) r5
            java.lang.String r0 = r5.getKey()
            X.3s7 r4 = r1.A00(r0)
            float r2 = r15.CFe(r14)
            double r0 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f4
            X.3W1 r3 = r5.A00
            r3.A0l(r6)
        L_0x0029:
            r3.A0g(r6)
        L_0x002c:
            int r0 = X.C51968G9o.A0A(r14, r15)
            if (r0 == r6) goto L_0x010e
            if (r0 == r7) goto L_0x010e
            r4.A04(r15)
            long r1 = r4.A05
            r7 = 250(0xfa, double:1.235E-321)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00eb
            com.instagram.common.session.UserSession r11 = r13.A01
            X.4DU r9 = r13.A02
            X.0wc r1 = r13.A00
            java.lang.String r0 = "instagram_ad_vpvd_imp"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            X.1Xj r7 = r5.BPf()
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x00eb
            java.lang.String r1 = r7.getId()
            if (r1 == 0) goto L_0x0109
            java.lang.String r0 = "m_pk"
            X.C51974G9v.A0p(r8, r7, r0, r1)
            long r0 = r4.A04
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "max_duration_ms"
            r8.A9F(r0, r1)
            long r2 = r4.A05
            double r0 = (double) r2
            X.C51970G9q.A16(r8, r0)
            java.lang.String r0 = X.C231122qu.A0F(r11, r7)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = ""
        L_0x0079:
            X.C51965G9l.A1L(r8, r0)
            java.lang.String r0 = X.DbT.A0x(r7)
            java.lang.String r10 = "ranking_info_token"
            r8.AAJ(r10, r0)
            java.lang.String r0 = X.C231122qu.A07(r11, r7)
            java.lang.Long r0 = X.C51972G9s.A0j(r0)
            X.C51965G9l.A1D(r8, r0)
            java.util.List r0 = r7.A0e
            java.lang.String r1 = X.C243413Yr.A00(r0)
            java.lang.String r0 = "delivery_flags"
            r8.AAJ(r0, r1)
            java.lang.String r1 = r7.A0R
            java.lang.String r0 = "feed_request_id"
            r8.AAJ(r0, r1)
            r0 = 24
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "imp_logger_ver"
            r8.A9F(r0, r1)
            java.lang.String r1 = X.C51965G9l.A0t(r7)
            java.lang.String r0 = "inventory_source"
            r8.AAJ(r0, r1)
            long r2 = r4.A02
            r11 = 500(0x1f4, double:2.47E-321)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f2
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x00c3:
            java.lang.String r0 = "legacy_duration_ms"
            r8.A8D(r0, r1)
            java.lang.String r0 = X.C254443sU.A0I(r7, r6)
            java.lang.Long r1 = X.C51972G9s.A0i(r0)
            java.lang.String r0 = "main_feed_carousel_starting_media_id"
            r8.A9F(r0, r1)
            X.C51972G9s.A15(r8, r7)
            java.lang.String r0 = X.DbT.A0x(r7)
            r8.AAJ(r10, r0)
            java.lang.String r1 = r9.getModuleName()
            java.lang.String r0 = "source_of_action"
            r8.AAJ(r0, r1)
            X.DbX.A1L(r8)
        L_0x00eb:
            r5.A05()
            r4.A02()
        L_0x00f1:
            return
        L_0x00f2:
            r1 = 0
            goto L_0x00c3
        L_0x00f4:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            X.3W1 r3 = r5.A00
            if (r0 >= 0) goto L_0x0101
            r3.A0l(r7)
            goto L_0x0029
        L_0x0101:
            r3.A0l(r7)
            r3.A0g(r7)
            goto L_0x002c
        L_0x0109:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x010e:
            boolean r0 = r3.A29
            if (r0 != 0) goto L_0x012f
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0133
            r5.A01 = r7
            X.5FA r2 = X.AnonymousClass5F9.A00()
            long r0 = r5.A03
            r2.A01(r3, r0)
            android.os.Handler r3 = r5.A04
            java.lang.Runnable r2 = r5.A05
            r3.postDelayed(r2, r0)
        L_0x012f:
            r4.A03(r14, r15)
            return
        L_0x0133:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x012f
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x012f
            r5.A05()
            goto L_0x012f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52535GWm.ATF(X.30Y, X.3oY):void");
    }

    public C52535GWm(0wc r1, UserSession userSession, AnonymousClass4DU r3, AnonymousClass2pP r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
