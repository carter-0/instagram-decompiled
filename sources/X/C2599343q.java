package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.43q  reason: invalid class name and case insensitive filesystem */
public final class C2599343q implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2599343q(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0252, code lost:
        r3 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:23:0x0098, B:97:0x01d6] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00c5=Splitter:B:28:0x00c5, B:140:0x0249=Splitter:B:140:0x0249, B:72:0x018a=Splitter:B:72:0x018a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r28, X.AnonymousClass653 r29, java.util.List r30, java.util.Map r31, X.0sL r32, X.0sL r33, boolean r34) {
        /*
            r27 = this;
            r0 = 0
            r1 = r31
            X.0qQ.A0B(r1, r0)
            r0 = 1
            r4 = r28
            X.0qQ.A0B(r4, r0)
            r0 = 2
            r7 = r29
            X.0qQ.A0B(r7, r0)
            r11 = 5
            r3 = r32
            X.0qQ.A0B(r3, r11)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r0 = "direct_v2_item_id"
            java.lang.Object r6 = r1.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r2 == 0) goto L_0x028d
            if (r6 == 0) goto L_0x028d
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "replace"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x028a
            java.lang.Object r8 = r3.invoke(r2, r4)
            X.2Eq r8 = (X.2Eq) r8
            if (r8 != 0) goto L_0x003f
            X.XPd r3 = X.C21215XPd.A00
            return r3
        L_0x003f:
            r1 = r27
            X.2Dm r0 = r1.A01
            com.instagram.model.direct.DirectThreadKey r2 = r8.BJy()
            X.3su r2 = r0.BRz(r2, r6)
            java.lang.String r5 = "No cached message to update"
            java.lang.String r4 = "UpdateMessageMediaMisinifoDeltaProcessor"
            if (r2 == 0) goto L_0x0284
            com.instagram.common.session.UserSession r2 = r1.A00
            r10 = 1
            java.lang.Boolean r3 = X.O0U.A00(r2)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0281
            java.lang.String r3 = r8.C6C()
            if (r3 == 0) goto L_0x0284
            X.3t0 r4 = new X.3t0
            r4.<init>(r3)
            java.lang.String r3 = r7.A02     // Catch:{ IOException -> 0x0255 }
            X.16F r3 = X.16P.A00(r3)     // Catch:{ IOException -> 0x0255 }
            X.CvK r7 = X.C44718Cjm.parseFromJson(r3)     // Catch:{ IOException -> 0x0255 }
            X.0qQ.A07(r7)     // Catch:{ IOException -> 0x0255 }
            X.2FW r5 = r7.A01     // Catch:{ IOException -> 0x0255 }
            X.2FW r3 = X.2FW.A1g     // Catch:{ IOException -> 0x0255 }
            if (r5 != r3) goto L_0x00cf
            java.util.List r7 = r7.A02     // Catch:{ IOException -> 0x0255 }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ IOException -> 0x0255 }
            X.3t1 r3 = X.AnonymousClass6W3.A01(r4)     // Catch:{ IOException -> 0x0255 }
            com.instagram.model.direct.DirectThreadKey r3 = X.AnonymousClass6W4.A01(r3)     // Catch:{ IOException -> 0x0255 }
            X.48S r5 = r0.A0P(r3)     // Catch:{ IOException -> 0x0255 }
            if (r5 != 0) goto L_0x0097
            java.lang.String r3 = "Null thread entry"
            java.lang.String r0 = "Entry should exist before function call"
            X.0wb.A03(r3, r0)     // Catch:{ IOException -> 0x0255 }
            goto L_0x0281
        L_0x0097:
            monitor-enter(r5)     // Catch:{ IOException -> 0x0255 }
            X.3su r4 = r5.A0J(r6)     // Catch:{ all -> 0x0252 }
            if (r4 != 0) goto L_0x00ae
            X.0wj r6 = X.0wj.A01     // Catch:{ all -> 0x0252 }
            r4 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r3 = "Message is missing from thread entry"
            X.0f9 r3 = r6.AEf(r3, r4)     // Catch:{ all -> 0x0252 }
            r3.report()     // Catch:{ all -> 0x0252 }
            r6 = 0
            goto L_0x00c5
        L_0x00ae:
            r4.A1K(r7)     // Catch:{ all -> 0x0252 }
            X.3U9 r3 = r5.A0I     // Catch:{ all -> 0x0252 }
            com.instagram.model.direct.DirectThreadKey r7 = r3.BJz()     // Catch:{ all -> 0x0252 }
            r9 = 0
            java.util.List r11 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x0252 }
            java.lang.Integer r8 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0252 }
            r12 = 0
            X.2Kb r6 = new X.2Kb     // Catch:{ all -> 0x0252 }
            r10 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0252 }
        L_0x00c5:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0255 }
            if (r6 == 0) goto L_0x0281
            X.1Ng r0 = r0.A06     // Catch:{ IOException -> 0x0255 }
            r0.A00(r6)     // Catch:{ IOException -> 0x0255 }
            goto L_0x0281
        L_0x00cf:
            X.2FW r3 = X.2FW.A1A     // Catch:{ IOException -> 0x0255 }
            if (r5 != r3) goto L_0x0194
            X.1Xj r3 = r7.A00     // Catch:{ IOException -> 0x0255 }
            if (r3 == 0) goto L_0x00e1
            X.4w4 r9 = r3.BQf()     // Catch:{ IOException -> 0x0255 }
        L_0x00db:
            java.util.List r8 = r7.A02     // Catch:{ IOException -> 0x0255 }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ IOException -> 0x0255 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0255 }
            goto L_0x00e3
        L_0x00e1:
            r9 = 0
            goto L_0x00db
        L_0x00e3:
            X.3t1 r3 = X.AnonymousClass6W3.A01(r4)     // Catch:{ all -> 0x0190 }
            com.instagram.model.direct.DirectThreadKey r3 = X.AnonymousClass6W4.A01(r3)     // Catch:{ all -> 0x0190 }
            X.48S r4 = r0.A0P(r3)     // Catch:{ all -> 0x0190 }
            if (r4 != 0) goto L_0x00fa
            java.lang.String r4 = "Null thread entry"
            java.lang.String r3 = "Entry should exist before function call"
            X.0wb.A03(r4, r3)     // Catch:{ all -> 0x0190 }
            goto L_0x018a
        L_0x00fa:
            monitor-enter(r4)     // Catch:{ all -> 0x0190 }
            X.3su r6 = r4.A0J(r6)     // Catch:{ all -> 0x018d }
            if (r6 != 0) goto L_0x0111
            X.0wj r6 = X.0wj.A01     // Catch:{ all -> 0x018d }
            r5 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r3 = "Message is missing from thread entry"
            X.0f9 r3 = r6.AEf(r3, r5)     // Catch:{ all -> 0x018d }
            r3.report()     // Catch:{ all -> 0x018d }
            r6 = 0
            goto L_0x0182
        L_0x0111:
            X.1Xj r7 = r6.A0s     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x016e
            if (r9 != 0) goto L_0x0146
            r13 = 0
            X.4w3 r12 = new X.4w3     // Catch:{ all -> 0x018d }
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r24 = r13
            r25 = r13
            r26 = r13
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x018d }
            X.CGg r5 = new X.CGg     // Catch:{ all -> 0x018d }
            r5.<init>(r12)     // Catch:{ all -> 0x018d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x018d }
            r5.A07 = r3     // Catch:{ all -> 0x018d }
            X.4w4 r9 = r5.A01()     // Catch:{ all -> 0x018d }
            X.1Xj r7 = r6.A0s     // Catch:{ all -> 0x018d }
        L_0x0146:
            r5 = 0
            if (r9 == 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r3 = r5
            goto L_0x0156
        L_0x014c:
            X.3xe r3 = r9.Af9()     // Catch:{ all -> 0x018d }
            if (r3 == 0) goto L_0x014a
            X.4g6 r3 = X.Ci1.A00(r3)     // Catch:{ all -> 0x018d }
        L_0x0156:
            r7.A06 = r3     // Catch:{ all -> 0x018d }
            if (r9 == 0) goto L_0x0164
            X.3xe r3 = r9.BZl()     // Catch:{ all -> 0x018d }
            if (r3 == 0) goto L_0x0164
            X.4g6 r5 = X.Ci1.A00(r3)     // Catch:{ all -> 0x018d }
        L_0x0164:
            r7.A07 = r5     // Catch:{ all -> 0x018d }
            X.1Xy r3 = r7.A0C     // Catch:{ all -> 0x018d }
            r3.EdC(r9)     // Catch:{ all -> 0x018d }
            r6.A1K(r8)     // Catch:{ all -> 0x018d }
        L_0x016e:
            X.3U9 r3 = r4.A0I     // Catch:{ all -> 0x018d }
            com.instagram.model.direct.DirectThreadKey r7 = r3.BJz()     // Catch:{ all -> 0x018d }
            r9 = 0
            java.util.List r11 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x018d }
            java.lang.Integer r8 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x018d }
            r12 = 0
            X.2Kb r6 = new X.2Kb     // Catch:{ all -> 0x018d }
            r10 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x018d }
        L_0x0182:
            monitor-exit(r4)     // Catch:{ all -> 0x0190 }
            if (r6 == 0) goto L_0x018a
            X.1Ng r3 = r0.A06     // Catch:{ all -> 0x0190 }
            r3.A00(r6)     // Catch:{ all -> 0x0190 }
        L_0x018a:
            monitor-exit(r0)     // Catch:{ IOException -> 0x0255 }
            goto L_0x0281
        L_0x018d:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0190 }
            throw r3     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0255 }
            goto L_0x0254
        L_0x0194:
            X.2FW r3 = X.2FW.A1s     // Catch:{ IOException -> 0x0255 }
            if (r5 != r3) goto L_0x0281
            java.util.List r12 = r7.A03     // Catch:{ IOException -> 0x0255 }
            java.util.List r9 = r7.A02     // Catch:{ IOException -> 0x0255 }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ IOException -> 0x0255 }
            X.3t1 r3 = X.AnonymousClass6W3.A01(r4)     // Catch:{ IOException -> 0x0255 }
            com.instagram.model.direct.DirectThreadKey r3 = X.AnonymousClass6W4.A01(r3)     // Catch:{ IOException -> 0x0255 }
            X.48S r5 = r0.A0P(r3)     // Catch:{ IOException -> 0x0255 }
            if (r5 != 0) goto L_0x01b5
            java.lang.String r3 = "Null thread entry"
            java.lang.String r0 = "Entry should exist before function call"
            X.0wb.A03(r3, r0)     // Catch:{ IOException -> 0x0255 }
            goto L_0x0281
        L_0x01b5:
            monitor-enter(r5)     // Catch:{ IOException -> 0x0255 }
            X.3su r6 = r5.A0J(r6)     // Catch:{ all -> 0x0252 }
            if (r6 != 0) goto L_0x01cc
            X.0wj r6 = X.0wj.A01     // Catch:{ all -> 0x0252 }
            r4 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r3 = "Message is missing from thread entry"
            X.0f9 r3 = r6.AEf(r3, r4)     // Catch:{ all -> 0x0252 }
            r3.report()     // Catch:{ all -> 0x0252 }
            r6 = 0
            goto L_0x0249
        L_0x01cc:
            com.google.common.collect.ImmutableList r3 = r6.A0H()     // Catch:{ all -> 0x0252 }
            if (r3 == 0) goto L_0x0235
            r11 = 0
            java.lang.Object r13 = X.XYK.A00     // Catch:{ all -> 0x0252 }
            monitor-enter(r13)     // Catch:{ all -> 0x0252 }
            com.google.common.collect.ImmutableList r4 = r6.A0H()     // Catch:{ all -> 0x022e }
            r3 = 0
            if (r4 == 0) goto L_0x0234
            java.util.List r8 = X.00k.A0a(r4)     // Catch:{ all -> 0x022e }
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x022e }
            if (r4 != 0) goto L_0x021f
            java.lang.Object r7 = r8.get(r11)     // Catch:{ all -> 0x022e }
            X.3tC r7 = (X.C254873tC) r7     // Catch:{ all -> 0x022e }
            if (r7 == 0) goto L_0x021f
            if (r12 == 0) goto L_0x01f2
            goto L_0x01f4
        L_0x01f2:
            r4 = r3
            goto L_0x01fe
        L_0x01f4:
            java.lang.Object r4 = r12.get(r11)     // Catch:{ all -> 0x022e }
            X.3tC r4 = (X.C254873tC) r4     // Catch:{ all -> 0x022e }
            if (r4 == 0) goto L_0x01f2
            java.lang.Integer r4 = r4.A0g     // Catch:{ all -> 0x022e }
        L_0x01fe:
            r7.A0g = r4     // Catch:{ all -> 0x022e }
            if (r12 == 0) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r4 = r3
            goto L_0x020f
        L_0x0205:
            java.lang.Object r4 = r12.get(r11)     // Catch:{ all -> 0x022e }
            X.3tC r4 = (X.C254873tC) r4     // Catch:{ all -> 0x022e }
            if (r4 == 0) goto L_0x0203
            java.lang.String r4 = r4.A1E     // Catch:{ all -> 0x022e }
        L_0x020f:
            r7.A1E = r4     // Catch:{ all -> 0x022e }
            if (r12 == 0) goto L_0x021d
            java.lang.Object r4 = r12.get(r11)     // Catch:{ all -> 0x022e }
            X.3tC r4 = (X.C254873tC) r4     // Catch:{ all -> 0x022e }
            if (r4 == 0) goto L_0x021d
            java.lang.Integer r3 = r4.A0h     // Catch:{ all -> 0x022e }
        L_0x021d:
            r7.A0h = r3     // Catch:{ all -> 0x022e }
        L_0x021f:
            monitor-exit(r13)     // Catch:{ all -> 0x0252 }
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r8)     // Catch:{ all -> 0x0252 }
            monitor-enter(r6)     // Catch:{ all -> 0x0252 }
            r6.A26 = r3     // Catch:{ all -> 0x0231 }
            r6.A2C = r10     // Catch:{ all -> 0x0231 }
            monitor-exit(r6)     // Catch:{ all -> 0x0252 }
            r6.A1K(r9)     // Catch:{ all -> 0x0252 }
            goto L_0x0235
        L_0x022e:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0252 }
            goto L_0x0233
        L_0x0231:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0252 }
        L_0x0233:
            throw r0     // Catch:{ all -> 0x0252 }
        L_0x0234:
            monitor-exit(r13)     // Catch:{ all -> 0x0252 }
        L_0x0235:
            X.3U9 r3 = r5.A0I     // Catch:{ all -> 0x0252 }
            com.instagram.model.direct.DirectThreadKey r7 = r3.BJz()     // Catch:{ all -> 0x0252 }
            r9 = 0
            java.util.List r11 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x0252 }
            java.lang.Integer r8 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0252 }
            r12 = 0
            X.2Kb r6 = new X.2Kb     // Catch:{ all -> 0x0252 }
            r10 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0252 }
        L_0x0249:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0255 }
            if (r6 == 0) goto L_0x0281
            X.1Ng r0 = r0.A06     // Catch:{ IOException -> 0x0255 }
            r0.A00(r6)     // Catch:{ IOException -> 0x0255 }
            goto L_0x0281
        L_0x0252:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0255 }
        L_0x0254:
            throw r3     // Catch:{ IOException -> 0x0255 }
        L_0x0255:
            r5 = move-exception
            X.1Zn r4 = X.1Zm.A00(r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            java.lang.Integer r2 = X.AnonymousClass05K.A0K
            r0 = 0
            X.1Zp r3 = r4.A01(r3, r2, r0)
            java.lang.String r0 = "error_message:"
            java.lang.String r2 = "Invalid MessageMediaMisinfo format"
            r3.A03(r0, r2)
            r3.A05(r5)
            r3.A00()
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            X.0qQ.A07(r0)
            X.6BQ r3 = new X.6BQ
            r3.<init>(r5, r0, r2)
            return r3
        L_0x0281:
            X.6BL r3 = X.AnonymousClass6BL.A00
            return r3
        L_0x0284:
            X.CHW r3 = new X.CHW
            r3.<init>(r4, r5)
            return r3
        L_0x028a:
            X.6BO r3 = X.AnonymousClass6BO.A00
            return r3
        L_0x028d:
            java.lang.String r1 = "Invalid operation: "
            java.lang.String r0 = r7.A00
            java.lang.String r2 = X.002.A0R(r1, r0)
            java.lang.String r1 = "UpdateMessageMediaMisinifoDeltaProcessor"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            X.6BR r3 = new X.6BR
            r3.<init>(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2599343q.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
