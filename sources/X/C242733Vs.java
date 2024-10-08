package X;

import java.util.ArrayList;

/* renamed from: X.3Vs  reason: invalid class name and case insensitive filesystem */
public final class C242733Vs implements C242643Vh {
    public static final AnonymousClass34N A08 = new AnonymousClass34N(C242743Vt.A00, C242753Vu.A00, C242763Vv.A00, C242773Vw.A00);
    public C242643Vh A00;
    public C242643Vh A01;
    public C242643Vh A02;
    public C242643Vh A03;
    public C242643Vh A04;
    public final int A05;
    public final int A06;
    public final C2813957l A07;

    public final Object AvB() {
        return null;
    }

    public final Iterable BVk(C376459Ib r6, AnonymousClass34Q r7, int i) {
        AnonymousClass34N r4;
        0eP r0;
        0qQ.A0B(r6, 1);
        ArrayList arrayList = new ArrayList();
        C242643Vh r2 = this.A01;
        if (r2 != null) {
            arrayList.add(new 0eP(r2, 0));
        }
        if (r7 == null || (r4 = r7.A00) == null) {
            r4 = A08;
        }
        boolean z = ((C13997Tnz) r6.A02).A00;
        C242643Vh r22 = this.A03;
        if (z) {
            if (r22 != null) {
                arrayList.add(A00(r6, r22, ((Number) r4.A02.invoke(Integer.valueOf(i))).intValue()));
            }
            C242643Vh r23 = this.A02;
            if (r23 != null) {
                arrayList.add(A00(r6, r23, ((Number) r4.A01.invoke(Integer.valueOf(i))).intValue()));
            }
            C242643Vh r24 = this.A00;
            if (r24 != null) {
                arrayList.add(A00(r6, r24, ((Number) r4.A00.invoke(Integer.valueOf(i))).intValue()));
            }
            C242643Vh r25 = this.A04;
            if (r25 != null) {
                r0 = A00(r6, r25, ((Number) r4.A03.invoke(Integer.valueOf(i))).intValue());
            }
            return arrayList;
        }
        if (r22 != null) {
            arrayList.add(new 0eP(r22, r4.A02.invoke(Integer.valueOf(i))));
        }
        C242643Vh r26 = this.A02;
        if (r26 != null) {
            arrayList.add(new 0eP(r26, r4.A01.invoke(Integer.valueOf(i))));
        }
        C242643Vh r27 = this.A00;
        if (r27 != null) {
            arrayList.add(new 0eP(r27, r4.A00.invoke(Integer.valueOf(i))));
        }
        C242643Vh r28 = this.A04;
        if (r28 != null) {
            r0 = new 0eP(r28, r4.A03.invoke(Integer.valueOf(i)));
        }
        return arrayList;
        arrayList.add(r0);
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r14v0 'this' X.3Vs A[THIS]) = (r20v0 'this' X.3Vs A[THIS])
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    private final X.0eP A00(X.C376459Ib r21, X.C242643Vh r22, int r23) {
        /*
            r20 = this;
            r0 = r21
            java.lang.Object r12 = r0.A01
            X.51w r12 = (X.C2804451w) r12
            r15 = r22
            r19 = r23
            if (r12 == 0) goto L_0x00ca
            r14 = r20
            X.57l r13 = r14.A07
            if (r13 == 0) goto L_0x00ca
            java.lang.Object r10 = r0.A02
            X.Tnz r10 = (X.C13997Tnz) r10
            java.lang.Object r11 = r0.A00
            X.0fA r11 = (X.0fA) r11
            int r4 = r14.A06
            int r3 = r14.A05
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r8 = 1
            X.0qQ.A0B(r11, r8)
            boolean r0 = r12 instanceof X.H7z
            if (r0 == 0) goto L_0x00ca
            java.lang.Class<X.3mM> r1 = X.C250973mM.class
            X.H7z r12 = (X.H7z) r12
            java.lang.Class r0 = r12.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ca
            java.util.List r7 = r12.A02
            X.0qQ.A0B(r7, r8)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00ca
            int r5 = r7.size()
            int r5 = r5 - r8
            r2 = 0
        L_0x0047:
            if (r2 > r5) goto L_0x00ca
            int r0 = r2 + r5
            int r6 = r0 / 2
            java.lang.Object r0 = r7.get(r6)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r9 = r4 + 1
            int r0 = r9 + r6
            if (r1 != r0) goto L_0x007b
            r5 = r6
        L_0x0062:
            if (r5 <= 0) goto L_0x0083
            int r2 = r5 + -1
            java.lang.Object r0 = r7.get(r2)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r9 + r2
            if (r1 != r0) goto L_0x0083
            int r5 = r5 + -1
            goto L_0x0062
        L_0x007b:
            if (r1 <= r0) goto L_0x0080
            int r5 = r6 + -1
            goto L_0x0047
        L_0x0080:
            int r2 = r6 + 1
            goto L_0x0047
        L_0x0083:
            int r0 = r7.size()
            int r0 = r0 - r8
            if (r6 >= r0) goto L_0x00a0
            int r2 = r6 + 1
            java.lang.Object r0 = r7.get(r2)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r9 + r2
            if (r1 != r0) goto L_0x00a0
            r6 = r2
            goto L_0x0083
        L_0x00a0:
            X.2HY r1 = new X.2HY
            r1.<init>(r5, r6)
            java.lang.Object r0 = X.00k.A09(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            X.Iob r9 = new X.Iob
            r18 = r3
            r17 = r4
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.IP3 r1 = X.C2813957l.A00(r12, r13, r9, r0)
            if (r1 == 0) goto L_0x00ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            X.0eP r2 = new X.0eP
            r2.<init>(r1, r0)
            return r2
        L_0x00ca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            X.0eP r2 = new X.0eP
            r2.<init>(r15, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242733Vs.A00(X.9Ib, X.3Vh, int):X.0eP");
    }

    public final boolean DPd(Object obj) {
        C242643Vh r0 = this.A01;
        if (r0 != null) {
            return r0.DPd(obj);
        }
        return true;
    }

    public final void DPe(Object obj) {
        C242643Vh r0 = this.A01;
        if (r0 != null) {
            r0.DPe(obj);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[GridGraphNode] row = ");
        sb.append(this.A06);
        sb.append(", column = ");
        sb.append(this.A05);
        sb.append(", inner: ");
        sb.append(this.A01);
        return sb.toString();
    }

    public C242733Vs(C2813957l r1, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        this.A07 = r1;
    }
}
