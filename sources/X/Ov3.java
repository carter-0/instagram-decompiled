package X;

public final class Ov3 implements AnonymousClass68Z {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Ov3(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0088, code lost:
        return X.1aU.A07(new X.Ox1(r5, r3, r4, r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0120, code lost:
        return r3.A05(r0, r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x010b;
                case 1: goto L_0x00f9;
                case 2: goto L_0x0089;
                case 3: goto L_0x0072;
                case 4: goto L_0x0064;
                case 5: goto L_0x0058;
                case 6: goto L_0x0016;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r15.A01
            X.OWT r1 = (X.OWT) r1
            java.lang.String r0 = r15.A02
            X.N2L r0 = r1.A00(r0)
            X.3xP r0 = X.C257443xP.A00(r0)
            return r0
        L_0x0016:
            java.lang.Object r2 = r15.A01
            X.6Ea r2 = (X.C304566Ea) r2
            java.lang.String r8 = r15.A02
            java.lang.String r10 = "unified_identity_settings_fragment"
            X.PrM r3 = (X.C74233PrM) r3
            boolean r0 = r3 instanceof X.C72176Oxl
            if (r0 == 0) goto L_0x0029
            X.1aU r0 = X.C72176Oxl.A00(r3)
            return r0
        L_0x0029:
            java.lang.Object r0 = X.C66996MgU.A02(r3)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            long r12 = r0.A00
            r4 = 0
            java.lang.Long r6 = X.AnonymousClass4KK.A01(r0)
            r14 = 0
            X.2FW r3 = X.2FW.A1g
            java.lang.String r11 = X.DbS.A0k()
            X.1aU r0 = r2.A00
            X.OvT r1 = new X.OvT
            r5 = r4
            r7 = r4
            r9 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)
            X.1aU r1 = X.C66581MXm.A0M(r1, r0)
            java.lang.String r0 = "rxmailbox_send_secure_text_message"
            X.1aU r1 = X.C66581MXm.A0O(r1, r0)
            r0 = 18
            X.1aU r0 = X.C72118Owd.A00(r1, r0)
            return r0
        L_0x0058:
            java.lang.Object r5 = r15.A01
            java.lang.String r4 = r15.A02
            java.lang.String r0 = "rxmailbox_save_draft_message"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r1 = 2
            goto L_0x007f
        L_0x0064:
            java.lang.Object r5 = r15.A01
            java.lang.String r4 = r15.A02
            X.MYb r0 = X.MYb.A0M
            java.lang.String r0 = "deactivate_thread_session"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r1 = 1
            goto L_0x007f
        L_0x0072:
            java.lang.Object r5 = r15.A01
            java.lang.String r4 = r15.A02
            X.MYb r0 = X.MYb.A0M
            java.lang.String r0 = "activate_thread_session"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r1 = 0
        L_0x007f:
            X.Ox1 r0 = new X.Ox1
            r0.<init>(r5, r3, r4, r1)
            X.1aU r0 = X.1aU.A07(r0, r2)
            return r0
        L_0x0089:
            java.lang.Object r1 = r15.A01
            X.MYb r1 = (X.MYb) r1
            java.lang.String r4 = r15.A02
            X.OGh r3 = (X.C70686OGh) r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00eb
            android.net.Uri r0 = r3.A00
            if (r0 == 0) goto L_0x00eb
            java.lang.String r3 = r0.toString()
            if (r3 == 0) goto L_0x00eb
            X.MYd r7 = r1.A0G
            r6 = 0
            r5 = 1
            java.lang.String r1 = "/"
            X.11S r0 = new X.11S
            r0.<init>(r1)
            java.util.List r0 = r0.A03(r3)
            java.lang.String[] r2 = X.DbU.A1b(r0, r6)
            int r1 = r2.length
            r0 = 2
            if (r1 <= r0) goto L_0x00e1
            int r1 = r1 - r0
            r1 = r2[r1]
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            if (r1 == 0) goto L_0x00e1
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00e1
            java.util.HashMap r1 = r7.A00
            java.lang.String r0 = X.OXF.A01(r4)
            X.C66580MXl.A1S(r1, r0)
            java.util.HashMap r2 = r7.A01
            r0 = 12
            X.Jvk r1 = new X.Jvk
            r1.<init>((java.lang.String) r3, (int) r0, (boolean) r5)
        L_0x00d9:
            r2.put(r4, r1)
            X.1aU r0 = X.1aU.A09(r3)
            return r0
        L_0x00e1:
            java.util.HashMap r2 = r7.A01
            r0 = 12
            X.Jvk r1 = new X.Jvk
            r1.<init>((java.lang.String) r3, (int) r0, (boolean) r6)
            goto L_0x00d9
        L_0x00eb:
            X.MYd r0 = r1.A0G
            java.util.HashMap r0 = r0.A01
            r0.remove(r4)
            java.lang.String r0 = ""
            X.1aU r0 = X.1aU.A09(r0)
            return r0
        L_0x00f9:
            X.OOB r3 = (X.OOB) r3
            java.lang.Object r0 = r15.A01
            X.NoK r0 = (X.C69576NoK) r0
            X.NTv r0 = (X.C68709NTv) r0
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r15.A02
            X.0qQ.A0A(r1)
            X.Njv r0 = X.C69356Njv.A05
            goto L_0x011c
        L_0x010b:
            X.OOB r3 = (X.OOB) r3
            java.lang.Object r0 = r15.A01
            X.NoF r0 = (X.C69571NoF) r0
            X.NTc r0 = (X.C68690NTc) r0
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r15.A02
            X.0qQ.A0A(r1)
            X.Njv r0 = X.C69356Njv.A08
        L_0x011c:
            X.ObS r0 = r3.A05(r0, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ov3.apply(java.lang.Object):java.lang.Object");
    }
}
