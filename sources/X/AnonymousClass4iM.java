package X;

/* renamed from: X.4iM  reason: invalid class name */
public final class AnonymousClass4iM extends C268934eJ {
    public final C268894eF A00;
    public final C268894eF A01;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            AnonymousClass4iM r4 = (AnonymousClass4iM) obj;
            if (r4.A00 == this.A00) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(A0R());
        sb.append('<');
        sb.append(this.A01);
        sb.append('>');
        sb.append(']');
        return sb.toString();
    }

    public AnonymousClass4iM(C268894eF r1, C268944eK r2) {
        super(r2);
        this.A01 = r1;
        this.A00 = this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4iM(X.C268894eF r10, X.C268894eF r11, X.C268894eF r12, X.C268924eI r13, java.lang.Class r14, java.lang.Object r15, java.lang.Object r16, X.C268894eF[] r17, boolean r18) {
        /*
            r9 = this;
            if (r11 != 0) goto L_0x0019
            r7 = 0
        L_0x0003:
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A01 = r11
            if (r12 != 0) goto L_0x0016
            r12 = r9
        L_0x0016:
            r9.A00 = r12
            return
        L_0x0019:
            int r7 = r11.hashCode()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4iM.<init>(X.4eF, X.4eF, X.4eF, X.4eI, java.lang.Class, java.lang.Object, java.lang.Object, X.4eF[], boolean):void");
    }
}
