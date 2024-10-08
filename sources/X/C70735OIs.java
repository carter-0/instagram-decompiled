package X;

/* renamed from: X.OIs  reason: case insensitive filesystem */
public final class C70735OIs {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cc, code lost:
        if (r1.CeK(r0) == false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C72583PBo A00(com.instagram.common.session.UserSession r44, X.C74549Pwi r45, int r46) {
        /*
            r43 = this;
            r5 = 0
            r10 = r44
            X.0qQ.A0B(r10, r5)
            X.2HN r0 = X.2HM.A00(r10)
            X.0eM r0 = r0.A1W
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r6 = 0
            if (r0 == 0) goto L_0x004c
            X.17i r2 = X.17h.A00(r10)
        L_0x0017:
            r1 = r45
            r0 = r46
            java.util.Map r4 = r1.Bam(r2, r0)
            int r3 = r1.C6j(r0)
            r2 = 15
            if (r3 != r2) goto L_0x0058
            if (r4 == 0) goto L_0x0058
            java.util.Collection r2 = r4.values()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r2.iterator()
        L_0x0035:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r7 = r8.next()
            r2 = r7
            X.0eP r2 = (X.0eP) r2
            java.lang.Object r3 = r2.A00
            com.instagram.user.model.User r2 = X.AnonymousClass0eD.A00(r10)
            X.DbY.A1T(r3, r2, r7, r9)
            goto L_0x0035
        L_0x004c:
            r2 = r6
            goto L_0x0017
        L_0x004e:
            boolean r2 = r9 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0146
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x0146
        L_0x0058:
            r41 = 0
        L_0x005a:
            int r2 = r1.C6j(r0)
            boolean r2 = X.OPx.A00(r2)
            if (r2 == 0) goto L_0x0140
            X.2HN r2 = X.2HM.A00(r10)
            X.2HR r2 = r2.A02
            boolean r2 = X.DbX.A1Z(r2)
            if (r2 != 0) goto L_0x0140
            X.0sn r22 = X.0sn.A00
        L_0x0072:
            java.util.List r23 = r1.BS6(r0)
            long r2 = r1.C6J(r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.instagram.model.direct.DirectThreadKey r12 = new com.instagram.model.direct.DirectThreadKey
            r12.<init>(r2, r6)
            long r2 = r1.C6J(r0)
            java.lang.Long r7 = r1.C65(r0)
            int r6 = r1.C6j(r0)
            boolean r6 = X.C70093Nx9.A00(r6)
            if (r6 == 0) goto L_0x013c
            X.3tH r6 = X.C254923tH.ACT
        L_0x0097:
            com.instagram.model.direct.threadkey.impl.MsysThreadId r14 = new com.instagram.model.direct.threadkey.impl.MsysThreadId
            r14.<init>(r6, r7, r2)
            int r25 = r1.BYA(r0)
            java.lang.String r17 = r1.C6T(r0)
            int r26 = r1.C6j(r0)
            boolean r32 = r1.CeK(r0)
            long r30 = r1.Bxc(r0)
            java.lang.String r18 = r1.C6V(r0)
            java.lang.Integer r2 = r1.CBl(r0)
            int r27 = X.AnonymousClass7TG.A0A(r2)
            boolean r33 = r1.Cdu(r0)
            boolean r2 = r1.Cdu(r0)
            if (r2 == 0) goto L_0x00ce
            boolean r2 = r1.CeK(r0)
            r34 = 1
            if (r2 != 0) goto L_0x00d0
        L_0x00ce:
            r34 = 0
        L_0x00d0:
            boolean r35 = r1.CXv(r0)
            boolean r36 = r1.CXC(r0)
            boolean r37 = r1.CXw(r0)
            int r2 = r1.B6h(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.Mkq r11 = X.C67238MkY.A02(r2)
            int r28 = r1.C67(r0)
            java.lang.String r19 = r1.BxJ(r0)
            java.lang.String r20 = r1.BKy(r0)
            java.lang.String r21 = r1.BKz(r0)
            java.lang.Integer r2 = r1.BUH(r0)
            int r29 = X.DbX.A01(r2)
            java.lang.Long r15 = r1.BL0(r0)
            java.lang.String r2 = ""
            java.util.List r2 = X.C253053q8.A07(r2)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0139
            X.2FW r13 = X.2FW.A1g
        L_0x0112:
            r7 = 1
            if (r4 == 0) goto L_0x0162
            java.util.Set r2 = r4.keySet()
            if (r2 == 0) goto L_0x0162
            java.util.List r3 = X.00k.A0a(r2)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r3.iterator()
        L_0x0127:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0164
            java.lang.Object r3 = r8.next()
            boolean r6 = X.C51966G9m.A1W(r10, r3)
            X.DbV.A1U(r3, r2, r6)
            goto L_0x0127
        L_0x0139:
            X.2FW r13 = X.2FW.A17
            goto L_0x0112
        L_0x013c:
            X.3tH r6 = X.C254923tH.MI
            goto L_0x0097
        L_0x0140:
            java.util.List r22 = r1.BrM(r0)
            goto L_0x0072
        L_0x0146:
            java.util.Iterator r3 = r9.iterator()
        L_0x014a:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0058
            X.0eP r2 = X.JTO.A1A(r3)
            java.lang.Object r2 = r2.A00
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            boolean r2 = r2.isRestricted()
            if (r2 == 0) goto L_0x014a
            r41 = 1
            goto L_0x005a
        L_0x0162:
            X.0sn r2 = X.0sn.A00
        L_0x0164:
            int r3 = r2.size()
            if (r3 != r7) goto L_0x01a0
            if (r4 == 0) goto L_0x01a0
            java.lang.Object r2 = r2.get(r5)
            java.lang.Object r2 = r4.get(r2)
            X.0eP r2 = (X.0eP) r2
            if (r2 == 0) goto L_0x01a0
            java.lang.Object r2 = r2.A00
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x01a0
            boolean r38 = X.C308436Ug.A02(r2)
        L_0x0182:
            r1.AlG(r0)
            r1.AlH(r0)
            boolean r39 = r1.CUL(r0)
            java.lang.Long r16 = r1.BLH(r0)
            boolean r40 = r1.CR5(r0)
            boolean r42 = r1.CK9(r0)
            X.PBo r9 = new X.PBo
            r24 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r9
        L_0x01a0:
            r38 = 0
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70735OIs.A00(com.instagram.common.session.UserSession, X.Pwi, int):X.PBo");
    }
}
