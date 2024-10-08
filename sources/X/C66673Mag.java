package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mag  reason: case insensitive filesystem */
public final class C66673Mag implements C74551Pwk {
    public 0xF A00;
    public 0xF A01;
    public final UserSession A02;
    public final 1OS A03;
    public final C74248Prc A04;
    public final /* synthetic */ 1Ou A05;

    public C66673Mag(UserSession userSession, 1Ou r2, 1OS r3, C74248Prc prc) {
        this.A05 = r2;
        this.A03 = r3;
        this.A04 = prc;
        this.A02 = userSession;
    }

    public final 0xF B3j() {
        0xF r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0xF r02 = new 0xF();
        this.A00 = r02;
        return r02;
    }

    public final 0xF BsS() {
        0xF r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0xF r02 = new 0xF();
        this.A01 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016b, code lost:
        if ("upload_failed_permanent".equals(r11) != false) goto L_0x016d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTM(X.C270214gN r24, java.lang.String r25) {
        /*
            r23 = this;
            r9 = r23
            r8 = r24
            X.1OS r7 = r9.A03
            if (r24 != 0) goto L_0x0080
            X.Prc r4 = r9.A04
            X.0xF r5 = r9.BsS()
            X.1Ou r6 = r9.A05
            android.content.IntentFilter r0 = X.1Ou.A0W
            boolean r0 = r7 instanceof X.1bp
            if (r0 == 0) goto L_0x0035
            r0 = r7
            X.1bp r0 = (X.1bp) r0
            java.lang.String r2 = r0.A06()
        L_0x001d:
            java.util.List r10 = r6.A0E
            java.util.Iterator r1 = r10.iterator()
        L_0x0023:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()
            X.2Ag r0 = (X.2Ag) r0
            r3 = r25
            r0.DYd(r7, r3, r2)
            goto L_0x0023
        L_0x0035:
            r2 = 0
            goto L_0x001d
        L_0x0037:
            X.MaO r1 = X.C66655MaO.A01(r4)
            java.lang.String r0 = "uploaded"
            r1.A04(r0)
            X.MaP r3 = new X.MaP
            r3.<init>(r1)
            X.5DE r2 = r6.A0A
            monitor-enter(r2)
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x007d }
            java.util.Map r0 = r2.A04     // Catch:{ all -> 0x007d }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x007d }
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0282
            monitor-enter(r2)
            r2.A03(r7, r3)     // Catch:{ all -> 0x007a }
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            java.util.Iterator r1 = r10.iterator()
        L_0x005c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r1.next()
            X.2Ag r0 = (X.2Ag) r0
            r0.DTP(r5, r7)
            goto L_0x005c
        L_0x006c:
            java.util.List r1 = r6.A0F
            X.5Cj r0 = r6.A09
            X.C66668Mab.A00(r0, r7, r4, r3, r1)
            X.McK r0 = new X.McK
            r0.<init>(r6)
            goto L_0x027f
        L_0x007a:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            throw r1
        L_0x007d:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            throw r1
        L_0x0080:
            X.Prc r0 = r9.A04
            r20 = r0
            X.0xF r19 = r9.B3j()
            X.1Ou r6 = r9.A05
            android.content.IntentFilter r0 = X.1Ou.A0W
            java.lang.String r14 = r7.A02()
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r7.A01
            long r10 = r10 - r0
            X.5Cj r0 = r6.A09
            r22 = r0
            X.1Oe r1 = r0.A00(r14)
            r3 = r20
            X.MaP r3 = (X.C66656MaP) r3
            java.lang.String r0 = r3.A02
            long r1 = r1.A00(r0)
            int r0 = r3.A00
            r21 = r0
            r0 = r22
            X.MbO r0 = r0.A01(r14)
            X.0eM r0 = r0.A03
            int r0 = X.DbX.A07(r0)
            long r4 = (long) r0
            X.0eK r0 = r6.A0K
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00f2
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f2
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x00f2
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00db
            r0 = r21
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f2
        L_0x00db:
            r13 = 1
        L_0x00dc:
            r2 = 0
            if (r13 == 0) goto L_0x0152
            X.MaO r1 = X.C66655MaO.A01(r20)
            java.lang.String r0 = "queued"
            r1.A04(r0)
            X.MaP r12 = new X.MaP
            r12.<init>(r1)
            X.5DE r11 = r6.A0A
            monitor-enter(r11)
            goto L_0x00f4
        L_0x00f2:
            r13 = 0
            goto L_0x00dc
        L_0x00f4:
            boolean r18 = r11.A03(r7, r12)     // Catch:{ all -> 0x014f }
            boolean r0 = r8.A0D     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x014b
            java.util.Map r15 = r11.A03     // Catch:{ all -> 0x014f }
            java.lang.String r0 = r7.A05     // Catch:{ all -> 0x014f }
            java.lang.Object r10 = r15.get(r0)     // Catch:{ all -> 0x014f }
            X.OFK r10 = (X.OFK) r10     // Catch:{ all -> 0x014f }
            if (r10 != 0) goto L_0x013a
            X.5Cj r1 = r11.A01     // Catch:{ all -> 0x014f }
            java.lang.String r0 = r7.A02()     // Catch:{ all -> 0x014f }
            X.MbO r2 = r1.A01(r0)     // Catch:{ all -> 0x014f }
            X.0nE r0 = r11.A00     // Catch:{ all -> 0x014f }
            r3 = r0
            X.0eM r0 = r2.A00     // Catch:{ all -> 0x014f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x014f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x014f }
            int r1 = r0.intValue()     // Catch:{ all -> 0x014f }
            X.0eM r0 = r2.A01     // Catch:{ all -> 0x014f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x014f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x014f }
            long r16 = r0.longValue()     // Catch:{ all -> 0x014f }
            X.OFK r10 = new X.OFK     // Catch:{ all -> 0x014f }
            r2 = r1
            r0 = r16
            r10.<init>(r3, r2, r0)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = r7.A05     // Catch:{ all -> 0x014f }
            r15.put(r0, r10)     // Catch:{ all -> 0x014f }
        L_0x013a:
            X.433 r0 = r10.A02     // Catch:{ all -> 0x014f }
            int r0 = r0.A00()     // Catch:{ all -> 0x014f }
            long r2 = (long) r0     // Catch:{ all -> 0x014f }
            long r0 = r10.A01     // Catch:{ all -> 0x014f }
            long r2 = r2 * r0
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x014f }
            long r0 = r0 + r2
            r10.A00 = r0     // Catch:{ all -> 0x014f }
        L_0x014b:
            r7.A03 = r8     // Catch:{ all -> 0x014f }
            monitor-exit(r11)     // Catch:{ all -> 0x014f }
            goto L_0x0194
        L_0x014f:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x014f }
            throw r1
        L_0x0152:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x018c
            java.lang.String r11 = "upload_failed_transient"
        L_0x0158:
            X.MaO r10 = X.C66655MaO.A01(r20)
            java.lang.String r0 = "upload_failed_transient"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x016d
            java.lang.String r0 = "upload_failed_permanent"
            boolean r0 = r0.equals(r11)
            r1 = 0
            if (r0 == 0) goto L_0x016e
        L_0x016d:
            r1 = 1
        L_0x016e:
            java.lang.String r0 = "Invalid failure LifecycleState: "
            java.lang.String r0 = X.002.A0R(r0, r11)
            X.17k.A0G(r1, r0)
            java.lang.String r0 = r10.A02
            X.C66655MaO.A03(r0, r11)
            X.C66655MaO.A02(r10, r0, r11)
            r10.A02 = r11
            r10.A01 = r8
            X.MaP r12 = new X.MaP
            r12.<init>(r10)
            X.5DE r0 = r6.A0A
            monitor-enter(r0)
            goto L_0x018f
        L_0x018c:
            java.lang.String r11 = "upload_failed_permanent"
            goto L_0x0158
        L_0x018f:
            boolean r18 = r0.A03(r7, r12)     // Catch:{ all -> 0x02f3 }
            monitor-exit(r0)     // Catch:{ all -> 0x02f3 }
        L_0x0194:
            if (r18 == 0) goto L_0x0282
            java.util.List r0 = r6.A0E
            java.util.Iterator r10 = r0.iterator()
        L_0x019c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r1 = r10.next()
            X.2Ag r1 = (X.2Ag) r1
            r0 = r19
            r1.DTL(r0, r7, r8, r13)
            goto L_0x019c
        L_0x01ae:
            java.util.List r10 = r6.A0F
            r1 = r20
            r0 = r22
            X.C66668Mab.A00(r0, r7, r1, r12, r10)
            if (r13 != 0) goto L_0x01ea
            r0 = r21
            long r0 = (long) r0
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x01ea
            com.instagram.common.session.UserSession r5 = r6.A08
            X.AnonymousClass7TG.A1N(r5, r14)
            java.lang.String r1 = "direct_mutation_send_retry_failure"
            r0 = 0
            r1.getClass()
            X.0xI r4 = X.0xI.A01(r1, r0)
            X.C3265677h.A0D(r4, r8)
            java.lang.String r1 = "send_type"
            java.lang.String r0 = "mutation"
            r4.A0C(r1, r0)
            java.lang.String r0 = "mutation_type"
            r4.A0C(r0, r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            java.lang.String r0 = "retry_count"
            r4.A08(r1, r0)
            X.DbU.A1R(r4, r5)
        L_0x01ea:
            java.lang.String r1 = r8.A03
            java.lang.String r0 = "423"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x027a
            boolean r0 = r7 instanceof X.C65331bq
            if (r0 == 0) goto L_0x027a
            com.instagram.common.session.UserSession r5 = r6.A08
            X.0Tu r4 = X.0Tu.A06
            r0 = 36322409576868012(0x810b0a003728ac, double:3.033776302790609E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x027a
            r0 = r7
            X.1bq r0 = (X.C65331bq) r0
            java.util.List r0 = r0.C6L()
            r11 = 0
            java.lang.Object r10 = r0.get(r11)
            com.instagram.model.direct.DirectThreadKey r10 = (com.instagram.model.direct.DirectThreadKey) r10
            X.0eK r0 = r6.A0L
            java.lang.Object r0 = r0.get()
            X.2Dm r0 = (X.2Dm) r0
            X.3U9 r0 = r0.B33(r10)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r12 = "thread not in the cache"
        L_0x0225:
            r0 = 2342164482484086177(0x20810a30000025a1, double:4.066835088555968E-152)
            boolean r4 = X.182.A06(r4, r5, r0)
            X.0qQ.A0B(r10, r11)
            java.lang.String r1 = r10.A00
            if (r1 == 0) goto L_0x02b2
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "thread id: "
            r5.append(r0)
        L_0x023e:
            java.lang.String r5 = X.AnonymousClass7TF.A0l(r1, r5)
        L_0x0242:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Cannot send message to "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " : content type = "
            r1.append(r0)
            java.lang.String r0 = r7.A02()
            r1.append(r0)
            java.lang.String r0 = ", btv map: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", ETR enabled = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            X.0fA r1 = r6.A07
            r0 = 817904752(0x30c03c70, float:1.3987016E-9)
            X.0f9 r0 = r1.AEf(r4, r0)
            r0.report()
        L_0x027a:
            X.PZ6 r0 = new X.PZ6
            r0.<init>(r6, r2)
        L_0x027f:
            X.11Z.A02(r0)
        L_0x0282:
            boolean r0 = r7 instanceof X.1fi
            if (r0 == 0) goto L_0x02a3
            X.1fi r7 = (X.1fi) r7
            X.5yB r0 = r7.A04
            java.lang.String r3 = r0.A06
            java.lang.String r2 = r0.A09
            X.1iA r1 = r0.A01
        L_0x0290:
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x02a2
            if (r3 == 0) goto L_0x02a2
            if (r2 == 0) goto L_0x02a2
            android.os.Handler r1 = r6.A05
            X.PbO r0 = new X.PbO
            r0.<init>(r9, r8, r3, r2)
            r1.post(r0)
        L_0x02a2:
            return
        L_0x02a3:
            boolean r0 = r7 instanceof X.AnonymousClass1fu
            if (r0 == 0) goto L_0x02a2
            X.1fu r7 = (X.AnonymousClass1fu) r7
            X.7Qt r0 = r7.A01
            java.lang.String r3 = r0.A03
            java.lang.String r2 = r0.A05
            X.1iA r1 = r0.A01
            goto L_0x0290
        L_0x02b2:
            java.util.List r1 = r10.A02
            if (r1 == 0) goto L_0x02c7
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "recipient ids: "
            r5.append(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = X.C66581MXm.A0w(r0, r1)
            goto L_0x023e
        L_0x02c7:
            java.lang.String r5 = "unknown"
            goto L_0x0242
        L_0x02cb:
            X.3Tu r1 = r0.AiM()
            if (r1 != 0) goto L_0x02d5
            java.lang.String r12 = "btv map is null"
            goto L_0x0225
        L_0x02d5:
            java.lang.StringBuilder r12 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "tlc = "
            r12.append(r0)
            int r0 = r1.A01
            r12.append(r0)
            java.lang.String r0 = " ttlc = "
            r12.append(r0)
            long r0 = r1.A03
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            goto L_0x0225
        L_0x02f3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02f3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66673Mag.DTM(X.4gN, java.lang.String):void");
    }
}
