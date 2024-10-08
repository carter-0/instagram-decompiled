package X;

import com.instagram.common.session.UserSession;

public final class NRQ extends 0ng {
    public final /* synthetic */ UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRQ(UserSession userSession) {
        super(1765280269, 3, false, false);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0156, code lost:
        if (X.11Z.A07() != false) goto L_0x0158;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03c2 A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04af A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04b0 A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04bb A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04f3 A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x052e A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0534 A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0547 A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x054a A[Catch:{ all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023d A[Catch:{ all -> 0x04a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r40 = this;
            r0 = r40
            com.instagram.common.session.UserSession r0 = r0.A00
            X.ObC r6 = X.OQ4.A00(r0)
            long r1 = java.lang.System.currentTimeMillis()
            monitor-enter(r6)
            java.util.concurrent.TimeUnit r18 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0579 }
            r0 = r18
            long r10 = r0.toSeconds(r1)     // Catch:{ all -> 0x0579 }
            com.instagram.common.session.UserSession r0 = r6.A01     // Catch:{ all -> 0x0579 }
            X.MmS r4 = X.C66833MdR.A00(r0)     // Catch:{ all -> 0x0579 }
            r21 = 0
            X.0Tu r24 = X.0Tu.A05     // Catch:{ all -> 0x0579 }
            r2 = 2342161901214571185(0x208107d700591ab1, double:4.064646390970203E-152)
            r1 = r24
            boolean r1 = X.182.A06(r1, r0, r2)     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0056
            X.MdY r20 = X.C66843Mdb.A01(r0)     // Catch:{ all -> 0x0579 }
        L_0x0030:
            X.MmU r1 = r4.A01     // Catch:{ all -> 0x0579 }
            com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase r1 = r1.A02     // Catch:{ all -> 0x0579 }
            r39 = r1
            X.O4C r3 = r39.A02()     // Catch:{ all -> 0x0579 }
            X.MmV r3 = (X.C67354MmV) r3     // Catch:{ all -> 0x0579 }
            java.lang.String r2 = "SELECT * FROM messages_table WHERE hidden == 0 AND message_expiration_ts_sec <= ?"
            r22 = 1
            java.util.TreeMap r1 = X.1WY.A08     // Catch:{ all -> 0x0579 }
            r1 = r22
            X.1WY r8 = X.1Wa.A00(r2, r1)     // Catch:{ all -> 0x0579 }
            r8.ADa(r1, r10)     // Catch:{ all -> 0x0579 }
            X.3oI r1 = r3.A00     // Catch:{ all -> 0x0579 }
            r1.assertNotSuspendingTransaction()     // Catch:{ all -> 0x0579 }
            r12 = 0
            android.database.Cursor r1 = r1.query((X.AnonymousClass1WA) r8, (android.os.CancellationSignal) r12)     // Catch:{ all -> 0x0579 }
            goto L_0x0059
        L_0x0056:
            r20 = 0
            goto L_0x0030
        L_0x0059:
            java.lang.String r2 = "thread_jid"
            int r23 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "sender_jid"
            int r19 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "item_id"
            int r17 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "payload"
            int r16 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "payload_blob"
            int r5 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "hidden"
            int r15 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "shh"
            int r14 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "offline_threading_id"
            int r13 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "message_expiration_ts_sec"
            int r4 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "hidden_ts_sec"
            int r3 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "message_deletion_ts_sec"
            int r2 = X.1Wd.A01(r1, r2)     // Catch:{ all -> 0x0569 }
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0o(r1)     // Catch:{ all -> 0x0569 }
        L_0x009f:
            boolean r7 = r1.moveToNext()     // Catch:{ all -> 0x0569 }
            if (r7 == 0) goto L_0x010c
            r7 = r23
            long r34 = r1.getLong(r7)     // Catch:{ all -> 0x0569 }
            r7 = r19
            long r36 = r1.getLong(r7)     // Catch:{ all -> 0x0569 }
            r7 = r17
            java.lang.String r29 = r1.getString(r7)     // Catch:{ all -> 0x0569 }
            r7 = r16
            java.lang.String r30 = r1.getString(r7)     // Catch:{ all -> 0x0569 }
            boolean r7 = r1.isNull(r5)     // Catch:{ all -> 0x0569 }
            if (r7 == 0) goto L_0x00c6
            r32 = 0
            goto L_0x00ca
        L_0x00c6:
            byte[] r32 = r1.getBlob(r5)     // Catch:{ all -> 0x0569 }
        L_0x00ca:
            int r7 = r1.getInt(r15)     // Catch:{ all -> 0x0569 }
            boolean r38 = X.AnonymousClass7TF.A1P(r7)
            int r33 = r1.getInt(r14)     // Catch:{ all -> 0x0569 }
            java.lang.String r31 = r1.getString(r13)     // Catch:{ all -> 0x0569 }
            boolean r7 = r1.isNull(r4)     // Catch:{ all -> 0x0569 }
            if (r7 == 0) goto L_0x00e3
            r26 = 0
            goto L_0x00e7
        L_0x00e3:
            java.lang.Integer r26 = X.C66581MXm.A0n(r1, r4)     // Catch:{ all -> 0x0569 }
        L_0x00e7:
            boolean r7 = r1.isNull(r3)     // Catch:{ all -> 0x0569 }
            if (r7 == 0) goto L_0x00f0
            r27 = 0
            goto L_0x00f4
        L_0x00f0:
            java.lang.Integer r27 = X.C66581MXm.A0n(r1, r3)     // Catch:{ all -> 0x0569 }
        L_0x00f4:
            boolean r7 = r1.isNull(r2)     // Catch:{ all -> 0x0569 }
            if (r7 == 0) goto L_0x00fd
            r28 = 0
            goto L_0x0101
        L_0x00fd:
            java.lang.Integer r28 = X.C66581MXm.A0n(r1, r2)     // Catch:{ all -> 0x0569 }
        L_0x0101:
            X.8xC r7 = new X.8xC     // Catch:{ all -> 0x0569 }
            r25 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38)     // Catch:{ all -> 0x0569 }
            r9.add(r7)     // Catch:{ all -> 0x0569 }
            goto L_0x009f
        L_0x010c:
            r1.close()     // Catch:{ all -> 0x0579 }
            r8.A00()     // Catch:{ all -> 0x0579 }
            java.util.LinkedHashMap r19 = X.AnonymousClass7TE.A1H()     // Catch:{ all -> 0x0579 }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x0579 }
        L_0x011a:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0149
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x0579 }
            X.8xC r3 = (X.C370868xC) r3     // Catch:{ all -> 0x0579 }
            long r1 = r3.A02     // Catch:{ all -> 0x0579 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0579 }
            r1 = r19
            java.lang.Object r7 = X.JTS.A0h(r2, r1)     // Catch:{ all -> 0x0579 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0579 }
            java.lang.String r5 = r3.A07     // Catch:{ all -> 0x0579 }
            java.lang.String r4 = r3.A06     // Catch:{ all -> 0x0579 }
            long r1 = r3.A01     // Catch:{ all -> 0x0579 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0579 }
            r2 = 9
            X.Jvb r1 = new X.Jvb     // Catch:{ all -> 0x0579 }
            r1.<init>(r5, r4, r3, r2)     // Catch:{ all -> 0x0579 }
            r7.add(r1)     // Catch:{ all -> 0x0579 }
            goto L_0x011a
        L_0x0149:
            if (r20 == 0) goto L_0x021a
            int r1 = com.facebook.msys.mci.Execution.getExecutionContext()     // Catch:{ all -> 0x0579 }
            if (r1 != 0) goto L_0x0158
            boolean r1 = X.11Z.A07()     // Catch:{ all -> 0x0579 }
            r3 = 1
            if (r1 == 0) goto L_0x0159
        L_0x0158:
            r3 = 0
        L_0x0159:
            r1 = r21
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.17k.A0J(r3, r1, r2)     // Catch:{ all -> 0x0579 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0579 }
            long r1 = r1.toMillis(r10)     // Catch:{ all -> 0x0579 }
            r3 = r20
            com.instagram.common.session.UserSession r7 = r3.A00     // Catch:{ all -> 0x0579 }
            X.2Dm r8 = X.2L2.A00(r7)     // Catch:{ all -> 0x0579 }
            X.Mdg r5 = X.O4V.A00     // Catch:{ all -> 0x0579 }
            r4 = 7
            X.GQ2 r3 = new X.GQ2     // Catch:{ all -> 0x0579 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0579 }
            com.google.common.util.concurrent.SettableFuture r4 = r5.A01(r7, r3)     // Catch:{ all -> 0x0579 }
            java.lang.String r3 = "Synchronous message expiration of Reverb"
            r1 = 0
            X.0eP r1 = X.C66840MdY.A06(r3, r4, r1)     // Catch:{ all -> 0x0579 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x0579 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0220
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0579 }
            java.util.Iterator r17 = X.AnonymousClass7TF.A0u(r1)     // Catch:{ all -> 0x0579 }
        L_0x0192:
            boolean r1 = r17.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0215
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r17)     // Catch:{ all -> 0x0579 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x0579 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x0579 }
            boolean r1 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0192
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0579 }
            if (r3 == 0) goto L_0x0192
            java.lang.Long r14 = X.AnonymousClass7TE.A10(r3)     // Catch:{ all -> 0x0579 }
            if (r14 == 0) goto L_0x0192
            boolean r1 = r2 instanceof java.util.List     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0192
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0579 }
            if (r2 == 0) goto L_0x0192
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0579 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0579 }
        L_0x01c2:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x01d6
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0579 }
            boolean r1 = r2 instanceof java.lang.String     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x01c2
            if (r2 == 0) goto L_0x01c2
            r4.add(r2)     // Catch:{ all -> 0x0579 }
            goto L_0x01c2
        L_0x01d6:
            long r1 = r14.longValue()     // Catch:{ all -> 0x0579 }
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0579 }
            java.util.Iterator r16 = r4.iterator()     // Catch:{ all -> 0x0579 }
        L_0x01e2:
            boolean r3 = r16.hasNext()     // Catch:{ all -> 0x0579 }
            if (r3 == 0) goto L_0x0210
            java.lang.String r9 = X.AnonymousClass7TE.A18(r16)     // Catch:{ all -> 0x0579 }
            X.3U9 r3 = r8.B34(r1)     // Catch:{ all -> 0x0579 }
            if (r3 == 0) goto L_0x01e2
            com.instagram.model.direct.DirectThreadKey r3 = r3.BJz()     // Catch:{ all -> 0x0579 }
            X.3su r3 = r8.BRy(r3, r9)     // Catch:{ all -> 0x0579 }
            if (r3 == 0) goto L_0x01e2
            java.lang.String r7 = r3.A0g()     // Catch:{ all -> 0x0579 }
            java.lang.String r5 = r3.A1u     // Catch:{ all -> 0x0579 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x0579 }
            r4 = 9
            X.Jvb r3 = new X.Jvb     // Catch:{ all -> 0x0579 }
            r3.<init>(r9, r7, r5, r4)     // Catch:{ all -> 0x0579 }
            r13.add(r3)     // Catch:{ all -> 0x0579 }
            goto L_0x01e2
        L_0x0210:
            X.AnonymousClass7TF.A1I(r14, r13, r15)     // Catch:{ all -> 0x0579 }
            goto L_0x0192
        L_0x0215:
            java.util.Map r8 = X.0Yt.A08(r15)     // Catch:{ all -> 0x0579 }
            goto L_0x0224
        L_0x021a:
            r8 = 0
        L_0x021b:
            java.util.LinkedHashMap r7 = X.0Yt.A03(r19)     // Catch:{ all -> 0x0579 }
            goto L_0x0235
        L_0x0220:
            X.0sm r8 = X.0Yt.A0E()     // Catch:{ all -> 0x0579 }
        L_0x0224:
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x0579 }
            if (r1 != 0) goto L_0x021b
            boolean r1 = r19.isEmpty()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x033c
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0579 }
            r7.<init>(r8)     // Catch:{ all -> 0x0579 }
        L_0x0235:
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x0579 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x03ae
            X.2Dm r5 = X.2L2.A00(r0)     // Catch:{ all -> 0x0579 }
            java.util.Iterator r15 = X.AnonymousClass7TF.A0s(r7)     // Catch:{ all -> 0x0579 }
        L_0x0245:
            boolean r1 = r15.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x03ae
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r15)     // Catch:{ all -> 0x0579 }
            java.lang.Object r1 = r3.getKey()     // Catch:{ all -> 0x0579 }
            long r1 = X.AnonymousClass7TE.A0R(r1)     // Catch:{ all -> 0x0579 }
            java.lang.Object r9 = r3.getValue()     // Catch:{ all -> 0x0579 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0579 }
            X.3U9 r4 = r5.B34(r1)     // Catch:{ all -> 0x03ab }
            if (r4 != 0) goto L_0x026c
            java.lang.String r3 = "GetExtendedDirectThread"
            r5.CnE(r3)     // Catch:{ all -> 0x03ab }
            X.3U9 r4 = r5.B34(r1)     // Catch:{ all -> 0x03ab }
        L_0x026c:
            if (r4 == 0) goto L_0x0333
            java.util.Iterator r14 = r9.iterator()     // Catch:{ all -> 0x0579 }
            r3 = 0
        L_0x0273:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x02d1
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x0579 }
            X.Jvb r9 = (X.C61037Jvb) r9     // Catch:{ all -> 0x0579 }
            r1 = 36325665159328886(0x810e00000d3476, double:3.035835146248044E-306)
            r13 = r24
            boolean r1 = X.182.A06(r13, r0, r1)     // Catch:{ all -> 0x0579 }
            if (r1 != 0) goto L_0x029f
            com.instagram.model.direct.DirectThreadKey r26 = r4.BJz()     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x0579 }
            java.lang.Integer r27 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0579 }
            r25 = r5
            r28 = r12
            r29 = r1
            r30 = r21
            r25.EE6(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0579 }
        L_0x029f:
            java.lang.String r1 = r9.A02     // Catch:{ all -> 0x0579 }
            java.lang.String r31 = X.C71086ObC.A00(r4, r6, r1)     // Catch:{ all -> 0x0579 }
            X.OZY r1 = new X.OZY     // Catch:{ all -> 0x0579 }
            r1.<init>(r0)     // Catch:{ all -> 0x0579 }
            com.instagram.model.direct.DirectThreadKey r27 = r4.BJz()     // Catch:{ all -> 0x0579 }
            java.lang.Integer r28 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0579 }
            java.lang.String r2 = r9.A01     // Catch:{ all -> 0x0579 }
            X.Nkj r26 = X.C69405Nkj.DISAPPEARING_MESSAGE     // Catch:{ all -> 0x0579 }
            r25 = r1
            r29 = r2
            r30 = r12
            r25.A02(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0579 }
            if (r3 == 0) goto L_0x02cf
            java.lang.String r13 = r3.A00     // Catch:{ all -> 0x0579 }
            if (r13 == 0) goto L_0x0273
            java.lang.String r2 = r9.A00     // Catch:{ all -> 0x0579 }
            if (r2 == 0) goto L_0x0273
            java.util.Comparator r1 = X.AnonymousClass48W.A00     // Catch:{ all -> 0x0579 }
            int r1 = r1.compare(r2, r13)     // Catch:{ all -> 0x0579 }
            if (r1 <= 0) goto L_0x0273
        L_0x02cf:
            r3 = r9
            goto L_0x0273
        L_0x02d1:
            r1 = 36325665159328886(0x810e00000d3476, double:3.035835146248044E-306)
            r9 = r24
            boolean r1 = X.182.A06(r9, r0, r1)     // Catch:{ all -> 0x0579 }
            if (r1 != 0) goto L_0x0245
            if (r3 == 0) goto L_0x02fe
            java.lang.String r13 = r3.A00     // Catch:{ all -> 0x0579 }
            if (r13 == 0) goto L_0x02fe
            boolean r1 = X.C308556Us.A05(r0)     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x02fe
            r1 = 36323981531426451(0x810c7800022e93, double:3.034770413183119E-306)
            boolean r1 = X.182.A06(r9, r0, r1)     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x02fe
            java.lang.String r1 = r3.A02     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = X.C71086ObC.A00(r4, r6, r1)     // Catch:{ all -> 0x0579 }
            r5.AEr(r4, r13, r1)     // Catch:{ all -> 0x0579 }
        L_0x02fe:
            X.C66581MXm.A1L(r4, r5)     // Catch:{ all -> 0x0579 }
            r1 = 2342164525433824748(0x20810a3a000125ec, double:4.066871506290952E-152)
            boolean r1 = X.182.A06(r9, r0, r1)     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0245
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0579 }
            java.util.List r1 = X.C71086ObC.A01(r7)     // Catch:{ all -> 0x0579 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0579 }
        L_0x0318:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x032e
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)     // Catch:{ all -> 0x0579 }
            com.instagram.model.direct.DirectThreadKey r1 = r4.BJz()     // Catch:{ all -> 0x0579 }
            java.util.ArrayList r1 = r5.Bm7(r1, r2)     // Catch:{ all -> 0x0579 }
            r9.addAll(r1)     // Catch:{ all -> 0x0579 }
            goto L_0x0318
        L_0x032e:
            X.C331247Qd.A00(r0, r4, r5, r9)     // Catch:{ all -> 0x0579 }
            goto L_0x0245
        L_0x0333:
            java.lang.String r2 = "ArmadilloExpressEphemeralityMessageProcessor"
            java.lang.String r1 = "extendedDirectThread was null, unable to retract notification or remove message from direct cache"
            X.0KC.A0C(r2, r1)     // Catch:{ all -> 0x0579 }
            goto L_0x0245
        L_0x033c:
            java.util.Set r1 = r19.entrySet()     // Catch:{ all -> 0x0579 }
            X.0jq r2 = X.00k.A0o(r1)     // Catch:{ all -> 0x0579 }
            java.util.Set r1 = r8.entrySet()     // Catch:{ all -> 0x0579 }
            X.0jq r1 = X.00k.A0o(r1)     // Catch:{ all -> 0x0579 }
            X.2U7[] r1 = new X.AnonymousClass2U7[]{r2, r1}     // Catch:{ all -> 0x0579 }
            X.0hJ r4 = new X.0hJ     // Catch:{ all -> 0x0579 }
            r4.<init>(r1)     // Catch:{ all -> 0x0579 }
            X.PqI r3 = X.C74176PqI.A00     // Catch:{ all -> 0x0579 }
            X.PqJ r2 = X.C74177PqJ.A00     // Catch:{ all -> 0x0579 }
            X.Pe3 r1 = new X.Pe3     // Catch:{ all -> 0x0579 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0579 }
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()     // Catch:{ all -> 0x0579 }
            X.PcX r4 = new X.PcX     // Catch:{ all -> 0x0579 }
            r4.<init>(r1)     // Catch:{ all -> 0x0579 }
        L_0x0367:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0383
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r4)     // Catch:{ all -> 0x0579 }
            java.lang.Object r1 = r3.getKey()     // Catch:{ all -> 0x0579 }
            java.lang.Object r2 = X.JTS.A0h(r1, r5)     // Catch:{ all -> 0x0579 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0579 }
            java.lang.Object r1 = r3.getValue()     // Catch:{ all -> 0x0579 }
            r2.add(r1)     // Catch:{ all -> 0x0579 }
            goto L_0x0367
        L_0x0383:
            java.util.LinkedHashMap r7 = X.C51975G9x.A0o(r5)     // Catch:{ all -> 0x0579 }
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r5)     // Catch:{ all -> 0x0579 }
        L_0x038b:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0235
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r3)     // Catch:{ all -> 0x0579 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0579 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0579 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0579 }
            java.util.ArrayList r1 = X.0Yv.A1F(r1)     // Catch:{ all -> 0x0579 }
            java.util.List r1 = X.00k.A0W(r1)     // Catch:{ all -> 0x0579 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0579 }
            goto L_0x038b
        L_0x03ab:
            r0 = move-exception
            goto L_0x0578
        L_0x03ae:
            java.util.List r5 = X.C71086ObC.A01(r19)     // Catch:{ all -> 0x0579 }
            r1 = 800(0x320, float:1.121E-42)
            java.util.ArrayList r1 = X.00k.A0Q(r5, r1)     // Catch:{ all -> 0x0579 }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ all -> 0x0579 }
        L_0x03bc:
            boolean r1 = r17.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x04ad
            java.lang.Object r4 = r17.next()     // Catch:{ all -> 0x0579 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0579 }
            r1 = r21
            X.0qQ.A0B(r4, r1)     // Catch:{ all -> 0x0579 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0579 }
            r3 = r18
            long r1 = r3.toSeconds(r1)     // Catch:{ all -> 0x0579 }
            int r3 = (int) r1     // Catch:{ all -> 0x0579 }
            X.O4C r1 = r39.A02()     // Catch:{ all -> 0x0579 }
            X.MmV r1 = (X.C67354MmV) r1     // Catch:{ all -> 0x0579 }
            X.3oI r13 = r1.A00     // Catch:{ all -> 0x0579 }
            r13.assertNotSuspendingTransaction()     // Catch:{ all -> 0x0579 }
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = "UPDATE messages_table SET hidden = 1, hidden_ts_sec = "
            r2.append(r1)     // Catch:{ all -> 0x0579 }
            java.lang.String r15 = "?"
            r2.append(r15)     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = " WHERE hidden == 0 AND message_expiration_ts_sec IS NOT NULL AND item_id in ("
            r2.append(r1)     // Catch:{ all -> 0x0579 }
            int r1 = r4.size()     // Catch:{ all -> 0x0579 }
            X.1wO.A00(r2, r1)     // Catch:{ all -> 0x0579 }
            java.lang.String r9 = ")"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r9, r2)     // Catch:{ all -> 0x0579 }
            X.1WV r7 = r13.compileStatement(r1)     // Catch:{ all -> 0x0579 }
            long r1 = (long) r3     // Catch:{ all -> 0x0579 }
            r3 = r22
            r7.ADa(r3, r1)     // Catch:{ all -> 0x0579 }
            java.util.Iterator r16 = r4.iterator()     // Catch:{ all -> 0x0579 }
            r14 = 2
        L_0x0412:
            boolean r3 = r16.hasNext()     // Catch:{ all -> 0x0579 }
            if (r3 == 0) goto L_0x0422
            java.lang.String r3 = X.AnonymousClass7TE.A18(r16)     // Catch:{ all -> 0x0579 }
            r7.ADh(r14, r3)     // Catch:{ all -> 0x0579 }
            int r14 = r14 + 1
            goto L_0x0412
        L_0x0422:
            r13.beginTransaction()     // Catch:{ all -> 0x0579 }
            int r7 = r7.ATQ()     // Catch:{ all -> 0x04a7 }
            r13.setTransactionSuccessful()     // Catch:{ all -> 0x04a7 }
            r13.endTransaction()     // Catch:{ all -> 0x0579 }
            X.O4B r3 = r39.A01()     // Catch:{ all -> 0x0579 }
            X.NT9 r3 = (X.NT9) r3     // Catch:{ all -> 0x0579 }
            X.3oI r13 = r3.A00     // Catch:{ all -> 0x0579 }
            r13.assertNotSuspendingTransaction()     // Catch:{ all -> 0x0579 }
            java.lang.StringBuilder r14 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0579 }
            java.lang.String r3 = "UPDATE message_updates_table SET hidden_ts_sec = "
            r14.append(r3)     // Catch:{ all -> 0x0579 }
            r14.append(r15)     // Catch:{ all -> 0x0579 }
            java.lang.String r3 = " WHERE target_item_id in ("
            r14.append(r3)     // Catch:{ all -> 0x0579 }
            int r3 = r4.size()     // Catch:{ all -> 0x0579 }
            X.1wO.A00(r14, r3)     // Catch:{ all -> 0x0579 }
            java.lang.String r3 = X.AnonymousClass7TF.A0l(r9, r14)     // Catch:{ all -> 0x0579 }
            X.1WV r9 = r13.compileStatement(r3)     // Catch:{ all -> 0x0579 }
            r3 = r22
            r9.ADa(r3, r1)     // Catch:{ all -> 0x0579 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0579 }
            r2 = 2
        L_0x0464:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0474
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)     // Catch:{ all -> 0x0579 }
            r9.ADh(r2, r1)     // Catch:{ all -> 0x0579 }
            int r2 = r2 + 1
            goto L_0x0464
        L_0x0474:
            r13.beginTransaction()     // Catch:{ all -> 0x0579 }
            r9.ATQ()     // Catch:{ all -> 0x04a7 }
            r13.setTransactionSuccessful()     // Catch:{ all -> 0x04a7 }
            r13.endTransaction()     // Catch:{ all -> 0x0579 }
            int r1 = r4.size()     // Catch:{ all -> 0x0579 }
            if (r7 == r1) goto L_0x04a2
            X.0wj r3 = X.0wj.A01     // Catch:{ all -> 0x0579 }
            r2 = 601242076(0x23d639dc, float:2.3226431E-17)
            java.lang.String r1 = "Fake reverb unexpected number of rows affected"
            X.0f9 r3 = r3.AEf(r1, r2)     // Catch:{ all -> 0x0579 }
            int r2 = r4.size()     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = "message count"
            r3.ABO(r1, r2)     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = "affected rows"
            r3.ABO(r1, r7)     // Catch:{ all -> 0x0579 }
            r3.report()     // Catch:{ all -> 0x0579 }
        L_0x04a2:
            r4.size()     // Catch:{ all -> 0x0579 }
            goto L_0x03bc
        L_0x04a7:
            r0 = move-exception
            r13.endTransaction()     // Catch:{ all -> 0x0579 }
            goto L_0x0578
        L_0x04ad:
            if (r8 == 0) goto L_0x04b0
            goto L_0x04b2
        L_0x04b0:
            r1 = 0
            goto L_0x04b6
        L_0x04b2:
            java.util.List r1 = X.C71086ObC.A01(r8)     // Catch:{ all -> 0x0579 }
        L_0x04b6:
            r5.size()     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x04be
            r1.size()     // Catch:{ all -> 0x0579 }
        L_0x04be:
            X.O4C r3 = r39.A02()     // Catch:{ all -> 0x0579 }
            X.MmV r3 = (X.C67354MmV) r3     // Catch:{ all -> 0x0579 }
            java.lang.String r2 = "SELECT message_expiration_ts_sec FROM messages_table WHERE hidden == 0 AND message_expiration_ts_sec IS NOT NULL ORDER BY message_expiration_ts_sec ASC LIMIT 1"
            r1 = r21
            X.1WY r4 = X.1Wa.A00(r2, r1)     // Catch:{ all -> 0x0579 }
            X.3oI r1 = r3.A00     // Catch:{ all -> 0x0579 }
            r1.assertNotSuspendingTransaction()     // Catch:{ all -> 0x0579 }
            r3 = 0
            android.database.Cursor r2 = r1.query((X.AnonymousClass1WA) r4, (android.os.CancellationSignal) r12)     // Catch:{ all -> 0x0579 }
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x0571 }
            if (r1 == 0) goto L_0x04ea
            r1 = r21
            boolean r1 = r2.isNull(r1)     // Catch:{ all -> 0x0571 }
            if (r1 != 0) goto L_0x04ea
            r1 = r21
            java.lang.Integer r3 = X.C66581MXm.A0n(r2, r1)     // Catch:{ all -> 0x0571 }
        L_0x04ea:
            r2.close()     // Catch:{ all -> 0x0579 }
            r4.A00()     // Catch:{ all -> 0x0579 }
            r7 = 0
            if (r3 == 0) goto L_0x04f7
            java.lang.Long r12 = X.C51969G9p.A0r(r3)     // Catch:{ all -> 0x0579 }
        L_0x04f7:
            if (r20 == 0) goto L_0x0532
            X.Mdg r3 = X.O4V.A00     // Catch:{ all -> 0x0579 }
            r1 = r20
            com.instagram.common.session.UserSession r2 = r1.A00     // Catch:{ all -> 0x0579 }
            X.Pnl r1 = X.C74020Pnl.A00     // Catch:{ all -> 0x0579 }
            com.google.common.util.concurrent.SettableFuture r2 = r3.A01(r2, r1)     // Catch:{ all -> 0x0579 }
            java.lang.String r1 = "Synchronous disappearing messages expiration seconds fetch"
            r3 = 0
            X.0eP r1 = X.C66840MdY.A06(r1, r2, r3)     // Catch:{ all -> 0x0579 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x0579 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0532
            long r1 = r1.longValue()     // Catch:{ all -> 0x0579 }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0579 }
            if (r5 == 0) goto L_0x0532
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0532
            r3 = r18
            long r3 = r3.toSeconds(r1)     // Catch:{ all -> 0x0579 }
            int r2 = (int) r3     // Catch:{ all -> 0x0579 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0579 }
            if (r1 == 0) goto L_0x0532
            java.lang.Long r7 = X.DbS.A0j(r2)     // Catch:{ all -> 0x0579 }
        L_0x0532:
            if (r12 == 0) goto L_0x0547
            if (r7 == 0) goto L_0x0548
            long r3 = r12.longValue()     // Catch:{ all -> 0x0579 }
            long r1 = r7.longValue()     // Catch:{ all -> 0x0579 }
            long r1 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x0579 }
            java.lang.Long r12 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0579 }
            goto L_0x0548
        L_0x0547:
            r12 = r7
        L_0x0548:
            if (r12 == 0) goto L_0x0567
            long r1 = r12.longValue()     // Catch:{ all -> 0x0579 }
            long r3 = r6.A00     // Catch:{ all -> 0x0579 }
            long r10 = r10 + r3
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x0556
            r1 = r10
        L_0x0556:
            r4 = 7
            X.Iwh r3 = new X.Iwh     // Catch:{ all -> 0x0579 }
            r3.<init>(r1, r6, r4)     // Catch:{ all -> 0x0579 }
            X.61K r2 = X.AnonymousClass61K.IGD_MEM     // Catch:{ all -> 0x0579 }
            r1 = 12
            X.PqK r1 = X.C74178PqK.A00(r3, r1)     // Catch:{ all -> 0x0579 }
            X.C67471MoQ.A01(r0, r2, r1)     // Catch:{ all -> 0x0579 }
        L_0x0567:
            monitor-exit(r6)
            return
        L_0x0569:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0579 }
            r8.A00()     // Catch:{ all -> 0x0579 }
            goto L_0x0578
        L_0x0571:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0579 }
            r4.A00()     // Catch:{ all -> 0x0579 }
        L_0x0578:
            throw r0     // Catch:{ all -> 0x0579 }
        L_0x0579:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NRQ.run():void");
    }
}
