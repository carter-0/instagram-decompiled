package X;

/* renamed from: X.Oq8  reason: case insensitive filesystem */
public final class C71746Oq8 implements C74436Pur {
    public final 1Ln A00;

    public final String BdN() {
        return "client_received_logging";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r0.intValue() >= 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E4V(X.N31 r8) {
        /*
            r7 = this;
            r1 = 0
            X.0qQ.A0B(r8, r1)
            X.Ptr r0 = r8.A06
            boolean r0 = r0 instanceof X.N4w
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "logging ByteArray not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            X.0qQ.A0B(r0, r1)
            X.0eQ r8 = new X.0eQ
            r8.<init>(r0)
            return r8
        L_0x0019:
            com.facebook.pushlite.model.PushInfraMetaData r4 = r8.A04
            java.lang.Integer r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0027
            int r0 = r0.intValue()
            r1 = 1
            if (r0 < 0) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            java.lang.String r0 = r4.A02
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = r4.A01
            boolean r6 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "priority_lowered"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "push_lite_logger"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "isHPKEEncrypted"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "isZSTDCompressed"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r5, r3, r2)
            java.util.LinkedHashMap r5 = X.0Yt.A06(r0)
            X.3mC r3 = X.C250863mB.A03
            X.3u9 r2 = X.C255453u9.A01
            X.40E r1 = X.AnonymousClass40E.A00
            X.3zM r0 = new X.3zM
            r0.<init>(r2, r1)
            java.lang.String r3 = r3.A02(r5, r0)
            java.lang.Long r2 = r4.A00
            if (r2 == 0) goto L_0x007a
            X.1Ln r1 = r7.A00
            java.lang.String r0 = "push_usecase_id"
            r1.A0Q(r0, r2)
        L_0x007a:
            java.lang.String r2 = r4.A07
            if (r2 == 0) goto L_0x0085
            X.1Ln r1 = r7.A00
            java.lang.String r0 = "pi_nid"
            r1.A0R(r0, r2)
        L_0x0085:
            java.lang.String r2 = r4.A06
            if (r2 == 0) goto L_0x0090
            X.1Ln r1 = r7.A00
            java.lang.String r0 = "notif_id"
            r1.A0R(r0, r2)
        L_0x0090:
            X.1Ln r2 = r7.A00
            java.lang.String r1 = "notif_received_push"
            java.lang.String r0 = "notif_event"
            r2.A0R(r0, r1)
            java.lang.String r1 = r8.A07
            java.lang.String r0 = "channel"
            r2.A0R(r0, r1)
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "notif_event_log_flag"
            r2.A0R(r0, r1)
            java.lang.String r0 = "extra_info"
            r2.A0R(r0, r3)
            r2.Cgf()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71746Oq8.E4V(X.N31):java.lang.Object");
    }

    public final boolean Esm(N31 n31) {
        String str;
        0qQ.A0B(n31, 0);
        if (!DbT.A1Y(this.A00) || (str = n31.A04.A05) == null || str.equals("0")) {
            return false;
        }
        return true;
    }

    public C71746Oq8(C58840Ae r2) {
        this.A00 = 1Ln.A0K(r2);
    }
}
