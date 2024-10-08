package X;

public final class GR9 implements JQZ {
    public final /* synthetic */ AnonymousClass6IJ A00;
    public final /* synthetic */ Object A01;

    public GR9(AnonymousClass6IJ r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final int Bco() {
        AnonymousClass5R6 r0 = (AnonymousClass5R6) this.A00.A0B.get(this.A01);
        if (r0 != null) {
            return r0.A0F().size();
        }
        return 0;
    }

    public final void E3k(int i, long j) {
        AnonymousClass6IJ r2 = this.A00;
        AnonymousClass5R6 r4 = (AnonymousClass5R6) r2.A0B.get(this.A01);
        if (r4 != null && r4.A0A != null) {
            int size = r4.A0F().size();
            if (i < 0 || i >= size) {
                throw new IndexOutOfBoundsException(002.A0X("Index (", AnonymousClass000.A00(1993), ')', i, size));
            } else if (!r4.A0U.A0J.A0E) {
                AnonymousClass5R6 r22 = r2.A09;
                r22.A0J = true;
                AnonymousClass5RJ.A00(r4).Co1((AnonymousClass5R6) r4.A0F().get(i), j);
                r22.A0J = false;
            } else {
                throw AnonymousClass7TE.A0w("Pre-measure called on node that is not placed");
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b2 A[EDGE_INSN: B:60:0x00b2->B:51:0x00b2 ?: BREAK  , SYNTHETIC] */
    public final void FHy(X.0sP r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.String r9 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"
            X.6IJ r0 = r13.A00
            java.util.HashMap r1 = r0.A0B
            java.lang.Object r0 = r13.A01
            java.lang.Object r0 = r1.get(r0)
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            if (r0 == 0) goto L_0x00bb
            X.5RP r0 = r0.A0W
            if (r0 == 0) goto L_0x00bb
            X.4cD r0 = r0.A02
            if (r0 == 0) goto L_0x00bb
            r12 = 262144(0x40000, float:3.67342E-40)
            X.4cD r8 = r0.A03
            boolean r0 = r8.A08
            if (r0 != 0) goto L_0x002e
            r0 = 427(0x1ab, float:5.98E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002e:
            r7 = 16
            X.4cD[] r0 = new X.C267794cD[r7]
            X.5Pl r6 = new X.5Pl
            r6.<init>(r0)
            X.4cD r0 = r8.A02
            if (r0 == 0) goto L_0x00b7
            r6.A09(r0)
        L_0x003e:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x00bb
            r5 = 1
            int r0 = r0 - r5
            java.lang.Object r8 = r6.A00(r0)
            X.4cD r8 = (X.C267794cD) r8
            int r0 = r8.A00
            r0 = r0 & r12
            if (r0 == 0) goto L_0x00b7
            r0 = r8
        L_0x0050:
            int r1 = r0.A01
            r1 = r1 & r12
            if (r1 == 0) goto L_0x00b2
            r11 = 0
            r10 = r0
            r4 = r11
        L_0x0058:
            boolean r1 = r10 instanceof X.AnonymousClass5Qr
            if (r1 == 0) goto L_0x007e
            X.5Qr r10 = (X.AnonymousClass5Qr) r10
            java.lang.Object r1 = r10.C9j()
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x007b
            java.lang.Object r2 = r14.invoke(r10)
        L_0x006c:
            X.GRZ r1 = X.GRZ.CancelTraversal
            if (r2 == r1) goto L_0x00bb
            X.GRZ r1 = X.GRZ.SkipSubtreeAndContinueTraversal
            if (r2 == r1) goto L_0x003e
        L_0x0074:
            X.4cD r10 = X.AnonymousClass5WH.A00(r4)
        L_0x0078:
            if (r10 == 0) goto L_0x00b2
            goto L_0x0058
        L_0x007b:
            X.GRZ r2 = X.GRZ.ContinueTraversal
            goto L_0x006c
        L_0x007e:
            int r1 = r10.A01
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0074
            boolean r1 = r10 instanceof X.C267944cV
            if (r1 == 0) goto L_0x0074
            r1 = r10
            X.4cV r1 = (X.C267944cV) r1
            X.4cD r3 = r1.A00
            r2 = 0
        L_0x008d:
            if (r3 == 0) goto L_0x00af
            int r1 = r3.A01
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0099
            int r2 = r2 + 1
            if (r2 != r5) goto L_0x009c
            r10 = r3
        L_0x0099:
            X.4cD r3 = r3.A02
            goto L_0x008d
        L_0x009c:
            if (r4 != 0) goto L_0x00a5
            X.4cD[] r1 = new X.C267794cD[r7]
            X.5Pl r4 = new X.5Pl
            r4.<init>(r1)
        L_0x00a5:
            if (r10 == 0) goto L_0x00ab
            r4.A09(r10)
            r10 = r11
        L_0x00ab:
            r4.A09(r3)
            goto L_0x0099
        L_0x00af:
            if (r2 != r5) goto L_0x0074
            goto L_0x0078
        L_0x00b2:
            X.4cD r0 = r0.A02
            if (r0 == 0) goto L_0x00b7
            goto L_0x0050
        L_0x00b7:
            X.AnonymousClass5WH.A06(r6, r8)
            goto L_0x003e
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GR9.FHy(X.0sP, java.lang.Object):void");
    }

    public final void dispose() {
        AnonymousClass6IJ r4 = this.A00;
        r4.A05();
        Object remove = r4.A0B.remove(this.A01);
        if (remove == null) {
            return;
        }
        if (r4.A02 > 0) {
            AnonymousClass5R6 r3 = r4.A09;
            int indexOf = r3.A0G().indexOf(remove);
            int size = r3.A0G().size();
            int i = r4.A02;
            if (indexOf >= size - i) {
                r4.A03++;
                r4.A02 = i - 1;
                int size2 = (r3.A0G().size() - r4.A02) - r4.A03;
                AnonymousClass6IJ.A01(r4, indexOf, size2);
                r4.A06(size2);
                return;
            }
            throw AnonymousClass7TE.A0z("Item is not in pre-composed item range");
        }
        throw AnonymousClass7TE.A0z("No pre-composed items to dispose");
    }
}
