package X;

/* renamed from: X.NxF  reason: case insensitive filesystem */
public abstract class C70099NxF {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r20.A1X != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r2.length() <= 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r2 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r2.length() <= 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r12 = X.AnonymousClass7TE.A1I(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        return new X.AnonymousClass7FT(new X.C61063Jw1(r4, r1, r0), r21, X.C327627Bo.NUX_TYPE_NONE, r24, r10, (com.instagram.model.direct.messageid.MessageIdentifier) null, r12, r13, r15, r16, r17, r18, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7FT A00(X.AnonymousClass9HC r20, X.AnonymousClass7FR r21, com.instagram.direct.model.messaginguser.MessagingUser r22, X.C74552Pwl r23, X.2FW r24, int r25, boolean r26, boolean r27) {
        /*
            r19 = 0
            r1 = r23
            r0 = r25
            X.7Fa r5 = X.C71095OcV.A00(r1, r0)
            if (r26 == 0) goto L_0x00b1
            java.lang.Long r2 = r1.BmV(r0)
            if (r2 == 0) goto L_0x00b7
            long r2 = r2.longValue()
        L_0x0016:
            r4 = r22
            boolean r18 = r4.A01(r2)
            java.lang.Long r2 = r1.BNc(r0)
            java.lang.String r7 = r1.BSF(r0)
            r11 = 0
            if (r2 == 0) goto L_0x00ae
            java.lang.String r6 = r2.toString()
        L_0x002b:
            X.O7p r2 = r1.Bjo(r0)
            r12 = 0
            if (r2 == 0) goto L_0x00ac
            r9 = 0
            java.util.List r8 = r2.A00
            int r3 = r8.size()
        L_0x0039:
            if (r9 >= r3) goto L_0x00ac
            java.lang.Object r2 = r8.get(r9)
            X.OGx r2 = (X.C70702OGx) r2
            java.lang.String r10 = r2.A03
            java.lang.String r2 = r4.A03
            boolean r2 = X.0qQ.A0K(r10, r2)
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r8.get(r9)
            X.OGx r2 = (X.C70702OGx) r2
            java.lang.String r2 = r2.A02
        L_0x0053:
            com.instagram.model.direct.messageid.MessageIdentifier r10 = X.C66580MXl.A0i(r7, r6)
            long r13 = r1.C7b(r0)
            if (r27 == 0) goto L_0x006c
            X.7Fa r3 = X.C328497Fa.SENT
            if (r5 == r3) goto L_0x0065
            X.7Fa r3 = X.C328497Fa.NONE
            if (r5 != r3) goto L_0x006c
        L_0x0065:
            r3 = r20
            boolean r3 = r3.A1X
            r15 = 1
            if (r3 != 0) goto L_0x006d
        L_0x006c:
            r15 = 0
        L_0x006d:
            if (r18 == 0) goto L_0x00a6
            X.7Fa r3 = X.C328497Fa.FAILED
            if (r5 == r3) goto L_0x007b
            X.7Fa r3 = X.C328497Fa.SENDING
            if (r5 == r3) goto L_0x007b
            X.7Fa r3 = X.C328497Fa.PERMANENTLY_FAILED
            if (r5 != r3) goto L_0x00a6
        L_0x007b:
            r16 = 1
        L_0x007d:
            if (r2 == 0) goto L_0x0087
            int r3 = r2.length()
            r17 = 1
            if (r3 > 0) goto L_0x008b
        L_0x0087:
            r17 = 0
            if (r2 == 0) goto L_0x0095
        L_0x008b:
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0095
            java.util.List r12 = X.AnonymousClass7TE.A1I(r2)
        L_0x0095:
            X.Jw1 r6 = new X.Jw1
            r6.<init>((com.instagram.direct.model.messaginguser.MessagingUser) r4, (X.C74552Pwl) r1, (int) r0)
            X.7Bo r8 = X.C327627Bo.NUX_TYPE_NONE
            X.7FT r5 = new X.7FT
            r7 = r21
            r9 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)
            return r5
        L_0x00a6:
            r16 = 0
            goto L_0x007d
        L_0x00a9:
            int r9 = r9 + 1
            goto L_0x0039
        L_0x00ac:
            r2 = r11
            goto L_0x0053
        L_0x00ae:
            r6 = r11
            goto L_0x002b
        L_0x00b1:
            long r2 = r1.BsH(r0)
            goto L_0x0016
        L_0x00b7:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70099NxF.A00(X.9HC, X.7FR, com.instagram.direct.model.messaginguser.MessagingUser, X.Pwl, X.2FW, int, boolean, boolean):X.7FT");
    }
}
