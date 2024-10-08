package com.instagram.direct.fragment.channels.periodicpolling.threadview;

public final class BroadcastChannelPollRefresher {
    public static final BroadcastChannelPollRefresher A00 = new Object();

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r14, com.instagram.model.direct.DirectThreadKey r15, X.AnonymousClass4D7 r16, int r17, boolean r18) {
        /*
            r13 = this;
            r3 = 17
            r4 = r16
            boolean r0 = X.C66145MDx.A02(r3, r4)
            if (r0 == 0) goto L_0x0126
            r5 = r4
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0126
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r3) goto L_0x012d
            java.lang.Object r6 = r5.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r5.A01
            X.2Dm r2 = (X.2Dm) r2
            X.0eS.A00(r1)
        L_0x002e:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.77b r0 = (X.C3265177b) r0
            java.util.List r0 = r0.A00
            X.0qQ.A07(r0)
            r2.FKK(r0, r6)
        L_0x0042:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0045:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0042
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004e:
            X.0eS.A00(r1)
            X.2Dm r2 = X.1bJ.A00(r14)
            java.util.ArrayList r0 = r2.Aax(r15, r3)
            r1 = r17
            java.util.List r0 = X.00k.A0h(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x0067:
            boolean r0 = r8.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.Object r7 = r8.next()
            r0 = r7
            X.3su r0 = (X.C254703su) r0
            X.2FW r6 = r0.A10
            X.2FW r0 = X.2FW.A0k
            if (r6 != r0) goto L_0x0067
            r1.add(r7)
            goto L_0x0067
        L_0x007f:
            java.lang.String r6 = r15.A00
            if (r6 == 0) goto L_0x0132
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0042
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r1.iterator()
        L_0x0099:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d2
            X.3su r1 = X.C66580MXl.A0a(r12)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r1.A0V()
            java.lang.String r0 = r0.A01
            r7.add(r0)
            java.lang.String r0 = r1.A0f()
            r8.add(r0)
            com.google.common.collect.ImmutableList r0 = r1.A0H()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r0 = X.00k.A0O(r0, r10)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x00d0
            long r0 = r0.A0D
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r0)
        L_0x00c8:
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r9.add(r0)
            goto L_0x0099
        L_0x00d0:
            r11 = 0
            goto L_0x00c8
        L_0x00d2:
            if (r18 == 0) goto L_0x00e6
            r0 = 0
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A0E(r14, r6, r0, r7, r8)
        L_0x00d9:
            X.C66145MDx.A00(r2, r6, r5, r3)
            r0 = 637518912(0x25ffc440, float:4.4368433E-16)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x002e
            return r4
        L_0x00e6:
            X.0qQ.A0B(r14, r10)
            X.0qQ.A0B(r6, r3)
            X.1NY r8 = X.AnonymousClass7TG.A0b(r14)
            java.lang.String r0 = "direct_v2/threads/broadcast/fetch_polls_messages/"
            X.C66583MXo.A1F(r8, r0, r6)
            r10 = 91
            r11 = 44
            X.3El r0 = X.C239023El.A00(r11)
            java.lang.String r0 = r0.A02(r7)
            r7 = 93
            java.lang.String r1 = X.002.A0E(r0, r10, r7)
            java.lang.String r0 = "item_ids"
            r8.A9m(r0, r1)
            X.3El r0 = X.C239023El.A00(r11)
            java.lang.String r0 = r0.A02(r9)
            java.lang.String r1 = X.002.A0E(r0, r10, r7)
            java.lang.String r0 = "poll_question_ids"
            r8.A9m(r0, r1)
            java.lang.Class<X.77b> r1 = X.C3265177b.class
            java.lang.Class<X.77c> r0 = X.AnonymousClass77c.class
            X.1OC r1 = X.DbU.A0S(r8, r1, r0)
            goto L_0x00d9
        L_0x0126:
            X.MDx r5 = new X.MDx
            r5.<init>(r13, r4, r3)
            goto L_0x0018
        L_0x012d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0132:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.periodicpolling.threadview.BroadcastChannelPollRefresher.A00(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, X.4D7, int, boolean):java.lang.Object");
    }
}
