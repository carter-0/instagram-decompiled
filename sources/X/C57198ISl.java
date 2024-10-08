package X;

/* renamed from: X.ISl  reason: case insensitive filesystem */
public final class C57198ISl implements AnonymousClass36F {
    public final int A00;
    public final Object A01;

    public C57198ISl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        X.DbS.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r2 = r0.A01.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r2.hasNext() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if ((r1 instanceof X.1Xj) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        r1 = (X.1Xj) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (X.0qQ.A0K(r1.getId(), r3) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
        if ((r1 instanceof X.AnonymousClass3OA) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        r1 = ((X.AnonymousClass3OA) r1).A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJb(X.1Xj r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x00c0;
                case 2: goto L_0x0057;
                case 3: goto L_0x0034;
                case 4: goto L_0x00b5;
                case 5: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.H1u r0 = (X.C54174H1u) r0
            X.HDB r0 = r0.A04
            if (r0 == 0) goto L_0x002c
            boolean r1 = r0.A0E(r5)
            r0 = 1
            if (r1 != r0) goto L_0x00cb
            return r0
        L_0x0019:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.H1s r0 = (X.C54172H1s) r0
            X.H3y r0 = r0.A01
            if (r0 == 0) goto L_0x002c
            X.4n0 r0 = r0.A04
            boolean r0 = r0.A0B(r5)
            return r0
        L_0x002c:
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0034:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.Ub1 r0 = (X.C15350Ub1) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.H3z r0 = (X.C54230H3z) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.IWI r0 = (X.IWI) r0
            java.lang.String r3 = r5.getId()
            if (r3 != 0) goto L_0x0095
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0057:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.Ub0 r0 = (X.C15349Ub0) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.H3u r0 = (X.C54225H3u) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.IWI r0 = (X.IWI) r0
            java.lang.String r3 = r5.getId()
            if (r3 != 0) goto L_0x0095
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x007a:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.GTv r0 = (X.C52469GTv) r0
            X.GUc r0 = r0.A00()
            X.2rX r0 = r0.A00
            X.IWI r0 = (X.IWI) r0
            java.lang.String r3 = r5.getId()
            if (r3 != 0) goto L_0x0095
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0095:
            java.util.List r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x009b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.1Xj
            if (r0 == 0) goto L_0x00b7
            X.1Xj r1 = (X.1Xj) r1
        L_0x00ab:
            java.lang.String r0 = r1.getId()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x009b
        L_0x00b5:
            r0 = 1
            return r0
        L_0x00b7:
            boolean r0 = r1 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x009b
            X.3OA r1 = (X.AnonymousClass3OA) r1
            X.1Xj r1 = r1.A0K
            goto L_0x00ab
        L_0x00c0:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.GcN r0 = (X.C52770GcN) r0
            r0.A09()
        L_0x00cb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57198ISl.AJb(X.1Xj):boolean");
    }

    public final void DQv(1Xj r2) {
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r2, 0);
                C52476GUc.A00(((C52469GTv) this.A01).A00());
                return;
            case 1:
                C14227TsA tsA = ((C52770GcN) this.A01).A04;
                if (tsA != null) {
                    tsA.update();
                    return;
                }
                break;
            case 2:
                ((C54225H3u) ((C15349Ub0) this.A01).A06.getValue()).A00();
                return;
            case 3:
                0qQ.A0B(r2, 0);
                ((C54230H3z) ((C15350Ub1) this.A01).A07.getValue()).A00();
                return;
            case 4:
                C320516sV r0 = ((H1N) this.A01).A04;
                if (r0 == null) {
                    str = "clipsGridAdapter";
                    break;
                } else {
                    r0.A0I.notifyDataSetChanged();
                    return;
                }
            case 5:
                C54229H3y h3y = ((C54172H1s) this.A01).A01;
                if (h3y != null) {
                    C54229H3y.A00(h3y);
                    return;
                }
                break;
            default:
                HDB hdb = ((C54174H1u) this.A01).A04;
                if (hdb != null) {
                    hdb.AV9();
                    return;
                }
                break;
        }
        str = "adapter";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
