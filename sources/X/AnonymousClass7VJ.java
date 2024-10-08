package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7VJ  reason: invalid class name */
public final class AnonymousClass7VJ {
    public final UserSession A00;
    public final AnonymousClass0eK A01;
    public final AnonymousClass0eK A02;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (X.182.A06(X.0Tu.A05, r11.A00, 36328723175194165L) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0.BYB() == null) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ef A[EDGE_INSN: B:119:0x01ef->B:117:0x01ef ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010f A[LOOP:0: B:34:0x00a2->B:61:0x010f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r11 = this;
            X.0eK r3 = r11.A01
            java.lang.Object r0 = r3.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r0 = r0.Api()
            r10 = 0
            if (r0 == 0) goto L_0x0016
            X.N49 r0 = r0.BYB()
            r6 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            java.lang.Object r0 = r3.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r0 = r0.Api()
            if (r0 == 0) goto L_0x01ec
            X.914 r0 = r0.Amp()
            if (r0 == 0) goto L_0x01ec
            boolean r5 = r0.A00()
        L_0x002d:
            java.lang.Object r0 = r3.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r0 = r0.Api()
            if (r0 == 0) goto L_0x0053
            X.Ja7 r0 = r0.BKp()
            if (r0 == 0) goto L_0x0053
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0053
            com.instagram.common.session.UserSession r4 = r11.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328723175194165(0x8110c800003e35, double:3.037769047794888E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            java.lang.Object r0 = r3.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r0 = r0.Api()
            if (r0 == 0) goto L_0x01e9
            java.util.List r9 = r0.Bk5()
        L_0x0064:
            if (r6 != 0) goto L_0x0073
            if (r5 != 0) goto L_0x0073
            if (r1 != 0) goto L_0x0073
            if (r9 == 0) goto L_0x0072
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0073
        L_0x0072:
            return
        L_0x0073:
            X.0eK r1 = r11.A02
            java.lang.Object r0 = r1.get()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r6 = r0.A1a()
            java.lang.Object r0 = r1.get()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r5 = r0.A1b()
            java.lang.Object r0 = r3.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7ZY r4 = r0.BSN()
            boolean r0 = r4 instanceof X.AnonymousClass7ZX
            if (r0 == 0) goto L_0x0072
            X.7ZX r4 = (X.AnonymousClass7ZX) r4
            if (r4 == 0) goto L_0x0072
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 > r5) goto L_0x01ef
        L_0x00a2:
            X.7LQ r8 = X.AnonymousClass7ZX.A08(r4, r6)
            if (r8 == 0) goto L_0x0114
            X.7SD r0 = r8.A0G
            X.N49 r0 = r0.A0D
            if (r0 == 0) goto L_0x0114
            X.3su r2 = r8.A0e
            X.0qQ.A07(r2)
            java.lang.String r0 = r2.A0g()
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = ""
        L_0x00bb:
            X.2FW r1 = r4.BS5(r0)
            X.2FW r0 = X.2FW.A1t
            if (r1 != r0) goto L_0x0114
            com.google.common.collect.ImmutableList r1 = r2.A0H()
            r0 = 0
            if (r1 == 0) goto L_0x0114
            java.lang.Object r1 = X.00k.A0J(r1)
            X.3tC r1 = (X.C254873tC) r1
            if (r1 == 0) goto L_0x0114
            java.lang.String r1 = r1.A0u
            if (r1 == 0) goto L_0x0114
            android.net.Uri r1 = X.0cp.A03(r1)
            X.0qQ.A07(r1)
            java.util.List r7 = r1.getPathSegments()
            int r2 = r7.size()
            r1 = 3
            if (r2 != r1) goto L_0x0112
            r1 = 1
            java.lang.String r2 = X.AnonymousClass7TE.A19(r7, r1)
            java.lang.String r1 = "live"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0112
            r1 = 2
            java.lang.String r2 = X.AnonymousClass7TE.A19(r7, r1)
        L_0x00fa:
            X.7SD r1 = r8.A0G
            X.N49 r1 = r1.A0D
            if (r1 == 0) goto L_0x0102
            java.lang.String r0 = r1.A00
        L_0x0102:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0114
            X.KiK r0 = X.C62587KiK.LIVE
            r3.add(r0)
        L_0x010d:
            if (r6 == r5) goto L_0x01ef
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x0112:
            r2 = 0
            goto L_0x00fa
        L_0x0114:
            X.7LQ r1 = X.AnonymousClass7ZX.A08(r4, r6)
            if (r1 == 0) goto L_0x0149
            X.7SD r0 = r1.A0G
            X.914 r2 = r0.A0M
            if (r2 == 0) goto L_0x0149
            X.3su r0 = r1.A0e
            X.0qQ.A07(r0)
            com.google.common.collect.ImmutableList r0 = r0.A0H()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x0149
            java.lang.Long r0 = r0.A0m
            if (r0 == 0) goto L_0x0149
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r2.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0149
            X.KiK r0 = X.C62587KiK.DAILY_PROMPT
            r3.add(r0)
            goto L_0x010d
        L_0x0149:
            X.7LQ r1 = X.AnonymousClass7ZX.A08(r4, r6)
            if (r1 == 0) goto L_0x017e
            X.7SD r0 = r1.A0G
            X.Ja7 r2 = r0.A0E
            if (r2 == 0) goto L_0x017e
            X.3su r0 = r1.A0e
            X.0qQ.A07(r0)
            com.google.common.collect.ImmutableList r0 = r0.A0H()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x017e
            java.lang.Long r0 = r0.A0m
            if (r0 == 0) goto L_0x017e
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r2.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x017e
            X.KiK r0 = X.C62587KiK.SPOTLIGHT
            r3.add(r0)
            goto L_0x010d
        L_0x017e:
            if (r9 == 0) goto L_0x01e7
            java.lang.Object r0 = X.00k.A0J(r9)
            X.Jvt r0 = (X.C61055Jvt) r0
            if (r0 == 0) goto L_0x01e7
            java.lang.String r2 = r0.A01
        L_0x018a:
            X.7LQ r0 = X.AnonymousClass7ZX.A08(r4, r6)
            if (r0 == 0) goto L_0x010d
            if (r2 == 0) goto L_0x010d
            X.3su r7 = r0.A0e
            X.0qQ.A07(r7)
            java.lang.String r0 = r7.A0g()
            if (r0 != 0) goto L_0x019f
            java.lang.String r0 = ""
        L_0x019f:
            X.2FW r1 = r4.BS5(r0)
            X.2FW r0 = X.2FW.A0k
            if (r1 != r0) goto L_0x010d
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x010d
            com.google.common.collect.ImmutableList r0 = r0.A01()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = X.00k.A0J(r0)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x010d
            android.net.Uri r0 = X.0cp.A03(r0)
            X.0qQ.A07(r0)
            java.util.List r1 = r0.getPathSegments()
            r0 = 2
            java.lang.Object r0 = r1.get(r0)
            X.0qQ.A07(r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x010d
            X.KiK r0 = X.C62587KiK.POLL
            r3.add(r0)
            goto L_0x010d
        L_0x01e7:
            r2 = r10
            goto L_0x018a
        L_0x01e9:
            r9 = r10
            goto L_0x0064
        L_0x01ec:
            r5 = 0
            goto L_0x002d
        L_0x01ef:
            com.instagram.common.session.UserSession r0 = r11.A00
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.AY0 r0 = new X.AY0
            r0.<init>(r3)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VJ.A00():void");
    }

    public AnonymousClass7VJ(UserSession userSession, AnonymousClass0eK r2, AnonymousClass0eK r3) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }
}
