package X;

public final class TPJ implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public TPJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0134, code lost:
        r3 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x01c9;
                case 1: goto L_0x01a4;
                case 2: goto L_0x0195;
                case 3: goto L_0x0195;
                case 4: goto L_0x0195;
                case 5: goto L_0x013a;
                case 6: goto L_0x0104;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0005;
                case 9: goto L_0x008c;
                case 10: goto L_0x0085;
                case 11: goto L_0x0085;
                case 12: goto L_0x0005;
                case 13: goto L_0x008c;
                case 14: goto L_0x008c;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x0060;
                case 20: goto L_0x003a;
                case 21: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.6Tm r8 = (X.AnonymousClass6Tm) r8
            java.lang.Object r1 = r7.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = X.DbW.A0e(r8)
            r1.invoke(r0)
            r0 = 0
            return r0
        L_0x0014:
            java.lang.Object r1 = r7.A01
            X.3uA r1 = (X.C255463uA) r1
            java.lang.Object r3 = r7.A02
            X.3uA r3 = (X.C255463uA) r3
            X.Vi3 r8 = (X.C17912Vi3) r8
            r0 = 2
            X.0qQ.A0B(r8, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            java.lang.String r0 = "first"
            X.0sn r2 = X.0sn.A00
            r8.A00(r0, r2, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r3.getDescriptor()
            java.lang.String r0 = "second"
            r8.A00(r0, r2, r1)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003a:
            java.lang.Object r1 = r7.A01
            X.3uA r1 = (X.C255463uA) r1
            java.lang.Object r3 = r7.A02
            X.3uA r3 = (X.C255463uA) r3
            X.Vi3 r8 = (X.C17912Vi3) r8
            r0 = 2
            X.0qQ.A0B(r8, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            java.lang.String r0 = "key"
            X.0sn r2 = X.0sn.A00
            r8.A00(r0, r2, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r3.getDescriptor()
            java.lang.String r0 = "value"
            r8.A00(r0, r2, r1)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0060:
            java.lang.Object r0 = r7.A01
            X.S3Q r0 = (X.S3Q) r0
            java.lang.Object r3 = r7.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            if (r8 == 0) goto L_0x0072
            java.lang.String r2 = r8.getMessage()
            if (r2 != 0) goto L_0x0074
        L_0x0072:
            java.lang.String r2 = "EMPTY ERROR MESSAGE"
        L_0x0074:
            X.SHc r1 = r0.A03
            java.lang.String r0 = "settings_clear_error"
            X.C11242SHc.A00(r1, r0, r2)
            r0 = 2131954301(0x7f130a7d, float:1.9545097E38)
            X.C59689JTv.A07(r3, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0085:
            java.lang.Object r0 = r7.A02
            X.DbS.A1U(r0)
            r0 = 0
            return r0
        L_0x008c:
            X.6Tm r8 = (X.AnonymousClass6Tm) r8
            java.lang.Object r3 = r7.A02
            X.0sL r3 = (X.0sL) r3
            r0 = 0
            java.util.List r2 = r8.A00
            java.lang.Object r1 = r2.get(r0)
            r0 = 1
            java.lang.Object r0 = r2.get(r0)
            r3.invoke(r1, r0)
            r0 = 0
            return r0
        L_0x00a3:
            X.SUj r8 = (X.SUj) r8
            java.lang.Object r5 = r8.A01
            if (r5 == 0) goto L_0x0134
            X.RsQ r5 = (X.C10449RsQ) r5
            java.lang.Object r0 = r7.A01
            X.QnP r0 = (X.C8283QnP) r0
            X.2FO r4 = r0.A01
            if (r4 == 0) goto L_0x00fd
            java.security.cert.X509Certificate r0 = r5.A00
            if (r0 == 0) goto L_0x00f4
            java.util.Date r0 = r0.getNotAfter()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.getTime()
            long r2 = r2.getTime()
            long r0 = r0 - r2
            long r0 = r6.toSeconds(r0)
            java.lang.String r3 = java.lang.Long.toString(r0)
        L_0x00d3:
            java.lang.Object r0 = r7.A02
            X.Ry5 r0 = (X.C10784Ry5) r0
            java.util.Map r0 = r0.A00
            if (r0 != 0) goto L_0x00ef
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
        L_0x00df:
            java.lang.String r1 = "sec_type"
            java.lang.String r0 = "use_encryption_key"
            r2.put(r1, r0)
            java.lang.String r0 = "ptt_encryption_key_life_in_sec"
            r2.put(r0, r3)
            goto L_0x00f8
        L_0x00ef:
            java.util.HashMap r2 = X.Pxe.A19(r0)
            goto L_0x00df
        L_0x00f4:
            java.lang.String r3 = "na"
            goto L_0x00d3
        L_0x00f8:
            java.lang.String r0 = "client_load_paysec_success"
            r4.Cgl(r0, r2)     // Catch:{ Exception -> 0x00fd }
        L_0x00fd:
            java.util.List r0 = r5.A01
            java.lang.Object r3 = X.AnonymousClass7TE.A13(r0)
            goto L_0x0135
        L_0x0104:
            X.SUj r8 = (X.SUj) r8
            java.lang.Object r0 = r8.A01
            if (r0 == 0) goto L_0x0134
            X.34S r0 = (X.AnonymousClass34S) r0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0135
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)
        L_0x0118:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r7.A02
            X.1MD r0 = (X.1MD) r0
            java.lang.Object r0 = r0.apply(r1)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0118
            r3.add(r1)
            goto L_0x0118
        L_0x0134:
            r3 = 0
        L_0x0135:
            X.SUj r0 = X.SUj.A06(r8, r3)
            return r0
        L_0x013a:
            X.SUj r8 = (X.SUj) r8
            boolean r0 = X.SUj.A0S(r8)
            r1 = 0
            if (r0 == 0) goto L_0x014a
            java.lang.Throwable r0 = r8.A02
            X.SUj r0 = X.SUj.A0A(r1, r0)
            return r0
        L_0x014a:
            boolean r0 = X.SUj.A0V(r8)
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = X.SUj.A0D(r8)
            X.RsI r0 = (X.C10441RsI) r0
            X.S6b r5 = r0.A00
            java.lang.Object r0 = r7.A01
            X.SIS r0 = (X.SIS) r0
            X.SOC r0 = r0.A00
            X.SSZ r4 = r0.A01
            java.lang.Object r0 = r7.A02
            X.SFo r0 = (X.C11214SFo) r0
            java.util.Set r0 = r0.A09
            java.util.Iterator r3 = r0.iterator()
        L_0x016a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r2 = r3.next()
            X.SNj r2 = (X.C11330SNj) r2
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r5.A04
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x016a
            X.SNj r0 = r4.A05(r5, r2)
            X.SUj r0 = X.SUj.A09(r0)
            return r0
        L_0x0189:
            java.lang.String r0 = "Not found!"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0190:
            X.SUj r0 = X.SUj.A08(r1)
            return r0
        L_0x0195:
            X.RQD r8 = (X.RQD) r8
            java.lang.Object r0 = r7.A02
            X.QCx r0 = (X.C7432QCx) r0
            X.SSL r1 = r0.A01
            com.facebookpay.logging.FBPayLoggerData r0 = r0.A00
            X.2gB r0 = r1.A04(r8, r0)
            return r0
        L_0x01a4:
            X.RQq r8 = (X.RQq) r8
            java.util.List r2 = r8.A07
            if (r2 == 0) goto L_0x01c7
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01c7
            java.lang.Object r0 = r7.A02
            android.util.Pair r0 = (android.util.Pair) r0
            int r1 = X.Pxf.A04(r0)
            int r0 = r2.size()
            if (r1 < r0) goto L_0x01c2
            int r1 = X.C51966G9m.A06(r2)
        L_0x01c2:
            java.lang.Object r0 = r2.get(r1)
            return r0
        L_0x01c7:
            r0 = 0
            return r0
        L_0x01c9:
            java.lang.Object r3 = r7.A01
            X.STY r3 = (X.STY) r3
            java.lang.Object r1 = r7.A02
            com.fbpay.w3c.CardDetails r1 = (com.fbpay.w3c.CardDetails) r1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Integer r0 = r1.A03
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.Integer r0 = r1.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = ""
            com.fbpay.w3c.CardDetails r2 = X.C11391SRf.A01(r8, r0, r0, r2, r1)
            X.4gR r0 = r3.A0T
            X.RzL r0 = r0.A00
            X.QP6 r1 = r0.A05
            X.QOp r0 = X.RUT.A00(r2)
            r1.A01 = r0
            X.STY.A03(r3, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TPJ.invoke(java.lang.Object):java.lang.Object");
    }
}
