package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.43m  reason: invalid class name and case insensitive filesystem */
public final class C2598943m implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2598943m(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cd, code lost:
        X.0wb.A01.Ew2("invalid_direct_reaction_format", "Invalid DirectReaction format", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d7, code lost:
        return new X.AnonymousClass6BQ(r2, "invalid_direct_reaction_format", "Invalid DirectReaction format");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01cc A[ExcHandler: IOException | IndexOutOfBoundsException (r2v2 'e' java.lang.Exception A[CUSTOM_DECLARE])] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x00ca=Splitter:B:33:0x00ca, B:71:0x019e=Splitter:B:71:0x019e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r23, X.AnonymousClass653 r24, java.util.List r25, java.util.Map r26, X.0sL r27, X.0sL r28, boolean r29) {
        /*
            r22 = this;
            r0 = 0
            r2 = r26
            X.0qQ.A0B(r2, r0)
            r0 = 1
            r13 = r23
            X.0qQ.A0B(r13, r0)
            r0 = 2
            r12 = r24
            X.0qQ.A0B(r12, r0)
            r0 = 5
            r3 = r27
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r11 = r2.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "direct_v2_item_id"
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "direct_v2_user_id"
            java.lang.Object r10 = r2.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            if (r11 == 0) goto L_0x01d8
            if (r1 == 0) goto L_0x01d8
            if (r10 == 0) goto L_0x01d8
            java.lang.String r2 = r12.A00
            java.lang.String r9 = "add"
            boolean r0 = X.0qQ.A0K(r2, r9)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "remove"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x004b
            X.6BO r4 = X.AnonymousClass6BO.A00
            return r4
        L_0x004b:
            java.lang.String r15 = "Invalid DirectReaction format"
            java.lang.String r0 = "invalid_direct_reaction_format"
            java.lang.Object r8 = r3.invoke(r11, r13)
            X.2Eq r8 = (X.2Eq) r8
            if (r8 != 0) goto L_0x005a
            X.XPd r4 = X.C21215XPd.A00
            return r4
        L_0x005a:
            java.lang.String r2 = r12.A02     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r5 = 0
            if (r2 == 0) goto L_0x00e0
            char r3 = r2.charAt(r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r2 = 123(0x7b, float:1.72E-43)
            if (r3 != r2) goto L_0x00e0
            java.lang.String r2 = r12.A02     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.16F r2 = X.16P.A00(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.46u r5 = X.C2607146t.parseFromJson(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
        L_0x0071:
            java.lang.String r4 = r12.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            boolean r2 = X.0qQ.A0K(r4, r9)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r3 = r22
            if (r2 == 0) goto L_0x0147
            com.instagram.common.session.UserSession r2 = r3.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.C70148Ny2.A00(r2, r13, r11, r10)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.2Dm r2 = r3.A01     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            com.instagram.model.direct.DirectThreadKey r3 = r8.BJy()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.String r7 = r13.A04     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.2Dr r2 = (X.2Dr) r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.48S r3 = r2.A0P(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r3 != 0) goto L_0x009a
            java.lang.String r2 = "Null thread entry"
            java.lang.String r1 = "Entry should exist before function call"
            X.0wb.A03(r2, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
        L_0x0097:
            X.6BL r4 = X.AnonymousClass6BL.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            return r4
        L_0x009a:
            monitor-enter(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.3su r6 = r3.A0J(r1)     // Catch:{ all -> 0x01b4 }
            if (r6 != 0) goto L_0x00b1
            X.0wj r6 = X.0wj.A01     // Catch:{ all -> 0x01b4 }
            r5 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r4 = "liked/unliked message is missing from thread entry"
            X.0f9 r4 = r6.AEf(r4, r5)     // Catch:{ all -> 0x01b4 }
            r4.report()     // Catch:{ all -> 0x01b4 }
            r4 = 0
            goto L_0x00ca
        L_0x00b1:
            com.instagram.common.session.UserSession r4 = r3.A0H     // Catch:{ all -> 0x01b4 }
            r6.A0y(r4, r5, r10, r7)     // Catch:{ all -> 0x01b4 }
            X.3U9 r4 = r3.A0I     // Catch:{ all -> 0x01b4 }
            com.instagram.model.direct.DirectThreadKey r5 = r4.BJz()     // Catch:{ all -> 0x01b4 }
            r7 = 0
            java.util.List r9 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x01b4 }
            java.lang.Integer r6 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x01b4 }
            r10 = 1
            X.2Kb r4 = new X.2Kb     // Catch:{ all -> 0x01b4 }
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01b4 }
        L_0x00ca:
            monitor-exit(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r3.A0J(r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r4 == 0) goto L_0x0097
            X.1Ng r1 = r2.A06     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r1.A00(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.2FF r1 = r2.A09     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r1.accept(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r29 == 0) goto L_0x0097
            X.2Dr.A0F(r2, r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            goto L_0x0097
        L_0x00e0:
            java.lang.String r7 = r12.A02     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r4 = 1
            if (r7 == 0) goto L_0x0127
            int r3 = r7.length()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r3 == 0) goto L_0x0127
            r2 = 4
            if (r3 <= r2) goto L_0x0127
            r2 = 3
            int r3 = r3 - r4
            java.lang.String r4 = r7.substring(r2, r3)     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            X.0qQ.A07(r4)     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.String r3 = "\\\\u"
            X.11S r2 = new X.11S     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            java.util.List r3 = r2.A03(r4)     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.Object[] r14 = r3.toArray(r2)     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.String[] r14 = (java.lang.String[]) r14     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            int r6 = r14.length     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            char[] r5 = new char[r6]     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            r4 = 0
        L_0x010e:
            if (r4 >= r6) goto L_0x011e
            r3 = r14[r4]     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            r2 = 16
            int r2 = java.lang.Integer.parseInt(r3, r2)     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            char r2 = (char) r2     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            r5[r4] = r2     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            int r4 = r4 + 1
            goto L_0x010e
        L_0x011e:
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0125, IOException | IndexOutOfBoundsException -> 0x01cc }
            r7 = r2
            goto L_0x0134
        L_0x0125:
            r4 = move-exception
            goto L_0x0129
        L_0x0127:
            r7 = 0
            goto L_0x0134
        L_0x0129:
            java.lang.String r2 = "Could not parse badly formatted emoji "
            java.lang.String r3 = X.002.A0R(r2, r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.String r2 = "EmojiParseUtil"
            X.0wb.A06(r2, r3, r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
        L_0x0134:
            r17 = 0
            X.46u r5 = new X.46u     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r18 = r17
            r20 = r7
            r21 = r17
            r19 = r10
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            goto L_0x0071
        L_0x0147:
            java.lang.String r2 = "remove"
            boolean r2 = X.0qQ.A0K(r4, r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r2 == 0) goto L_0x01b7
            com.instagram.common.session.UserSession r2 = r3.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.C70148Ny2.A00(r2, r13, r11, r10)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.2Dm r2 = r3.A01     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            com.instagram.model.direct.DirectThreadKey r3 = r8.BJy()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.String r7 = r13.A04     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.2Dr r2 = (X.2Dr) r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.48S r3 = r2.A0P(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r3 != 0) goto L_0x016e
            java.lang.String r2 = "Null thread entry"
            java.lang.String r1 = "Entry should exist before function call"
            X.0wb.A03(r2, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
        L_0x016b:
            X.6BL r4 = X.AnonymousClass6BL.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            return r4
        L_0x016e:
            monitor-enter(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.3su r6 = r3.A0J(r1)     // Catch:{ all -> 0x01b4 }
            if (r6 != 0) goto L_0x0185
            X.0wj r6 = X.0wj.A01     // Catch:{ all -> 0x01b4 }
            r5 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r4 = "liked/unliked message is missing from thread entry"
            X.0f9 r4 = r6.AEf(r4, r5)     // Catch:{ all -> 0x01b4 }
            r4.report()     // Catch:{ all -> 0x01b4 }
            r4 = 0
            goto L_0x019e
        L_0x0185:
            com.instagram.common.session.UserSession r4 = r3.A0H     // Catch:{ all -> 0x01b4 }
            r6.A0z(r4, r5, r10, r7)     // Catch:{ all -> 0x01b4 }
            X.3U9 r4 = r3.A0I     // Catch:{ all -> 0x01b4 }
            com.instagram.model.direct.DirectThreadKey r5 = r4.BJz()     // Catch:{ all -> 0x01b4 }
            r7 = 0
            java.util.List r9 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x01b4 }
            java.lang.Integer r6 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x01b4 }
            r10 = 1
            X.2Kb r4 = new X.2Kb     // Catch:{ all -> 0x01b4 }
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01b4 }
        L_0x019e:
            monitor-exit(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r3.A0J(r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r4 == 0) goto L_0x016b
            X.1Ng r1 = r2.A06     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r1.A00(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.2FF r1 = r2.A09     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r1.accept(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            if (r29 == 0) goto L_0x016b
            X.2Dr.A0F(r2, r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            goto L_0x016b
        L_0x01b4:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            throw r1     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
        L_0x01b7:
            java.lang.String r3 = "Invalid operation"
            java.lang.String r2 = "Invalid operation: "
            java.lang.String r1 = r12.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.String r2 = X.002.A0R(r2, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r1.<init>(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            X.6BR r4 = new X.6BR     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            r4.<init>(r1, r3, r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01cc }
            return r4
        L_0x01cc:
            r2 = move-exception
            X.0wb r1 = X.0wb.A01
            r1.Ew2(r0, r15, r2)
            X.6BQ r4 = new X.6BQ
            r4.<init>(r2, r0, r15)
            return r4
        L_0x01d8:
            X.6BL r4 = X.AnonymousClass6BL.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2598943m.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
