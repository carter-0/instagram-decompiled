package com.instagram.direct.fragment.channels.periodicpolling.threadview;

public final class CountBasedReactionRefresher {
    public static final CountBasedReactionRefresher A00 = new Object();

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r12, com.instagram.model.direct.DirectThreadKey r13, X.AnonymousClass4D7 r14, int r15) {
        /*
            r11 = this;
            r4 = 18
            boolean r0 = X.C66145MDx.A02(r4, r14)
            if (r0 == 0) goto L_0x0111
            r3 = r14
            X.MDx r3 = (X.C66145MDx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0111
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r10 = 1
            if (r0 == 0) goto L_0x0087
            if (r0 != r10) goto L_0x01ab
            java.lang.Object r2 = r3.A02
            X.2Dm r2 = (X.2Dm) r2
            java.lang.Object r13 = r3.A01
            com.instagram.model.direct.DirectThreadKey r13 = (com.instagram.model.direct.DirectThreadKey) r13
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0125
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.Gyl r0 = (X.C54062Gyl) r0
            java.util.List r1 = r0.A00
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r7 = X.DbS.A0x(r0)
            java.util.Iterator r9 = r1.iterator()
        L_0x004c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r9.next()
            X.Hkk r0 = (X.C55625Hkk) r0
            java.lang.String r8 = r0.A00
            if (r8 == 0) goto L_0x011b
            java.util.List r0 = r0.A01
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0066:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r5.next()
            X.HmH r0 = (X.C55720HmH) r0
            java.lang.String r4 = r0.A01
            if (r4 == 0) goto L_0x0118
            int r3 = r0.A00
            boolean r1 = r0.A02
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r0 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction
            r0.<init>(r4, r3, r1)
            r6.add(r0)
            goto L_0x0066
        L_0x0083:
            r7.put(r8, r6)
            goto L_0x004c
        L_0x0087:
            X.0eS.A00(r1)
            X.2Dm r2 = X.1bJ.A00(r12)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = r2.Aax(r13, r10)
            java.util.List r0 = X.00k.A0h(r0, r15)
            java.util.Iterator r5 = r0.iterator()
        L_0x00a2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c3
            X.3su r1 = X.C66580MXl.A0a(r5)
            X.2FW r0 = r1.A10
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00a2
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r1.A0V()
            java.lang.String r0 = r0.A01
            r6.add(r0)
            java.lang.String r0 = r1.A0f()
            r8.add(r0)
            goto L_0x00a2
        L_0x00c3:
            java.lang.String r1 = r13.A00
            if (r1 == 0) goto L_0x01b0
            X.1NY r5 = X.DbU.A0O(r12)
            java.lang.String r0 = "direct_v2/threads/broadcast/fetch_reactions_for_messages/"
            X.C66583MXo.A1F(r5, r0, r1)
            java.lang.String r7 = "["
            r9 = 44
            X.3El r0 = X.C239023El.A00(r9)
            java.lang.String r0 = r0.A02(r6)
            java.lang.String r6 = "]"
            java.lang.String r1 = X.002.A0g(r7, r0, r6)
            java.lang.String r0 = "item_ids"
            r5.A9m(r0, r1)
            X.3El r0 = X.C239023El.A00(r9)
            java.lang.String r0 = r0.A02(r8)
            java.lang.String r1 = X.002.A0g(r7, r0, r6)
            r0 = 1661(0x67d, float:2.328E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9m(r0, r1)
            java.lang.Class<X.Gyl> r1 = X.C54062Gyl.class
            java.lang.Class<X.HwA> r0 = X.C56297HwA.class
            X.1OC r1 = X.DbT.A0S(r5, r1, r0)
            X.C66145MDx.A00(r13, r2, r3, r10)
            r0 = 637518912(0x25ffc440, float:4.4368433E-16)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r4) goto L_0x002c
            return r4
        L_0x0111:
            X.MDx r3 = new X.MDx
            r3.<init>(r11, r14, r4)
            goto L_0x0016
        L_0x0118:
            java.lang.String r0 = "emoji"
            goto L_0x011d
        L_0x011b:
            java.lang.String r0 = "itemId"
        L_0x011d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0125:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0145
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x012e:
            X.2Dr r2 = (X.2Dr) r2
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.48S r1 = r2.A0P(r13)
            if (r1 != 0) goto L_0x0148
            java.lang.String r1 = "Null thread entry"
            r0 = 226(0xe2, float:3.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
        L_0x0145:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0148:
            monitor-enter(r1)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01a8 }
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r7)     // Catch:{ all -> 0x01a8 }
        L_0x0151:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x0186
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r5)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = X.DbT.A13(r3)     // Catch:{ all -> 0x01a8 }
            X.3su r4 = r1.A0J(r0)     // Catch:{ all -> 0x01a8 }
            if (r4 != 0) goto L_0x0174
            X.0wj r4 = X.0wj.A01     // Catch:{ all -> 0x01a8 }
            r3 = 20134884(0x1333be4, float:3.2920077E-38)
            r0 = 4374(0x1116, float:6.129E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x01a8 }
            X.DbT.A1Q(r4, r0, r3)     // Catch:{ all -> 0x01a8 }
            goto L_0x0196
        L_0x0174:
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x01a8 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x01a8 }
            com.instagram.common.session.UserSession r0 = r1.A0H     // Catch:{ all -> 0x01a8 }
            boolean r0 = r4.A1h(r0, r3)     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x0151
            r9.add(r4)     // Catch:{ all -> 0x01a8 }
            goto L_0x0151
        L_0x0186:
            X.3U9 r0 = r1.A0I     // Catch:{ all -> 0x01a8 }
            com.instagram.model.direct.DirectThreadKey r5 = r0.BJz()     // Catch:{ all -> 0x01a8 }
            r7 = 0
            java.lang.Integer r6 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x01a8 }
            X.2Kb r4 = new X.2Kb     // Catch:{ all -> 0x01a8 }
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01a8 }
            goto L_0x0197
        L_0x0196:
            r4 = 0
        L_0x0197:
            monitor-exit(r1)
            if (r4 == 0) goto L_0x0145
            X.1Ng r0 = r2.A06
            r0.A00(r4)
            X.2FF r0 = r2.A09
            r0.accept(r4)
            X.2Dr.A0F(r2, r1)
            goto L_0x0145
        L_0x01a8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.periodicpolling.threadview.CountBasedReactionRefresher.A00(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, X.4D7, int):java.lang.Object");
    }
}
