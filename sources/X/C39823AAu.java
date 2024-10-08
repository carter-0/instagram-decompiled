package X;

/* renamed from: X.AAu  reason: case insensitive filesystem */
public abstract class C39823AAu {
    public static C343647qZ A00(C343927r2 r3, Object obj, String str, String str2) {
        C343647qZ r2 = new C343647qZ(str);
        r2.A02(C343677qc.A00, obj);
        r2.A02(C343737qi.A02, C343747qj.A06);
        r2.A02(C343737qi.A0I, r3.BAM(str2));
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36324372373385262L) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C344207rU A01(android.content.Context r17, X.C344497rx r18, X.C343927r2 r19, com.instagram.common.session.UserSession r20, java.lang.String r21, java.lang.String r22, java.util.LinkedHashMap r23, boolean r24, boolean r25) {
        /*
            r6 = r21
            r4 = 0
            r3 = 1
            r15 = r20
            X.0qQ.A0B(r15, r3)
            r0 = 7
            r7 = r19
            r5 = r22
            X.AnonymousClass7TF.A1F(r7, r0, r5)
            r0 = 6
            X.AR5 r2 = new X.AR5
            r1 = r18
            r2.<init>(r1, r0)
            if (r24 != 0) goto L_0x0089
            X.0Tu r8 = X.0Tu.A05
            r0 = 36319476111318453(0x81085f000b1db5, double:3.03192116736495E-306)
            boolean r18 = X.182.A06(r8, r15, r0)
            if (r18 == 0) goto L_0x002f
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "IgOneCameraServiceFactory"
            X.AnonymousClass7TG.A1H(r1, r0)
        L_0x002f:
            java.lang.String r16 = "IgOneCameraServiceFactory"
            r14 = r17
            r20 = r4
            r19 = r4
            r17 = r3
            X.8o6 r9 = X.C365968ny.A01(r14, r15, r16, r17, r18, r19, r20)
            if (r23 == 0) goto L_0x0053
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0053
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324372373385262(0x810cd30001302e, double:3.035017583211665E-306)
            boolean r0 = X.182.A06(r8, r15, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            X.7rr r0 = X.C343897qz.A01()
            r0.A00(r5, r4)
            if (r24 == 0) goto L_0x008c
            if (r21 != 0) goto L_0x0065
            r0 = 3369(0xd29, float:4.721E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
        L_0x0065:
            X.7qZ r4 = A00(r7, r15, r6, r5)
            X.7qb r0 = X.C343737qi.A0E
            r4.A02(r0, r9)
            X.7qb r0 = X.C343737qi.A0F
            r4.A02(r0, r2)
            X.7qb r0 = X.C366138oF.A00
            X.C343647qZ.A00(r4, r0, r3)
            X.7qa r1 = new X.7qa
            r1.<init>(r4)
            X.AUX r0 = new X.AUX
            r2 = r25
            r0.<init>(r2)
            X.7rU r0 = X.C343807qq.A00(r14, r1, r0)
            return r0
        L_0x0089:
            r18 = 0
            goto L_0x002f
        L_0x008c:
            java.lang.String r13 = "instagram_post_capture"
            if (r1 == 0) goto L_0x00d7
            r18 = r4
            X.8o6 r8 = X.C365968ny.A01(r14, r15, r16, r17, r18, r19, r20)
            X.7ro r1 = new X.7ro
            r1.<init>()
            X.A6G r0 = new X.A6G
            r0.<init>(r15, r14)
            X.ATr r11 = new X.ATr
            r11.<init>(r1, r8, r0)
            if (r23 == 0) goto L_0x00d2
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r23)
        L_0x00b3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r12)
            java.lang.Object r0 = r1.getKey()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            java.lang.Object r1 = r1.getValue()
            java.lang.String r0 = X.AnonymousClass45F.A03(r0)
            r10.add(r0)
            r8.add(r1)
            goto L_0x00b3
        L_0x00d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00d7:
            if (r21 != 0) goto L_0x00da
            r6 = r13
        L_0x00da:
            X.7qZ r5 = A00(r7, r15, r6, r5)
            X.7qb r0 = X.C343737qi.A0C
            r5.A02(r0, r9)
            X.7qb r0 = X.C343737qi.A0F
            r5.A02(r0, r2)
            X.7qb r0 = X.C366138oF.A00
            X.C343647qZ.A00(r5, r0, r3)
            goto L_0x011a
        L_0x00ee:
            X.A6G r1 = r11.A04
            X.A7i r0 = new X.A7i
            r0.<init>(r1, r10, r8)
            r11.A01 = r0
            X.7sL[] r0 = new X.C344737sL[]{r9, r11}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            X.9W5 r1 = new X.9W5
            r1.<init>(r0)
            if (r21 != 0) goto L_0x0107
            r6 = r13
        L_0x0107:
            X.7qZ r5 = A00(r7, r15, r6, r5)
            X.7qb r0 = X.C343737qi.A0C
            r5.A02(r0, r1)
            X.7qb r0 = X.C343737qi.A0F
            r5.A02(r0, r2)
            X.7qb r0 = X.C366138oF.A00
            X.C343647qZ.A00(r5, r0, r3)
        L_0x011a:
            X.7qa r1 = new X.7qa
            r1.<init>(r5)
            X.AUY r0 = new X.AUY
            r0.<init>(r4)
            X.7rU r0 = X.C343807qq.A00(r14, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39823AAu.A01(android.content.Context, X.7rx, X.7r2, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.LinkedHashMap, boolean, boolean):X.7rU");
    }
}
