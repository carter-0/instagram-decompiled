package X;

/* renamed from: X.Nvl  reason: case insensitive filesystem */
public abstract class C70007Nvl {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r1 == X.C278114wI.POST_LIVE) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r1.A00() == false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.NYQ A00(android.content.Context r16, com.instagram.common.session.UserSession r17, X.AnonymousClass9HC r18, X.AnonymousClass7LQ r19, X.AnonymousClass7L2 r20, java.util.Map r21) {
        /*
            r3 = r16
            r10 = r17
            r13 = r20
            X.C51974G9v.A1K(r3, r10, r13)
            r11 = r18
            r6 = r21
            X.AnonymousClass7TG.A1R(r11, r6)
            r12 = r19
            X.3su r2 = r12.A0e
            X.0qQ.A07(r2)
            java.lang.Object r4 = r2.A1T
            boolean r0 = r4 instanceof X.C45425Cw5
            if (r0 == 0) goto L_0x0106
            r0 = 3078(0xc06, float:4.313E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r4, r0)
            X.Cw5 r4 = (X.C45425Cw5) r4
            X.4gL r7 = r4.A01
            r18 = 0
            if (r7 == 0) goto L_0x00e4
            X.4wI r0 = r7.A06
            r1 = r0
            if (r0 != 0) goto L_0x0035
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x0035:
            boolean r0 = r0.A00()
            r9 = 0
            if (r0 == 0) goto L_0x0045
            r9 = 1
            if (r1 != 0) goto L_0x0041
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x0041:
            X.4wI r0 = X.C278114wI.POST_LIVE
            if (r1 != r0) goto L_0x0047
        L_0x0045:
            r18 = 1
        L_0x0047:
            r0 = 0
            if (r18 == 0) goto L_0x00aa
            if (r9 != 0) goto L_0x005a
            com.instagram.user.model.User r5 = X.AnonymousClass7TF.A0Q(r10)
            com.instagram.user.model.User r1 = r7.A03()
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 != 0) goto L_0x00aa
        L_0x005a:
            java.lang.String r1 = r7.A0X
            r1.getClass()
            r6.put(r1, r7)
            java.lang.String r1 = r7.A05(r10)
            if (r1 == 0) goto L_0x00d8
            X.4wI r1 = r7.A06
            if (r1 != 0) goto L_0x006e
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x006e:
            boolean r1 = r1.A00()
            if (r1 != 0) goto L_0x00d8
        L_0x0074:
            java.lang.String r8 = r2.A1u
            X.0qQ.A07(r8)
            java.lang.String r5 = r7.A0X
            r5.getClass()
            r1 = 11
            X.Jvb r6 = new X.Jvb
            r6.<init>(r8, r5, r0, r1)
        L_0x0085:
            r21 = r9 ^ 1
            X.3NV r5 = r7.A0A
            if (r5 != 0) goto L_0x008d
            X.3NV r5 = X.AnonymousClass3NV.A08
        L_0x008d:
            int r18 = r7.A00()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Long r0 = r7.A0S
            if (r0 != 0) goto L_0x00d3
            r0 = 0
        L_0x0099:
            long r19 = r8.toMillis(r0)
            java.lang.String r1 = r4.A04
            X.NZs r0 = new X.NZs
            r17 = r1
            r14 = r0
            r15 = r6
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19, r21)
        L_0x00aa:
            java.lang.Boolean r15 = X.AnonymousClass7TE.A0u()
            r4 = 0
            X.7FC r1 = X.AnonymousClass7FC.A00
            X.0t0 r17 = X.AnonymousClass0eN.A01(r1)
            r18 = 1
            X.2FW r14 = r2.A10
            r16 = r15
            X.7FE r5 = X.AnonymousClass7FD.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = 3
            X.76s r1 = new X.76s
            r1.<init>(r4, r4, r4, r2)
            r2 = r1
            r4 = r10
            r6 = r11
            r7 = r12
            X.7Fr r2 = r2.A01(r3, r4, r5, r6, r7)
            X.NYQ r1 = new X.NYQ
            r1.<init>(r2, r0)
            return r1
        L_0x00d3:
            long r0 = r0.longValue()
            goto L_0x0099
        L_0x00d8:
            X.4wI r5 = r7.A06
            if (r5 != 0) goto L_0x00de
            X.4wI r5 = X.C278114wI.UNKNOWN
        L_0x00de:
            X.4wI r1 = X.C278114wI.POST_LIVE
            if (r5 == r1) goto L_0x0074
            r6 = r0
            goto L_0x0085
        L_0x00e4:
            java.lang.String r7 = r2.A1u
            X.0qQ.A07(r7)
            java.lang.String r6 = r4.A03
            java.lang.String r1 = r4.A05
            r0 = 11
            X.Jvb r5 = new X.Jvb
            r5.<init>(r7, r6, r1, r0)
            X.3NV r16 = X.AnonymousClass3NV.A08
            java.lang.String r1 = r4.A04
            r19 = 0
            X.NZs r0 = new X.NZs
            r17 = r1
            r21 = r18
            r14 = r0
            r15 = r5
            r14.<init>(r15, r16, r17, r18, r19, r21)
            goto L_0x00aa
        L_0x0106:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "directMessage.content required to be DirectLiveViewerInvite but is "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r4, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70007Nvl.A00(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2, java.util.Map):X.NYQ");
    }
}
