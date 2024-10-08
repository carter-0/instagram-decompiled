package X;

/* renamed from: X.Smo  reason: case insensitive filesystem */
public final class C12094Smo implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12094Smo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r5 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r8 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r5 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r1 = new X.ONW((java.lang.String) null, new X.C70831ONd(r7, r8, r9, r10, r11), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r10 = r5.getCoercedIntField(13, "carrier_id");
        r9 = r5.getOptionalStringField(18, "usage");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r9 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        r11 = r5.getCoercedBooleanField(19, "is_opted_out");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r5 == null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0071;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A01
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            r3 = 0
            if (r13 == 0) goto L_0x006f
            X.3lr r5 = X.C41845B3m.A0U(r13)
            if (r5 == 0) goto L_0x006f
            java.lang.Class<X.QWu> r4 = X.C7783QWu.class
            java.lang.String r1 = "xig_zero_headers_ping_params_v2(is_on_wifi:$is_on_wifi,logged_out_id:$logged_out_id,network_interface:$network_interface,old_cursor:$old_cursor,reason:$reason)"
            r0 = 1152255623(0x44ae0687, float:1392.204)
            X.3lr r5 = r5.A03(r4, r1, r0)
            r4 = 1
            if (r5 != 0) goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x002f
            java.lang.String r0 = "uri"
            java.lang.String r7 = r5.A0C(r0)
            if (r7 != 0) goto L_0x0032
        L_0x002f:
            r7 = r6
            if (r5 == 0) goto L_0x003c
        L_0x0032:
            r1 = 14
            java.lang.String r0 = "headwind_program"
            java.lang.String r8 = r5.getOptionalStringField(r1, r0)
            if (r8 != 0) goto L_0x0052
        L_0x003c:
            r8 = r6
            if (r5 != 0) goto L_0x0052
            r10 = 0
        L_0x0040:
            r9 = r6
            if (r5 != 0) goto L_0x0066
            r11 = 0
        L_0x0044:
            X.ONd r6 = new X.ONd
            r6.<init>(r7, r8, r9, r10, r11)
            X.ONW r1 = new X.ONW
            r1.<init>(r3, r6, r4)
        L_0x004e:
            r2.resumeWith(r1)
        L_0x0051:
            return
        L_0x0052:
            r1 = 13
            java.lang.String r0 = "carrier_id"
            int r10 = r5.getCoercedIntField(r1, r0)
            r1 = 18
            java.lang.String r0 = "usage"
            java.lang.String r9 = r5.getOptionalStringField(r1, r0)
            if (r9 != 0) goto L_0x0066
            goto L_0x0040
        L_0x0066:
            r1 = 19
            java.lang.String r0 = "is_opted_out"
            boolean r11 = r5.getCoercedBooleanField(r1, r0)
            goto L_0x0044
        L_0x006f:
            r5 = r3
            goto L_0x0021
        L_0x0071:
            r3 = 0
            if (r13 == 0) goto L_0x0091
            java.lang.Object r2 = r13.Bny()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x0091
            java.lang.Class<X.QNn> r1 = X.C7597QNn.class
            java.lang.String r0 = "product_ar_metadata"
            X.3FZ r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x0091
            java.lang.Object r2 = r12.A01
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            X.UHU r1 = new X.UHU
            r1.<init>(r0)
            goto L_0x004e
        L_0x0091:
            java.lang.Object r2 = r12.A01
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            X.UHV r1 = new X.UHV
            r1.<init>(r3)
            goto L_0x004e
        L_0x009b:
            if (r13 == 0) goto L_0x0105
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x0105
            java.lang.Class<X.BSS> r2 = X.BSS.class
            java.lang.String r1 = "xdt_autodub_create(data:$data)"
            r0 = -866135950(0xffffffffcc5fd072, float:-5.867156E7)
            X.3lr r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x0105
            r1 = 1
            java.lang.String r0 = "xpv_asset_id"
            long r0 = r2.getCoercedTimeField(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x00bd:
            java.lang.Object r4 = r12.A02
            X.QGH r4 = (X.QGH) r4
            X.S6r r3 = r4.A02
            if (r3 == 0) goto L_0x00d6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.QGF r2 = new X.QGF
            r2.<init>(r0)
            java.lang.String r1 = "xpv_asset_id"
            X.S1Z r0 = r3.A02
            r0.A00(r2, r1)
        L_0x00d6:
            X.S6r r2 = r4.A02
            if (r2 == 0) goto L_0x00e2
            java.lang.String r1 = "upload_edit_finish"
            X.TTi r0 = X.TTi.A00
            r2.A02(r1, r0)
        L_0x00e2:
            X.S6r r2 = r4.A02
            if (r2 == 0) goto L_0x00f9
            java.util.concurrent.ExecutorService r1 = r2.A03
            X.TAt r0 = new X.TAt
            r0.<init>(r2)
            r1.execute(r0)
            X.S1Z r2 = r2.A02
            X.4Cq r1 = r2.A02
            r0 = 16
            X.Pxi.A1J(r2, r1, r0)
        L_0x00f9:
            java.lang.Object r0 = r12.A01
            X.S2v r0 = (X.C10963S2v) r0
            X.0sP r0 = r0.A02
            if (r0 == 0) goto L_0x0051
            r0.invoke(r13)
            return
        L_0x0105:
            r0 = 0
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12094Smo.invoke(X.3JD):void");
    }
}
