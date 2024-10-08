package X;

/* renamed from: X.PeF  reason: case insensitive filesystem */
public final class C73524PeF implements 02o {
    public final /* synthetic */ C62032KWk A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0rm A05;

    public C73524PeF(C62032KWk kWk, String str, String str2, String str3, String str4, 0rm r6) {
        this.A00 = kWk;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = r6;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, X.Npi] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r8.length() == 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r5.length() == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r9.length() == 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r0 = r18
            X.KWk r6 = r0.A00
            java.lang.String r9 = r0.A01
            java.lang.String r8 = r0.A04
            java.lang.String r5 = r0.A02
            java.lang.String r4 = r0.A03
            X.0rm r11 = r0.A05
            r7 = r19
            boolean r0 = r7 instanceof X.C59702JUj
            if (r0 != 0) goto L_0x00c5
            r10 = 1
            boolean r17 = X.C59678JTj.A01(r10, r7)
            if (r17 == 0) goto L_0x00c8
            com.instagram.common.session.UserSession r3 = r6.A01
            java.lang.Integer r0 = r6.A03
            java.lang.String r12 = X.C69971NvB.A00(r0)
            r14 = 0
            if (r9 == 0) goto L_0x002d
            int r1 = r9.length()
            r0 = 0
            if (r1 != 0) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            r13 = r0 ^ 1
            if (r8 == 0) goto L_0x0039
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            r16 = r0 ^ 1
            if (r5 == 0) goto L_0x0045
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            r2 = r0 ^ 1
            if (r4 == 0) goto L_0x0050
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r14 = 1
        L_0x0051:
            r15 = r14 ^ 1
            java.lang.String r0 = "entry_point"
            X.0eP r14 = X.AnonymousClass7TE.A1L(r0, r12)
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "has_address"
            X.0eP r13 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "has_phone_number"
            X.0eP r12 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "has_email"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "has_additional_info"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eP[] r0 = new X.0eP[]{r14, r13, r12, r2, r0}
            java.util.LinkedHashMap r2 = X.0Yt.A06(r0)
            java.lang.String r1 = "customer_details_page_info_save_success"
            java.lang.String r0 = ""
            X.OZ3.A00(r3, r1, r0, r2)
            X.05G r3 = r6.A05
            java.lang.Object r0 = r11.A00
            X.Npi r0 = (X.C69660Npi) r0
            java.lang.String r2 = r0.A04
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            X.0qQ.A0B(r2, r10)
            X.Npi r1 = new X.Npi
            r1.<init>()
            r1.A04 = r2
            r1.A00 = r0
            r1.A02 = r9
            r1.A05 = r8
            r1.A03 = r5
            r1.A01 = r4
            X.NW7 r0 = new X.NW7
            r0.<init>(r1)
            r3.Epw(r0)
        L_0x00b6:
            if (r17 != 0) goto L_0x00c5
            boolean r0 = X.C59678JTj.A02(r7)
            if (r0 == 0) goto L_0x00d3
            X.05G r1 = r6.A05
            X.NW8 r0 = X.NW8.A00
            r1.Epw(r0)
        L_0x00c5:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00c8:
            boolean r0 = X.C59678JTj.A02(r7)
            if (r0 != 0) goto L_0x00b6
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73524PeF.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
