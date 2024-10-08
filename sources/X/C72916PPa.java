package X;

/* renamed from: X.PPa  reason: case insensitive filesystem */
public final class C72916PPa implements C337237fw {
    public final /* synthetic */ OHS A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r0.length() == 0) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r22) {
        /*
            r21 = this;
            r12 = 0
            r1 = r22
            X.0qQ.A0B(r1, r12)
            r0 = r21
            X.OHS r3 = r0.A00
            X.7fy r6 = r3.A03
            java.lang.Object r0 = r6.Bo1()
            X.MmB r0 = (X.C67335MmB) r0
            java.util.List r7 = r0.A00
            java.lang.String r0 = r6.BiY()
            if (r0 == 0) goto L_0x0020
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003e
        L_0x0020:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x003e
            com.instagram.common.session.UserSession r2 = r3.A01
            X.0Tu r0 = X.0Tu.A05
            r4 = 36311904083247919(0x81017c0000032f, double:3.027132586323035E-306)
            boolean r0 = X.182.A06(r0, r2, r4)
            if (r0 == 0) goto L_0x003e
            X.0nO r1 = r3.A02
            X.NRU r0 = new X.NRU
            r0.<init>(r3)
            r1.ATE(r0)
            return
        L_0x003e:
            r3.A00 = r12
            java.lang.String r0 = r6.BiY()
            if (r0 == 0) goto L_0x004c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0111
        L_0x004c:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0111
            X.0eM r0 = r3.A06
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            X.Oyf r2 = (X.C72214Oyf) r2
            com.instagram.common.session.UserSession r4 = r3.A01
            X.2Dm r6 = X.1bJ.A00(r4)
            monitor-enter(r2)
            boolean r0 = r2.A02     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r2.A03     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r2.A04     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x008d
            r0 = 1
            r2.A04 = r0     // Catch:{ all -> 0x00be }
            com.instagram.common.session.UserSession r7 = r2.A05     // Catch:{ all -> 0x00be }
            r8 = 0
            java.lang.String r9 = "reshare"
            r10 = r8
            r11 = r8
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r0
            X.1OC r7 = X.C49755F5g.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00be }
            X.NHs r0 = new X.NHs     // Catch:{ all -> 0x00be }
            r0.<init>(r2)     // Catch:{ all -> 0x00be }
            r7.A00 = r0     // Catch:{ all -> 0x00be }
            r5 = 124(0x7c, float:1.74E-43)
            r0 = 3
            X.1ES.A05(r7, r5, r0, r12, r12)     // Catch:{ all -> 0x00be }
        L_0x008d:
            android.content.Context r14 = r2.A00     // Catch:{ all -> 0x010e }
            com.instagram.common.session.UserSession r15 = r2.A05     // Catch:{ all -> 0x010e }
            java.math.BigInteger r0 = X.C46503Dg6.A00     // Catch:{ all -> 0x010e }
            r5 = 12
            X.Pd1 r0 = new X.Pd1     // Catch:{ all -> 0x010e }
            r0.<init>(r6, r5)     // Catch:{ all -> 0x010e }
            java.lang.String r16 = "coefficient_direct_recipients_ranking_variant_2"
            r18 = 1
            X.Dg5 r13 = new X.Dg5     // Catch:{ all -> 0x010e }
            r19 = r18
            r20 = r18
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = ""
            r13.A04(r0)     // Catch:{ all -> 0x010e }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x010e }
            java.util.ArrayList r5 = r13.A03(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x010e }
            X.34S r6 = new X.34S     // Catch:{ all -> 0x010e }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x010e }
            goto L_0x00cd
        L_0x00be:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x010e }
        L_0x00c0:
            java.util.List r0 = r2.A07     // Catch:{ all -> 0x010e }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x010e }
            X.34S r6 = new X.34S     // Catch:{ all -> 0x010e }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x010e }
        L_0x00cd:
            monitor-exit(r2)
            java.lang.Object r2 = r6.A00
            java.util.List r2 = (java.util.List) r2
            java.math.BigInteger r0 = X.C46503Dg6.A00
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r2.iterator()
        L_0x00dc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00f0
            com.instagram.model.direct.DirectShareTarget r2 = X.DbT.A0f(r5)
            boolean r0 = r2.A0M()
            if (r0 != 0) goto L_0x00dc
            r6.add(r2)
            goto L_0x00dc
        L_0x00f0:
            java.lang.String r5 = r4.A06
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r6.iterator()
        L_0x00fa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0111
            com.instagram.model.direct.DirectShareTarget r2 = X.DbT.A0f(r4)
            boolean r0 = r2.A0Y(r5)
            if (r0 != 0) goto L_0x00fa
            r7.add(r2)
            goto L_0x00fa
        L_0x010e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0111:
            X.0eM r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            X.0V2 r0 = (X.0V2) r0
            java.lang.String r5 = r1.BiY()
            if (r5 != 0) goto L_0x0121
            java.lang.String r5 = ""
        L_0x0121:
            boolean r8 = r1.isLoading()
            boolean r9 = r1.CT5()
            r6 = 0
            X.OGE r4 = new X.OGE
            r4.<init>(r5, r6, r7, r8, r9)
            X.0qQ.A0B(r0, r12)
            r0.FIA(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72916PPa.Dam(X.7fy):void");
    }

    public C72916PPa(OHS ohs) {
        this.A00 = ohs;
    }
}
