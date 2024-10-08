package X;

/* renamed from: X.7FI  reason: invalid class name */
public abstract class AnonymousClass7FI {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (X.0qQ.A0K(r1, "placeholder") == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (X.C69420Nl2.A00(r6.A0l()) == X.C69420Nl2.A03) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        if (X.C69421Nl3.A00(r6.A0n()) == X.C69421Nl3.A0C) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.session.UserSession r5, X.C254703su r6, int r7, boolean r8, boolean r9) {
        /*
            r2 = 0
            X.1at r1 = X.C327657Br.A00()
            X.2FW r0 = r6.A10
            X.0qQ.A07(r0)
            X.7Bu r3 = r1.A01(r0)
            java.lang.Object r1 = r6.A1T
            boolean r0 = r1 instanceof X.AnonymousClass7FJ
            r4 = 0
            if (r0 == 0) goto L_0x0022
            X.7FJ r1 = (X.AnonymousClass7FJ) r1
            java.lang.Boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.Integer r1 = r6.A1F
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x00a5
            java.lang.String r0 = r6.A0g()
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r6.A2P
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r6.A1T()
            if (r0 != 0) goto L_0x00a5
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r6.A13
            if (r0 != 0) goto L_0x00a5
            com.google.common.collect.ImmutableList r0 = r6.A0H()
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0060
            com.google.common.collect.ImmutableList r0 = r6.A0H()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r0.get(r2)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = r0.A12
        L_0x0058:
            java.lang.String r0 = "placeholder"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a5
        L_0x0060:
            boolean r0 = r6.A1S()
            if (r0 == 0) goto L_0x00a6
            r6.A0H()
            java.lang.String r0 = r6.A0l()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r6.A0n()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r6.A0l()
            X.Nl2 r1 = X.C69420Nl2.A00(r0)
            X.Nl2 r0 = X.C69420Nl2.MENTION
            if (r1 == r0) goto L_0x0099
            java.lang.String r0 = r6.A0l()
            X.Nl2 r1 = X.C69420Nl2.A00(r0)
            X.Nl2 r0 = X.C69420Nl2.REPLY
            if (r1 == r0) goto L_0x0099
            java.lang.String r0 = r6.A0l()
            X.Nl2 r1 = X.C69420Nl2.A00(r0)
            X.Nl2 r0 = X.C69420Nl2.REACT
            if (r1 != r0) goto L_0x00a6
        L_0x0099:
            java.lang.String r0 = r6.A0n()
            X.Nl3 r1 = X.C69421Nl3.A00(r0)
            X.Nl3 r0 = X.C69421Nl3.STORY
            if (r1 != r0) goto L_0x00a6
        L_0x00a5:
            return r4
        L_0x00a6:
            if (r8 != 0) goto L_0x00a5
            if (r9 != 0) goto L_0x00a5
            r0 = 29
            if (r7 != r0) goto L_0x00de
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319342967659670(0x81084000101c96, double:3.0318369667790094E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00de
        L_0x00bb:
            r0 = 61
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a5
            X.1iA r1 = r6.A0W()
            X.1iA r0 = X.1iA.A0E
            if (r1 == r0) goto L_0x00a5
            r4 = 1
            return r4
        L_0x00de:
            boolean r0 = r3.AFS(r5, r6, r7)
            if (r0 == 0) goto L_0x00a5
            X.9HW r2 = X.AnonymousClass9HV.A00(r5)
            X.3t0 r1 = r6.A0U()
            r0 = 5
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x00a5
            goto L_0x00bb
        L_0x00f4:
            r1 = 0
            goto L_0x0058
        L_0x00f7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Message id null for uploaded message. Message type = "
            r1.append(r0)
            X.2FW r0 = r6.A10
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ForwardingUtil"
            X.0wb.A03(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FI.A00(com.instagram.common.session.UserSession, X.3su, int, boolean, boolean):boolean");
    }
}
