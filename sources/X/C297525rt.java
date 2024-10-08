package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5rt  reason: invalid class name and case insensitive filesystem */
public final class C297525rt {
    public final UserSession A00;
    public final C297515rs A01;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (r27 < r0) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x026b, code lost:
        if (r28 < r0) goto L_0x026d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(com.instagram.api.schemas.MediaNoteMimicryTrigger r35, X.1Xj r36, java.lang.Integer r37, java.lang.String r38) {
        /*
            r34 = this;
            r31 = 0
            r32 = r36
            if (r36 == 0) goto L_0x031e
            if (r37 == 0) goto L_0x031e
            if (r35 == 0) goto L_0x031e
            int r1 = r35.ordinal()
            r0 = 2
            if (r1 != r0) goto L_0x031b
            int r1 = r37.intValue()
            r14 = r34
            r0 = r31
            if (r1 == r0) goto L_0x01b3
            r29 = 1
            r0 = r29
            if (r1 != r0) goto L_0x0315
            X.5rs r0 = r14.A01
            r33 = r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01af
            r27 = 1
        L_0x002b:
            r0 = r32
            X.1Xy r0 = r0.A0C
            X.5Gp r0 = r0.BQZ()
            if (r0 == 0) goto L_0x01ac
            com.instagram.api.schemas.MediaNoteMimicryType r1 = r0.CAQ()
        L_0x0039:
            com.instagram.api.schemas.MediaNoteMimicryType r0 = com.instagram.api.schemas.MediaNoteMimicryType.UFI_NUDGE
            r30 = 0
            if (r1 != r0) goto L_0x00bc
            r0 = r32
            X.1Xy r0 = r0.A0C
            X.5Gp r0 = r0.BQZ()
            if (r0 == 0) goto L_0x00bc
            java.util.List r1 = r0.C9z()
            if (r1 == 0) goto L_0x00bc
            com.instagram.api.schemas.MediaNoteMimicryTrigger r0 = com.instagram.api.schemas.MediaNoteMimicryTrigger.LIKE_TRIGGER
            boolean r1 = r1.contains(r0)
            r0 = r29
            if (r1 != r0) goto L_0x00bc
            com.instagram.common.session.UserSession r11 = r14.A00
            java.util.concurrent.TimeUnit r26 = java.util.concurrent.TimeUnit.DAYS
            X.0Tu r10 = X.0Tu.A05
            r0 = 37175256934449777(0x8412b300030271, double:3.573120405865982E-306)
            double r3 = X.182.A00(r10, r11, r0)
            long r1 = (long) r3
            r0 = r26
            long r24 = r0.toMillis(r1)
            r0 = 37175256934515314(0x8412b300040272, double:3.573120405907428E-306)
            double r0 = X.182.A00(r10, r11, r0)
            long r8 = (long) r0
            r0 = 37175256934580851(0x8412b300050273, double:3.573120405948874E-306)
            double r2 = X.182.A00(r10, r11, r0)
            long r0 = (long) r2
            r6 = 36612306981230912(0x8212b300061940, double:3.217108588632858E-306)
            long r18 = X.182.A01(r10, r11, r6)
            java.lang.String r13 = "content_notes_like_nudge_last_seen_time_ms"
            java.lang.String r23 = "content_notes_like_nudge_session_count"
            java.lang.String r12 = "content_notes_like_nudge_total_session_count"
            X.1Av r2 = X.1Au.A00(r11)
            X.0xa r2 = r2.A01
            r4 = 0
            long r16 = r2.getLong(r13, r4)
            X.1Av r2 = X.1Au.A00(r11)
            X.0xa r3 = r2.A01
            r2 = r23
            long r21 = r3.getLong(r2, r4)
            X.1Av r2 = X.1Au.A00(r11)
            X.0xa r2 = r2.A01
            long r2 = r2.getLong(r12, r4)
            int r15 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f0
            int r15 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f0
        L_0x00bc:
            if (r30 == 0) goto L_0x00ef
            java.lang.String r0 = r32.getId()
            if (r0 == 0) goto L_0x00ef
            r4 = r38
            if (r38 == 0) goto L_0x00ef
            com.instagram.common.session.UserSession r0 = r14.A00
            java.lang.String r3 = r32.getId()
            if (r3 == 0) goto L_0x031e
            X.0wc r2 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r1 = "instagram_media_note_nudge_to_create_impression_client"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "media_id"
            r1.AAJ(r0, r3)
            java.lang.String r0 = "container_module"
            r1.AAJ(r0, r4)
            r1.Cgf()
        L_0x00ef:
            return r30
        L_0x00f0:
            long r19 = java.lang.System.currentTimeMillis()
            long r19 = r19 - r16
            r17 = 1
            int r15 = (r19 > r24 ? 1 : (r19 == r24 ? 0 : -1))
            if (r15 >= 0) goto L_0x0163
            int r13 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x00bc
            int r8 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x00bc
        L_0x0104:
            X.1Av r0 = X.1Au.A00(r11)
            long r2 = r2 + r17
            X.0xa r0 = r0.A01
            X.0xY r0 = r0.AR4()
            r0.E5c(r12, r2)
            r0.apply()
            r30 = 1
            r0 = r33
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x015b
            r0 = 37175256934449777(0x8412b300030271, double:3.573120405865982E-306)
            double r2 = X.182.A00(r10, r11, r0)
            long r0 = (long) r2
            r2 = r26
            r2.toMillis(r0)
            r0 = 37175256934515314(0x8412b300040272, double:3.573120405907428E-306)
            double r0 = X.182.A00(r10, r11, r0)
            long r2 = (long) r0
            r0 = 37175256934580851(0x8412b300050273, double:3.573120405948874E-306)
            X.182.A00(r10, r11, r0)
            X.182.A01(r10, r11, r6)
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r1 = r0.A01
            r0 = r23
            long r4 = r1.getLong(r0, r4)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x015b
            X.1Av r0 = X.1Au.A00(r11)
            long r4 = r4 + r17
            r0.A0c(r4)
        L_0x015b:
            r1 = r29
            r0 = r33
            r0.A00 = r1
            goto L_0x00bc
        L_0x0163:
            long r15 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r0 = r0.A01
            long r0 = r0.getLong(r13, r4)
            long r15 = r15 - r0
            int r0 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x0191
            X.1Av r15 = X.1Au.A00(r11)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xa r15 = r15.A01
            X.0xY r15 = r15.AR4()
            r15.E5c(r13, r0)
            r15.apply()
            X.1Av r0 = X.1Au.A00(r11)
            r0.A0c(r4)
        L_0x0191:
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r1 = r0.A01
            r0 = r23
            long r0 = r1.getLong(r0, r4)
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x0104
            X.1Av r8 = X.1Au.A00(r11)
            long r0 = r0 + r17
            r8.A0c(r0)
            goto L_0x0104
        L_0x01ac:
            r1 = 0
            goto L_0x0039
        L_0x01af:
            r27 = 0
            goto L_0x002b
        L_0x01b3:
            X.5rs r0 = r14.A01
            r33 = r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0255
            r28 = 1
        L_0x01bd:
            r0 = r32
            X.1Xy r0 = r0.A0C
            X.5Gp r0 = r0.BQZ()
            if (r0 == 0) goto L_0x0252
            com.instagram.api.schemas.MediaNoteMimicryType r1 = r0.CAQ()
        L_0x01cb:
            com.instagram.api.schemas.MediaNoteMimicryType r0 = com.instagram.api.schemas.MediaNoteMimicryType.UFI_NUDGE
            r30 = 0
            r27 = 1
            if (r1 != r0) goto L_0x00bc
            r0 = r32
            X.1Xy r0 = r0.A0C
            X.5Gp r0 = r0.BQZ()
            if (r0 == 0) goto L_0x00bc
            java.util.List r1 = r0.C9z()
            if (r1 == 0) goto L_0x00bc
            com.instagram.api.schemas.MediaNoteMimicryTrigger r0 = com.instagram.api.schemas.MediaNoteMimicryTrigger.LIKE_TRIGGER
            boolean r1 = r1.contains(r0)
            r0 = r27
            if (r1 != r0) goto L_0x00bc
            com.instagram.common.session.UserSession r11 = r14.A00
            java.util.concurrent.TimeUnit r26 = java.util.concurrent.TimeUnit.DAYS
            X.0Tu r10 = X.0Tu.A05
            r0 = 37175256934449777(0x8412b300030271, double:3.573120405865982E-306)
            double r3 = X.182.A00(r10, r11, r0)
            long r1 = (long) r3
            r0 = r26
            long r24 = r0.toMillis(r1)
            r0 = 37175256934515314(0x8412b300040272, double:3.573120405907428E-306)
            double r0 = X.182.A00(r10, r11, r0)
            long r8 = (long) r0
            r0 = 37175256934580851(0x8412b300050273, double:3.573120405948874E-306)
            double r2 = X.182.A00(r10, r11, r0)
            long r0 = (long) r2
            r6 = 36612306981230912(0x8212b300061940, double:3.217108588632858E-306)
            long r18 = X.182.A01(r10, r11, r6)
            java.lang.String r13 = "content_notes_like_nudge_last_seen_time_ms"
            java.lang.String r23 = "content_notes_like_nudge_session_count"
            java.lang.String r12 = "content_notes_like_nudge_total_session_count"
            X.1Av r2 = X.1Au.A00(r11)
            X.0xa r2 = r2.A01
            r4 = 0
            long r16 = r2.getLong(r13, r4)
            X.1Av r2 = X.1Au.A00(r11)
            X.0xa r3 = r2.A01
            r2 = r23
            long r21 = r3.getLong(r2, r4)
            X.1Av r2 = X.1Au.A00(r11)
            X.0xa r2 = r2.A01
            long r2 = r2.getLong(r12, r4)
            int r15 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x0259
            int r15 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r15 <= 0) goto L_0x0259
            goto L_0x00bc
        L_0x0252:
            r1 = 0
            goto L_0x01cb
        L_0x0255:
            r28 = 0
            goto L_0x01bd
        L_0x0259:
            long r19 = java.lang.System.currentTimeMillis()
            long r19 = r19 - r16
            r17 = 1
            int r15 = (r19 > r24 ? 1 : (r19 == r24 ? 0 : -1))
            if (r15 >= 0) goto L_0x02cc
            int r13 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x00bc
            int r8 = (r28 > r0 ? 1 : (r28 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x00bc
        L_0x026d:
            X.1Av r0 = X.1Au.A00(r11)
            long r2 = r2 + r17
            X.0xa r0 = r0.A01
            X.0xY r0 = r0.AR4()
            r0.E5c(r12, r2)
            r0.apply()
            r30 = 1
            r0 = r33
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x02c4
            r0 = 37175256934449777(0x8412b300030271, double:3.573120405865982E-306)
            double r2 = X.182.A00(r10, r11, r0)
            long r0 = (long) r2
            r2 = r26
            r2.toMillis(r0)
            r0 = 37175256934515314(0x8412b300040272, double:3.573120405907428E-306)
            double r0 = X.182.A00(r10, r11, r0)
            long r2 = (long) r0
            r0 = 37175256934580851(0x8412b300050273, double:3.573120405948874E-306)
            X.182.A00(r10, r11, r0)
            X.182.A01(r10, r11, r6)
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r1 = r0.A01
            r0 = r23
            long r4 = r1.getLong(r0, r4)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c4
            X.1Av r0 = X.1Au.A00(r11)
            long r4 = r4 + r17
            r0.A0c(r4)
        L_0x02c4:
            r1 = r27
            r0 = r33
            r0.A01 = r1
            goto L_0x00bc
        L_0x02cc:
            long r15 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r0 = r0.A01
            long r0 = r0.getLong(r13, r4)
            long r15 = r15 - r0
            int r0 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x02fa
            X.1Av r15 = X.1Au.A00(r11)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xa r15 = r15.A01
            X.0xY r15 = r15.AR4()
            r15.E5c(r13, r0)
            r15.apply()
            X.1Av r0 = X.1Au.A00(r11)
            r0.A0c(r4)
        L_0x02fa:
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r1 = r0.A01
            r0 = r23
            long r0 = r1.getLong(r0, r4)
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x026d
            X.1Av r8 = X.1Au.A00(r11)
            long r0 = r0 + r17
            r8.A0c(r0)
            goto L_0x026d
        L_0x0315:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x031b:
            r30 = 0
            return r30
        L_0x031e:
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297525rt.A00(com.instagram.api.schemas.MediaNoteMimicryTrigger, X.1Xj, java.lang.Integer, java.lang.String):boolean");
    }

    public C297525rt(UserSession userSession, C297515rs r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
