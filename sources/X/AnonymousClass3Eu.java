package X;

import java.util.Map;

/* renamed from: X.3Eu  reason: invalid class name */
public final class AnonymousClass3Eu extends 1HR {
    public final Integer A00;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0091: MOVE  (r10v1 X.1IU) = (r10v0 X.1IU)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089 A[SYNTHETIC] */
    private final java.lang.Object A05(java.lang.Object r18) {
        /*
            r17 = this;
            r11 = r17
            java.lang.Integer r1 = r11.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r9 = r18
            if (r1 != r0) goto L_0x0019
            java.lang.Object r1 = X.AnonymousClass3Eu.super.FIG(r9)
            boolean r0 = r1 instanceof X.AnonymousClass1Ws
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1 instanceof X.C241583Pt
            if (r0 == 0) goto L_0x00a2
        L_0x0018:
            return r1
        L_0x0019:
            X.0zk r10 = X.1HT.A03
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.1HR.A09
            java.lang.Object r4 = r0.get(r11)
            X.1HU r4 = (X.1HU) r4
        L_0x0023:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.1HR.A04
            long r0 = r0.getAndIncrement(r11)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r0 & r2
            r2 = 0
            boolean r16 = X.1HR.A0G(r11, r0, r2)
            int r7 = X.1HT.A01
            long r0 = (long) r7
            long r2 = r14 / r0
            long r5 = r14 % r0
            int r13 = (int) r5
            long r5 = r4.A00
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0055
            X.1HU r12 = X.1HR.A07(r11, r4, r2)
            if (r12 != 0) goto L_0x0056
            if (r16 == 0) goto L_0x0023
        L_0x004b:
            java.lang.Throwable r0 = r11.A0I()
            X.3Pt r1 = new X.3Pt
            r1.<init>(r0)
            return r1
        L_0x0055:
            r12 = r4
        L_0x0056:
            int r3 = X.1HR.A00(r9, r10, r11, r12, r13, r14, r16)
            if (r3 == 0) goto L_0x0089
            r2 = 1
            if (r3 == r2) goto L_0x00a2
            r2 = 2
            if (r3 == r2) goto L_0x007b
            r0 = 3
            if (r3 == r0) goto L_0x0081
            r0 = 4
            if (r3 == r0) goto L_0x006d
            r12.A01()
            r4 = r12
            goto L_0x0023
        L_0x006d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.1HR.A03
            long r1 = r0.get(r11)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
            r12.A01()
            goto L_0x004b
        L_0x007b:
            if (r16 == 0) goto L_0x008d
            r12.A05()
            goto L_0x004b
        L_0x0081:
            java.lang.String r1 = "unexpected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0089:
            r12.A01()
            goto L_0x00a2
        L_0x008d:
            boolean r2 = r10 instanceof X.AnonymousClass1IU
            if (r2 == 0) goto L_0x009a
            X.1IU r10 = (X.AnonymousClass1IU) r10
            if (r10 == 0) goto L_0x009a
            int r2 = r13 + r7
            r10.CO1(r12, r2)
        L_0x009a:
            long r2 = r12.A00
            long r2 = r2 * r0
            long r0 = (long) r13
            long r2 = r2 + r0
            r11.A0J(r2)
        L_0x00a2:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Eu.A05(java.lang.Object):java.lang.Object");
    }

    public final boolean A0L() {
        if (this.A00 == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public AnonymousClass3Eu(int i, Integer num) {
        super(i);
        this.A00 = num;
        if (num == AnonymousClass05K.A00) {
            Map map = 0Yh.A03;
            throw new IllegalArgumentException(002.A0g("This implementation does not support suspension for senders, use ", 0q1.A01(1HR.class), " instead"));
        } else if (i < 1) {
            throw new IllegalArgumentException(002.A0c("Buffered channel capacity must be at least 1, but ", " was specified", i));
        }
    }

    public final Object ELH(Object obj, AnonymousClass4D7 r3) {
        if (!(A05(obj) instanceof C241583Pt)) {
            return C60340gF.A00;
        }
        throw A0I();
    }

    public final Object FIG(Object obj) {
        return A05(obj);
    }
}
