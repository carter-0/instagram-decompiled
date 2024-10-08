package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MmS  reason: case insensitive filesystem */
public final class C67351MmS {
    public final UserSession A00;
    public final C67353MmU A01;
    public final C282375Cv A02;
    public final List A03 = 0sr.A1P(new Integer[]{13, 15, 14});

    /* JADX WARNING: type inference failed for: r1v0, types: [X.NtE, java.lang.Object] */
    public C67351MmS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C67353MmU(userSession, new Object());
        C282375Cv A002 = C282375Cv.A00(userSession);
        0qQ.A07(A002);
        this.A02 = A002;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134 A[LOOP:2: B:42:0x012e->B:44:0x0134, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r36) {
        /*
            r35 = this;
            r0 = r35
            X.MmU r11 = r0.A01
            com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase r0 = r11.A02
            r34 = r0
            X.O4C r4 = r34.A02()
            X.MmV r4 = (X.C67354MmV) r4
            java.lang.String r2 = "SELECT * FROM messages_table WHERE hidden == 1 AND hidden_ts_sec < ?"
            r1 = 1
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r9 = X.1Wa.A00(r2, r1)
            r0 = r36
            long r2 = (long) r0
            r9.ADa(r1, r2)
            X.3oI r0 = r4.A00
            r0.assertNotSuspendingTransaction()
            r8 = 0
            android.database.Cursor r0 = r0.query((X.AnonymousClass1WA) r9, (android.os.CancellationSignal) r8)
            java.lang.String r4 = "thread_jid"
            int r19 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "sender_jid"
            int r18 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "item_id"
            int r17 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "payload"
            int r16 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "payload_blob"
            int r7 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "hidden"
            int r15 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "shh"
            int r14 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "offline_threading_id"
            int r13 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "message_expiration_ts_sec"
            int r6 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "hidden_ts_sec"
            int r5 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.lang.String r4 = "message_deletion_ts_sec"
            int r4 = X.1Wd.A01(r0, r4)     // Catch:{ all -> 0x027e }
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0o(r0)     // Catch:{ all -> 0x027e }
        L_0x006d:
            boolean r10 = r0.moveToNext()     // Catch:{ all -> 0x027e }
            if (r10 == 0) goto L_0x00e8
            r10 = r19
            long r29 = r0.getLong(r10)     // Catch:{ all -> 0x027e }
            r10 = r18
            long r31 = r0.getLong(r10)     // Catch:{ all -> 0x027e }
            r10 = r17
            java.lang.String r24 = r0.getString(r10)     // Catch:{ all -> 0x027e }
            r10 = r16
            java.lang.String r25 = r0.getString(r10)     // Catch:{ all -> 0x027e }
            boolean r10 = r0.isNull(r7)     // Catch:{ all -> 0x027e }
            if (r10 == 0) goto L_0x0094
            r27 = 0
            goto L_0x0098
        L_0x0094:
            byte[] r27 = r0.getBlob(r7)     // Catch:{ all -> 0x027e }
        L_0x0098:
            int r10 = r0.getInt(r15)     // Catch:{ all -> 0x027e }
            r33 = 0
            if (r10 == 0) goto L_0x00a2
            r33 = 1
        L_0x00a2:
            int r28 = r0.getInt(r14)     // Catch:{ all -> 0x027e }
            java.lang.String r26 = r0.getString(r13)     // Catch:{ all -> 0x027e }
            boolean r10 = r0.isNull(r6)     // Catch:{ all -> 0x027e }
            if (r10 == 0) goto L_0x00b3
            r21 = 0
            goto L_0x00bb
        L_0x00b3:
            int r10 = r0.getInt(r6)     // Catch:{ all -> 0x027e }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x027e }
        L_0x00bb:
            boolean r10 = r0.isNull(r5)     // Catch:{ all -> 0x027e }
            if (r10 == 0) goto L_0x00c4
            r22 = 0
            goto L_0x00cc
        L_0x00c4:
            int r10 = r0.getInt(r5)     // Catch:{ all -> 0x027e }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x027e }
        L_0x00cc:
            boolean r10 = r0.isNull(r4)     // Catch:{ all -> 0x027e }
            if (r10 == 0) goto L_0x00d5
            r23 = 0
            goto L_0x00dd
        L_0x00d5:
            int r10 = r0.getInt(r4)     // Catch:{ all -> 0x027e }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x027e }
        L_0x00dd:
            X.8xC r10 = new X.8xC     // Catch:{ all -> 0x027e }
            r20 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x027e }
            r12.add(r10)     // Catch:{ all -> 0x027e }
            goto L_0x006d
        L_0x00e8:
            r0.close()
            r9.A00()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x027d
            java.util.Iterator r9 = r12.iterator()
        L_0x00f8:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r0 = r9.next()
            X.8xC r0 = (X.C370868xC) r0
            com.instagram.common.session.UserSession r5 = r11.A00
            byte[] r0 = r0.A0A
            if (r0 == 0) goto L_0x0188
            r4 = 0
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = X.C71037Oa0.A00(r0)
            if (r0 == 0) goto L_0x011f
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r0 = r0.A0L()
            if (r0 == 0) goto L_0x011f
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r6 = r0.content_
            if (r6 != 0) goto L_0x013e
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r6 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
            if (r6 != 0) goto L_0x013e
        L_0x011f:
            X.0sn r6 = X.0sn.A00
        L_0x0121:
            X.0eM r0 = X.C71105Ocj.A05
            X.Ocj r5 = X.C69851NtF.A00(r5)
            X.0qQ.A0B(r6, r4)
            java.util.Iterator r4 = r6.iterator()
        L_0x012e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            X.C71105Ocj.A02(r5, r0, r1)
            goto L_0x012e
        L_0x013e:
            int r7 = r6.addMessageContentCase_
            r0 = 5
            if (r7 != r0) goto L_0x015c
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = r6.A0L()
            X.0qQ.A07(r0)
            X.3su r7 = new X.3su
            r7.<init>()
            r7.A0f()
            X.C71113Od4.A04(r5, r8, r0, r7, r4)
        L_0x0155:
            X.OYz r0 = X.C71023OYz.A00
            java.util.List r6 = r0.A01(r7)
            goto L_0x0121
        L_0x015c:
            if (r7 != r1) goto L_0x011f
            com.instagram.direct.armadilloexpress.transportpayload.Text r0 = r6.A0N()
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x011f
            com.instagram.direct.armadilloexpress.transportpayload.Text r0 = r6.A0N()
            com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData r0 = r0.powerUpData_
            if (r0 != 0) goto L_0x0172
            com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData r0 = com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData.DEFAULT_INSTANCE
        L_0x0172:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x011f
            X.3su r7 = new X.3su
            r7.<init>()
            com.instagram.direct.armadilloexpress.transportpayload.Text r0 = r6.A0N()
            X.0qQ.A07(r0)
            X.C70060Nwc.A00(r5, r0, r7)
            goto L_0x0155
        L_0x0188:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x018d:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r12)
            java.util.Iterator r4 = r12.iterator()
        L_0x0195:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r4.next()
            X.8xC r0 = (X.C370868xC) r0
            java.lang.String r0 = r0.A06
            r5.add(r0)
            goto L_0x0195
        L_0x01a7:
            r0 = 800(0x320, float:1.121E-42)
            java.util.ArrayList r0 = X.00k.A0Q(r5, r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x01b1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x021c
            java.lang.Object r5 = r8.next()
            java.util.List r5 = (java.util.List) r5
            X.O4C r0 = r34.A02()
            X.MmV r0 = (X.C67354MmV) r0
            X.3oI r7 = r0.A00
            r7.assertNotSuspendingTransaction()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "DELETE FROM messages_table WHERE hidden == 1 AND hidden_ts_sec < "
            r4.append(r0)
            java.lang.String r0 = "?"
            r4.append(r0)
            java.lang.String r0 = " AND item_id in ("
            r4.append(r0)
            int r0 = r5.size()
            X.1wO.A00(r4, r0)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.1WV r6 = r7.compileStatement(r0)
            r6.ADa(r1, r2)
            java.util.Iterator r5 = r5.iterator()
            r4 = 2
        L_0x01f8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x020a
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            r6.ADh(r4, r0)
            int r4 = r4 + 1
            goto L_0x01f8
        L_0x020a:
            r7.beginTransaction()
            r6.ATQ()     // Catch:{ all -> 0x0217 }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0217 }
            r7.endTransaction()
            goto L_0x01b1
        L_0x0217:
            r1 = move-exception
            r7.endTransaction()
            throw r1
        L_0x021c:
            X.O4B r0 = r34.A01()
            X.NT9 r0 = (X.NT9) r0
            X.3oI r6 = r0.A00
            r6.assertNotSuspendingTransaction()
            X.1Vg r5 = r0.A01
            X.1WV r4 = r5.acquire()
            r4.ADa(r1, r2)
            r6.beginTransaction()     // Catch:{ all -> 0x0278 }
            r4.ATQ()     // Catch:{ all -> 0x0273 }
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0273 }
            r6.endTransaction()     // Catch:{ all -> 0x0278 }
            r5.release(r4)
            java.lang.String r0 = "0"
            java.lang.String r5 = X.C2611348j.A04(r0, r2)
            com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageDeletesDao r0 = r34.A00()
            X.NT8 r0 = (X.NT8) r0
            X.3oI r4 = r0.A00
            r4.assertNotSuspendingTransaction()
            X.1Vg r3 = r0.A01
            X.1WV r2 = r3.acquire()
            r2.ADh(r1, r5)
            r4.beginTransaction()     // Catch:{ all -> 0x026e }
            r2.ATQ()     // Catch:{ all -> 0x0269 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0269 }
            r4.endTransaction()     // Catch:{ all -> 0x026e }
            r3.release(r2)
            return
        L_0x0269:
            r0 = move-exception
            r4.endTransaction()     // Catch:{ all -> 0x026e }
            throw r0     // Catch:{ all -> 0x026e }
        L_0x026e:
            r1 = move-exception
            r3.release(r2)
            throw r1
        L_0x0273:
            r0 = move-exception
            r6.endTransaction()     // Catch:{ all -> 0x0278 }
            throw r0     // Catch:{ all -> 0x0278 }
        L_0x0278:
            r1 = move-exception
            r5.release(r4)
            throw r1
        L_0x027d:
            return
        L_0x027e:
            r1 = move-exception
            r0.close()
            r9.A00()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67351MmS.A00(int):void");
    }
}
