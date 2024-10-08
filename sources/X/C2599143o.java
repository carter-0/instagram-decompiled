package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.43o  reason: invalid class name and case insensitive filesystem */
public final class C2599143o implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2599143o(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (X.182.A06(X.0Tu.A06, r10, 36320266384580745L) == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010a, code lost:
        if (r9 != false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r20, X.AnonymousClass653 r21, java.util.List r22, java.util.Map r23, X.0sL r24, X.0sL r25, boolean r26) {
        /*
            r19 = this;
            r0 = 0
            r1 = r23
            X.0qQ.A0B(r1, r0)
            r0 = 1
            r11 = r20
            X.0qQ.A0B(r11, r0)
            r0 = 2
            r9 = r21
            X.0qQ.A0B(r9, r0)
            r0 = 5
            r4 = r24
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r10 = r1.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "direct_v2_item_id"
            java.lang.Object r5 = r1.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r10 == 0) goto L_0x0176
            if (r5 == 0) goto L_0x0176
            java.lang.String r1 = r9.A00
            java.lang.String r7 = "add"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "remove"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0176
        L_0x003e:
            java.lang.String r3 = "Invalid Self Reaction format"
            java.lang.String r2 = "invalid_self_reaction_format"
            java.lang.Object r4 = r4.invoke(r10, r11)
            X.2Eq r4 = (X.2Eq) r4
            if (r4 != 0) goto L_0x004d
            X.XPd r4 = X.C21215XPd.A00
            return r4
        L_0x004d:
            r6 = r19
            com.instagram.common.session.UserSession r1 = r6.A00
            int r0 = r4.C6a()
            r8 = 0
            r12 = 0
            boolean r0 = X.AnonymousClass7FS.A00(r1, r0, r12)
            if (r0 != 0) goto L_0x016c
            X.C70148Ny2.A00(r1, r11, r10, r8)
            java.lang.String r0 = r9.A02     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            X.Ctf r13 = X.C44654CiY.parseFromJson(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            java.lang.String r0 = r9.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            boolean r0 = r7.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            if (r0 == 0) goto L_0x0075
            r0 = 1
            r13.A01 = r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
        L_0x0075:
            X.2Dm r7 = r6.A01     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            com.instagram.model.direct.DirectThreadKey r1 = r4.BJy()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            X.0qQ.A0A(r13)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            X.2Dr r7 = (X.2Dr) r7     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            r0 = 4
            X.0qQ.A0B(r13, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            X.48S r4 = r7.A0P(r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            if (r4 != 0) goto L_0x0094
            java.lang.String r1 = "Null thread entry"
            java.lang.String r0 = "Entry should exist before function call"
            X.0wb.A03(r1, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
        L_0x0091:
            X.6BL r4 = X.AnonymousClass6BL.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            return r4
        L_0x0094:
            monitor-enter(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            X.3su r6 = r4.A0J(r5)     // Catch:{ all -> 0x015d }
            if (r6 != 0) goto L_0x00ac
            X.0wj r5 = X.0wj.A01     // Catch:{ all -> 0x015d }
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "liked/unliked message is missing from thread entry"
            X.0f9 r0 = r5.AEf(r0, r1)     // Catch:{ all -> 0x015d }
            r0.report()     // Catch:{ all -> 0x015d }
            r9 = 0
            goto L_0x0141
        L_0x00ac:
            X.3U9 r11 = r4.A0I     // Catch:{ all -> 0x015d }
            int r5 = r11.C6a()     // Catch:{ all -> 0x015d }
            r1 = 29
            r0 = 0
            if (r5 != r1) goto L_0x00b8
            r0 = 1
        L_0x00b8:
            com.instagram.common.session.UserSession r10 = r4.A0H     // Catch:{ all -> 0x015d }
            monitor-enter(r6)     // Catch:{ all -> 0x015d }
            boolean r9 = r13.A01     // Catch:{ all -> 0x015a }
            r5 = 1
            if (r0 == 0) goto L_0x00cf
            X.0Tu r14 = X.0Tu.A06     // Catch:{ all -> 0x015a }
            r0 = 36320266384580745(0x81091700002089, double:3.032420939358199E-306)
            boolean r0 = X.182.A06(r14, r10, r0)     // Catch:{ all -> 0x015a }
            r18 = 0
            if (r0 != 0) goto L_0x00d1
        L_0x00cf:
            r18 = 1
        L_0x00d1:
            java.lang.String r14 = r13.A00     // Catch:{ all -> 0x015a }
            if (r14 == 0) goto L_0x0150
            com.google.common.collect.ImmutableList$Builder r13 = new com.google.common.collect.ImmutableList$Builder     // Catch:{ all -> 0x015a }
            r13.<init>()     // Catch:{ all -> 0x015a }
            java.util.List r0 = r6.A22     // Catch:{ all -> 0x015a }
            if (r0 != 0) goto L_0x0113
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()     // Catch:{ all -> 0x015a }
        L_0x00e2:
            X.3kO r17 = r0.iterator()     // Catch:{ all -> 0x015a }
            r16 = 0
        L_0x00e8:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r15 = r17.next()     // Catch:{ all -> 0x015a }
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r15 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r15     // Catch:{ all -> 0x015a }
            boolean r1 = r15.A02     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r15.A01     // Catch:{ all -> 0x015a }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0105
            if (r1 == r9) goto L_0x012e
            r15.A02 = r9     // Catch:{ all -> 0x015a }
            r16 = 1
            goto L_0x010f
        L_0x0105:
            if (r18 == 0) goto L_0x010d
            if (r1 == 0) goto L_0x010c
            r1 = 1
            if (r9 == 0) goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            r15.A02 = r1     // Catch:{ all -> 0x015a }
        L_0x010f:
            r13.add(r15)     // Catch:{ all -> 0x015a }
            goto L_0x00e8
        L_0x0113:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x015a }
            goto L_0x00e2
        L_0x0118:
            if (r16 != 0) goto L_0x0122
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r0 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction     // Catch:{ all -> 0x015a }
            r0.<init>(r14, r12, r9)     // Catch:{ all -> 0x015a }
            r13.add(r0)     // Catch:{ all -> 0x015a }
        L_0x0122:
            com.google.common.collect.ImmutableList r0 = r13.build()     // Catch:{ all -> 0x015a }
            X.C254703su.A04(r10, r6, r0)     // Catch:{ all -> 0x015a }
            r6.A2C = r5     // Catch:{ all -> 0x015a }
            X.C254703su.A06(r6)     // Catch:{ all -> 0x015a }
        L_0x012e:
            monitor-exit(r6)     // Catch:{ all -> 0x015d }
            com.instagram.model.direct.DirectThreadKey r10 = r11.BJz()     // Catch:{ all -> 0x015d }
            java.util.List r14 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x015d }
            java.lang.Integer r11 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x015d }
            X.2Kb r9 = new X.2Kb     // Catch:{ all -> 0x015d }
            r12 = r8
            r13 = r8
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x015d }
        L_0x0141:
            monitor-exit(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            if (r9 == 0) goto L_0x0091
            X.1Ng r0 = r7.A06     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            r0.A00(r9)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            X.2FF r0 = r7.A09     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            r0.accept(r9)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            goto L_0x0091
        L_0x0150:
            java.lang.String r0 = "emoji"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x015a }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x015d }
            throw r0     // Catch:{ all -> 0x015d }
        L_0x015d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
            throw r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0160 }
        L_0x0160:
            r1 = move-exception
            X.0wb r0 = X.0wb.A01
            r0.Ew2(r2, r3, r1)
            X.6BQ r4 = new X.6BQ
            r4.<init>(r1, r2, r3)
            return r4
        L_0x016c:
            java.lang.String r1 = "multiple_reaction_pills"
            java.lang.String r0 = "Multiple reaction pills not enabled"
            X.CHW r4 = new X.CHW
            r4.<init>(r1, r0)
            return r4
        L_0x0176:
            X.6BO r4 = X.AnonymousClass6BO.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2599143o.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
