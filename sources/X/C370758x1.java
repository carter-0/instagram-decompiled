package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.8x1  reason: invalid class name and case insensitive filesystem */
public final class C370758x1 {
    public final UserSession A00;
    public final C370778x3 A01;
    public final AnonymousClass43S A02;
    public final int A03;
    public final AnonymousClass43L A04;

    public C370758x1(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C370768x2.A00(userSession);
        this.A03 = (int) 182.A01(0Tu.A05, userSession, 36592318203363770L);
        this.A04 = (AnonymousClass43L) userSession.A01(AnonymousClass43L.class, new C73911Plm(userSession, 43));
        this.A02 = (AnonymousClass43S) userSession.A01(AnonymousClass43S.class, new C73911Plm(userSession, 45));
    }

    /* JADX WARNING: type inference failed for: r12v19, types: [X.NAQ, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0173, code lost:
        if (X.11Z.A07() != false) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.common.session.UserSession r31, X.AnonymousClass7BV r32, X.B72 r33, java.lang.String r34) {
        /*
            r30 = this;
            r7 = 0
            r9 = r31
            X.0qQ.A0B(r9, r7)
            r14 = 1
            r8 = r33
            X.0qQ.A0B(r8, r14)
            r10 = 2
            r2 = r34
            X.0qQ.A0B(r2, r10)
            r3 = r30
            X.43L r4 = r3.A04
            r5 = r32
            if (r32 == 0) goto L_0x0025
            X.02m r11 = r4.A00
            int r6 = r5.A01
            int r1 = r5.A00
            java.lang.String r0 = "network_fetch_end"
            r11.markerPoint(r6, r1, r0)
        L_0x0025:
            X.8wb r0 = r8.A05
            if (r0 != 0) goto L_0x0037
            if (r32 == 0) goto L_0x0036
            X.02m r3 = r4.A00
            int r2 = r5.A01
            int r1 = r5.A00
            java.lang.String r0 = "server_response_has_no_inbox_page"
            r3.markerPoint(r2, r1, r0)
        L_0x0036:
            return
        L_0x0037:
            java.util.List r1 = r0.A05
            X.0qQ.A07(r1)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x004b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r1.next()
            X.5xS r0 = (X.C300585xS) r0
            java.lang.String r0 = r0.A1D
            r15.add(r0)
            goto L_0x004b
        L_0x005d:
            if (r32 == 0) goto L_0x0078
            X.02m r12 = r4.A00
            int r11 = r5.A01
            int r6 = r5.A00
            java.lang.String r0 = "reverb_process_inbox_network_response_start"
            r12.markerPoint(r11, r6, r0)
            java.lang.String r13 = ", "
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.00k.A0P(r13, r0, r0, r15, r1)
            java.lang.String r0 = "inbox_response_threads"
            r12.markerAnnotate(r11, r6, r0, r1)
        L_0x0078:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327666613369444(0x810fd200023a64, double:3.0371008738425015E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 == 0) goto L_0x00d1
            X.C370748x0.A00()
            r0 = 3
            X.Plo r1 = new X.Plo
            r1.<init>(r9, r0)
            java.lang.Class<X.OyQ> r0 = X.C72201OyQ.class
            java.lang.Object r12 = r9.A01(r0, r1)
            X.OyQ r12 = (X.C72201OyQ) r12
            com.instagram.common.session.UserSession r0 = r12.A02
            X.OUz r1 = X.C70144Nxy.A00(r0)
            r0 = 46
            X.PqK r11 = new X.PqK
            r11.<init>(r12, r0)
            com.instagram.common.session.UserSession r1 = r1.A00
            X.Mdd r0 = X.C66845Mdd.A00
            X.62u r0 = r0.A00(r1)
            X.NAQ r12 = new X.NAQ
            r12.<init>(r0)
            X.68J r0 = r12.mMailboxApiHandleMetaProvider
            X.68L r10 = r0.ASa(r10)
            com.facebook.msys.mca.MailboxFutureImpl r1 = new com.facebook.msys.mca.MailboxFutureImpl
            r1.<init>(r10)
            X.OoD r0 = new X.OoD
            r0.<init>(r12, r1)
            boolean r0 = r10.EJd(r0)
            if (r0 != 0) goto L_0x00c9
            r1.cancel(r7)
        L_0x00c9:
            X.Oo9 r0 = new X.Oo9
            r0.<init>(r11)
            r1.addResultCallback(r0)
        L_0x00d1:
            r0 = 36318892003760849(0x8107d700851ad1, double:3.031551775393509E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 != 0) goto L_0x02f0
            int r11 = r3.A03
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            X.8wb r0 = r8.A05
            java.util.List r0 = r0.A05
            X.0qQ.A07(r0)
            java.util.Iterator r17 = r0.iterator()
        L_0x00ee:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0143
            java.lang.Object r9 = r17.next()
            X.8wd r9 = (X.C370538wd) r9
            com.instagram.common.session.UserSession r0 = r3.A00
            boolean r0 = r9.A04(r0)
            if (r0 == 0) goto L_0x00ee
            java.lang.Long r0 = r9.A00()
            long r15 = r0.longValue()
            r12 = -1
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00ee
            java.util.List r0 = r9.A07
            X.0qQ.A07(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x011e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r12.next()
            X.3su r0 = (X.C254703su) r0
            java.lang.String r0 = r0.A1Y
            if (r0 == 0) goto L_0x011e
            r1.add(r0)
            goto L_0x011e
        L_0x0132:
            java.lang.String r0 = java.lang.String.valueOf(r15)
            r10.put(r0, r1)
            X.8x3 r1 = r3.A01
            if (r1 == 0) goto L_0x00ee
            java.lang.String r0 = "inbox_fetch_in_one_shot"
            r1.A00(r9, r0, r14)
            goto L_0x00ee
        L_0x0143:
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0337
            X.C370748x0.A00()
            com.instagram.common.session.UserSession r9 = r3.A00
            X.MdY r3 = X.C66843Mdb.A01(r9)
            r0 = 36600366978043759(0x8207d700600f6f, double:3.209557682538769E-306)
            long r0 = X.182.A01(r6, r9, r0)
            X.8wb r8 = r8.A05
            java.util.List r8 = r8.A05
            r16 = r8
            X.0qQ.A07(r16)
            r19 = 0
            int r8 = com.facebook.msys.mci.Execution.getExecutionContext()
            if (r8 != 0) goto L_0x0175
            boolean r8 = X.11Z.A07()
            r12 = 1
            if (r8 == 0) goto L_0x0176
        L_0x0175:
            r12 = 0
        L_0x0176:
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r8 = "Synchronous call to load messages for all threads from Reverb must NOT be on Msys thread or UI thread."
            X.17k.A0J(r12, r8, r9)
            java.lang.String r15 = ""
            X.43L r9 = r3.A04
            java.lang.String r13 = "load_message_list_for_threads_api_call"
            java.lang.String r8 = "_start"
            java.lang.String r8 = X.002.A0g(r15, r13, r8)
            r9.A07(r5, r8)
            java.lang.String r8 = "user_session_state"
            java.lang.String r12 = X.002.A0R(r15, r8)
            com.instagram.common.session.UserSession r8 = r3.A00
            r29 = r8
            java.lang.String r8 = r29.A06()
            r9.A09(r5, r12, r8)
            X.Mdg r12 = X.O4V.A00
            X.Pmg r8 = new X.Pmg
            r17 = r8
            r18 = r10
            r20 = r5
            r21 = r2
            r22 = r11
            r23 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r2 = r29
            com.google.common.util.concurrent.SettableFuture r8 = r12.A01(r2, r8)
            java.lang.String r2 = "Synchronous data fetch of Reverb loadMessageListForThreads"
            X.0eP r2 = X.C66840MdY.A06(r2, r8, r0)
            java.lang.String r0 = "_end"
            java.lang.String r0 = X.002.A0g(r15, r13, r0)
            r9.A07(r5, r0)
            java.lang.Object r1 = r2.A00
            X.A5x r1 = (X.C39706A5x) r1
            java.lang.Object r11 = r2.A01
            java.lang.Exception r11 = (java.lang.Exception) r11
            if (r11 == 0) goto L_0x01d4
            r0 = r19
            r9.A06(r5, r11, r0)
        L_0x01d4:
            if (r1 == 0) goto L_0x01da
            java.util.Map r10 = r1.A02
            if (r10 != 0) goto L_0x02da
        L_0x01da:
            r10 = 0
            if (r1 != 0) goto L_0x02da
            r8 = 0
            r18 = 0
        L_0x01e0:
            if (r32 == 0) goto L_0x01ed
            X.02m r12 = r9.A00
            int r2 = r5.A01
            int r1 = r5.A00
            java.lang.String r0 = "merge_message_pages_to_server_thread_result_start"
            r12.markerPoint(r2, r1, r0)
        L_0x01ed:
            java.util.Iterator r17 = r16.iterator()
        L_0x01f1:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02e2
            java.lang.Object r2 = r17.next()
            X.8wd r2 = (X.C370538wd) r2
            java.lang.Long r0 = r2.A00()
            long r27 = r0.longValue()
            r12 = -1
            int r0 = (r27 > r12 ? 1 : (r27 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x01f1
            java.lang.String r0 = java.lang.String.valueOf(r27)
            if (r10 == 0) goto L_0x02d7
            java.lang.Object r12 = r10.get(r0)
            java.util.List r12 = (java.util.List) r12
        L_0x0217:
            if (r8 == 0) goto L_0x02d4
            java.lang.Object r1 = r8.get(r0)
        L_0x021d:
            if (r11 == 0) goto L_0x02d1
            java.lang.String r0 = r11.getLocalizedMessage()
            if (r0 != 0) goto L_0x022b
            r0 = 62
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x022b:
            X.C66840MdY.A08(r2, r0)
            java.lang.String r13 = "inbox_fetch_in_one_shot"
            if (r10 == 0) goto L_0x02c8
            if (r12 == 0) goto L_0x02c8
            if (r8 == 0) goto L_0x02c4
            if (r1 == 0) goto L_0x02c4
            java.util.List r25 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r25)
        L_0x023f:
            java.lang.String r0 = r2.A1D
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>((java.lang.String) r0)
            java.util.List r0 = r2.A1c
            java.util.List r16 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A07(r16)
            java.lang.Boolean r15 = r2.A0y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            X.0qQ.A0K(r15, r0)
            X.7Qc r15 = new X.7Qc
            r0 = r16
            r15.<init>(r1, r0)
            r21 = r15
            r22 = r19
            r23 = r2
            r24 = r12
            r26 = r18
            r20 = r3
            X.C66840MdY.A07(r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 2342161901213981354(0x208107d700501aaa, double:4.064646390470077E-152)
            r12 = r29
            boolean r0 = X.182.A06(r6, r12, r0)
            if (r0 != 0) goto L_0x02bd
            java.util.List r0 = r2.A07
            if (r0 == 0) goto L_0x02bd
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x0288:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02a7
            java.lang.Object r12 = r16.next()
            r0 = r12
            X.3su r0 = (X.C254703su) r0
            X.3tI r0 = r0.A0P()
            if (r0 == 0) goto L_0x02a5
            X.2FW r1 = r0.A0F
        L_0x029d:
            X.2FW r0 = X.2FW.A1M
            if (r1 != r0) goto L_0x0288
            r15.add(r12)
            goto L_0x0288
        L_0x02a5:
            r1 = 0
            goto L_0x029d
        L_0x02a7:
            java.util.Iterator r12 = r15.iterator()
        L_0x02ab:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r1 = r12.next()
            X.3su r1 = (X.C254703su) r1
            r0 = r19
            r1.A13(r0)
            goto L_0x02ab
        L_0x02bd:
            X.8x3 r0 = r3.A01
            r0.A00(r2, r13, r7)
            goto L_0x01f1
        L_0x02c4:
            X.0sn r25 = X.0sn.A00
            goto L_0x023f
        L_0x02c8:
            r2.A09 = r14
            X.8x3 r0 = r3.A01
            r0.A00(r2, r13, r7)
            goto L_0x01f1
        L_0x02d1:
            r0 = 0
            goto L_0x022b
        L_0x02d4:
            r1 = 0
            goto L_0x021d
        L_0x02d7:
            r12 = 0
            goto L_0x0217
        L_0x02da:
            java.util.Map r8 = r1.A01
            java.util.Map r0 = r1.A00
            r18 = r0
            goto L_0x01e0
        L_0x02e2:
            if (r32 == 0) goto L_0x0036
            X.02m r3 = r9.A00
            int r2 = r5.A01
            int r1 = r5.A00
            java.lang.String r0 = "merge_message_pages_to_server_thread_result_end"
            r3.markerPoint(r2, r1, r0)
            goto L_0x0339
        L_0x02f0:
            X.8wb r0 = r8.A05
            java.util.List r0 = r0.A05
            X.0qQ.A07(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0300:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0317
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.8wd r0 = (X.C370538wd) r0
            boolean r0 = r0.A04(r9)
            if (r0 == 0) goto L_0x0300
            r6.add(r1)
            goto L_0x0300
        L_0x0317:
            java.util.Iterator r2 = r6.iterator()
        L_0x031b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0337
            java.lang.Object r1 = r2.next()
            X.8wd r1 = (X.C370538wd) r1
            r12 = 0
            int r0 = r3.A03
            X.0qQ.A0A(r1)
            java.lang.String r13 = "makeup_thread_by_thread_inbox_fetch_using_direct_cql"
            r8 = r3
            r10 = r5
            r11 = r1
            r14 = r0
            r8.A03(r9, r10, r11, r12, r13, r14)
            goto L_0x031b
        L_0x0337:
            if (r32 == 0) goto L_0x0036
        L_0x0339:
            X.02m r2 = r4.A00
            int r1 = r5.A01
            int r0 = r5.A00
            com.facebook.quicklog.MarkerEditor r1 = r2.withMarker(r1, r0)
            java.lang.String r0 = "reverb_process_inbox_network_response_end"
            com.facebook.quicklog.PointEditor r0 = r1.pointEditor(r0)
            r0.markerEditingCompleted()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370758x1.A02(com.instagram.common.session.UserSession, X.7BV, X.B72, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        if (r5.A03(r6) == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.common.session.UserSession r23, X.AnonymousClass7BV r24, X.C370538wd r25, java.lang.String r26, java.lang.String r27, int r28) {
        /*
            r22 = this;
            r3 = 0
            r0 = 3
            r12 = r25
            X.0qQ.A0B(r12, r0)
            r0 = 482(0x1e2, float:6.75E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "makeupDirectThreadPagedResult"
            X.0KC.A0D(r1, r0)
            r5 = r22
            X.8x3 r0 = r5.A01
            r2 = 1
            r4 = r27
            if (r0 == 0) goto L_0x001e
            r0.A00(r12, r4, r2)
        L_0x001e:
            java.util.List r1 = r12.A07
            if (r1 == 0) goto L_0x004b
            java.util.List r8 = X.00k.A0X(r1)
        L_0x0026:
            X.43S r1 = r5.A02
            if (r8 == 0) goto L_0x0078
            int r16 = r8.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r8.iterator()
        L_0x0037:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r6.next()
            X.3su r5 = (X.C254703su) r5
            java.lang.String r5 = r5.A1Y
            if (r5 == 0) goto L_0x0037
            r7.add(r5)
            goto L_0x0037
        L_0x004b:
            r8 = 0
            goto L_0x0026
        L_0x004d:
            int r17 = r7.size()
            r5 = 10
            int r5 = X.0Yv.A1E(r8, r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r5)
            java.util.Iterator r6 = r8.iterator()
        L_0x0060:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r5 = r6.next()
            X.3su r5 = (X.C254703su) r5
            java.lang.String r5 = r5.A0g()
            if (r5 != 0) goto L_0x0074
            java.lang.String r5 = ""
        L_0x0074:
            r7.add(r5)
            goto L_0x0060
        L_0x0078:
            r16 = -1
            r17 = 0
            X.0sn r7 = X.0sn.A00
        L_0x007e:
            java.lang.Long r5 = r12.A00()
            long r18 = r5.longValue()
            boolean r20 = r12.A03()
            X.3Tu r5 = r12.A0Z
            r6 = r23
            if (r5 == 0) goto L_0x0098
            boolean r5 = r5.A03(r6)
            r21 = 1
            if (r5 != 0) goto L_0x009a
        L_0x0098:
            r21 = 0
        L_0x009a:
            r11 = r24
            r13 = r1
            r14 = r11
            r15 = r7
            r13.A0G(r14, r15, r16, r17, r18, r20, r21)
            java.lang.String r5 = r12.A1D
            com.instagram.model.direct.DirectThreadKey r9 = new com.instagram.model.direct.DirectThreadKey
            r9.<init>((java.lang.String) r5)
            java.util.List r5 = r12.A1c
            java.util.List r8 = java.util.Collections.unmodifiableList(r5)
            X.0qQ.A07(r8)
            java.lang.Boolean r7 = r12.A0y
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            X.0qQ.A0K(r7, r5)
            X.7Qc r10 = new X.7Qc
            r10.<init>(r9, r8)
            X.C370748x0.A00()
            X.MdY r9 = X.C66843Mdb.A01(r6)
            java.lang.Long r5 = r12.A00()
            long r16 = r5.longValue()
            r14 = 0
            r18 = 600000(0x927c0, double:2.964394E-318)
            r13 = r26
            r15 = r28
            r20 = r2
            r9.A0B(r10, r11, r12, r13, r14, r15, r16, r18, r20)
            java.util.List r2 = A00(r12)
            r12.A07 = r2
            if (r0 == 0) goto L_0x00e7
            r0.A00(r12, r4, r3)
        L_0x00e7:
            X.8xD r2 = r12.A01
            if (r2 == 0) goto L_0x0111
            boolean r0 = r2.A03
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.util.List r0 = r2.A01
            int r0 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x00fb:
            X.8xD r0 = r12.A01
            if (r0 == 0) goto L_0x010f
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x010f
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x010b:
            r1.A0F(r11, r3, r2, r0)
            return
        L_0x010f:
            r0 = 0
            goto L_0x010b
        L_0x0111:
            r3 = 0
            r2 = 0
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370758x1.A03(com.instagram.common.session.UserSession, X.7BV, X.8wd, java.lang.String, java.lang.String, int):void");
    }

    public static final List A00(C370538wd r6) {
        List list = r6.A07;
        0qQ.A07(list);
        C370878xD r0 = r6.A01;
        if (r0 == null) {
            return list;
        }
        List<C254703su> list2 = r0.A01;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C254703su A0g : list2) {
            linkedHashSet.add(A0g.A0g());
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C254703su r2 = (C254703su) next;
            if (r2.A10 != 2FW.A0n || !linkedHashSet.contains(r2.A0g())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final ArrayList A01(C370538wd r7) {
        String A0k;
        ArrayList arrayList = new ArrayList();
        if (r7 != null) {
            for (Object next : r7.A07) {
                0qQ.A07(next);
                C254703su r3 = (C254703su) next;
                if (r3.A10 == 2FW.A0n && (A0k = r3.A0k()) != null && !00l.A0d(A0k, "locally marked as deleted", false)) {
                    arrayList.add(r3);
                }
            }
        }
        return arrayList;
    }
}
