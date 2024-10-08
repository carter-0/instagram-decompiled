package X;

public abstract class HS1 {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (X.0qQ.A0K(r1, "evenodd") == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C53418GoA A00(X.C276544tV r21, long r22) {
        /*
            r2 = r21
            int r1 = r2.A04
            r0 = 16593(0x40d1, float:2.3252E-41)
            if (r1 != r0) goto L_0x0217
            r5 = 35
            java.lang.String r0 = r2.A0K(r5)
            if (r0 == 0) goto L_0x0200
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
        L_0x0014:
            java.lang.String r0 = "nonzero"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "evenodd"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r9 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r9 = 0
        L_0x0026:
            java.util.List r0 = r2.A0L()
            X.0qQ.A07(r0)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0035:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0211
            java.lang.Object r0 = r14.next()
            X.4tV r0 = (X.C276544tV) r0
            X.0qQ.A0A(r0)
            int r12 = r0.A04
            r10 = 1
            r1 = 16631(0x40f7, float:2.3305E-41)
            boolean r4 = X.AnonymousClass7TF.A1S(r12, r1)
            r11 = 36
            r3 = 0
            r1 = r22
            if (r4 == 0) goto L_0x0076
            java.lang.String r7 = r0.A0K(r5)
            float r4 = X.C51971G9r.A01(r1)
            float r4 = X.C56179Hu8.A01(r7, r3, r4)
            java.lang.String r3 = r0.A0K(r11)
            float r0 = X.C51972G9s.A00(r1)
            long r0 = X.C56192HuL.A01(r3, r0, r4)
            r2 = 1
        L_0x006d:
            X.Go1 r15 = new X.Go1
            r15.<init>(r0, r2)
        L_0x0072:
            r6.add(r15)
            goto L_0x0035
        L_0x0076:
            r4 = 16630(0x40f6, float:2.3304E-41)
            if (r12 != r4) goto L_0x0094
            java.lang.String r7 = r0.A0K(r5)
            float r4 = X.C51971G9r.A01(r1)
            float r4 = X.C56179Hu8.A01(r7, r3, r4)
            java.lang.String r3 = r0.A0K(r11)
            float r0 = X.C51972G9s.A00(r1)
            long r0 = X.C56192HuL.A01(r3, r0, r4)
            r2 = 0
            goto L_0x006d
        L_0x0094:
            r4 = 16632(0x40f8, float:2.3306E-41)
            boolean r8 = X.AnonymousClass7TF.A1S(r12, r4)
            r7 = 40
            r4 = 38
            if (r8 == 0) goto L_0x00cc
            java.lang.String r8 = r0.A0K(r5)
            float r10 = X.C51971G9r.A01(r1)
            float r8 = X.C56179Hu8.A01(r8, r3, r10)
            java.lang.String r3 = r0.A0K(r11)
            float r2 = X.C51972G9s.A00(r1)
            long r16 = X.C56192HuL.A01(r3, r2, r8)
            float r1 = X.C56179Hu8.A00(r0, r10, r4)
            java.lang.String r0 = r0.A0K(r7)
            long r18 = X.C56192HuL.A01(r0, r2, r1)
            r20 = 1
        L_0x00c6:
            X.Go4 r15 = new X.Go4
            r15.<init>(r16, r18, r20)
            goto L_0x0072
        L_0x00cc:
            r8 = 16629(0x40f5, float:2.3302E-41)
            boolean r13 = X.AnonymousClass7TF.A1S(r12, r8)
            r8 = 42
            if (r13 == 0) goto L_0x0111
            java.lang.String r12 = r0.A0K(r5)
            float r10 = X.C51971G9r.A01(r1)
            float r12 = X.C56179Hu8.A01(r12, r3, r10)
            java.lang.String r11 = r0.A0K(r11)
            float r2 = X.C51972G9s.A00(r1)
            long r16 = X.C56192HuL.A01(r11, r2, r12)
            float r4 = X.C56179Hu8.A00(r0, r10, r4)
            java.lang.String r1 = r0.A0K(r7)
            long r18 = X.C56192HuL.A01(r1, r2, r4)
            java.lang.String r1 = r0.A0I()
            float r1 = X.C56179Hu8.A01(r1, r3, r10)
            java.lang.String r0 = r0.A0K(r8)
            long r20 = X.C56192HuL.A01(r0, r2, r1)
            X.Go5 r15 = new X.Go5
            r15.<init>(r16, r18, r20)
            goto L_0x0072
        L_0x0111:
            r13 = 16628(0x40f4, float:2.3301E-41)
            if (r12 != r13) goto L_0x0148
            java.lang.String r13 = r0.A0K(r5)
            float r12 = X.C51971G9r.A01(r1)
            float r12 = X.C56179Hu8.A01(r13, r3, r12)
            java.lang.String r11 = r0.A0K(r11)
            float r1 = X.C51972G9s.A00(r1)
            long r19 = X.C56192HuL.A01(r11, r1, r12)
            java.lang.String r1 = r0.A0I()
            float r16 = X.C56179Hu8.A01(r1, r3, r3)
            float r17 = r0.A02(r8, r3)
            float r18 = r0.A02(r7, r3)
            boolean r21 = r0.A0R(r4, r10)
            X.Go7 r15 = new X.Go7
            r15.<init>(r16, r17, r18, r19, r21)
            goto L_0x0072
        L_0x0148:
            r8 = 16603(0x40db, float:2.3266E-41)
            if (r12 != r8) goto L_0x017f
            java.lang.String r7 = r0.A0K(r7)
            float r10 = X.C51971G9r.A01(r1)
            float r8 = X.C56179Hu8.A01(r7, r3, r10)
            java.lang.String r7 = r0.A0I()
            float r1 = X.C51972G9s.A00(r1)
            long r17 = X.C56192HuL.A01(r7, r1, r8)
            float r2 = X.C56179Hu8.A00(r0, r10, r4)
            float r1 = X.C56179Hu8.A00(r0, r1, r11)
            long r19 = X.HSV.A00(r2, r1)
            java.lang.String r0 = r0.A0K(r5)
            float r16 = X.C56179Hu8.A01(r0, r3, r3)
            X.Go6 r15 = new X.Go6
            r15.<init>(r16, r17, r19)
            goto L_0x0072
        L_0x017f:
            r8 = 16608(0x40e0, float:2.3273E-41)
            if (r12 != r8) goto L_0x01ab
            java.lang.String r4 = r0.A0K(r4)
            float r8 = X.C51971G9r.A01(r1)
            float r4 = X.C56179Hu8.A01(r4, r3, r8)
            java.lang.String r3 = r0.A0K(r7)
            float r2 = X.C51972G9s.A00(r1)
            long r16 = X.C56192HuL.A01(r3, r2, r4)
            float r1 = X.C56179Hu8.A00(r0, r8, r11)
            float r0 = X.C56179Hu8.A00(r0, r2, r5)
            long r18 = X.HSV.A00(r1, r0)
            r20 = 0
            goto L_0x00c6
        L_0x01ab:
            r7 = 16596(0x40d4, float:2.3256E-41)
            if (r12 != r7) goto L_0x01d6
            java.lang.String r8 = r0.A0K(r5)
            float r7 = X.C51971G9r.A01(r1)
            float r8 = X.C56179Hu8.A01(r8, r3, r7)
            java.lang.String r7 = r0.A0K(r11)
            float r1 = X.C51972G9s.A00(r1)
            long r1 = X.C56192HuL.A01(r7, r1, r8)
            java.lang.String r0 = r0.A0K(r4)
            float r0 = X.C56179Hu8.A01(r0, r3, r3)
            X.Go3 r15 = new X.Go3
            r15.<init>(r1, r0)
            goto L_0x0072
        L_0x01d6:
            r3 = 16600(0x40d8, float:2.3262E-41)
            if (r12 != r3) goto L_0x01de
            X.IIn r15 = X.C56944IIn.A00
            goto L_0x0072
        L_0x01de:
            r3 = 16614(0x40e6, float:2.3281E-41)
            if (r12 != r3) goto L_0x020a
            X.4tV r3 = r0.A07(r5)
            if (r3 == 0) goto L_0x0203
            X.4tV r0 = r0.A07(r11)
            if (r0 == 0) goto L_0x01fd
            X.GoI r0 = X.HS4.A00(r0, r1)
        L_0x01f2:
            X.GoA r1 = A00(r3, r1)
            X.Go2 r15 = new X.Go2
            r15.<init>(r1, r0)
            goto L_0x0072
        L_0x01fd:
            X.GoI r0 = X.C53426GoI.A07
            goto L_0x01f2
        L_0x0200:
            r1 = 0
            goto L_0x0014
        L_0x0203:
            java.lang.String r0 = "Path Add must specify the path which should be added"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x020a:
            java.lang.String r0 = "Unknown canvas child path."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0211:
            X.GoA r0 = new X.GoA
            r0.<init>(r9, r6)
            return r0
        L_0x0217:
            java.lang.String r0 = "Unknown canvas path."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HS1.A00(X.4tV, long):X.GoA");
    }
}
