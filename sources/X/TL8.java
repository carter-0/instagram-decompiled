package X;

public final class TL8 implements Runnable {
    public static final String A02 = AnonymousClass389.A01("EnqueueRunnable");
    public final C375679Ep A00;
    public final SSM A01;

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0180, code lost:
        if (r20 != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0182, code lost:
        r2 = r6.A05();
        r1 = r2.CGj(r7).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0192, code lost:
        if (r1.hasNext() == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0194, code lost:
        r2.AOP(((X.AnonymousClass9FR) r1.next()).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a0, code lost:
        r21 = false;
        r20 = false;
        r12 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.SSM r24) {
        /*
            r10 = r24
            java.util.List r0 = r10.A06
            r23 = 0
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r4 = r0.iterator()
        L_0x000c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r4.next()
            X.SSM r1 = (X.SSM) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0023
            boolean r0 = A00(r1)
            r23 = r23 | r0
            goto L_0x000c
        L_0x0023:
            X.AnonymousClass389.A00()
            java.lang.String r3 = A02
            java.lang.String r2 = "Already enqueued work ids ("
            java.util.List r1 = r1.A05
            java.lang.String r0 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = ")"
            X.Pxf.A1L(r2, r1, r0, r3)
            goto L_0x000c
        L_0x0038:
            java.util.HashSet r1 = X.SSM.A00(r10)
            X.385 r9 = r10.A02
            java.util.List r0 = r10.A07
            r24 = r0
            r11 = 0
            java.lang.String[] r8 = X.Pxf.A1b(r1, r11)
            java.lang.String r7 = r10.A04
            java.lang.Integer r3 = r10.A03
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r9.A04
            if (r8 == 0) goto L_0x009e
            int r12 = r8.length
            if (r12 <= 0) goto L_0x009e
            r16 = 1
            r2 = 0
            r22 = 1
            r21 = 0
            r20 = 0
        L_0x005f:
            r13 = r8[r2]
            X.38z r0 = r6.A05()
            X.3DG r0 = r0.CGi(r13)
            if (r0 != 0) goto L_0x0082
            X.AnonymousClass389.A00()
            java.lang.String r2 = A02
            java.lang.String r1 = "Prerequisite "
            java.lang.String r0 = " doesn't exist; not enqueuing"
            java.lang.String r0 = X.002.A0g(r1, r13, r0)
            android.util.Log.e(r2, r0)
        L_0x007b:
            r15 = 0
        L_0x007c:
            r0 = 1
            r10.A00 = r0
            r15 = r15 | r23
            return r15
        L_0x0082:
            X.39t r1 = r0.A0E
            X.39t r0 = X.C2379139t.SUCCEEDED
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r22 = r22 & r0
            X.39t r0 = X.C2379139t.FAILED
            if (r1 != r0) goto L_0x0097
            r20 = 1
        L_0x0092:
            int r2 = r2 + 1
            if (r2 >= r12) goto L_0x00a6
            goto L_0x005f
        L_0x0097:
            X.39t r0 = X.C2379139t.CANCELLED
            if (r1 != r0) goto L_0x0092
            r21 = 1
            goto L_0x0092
        L_0x009e:
            r16 = 0
            r22 = 1
            r21 = 0
            r20 = 0
        L_0x00a6:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r19 = r0 ^ 1
            if (r19 == 0) goto L_0x01b3
            if (r16 != 0) goto L_0x01b3
            X.38z r0 = r6.A05()
            java.util.ArrayList r13 = r0.CGj(r7)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x01b3
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 == r0) goto L_0x010a
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 == r0) goto L_0x010a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 != r0) goto L_0x00e5
            java.util.Iterator r2 = r13.iterator()
        L_0x00ce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r0 = r2.next()
            X.9FR r0 = (X.AnonymousClass9FR) r0
            X.39t r1 = r0.A00
            X.39t r0 = X.C2379139t.ENQUEUED
            if (r1 == r0) goto L_0x007b
            X.39t r0 = X.C2379139t.RUNNING
            if (r1 != r0) goto L_0x00ce
            goto L_0x007b
        L_0x00e5:
            X.5jz r0 = new X.5jz
            r0.<init>(r9, r7, r11)
            r0.run()
            X.38z r2 = r6.A05()
            java.util.Iterator r1 = r13.iterator()
        L_0x00f5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r1.next()
            X.9FR r0 = (X.AnonymousClass9FR) r0
            java.lang.String r0 = r0.A01
            r2.AOP(r0)
            goto L_0x00f5
        L_0x0107:
            r15 = 1
            goto L_0x01b4
        L_0x010a:
            X.390 r18 = r6.A00()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r13.iterator()
        L_0x0116:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x017a
            java.lang.Object r15 = r17.next()
            X.9FR r15 = (X.AnonymousClass9FR) r15
            java.lang.String r13 = r15.A01
            r1 = r18
            X.5Fj r1 = (X.C282945Fj) r1
            java.lang.String r2 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r14 = 1
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r2 = X.1Wa.A00(r2, r14)
            if (r13 != 0) goto L_0x0176
            r2.ADb(r14)
        L_0x0136:
            X.3oI r1 = r1.A01
            r1.assertNotSuspendingTransaction()
            r0 = 0
            r16 = 0
            android.database.Cursor r1 = r1.query((X.AnonymousClass1WA) r2, (android.os.CancellationSignal) r0)
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0267 }
            if (r0 == 0) goto L_0x0151
            int r0 = r1.getInt(r11)     // Catch:{ all -> 0x0267 }
            if (r0 != 0) goto L_0x014f
            r14 = 0
        L_0x014f:
            r16 = r14
        L_0x0151:
            r1.close()
            r2.A00()
            if (r16 != 0) goto L_0x0116
            X.39t r2 = r15.A00
            X.39t r0 = X.C2379139t.SUCCEEDED
            boolean r1 = X.AnonymousClass7TF.A1W(r2, r0)
            r1 = r1 & r22
            X.39t r0 = X.C2379139t.FAILED
            if (r2 != r0) goto L_0x016f
            r20 = 1
        L_0x0169:
            r12.add(r13)
            r22 = r1
            goto L_0x0116
        L_0x016f:
            X.39t r0 = X.C2379139t.CANCELLED
            if (r2 != r0) goto L_0x0169
            r21 = 1
            goto L_0x0169
        L_0x0176:
            r2.ADh(r14, r13)
            goto L_0x0136
        L_0x017a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 != r0) goto L_0x01a8
            if (r21 != 0) goto L_0x0182
            if (r20 == 0) goto L_0x01a8
        L_0x0182:
            X.38z r2 = r6.A05()
            java.util.ArrayList r0 = r2.CGj(r7)
            java.util.Iterator r1 = r0.iterator()
        L_0x018e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r1.next()
            X.9FR r0 = (X.AnonymousClass9FR) r0
            java.lang.String r0 = r0.A01
            r2.AOP(r0)
            goto L_0x018e
        L_0x01a0:
            java.util.List r12 = java.util.Collections.emptyList()
            r21 = 0
            r20 = 0
        L_0x01a8:
            java.lang.Object[] r8 = r12.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r0 = r8.length
            boolean r16 = X.AnonymousClass7TF.A1R(r0)
        L_0x01b3:
            r15 = 0
        L_0x01b4:
            java.util.Iterator r14 = r24.iterator()
        L_0x01b8:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r12 = r14.next()
            X.9En r12 = (X.C375659En) r12
            X.3DG r3 = r12.A00
            if (r16 == 0) goto L_0x0263
            if (r22 != 0) goto L_0x0263
            if (r20 == 0) goto L_0x0259
            X.39t r0 = X.C2379139t.FAILED
        L_0x01ce:
            r3.A0E = r0
        L_0x01d0:
            X.39t r1 = r3.A0E
            X.39t r0 = X.C2379139t.ENQUEUED
            if (r1 != r0) goto L_0x01d7
            r15 = 1
        L_0x01d7:
            X.38z r2 = r6.A05()
            java.util.List r0 = r9.A07
            X.0qQ.A0B(r0, r11)
            X.3Bj r2 = (X.C238313Bj) r2
            X.3oI r1 = r2.A02
            r1.assertNotSuspendingTransaction()
            r1.beginTransaction()
            X.1Vf r0 = r2.A01     // Catch:{ all -> 0x026f }
            r0.insert(r3)     // Catch:{ all -> 0x026f }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x026f }
            r1.endTransaction()
            if (r16 == 0) goto L_0x0224
            int r13 = r8.length
            r3 = 0
        L_0x01f9:
            if (r3 >= r13) goto L_0x0224
            r1 = r8[r3]
            java.util.UUID r0 = r12.A02
            java.lang.String r0 = X.DbT.A10(r0)
            X.Rqn r2 = new X.Rqn
            r2.<init>(r0, r1)
            X.390 r0 = r6.A00()
            X.5Fj r0 = (X.C282945Fj) r0
            X.3oI r1 = r0.A01
            r1.assertNotSuspendingTransaction()
            r1.beginTransaction()
            X.1Vf r0 = r0.A00     // Catch:{ all -> 0x026f }
            r0.insert(r2)     // Catch:{ all -> 0x026f }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x026f }
            r1.endTransaction()
            int r3 = r3 + 1
            goto L_0x01f9
        L_0x0224:
            X.391 r3 = r6.A06()
            java.util.UUID r2 = r12.A02
            java.lang.String r1 = X.DbT.A10(r2)
            java.util.Set r0 = r12.A01
            r3.CNY(r1, r0)
            if (r19 == 0) goto L_0x01b8
            X.393 r3 = r6.A03()
            java.lang.String r0 = X.DbT.A10(r2)
            X.OAZ r2 = new X.OAZ
            r2.<init>(r7, r0)
            X.Sg8 r3 = (X.Sg8) r3
            X.3oI r1 = r3.A01
            r1.assertNotSuspendingTransaction()
            r1.beginTransaction()
            X.1Vf r0 = r3.A00     // Catch:{ all -> 0x026f }
            r0.insert(r2)     // Catch:{ all -> 0x026f }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x026f }
            r1.endTransaction()
            goto L_0x01b8
        L_0x0259:
            if (r21 == 0) goto L_0x025f
            X.39t r0 = X.C2379139t.CANCELLED
            goto L_0x01ce
        L_0x025f:
            X.39t r0 = X.C2379139t.BLOCKED
            goto L_0x01ce
        L_0x0263:
            r3.A07 = r4
            goto L_0x01d0
        L_0x0267:
            r0 = move-exception
            r1.close()
            r2.A00()
            throw r0
        L_0x026f:
            r0 = move-exception
            r1.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL8.A00(X.SSM):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r10 == 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r9 = 0;
        r0 = X.1WY.A08;
        r6 = X.1Wa.A00("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        r1 = ((X.C238313Bj) r2.A05()).A02;
        r1.assertNotSuspendingTransaction();
        r1 = r1.query((X.AnonymousClass1WA) r6, (android.os.CancellationSignal) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r1.moveToFirst() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r9 = r1.getInt(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
        r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if ((r9 + r10) <= 8) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        r0 = X.AnonymousClass7TE.A0w(X.002.A0z("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", 8, r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        r0 = A00(r5);
        r2.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        if (r0 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        X.AnonymousClass39T.A00(r4.A01, androidx.work.impl.background.systemalarm.RescheduleReceiver.class, true);
        X.C255313tv.A00(r2, r4.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        r11.A00.A00(X.C375689Eq.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            X.SSM r5 = r11.A01     // Catch:{ all -> 0x00f4 }
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x00f4 }
            boolean r0 = X.SSM.A01(r5, r0)     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00e2
            X.385 r4 = r5.A02     // Catch:{ all -> 0x00f4 }
            androidx.work.impl.WorkDatabase r2 = r4.A04     // Catch:{ all -> 0x00f4 }
            r2.beginTransaction()     // Catch:{ all -> 0x00f4 }
            X.38C r0 = r4.A02     // Catch:{ all -> 0x00dd }
            r8 = 0
            r3 = 1
            X.0qQ.A0B(r0, r3)     // Catch:{ all -> 0x00dd }
            X.SSM[] r0 = new X.SSM[]{r5}     // Catch:{ all -> 0x00dd }
            java.util.ArrayList r6 = X.0sr.A1M(r0)     // Catch:{ all -> 0x00dd }
            r10 = 0
        L_0x0023:
            boolean r0 = X.DbT.A1b(r6)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r7 = X.018.A14(r6)     // Catch:{ all -> 0x00dd }
            X.SSM r7 = (X.SSM) r7     // Catch:{ all -> 0x00dd }
            java.util.List r1 = r7.A07     // Catch:{ all -> 0x00dd }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00dd }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0062
        L_0x0040:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00dd }
            r9 = 0
        L_0x0045:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00dd }
            X.9En r0 = (X.C375659En) r0     // Catch:{ all -> 0x00dd }
            X.3DG r0 = r0.A00     // Catch:{ all -> 0x00dd }
            X.3ty r0 = r0.A0B     // Catch:{ all -> 0x00dd }
            java.util.Set r0 = r0.A03     // Catch:{ all -> 0x00dd }
            boolean r0 = X.C66580MXl.A1b(r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0045
            int r9 = r9 + 1
            if (r9 >= 0) goto L_0x0045
            goto L_0x006b
        L_0x0062:
            int r10 = r10 + r9
            java.util.List r0 = r7.A06     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0023
            r6.addAll(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x0023
        L_0x006b:
            X.0sr.A1S()     // Catch:{ all -> 0x00dd }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00bc
        L_0x0073:
            if (r10 == 0) goto L_0x00bd
            X.38z r7 = r2.A05()     // Catch:{ all -> 0x00dd }
            X.3Bj r7 = (X.C238313Bj) r7     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)"
            r9 = 0
            java.util.TreeMap r0 = X.1WY.A08     // Catch:{ all -> 0x00dd }
            X.1WY r6 = X.1Wa.A00(r1, r8)     // Catch:{ all -> 0x00dd }
            X.3oI r1 = r7.A02     // Catch:{ all -> 0x00dd }
            r1.assertNotSuspendingTransaction()     // Catch:{ all -> 0x00dd }
            r0 = 0
            android.database.Cursor r1 = r1.query((X.AnonymousClass1WA) r6, (android.os.CancellationSignal) r0)     // Catch:{ all -> 0x00dd }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0098
            int r9 = r1.getInt(r8)     // Catch:{ all -> 0x00b5 }
        L_0x0098:
            r1.close()     // Catch:{ all -> 0x00dd }
            r6.A00()     // Catch:{ all -> 0x00dd }
            r8 = 8
            int r0 = r9 + r10
            if (r0 <= r8) goto L_0x00bd
            java.lang.String r4 = "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: "
            java.lang.String r5 = ";\nalready enqueued count: "
            java.lang.String r6 = ";\ncurrent enqueue operation count: "
            java.lang.String r7 = ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."
            java.lang.String r0 = X.002.A0z(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00dd }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00bc
        L_0x00b5:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00dd }
            r6.A00()     // Catch:{ all -> 0x00dd }
        L_0x00bc:
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00bd:
            boolean r0 = A00(r5)     // Catch:{ all -> 0x00dd }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x00dd }
            r2.endTransaction()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00d5
            android.content.Context r1 = r4.A01     // Catch:{ all -> 0x00f4 }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r0 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            X.AnonymousClass39T.A00(r1, r0, r3)     // Catch:{ all -> 0x00f4 }
            java.util.List r0 = r4.A07     // Catch:{ all -> 0x00f4 }
            X.C255313tv.A00(r2, r0)     // Catch:{ all -> 0x00f4 }
        L_0x00d5:
            X.9Ep r1 = r11.A00     // Catch:{ all -> 0x00f4 }
            X.9Er r0 = X.C375689Eq.A01     // Catch:{ all -> 0x00f4 }
            r1.A00(r0)     // Catch:{ all -> 0x00f4 }
            return
        L_0x00dd:
            r0 = move-exception
            r2.endTransaction()     // Catch:{ all -> 0x00f4 }
            goto L_0x00f3
        L_0x00e2:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "WorkContinuation has cycles ("
            r1.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = X.Pxg.A0q(r5, r1)     // Catch:{ all -> 0x00f4 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00f3:
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r2 = move-exception
            X.9Ep r1 = r11.A00
            X.9Eu r0 = new X.9Eu
            r0.<init>(r2)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL8.run():void");
    }

    public TL8(C375679Ep r1, SSM ssm) {
        this.A01 = ssm;
        this.A00 = r1;
    }
}
