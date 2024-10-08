package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IbE  reason: case insensitive filesystem */
public final class C57470IbE implements C230332pS {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final 1Ua A02;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AGb(X.C254213s7 r12, java.lang.Object r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r11 = this;
            X.1Xl r13 = (X.1Xl) r13
            X.3W1 r14 = (X.AnonymousClass3W1) r14
            r2 = 0
            boolean r9 = X.C51973G9u.A1b(r13, r14, r12)
            X.1Xj r7 = r13.BPf()
            X.1Ua r1 = r11.A02
            com.instagram.common.session.UserSession r8 = r11.A00
            java.lang.String r0 = r7.A36(r8, r9)
            boolean r0 = r1.A02(r0)
            r10 = r0 ^ 1
            X.0kM r1 = new X.0kM
            r1.<init>(r8)
            X.4DU r6 = r11.A01
            r1.A00 = r6
            X.0kJ r0 = X.0kJ.A03
            r1.A01(r0)
            X.0wc r1 = r1.A00()
            java.lang.String r0 = "barcelona_collapsed_post_vpvd_imp"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r5.isSampled()
            r4 = 0
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r7.getId()
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = X.1Xv.A06(r0)
            long r0 = java.lang.Long.parseLong(r0)
        L_0x0048:
            X.C51970G9q.A18(r5, r0)
            X.C51969G9p.A19(r5, r6)
            if (r15 != 0) goto L_0x0052
            java.lang.String r15 = ""
        L_0x0052:
            X.C51965G9l.A1K(r5, r15)
            r1 = r4
            java.lang.String r0 = "barcelona_source_reply_id"
            r5.A9F(r0, r4)
            java.lang.String r0 = r14.A1B
            if (r0 != 0) goto L_0x006d
            X.1Xy r0 = r7.A0C
            X.DUd r0 = r0.Bmy()
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r0.Bmx()
            if (r0 == 0) goto L_0x0075
        L_0x006d:
            java.lang.String r0 = X.1Xv.A06(r0)
            java.lang.Long r1 = X.C51971G9r.A0n(r2, r0)
        L_0x0075:
            java.lang.String r0 = "repost_media_id"
            r5.A9F(r0, r1)
            java.lang.Integer r0 = r14.A14
            r3 = -1
            if (r0 == 0) goto L_0x0101
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x0101
            if (r0 == r2) goto L_0x00fe
            if (r0 != r9) goto L_0x010c
            X.HOD r1 = X.HOD.CHILD
        L_0x008b:
            java.lang.String r0 = "collapsed_post_type"
            r5.A8M(r1, r0)
            X.Gjf r1 = new X.Gjf
            r1.<init>()
            java.lang.String r0 = "click_id"
            r1.A06(r0, r4)
            X.C51976G9y.A0V(r5, r1)
            boolean r0 = r14.A0p()
            if (r0 == 0) goto L_0x00fc
            int r0 = r14.getPosition()
            if (r0 == r3) goto L_0x00fc
            long r0 = (long) r0
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            if (r3 == 0) goto L_0x00fc
            int r3 = (int) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L_0x00b5:
            java.lang.String r0 = "m_ix"
            r5.A8k(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "client_sub_impression"
            r5.A7p(r0, r1)
            java.util.List r0 = r7.A0e
            java.lang.String r1 = X.C243413Yr.A00(r0)
            java.lang.String r0 = "delivery_flags"
            r5.AAJ(r0, r1)
            java.lang.String r1 = X.C51965G9l.A0t(r7)
            java.lang.String r0 = "inventory_source"
            r5.AAJ(r0, r1)
            java.lang.String r0 = r7.getId()
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = X.1Xv.A04(r0)
            java.lang.Long r0 = X.C51971G9r.A0n(r2, r0)
            X.C51965G9l.A1H(r5, r0)
            X.C51972G9s.A14(r5, r7)
            long r2 = r12.A05
            double r0 = (double) r2
            X.C51970G9q.A16(r5, r0)
            java.lang.String r0 = X.C254443sU.A0E(r8, r7, r6)
            X.C51965G9l.A1L(r5, r0)
            r5.Cgf()
        L_0x00fb:
            return r4
        L_0x00fc:
            r1 = r4
            goto L_0x00b5
        L_0x00fe:
            X.HOD r1 = X.HOD.PARENT
            goto L_0x008b
        L_0x0101:
            r1 = r4
            goto L_0x008b
        L_0x0103:
            r0 = 0
            goto L_0x0048
        L_0x0107:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x010c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57470IbE.AGb(X.3s7, java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ 0xI AM0(Object obj) {
        0xI r2 = (0xI) obj;
        0qQ.A0B(r2, 0);
        return r2;
    }

    public C57470IbE(UserSession userSession, AnonymousClass4DU r2, 1Ua r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = userSession;
    }
}
