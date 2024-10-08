package X;

/* renamed from: X.P1e  reason: case insensitive filesystem */
public final class C72313P1e implements C74543Pwc {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final int A03;
    public final boolean A04;

    public final C61072JwA BDn(int i) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0eP Bqn(X.N40 r18) {
        /*
            r17 = this;
            r8 = 0
            r0 = r18
            X.0qQ.A0B(r0, r8)
            r2 = r17
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0028
            r2 = 0
            r7 = 2131960274(0x7f1321d2, float:1.9557212E38)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            X.Nj1 r4 = X.C69300Nj1.AVATAR_EDIT
            X.JyL r1 = new X.JyL
            r3 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.NPM r0 = X.NPM.A00
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            return r0
        L_0x0028:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            boolean r5 = r2.A01
            java.util.List r3 = r0.A01
            if (r5 == 0) goto L_0x00a7
            boolean r4 = X.AnonymousClass7TE.A1b(r3)
            if (r4 == 0) goto L_0x0073
            boolean r4 = r0.A0B
        L_0x003a:
            if (r4 != 0) goto L_0x0073
            r4 = 2131958621(0x7f131b5d, float:1.955386E38)
            if (r5 == 0) goto L_0x0044
            r4 = 2131960380(0x7f13223c, float:1.9557427E38)
        L_0x0044:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r10 = 0
            X.Nj1 r12 = X.C69300Nj1.AI_TRY_AGAIN
            r15 = 2131960274(0x7f1321d2, float:1.9557212E38)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            X.JyL r9 = new X.JyL
            r11 = r10
            r16 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x005a:
            boolean r0 = r0.A0B
            r6 = 0
            if (r0 == 0) goto L_0x00af
            int r5 = r2.A03
            java.util.ArrayList r4 = X.DbS.A0v(r5)
            r2 = 0
        L_0x0066:
            if (r2 >= r5) goto L_0x00ac
            X.N60 r0 = new X.N60
            r0.<init>(r10, r8)
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x0066
        L_0x0073:
            if (r5 == 0) goto L_0x0093
            boolean r4 = r0.A0B
            if (r4 == 0) goto L_0x0093
            r4 = 2131960380(0x7f13223c, float:1.9557427E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r10 = 0
            r15 = 2131960274(0x7f1321d2, float:1.9557212E38)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            r16 = 1
            X.Nj1 r12 = X.C69300Nj1.AVATAR_EDIT
            X.JyL r9 = new X.JyL
            r11 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x005a
        L_0x0093:
            r10 = 0
            r15 = 2131960274(0x7f1321d2, float:1.9557212E38)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            X.Nj1 r12 = X.C69300Nj1.AVATAR_EDIT
            X.JyL r9 = new X.JyL
            r11 = r10
            r14 = r10
            r16 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x005a
        L_0x00a7:
            boolean r4 = r3.isEmpty()
            goto L_0x003a
        L_0x00ac:
            r1.addAll(r4)
        L_0x00af:
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x00e2
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x00bd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r3 = r4.next()
            int r2 = r6 + 1
            if (r6 >= 0) goto L_0x00d3
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d3:
            X.JwF r3 = (X.C61077JwF) r3
            X.N60 r0 = new X.N60
            r0.<init>(r3, r6)
            r5.add(r0)
            r6 = r2
            goto L_0x00bd
        L_0x00df:
            r1.addAll(r5)
        L_0x00e2:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72313P1e.Bqn(X.N40):X.0eP");
    }

    public final boolean Erk(N40 n40) {
        0qQ.A0B(n40, 0);
        if (this.A04 || !this.A00) {
            return false;
        }
        if (this.A02 || n40.A0B || AnonymousClass7TE.A1b(n40.A01)) {
            return true;
        }
        return false;
    }

    public C72313P1e(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A03 = i;
        this.A04 = z;
        this.A00 = z2;
        this.A02 = z3;
        this.A01 = z4;
    }
}
