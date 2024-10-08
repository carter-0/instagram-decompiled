package com.instagram.direct.realtime.armadilloexpress.plugins.adapter;

import X.002;
import X.0Tu;
import X.0nY;
import X.0ng;
import X.0qQ;
import X.182;
import X.1OS;
import X.1Ou;
import X.AnonymousClass000;
import X.AnonymousClass45R;
import X.AnonymousClass4D7;
import X.AnonymousClass5OS;
import X.AnonymousClass632;
import X.AnonymousClass681;
import X.AnonymousClass68J;
import X.AnonymousClass7TE;
import X.C283115Ge;
import X.C61480nO;
import X.C66580MXl;
import X.C66845Mdd;
import X.C67471MoQ;
import X.C69511Nmt;
import X.C69513Nmv;
import X.C70134Nxo;
import X.C70143Nxx;
import X.C70145Nxz;
import X.C70177NyV;
import X.C70628ODz;
import X.C71074Oat;
import X.C71717Opb;
import X.C72186Oxv;
import X.DbT;
import X.DbY;
import X.LLR;
import X.NRQ;
import X.NRR;
import X.OH2;
import X.OSI;
import X.OUf;
import X.R4O;
import X.R5b;
import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import com.instagram.direct.securityalert.data.SecurityAlertRepository$handleParticipantDeviceChange$2;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Set;

public final class InstagramAdapterPluginPremailbox extends Premailbox {
    public static final C70145Nxz Companion = new Object();
    public static final String TAG = "InstagramAdapterPluginPremailbox";
    public final MsysActiveUserSession msysActiveUserSession;
    public final C72186Oxv outgoingMessageCache;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstagramAdapterPluginPremailbox(MsysActiveUserSession msysActiveUserSession2) {
        super(msysActiveUserSession2);
        0qQ.A0B(msysActiveUserSession2, 1);
        this.msysActiveUserSession = msysActiveUserSession2;
        this.outgoingMessageCache = C70177NyV.A00(msysActiveUserSession2.userSession);
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_CheckMessageExists(long j, String str) {
        return false;
    }

    public void ArmadilloExpressMCPPluginAndroidAdapter_ExecuteTask(String str) {
        C61480nO A00;
        0ng nrr;
        0qQ.A0B(str, 0);
        UserSession userSession = this.msysActiveUserSession.userSession;
        synchronized (OSI.A00) {
            0qQ.A0B(userSession, 0);
            if (str.equals("ephemeral_expiration")) {
                A00 = 0nY.A00();
                nrr = new NRQ(userSession);
            } else if (str.equals("ephemeral_deletion")) {
                A00 = 0nY.A00();
                nrr = new NRR(userSession);
            }
            A00.ATE(nrr);
        }
    }

    public Long ArmadilloExpressMCPPluginAndroidAdapter_HandleCreateAppDataThreadIDForPersistenceStore(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        return C71074Oat.A00(bArr);
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleInsertPlaceholder(long j, int i, int i2, int i3, long j2, long j3, String str, int i4, long j4) {
        String str2 = str;
        0qQ.A0B(str2, 6);
        C70143Nxx.A00(this.msysActiveUserSession.userSession, str2, i, i2, i3, i4, j4, j, j2, j3);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.8xC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.8xC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.N35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.N35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.N35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.8xC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: X.N35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.N35} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: X.8xC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.8xC} */
    /* JADX WARNING: type inference failed for: r6v13, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.mcrypto.mem.OutgoingMessage ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent(long r43, int r45, java.lang.String r46) {
        /*
            r42 = this;
            r0 = 0
            r1 = 2
            r4 = r46
            X.0qQ.A0B(r4, r1)
            r1 = r42
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r1 = r1.msysActiveUserSession
            com.instagram.common.session.UserSession r6 = r1.userSession
            r26 = 0
            r1 = r26
            X.0qQ.A0B(r6, r1)
            X.5Cv r1 = X.C282375Cv.A00(r6)
            X.0qQ.A07(r1)
            r1 = 13
            java.lang.String r5 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r1, r4)
            if (r5 != 0) goto L_0x002b
            r1 = 15
            java.lang.String r5 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r1, r4)
            if (r5 == 0) goto L_0x0032
        L_0x002b:
            r3 = 1262(0x4ee, float:1.768E-42)
            r2 = r26
            X.C282375Cv.A03(r5, r0, r2, r3, r2)
        L_0x0032:
            X.MmS r1 = X.C66833MdR.A00(r6)
            X.MmU r1 = r1.A01
            com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase r1 = r1.A02
            r41 = r1
            X.O4C r5 = r41.A02()
            X.MmV r5 = (X.C67354MmV) r5
            java.lang.String r3 = "SELECT * FROM messages_table WHERE offline_threading_id == ? ORDER BY item_id DESC LIMIT 1"
            r1 = 1
            java.util.TreeMap r2 = X.1WY.A08
            X.1WY r9 = X.1Wa.A00(r3, r1)
            r9.ADh(r1, r4)
            X.3oI r2 = r5.A00
            r2.assertNotSuspendingTransaction()
            r3 = 0
            android.database.Cursor r2 = r2.query((X.AnonymousClass1WA) r9, (android.os.CancellationSignal) r0)
            java.lang.String r25 = "thread_jid"
            r5 = r25
            int r15 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r24 = "sender_jid"
            r5 = r24
            int r13 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r23 = "item_id"
            r5 = r23
            int r11 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r22 = "payload"
            r5 = r22
            int r10 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r21 = "payload_blob"
            r5 = r21
            int r6 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r5 = "hidden"
            int r18 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r5 = "shh"
            int r12 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r14 = "offline_threading_id"
            int r17 = X.1Wd.A01(r2, r14)     // Catch:{ all -> 0x02e8 }
            java.lang.String r5 = "message_expiration_ts_sec"
            int r5 = X.1Wd.A01(r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r20 = "hidden_ts_sec"
            r7 = r20
            int r7 = X.1Wd.A01(r2, r7)     // Catch:{ all -> 0x02e8 }
            java.lang.String r8 = "message_deletion_ts_sec"
            int r8 = X.1Wd.A01(r2, r8)     // Catch:{ all -> 0x02e8 }
            boolean r16 = r2.moveToFirst()     // Catch:{ all -> 0x02e8 }
            if (r16 == 0) goto L_0x010a
            long r36 = r2.getLong(r15)     // Catch:{ all -> 0x02e8 }
            long r38 = r2.getLong(r13)     // Catch:{ all -> 0x02e8 }
            java.lang.String r31 = r2.getString(r11)     // Catch:{ all -> 0x02e8 }
            java.lang.String r32 = r2.getString(r10)     // Catch:{ all -> 0x02e8 }
            boolean r10 = r2.isNull(r6)     // Catch:{ all -> 0x02e8 }
            if (r10 == 0) goto L_0x00c5
            r34 = r0
            goto L_0x00c9
        L_0x00c5:
            byte[] r34 = r2.getBlob(r6)     // Catch:{ all -> 0x02e8 }
        L_0x00c9:
            r6 = r18
            int r6 = r2.getInt(r6)     // Catch:{ all -> 0x02e8 }
            boolean r40 = X.AnonymousClass7TF.A1P(r6)
            int r35 = r2.getInt(r12)     // Catch:{ all -> 0x02e8 }
            r6 = r17
            java.lang.String r33 = r2.getString(r6)     // Catch:{ all -> 0x02e8 }
            boolean r6 = r2.isNull(r5)     // Catch:{ all -> 0x02e8 }
            if (r6 == 0) goto L_0x00e6
            r28 = r0
            goto L_0x00ea
        L_0x00e6:
            java.lang.Integer r28 = X.C66581MXm.A0n(r2, r5)     // Catch:{ all -> 0x02e8 }
        L_0x00ea:
            boolean r5 = r2.isNull(r7)     // Catch:{ all -> 0x02e8 }
            if (r5 == 0) goto L_0x00f3
            r29 = r0
            goto L_0x00f7
        L_0x00f3:
            java.lang.Integer r29 = X.C66581MXm.A0n(r2, r7)     // Catch:{ all -> 0x02e8 }
        L_0x00f7:
            boolean r5 = r2.isNull(r8)     // Catch:{ all -> 0x02e8 }
            if (r5 != 0) goto L_0x0101
            java.lang.Integer r3 = X.C66581MXm.A0n(r2, r8)     // Catch:{ all -> 0x02e8 }
        L_0x0101:
            r30 = r3
            X.8xC r3 = new X.8xC     // Catch:{ all -> 0x02e8 }
            r27 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)     // Catch:{ all -> 0x02e8 }
        L_0x010a:
            r2.close()
            r9.A00()
            if (r3 != 0) goto L_0x0129
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r0)
        L_0x0117:
            java.lang.Object r3 = r2.A00
            java.lang.Object r2 = r2.A01
            X.O63 r2 = (X.O63) r2
            r9 = 0
            r19 = 3
            java.lang.Integer r18 = java.lang.Integer.valueOf(r19)
            if (r3 == 0) goto L_0x0144
            if (r2 == 0) goto L_0x0144
            goto L_0x0139
        L_0x0129:
            java.lang.String r5 = r3.A06
            byte[] r3 = r3.A0A
            if (r3 == 0) goto L_0x02e3
            X.O63 r2 = new X.O63
            r2.<init>(r3)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r5, r2)
            goto L_0x0117
        L_0x0139:
            byte[] r0 = r2.A00     // Catch:{ NnD -> 0x02c7 }
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r2 = X.C71037Oa0.A00(r0)     // Catch:{ NnD -> 0x02c7 }
            X.0qQ.A0B(r2, r1)     // Catch:{ NnD -> 0x02c7 }
            goto L_0x028a
        L_0x0144:
            X.O4B r3 = r41.A01()
            X.NT9 r3 = (X.NT9) r3
            java.lang.String r2 = "SELECT * FROM message_updates_table WHERE offline_threading_id == ? ORDER BY item_id DESC LIMIT 1"
            X.1WY r8 = X.1Wa.A00(r2, r1)
            r8.ADh(r1, r4)
            X.3oI r2 = r3.A00
            r2.assertNotSuspendingTransaction()
            r6 = 0
            android.database.Cursor r5 = r2.query((X.AnonymousClass1WA) r8, (android.os.CancellationSignal) r0)
            r2 = r25
            int r15 = X.1Wd.A01(r5, r2)     // Catch:{ all -> 0x02db }
            r2 = r24
            int r13 = X.1Wd.A01(r5, r2)     // Catch:{ all -> 0x02db }
            r2 = r23
            int r11 = X.1Wd.A01(r5, r2)     // Catch:{ all -> 0x02db }
            java.lang.String r3 = "target_item_id"
            int r10 = X.1Wd.A01(r5, r3)     // Catch:{ all -> 0x02db }
            r2 = r22
            int r12 = X.1Wd.A01(r5, r2)     // Catch:{ all -> 0x02db }
            r2 = r21
            int r7 = X.1Wd.A01(r5, r2)     // Catch:{ all -> 0x02db }
            int r17 = X.1Wd.A01(r5, r14)     // Catch:{ all -> 0x02db }
            r2 = r20
            int r2 = X.1Wd.A01(r5, r2)     // Catch:{ all -> 0x02db }
            boolean r16 = r5.moveToFirst()     // Catch:{ all -> 0x02db }
            if (r16 == 0) goto L_0x01cb
            long r34 = r5.getLong(r15)     // Catch:{ all -> 0x02db }
            long r36 = r5.getLong(r13)     // Catch:{ all -> 0x02db }
            java.lang.String r29 = r5.getString(r11)     // Catch:{ all -> 0x02db }
            java.lang.String r30 = r5.getString(r10)     // Catch:{ all -> 0x02db }
            java.lang.String r31 = r5.getString(r12)     // Catch:{ all -> 0x02db }
            boolean r10 = r5.isNull(r7)     // Catch:{ all -> 0x02db }
            if (r10 == 0) goto L_0x01ae
            r33 = r0
            goto L_0x01b2
        L_0x01ae:
            byte[] r33 = r5.getBlob(r7)     // Catch:{ all -> 0x02db }
        L_0x01b2:
            r7 = r17
            java.lang.String r32 = r5.getString(r7)     // Catch:{ all -> 0x02db }
            boolean r7 = r5.isNull(r2)     // Catch:{ all -> 0x02db }
            if (r7 != 0) goto L_0x01c2
            java.lang.Integer r6 = X.C66581MXm.A0n(r5, r2)     // Catch:{ all -> 0x02db }
        L_0x01c2:
            r28 = r6
            X.N35 r6 = new X.N35     // Catch:{ all -> 0x02db }
            r27 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r36)     // Catch:{ all -> 0x02db }
        L_0x01cb:
            r5.close()
            r8.A00()
            if (r6 != 0) goto L_0x01f9
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r0)
        L_0x01d8:
            java.lang.Object r2 = r2.A01
            X.O63 r2 = (X.O63) r2
            if (r2 != 0) goto L_0x027b
            com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageDeletesDao r6 = r41.A00()
            X.NT8 r6 = (X.NT8) r6
            java.lang.String r2 = "SELECT * FROM message_deletes_table WHERE offline_threading_id == ? ORDER BY item_id DESC LIMIT 1"
            X.1WY r5 = X.1Wa.A00(r2, r1)
            r5.ADh(r1, r4)
            X.3oI r2 = r6.A00
            r2.assertNotSuspendingTransaction()
            r15 = 0
            r6 = 0
            android.database.Cursor r4 = r2.query((X.AnonymousClass1WA) r5, (android.os.CancellationSignal) r0)
            goto L_0x0209
        L_0x01f9:
            java.lang.String r7 = r6.A03
            byte[] r5 = r6.A07
            if (r5 == 0) goto L_0x02d6
            X.O63 r2 = new X.O63
            r2.<init>(r5)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r7, r2)
            goto L_0x01d8
        L_0x0209:
            r2 = r25
            int r8 = X.1Wd.A01(r4, r2)     // Catch:{ all -> 0x0260 }
            r2 = r24
            int r11 = X.1Wd.A01(r4, r2)     // Catch:{ all -> 0x0260 }
            r2 = r23
            int r12 = X.1Wd.A01(r4, r2)     // Catch:{ all -> 0x0260 }
            int r13 = X.1Wd.A01(r4, r3)     // Catch:{ all -> 0x0260 }
            r2 = r22
            int r7 = X.1Wd.A01(r4, r2)     // Catch:{ all -> 0x0260 }
            r2 = r21
            int r10 = X.1Wd.A01(r4, r2)     // Catch:{ all -> 0x0260 }
            int r3 = X.1Wd.A01(r4, r14)     // Catch:{ all -> 0x0260 }
            boolean r2 = r4.moveToFirst()     // Catch:{ all -> 0x0260 }
            if (r2 == 0) goto L_0x0268
            r4.getLong(r8)     // Catch:{ all -> 0x0260 }
            r4.getLong(r11)     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = r4.getString(r12)     // Catch:{ all -> 0x0260 }
            java.lang.String r8 = r4.getString(r13)     // Catch:{ all -> 0x0260 }
            java.lang.String r7 = r4.getString(r7)     // Catch:{ all -> 0x0260 }
            boolean r2 = r4.isNull(r10)     // Catch:{ all -> 0x0260 }
            if (r2 != 0) goto L_0x0251
            byte[] r6 = r4.getBlob(r10)     // Catch:{ all -> 0x0260 }
        L_0x0251:
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x0260 }
            r15 = 1
            r2 = r19
            X.C51973G9u.A0r(r2, r0, r8, r7)     // Catch:{ all -> 0x0260 }
            r2 = 7
            X.0qQ.A0B(r3, r2)     // Catch:{ all -> 0x0260 }
            goto L_0x0268
        L_0x0260:
            r0 = move-exception
            r4.close()
            r5.A00()
            throw r0
        L_0x0268:
            r4.close()
            r5.A00()
            if (r15 != 0) goto L_0x027e
            X.0eP r0 = new X.0eP
            r0.<init>(r9, r9)
        L_0x0275:
            java.lang.Object r2 = r0.A01
            X.O63 r2 = (X.O63) r2
            if (r2 == 0) goto L_0x02cf
        L_0x027b:
            byte[] r3 = r2.A00
            goto L_0x029c
        L_0x027e:
            if (r6 == 0) goto L_0x02d1
            X.O63 r2 = new X.O63
            r2.<init>(r6)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r2)
            goto L_0x0275
        L_0x028a:
            int r0 = r2.transportPayloadCase_
            if (r0 != r1) goto L_0x02cf
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r0 = r2.A0L()
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x02cf
            byte[] r3 = r2.A0H()
        L_0x029c:
            com.facebook.mcrypto.mem.PlaintextApplicationPayload r2 = new com.facebook.mcrypto.mem.PlaintextApplicationPayload
            r0 = r18
            r2.<init>(r3, r0)
            com.facebook.mcrypto.mem.EnvelopeProperties r0 = com.facebook.mcrypto.mem.EnvelopeProperties.$redex_init_class
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r26)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r45)
            r0 = 5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.facebook.mcrypto.mem.EnvelopeProperties r3 = new com.facebook.mcrypto.mem.EnvelopeProperties
            r7 = r6
            r10 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.facebook.mcrypto.mem.OutgoingMessage r0 = new com.facebook.mcrypto.mem.OutgoingMessage
            r0.<init>(r2, r3)
            return r0
        L_0x02c7:
            r2 = move-exception
            java.lang.String r1 = "ArmadilloExpressOutgoingMessageStatusPublisher"
            java.lang.String r0 = "Failed to retry message from Reverb"
            X.0KC.A0F(r1, r0, r2)
        L_0x02cf:
            r0 = 0
            return r0
        L_0x02d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02db:
            r0 = move-exception
            r5.close()
            r8.A00()
            throw r0
        L_0x02e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02e8:
            r0 = move-exception
            r2.close()
            r9.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.realtime.armadilloexpress.plugins.adapter.InstagramAdapterPluginPremailbox.ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent(long, int, java.lang.String):com.facebook.mcrypto.mem.OutgoingMessage");
    }

    public int ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageGetThreadMode(long j, String str) {
        return 5;
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageMarkMessageDelivered(String str, long j) {
        String str2;
        0qQ.A0B(str, 0);
        UserSession userSession = this.msysActiveUserSession.userSession;
        0qQ.A0B(userSession, 0);
        OH2 oh2 = (OH2) C70177NyV.A00(userSession).A00.remove(str);
        1Ou A01 = 1Ou.A01(userSession);
        if (oh2 != null) {
            str2 = oh2.A03.A05;
        } else {
            str2 = str;
        }
        1OS A08 = A01.A08(str2, (String) null, (String) null);
        if (A08 != null) {
            OUf oUf = OUf.A00;
            DirectThreadKey A012 = A08.A01();
            if (A012 != null) {
                oUf.A00(userSession, A08, A012, 1);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C70628ODz A00 = C70134Nxo.A00(userSession);
        Set set = A00.A01;
        if (set.contains(str)) {
            if (set.contains(str)) {
                A00.A00.markerPoint(20128010, str.hashCode(), 002.A0R("dr_pending", "_end"));
            }
            A00.A00.markerEnd(20128010, str.hashCode(), 2);
            set.remove(str);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0261, code lost:
        if (r16 != null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r4 != 7) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ff, code lost:
        if (X.AnonymousClass7F3.A01(r13, r0.A06) != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0201, code lost:
        if (r17 != null) goto L_0x0203;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageUpdateMessageStatus(long r46, java.lang.String r48, int r49, long r50, long r52, long r54) {
        /*
            r45 = this;
            r2 = 1
            r3 = r48
            X.0qQ.A0B(r3, r2)
            r0 = r45
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r0 = r0.msysActiveUserSession
            com.instagram.common.session.UserSession r4 = r0.userSession
            r18 = 0
            r0 = r18
            X.0qQ.A0B(r4, r0)
            r7 = 7
            X.Ple r1 = new X.Ple
            r1.<init>(r4, r7)
            java.lang.Class<X.ONf> r0 = X.C70833ONf.class
            java.lang.Object r1 = r4.A01(r0, r1)
            X.ONf r1 = (X.C70833ONf) r1
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.Long r4 = X.C66581MXm.A0r(r0, r4)
            if (r4 == 0) goto L_0x02d6
            long r29 = r4.longValue()
            r5 = 4
            r4 = r49
            r25 = r50
            if (r4 == r5) goto L_0x0287
            r5 = 5
            if (r4 == r5) goto L_0x0293
            r5 = 0
        L_0x003a:
            X.Oxv r6 = r1.A03
            java.util.concurrent.ConcurrentHashMap r6 = r6.A00
            r44 = r6
            java.lang.Object r6 = r6.get(r3)
            X.OH2 r6 = (X.OH2) r6
            X.OO1 r10 = r1.A04
            if (r6 == 0) goto L_0x0284
            X.1OS r8 = r6.A03
            java.lang.String r9 = r8.A05
        L_0x004e:
            r8 = 7049(0x1b89, float:9.878E-42)
            long r11 = (long) r4
            java.util.List r11 = X.C66582MXn.A10(r11)
            r10.A04(r11, r8, r9)
            X.MZB r8 = r1.A01
            r16 = r8
            if (r6 == 0) goto L_0x0281
            X.1OS r8 = r6.A03
        L_0x0060:
            X.NT6 r9 = new X.NT6
            r11 = r46
            r19 = r9
            r20 = r8
            r21 = r3
            r22 = r4
            r23 = r11
            r19.<init>(r20, r21, r22, r23, r25)
            r8 = r16
            r8.A00(r9)
            if (r5 == 0) goto L_0x00a0
            if (r6 != 0) goto L_0x02a7
            X.2Dm r5 = r1.A05
            X.3U9 r4 = r5.B34(r11)
            if (r4 == 0) goto L_0x009f
            com.instagram.model.direct.DirectThreadKey r0 = r4.BJz()
            X.3su r3 = r5.BRy(r0, r3)
            if (r3 == 0) goto L_0x009f
            java.lang.Integer r1 = r3.A1F
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x009f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r3.A2C = r2
            r3.A1F = r0
            com.instagram.model.direct.DirectThreadKey r0 = r4.BJz()
            r5.A9f(r3, r0, r2)
        L_0x009f:
            return r2
        L_0x00a0:
            if (r49 == 0) goto L_0x00b2
            if (r4 == r2) goto L_0x026d
            r5 = 2
            if (r4 == r5) goto L_0x0269
            r5 = 4
            if (r4 == r5) goto L_0x0265
            r5 = 5
            if (r4 == r5) goto L_0x0265
            r5 = 6
            if (r4 == r5) goto L_0x0269
            if (r4 == r7) goto L_0x0269
        L_0x00b2:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x00b4:
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            if (r5 != r4) goto L_0x009f
            if (r6 == 0) goto L_0x02cf
            int r10 = r3.hashCode()
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger r17 = X.AnonymousClass7G0.A00(r0, r10)
            if (r17 == 0) goto L_0x00c7
            r17.onLogArmadilloExpressSendEventListenerSendSuccessStart()
        L_0x00c7:
            long r4 = r6.A00
            r42 = r4
            X.1OS r9 = r6.A03
            com.instagram.model.direct.DirectThreadKey r5 = r6.A04
            X.MaY r4 = r9.A02
            X.ODs r7 = r4.A00
            if (r7 == 0) goto L_0x00d9
            X.Nkj r4 = r7.A00
            if (r4 != 0) goto L_0x00db
        L_0x00d9:
            X.Nkj r4 = X.C69405Nkj.UNRECOGNIZED
        L_0x00db:
            X.OUf r11 = X.OUf.A00
            r8 = r18
            X.0qQ.A0B(r0, r8)
            r11.A00(r0, r9, r5, r2)
            X.ODz r13 = X.C70134Nxo.A00(r0)
            java.util.Set r12 = r13.A01
            boolean r8 = r12.contains(r3)
            if (r8 == 0) goto L_0x0101
            X.02m r15 = r13.A00
            r14 = 20128010(0x133210a, float:3.2900812E-38)
            java.lang.String r11 = "queue_processing"
            java.lang.String r8 = "_end"
            java.lang.String r8 = X.002.A0R(r11, r8)
            r15.markerPoint(r14, r10, r8)
        L_0x0101:
            boolean r8 = r12.contains(r3)
            if (r8 == 0) goto L_0x0117
            X.02m r12 = r13.A00
            r11 = 20128010(0x133210a, float:3.2900812E-38)
            java.lang.String r13 = "dr_pending"
            java.lang.String r8 = "_start"
            java.lang.String r8 = X.002.A0R(r13, r8)
            r12.markerPoint(r11, r10, r8)
        L_0x0117:
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            java.lang.Long r23 = java.lang.Long.valueOf(r42)
            r8 = 0
            java.lang.String r12 = r5.A00
            X.NT7 r11 = new X.NT7
            r19 = r11
            r20 = r9
            r21 = r8
            r24 = r8
            r25 = r12
            r26 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r12 = r16
            r12.A00(r11)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r13 = r6.A01
            if (r17 == 0) goto L_0x013d
            r17.onLogHandleOutgoingPayloadStart()
        L_0x013d:
            r11 = 2
            X.Plo r12 = X.C73913Plo.A00(r0, r11)
            java.lang.Class<X.OE2> r11 = X.OE2.class
            java.lang.Object r12 = r0.A01(r11, r12)
            X.OE2 r12 = (X.OE2) r12
            r24 = 15
            com.instagram.common.session.UserSession r11 = r12.A00
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger r16 = X.AnonymousClass7G0.A00(r11, r10)
            boolean r14 = X.C308556Us.A05(r11)
            r10 = r52
            if (r14 == 0) goto L_0x0261
            if (r16 == 0) goto L_0x015f
            r16.onLogProcessDmMessageStart()
        L_0x015f:
            if (r7 == 0) goto L_0x0178
            X.ObC r15 = r12.A01
            boolean r14 = r13.isE2EeAttributed_
            r31 = r15
            r32 = r7
            r33 = r3
            r34 = r42
            r36 = r29
            r38 = r10
            r40 = r18
            r41 = r14
            r31.A04(r32, r33, r34, r36, r38, r40, r41)
        L_0x0178:
            if (r16 == 0) goto L_0x0180
            r16.onLogProcessDmMessageEnd()
        L_0x017d:
            r16.onLogMessageSyncStart()
        L_0x0180:
            X.OyQ r12 = r12.A02
            r25 = r54
            r20 = r13
            r21 = r4
            r22 = r3
            r23 = r8
            r27 = r42
            r31 = r10
            r33 = r18
            r19 = r12
            r19.A03(r20, r21, r22, r23, r24, r25, r27, r29, r31, r33)
            if (r16 == 0) goto L_0x019c
            r16.onLogMessageSyncEnd()
        L_0x019c:
            if (r17 == 0) goto L_0x01a1
            r17.onLogHandleOutgoingPayloadEnd()
        L_0x01a1:
            boolean r4 = r9 instanceof X.1bp
            if (r4 != 0) goto L_0x01a9
            boolean r4 = r9 instanceof X.AnonymousClass1g2
            if (r4 == 0) goto L_0x0201
        L_0x01a9:
            java.lang.String r12 = r9.A02()
            java.lang.String r4 = "edit_message"
            boolean r4 = X.0qQ.A0K(r12, r4)
            if (r4 != 0) goto L_0x0201
            java.lang.String r12 = r9.A02()
            r4 = 3960(0xf78, float:5.549E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r4 = X.0qQ.A0K(r12, r4)
            if (r4 != 0) goto L_0x0201
            java.lang.String r12 = r9.A02()
            r4 = 3959(0xf77, float:5.548E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r4 = X.0qQ.A0K(r12, r4)
            if (r4 != 0) goto L_0x0201
            boolean r12 = r9 instanceof X.AnonymousClass1g2
            if (r12 == 0) goto L_0x021e
            r15 = r9
            X.1g2 r15 = (X.AnonymousClass1g2) r15
            X.OW8 r4 = r15.A00
            java.lang.String r14 = r4.A04
            if (r14 != 0) goto L_0x01e8
            java.lang.String r4 = r4.A02
            java.lang.String r14 = X.C2611348j.A03(r4)
        L_0x01e8:
            X.2Dm r13 = X.2L2.A00(r0)
            com.instagram.model.direct.DirectThreadKey r4 = r15.A01
            X.0qQ.A07(r4)
            if (r14 == 0) goto L_0x02ca
            X.3su r13 = r13.BRy(r4, r14)
            if (r13 == 0) goto L_0x021e
            java.lang.String r4 = r0.A06
            boolean r4 = X.AnonymousClass7F3.A01(r13, r4)
            if (r4 == 0) goto L_0x021e
        L_0x0201:
            if (r17 == 0) goto L_0x0206
        L_0x0203:
            r17.onLogRemoveMessageContextStart()
        L_0x0206:
            r0 = r44
            r0.remove(r3)
            if (r17 == 0) goto L_0x0210
            r17.onLogRemoveMessageContextEnd()
        L_0x0210:
            java.lang.String r4 = r9.A05
            boolean r0 = r3.equals(r4)
            if (r0 != 0) goto L_0x0276
            X.1Ou r1 = r1.A02
            X.PD3 r0 = X.PD3.A00
            monitor-enter(r1)
            goto L_0x0271
        L_0x021e:
            if (r17 == 0) goto L_0x0223
            r17.onLogBumpThreadStart()
        L_0x0223:
            java.lang.String r13 = r5.A00
            if (r13 == 0) goto L_0x025b
            java.lang.String r10 = X.C2611348j.A04(r3, r10)
            long r4 = X.C2611348j.A01(r10)
            long r4 = X.AnonymousClass7TE.A0P(r4)
            if (r7 != 0) goto L_0x023a
            X.ODs r7 = new X.ODs
            r7.<init>()
        L_0x023a:
            X.MaY r0 = X.C66669Mac.A00(r0, r7)
            X.0qQ.A0B(r0, r2)
            X.1lL r7 = new X.1lL
            r7.<init>(r0)
            java.lang.String r0 = ""
            r7.A01 = r0
            r7.A02 = r13
            r7.A01 = r10
            r7.A00 = r4
            r0 = r18
            r7.A03 = r0
            r7.A04 = r12
            X.1Ou r0 = r1.A02
            r0.A0A(r7)
        L_0x025b:
            if (r17 == 0) goto L_0x0206
            r17.onLogBumpThreadEnd()
            goto L_0x0203
        L_0x0261:
            if (r16 == 0) goto L_0x0180
            goto L_0x017d
        L_0x0265:
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x00b4
        L_0x0269:
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            goto L_0x00b4
        L_0x026d:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            goto L_0x00b4
        L_0x0271:
            X.1Ou.A03(r0, r1, r4, r8)     // Catch:{ all -> 0x02c7 }
            monitor-exit(r1)
            goto L_0x027b
        L_0x0276:
            X.Pwk r0 = r6.A02
            r0.DTM(r8, r8)
        L_0x027b:
            if (r17 == 0) goto L_0x009f
            r17.onLogArmadilloExpressSendEventListenerSendSuccessEnd()
            return r2
        L_0x0281:
            r8 = 0
            goto L_0x0060
        L_0x0284:
            r9 = r3
            goto L_0x004e
        L_0x0287:
            X.Nku r9 = X.C69414Nku.A0A
            java.lang.String r10 = java.lang.String.valueOf(r25)
            r13 = 0
            java.lang.String r11 = "ae"
            java.lang.String r12 = "Secure message failed to send"
            goto L_0x029e
        L_0x0293:
            X.Nku r9 = X.C69414Nku.A0A
            java.lang.String r10 = java.lang.String.valueOf(r25)
            r13 = 1
            java.lang.String r11 = "ae"
            java.lang.String r12 = "Secure message send error"
        L_0x029e:
            X.4gN r5 = new X.4gN
            r14 = r13
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x003a
        L_0x02a7:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36327842706897655(0x810ffb00003af7, double:3.037212236098814E-306)
            boolean r0 = X.182.A06(r7, r0, r3)
            if (r0 == 0) goto L_0x02bb
            r3 = 2
            int r0 = (r50 > r3 ? 1 : (r50 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x02bb
            return r2
        L_0x02bb:
            X.1OS r0 = r6.A03
            java.lang.String r4 = r0.A05
            X.Pwk r3 = r6.A02
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = r6.A01
            r1.A01(r0, r3, r5, r4)
            return r2
        L_0x02c7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02cf:
            r1 = 0
            r0 = 7050(0x1b8a, float:9.879E-42)
            r10.A04(r1, r0, r3)
            return r2
        L_0x02d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.realtime.armadilloexpress.plugins.adapter.InstagramAdapterPluginPremailbox.ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageUpdateMessageStatus(long, java.lang.String, int, long, long, long):boolean");
    }

    public void InstagramAdapterPluginPremailboxExtensionsDestroy() {
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleIncomingPayload(long j, int i, int i2, long j2, long j3, String str, String str2, byte[] bArr, int i3, long j4) {
        throw AnonymousClass7TE.A15(AnonymousClass000.A00(114));
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.632, com.facebook.msys.mca.MailboxFeature] */
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantDeviceChange(long j, String str, int i, long j2, String str2, boolean z, boolean z2) {
        C69513Nmv nmv;
        AnonymousClass68J A00;
        String str3 = str;
        UserSession userSession = this.msysActiveUserSession.userSession;
        0qQ.A0B(userSession, 0);
        long j3 = j;
        int i2 = i;
        long j4 = j2;
        try {
            if (182.A06(0Tu.A06, userSession, 36321481861440950L)) {
                SecurityAlertRepository A002 = SecurityAlertRepository.A04.A00(userSession);
                boolean z3 = z;
                boolean z4 = z2;
                if (A002.A00) {
                    boolean A003 = AnonymousClass45R.A00(userSession);
                    AnonymousClass681 r0 = AnonymousClass632.A00;
                    if (A003) {
                        A00 = C67471MoQ.A00(userSession);
                    } else {
                        A00 = C66845Mdd.A00.A00(userSession);
                    }
                    0qQ.A0A(new MailboxFeature(A00).A00(C71717Opb.A00, str3, i2, j3, j4, z3, z4));
                } else {
                    AnonymousClass7TE.A1Z(new SecurityAlertRepository$handleParticipantDeviceChange$2(userSession, A002, str3, (AnonymousClass4D7) null, i2, j3, j4, z3, z4), A002.A01);
                }
            }
        } catch (Throwable unused) {
        }
        if (i2 == 1) {
            nmv = C69513Nmv.REPLACED;
        } else if (i2 == 2) {
            nmv = C69513Nmv.ADDED;
        } else if (i2 != 3) {
            nmv = C69513Nmv.A03;
        } else {
            nmv = C69513Nmv.REMOVED;
        }
        R4O A0I = TransportEvent.Event.DEFAULT_INSTANCE.A0I();
        R4O A0I2 = TransportEvent.Event.DeviceChange.DEFAULT_INSTANCE.A0I();
        TransportEvent.Event.DeviceChange deviceChange = (TransportEvent.Event.DeviceChange) C66580MXl.A0L(A0I2);
        deviceChange.type_ = nmv.A00;
        deviceChange.bitField0_ |= 1;
        if (str == null) {
            str3 = "";
        }
        TransportEvent.Event.DeviceChange deviceChange2 = (TransportEvent.Event.DeviceChange) C66580MXl.A0L(A0I2);
        deviceChange2.bitField0_ |= 2;
        deviceChange2.deviceName_ = str3;
        TransportEvent.Event event = (TransportEvent.Event) C66580MXl.A0L(A0I);
        R5b A02 = A0I2.A02();
        A02.getClass();
        event.event_ = A02;
        event.eventCase_ = 1;
        TransportEvent.Event event2 = (TransportEvent.Event) A0I.A02();
        C71074Oat oat = C71074Oat.A00;
        UserSession userSession2 = this.msysActiveUserSession.userSession;
        long A0P = AnonymousClass7TE.A0P(j4);
        0qQ.A0A(event2);
        return oat.A02(userSession2, event2, str2, j3, A0P);
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantICDCEvent(int i, long j, long j2) {
        C69511Nmt nmt;
        UserSession userSession = this.msysActiveUserSession.userSession;
        0qQ.A0B(userSession, 0);
        if (!DbY.A1Z(0Tu.A06, userSession, 36314489653561975L)) {
            return true;
        }
        if (i == 1) {
            nmt = C69511Nmt.DETECTED;
        } else if (i != 2) {
            nmt = C69511Nmt.A04;
        } else {
            nmt = C69511Nmt.CLEARED;
        }
        R4O A0I = TransportEvent.Event.DEFAULT_INSTANCE.A0I();
        R4O A0I2 = TransportEvent.Event.IcdcAlert.DEFAULT_INSTANCE.A0I();
        TransportEvent.Event.IcdcAlert icdcAlert = (TransportEvent.Event.IcdcAlert) C66580MXl.A0L(A0I2);
        icdcAlert.type_ = nmt.A00;
        icdcAlert.bitField0_ |= 1;
        TransportEvent.Event event = (TransportEvent.Event) C66580MXl.A0L(A0I);
        R5b A02 = A0I2.A02();
        A02.getClass();
        event.event_ = A02;
        event.eventCase_ = 2;
        TransportEvent.Event event2 = (TransportEvent.Event) A0I.A02();
        C71074Oat oat = C71074Oat.A00;
        UserSession userSession2 = this.msysActiveUserSession.userSession;
        long A0P = AnonymousClass7TE.A0P(j2);
        0qQ.A0A(event2);
        return oat.A02(userSession2, event2, (String) null, j, A0P);
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandlePeerDeviceChangeEvent(int i, int i2, int i3, Number number, String str, String str2, String str3, Number number2, Number number3, boolean z) {
        return LLR.A01(this.msysActiveUserSession.userSession, number, number2, number3, str, str2, str3, i, i2, i3);
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldMovePeerDeviceAdminMessageToSetting() {
        return AnonymousClass5OS.A00(this.msysActiveUserSession.userSession);
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistContactDeviceChangeAlert() {
        return DbT.A1a(C283115Ge.A00(this.msysActiveUserSession.userSession).A01, "is_contact_security_alert_enabled");
    }

    public boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistPeerDeviceChangeAlert() {
        return C283115Ge.A00(this.msysActiveUserSession.userSession).A02();
    }
}
