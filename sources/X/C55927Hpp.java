package X;

/* renamed from: X.Hpp  reason: case insensitive filesystem */
public final class C55927Hpp {
    public C56159Htn A00;
    public C285975Tl A01;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C285975Tl A00(java.util.List r13) {
        /*
            r12 = this;
            r4 = 0
            r3 = 0
            r10 = r13
            int r2 = r13.size()     // Catch:{ Exception -> 0x0067 }
        L_0x0007:
            if (r4 >= r2) goto L_0x0018
            java.lang.Object r1 = r13.get(r4)     // Catch:{ Exception -> 0x0067 }
            X.JNY r1 = (X.JNY) r1     // Catch:{ Exception -> 0x0067 }
            X.Htn r0 = r12.A00     // Catch:{ Exception -> 0x0069 }
            r1.AC8(r0)     // Catch:{ Exception -> 0x0069 }
            int r4 = r4 + 1
            r3 = r1
            goto L_0x0007
        L_0x0018:
            X.Htn r0 = r12.A00
            java.lang.String r1 = r0.toString()
            X.0sn r0 = X.0sn.A00
            X.5Tq r6 = new X.5Tq
            r6.<init>(r0, r0, r1)
            X.Htn r7 = r12.A00
            int r1 = r7.A03
            int r0 = r7.A02
            long r2 = X.C3026964x.A00(r1, r0)
            X.5Tk r4 = new X.5Tk
            r4.<init>(r2)
            X.5Tl r0 = r12.A01
            long r0 = r0.A00
            boolean r0 = X.C285965Tk.A04(r0)
            if (r0 != 0) goto L_0x005a
            long r4 = r4.A00
        L_0x0040:
            int r1 = r7.A01
            r0 = -1
            if (r1 == r0) goto L_0x0058
            int r0 = r7.A00
            long r2 = X.C3026964x.A00(r1, r0)
            X.5Tk r1 = new X.5Tk
            r1.<init>(r2)
        L_0x0050:
            X.5Tl r0 = new X.5Tl
            r0.<init>(r6, r1, r4)
            r12.A01 = r0
            return r0
        L_0x0058:
            r1 = 0
            goto L_0x0050
        L_0x005a:
            int r1 = X.C285965Tk.A00(r2)
            int r0 = X.C285965Tk.A01(r2)
            long r4 = X.C3026964x.A00(r1, r0)
            goto L_0x0040
        L_0x0067:
            r2 = move-exception
            goto L_0x006b
        L_0x0069:
            r2 = move-exception
            r3 = r1
        L_0x006b:
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Error while applying EditCommand batch to buffer (length="
            r4.append(r0)
            X.Htn r5 = r12.A00
            X.HQk r0 = r5.A04
            int r0 = r0.A00()
            r4.append(r0)
            r0 = 1050(0x41a, float:1.471E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.append(r0)
            int r1 = r5.A01
            r0 = -1
            if (r1 == r0) goto L_0x00db
            int r0 = r5.A00
            long r0 = X.C3026964x.A00(r1, r0)
            X.5Tk r5 = new X.5Tk
            r5.<init>(r0)
        L_0x009c:
            r4.append(r5)
            java.lang.String r0 = ", selection="
            r4.append(r0)
            X.Htn r0 = r12.A00
            int r1 = r0.A03
            int r0 = r0.A02
            long r0 = X.C3026964x.A00(r1, r0)
            java.lang.String r0 = X.C285965Tk.A02(r0)
            r4.append(r0)
            java.lang.String r0 = "):"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r4)
            r6.append(r0)
            r0 = 10
            r6.append(r0)
            java.lang.String r7 = "\n"
            r0 = 2
            X.TYA r11 = new X.TYA
            r11.<init>((int) r0, (java.lang.Object) r12, (java.lang.Object) r3)
            java.lang.String r8 = ""
            r9 = r8
            X.00k.A0q(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = X.DbT.A10(r6)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00db:
            r5 = 0
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55927Hpp.A00(java.util.List):X.5Tl");
    }

    public C55927Hpp() {
        C285975Tl r0 = new C285975Tl(C3021962a.A00, (C285965Tk) null, C285965Tk.A01);
        this.A01 = r0;
        this.A00 = new C56159Htn(r0.A01, r0.A00);
    }
}
